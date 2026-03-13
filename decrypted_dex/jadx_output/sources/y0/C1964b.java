package y0;

import L0.C0117m;
import L0.C0121q;
import L0.InterfaceC0128y;
import L0.InterfaceC0129z;
import L0.Y;
import L0.a0;
import L0.b0;
import L0.h0;
import M4.G;
import M4.I;
import M4.Z;
import M4.r;
import O0.s;
import P0.p;
import aa.C0398e;
import android.util.Pair;
import android.util.SparseArray;
import com.stub.StubApp;
import f4.C0879c;
import i2.u;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.LongCompanionObject;
import l4.C1145A;
import o0.AbstractC1405B;
import o0.C1417N;
import o0.C1437l;
import o0.C1438m;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.InterfaceC1707g;
import t0.InterfaceC1708h;
import t0.InterfaceC1726z;
import v0.c0;
import z0.C1985a;
import z0.C1987c;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1964b implements InterfaceC0129z, a0 {

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f23334C = Pattern.compile(StubApp.getString2(24562));

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f23335D = Pattern.compile(StubApp.getString2(24563));

    /* renamed from: B, reason: collision with root package name */
    public long f23337B;

    /* renamed from: a, reason: collision with root package name */
    public final int f23338a;

    /* renamed from: b, reason: collision with root package name */
    public final Bc.i f23339b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1726z f23340c;

    /* renamed from: d, reason: collision with root package name */
    public final A0.j f23341d;

    /* renamed from: e, reason: collision with root package name */
    public final I4.e f23342e;

    /* renamed from: f, reason: collision with root package name */
    public final p2.h f23343f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23344g;

    /* renamed from: h, reason: collision with root package name */
    public final p f23345h;
    public final P0.e j;

    /* renamed from: k, reason: collision with root package name */
    public final h0 f23346k;

    /* renamed from: l, reason: collision with root package name */
    public final C1963a[] f23347l;

    /* renamed from: m, reason: collision with root package name */
    public final I4.e f23348m;

    /* renamed from: n, reason: collision with root package name */
    public final m f23349n;

    /* renamed from: q, reason: collision with root package name */
    public final A0.f f23351q;

    /* renamed from: r, reason: collision with root package name */
    public final A0.f f23352r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0128y f23353s;

    /* renamed from: w, reason: collision with root package name */
    public C0117m f23356w;

    /* renamed from: x, reason: collision with root package name */
    public C1987c f23357x;

    /* renamed from: y, reason: collision with root package name */
    public int f23358y;

    /* renamed from: z, reason: collision with root package name */
    public List f23359z;

    /* renamed from: A, reason: collision with root package name */
    public boolean f23336A = true;

    /* renamed from: t, reason: collision with root package name */
    public M0.h[] f23354t = new M0.h[0];

    /* renamed from: v, reason: collision with root package name */
    public j[] f23355v = new j[0];

    /* renamed from: p, reason: collision with root package name */
    public final IdentityHashMap f23350p = new IdentityHashMap();

    public C1964b(int i3, C1987c c1987c, p2.h hVar, int i10, Bc.i iVar, InterfaceC1726z interfaceC1726z, A0.j jVar, A0.f fVar, I4.e eVar, A0.f fVar2, long j, p pVar, P0.e eVar2, I4.e eVar3, C0879c c0879c, w0.j jVar2) {
        String string2;
        int i11;
        int i12;
        int[][] iArr;
        boolean[] zArr;
        C1438m[] c1438mArr;
        z0.f d8;
        Integer num;
        this.f23338a = i3;
        this.f23357x = c1987c;
        this.f23343f = hVar;
        this.f23358y = i10;
        this.f23339b = iVar;
        this.f23340c = interfaceC1726z;
        this.f23341d = jVar;
        this.f23352r = fVar;
        this.f23342e = eVar;
        this.f23351q = fVar2;
        this.f23344g = j;
        this.f23345h = pVar;
        this.j = eVar2;
        this.f23348m = eVar3;
        boolean z2 = true;
        this.f23349n = new m(c1987c, c0879c, eVar2);
        int i13 = 0;
        eVar3.getClass();
        G g10 = I.f4549b;
        Z z10 = Z.f4578e;
        this.f23356w = new C0117m(z10, z10);
        z0.h b2 = c1987c.b(i10);
        List list = b2.f23681d;
        this.f23359z = list;
        List list2 = b2.f23680c;
        int size = list2.size();
        HashMap hashMap = new HashMap(r.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            hashMap.put(Long.valueOf(((C1985a) list2.get(i14)).f23636a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        int i15 = 0;
        while (i15 < size) {
            C1985a c1985a = (C1985a) list2.get(i15);
            List list3 = c1985a.f23640e;
            String string22 = StubApp.getString2(24564);
            z0.f d10 = d(string22, list3);
            List list4 = c1985a.f23641f;
            d10 = d10 == null ? d(string22, list4) : d10;
            int intValue = (d10 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(d10.f23672b)))) == null) ? i15 : num.intValue();
            if (intValue == i15 && (d8 = d(StubApp.getString2(24565), list4)) != null) {
                int i16 = AbstractC1560u.f20190a;
                String[] split = d8.f23672b.split(StubApp.getString2(321), -1);
                int length = split.length;
                int i17 = 0;
                while (i17 < length) {
                    boolean z11 = z2;
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i17])));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                    i17++;
                    z2 = z11;
                }
            }
            boolean z12 = z2;
            if (intValue != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
            i15++;
            z2 = z12;
        }
        boolean z13 = z2;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i18 = 0; i18 < size2; i18++) {
            int[] z14 = android.support.v4.media.session.b.z((Collection) arrayList.get(i18));
            iArr2[i18] = z14;
            Arrays.sort(z14);
        }
        boolean[] zArr2 = new boolean[size2];
        C1438m[][] c1438mArr2 = new C1438m[size2][];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr3 = iArr2[i19];
            int length2 = iArr3.length;
            int i21 = i13;
            while (true) {
                if (i21 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((C1985a) list2.get(iArr3[i21])).f23638c;
                iArr = iArr2;
                while (i13 < list7.size()) {
                    if (!((z0.m) list7.get(i13)).f23697d.isEmpty()) {
                        zArr2[i19] = z13;
                        i20++;
                        break;
                    }
                    i13++;
                }
                i21++;
                iArr2 = iArr;
                i13 = 0;
            }
            int[] iArr4 = iArr[i19];
            int length3 = iArr4.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length3) {
                    zArr = zArr2;
                    c1438mArr = new C1438m[0];
                    break;
                }
                int i23 = iArr4[i22];
                C1985a c1985a2 = (C1985a) list2.get(i23);
                List list8 = ((C1985a) list2.get(i23)).f23639d;
                int[] iArr5 = iArr4;
                int i24 = 0;
                while (i24 < list8.size()) {
                    z0.f fVar3 = (z0.f) list8.get(i24);
                    int i25 = length3;
                    zArr = zArr2;
                    if (StubApp.getString2(24566).equals(fVar3.f23671a)) {
                        C1437l c1437l = new C1437l();
                        c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(467));
                        c1437l.f18166a = Xa.h.q(new StringBuilder(), c1985a2.f23636a, StubApp.getString2(24567));
                        c1438mArr = o(fVar3, f23334C, new C1438m(c1437l));
                        break;
                    }
                    if (StubApp.getString2(24568).equals(fVar3.f23671a)) {
                        C1437l c1437l2 = new C1437l();
                        c1437l2.f18177m = AbstractC1405B.m(StubApp.getString2(503));
                        c1437l2.f18166a = Xa.h.q(new StringBuilder(), c1985a2.f23636a, StubApp.getString2(24569));
                        c1438mArr = o(fVar3, f23335D, new C1438m(c1437l2));
                        break;
                    }
                    i24++;
                    zArr2 = zArr;
                    length3 = i25;
                }
                i22++;
                iArr4 = iArr5;
            }
            c1438mArr2[i19] = c1438mArr;
            if (c1438mArr.length != 0) {
                i20++;
            }
            i19++;
            zArr2 = zArr;
            iArr2 = iArr;
            i13 = 0;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i20 + size2;
        C1417N[] c1417nArr = new C1417N[size3];
        C1963a[] c1963aArr = new C1963a[size3];
        int i26 = 0;
        int i27 = 0;
        while (true) {
            string2 = StubApp.getString2(494);
            if (i26 >= size2) {
                break;
            }
            int[] iArr7 = iArr6[i26];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr7.length;
            int i28 = 0;
            while (i28 < length4) {
                arrayList3.addAll(((C1985a) list2.get(iArr7[i28])).f23638c);
                i28++;
                size2 = size2;
            }
            int i29 = size2;
            int size4 = arrayList3.size();
            C1438m[] c1438mArr3 = new C1438m[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size4;
                C1438m c1438m = ((z0.m) arrayList3.get(i30)).f23694a;
                C1438m[][] c1438mArr4 = c1438mArr2;
                C1437l a3 = c1438m.a();
                a3.f18165K = jVar.a(c1438m);
                c1438mArr3[i30] = new C1438m(a3);
                i30++;
                size4 = i31;
                c1438mArr2 = c1438mArr4;
            }
            C1438m[][] c1438mArr5 = c1438mArr2;
            C1985a c1985a3 = (C1985a) list2.get(iArr7[0]);
            int i32 = i27;
            long j3 = c1985a3.f23636a;
            String l9 = j3 != -1 ? Long.toString(j3) : u.p(i26, StubApp.getString2(24570));
            int i33 = i32 + 1;
            if (zArr3[i26]) {
                i11 = i32 + 2;
            } else {
                i11 = i33;
                i33 = -1;
            }
            if (c1438mArr5[i26].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            m(iVar, c1438mArr3);
            List list9 = list2;
            c1417nArr[i32] = new C1417N(l9, c1438mArr3);
            G g11 = I.f4549b;
            Z z15 = Z.f4578e;
            int i34 = i32;
            c1963aArr[i34] = new C1963a(c1985a3.f23637b, 0, iArr7, i32, i33, i11, -1, z15);
            int i35 = -1;
            if (i33 != -1) {
                String g12 = AbstractC1482f.g(l9, StubApp.getString2(24571));
                C1437l c1437l3 = new C1437l();
                c1437l3.f18166a = g12;
                c1437l3.f18177m = AbstractC1405B.m(string2);
                c1417nArr[i33] = new C1417N(g12, new C1438m(c1437l3));
                C1963a c1963a = new C1963a(5, 1, iArr7, i34, -1, -1, -1, z15);
                i34 = i34;
                c1963aArr[i33] = c1963a;
                i35 = -1;
            }
            if (i11 != i35) {
                String g13 = AbstractC1482f.g(l9, StubApp.getString2(24572));
                c1963aArr[i11] = new C1963a(3, 1, iArr7, i34, -1, -1, -1, I.n(c1438mArr5[i26]));
                m(iVar, c1438mArr5[i26]);
                c1417nArr[i11] = new C1417N(g13, c1438mArr5[i26]);
            }
            i26++;
            size2 = i29;
            i27 = i12;
            c1438mArr2 = c1438mArr5;
            list2 = list9;
        }
        int i36 = 0;
        while (i36 < list.size()) {
            z0.g gVar = (z0.g) list.get(i36);
            C1437l c1437l4 = new C1437l();
            c1437l4.f18166a = gVar.a();
            c1437l4.f18177m = AbstractC1405B.m(string2);
            c1417nArr[i27] = new C1417N(gVar.a() + StubApp.getString2(478) + i36, new C1438m(c1437l4));
            G g14 = I.f4549b;
            c1963aArr[i27] = new C1963a(5, 2, new int[0], -1, -1, -1, i36, Z.f4578e);
            i36++;
            i27++;
        }
        Pair create = Pair.create(new h0(c1417nArr), c1963aArr);
        this.f23346k = (h0) create.first;
        this.f23347l = (C1963a[]) create.second;
    }

    public static z0.f d(String str, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            z0.f fVar = (z0.f) list.get(i3);
            if (str.equals(fVar.f23671a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void m(Bc.i iVar, C1438m[] c1438mArr) {
        for (int i3 = 0; i3 < c1438mArr.length; i3++) {
            C1438m c1438m = c1438mArr[i3];
            C0398e c0398e = (C0398e) iVar.f768d;
            if (c0398e.f9343a && ((C1145A) c0398e.f9344b).c(c1438m)) {
                C1437l a3 = c1438m.a();
                a3.f18177m = AbstractC1405B.m(StubApp.getString2(462));
                a3.f18162H = ((C1145A) c0398e.f9344b).b(c1438m);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c1438m.f18216n);
                String str = c1438m.f18213k;
                sb2.append(str != null ? StubApp.getString2(397).concat(str) : "");
                a3.j = sb2.toString();
                a3.f18182r = LongCompanionObject.MAX_VALUE;
                c1438m = new C1438m(a3);
            }
            c1438mArr[i3] = c1438m;
        }
    }

    public static C1438m[] o(z0.f fVar, Pattern pattern, C1438m c1438m) {
        String str = fVar.f23672b;
        if (str == null) {
            return new C1438m[]{c1438m};
        }
        int i3 = AbstractC1560u.f20190a;
        String[] split = str.split(StubApp.getString2(1262), -1);
        C1438m[] c1438mArr = new C1438m[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new C1438m[]{c1438m};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C1437l a3 = c1438m.a();
            a3.f18166a = c1438m.f18204a + StubApp.getString2(478) + parseInt;
            a3.f18161G = parseInt;
            a3.f18169d = matcher.group(2);
            c1438mArr[i10] = new C1438m(a3);
        }
        return c1438mArr;
    }

    @Override // L0.InterfaceC0129z
    public final long b(long j, c0 c0Var) {
        for (M0.h hVar : this.f23354t) {
            if (hVar.f4470a == 2) {
                return hVar.f4474e.b(j, c0Var);
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // L0.InterfaceC0129z
    public final long c(s[] sVarArr, boolean[] zArr, L0.Z[] zArr2, boolean[] zArr3, long j) {
        int i3;
        int[] iArr;
        boolean z2;
        int[] iArr2;
        int i10;
        int i11;
        int i12;
        C1417N c1417n;
        Z z10;
        int i13;
        l lVar;
        boolean z11;
        s[] sVarArr2 = sVarArr;
        boolean z12 = true;
        int[] iArr3 = new int[sVarArr2.length];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i3 = -1;
            if (i15 >= sVarArr2.length) {
                break;
            }
            s sVar = sVarArr2[i15];
            if (sVar != null) {
                iArr3[i15] = this.f23346k.b(sVar.c());
            } else {
                iArr3[i15] = -1;
            }
            i15++;
        }
        for (int i16 = 0; i16 < sVarArr2.length; i16++) {
            if (sVarArr2[i16] == null || !zArr[i16]) {
                L0.Z z13 = zArr2[i16];
                if (z13 instanceof M0.h) {
                    ((M0.h) z13).B(this);
                } else if (z13 instanceof M0.g) {
                    M0.g gVar = (M0.g) z13;
                    M0.h hVar = gVar.f4467e;
                    boolean[] zArr4 = hVar.f4473d;
                    int i17 = gVar.f4465c;
                    AbstractC1550k.g(zArr4[i17]);
                    hVar.f4473d[i17] = false;
                }
                zArr2[i16] = null;
            }
        }
        for (int i18 = 0; i18 < sVarArr2.length; i18++) {
            L0.Z z14 = zArr2[i18];
            if ((z14 instanceof C0121q) || (z14 instanceof M0.g)) {
                int i19 = i(i18, iArr3);
                if (i19 == -1) {
                    z11 = zArr2[i18] instanceof C0121q;
                } else {
                    L0.Z z15 = zArr2[i18];
                    z11 = (z15 instanceof M0.g) && ((M0.g) z15).f4463a == zArr2[i19];
                }
                if (!z11) {
                    L0.Z z16 = zArr2[i18];
                    if (z16 instanceof M0.g) {
                        M0.g gVar2 = (M0.g) z16;
                        M0.h hVar2 = gVar2.f4467e;
                        boolean[] zArr5 = hVar2.f4473d;
                        int i20 = gVar2.f4465c;
                        AbstractC1550k.g(zArr5[i20]);
                        hVar2.f4473d[i20] = false;
                    }
                    zArr2[i18] = null;
                }
            }
        }
        int i21 = 0;
        while (i21 < sVarArr2.length) {
            s sVar2 = sVarArr2[i21];
            if (sVar2 == null) {
                z2 = z12 ? 1 : 0;
                iArr2 = iArr3;
                i10 = i14;
                i11 = i21;
            } else {
                L0.Z z17 = zArr2[i21];
                if (z17 == null) {
                    zArr3[i21] = z12;
                    C1963a c1963a = this.f23347l[iArr3[i21]];
                    int i22 = c1963a.f23328c;
                    if (i22 == 0) {
                        int i23 = c1963a.f23331f;
                        boolean z18 = i23 != i3 ? z12 ? 1 : 0 : i14;
                        if (z18 != 0) {
                            c1417n = this.f23346k.a(i23);
                            i12 = z12 ? 1 : 0;
                        } else {
                            i12 = i14;
                            c1417n = null;
                        }
                        int i24 = c1963a.f23332g;
                        if (i24 != i3) {
                            z10 = this.f23347l[i24].f23333h;
                        } else {
                            G g10 = I.f4549b;
                            z10 = Z.f4578e;
                        }
                        int i25 = z10.f4580d + i12;
                        int i26 = i21;
                        C1438m[] c1438mArr = new C1438m[i25];
                        int[] iArr4 = new int[i25];
                        if (z18 != 0) {
                            c1438mArr[i14] = c1417n.f18070d[i14];
                            iArr4[i14] = 5;
                            i13 = z12 ? 1 : 0;
                        } else {
                            i13 = i14;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i27 = i14; i27 < z10.f4580d; i27 += z12 ? 1 : 0) {
                            C1438m c1438m = (C1438m) z10.get(i27);
                            c1438mArr[i13] = c1438m;
                            iArr4[i13] = 3;
                            arrayList.add(c1438m);
                            i13 += z12 ? 1 : 0;
                        }
                        if (!this.f23357x.f23649d || z18 == 0) {
                            lVar = null;
                        } else {
                            m mVar = this.f23349n;
                            lVar = new l(mVar, mVar.f23434a);
                        }
                        Bc.i iVar = this.f23339b;
                        p pVar = this.f23345h;
                        C1987c c1987c = this.f23357x;
                        p2.h hVar3 = this.f23343f;
                        int i28 = this.f23358y;
                        int[] iArr5 = c1963a.f23326a;
                        int i29 = c1963a.f23327b;
                        iArr2 = iArr3;
                        long j3 = this.f23344g;
                        InterfaceC1726z interfaceC1726z = this.f23340c;
                        InterfaceC1708h g11 = ((InterfaceC1707g) iVar.f767c).g();
                        if (interfaceC1726z != null) {
                            g11.y(interfaceC1726z);
                        }
                        l lVar2 = lVar;
                        z2 = true;
                        i10 = 0;
                        i11 = i26;
                        M0.h hVar4 = new M0.h(c1963a.f23327b, iArr4, c1438mArr, new i((C0398e) iVar.f768d, pVar, c1987c, hVar3, i28, iArr5, sVar2, i29, g11, j3, iVar.f766b, z18, arrayList, lVar), this, this.j, j, this.f23341d, this.f23352r, this.f23342e, this.f23351q, this.f23336A);
                        synchronized (this) {
                            this.f23350p.put(hVar4, lVar2);
                        }
                        zArr2[i11] = hVar4;
                    } else {
                        z2 = z12 ? 1 : 0;
                        iArr2 = iArr3;
                        i10 = i14;
                        i11 = i21;
                        if (i22 == 2) {
                            zArr2[i11] = new j((z0.g) this.f23359z.get(c1963a.f23329d), sVar2.c().f18070d[i10], this.f23357x.f23649d);
                        }
                    }
                } else {
                    z2 = z12 ? 1 : 0;
                    iArr2 = iArr3;
                    i10 = i14;
                    i11 = i21;
                    if (z17 instanceof M0.h) {
                        ((i) ((M0.h) z17).f4474e).j = sVar2;
                    }
                }
            }
            i21 = i11 + 1;
            z12 = z2;
            i14 = i10;
            iArr3 = iArr2;
            i3 = -1;
            sVarArr2 = sVarArr;
        }
        boolean z19 = z12 ? 1 : 0;
        int[] iArr6 = iArr3;
        boolean z20 = i14;
        while (i14 < sVarArr.length) {
            if (zArr2[i14] == null && sVarArr[i14] != null) {
                C1963a c1963a2 = this.f23347l[iArr6[i14]];
                if (c1963a2.f23328c == z19) {
                    iArr = iArr6;
                    int i30 = i(i14, iArr);
                    if (i30 == -1) {
                        zArr2[i14] = new C0121q();
                    } else {
                        M0.h hVar5 = (M0.h) zArr2[i30];
                        int i31 = c1963a2.f23327b;
                        int i32 = z20 ? 1 : 0;
                        while (true) {
                            Y[] yArr = hVar5.f4482p;
                            if (i32 >= yArr.length) {
                                throw new IllegalStateException();
                            }
                            if (hVar5.f4471b[i32] == i31) {
                                boolean[] zArr6 = hVar5.f4473d;
                                AbstractC1550k.g((zArr6[i32] ? 1 : 0) ^ (z19 ? 1 : 0));
                                zArr6[i32] = z19;
                                yArr[i32].A(j, z19);
                                zArr2[i14] = new M0.g(hVar5, hVar5, yArr[i32], i32);
                                break;
                            }
                            i32 += z19 ? 1 : 0;
                        }
                    }
                    i14 += z19 ? 1 : 0;
                    iArr6 = iArr;
                }
            }
            iArr = iArr6;
            i14 += z19 ? 1 : 0;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = zArr2.length;
        for (int i33 = z20 ? 1 : 0; i33 < length; i33 += z19 ? 1 : 0) {
            L0.Z z21 = zArr2[i33];
            if (z21 instanceof M0.h) {
                arrayList2.add((M0.h) z21);
            } else if (z21 instanceof j) {
                arrayList3.add((j) z21);
            }
        }
        M0.h[] hVarArr = new M0.h[arrayList2.size()];
        this.f23354t = hVarArr;
        arrayList2.toArray(hVarArr);
        j[] jVarArr = new j[arrayList3.size()];
        this.f23355v = jVarArr;
        arrayList3.toArray(jVarArr);
        I4.e eVar = this.f23348m;
        AbstractList u2 = r.u(arrayList2, new w0.b(29));
        eVar.getClass();
        this.f23356w = new C0117m(arrayList2, u2);
        if (this.f23336A) {
            this.f23336A = z20;
            this.f23337B = j;
        }
        return j;
    }

    @Override // L0.InterfaceC0129z
    public final void e(InterfaceC0128y interfaceC0128y, long j) {
        this.f23353s = interfaceC0128y;
        interfaceC0128y.a(this);
    }

    @Override // L0.b0
    public final long f() {
        return this.f23356w.f();
    }

    @Override // L0.b0
    public final boolean g(v0.I i3) {
        return this.f23356w.g(i3);
    }

    @Override // L0.a0
    public final void h(b0 b0Var) {
        this.f23353s.h(this);
    }

    public final int i(int i3, int[] iArr) {
        int i10 = iArr[i3];
        if (i10 != -1) {
            C1963a[] c1963aArr = this.f23347l;
            int i11 = c1963aArr[i10].f23330e;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 == i11 && c1963aArr[i13].f23328c == 0) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override // L0.InterfaceC0129z
    public final void j() {
        this.f23345h.a();
    }

    @Override // L0.InterfaceC0129z
    public final long k(long j) {
        for (M0.h hVar : this.f23354t) {
            hVar.C(j);
        }
        for (j jVar : this.f23355v) {
            int a3 = AbstractC1560u.a(jVar.f23421c, j, true);
            jVar.f23425g = a3;
            jVar.f23426h = (jVar.f23422d && a3 == jVar.f23421c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // L0.InterfaceC0129z
    public final void l(long j) {
        for (M0.h hVar : this.f23354t) {
            hVar.l(j);
        }
    }

    @Override // L0.b0
    public final boolean n() {
        return this.f23356w.n();
    }

    @Override // L0.InterfaceC0129z
    public final long p() {
        M0.h[] hVarArr = this.f23354t;
        int length = hVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            M0.h hVar = hVarArr[i3];
            hVar.getClass();
            try {
                if (hVar.f4468A) {
                    return this.f23337B;
                }
            } finally {
                hVar.f4468A = false;
            }
        }
        return -9223372036854775807L;
    }

    @Override // L0.InterfaceC0129z
    public final h0 s() {
        return this.f23346k;
    }

    @Override // L0.b0
    public final long u() {
        return this.f23356w.u();
    }

    @Override // L0.b0
    public final void v(long j) {
        this.f23356w.v(j);
    }
}
