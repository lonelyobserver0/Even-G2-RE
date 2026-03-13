package org.bouncycastle.pqc.jcajce.provider.mceliece;

import Xa.h;
import com.mapbox.common.b;
import com.stub.StubApp;
import i2.u;
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
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.asn1.McEliecePrivateKey;
import org.bouncycastle.pqc.asn1.McEliecePublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McEliecePrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McEliecePublicKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    public static final String OID = StubApp.getString2(34685);

    private static Digest getDigest(AlgorithmIdentifier algorithmIdentifier) {
        return new SHA256Digest();
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(a.j(keySpec, new StringBuilder(StubApp.getString2(34632)), StubApp.getString2(1)));
        }
        try {
            PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!PQCObjectIdentifiers.mcEliece.equals((ASN1Primitive) privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())) {
                    throw new InvalidKeySpecException(StubApp.getString2("34677"));
                }
                McEliecePrivateKey mcEliecePrivateKey = McEliecePrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
                return new BCMcEliecePrivateKey(new McEliecePrivateKeyParameters(mcEliecePrivateKey.getN(), mcEliecePrivateKey.getK(), mcEliecePrivateKey.getField(), mcEliecePrivateKey.getGoppaPoly(), mcEliecePrivateKey.getP1(), mcEliecePrivateKey.getP2(), mcEliecePrivateKey.getSInv()));
            } catch (IOException unused) {
                throw new InvalidKeySpecException(StubApp.getString2(34675));
            }
        } catch (IOException e10) {
            throw new InvalidKeySpecException(b.h(StubApp.getString2(34676), e10));
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(a.j(keySpec, new StringBuilder(StubApp.getString2(34632)), StubApp.getString2(1)));
        }
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(((X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!PQCObjectIdentifiers.mcEliece.equals((ASN1Primitive) subjectPublicKeyInfo.getAlgorithm().getAlgorithm())) {
                    throw new InvalidKeySpecException(StubApp.getString2("34674"));
                }
                McEliecePublicKey mcEliecePublicKey = McEliecePublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
                return new BCMcEliecePublicKey(new McEliecePublicKeyParameters(mcEliecePublicKey.getN(), mcEliecePublicKey.getT(), mcEliecePublicKey.getG()));
            } catch (IOException e10) {
                throw new InvalidKeySpecException(u.q(e10, new StringBuilder(StubApp.getString2(34678))));
            }
        } catch (IOException e11) {
            throw new InvalidKeySpecException(e11.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        McEliecePrivateKey mcEliecePrivateKey = McEliecePrivateKey.getInstance(privateKeyInfo.parsePrivateKey().toASN1Primitive());
        return new BCMcEliecePrivateKey(new McEliecePrivateKeyParameters(mcEliecePrivateKey.getN(), mcEliecePrivateKey.getK(), mcEliecePrivateKey.getField(), mcEliecePrivateKey.getGoppaPoly(), mcEliecePrivateKey.getP1(), mcEliecePrivateKey.getP2(), mcEliecePrivateKey.getSInv()));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        McEliecePublicKey mcEliecePublicKey = McEliecePublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
        return new BCMcEliecePublicKey(new McEliecePublicKeyParameters(mcEliecePublicKey.getN(), mcEliecePublicKey.getT(), mcEliecePublicKey.getG()));
    }

    public KeySpec getKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        boolean z2 = key instanceof BCMcEliecePrivateKey;
        String string2 = StubApp.getString2(1);
        if (z2) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCMcEliecePublicKey)) {
                throw new InvalidKeySpecException(a.i(key, new StringBuilder(StubApp.getString2(34634)), string2));
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException(h.p(StubApp.getString2(34633), cls, string2));
    }

    public Key translateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCMcEliecePrivateKey) || (key instanceof BCMcEliecePublicKey)) {
            return key;
        }
        throw new InvalidKeyException(StubApp.getString2(34679));
    }
}
