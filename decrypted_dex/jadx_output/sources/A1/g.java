package A1;

import T0.l;
import r0.AbstractC1550k;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f72a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73b;

    public /* synthetic */ g(boolean z2, long j, int i3) {
        this.f72a = i3;
        this.f73b = j;
    }

    public static g b(l lVar, C1553n c1553n) {
        lVar.i(c1553n.f20176a, 0, 8, false);
        c1553n.G(0);
        return new g(false, c1553n.l(), c1553n.h());
    }

    public boolean a() {
        int i3 = this.f72a;
        return i3 == 0 || i3 == 1;
    }

    public g(int i3, long j) {
        AbstractC1550k.c(j >= 0);
        this.f72a = i3;
        this.f73b = j;
    }
}
