package org.bouncycastle.cmc;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMCException extends Exception {
    private final Throwable cause;

    public CMCException(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public CMCException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
