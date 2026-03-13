package org.bouncycastle.pqc.jcajce.provider.dilithium;

import Xa.h;
import com.stub.StubApp;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DilithiumKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(a.j(keySpec, new StringBuilder(StubApp.getString2(34632)), StubApp.getString2(1)));
        }
        try {
            return generatePrivate(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
        } catch (Exception e10) {
            throw new InvalidKeySpecException(e10.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(a.d(StubApp.getString2(34633), keySpec, StubApp.getString2(1)));
        }
        try {
            return generatePublic(SubjectPublicKeyInfo.getInstance(((X509EncodedKeySpec) keySpec).getEncoded()));
        } catch (Exception e10) {
            throw new InvalidKeySpecException(e10.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        boolean z2 = key instanceof BCDilithiumPrivateKey;
        String string2 = StubApp.getString2(1);
        if (z2) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCDilithiumPublicKey)) {
                throw new InvalidKeySpecException(a.i(key, new StringBuilder(StubApp.getString2(34634)), string2));
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException(h.p(StubApp.getString2(34633), cls, string2));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCDilithiumPrivateKey) || (key instanceof BCDilithiumPublicKey)) {
            return key;
        }
        throw new InvalidKeyException(StubApp.getString2(34635));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        return new BCDilithiumPrivateKey(privateKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        return new BCDilithiumPublicKey(subjectPublicKeyInfo);
    }
}
