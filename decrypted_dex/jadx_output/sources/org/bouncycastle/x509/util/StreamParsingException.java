package org.bouncycastle.x509.util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class StreamParsingException extends Exception {
    Throwable _e;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this._e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._e;
    }
}
