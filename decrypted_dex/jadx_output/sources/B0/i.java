package B0;

import L0.C0106b;
import M4.G;
import M4.I;
import M4.Z;
import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o0.C1417N;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1711k;
import t0.InterfaceC1707g;
import t0.InterfaceC1708h;
import t0.InterfaceC1726z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final c f424a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1708h f425b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1708h f426c;

    /* renamed from: d, reason: collision with root package name */
    public final A0.c f427d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f428e;

    /* renamed from: f, reason: collision with root package name */
    public final C1438m[] f429f;

    /* renamed from: g, reason: collision with root package name */
    public final C0.c f430g;

    /* renamed from: h, reason: collision with root package name */
    public final C1417N f431h;

    /* renamed from: i, reason: collision with root package name */
    public final List f432i;

    /* renamed from: k, reason: collision with root package name */
    public final w0.j f433k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f434l;

    /* renamed from: n, reason: collision with root package name */
    public C0106b f436n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f437o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f438p;

    /* renamed from: q, reason: collision with root package name */
    public O0.s f439q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f441s;
    public final s2.d j = new s2.d(2);

    /* renamed from: m, reason: collision with root package name */
    public byte[] f435m = AbstractC1560u.f20195f;

    /* renamed from: r, reason: collision with root package name */
    public long f440r = -9223372036854775807L;

    public i(c cVar, C0.c cVar2, Uri[] uriArr, C1438m[] c1438mArr, Z9.q qVar, InterfaceC1726z interfaceC1726z, A0.c cVar3, List list, w0.j jVar) {
        this.f424a = cVar;
        this.f430g = cVar2;
        this.f428e = uriArr;
        this.f429f = c1438mArr;
        this.f427d = cVar3;
        this.f432i = list;
        this.f433k = jVar;
        InterfaceC1708h g10 = ((InterfaceC1707g) qVar.f9143b).g();
        this.f425b = g10;
        if (interfaceC1726z != null) {
            g10.y(interfaceC1726z);
        }
        this.f426c = ((InterfaceC1707g) qVar.f9143b).g();
        this.f431h = new C1417N("", c1438mArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < uriArr.length; i3++) {
            if ((c1438mArr[i3].f18209f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        C1417N c1417n = this.f431h;
        int[] z2 = android.support.v4.media.session.b.z(arrayList);
        g gVar = new g(c1417n, z2);
        gVar.f419g = gVar.m(c1417n.f18070d[z2[0]]);
        this.f439q = gVar;
    }

    public final M0.m[] a(j jVar, long j) {
        int i3;
        List list;
        i iVar = this;
        j jVar2 = jVar;
        int a3 = jVar2 == null ? -1 : iVar.f431h.a(jVar2.f4458d);
        int length = iVar.f439q.length();
        M0.m[] mVarArr = new M0.m[length];
        boolean z2 = false;
        int i10 = 0;
        while (i10 < length) {
            int i11 = iVar.f439q.i(i10);
            Uri uri = iVar.f428e[i11];
            C0.c cVar = iVar.f430g;
            if (cVar.c(uri)) {
                C0.i a9 = cVar.a(z2, uri);
                a9.getClass();
                long j3 = a9.f947h - cVar.f920p;
                Pair c10 = iVar.c(jVar2, i11 != a3 ? true : z2, a9, j3, j);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                i3 = i10;
                int i12 = (int) (longValue - a9.f949k);
                if (i12 >= 0) {
                    I i13 = a9.f956r;
                    if (i13.size() >= i12) {
                        ArrayList arrayList = new ArrayList();
                        if (i12 < i13.size()) {
                            if (intValue != -1) {
                                C0.f fVar = (C0.f) i13.get(i12);
                                if (intValue == 0) {
                                    arrayList.add(fVar);
                                } else if (intValue < fVar.f927n.size()) {
                                    I i14 = fVar.f927n;
                                    arrayList.addAll(i14.subList(intValue, i14.size()));
                                }
                                i12++;
                            }
                            arrayList.addAll(i13.subList(i12, i13.size()));
                            intValue = 0;
                        }
                        if (a9.f952n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            I i15 = a9.f957s;
                            if (intValue < i15.size()) {
                                arrayList.addAll(i15.subList(intValue, i15.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        mVarArr[i3] = new f(j3, list);
                    }
                }
                G g10 = I.f4549b;
                list = Z.f4578e;
                mVarArr[i3] = new f(j3, list);
            } else {
                mVarArr[i10] = M0.m.f4503o;
                i3 = i10;
            }
            i10 = i3 + 1;
            iVar = this;
            jVar2 = jVar;
            z2 = false;
        }
        return mVarArr;
    }

    public final int b(j jVar) {
        if (jVar.f461q == -1) {
            return 1;
        }
        C0.i a3 = this.f430g.a(false, this.f428e[this.f431h.a(jVar.f4458d)]);
        a3.getClass();
        int i3 = (int) (jVar.f4502k - a3.f949k);
        if (i3 < 0) {
            return 1;
        }
        I i10 = a3.f956r;
        I i11 = i3 < i10.size() ? ((C0.f) i10.get(i3)).f927n : a3.f957s;
        int size = i11.size();
        int i12 = jVar.f461q;
        if (i12 >= size) {
            return 2;
        }
        C0.d dVar = (C0.d) i11.get(i12);
        if (dVar.f922n) {
            return 0;
        }
        return Objects.equals(Uri.parse(AbstractC1550k.t(a3.f980a, dVar.f928a)), jVar.f4456b.f21077a) ? 1 : 2;
    }

    public final Pair c(j jVar, boolean z2, C0.i iVar, long j, long j3) {
        boolean z10 = true;
        if (jVar != null && !z2) {
            boolean z11 = jVar.f453L;
            long j10 = jVar.f4502k;
            int i3 = jVar.f461q;
            if (!z11) {
                return new Pair(Long.valueOf(j10), Integer.valueOf(i3));
            }
            if (i3 == -1) {
                j10 = jVar.a();
            }
            return new Pair(Long.valueOf(j10), Integer.valueOf(i3 != -1 ? i3 + 1 : -1));
        }
        long j11 = iVar.f959u + j;
        if (jVar != null && !this.f438p) {
            j3 = jVar.f4461g;
        }
        boolean z12 = iVar.f953o;
        long j12 = iVar.f949k;
        I i10 = iVar.f956r;
        if (!z12 && j3 >= j11) {
            return new Pair(Long.valueOf(j12 + i10.size()), -1);
        }
        long j13 = j3 - j;
        Long valueOf = Long.valueOf(j13);
        int i11 = 0;
        if (this.f430g.f919n && jVar != null) {
            z10 = false;
        }
        int c10 = AbstractC1560u.c(i10, valueOf, z10);
        long j14 = c10 + j12;
        if (c10 >= 0) {
            C0.f fVar = (C0.f) i10.get(c10);
            long j15 = fVar.f932e + fVar.f930c;
            I i12 = iVar.f957s;
            I i13 = j13 < j15 ? fVar.f927n : i12;
            while (true) {
                if (i11 >= i13.size()) {
                    break;
                }
                C0.d dVar = (C0.d) i13.get(i11);
                if (j13 >= dVar.f932e + dVar.f930c) {
                    i11++;
                } else if (dVar.f921m) {
                    j14 += i13 == i12 ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j14), Integer.valueOf(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e d(Uri uri, int i3, boolean z2) {
        if (uri == null) {
            return null;
        }
        s2.d dVar = this.j;
        byte[] bArr = (byte[]) ((d) dVar.f20712b).remove(uri);
        if (bArr != null) {
            return null;
        }
        C1711k c1711k = new C1711k(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        C1438m c1438m = this.f429f[i3];
        int o5 = this.f439q.o();
        Object r8 = this.f439q.r();
        byte[] bArr2 = this.f435m;
        e eVar = new e(this.f426c, c1711k, 3, c1438m, o5, r8, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = AbstractC1560u.f20195f;
        }
        eVar.f414k = bArr2;
        return eVar;
    }
}
