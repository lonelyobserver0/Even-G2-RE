package Rc;

import com.stub.StubApp;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class N {

    /* renamed from: e, reason: collision with root package name */
    public static final Integer f6387e;

    /* renamed from: f, reason: collision with root package name */
    public static final Qc.c f6388f;

    /* renamed from: g, reason: collision with root package name */
    public static final L f6389g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0261j f6390h;

    /* renamed from: a, reason: collision with root package name */
    public final int f6391a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumMap f6392b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6393c;

    /* renamed from: d, reason: collision with root package name */
    public final Qc.c f6394d;

    static {
        F f10 = K.f6364e;
        H h2 = K.f6366g;
        I i3 = K.f6367h;
        J j = K.j;
        C0265n c0265n = K.f6369l;
        EnumSet.of((C0265n) f10, (C0265n) h2, (C0265n) i3, (C0265n) j, c0265n);
        HashMap hashMap = new HashMap(32);
        EnumSet of = EnumSet.of((J) i3, j);
        r rVar = K.f6372p;
        hashMap.put(of, EnumSet.of((r) i3, rVar));
        EnumSet of2 = EnumSet.of((C0265n) i3, (C0265n) j, c0265n);
        s sVar = K.f6373q;
        hashMap.put(of2, EnumSet.of((s) i3, (s) rVar, sVar));
        EnumSet of3 = EnumSet.of((I) h2, i3);
        p pVar = K.f6371n;
        hashMap.put(of3, EnumSet.of((p) i3, pVar));
        hashMap.put(EnumSet.of((C0265n) h2, (C0265n) i3, c0265n), EnumSet.of((s) i3, (s) pVar, sVar));
        hashMap.put(EnumSet.of((J) h2, (J) i3, j), EnumSet.of((r) i3, (r) pVar, rVar));
        hashMap.put(EnumSet.of((C0265n) h2, (C0265n) i3, (C0265n) j, c0265n), EnumSet.of((s) i3, (s) pVar, (s) rVar, sVar));
        EnumSet of4 = EnumSet.of((I) f10, i3);
        C0266o c0266o = K.f6370m;
        hashMap.put(of4, EnumSet.of((C0266o) i3, c0266o));
        hashMap.put(EnumSet.of((C0265n) f10, (C0265n) i3, c0265n), EnumSet.of((s) i3, (s) c0266o, sVar));
        hashMap.put(EnumSet.of((J) f10, (J) i3, j), EnumSet.of((r) i3, (r) c0266o, rVar));
        hashMap.put(EnumSet.of((C0265n) f10, (C0265n) i3, (C0265n) j, c0265n), EnumSet.of((s) i3, (s) c0266o, (s) rVar, sVar));
        hashMap.put(EnumSet.of((I) f10, (I) h2, i3), EnumSet.of((p) i3, (p) c0266o, pVar));
        hashMap.put(EnumSet.of((C0265n) f10, (C0265n) h2, (C0265n) i3, c0265n), EnumSet.of((s) i3, (s) c0266o, (s) pVar, sVar));
        hashMap.put(EnumSet.of((J) f10, (J) h2, (J) i3, j), EnumSet.of((r) i3, (r) c0266o, (r) pVar, rVar));
        hashMap.put(EnumSet.of((C0265n) f10, (C0265n) h2, (C0265n) i3, (C0265n) j, c0265n), EnumSet.of((s) i3, (s) c0266o, (s) pVar, (s) rVar, sVar));
        f6387e = 1;
        f6388f = new Qc.c(4, Pc.b.f5657b);
        f6389g = L.f6383a;
        f6390h = new C0261j(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
    
        if (r14 != 1) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.google.android.gms.internal.measurement.F1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Qc.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Qc.g] */
    /* JADX WARN: Type inference failed for: r2v20, types: [Qc.g, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public N(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rc.N.<init>(java.lang.String):void");
    }

    public final EnumC0259h a() {
        return (EnumC0259h) this.f6392b.get(K.f6361b);
    }

    public final void b(Pc.a aVar) {
        EnumMap enumMap = this.f6392b;
        Qc.c cVar = this.f6394d;
        TimeZone timeZone = aVar.f5652b;
        if ((timeZone == null || Pc.a.f5650g.equals(timeZone)) && cVar.equals(aVar.f5651a)) {
            enumMap.put((EnumMap) K.f6380y, (A) aVar);
        } else {
            enumMap.put((EnumMap) K.f6380y, (A) new Pc.a(cVar, Pc.a.f5650g, aVar.a()));
        }
        enumMap.remove(K.f6381z);
    }

    public final String toString() {
        String string2;
        String string22;
        HashMap hashMap;
        Object obj;
        StringBuilder sb2 = new StringBuilder(160);
        D d8 = K.f6363d;
        EnumMap enumMap = this.f6392b;
        Qc.g gVar = (Qc.g) enumMap.get(d8);
        if (gVar == null) {
            gVar = f6388f;
        }
        K[] values = K.values();
        int length = values.length;
        boolean z2 = true;
        int i3 = 0;
        while (true) {
            string2 = StubApp.getString2(2359);
            string22 = StubApp.getString2(1262);
            if (i3 >= length) {
                break;
            }
            K k3 = values[i3];
            if (k3 != K.f6368k && k3 != K.f6365f && k3 != K.f6378w && (obj = enumMap.get(k3)) != null) {
                if (z2) {
                    z2 = false;
                } else {
                    sb2.append(string22);
                }
                sb2.append(k3.name());
                sb2.append(string2);
                k3.f6382a.x(sb2, obj, gVar);
            }
            i3++;
        }
        int i10 = this.f6391a;
        if ((i10 == 2 || i10 == 1) && (hashMap = this.f6393c) != null && hashMap.size() != 0) {
            for (Map.Entry entry : this.f6393c.entrySet()) {
                sb2.append(string22);
                sb2.append((String) entry.getKey());
                sb2.append(string2);
                sb2.append((String) entry.getValue());
            }
        }
        return sb2.toString();
    }

    public N(EnumC0259h enumC0259h) {
        EnumMap enumMap = new EnumMap(K.class);
        this.f6392b = enumMap;
        this.f6393c = null;
        this.f6394d = f6388f;
        this.f6391a = 3;
        enumMap.put((EnumMap) K.f6361b, (w) enumC0259h);
    }
}
