package org.bouncycastle.jcajce.provider.asymmetric.ec;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec;
import org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    String algorithm;
    ProviderConfiguration configuration;

    public static class EC extends KeyFactorySpi {
        public EC() {
            super(StubApp.getString2(4707), BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDH extends KeyFactorySpi {
        public ECDH() {
            super(StubApp.getString2(28368), BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends KeyFactorySpi {
        public ECDHC() {
            super(StubApp.getString2(30617), BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends KeyFactorySpi {
        public ECDSA() {
            super(StubApp.getString2(28163), BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410 extends KeyFactorySpi {
        public ECGOST3410() {
            super(StubApp.getString2(28166), BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410_2012 extends KeyFactorySpi {
        public ECGOST3410_2012() {
            super(StubApp.getString2(30072), BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends KeyFactorySpi {
        public ECMQV() {
            super(StubApp.getString2(28378), BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyFactorySpi(String str, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.configuration = providerConfiguration;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof ECPrivateKeySpec) {
            return new BCECPrivateKey(this.algorithm, (ECPrivateKeySpec) keySpec, this.configuration);
        }
        if (keySpec instanceof java.security.spec.ECPrivateKeySpec) {
            return new BCECPrivateKey(this.algorithm, (java.security.spec.ECPrivateKeySpec) keySpec, this.configuration);
        }
        if (!(keySpec instanceof OpenSSHPrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(((OpenSSHPrivateKeySpec) keySpec).getEncoded());
        try {
            return new BCECPrivateKey(this.algorithm, new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, eCPrivateKey.getParametersObject()), eCPrivateKey), this.configuration);
        } catch (IOException e10) {
            throw new InvalidKeySpecException(u.q(e10, new StringBuilder(StubApp.getString2(30661))));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        try {
            if (keySpec instanceof ECPublicKeySpec) {
                return new BCECPublicKey(this.algorithm, (ECPublicKeySpec) keySpec, this.configuration);
            }
            if (keySpec instanceof java.security.spec.ECPublicKeySpec) {
                return new BCECPublicKey(this.algorithm, (java.security.spec.ECPublicKeySpec) keySpec, this.configuration);
            }
            if (!(keySpec instanceof OpenSSHPublicKeySpec)) {
                return super.engineGeneratePublic(keySpec);
            }
            AsymmetricKeyParameter parsePublicKey = OpenSSHPublicKeyUtil.parsePublicKey(((OpenSSHPublicKeySpec) keySpec).getEncoded());
            if (!(parsePublicKey instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException(StubApp.getString2("30662"));
            }
            ECDomainParameters parameters = ((ECPublicKeyParameters) parsePublicKey).getParameters();
            return engineGeneratePublic(new ECPublicKeySpec(((ECPublicKeyParameters) parsePublicKey).getQ(), new ECParameterSpec(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed())));
        } catch (Exception e10) {
            throw new InvalidKeySpecException(u.r(e10, new StringBuilder(StubApp.getString2(30584))), e10);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(java.security.spec.ECPublicKeySpec.class)) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new java.security.spec.ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            ECParameterSpec ecImplicitlyCa = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new java.security.spec.ECPublicKeySpec(eCPublicKey.getW(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getSeed()), ecImplicitlyCa));
        }
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(java.security.spec.ECPrivateKeySpec.class)) && (key instanceof java.security.interfaces.ECPrivateKey)) {
            java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new java.security.spec.ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            ECParameterSpec ecImplicitlyCa2 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new java.security.spec.ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa2.getCurve(), ecImplicitlyCa2.getSeed()), ecImplicitlyCa2));
        }
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new ECPublicKeySpec(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.convertSpec(eCPublicKey2.getParams()));
            }
            return new ECPublicKeySpec(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
        if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof java.security.interfaces.ECPrivateKey)) {
            java.security.interfaces.ECPrivateKey eCPrivateKey2 = (java.security.interfaces.ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey2.getS(), EC5Util.convertSpec(eCPrivateKey2.getParams()));
            }
            return new ECPrivateKeySpec(eCPrivateKey2.getS(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
        boolean isAssignableFrom = cls.isAssignableFrom(OpenSSHPublicKeySpec.class);
        String string2 = StubApp.getString2(30663);
        if (isAssignableFrom && (key instanceof ECPublicKey)) {
            if (!(key instanceof BCECPublicKey)) {
                throw new IllegalArgumentException(string2.concat(key.getClass().getName()));
            }
            BCECPublicKey bCECPublicKey = (BCECPublicKey) key;
            ECParameterSpec parameters = bCECPublicKey.getParameters();
            try {
                return new OpenSSHPublicKeySpec(OpenSSHPublicKeyUtil.encodePublicKey(new ECPublicKeyParameters(bCECPublicKey.getQ(), new ECDomainParameters(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed()))));
            } catch (IOException e10) {
                throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(30586))));
            }
        }
        if (!cls.isAssignableFrom(OpenSSHPrivateKeySpec.class) || !(key instanceof java.security.interfaces.ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        if (!(key instanceof BCECPrivateKey)) {
            throw new IllegalArgumentException(string2.concat(key.getClass().getName()));
        }
        try {
            return new OpenSSHPrivateKeySpec(PrivateKeyInfo.getInstance(key.getEncoded()).parsePrivateKey().toASN1Primitive().getEncoded());
        } catch (IOException e11) {
            throw new IllegalArgumentException(u.q(e11, new StringBuilder(StubApp.getString2(30664))));
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof ECPublicKey) {
            return new BCECPublicKey((ECPublicKey) key, this.configuration);
        }
        if (key instanceof java.security.interfaces.ECPrivateKey) {
            return new BCECPrivateKey((java.security.interfaces.ECPrivateKey) key, this.configuration);
        }
        throw new InvalidKeyException(StubApp.getString2(30561));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.id_ecPublicKey)) {
            return new BCECPrivateKey(this.algorithm, privateKeyInfo, this.configuration);
        }
        throw new IOException(a.f(StubApp.getString2(30562), algorithm, StubApp.getString2(30563)));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.id_ecPublicKey)) {
            return new BCECPublicKey(this.algorithm, subjectPublicKeyInfo, this.configuration);
        }
        throw new IOException(a.f(StubApp.getString2(30562), algorithm, StubApp.getString2(30563)));
    }
}
