package org.bouncycastle.tsp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TSPException extends Exception {
    Throwable underlyingException;

    public TSPException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.underlyingException;
    }

    public Exception getUnderlyingException() {
        return (Exception) this.underlyingException;
    }

    public TSPException(String str, Throwable th) {
        super(str);
        this.underlyingException = th;
    }
}
