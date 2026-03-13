package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.DESKeyGenerator;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.ISO9797Alg3Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class DES {

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
            super(new CBCBlockCipher(new DESEngine()), 64);
        }
    }

    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new CBCBlockCipherMac(new DESEngine()));
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new DESEngine()));
        }
    }

    public static class DES64 extends BaseMac {
        public DES64() {
            super(new CBCBlockCipherMac(new DESEngine(), 64));
        }
    }

    public static class DES64with7816d4 extends BaseMac {
        public DES64with7816d4() {
            super(new CBCBlockCipherMac(new DESEngine(), 64, new ISO7816d4Padding()));
        }
    }

    public static class DES9797Alg3 extends BaseMac {
        public DES9797Alg3() {
            super(new ISO9797Alg3Mac(new DESEngine()));
        }
    }

    public static class DES9797Alg3with7816d4 extends BaseMac {
        public DES9797Alg3with7816d4() {
            super(new ISO9797Alg3Mac(new DESEngine(), new ISO7816d4Padding()));
        }
    }

    public static class DESCFB8 extends BaseMac {
        public DESCFB8() {
            super(new CFBBlockCipherMac(new DESEngine()));
        }
    }

    public static class DESPBEKeyFactory extends BaseSecretKeyFactory {
        private int digest;
        private boolean forCipher;
        private int ivSize;
        private int keySize;
        private int scheme;

        public DESPBEKeyFactory(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, int i3, int i10, int i11, int i12) {
            super(str, aSN1ObjectIdentifier);
            this.forCipher = z2;
            this.scheme = i3;
            this.digest = i10;
            this.keySize = i11;
            this.ivSize = i12;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException(StubApp.getString2(31733));
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() != null) {
                CipherParameters makePBEParameters = this.forCipher ? PBE.Util.makePBEParameters(pBEKeySpec, this.scheme, this.digest, this.keySize, this.ivSize) : PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, this.digest, this.keySize);
                DESParameters.setOddParity((makePBEParameters instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) makePBEParameters).getParameters() : (KeyParameter) makePBEParameters).getKey());
                return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, makePBEParameters);
            }
            int i3 = this.scheme;
            if (i3 == 0 || i3 == 4) {
                return new PBKDF1Key(pBEKeySpec.getPassword(), this.scheme == 0 ? PasswordConverter.ASCII : PasswordConverter.UTF8);
            }
            return new BCPBEKey(this.algName, this.algOid, i3, this.digest, this.keySize, this.ivSize, pBEKeySpec, null);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new DESEngine());
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super(StubApp.getString2(28171), null);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DESKeySpec ? new SecretKeySpec(((DESKeySpec) keySpec).getKey(), StubApp.getString2(28171)) : super.engineGenerateSecret(keySpec);
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
            if (!DESKeySpec.class.isAssignableFrom(cls)) {
                throw new InvalidKeySpecException(StubApp.getString2(31733));
            }
            try {
                return new DESKeySpec(secretKey.getEncoded());
            } catch (Exception e10) {
                throw new InvalidKeySpecException(e10.toString());
            }
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super(StubApp.getString2(28171), 64, new DESKeyGenerator());
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public SecretKey engineGenerateKey() {
            if (this.uninitialised) {
                this.engine.init(new KeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), this.defaultKeySize));
                this.uninitialised = false;
            }
            return new SecretKeySpec(this.engine.generateKey(), this.algName);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public void engineInit(int i3, SecureRandom secureRandom) {
            super.engineInit(i3, secureRandom);
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PACKAGE = StubApp.getString2(31736);
        private static final String PREFIX = DES.class.getName();

        private void addAlias(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
            configurableProvider.addAlgorithm(StubApp.getString2(31004) + aSN1ObjectIdentifier.getId(), str);
            configurableProvider.addAlgorithm(StubApp.getString2(30280) + aSN1ObjectIdentifier.getId(), str);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31476), configurableProvider, StubApp.getString2(31737));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.desCBC;
            a.A(configurableProvider, str, StubApp.getString2(31480), StubApp.getString2(30341), aSN1ObjectIdentifier);
            String string2 = StubApp.getString2(28171);
            addAlias(configurableProvider, aSN1ObjectIdentifier, string2);
            configurableProvider.addAlgorithm(StubApp.getString2(31739), str + StubApp.getString2(31738));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            a.y(a.o(a.o(a.o(sb3, StubApp.getString2(31012), configurableProvider, StubApp.getString2(31740), str), StubApp.getString2(31566), configurableProvider, StubApp.getString2(31741), str), StubApp.getString2(31678), configurableProvider, StubApp.getString2(31742), str), StubApp.getString2(31743), configurableProvider, StubApp.getString2(31744));
            configurableProvider.addAlgorithm(StubApp.getString2(31748), a.c(StubApp.getString2(31745), StubApp.getString2(31746), str, StubApp.getString2(31747), configurableProvider));
            configurableProvider.addAlgorithm(StubApp.getString2(31749), StubApp.getString2(31750));
            a.x(new StringBuilder(), str, StubApp.getString2(31751), configurableProvider, StubApp.getString2(31752));
            configurableProvider.addAlgorithm(StubApp.getString2(31756), a.c(StubApp.getString2(31753), StubApp.getString2(31754), str, StubApp.getString2(31755), configurableProvider));
            String string22 = StubApp.getString2(31757);
            String string23 = StubApp.getString2(31758);
            configurableProvider.addAlgorithm(string22, string23);
            configurableProvider.addAlgorithm(StubApp.getString2(31759), string23);
            configurableProvider.addAlgorithm(StubApp.getString2(31760), string23);
            StringBuilder sb4 = new StringBuilder();
            String string24 = StubApp.getString2(31761);
            a.x(sb4, str, string24, configurableProvider, StubApp.getString2(31762));
            configurableProvider.addAlgorithm(StubApp.getString2(31765), a.c(StubApp.getString2(31763), StubApp.getString2(31764), str, string24, configurableProvider));
            configurableProvider.addAlgorithm(StubApp.getString2(31766), StubApp.getString2(31767));
            a.x(new StringBuilder(), str, StubApp.getString2(31768), configurableProvider, StubApp.getString2(31769));
            configurableProvider.addAlgorithm(StubApp.getString2(31770), StubApp.getString2(31771));
            configurableProvider.addAlgorithm(StubApp.getString2(31772), StubApp.getString2(31773));
            StringBuilder s10 = a.s(configurableProvider, StubApp.getString2(31656), string2, str, aSN1ObjectIdentifier);
            s10.append(StubApp.getString2(31469));
            configurableProvider.addAlgorithm(StubApp.getString2(31774), s10.toString());
            a.y(a.o(a.o(a.C(new StringBuilder(StubApp.getString2(31474)), string2, configurableProvider, str, aSN1ObjectIdentifier), StubApp.getString2(31775), configurableProvider, StubApp.getString2(31776), str), StubApp.getString2(31777), configurableProvider, StubApp.getString2(31778), str), StubApp.getString2(31779), configurableProvider, StubApp.getString2(31780));
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC;
            String string25 = StubApp.getString2(31485);
            String string26 = StubApp.getString2(31781);
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier2, string26);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC;
            String string27 = StubApp.getString2(31782);
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier3, string27);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC;
            String string28 = StubApp.getString2(31783);
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier4, string28);
            configurableProvider.addAlgorithm(StubApp.getString2(31784), string26);
            configurableProvider.addAlgorithm(StubApp.getString2(31785), string27);
            configurableProvider.addAlgorithm(StubApp.getString2(31786), string28);
            a.x(a.n(a.n(new StringBuilder(), str, StubApp.getString2(31787), configurableProvider, StubApp.getString2(31788)), str, StubApp.getString2(31789), configurableProvider, StubApp.getString2(31790)), str, StubApp.getString2(31791), configurableProvider, StubApp.getString2(31792));
            configurableProvider.addAlgorithm(StubApp.getString2(31793), string26);
            configurableProvider.addAlgorithm(StubApp.getString2(31794), string27);
            configurableProvider.addAlgorithm(StubApp.getString2(31795), string28);
            String string29 = StubApp.getString2(31027);
            configurableProvider.addAlgorithm(string29 + aSN1ObjectIdentifier2, string26);
            a.z(a.q(new StringBuilder(string29), aSN1ObjectIdentifier3, configurableProvider, string27, string29), aSN1ObjectIdentifier4, configurableProvider, string28);
        }
    }

    public static class PBEWithMD2 extends BaseBlockCipher {
        public PBEWithMD2() {
            super(new CBCBlockCipher(new DESEngine()), 0, 5, 64, 8);
        }
    }

    public static class PBEWithMD2KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD2KeyFactory() {
            super(StubApp.getString2(31796), PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC, true, 0, 5, 64, 64);
        }
    }

    public static class PBEWithMD5 extends BaseBlockCipher {
        public PBEWithMD5() {
            super(new CBCBlockCipher(new DESEngine()), 0, 0, 64, 8);
        }
    }

    public static class PBEWithMD5KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD5KeyFactory() {
            super(StubApp.getString2(31797), PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC, true, 0, 0, 64, 64);
        }
    }

    public static class PBEWithSHA1 extends BaseBlockCipher {
        public PBEWithSHA1() {
            super(new CBCBlockCipher(new DESEngine()), 0, 1, 64, 8);
        }
    }

    public static class PBEWithSHA1KeyFactory extends DESPBEKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super(StubApp.getString2(31798), PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC, true, 0, 1, 64, 64);
        }
    }

    public static class RFC3211 extends BaseWrapCipher {
        public RFC3211() {
            super(new RFC3211WrapEngine(new DESEngine()), 8);
        }
    }

    private DES() {
    }
}
