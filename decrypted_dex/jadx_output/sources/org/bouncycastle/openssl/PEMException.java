package org.bouncycastle.openssl;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PEMException extends IOException {
    Exception underlying;

    public PEMException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.underlying;
    }

    public Exception getUnderlyingException() {
        return this.underlying;
    }

    public PEMException(String str, Exception exc) {
        super(str);
        this.underlying = exc;
    }
}
