package M0;

import L0.Y;
import L0.Z;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final h f4463a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f4464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4465c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f4467e;

    public g(h hVar, h hVar2, Y y10, int i3) {
        this.f4467e = hVar;
        this.f4463a = hVar2;
        this.f4464b = y10;
        this.f4465c = i3;
    }

    @Override // L0.Z
    public final void a() {
    }

    public final void b() {
        if (this.f4466d) {
            return;
        }
        h hVar = this.f4467e;
        A0.f fVar = hVar.f4476g;
        int[] iArr = hVar.f4471b;
        int i3 = this.f4465c;
        fVar.b(iArr[i3], hVar.f4472c[i3], 0, null, hVar.f4488w);
        this.f4466d = true;
    }

    @Override // L0.Z
    public final boolean h() {
        h hVar = this.f4467e;
        return !hVar.y() && this.f4464b.r(hVar.f4469B);
    }

    @Override // L0.Z
    public final int i(C1803F c1803f, u0.e eVar, int i3) {
        h hVar = this.f4467e;
        if (hVar.y()) {
            return -3;
        }
        a aVar = hVar.f4490y;
        Y y10 = this.f4464b;
        if (aVar != null && aVar.c(this.f4465c + 1) <= y10.n()) {
            return -3;
        }
        b();
        return y10.w(c1803f, eVar, i3, hVar.f4469B);
    }

    @Override // L0.Z
    public final int m(long j) {
        h hVar = this.f4467e;
        if (hVar.y()) {
            return 0;
        }
        boolean z2 = hVar.f4469B;
        Y y10 = this.f4464b;
        int p8 = y10.p(j, z2);
        a aVar = hVar.f4490y;
        if (aVar != null) {
            p8 = Math.min(p8, aVar.c(this.f4465c + 1) - y10.n());
        }
        y10.B(p8);
        if (p8 > 0) {
            b();
        }
        return p8;
    }
}
