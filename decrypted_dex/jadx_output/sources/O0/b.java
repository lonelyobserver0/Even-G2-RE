package O0;

import M4.F;
import M4.I;
import android.os.SystemClock;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import o0.C1417N;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1555p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public final P0.d f5074g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5075h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5076i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5077k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5078l;

    /* renamed from: m, reason: collision with root package name */
    public final float f5079m;

    /* renamed from: n, reason: collision with root package name */
    public final float f5080n;

    /* renamed from: o, reason: collision with root package name */
    public final I f5081o;

    /* renamed from: p, reason: collision with root package name */
    public final C1555p f5082p;

    /* renamed from: q, reason: collision with root package name */
    public float f5083q;

    /* renamed from: r, reason: collision with root package name */
    public int f5084r;

    /* renamed from: s, reason: collision with root package name */
    public int f5085s;

    /* renamed from: t, reason: collision with root package name */
    public long f5086t;

    /* renamed from: u, reason: collision with root package name */
    public M0.l f5087u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C1417N c1417n, int[] iArr, P0.d dVar, long j, long j3, long j10, I i3) {
        super(c1417n, iArr);
        C1555p c1555p = C1555p.f20182a;
        if (j10 < j) {
            AbstractC1550k.w(StubApp.getString2(3953), StubApp.getString2(3954));
            j10 = j;
        }
        this.f5074g = dVar;
        this.f5075h = j * 1000;
        this.f5076i = j3 * 1000;
        this.j = j10 * 1000;
        this.f5077k = 1279;
        this.f5078l = 719;
        this.f5079m = 0.7f;
        this.f5080n = 0.75f;
        this.f5081o = I.m(i3);
        this.f5082p = c1555p;
        this.f5083q = 1.0f;
        this.f5085s = 0;
        this.f5086t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j3 : jArr) {
            j += j3;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            F f10 = (F) arrayList.get(i3);
            if (f10 != null) {
                f10.a(new a(j, jArr[i3]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            M0.l lVar = (M0.l) M4.r.j(list);
            long j = lVar.f4461g;
            if (j != -9223372036854775807L) {
                long j3 = lVar.f4462h;
                if (j3 != -9223372036854775807L) {
                    return j3 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // O0.s
    public final void b(long j, long j3, long j10, List list, M0.m[] mVarArr) {
        long x7;
        this.f5082p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = this.f5084r;
        if (i3 >= mVarArr.length || !mVarArr[i3].next()) {
            int length = mVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    x7 = x(list);
                    break;
                }
                M0.m mVar = mVarArr[i10];
                if (mVar.next()) {
                    x7 = mVar.g() - mVar.b();
                    break;
                }
                i10++;
            }
        } else {
            M0.m mVar2 = mVarArr[this.f5084r];
            x7 = mVar2.g() - mVar2.b();
        }
        int i11 = this.f5085s;
        if (i11 == 0) {
            this.f5085s = 1;
            this.f5084r = w(elapsedRealtime);
            return;
        }
        int i12 = this.f5084r;
        int m4 = list.isEmpty() ? -1 : m(((M0.l) M4.r.j(list)).f4458d);
        if (m4 != -1) {
            i11 = ((M0.l) M4.r.j(list)).f4459e;
            i12 = m4;
        }
        int w10 = w(elapsedRealtime);
        if (w10 != i12 && !a(i12, elapsedRealtime)) {
            C1438m[] c1438mArr = this.f5091d;
            C1438m c1438m = c1438mArr[i12];
            C1438m c1438m2 = c1438mArr[w10];
            long j11 = this.f5075h;
            if (j10 != -9223372036854775807L) {
                j11 = Math.min((long) ((x7 != -9223372036854775807L ? j10 - x7 : j10) * this.f5080n), j11);
            }
            int i13 = c1438m2.j;
            int i14 = c1438m.j;
            if ((i13 > i14 && j3 < j11) || (i13 < i14 && j3 >= this.f5076i)) {
                w10 = i12;
            }
        }
        if (w10 != i12) {
            i11 = 3;
        }
        this.f5085s = i11;
        this.f5084r = w10;
    }

    @Override // O0.s
    public final int e() {
        return this.f5084r;
    }

    @Override // O0.c, O0.s
    public final void h() {
        this.f5086t = -9223372036854775807L;
        this.f5087u = null;
    }

    @Override // O0.c, O0.s
    public final int j(long j, List list) {
        int i3;
        int i10;
        this.f5082p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f5086t;
        if (j3 != -9223372036854775807L && elapsedRealtime - j3 < 1000 && (list.isEmpty() || ((M0.l) M4.r.j(list)).equals(this.f5087u))) {
            return list.size();
        }
        this.f5086t = elapsedRealtime;
        this.f5087u = list.isEmpty() ? null : (M0.l) M4.r.j(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long A4 = AbstractC1560u.A(this.f5083q, ((M0.l) list.get(size - 1)).f4461g - j);
        long j10 = this.j;
        if (A4 >= j10) {
            x(list);
            C1438m c1438m = this.f5091d[w(elapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                M0.l lVar = (M0.l) list.get(i11);
                C1438m c1438m2 = lVar.f4458d;
                if (AbstractC1560u.A(this.f5083q, lVar.f4461g - j) >= j10 && c1438m2.j < c1438m.j && (i3 = c1438m2.f18224v) != -1 && i3 <= this.f5078l && (i10 = c1438m2.f18223u) != -1 && i10 <= this.f5077k && i3 < c1438m.f18224v) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override // O0.c, O0.s
    public final void k() {
        this.f5087u = null;
    }

    @Override // O0.s
    public final int o() {
        return this.f5085s;
    }

    @Override // O0.c, O0.s
    public final void q(float f10) {
        this.f5083q = f10;
    }

    @Override // O0.s
    public final Object r() {
        return null;
    }

    public final int w(long j) {
        long j3;
        P0.h hVar = (P0.h) this.f5074g;
        synchronized (hVar) {
            j3 = hVar.f5413k;
        }
        long j10 = (long) (j3 * this.f5079m);
        this.f5074g.getClass();
        long j11 = (long) (j10 / this.f5083q);
        if (!this.f5081o.isEmpty()) {
            int i3 = 1;
            while (i3 < this.f5081o.size() - 1 && ((a) this.f5081o.get(i3)).f5072a < j11) {
                i3++;
            }
            a aVar = (a) this.f5081o.get(i3 - 1);
            a aVar2 = (a) this.f5081o.get(i3);
            long j12 = aVar.f5072a;
            long j13 = aVar.f5073b;
            j11 = j13 + ((long) (((j11 - j12) / (aVar2.f5072a - j12)) * (aVar2.f5073b - j13)));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f5089b; i11++) {
            if (j == Long.MIN_VALUE || !a(i11, j)) {
                if (this.f5091d[i11].j <= j11) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }
}
