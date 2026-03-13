package O0;

import H0.C0067j;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import o0.C1417N;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final C1417N f5088a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5089b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f5090c;

    /* renamed from: d, reason: collision with root package name */
    public final C1438m[] f5091d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f5092e;

    /* renamed from: f, reason: collision with root package name */
    public int f5093f;

    public c(C1417N c1417n, int[] iArr) {
        int i3 = 0;
        AbstractC1550k.g(iArr.length > 0);
        c1417n.getClass();
        this.f5088a = c1417n;
        int length = iArr.length;
        this.f5089b = length;
        this.f5091d = new C1438m[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f5091d[i10] = c1417n.f18070d[iArr[i10]];
        }
        Arrays.sort(this.f5091d, new C0067j(2));
        this.f5090c = new int[this.f5089b];
        while (true) {
            int i11 = this.f5089b;
            if (i3 >= i11) {
                this.f5092e = new long[i11];
                return;
            } else {
                this.f5090c[i3] = c1417n.a(this.f5091d[i3]);
                i3++;
            }
        }
    }

    @Override // O0.s
    public final boolean a(int i3, long j) {
        return this.f5092e[i3] > j;
    }

    @Override // O0.s
    public final C1417N c() {
        return this.f5088a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f5088a.equals(cVar.f5088a) && Arrays.equals(this.f5090c, cVar.f5090c)) {
                return true;
            }
        }
        return false;
    }

    @Override // O0.s
    public final void f(boolean z2) {
    }

    @Override // O0.s
    public final C1438m g(int i3) {
        return this.f5091d[i3];
    }

    @Override // O0.s
    public void h() {
    }

    public final int hashCode() {
        if (this.f5093f == 0) {
            this.f5093f = Arrays.hashCode(this.f5090c) + (System.identityHashCode(this.f5088a) * 31);
        }
        return this.f5093f;
    }

    @Override // O0.s
    public final int i(int i3) {
        return this.f5090c[i3];
    }

    @Override // O0.s
    public int j(long j, List list) {
        return list.size();
    }

    @Override // O0.s
    public void k() {
    }

    @Override // O0.s
    public final int l() {
        return this.f5090c[e()];
    }

    @Override // O0.s
    public final int length() {
        return this.f5090c.length;
    }

    @Override // O0.s
    public final int m(C1438m c1438m) {
        for (int i3 = 0; i3 < this.f5089b; i3++) {
            if (this.f5091d[i3] == c1438m) {
                return i3;
            }
        }
        return -1;
    }

    @Override // O0.s
    public final C1438m n() {
        return this.f5091d[e()];
    }

    @Override // O0.s
    public final boolean p(int i3, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a3 = a(i3, elapsedRealtime);
        int i10 = 0;
        while (i10 < this.f5089b && !a3) {
            a3 = (i10 == i3 || a(i10, elapsedRealtime)) ? false : true;
            i10++;
        }
        if (!a3) {
            return false;
        }
        long[] jArr = this.f5092e;
        long j3 = jArr[i3];
        int i11 = AbstractC1560u.f20190a;
        long j10 = elapsedRealtime + j;
        if (((j ^ j10) & (elapsedRealtime ^ j10)) < 0) {
            j10 = LongCompanionObject.MAX_VALUE;
        }
        jArr[i3] = Math.max(j3, j10);
        return true;
    }

    @Override // O0.s
    public void q(float f10) {
    }

    @Override // O0.s
    public final int u(int i3) {
        for (int i10 = 0; i10 < this.f5089b; i10++) {
            if (this.f5090c[i10] == i3) {
                return i10;
            }
        }
        return -1;
    }
}
