package m1;

import T0.A;
import T0.C;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f17038a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f17039b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17040c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17041d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17042e;

    public g(long[] jArr, long j, long j3, long[] jArr2, int i3) {
        this.f17038a = jArr;
        this.f17039b = jArr2;
        this.f17040c = j;
        this.f17041d = j3;
        this.f17042e = i3;
    }

    @Override // m1.f
    public final long a(long j) {
        return this.f17038a[AbstractC1560u.e(this.f17039b, j, true)];
    }

    @Override // m1.f
    public final long d() {
        return this.f17041d;
    }

    @Override // T0.B
    public final boolean e() {
        return true;
    }

    @Override // T0.B
    public final A i(long j) {
        long[] jArr = this.f17038a;
        int e10 = AbstractC1560u.e(jArr, j, true);
        long j3 = jArr[e10];
        long[] jArr2 = this.f17039b;
        C c10 = new C(j3, jArr2[e10]);
        if (j3 >= j || e10 == jArr.length - 1) {
            return new A(c10, c10);
        }
        int i3 = e10 + 1;
        return new A(c10, new C(jArr[i3], jArr2[i3]));
    }

    @Override // m1.f
    public final int j() {
        return this.f17042e;
    }

    @Override // T0.B
    public final long k() {
        return this.f17040c;
    }
}
