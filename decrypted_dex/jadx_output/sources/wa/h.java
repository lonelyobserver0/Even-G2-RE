package wa;

import aa.C0398e;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import da.C0810A;
import da.G;
import da.J;
import ea.C0857d;
import f4.C0879c;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import s.C1590a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements e {

    /* renamed from: e, reason: collision with root package name */
    public static final C0879c f22201e = new C0879c(21);

    /* renamed from: a, reason: collision with root package name */
    public C1590a f22202a;

    /* renamed from: b, reason: collision with root package name */
    public LinkedHashMap f22203b;

    /* renamed from: c, reason: collision with root package name */
    public final J f22204c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f22205d = new HashMap();

    public h() {
        String string2 = StubApp.getString2(23878);
        String string22 = StubApp.getString2(23879);
        String string23 = StubApp.getString2(23880);
        String string24 = StubApp.getString2(23881);
        String string25 = StubApp.getString2(23882);
        a(new ArrayList(Arrays.asList(string2, string22, string23, string24, string25)), StubApp.getString2(23883));
        a(new ArrayList(Arrays.asList(StubApp.getString2(23884), StubApp.getString2(23885), StubApp.getString2(23886), StubApp.getString2(23887), string25)), StubApp.getString2(23888));
        a(new ArrayList(Arrays.asList(StubApp.getString2(23889), StubApp.getString2(23890), StubApp.getString2(23891), StubApp.getString2(23892), string25)), StubApp.getString2(23893));
        a(new ArrayList(Arrays.asList(StubApp.getString2(23894), StubApp.getString2(23895), StubApp.getString2(23896), StubApp.getString2(23897), string25)), StubApp.getString2(23898));
        a(new ArrayList(Arrays.asList(StubApp.getString2(23901), StubApp.getString2(23899), StubApp.getString2(23900), StubApp.getString2(23902), StubApp.getString2(23903))), StubApp.getString2(23904));
        a(new ArrayList(Arrays.asList(StubApp.getString2(23907), StubApp.getString2(23905), StubApp.getString2(23906), StubApp.getString2(23908), StubApp.getString2(23909))), StubApp.getString2(23910));
        a(new ArrayList(Arrays.asList(StubApp.getString2(23913), StubApp.getString2(23914), StubApp.getString2(23911), StubApp.getString2(23912), StubApp.getString2(23915), StubApp.getString2(23916))), StubApp.getString2(23917));
        a(new ArrayList(Arrays.asList(StubApp.getString2(23920), StubApp.getString2(23918), StubApp.getString2(23919), StubApp.getString2(23921), StubApp.getString2(23922))), StubApp.getString2(23923));
        a(new ArrayList(Arrays.asList(StubApp.getString2(23926), StubApp.getString2(23927), StubApp.getString2(23924), StubApp.getString2(23925), StubApp.getString2(23928), StubApp.getString2(23903))), StubApp.getString2(23929));
        a(new ArrayList(Arrays.asList(StubApp.getString2(23932), StubApp.getString2(23933), StubApp.getString2(23934), StubApp.getString2(23930), StubApp.getString2(23931), StubApp.getString2(23935), StubApp.getString2(23909))), StubApp.getString2(23936));
        a(new ArrayList(Arrays.asList(StubApp.getString2(23939), StubApp.getString2(23940), StubApp.getString2(23941), StubApp.getString2(23937), StubApp.getString2(23938), StubApp.getString2(23942), StubApp.getString2(23916))), StubApp.getString2(23943));
        a(new ArrayList(Arrays.asList(StubApp.getString2(23946), StubApp.getString2(23947), StubApp.getString2(23948), StubApp.getString2(23944), StubApp.getString2(23945), StubApp.getString2(23949), StubApp.getString2(23922))), StubApp.getString2(23950));
        String string26 = StubApp.getString2(23951);
        a(new ArrayList(Arrays.asList(string26, StubApp.getString2(23952), StubApp.getString2(23953))), string26);
        a(new ArrayList(Arrays.asList(StubApp.getString2(23954), StubApp.getString2(23955), StubApp.getString2(23956), StubApp.getString2(23957))), StubApp.getString2(23958));
        for (String str : Collections.unmodifiableSet(w.f22277a.keySet())) {
            String replace = str.replace(StubApp.getString2(397), "");
            Locale locale = Locale.ENGLISH;
            List list = (List) this.f22205d.get(replace.toLowerCase(locale));
            if ((list == null ? Collections.EMPTY_LIST : list).isEmpty()) {
                a(new ArrayList((Collection) this.f22205d.get(((String) w.f22277a.get(str)).toLowerCase(locale))), str);
            }
        }
        try {
            String string27 = StubApp.getString2("23959");
            InputStream k3 = AbstractC0624h2.o() ? AbstractC0624h2.k(string27) : e.class.getResourceAsStream(StubApp.getString2("601") + string27);
            if (k3 != null) {
                this.f22204c = new G(false, false).d(new BufferedInputStream(k3));
                return;
            }
            throw new IOException(StubApp.getString2("23960") + string27 + StubApp.getString2("23961"));
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static LinkedHashMap b(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            String str = cVar.f22188a;
            HashSet hashSet = new HashSet(2);
            hashSet.add(str);
            hashSet.add(str.replace(StubApp.getString2(999), ""));
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                linkedHashMap.put(((String) it2.next()).toLowerCase(Locale.ENGLISH), cVar);
            }
        }
        return linkedHashMap;
    }

    public static String f(n nVar) {
        if (nVar != null) {
            boolean z2 = false;
            if (nVar.c() != null) {
                String lowerCase = nVar.c().toLowerCase();
                if (lowerCase.contains(StubApp.getString2(23007)) || lowerCase.contains(StubApp.getString2(22390)) || lowerCase.contains(StubApp.getString2(348))) {
                    z2 = true;
                }
            }
            if (nVar.e(1)) {
                return (z2 && nVar.e(64)) ? StubApp.getString2(23898) : z2 ? StubApp.getString2(23888) : nVar.e(64) ? StubApp.getString2(23893) : StubApp.getString2(23883);
            }
            if (!nVar.e(2)) {
                return (z2 && nVar.e(64)) ? StubApp.getString2(23923) : z2 ? StubApp.getString2(23910) : nVar.e(64) ? StubApp.getString2(23917) : StubApp.getString2(23904);
            }
            if (z2 && nVar.e(64)) {
                return StubApp.getString2(23950);
            }
            if (z2) {
                return StubApp.getString2(23936);
            }
            if (nVar.e(64)) {
                return StubApp.getString2(23943);
            }
        }
        return StubApp.getString2(23929);
    }

    public final void a(ArrayList arrayList, String str) {
        this.f22205d.put(str.toLowerCase(Locale.ENGLISH), arrayList);
    }

    public final X9.b c(int i3, String str) {
        if (str == null) {
            return null;
        }
        if (this.f22202a == null) {
            synchronized (this) {
                if (this.f22202a == null) {
                    C1590a c1590a = f.f22198a;
                    synchronized (this) {
                        this.f22203b = b((ArrayList) c1590a.f20574a);
                        this.f22202a = c1590a;
                    }
                }
            }
        }
        c g10 = g(i3, str);
        if (g10 != null) {
            return g10.a();
        }
        c g11 = g(i3, str.replace(StubApp.getString2(999), ""));
        if (g11 != null) {
            return g11.a();
        }
        List list = (List) this.f22205d.get(str.replace(StubApp.getString2(397), "").toLowerCase(Locale.ENGLISH));
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c g12 = g(i3, (String) it.next());
            if (g12 != null) {
                return g12.a();
            }
        }
        c g13 = g(i3, str.replace(StubApp.getString2(321), StubApp.getString2(999)));
        if (g13 != null) {
            return g13.a();
        }
        c g14 = g(i3, str.concat(StubApp.getString2(23962)));
        if (g14 != null) {
            return g14.a();
        }
        return null;
    }

    public final X9.b d(String str) {
        C0857d c0857d = (C0857d) c(3, str);
        if (c0857d != null) {
            return c0857d;
        }
        J j = (J) c(1, str);
        if (j != null) {
            return j;
        }
        C0810A c0810a = (C0810A) c(2, str);
        if (c0810a != null) {
            return c0810a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x010e, code lost:
    
        if ((r12 & 262144) == 262144) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0129, code lost:
    
        if ((r12 & 1048576) == 1048576) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0144, code lost:
    
        if ((r12 & 131072) == 131072) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0167, code lost:
    
        if ((r12 & 2097152) == 2097152) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        if (((java.lang.String) r9.f22190c.f767c).equals(r27.a()) != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final wa.C1874a e(java.lang.String r25, wa.n r26, Ea.c r27) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.h.e(java.lang.String, wa.n, Ea.c):wa.a");
    }

    public final c g(int i3, String str) {
        if (str.contains(StubApp.getString2(4966))) {
            str = str.substring(str.indexOf(43) + 1);
        }
        c cVar = (c) this.f22203b.get(str.toLowerCase(Locale.ENGLISH));
        if (cVar == null || cVar.f22189b != i3) {
            return null;
        }
        return cVar;
    }

    public final C0398e h(String str, n nVar) {
        X9.b d8 = d(str);
        if (d8 != null) {
            return new C0398e((Object) d8, false);
        }
        X9.b d10 = d(f(nVar));
        if (d10 == null) {
            d10 = this.f22204c;
        }
        return new C0398e((Object) d10, true);
    }
}
