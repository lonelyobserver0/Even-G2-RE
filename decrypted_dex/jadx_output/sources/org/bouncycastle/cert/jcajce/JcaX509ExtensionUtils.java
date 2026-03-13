package org.bouncycastle.cert.jcajce;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509ExtensionUtils;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaX509ExtensionUtils extends X509ExtensionUtils {

    public static class SHA1DigestCalculator implements DigestCalculator {
        private ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        private MessageDigest digest;

        public SHA1DigestCalculator(MessageDigest messageDigest) {
            this.digest = messageDigest;
        }

        @Override // org.bouncycastle.operator.DigestCalculator
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1);
        }

        @Override // org.bouncycastle.operator.DigestCalculator
        public byte[] getDigest() {
            byte[] digest = this.digest.digest(this.bOut.toByteArray());
            this.bOut.reset();
            return digest;
        }

        @Override // org.bouncycastle.operator.DigestCalculator
        public OutputStream getOutputStream() {
            return this.bOut;
        }
    }

    public JcaX509ExtensionUtils() throws NoSuchAlgorithmException {
        super(new SHA1DigestCalculator(MessageDigest.getInstance(StubApp.getString2(21748))));
    }

    private static Collection getAlternativeNames(byte[] bArr) throws CertificateParsingException {
        Object encoded;
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration objects = ASN1Sequence.getInstance(parseExtensionValue(bArr)).getObjects();
            while (objects.hasMoreElements()) {
                GeneralName generalName = GeneralName.getInstance(objects.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integers.valueOf(generalName.getTagNo()));
                switch (generalName.getTagNo()) {
                    case 0:
                    case 3:
                    case 5:
                        encoded = generalName.getEncoded();
                        arrayList2.add(encoded);
                        arrayList.add(arrayList2);
                    case 1:
                    case 2:
                    case 6:
                        encoded = ((ASN1String) generalName.getName()).getString();
                        arrayList2.add(encoded);
                        arrayList.add(arrayList2);
                    case 4:
                        encoded = X500Name.getInstance(RFC4519Style.INSTANCE, generalName.getName()).toString();
                        arrayList2.add(encoded);
                        arrayList.add(arrayList2);
                    case 7:
                        try {
                            encoded = InetAddress.getByAddress(ASN1OctetString.getInstance(generalName.getName()).getOctets()).getHostAddress();
                            arrayList2.add(encoded);
                            arrayList.add(arrayList2);
                        } catch (UnknownHostException unused) {
                        }
                    case 8:
                        encoded = ASN1ObjectIdentifier.getInstance(generalName.getName()).getId();
                        arrayList2.add(encoded);
                        arrayList.add(arrayList2);
                    default:
                        throw new IOException(StubApp.getString2("27122") + generalName.getTagNo());
                }
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e10) {
            throw new CertificateParsingException(e10.getMessage());
        }
    }

    public static Collection getIssuerAlternativeNames(X509Certificate x509Certificate) throws CertificateParsingException {
        return getAlternativeNames(x509Certificate.getExtensionValue(Extension.issuerAlternativeName.getId()));
    }

    public static Collection getSubjectAlternativeNames(X509Certificate x509Certificate) throws CertificateParsingException {
        return getAlternativeNames(x509Certificate.getExtensionValue(Extension.subjectAlternativeName.getId()));
    }

    public static ASN1Primitive parseExtensionValue(byte[] bArr) throws IOException {
        return ASN1Primitive.fromByteArray(ASN1OctetString.getInstance(bArr).getOctets());
    }

    public AuthorityKeyIdentifier createAuthorityKeyIdentifier(PublicKey publicKey) {
        return super.createAuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public SubjectKeyIdentifier createSubjectKeyIdentifier(PublicKey publicKey) {
        return super.createSubjectKeyIdentifier(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public SubjectKeyIdentifier createTruncatedSubjectKeyIdentifier(PublicKey publicKey) {
        return super.createTruncatedSubjectKeyIdentifier(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public JcaX509ExtensionUtils(DigestCalculator digestCalculator) {
        super(digestCalculator);
    }

    public AuthorityKeyIdentifier createAuthorityKeyIdentifier(PublicKey publicKey, X500Principal x500Principal, BigInteger bigInteger) {
        return super.createAuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()), new GeneralNames(new GeneralName(X500Name.getInstance(x500Principal.getEncoded()))), bigInteger);
    }

    public AuthorityKeyIdentifier createAuthorityKeyIdentifier(PublicKey publicKey, GeneralNames generalNames, BigInteger bigInteger) {
        return super.createAuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()), generalNames, bigInteger);
    }

    public AuthorityKeyIdentifier createAuthorityKeyIdentifier(X509Certificate x509Certificate) throws CertificateEncodingException {
        return super.createAuthorityKeyIdentifier(new JcaX509CertificateHolder(x509Certificate));
    }
}
