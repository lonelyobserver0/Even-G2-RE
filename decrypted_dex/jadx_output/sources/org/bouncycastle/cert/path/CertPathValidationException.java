package org.bouncycastle.cert.path;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertPathValidationException extends Exception {
    private final Exception cause;

    public CertPathValidationException(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public CertPathValidationException(String str, Exception exc) {
        super(str);
        this.cause = exc;
    }
}
