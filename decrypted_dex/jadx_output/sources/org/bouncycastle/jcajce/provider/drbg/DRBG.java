package org.bouncycastle.jcajce.provider.drbg;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DRBG {
    private static EntropyDaemon entropyDaemon;
    private static Thread entropyThread;
    private static final String PREFIX = StubApp.getString2(31283);
    private static final String[][] initialEntropySourceNames = {new String[]{StubApp.getString2(31274), StubApp.getString2(31275)}, new String[]{StubApp.getString2(31276), StubApp.getString2(31277)}, new String[]{StubApp.getString2(31278), StubApp.getString2(31279)}, new String[]{StubApp.getString2(31280), StubApp.getString2(31281)}};

    public static class CoreSecureRandom extends SecureRandom {
        public CoreSecureRandom(Object[] objArr) {
            super((SecureRandomSpi) objArr[1], (Provider) objArr[0]);
        }
    }

    public static class Default extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(true);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i3) {
            return random.generateSeed(i3);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class EntropyDaemon implements Runnable {
        private final ConcurrentLinkedDeque<Runnable> tasks;

        private EntropyDaemon() {
            this.tasks = new ConcurrentLinkedDeque<>();
        }

        public void addTask(Runnable runnable) {
            this.tasks.add(runnable);
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                Runnable pollFirst = this.tasks.pollFirst();
                if (pollFirst != null) {
                    try {
                        pollFirst.run();
                    } catch (Throwable unused) {
                    }
                } else {
                    try {
                        Thread.sleep(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public static class HybridEntropySource implements EntropySource {
        private final byte[] additionalInput;
        private final int bytesRequired;
        private final SP800SecureRandom drbg;
        private final SignallingEntropySource entropySource;
        private final AtomicInteger samples;
        private final AtomicBoolean seedAvailable;

        public class SignallingEntropySource implements IncrementalEntropySource {
            private final int byteLength;
            private final EntropyDaemon entropyDaemon;
            private final IncrementalEntropySource entropySource;
            private final AtomicBoolean seedAvailable;
            private final AtomicReference entropy = new AtomicReference();
            private final AtomicBoolean scheduled = new AtomicBoolean(false);
            private final long pause = DRBG.getPause();

            public class EntropyGatherer implements Runnable {
                private final IncrementalEntropySource baseRandom;

                public EntropyGatherer(IncrementalEntropySource incrementalEntropySource) {
                    this.baseRandom = incrementalEntropySource;
                }

                @Override // java.lang.Runnable
                public void run() {
                    SignallingEntropySource.this.entropy.set(this.baseRandom.getEntropy(SignallingEntropySource.this.pause));
                    SignallingEntropySource.this.seedAvailable.set(true);
                }
            }

            public SignallingEntropySource(EntropyDaemon entropyDaemon, AtomicBoolean atomicBoolean, EntropySourceProvider entropySourceProvider, int i3) {
                this.entropyDaemon = entropyDaemon;
                this.seedAvailable = atomicBoolean;
                this.entropySource = (IncrementalEntropySource) entropySourceProvider.get(i3);
                this.byteLength = (i3 + 7) / 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return this.byteLength * 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                return getEntropy(0L);
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return true;
            }

            public void schedule() {
                if (this.scheduled.getAndSet(true)) {
                    return;
                }
                this.entropyDaemon.addTask(new EntropyGatherer(this.entropySource));
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.DRBG.IncrementalEntropySource
            public byte[] getEntropy(long j) {
                byte[] bArr = (byte[]) this.entropy.getAndSet(null);
                if (bArr == null || bArr.length != this.byteLength) {
                    bArr = this.entropySource.getEntropy(j);
                } else {
                    this.scheduled.set(false);
                }
                schedule();
                return bArr;
            }
        }

        public HybridEntropySource(EntropyDaemon entropyDaemon, int i3) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.seedAvailable = atomicBoolean;
            this.samples = new AtomicInteger(0);
            this.additionalInput = Pack.longToBigEndian(System.currentTimeMillis());
            EntropySourceProvider createCoreEntropySourceProvider = DRBG.createCoreEntropySourceProvider();
            this.bytesRequired = (i3 + 7) / 8;
            SignallingEntropySource signallingEntropySource = new SignallingEntropySource(entropyDaemon, atomicBoolean, createCoreEntropySourceProvider, 256);
            this.entropySource = signallingEntropySource;
            this.drbg = new SP800SecureRandomBuilder(new EntropySourceProvider() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.HybridEntropySource.1
                @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
                public EntropySource get(int i10) {
                    return HybridEntropySource.this.entropySource;
                }
            }).setPersonalizationString(Strings.toByteArray(StubApp.getString2(31266))).buildHMAC(new HMac(new SHA512Digest()), signallingEntropySource.getEntropy(), false);
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public int entropySize() {
            return this.bytesRequired * 8;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public byte[] getEntropy() {
            byte[] bArr = new byte[this.bytesRequired];
            if (this.samples.getAndIncrement() > 20) {
                if (this.seedAvailable.getAndSet(false)) {
                    this.samples.set(0);
                    this.drbg.reseed(this.additionalInput);
                } else {
                    this.entropySource.schedule();
                }
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public boolean isPredictionResistant() {
            return true;
        }
    }

    public interface IncrementalEntropySource extends EntropySource {
        byte[] getEntropy(long j);
    }

    public static class IncrementalEntropySourceProvider implements EntropySourceProvider {
        private final boolean predictionResistant;
        private final SecureRandom random;

        public IncrementalEntropySourceProvider(SecureRandom secureRandom, boolean z2) {
            this.random = secureRandom;
            this.predictionResistant = z2;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
        public EntropySource get(int i3) {
            return new IncrementalEntropySource(i3) { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.IncrementalEntropySourceProvider.1
                final int numBytes;
                final /* synthetic */ int val$bitsRequired;

                {
                    this.val$bitsRequired = i3;
                    this.numBytes = (i3 + 7) / 8;
                }

                @Override // org.bouncycastle.crypto.prng.EntropySource
                public int entropySize() {
                    return this.val$bitsRequired;
                }

                @Override // org.bouncycastle.crypto.prng.EntropySource
                public byte[] getEntropy() {
                    return getEntropy(0L);
                }

                @Override // org.bouncycastle.crypto.prng.EntropySource
                public boolean isPredictionResistant() {
                    return IncrementalEntropySourceProvider.this.predictionResistant;
                }

                @Override // org.bouncycastle.jcajce.provider.drbg.DRBG.IncrementalEntropySource
                public byte[] getEntropy(long j) {
                    int i10;
                    int i11 = this.numBytes;
                    byte[] bArr = new byte[i11];
                    int i12 = 0;
                    while (true) {
                        i10 = this.numBytes;
                        if (i12 >= i10 / 8) {
                            break;
                        }
                        DRBG.sleep(j);
                        byte[] generateSeed = IncrementalEntropySourceProvider.this.random.generateSeed(8);
                        System.arraycopy(generateSeed, 0, bArr, i12 * 8, generateSeed.length);
                        i12++;
                    }
                    int i13 = i10 - ((i10 / 8) * 8);
                    if (i13 != 0) {
                        DRBG.sleep(j);
                        byte[] generateSeed2 = IncrementalEntropySourceProvider.this.random.generateSeed(i13);
                        System.arraycopy(generateSeed2, 0, bArr, i11 - generateSeed2.length, generateSeed2.length);
                    }
                    return bArr;
                }
            };
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(31268), DRBG.PREFIX + StubApp.getString2(31267));
            configurableProvider.addAlgorithm(StubApp.getString2(31270), DRBG.PREFIX + StubApp.getString2(31269));
        }
    }

    public static class NonceAndIV extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(false);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i3) {
            return random.generateSeed(i3);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class URLSeededEntropySourceProvider implements EntropySourceProvider {
        private final InputStream seedStream;

        public URLSeededEntropySourceProvider(final URL url) {
            this.seedStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedAction
                public InputStream run() {
                    try {
                        return url.openStream();
                    } catch (IOException unused) {
                        throw new IllegalStateException(StubApp.getString2(31271));
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int privilegedRead(final byte[] bArr, final int i3, final int i10) {
            return ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedAction
                public Integer run() {
                    try {
                        return Integer.valueOf(URLSeededEntropySourceProvider.this.seedStream.read(bArr, i3, i10));
                    } catch (IOException unused) {
                        throw new InternalError(StubApp.getString2(31272));
                    }
                }
            })).intValue();
        }

        @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
        public EntropySource get(int i3) {
            return new IncrementalEntropySource(i3) { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.3
                private final int numBytes;
                final /* synthetic */ int val$bitsRequired;

                {
                    this.val$bitsRequired = i3;
                    this.numBytes = (i3 + 7) / 8;
                }

                @Override // org.bouncycastle.crypto.prng.EntropySource
                public int entropySize() {
                    return this.val$bitsRequired;
                }

                @Override // org.bouncycastle.crypto.prng.EntropySource
                public byte[] getEntropy() {
                    return getEntropy(0L);
                }

                @Override // org.bouncycastle.crypto.prng.EntropySource
                public boolean isPredictionResistant() {
                    return true;
                }

                @Override // org.bouncycastle.jcajce.provider.drbg.DRBG.IncrementalEntropySource
                public byte[] getEntropy(long j) {
                    int i10 = this.numBytes;
                    byte[] bArr = new byte[i10];
                    int i11 = 0;
                    while (i11 != i10) {
                        int privilegedRead = URLSeededEntropySourceProvider.this.privilegedRead(bArr, i11, i10 - i11);
                        if (privilegedRead <= -1) {
                            break;
                        }
                        i11 += privilegedRead;
                        DRBG.sleep(j);
                    }
                    if (i11 == i10) {
                        return bArr;
                    }
                    throw new InternalError(StubApp.getString2(31273));
                }
            };
        }
    }

    static {
        entropyDaemon = null;
        entropyThread = null;
        entropyDaemon = new EntropyDaemon();
        Thread thread = new Thread(entropyDaemon, StubApp.getString2(31282));
        entropyThread = thread;
        thread.setDaemon(true);
        entropyThread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom createBaseRandom(boolean z2) {
        if (Properties.getPropertyValue(StubApp.getString2(31284)) == null) {
            HybridEntropySource hybridEntropySource = new HybridEntropySource(entropyDaemon, 256);
            byte[] entropy = hybridEntropySource.getEntropy();
            return new SP800SecureRandomBuilder(new EntropySourceProvider() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.1
                @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
                public EntropySource get(int i3) {
                    return new HybridEntropySource(DRBG.entropyDaemon, i3);
                }
            }).setPersonalizationString(z2 ? generateDefaultPersonalizationString(entropy) : generateNonceIVPersonalizationString(entropy)).buildHash(new SHA512Digest(), hybridEntropySource.getEntropy(), z2);
        }
        EntropySourceProvider createEntropySource = createEntropySource();
        EntropySource entropySource = createEntropySource.get(128);
        byte[] entropy2 = entropySource.getEntropy();
        return new SP800SecureRandomBuilder(createEntropySource).setPersonalizationString(z2 ? generateDefaultPersonalizationString(entropy2) : generateNonceIVPersonalizationString(entropy2)).buildHash(new SHA512Digest(), entropySource.getEntropy(), z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EntropySourceProvider createCoreEntropySourceProvider() {
        String string2 = StubApp.getString2(31285);
        if (Security.getProperty(string2) == null) {
            return createInitialEntropySource();
        }
        try {
            return new URLSeededEntropySourceProvider(new URL(Security.getProperty(string2)));
        } catch (Exception unused) {
            return createInitialEntropySource();
        }
    }

    private static EntropySourceProvider createEntropySource() {
        final String propertyValue = Properties.getPropertyValue(StubApp.getString2(31284));
        return (EntropySourceProvider) AccessController.doPrivileged(new PrivilegedAction<EntropySourceProvider>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.4
            @Override // java.security.PrivilegedAction
            public EntropySourceProvider run() {
                try {
                    return (EntropySourceProvider) ClassUtil.loadClass(DRBG.class, propertyValue).newInstance();
                } catch (Exception e10) {
                    throw new IllegalStateException(StubApp.getString2(31264) + propertyValue + StubApp.getString2(31265) + e10.getMessage(), e10);
                }
            }
        });
    }

    private static EntropySourceProvider createInitialEntropySource() {
        return ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public Boolean run() {
                try {
                    return Boolean.valueOf(SecureRandom.class.getMethod(StubApp.getString2("31263"), new Class[0]) != null);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue() ? new IncrementalEntropySourceProvider((SecureRandom) AccessController.doPrivileged(new PrivilegedAction<SecureRandom>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.3
            @Override // java.security.PrivilegedAction
            public SecureRandom run() {
                try {
                    return (SecureRandom) SecureRandom.class.getMethod(StubApp.getString2("31263"), new Class[0]).invoke(null, new Object[0]);
                } catch (Exception unused) {
                    return new CoreSecureRandom(DRBG.findSource());
                }
            }
        }), true) : new IncrementalEntropySourceProvider(new CoreSecureRandom(findSource()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] findSource() {
        char c10 = 0;
        int i3 = 0;
        while (true) {
            String[][] strArr = initialEntropySourceNames;
            if (i3 >= strArr.length) {
                return null;
            }
            String[] strArr2 = strArr[i3];
            try {
                return new Object[]{Class.forName(strArr2[c10]).newInstance(), Class.forName(strArr2[1]).newInstance()};
            } catch (Throwable unused) {
                i3++;
            }
        }
    }

    private static byte[] generateDefaultPersonalizationString(byte[] bArr) {
        return Arrays.concatenate(Strings.toByteArray(StubApp.getString2(9991)), bArr, Pack.longToBigEndian(Thread.currentThread().getId()), Pack.longToBigEndian(System.currentTimeMillis()));
    }

    private static byte[] generateNonceIVPersonalizationString(byte[] bArr) {
        return Arrays.concatenate(Strings.toByteArray(StubApp.getString2(31286)), bArr, Pack.longToLittleEndian(Thread.currentThread().getId()), Pack.longToLittleEndian(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getPause() {
        String propertyValue = Properties.getPropertyValue(StubApp.getString2(31287));
        if (propertyValue != null) {
            try {
                return Long.parseLong(propertyValue) * 1000;
            } catch (Exception unused) {
            }
        }
        return DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
