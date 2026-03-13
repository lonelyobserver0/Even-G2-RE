package androidx.media3.exoplayer.smoothstreaming;

import A0.c;
import A0.j;
import I4.e;
import L0.A;
import L0.AbstractC0105a;
import P0.q;
import com.google.android.gms.internal.measurement.K1;
import java.util.List;
import l4.C1145A;
import l4.E0;
import o0.C1447v;
import s2.d;
import t0.InterfaceC1707g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SsMediaSource$Factory implements A {

    /* renamed from: a, reason: collision with root package name */
    public final K1 f9978a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1707g f9979b;

    /* renamed from: c, reason: collision with root package name */
    public final e f9980c;

    /* renamed from: d, reason: collision with root package name */
    public final c f9981d;

    /* renamed from: e, reason: collision with root package name */
    public final e f9982e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9983f;

    public SsMediaSource$Factory(InterfaceC1707g interfaceC1707g) {
        K1 k12 = new K1();
        k12.f11299b = interfaceC1707g;
        k12.f11300c = new C1145A(22);
        this.f9978a = k12;
        this.f9979b = interfaceC1707g;
        this.f9981d = new c(0);
        this.f9982e = new e(15);
        this.f9983f = 30000L;
        this.f9980c = new e(12);
        k12.f11298a = true;
    }

    @Override // L0.A
    public final void a(C1145A c1145a) {
        this.f9978a.f11300c = c1145a;
    }

    @Override // L0.A
    public final void b(boolean z2) {
        this.f9978a.f11298a = z2;
    }

    @Override // L0.A
    public final AbstractC0105a c(C1447v c1447v) {
        c1447v.f18249b.getClass();
        q dVar = new d(9);
        List list = c1447v.f18249b.f18244c;
        q e02 = !list.isEmpty() ? new E0(8, dVar, list) : dVar;
        j i3 = this.f9981d.i(c1447v);
        e eVar = this.f9982e;
        return new J0.d(c1447v, this.f9979b, e02, this.f9978a, this.f9980c, i3, eVar, this.f9983f);
    }
}
