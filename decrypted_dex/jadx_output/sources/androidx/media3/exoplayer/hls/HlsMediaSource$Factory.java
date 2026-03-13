package androidx.media3.exoplayer.hls;

import A0.j;
import A1.a;
import B0.c;
import B0.l;
import C0.p;
import C2.i;
import I4.e;
import L0.A;
import L0.AbstractC0105a;
import Z9.C;
import Z9.q;
import java.util.List;
import l4.C1145A;
import o0.C1447v;
import t0.InterfaceC1707g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class HlsMediaSource$Factory implements A {

    /* renamed from: a, reason: collision with root package name */
    public final q f9966a;

    /* renamed from: b, reason: collision with root package name */
    public c f9967b;

    /* renamed from: c, reason: collision with root package name */
    public C1145A f9968c;

    /* renamed from: h, reason: collision with root package name */
    public final A0.c f9973h = new A0.c(0);

    /* renamed from: e, reason: collision with root package name */
    public final i f9970e = new i();

    /* renamed from: f, reason: collision with root package name */
    public final a f9971f = C0.c.f907q;

    /* renamed from: i, reason: collision with root package name */
    public final e f9974i = new e(15);

    /* renamed from: g, reason: collision with root package name */
    public final e f9972g = new e(12);

    /* renamed from: k, reason: collision with root package name */
    public final int f9975k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final long f9976l = -9223372036854775807L;
    public final boolean j = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9969d = true;

    public HlsMediaSource$Factory(InterfaceC1707g interfaceC1707g) {
        this.f9966a = new q(interfaceC1707g, 2);
    }

    @Override // L0.A
    public final void a(C1145A c1145a) {
        this.f9968c = c1145a;
    }

    @Override // L0.A
    public final void b(boolean z2) {
        this.f9969d = z2;
    }

    @Override // L0.A
    public final AbstractC0105a c(C1447v c1447v) {
        c1447v.f18249b.getClass();
        if (this.f9967b == null) {
            c cVar = new c();
            cVar.f412a = new C1145A(22);
            this.f9967b = cVar;
        }
        C1145A c1145a = this.f9968c;
        if (c1145a != null) {
            this.f9967b.f412a = c1145a;
        }
        c cVar2 = this.f9967b;
        cVar2.f413b = this.f9969d;
        p pVar = this.f9970e;
        List list = c1447v.f18249b.f18244c;
        if (!list.isEmpty()) {
            pVar = new C(3, pVar, list);
        }
        j i3 = this.f9973h.i(c1447v);
        e eVar = this.f9974i;
        this.f9971f.getClass();
        q qVar = this.f9966a;
        return new l(c1447v, qVar, cVar2, this.f9972g, i3, eVar, new C0.c(qVar, eVar, pVar), this.f9976l, this.j, this.f9975k);
    }
}
