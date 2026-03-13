package y0;

import E0.x;
import L0.C0106b;
import M4.I;
import O0.s;
import P0.p;
import T0.B;
import T0.o;
import aa.C0398e;
import android.os.SystemClock;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import l1.C1141d;
import l4.C1145A;
import l4.r;
import o0.AbstractC1405B;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1721u;
import t0.InterfaceC1708h;
import z0.C1985a;
import z0.C1986b;
import z0.C1987c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i implements M0.i {

    /* renamed from: a, reason: collision with root package name */
    public final p f23406a;

    /* renamed from: b, reason: collision with root package name */
    public final p2.h f23407b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f23408c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23409d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1708h f23410e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23411f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23412g;

    /* renamed from: h, reason: collision with root package name */
    public final l f23413h;

    /* renamed from: i, reason: collision with root package name */
    public final r[] f23414i;
    public s j;

    /* renamed from: k, reason: collision with root package name */
    public C1987c f23415k;

    /* renamed from: l, reason: collision with root package name */
    public int f23416l;

    /* renamed from: m, reason: collision with root package name */
    public C0106b f23417m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23418n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y0.i] */
    public i(C0398e c0398e, p pVar, C1987c c1987c, p2.h hVar, int i3, int[] iArr, s sVar, int i10, InterfaceC1708h interfaceC1708h, long j, int i11, boolean z2, ArrayList arrayList, l lVar) {
        r[] rVarArr;
        int i12;
        C1438m c1438m;
        z0.m mVar;
        o hVar2;
        M0.d dVar;
        ?? obj = new Object();
        obj.f23406a = pVar;
        obj.f23415k = c1987c;
        obj.f23407b = hVar;
        obj.f23408c = iArr;
        obj.j = sVar;
        obj.f23409d = i10;
        obj.f23410e = interfaceC1708h;
        obj.f23416l = i3;
        obj.f23411f = j;
        obj.f23412g = i11;
        l lVar2 = lVar;
        obj.f23413h = lVar2;
        long d8 = c1987c.d(i3);
        ArrayList h2 = obj.h();
        obj.f23414i = new r[sVar.length()];
        int i13 = 0;
        int i14 = 0;
        i iVar = obj;
        while (i14 < iVar.f23414i.length) {
            z0.m mVar2 = (z0.m) h2.get(sVar.i(i14));
            C1986b i15 = hVar.i(mVar2.f23695b);
            r[] rVarArr2 = iVar.f23414i;
            C1986b c1986b = i15 == null ? (C1986b) mVar2.f23695b.get(i13) : i15;
            c0398e.getClass();
            C1438m c1438m2 = mVar2.f23694a;
            String str = c1438m2.f18215m;
            if (!AbstractC1405B.k(str)) {
                if (str != null && (str.startsWith(StubApp.getString2(19246)) || str.startsWith(StubApp.getString2(22271)) || str.startsWith(StubApp.getString2(22276)) || str.startsWith(StubApp.getString2(22270)) || str.startsWith(StubApp.getString2(22277)) || str.startsWith(StubApp.getString2(24579)))) {
                    i12 = i14;
                    mVar = mVar2;
                    c1438m = c1438m2;
                    rVarArr = rVarArr2;
                    hVar2 = new C1141d((C1145A) c0398e.f9344b, c0398e.f9343a ? 1 : 3);
                } else if (Objects.equals(str, StubApp.getString2(6953))) {
                    hVar2 = new X0.a(1);
                } else if (Objects.equals(str, StubApp.getString2(6955))) {
                    hVar2 = new X0.a(1, (byte) 0);
                } else {
                    int i16 = z2 ? 4 : 0;
                    rVarArr = rVarArr2;
                    i12 = i14;
                    c1438m = c1438m2;
                    int i17 = c0398e.f9343a ? i16 : i16 | 32;
                    mVar = mVar2;
                    hVar2 = new n1.h((C1145A) c0398e.f9344b, i17, null, null, arrayList, lVar2);
                }
                dVar = new M0.d(hVar2, i10, c1438m);
                long j3 = d8;
                rVarArr[i12] = new r(j3, mVar, c1986b, dVar, 0L, mVar.c());
                i14 = i12 + 1;
                iVar = this;
                lVar2 = lVar;
                d8 = j3;
                i13 = 0;
            } else if (c0398e.f9343a) {
                hVar2 = new q1.h(((C1145A) c0398e.f9344b).e(c1438m2), c1438m2);
            } else {
                dVar = null;
                i12 = i14;
                mVar = mVar2;
                rVarArr = rVarArr2;
                long j32 = d8;
                rVarArr[i12] = new r(j32, mVar, c1986b, dVar, 0L, mVar.c());
                i14 = i12 + 1;
                iVar = this;
                lVar2 = lVar;
                d8 = j32;
                i13 = 0;
            }
            i12 = i14;
            mVar = mVar2;
            c1438m = c1438m2;
            rVarArr = rVarArr2;
            dVar = new M0.d(hVar2, i10, c1438m);
            long j322 = d8;
            rVarArr[i12] = new r(j322, mVar, c1986b, dVar, 0L, mVar.c());
            i14 = i12 + 1;
            iVar = this;
            lVar2 = lVar;
            d8 = j322;
            i13 = 0;
        }
    }

    @Override // M0.i
    public final void a() {
        C0106b c0106b = this.f23417m;
        if (c0106b != null) {
            throw c0106b;
        }
        this.f23406a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r3 < (((r0.x() + r10) + r8) - 1)) goto L15;
     */
    @Override // M0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r19, v0.c0 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            l4.r[] r0 = r7.f23414i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L64
            r5 = r0[r4]
            java.lang.Object r6 = r5.f16603g
            y0.h r6 = (y0.h) r6
            if (r6 == 0) goto L5f
            long r8 = r5.d()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L5f
        L1d:
            java.lang.Object r0 = r5.f16603g
            y0.h r0 = (y0.h) r0
            r0.AbstractC1550k.h(r0)
            long r3 = r5.f16598b
            long r3 = r0.p(r1, r3)
            long r10 = r5.f16599c
            long r3 = r3 + r10
            r12 = r3
            long r3 = r5.f(r12)
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 >= 0) goto L58
            r14 = -1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r14 = 1
            if (r6 == 0) goto L4f
            r0.AbstractC1550k.h(r0)
            long r16 = r0.x()
            long r16 = r16 + r10
            long r16 = r16 + r8
            long r16 = r16 - r14
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 >= 0) goto L58
        L4f:
            long r8 = r12 + r14
            long r5 = r5.f(r8)
        L55:
            r0 = r21
            goto L5a
        L58:
            r5 = r3
            goto L55
        L5a:
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5f:
            int r4 = r4 + 1
            r1 = r19
            goto L8
        L64:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.i.b(long, v0.c0):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0240, code lost:
    
        if (r11 != r16) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(v0.I r59, long r60, java.util.List r62, aa.C0398e r63) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.i.c(v0.I, long, java.util.List, aa.e):void");
    }

    @Override // M0.i
    public final boolean d(long j, M0.e eVar, List list) {
        if (this.f23417m != null) {
            return false;
        }
        return this.j.d(j, eVar, list);
    }

    @Override // M0.i
    public final boolean e(M0.e eVar, boolean z2, x xVar, I4.e eVar2) {
        long j;
        if (z2) {
            l lVar = this.f23413h;
            if (lVar != null) {
                long j3 = lVar.f23432d;
                boolean z10 = j3 != -9223372036854775807L && j3 < eVar.f4461g;
                m mVar = lVar.f23433e;
                if (mVar.f23439f.f23649d) {
                    if (!mVar.f23441h) {
                        if (z10) {
                            if (mVar.f23440g) {
                                mVar.f23441h = true;
                                mVar.f23440g = false;
                                g gVar = (g) mVar.f23435b.f13742a;
                                gVar.f23379G.removeCallbacks(gVar.f23405z);
                                gVar.B();
                                return true;
                            }
                        }
                    }
                    return true;
                }
            }
            boolean z11 = this.f23415k.f23649d;
            r[] rVarArr = this.f23414i;
            if (!z11 && (eVar instanceof M0.l)) {
                IOException iOException = (IOException) xVar.f1862b;
                if ((iOException instanceof C1721u) && ((C1721u) iOException).f21114d == 404) {
                    r rVar = rVarArr[this.j.m(eVar.f4458d)];
                    long d8 = rVar.d();
                    if (d8 != -1 && d8 != 0) {
                        h hVar = (h) rVar.f16603g;
                        AbstractC1550k.h(hVar);
                        if (((M0.l) eVar).a() > ((hVar.x() + rVar.f16599c) + d8) - 1) {
                            this.f23418n = true;
                            return true;
                        }
                    }
                }
            }
            r rVar2 = rVarArr[this.j.m(eVar.f4458d)];
            I i3 = ((z0.m) rVar2.f16601e).f23695b;
            p2.h hVar2 = this.f23407b;
            C1986b i10 = hVar2.i(i3);
            C1986b c1986b = (C1986b) rVar2.f16602f;
            if (i10 == null || c1986b.equals(i10)) {
                s sVar = this.j;
                I i11 = ((z0.m) rVar2.f16601e).f23695b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int length = sVar.length();
                int i12 = 0;
                for (int i13 = 0; i13 < length; i13++) {
                    if (sVar.a(i13, elapsedRealtime)) {
                        i12++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i14 = 0; i14 < i11.size(); i14++) {
                    hashSet.add(Integer.valueOf(((C1986b) i11.get(i14)).f23644c));
                }
                int size = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList b2 = hVar2.b(i11);
                for (int i15 = 0; i15 < b2.size(); i15++) {
                    hashSet2.add(Integer.valueOf(((C1986b) b2.get(i15)).f23644c));
                }
                P0.i iVar = new P0.i(size, size - hashSet2.size(), length, i12);
                if (iVar.a(2) || iVar.a(1)) {
                    eVar2.getClass();
                    A1.g s10 = I4.e.s(iVar, xVar);
                    if (s10 != null) {
                        int i16 = s10.f72a;
                        if (iVar.a(i16)) {
                            long j10 = s10.f73b;
                            if (i16 == 2) {
                                s sVar2 = this.j;
                                return sVar2.p(sVar2.m(eVar.f4458d), j10);
                            }
                            if (i16 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j10;
                                String str = c1986b.f23643b;
                                HashMap hashMap = (HashMap) hVar2.f19671a;
                                if (hashMap.containsKey(str)) {
                                    Long l9 = (Long) hashMap.get(str);
                                    int i17 = AbstractC1560u.f20190a;
                                    j = Math.max(elapsedRealtime2, l9.longValue());
                                } else {
                                    j = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j));
                                int i18 = c1986b.f23644c;
                                if (i18 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i18);
                                    HashMap hashMap2 = (HashMap) hVar2.f19672b;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l10 = (Long) hashMap2.get(valueOf);
                                        int i19 = AbstractC1560u.f20190a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l10.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // M0.i
    public final int f(long j, List list) {
        return (this.f23417m != null || this.j.length() < 2) ? list.size() : this.j.j(j, list);
    }

    @Override // M0.i
    public final void g(M0.e eVar) {
        if (eVar instanceof M0.k) {
            int m4 = this.j.m(((M0.k) eVar).f4458d);
            r[] rVarArr = this.f23414i;
            r rVar = rVarArr[m4];
            if (((h) rVar.f16603g) == null) {
                M0.d dVar = (M0.d) rVar.f16600d;
                AbstractC1550k.h(dVar);
                B b2 = dVar.f4454h;
                T0.k kVar = b2 instanceof T0.k ? (T0.k) b2 : null;
                if (kVar != null) {
                    z0.m mVar = (z0.m) rVar.f16601e;
                    rVarArr[m4] = new r(rVar.f16598b, mVar, (C1986b) rVar.f16602f, (M0.d) rVar.f16600d, rVar.f16599c, new Cc.a(kVar, mVar.f23696c, 9));
                }
            }
        }
        l lVar = this.f23413h;
        if (lVar != null) {
            long j = lVar.f23432d;
            if (j == -9223372036854775807L || eVar.f4462h > j) {
                lVar.f23432d = eVar.f4462h;
            }
            lVar.f23433e.f23440g = true;
        }
    }

    public final ArrayList h() {
        List list = this.f23415k.b(this.f23416l).f23680c;
        ArrayList arrayList = new ArrayList();
        for (int i3 : this.f23408c) {
            arrayList.addAll(((C1985a) list.get(i3)).f23638c);
        }
        return arrayList;
    }

    public final r i(int i3) {
        r[] rVarArr = this.f23414i;
        r rVar = rVarArr[i3];
        C1986b i10 = this.f23407b.i(((z0.m) rVar.f16601e).f23695b);
        if (i10 == null || i10.equals((C1986b) rVar.f16602f)) {
            return rVar;
        }
        r rVar2 = new r(rVar.f16598b, (z0.m) rVar.f16601e, i10, (M0.d) rVar.f16600d, rVar.f16599c, (h) rVar.f16603g);
        rVarArr[i3] = rVar2;
        return rVar2;
    }

    @Override // M0.i
    public final void release() {
        for (r rVar : this.f23414i) {
            M0.d dVar = (M0.d) rVar.f16600d;
            if (dVar != null) {
                dVar.f4447a.release();
            }
        }
    }
}
