package L0;

import java.io.IOException;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class O implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final int f3933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f3934b;

    public O(Q q10, int i3) {
        this.f3934b = q10;
        this.f3933a = i3;
    }

    @Override // L0.Z
    public final void a() {
        Q q10 = this.f3934b;
        q10.f3974w[this.f3933a].t();
        int t3 = q10.f3959d.t(q10.f3944G);
        P0.o oVar = q10.f3966m;
        IOException iOException = oVar.f5434c;
        if (iOException != null) {
            throw iOException;
        }
        P0.k kVar = oVar.f5433b;
        if (kVar != null) {
            if (t3 == Integer.MIN_VALUE) {
                t3 = kVar.f5420a;
            }
            IOException iOException2 = kVar.f5424e;
            if (iOException2 != null && kVar.f5425f > t3) {
                throw iOException2;
            }
        }
    }

    @Override // L0.Z
    public final boolean h() {
        Q q10 = this.f3934b;
        return !q10.F() && q10.f3974w[this.f3933a].r(q10.f3954Y);
    }

    @Override // L0.Z
    public final int i(C1803F c1803f, u0.e eVar, int i3) {
        Q q10 = this.f3934b;
        if (q10.F()) {
            return -3;
        }
        int i10 = this.f3933a;
        q10.z(i10);
        int w10 = q10.f3974w[i10].w(c1803f, eVar, i3, q10.f3954Y);
        if (w10 == -3) {
            q10.A(i10);
        }
        return w10;
    }

    @Override // L0.Z
    public final int m(long j) {
        Q q10 = this.f3934b;
        if (q10.F()) {
            return 0;
        }
        int i3 = this.f3933a;
        q10.z(i3);
        Y y10 = q10.f3974w[i3];
        int p8 = y10.p(j, q10.f3954Y);
        y10.B(p8);
        if (p8 == 0) {
            q10.A(i3);
        }
        return p8;
    }
}
