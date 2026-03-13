package org.bouncycastle.cert;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertException extends Exception {
    private Throwable cause;

    public CertException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public CertException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
