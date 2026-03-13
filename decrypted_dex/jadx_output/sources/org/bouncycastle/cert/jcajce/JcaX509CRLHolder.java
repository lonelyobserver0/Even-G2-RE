package org.bouncycastle.cert.jcajce;

import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.cert.X509CRLHolder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaX509CRLHolder extends X509CRLHolder {
    public JcaX509CRLHolder(X509CRL x509crl) throws CRLException {
        super(CertificateList.getInstance(x509crl.getEncoded()));
    }
}
