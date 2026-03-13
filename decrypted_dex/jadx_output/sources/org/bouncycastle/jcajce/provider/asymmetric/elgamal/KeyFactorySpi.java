package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.stub.StubApp;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import org.bouncycastle.jce.spec.ElGamalPrivateKeySpec;
import org.bouncycastle.jce.spec.ElGamalPublicKeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof ElGamalPrivateKeySpec ? new BCElGamalPrivateKey((ElGamalPrivateKeySpec) keySpec) : keySpec instanceof DHPrivateKeySpec ? new BCElGamalPrivateKey((DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof ElGamalPublicKeySpec ? new BCElGamalPublicKey((ElGamalPublicKeySpec) keySpec) : keySpec instanceof DHPublicKeySpec ? new BCElGamalPublicKey((DHPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(DHPrivateKeySpec.class) && (key instanceof DHPrivateKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        }
        if (!cls.isAssignableFrom(DHPublicKeySpec.class) || !(key instanceof DHPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DHPublicKey) {
            return new BCElGamalPublicKey((DHPublicKey) key);
        }
        if (key instanceof DHPrivateKey) {
            return new BCElGamalPrivateKey((DHPrivateKey) key);
        }
        if (key instanceof ElGamalPublicKey) {
            return new BCElGamalPublicKey((ElGamalPublicKey) key);
        }
        if (key instanceof ElGamalPrivateKey) {
            return new BCElGamalPrivateKey((ElGamalPrivateKey) key);
        }
        throw new InvalidKeyException(StubApp.getString2(30561));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (!algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.dhKeyAgreement) && !algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.dhpublicnumber) && !algorithm.equals((ASN1Primitive) OIWObjectIdentifiers.elGamalAlgorithm)) {
            throw new IOException(a.f(StubApp.getString2(30562), algorithm, StubApp.getString2(30563)));
        }
        return new BCElGamalPrivateKey(privateKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (!algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.dhKeyAgreement) && !algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.dhpublicnumber) && !algorithm.equals((ASN1Primitive) OIWObjectIdentifiers.elGamalAlgorithm)) {
            throw new IOException(a.f(StubApp.getString2(30562), algorithm, StubApp.getString2(30563)));
        }
        return new BCElGamalPublicKey(subjectPublicKeyInfo);
    }
}
