package org.bouncycastle.util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class StoreException extends RuntimeException {
    private Throwable _e;

    public StoreException(String str, Throwable th) {
        super(str);
        this._e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._e;
    }
}
