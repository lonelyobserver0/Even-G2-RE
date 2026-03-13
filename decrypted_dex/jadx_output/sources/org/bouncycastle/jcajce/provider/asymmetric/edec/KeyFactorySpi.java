package org.bouncycastle.jcajce.provider.asymmetric.edec;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.interfaces.EdDSAPublicKey;
import org.bouncycastle.jcajce.interfaces.XDHPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec;
import org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec;
import org.bouncycastle.jcajce.spec.RawEncodedKeySpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    private static final byte Ed25519_type = 112;
    private static final byte Ed448_type = 113;
    private static final byte x25519_type = 110;
    private static final byte x448_type = 111;
    String algorithm;
    private final boolean isXdh;
    private final int specificBase;
    static final byte[] x448Prefix = Hex.decode(StubApp.getString2(30704));
    static final byte[] x25519Prefix = Hex.decode(StubApp.getString2(30705));
    static final byte[] Ed448Prefix = Hex.decode(StubApp.getString2(30706));
    static final byte[] Ed25519Prefix = Hex.decode(StubApp.getString2(30707));

    public static class Ed25519 extends KeyFactorySpi {
        public Ed25519() {
            super(StubApp.getString2(28196), false, 112);
        }
    }

    public static class Ed448 extends KeyFactorySpi {
        public Ed448() {
            super(StubApp.getString2(28197), false, 113);
        }
    }

    public static class EdDSA extends KeyFactorySpi {
        public EdDSA() {
            super(StubApp.getString2(30703), false, 0);
        }
    }

    public static class X25519 extends KeyFactorySpi {
        public X25519() {
            super(StubApp.getString2(28389), true, 110);
        }
    }

    public static class X448 extends KeyFactorySpi {
        public X448() {
            super(StubApp.getString2(28390), true, 111);
        }
    }

    public static class XDH extends KeyFactorySpi {
        public XDH() {
            super(StubApp.getString2(30186), true, 0);
        }
    }

    public KeyFactorySpi(String str, boolean z2, int i3) {
        this.algorithm = str;
        this.isXdh = z2;
        this.specificBase = i3;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof OpenSSHPrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        AsymmetricKeyParameter parsePrivateKeyBlob = OpenSSHPrivateKeyUtil.parsePrivateKeyBlob(((OpenSSHPrivateKeySpec) keySpec).getEncoded());
        if (parsePrivateKeyBlob instanceof Ed25519PrivateKeyParameters) {
            return new BCEdDSAPrivateKey((Ed25519PrivateKeyParameters) parsePrivateKeyBlob);
        }
        throw new IllegalStateException(StubApp.getString2(30708));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
            int i3 = this.specificBase;
            if (i3 == 0 || i3 == encoded[8]) {
                if (encoded[9] == 5 && encoded[10] == 0) {
                    SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(encoded);
                    try {
                        encoded = new SubjectPublicKeyInfo(new AlgorithmIdentifier(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), subjectPublicKeyInfo.getPublicKeyData().getBytes()).getEncoded(StubApp.getString2("26791"));
                    } catch (IOException e10) {
                        throw new InvalidKeySpecException(u.q(e10, new StringBuilder(StubApp.getString2(30709))));
                    }
                }
                switch (encoded[8]) {
                    case 110:
                        return new BCXDHPublicKey(x25519Prefix, encoded);
                    case 111:
                        return new BCXDHPublicKey(x448Prefix, encoded);
                    case 112:
                        return new BCEdDSAPublicKey(Ed25519Prefix, encoded);
                    case 113:
                        return new BCEdDSAPublicKey(Ed448Prefix, encoded);
                    default:
                        return super.engineGeneratePublic(keySpec);
                }
            }
        } else {
            if (keySpec instanceof RawEncodedKeySpec) {
                byte[] encoded2 = ((RawEncodedKeySpec) keySpec).getEncoded();
                switch (this.specificBase) {
                    case 110:
                        return new BCXDHPublicKey(new X25519PublicKeyParameters(encoded2));
                    case 111:
                        return new BCXDHPublicKey(new X448PublicKeyParameters(encoded2));
                    case 112:
                        return new BCEdDSAPublicKey(new Ed25519PublicKeyParameters(encoded2));
                    case 113:
                        return new BCEdDSAPublicKey(new Ed448PublicKeyParameters(encoded2));
                    default:
                        throw new InvalidKeySpecException(StubApp.getString2(30710));
                }
            }
            if (keySpec instanceof OpenSSHPublicKeySpec) {
                AsymmetricKeyParameter parsePublicKey = OpenSSHPublicKeyUtil.parsePublicKey(((OpenSSHPublicKeySpec) keySpec).getEncoded());
                if (parsePublicKey instanceof Ed25519PublicKeyParameters) {
                    return new BCEdDSAPublicKey(new byte[0], ((Ed25519PublicKeyParameters) parsePublicKey).getEncoded());
                }
                throw new IllegalStateException(StubApp.getString2(30711));
            }
        }
        return super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(OpenSSHPrivateKeySpec.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new OpenSSHPrivateKeySpec(OpenSSHPrivateKeyUtil.encodePrivateKey(new Ed25519PrivateKeyParameters(ASN1OctetString.getInstance(ASN1Primitive.fromByteArray(ASN1OctetString.getInstance(ASN1Sequence.getInstance(key.getEncoded()).getObjectAt(2)).getOctets())).getOctets())));
            } catch (IOException e10) {
                throw new InvalidKeySpecException(e10.getMessage(), e10.getCause());
            }
        }
        if (!cls.isAssignableFrom(OpenSSHPublicKeySpec.class) || !(key instanceof BCEdDSAPublicKey)) {
            if (cls.isAssignableFrom(RawEncodedKeySpec.class)) {
                if (key instanceof XDHPublicKey) {
                    return new RawEncodedKeySpec(((XDHPublicKey) key).getUEncoding());
                }
                if (key instanceof EdDSAPublicKey) {
                    return new RawEncodedKeySpec(((EdDSAPublicKey) key).getPointEncoding());
                }
            }
            return super.engineGetKeySpec(key, cls);
        }
        try {
            byte[] encoded = key.getEncoded();
            byte[] bArr = Ed25519Prefix;
            if (Arrays.areEqual(bArr, 0, bArr.length, encoded, 0, encoded.length - 32)) {
                return new OpenSSHPublicKeySpec(OpenSSHPublicKeyUtil.encodePublicKey(new Ed25519PublicKeyParameters(encoded, bArr.length)));
            }
            throw new InvalidKeySpecException(StubApp.getString2("30712"));
        } catch (IOException e11) {
            throw new InvalidKeySpecException(e11.getMessage(), e11.getCause());
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException(StubApp.getString2(30561));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (this.isXdh) {
            int i3 = this.specificBase;
            if ((i3 == 0 || i3 == 111) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_X448)) {
                return new BCXDHPrivateKey(privateKeyInfo);
            }
            int i10 = this.specificBase;
            if ((i10 == 0 || i10 == 110) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_X25519)) {
                return new BCXDHPrivateKey(privateKeyInfo);
            }
        } else {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = EdECObjectIdentifiers.id_Ed448;
            if (algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier) || algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed25519)) {
                int i11 = this.specificBase;
                if ((i11 == 0 || i11 == 113) && algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                    return new BCEdDSAPrivateKey(privateKeyInfo);
                }
                int i12 = this.specificBase;
                if ((i12 == 0 || i12 == 112) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed25519)) {
                    return new BCEdDSAPrivateKey(privateKeyInfo);
                }
            }
        }
        throw new IOException(a.f(StubApp.getString2(30562), algorithm, StubApp.getString2(30713)));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (this.isXdh) {
            int i3 = this.specificBase;
            if ((i3 == 0 || i3 == 111) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_X448)) {
                return new BCXDHPublicKey(subjectPublicKeyInfo);
            }
            int i10 = this.specificBase;
            if ((i10 == 0 || i10 == 110) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_X25519)) {
                return new BCXDHPublicKey(subjectPublicKeyInfo);
            }
        } else {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = EdECObjectIdentifiers.id_Ed448;
            if (algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier) || algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed25519)) {
                int i11 = this.specificBase;
                if ((i11 == 0 || i11 == 113) && algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                    return new BCEdDSAPublicKey(subjectPublicKeyInfo);
                }
                int i12 = this.specificBase;
                if ((i12 == 0 || i12 == 112) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed25519)) {
                    return new BCEdDSAPublicKey(subjectPublicKeyInfo);
                }
            }
        }
        throw new IOException(a.f(StubApp.getString2(30562), algorithm, StubApp.getString2(30713)));
    }
}
