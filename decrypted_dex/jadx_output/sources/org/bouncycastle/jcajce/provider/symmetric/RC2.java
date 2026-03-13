package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RC2CBCParameter;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.RC2Engine;
import org.bouncycastle.crypto.engines.RC2WrapEngine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class RC2 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        RC2ParameterSpec spec = null;

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            RC2ParameterSpec rC2ParameterSpec = this.spec;
            String string2 = StubApp.getString2(28256);
            if (rC2ParameterSpec != null) {
                try {
                    AlgorithmParameters createParametersInstance = createParametersInstance(string2);
                    createParametersInstance.init(this.spec);
                    return createParametersInstance;
                } catch (Exception e10) {
                    throw new RuntimeException(e10.getMessage());
                }
            }
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance2 = createParametersInstance(string2);
                createParametersInstance2.init(new IvParameterSpec(bArr));
                return createParametersInstance2;
            } catch (Exception e11) {
                throw new RuntimeException(e11.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(32072));
            }
            this.spec = (RC2ParameterSpec) algorithmParameterSpec;
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters {
        private byte[] iv;
        private int parameterVersion = 58;
        private static final short[] table = {189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, 114, 140, 8, 21, 110, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, 113, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, 112, 178, 145, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, 111, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
        private static final short[] ekb = {93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, 111, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, 164, 234, 66, 8, 218, 180, 113, 176, 207, 18, 122, 78, 250, 108, 29, 132, 0, 200, 127, 145, 69, 170, 43, 194, 177, 143, 213, 186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return Arrays.clone(this.iv);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
                throw new InvalidParameterSpecException(StubApp.getString2(32073));
            }
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            int effectiveKeyBits = rC2ParameterSpec.getEffectiveKeyBits();
            if (effectiveKeyBits != -1) {
                int i3 = effectiveKeyBits;
                if (effectiveKeyBits < 256) {
                    i3 = table[effectiveKeyBits];
                }
                this.parameterVersion = i3;
            }
            this.iv = rC2ParameterSpec.getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32074);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            int i3;
            if ((cls == RC2ParameterSpec.class || cls == AlgorithmParameterSpec.class) && (i3 = this.parameterVersion) != -1) {
                return i3 < 256 ? new RC2ParameterSpec(ekb[this.parameterVersion], this.iv) : new RC2ParameterSpec(this.parameterVersion, this.iv);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            throw new InvalidParameterSpecException(StubApp.getString2(32075));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                int i3 = this.parameterVersion;
                return i3 == -1 ? new RC2CBCParameter(engineGetEncoded()).getEncoded() : new RC2CBCParameter(i3, engineGetEncoded()).getEncoded();
            }
            if (str.equals(StubApp.getString2(31343))) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.iv = Arrays.clone(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                if (!str.equals(StubApp.getString2(31343))) {
                    throw new IOException(StubApp.getString2(31686));
                }
                engineInit(bArr);
            } else {
                RC2CBCParameter rC2CBCParameter = RC2CBCParameter.getInstance(ASN1Primitive.fromByteArray(bArr));
                if (rC2CBCParameter.getRC2ParameterVersion() != null) {
                    this.parameterVersion = rC2CBCParameter.getRC2ParameterVersion().intValue();
                }
                this.iv = rC2CBCParameter.getIV();
            }
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new RC2Engine()), 64);
        }
    }

    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new CBCBlockCipherMac(new RC2Engine()));
        }
    }

    public static class CFB8MAC extends BaseMac {
        public CFB8MAC() {
            super(new CFBBlockCipherMac(new RC2Engine()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new RC2Engine());
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super(StubApp.getString2(28256), 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = RC2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            String string2 = StubApp.getString2(31469);
            StringBuilder n10 = a.n(a.n(sb2, str, string2, configurableProvider, StubApp.getString2(32076)), str, string2, configurableProvider, StubApp.getString2(32077));
            String string22 = StubApp.getString2(31012);
            StringBuilder n11 = a.n(a.n(n10, str, string22, configurableProvider, StubApp.getString2(32078)), str, string22, configurableProvider, StubApp.getString2(32079));
            String string23 = StubApp.getString2(31459);
            a.x(a.n(a.n(a.n(n11, str, string23, configurableProvider, StubApp.getString2(32080)), str, string23, configurableProvider, StubApp.getString2(32081)), str, StubApp.getString2(31476), configurableProvider, StubApp.getString2(32082)), str, StubApp.getString2(31484), configurableProvider, StubApp.getString2(32083));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_CMSRC2wrap;
            String string24 = StubApp.getString2(32084);
            String string25 = StubApp.getString2(31485);
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier, string24);
            configurableProvider.addAlgorithm(StubApp.getString2(30341), PKCSObjectIdentifiers.RC2_CBC, str + StubApp.getString2(31480));
            a.x(new StringBuilder(), str, StubApp.getString2(31743), configurableProvider, StubApp.getString2(32085));
            configurableProvider.addAlgorithm(StubApp.getString2(32089), a.c(StubApp.getString2(32086), StubApp.getString2(32087), str, StubApp.getString2(32088), configurableProvider));
            configurableProvider.addAlgorithm(StubApp.getString2(32090), StubApp.getString2(32091));
            String string26 = StubApp.getString2(32092);
            String string27 = StubApp.getString2(32093);
            configurableProvider.addAlgorithm(string26, string27);
            String string28 = StubApp.getString2(32094);
            String string29 = StubApp.getString2(32095);
            configurableProvider.addAlgorithm(string28, string29);
            String string210 = StubApp.getString2(32096);
            String string211 = StubApp.getString2(32097);
            configurableProvider.addAlgorithm(string210, string211);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC;
            String string212 = StubApp.getString2(31599);
            configurableProvider.addAlgorithm(string212, aSN1ObjectIdentifier2, string27);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC;
            configurableProvider.addAlgorithm(string212, aSN1ObjectIdentifier3, string29);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC;
            configurableProvider.addAlgorithm(string212, aSN1ObjectIdentifier4, string211);
            String string213 = StubApp.getString2(32098);
            String string214 = StubApp.getString2(32099);
            configurableProvider.addAlgorithm(string213, string214);
            String string215 = StubApp.getString2(32100);
            String string216 = StubApp.getString2(32101);
            configurableProvider.addAlgorithm(string215, string216);
            a.x(a.n(a.n(a.n(a.n(new StringBuilder(), str, StubApp.getString2(31787), configurableProvider, StubApp.getString2(32102)), str, StubApp.getString2(31789), configurableProvider, StubApp.getString2(32103)), str, StubApp.getString2(31791), configurableProvider, StubApp.getString2(32104)), str, StubApp.getString2(31637), configurableProvider, StubApp.getString2(32105)), str, StubApp.getString2(31639), configurableProvider, StubApp.getString2(32106));
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier2, string27);
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier3, string29);
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier4, string211);
            String string217 = StubApp.getString2(32107);
            String string218 = StubApp.getString2(31601);
            configurableProvider.addAlgorithm(string217, string218);
            configurableProvider.addAlgorithm(StubApp.getString2(32108), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(32109), string218);
            configurableProvider.addAlgorithm(string25, PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, string214);
            configurableProvider.addAlgorithm(string25, PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, string216);
            configurableProvider.addAlgorithm(StubApp.getString2(32110), string214);
            configurableProvider.addAlgorithm(StubApp.getString2(32111), string216);
            a.x(new StringBuilder(), str, StubApp.getString2(32112), configurableProvider, StubApp.getString2(32113));
            configurableProvider.addAlgorithm(StubApp.getString2(32114), string211);
            configurableProvider.addAlgorithm(StubApp.getString2(32115), string211);
            a.x(a.n(a.n(new StringBuilder(), str, StubApp.getString2(32116), configurableProvider, StubApp.getString2(32117)), str, StubApp.getString2(32118), configurableProvider, StubApp.getString2(32119)), str, StubApp.getString2(32120), configurableProvider, StubApp.getString2(32121));
            configurableProvider.addAlgorithm(StubApp.getString2(32122), string29);
            configurableProvider.addAlgorithm(StubApp.getString2(32123), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(32124), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(32125), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(32126), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(32127), string218);
        }
    }

    public static class PBEWithMD2KeyFactory extends PBESecretKeyFactory {
        public PBEWithMD2KeyFactory() {
            super(StubApp.getString2(32128), PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC, true, 0, 5, 64, 64);
        }
    }

    public static class PBEWithMD5AndRC2 extends BaseBlockCipher {
        public PBEWithMD5AndRC2() {
            super(new CBCBlockCipher(new RC2Engine()), 0, 0, 64, 8);
        }
    }

    public static class PBEWithMD5KeyFactory extends PBESecretKeyFactory {
        public PBEWithMD5KeyFactory() {
            super(StubApp.getString2(32129), PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC, true, 0, 0, 64, 64);
        }
    }

    public static class PBEWithSHA1AndRC2 extends BaseBlockCipher {
        public PBEWithSHA1AndRC2() {
            super(new CBCBlockCipher(new RC2Engine()), 0, 1, 64, 8);
        }
    }

    public static class PBEWithSHA1KeyFactory extends PBESecretKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super(StubApp.getString2(32130), PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC, true, 0, 1, 64, 64);
        }
    }

    public static class PBEWithSHAAnd128BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() {
            super(StubApp.getString2(32131), PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, true, 2, 1, 128, 64);
        }
    }

    public static class PBEWithSHAAnd128BitRC2 extends BaseBlockCipher {
        public PBEWithSHAAnd128BitRC2() {
            super(new CBCBlockCipher(new RC2Engine()), 2, 1, 128, 8);
        }
    }

    public static class PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() {
            super(StubApp.getString2(32132), PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, true, 2, 1, 40, 64);
        }
    }

    public static class PBEWithSHAAnd40BitRC2 extends BaseBlockCipher {
        public PBEWithSHAAnd40BitRC2() {
            super(new CBCBlockCipher(new RC2Engine()), 2, 1, 40, 8);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new RC2WrapEngine());
        }
    }

    private RC2() {
    }
}
