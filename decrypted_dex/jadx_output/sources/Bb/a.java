package Bb;

import M4.G;
import M4.I;
import M4.Z;
import M4.r;
import java.util.ArrayList;
import q1.C1505a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements N0.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f745a;

    public a(int i3) {
        switch (i3) {
            case 1:
                this.f745a = new ArrayList();
                break;
            default:
                this.f745a = new ArrayList(4);
                break;
        }
    }

    @Override // N0.a
    public long a(long j) {
        ArrayList arrayList = this.f745a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C1505a) arrayList.get(0)).f19880b) {
            return ((C1505a) arrayList.get(0)).f19880b;
        }
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            C1505a c1505a = (C1505a) arrayList.get(i3);
            if (j < c1505a.f19880b) {
                long j3 = ((C1505a) arrayList.get(i3 - 1)).f19882d;
                long j10 = c1505a.f19880b;
                return (j3 == -9223372036854775807L || j3 <= j || j3 >= j10) ? j10 : j3;
            }
        }
        long j11 = ((C1505a) r.j(arrayList)).f19882d;
        if (j11 == -9223372036854775807L || j >= j11) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    @Override // N0.a
    public I b(long j) {
        int f10 = f(j);
        if (f10 == 0) {
            G g10 = I.f4549b;
            return Z.f4578e;
        }
        C1505a c1505a = (C1505a) this.f745a.get(f10 - 1);
        long j3 = c1505a.f19882d;
        if (j3 == -9223372036854775807L || j < j3) {
            return c1505a.f19879a;
        }
        G g11 = I.f4549b;
        return Z.f4578e;
    }

    @Override // N0.a
    public long c(long j) {
        ArrayList arrayList = this.f745a;
        if (arrayList.isEmpty() || j < ((C1505a) arrayList.get(0)).f19880b) {
            return -9223372036854775807L;
        }
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            long j3 = ((C1505a) arrayList.get(i3)).f19880b;
            if (j == j3) {
                return j3;
            }
            if (j < j3) {
                C1505a c1505a = (C1505a) arrayList.get(i3 - 1);
                long j10 = c1505a.f19882d;
                return (j10 == -9223372036854775807L || j10 > j) ? c1505a.f19880b : j10;
            }
        }
        C1505a c1505a2 = (C1505a) r.j(arrayList);
        long j11 = c1505a2.f19882d;
        return (j11 == -9223372036854775807L || j < j11) ? c1505a2.f19880b : j11;
    }

    @Override // N0.a
    public void clear() {
        this.f745a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // N0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(q1.C1505a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f19880b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            r0.AbstractC1550k.c(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f19882d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f745a
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            q1.a r7 = (q1.C1505a) r7
            long r7 = r7.f19880b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            q1.a r7 = (q1.C1505a) r7
            long r7 = r7.f19880b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Bb.a.d(q1.a, long):boolean");
    }

    @Override // N0.a
    public void e(long j) {
        int f10 = f(j);
        if (f10 == 0) {
            return;
        }
        ArrayList arrayList = this.f745a;
        long j3 = ((C1505a) arrayList.get(f10 - 1)).f19882d;
        if (j3 == -9223372036854775807L || j3 >= j) {
            f10--;
        }
        arrayList.subList(0, f10).clear();
    }

    public int f(long j) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f745a;
            if (i3 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C1505a) arrayList.get(i3)).f19880b) {
                return i3;
            }
            i3++;
        }
    }
}
