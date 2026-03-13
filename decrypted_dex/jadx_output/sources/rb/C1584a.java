package rb;

import java.util.Objects;
import o0.C1425W;
import o0.C1438m;
import p0.AbstractC1482f;
import pb.AbstractC1498a;
import v0.C1830z;

/* renamed from: rb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1584a extends AbstractC1498a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f20549e;

    @Override // pb.AbstractC1498a
    public final void k() {
        C1830z c1830z = (C1830z) this.f19768c;
        c1830z.L();
        C1425W c1425w = c1830z.f21858t0;
        int i3 = c1425w.f18114a;
        int i10 = 1;
        int i11 = c1425w.f18115b;
        if (i3 != 0 && i11 != 0 && !this.f20549e) {
            c1830z.L();
            C1438m c1438m = c1830z.f21829T;
            Objects.requireNonNull(c1438m);
            try {
                i10 = AbstractC1482f.a(c1438m.f18226x);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.f19769d.a(i3, i11, c1830z.v(), AbstractC1482f.b(i10));
    }
}
