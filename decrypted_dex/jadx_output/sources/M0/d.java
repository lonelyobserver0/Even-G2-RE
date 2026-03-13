package M0;

import T0.B;
import T0.H;
import T0.o;
import T0.q;
import T0.s;
import Z9.C;
import aa.C0398e;
import android.util.SparseArray;
import l4.C1145A;
import o0.C1438m;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements q, f {

    /* renamed from: k, reason: collision with root package name */
    public static final C0398e f4445k;

    /* renamed from: l, reason: collision with root package name */
    public static final s f4446l;

    /* renamed from: a, reason: collision with root package name */
    public final o f4447a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4448b;

    /* renamed from: c, reason: collision with root package name */
    public final C1438m f4449c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f4450d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4451e;

    /* renamed from: f, reason: collision with root package name */
    public C f4452f;

    /* renamed from: g, reason: collision with root package name */
    public long f4453g;

    /* renamed from: h, reason: collision with root package name */
    public B f4454h;
    public C1438m[] j;

    static {
        C0398e c0398e = new C0398e();
        c0398e.f9344b = new C1145A(22);
        f4445k = c0398e;
        f4446l = new s();
    }

    public d(o oVar, int i3, C1438m c1438m) {
        this.f4447a = oVar;
        this.f4448b = i3;
        this.f4449c = c1438m;
    }

    @Override // T0.q
    public final void D(B b2) {
        this.f4454h = b2;
    }

    public final void a(C c10, long j, long j3) {
        this.f4452f = c10;
        this.f4453g = j3;
        boolean z2 = this.f4451e;
        o oVar = this.f4447a;
        if (!z2) {
            oVar.f(this);
            if (j != -9223372036854775807L) {
                oVar.b(0L, j);
            }
            this.f4451e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        oVar.b(0L, j);
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f4450d;
            if (i3 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i3);
            if (c10 == null) {
                cVar.f4443e = cVar.f4441c;
            } else {
                cVar.f4444f = j3;
                H H2 = c10.H(cVar.f4439a);
                cVar.f4443e = H2;
                C1438m c1438m = cVar.f4442d;
                if (c1438m != null) {
                    H2.d(c1438m);
                }
            }
            i3++;
        }
    }

    @Override // T0.q
    public final void q() {
        SparseArray sparseArray = this.f4450d;
        C1438m[] c1438mArr = new C1438m[sparseArray.size()];
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            C1438m c1438m = ((c) sparseArray.valueAt(i3)).f4442d;
            AbstractC1550k.h(c1438m);
            c1438mArr[i3] = c1438m;
        }
        this.j = c1438mArr;
    }

    @Override // T0.q
    public final H w(int i3, int i10) {
        SparseArray sparseArray = this.f4450d;
        c cVar = (c) sparseArray.get(i3);
        if (cVar == null) {
            AbstractC1550k.g(this.j == null);
            cVar = new c(i3, i10, i10 == this.f4448b ? this.f4449c : null);
            C c10 = this.f4452f;
            long j = this.f4453g;
            if (c10 == null) {
                cVar.f4443e = cVar.f4441c;
            } else {
                cVar.f4444f = j;
                H H2 = c10.H(i10);
                cVar.f4443e = H2;
                C1438m c1438m = cVar.f4442d;
                if (c1438m != null) {
                    H2.d(c1438m);
                }
            }
            sparseArray.put(i3, cVar);
        }
        return cVar;
    }
}
