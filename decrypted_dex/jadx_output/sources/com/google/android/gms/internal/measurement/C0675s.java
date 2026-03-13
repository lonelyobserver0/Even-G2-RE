package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0675s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11658a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11659b;

    public C0675s(int i3) {
        this.f11659b = i3;
    }

    public static C0646m c(p2.h hVar, ArrayList arrayList) {
        EnumC0695w enumC0695w = EnumC0695w.f11707b;
        a4.f.M(2, StubApp.getString2(12210), arrayList);
        InterfaceC0651n c10 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0));
        InterfaceC0651n c11 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(1));
        if (!(c11 instanceof C0601d)) {
            throw new IllegalArgumentException(E1.a.j(StubApp.getString2(12211), c11.getClass().getCanonicalName()));
        }
        List n10 = ((C0601d) c11).n();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new C0646m(c10.b(), (ArrayList) n10, arrayList2, hVar);
    }

    public static boolean d(InterfaceC0651n interfaceC0651n, InterfaceC0651n interfaceC0651n2) {
        if (interfaceC0651n instanceof InterfaceC0631j) {
            interfaceC0651n = new C0666q(interfaceC0651n.b());
        }
        if (interfaceC0651n2 instanceof InterfaceC0631j) {
            interfaceC0651n2 = new C0666q(interfaceC0651n2.b());
        }
        if ((interfaceC0651n instanceof C0666q) && (interfaceC0651n2 instanceof C0666q)) {
            return ((C0666q) interfaceC0651n).f11647a.compareTo(((C0666q) interfaceC0651n2).f11647a) < 0;
        }
        double doubleValue = interfaceC0651n.d().doubleValue();
        double doubleValue2 = interfaceC0651n2.d().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static InterfaceC0651n e(C0690v c0690v, InterfaceC0651n interfaceC0651n, InterfaceC0651n interfaceC0651n2) {
        if (interfaceC0651n instanceof Iterable) {
            return g(c0690v, ((Iterable) interfaceC0651n).iterator(), interfaceC0651n2);
        }
        throw new IllegalArgumentException(StubApp.getString2(12212));
    }

    public static boolean f(InterfaceC0651n interfaceC0651n, InterfaceC0651n interfaceC0651n2) {
        if (interfaceC0651n.getClass().equals(interfaceC0651n2.getClass())) {
            if ((interfaceC0651n instanceof r) || (interfaceC0651n instanceof C0641l)) {
                return true;
            }
            return interfaceC0651n instanceof C0616g ? (Double.isNaN(interfaceC0651n.d().doubleValue()) || Double.isNaN(interfaceC0651n2.d().doubleValue()) || interfaceC0651n.d().doubleValue() != interfaceC0651n2.d().doubleValue()) ? false : true : interfaceC0651n instanceof C0666q ? interfaceC0651n.b().equals(interfaceC0651n2.b()) : interfaceC0651n instanceof C0606e ? interfaceC0651n.a().equals(interfaceC0651n2.a()) : interfaceC0651n == interfaceC0651n2;
        }
        if (((interfaceC0651n instanceof r) || (interfaceC0651n instanceof C0641l)) && ((interfaceC0651n2 instanceof r) || (interfaceC0651n2 instanceof C0641l))) {
            return true;
        }
        boolean z2 = interfaceC0651n instanceof C0616g;
        if (z2 && (interfaceC0651n2 instanceof C0666q)) {
            return f(interfaceC0651n, new C0616g(interfaceC0651n2.d()));
        }
        boolean z10 = interfaceC0651n instanceof C0666q;
        if ((!z10 || !(interfaceC0651n2 instanceof C0616g)) && !(interfaceC0651n instanceof C0606e)) {
            if (interfaceC0651n2 instanceof C0606e) {
                return f(interfaceC0651n, new C0616g(interfaceC0651n2.d()));
            }
            if ((z10 || z2) && (interfaceC0651n2 instanceof InterfaceC0631j)) {
                return f(interfaceC0651n, new C0666q(interfaceC0651n2.b()));
            }
            if ((interfaceC0651n instanceof InterfaceC0631j) && ((interfaceC0651n2 instanceof C0666q) || (interfaceC0651n2 instanceof C0616g))) {
                return f(new C0666q(interfaceC0651n.b()), interfaceC0651n2);
            }
            return false;
        }
        return f(new C0616g(interfaceC0651n.d()), interfaceC0651n2);
    }

    public static InterfaceC0651n g(C0690v c0690v, Iterator it, InterfaceC0651n interfaceC0651n) {
        p2.h m4;
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC0651n interfaceC0651n2 = (InterfaceC0651n) it.next();
                switch (c0690v.f11678a) {
                    case 0:
                        m4 = c0690v.f11679b.m();
                        String str = c0690v.f11680c;
                        m4.p(str, interfaceC0651n2);
                        ((HashMap) m4.f19674d).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        m4 = c0690v.f11679b.m();
                        m4.p(c0690v.f11680c, interfaceC0651n2);
                        break;
                    default:
                        String str2 = c0690v.f11680c;
                        m4 = c0690v.f11679b;
                        m4.p(str2, interfaceC0651n2);
                        break;
                }
                InterfaceC0651n l9 = m4.l((C0601d) interfaceC0651n);
                if (l9 instanceof C0611f) {
                    C0611f c0611f = (C0611f) l9;
                    if (StubApp.getString2(12213).equals(c0611f.f11559b)) {
                        return InterfaceC0651n.f11619U;
                    }
                    if (StubApp.getString2(8082).equals(c0611f.f11559b)) {
                        return c0611f;
                    }
                }
            }
        }
        return InterfaceC0651n.f11619U;
    }

    public static boolean h(InterfaceC0651n interfaceC0651n, InterfaceC0651n interfaceC0651n2) {
        if (interfaceC0651n instanceof InterfaceC0631j) {
            interfaceC0651n = new C0666q(interfaceC0651n.b());
        }
        if (interfaceC0651n2 instanceof InterfaceC0631j) {
            interfaceC0651n2 = new C0666q(interfaceC0651n2.b());
        }
        return (((interfaceC0651n instanceof C0666q) && (interfaceC0651n2 instanceof C0666q)) || !(Double.isNaN(interfaceC0651n.d().doubleValue()) || Double.isNaN(interfaceC0651n2.d().doubleValue()))) && !d(interfaceC0651n2, interfaceC0651n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x0a2e, code lost:
    
        if (r0.equals(r4.f11559b) != false) goto L303;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0651n a(java.lang.String r13, p2.h r14, java.util.ArrayList r15) {
        /*
            Method dump skipped, instructions count: 4256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0675s.a(java.lang.String, p2.h, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final void b(String str) {
        if (!this.f11658a.contains(a4.f.S(str))) {
            throw new IllegalArgumentException(StubApp.getString2(11922));
        }
        throw new UnsupportedOperationException(StubApp.getString2(12282).concat(String.valueOf(str)));
    }
}
