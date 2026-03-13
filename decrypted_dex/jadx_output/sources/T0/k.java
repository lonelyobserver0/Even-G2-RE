package T0;

import com.stub.StubApp;
import java.util.Arrays;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements B {

    /* renamed from: a, reason: collision with root package name */
    public final int f7021a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7022b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7023c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f7024d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f7025e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7026f;

    public k(long[] jArr, long[] jArr2, int[] iArr, long[] jArr3) {
        this.f7022b = iArr;
        this.f7023c = jArr;
        this.f7024d = jArr2;
        this.f7025e = jArr3;
        int length = iArr.length;
        this.f7021a = length;
        if (length > 0) {
            this.f7026f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f7026f = 0L;
        }
    }

    @Override // T0.B
    public final boolean e() {
        return true;
    }

    @Override // T0.B
    public final A i(long j) {
        long[] jArr = this.f7025e;
        int e10 = AbstractC1560u.e(jArr, j, true);
        long j3 = jArr[e10];
        long[] jArr2 = this.f7023c;
        C c10 = new C(j3, jArr2[e10]);
        if (j3 >= j || e10 == this.f7021a - 1) {
            return new A(c10, c10);
        }
        int i3 = e10 + 1;
        return new A(c10, new C(jArr[i3], jArr2[i3]));
    }

    @Override // T0.B
    public final long k() {
        return this.f7026f;
    }

    public final String toString() {
        return StubApp.getString2(6115) + this.f7021a + StubApp.getString2(6116) + Arrays.toString(this.f7022b) + StubApp.getString2(6117) + Arrays.toString(this.f7023c) + StubApp.getString2(6118) + Arrays.toString(this.f7025e) + StubApp.getString2(6119) + Arrays.toString(this.f7024d) + StubApp.getString2(74);
    }
}
