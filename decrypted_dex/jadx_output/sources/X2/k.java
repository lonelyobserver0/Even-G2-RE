package X2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final String f8294a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8295b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8296c;

    public k(String code, String str, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f8294a = code;
        this.f8295b = str;
        this.f8296c = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f8295b;
    }
}
