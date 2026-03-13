package org.bouncycastle.cms;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSException extends Exception {

    /* renamed from: e, reason: collision with root package name */
    Exception f18734e;

    public CMSException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f18734e;
    }

    public Exception getUnderlyingException() {
        return this.f18734e;
    }

    public CMSException(String str, Exception exc) {
        super(str);
        this.f18734e = exc;
    }
}
