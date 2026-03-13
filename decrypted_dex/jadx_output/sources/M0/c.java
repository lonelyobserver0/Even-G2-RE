package M0;

import T0.G;
import T0.H;
import o0.C1438m;
import o0.InterfaceC1432g;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements H {

    /* renamed from: a, reason: collision with root package name */
    public final int f4439a;

    /* renamed from: b, reason: collision with root package name */
    public final C1438m f4440b;

    /* renamed from: c, reason: collision with root package name */
    public final T0.n f4441c = new T0.n();

    /* renamed from: d, reason: collision with root package name */
    public C1438m f4442d;

    /* renamed from: e, reason: collision with root package name */
    public H f4443e;

    /* renamed from: f, reason: collision with root package name */
    public long f4444f;

    public c(int i3, int i10, C1438m c1438m) {
        this.f4439a = i10;
        this.f4440b = c1438m;
    }

    @Override // T0.H
    public final void a(C1553n c1553n, int i3, int i10) {
        H h2 = this.f4443e;
        int i11 = AbstractC1560u.f20190a;
        h2.a(c1553n, i3, 0);
    }

    @Override // T0.H
    public final int b(InterfaceC1432g interfaceC1432g, int i3, boolean z2) {
        H h2 = this.f4443e;
        int i10 = AbstractC1560u.f20190a;
        return h2.b(interfaceC1432g, i3, z2);
    }

    @Override // T0.H
    public final void c(long j, int i3, int i10, int i11, G g10) {
        long j3 = this.f4444f;
        if (j3 != -9223372036854775807L && j >= j3) {
            this.f4443e = this.f4441c;
        }
        H h2 = this.f4443e;
        int i12 = AbstractC1560u.f20190a;
        h2.c(j, i3, i10, i11, g10);
    }

    @Override // T0.H
    public final void d(C1438m c1438m) {
        C1438m c1438m2 = this.f4440b;
        if (c1438m2 != null) {
            c1438m = c1438m.d(c1438m2);
        }
        this.f4442d = c1438m;
        H h2 = this.f4443e;
        int i3 = AbstractC1560u.f20190a;
        h2.d(c1438m);
    }
}
