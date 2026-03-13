package org.bouncycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ExtCertPathValidatorException extends CertPathValidatorException implements ExtException {
    private Throwable cause;

    public ExtCertPathValidatorException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public Throwable getCause() {
        return this.cause;
    }

    public ExtCertPathValidatorException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public ExtCertPathValidatorException(String str, Throwable th, CertPath certPath, int i3) {
        super(str, th, certPath, i3);
        this.cause = th;
    }
}
