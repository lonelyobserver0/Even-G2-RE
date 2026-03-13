package q1;

import M4.C0146q;
import M4.G;
import M4.I;
import M4.X;
import M4.Z;
import g5.C0955a;
import java.util.List;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0146q f19883c = new C0146q(new C0955a(17), X.f4575b);

    /* renamed from: a, reason: collision with root package name */
    public final I f19884a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f19885b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(M4.Z r21) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.b.<init>(M4.Z):void");
    }

    @Override // q1.d
    public final int d(long j) {
        int a3 = AbstractC1560u.a(this.f19885b, j, false);
        if (a3 < this.f19884a.size()) {
            return a3;
        }
        return -1;
    }

    @Override // q1.d
    public final long e(int i3) {
        AbstractC1550k.c(i3 < this.f19884a.size());
        return this.f19885b[i3];
    }

    @Override // q1.d
    public final List f(long j) {
        int e10 = AbstractC1560u.e(this.f19885b, j, false);
        if (e10 != -1) {
            return (I) this.f19884a.get(e10);
        }
        G g10 = I.f4549b;
        return Z.f4578e;
    }

    @Override // q1.d
    public final int g() {
        return this.f19884a.size();
    }
}
