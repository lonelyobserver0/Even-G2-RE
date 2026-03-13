package L0;

import o0.C1437l;
import o0.C1438m;
import v0.C1803F;

/* renamed from: L0.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0107c implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final Z f4046a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0108d f4048c;

    public C0107c(C0108d c0108d, Z z2) {
        this.f4048c = c0108d;
        this.f4046a = z2;
    }

    @Override // L0.Z
    public final void a() {
        this.f4046a.a();
    }

    @Override // L0.Z
    public final boolean h() {
        return !this.f4048c.d() && this.f4046a.h();
    }

    @Override // L0.Z
    public final int i(C1803F c1803f, u0.e eVar, int i3) {
        C0108d c0108d = this.f4048c;
        if (c0108d.d()) {
            return -3;
        }
        if (this.f4047b) {
            eVar.f3376b = 4;
            return -4;
        }
        long u2 = c0108d.u();
        int i10 = this.f4046a.i(c1803f, eVar, i3);
        if (i10 != -5) {
            long j = c0108d.f4057f;
            if (j == Long.MIN_VALUE || ((i10 != -4 || eVar.f21398g < j) && !(i10 == -3 && u2 == Long.MIN_VALUE && !eVar.f21397f))) {
                return i10;
            }
            eVar.s();
            eVar.f3376b = 4;
            this.f4047b = true;
            return -4;
        }
        C1438m c1438m = (C1438m) c1803f.f21582b;
        c1438m.getClass();
        int i11 = c1438m.f18197G;
        int i12 = c1438m.f18196F;
        if (i12 == 0 && i11 == 0) {
            return -5;
        }
        if (c0108d.f4056e != 0) {
            i12 = 0;
        }
        if (c0108d.f4057f != Long.MIN_VALUE) {
            i11 = 0;
        }
        C1437l a3 = c1438m.a();
        a3.f18159E = i12;
        a3.f18160F = i11;
        c1803f.f21582b = new C1438m(a3);
        return -5;
    }

    @Override // L0.Z
    public final int m(long j) {
        if (this.f4048c.d()) {
            return -3;
        }
        return this.f4046a.m(j);
    }
}
