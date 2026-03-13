package M0;

import Z9.C;
import o0.C1438m;
import r0.AbstractC1550k;
import t0.C1711k;
import t0.C1725y;
import t0.InterfaceC1708h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends e {

    /* renamed from: k, reason: collision with root package name */
    public final d f4498k;

    /* renamed from: l, reason: collision with root package name */
    public C f4499l;

    /* renamed from: m, reason: collision with root package name */
    public long f4500m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f4501n;

    public k(InterfaceC1708h interfaceC1708h, C1711k c1711k, C1438m c1438m, int i3, Object obj, d dVar) {
        super(interfaceC1708h, c1711k, 2, c1438m, i3, obj, -9223372036854775807L, -9223372036854775807L);
        this.f4498k = dVar;
    }

    @Override // P0.l
    public final void l() {
        if (this.f4500m == 0) {
            this.f4498k.a(this.f4499l, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C1711k a3 = this.f4456b.a(this.f4500m);
            C1725y c1725y = this.j;
            T0.l lVar = new T0.l(c1725y, a3.f21081e, c1725y.n(a3));
            while (!this.f4501n) {
                try {
                    int c10 = this.f4498k.f4447a.c(lVar, d.f4446l);
                    boolean z2 = false;
                    AbstractC1550k.g(c10 != 1);
                    if (c10 == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        break;
                    }
                } finally {
                    this.f4500m = lVar.f7030d - this.f4456b.f21081e;
                    boolean z10 = this.f4498k.f4454h instanceof T0.k;
                }
            }
        } finally {
            W.a.a(this.j);
        }
    }

    @Override // P0.l
    public final void o() {
        this.f4501n = true;
    }
}
