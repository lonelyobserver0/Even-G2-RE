package L0;

import java.util.ArrayList;
import o0.AbstractC1416M;
import o0.C1415L;
import r0.AbstractC1550k;

/* renamed from: L0.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0111g extends i0 {

    /* renamed from: m, reason: collision with root package name */
    public final long f4080m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4081n;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f4082p;

    /* renamed from: q, reason: collision with root package name */
    public final C1415L f4083q;

    /* renamed from: r, reason: collision with root package name */
    public C0109e f4084r;

    /* renamed from: s, reason: collision with root package name */
    public C0110f f4085s;

    /* renamed from: t, reason: collision with root package name */
    public long f4086t;

    /* renamed from: v, reason: collision with root package name */
    public long f4087v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0111g(AbstractC0105a abstractC0105a, long j, boolean z2) {
        super(abstractC0105a);
        abstractC0105a.getClass();
        this.f4080m = j;
        this.f4081n = z2;
        this.f4082p = new ArrayList();
        this.f4083q = new C1415L();
    }

    @Override // L0.i0
    public final void C(AbstractC1416M abstractC1416M) {
        if (this.f4085s != null) {
            return;
        }
        F(abstractC1416M);
    }

    public final void F(AbstractC1416M abstractC1416M) {
        long j;
        C1415L c1415l = this.f4083q;
        abstractC1416M.n(0, c1415l);
        long j3 = c1415l.f18065p;
        C0109e c0109e = this.f4084r;
        ArrayList arrayList = this.f4082p;
        long j10 = this.f4080m;
        if (c0109e == null || arrayList.isEmpty()) {
            this.f4086t = j3;
            this.f4087v = j10 != Long.MIN_VALUE ? j3 + j10 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0108d c0108d = (C0108d) arrayList.get(i3);
                long j11 = this.f4086t;
                long j12 = this.f4087v;
                c0108d.f4056e = j11;
                c0108d.f4057f = j12;
            }
            j = 0;
        } else {
            j = this.f4086t - j3;
            j10 = j10 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f4087v - j3;
        }
        try {
            C0109e c0109e2 = new C0109e(abstractC1416M, j, j10);
            this.f4084r = c0109e2;
            m(c0109e2);
        } catch (C0110f e10) {
            this.f4085s = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((C0108d) arrayList.get(i10)).f4058g = this.f4085s;
            }
        }
    }

    @Override // L0.AbstractC0105a
    public final InterfaceC0129z b(B b2, P0.e eVar, long j) {
        C0108d c0108d = new C0108d(this.f4100l.b(b2, eVar, j), this.f4081n, this.f4086t, this.f4087v);
        this.f4082p.add(c0108d);
        return c0108d;
    }

    @Override // L0.AbstractC0115k, L0.AbstractC0105a
    public final void j() {
        C0110f c0110f = this.f4085s;
        if (c0110f != null) {
            throw c0110f;
        }
        super.j();
    }

    @Override // L0.AbstractC0105a
    public final void n(InterfaceC0129z interfaceC0129z) {
        ArrayList arrayList = this.f4082p;
        AbstractC1550k.g(arrayList.remove(interfaceC0129z));
        this.f4100l.n(((C0108d) interfaceC0129z).f4052a);
        if (arrayList.isEmpty()) {
            C0109e c0109e = this.f4084r;
            c0109e.getClass();
            F(c0109e.f4123b);
        }
    }

    @Override // L0.AbstractC0115k, L0.AbstractC0105a
    public final void q() {
        super.q();
        this.f4085s = null;
        this.f4084r = null;
    }
}
