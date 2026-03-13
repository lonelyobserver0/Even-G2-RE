package org.bouncycastle.jcajce.provider.asymmetric.x509;

import com.stub.StubApp;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyFactory extends KeyFactorySpi {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        String string2 = StubApp.getString2(30870);
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(StubApp.getString2(30871).concat(keySpec.getClass().getName()));
        }
        try {
            PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(privateKeyInfo);
            if (privateKey != null) {
                return privateKey;
            }
            throw new InvalidKeySpecException(string2 + privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
        } catch (Exception e10) {
            throw new InvalidKeySpecException(e10.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        String string2 = StubApp.getString2(30870);
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(StubApp.getString2(30871).concat(keySpec.getClass().getName()));
        }
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(((X509EncodedKeySpec) keySpec).getEncoded());
            PublicKey publicKey = BouncyCastleProvider.getPublicKey(subjectPublicKeyInfo);
            if (publicKey != null) {
                return publicKey;
            }
            throw new InvalidKeySpecException(string2 + subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        } catch (Exception e10) {
            throw new InvalidKeySpecException(e10.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals(StubApp.getString2(29640))) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals(StubApp.getString2(19963))) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException(StubApp.getString2(30849) + key + StubApp.getString2(397) + cls);
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException(StubApp.getString2(30849) + key);
    }
}
