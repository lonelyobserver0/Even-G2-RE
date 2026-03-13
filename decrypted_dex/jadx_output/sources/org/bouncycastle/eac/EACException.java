package org.bouncycastle.eac;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EACException extends Exception {
    private Throwable cause;

    public EACException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public EACException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
