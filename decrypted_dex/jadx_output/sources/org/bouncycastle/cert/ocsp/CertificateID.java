package org.bouncycastle.cert.ocsp;

import E1.a;
import com.stub.StubApp;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.ocsp.CertID;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertificateID {
    public static final AlgorithmIdentifier HASH_SHA1 = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
    private final CertID id;

    public CertificateID(CertID certID) {
        if (certID == null) {
            throw new IllegalArgumentException(StubApp.getString2(28099));
        }
        this.id = certID;
    }

    private static CertID createCertID(DigestCalculator digestCalculator, X509CertificateHolder x509CertificateHolder, ASN1Integer aSN1Integer) throws OCSPException {
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(x509CertificateHolder.toASN1Structure().getSubject().getEncoded(StubApp.getString2("26791")));
            outputStream.close();
            DEROctetString dEROctetString = new DEROctetString(digestCalculator.getDigest());
            SubjectPublicKeyInfo subjectPublicKeyInfo = x509CertificateHolder.getSubjectPublicKeyInfo();
            OutputStream outputStream2 = digestCalculator.getOutputStream();
            outputStream2.write(subjectPublicKeyInfo.getPublicKeyData().getBytes());
            outputStream2.close();
            return new CertID(digestCalculator.getAlgorithmIdentifier(), dEROctetString, new DEROctetString(digestCalculator.getDigest()), aSN1Integer);
        } catch (Exception e10) {
            throw new OCSPException(a.i(StubApp.getString2(28100), e10), e10);
        }
    }

    public static CertificateID deriveCertificateID(CertificateID certificateID, BigInteger bigInteger) {
        return new CertificateID(new CertID(certificateID.id.getHashAlgorithm(), certificateID.id.getIssuerNameHash(), certificateID.id.getIssuerKeyHash(), new ASN1Integer(bigInteger)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificateID) {
            return this.id.toASN1Primitive().equals(((CertificateID) obj).id.toASN1Primitive());
        }
        return false;
    }

    public ASN1ObjectIdentifier getHashAlgOID() {
        return this.id.getHashAlgorithm().getAlgorithm();
    }

    public byte[] getIssuerKeyHash() {
        return this.id.getIssuerKeyHash().getOctets();
    }

    public byte[] getIssuerNameHash() {
        return this.id.getIssuerNameHash().getOctets();
    }

    public BigInteger getSerialNumber() {
        return this.id.getSerialNumber().getValue();
    }

    public int hashCode() {
        return this.id.toASN1Primitive().hashCode();
    }

    public boolean matchesIssuer(X509CertificateHolder x509CertificateHolder, DigestCalculatorProvider digestCalculatorProvider) throws OCSPException {
        try {
            return createCertID(digestCalculatorProvider.get(this.id.getHashAlgorithm()), x509CertificateHolder, this.id.getSerialNumber()).equals(this.id);
        } catch (OperatorCreationException e10) {
            throw new OCSPException(StubApp.getString2(28101) + e10.getMessage(), e10);
        }
    }

    public CertID toASN1Primitive() {
        return this.id;
    }

    public CertificateID(DigestCalculator digestCalculator, X509CertificateHolder x509CertificateHolder, BigInteger bigInteger) throws OCSPException {
        this.id = createCertID(digestCalculator, x509CertificateHolder, new ASN1Integer(bigInteger));
    }
}
