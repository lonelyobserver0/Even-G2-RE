package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.Shacal2Engine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Shacal2 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[32];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("28770"));
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(32208));
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32209);
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new Shacal2Engine()), 256);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new Shacal2Engine()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Shacal2.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new Shacal2Engine();
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(32210), 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Shacal2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            StringBuilder n10 = a.n(sb2, str, StubApp.getString2(31678), configurableProvider, StubApp.getString2(32211));
            String string2 = StubApp.getString2(31476);
            StringBuilder n11 = a.n(a.n(n10, str, string2, configurableProvider, StubApp.getString2(32212)), str, string2, configurableProvider, StubApp.getString2(32213));
            String string22 = StubApp.getString2(31504);
            StringBuilder n12 = a.n(n11, str, string22, configurableProvider, StubApp.getString2(32214));
            String string23 = StubApp.getString2(31469);
            StringBuilder n13 = a.n(n12, str, string23, configurableProvider, StubApp.getString2(32215));
            String string24 = StubApp.getString2(31459);
            a.x(a.n(a.n(a.n(n13, str, string24, configurableProvider, StubApp.getString2(32216)), str, string22, configurableProvider, StubApp.getString2(32217)), str, string23, configurableProvider, StubApp.getString2(32218)), str, string24, configurableProvider, StubApp.getString2(32219));
        }
    }

    private Shacal2() {
    }
}
