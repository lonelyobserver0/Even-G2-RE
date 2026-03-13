package org.bouncycastle.cert.selector.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509CertSelector;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.selector.X509CertificateHolderSelector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaX509CertSelectorConverter {
    public X509CertSelector doConversion(X500Name x500Name, BigInteger bigInteger, byte[] bArr) {
        X509CertSelector x509CertSelector = new X509CertSelector();
        String string2 = StubApp.getString2(28128);
        if (x500Name != null) {
            try {
                x509CertSelector.setIssuer(x500Name.getEncoded());
            } catch (IOException e10) {
                throw new IllegalArgumentException(u.q(e10, new StringBuilder(string2)));
            }
        }
        if (bigInteger != null) {
            x509CertSelector.setSerialNumber(bigInteger);
        }
        if (bArr == null) {
            return x509CertSelector;
        }
        try {
            x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(bArr).getEncoded());
            return x509CertSelector;
        } catch (IOException e11) {
            throw new IllegalArgumentException(u.q(e11, new StringBuilder(string2)));
        }
    }

    public X509CertSelector getCertSelector(X509CertificateHolderSelector x509CertificateHolderSelector) {
        return doConversion(x509CertificateHolderSelector.getIssuer(), x509CertificateHolderSelector.getSerialNumber(), x509CertificateHolderSelector.getSubjectKeyIdentifier());
    }
}
