package org.bouncycastle.i18n;

import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LocalizedException extends Exception {
    private Throwable cause;
    protected ErrorBundle message;

    public LocalizedException(ErrorBundle errorBundle) {
        super(errorBundle.getText(Locale.getDefault()));
        this.message = errorBundle;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ErrorBundle getErrorMessage() {
        return this.message;
    }

    public LocalizedException(ErrorBundle errorBundle, Throwable th) {
        super(errorBundle.getText(Locale.getDefault()));
        this.message = errorBundle;
        this.cause = th;
    }
}
