package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.DESedeWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.DES;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class DESede {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("28171"));
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(31732));
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new DESedeEngine()), 64);
        }
    }

    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new CBCBlockCipherMac(new DESedeEngine()));
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new DESedeEngine()));
        }
    }

    public static class DESede64 extends BaseMac {
        public DESede64() {
            super(new CBCBlockCipherMac(new DESedeEngine(), 64));
        }
    }

    public static class DESede64with7816d4 extends BaseMac {
        public DESede64with7816d4() {
            super(new CBCBlockCipherMac(new DESedeEngine(), 64, new ISO7816d4Padding()));
        }
    }

    public static class DESedeCFB8 extends BaseMac {
        public DESedeCFB8() {
            super(new CFBBlockCipherMac(new DESedeEngine()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new DESedeEngine());
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super(StubApp.getString2(28590), null);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DESedeKeySpec ? new SecretKeySpec(((DESedeKeySpec) keySpec).getKey(), StubApp.getString2(28590)) : super.engineGenerateSecret(keySpec);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException(StubApp.getString2(31735));
            }
            if (secretKey == null) {
                throw new InvalidKeySpecException(StubApp.getString2(31734));
            }
            if (SecretKeySpec.class.isAssignableFrom(cls)) {
                return new SecretKeySpec(secretKey.getEncoded(), this.algName);
            }
            if (!DESedeKeySpec.class.isAssignableFrom(cls)) {
                throw new InvalidKeySpecException(StubApp.getString2(31733));
            }
            byte[] encoded = secretKey.getEncoded();
            try {
                if (encoded.length != 16) {
                    return new DESedeKeySpec(encoded);
                }
                byte[] bArr = new byte[24];
                System.arraycopy(encoded, 0, bArr, 0, 16);
                System.arraycopy(encoded, 0, bArr, 16, 8);
                return new DESedeKeySpec(bArr);
            } catch (Exception e10) {
                throw new InvalidKeySpecException(e10.toString());
            }
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        private boolean keySizeSet;

        public KeyGenerator() {
            super(StubApp.getString2(28590), 192, new DESedeKeyGenerator());
            this.keySizeSet = false;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public SecretKey engineGenerateKey() {
            if (this.uninitialised) {
                this.engine.init(new KeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), this.defaultKeySize));
                this.uninitialised = false;
            }
            if (this.keySizeSet) {
                return new SecretKeySpec(this.engine.generateKey(), this.algName);
            }
            byte[] generateKey = this.engine.generateKey();
            System.arraycopy(generateKey, 0, generateKey, 16, 8);
            return new SecretKeySpec(generateKey, this.algName);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public void engineInit(int i3, SecureRandom secureRandom) {
            super.engineInit(i3, secureRandom);
            this.keySizeSet = true;
        }
    }

    public static class KeyGenerator3 extends BaseKeyGenerator {
        public KeyGenerator3() {
            super(StubApp.getString2(31799), 192, new DESedeKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PACKAGE = StubApp.getString2(31736);
        private static final String PREFIX = DESede.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31476), configurableProvider, StubApp.getString2(31800));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.des_EDE3_CBC;
            String str2 = str + StubApp.getString2(31480);
            String string2 = StubApp.getString2(30341);
            configurableProvider.addAlgorithm(string2, aSN1ObjectIdentifier, str2);
            StringBuilder sb3 = new StringBuilder();
            String string22 = StubApp.getString2(31484);
            a.x(sb3, str, string22, configurableProvider, StubApp.getString2(31801));
            configurableProvider.addAlgorithm(string2, PKCSObjectIdentifiers.id_alg_CMS3DESwrap, str + string22);
            a.x(new StringBuilder(), str, StubApp.getString2(31738), configurableProvider, StubApp.getString2(31802));
            String string23 = StubApp.getString2(31803);
            String string24 = StubApp.getString2(31804);
            configurableProvider.addAlgorithm(string23, string24);
            String string25 = StubApp.getString2(31805);
            String string26 = StubApp.getString2(28051);
            configurableProvider.addAlgorithm(string25, string26);
            configurableProvider.addAlgorithm(StubApp.getString2(31806), string24);
            configurableProvider.addAlgorithm(StubApp.getString2(31807), string26);
            configurableProvider.addAlgorithm(StubApp.getString2(31808), string26);
            configurableProvider.addAlgorithm(StubApp.getString2(31809), string26);
            configurableProvider.addAlgorithm(StubApp.getString2(31810), string26);
            boolean hasAlgorithm = configurableProvider.hasAlgorithm(StubApp.getString2(30413), StubApp.getString2(5778));
            String string27 = StubApp.getString2(31811);
            String string28 = StubApp.getString2(31812);
            if (hasAlgorithm) {
                configurableProvider.addAlgorithm(StubApp.getString2(31814), str + StubApp.getString2(31813));
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                a.y(sb4, StubApp.getString2(31815), configurableProvider, StubApp.getString2(31816));
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
                String string29 = StubApp.getString2(31485);
                configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier2, string28);
                configurableProvider.addAlgorithm(string29, PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, string27);
                configurableProvider.addAlgorithm(StubApp.getString2(31817), string28);
                configurableProvider.addAlgorithm(StubApp.getString2(31818), string28);
                configurableProvider.addAlgorithm(StubApp.getString2(31819), string27);
                configurableProvider.addAlgorithm(StubApp.getString2(31820), string28);
                configurableProvider.addAlgorithm(StubApp.getString2(31821), string27);
                configurableProvider.addAlgorithm(StubApp.getString2(31822), string28);
                configurableProvider.addAlgorithm(StubApp.getString2(31823), string27);
                configurableProvider.addAlgorithm(StubApp.getString2(31824), string28);
            }
            String string210 = StubApp.getString2(31012);
            StringBuilder m4 = a.m(str, string210, StubApp.getString2(31825), StubApp.getString2(31000), configurableProvider);
            m4.append(aSN1ObjectIdentifier);
            configurableProvider.addAlgorithm(m4.toString(), str + StubApp.getString2(31826));
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            StringBuilder o5 = a.o(sb5, string210, configurableProvider, StubApp.getString2(31827), str);
            String string211 = StubApp.getString2(31566);
            a.y(o5, string211, configurableProvider, StubApp.getString2(31828));
            configurableProvider.addAlgorithm(StubApp.getString2(31568), OIWObjectIdentifiers.desEDE, str + string211);
            a.x(a.n(new StringBuilder(), str, StubApp.getString2(31678), configurableProvider, StubApp.getString2(31829)), str, StubApp.getString2(31743), configurableProvider, StubApp.getString2(31830));
            configurableProvider.addAlgorithm(StubApp.getString2(31834), a.c(StubApp.getString2(31831), StubApp.getString2(31832), str, StubApp.getString2(31833), configurableProvider));
            configurableProvider.addAlgorithm(StubApp.getString2(31835), StubApp.getString2(31836));
            a.x(new StringBuilder(), str, StubApp.getString2(31837), configurableProvider, StubApp.getString2(31838));
            configurableProvider.addAlgorithm(StubApp.getString2(31842), a.c(StubApp.getString2(31839), StubApp.getString2(31840), str, StubApp.getString2(31841), configurableProvider));
            String string212 = StubApp.getString2(31843);
            String string213 = StubApp.getString2(31844);
            configurableProvider.addAlgorithm(string212, string213);
            configurableProvider.addAlgorithm(StubApp.getString2(31845), string213);
            configurableProvider.addAlgorithm(StubApp.getString2(31846), string213);
            configurableProvider.addAlgorithm(StubApp.getString2(31847), StubApp.getString2(31773));
            configurableProvider.addAlgorithm(StubApp.getString2(31464) + aSN1ObjectIdentifier, string26);
            configurableProvider.addAlgorithm(StubApp.getString2(31848), str + StubApp.getString2(31469));
            a.y(a.o(a.C(new StringBuilder(StubApp.getString2(31474)), string26, configurableProvider, str, aSN1ObjectIdentifier), StubApp.getString2(31849), configurableProvider, StubApp.getString2(31850), str), StubApp.getString2(31851), configurableProvider, StubApp.getString2(31852));
            configurableProvider.addAlgorithm(StubApp.getString2(31853), string28);
            String string214 = StubApp.getString2(31854);
            String string215 = StubApp.getString2(31601);
            configurableProvider.addAlgorithm(string214, string215);
            configurableProvider.addAlgorithm(StubApp.getString2(31855), string215);
            configurableProvider.addAlgorithm(StubApp.getString2(31856), string215);
            configurableProvider.addAlgorithm(StubApp.getString2(31857), string215);
            configurableProvider.addAlgorithm(StubApp.getString2(31858), string215);
            configurableProvider.addAlgorithm(StubApp.getString2(31859), string215);
            configurableProvider.addAlgorithm(StubApp.getString2(31860), string28);
            configurableProvider.addAlgorithm(StubApp.getString2(31861), string28);
            configurableProvider.addAlgorithm(StubApp.getString2(31862), string27);
            configurableProvider.addAlgorithm(StubApp.getString2(31863), string28);
            configurableProvider.addAlgorithm(StubApp.getString2(31864), string215);
            configurableProvider.addAlgorithm(StubApp.getString2(31865), string215);
            configurableProvider.addAlgorithm(StubApp.getString2(31866), string28);
        }
    }

    public static class PBEWithSHAAndDES2Key extends BaseBlockCipher {
        public PBEWithSHAAndDES2Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 128, 8);
        }
    }

    public static class PBEWithSHAAndDES2KeyFactory extends DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES2KeyFactory() {
            super(StubApp.getString2(31867), PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, true, 2, 1, 128, 64);
        }
    }

    public static class PBEWithSHAAndDES3Key extends BaseBlockCipher {
        public PBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 192, 8);
        }
    }

    public static class PBEWithSHAAndDES3KeyFactory extends DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES3KeyFactory() {
            super(StubApp.getString2(31868), PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, true, 2, 1, 192, 64);
        }
    }

    public static class RFC3211 extends BaseWrapCipher {
        public RFC3211() {
            super(new RFC3211WrapEngine(new DESedeEngine()), 8);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new DESedeWrapEngine());
        }
    }

    private DESede() {
    }
}
