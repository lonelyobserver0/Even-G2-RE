package org.bouncycastle.cms;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSRuntimeException extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    Exception f18735e;

    public CMSRuntimeException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f18735e;
    }

    public Exception getUnderlyingException() {
        return this.f18735e;
    }

    public CMSRuntimeException(String str, Exception exc) {
        super(str);
        this.f18735e = exc;
    }
}
