package org.bouncycastle.x509;

import java.security.cert.CertificateEncodingException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ExtCertificateEncodingException extends CertificateEncodingException {
    Throwable cause;

    public ExtCertificateEncodingException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
