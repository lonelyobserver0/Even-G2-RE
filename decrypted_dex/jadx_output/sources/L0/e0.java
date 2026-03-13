package L0;

import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final Z f4075a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4076b;

    public e0(Z z2, long j) {
        this.f4075a = z2;
        this.f4076b = j;
    }

    @Override // L0.Z
    public final void a() {
        this.f4075a.a();
    }

    @Override // L0.Z
    public final boolean h() {
        return this.f4075a.h();
    }

    @Override // L0.Z
    public final int i(C1803F c1803f, u0.e eVar, int i3) {
        int i10 = this.f4075a.i(c1803f, eVar, i3);
        if (i10 == -4) {
            eVar.f21398g += this.f4076b;
        }
        return i10;
    }

    @Override // L0.Z
    public final int m(long j) {
        return this.f4075a.m(j - this.f4076b);
    }
}
