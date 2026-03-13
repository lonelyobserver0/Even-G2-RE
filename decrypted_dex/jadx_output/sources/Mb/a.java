package Mb;

import Ab.c;
import Ab.g;
import Ab.h;
import Ab.i;
import Ab.j;
import Cb.e;
import Xa.AbstractActivityC0364d;
import android.app.Activity;
import android.os.Handler;
import java.util.PriorityQueue;
import l4.C1161a0;
import l4.E0;
import m6.f;
import o0.C1408E;
import r0.C1555p;
import rc.C1589d;
import v0.C1802E;
import v0.J;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a implements J {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4722a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4723b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4724c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4725d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4726e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4727f;

    public a(Activity activity, f fVar) {
        this.f4722a = false;
        this.f4724c = activity;
        this.f4727f = fVar;
        this.f4725d = new R5.f(this, 0);
        this.f4726e = new Handler();
    }

    @Override // v0.J
    public long a() {
        if (this.f4722a) {
            return ((C1161a0) this.f4724c).a();
        }
        J j = (J) this.f4727f;
        j.getClass();
        return j.a();
    }

    @Override // v0.J
    public void b(C1408E c1408e) {
        J j = (J) this.f4727f;
        if (j != null) {
            j.b(c1408e);
            c1408e = ((J) this.f4727f).e();
        }
        ((C1161a0) this.f4724c).b(c1408e);
    }

    @Override // v0.J
    public boolean c() {
        if (this.f4722a) {
            ((C1161a0) this.f4724c).getClass();
            return false;
        }
        J j = (J) this.f4727f;
        j.getClass();
        return j.c();
    }

    public void d() {
        ((Handler) this.f4726e).removeCallbacksAndMessages(null);
        if (this.f4722a) {
            ((Activity) this.f4724c).unregisterReceiver((R5.f) this.f4725d);
            this.f4722a = false;
        }
    }

    @Override // v0.J
    public C1408E e() {
        J j = (J) this.f4727f;
        return j != null ? j.e() : (C1408E) ((C1161a0) this.f4724c).f16346e;
    }

    public void f() {
        ((PriorityQueue) this.f4724c).clear();
        this.f4725d = null;
        this.f4722a = false;
        this.f4723b = false;
        ((b) this.f4727f).f4728a = null;
    }

    public void g(e eVar) {
        ((PriorityQueue) this.f4724c).add(eVar);
    }

    public void h(e eVar) {
        h c10;
        h c11;
        boolean z2 = this.f4723b;
        b bVar = (b) this.f4727f;
        if (z2) {
            f();
            j jVar = (j) bVar;
            jVar.getClass();
            h c12 = eVar.c();
            E0 e02 = jVar.f295b;
            C1589d c1589d = ((i) e02.f16038c).f288c;
            e02.B().execute(new Ab.b(0, e02, c12));
            return;
        }
        e eVar2 = (e) ((PriorityQueue) this.f4724c).poll();
        this.f4725d = eVar2;
        if (eVar2 == null) {
            f();
            E0 e03 = ((j) bVar).f295b;
            C1589d c1589d2 = ((i) e03.f16038c).f288c;
            e03.B().execute(new Ab.a(e03));
            return;
        }
        j jVar2 = (j) bVar;
        jVar2.getClass();
        if (eVar != null && (c11 = eVar2.c()) != (c10 = eVar.c())) {
            j.f294c.h(c10.name(), c11.name());
            E0 e04 = jVar2.f295b;
            C1589d c1589d3 = ((i) e04.f16038c).f288c;
            e04.B().execute(new c(e04, c10, c11, 1));
        }
        if (this.f4722a) {
            return;
        }
        eVar2.e(this);
    }

    public void i(e eVar, Db.c cVar) {
        f();
        j jVar = (j) ((b) this.f4727f);
        jVar.getClass();
        h c10 = eVar.c();
        E0 e02 = jVar.f295b;
        C1589d c1589d = ((i) e02.f16038c).f288c;
        e02.B().execute(new c(e02, c10, cVar, 0));
    }

    public a(C1802E c1802e, C1555p c1555p) {
        this.f4725d = c1802e;
        this.f4724c = new C1161a0(c1555p);
        this.f4722a = true;
    }

    public a(b bVar, g gVar) {
        this.f4727f = bVar;
        this.f4724c = new PriorityQueue();
        this.f4726e = gVar;
    }

    public a(AbstractActivityC0364d abstractActivityC0364d) {
        this.f4722a = true;
        this.f4723b = false;
        this.f4724c = abstractActivityC0364d;
    }
}
