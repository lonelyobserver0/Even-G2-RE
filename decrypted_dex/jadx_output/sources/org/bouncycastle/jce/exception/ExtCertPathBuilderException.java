package org.bouncycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ExtCertPathBuilderException extends CertPathBuilderException implements ExtException {
    private Throwable cause;

    public ExtCertPathBuilderException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public Throwable getCause() {
        return this.cause;
    }

    public ExtCertPathBuilderException(String str, Throwable th, CertPath certPath, int i3) {
        super(str, th);
        this.cause = th;
    }
}
