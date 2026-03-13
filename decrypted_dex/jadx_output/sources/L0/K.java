package L0;

import M4.C0150v;
import com.stub.StubApp;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o0.AbstractC1416M;
import o0.C1441p;
import o0.C1442q;
import o0.C1443r;
import o0.C1445t;
import o0.C1447v;
import r0.AbstractC1560u;
import t0.InterfaceC1726z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K extends AbstractC0115k {

    /* renamed from: v, reason: collision with root package name */
    public static final C1447v f3909v;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0105a[] f3910l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3911m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC1416M[] f3912n;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3913p;

    /* renamed from: q, reason: collision with root package name */
    public final I4.e f3914q;

    /* renamed from: r, reason: collision with root package name */
    public int f3915r;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f3916s;

    /* renamed from: t, reason: collision with root package name */
    public B0.v f3917t;

    static {
        T0.s sVar = new T0.s();
        M4.G g10 = M4.I.f4549b;
        M4.Z z2 = M4.Z.f4578e;
        List list = Collections.EMPTY_LIST;
        M4.Z z10 = M4.Z.f4578e;
        C1442q c1442q = new C1442q();
        C1445t c1445t = C1445t.f18247a;
        f3909v = new C1447v(StubApp.getString2(3293), new C1441p(sVar), null, new C1443r(c1442q), o0.y.f18281B, c1445t);
    }

    public K(AbstractC0105a... abstractC0105aArr) {
        I4.e eVar = new I4.e(12);
        this.f3910l = abstractC0105aArr;
        this.f3914q = eVar;
        this.f3913p = new ArrayList(Arrays.asList(abstractC0105aArr));
        this.f3915r = -1;
        this.f3911m = new ArrayList(abstractC0105aArr.length);
        for (int i3 = 0; i3 < abstractC0105aArr.length; i3++) {
            this.f3911m.add(new ArrayList());
        }
        this.f3912n = new AbstractC1416M[abstractC0105aArr.length];
        this.f3916s = new long[0][];
        new HashMap();
        M4.r.d(8, StubApp.getString2(3294));
        M4.r.d(2, StubApp.getString2(3295));
        new M4.W(C0150v.b(8)).f4574f = new M4.V();
    }

    @Override // L0.AbstractC0105a
    public final InterfaceC0129z b(B b2, P0.e eVar, long j) {
        AbstractC0105a[] abstractC0105aArr = this.f3910l;
        int length = abstractC0105aArr.length;
        InterfaceC0129z[] interfaceC0129zArr = new InterfaceC0129z[length];
        AbstractC1416M[] abstractC1416MArr = this.f3912n;
        int b10 = abstractC1416MArr[0].b(b2.f3881a);
        for (int i3 = 0; i3 < length; i3++) {
            B a3 = b2.a(abstractC1416MArr[i3].l(b10));
            interfaceC0129zArr[i3] = abstractC0105aArr[i3].b(a3, eVar, j - this.f3916s[b10][i3]);
            ((List) this.f3911m.get(i3)).add(new J(a3, interfaceC0129zArr[i3]));
        }
        return new I(this.f3914q, this.f3916s[b10], interfaceC0129zArr);
    }

    @Override // L0.AbstractC0105a
    public final C1447v h() {
        AbstractC0105a[] abstractC0105aArr = this.f3910l;
        return abstractC0105aArr.length > 0 ? abstractC0105aArr[0].h() : f3909v;
    }

    @Override // L0.AbstractC0115k, L0.AbstractC0105a
    public final void j() {
        B0.v vVar = this.f3917t;
        if (vVar != null) {
            throw vVar;
        }
        super.j();
    }

    @Override // L0.AbstractC0105a
    public final void l(InterfaceC1726z interfaceC1726z) {
        this.f4105k = interfaceC1726z;
        this.j = AbstractC1560u.m(null);
        int i3 = 0;
        while (true) {
            AbstractC0105a[] abstractC0105aArr = this.f3910l;
            if (i3 >= abstractC0105aArr.length) {
                return;
            }
            A(Integer.valueOf(i3), abstractC0105aArr[i3]);
            i3++;
        }
    }

    @Override // L0.AbstractC0105a
    public final void n(InterfaceC0129z interfaceC0129z) {
        I i3 = (I) interfaceC0129z;
        int i10 = 0;
        while (true) {
            AbstractC0105a[] abstractC0105aArr = this.f3910l;
            if (i10 >= abstractC0105aArr.length) {
                return;
            }
            List list = (List) this.f3911m.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((J) list.get(i11)).f3908b.equals(interfaceC0129z)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            AbstractC0105a abstractC0105a = abstractC0105aArr[i10];
            InterfaceC0129z interfaceC0129z2 = i3.f3899a[i10];
            if (interfaceC0129z2 instanceof f0) {
                interfaceC0129z2 = ((f0) interfaceC0129z2).f4077a;
            }
            abstractC0105a.n(interfaceC0129z2);
            i10++;
        }
    }

    @Override // L0.AbstractC0115k, L0.AbstractC0105a
    public final void q() {
        super.q();
        Arrays.fill(this.f3912n, (Object) null);
        this.f3915r = -1;
        this.f3917t = null;
        ArrayList arrayList = this.f3913p;
        arrayList.clear();
        Collections.addAll(arrayList, this.f3910l);
    }

    @Override // L0.AbstractC0105a
    public final void v(C1447v c1447v) {
        this.f3910l[0].v(c1447v);
    }

    @Override // L0.AbstractC0115k
    public final B w(Object obj, B b2) {
        ArrayList arrayList = this.f3911m;
        List list = (List) arrayList.get(((Integer) obj).intValue());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((J) list.get(i3)).f3907a.equals(b2)) {
                return ((J) ((List) arrayList.get(0)).get(i3)).f3907a;
            }
        }
        return null;
    }

    @Override // L0.AbstractC0115k
    public final void z(Object obj, AbstractC0105a abstractC0105a, AbstractC1416M abstractC1416M) {
        Integer num = (Integer) obj;
        if (this.f3917t != null) {
            return;
        }
        if (this.f3915r == -1) {
            this.f3915r = abstractC1416M.h();
        } else if (abstractC1416M.h() != this.f3915r) {
            this.f3917t = new B0.v();
            return;
        }
        int length = this.f3916s.length;
        AbstractC1416M[] abstractC1416MArr = this.f3912n;
        if (length == 0) {
            this.f3916s = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f3915r, abstractC1416MArr.length);
        }
        ArrayList arrayList = this.f3913p;
        arrayList.remove(abstractC0105a);
        abstractC1416MArr[num.intValue()] = abstractC1416M;
        if (arrayList.isEmpty()) {
            m(abstractC1416MArr[0]);
        }
    }
}
