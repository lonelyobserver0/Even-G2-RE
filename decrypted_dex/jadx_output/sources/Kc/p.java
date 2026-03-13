package Kc;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class p extends J {

    /* renamed from: e, reason: collision with root package name */
    public J f3838e;

    public p(J delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3838e = delegate;
    }

    @Override // Kc.J
    public final J a() {
        return this.f3838e.a();
    }

    @Override // Kc.J
    public final J b() {
        return this.f3838e.b();
    }

    @Override // Kc.J
    public final long c() {
        return this.f3838e.c();
    }

    @Override // Kc.J
    public final J d(long j) {
        return this.f3838e.d(j);
    }

    @Override // Kc.J
    public final boolean e() {
        return this.f3838e.e();
    }

    @Override // Kc.J
    public final void f() {
        this.f3838e.f();
    }

    @Override // Kc.J
    public final J g(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f3838e.g(j, unit);
    }

    @Override // Kc.J
    public final long h() {
        return this.f3838e.h();
    }
}
