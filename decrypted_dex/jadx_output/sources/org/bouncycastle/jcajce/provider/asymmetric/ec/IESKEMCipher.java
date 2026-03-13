package org.bouncycastle.jcajce.provider.asymmetric.ec;

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
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.EphemeralKeyPair;
import org.bouncycastle.crypto.KeyEncoder;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.agreement.ECDHCBasicAgreement;
import org.bouncycastle.crypto.engines.IESEngine;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.IESKEMParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.jce.spec.IESParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IESKEMCipher extends BaseCipherSpi {
    private static final X9IntegerConverter converter = new X9IntegerConverter();
    private final ECDHCBasicAgreement agreement;
    private IESEngine engine;
    private final Mac hMac;
    private int ivLength;
    private final KDF2BytesGenerator kdf;
    private AsymmetricKeyParameter key;
    private final int macKeyLength;
    private final int macLength;
    private SecureRandom random;
    private final JcaJceHelper helper = new BCJcaJceHelper();
    private int state = -1;
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private AlgorithmParameters engineParam = null;
    private IESKEMParameterSpec engineSpec = null;
    private boolean dhaesMode = false;
    private AsymmetricKeyParameter otherKeyParameter = null;

    public static class KEM extends IESKEMCipher {
        public KEM(Digest digest, Digest digest2, int i3, int i10) {
            super(new ECDHCBasicAgreement(), new KDF2BytesGenerator(digest), new HMac(digest2), i3, i10);
        }
    }

    public static class KEMwithSHA256 extends KEM {
        public KEMwithSHA256() {
            super(DigestFactory.createSHA256(), DigestFactory.createSHA256(), 32, 16);
        }
    }

    public IESKEMCipher(ECDHCBasicAgreement eCDHCBasicAgreement, KDF2BytesGenerator kDF2BytesGenerator, Mac mac, int i3, int i10) {
        this.agreement = eCDHCBasicAgreement;
        this.kdf = kDF2BytesGenerator;
        this.hMac = mac;
        this.macKeyLength = i3;
        this.macLength = i10;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i3, i10);
        System.arraycopy(engineDoFinal, 0, bArr2, i11, engineDoFinal.length);
        return engineDoFinal.length;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof ECKey) {
            return ((ECKey) key).getParameters().getCurve().getFieldSize();
        }
        throw new IllegalArgumentException(StubApp.getString2(30604));
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
                throw new InvalidAlgorithmParameterException(a.b(e10, new StringBuilder(StubApp.getString2(30503))));
            }
        } else {
            parameterSpec = null;
        }
        this.engineParam = algorithmParameters;
        engineInit(i3, key, parameterSpec, secureRandom);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(E1.a.j(StubApp.getString2(30512), str));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(StubApp.getString2(30516));
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        this.buffer.write(bArr, i3, i10);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i3, int i10) throws IllegalBlockSizeException, BadPaddingException {
        if (i10 != 0) {
            this.buffer.write(bArr, i3, i10);
        }
        this.buffer.toByteArray();
        this.buffer.reset();
        ECDomainParameters parameters = ((ECKeyParameters) this.key).getParameters();
        int i11 = this.state;
        if (i11 == 1 || i11 == 3) {
            ECKeyPairGenerator eCKeyPairGenerator = new ECKeyPairGenerator();
            eCKeyPairGenerator.init(new ECKeyGenerationParameters(parameters, this.random));
            final boolean hasUsePointCompression = this.engineSpec.hasUsePointCompression();
            EphemeralKeyPair generate = new EphemeralKeyPairGenerator(eCKeyPairGenerator, new KeyEncoder() { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.IESKEMCipher.1
                @Override // org.bouncycastle.crypto.KeyEncoder
                public byte[] getEncoded(AsymmetricKeyParameter asymmetricKeyParameter) {
                    return ((ECPublicKeyParameters) asymmetricKeyParameter).getQ().getEncoded(hasUsePointCompression);
                }
            }).generate();
            this.agreement.init(generate.getKeyPair().getPrivate());
            X9IntegerConverter x9IntegerConverter = converter;
            byte[] integerToBytes = x9IntegerConverter.integerToBytes(this.agreement.calculateAgreement(this.key), x9IntegerConverter.getByteLength(parameters.getCurve()));
            int i12 = this.macKeyLength + i10;
            byte[] bArr2 = new byte[i12];
            this.kdf.init(new KDFParameters(integerToBytes, this.engineSpec.getRecipientInfo()));
            this.kdf.generateBytes(bArr2, 0, i12);
            byte[] bArr3 = new byte[this.macLength + i10];
            for (int i13 = 0; i13 != i10; i13++) {
                bArr3[i13] = (byte) (bArr[i3 + i13] ^ bArr2[i13]);
            }
            KeyParameter keyParameter = new KeyParameter(bArr2, i10, i12 - i10);
            this.hMac.init(keyParameter);
            this.hMac.update(bArr3, 0, i10);
            byte[] bArr4 = new byte[this.hMac.getMacSize()];
            this.hMac.doFinal(bArr4, 0);
            Arrays.clear(keyParameter.getKey());
            Arrays.clear(bArr2);
            System.arraycopy(bArr4, 0, bArr3, i10, this.macLength);
            return Arrays.concatenate(generate.getEncodedPublicKey(), bArr3);
        }
        if (i11 != 2 && i11 != 4) {
            throw new IllegalStateException(StubApp.getString2(30501));
        }
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) this.key;
        ECCurve curve = eCPrivateKeyParameters.getParameters().getCurve();
        int fieldSize = (curve.getFieldSize() + 7) / 8;
        if (bArr[i3] == 4) {
            fieldSize *= 2;
        }
        int i14 = fieldSize + 1;
        int i15 = i10 - (this.macLength + i14);
        int i16 = i14 + i3;
        ECPoint decodePoint = curve.decodePoint(Arrays.copyOfRange(bArr, i3, i16));
        this.agreement.init(this.key);
        X9IntegerConverter x9IntegerConverter2 = converter;
        byte[] integerToBytes2 = x9IntegerConverter2.integerToBytes(this.agreement.calculateAgreement(new ECPublicKeyParameters(decodePoint, eCPrivateKeyParameters.getParameters())), x9IntegerConverter2.getByteLength(parameters.getCurve()));
        int i17 = this.macKeyLength + i15;
        byte[] bArr5 = new byte[i17];
        this.kdf.init(new KDFParameters(integerToBytes2, this.engineSpec.getRecipientInfo()));
        this.kdf.generateBytes(bArr5, 0, i17);
        byte[] bArr6 = new byte[i15];
        for (int i18 = 0; i18 != i15; i18++) {
            bArr6[i18] = (byte) (bArr[i16 + i18] ^ bArr5[i18]);
        }
        KeyParameter keyParameter2 = new KeyParameter(bArr5, i15, i17 - i15);
        this.hMac.init(keyParameter2);
        this.hMac.update(bArr, i16, i15);
        byte[] bArr7 = new byte[this.hMac.getMacSize()];
        this.hMac.doFinal(bArr7, 0);
        Arrays.clear(keyParameter2.getKey());
        Arrays.clear(bArr5);
        int i19 = this.macLength;
        if (Arrays.constantTimeAreEqual(i19, bArr7, 0, bArr, (i10 - i19) + i3)) {
            return bArr6;
        }
        throw new BadPaddingException(StubApp.getString2(30611));
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
        AsymmetricKeyParameter generatePublicKeyParameter;
        this.otherKeyParameter = null;
        this.engineSpec = (IESKEMParameterSpec) algorithmParameterSpec;
        if (i3 == 1 || i3 == 3) {
            if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException(StubApp.getString2(30610));
            }
            generatePublicKeyParameter = ECUtils.generatePublicKeyParameter((PublicKey) key);
        } else {
            if (i3 != 2 && i3 != 4) {
                throw new InvalidKeyException(StubApp.getString2(30507));
            }
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException(StubApp.getString2(30609));
            }
            generatePublicKeyParameter = ECUtil.generatePrivateKeyParameter((PrivateKey) key);
        }
        this.key = generatePublicKeyParameter;
        this.random = secureRandom;
        this.state = i3;
        this.buffer.reset();
    }
}
