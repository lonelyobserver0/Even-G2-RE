package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECGOST3410Parameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    String algorithm;
    Object ecParams;
    ECKeyPairGenerator engine;
    boolean initialised;
    ECKeyGenerationParameters param;
    SecureRandom random;
    int strength;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KeyPairGeneratorSpi() {
        /*
            r3 = this;
            r0 = 30072(0x7578, float:4.214E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r3.<init>(r0)
            r1 = 0
            r3.ecParams = r1
            org.bouncycastle.crypto.generators.ECKeyPairGenerator r2 = new org.bouncycastle.crypto.generators.ECKeyPairGenerator
            r2.<init>()
            r3.engine = r2
            r3.algorithm = r0
            r0 = 239(0xef, float:3.35E-43)
            r3.strength = r0
            r3.random = r1
            r0 = 0
            r3.initialised = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyPairGeneratorSpi.<init>():void");
    }

    private void init(GOST3410ParameterSpec gOST3410ParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        X9ECParameters byOIDX9 = ECGOST3410NamedCurves.getByOIDX9(gOST3410ParameterSpec.getPublicKeyParamSet());
        if (byOIDX9 == null) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(30666) + gOST3410ParameterSpec.getPublicKeyParamSet());
        }
        this.ecParams = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(gOST3410ParameterSpec.getPublicKeyParamSet()), byOIDX9.getCurve(), byOIDX9.getG(), byOIDX9.getN(), byOIDX9.getH(), byOIDX9.getSeed());
        ECKeyGenerationParameters eCKeyGenerationParameters = new ECKeyGenerationParameters(new ECGOST3410Parameters(new ECNamedDomainParameters(gOST3410ParameterSpec.getPublicKeyParamSet(), byOIDX9), gOST3410ParameterSpec.getPublicKeyParamSet(), gOST3410ParameterSpec.getDigestParamSet(), gOST3410ParameterSpec.getEncryptionParamSet()), secureRandom);
        this.param = eCKeyGenerationParameters;
        this.engine.init(eCKeyGenerationParameters);
        this.initialised = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            throw new IllegalStateException(StubApp.getString2(30667));
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) generateKeyPair.getPublic();
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) generateKeyPair.getPrivate();
        Object obj = this.ecParams;
        if (obj instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
            BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = new BCECGOST3410_2012PublicKey(this.algorithm, eCPublicKeyParameters, eCParameterSpec);
            return new KeyPair(bCECGOST3410_2012PublicKey, new BCECGOST3410_2012PrivateKey(this.algorithm, eCPrivateKeyParameters, bCECGOST3410_2012PublicKey, eCParameterSpec));
        }
        if (obj == null) {
            return new KeyPair(new BCECGOST3410_2012PublicKey(this.algorithm, eCPublicKeyParameters), new BCECGOST3410_2012PrivateKey(this.algorithm, eCPrivateKeyParameters));
        }
        java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) obj;
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey2 = new BCECGOST3410_2012PublicKey(this.algorithm, eCPublicKeyParameters, eCParameterSpec2);
        return new KeyPair(bCECGOST3410_2012PublicKey2, new BCECGOST3410_2012PrivateKey(this.algorithm, eCPrivateKeyParameters, bCECGOST3410_2012PublicKey2, eCParameterSpec2));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i3, SecureRandom secureRandom) {
        this.strength = i3;
        this.random = secureRandom;
        Object obj = this.ecParams;
        if (obj == null) {
            throw new InvalidParameterException(StubApp.getString2(30593));
        }
        try {
            initialize((ECGenParameterSpec) obj, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException(StubApp.getString2(30592));
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof GOST3410ParameterSpec) {
            init((GOST3410ParameterSpec) algorithmParameterSpec, secureRandom);
            return;
        }
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            this.ecParams = algorithmParameterSpec;
            ECKeyGenerationParameters eCKeyGenerationParameters = new ECKeyGenerationParameters(new ECDomainParameters(eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH()), secureRandom);
            this.param = eCKeyGenerationParameters;
            this.engine.init(eCKeyGenerationParameters);
            this.initialised = true;
            return;
        }
        if (algorithmParameterSpec instanceof java.security.spec.ECParameterSpec) {
            java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
            this.ecParams = algorithmParameterSpec;
            ECCurve convertCurve = EC5Util.convertCurve(eCParameterSpec2.getCurve());
            ECKeyGenerationParameters eCKeyGenerationParameters2 = new ECKeyGenerationParameters(new ECDomainParameters(convertCurve, EC5Util.convertPoint(convertCurve, eCParameterSpec2.getGenerator()), eCParameterSpec2.getOrder(), BigInteger.valueOf(eCParameterSpec2.getCofactor())), secureRandom);
            this.param = eCKeyGenerationParameters2;
            this.engine.init(eCKeyGenerationParameters2);
            this.initialised = true;
            return;
        }
        boolean z2 = algorithmParameterSpec instanceof ECGenParameterSpec;
        if (z2 || (algorithmParameterSpec instanceof ECNamedCurveGenParameterSpec)) {
            init(new GOST3410ParameterSpec(z2 ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName()), secureRandom);
            return;
        }
        if (algorithmParameterSpec == null) {
            ProviderConfiguration providerConfiguration = BouncyCastleProvider.CONFIGURATION;
            if (providerConfiguration.getEcImplicitlyCa() != null) {
                ECParameterSpec ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
                this.ecParams = algorithmParameterSpec;
                ECKeyGenerationParameters eCKeyGenerationParameters3 = new ECKeyGenerationParameters(new ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH()), secureRandom);
                this.param = eCKeyGenerationParameters3;
                this.engine.init(eCKeyGenerationParameters3);
                this.initialised = true;
                return;
            }
        }
        if (algorithmParameterSpec == null && BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() == null) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(30594));
        }
        throw new InvalidAlgorithmParameterException(StubApp.getString2(30595).concat(algorithmParameterSpec.getClass().getName()));
    }
}
