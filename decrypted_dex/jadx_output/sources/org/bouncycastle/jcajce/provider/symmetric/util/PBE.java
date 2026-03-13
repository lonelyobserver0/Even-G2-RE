package org.bouncycastle.jcajce.provider.symmetric.util;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.digests.TigerDigest;
import org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.DigestFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface PBE {
    public static final int GOST3411 = 6;
    public static final int MD2 = 5;
    public static final int MD5 = 0;
    public static final int OPENSSL = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S1_UTF8 = 4;
    public static final int PKCS5S2 = 1;
    public static final int PKCS5S2_UTF8 = 5;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
    public static final int SHA224 = 7;
    public static final int SHA256 = 4;
    public static final int SHA384 = 8;
    public static final int SHA3_224 = 10;
    public static final int SHA3_256 = 11;
    public static final int SHA3_384 = 12;
    public static final int SHA3_512 = 13;
    public static final int SHA512 = 9;
    public static final int SM3 = 14;
    public static final int TIGER = 3;

    public static class Util {
        private static byte[] convertPassword(int i3, PBEKeySpec pBEKeySpec) {
            return i3 == 2 ? PBEParametersGenerator.PKCS12PasswordToBytes(pBEKeySpec.getPassword()) : (i3 == 5 || i3 == 4) ? PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(pBEKeySpec.getPassword()) : PBEParametersGenerator.PKCS5PasswordToBytes(pBEKeySpec.getPassword());
        }

        private static PBEParametersGenerator makePBEGenerator(int i3, int i10) {
            if (i3 == 0 || i3 == 4) {
                if (i10 == 0) {
                    return new PKCS5S1ParametersGenerator(DigestFactory.createMD5());
                }
                if (i10 == 1) {
                    return new PKCS5S1ParametersGenerator(DigestFactory.createSHA1());
                }
                if (i10 == 5) {
                    return new PKCS5S1ParametersGenerator(new MD2Digest());
                }
                throw new IllegalStateException(StubApp.getString2(32432));
            }
            if (i3 != 1 && i3 != 5) {
                if (i3 != 2) {
                    return new OpenSSLPBEParametersGenerator();
                }
                switch (i10) {
                    case 0:
                        return new PKCS12ParametersGenerator(DigestFactory.createMD5PRF());
                    case 1:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA1PRF());
                    case 2:
                        return new PKCS12ParametersGenerator(new RIPEMD160Digest(CryptoServicePurpose.PRF));
                    case 3:
                        return new PKCS12ParametersGenerator(new TigerDigest(CryptoServicePurpose.PRF));
                    case 4:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA256PRF());
                    case 5:
                        return new PKCS12ParametersGenerator(new MD2Digest(CryptoServicePurpose.PRF));
                    case 6:
                        return new PKCS12ParametersGenerator(new GOST3411Digest(CryptoServicePurpose.PRF));
                    case 7:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA224PRF());
                    case 8:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA384PRF());
                    case 9:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA512PRF());
                    default:
                        throw new IllegalStateException(StubApp.getString2(32430));
                }
            }
            switch (i10) {
                case 0:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createMD5PRF());
                case 1:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA1PRF());
                case 2:
                    return new PKCS5S2ParametersGenerator(new RIPEMD160Digest(CryptoServicePurpose.PRF));
                case 3:
                    return new PKCS5S2ParametersGenerator(new TigerDigest(CryptoServicePurpose.PRF));
                case 4:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA256PRF());
                case 5:
                    return new PKCS5S2ParametersGenerator(new MD2Digest(CryptoServicePurpose.PRF));
                case 6:
                    return new PKCS5S2ParametersGenerator(new GOST3411Digest(CryptoServicePurpose.PRF));
                case 7:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA224PRF());
                case 8:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA384PRF());
                case 9:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA512PRF());
                case 10:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_224PRF());
                case 11:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_256PRF());
                case 12:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_384PRF());
                case 13:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_512PRF());
                case 14:
                    return new PKCS5S2ParametersGenerator(new SM3Digest(CryptoServicePurpose.PRF));
                default:
                    throw new IllegalStateException(StubApp.getString2(32431));
            }
        }

        public static CipherParameters makePBEMacParameters(SecretKey secretKey, int i3, int i10, int i11, PBEParameterSpec pBEParameterSpec) {
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i3, i10);
            byte[] encoded = secretKey.getEncoded();
            makePBEGenerator.init(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i11);
            for (int i12 = 0; i12 != encoded.length; i12++) {
                encoded[i12] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static CipherParameters makePBEParameters(PBEKeySpec pBEKeySpec, int i3, int i10, int i11, int i12) {
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i3, i10);
            byte[] convertPassword = convertPassword(i3, pBEKeySpec);
            makePBEGenerator.init(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            CipherParameters generateDerivedParameters = i12 != 0 ? makePBEGenerator.generateDerivedParameters(i11, i12) : makePBEGenerator.generateDerivedParameters(i11);
            for (int i13 = 0; i13 != convertPassword.length; i13++) {
                convertPassword[i13] = 0;
            }
            return generateDerivedParameters;
        }

        public static CipherParameters makePBEMacParameters(PBEKeySpec pBEKeySpec, int i3, int i10, int i11) {
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i3, i10);
            byte[] convertPassword = convertPassword(i3, pBEKeySpec);
            makePBEGenerator.init(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            CipherParameters generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i11);
            for (int i12 = 0; i12 != convertPassword.length; i12++) {
                convertPassword[i12] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static CipherParameters makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException(StubApp.getString2(32433));
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.shouldTryWrongPKCS12()) {
                encoded = new byte[2];
            }
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters generateDerivedParameters = bCPBEKey.getIvSize() != 0 ? makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize(), bCPBEKey.getIvSize()) : makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize());
            if (str.startsWith(StubApp.getString2(28171))) {
                if (generateDerivedParameters instanceof ParametersWithIV) {
                    DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
                    return generateDerivedParameters;
                }
                DESParameters.setOddParity(((KeyParameter) generateDerivedParameters).getKey());
            }
            return generateDerivedParameters;
        }

        public static CipherParameters makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException(StubApp.getString2(32433));
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            makePBEGenerator.init(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            return makePBEGenerator.generateDerivedMacParameters(bCPBEKey.getKeySize());
        }

        public static CipherParameters makePBEParameters(byte[] bArr, int i3, int i10, int i11, int i12, AlgorithmParameterSpec algorithmParameterSpec, String str) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(32433));
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i3, i10);
            makePBEGenerator.init(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters generateDerivedParameters = i12 != 0 ? makePBEGenerator.generateDerivedParameters(i11, i12) : makePBEGenerator.generateDerivedParameters(i11);
            if (str.startsWith(StubApp.getString2(28171))) {
                if (generateDerivedParameters instanceof ParametersWithIV) {
                    DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
                    return generateDerivedParameters;
                }
                DESParameters.setOddParity(((KeyParameter) generateDerivedParameters).getKey());
            }
            return generateDerivedParameters;
        }
    }
}
