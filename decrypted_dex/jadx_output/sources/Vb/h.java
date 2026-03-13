package Vb;

import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class h extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient CoroutineContext f7943a;

    public h(CoroutineContext coroutineContext) {
        this.f7943a = coroutineContext;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f7943a.toString();
    }
}
