package org.bouncycastle.jcajce.provider.asymmetric.edec;

import E1.a;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyEncoder;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.agreement.XDHBasicAgreement;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.IESEngine;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.generators.X25519KeyPairGenerator;
import org.bouncycastle.crypto.generators.X448KeyPairGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.crypto.parsers.XIESPublicKeyParser;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.interfaces.XDHKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.spec.IESParameterSpec;
import org.bouncycastle.util.Strings;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IESCipher extends BaseCipherSpi {
    private ByteArrayOutputStream buffer;
    private boolean dhaesMode;
    private IESEngine engine;
    private AlgorithmParameters engineParam;
    private IESParameterSpec engineSpec;
    private final JcaJceHelper helper;
    private int ivLength;
    private AsymmetricKeyParameter key;
    private AsymmetricKeyParameter otherKeyParameter;
    private SecureRandom random;
    private int state;

    public static class XIES extends IESCipher {
        public XIES() {
            this(DigestFactory.createSHA1(), DigestFactory.createSHA1());
        }

        public XIES(Digest digest, Digest digest2) {
            super(new IESEngine(new XDHBasicAgreement(), new KDF2BytesGenerator(digest), new HMac(digest2)));
        }
    }

    public static class XIESwithAESCBC extends XIESwithCipher {
        public XIESwithAESCBC() {
            super(new CBCBlockCipher(new AESEngine()), 16);
        }
    }

    public static class XIESwithCipher extends IESCipher {
        public XIESwithCipher(BlockCipher blockCipher, int i3) {
            this(blockCipher, i3, DigestFactory.createSHA1(), DigestFactory.createSHA1());
        }

        public XIESwithCipher(BlockCipher blockCipher, int i3, Digest digest, Digest digest2) {
            super(new IESEngine(new XDHBasicAgreement(), new KDF2BytesGenerator(digest), new HMac(digest2), new PaddedBufferedBlockCipher(blockCipher)), i3);
        }
    }

    public static class XIESwithDESedeCBC extends XIESwithCipher {
        public XIESwithDESedeCBC() {
            super(new CBCBlockCipher(new DESedeEngine()), 8);
        }
    }

    public static class XIESwithSHA256 extends XIES {
        public XIESwithSHA256() {
            super(DigestFactory.createSHA256(), DigestFactory.createSHA256());
        }
    }

    public static class XIESwithSHA256andAESCBC extends XIESwithCipher {
        public XIESwithSHA256andAESCBC() {
            super(new CBCBlockCipher(new AESEngine()), 16, DigestFactory.createSHA256(), DigestFactory.createSHA256());
        }
    }

    public static class XIESwithSHA256andDESedeCBC extends XIESwithCipher {
        public XIESwithSHA256andDESedeCBC() {
            super(new CBCBlockCipher(new DESedeEngine()), 8, DigestFactory.createSHA256(), DigestFactory.createSHA256());
        }
    }

    public static class XIESwithSHA384 extends XIES {
        public XIESwithSHA384() {
            super(DigestFactory.createSHA384(), DigestFactory.createSHA384());
        }
    }

    public static class XIESwithSHA384andAESCBC extends XIESwithCipher {
        public XIESwithSHA384andAESCBC() {
            super(new CBCBlockCipher(new AESEngine()), 16, DigestFactory.createSHA384(), DigestFactory.createSHA384());
        }
    }

    public static class XIESwithSHA384andDESedeCBC extends XIESwithCipher {
        public XIESwithSHA384andDESedeCBC() {
            super(new CBCBlockCipher(new DESedeEngine()), 8, DigestFactory.createSHA384(), DigestFactory.createSHA384());
        }
    }

    public static class XIESwithSHA512 extends XIES {
        public XIESwithSHA512() {
            super(DigestFactory.createSHA512(), DigestFactory.createSHA512());
        }
    }

    public static class XIESwithSHA512andAESCBC extends XIESwithCipher {
        public XIESwithSHA512andAESCBC() {
            super(new CBCBlockCipher(new AESEngine()), 16, DigestFactory.createSHA512(), DigestFactory.createSHA512());
        }
    }

    public static class XIESwithSHA512andDESedeCBC extends XIESwithCipher {
        public XIESwithSHA512andDESedeCBC() {
            super(new CBCBlockCipher(new DESedeEngine()), 8, DigestFactory.createSHA512(), DigestFactory.createSHA512());
        }
    }

    public IESCipher(IESEngine iESEngine) {
        this.helper = new BCJcaJceHelper();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = iESEngine;
        this.ivLength = 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i3, i10);
        System.arraycopy(engineDoFinal, 0, bArr2, i11, engineDoFinal.length);
        return engineDoFinal.length;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        if (this.engine.getCipher() != null) {
            return this.engine.getCipher().getBlockSize();
        }
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        IESParameterSpec iESParameterSpec = this.engineSpec;
        if (iESParameterSpec != null) {
            return iESParameterSpec.getNonce();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (!(key instanceof XDHKey)) {
            throw new IllegalArgumentException(StubApp.getString2(30682));
        }
        String algorithm = ((XDHKey) key).getAlgorithm();
        if (StubApp.getString2(28389).equalsIgnoreCase(algorithm)) {
            return 256;
        }
        if (StubApp.getString2(28390).equalsIgnoreCase(algorithm)) {
            return 448;
        }
        throw new IllegalArgumentException(a.j(StubApp.getString2(30681), algorithm));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i3) {
        BufferedBlockCipher cipher;
        AsymmetricKeyParameter asymmetricKeyParameter = this.key;
        String string2 = StubApp.getString2(30501);
        if (asymmetricKeyParameter == null) {
            throw new IllegalStateException(string2);
        }
        int macSize = this.engine.getMac().getMacSize();
        int fieldSize = this.otherKeyParameter == null ? ((((ECKeyParameters) this.key).getParameters().getCurve().getFieldSize() + 7) / 8) * 2 : 0;
        int size = this.buffer.size() + i3;
        if (this.engine.getCipher() != null) {
            int i10 = this.state;
            if (i10 == 1 || i10 == 3) {
                cipher = this.engine.getCipher();
            } else {
                if (i10 != 2 && i10 != 4) {
                    throw new IllegalStateException(string2);
                }
                cipher = this.engine.getCipher();
                size = (size - macSize) - fieldSize;
            }
            size = cipher.getOutputSize(size);
        }
        int i11 = this.state;
        if (i11 == 1 || i11 == 3) {
            return macSize + fieldSize + size;
        }
        if (i11 == 2 || i11 == 4) {
            return size;
        }
        throw new IllegalStateException(string2);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParam == null && this.engineSpec != null) {
            try {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(StubApp.getString2("30502"));
                this.engineParam = createAlgorithmParameters;
                createAlgorithmParameters.init(this.engineSpec);
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParam;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(IESParameterSpec.class);
            } catch (Exception e10) {
                throw new InvalidAlgorithmParameterException(org.bouncycastle.asn1.a.b(e10, new StringBuilder(StubApp.getString2(30503))));
            }
        } else {
            parameterSpec = null;
        }
        this.engineParam = algorithmParameters;
        engineInit(i3, key, parameterSpec, secureRandom);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        boolean z2;
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals(StubApp.getString2(207))) {
            z2 = false;
        } else {
            if (!upperCase.equals(StubApp.getString2(30511))) {
                throw new IllegalArgumentException(a.j(StubApp.getString2(30512), str));
            }
            z2 = true;
        }
        this.dhaesMode = z2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = Strings.toUpperCase(str);
        if (!upperCase.equals(StubApp.getString2(30513)) && !upperCase.equals(StubApp.getString2(30514)) && !upperCase.equals(StubApp.getString2(30515))) {
            throw new NoSuchPaddingException(StubApp.getString2(30516));
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        this.buffer.write(bArr, i3, i10);
        return 0;
    }

    public IESCipher(IESEngine iESEngine, int i3) {
        this.helper = new BCJcaJceHelper();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = iESEngine;
        this.ivLength = i3;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i3, int i10) throws IllegalBlockSizeException, BadPaddingException {
        if (i10 != 0) {
            this.buffer.write(bArr, i3, i10);
        }
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        CipherParameters iESWithCipherParameters = new IESWithCipherParameters(this.engineSpec.getDerivationV(), this.engineSpec.getEncodingV(), this.engineSpec.getMacKeySize(), this.engineSpec.getCipherKeySize());
        if (this.engineSpec.getNonce() != null) {
            iESWithCipherParameters = new ParametersWithIV(iESWithCipherParameters, this.engineSpec.getNonce());
        }
        AsymmetricKeyParameter asymmetricKeyParameter = this.otherKeyParameter;
        String string2 = StubApp.getString2(30498);
        if (asymmetricKeyParameter != null) {
            try {
                int i11 = this.state;
                if (i11 != 1 && i11 != 3) {
                    this.engine.init(false, this.key, asymmetricKeyParameter, iESWithCipherParameters);
                    return this.engine.processBlock(byteArray, 0, byteArray.length);
                }
                this.engine.init(true, asymmetricKeyParameter, this.key, iESWithCipherParameters);
                return this.engine.processBlock(byteArray, 0, byteArray.length);
            } catch (Exception e10) {
                throw new BadBlockException(string2, e10);
            }
        }
        AsymmetricKeyParameter asymmetricKeyParameter2 = this.key;
        final boolean z2 = (asymmetricKeyParameter2 instanceof X25519PublicKeyParameters) || (asymmetricKeyParameter2 instanceof X25519PrivateKeyParameters);
        int i12 = z2 ? 256 : 448;
        int i13 = this.state;
        if (i13 == 1 || i13 == 3) {
            AsymmetricCipherKeyPairGenerator x25519KeyPairGenerator = z2 ? new X25519KeyPairGenerator() : new X448KeyPairGenerator();
            x25519KeyPairGenerator.init(new KeyGenerationParameters(this.random, i12));
            try {
                this.engine.init(this.key, iESWithCipherParameters, new EphemeralKeyPairGenerator(x25519KeyPairGenerator, new KeyEncoder() { // from class: org.bouncycastle.jcajce.provider.asymmetric.edec.IESCipher.1
                    @Override // org.bouncycastle.crypto.KeyEncoder
                    public byte[] getEncoded(AsymmetricKeyParameter asymmetricKeyParameter3) {
                        return z2 ? ((X25519PublicKeyParameters) asymmetricKeyParameter3).getEncoded() : ((X448PublicKeyParameters) asymmetricKeyParameter3).getEncoded();
                    }
                }));
                return this.engine.processBlock(byteArray, 0, byteArray.length);
            } catch (Exception e11) {
                throw new BadBlockException(string2, e11);
            }
        }
        if (i13 != 2 && i13 != 4) {
            throw new IllegalStateException(StubApp.getString2(30501));
        }
        try {
            this.engine.init(asymmetricKeyParameter2, iESWithCipherParameters, new XIESPublicKeyParser(z2));
            return this.engine.processBlock(byteArray, 0, byteArray.length);
        } catch (InvalidCipherTextException e12) {
            throw new BadBlockException(string2, e12);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i3, int i10) {
        this.buffer.write(bArr, i3, i10);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i3, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new IllegalArgumentException(StubApp.getString2(30504) + e10.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        IESParameterSpec iESParameterSpec;
        AsymmetricKeyParameter generatePublicKeyParameter;
        byte[] bArr = null;
        this.otherKeyParameter = null;
        if (algorithmParameterSpec == null) {
            int i10 = this.ivLength;
            if (i10 != 0 && i3 == 1) {
                bArr = new byte[i10];
                secureRandom.nextBytes(bArr);
            }
            iESParameterSpec = IESUtil.guessParameterSpec(this.engine.getCipher(), bArr);
        } else {
            if (!(algorithmParameterSpec instanceof IESParameterSpec)) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30510));
            }
            iESParameterSpec = (IESParameterSpec) algorithmParameterSpec;
        }
        this.engineSpec = iESParameterSpec;
        byte[] nonce = this.engineSpec.getNonce();
        int i11 = this.ivLength;
        if (i11 != 0 && (nonce == null || nonce.length != i11)) {
            throw new InvalidAlgorithmParameterException(AbstractC1482f.f(this.ivLength, StubApp.getString2(30506), new StringBuilder(StubApp.getString2(30505))));
        }
        if (i3 == 1 || i3 == 3) {
            if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException(StubApp.getString2(30685));
            }
            generatePublicKeyParameter = EdECUtil.generatePublicKeyParameter((PublicKey) key);
        } else {
            if (i3 != 2 && i3 != 4) {
                throw new InvalidKeyException(StubApp.getString2(30683));
            }
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException(StubApp.getString2(30684));
            }
            generatePublicKeyParameter = EdECUtil.generatePrivateKeyParameter((PrivateKey) key);
        }
        this.key = generatePublicKeyParameter;
        this.random = secureRandom;
        this.state = i3;
        this.buffer.reset();
    }
}
