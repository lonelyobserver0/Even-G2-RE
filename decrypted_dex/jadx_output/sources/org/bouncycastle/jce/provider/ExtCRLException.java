package org.bouncycastle.jce.provider;

import java.security.cert.CRLException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ExtCRLException extends CRLException {
    Throwable cause;

    public ExtCRLException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
