package P1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final g f5461a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f5462b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g callbackName, Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f5461a = callbackName;
        this.f5462b = cause;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5462b;
    }
}
