package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface BrokenPBE {
    public static final int MD5 = 0;
    public static final int OLD_PKCS12 = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S2 = 1;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;

    public static class Util {
        private static PBEParametersGenerator makePBEGenerator(int i3, int i10) {
            if (i3 == 0) {
                if (i10 == 0) {
                    return new PKCS5S1ParametersGenerator(new MD5Digest());
                }
                if (i10 == 1) {
                    return new PKCS5S1ParametersGenerator(new SHA1Digest());
                }
                throw new IllegalStateException(StubApp.getString2(32630));
            }
            if (i3 == 1) {
                return new PKCS5S2ParametersGenerator();
            }
            String string2 = StubApp.getString2(32430);
            if (i3 == 3) {
                if (i10 == 0) {
                    return new OldPKCS12ParametersGenerator(new MD5Digest());
                }
                if (i10 == 1) {
                    return new OldPKCS12ParametersGenerator(new SHA1Digest());
                }
                if (i10 == 2) {
                    return new OldPKCS12ParametersGenerator(new RIPEMD160Digest());
                }
                throw new IllegalStateException(string2);
            }
            if (i10 == 0) {
                return new PKCS12ParametersGenerator(new MD5Digest());
            }
            if (i10 == 1) {
                return new PKCS12ParametersGenerator(new SHA1Digest());
            }
            if (i10 == 2) {
                return new PKCS12ParametersGenerator(new RIPEMD160Digest());
            }
            throw new IllegalStateException(string2);
        }

        public static CipherParameters makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i3, int i10, int i11) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException(StubApp.getString2(32433));
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i3, i10);
            byte[] encoded = bCPBEKey.getEncoded();
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i11);
            for (int i12 = 0; i12 != encoded.length; i12++) {
                encoded[i12] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static CipherParameters makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i3, int i10, String str, int i11, int i12) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException(StubApp.getString2(32433));
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i3, i10);
            byte[] encoded = bCPBEKey.getEncoded();
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters generateDerivedParameters = i12 != 0 ? makePBEGenerator.generateDerivedParameters(i11, i12) : makePBEGenerator.generateDerivedParameters(i11);
            if (str.startsWith(StubApp.getString2(28171))) {
                if (generateDerivedParameters instanceof ParametersWithIV) {
                    setOddParity(((KeyParameter) ((ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
                } else {
                    setOddParity(((KeyParameter) generateDerivedParameters).getKey());
                }
            }
            for (int i13 = 0; i13 != encoded.length; i13++) {
                encoded[i13] = 0;
            }
            return generateDerivedParameters;
        }

        private static void setOddParity(byte[] bArr) {
            for (int i3 = 0; i3 < bArr.length; i3++) {
                byte b2 = bArr[i3];
                bArr[i3] = (byte) ((((b2 >> 7) ^ ((((((b2 >> 1) ^ (b2 >> 2)) ^ (b2 >> 3)) ^ (b2 >> 4)) ^ (b2 >> 5)) ^ (b2 >> 6))) ^ 1) | (b2 & 254));
            }
        }
    }
}
