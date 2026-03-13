package pb;

import L0.A;
import L0.AbstractC0105a;
import L0.C0119o;
import L0.c0;
import M4.I;
import M4.Z;
import android.content.Context;
import android.media.Spatializer;
import android.os.Handler;
import android.view.Surface;
import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.AbstractC1448w;
import o0.C1408E;
import o0.C1428c;
import o0.C1447v;
import o0.InterfaceC1410G;
import qb.C1537d;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1549j;
import r0.C1556q;
import r0.C1557r;
import r0.InterfaceC1546g;
import sb.C1644e0;
import sb.C1674t0;
import v0.C1799B;
import v0.C1802E;
import v0.C1809d;
import v0.C1818m;
import v0.C1829y;
import v0.C1830z;
import v0.InterfaceC1820o;
import v0.V;
import v0.W;
import v0.a0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class r implements m {

    /* renamed from: a, reason: collision with root package name */
    public final t f19797a;

    /* renamed from: b, reason: collision with root package name */
    public final TextureRegistry$SurfaceProducer f19798b;

    /* renamed from: c, reason: collision with root package name */
    public kb.e f19799c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1820o f19800d;

    public r(t tVar, C1447v c1447v, R4.b bVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, C1537d c1537d) {
        C1830z c1830z;
        this.f19797a = tVar;
        this.f19798b = textureRegistry$SurfaceProducer;
        switch (c1537d.f20133a) {
            case 0:
                Context context = c1537d.f20134b;
                C1818m c1818m = new C1818m(context);
                A b2 = c1537d.f20135c.b(context);
                AbstractC1550k.g(!c1818m.f21795q);
                c1818m.f21783d = new C0119o(b2, r4);
                AbstractC1550k.g(!c1818m.f21795q);
                c1818m.f21795q = true;
                int i3 = AbstractC1560u.f20190a;
                c1830z = new C1830z(c1818m);
                break;
            default:
                Context context2 = c1537d.f20134b;
                C1818m c1818m2 = new C1818m(context2);
                A b10 = c1537d.f20135c.b(context2);
                AbstractC1550k.g(!c1818m2.f21795q);
                c1818m2.f21783d = new C0119o(b10, r4);
                AbstractC1550k.g(!c1818m2.f21795q);
                c1818m2.f21795q = true;
                int i10 = AbstractC1560u.f20190a;
                c1830z = new C1830z(c1818m2);
                break;
        }
        C1830z c1830z2 = c1830z;
        this.f19800d = c1830z2;
        Z q10 = I.q(c1447v);
        c1830z2.L();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < q10.f4580d; i11++) {
            arrayList.add(c1830z2.f21855s.c((C1447v) q10.get(i11)));
        }
        c1830z2.L();
        c1830z2.u(c1830z2.f21861v0);
        c1830z2.r();
        c1830z2.f21821G++;
        ArrayList arrayList2 = c1830z2.f21851q;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i12 = size - 1; i12 >= 0; i12--) {
                arrayList2.remove(i12);
            }
            c0 c0Var = c1830z2.f21825L;
            int[] iArr = c0Var.f4050b;
            int[] iArr2 = new int[iArr.length - size];
            int i13 = 0;
            for (int i14 = 0; i14 < iArr.length; i14++) {
                int i15 = iArr[i14];
                if (i15 < 0 || i15 >= size) {
                    iArr2[i14 - i13] = i15 >= 0 ? i15 - size : i15;
                } else {
                    i13++;
                }
            }
            c1830z2.f21825L = new c0(iArr2, new Random(c0Var.f4049a.nextLong()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            V v2 = new V((AbstractC0105a) arrayList.get(i16), c1830z2.f21853r);
            arrayList3.add(v2);
            arrayList2.add(i16, new C1829y(v2.f21653b, v2.f21652a));
        }
        c1830z2.f21825L = c1830z2.f21825L.a(arrayList3.size());
        a0 a0Var = new a0(arrayList2, c1830z2.f21825L);
        boolean p8 = a0Var.p();
        int i17 = a0Var.f21692d;
        if (!p8 && -1 >= i17) {
            throw new Nb.b();
        }
        int a3 = a0Var.a(false);
        W z2 = c1830z2.z(c1830z2.f21861v0, a0Var, c1830z2.A(a0Var, a3, -9223372036854775807L));
        int i18 = z2.f21662e;
        if (a3 != -1 && i18 != 1) {
            i18 = (a0Var.p() || a3 >= i17) ? 4 : 2;
        }
        W g10 = z2.g(i18);
        c1830z2.f21842l.j.a(17, new C1799B(arrayList3, c1830z2.f21825L, a3, AbstractC1560u.J(-9223372036854775807L))).b();
        c1830z2.J(g10, 0, (c1830z2.f21861v0.f21659b.f3881a.equals(g10.f21659b.f3881a) || c1830z2.f21861v0.f21658a.p()) ? false : true, 4, c1830z2.s(g10), -1);
        ((C1830z) this.f19800d).C();
        InterfaceC1820o interfaceC1820o = this.f19800d;
        AbstractC1498a b11 = b(interfaceC1820o, textureRegistry$SurfaceProducer);
        C1830z c1830z3 = (C1830z) interfaceC1820o;
        c1830z3.getClass();
        c1830z3.f21844m.a(b11);
        InterfaceC1820o interfaceC1820o2 = this.f19800d;
        boolean z10 = bVar.f6177b;
        C1428c c1428c = new C1428c(3);
        C1830z c1830z4 = (C1830z) interfaceC1820o2;
        c1830z4.L();
        if (c1830z4.f21856s0) {
            return;
        }
        boolean equals = Objects.equals(c1830z4.f21845m0, c1428c);
        C1549j c1549j = c1830z4.f21844m;
        if (!equals) {
            c1830z4.f21845m0 = c1428c;
            c1830z4.E(1, 3, c1428c);
            c1549j.c(20, new C1644e0(c1428c, 6));
        }
        C1428c c1428c2 = !z10 ? c1428c : null;
        C1809d c1809d = c1830z4.f21816B;
        c1809d.b(c1428c2);
        c1830z4.f21839h.a(c1428c);
        boolean w10 = c1830z4.w();
        c1830z4.L();
        int d8 = c1809d.d(c1830z4.f21861v0.f21662e, w10);
        c1830z4.I(d8, d8 == -1 ? 2 : 1, w10);
        c1549j.b();
    }

    public abstract AbstractC1498a b(InterfaceC1820o interfaceC1820o, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer);

    public void c() {
        String str;
        boolean z2;
        O0.l lVar;
        O0.k kVar;
        kb.e eVar = this.f19799c;
        if (eVar != null) {
            m.a((BinaryMessenger) eVar.f15529a, (String) eVar.f15530b, null);
        }
        C1830z c1830z = (C1830z) this.f19800d;
        c1830z.getClass();
        String string2 = StubApp.getString2(11614);
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(22170));
        sb2.append(Integer.toHexString(System.identityHashCode(c1830z)));
        sb2.append(StubApp.getString2(22171));
        sb2.append(AbstractC1560u.f20194e);
        sb2.append(StubApp.getString2(1642));
        HashSet hashSet = AbstractC1448w.f18254a;
        synchronized (AbstractC1448w.class) {
            str = AbstractC1448w.f18255b;
        }
        sb2.append(str);
        sb2.append(StubApp.getString2(511));
        AbstractC1550k.o(string2, sb2.toString());
        c1830z.L();
        c1830z.f21815A.a();
        c1830z.f21817C.getClass();
        c1830z.f21818D.getClass();
        C1809d c1809d = c1830z.f21816B;
        c1809d.f21710c = null;
        c1809d.a();
        c1809d.c(0);
        C1802E c1802e = c1830z.f21842l;
        synchronized (c1802e) {
            if (!c1802e.f21540F && c1802e.f21563l.getThread().isAlive()) {
                c1802e.j.e(7);
                c1802e.n0(new C0119o(c1802e, 2), c1802e.f21579y);
                z2 = c1802e.f21540F;
            }
            z2 = true;
        }
        if (!z2) {
            c1830z.f21844m.e(10, new C1674t0(9));
        }
        c1830z.f21844m.d();
        c1830z.j.f20185a.removeCallbacksAndMessages(null);
        P0.d dVar = c1830z.f21862w;
        w0.c cVar = c1830z.f21857t;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((P0.h) dVar).f5405b.f29a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            P0.c cVar2 = (P0.c) it.next();
            if (cVar2.f5383b == cVar) {
                cVar2.f5384c = true;
                copyOnWriteArrayList.remove(cVar2);
            }
        }
        W w10 = c1830z.f21861v0;
        if (w10.f21672p) {
            c1830z.f21861v0 = w10.a();
        }
        W g10 = c1830z.f21861v0.g(1);
        c1830z.f21861v0 = g10;
        W b2 = g10.b(g10.f21659b);
        c1830z.f21861v0 = b2;
        b2.f21673q = b2.f21675s;
        c1830z.f21861v0.f21674r = 0L;
        w0.c cVar3 = c1830z.f21857t;
        C1557r c1557r = cVar3.f21996h;
        AbstractC1550k.h(c1557r);
        c1557r.c(new no.nordicsemi.android.ble.v(cVar3, 5));
        O0.q qVar = (O0.q) c1830z.f21839h;
        synchronized (qVar.f5173c) {
            try {
                if (AbstractC1560u.f20190a >= 32 && (lVar = qVar.f5177g) != null && (kVar = (O0.k) lVar.f5145d) != null && ((Handler) lVar.f5144c) != null) {
                    ((Spatializer) lVar.f5143b).removeOnSpatializerStateChangedListener(kVar);
                    ((Handler) lVar.f5144c).removeCallbacksAndMessages(null);
                    lVar.f5144c = null;
                    lVar.f5145d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        qVar.f5187a = null;
        qVar.f5188b = null;
        c1830z.D();
        Surface surface = c1830z.f21831Y;
        if (surface != null) {
            surface.release();
            c1830z.f21831Y = null;
        }
        int i3 = q0.c.f19860b;
        c1830z.f21856s0 = true;
    }

    public final void d(Boolean bool) {
        int i3 = bool.booleanValue() ? 2 : 0;
        C1830z c1830z = (C1830z) this.f19800d;
        c1830z.L();
        if (c1830z.f21820F != i3) {
            c1830z.f21820F = i3;
            C1557r c1557r = c1830z.f21842l.j;
            c1557r.getClass();
            C1556q b2 = C1557r.b();
            b2.f20183a = c1557r.f20185a.obtainMessage(11, i3, 0);
            b2.b();
            Ja.b bVar = new Ja.b(i3, 3);
            C1549j c1549j = c1830z.f21844m;
            c1549j.c(8, bVar);
            c1830z.H();
            c1549j.b();
        }
    }

    public final void e(Double d8) {
        C1408E c1408e = new C1408E(d8.floatValue());
        C1830z c1830z = (C1830z) this.f19800d;
        c1830z.L();
        if (c1830z.f21861v0.f21671o.equals(c1408e)) {
            return;
        }
        W f10 = c1830z.f21861v0.f(c1408e);
        c1830z.f21821G++;
        c1830z.f21842l.j.a(4, c1408e).b();
        c1830z.J(f10, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void f(Double d8) {
        float max = (float) Math.max(0.0d, Math.min(1.0d, d8.doubleValue()));
        C1830z c1830z = (C1830z) this.f19800d;
        c1830z.L();
        final float h2 = AbstractC1560u.h(max, 0.0f, 1.0f);
        if (c1830z.f21847n0 == h2) {
            return;
        }
        c1830z.f21847n0 = h2;
        c1830z.E(1, 2, Float.valueOf(c1830z.f21816B.f21714g * h2));
        c1830z.f21844m.e(22, new InterfaceC1546g() { // from class: v0.t
            @Override // r0.InterfaceC1546g
            /* renamed from: invoke */
            public final void mo0invoke(Object obj) {
                ((InterfaceC1410G) obj).g(h2);
            }
        });
    }
}
