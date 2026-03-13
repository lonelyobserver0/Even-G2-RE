package org.bouncycastle.x509;

import com.stub.StubApp;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.provider.X509CertificateObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509CertificatePair {
    private final JcaJceHelper bcHelper = new BCJcaJceHelper();
    private X509Certificate forward;
    private X509Certificate reverse;

    public X509CertificatePair(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        this.forward = x509Certificate;
        this.reverse = x509Certificate2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof X509CertificatePair)) {
            return false;
        }
        X509CertificatePair x509CertificatePair = (X509CertificatePair) obj;
        X509Certificate x509Certificate = this.forward;
        boolean equals = x509Certificate != null ? x509Certificate.equals(x509CertificatePair.forward) : x509CertificatePair.forward == null;
        X509Certificate x509Certificate2 = this.reverse;
        X509Certificate x509Certificate3 = x509CertificatePair.reverse;
        return equals && (x509Certificate2 != null ? x509Certificate2.equals(x509Certificate3) : x509Certificate3 == null);
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        Certificate certificate;
        try {
            Certificate certificate2 = null;
            if (this.forward != null) {
                certificate = Certificate.getInstance(new ASN1InputStream(this.forward.getEncoded()).readObject());
                if (certificate == null) {
                    throw new CertificateEncodingException(StubApp.getString2("35132"));
                }
            } else {
                certificate = null;
            }
            if (this.reverse != null && (certificate2 = Certificate.getInstance(new ASN1InputStream(this.reverse.getEncoded()).readObject())) == null) {
                throw new CertificateEncodingException(StubApp.getString2("35133"));
            }
            return new CertificatePair(certificate, certificate2).getEncoded(StubApp.getString2("26791"));
        } catch (IOException e10) {
            throw new ExtCertificateEncodingException(e10.toString(), e10);
        } catch (IllegalArgumentException e11) {
            throw new ExtCertificateEncodingException(e11.toString(), e11);
        }
    }

    public X509Certificate getForward() {
        return this.forward;
    }

    public X509Certificate getReverse() {
        return this.reverse;
    }

    public int hashCode() {
        X509Certificate x509Certificate = this.forward;
        int hashCode = x509Certificate != null ? (-1) ^ x509Certificate.hashCode() : -1;
        X509Certificate x509Certificate2 = this.reverse;
        if (x509Certificate2 != null) {
            return x509Certificate2.hashCode() ^ (hashCode * 17);
        }
        return hashCode;
    }

    public X509CertificatePair(CertificatePair certificatePair) throws CertificateParsingException {
        if (certificatePair.getForward() != null) {
            this.forward = new X509CertificateObject(certificatePair.getForward());
        }
        if (certificatePair.getReverse() != null) {
            this.reverse = new X509CertificateObject(certificatePair.getReverse());
        }
    }
}
