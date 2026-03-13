package N0;

import M4.A;
import M4.C0146q;
import M4.F;
import M4.G;
import M4.I;
import M4.X;
import M4.Z;
import java.util.ArrayList;
import q1.C1505a;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final A f4813b = new A(new C0146q(new A1.a(25), X.f4575b), new C0146q(new A1.a(26), X.f4576c));

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4814a = new ArrayList();

    @Override // N0.a
    public final long a(long j) {
        int i3 = 0;
        long j3 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f4814a;
            if (i3 >= arrayList.size()) {
                break;
            }
            long j10 = ((C1505a) arrayList.get(i3)).f19880b;
            long j11 = ((C1505a) arrayList.get(i3)).f19882d;
            if (j < j10) {
                j3 = j3 == -9223372036854775807L ? j10 : Math.min(j3, j10);
            } else {
                if (j < j11) {
                    j3 = j3 == -9223372036854775807L ? j11 : Math.min(j3, j11);
                }
                i3++;
            }
        }
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        return Long.MIN_VALUE;
    }

    @Override // N0.a
    public final I b(long j) {
        ArrayList arrayList = this.f4814a;
        if (!arrayList.isEmpty()) {
            if (j >= ((C1505a) arrayList.get(0)).f19880b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    C1505a c1505a = (C1505a) arrayList.get(i3);
                    if (j >= c1505a.f19880b && j < c1505a.f19882d) {
                        arrayList2.add(c1505a);
                    }
                    if (j < c1505a.f19880b) {
                        break;
                    }
                }
                Z t3 = I.t(f4813b, arrayList2);
                F l9 = I.l();
                for (int i10 = 0; i10 < t3.f4580d; i10++) {
                    l9.d(((C1505a) t3.get(i10)).f19879a);
                }
                return l9.g();
            }
        }
        G g10 = I.f4549b;
        return Z.f4578e;
    }

    @Override // N0.a
    public final long c(long j) {
        ArrayList arrayList = this.f4814a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((C1505a) arrayList.get(0)).f19880b) {
            return -9223372036854775807L;
        }
        long j3 = ((C1505a) arrayList.get(0)).f19880b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long j10 = ((C1505a) arrayList.get(i3)).f19880b;
            long j11 = ((C1505a) arrayList.get(i3)).f19882d;
            if (j11 > j) {
                if (j10 > j) {
                    break;
                }
                j3 = Math.max(j3, j10);
            } else {
                j3 = Math.max(j3, j11);
            }
        }
        return j3;
    }

    @Override // N0.a
    public final void clear() {
        this.f4814a.clear();
    }

    @Override // N0.a
    public final boolean d(C1505a c1505a, long j) {
        long j3 = c1505a.f19880b;
        AbstractC1550k.c(j3 != -9223372036854775807L);
        AbstractC1550k.c(c1505a.f19881c != -9223372036854775807L);
        boolean z2 = j3 <= j && j < c1505a.f19882d;
        ArrayList arrayList = this.f4814a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j3 >= ((C1505a) arrayList.get(size)).f19880b) {
                arrayList.add(size + 1, c1505a);
                return z2;
            }
        }
        arrayList.add(0, c1505a);
        return z2;
    }

    @Override // N0.a
    public final void e(long j) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f4814a;
            if (i3 >= arrayList.size()) {
                return;
            }
            long j3 = ((C1505a) arrayList.get(i3)).f19880b;
            if (j > j3 && j > ((C1505a) arrayList.get(i3)).f19882d) {
                arrayList.remove(i3);
                i3--;
            } else if (j < j3) {
                return;
            }
            i3++;
        }
    }
}
