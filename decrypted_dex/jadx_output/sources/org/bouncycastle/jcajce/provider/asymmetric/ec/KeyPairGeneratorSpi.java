package org.bouncycastle.jcajce.provider.asymmetric.ec;

import E1.a;
import com.stub.StubApp;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class KeyPairGeneratorSpi extends KeyPairGenerator {

    public static class EC extends KeyPairGeneratorSpi {
        private static Hashtable ecParameters;
        String algorithm;
        ProviderConfiguration configuration;
        Object ecParams;
        ECKeyPairGenerator engine;
        boolean initialised;
        ECKeyGenerationParameters param;
        SecureRandom random;
        int strength;

        static {
            Hashtable hashtable = new Hashtable();
            ecParameters = hashtable;
            hashtable.put(Integers.valueOf(192), new ECGenParameterSpec(StubApp.getString2(27973)));
            ecParameters.put(Integers.valueOf(239), new ECGenParameterSpec(StubApp.getString2(27976)));
            ecParameters.put(Integers.valueOf(256), new ECGenParameterSpec(StubApp.getString2(27979)));
            ecParameters.put(Integers.valueOf(BERTags.FLAGS), new ECGenParameterSpec(StubApp.getString2(27162)));
            ecParameters.put(Integers.valueOf(KyberEngine.KyberPolyBytes), new ECGenParameterSpec(StubApp.getString2(27160)));
            ecParameters.put(Integers.valueOf(521), new ECGenParameterSpec(StubApp.getString2(27159)));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public EC() {
            /*
                r2 = this;
                r0 = 4707(0x1263, float:6.596E-42)
                java.lang.String r0 = com.stub.StubApp.getString2(r0)
                r2.<init>(r0)
                org.bouncycastle.crypto.generators.ECKeyPairGenerator r1 = new org.bouncycastle.crypto.generators.ECKeyPairGenerator
                r1.<init>()
                r2.engine = r1
                r1 = 0
                r2.ecParams = r1
                r1 = 239(0xef, float:3.35E-43)
                r2.strength = r1
                java.security.SecureRandom r1 = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom()
                r2.random = r1
                r1 = 0
                r2.initialised = r1
                r2.algorithm = r0
                org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
                r2.configuration = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi.EC.<init>():void");
        }

        public ECKeyGenerationParameters createKeyGenParamsBC(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            return new ECKeyGenerationParameters(new ECDomainParameters(eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH()), secureRandom);
        }

        public ECKeyGenerationParameters createKeyGenParamsJCE(java.security.spec.ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            X9ECParameters domainParametersFromName;
            if ((eCParameterSpec instanceof ECNamedCurveSpec) && (domainParametersFromName = ECUtils.getDomainParametersFromName(((ECNamedCurveSpec) eCParameterSpec).getName(), this.configuration)) != null) {
                return createKeyGenParamsJCE(domainParametersFromName, secureRandom);
            }
            ECCurve convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new ECKeyGenerationParameters(new ECDomainParameters(convertCurve, EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            if (!this.initialised) {
                initialize(this.strength, new SecureRandom());
            }
            AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
            ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) generateKeyPair.getPublic();
            ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) generateKeyPair.getPrivate();
            Object obj = this.ecParams;
            if (obj instanceof ECParameterSpec) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECPublicKey bCECPublicKey = new BCECPublicKey(this.algorithm, eCPublicKeyParameters, eCParameterSpec, this.configuration);
                return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.algorithm, eCPrivateKeyParameters, bCECPublicKey, eCParameterSpec, this.configuration));
            }
            if (obj == null) {
                return new KeyPair(new BCECPublicKey(this.algorithm, eCPublicKeyParameters, this.configuration), new BCECPrivateKey(this.algorithm, eCPrivateKeyParameters, this.configuration));
            }
            java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) obj;
            BCECPublicKey bCECPublicKey2 = new BCECPublicKey(this.algorithm, eCPublicKeyParameters, eCParameterSpec2, this.configuration);
            return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.algorithm, eCPrivateKeyParameters, bCECPublicKey2, eCParameterSpec2, this.configuration));
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i3, SecureRandom secureRandom) {
            this.strength = i3;
            this.random = secureRandom;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) ecParameters.get(Integers.valueOf(i3));
            if (eCGenParameterSpec == null) {
                throw new InvalidParameterException(StubApp.getString2(30593));
            }
            try {
                initialize(eCGenParameterSpec, secureRandom);
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException(StubApp.getString2(30592));
            }
        }

        public void initializeNamedCurve(String str, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            X9ECParameters domainParametersFromName = ECUtils.getDomainParametersFromName(str, this.configuration);
            if (domainParametersFromName == null) {
                throw new InvalidAlgorithmParameterException(a.j(StubApp.getString2(30596), str));
            }
            this.ecParams = new ECNamedCurveSpec(str, domainParametersFromName.getCurve(), domainParametersFromName.getG(), domainParametersFromName.getN(), domainParametersFromName.getH(), null);
            this.param = createKeyGenParamsJCE(domainParametersFromName, secureRandom);
        }

        public EC(String str, ProviderConfiguration providerConfiguration) {
            super(str);
            this.engine = new ECKeyPairGenerator();
            this.ecParams = null;
            this.strength = 239;
            this.random = CryptoServicesRegistrar.getSecureRandom();
            this.initialised = false;
            this.algorithm = str;
            this.configuration = providerConfiguration;
        }

        public ECKeyGenerationParameters createKeyGenParamsJCE(X9ECParameters x9ECParameters, SecureRandom secureRandom) {
            return new ECKeyGenerationParameters(new ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH()), secureRandom);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            String name;
            ECKeyGenerationParameters createKeyGenParamsJCE;
            ECParameterSpec eCParameterSpec;
            if (algorithmParameterSpec == null) {
                eCParameterSpec = this.configuration.getEcImplicitlyCa();
                if (eCParameterSpec == null) {
                    throw new InvalidAlgorithmParameterException(StubApp.getString2(30594));
                }
                this.ecParams = null;
            } else {
                if (!(algorithmParameterSpec instanceof ECParameterSpec)) {
                    if (algorithmParameterSpec instanceof java.security.spec.ECParameterSpec) {
                        this.ecParams = algorithmParameterSpec;
                        createKeyGenParamsJCE = createKeyGenParamsJCE((java.security.spec.ECParameterSpec) algorithmParameterSpec, secureRandom);
                        this.param = createKeyGenParamsJCE;
                        this.engine.init(this.param);
                        this.initialised = true;
                    }
                    if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                        name = ((ECGenParameterSpec) algorithmParameterSpec).getName();
                    } else {
                        if (!(algorithmParameterSpec instanceof ECNamedCurveGenParameterSpec)) {
                            String nameFrom = ECUtil.getNameFrom(algorithmParameterSpec);
                            if (nameFrom == null) {
                                throw new InvalidAlgorithmParameterException(StubApp.getString2(30665) + algorithmParameterSpec);
                            }
                            initializeNamedCurve(nameFrom, secureRandom);
                            this.engine.init(this.param);
                            this.initialised = true;
                        }
                        name = ((ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName();
                    }
                    initializeNamedCurve(name, secureRandom);
                    this.engine.init(this.param);
                    this.initialised = true;
                }
                this.ecParams = algorithmParameterSpec;
                eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            }
            createKeyGenParamsJCE = createKeyGenParamsBC(eCParameterSpec, secureRandom);
            this.param = createKeyGenParamsJCE;
            this.engine.init(this.param);
            this.initialised = true;
        }
    }

    public static class ECDH extends EC {
        public ECDH() {
            super(StubApp.getString2(28368), BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends EC {
        public ECDHC() {
            super(StubApp.getString2(30617), BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends EC {
        public ECDSA() {
            super(StubApp.getString2(28163), BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends EC {
        public ECMQV() {
            super(StubApp.getString2(28378), BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }
}
