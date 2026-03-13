package org.bouncycastle.jcajce.provider.asymmetric.dstu;

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
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ua.DSTU4145NamedCurves;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.DSTU4145Parameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.spec.DSTU4145ParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    String algorithm;
    Object ecParams;
    ECKeyPairGenerator engine;
    boolean initialised;
    ECKeyGenerationParameters param;
    SecureRandom random;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KeyPairGeneratorSpi() {
        /*
            r3 = this;
            r0 = 29292(0x726c, float:4.1047E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r3.<init>(r0)
            r1 = 0
            r3.ecParams = r1
            org.bouncycastle.crypto.generators.DSTU4145KeyPairGenerator r2 = new org.bouncycastle.crypto.generators.DSTU4145KeyPairGenerator
            r2.<init>()
            r3.engine = r2
            r3.algorithm = r0
            r3.random = r1
            r0 = 0
            r3.initialised = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyPairGeneratorSpi.<init>():void");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            throw new IllegalStateException(StubApp.getString2(30591));
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) generateKeyPair.getPublic();
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) generateKeyPair.getPrivate();
        Object obj = this.ecParams;
        if (obj instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
            BCDSTU4145PublicKey bCDSTU4145PublicKey = new BCDSTU4145PublicKey(this.algorithm, eCPublicKeyParameters, eCParameterSpec);
            return new KeyPair(bCDSTU4145PublicKey, new BCDSTU4145PrivateKey(this.algorithm, eCPrivateKeyParameters, bCDSTU4145PublicKey, eCParameterSpec));
        }
        if (obj == null) {
            return new KeyPair(new BCDSTU4145PublicKey(this.algorithm, eCPublicKeyParameters), new BCDSTU4145PrivateKey(this.algorithm, eCPrivateKeyParameters));
        }
        java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) obj;
        BCDSTU4145PublicKey bCDSTU4145PublicKey2 = new BCDSTU4145PublicKey(this.algorithm, eCPublicKeyParameters, eCParameterSpec2);
        return new KeyPair(bCDSTU4145PublicKey2, new BCDSTU4145PrivateKey(this.algorithm, eCPrivateKeyParameters, bCDSTU4145PublicKey2, eCParameterSpec2));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i3, SecureRandom secureRandom) {
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
        ECKeyGenerationParameters eCKeyGenerationParameters;
        if (!(algorithmParameterSpec instanceof ECParameterSpec)) {
            if (algorithmParameterSpec instanceof java.security.spec.ECParameterSpec) {
                java.security.spec.ECParameterSpec eCParameterSpec = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
                this.ecParams = algorithmParameterSpec;
                ECCurve convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                ECPoint convertPoint = EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator());
                if (eCParameterSpec instanceof DSTU4145ParameterSpec) {
                    this.param = new ECKeyGenerationParameters(new DSTU4145Parameters(new ECDomainParameters(convertCurve, convertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), ((DSTU4145ParameterSpec) eCParameterSpec).getDKE()), secureRandom);
                } else {
                    this.param = new ECKeyGenerationParameters(new ECDomainParameters(convertCurve, convertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
                }
                this.engine.init(this.param);
            } else {
                boolean z2 = algorithmParameterSpec instanceof ECGenParameterSpec;
                if (!z2 && !(algorithmParameterSpec instanceof ECNamedCurveGenParameterSpec)) {
                    if (algorithmParameterSpec == null) {
                        ProviderConfiguration providerConfiguration = BouncyCastleProvider.CONFIGURATION;
                        if (providerConfiguration.getEcImplicitlyCa() != null) {
                            ECParameterSpec ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
                            this.ecParams = algorithmParameterSpec;
                            eCKeyGenerationParameters = new ECKeyGenerationParameters(new ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH()), secureRandom);
                        }
                    }
                    if (algorithmParameterSpec == null && BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() == null) {
                        throw new InvalidAlgorithmParameterException(StubApp.getString2(30594));
                    }
                    throw new InvalidAlgorithmParameterException(StubApp.getString2(30595).concat(algorithmParameterSpec.getClass().getName()));
                }
                String name = z2 ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName();
                ECDomainParameters byOID = DSTU4145NamedCurves.getByOID(new ASN1ObjectIdentifier(name));
                if (byOID == null) {
                    throw new InvalidAlgorithmParameterException(a.j(StubApp.getString2(30596), name));
                }
                ECNamedCurveSpec eCNamedCurveSpec = new ECNamedCurveSpec(name, byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
                this.ecParams = eCNamedCurveSpec;
                ECNamedCurveSpec eCNamedCurveSpec2 = eCNamedCurveSpec;
                ECCurve convertCurve2 = EC5Util.convertCurve(eCNamedCurveSpec2.getCurve());
                ECKeyGenerationParameters eCKeyGenerationParameters2 = new ECKeyGenerationParameters(new ECDomainParameters(convertCurve2, EC5Util.convertPoint(convertCurve2, eCNamedCurveSpec2.getGenerator()), eCNamedCurveSpec2.getOrder(), BigInteger.valueOf(eCNamedCurveSpec2.getCofactor())), secureRandom);
                this.param = eCKeyGenerationParameters2;
                this.engine.init(eCKeyGenerationParameters2);
            }
            this.initialised = true;
        }
        ECParameterSpec eCParameterSpec2 = (ECParameterSpec) algorithmParameterSpec;
        this.ecParams = algorithmParameterSpec;
        eCKeyGenerationParameters = new ECKeyGenerationParameters(new ECDomainParameters(eCParameterSpec2.getCurve(), eCParameterSpec2.getG(), eCParameterSpec2.getN(), eCParameterSpec2.getH()), secureRandom);
        this.param = eCKeyGenerationParameters;
        this.engine.init(eCKeyGenerationParameters);
        this.initialised = true;
    }
}
