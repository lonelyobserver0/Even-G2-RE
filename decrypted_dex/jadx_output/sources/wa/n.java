package wa;

import Z9.C0366a;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import ta.C1747g;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    public final C1471d f22238a;

    /* renamed from: b, reason: collision with root package name */
    public float f22239b = Float.NEGATIVE_INFINITY;

    /* renamed from: c, reason: collision with root package name */
    public int f22240c = -1;

    public n() {
        C1471d c1471d = new C1471d();
        this.f22238a = c1471d;
        c1471d.V(oa.j.f18621y3, oa.j.f18565m1);
    }

    public final C1747g a() {
        C1468a F3 = this.f22238a.F(oa.j.f18560l1);
        if (F3 != null) {
            return new C1747g(F3);
        }
        return null;
    }

    public final ta.h b() {
        AbstractC1469b J10 = this.f22238a.J(oa.j.f18583q1);
        if (J10 instanceof oa.p) {
            return new ta.h((oa.p) J10);
        }
        return null;
    }

    public final String c() {
        AbstractC1469b J10 = this.f22238a.J(oa.j.f18593s1);
        if (J10 instanceof oa.j) {
            return ((oa.j) J10).f18626a;
        }
        return null;
    }

    public final C0366a d() {
        C1471d c1471d = (C1471d) this.f22238a.J(oa.j.f18567m3);
        if (c1471d == null) {
            return null;
        }
        byte[] bArr = ((oa.q) c1471d.J(oa.j.f18436D2)).f18640a;
        if (bArr.length >= 12) {
            return new C0366a(bArr, 25);
        }
        return null;
    }

    public final boolean e(int i3) {
        if (this.f22240c == -1) {
            this.f22240c = this.f22238a.N(oa.j.f18548h1, null, 0);
        }
        return (i3 & this.f22240c) != 0;
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return this.f22238a;
    }

    public n(C1471d c1471d) {
        this.f22238a = c1471d;
    }
}
