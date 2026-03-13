package org.bouncycastle.jcajce.provider.symmetric.util;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    private Class[] availableSpecs;
    protected AlgorithmParameters engineParams;
    private boolean forWrapping;
    private final JcaJceHelper helper;
    private byte[] iv;
    private int ivSize;
    protected int pbeHash;
    protected int pbeIvSize;
    protected int pbeKeySize;
    protected int pbeType;
    protected Wrapper wrapEngine;
    private ErasableOutputStream wrapStream;

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public static class InvalidKeyOrParametersException extends InvalidKeyException {
        private final Throwable cause;

        public InvalidKeyOrParametersException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public BaseWrapCipher() {
        this.availableSpecs = new Class[]{GOST28147WrapParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new BCJcaJceHelper();
    }

    public final AlgorithmParameters createParametersInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.helper.createAlgorithmParameters(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #2 {all -> 0x001f, blocks: (B:5:0x0007, B:23:0x000c, B:10:0x003e, B:12:0x0043, B:16:0x004e, B:17:0x0059, B:9:0x002c, B:26:0x0022, B:27:0x002b, B:20:0x005b, B:21:0x0064), top: B:4:0x0007, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: all -> 0x001f, TRY_ENTER, TryCatch #2 {all -> 0x001f, blocks: (B:5:0x0007, B:23:0x000c, B:10:0x003e, B:12:0x0043, B:16:0x004e, B:17:0x0059, B:9:0x002c, B:26:0x0022, B:27:0x002b, B:20:0x005b, B:21:0x0064), top: B:4:0x0007, inners: #0, #1 }] */
    @Override // javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int engineDoFinal(byte[] r2, int r3, int r4, byte[] r5, int r6) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException {
        /*
            r1 = this;
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream
            if (r0 == 0) goto L6b
            r0.write(r2, r3, r4)
            boolean r2 = r1.forWrapping     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            if (r2 == 0) goto L2c
            org.bouncycastle.crypto.Wrapper r2 = r1.wrapEngine     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r4 = r1.wrapStream     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            byte[] r4 = r4.getBuf()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            byte[] r2 = r2.wrap(r4, r3, r0)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            goto L3e
        L1f:
            r2 = move-exception
            goto L65
        L21:
            r2 = move-exception
            javax.crypto.IllegalBlockSizeException r3 = new javax.crypto.IllegalBlockSizeException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L1f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1f
        L2c:
            org.bouncycastle.crypto.Wrapper r2 = r1.wrapEngine     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L5a
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r4 = r1.wrapStream     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L5a
            byte[] r4 = r4.getBuf()     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L5a
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L5a
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L5a
            byte[] r2 = r2.unwrap(r4, r3, r0)     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L5a
        L3e:
            int r4 = r2.length     // Catch: java.lang.Throwable -> L1f
            int r4 = r4 + r6
            int r0 = r5.length     // Catch: java.lang.Throwable -> L1f
            if (r4 > r0) goto L4e
            int r4 = r2.length     // Catch: java.lang.Throwable -> L1f
            java.lang.System.arraycopy(r2, r3, r5, r6, r4)     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r3 = r1.wrapStream
            r3.erase()
            return r2
        L4e:
            javax.crypto.ShortBufferException r2 = new javax.crypto.ShortBufferException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "30730"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            throw r2     // Catch: java.lang.Throwable -> L1f
        L5a:
            r2 = move-exception
            javax.crypto.BadPaddingException r3 = new javax.crypto.BadPaddingException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L1f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1f
        L65:
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r3 = r1.wrapStream
            r3.erase()
            throw r2
        L6b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r3 = 32420(0x7ea4, float:4.543E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.engineDoFinal(byte[], int, int, byte[], int):int");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return Arrays.clone(this.iv);
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i3) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.iv != null) {
            String algorithmName = this.wrapEngine.getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(algorithmName);
                this.engineParams = createParametersInstance;
                createParametersInstance.init(new IvParameterSpec(this.iv));
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = SpecUtil.extractSpec(algorithmParameters, this.availableSpecs);
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(32365) + algorithmParameters.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.engineParams = algorithmParameters;
        engineInit(i3, key, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(a.j(StubApp.getString2(30512), str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(a.k(StubApp.getString2(30841), str, StubApp.getString2(11660)));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i3) throws InvalidKeyException, NoSuchAlgorithmException {
        String string2 = StubApp.getString2(30842);
        String string22 = StubApp.getString2(30843);
        try {
            Wrapper wrapper = this.wrapEngine;
            byte[] engineDoFinal = wrapper == null ? engineDoFinal(bArr, 0, bArr.length) : wrapper.unwrap(bArr, 0, bArr.length);
            if (i3 == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            if (str.equals("") && i3 == 2) {
                try {
                    PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(engineDoFinal);
                    PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(privateKeyInfo);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    throw new InvalidKeyException(string22 + privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm() + StubApp.getString2("17458"));
                } catch (Exception unused) {
                    throw new InvalidKeyException(StubApp.getString2(30844));
                }
            }
            try {
                KeyFactory createKeyFactory = this.helper.createKeyFactory(str);
                if (i3 == 1) {
                    return createKeyFactory.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i3 == 2) {
                    return createKeyFactory.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new InvalidKeyException(u.p(i3, string2));
            } catch (NoSuchProviderException e10) {
                throw new InvalidKeyException(string2 + e10.getMessage());
            } catch (InvalidKeySpecException e11) {
                throw new InvalidKeyException(string2 + e11.getMessage());
            }
        } catch (BadPaddingException e12) {
            throw new InvalidKeyException(e12.getMessage());
        } catch (IllegalBlockSizeException e13) {
            throw new InvalidKeyException(e13.getMessage());
        } catch (InvalidCipherTextException e14) {
            throw new InvalidKeyException(e14.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws ShortBufferException {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream == null) {
            throw new IllegalStateException(StubApp.getString2(32420));
        }
        erasableOutputStream.write(bArr, i3, i10);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException(StubApp.getString2(30846));
        }
        try {
            Wrapper wrapper = this.wrapEngine;
            return wrapper == null ? engineDoFinal(encoded, 0, encoded.length) : wrapper.wrap(encoded, 0, encoded.length);
        } catch (BadPaddingException e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        }
    }

    public BaseWrapCipher(Wrapper wrapper) {
        this(wrapper, 0);
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i3, int i10) throws IllegalBlockSizeException, BadPaddingException {
        byte[] unwrap;
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream == null) {
            throw new IllegalStateException(StubApp.getString2(32420));
        }
        if (bArr != null) {
            erasableOutputStream.write(bArr, i3, i10);
        }
        try {
            if (this.forWrapping) {
                try {
                    unwrap = this.wrapEngine.wrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                    return unwrap;
                } catch (Exception e10) {
                    throw new IllegalBlockSizeException(e10.getMessage());
                }
            }
            try {
                unwrap = this.wrapEngine.unwrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                return unwrap;
            } catch (InvalidCipherTextException e11) {
                throw new BadPaddingException(e11.getMessage());
            }
        } finally {
            this.wrapStream.erase();
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i3, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new InvalidKeyOrParametersException(e10.getMessage(), e10);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i3, int i10) {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream == null) {
            throw new IllegalStateException(StubApp.getString2(32420));
        }
        erasableOutputStream.write(bArr, i3, i10);
        return null;
    }

    public BaseWrapCipher(Wrapper wrapper, int i3) {
        this.availableSpecs = new Class[]{GOST28147WrapParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new BCJcaJceHelper();
        this.wrapEngine = wrapper;
        this.ivSize = i3;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters keyParameter;
        int i10;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                keyParameter = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.wrapEngine.getAlgorithmName());
            } else {
                if (bCPBEKey.getParam() == null) {
                    throw new InvalidAlgorithmParameterException(StubApp.getString2(32370));
                }
                keyParameter = bCPBEKey.getParam();
            }
        } else {
            keyParameter = new KeyParameter(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            byte[] iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            this.iv = iv;
            keyParameter = new ParametersWithIV(keyParameter, iv);
        }
        if (algorithmParameterSpec instanceof GOST28147WrapParameterSpec) {
            GOST28147WrapParameterSpec gOST28147WrapParameterSpec = (GOST28147WrapParameterSpec) algorithmParameterSpec;
            byte[] sBox = gOST28147WrapParameterSpec.getSBox();
            if (sBox != null) {
                keyParameter = new ParametersWithSBox(keyParameter, sBox);
            }
            keyParameter = new ParametersWithUKM(keyParameter, gOST28147WrapParameterSpec.getUKM());
        }
        if ((keyParameter instanceof KeyParameter) && (i10 = this.ivSize) != 0 && (i3 == 3 || i3 == 1)) {
            byte[] bArr = new byte[i10];
            this.iv = bArr;
            secureRandom.nextBytes(bArr);
            keyParameter = new ParametersWithIV(keyParameter, this.iv);
        }
        if (secureRandom != null) {
            keyParameter = new ParametersWithRandom(keyParameter, secureRandom);
        }
        try {
            if (i3 != 1) {
                if (i3 == 2) {
                    this.wrapEngine.init(false, keyParameter);
                    this.wrapStream = new ErasableOutputStream();
                } else if (i3 == 3) {
                    this.wrapEngine.init(true, keyParameter);
                    this.wrapStream = null;
                } else {
                    if (i3 != 4) {
                        throw new InvalidParameterException(StubApp.getString2("32421"));
                    }
                    this.wrapEngine.init(false, keyParameter);
                    this.wrapStream = null;
                }
                this.forWrapping = false;
                return;
            }
            this.wrapEngine.init(true, keyParameter);
            this.wrapStream = new ErasableOutputStream();
            this.forWrapping = true;
        } catch (Exception e10) {
            throw new InvalidKeyOrParametersException(e10.getMessage(), e10);
        }
    }
}
