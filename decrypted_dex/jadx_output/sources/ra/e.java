package ra;

import android.util.Log;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import oa.C1472e;
import oa.l;
import oa.m;
import oa.n;
import oa.o;
import oa.p;
import qa.C1531b;
import sa.C1609b;
import sa.C1610c;
import va.C1840a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e extends AbstractC1582a {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f20520e;

    /* renamed from: f, reason: collision with root package name */
    public final C1531b f20521f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20522g;

    /* renamed from: h, reason: collision with root package name */
    public long f20523h;

    /* renamed from: i, reason: collision with root package name */
    public final long f20524i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20525k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20526l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f20527m;

    /* renamed from: n, reason: collision with root package name */
    public Long f20528n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f20529o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f20530p;

    /* renamed from: q, reason: collision with root package name */
    public C1610c f20531q;

    /* renamed from: r, reason: collision with root package name */
    public va.e f20532r;

    /* renamed from: s, reason: collision with root package name */
    public final int f20533s;

    /* renamed from: t, reason: collision with root package name */
    public final a5.c f20534t;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f20535u;

    /* renamed from: v, reason: collision with root package name */
    public static final char[] f20515v = {'x', 'r', 'e', 'f'};

    /* renamed from: w, reason: collision with root package name */
    public static final char[] f20516w = {'/', 'X', 'R', 'e', 'f'};

    /* renamed from: x, reason: collision with root package name */
    public static final char[] f20517x = {'s', 't', 'a', 'r', 't', 'x', 'r', 'e', 'f'};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f20518y = {101, 110, 100, 115, 116, 114, 101, 97, 109};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f20519z = {101, 110, 100, 111, 98, 106};

    /* renamed from: A, reason: collision with root package name */
    public static final char[] f20511A = {'%', '%', 'E', 'O', 'F'};

    /* renamed from: B, reason: collision with root package name */
    public static final char[] f20512B = {'o', 'b', 'j'};

    /* renamed from: C, reason: collision with root package name */
    public static final char[] f20513C = {'t', 'r', 'a', 'i', 'l', 'e', 'r'};

    /* renamed from: D, reason: collision with root package name */
    public static final char[] f20514D = {'/', 'O', 'b', 'j', 'S', 't', 'm'};

    public e(C1531b c1531b, qa.e eVar) {
        super(new i(c1531b));
        this.f20520e = new byte[2048];
        this.f20522g = "";
        this.j = true;
        this.f20525k = false;
        this.f20526l = false;
        this.f20527m = null;
        this.f20528n = null;
        this.f20529o = null;
        this.f20530p = null;
        this.f20531q = null;
        this.f20532r = null;
        this.f20533s = 2048;
        this.f20534t = new a5.c(28);
        this.f20535u = new byte[8192];
        this.f20521f = c1531b;
        this.f20522g = "";
        this.f20524i = c1531b.f20108k;
        String property = System.getProperty(StubApp.getString2(22854));
        if (property != null) {
            try {
                int parseInt = Integer.parseInt(property);
                if (parseInt > 15) {
                    this.f20533s = parseInt;
                }
            } catch (NumberFormatException unused) {
                Log.w(StubApp.getString2(948), StubApp.getString2(22855) + property + StubApp.getString2(620));
            }
        }
        this.f20501c = new C1472e(eVar);
    }

    public static m B(m mVar, Long l9, m mVar2, Long l10) {
        return (mVar2 == null || (mVar2.f18630b != mVar.f18630b ? !(l10 == null || l9.longValue() <= l10.longValue()) : mVar2.f18631c < mVar.f18631c)) ? mVar : mVar2;
    }

    public static boolean F(C1471d c1471d) {
        if (c1471d.f18397a.containsKey(oa.j.f18441E2)) {
            return false;
        }
        if (c1471d.f18397a.containsKey(oa.j.f18535e)) {
            return false;
        }
        if (c1471d.f18397a.containsKey(oa.j.f18466K0)) {
            return false;
        }
        if (c1471d.f18397a.containsKey(oa.j.f18553j2)) {
            return true;
        }
        if (c1471d.f18397a.containsKey(oa.j.f18590r3)) {
            return true;
        }
        if (c1471d.f18397a.containsKey(oa.j.f18603v)) {
            return true;
        }
        if (c1471d.f18397a.containsKey(oa.j.f18572n3)) {
            return true;
        }
        if (c1471d.f18397a.containsKey(oa.j.f18476M1)) {
            return true;
        }
        if (c1471d.f18397a.containsKey(oa.j.f18604v0)) {
            return true;
        }
        if (c1471d.f18397a.containsKey(oa.j.f18473L2)) {
            return true;
        }
        return c1471d.f18397a.containsKey(oa.j.f18600u0);
    }

    public static int H(char[] cArr, byte[] bArr, int i3) {
        int length = cArr.length - 1;
        char c10 = cArr[length];
        while (true) {
            int i10 = length;
            while (true) {
                i3--;
                if (i3 < 0) {
                    return -1;
                }
                if (bArr[i3] == c10) {
                    i10--;
                    if (i10 < 0) {
                        return i3;
                    }
                    c10 = cArr[i10];
                } else if (i10 < length) {
                    break;
                }
            }
            c10 = cArr[length];
        }
    }

    public static long Y(ArrayList arrayList, long j) {
        int size = arrayList.size();
        Long l9 = null;
        int i3 = -1;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = j - ((Long) arrayList.get(i10)).longValue();
            if (l9 == null || Math.abs(l9.longValue()) > Math.abs(longValue)) {
                l9 = Long.valueOf(longValue);
                i3 = i10;
            }
        }
        if (i3 > -1) {
            return ((Long) arrayList.get(i3)).longValue();
        }
        return -1L;
    }

    public static void w(LinkedList linkedList, AbstractC1469b abstractC1469b, HashSet hashSet) {
        if (abstractC1469b instanceof m) {
            if (hashSet.add(Long.valueOf((((m) abstractC1469b).f18630b << 32) | r0.f18631c))) {
                linkedList.add(abstractC1469b);
                return;
            }
            return;
        }
        if ((abstractC1469b instanceof C1471d) || (abstractC1469b instanceof C1468a)) {
            linkedList.add(abstractC1469b);
        }
    }

    public static int z(C1471d c1471d, HashSet hashSet) {
        AbstractC1469b J10 = c1471d.J(oa.j.f18480N1);
        int i3 = 0;
        if (J10 instanceof C1468a) {
            C1468a c1468a = (C1468a) J10;
            c1468a.getClass();
            Iterator it = new ArrayList(c1468a.f18393a).iterator();
            while (it.hasNext()) {
                AbstractC1469b abstractC1469b = (AbstractC1469b) it.next();
                if (abstractC1469b instanceof m) {
                    m mVar = (m) abstractC1469b;
                    if (!hashSet.contains(mVar)) {
                        AbstractC1469b abstractC1469b2 = mVar.f18629a;
                        if (abstractC1469b2 == null || abstractC1469b2.equals(oa.k.f18628a)) {
                            Log.w(StubApp.getString2(948), StubApp.getString2(22856) + abstractC1469b + StubApp.getString2(22857));
                            c1468a.I(abstractC1469b);
                        } else if (abstractC1469b2 instanceof C1471d) {
                            C1471d c1471d2 = (C1471d) abstractC1469b2;
                            oa.j H2 = c1471d2.H(oa.j.f18621y3);
                            if (oa.j.f18431C2.equals(H2)) {
                                hashSet.add(mVar);
                                i3 = z(c1471d2, hashSet) + i3;
                            } else if (oa.j.f18426B2.equals(H2)) {
                                i3++;
                            }
                        }
                    }
                }
                c1468a.I(abstractC1469b);
            }
        }
        c1471d.U(oa.j.f18597t0, i3);
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (com.stub.StubApp.getString2("22037").equals(r3.Q(oa.j.f18621y3)) != false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A(long r29) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.A(long):long");
    }

    public final C1609b C() {
        C1472e c1472e = this.f20501c;
        if (c1472e == null) {
            throw new IOException(StubApp.getString2(22866));
        }
        if (c1472e == null) {
            throw new IOException(StubApp.getString2(22865));
        }
        C1609b c1609b = new C1609b(c1472e, this.f20521f);
        if (this.f20501c != null) {
            return c1609b;
        }
        throw new IOException(StubApp.getString2(22864));
    }

    public final long D() {
        C1531b c1531b = this.f20521f;
        try {
            long j = this.f20524i;
            int i3 = this.f20533s;
            if (j < i3) {
                i3 = (int) j;
            }
            byte[] bArr = new byte[i3];
            long j3 = j - i3;
            c1531b.seek(j3);
            int i10 = 0;
            while (i10 < i3) {
                int i11 = i3 - i10;
                int read = c1531b.read(bArr, i10, i11);
                if (read < 1) {
                    throw new IOException(StubApp.getString2("22867") + i11);
                }
                i10 += read;
            }
            c1531b.seek(0L);
            char[] cArr = f20511A;
            int H2 = H(cArr, bArr, i3);
            if (H2 < 0) {
                boolean z2 = this.j;
                String string2 = StubApp.getString2(620);
                String string22 = StubApp.getString2(22868);
                if (!z2) {
                    throw new IOException(string22 + new String(cArr) + string2);
                }
                Log.d(StubApp.getString2(948), string22 + new String(cArr) + string2);
            } else {
                i3 = H2;
            }
            int H10 = H(f20517x, bArr, i3);
            if (H10 >= 0) {
                return j3 + H10;
            }
            throw new IOException(StubApp.getString2(22869));
        } catch (Throwable th) {
            c1531b.seek(0L);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.E():void");
    }

    public final boolean G(char[] cArr) {
        C1531b c1531b = this.f20521f;
        long j = c1531b.f20109l;
        int length = cArr.length;
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                z2 = true;
                break;
            }
            if (c1531b.read() != cArr[i3]) {
                break;
            }
            i3++;
        }
        c1531b.seek(j);
        return z2;
    }

    public final void I() {
        try {
            if (!M(StubApp.getString2("22873"), StubApp.getString2("22874")) && !M(StubApp.getString2("22875"), StubApp.getString2("9626"))) {
                throw new IOException(StubApp.getString2("22876"));
            }
            if (this.f20525k) {
                return;
            }
            E();
        } catch (Throwable th) {
            C1472e c1472e = this.f20501c;
            if (c1472e != null) {
                F1.h(c1472e);
                this.f20501c = null;
            }
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0245 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oa.p J(oa.C1471d r20) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.J(oa.d):oa.p");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01fa, code lost:
    
        if (r2.isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fd, code lost:
    
        r5 = ((java.util.List) r2.remove(r2.firstKey())).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020f, code lost:
    
        if (r5.hasNext() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0211, code lost:
    
        r7 = (oa.m) r5.next();
        r9 = N(r7, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021c, code lost:
    
        if (r9 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021e, code lost:
    
        r7.f18629a = r9;
        w(r1, r9, r4);
        r3.add(java.lang.Long.valueOf((r7.f18630b << 32) | r7.f18631c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e9, code lost:
    
        throw new java.io.IOException(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(oa.C1471d r18) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.K(oa.d):void");
    }

    public final void L(m mVar) {
        O(true, mVar.f18630b, mVar.f18631c);
        AbstractC1469b abstractC1469b = mVar.f18629a;
        if (!(abstractC1469b instanceof C1471d)) {
            throw new IOException(StubApp.getString2(22896) + this.f20521f.f20109l);
        }
        for (AbstractC1469b abstractC1469b2 : ((C1471d) abstractC1469b).f18397a.values()) {
            if (abstractC1469b2 instanceof m) {
                m mVar2 = (m) abstractC1469b2;
                if (mVar2.f18629a == null) {
                    L(mVar2);
                }
            }
        }
    }

    public final boolean M(String str, String str2) {
        String p8 = p();
        if (!p8.contains(str)) {
            p8 = p();
            while (!p8.contains(str) && (p8.length() <= 0 || !Character.isDigit(p8.charAt(0)))) {
                p8 = p();
            }
        }
        boolean contains = p8.contains(str);
        C1531b c1531b = this.f20521f;
        if (!contains) {
            c1531b.seek(0L);
            return false;
        }
        int indexOf = p8.indexOf(str);
        if (indexOf > 0) {
            p8 = p8.substring(indexOf);
        }
        boolean startsWith = p8.startsWith(str);
        String string2 = StubApp.getString2(948);
        if (startsWith && !p8.matches(str.concat(StubApp.getString2(22897)))) {
            if (p8.length() < str.length() + 3) {
                p8 = str.concat(str2);
                Log.d(string2, StubApp.getString2(22898) + str2 + StubApp.getString2(22899));
            } else {
                String str3 = p8.substring(str.length() + 3, p8.length()) + StubApp.getString2(3692);
                p8 = p8.substring(0, str.length() + 3);
                c1531b.a(str3.getBytes(Ia.a.f3241d).length);
            }
        }
        float f10 = -1.0f;
        try {
            String[] split = p8.split(StubApp.getString2("999"));
            if (split.length == 2) {
                f10 = Float.parseFloat(split[1]);
            }
        } catch (NumberFormatException e10) {
            Log.d(string2, StubApp.getString2(22900), e10);
        }
        if (f10 < 0.0f && !this.j) {
            throw new IOException(E1.a.j(StubApp.getString2(22901), p8));
        }
        this.f20501c.getClass();
        c1531b.seek(0L);
        return true;
    }

    public final AbstractC1469b N(m mVar, boolean z2) {
        return O(z2, mVar.f18630b, mVar.f18631c);
    }

    public final AbstractC1469b O(boolean z2, long j, int i3) {
        String str;
        AbstractC1469b abstractC1469b;
        AbstractC1469b abstractC1469b2;
        n nVar = new n(j, i3);
        m a3 = this.f20501c.a(nVar);
        if (a3.f18629a == null) {
            Long l9 = (Long) this.f20501c.f18399b.get(nVar);
            boolean z10 = this.j;
            String string2 = StubApp.getString2(948);
            if (l9 == null && z10) {
                y();
                l9 = (Long) this.f20527m.get(nVar);
                if (l9 != null) {
                    Log.d(string2, StubApp.getString2(22902) + l9 + StubApp.getString2(22891) + nVar);
                    this.f20501c.f18399b.put(nVar, l9);
                }
            }
            String string22 = StubApp.getString2(478);
            if (z2 && (l9 == null || l9.longValue() <= 0)) {
                throw new IOException(StubApp.getString2(22903) + j + string22 + i3);
            }
            if (a3.f18632d) {
                throw new IOException(StubApp.getString2(22911) + j + StubApp.getString2(397) + i3);
            }
            a3.f18632d = true;
            if (l9 == null && z10 && this.f20527m == null) {
                y();
                if (!this.f20527m.isEmpty()) {
                    Log.d(string2, StubApp.getString2(22904));
                    HashMap hashMap = this.f20501c.f18399b;
                    for (Map.Entry entry : this.f20527m.entrySet()) {
                        n nVar2 = (n) entry.getKey();
                        if (!hashMap.containsKey(nVar2)) {
                            hashMap.put(nVar2, entry.getValue());
                        }
                    }
                    l9 = (Long) hashMap.get(nVar);
                }
            }
            if (l9 == null) {
                a3.f18629a = oa.k.f18628a;
            } else if (l9.longValue() > 0) {
                long longValue = l9.longValue();
                C1531b c1531b = this.f20521f;
                c1531b.seek(longValue);
                long r8 = r();
                int o5 = o();
                n(f20512B);
                long j3 = nVar.f18633a;
                int i10 = nVar.f18634b;
                if (r8 != j3 || o5 != i10) {
                    throw new IOException(StubApp.getString2(22909) + j3 + string22 + i10 + StubApp.getString2(22910) + r8 + string22 + o5 + StubApp.getString2(22805) + l9);
                }
                u();
                AbstractC1469b l10 = l();
                String s10 = s();
                boolean equals = s10.equals(StubApp.getString2(15659));
                String string23 = StubApp.getString2(22809);
                if (equals) {
                    c1531b.a(s10.getBytes(Ia.a.f3241d).length);
                    if (!(l10 instanceof C1471d)) {
                        throw new IOException(StubApp.getString2(22905) + l9 + StubApp.getString2(1920));
                    }
                    p J10 = J((C1471d) l10);
                    va.e eVar = this.f20532r;
                    if (eVar != null) {
                        eVar.c(J10, nVar.f18633a, i10);
                    }
                    u();
                    s10 = p();
                    if (!s10.startsWith(string23) && s10.startsWith(StubApp.getString2(22810))) {
                        s10 = s10.substring(9).trim();
                        if (s10.length() == 0) {
                            s10 = p();
                        }
                    }
                    str = string23;
                    abstractC1469b2 = J10;
                } else {
                    str = string23;
                    va.e eVar2 = this.f20532r;
                    if (eVar2 != null) {
                        abstractC1469b = l10;
                        str = str;
                        eVar2.a(abstractC1469b, nVar.f18633a, i10);
                    } else {
                        abstractC1469b = l10;
                    }
                    abstractC1469b2 = abstractC1469b;
                }
                a3.f18629a = abstractC1469b2;
                if (!s10.startsWith(str)) {
                    String string24 = StubApp.getString2(620);
                    String string25 = StubApp.getString2(22906);
                    String string26 = StubApp.getString2(22907);
                    String string27 = StubApp.getString2(22908);
                    if (!z10) {
                        throw new IOException(string27 + r8 + string22 + o5 + string26 + l9 + string25 + s10 + string24);
                    }
                    Log.w(string2, string27 + r8 + string22 + o5 + string26 + l9 + string25 + s10 + string24);
                }
            } else {
                P((int) (-l9.longValue()));
            }
            a3.f18632d = false;
        }
        return a3.f18629a;
    }

    public final void P(int i3) {
        String string2 = StubApp.getString2(948);
        boolean z2 = this.j;
        AbstractC1469b O7 = O(true, i3, 0);
        if (O7 instanceof p) {
            try {
                d dVar = new d((p) O7, this.f20501c);
                try {
                    dVar.w();
                    Iterator it = dVar.f20508e.iterator();
                    while (it.hasNext()) {
                        m mVar = (m) it.next();
                        n nVar = new n(mVar.f18630b, mVar.f18631c);
                        k kVar = (k) this.f20534t.f9284d;
                        Long l9 = (Long) (kVar == null ? null : kVar.f20548b).get(nVar);
                        if (l9 != null && l9.longValue() == (-i3)) {
                            this.f20501c.a(nVar).f18629a = mVar.f18629a;
                        }
                    }
                } catch (IOException e10) {
                    if (!z2) {
                        throw e10;
                    }
                    Log.d(string2, StubApp.getString2(22912) + i3 + StubApp.getString2(22913), e10);
                }
            } catch (IOException e11) {
                if (!z2) {
                    throw e11;
                }
                Log.e(string2, StubApp.getString2(22914) + i3 + StubApp.getString2(22915), e11);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(4:182|183|184|(2:185|186))|(2:188|(2:190|(1:192)(5:193|(2:196|194)|197|198|(1:206)(2:204|205))))|207|208|209|210|(2:212|(2:214|205)(1:215))(1:223)|216|(2:(2:221|222)|205)(1:218)) */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04a8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04cc, code lost:
    
        android.util.Log.d(r14, com.stub.StubApp.getString2(22938) + r10 + r12, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032e A[LOOP:0: B:8:0x0039->B:124:0x032e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oa.C1471d Q(long r33) {
        /*
            Method dump skipped, instructions count: 1477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.Q(long):oa.d");
    }

    public final long R(long j, boolean z2) {
        j jVar;
        long r8 = r();
        C1472e c1472e = this.f20501c;
        c1472e.f18405h = Math.max(c1472e.f18405h, r8);
        o();
        n(f20512B);
        C1471d i3 = i();
        p J10 = J(i3);
        a5.c cVar = this.f20534t;
        if (z2) {
            cVar.C(2, j);
            k kVar = (k) cVar.f9283c;
            if (kVar == null) {
                Log.w(StubApp.getString2(948), StubApp.getString2(22923));
            } else {
                kVar.f20547a = J10;
            }
        }
        h hVar = new h(J10, this.f20501c, cVar);
        int[] iArr = hVar.f20544f;
        byte[] bArr = new byte[iArr[0] + iArr[1] + iArr[2]];
        while (true) {
            jVar = hVar.f20500b;
            if (jVar.c() || !hVar.f20545g.hasNext()) {
                break;
            }
            jVar.read(bArr);
            long longValue = hVar.f20545g.next().longValue();
            int i10 = iArr[0];
            int x7 = i10 == 0 ? 1 : (int) h.x(0, i10, bArr);
            if (x7 != 0) {
                long x10 = h.x(iArr[0], iArr[1], bArr);
                n nVar = new n(longValue, x7 == 1 ? (int) h.x(iArr[0] + iArr[1], iArr[2], bArr) : 0);
                a5.c cVar2 = hVar.f20543e;
                if (x7 == 1) {
                    cVar2.L(nVar, x10);
                } else {
                    cVar2.L(nVar, -x10);
                }
            }
        }
        if (jVar != null) {
            jVar.close();
        }
        hVar.f20501c = null;
        J10.close();
        return i3.P(oa.j.f18468K2);
    }

    public final void S() {
        String string2 = StubApp.getString2(22942);
        if (this.f20531q != null) {
            return;
        }
        C1471d c1471d = this.f20501c.f18401d;
        oa.j jVar = oa.j.f18517Y0;
        AbstractC1469b O7 = c1471d.O(jVar);
        if (O7 == null || (O7 instanceof oa.k)) {
            return;
        }
        if (O7 instanceof m) {
            L((m) O7);
        }
        try {
            C1610c c1610c = new C1610c(this.f20501c.f18401d.G(jVar));
            this.f20531q = c1610c;
            va.g gVar = new va.g(this.f20522g);
            va.e h2 = c1610c.h();
            this.f20532r = h2;
            h2.h(this.f20531q, this.f20501c.f18401d.F(oa.j.f18420A1), gVar);
            C1840a c1840a = this.f20532r.f21900g;
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new IOException(string2 + e11.getClass().getSimpleName() + StubApp.getString2(22943), e11);
        }
    }

    public final void T(C1583b c1583b) {
        byte b2;
        byte[] bArr = f20518y;
        byte[] bArr2 = bArr;
        int i3 = 0;
        while (true) {
            C1531b c1531b = this.f20521f;
            byte[] bArr3 = this.f20520e;
            int read = c1531b.read(bArr3, i3, 2048 - i3);
            if (read <= 0) {
                break;
            }
            int i10 = read + i3;
            int i11 = i10 - 5;
            byte[] bArr4 = bArr2;
            int i12 = i3;
            while (true) {
                if (i3 >= i10) {
                    break;
                }
                int i13 = i3 + 5;
                if (i12 != 0 || i13 >= i11 || ((b2 = bArr3[i13]) <= 116 && b2 >= 97)) {
                    byte b10 = bArr3[i3];
                    if (b10 == bArr4[i12]) {
                        i12++;
                        if (i12 == bArr4.length) {
                            i3++;
                            break;
                        }
                    } else {
                        if (i12 == 3) {
                            bArr4 = f20519z;
                            if (b10 == bArr4[i12]) {
                                i12++;
                            }
                        }
                        i12 = b10 == 101 ? 1 : (b10 == 110 && i12 == 7) ? 2 : 0;
                        bArr4 = bArr;
                    }
                } else {
                    i3 = i13;
                }
                i3++;
            }
            int max = Math.max(0, i3 - i12);
            if (max > 0) {
                c1583b.write(bArr3, 0, max);
            }
            if (i12 == bArr4.length) {
                c1531b.a(i10 - max);
                break;
            } else {
                System.arraycopy(bArr4, 0, bArr3, 0, i12);
                i3 = i12;
                bArr2 = bArr4;
            }
        }
        c1583b.flush();
    }

    public final void U(o oVar, l lVar) {
        long G4 = lVar.G();
        while (G4 > 0) {
            int i3 = G4 > 8192 ? 8192 : (int) G4;
            C1531b c1531b = this.f20521f;
            byte[] bArr = this.f20535u;
            int read = c1531b.read(bArr, 0, i3);
            if (read <= 0) {
                throw new IOException(StubApp.getString2(22944) + c1531b.f20109l + StubApp.getString2(22945) + i3 + StubApp.getString2(22946) + read);
            }
            oVar.write(bArr, 0, read);
            G4 -= read;
        }
    }

    public final C1471d V(m mVar) {
        n nVar = new n(mVar.f18630b, mVar.f18631c);
        Long l9 = (Long) this.f20527m.get(nVar);
        if (l9 == null) {
            return null;
        }
        C1531b c1531b = this.f20521f;
        long j = c1531b.f20109l;
        C1471d W10 = W(nVar, l9.longValue());
        c1531b.seek(j);
        return W10;
    }

    public final C1471d W(n nVar, long j) {
        if (j < 0) {
            m a3 = this.f20501c.a(nVar);
            if (a3.f18629a == null) {
                P((int) (-j));
            }
            AbstractC1469b abstractC1469b = a3.f18629a;
            if (abstractC1469b instanceof C1471d) {
                return (C1471d) abstractC1469b;
            }
            return null;
        }
        C1531b c1531b = this.f20521f;
        c1531b.seek(j);
        r();
        o();
        n(f20512B);
        if (c1531b.peek() != 60) {
            return null;
        }
        try {
            return i();
        } catch (IOException unused) {
            Log.d(StubApp.getString2(948), StubApp.getString2(22947) + nVar + StubApp.getString2(22948));
            return null;
        }
    }

    public final boolean X(C1471d c1471d) {
        m a3;
        m mVar = null;
        m mVar2 = null;
        Long l9 = null;
        Long l10 = null;
        for (Map.Entry entry : this.f20527m.entrySet()) {
            C1471d W10 = W((n) entry.getKey(), ((Long) entry.getValue()).longValue());
            if (W10 != null) {
                if (oa.j.f18465K.equals(W10.H(oa.j.f18621y3))) {
                    m a9 = this.f20501c.a((n) entry.getKey());
                    mVar = B(a9, (Long) entry.getValue(), mVar, l9);
                    if (mVar == a9) {
                        l9 = (Long) entry.getValue();
                    }
                } else if (F(W10) && (mVar2 = B((a3 = this.f20501c.a((n) entry.getKey())), (Long) entry.getValue(), mVar2, l10)) == a3) {
                    l10 = (Long) entry.getValue();
                }
            }
        }
        if (mVar != null) {
            c1471d.V(oa.j.f18503T2, mVar);
        }
        if (mVar2 != null) {
            c1471d.V(oa.j.f18458I1, mVar2);
        }
        return mVar != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.x():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e A[ADDED_TO_REGION, EDGE_INSN: B:71:0x014e->B:62:0x014e BREAK  A[LOOP:1: B:27:0x0081->B:60:0x014a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.y():void");
    }
}
