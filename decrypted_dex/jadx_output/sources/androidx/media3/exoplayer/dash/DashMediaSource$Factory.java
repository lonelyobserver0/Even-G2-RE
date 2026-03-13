package androidx.media3.exoplayer.dash;

import A0.c;
import Bc.i;
import I4.e;
import L0.A;
import L0.AbstractC0105a;
import aa.C0398e;
import java.util.List;
import l4.C1145A;
import l4.E0;
import o0.C1447v;
import t0.InterfaceC1707g;
import y0.g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class DashMediaSource$Factory implements A {

    /* renamed from: a, reason: collision with root package name */
    public final i f9959a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1707g f9960b;

    /* renamed from: c, reason: collision with root package name */
    public final c f9961c;

    /* renamed from: d, reason: collision with root package name */
    public final e f9962d;

    /* renamed from: e, reason: collision with root package name */
    public final e f9963e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9964f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9965g;

    public DashMediaSource$Factory(InterfaceC1707g interfaceC1707g) {
        i iVar = new i(interfaceC1707g);
        this.f9959a = iVar;
        this.f9960b = interfaceC1707g;
        this.f9961c = new c(0);
        this.f9963e = new e(15);
        this.f9964f = 30000L;
        this.f9965g = 5000000L;
        this.f9962d = new e(12);
        ((C0398e) iVar.f768d).f9343a = true;
    }

    @Override // L0.A
    public final void a(C1145A c1145a) {
        C0398e c0398e = (C0398e) this.f9959a.f768d;
        c0398e.getClass();
        c0398e.f9344b = c1145a;
    }

    @Override // L0.A
    public final void b(boolean z2) {
        ((C0398e) this.f9959a.f768d).f9343a = z2;
    }

    @Override // L0.A
    public final AbstractC0105a c(C1447v c1447v) {
        c1447v.f18249b.getClass();
        z0.e eVar = new z0.e();
        List list = c1447v.f18249b.f18244c;
        return new g(c1447v, this.f9960b, !list.isEmpty() ? new E0(8, eVar, list) : eVar, this.f9959a, this.f9962d, this.f9961c.i(c1447v), this.f9963e, this.f9964f, this.f9965g);
    }
}
