package org.bouncycastle.tsp;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TSPIOException extends IOException {
    Throwable underlyingException;

    public TSPIOException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.underlyingException;
    }

    public Exception getUnderlyingException() {
        return (Exception) this.underlyingException;
    }

    public TSPIOException(String str, Throwable th) {
        super(str);
        this.underlyingException = th;
    }
}
