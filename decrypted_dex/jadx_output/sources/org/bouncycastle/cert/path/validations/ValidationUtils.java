package org.bouncycastle.cert.path.validations;

import org.bouncycastle.cert.X509CertificateHolder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ValidationUtils {
    public static boolean isSelfIssued(X509CertificateHolder x509CertificateHolder) {
        return x509CertificateHolder.getSubject().equals(x509CertificateHolder.getIssuer());
    }
}
