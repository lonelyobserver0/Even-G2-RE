package org.bouncycastle.pkix.jcajce;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class AnnotatedException extends Exception {
    private Throwable _underlyingException;

    public AnnotatedException(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._underlyingException;
    }

    public AnnotatedException(String str, Throwable th) {
        super(str);
        this._underlyingException = th;
    }
}
