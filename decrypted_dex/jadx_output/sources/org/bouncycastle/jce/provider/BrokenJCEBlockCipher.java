package org.bouncycastle.jce.provider;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.RC5Parameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jce.provider.BrokenPBE;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BrokenJCEBlockCipher implements BrokenPBE {
    private Class[] availableSpecs;
    private BufferedBlockCipher cipher;
    private AlgorithmParameters engineParams;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int pbeHash;
    private int pbeIvSize;
    private int pbeKeySize;
    private int pbeType;

    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithMD5AndDES() {
            super(new CBCBlockCipher(new DESEngine()), 0, 0, 64, 64);
        }
    }

    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithSHA1AndDES() {
            super(new CBCBlockCipher(new DESEngine()), 0, 1, 64, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES2Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 128, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 3, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndTwofish() {
            super(new CBCBlockCipher(new TwofishEngine()), 3, 1, 256, 128);
        }
    }

    public BrokenJCEBlockCipher(BlockCipher blockCipher) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new PaddedBufferedBlockCipher(blockCipher);
    }

    public int engineDoFinal(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr3;
        int i12;
        int i13;
        if (i10 != 0) {
            bArr3 = bArr2;
            i12 = i11;
            i13 = this.cipher.processBytes(bArr, i3, i10, bArr3, i12);
        } else {
            bArr3 = bArr2;
            i12 = i11;
            i13 = 0;
        }
        try {
            return i13 + this.cipher.doFinal(bArr3, i12 + i13);
        } catch (DataLengthException e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        } catch (InvalidCipherTextException e11) {
            throw new BadPaddingException(e11.getMessage());
        }
    }

    public int engineGetBlockSize() {
        return this.cipher.getBlockSize();
    }

    public byte[] engineGetIV() {
        ParametersWithIV parametersWithIV = this.ivParam;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    public int engineGetOutputSize(int i3) {
        return this.cipher.getOutputSize(i3);
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.ivParam != null) {
            String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithmName, StubApp.getString2("21668"));
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.ivParam.getIV());
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParams;
    }

    public void engineInit(int i3, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i10 = 0;
            while (true) {
                Class[] clsArr = this.availableSpecs;
                if (i10 == clsArr.length) {
                    break;
                }
                try {
                    algorithmParameterSpec = algorithmParameters.getParameterSpec(clsArr[i10]);
                    break;
                } catch (Exception unused) {
                    i10++;
                }
            }
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(32365) + algorithmParameters.toString());
            }
        }
        this.engineParams = algorithmParameters;
        engineInit(i3, key, algorithmParameterSpec, secureRandom);
    }

    public void engineSetMode(String str) {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals(StubApp.getString2(30742))) {
            this.ivLength = 0;
            this.cipher = new PaddedBufferedBlockCipher(this.cipher.getUnderlyingCipher());
            return;
        }
        if (upperCase.equals(StubApp.getString2(32384))) {
            this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
            this.cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(this.cipher.getUnderlyingCipher()));
            return;
        }
        if (upperCase.startsWith(StubApp.getString2(32385))) {
            this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
            if (upperCase.length() == 3) {
                this.cipher = new PaddedBufferedBlockCipher(new OFBBlockCipher(this.cipher.getUnderlyingCipher(), this.cipher.getBlockSize() * 8));
                return;
            } else {
                this.cipher = new PaddedBufferedBlockCipher(new OFBBlockCipher(this.cipher.getUnderlyingCipher(), Integer.parseInt(upperCase.substring(3))));
                return;
            }
        }
        if (!upperCase.startsWith(StubApp.getString2(29076))) {
            throw new IllegalArgumentException(a.j(StubApp.getString2(30512), str));
        }
        this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
        if (upperCase.length() == 3) {
            this.cipher = new PaddedBufferedBlockCipher(new CFBBlockCipher(this.cipher.getUnderlyingCipher(), this.cipher.getBlockSize() * 8));
        } else {
            this.cipher = new PaddedBufferedBlockCipher(new CFBBlockCipher(this.cipher.getUnderlyingCipher(), Integer.parseInt(upperCase.substring(3))));
        }
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals(StubApp.getString2(30513))) {
            this.cipher = new BufferedBlockCipher(this.cipher.getUnderlyingCipher());
            return;
        }
        if (upperCase.equals(StubApp.getString2(30514)) || upperCase.equals(StubApp.getString2(30515)) || upperCase.equals(StubApp.getString2(32400))) {
            this.cipher = new PaddedBufferedBlockCipher(this.cipher.getUnderlyingCipher());
        } else {
            if (!upperCase.equals(StubApp.getString2(32396))) {
                throw new NoSuchPaddingException(a.k(StubApp.getString2(30841), str, StubApp.getString2(11660)));
            }
            this.cipher = new CTSBlockCipher(this.cipher.getUnderlyingCipher());
        }
    }

    public Key engineUnwrap(byte[] bArr, String str, int i3) throws InvalidKeyException {
        String string2 = StubApp.getString2(30842);
        try {
            byte[] engineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i3 == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            try {
                KeyFactory keyFactory = KeyFactory.getInstance(str, StubApp.getString2("21668"));
                if (i3 == 1) {
                    return keyFactory.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i3 == 2) {
                    return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new InvalidKeyException(u.p(i3, string2));
            } catch (NoSuchAlgorithmException e10) {
                throw new InvalidKeyException(string2 + e10.getMessage());
            } catch (NoSuchProviderException e11) {
                throw new InvalidKeyException(string2 + e11.getMessage());
            } catch (InvalidKeySpecException e12) {
                throw new InvalidKeyException(string2 + e12.getMessage());
            }
        } catch (BadPaddingException e13) {
            throw new InvalidKeyException(e13.getMessage());
        } catch (IllegalBlockSizeException e14) {
            throw new InvalidKeyException(e14.getMessage());
        }
    }

    public int engineUpdate(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        return this.cipher.processBytes(bArr, i3, i10, bArr2, i11);
    }

    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException(StubApp.getString2(30846));
        }
        try {
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (BadPaddingException e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        }
    }

    public BrokenJCEBlockCipher(BlockCipher blockCipher, int i3, int i10, int i11, int i12) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new PaddedBufferedBlockCipher(blockCipher);
        this.pbeType = i3;
        this.pbeHash = i10;
        this.pbeKeySize = i11;
        this.pbeIvSize = i12;
    }

    public byte[] engineDoFinal(byte[] bArr, int i3, int i10) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2 = new byte[engineGetOutputSize(i10)];
        int processBytes = i10 != 0 ? this.cipher.processBytes(bArr, i3, i10, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            byte[] bArr3 = new byte[doFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
            return bArr3;
        } catch (DataLengthException e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        } catch (InvalidCipherTextException e11) {
            throw new BadPaddingException(e11.getMessage());
        }
    }

    public void engineInit(int i3, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i3, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new IllegalArgumentException(e10.getMessage());
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i3, int i10) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i10);
        if (updateOutputSize <= 0) {
            this.cipher.processBytes(bArr, i3, i10, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        this.cipher.processBytes(bArr, i3, i10, bArr2, 0);
        return bArr2;
    }

    public void engineInit(int i3, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters rC5Parameters;
        CipherParameters cipherParameters;
        ParametersWithIV parametersWithIV;
        CipherParameters cipherParameters2;
        if (key instanceof BCPBEKey) {
            CipherParameters makePBEParameters = BrokenPBE.Util.makePBEParameters((BCPBEKey) key, algorithmParameterSpec, this.pbeType, this.pbeHash, this.cipher.getUnderlyingCipher().getAlgorithmName(), this.pbeKeySize, this.pbeIvSize);
            cipherParameters = makePBEParameters;
            if (this.pbeIvSize != 0) {
                this.ivParam = (ParametersWithIV) makePBEParameters;
                cipherParameters = makePBEParameters;
            }
        } else {
            if (algorithmParameterSpec == null) {
                cipherParameters2 = new KeyParameter(key.getEncoded());
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                if (this.ivLength != 0) {
                    ParametersWithIV parametersWithIV2 = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                    this.ivParam = parametersWithIV2;
                    cipherParameters2 = parametersWithIV2;
                } else {
                    cipherParameters2 = new KeyParameter(key.getEncoded());
                }
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                rC5Parameters = new RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                if (rC2ParameterSpec.getIV() != null && this.ivLength != 0) {
                    parametersWithIV = new ParametersWithIV(rC5Parameters, rC2ParameterSpec.getIV());
                    this.ivParam = parametersWithIV;
                    cipherParameters = parametersWithIV;
                }
                cipherParameters = rC5Parameters;
            } else {
                if (!(algorithmParameterSpec instanceof RC5ParameterSpec)) {
                    throw new InvalidAlgorithmParameterException(StubApp.getString2(30740));
                }
                RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                rC5Parameters = new RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
                if (rC5ParameterSpec.getWordSize() != 32) {
                    throw new IllegalArgumentException(StubApp.getString2(32629));
                }
                if (rC5ParameterSpec.getIV() != null && this.ivLength != 0) {
                    parametersWithIV = new ParametersWithIV(rC5Parameters, rC5ParameterSpec.getIV());
                    this.ivParam = parametersWithIV;
                    cipherParameters = parametersWithIV;
                }
                cipherParameters = rC5Parameters;
            }
            cipherParameters = cipherParameters2;
        }
        CipherParameters cipherParameters3 = cipherParameters;
        if (this.ivLength != 0) {
            boolean z2 = cipherParameters instanceof ParametersWithIV;
            cipherParameters3 = cipherParameters;
            if (!z2) {
                if (secureRandom == null) {
                    secureRandom = CryptoServicesRegistrar.getSecureRandom();
                }
                if (i3 != 1 && i3 != 3) {
                    throw new InvalidAlgorithmParameterException(StubApp.getString2(32381));
                }
                byte[] bArr = new byte[this.ivLength];
                secureRandom.nextBytes(bArr);
                ParametersWithIV parametersWithIV3 = new ParametersWithIV(cipherParameters, bArr);
                this.ivParam = parametersWithIV3;
                cipherParameters3 = parametersWithIV3;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalArgumentException(u.p(i3, StubApp.getString2(32628)));
                    }
                }
            }
            this.cipher.init(false, cipherParameters3);
            return;
        }
        this.cipher.init(true, cipherParameters3);
    }
}
