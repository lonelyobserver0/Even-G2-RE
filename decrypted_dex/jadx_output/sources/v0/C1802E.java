package v0;

import L0.C0106b;
import L0.C0119o;
import L0.InterfaceC0128y;
import L0.InterfaceC0129z;
import L0.h0;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.recyclerview.widget.C0466t;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.C1161a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import o0.AbstractC1416M;
import o0.C1404A;
import o0.C1406C;
import o0.C1408E;
import o0.C1413J;
import o0.C1414K;
import o0.C1415L;
import o0.C1438m;
import o0.C1443r;
import o0.C1447v;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1555p;
import r0.C1556q;
import r0.C1557r;
import sb.C1644e0;
import t0.C1709i;

/* renamed from: v0.E, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1802E implements Handler.Callback, InterfaceC0128y, X {

    /* renamed from: q0, reason: collision with root package name */
    public static final long f21534q0 = AbstractC1560u.V(10000);

    /* renamed from: A, reason: collision with root package name */
    public final w0.c f21535A;

    /* renamed from: B, reason: collision with root package name */
    public final C1557r f21536B;

    /* renamed from: C, reason: collision with root package name */
    public c0 f21537C;

    /* renamed from: D, reason: collision with root package name */
    public W f21538D;

    /* renamed from: E, reason: collision with root package name */
    public C0466t f21539E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f21540F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f21542H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f21543I;

    /* renamed from: L, reason: collision with root package name */
    public boolean f21545L;

    /* renamed from: O, reason: collision with root package name */
    public int f21546O;

    /* renamed from: R, reason: collision with root package name */
    public boolean f21548R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f21549T;

    /* renamed from: X, reason: collision with root package name */
    public boolean f21550X;

    /* renamed from: Y, reason: collision with root package name */
    public int f21551Y;

    /* renamed from: Z, reason: collision with root package name */
    public C1801D f21552Z;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1810e[] f21553a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f21554b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1810e[] f21555c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f21556d;

    /* renamed from: e, reason: collision with root package name */
    public final O0.v f21557e;

    /* renamed from: f, reason: collision with root package name */
    public final O0.w f21558f;

    /* renamed from: g, reason: collision with root package name */
    public final C1815j f21559g;

    /* renamed from: h, reason: collision with root package name */
    public final P0.d f21560h;
    public long h0;
    public final C1557r j;

    /* renamed from: k, reason: collision with root package name */
    public final P3.m f21561k;

    /* renamed from: k0, reason: collision with root package name */
    public long f21562k0;

    /* renamed from: l, reason: collision with root package name */
    public final Looper f21563l;

    /* renamed from: l0, reason: collision with root package name */
    public int f21564l0;

    /* renamed from: m, reason: collision with root package name */
    public final C1415L f21565m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f21566m0;

    /* renamed from: n, reason: collision with root package name */
    public final C1414K f21567n;

    /* renamed from: n0, reason: collision with root package name */
    public C1817l f21568n0;

    /* renamed from: p, reason: collision with root package name */
    public final long f21570p;

    /* renamed from: p0, reason: collision with root package name */
    public C1819n f21571p0;

    /* renamed from: q, reason: collision with root package name */
    public final Mb.a f21572q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f21573r;

    /* renamed from: s, reason: collision with root package name */
    public final C1555p f21574s;

    /* renamed from: t, reason: collision with root package name */
    public final r f21575t;

    /* renamed from: v, reason: collision with root package name */
    public final M f21576v;

    /* renamed from: w, reason: collision with root package name */
    public final P8.i f21577w;

    /* renamed from: x, reason: collision with root package name */
    public final C1813h f21578x;

    /* renamed from: y, reason: collision with root package name */
    public final long f21579y;

    /* renamed from: z, reason: collision with root package name */
    public final w0.j f21580z;

    /* renamed from: P, reason: collision with root package name */
    public boolean f21547P = false;

    /* renamed from: G, reason: collision with root package name */
    public boolean f21541G = false;

    /* renamed from: o0, reason: collision with root package name */
    public long f21569o0 = -9223372036854775807L;

    /* renamed from: K, reason: collision with root package name */
    public long f21544K = -9223372036854775807L;

    public C1802E(AbstractC1810e[] abstractC1810eArr, O0.v vVar, O0.w wVar, C1815j c1815j, P0.d dVar, int i3, w0.c cVar, c0 c0Var, C1813h c1813h, long j, Looper looper, C1555p c1555p, r rVar, w0.j jVar, C1819n c1819n) {
        Looper looper2;
        this.f21575t = rVar;
        this.f21553a = abstractC1810eArr;
        this.f21557e = vVar;
        this.f21558f = wVar;
        this.f21559g = c1815j;
        this.f21560h = dVar;
        this.f21546O = i3;
        boolean z2 = false;
        this.f21537C = c0Var;
        this.f21578x = c1813h;
        this.f21579y = j;
        this.f21574s = c1555p;
        this.f21580z = jVar;
        this.f21571p0 = c1819n;
        this.f21535A = cVar;
        this.f21570p = c1815j.f21769g;
        C1413J c1413j = AbstractC1416M.f18066a;
        W i10 = W.i(wVar);
        this.f21538D = i10;
        this.f21539E = new C0466t(i10);
        this.f21555c = new AbstractC1810e[abstractC1810eArr.length];
        this.f21556d = new boolean[abstractC1810eArr.length];
        O0.q qVar = (O0.q) vVar;
        qVar.getClass();
        for (int i11 = 0; i11 < abstractC1810eArr.length; i11++) {
            AbstractC1810e abstractC1810e = abstractC1810eArr[i11];
            abstractC1810e.f21720e = i11;
            abstractC1810e.f21721f = jVar;
            abstractC1810e.f21722g = c1555p;
            this.f21555c[i11] = abstractC1810e;
            AbstractC1810e abstractC1810e2 = this.f21555c[i11];
            synchronized (abstractC1810e2.f21716a) {
                abstractC1810e2.f21731s = qVar;
            }
        }
        this.f21572q = new Mb.a(this, c1555p);
        this.f21573r = new ArrayList();
        this.f21554b = Collections.newSetFromMap(new IdentityHashMap());
        this.f21565m = new C1415L();
        this.f21567n = new C1414K();
        vVar.f5187a = this;
        vVar.f5188b = dVar;
        this.f21566m0 = true;
        C1557r a3 = c1555p.a(looper, null);
        this.f21536B = a3;
        this.f21576v = new M(cVar, a3, new C1644e0(this, 10), c1819n);
        this.f21577w = new P8.i(this, cVar, a3, jVar);
        P3.m mVar = new P3.m(4);
        this.f21561k = mVar;
        synchronized (mVar.f5529c) {
            try {
                if (((Looper) mVar.f5530d) == null) {
                    if (mVar.f5528b == 0 && ((HandlerThread) mVar.f5531e) == null) {
                        z2 = true;
                    }
                    AbstractC1550k.g(z2);
                    HandlerThread handlerThread = new HandlerThread(StubApp.getString2("23597"), -16);
                    mVar.f5531e = handlerThread;
                    handlerThread.start();
                    mVar.f5530d = ((HandlerThread) mVar.f5531e).getLooper();
                }
                mVar.f5528b++;
                looper2 = (Looper) mVar.f5530d;
            } finally {
            }
        }
        this.f21563l = looper2;
        this.j = c1555p.a(looper2, this);
    }

    public static Pair J(AbstractC1416M abstractC1416M, C1801D c1801d, boolean z2, int i3, boolean z10, C1415L c1415l, C1414K c1414k) {
        int K10;
        AbstractC1416M abstractC1416M2 = c1801d.f21531a;
        if (abstractC1416M.p()) {
            return null;
        }
        AbstractC1416M abstractC1416M3 = abstractC1416M2.p() ? abstractC1416M : abstractC1416M2;
        try {
            Pair i10 = abstractC1416M3.i(c1415l, c1414k, c1801d.f21532b, c1801d.f21533c);
            if (!abstractC1416M.equals(abstractC1416M3)) {
                if (abstractC1416M.b(i10.first) == -1) {
                    if (!z2 || (K10 = K(c1415l, c1414k, i3, z10, i10.first, abstractC1416M3, abstractC1416M)) == -1) {
                        return null;
                    }
                    return abstractC1416M.i(c1415l, c1414k, K10, -9223372036854775807L);
                }
                if (abstractC1416M3.g(i10.first, c1414k).f18047f && abstractC1416M3.m(c1414k.f18044c, c1415l, 0L).f18063n == abstractC1416M3.b(i10.first)) {
                    return abstractC1416M.i(c1415l, c1414k, abstractC1416M.g(i10.first, c1414k).f18044c, c1801d.f21533c);
                }
            }
            return i10;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int K(C1415L c1415l, C1414K c1414k, int i3, boolean z2, Object obj, AbstractC1416M abstractC1416M, AbstractC1416M abstractC1416M2) {
        C1415L c1415l2 = c1415l;
        AbstractC1416M abstractC1416M3 = abstractC1416M;
        Object obj2 = abstractC1416M3.m(abstractC1416M3.g(obj, c1414k).f18044c, c1415l, 0L).f18051a;
        for (int i10 = 0; i10 < abstractC1416M2.o(); i10++) {
            if (abstractC1416M2.m(i10, c1415l, 0L).f18051a.equals(obj2)) {
                return i10;
            }
        }
        int b2 = abstractC1416M3.b(obj);
        int h2 = abstractC1416M3.h();
        int i11 = -1;
        int i12 = 0;
        while (i12 < h2 && i11 == -1) {
            AbstractC1416M abstractC1416M4 = abstractC1416M3;
            int d8 = abstractC1416M4.d(b2, c1414k, c1415l2, i3, z2);
            if (d8 == -1) {
                break;
            }
            i11 = abstractC1416M2.b(abstractC1416M4.l(d8));
            i12++;
            abstractC1416M3 = abstractC1416M4;
            b2 = d8;
            c1415l2 = c1415l;
        }
        if (i11 == -1) {
            return -1;
        }
        return abstractC1416M2.f(i11, c1414k, false).f18044c;
    }

    public static void R(AbstractC1810e abstractC1810e, long j) {
        abstractC1810e.f21728p = true;
        if (abstractC1810e instanceof N0.d) {
            N0.d dVar = (N0.d) abstractC1810e;
            AbstractC1550k.g(dVar.f21728p);
            dVar.f4828P = j;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L0.b0, L0.z, java.lang.Object] */
    public static boolean q(K k3) {
        if (k3 != null) {
            try {
                ?? r12 = k3.f21592a;
                if (k3.f21596e) {
                    for (L0.Z z2 : k3.f21594c) {
                        if (z2 != null) {
                            z2.a();
                        }
                    }
                } else {
                    r12.j();
                }
                if ((!k3.f21596e ? 0L : r12.f()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static boolean r(AbstractC1810e abstractC1810e) {
        return abstractC1810e.f21723h != 0;
    }

    public final void A() {
        this.f21539E.f(1);
        int i3 = 0;
        F(false, false, false, true);
        C1815j c1815j = this.f21559g;
        c1815j.getClass();
        long id = Thread.currentThread().getId();
        long j = c1815j.f21771i;
        AbstractC1550k.f(StubApp.getString2(23598), j == -1 || j == id);
        c1815j.f21771i = id;
        HashMap hashMap = c1815j.f21770h;
        w0.j jVar = this.f21580z;
        if (!hashMap.containsKey(jVar)) {
            hashMap.put(jVar, new C1814i());
        }
        C1814i c1814i = (C1814i) hashMap.get(jVar);
        c1814i.getClass();
        int i10 = c1815j.f21768f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        c1814i.f21762b = i10;
        c1814i.f21761a = false;
        b0(this.f21538D.f21658a.p() ? 4 : 2);
        P0.h hVar = (P0.h) this.f21560h;
        hVar.getClass();
        P8.i iVar = this.f21577w;
        AbstractC1550k.g(!iVar.f5628a);
        iVar.f5638l = hVar;
        while (true) {
            ArrayList arrayList = (ArrayList) iVar.f5630c;
            if (i3 >= arrayList.size()) {
                iVar.f5628a = true;
                this.j.e(2);
                return;
            } else {
                V v2 = (V) arrayList.get(i3);
                iVar.e(v2);
                ((HashSet) iVar.f5635h).add(v2);
                i3++;
            }
        }
    }

    public final void B() {
        try {
            F(true, false, true, false);
            C();
            C1815j c1815j = this.f21559g;
            if (c1815j.f21770h.remove(this.f21580z) != null) {
                c1815j.d();
            }
            if (c1815j.f21770h.isEmpty()) {
                c1815j.f21771i = -1L;
            }
            b0(1);
            this.f21561k.c();
            synchronized (this) {
                this.f21540F = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.f21561k.c();
            synchronized (this) {
                this.f21540F = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void C() {
        for (int i3 = 0; i3 < this.f21553a.length; i3++) {
            AbstractC1810e abstractC1810e = this.f21555c[i3];
            synchronized (abstractC1810e.f21716a) {
                abstractC1810e.f21731s = null;
            }
            AbstractC1810e abstractC1810e2 = this.f21553a[i3];
            AbstractC1550k.g(abstractC1810e2.f21723h == 0);
            abstractC1810e2.r();
        }
    }

    public final void D(int i3, int i10, L0.c0 c0Var) {
        this.f21539E.f(1);
        P8.i iVar = this.f21577w;
        iVar.getClass();
        AbstractC1550k.c(i3 >= 0 && i3 <= i10 && i10 <= ((ArrayList) iVar.f5630c).size());
        iVar.f5637k = c0Var;
        iVar.h(i3, i10);
        m(iVar.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1802E.E():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1802E.F(boolean, boolean, boolean, boolean):void");
    }

    public final void G() {
        K k3 = this.f21576v.f21624i;
        this.f21542H = k3 != null && k3.f21598g.f21614h && this.f21541G;
    }

    public final void H(long j) {
        K k3 = this.f21576v.f21624i;
        long j3 = j + (k3 == null ? 1000000000000L : k3.f21606p);
        this.h0 = j3;
        ((C1161a0) this.f21572q.f4724c).d(j3);
        for (AbstractC1810e abstractC1810e : this.f21553a) {
            if (r(abstractC1810e)) {
                long j10 = this.h0;
                abstractC1810e.f21728p = false;
                abstractC1810e.f21726m = j10;
                abstractC1810e.f21727n = j10;
                abstractC1810e.q(j10, false);
            }
        }
        for (K k4 = r0.f21624i; k4 != null; k4 = k4.f21603m) {
            for (O0.s sVar : k4.f21605o.f5191c) {
                if (sVar != null) {
                    sVar.s();
                }
            }
        }
    }

    public final void I(AbstractC1416M abstractC1416M, AbstractC1416M abstractC1416M2) {
        if (abstractC1416M.p() && abstractC1416M2.p()) {
            return;
        }
        ArrayList arrayList = this.f21573r;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Xa.h.x(arrayList.get(size));
            throw null;
        }
    }

    public final void L(long j) {
        this.j.f20185a.sendEmptyMessageAtTime(2, j + ((this.f21538D.f21662e != 3 || c0()) ? f21534q0 : 1000L));
    }

    public final void M(boolean z2) {
        L0.B b2 = this.f21576v.f21624i.f21598g.f21607a;
        long O7 = O(b2, this.f21538D.f21675s, true, false);
        if (O7 != this.f21538D.f21675s) {
            W w10 = this.f21538D;
            this.f21538D = p(b2, O7, w10.f21660c, w10.f21661d, z2, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a0 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:6:0x0096, B:8:0x00a0, B:16:0x00ac, B:18:0x00b2, B:19:0x00b5, B:20:0x00bd, B:69:0x00cd, B:73:0x00d5), top: B:5:0x0096 }] */
    /* JADX WARN: Type inference failed for: r0v17, types: [L0.z, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(v0.C1801D r19) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1802E.N(v0.D):void");
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [L0.z, java.lang.Object] */
    public final long O(L0.B b2, long j, boolean z2, boolean z10) {
        AbstractC1810e[] abstractC1810eArr;
        g0();
        m0(false, true);
        if (z10 || this.f21538D.f21662e == 3) {
            b0(2);
        }
        M m4 = this.f21576v;
        K k3 = m4.f21624i;
        K k4 = k3;
        while (k4 != null && !b2.equals(k4.f21598g.f21607a)) {
            k4 = k4.f21603m;
        }
        if (z2 || k3 != k4 || (k4 != null && k4.f21606p + j < 0)) {
            int i3 = 0;
            while (true) {
                abstractC1810eArr = this.f21553a;
                if (i3 >= abstractC1810eArr.length) {
                    break;
                }
                c(i3);
                i3++;
            }
            if (k4 != null) {
                while (m4.f21624i != k4) {
                    m4.a();
                }
                m4.l(k4);
                k4.f21606p = 1000000000000L;
                e(new boolean[abstractC1810eArr.length], m4.j.e());
            }
        }
        if (k4 != null) {
            m4.l(k4);
            if (!k4.f21596e) {
                k4.f21598g = k4.f21598g.b(j);
            } else if (k4.f21597f) {
                ?? r92 = k4.f21592a;
                j = r92.k(j);
                r92.l(j - this.f21570p);
            }
            H(j);
            t();
        } else {
            m4.b();
            H(j);
        }
        l(false);
        this.j.e(2);
        return j;
    }

    public final void P(Z z2) {
        Looper looper = z2.f21682f;
        Looper looper2 = this.f21563l;
        C1557r c1557r = this.j;
        if (looper != looper2) {
            c1557r.a(15, z2).b();
            return;
        }
        synchronized (z2) {
        }
        try {
            z2.f21677a.d(z2.f21680d, z2.f21681e);
            z2.b(true);
            int i3 = this.f21538D.f21662e;
            if (i3 == 3 || i3 == 2) {
                c1557r.e(2);
            }
        } catch (Throwable th) {
            z2.b(true);
            throw th;
        }
    }

    public final void Q(Z z2) {
        Looper looper = z2.f21682f;
        if (looper.getThread().isAlive()) {
            this.f21574s.a(looper, null).c(new com.even.translate.a(21, this, z2));
        } else {
            AbstractC1550k.w(StubApp.getString2(12570), StubApp.getString2(23603));
            z2.b(false);
        }
    }

    public final void S(boolean z2, AtomicBoolean atomicBoolean) {
        if (this.f21548R != z2) {
            this.f21548R = z2;
            if (!z2) {
                for (AbstractC1810e abstractC1810e : this.f21553a) {
                    if (!r(abstractC1810e) && this.f21554b.remove(abstractC1810e)) {
                        abstractC1810e.z();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void T(C1799B c1799b) {
        this.f21539E.f(1);
        int i3 = c1799b.f21523c;
        ArrayList arrayList = c1799b.f21521a;
        L0.c0 c0Var = c1799b.f21522b;
        if (i3 != -1) {
            this.f21552Z = new C1801D(new a0(arrayList, c0Var), c1799b.f21523c, c1799b.f21524d);
        }
        P8.i iVar = this.f21577w;
        ArrayList arrayList2 = (ArrayList) iVar.f5630c;
        iVar.h(0, arrayList2.size());
        m(iVar.a(arrayList2.size(), arrayList, c0Var), false);
    }

    public final void U(boolean z2) {
        this.f21541G = z2;
        G();
        if (this.f21542H) {
            M m4 = this.f21576v;
            if (m4.j != m4.f21624i) {
                M(true);
                l(false);
            }
        }
    }

    public final void V(int i3, int i10, boolean z2, boolean z10) {
        this.f21539E.f(z10 ? 1 : 0);
        this.f21538D = this.f21538D.d(i10, i3, z2);
        m0(false, false);
        for (K k3 = this.f21576v.f21624i; k3 != null; k3 = k3.f21603m) {
            for (O0.s sVar : k3.f21605o.f5191c) {
                if (sVar != null) {
                    sVar.f(z2);
                }
            }
        }
        if (!c0()) {
            g0();
            k0();
            return;
        }
        int i11 = this.f21538D.f21662e;
        C1557r c1557r = this.j;
        if (i11 != 3) {
            if (i11 == 2) {
                c1557r.e(2);
            }
        } else {
            Mb.a aVar = this.f21572q;
            aVar.f4723b = true;
            ((C1161a0) aVar.f4724c).f();
            e0();
            c1557r.e(2);
        }
    }

    public final void W(C1408E c1408e) {
        this.j.d(16);
        Mb.a aVar = this.f21572q;
        aVar.b(c1408e);
        C1408E e10 = aVar.e();
        o(e10, e10.f18026a, true, true);
    }

    public final void X(C1819n c1819n) {
        this.f21571p0 = c1819n;
        AbstractC1416M abstractC1416M = this.f21538D.f21658a;
        M m4 = this.f21576v;
        m4.getClass();
        c1819n.getClass();
        if (m4.f21630p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < m4.f21630p.size(); i3++) {
            ((K) m4.f21630p.get(i3)).i();
        }
        m4.f21630p = arrayList;
        m4.f21626l = null;
        m4.j();
    }

    public final void Y(int i3) {
        this.f21546O = i3;
        AbstractC1416M abstractC1416M = this.f21538D.f21658a;
        M m4 = this.f21576v;
        m4.f21622g = i3;
        if (!m4.p(abstractC1416M)) {
            M(true);
        }
        l(false);
    }

    public final void Z(boolean z2) {
        this.f21547P = z2;
        AbstractC1416M abstractC1416M = this.f21538D.f21658a;
        M m4 = this.f21576v;
        m4.f21623h = z2;
        if (!m4.p(abstractC1416M)) {
            M(true);
        }
        l(false);
    }

    @Override // L0.InterfaceC0128y
    public final void a(InterfaceC0129z interfaceC0129z) {
        this.j.a(8, interfaceC0129z).b();
    }

    public final void a0(L0.c0 c0Var) {
        this.f21539E.f(1);
        P8.i iVar = this.f21577w;
        int size = ((ArrayList) iVar.f5630c).size();
        if (c0Var.f4050b.length != size) {
            c0Var = new L0.c0(new Random(c0Var.f4049a.nextLong())).a(size);
        }
        iVar.f5637k = c0Var;
        m(iVar.b(), false);
    }

    public final void b(C1799B c1799b, int i3) {
        this.f21539E.f(1);
        P8.i iVar = this.f21577w;
        if (i3 == -1) {
            i3 = ((ArrayList) iVar.f5630c).size();
        }
        m(iVar.a(i3, c1799b.f21521a, c1799b.f21522b), false);
    }

    public final void b0(int i3) {
        W w10 = this.f21538D;
        if (w10.f21662e != i3) {
            if (i3 != 2) {
                this.f21569o0 = -9223372036854775807L;
            }
            this.f21538D = w10.g(i3);
        }
    }

    public final void c(int i3) {
        AbstractC1810e abstractC1810e = this.f21553a[i3];
        if (r(abstractC1810e)) {
            x(i3, false);
            Mb.a aVar = this.f21572q;
            if (abstractC1810e == ((AbstractC1810e) aVar.f4726e)) {
                aVar.f4727f = null;
                aVar.f4726e = null;
                aVar.f4722a = true;
            }
            int i10 = abstractC1810e.f21723h;
            if (i10 == 2) {
                AbstractC1550k.g(i10 == 2);
                abstractC1810e.f21723h = 1;
                abstractC1810e.u();
            }
            AbstractC1550k.g(abstractC1810e.f21723h == 1);
            abstractC1810e.f21718c.c();
            abstractC1810e.f21723h = 0;
            abstractC1810e.j = null;
            abstractC1810e.f21724k = null;
            abstractC1810e.f21728p = false;
            abstractC1810e.o();
            this.f21551Y--;
        }
    }

    public final boolean c0() {
        W w10 = this.f21538D;
        return w10.f21668l && w10.f21670n == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:404:0x05bc, code lost:
    
        if (r4 >= r10.b()) goto L326;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x036d A[EDGE_INSN: B:181:0x036d->B:182:0x036d BREAK  A[LOOP:4: B:141:0x02ef->B:152:0x036a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0191  */
    /* JADX WARN: Type inference failed for: r0v47, types: [O0.w] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30, types: [int] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v48, types: [L0.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [L0.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v69, types: [L0.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36, types: [L0.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v65, types: [L0.b0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 1890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1802E.d():void");
    }

    public final boolean d0(AbstractC1416M abstractC1416M, L0.B b2) {
        if (b2.b() || abstractC1416M.p()) {
            return false;
        }
        int i3 = abstractC1416M.g(b2.f3881a, this.f21567n).f18044c;
        C1415L c1415l = this.f21565m;
        abstractC1416M.n(i3, c1415l);
        return c1415l.a() && c1415l.f18059i && c1415l.f18056f != -9223372036854775807L;
    }

    public final void e(boolean[] zArr, long j) {
        AbstractC1810e[] abstractC1810eArr;
        Set set;
        M m4;
        J j3;
        M m10 = this.f21576v;
        K k3 = m10.j;
        O0.w wVar = k3.f21605o;
        int i3 = 0;
        while (true) {
            abstractC1810eArr = this.f21553a;
            int length = abstractC1810eArr.length;
            set = this.f21554b;
            if (i3 >= length) {
                break;
            }
            if (!wVar.b(i3) && set.remove(abstractC1810eArr[i3])) {
                abstractC1810eArr[i3].z();
            }
            i3++;
        }
        int i10 = 0;
        while (i10 < abstractC1810eArr.length) {
            if (wVar.b(i10)) {
                boolean z2 = zArr[i10];
                AbstractC1810e abstractC1810e = abstractC1810eArr[i10];
                if (!r(abstractC1810e)) {
                    K k4 = m10.j;
                    boolean z10 = k4 == m10.f21624i;
                    O0.w wVar2 = k4.f21605o;
                    b0 b0Var = wVar2.f5190b[i10];
                    O0.s sVar = wVar2.f5191c[i10];
                    int length2 = sVar != null ? sVar.length() : 0;
                    C1438m[] c1438mArr = new C1438m[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        c1438mArr[i11] = sVar.g(i11);
                    }
                    boolean z11 = c0() && this.f21538D.f21662e == 3;
                    boolean z12 = !z2 && z11;
                    this.f21551Y++;
                    set.add(abstractC1810e);
                    L0.Z z13 = k4.f21594c[i10];
                    m4 = m10;
                    long j10 = k4.f21606p;
                    L l9 = k4.f21598g;
                    AbstractC1550k.g(abstractC1810e.f21723h == 0);
                    abstractC1810e.f21719d = b0Var;
                    abstractC1810e.f21723h = 1;
                    abstractC1810e.p(z12, z10);
                    boolean z14 = z10;
                    abstractC1810e.y(c1438mArr, z13, j, j10, l9.f21607a);
                    abstractC1810e.f21728p = false;
                    abstractC1810e.f21726m = j;
                    abstractC1810e.f21727n = j;
                    abstractC1810e.q(j, z12);
                    abstractC1810e.d(11, new C1798A(this));
                    Mb.a aVar = this.f21572q;
                    aVar.getClass();
                    J i12 = abstractC1810e.i();
                    if (i12 != null && i12 != (j3 = (J) aVar.f4727f)) {
                        if (j3 != null) {
                            throw new C1817l(2, new IllegalStateException(StubApp.getString2(23606)), 1000);
                        }
                        aVar.f4727f = i12;
                        aVar.f4726e = abstractC1810e;
                        ((x0.v) i12).b((C1408E) ((C1161a0) aVar.f4724c).f16346e);
                    }
                    if (z11 && z14) {
                        AbstractC1550k.g(abstractC1810e.f21723h == 1);
                        abstractC1810e.f21723h = 2;
                        abstractC1810e.t();
                    }
                    i10++;
                    m10 = m4;
                }
            }
            m4 = m10;
            i10++;
            m10 = m4;
        }
        k3.f21599h = true;
    }

    public final void e0() {
        K k3 = this.f21576v.f21624i;
        if (k3 == null) {
            return;
        }
        O0.w wVar = k3.f21605o;
        int i3 = 0;
        while (true) {
            AbstractC1810e[] abstractC1810eArr = this.f21553a;
            if (i3 >= abstractC1810eArr.length) {
                return;
            }
            if (wVar.b(i3)) {
                AbstractC1810e abstractC1810e = abstractC1810eArr[i3];
                int i10 = abstractC1810e.f21723h;
                if (i10 == 1) {
                    AbstractC1550k.g(i10 == 1);
                    abstractC1810e.f21723h = 2;
                    abstractC1810e.t();
                }
            }
            i3++;
        }
    }

    public final long f(AbstractC1416M abstractC1416M, Object obj, long j) {
        C1414K c1414k = this.f21567n;
        int i3 = abstractC1416M.g(obj, c1414k).f18044c;
        C1415L c1415l = this.f21565m;
        abstractC1416M.n(i3, c1415l);
        if (c1415l.f18056f != -9223372036854775807L && c1415l.a() && c1415l.f18059i) {
            return AbstractC1560u.J(AbstractC1560u.x(c1415l.f18057g) - c1415l.f18056f) - (j + c1414k.f18046e);
        }
        return -9223372036854775807L;
    }

    public final void f0(boolean z2, boolean z10) {
        F(z2 || !this.f21548R, false, true, false);
        this.f21539E.f(z10 ? 1 : 0);
        C1815j c1815j = this.f21559g;
        if (c1815j.f21770h.remove(this.f21580z) != null) {
            c1815j.d();
        }
        b0(1);
    }

    public final Pair g(AbstractC1416M abstractC1416M) {
        long j = 0;
        if (abstractC1416M.p()) {
            return Pair.create(W.f21657u, 0L);
        }
        Pair i3 = abstractC1416M.i(this.f21565m, this.f21567n, abstractC1416M.a(this.f21547P), -9223372036854775807L);
        L0.B n10 = this.f21576v.n(abstractC1416M, i3.first, 0L);
        long longValue = ((Long) i3.second).longValue();
        if (n10.b()) {
            Object obj = n10.f3881a;
            C1414K c1414k = this.f21567n;
            abstractC1416M.g(obj, c1414k);
            if (n10.f3883c == c1414k.e(n10.f3882b)) {
                c1414k.f18048g.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(n10, Long.valueOf(j));
    }

    public final void g0() {
        int i3;
        Mb.a aVar = this.f21572q;
        aVar.f4723b = false;
        C1161a0 c1161a0 = (C1161a0) aVar.f4724c;
        if (c1161a0.f16342a) {
            c1161a0.d(c1161a0.a());
            c1161a0.f16342a = false;
        }
        for (AbstractC1810e abstractC1810e : this.f21553a) {
            if (r(abstractC1810e) && (i3 = abstractC1810e.f21723h) == 2) {
                AbstractC1550k.g(i3 == 2);
                abstractC1810e.f21723h = 1;
                abstractC1810e.u();
            }
        }
    }

    @Override // L0.a0
    public final void h(L0.b0 b0Var) {
        this.j.a(9, (InterfaceC0129z) b0Var).b();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [L0.b0, java.lang.Object] */
    public final void h0() {
        K k3 = this.f21576v.f21625k;
        boolean z2 = this.f21545L || (k3 != null && k3.f21592a.n());
        W w10 = this.f21538D;
        if (z2 != w10.f21664g) {
            this.f21538D = new W(w10.f21658a, w10.f21659b, w10.f21660c, w10.f21661d, w10.f21662e, w10.f21663f, z2, w10.f21665h, w10.f21666i, w10.j, w10.f21667k, w10.f21668l, w10.f21669m, w10.f21670n, w10.f21671o, w10.f21673q, w10.f21674r, w10.f21675s, w10.f21676t, w10.f21672p);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z2;
        boolean z10;
        K k3;
        int i3;
        K k4;
        int i10;
        String string2 = StubApp.getString2(23607);
        String string22 = StubApp.getString2(10086);
        try {
            switch (message.what) {
                case 1:
                    boolean z11 = message.arg1 != 0;
                    int i11 = message.arg2;
                    V(i11 >> 4, i11 & 15, z11, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    N((C1801D) message.obj);
                    break;
                case 4:
                    W((C1408E) message.obj);
                    break;
                case 5:
                    this.f21537C = (c0) message.obj;
                    break;
                case 6:
                    f0(false, true);
                    break;
                case 7:
                    B();
                    return true;
                case 8:
                    n((InterfaceC0129z) message.obj);
                    break;
                case 9:
                    j((InterfaceC0129z) message.obj);
                    break;
                case 10:
                    E();
                    break;
                case 11:
                    Y(message.arg1);
                    break;
                case 12:
                    Z(message.arg1 != 0);
                    break;
                case 13:
                    S(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    Z z12 = (Z) message.obj;
                    z12.getClass();
                    P(z12);
                    break;
                case 15:
                    Q((Z) message.obj);
                    break;
                case 16:
                    C1408E c1408e = (C1408E) message.obj;
                    o(c1408e, c1408e.f18026a, true, false);
                    break;
                case 17:
                    T((C1799B) message.obj);
                    break;
                case 18:
                    b((C1799B) message.obj, message.arg1);
                    break;
                case 19:
                    Xa.h.x(message.obj);
                    z();
                    throw null;
                case 20:
                    D(message.arg1, message.arg2, (L0.c0) message.obj);
                    break;
                case 21:
                    a0((L0.c0) message.obj);
                    break;
                case 22:
                    y();
                    break;
                case 23:
                    U(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    E();
                    M(true);
                    break;
                case 26:
                    E();
                    M(true);
                    break;
                case 27:
                    j0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    X((C1819n) message.obj);
                    break;
                case 29:
                    A();
                    break;
            }
        } catch (A0.d e10) {
            k(e10, e10.f30a);
        } catch (C0106b e11) {
            k(e11, 1002);
        } catch (IOException e12) {
            k(e12, 2000);
        } catch (RuntimeException e13) {
            C1817l c1817l = new C1817l(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC1550k.l(string22, string2, c1817l);
            f0(true, false);
            this.f21538D = this.f21538D.e(c1817l);
        } catch (C1406C e14) {
            boolean z13 = e14.f18021a;
            int i12 = e14.f18022b;
            if (i12 == 1) {
                i10 = z13 ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i10 = z13 ? 3002 : 3004;
                }
                k(e14, r4);
            }
            r4 = i10;
            k(e14, r4);
        } catch (C1709i e15) {
            k(e15, e15.f21070a);
        } catch (C1817l e16) {
            e = e16;
            int i13 = e.f21774c;
            M m4 = this.f21576v;
            if (i13 == 1 && (k4 = m4.j) != null) {
                e = new C1817l(e.getMessage(), e.getCause(), e.f18023a, e.f21774c, e.f21775d, e.f21776e, e.f21777f, e.f21778g, k4.f21598g.f21607a, e.f18024b, e.j);
            }
            if (e.j && (this.f21568n0 == null || (i3 = e.f18023a) == 5004 || i3 == 5003)) {
                AbstractC1550k.x(string22, StubApp.getString2(23608), e);
                C1817l c1817l2 = this.f21568n0;
                if (c1817l2 != null) {
                    c1817l2.addSuppressed(e);
                    e = this.f21568n0;
                } else {
                    this.f21568n0 = e;
                }
                C1557r c1557r = this.j;
                C1556q a3 = c1557r.a(25, e);
                c1557r.getClass();
                Message message2 = a3.f20183a;
                message2.getClass();
                c1557r.f20185a.sendMessageAtFrontOfQueue(message2);
                a3.a();
                z2 = true;
            } else {
                C1817l c1817l3 = this.f21568n0;
                if (c1817l3 != null) {
                    c1817l3.addSuppressed(e);
                    e = this.f21568n0;
                }
                AbstractC1550k.l(string22, string2, e);
                z2 = true;
                if (e.f21774c == 1) {
                    if (m4.f21624i != m4.j) {
                        while (true) {
                            k3 = m4.f21624i;
                            if (k3 == m4.j) {
                                break;
                            }
                            m4.a();
                        }
                        k3.getClass();
                        v();
                        L l9 = k3.f21598g;
                        L0.B b2 = l9.f21607a;
                        long j = l9.f21608b;
                        this.f21538D = p(b2, j, l9.f21609c, j, true, 0);
                    }
                    z10 = false;
                    z2 = true;
                } else {
                    z10 = false;
                }
                f0(z2, z10);
                this.f21538D = this.f21538D.e(e);
            }
        }
        z2 = true;
        v();
        return z2;
    }

    public final long i(long j) {
        K k3 = this.f21576v.f21625k;
        if (k3 == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.h0 - k3.f21606p));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void i0(O0.w wVar) {
        K k3 = this.f21576v.f21625k;
        k3.getClass();
        i(k3.d());
        if (d0(this.f21538D.f21658a, k3.f21598g.f21607a)) {
            long j = this.f21578x.f21755h;
        }
        AbstractC1416M abstractC1416M = this.f21538D.f21658a;
        float f10 = this.f21572q.e().f18026a;
        boolean z2 = this.f21538D.f21668l;
        O0.s[] sVarArr = wVar.f5191c;
        C1815j c1815j = this.f21559g;
        C1814i c1814i = (C1814i) c1815j.f21770h.get(this.f21580z);
        c1814i.getClass();
        int i3 = c1815j.f21768f;
        if (i3 == -1) {
            int length = sVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < length) {
                    O0.s sVar = sVarArr[i10];
                    if (sVar != null) {
                        switch (sVar.c().f18069c) {
                            case DfuBaseService.PROGRESS_STARTING /* -2 */:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            case 1:
                                i11 += i12;
                                break;
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    i3 = Math.max(13107200, i11);
                }
            }
        }
        c1814i.f21762b = i3;
        c1815j.d();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [L0.b0, java.lang.Object] */
    public final void j(InterfaceC0129z interfaceC0129z) {
        M m4 = this.f21576v;
        K k3 = m4.f21625k;
        if (k3 == null || k3.f21592a != interfaceC0129z) {
            K k4 = m4.f21626l;
            if (k4 == null || k4.f21592a != interfaceC0129z) {
                return;
            }
            u();
            return;
        }
        long j = this.h0;
        if (k3 != null) {
            AbstractC1550k.g(k3.f21603m == null);
            if (k3.f21596e) {
                k3.f21592a.v(j - k3.f21606p);
            }
        }
        t();
    }

    public final void j0(int i3, int i10, List list) {
        this.f21539E.f(1);
        P8.i iVar = this.f21577w;
        iVar.getClass();
        ArrayList arrayList = (ArrayList) iVar.f5630c;
        AbstractC1550k.c(i3 >= 0 && i3 <= i10 && i10 <= arrayList.size());
        AbstractC1550k.c(list.size() == i10 - i3);
        for (int i11 = i3; i11 < i10; i11++) {
            ((V) arrayList.get(i11)).f21652a.v((C1447v) list.get(i11 - i3));
        }
        m(iVar.b(), false);
    }

    public final void k(IOException iOException, int i3) {
        C1817l c1817l = new C1817l(0, iOException, i3);
        K k3 = this.f21576v.f21624i;
        if (k3 != null) {
            L l9 = k3.f21598g;
            c1817l = new C1817l(c1817l.getMessage(), c1817l.getCause(), c1817l.f18023a, c1817l.f21774c, c1817l.f21775d, c1817l.f21776e, c1817l.f21777f, c1817l.f21778g, l9.f21607a, c1817l.f18024b, c1817l.j);
        }
        AbstractC1550k.l(StubApp.getString2(10086), StubApp.getString2(23607), c1817l);
        f0(false, false);
        this.f21538D = this.f21538D.e(c1817l);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v28, types: [L0.z, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0() {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1802E.k0():void");
    }

    public final void l(boolean z2) {
        K k3 = this.f21576v.f21625k;
        L0.B b2 = k3 == null ? this.f21538D.f21659b : k3.f21598g.f21607a;
        boolean equals = this.f21538D.f21667k.equals(b2);
        if (!equals) {
            this.f21538D = this.f21538D.b(b2);
        }
        W w10 = this.f21538D;
        w10.f21673q = k3 == null ? w10.f21675s : k3.d();
        W w11 = this.f21538D;
        w11.f21674r = i(w11.f21673q);
        if ((!equals || z2) && k3 != null && k3.f21596e) {
            i0(k3.f21605o);
        }
    }

    public final void l0(AbstractC1416M abstractC1416M, L0.B b2, AbstractC1416M abstractC1416M2, L0.B b10, long j, boolean z2) {
        if (!d0(abstractC1416M, b2)) {
            C1408E c1408e = b2.b() ? C1408E.f18025d : this.f21538D.f21671o;
            Mb.a aVar = this.f21572q;
            if (aVar.e().equals(c1408e)) {
                return;
            }
            this.j.d(16);
            aVar.b(c1408e);
            o(this.f21538D.f21671o, c1408e.f18026a, false, false);
            return;
        }
        Object obj = b2.f3881a;
        C1414K c1414k = this.f21567n;
        int i3 = abstractC1416M.g(obj, c1414k).f18044c;
        C1415L c1415l = this.f21565m;
        abstractC1416M.n(i3, c1415l);
        C1443r c1443r = c1415l.j;
        C1813h c1813h = this.f21578x;
        c1813h.getClass();
        c1813h.f21750c = AbstractC1560u.J(c1443r.f18237a);
        c1813h.f21753f = AbstractC1560u.J(c1443r.f18238b);
        c1813h.f21754g = AbstractC1560u.J(c1443r.f18239c);
        float f10 = c1443r.f18240d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        c1813h.j = f10;
        float f11 = c1443r.f18241e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        c1813h.f21756i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            c1813h.f21750c = -9223372036854775807L;
        }
        c1813h.a();
        if (j != -9223372036854775807L) {
            c1813h.f21751d = f(abstractC1416M, obj, j);
            c1813h.a();
            return;
        }
        if (!Objects.equals(!abstractC1416M2.p() ? abstractC1416M2.m(abstractC1416M2.g(b10.f3881a, c1414k).f18044c, c1415l, 0L).f18051a : null, c1415l.f18051a) || z2) {
            c1813h.f21751d = -9223372036854775807L;
            c1813h.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035a  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r2v61, types: [v0.M] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v31, types: [o0.M] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(o0.AbstractC1416M r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1802E.m(o0.M, boolean):void");
    }

    public final void m0(boolean z2, boolean z10) {
        long j;
        this.f21543I = z2;
        if (!z2 || z10) {
            j = -9223372036854775807L;
        } else {
            this.f21574s.getClass();
            j = SystemClock.elapsedRealtime();
        }
        this.f21544K = j;
    }

    public final void n(InterfaceC0129z interfaceC0129z) {
        K k3;
        M m4 = this.f21576v;
        K k4 = m4.f21625k;
        int i3 = 0;
        boolean z2 = k4 != null && k4.f21592a == interfaceC0129z;
        Mb.a aVar = this.f21572q;
        if (z2) {
            k4.getClass();
            if (!k4.f21596e) {
                float f10 = aVar.e().f18026a;
                W w10 = this.f21538D;
                k4.f(f10, w10.f21658a, w10.f21668l);
            }
            i0(k4.f21605o);
            if (k4 == m4.f21624i) {
                H(k4.f21598g.f21608b);
                e(new boolean[this.f21553a.length], m4.j.e());
                W w11 = this.f21538D;
                L0.B b2 = w11.f21659b;
                L l9 = k4.f21598g;
                long j = w11.f21660c;
                long j3 = l9.f21608b;
                this.f21538D = p(b2, j3, j, j3, false, 5);
            }
            t();
            return;
        }
        while (true) {
            if (i3 >= m4.f21630p.size()) {
                k3 = null;
                break;
            }
            k3 = (K) m4.f21630p.get(i3);
            if (k3.f21592a == interfaceC0129z) {
                break;
            } else {
                i3++;
            }
        }
        if (k3 != null) {
            AbstractC1550k.g(!k3.f21596e);
            float f11 = aVar.e().f18026a;
            W w12 = this.f21538D;
            k3.f(f11, w12.f21658a, w12.f21668l);
            K k10 = m4.f21626l;
            if (k10 == null || k10.f21592a != interfaceC0129z) {
                return;
            }
            u();
        }
    }

    public final synchronized void n0(C0119o c0119o, long j) {
        this.f21574s.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z2 = false;
        while (!((Boolean) c0119o.get()).booleanValue() && j > 0) {
            try {
                this.f21574s.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z2 = true;
            }
            this.f21574s.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public final void o(C1408E c1408e, float f10, boolean z2, boolean z10) {
        int i3;
        if (z2) {
            if (z10) {
                this.f21539E.f(1);
            }
            this.f21538D = this.f21538D.f(c1408e);
        }
        float f11 = c1408e.f18026a;
        K k3 = this.f21576v.f21624i;
        while (true) {
            i3 = 0;
            if (k3 == null) {
                break;
            }
            O0.s[] sVarArr = k3.f21605o.f5191c;
            int length = sVarArr.length;
            while (i3 < length) {
                O0.s sVar = sVarArr[i3];
                if (sVar != null) {
                    sVar.q(f11);
                }
                i3++;
            }
            k3 = k3.f21603m;
        }
        AbstractC1810e[] abstractC1810eArr = this.f21553a;
        int length2 = abstractC1810eArr.length;
        while (i3 < length2) {
            AbstractC1810e abstractC1810e = abstractC1810eArr[i3];
            if (abstractC1810e != null) {
                abstractC1810e.A(f10, c1408e.f18026a);
            }
            i3++;
        }
    }

    public final W p(L0.B b2, long j, long j3, long j10, boolean z2, int i3) {
        M4.Z z10;
        boolean z11;
        int i10;
        this.f21566m0 = (!this.f21566m0 && j == this.f21538D.f21675s && b2.equals(this.f21538D.f21659b)) ? false : true;
        G();
        W w10 = this.f21538D;
        h0 h0Var = w10.f21665h;
        O0.w wVar = w10.f21666i;
        List list = w10.j;
        if (this.f21577w.f5628a) {
            K k3 = this.f21576v.f21624i;
            h0Var = k3 == null ? h0.f4092d : k3.f21604n;
            wVar = k3 == null ? this.f21558f : k3.f21605o;
            O0.s[] sVarArr = wVar.f5191c;
            M4.F f10 = new M4.F(4);
            boolean z12 = false;
            for (O0.s sVar : sVarArr) {
                if (sVar != null) {
                    C1404A c1404a = sVar.g(0).f18214l;
                    if (c1404a == null) {
                        f10.a(new C1404A(new o0.z[0]));
                    } else {
                        f10.a(c1404a);
                        z12 = true;
                    }
                }
            }
            int i11 = 1;
            if (z12) {
                z10 = f10.g();
            } else {
                M4.G g10 = M4.I.f4549b;
                z10 = M4.Z.f4578e;
            }
            list = z10;
            if (k3 != null) {
                L l9 = k3.f21598g;
                if (l9.f21609c != j3) {
                    k3.f21598g = l9.a(j3);
                }
            }
            K k4 = this.f21576v.f21624i;
            if (k4 != null) {
                O0.w wVar2 = k4.f21605o;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    AbstractC1810e[] abstractC1810eArr = this.f21553a;
                    if (i12 >= abstractC1810eArr.length) {
                        z11 = true;
                        break;
                    }
                    if (wVar2.b(i12)) {
                        i10 = i11;
                        if (abstractC1810eArr[i12].f21717b != i10) {
                            z11 = false;
                            break;
                        }
                        if (wVar2.f5190b[i12].f21701a != 0) {
                            i13 = i10;
                        }
                    } else {
                        i10 = i11;
                    }
                    i12 += i10;
                    i11 = i10;
                }
                boolean z13 = i13 != 0 && z11;
                if (z13 != this.f21550X) {
                    this.f21550X = z13;
                    if (!z13 && this.f21538D.f21672p) {
                        this.j.e(2);
                    }
                }
            }
        } else if (!b2.equals(w10.f21659b)) {
            h0Var = h0.f4092d;
            wVar = this.f21558f;
            list = M4.Z.f4578e;
        }
        h0 h0Var2 = h0Var;
        O0.w wVar3 = wVar;
        List list2 = list;
        if (z2) {
            C0466t c0466t = this.f21539E;
            if (!c0466t.f10299d || c0466t.f10300e == 5) {
                c0466t.f10297b = true;
                c0466t.f10299d = true;
                c0466t.f10300e = i3;
            } else {
                AbstractC1550k.c(i3 == 5);
            }
        }
        W w11 = this.f21538D;
        return w11.c(b2, j, j3, j10, i(w11.f21673q), h0Var2, wVar3, list2);
    }

    public final boolean s() {
        K k3 = this.f21576v.f21624i;
        long j = k3.f21598g.f21611e;
        if (k3.f21596e) {
            return j == -9223372036854775807L || this.f21538D.f21675s < j || !c0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [L0.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [L0.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [L0.b0, java.lang.Object] */
    public final void t() {
        boolean c10;
        if (q(this.f21576v.f21625k)) {
            K k3 = this.f21576v.f21625k;
            long i3 = i(!k3.f21596e ? 0L : k3.f21592a.f());
            K k4 = this.f21576v.f21624i;
            long j = d0(this.f21538D.f21658a, k3.f21598g.f21607a) ? this.f21578x.f21755h : -9223372036854775807L;
            w0.j jVar = this.f21580z;
            AbstractC1416M abstractC1416M = this.f21538D.f21658a;
            float f10 = this.f21572q.e().f18026a;
            boolean z2 = this.f21538D.f21668l;
            C1804G c1804g = new C1804G(jVar, i3, f10, this.f21543I, j);
            c10 = this.f21559g.c(c1804g);
            K k10 = this.f21576v.f21624i;
            if (!c10 && k10.f21596e && i3 < 500000 && this.f21570p > 0) {
                k10.f21592a.l(this.f21538D.f21675s);
                c10 = this.f21559g.c(c1804g);
            }
        } else {
            c10 = false;
        }
        this.f21545L = c10;
        if (c10) {
            K k11 = this.f21576v.f21625k;
            k11.getClass();
            C1805H c1805h = new C1805H();
            c1805h.f21586a = this.h0 - k11.f21606p;
            float f11 = this.f21572q.e().f18026a;
            AbstractC1550k.c(f11 > 0.0f || f11 == -3.4028235E38f);
            c1805h.f21587b = f11;
            long j3 = this.f21544K;
            AbstractC1550k.c(j3 >= 0 || j3 == -9223372036854775807L);
            c1805h.f21588c = j3;
            I i10 = new I(c1805h);
            AbstractC1550k.g(k11.f21603m == null);
            k11.f21592a.g(i10);
        }
        h0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [L0.b0, L0.z, java.lang.Object] */
    public final void u() {
        M m4 = this.f21576v;
        m4.j();
        K k3 = m4.f21626l;
        if (k3 != null) {
            if (!k3.f21595d || k3.f21596e) {
                ?? r12 = k3.f21592a;
                if (r12.n()) {
                    return;
                }
                AbstractC1416M abstractC1416M = this.f21538D.f21658a;
                if (k3.f21596e) {
                    r12.u();
                }
                Iterator it = this.f21559g.f21770h.values().iterator();
                while (it.hasNext()) {
                    if (((C1814i) it.next()).f21761a) {
                        return;
                    }
                }
                if (!k3.f21595d) {
                    L l9 = k3.f21598g;
                    k3.f21595d = true;
                    r12.e(this, l9.f21608b);
                    return;
                }
                C1805H c1805h = new C1805H();
                c1805h.f21586a = this.h0 - k3.f21606p;
                float f10 = this.f21572q.e().f18026a;
                AbstractC1550k.c(f10 > 0.0f || f10 == -3.4028235E38f);
                c1805h.f21587b = f10;
                long j = this.f21544K;
                AbstractC1550k.c(j >= 0 || j == -9223372036854775807L);
                c1805h.f21588c = j;
                I i3 = new I(c1805h);
                AbstractC1550k.g(k3.f21603m == null);
                r12.g(i3);
            }
        }
    }

    public final void v() {
        C0466t c0466t = this.f21539E;
        W w10 = this.f21538D;
        boolean z2 = c0466t.f10297b | (((W) c0466t.f10301f) != w10);
        c0466t.f10297b = z2;
        c0466t.f10301f = w10;
        if (z2) {
            C1830z c1830z = this.f21575t.f21802a;
            c1830z.j.c(new com.even.translate.a(20, c1830z, c0466t));
            this.f21539E = new C0466t(this.f21538D);
        }
    }

    public final void w(int i3) {
        AbstractC1810e abstractC1810e = this.f21553a[i3];
        try {
            L0.Z z2 = abstractC1810e.j;
            z2.getClass();
            z2.a();
        } catch (IOException | RuntimeException e10) {
            int i10 = abstractC1810e.f21717b;
            if (i10 != 3 && i10 != 5) {
                throw e10;
            }
            O0.w wVar = this.f21576v.f21624i.f21605o;
            AbstractC1550k.l(StubApp.getString2(10086), StubApp.getString2(23609) + C1438m.c(wVar.f5191c[i3].n()), e10);
            O0.w wVar2 = new O0.w((b0[]) wVar.f5190b.clone(), (O0.s[]) wVar.f5191c.clone(), wVar.f5192d, wVar.f5193e);
            wVar2.f5190b[i3] = null;
            wVar2.f5191c[i3] = null;
            c(i3);
            K k3 = this.f21576v.f21624i;
            k3.a(wVar2, this.f21538D.f21675s, false, new boolean[k3.j.length]);
        }
    }

    public final void x(int i3, boolean z2) {
        boolean[] zArr = this.f21556d;
        if (zArr[i3] != z2) {
            zArr[i3] = z2;
            this.f21536B.c(new E.j(this, i3, z2));
        }
    }

    public final void y() {
        m(this.f21577w.b(), true);
    }

    public final void z() {
        this.f21539E.f(1);
        throw null;
    }
}
