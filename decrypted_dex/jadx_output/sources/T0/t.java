package T0;

import l4.E0;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class t implements B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7044a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7045b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7046c;

    public /* synthetic */ t(Object obj, long j, int i3) {
        this.f7044a = i3;
        this.f7046c = obj;
        this.f7045b = j;
    }

    @Override // T0.B
    public final boolean e() {
        switch (this.f7044a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // T0.B
    public final A i(long j) {
        switch (this.f7044a) {
            case 0:
                u uVar = (u) this.f7046c;
                AbstractC1550k.h(uVar.f7056k);
                E0 e02 = uVar.f7056k;
                long[] jArr = (long[]) e02.f16037b;
                int e10 = AbstractC1560u.e(jArr, AbstractC1560u.j((uVar.f7051e * j) / 1000000, 0L, uVar.j - 1), false);
                long j3 = e10 == -1 ? 0L : jArr[e10];
                long[] jArr2 = (long[]) e02.f16038c;
                long j10 = e10 != -1 ? jArr2[e10] : 0L;
                int i3 = uVar.f7051e;
                long j11 = (j3 * 1000000) / i3;
                long j12 = this.f7045b;
                C c10 = new C(j11, j10 + j12);
                if (j11 == j || e10 == jArr.length - 1) {
                    return new A(c10, c10);
                }
                int i10 = e10 + 1;
                return new A(c10, new C((jArr[i10] * 1000000) / i3, j12 + jArr2[i10]));
            case 1:
                return (A) this.f7046c;
            default:
                V0.b bVar = (V0.b) this.f7046c;
                A b2 = bVar.f7681i[0].b(j);
                int i11 = 1;
                while (true) {
                    V0.e[] eVarArr = bVar.f7681i;
                    if (i11 >= eVarArr.length) {
                        return b2;
                    }
                    A b10 = eVarArr[i11].b(j);
                    if (b10.f6925a.f6929b < b2.f6925a.f6929b) {
                        b2 = b10;
                    }
                    i11++;
                }
        }
    }

    @Override // T0.B
    public final long k() {
        switch (this.f7044a) {
        }
        return this.f7045b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(long j) {
        this(j, 0L);
        this.f7044a = 1;
    }

    public t(long j, long j3) {
        this.f7044a = 1;
        this.f7045b = j;
        C c10 = j3 == 0 ? C.f6927c : new C(0L, j3);
        this.f7046c = new A(c10, c10);
    }
}
