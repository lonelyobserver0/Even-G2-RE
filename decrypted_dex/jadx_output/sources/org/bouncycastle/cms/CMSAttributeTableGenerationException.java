package org.bouncycastle.cms;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSAttributeTableGenerationException extends CMSRuntimeException {

    /* renamed from: e, reason: collision with root package name */
    Exception f18733e;

    public CMSAttributeTableGenerationException(String str) {
        super(str);
    }

    @Override // org.bouncycastle.cms.CMSRuntimeException, java.lang.Throwable
    public Throwable getCause() {
        return this.f18733e;
    }

    @Override // org.bouncycastle.cms.CMSRuntimeException
    public Exception getUnderlyingException() {
        return this.f18733e;
    }

    public CMSAttributeTableGenerationException(String str, Exception exc) {
        super(str);
        this.f18733e = exc;
    }
}
