package l4;

import com.google.android.gms.internal.measurement.C0598c1;
import com.google.android.gms.internal.measurement.C0603d1;
import com.google.android.gms.internal.measurement.C0663p1;
import com.google.android.gms.internal.measurement.C0668q1;
import com.google.android.gms.internal.measurement.C0672r1;
import com.google.android.gms.internal.measurement.C0676s0;
import com.google.android.gms.internal.measurement.C0677s1;
import com.google.android.gms.internal.measurement.C0689u3;
import com.google.android.gms.internal.measurement.C0711z0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import t.C1689b;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class N1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16191a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16192b;

    /* renamed from: c, reason: collision with root package name */
    public final C0668q1 f16193c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f16194d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f16195e;

    /* renamed from: f, reason: collision with root package name */
    public final C1692e f16196f;

    /* renamed from: g, reason: collision with root package name */
    public final C1692e f16197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1166c f16198h;

    public N1(C1166c c1166c, String str, C0668q1 c0668q1, BitSet bitSet, BitSet bitSet2, C1692e c1692e, C1692e c1692e2) {
        Objects.requireNonNull(c1166c);
        this.f16198h = c1166c;
        this.f16191a = str;
        this.f16194d = bitSet;
        this.f16195e = bitSet2;
        this.f16196f = c1692e;
        this.f16197g = new C1692e(0);
        Iterator it = ((C1689b) c1692e2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c1692e2.get(num));
            this.f16197g.put(num, arrayList);
        }
        this.f16192b = false;
        this.f16193c = c0668q1;
    }

    public final void a(C1163b c1163b) {
        int q10;
        boolean z2;
        boolean v2;
        switch (c1163b.f16362g) {
            case 0:
                q10 = ((C0676s0) c1163b.f16364i).q();
                break;
            default:
                q10 = ((C0711z0) c1163b.f16364i).q();
                break;
        }
        if (c1163b.f16358c != null) {
            this.f16195e.set(q10, true);
        }
        Boolean bool = c1163b.f16359d;
        if (bool != null) {
            this.f16194d.set(q10, bool.booleanValue());
        }
        if (c1163b.f16360e != null) {
            Integer valueOf = Integer.valueOf(q10);
            C1692e c1692e = this.f16196f;
            Long l9 = (Long) c1692e.get(valueOf);
            long longValue = c1163b.f16360e.longValue() / 1000;
            if (l9 == null || longValue > l9.longValue()) {
                c1692e.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (c1163b.f16361f != null) {
            C1692e c1692e2 = this.f16197g;
            Integer valueOf2 = Integer.valueOf(q10);
            List list = (List) c1692e2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                c1692e2.put(valueOf2, list);
            }
            switch (c1163b.f16362g) {
                case 0:
                    z2 = false;
                    break;
                default:
                    z2 = true;
                    break;
            }
            if (z2) {
                list.clear();
            }
            C0689u3.a();
            C1200n0 c1200n0 = (C1200n0) this.f16198h.f4728a;
            C1178g c1178g = c1200n0.f16539d;
            C1147C c1147c = AbstractC1148D.f15933F0;
            String str = this.f16191a;
            if (c1178g.u(str, c1147c)) {
                switch (c1163b.f16362g) {
                    case 0:
                        v2 = ((C0676s0) c1163b.f16364i).v();
                        break;
                    default:
                        v2 = false;
                        break;
                }
                if (v2) {
                    list.clear();
                }
            }
            C0689u3.a();
            if (!c1200n0.f16539d.u(str, c1147c)) {
                list.add(Long.valueOf(c1163b.f16361f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(c1163b.f16361f.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public final com.google.android.gms.internal.measurement.X0 b(int i3) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.W0 w10 = com.google.android.gms.internal.measurement.X0.w();
        w10.b();
        ((com.google.android.gms.internal.measurement.X0) w10.f11593b).x(i3);
        w10.b();
        ((com.google.android.gms.internal.measurement.X0) w10.f11593b).A(this.f16192b);
        C0668q1 c0668q1 = this.f16193c;
        if (c0668q1 != null) {
            w10.b();
            ((com.google.android.gms.internal.measurement.X0) w10.f11593b).z(c0668q1);
        }
        C0663p1 x7 = C0668q1.x();
        ArrayList S5 = W.S(this.f16194d);
        x7.b();
        ((C0668q1) x7.f11593b).B(S5);
        ArrayList S10 = W.S(this.f16195e);
        x7.b();
        ((C0668q1) x7.f11593b).z(S10);
        C1692e c1692e = this.f16196f;
        if (c1692e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(c1692e.f21040c);
            Iterator it = ((C1689b) c1692e.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l9 = (Long) c1692e.get(num);
                if (l9 != null) {
                    C0598c1 t3 = C0603d1.t();
                    t3.b();
                    ((C0603d1) t3.f11593b).u(intValue);
                    long longValue = l9.longValue();
                    t3.b();
                    ((C0603d1) t3.f11593b).v(longValue);
                    arrayList2.add((C0603d1) t3.e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            x7.b();
            ((C0668q1) x7.f11593b).D(arrayList);
        }
        C1692e c1692e2 = this.f16197g;
        if (c1692e2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(c1692e2.f21040c);
            Iterator it2 = ((C1689b) c1692e2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                C0672r1 u2 = C0677s1.u();
                int intValue2 = num2.intValue();
                u2.b();
                ((C0677s1) u2.f11593b).v(intValue2);
                List list2 = (List) c1692e2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    u2.b();
                    ((C0677s1) u2.f11593b).w(list2);
                }
                arrayList3.add((C0677s1) u2.e());
            }
            list = arrayList3;
        }
        x7.b();
        ((C0668q1) x7.f11593b).F(list);
        w10.b();
        ((com.google.android.gms.internal.measurement.X0) w10.f11593b).y((C0668q1) x7.e());
        return (com.google.android.gms.internal.measurement.X0) w10.e();
    }

    public N1(C1166c c1166c, String str) {
        Objects.requireNonNull(c1166c);
        this.f16198h = c1166c;
        this.f16191a = str;
        this.f16192b = true;
        this.f16194d = new BitSet();
        this.f16195e = new BitSet();
        this.f16196f = new C1692e(0);
        this.f16197g = new C1692e(0);
    }
}
