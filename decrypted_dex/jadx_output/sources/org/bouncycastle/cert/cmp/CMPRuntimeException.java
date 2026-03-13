package org.bouncycastle.cert.cmp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMPRuntimeException extends RuntimeException {
    private Throwable cause;

    public CMPRuntimeException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
