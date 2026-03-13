package org.bouncycastle.cert.ocsp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OCSPException extends Exception {
    private Throwable cause;

    public OCSPException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public OCSPException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
