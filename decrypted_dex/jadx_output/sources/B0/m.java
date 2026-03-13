package B0;

import L0.Z;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final int f503a;

    /* renamed from: b, reason: collision with root package name */
    public final r f504b;

    /* renamed from: c, reason: collision with root package name */
    public int f505c = -1;

    public m(r rVar, int i3) {
        this.f504b = rVar;
        this.f503a = i3;
    }

    @Override // L0.Z
    public final void a() {
        int i3 = this.f505c;
        r rVar = this.f504b;
        if (i3 == -2) {
            rVar.h();
            throw new v(E1.a.k(StubApp.getString2(482), rVar.f531O.a(this.f503a).f18070d[0].f18216n, StubApp.getString2(1)));
        }
        if (i3 == -1) {
            rVar.E();
        } else if (i3 != -3) {
            rVar.E();
            rVar.f566y[i3].t();
        }
    }

    public final void b() {
        AbstractC1550k.c(this.f505c == -1);
        r rVar = this.f504b;
        rVar.h();
        rVar.f533R.getClass();
        int[] iArr = rVar.f533R;
        int i3 = this.f503a;
        int i10 = iArr[i3];
        if (i10 == -1) {
            if (rVar.f532P.contains(rVar.f531O.a(i3))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = rVar.f536Y;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.f505c = i10;
    }

    public final boolean c() {
        int i3 = this.f505c;
        return (i3 == -1 || i3 == -3 || i3 == -2) ? false : true;
    }

    @Override // L0.Z
    public final boolean h() {
        if (this.f505c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i3 = this.f505c;
        r rVar = this.f504b;
        return !rVar.B() && rVar.f566y[i3].r(rVar.f553n0);
    }

    @Override // L0.Z
    public final int i(C1803F c1803f, u0.e eVar, int i3) {
        C1438m c1438m;
        if (this.f505c == -3) {
            eVar.a(4);
            return -4;
        }
        if (c()) {
            int i10 = this.f505c;
            r rVar = this.f504b;
            if (!rVar.B()) {
                ArrayList arrayList = rVar.f555p;
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((j) arrayList.get(i12)).f457l;
                        int length = rVar.f566y.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (rVar.f536Y[i14] && rVar.f566y[i14].v() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    AbstractC1560u.O(arrayList, 0, i12);
                    j jVar = (j) arrayList.get(0);
                    C1438m c1438m2 = jVar.f4458d;
                    if (!c1438m2.equals(rVar.f529K)) {
                        rVar.f548l.b(rVar.f539b, c1438m2, jVar.f4459e, jVar.f4460f, jVar.f4461g);
                    }
                    rVar.f529K = c1438m2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).f456R) {
                    int w10 = rVar.f566y[i10].w(c1803f, eVar, i3, rVar.f553n0);
                    if (w10 == -5) {
                        C1438m c1438m3 = (C1438m) c1803f.f21582b;
                        c1438m3.getClass();
                        if (i10 == rVar.f524E) {
                            int h2 = android.support.v4.media.session.b.h(rVar.f566y[i10].v());
                            while (i11 < arrayList.size() && ((j) arrayList.get(i11)).f457l != h2) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                c1438m = ((j) arrayList.get(i11)).f4458d;
                            } else {
                                c1438m = rVar.f528I;
                                c1438m.getClass();
                            }
                            c1438m3 = c1438m3.d(c1438m);
                        }
                        c1803f.f21582b = c1438m3;
                    }
                    return w10;
                }
            }
        }
        return -3;
    }

    @Override // L0.Z
    public final int m(long j) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i3 = this.f505c;
        r rVar = this.f504b;
        if (rVar.B()) {
            return 0;
        }
        q qVar = rVar.f566y[i3];
        int p8 = qVar.p(j, rVar.f553n0);
        ArrayList arrayList = rVar.f555p;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = i2.u.j(1, arrayList);
            }
            obj = null;
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            obj = null;
        }
        j jVar = (j) obj;
        if (jVar != null && !jVar.f456R) {
            p8 = Math.min(p8, jVar.e(i3) - qVar.n());
        }
        qVar.B(p8);
        return p8;
    }
}
