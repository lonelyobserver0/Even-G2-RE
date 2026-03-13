package org.bouncycastle.mime;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MimeIOException extends IOException {
    private Throwable cause;

    public MimeIOException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public MimeIOException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
