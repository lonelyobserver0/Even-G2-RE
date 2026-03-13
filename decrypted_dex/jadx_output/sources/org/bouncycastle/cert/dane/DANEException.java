package org.bouncycastle.cert.dane;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DANEException extends Exception {
    private Throwable cause;

    public DANEException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public DANEException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
