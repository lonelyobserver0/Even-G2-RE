package B0;

import M4.G;
import M4.I;
import M4.Z;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import h1.C1005h;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import m1.C1268d;
import o0.AbstractC1405B;
import o0.C1404A;
import o0.C1435j;
import o0.C1437l;
import o0.C1438m;
import o0.z;
import q8.AbstractC1526a;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.C1558s;
import t0.C1711k;
import t0.InterfaceC1708h;
import z1.C1992D;
import z1.C1997b;
import z1.C1999d;
import z1.C2000e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends M0.l {

    /* renamed from: T, reason: collision with root package name */
    public static final AtomicInteger f442T = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public final C1435j f443A;

    /* renamed from: B, reason: collision with root package name */
    public final C1005h f444B;

    /* renamed from: C, reason: collision with root package name */
    public final C1553n f445C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f446D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f447E;

    /* renamed from: F, reason: collision with root package name */
    public b f448F;

    /* renamed from: G, reason: collision with root package name */
    public r f449G;

    /* renamed from: H, reason: collision with root package name */
    public int f450H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f451I;

    /* renamed from: K, reason: collision with root package name */
    public volatile boolean f452K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f453L;

    /* renamed from: O, reason: collision with root package name */
    public Z f454O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f455P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f456R;

    /* renamed from: l, reason: collision with root package name */
    public final int f457l;

    /* renamed from: m, reason: collision with root package name */
    public final int f458m;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f459n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f460p;

    /* renamed from: q, reason: collision with root package name */
    public final int f461q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC1708h f462r;

    /* renamed from: s, reason: collision with root package name */
    public final C1711k f463s;

    /* renamed from: t, reason: collision with root package name */
    public final b f464t;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f465v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f466w;

    /* renamed from: x, reason: collision with root package name */
    public final C1558s f467x;

    /* renamed from: y, reason: collision with root package name */
    public final c f468y;

    /* renamed from: z, reason: collision with root package name */
    public final List f469z;

    public j(c cVar, InterfaceC1708h interfaceC1708h, C1711k c1711k, C1438m c1438m, boolean z2, InterfaceC1708h interfaceC1708h2, C1711k c1711k2, boolean z10, Uri uri, List list, int i3, Object obj, long j, long j3, long j10, int i10, boolean z11, int i11, boolean z12, boolean z13, C1558s c1558s, C1435j c1435j, b bVar, C1005h c1005h, C1553n c1553n, boolean z14, w0.j jVar) {
        super(interfaceC1708h, c1711k, c1438m, i3, obj, j, j3, j10);
        this.f446D = z2;
        this.f461q = i10;
        this.f456R = z11;
        this.f458m = i11;
        this.f463s = c1711k2;
        this.f462r = interfaceC1708h2;
        this.f451I = c1711k2 != null;
        this.f447E = z10;
        this.f459n = uri;
        this.f465v = z13;
        this.f467x = c1558s;
        this.f466w = z12;
        this.f468y = cVar;
        this.f469z = list;
        this.f443A = c1435j;
        this.f464t = bVar;
        this.f444B = c1005h;
        this.f445C = c1553n;
        this.f460p = z14;
        G g10 = I.f4549b;
        this.f454O = Z.f4578e;
        this.f457l = f442T.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (AbstractC0624h2.y(str).startsWith(StubApp.getString2(463))) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // M0.l
    public final boolean b() {
        throw null;
    }

    public final void c(InterfaceC1708h interfaceC1708h, C1711k c1711k, boolean z2, boolean z10) {
        C1711k a3;
        long j;
        long j3;
        if (z2) {
            r0 = this.f450H != 0;
            a3 = c1711k;
        } else {
            a3 = c1711k.a(this.f450H);
        }
        try {
            T0.l f10 = f(interfaceC1708h, a3, z10);
            if (r0) {
                f10.u(this.f450H);
            }
            while (!this.f452K) {
                try {
                    try {
                        if (this.f448F.f406a.c(f10, b.f405f) != 0) {
                            break;
                        }
                    } catch (EOFException e10) {
                        if ((this.f4458d.f18209f & 16384) == 0) {
                            throw e10;
                        }
                        this.f448F.f406a.b(0L, 0L);
                        j = f10.f7030d;
                        j3 = c1711k.f21081e;
                    }
                } catch (Throwable th) {
                    this.f450H = (int) (f10.f7030d - c1711k.f21081e);
                    throw th;
                }
            }
            j = f10.f7030d;
            j3 = c1711k.f21081e;
            this.f450H = (int) (j - j3);
        } finally {
            W.a.a(interfaceC1708h);
        }
    }

    public final int e(int i3) {
        AbstractC1550k.g(!this.f460p);
        Z z2 = this.f454O;
        if (i3 >= z2.f4580d) {
            return 0;
        }
        return ((Integer) z2.get(i3)).intValue();
    }

    public final T0.l f(InterfaceC1708h interfaceC1708h, C1711k c1711k, boolean z2) {
        int i3;
        int i10;
        int i11;
        long j;
        long j3;
        long j10;
        b bVar;
        C1558s c1558s;
        ArrayList arrayList;
        T0.o c1997b;
        boolean z10;
        q1.j jVar;
        boolean z11;
        q1.j jVar2;
        T0.o hVar;
        List singletonList;
        int i12;
        int i13;
        int i14;
        T0.o c1268d;
        long n10 = interfaceC1708h.n(c1711k);
        long j11 = this.f4461g;
        C1558s c1558s2 = this.f467x;
        if (z2) {
            try {
                c1558s2.g(j11, this.f465v);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e10) {
                throw new IOException(e10);
            }
        }
        T0.l lVar = new T0.l(interfaceC1708h, c1711k.f21081e, n10);
        if (this.f448F == null) {
            C1553n c1553n = this.f445C;
            lVar.f7032f = 0;
            try {
                c1553n.D(10);
                lVar.i(c1553n.f20176a, 0, 10, false);
                i11 = 4;
            } catch (EOFException unused2) {
                i11 = 4;
                j = -9223372036854775807L;
            }
            if (c1553n.x() != 4801587) {
                j3 = -9223372036854775807L;
                j = -9223372036854775807L;
            } else {
                c1553n.H(3);
                int t3 = c1553n.t();
                int i15 = t3 + 10;
                j = -9223372036854775807L;
                byte[] bArr = c1553n.f20176a;
                if (i15 > bArr.length) {
                    c1553n.D(i15);
                    System.arraycopy(bArr, 0, c1553n.f20176a, 0, 10);
                }
                lVar.i(c1553n.f20176a, 10, t3, false);
                C1404A z12 = this.f444B.z(t3, c1553n.f20176a);
                if (z12 != null) {
                    for (z zVar : z12.f18017a) {
                        if (zVar instanceof h1.m) {
                            h1.m mVar = (h1.m) zVar;
                            if (StubApp.getString2(464).equals(mVar.f14457b)) {
                                System.arraycopy(mVar.f14458c, 0, c1553n.f20176a, 0, 8);
                                c1553n.G(0);
                                c1553n.F(8);
                                j3 = c1553n.o() & 8589934591L;
                                break;
                            }
                        }
                    }
                }
                j3 = j;
            }
            lVar.f7032f = 0;
            b bVar2 = this.f464t;
            if (bVar2 == null) {
                Map s10 = interfaceC1708h.s();
                c cVar = this.f468y;
                cVar.getClass();
                C1438m c1438m = this.f4458d;
                int y10 = AbstractC1526a.y(c1438m.f18216n);
                List list = (List) s10.get(StubApp.getString2(466));
                int y11 = AbstractC1526a.y((list == null || list.isEmpty()) ? null : (String) list.get(0));
                int z13 = AbstractC1526a.z(c1711k.f21077a);
                ArrayList arrayList2 = new ArrayList(7);
                c.a(y10, arrayList2);
                c.a(y11, arrayList2);
                c.a(z13, arrayList2);
                int[] iArr = c.f411c;
                int i16 = 1;
                int i17 = 0;
                for (int i18 = 7; i17 < i18; i18 = 7) {
                    c.a(iArr[i17], arrayList2);
                    i17++;
                }
                lVar.f7032f = 0;
                int i19 = 0;
                T0.o oVar = null;
                while (true) {
                    int size = arrayList2.size();
                    C1558s c1558s3 = this.f467x;
                    if (i19 >= size) {
                        j10 = j11;
                        i3 = 0;
                        oVar.getClass();
                        bVar = new b(oVar, c1438m, c1558s3, cVar.f412a, cVar.f413b);
                        break;
                    }
                    int intValue = ((Integer) arrayList2.get(i19)).intValue();
                    int i20 = i19;
                    if (intValue == 0) {
                        c1558s = c1558s3;
                        j10 = j11;
                        arrayList = arrayList2;
                        c1997b = new C1997b();
                    } else if (intValue == i16) {
                        c1558s = c1558s3;
                        j10 = j11;
                        arrayList = arrayList2;
                        c1997b = new C1999d();
                    } else if (intValue == 2) {
                        c1558s = c1558s3;
                        j10 = j11;
                        arrayList = arrayList2;
                        c1997b = new C2000e();
                    } else if (intValue != 7) {
                        q1.j jVar3 = q1.j.f19902j0;
                        List list2 = this.f469z;
                        if (intValue == 8) {
                            j10 = j11;
                            arrayList = arrayList2;
                            q1.j jVar4 = cVar.f412a;
                            boolean z14 = cVar.f413b;
                            C1404A c1404a = c1438m.f18214l;
                            if (c1404a != null) {
                                int i21 = 0;
                                q1.j jVar5 = jVar4;
                                while (true) {
                                    z[] zVarArr = c1404a.f18017a;
                                    jVar = jVar5;
                                    if (i21 >= zVarArr.length) {
                                        break;
                                    }
                                    z zVar2 = zVarArr[i21];
                                    if (zVar2 instanceof u) {
                                        z11 = !((u) zVar2).f577c.isEmpty();
                                        break;
                                    }
                                    i21++;
                                    jVar5 = jVar;
                                }
                            } else {
                                jVar = jVar4;
                            }
                            z11 = false;
                            int i22 = z11 ? i11 : 0;
                            if (z14) {
                                jVar2 = jVar;
                            } else {
                                i22 |= 32;
                                jVar2 = jVar3;
                            }
                            hVar = new n1.h(jVar2, i22, c1558s3, null, list2 != null ? list2 : Z.f4578e, null);
                            c1558s = c1558s3;
                        } else if (intValue == 11) {
                            j10 = j11;
                            arrayList = arrayList2;
                            q1.j jVar6 = cVar.f412a;
                            boolean z15 = cVar.f413b;
                            if (list2 != null) {
                                i12 = 48;
                                singletonList = list2;
                            } else {
                                C1437l c1437l = new C1437l();
                                c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(467));
                                singletonList = Collections.singletonList(new C1438m(c1437l));
                                i12 = 16;
                            }
                            String str = c1438m.f18213k;
                            c1558s = c1558s3;
                            if (!TextUtils.isEmpty(str)) {
                                if (AbstractC1405B.b(str, StubApp.getString2(468)) == null) {
                                    i12 |= 2;
                                }
                                if (AbstractC1405B.b(str, StubApp.getString2(469)) == null) {
                                    i12 |= 4;
                                }
                            }
                            hVar = new C1992D(2, !z15 ? 1 : 0, !z15 ? jVar3 : jVar6, c1558s, new K.i(i12, singletonList));
                        } else if (intValue != 13) {
                            c1558s = c1558s3;
                            j10 = j11;
                            arrayList = arrayList2;
                            c1997b = null;
                        } else {
                            j10 = j11;
                            arrayList = arrayList2;
                            c1997b = new w(c1438m.f18207d, c1558s3, cVar.f412a, cVar.f413b);
                            c1558s = c1558s3;
                        }
                        c1997b = hVar;
                    } else {
                        c1558s = c1558s3;
                        j10 = j11;
                        arrayList = arrayList2;
                        c1997b = new C1268d(0L);
                    }
                    c1997b.getClass();
                    try {
                        z10 = c1997b.h(lVar);
                        i3 = 0;
                        lVar.f7032f = 0;
                    } catch (EOFException unused3) {
                        i3 = 0;
                        lVar.f7032f = 0;
                        z10 = false;
                    } catch (Throwable th) {
                        lVar.f7032f = 0;
                        throw th;
                    }
                    if (z10) {
                        bVar = new b(c1997b, c1438m, c1558s, cVar.f412a, cVar.f413b);
                        break;
                    }
                    T0.o oVar2 = c1997b;
                    C1438m c1438m2 = c1438m;
                    if (oVar == null && (intValue == y10 || intValue == y11 || intValue == z13 || intValue == 11)) {
                        oVar = oVar2;
                    }
                    c1438m = c1438m2;
                    i19 = i20 + 1;
                    arrayList2 = arrayList;
                    j11 = j10;
                    i16 = 1;
                }
            } else {
                T0.o oVar3 = bVar2.f406a;
                AbstractC1550k.g(!((oVar3 instanceof C1992D) || (oVar3 instanceof n1.h)));
                oVar3.getClass().toString();
                if (oVar3 instanceof w) {
                    c1268d = new w(bVar2.f407b.f18207d, bVar2.f408c, bVar2.f409d, bVar2.f410e);
                } else if (oVar3 instanceof C2000e) {
                    c1268d = new C2000e();
                } else if (oVar3 instanceof C1997b) {
                    c1268d = new C1997b();
                } else if (oVar3 instanceof C1999d) {
                    c1268d = new C1999d();
                } else {
                    if (!(oVar3 instanceof C1268d)) {
                        throw new IllegalStateException(StubApp.getString2(465).concat(oVar3.getClass().getSimpleName()));
                    }
                    c1268d = new C1268d();
                }
                bVar = new b(c1268d, bVar2.f407b, bVar2.f408c, bVar2.f409d, bVar2.f410e);
                j10 = j11;
                i3 = 0;
            }
            b bVar3 = bVar;
            this.f448F = bVar3;
            T0.o oVar4 = bVar3.f406a;
            if ((((oVar4 instanceof C2000e) || (oVar4 instanceof C1997b) || (oVar4 instanceof C1999d) || (oVar4 instanceof C1268d)) ? 1 : i3) != 0) {
                r rVar = this.f449G;
                long b2 = j3 != j ? c1558s2.b(j3) : j10;
                if (rVar.f556p0 != b2) {
                    rVar.f556p0 = b2;
                    q[] qVarArr = rVar.f566y;
                    int length = qVarArr.length;
                    int i23 = i3;
                    while (i23 < length) {
                        q qVar = qVarArr[i23];
                        if (qVar.f4012F != b2) {
                            qVar.f4012F = b2;
                            i14 = 1;
                            qVar.f4038z = true;
                        } else {
                            i14 = 1;
                        }
                        i23 += i14;
                    }
                }
            } else {
                r rVar2 = this.f449G;
                if (rVar2.f556p0 != 0) {
                    rVar2.f556p0 = 0L;
                    q[] qVarArr2 = rVar2.f566y;
                    int length2 = qVarArr2.length;
                    int i24 = i3;
                    while (i24 < length2) {
                        q qVar2 = qVarArr2[i24];
                        if (qVar2.f4012F != 0) {
                            qVar2.f4012F = 0L;
                            i13 = 1;
                            qVar2.f4038z = true;
                        } else {
                            i13 = 1;
                        }
                        i24 += i13;
                    }
                }
            }
            this.f449G.f520A.clear();
            this.f448F.f406a.f(this.f449G);
        } else {
            i3 = 0;
        }
        r rVar3 = this.f449G;
        C1435j c1435j = rVar3.f558q0;
        int i25 = AbstractC1560u.f20190a;
        C1435j c1435j2 = this.f443A;
        if (!Objects.equals(c1435j, c1435j2)) {
            rVar3.f558q0 = c1435j2;
            int i26 = i3;
            while (true) {
                q[] qVarArr3 = rVar3.f566y;
                if (i26 >= qVarArr3.length) {
                    break;
                }
                if (rVar3.f537Z[i26]) {
                    q qVar3 = qVarArr3[i26];
                    qVar3.f518I = c1435j2;
                    i10 = 1;
                    qVar3.f4038z = true;
                } else {
                    i10 = 1;
                }
                i26 += i10;
            }
        }
        return lVar;
    }

    @Override // P0.l
    public final void l() {
        b bVar;
        this.f449G.getClass();
        if (this.f448F == null && (bVar = this.f464t) != null) {
            T0.o oVar = bVar.f406a;
            if ((oVar instanceof C1992D) || (oVar instanceof n1.h)) {
                this.f448F = bVar;
                this.f451I = false;
            }
        }
        if (this.f451I) {
            InterfaceC1708h interfaceC1708h = this.f462r;
            interfaceC1708h.getClass();
            C1711k c1711k = this.f463s;
            c1711k.getClass();
            c(interfaceC1708h, c1711k, this.f447E, false);
            this.f450H = 0;
            this.f451I = false;
        }
        if (this.f452K) {
            return;
        }
        if (!this.f466w) {
            c(this.j, this.f4456b, this.f446D, true);
        }
        this.f453L = !this.f452K;
    }

    @Override // P0.l
    public final void o() {
        this.f452K = true;
    }
}
