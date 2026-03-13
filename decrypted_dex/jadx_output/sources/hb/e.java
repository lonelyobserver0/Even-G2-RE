package hb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final String f14484a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14485b;

    public e(String code, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f14484a = code;
        this.f14485b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f14485b;
    }
}
