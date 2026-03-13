package org.bouncycastle.cert.selector.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.cert.X509CertSelector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.selector.X509CertificateHolderSelector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaSelectorConverter {
    public X509CertificateHolderSelector getCertificateHolderSelector(X509CertSelector x509CertSelector) {
        try {
            return x509CertSelector.getSubjectKeyIdentifier() != null ? new X509CertificateHolderSelector(X500Name.getInstance(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber(), ASN1OctetString.getInstance(x509CertSelector.getSubjectKeyIdentifier()).getOctets()) : new X509CertificateHolderSelector(X500Name.getInstance(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber());
        } catch (IOException e10) {
            throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(28128))));
        }
    }
}
