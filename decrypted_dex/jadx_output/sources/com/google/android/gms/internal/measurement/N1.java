package com.google.android.gms.internal.measurement;

import Z9.C0366a;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import l4.C1179g0;
import l4.CallableC1176f0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class N1 extends AbstractC0621h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11314c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11315d;

    public N1(C0366a c0366a) {
        super(StubApp.getString2(11763));
        this.f11315d = c0366a;
        HashMap hashMap = this.f11577b;
        q4 q4Var = new q4(this, false, true);
        String string2 = StubApp.getString2(11764);
        hashMap.put(string2, q4Var);
        HashMap hashMap2 = this.f11577b;
        String string22 = StubApp.getString2(752);
        hashMap2.put(string22, new C0703x2(string22, 1));
        ((AbstractC0621h) this.f11577b.get(string22)).g(string2, new q4(this, true, true));
        HashMap hashMap3 = this.f11577b;
        String string23 = StubApp.getString2(11765);
        hashMap3.put(string23, new C0703x2(string23, 2));
        ((AbstractC0621h) this.f11577b.get(string23)).g(string2, new q4(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0621h
    public final InterfaceC0651n e(p2.h hVar, List list) {
        TreeMap treeMap;
        switch (this.f11314c) {
            case 0:
                a4.f.L(3, this.f11576a, list);
                String b2 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) list.get(0)).b();
                InterfaceC0651n interfaceC0651n = (InterfaceC0651n) list.get(1);
                C0680t c0680t = (C0680t) hVar.f19672b;
                long X10 = (long) a4.f.X(c0680t.c(hVar, interfaceC0651n).d().doubleValue());
                InterfaceC0651n c10 = c0680t.c(hVar, (InterfaceC0651n) list.get(2));
                HashMap Z10 = c10 instanceof C0636k ? a4.f.Z((C0636k) c10) : new HashMap();
                a5.c cVar = (a5.c) this.f11315d;
                cVar.getClass();
                HashMap hashMap = new HashMap();
                for (String str : Z10.keySet()) {
                    HashMap hashMap2 = ((C0591b) cVar.f9282b).f11449c;
                    hashMap.put(str, C0591b.b(str, hashMap2.containsKey(str) ? hashMap2.get(str) : null, Z10.get(str)));
                }
                ((ArrayList) cVar.f9284d).add(new C0591b(b2, X10, hashMap));
                return InterfaceC0651n.f11619U;
            case 1:
                a4.f.L(2, StubApp.getString2(11766), list);
                InterfaceC0651n c11 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) list.get(0));
                InterfaceC0651n c12 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) list.get(1));
                String b10 = c11.b();
                V6.b bVar = (V6.b) this.f11315d;
                Map map = (Map) ((C1179g0) bVar.f7762c).f16433d.get((String) bVar.f7761b);
                String str2 = (map == null || !map.containsKey(b10)) ? null : (String) map.get(b10);
                return str2 != null ? new C0666q(str2) : c12;
            case 2:
                return InterfaceC0651n.f11619U;
            case 3:
                try {
                    return android.support.v4.media.session.b.H(((CallableC1176f0) this.f11315d).call());
                } catch (Exception unused) {
                    return InterfaceC0651n.f11619U;
                }
            default:
                a4.f.L(3, this.f11576a, list);
                ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) list.get(0)).b();
                InterfaceC0651n interfaceC0651n2 = (InterfaceC0651n) list.get(1);
                C0680t c0680t2 = (C0680t) hVar.f19672b;
                InterfaceC0651n c13 = c0680t2.c(hVar, interfaceC0651n2);
                if (!(c13 instanceof C0646m)) {
                    throw new IllegalArgumentException(StubApp.getString2(11773));
                }
                InterfaceC0651n c14 = c0680t2.c(hVar, (InterfaceC0651n) list.get(2));
                if (!(c14 instanceof C0636k)) {
                    throw new IllegalArgumentException(StubApp.getString2(11772));
                }
                C0636k c0636k = (C0636k) c14;
                HashMap hashMap3 = c0636k.f11596a;
                String string2 = StubApp.getString2(660);
                if (!hashMap3.containsKey(string2)) {
                    throw new IllegalArgumentException(StubApp.getString2(11771));
                }
                String b11 = c0636k.f(string2).b();
                HashMap hashMap4 = c0636k.f11596a;
                String string22 = StubApp.getString2(1044);
                int W10 = hashMap4.containsKey(string22) ? a4.f.W(c0636k.f(string22).d().doubleValue()) : 1000;
                C0646m c0646m = (C0646m) c13;
                C0680t c0680t3 = (C0680t) this.f11315d;
                c0680t3.getClass();
                if (StubApp.getString2(11768).equals(b11)) {
                    treeMap = (TreeMap) c0680t3.f11661b;
                } else {
                    if (!StubApp.getString2(11769).equals(b11)) {
                        throw new IllegalStateException(StubApp.getString2(11770).concat(String.valueOf(b11)));
                    }
                    treeMap = (TreeMap) c0680t3.f11660a;
                }
                if (treeMap.containsKey(Integer.valueOf(W10))) {
                    W10 = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(W10), c0646m);
                return InterfaceC0651n.f11619U;
        }
    }

    public N1(a5.c cVar) {
        super(StubApp.getString2(11627));
        this.f11315d = cVar;
    }

    public N1(C0680t c0680t) {
        super(StubApp.getString2(11626));
        this.f11315d = c0680t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(C0703x2 c0703x2, V6.b bVar) {
        super(StubApp.getString2(11766));
        this.f11315d = bVar;
    }

    public N1(CallableC1176f0 callableC1176f0) {
        super(StubApp.getString2(11767));
        this.f11315d = callableC1176f0;
    }
}
