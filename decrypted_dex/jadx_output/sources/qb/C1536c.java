package qb;

import java.util.Objects;
import o0.C1438m;
import p0.AbstractC1482f;
import pb.AbstractC1498a;
import v0.C1830z;

/* renamed from: qb.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1536c extends AbstractC1498a {
    @Override // pb.AbstractC1498a
    public final void k() {
        int i3;
        C1830z c1830z = (C1830z) this.f19768c;
        c1830z.L();
        C1438m c1438m = c1830z.f21829T;
        Objects.requireNonNull(c1438m);
        int a3 = AbstractC1482f.a(c1438m.f18226x);
        int i10 = c1438m.f18223u;
        int i11 = c1438m.f18224v;
        if (a3 == 2 || a3 == 4) {
            a3 = AbstractC1482f.a(0);
            i3 = i10;
            i10 = i11;
        } else {
            i3 = i11;
        }
        this.f19769d.a(i10, i3, c1830z.v(), AbstractC1482f.b(a3));
    }
}
