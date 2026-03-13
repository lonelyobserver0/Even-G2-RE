package org.bouncycastle.openssl;

import com.stub.StubApp;
import java.io.IOException;
import java.io.Reader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.pem.PemHeader;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemObjectParser;
import org.bouncycastle.util.io.pem.PemReader;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PEMParser extends PemReader {
    public static final String TYPE_ATTRIBUTE_CERTIFICATE = StubApp.getString2(32854);
    public static final String TYPE_CERTIFICATE = StubApp.getString2(30865);
    public static final String TYPE_CERTIFICATE_REQUEST = StubApp.getString2(33623);
    public static final String TYPE_CMS = StubApp.getString2(33648);
    public static final String TYPE_DSA_PRIVATE_KEY = StubApp.getString2(33621);
    public static final String TYPE_EC_PARAMETERS = StubApp.getString2(33649);
    public static final String TYPE_EC_PRIVATE_KEY = StubApp.getString2(33619);
    public static final String TYPE_ENCRYPTED_PRIVATE_KEY = StubApp.getString2(33624);
    public static final String TYPE_NEW_CERTIFICATE_REQUEST = StubApp.getString2(33646);
    public static final String TYPE_PKCS7 = StubApp.getString2(29174);
    public static final String TYPE_PRIVATE_KEY = StubApp.getString2(33620);
    public static final String TYPE_PUBLIC_KEY = StubApp.getString2(33622);
    public static final String TYPE_RSA_PRIVATE_KEY = StubApp.getString2(33618);
    public static final String TYPE_RSA_PUBLIC_KEY = StubApp.getString2(33650);
    public static final String TYPE_TRUSTED_CERTIFICATE = StubApp.getString2(33617);
    public static final String TYPE_X509_CERTIFICATE = StubApp.getString2(33647);
    public static final String TYPE_X509_CRL = StubApp.getString2(33616);
    protected final Map parsers;

    /* renamed from: org.bouncycastle.openssl.PEMParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class DSAKeyPairParser implements PEMKeyPairParser {
        private DSAKeyPairParser() {
        }

        @Override // org.bouncycastle.openssl.PEMKeyPairParser
        public PEMKeyPair parse(byte[] bArr) throws IOException {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
                if (aSN1Sequence.size() != 6) {
                    throw new PEMException(StubApp.getString2("33633"));
                }
                ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
                ASN1Integer aSN1Integer2 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2));
                ASN1Integer aSN1Integer3 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(3));
                ASN1Integer aSN1Integer4 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(4));
                ASN1Integer aSN1Integer5 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(5));
                ASN1ObjectIdentifier aSN1ObjectIdentifier = X9ObjectIdentifiers.id_dsa;
                return new PEMKeyPair(new SubjectPublicKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, new DSAParameter(aSN1Integer.getValue(), aSN1Integer2.getValue(), aSN1Integer3.getValue())), aSN1Integer4), new PrivateKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, new DSAParameter(aSN1Integer.getValue(), aSN1Integer2.getValue(), aSN1Integer3.getValue())), aSN1Integer5));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new PEMException(a.b(e11, new StringBuilder(StubApp.getString2(33634))), e11);
            }
        }

        public /* synthetic */ DSAKeyPairParser(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class ECCurveParamsParser implements PemObjectParser {
        private ECCurveParamsParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            try {
                ASN1Primitive fromByteArray = ASN1Primitive.fromByteArray(pemObject.getContent());
                if (fromByteArray instanceof ASN1ObjectIdentifier) {
                    return ASN1Primitive.fromByteArray(pemObject.getContent());
                }
                if (fromByteArray instanceof ASN1Sequence) {
                    return X9ECParameters.getInstance(fromByteArray);
                }
                return null;
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new PEMException(a.b(e11, new StringBuilder(StubApp.getString2(33635))));
            }
        }

        public /* synthetic */ ECCurveParamsParser(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class ECDSAKeyPairParser implements PEMKeyPairParser {
        private ECDSAKeyPairParser() {
        }

        @Override // org.bouncycastle.openssl.PEMKeyPairParser
        public PEMKeyPair parse(byte[] bArr) throws IOException {
            try {
                ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(ASN1Sequence.getInstance(bArr));
                AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, eCPrivateKey.getParametersObject());
                PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo(algorithmIdentifier, eCPrivateKey);
                return eCPrivateKey.getPublicKey() != null ? new PEMKeyPair(new SubjectPublicKeyInfo(algorithmIdentifier, eCPrivateKey.getPublicKey().getBytes()), privateKeyInfo) : new PEMKeyPair(null, privateKeyInfo);
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new PEMException(a.b(e11, new StringBuilder(StubApp.getString2(33636))), e11);
            }
        }

        public /* synthetic */ ECDSAKeyPairParser(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class EncryptedPrivateKeyParser implements PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            try {
                return new PKCS8EncryptedPrivateKeyInfo(EncryptedPrivateKeyInfo.getInstance(pemObject.getContent()));
            } catch (Exception e10) {
                throw new PEMException(a.b(e10, new StringBuilder(StubApp.getString2(33637))), e10);
            }
        }
    }

    public static class KeyPairParser implements PemObjectParser {
        private final PEMKeyPairParser pemKeyPairParser;

        public KeyPairParser(PEMKeyPairParser pEMKeyPairParser) {
            this.pemKeyPairParser = pEMKeyPairParser;
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            boolean z2 = false;
            String str = null;
            for (PemHeader pemHeader : pemObject.getHeaders()) {
                if (pemHeader.getName().equals(StubApp.getString2(33626)) && pemHeader.getValue().equals(StubApp.getString2(33627))) {
                    z2 = true;
                } else if (pemHeader.getName().equals(StubApp.getString2(33628))) {
                    str = pemHeader.getValue();
                }
            }
            byte[] content = pemObject.getContent();
            String string2 = StubApp.getString2(33638);
            try {
                if (!z2) {
                    return this.pemKeyPairParser.parse(content);
                }
                StringTokenizer stringTokenizer = new StringTokenizer(str, StubApp.getString2("321"));
                return new PEMEncryptedKeyPair(stringTokenizer.nextToken(), Hex.decode(stringTokenizer.nextToken()), content, this.pemKeyPairParser);
            } catch (IOException e10) {
                if (z2) {
                    throw new PEMException(string2, e10);
                }
                throw new PEMException(e10.getMessage(), e10);
            } catch (IllegalArgumentException e11) {
                if (z2) {
                    throw new PEMException(string2, e11);
                }
                throw new PEMException(e11.getMessage(), e11);
            }
        }
    }

    public static class PKCS10CertificationRequestParser implements PemObjectParser {
        private PKCS10CertificationRequestParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            try {
                return new PKCS10CertificationRequest(pemObject.getContent());
            } catch (Exception e10) {
                throw new PEMException(a.b(e10, new StringBuilder(StubApp.getString2(33639))), e10);
            }
        }

        public /* synthetic */ PKCS10CertificationRequestParser(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class PKCS7Parser implements PemObjectParser {
        private PKCS7Parser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            try {
                return ContentInfo.getInstance(new ASN1InputStream(pemObject.getContent()).readObject());
            } catch (Exception e10) {
                throw new PEMException(a.b(e10, new StringBuilder(StubApp.getString2(33640))), e10);
            }
        }

        public /* synthetic */ PKCS7Parser(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class PrivateKeyParser implements PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            try {
                return PrivateKeyInfo.getInstance(pemObject.getContent());
            } catch (Exception e10) {
                throw new PEMException(a.b(e10, new StringBuilder(StubApp.getString2(33641))), e10);
            }
        }
    }

    public static class PublicKeyParser implements PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            return SubjectPublicKeyInfo.getInstance(pemObject.getContent());
        }
    }

    public static class RSAKeyPairParser implements PEMKeyPairParser {
        private RSAKeyPairParser() {
        }

        @Override // org.bouncycastle.openssl.PEMKeyPairParser
        public PEMKeyPair parse(byte[] bArr) throws IOException {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
                if (aSN1Sequence.size() != 9) {
                    throw new PEMException(StubApp.getString2("33642"));
                }
                RSAPrivateKey rSAPrivateKey = RSAPrivateKey.getInstance(aSN1Sequence);
                RSAPublicKey rSAPublicKey = new RSAPublicKey(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent());
                AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE);
                return new PEMKeyPair(new SubjectPublicKeyInfo(algorithmIdentifier, rSAPublicKey), new PrivateKeyInfo(algorithmIdentifier, rSAPrivateKey));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new PEMException(a.b(e11, new StringBuilder(StubApp.getString2(33643))), e11);
            }
        }

        public /* synthetic */ RSAKeyPairParser(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class RSAPublicKeyParser implements PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            try {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), RSAPublicKey.getInstance(pemObject.getContent()));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new PEMException(a.b(e11, new StringBuilder(StubApp.getString2(33644))), e11);
            }
        }
    }

    public static class X509AttributeCertificateParser implements PemObjectParser {
        private X509AttributeCertificateParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            return new X509AttributeCertificateHolder(pemObject.getContent());
        }

        public /* synthetic */ X509AttributeCertificateParser(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class X509CRLParser implements PemObjectParser {
        private X509CRLParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            try {
                return new X509CRLHolder(pemObject.getContent());
            } catch (Exception e10) {
                throw new PEMException(a.b(e10, new StringBuilder(StubApp.getString2(33645))), e10);
            }
        }

        public /* synthetic */ X509CRLParser(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class X509CertificateParser implements PemObjectParser {
        private X509CertificateParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            try {
                return new X509CertificateHolder(pemObject.getContent());
            } catch (Exception e10) {
                throw new PEMException(a.b(e10, new StringBuilder(StubApp.getString2(33645))), e10);
            }
        }

        public /* synthetic */ X509CertificateParser(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class X509TrustedCertificateParser implements PemObjectParser {
        private X509TrustedCertificateParser() {
        }

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            try {
                return new X509TrustedCertificateBlock(pemObject.getContent());
            } catch (Exception e10) {
                throw new PEMException(a.b(e10, new StringBuilder(StubApp.getString2(33645))), e10);
            }
        }

        public /* synthetic */ X509TrustedCertificateParser(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public PEMParser(Reader reader) {
        super(reader);
        HashMap hashMap = new HashMap();
        this.parsers = hashMap;
        AnonymousClass1 anonymousClass1 = null;
        hashMap.put(StubApp.getString2(33623), new PKCS10CertificationRequestParser(anonymousClass1));
        hashMap.put(StubApp.getString2(33646), new PKCS10CertificationRequestParser(anonymousClass1));
        hashMap.put(StubApp.getString2(30865), new X509CertificateParser(anonymousClass1));
        hashMap.put(StubApp.getString2(33617), new X509TrustedCertificateParser(anonymousClass1));
        hashMap.put(StubApp.getString2(33647), new X509CertificateParser(anonymousClass1));
        hashMap.put(StubApp.getString2(33616), new X509CRLParser(anonymousClass1));
        hashMap.put(StubApp.getString2(29174), new PKCS7Parser(anonymousClass1));
        hashMap.put(StubApp.getString2(33648), new PKCS7Parser(anonymousClass1));
        hashMap.put(StubApp.getString2(32854), new X509AttributeCertificateParser(anonymousClass1));
        hashMap.put(StubApp.getString2(33649), new ECCurveParamsParser(anonymousClass1));
        hashMap.put(StubApp.getString2(33622), new PublicKeyParser());
        hashMap.put(StubApp.getString2(33650), new RSAPublicKeyParser());
        hashMap.put(StubApp.getString2(33618), new KeyPairParser(new RSAKeyPairParser(anonymousClass1)));
        hashMap.put(StubApp.getString2(33621), new KeyPairParser(new DSAKeyPairParser(anonymousClass1)));
        hashMap.put(StubApp.getString2(33619), new KeyPairParser(new ECDSAKeyPairParser(anonymousClass1)));
        hashMap.put(StubApp.getString2(33624), new EncryptedPrivateKeyParser());
        hashMap.put(StubApp.getString2(33620), new PrivateKeyParser());
    }

    public Set<String> getSupportedTypes() {
        return Collections.unmodifiableSet(this.parsers.keySet());
    }

    public Object readObject() throws IOException {
        PemObject readPemObject = readPemObject();
        if (readPemObject == null) {
            return null;
        }
        String type = readPemObject.getType();
        Object obj = this.parsers.get(type);
        if (obj != null) {
            return ((PemObjectParser) obj).parseObject(readPemObject);
        }
        throw new IOException(E1.a.j(StubApp.getString2(33651), type));
    }
}
