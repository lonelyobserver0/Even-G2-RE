package v0;

import L0.h0;
import aa.C0398e;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.recyclerview.widget.C0466t;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.K1;
import com.stub.StubApp;
import f4.C0879c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import l4.C1145A;
import l4.C1223z;
import o0.AbstractC1416M;
import o0.AbstractC1448w;
import o0.C1409F;
import o0.C1414K;
import o0.C1415L;
import o0.C1422T;
import o0.C1425W;
import o0.C1428c;
import o0.C1433h;
import o0.C1436k;
import o0.C1438m;
import o0.C1447v;
import o0.InterfaceC1410G;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1549j;
import r0.C1554o;
import r0.C1555p;
import r0.C1556q;
import r0.C1557r;
import r0.InterfaceC1546g;

/* renamed from: v0.z, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1830z extends Mb.b implements InterfaceC1820o {

    /* renamed from: A, reason: collision with root package name */
    public final K1 f21815A;

    /* renamed from: B, reason: collision with root package name */
    public final C1809d f21816B;

    /* renamed from: C, reason: collision with root package name */
    public final C1223z f21817C;

    /* renamed from: D, reason: collision with root package name */
    public final C1145A f21818D;

    /* renamed from: E, reason: collision with root package name */
    public final long f21819E;

    /* renamed from: F, reason: collision with root package name */
    public int f21820F;

    /* renamed from: G, reason: collision with root package name */
    public int f21821G;

    /* renamed from: H, reason: collision with root package name */
    public int f21822H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f21823I;

    /* renamed from: K, reason: collision with root package name */
    public final c0 f21824K;

    /* renamed from: L, reason: collision with root package name */
    public L0.c0 f21825L;

    /* renamed from: O, reason: collision with root package name */
    public final C1819n f21826O;

    /* renamed from: P, reason: collision with root package name */
    public C1409F f21827P;

    /* renamed from: R, reason: collision with root package name */
    public o0.y f21828R;

    /* renamed from: T, reason: collision with root package name */
    public C1438m f21829T;

    /* renamed from: X, reason: collision with root package name */
    public Surface f21830X;

    /* renamed from: Y, reason: collision with root package name */
    public Surface f21831Y;

    /* renamed from: Z, reason: collision with root package name */
    public SurfaceHolder f21832Z;

    /* renamed from: b, reason: collision with root package name */
    public final O0.w f21833b;

    /* renamed from: c, reason: collision with root package name */
    public final C1409F f21834c;

    /* renamed from: d, reason: collision with root package name */
    public final R4.b f21835d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f21836e;

    /* renamed from: f, reason: collision with root package name */
    public final C1830z f21837f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1810e[] f21838g;

    /* renamed from: h, reason: collision with root package name */
    public final O0.v f21839h;
    public boolean h0;
    public final C1557r j;

    /* renamed from: k, reason: collision with root package name */
    public final r f21840k;

    /* renamed from: k0, reason: collision with root package name */
    public final int f21841k0;

    /* renamed from: l, reason: collision with root package name */
    public final C1802E f21842l;

    /* renamed from: l0, reason: collision with root package name */
    public C1554o f21843l0;

    /* renamed from: m, reason: collision with root package name */
    public final C1549j f21844m;

    /* renamed from: m0, reason: collision with root package name */
    public C1428c f21845m0;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet f21846n;

    /* renamed from: n0, reason: collision with root package name */
    public float f21847n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f21848o0;

    /* renamed from: p, reason: collision with root package name */
    public final C1414K f21849p;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f21850p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f21851q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f21852q0;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f21853r;

    /* renamed from: r0, reason: collision with root package name */
    public final int f21854r0;

    /* renamed from: s, reason: collision with root package name */
    public final L0.A f21855s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f21856s0;

    /* renamed from: t, reason: collision with root package name */
    public final w0.c f21857t;

    /* renamed from: t0, reason: collision with root package name */
    public C1425W f21858t0;

    /* renamed from: u0, reason: collision with root package name */
    public o0.y f21859u0;

    /* renamed from: v, reason: collision with root package name */
    public final Looper f21860v;

    /* renamed from: v0, reason: collision with root package name */
    public W f21861v0;

    /* renamed from: w, reason: collision with root package name */
    public final P0.d f21862w;

    /* renamed from: w0, reason: collision with root package name */
    public int f21863w0;

    /* renamed from: x, reason: collision with root package name */
    public final C1555p f21864x;

    /* renamed from: x0, reason: collision with root package name */
    public long f21865x0;

    /* renamed from: y, reason: collision with root package name */
    public final SurfaceHolderCallbackC1827w f21866y;

    /* renamed from: z, reason: collision with root package name */
    public final C1828x f21867z;

    static {
        AbstractC1448w.a(StubApp.getString2(23649));
    }

    public C1830z(C1818m c1818m) {
        String string2 = StubApp.getString2(643);
        String string22 = StubApp.getString2(22171);
        String string23 = StubApp.getString2(23650);
        this.f4728a = new C1415L();
        this.f21835d = new R4.b(5);
        try {
            AbstractC1550k.o(StubApp.getString2("11614"), string23 + Integer.toHexString(System.identityHashCode(this)) + string22 + AbstractC1560u.f20194e + StubApp.getString2("511"));
            Context context = c1818m.f21780a;
            Looper looper = c1818m.f21786g;
            this.f21836e = StubApp.getOrigApplicationContext(context.getApplicationContext());
            C1555p c1555p = c1818m.f21781b;
            this.f21857t = new w0.c(c1555p);
            this.f21854r0 = c1818m.f21787h;
            this.f21845m0 = c1818m.f21788i;
            this.f21841k0 = c1818m.j;
            this.f21848o0 = false;
            this.f21819E = c1818m.f21793o;
            SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w = new SurfaceHolderCallbackC1827w(this);
            this.f21866y = surfaceHolderCallbackC1827w;
            this.f21867z = new C1828x();
            Handler handler = new Handler(looper);
            AbstractC1810e[] a3 = ((C1816k) c1818m.f21782c.get()).a(handler, surfaceHolderCallbackC1827w, surfaceHolderCallbackC1827w, surfaceHolderCallbackC1827w, surfaceHolderCallbackC1827w);
            this.f21838g = a3;
            AbstractC1550k.g(a3.length > 0);
            this.f21839h = (O0.v) c1818m.f21784e.get();
            this.f21855s = (L0.A) c1818m.f21783d.get();
            this.f21862w = (P0.d) c1818m.f21785f.get();
            this.f21853r = c1818m.f21789k;
            this.f21824K = c1818m.f21790l;
            this.f21860v = looper;
            this.f21864x = c1555p;
            this.f21837f = this;
            this.f21844m = new C1549j(looper, c1555p, new r(this));
            this.f21846n = new CopyOnWriteArraySet();
            this.f21851q = new ArrayList();
            this.f21825L = new L0.c0();
            this.f21826O = C1819n.f21797a;
            this.f21833b = new O0.w(new b0[a3.length], new O0.s[a3.length], C1422T.f18110b, null);
            this.f21849p = new C1414K();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i3 = 0; i3 < 20; i3++) {
                int i10 = iArr[i3];
                AbstractC1550k.g(!false);
                sparseBooleanArray.append(i10, true);
            }
            this.f21839h.getClass();
            AbstractC1550k.g(!false);
            sparseBooleanArray.append(29, true);
            AbstractC1550k.g(!false);
            C1436k c1436k = new C1436k(sparseBooleanArray);
            this.f21834c = new C1409F(c1436k);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i11 = 0; i11 < c1436k.f18154a.size(); i11++) {
                int a9 = c1436k.a(i11);
                AbstractC1550k.g(!false);
                sparseBooleanArray2.append(a9, true);
            }
            AbstractC1550k.g(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC1550k.g(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC1550k.g(!false);
            this.f21827P = new C1409F(new C1436k(sparseBooleanArray2));
            this.j = this.f21864x.a(this.f21860v, null);
            r rVar = new r(this);
            this.f21840k = rVar;
            this.f21861v0 = W.i(this.f21833b);
            this.f21857t.K(this.f21837f, this.f21860v);
            int i12 = AbstractC1560u.f20190a;
            String str = c1818m.f21796r;
            this.f21842l = new C1802E(this.f21838g, this.f21839h, this.f21833b, new C1815j(), this.f21862w, this.f21820F, this.f21857t, this.f21824K, c1818m.f21791m, c1818m.f21792n, this.f21860v, this.f21864x, rVar, i12 < 31 ? new w0.j(str) : D1.r(this.f21836e, this, c1818m.f21794p, str), this.f21826O);
            this.f21847n0 = 1.0f;
            this.f21820F = 0;
            o0.y yVar = o0.y.f18281B;
            this.f21828R = yVar;
            this.f21859u0 = yVar;
            this.f21863w0 = -1;
            AudioManager audioManager = (AudioManager) this.f21836e.getSystemService(string2);
            int generateAudioSessionId = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i13 = q0.c.f19860b;
            this.f21850p0 = true;
            w0.c cVar = this.f21857t;
            cVar.getClass();
            this.f21844m.a(cVar);
            P0.d dVar = this.f21862w;
            Handler handler2 = new Handler(this.f21860v);
            w0.c cVar2 = this.f21857t;
            P0.h hVar = (P0.h) dVar;
            hVar.getClass();
            cVar2.getClass();
            A0.c cVar3 = hVar.f5405b;
            cVar3.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar3.f29a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                P0.c cVar4 = (P0.c) it.next();
                if (cVar4.f5383b == cVar2) {
                    cVar4.f5384c = true;
                    copyOnWriteArrayList.remove(cVar4);
                }
            }
            copyOnWriteArrayList.add(new P0.c(handler2, cVar2));
            this.f21846n.add(this.f21866y);
            SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w2 = this.f21866y;
            K1 k12 = new K1();
            k12.f11299b = StubApp.getOrigApplicationContext(context.getApplicationContext());
            k12.f11300c = new RunnableC1806a(k12, handler, surfaceHolderCallbackC1827w2);
            this.f21815A = k12;
            k12.a();
            C1809d c1809d = new C1809d(context, handler, this.f21866y);
            this.f21816B = c1809d;
            c1809d.b(null);
            C1223z c1223z = new C1223z(27);
            context.getApplicationContext();
            this.f21817C = c1223z;
            this.f21818D = new C1145A(context);
            Z9.n nVar = new Z9.n(4);
            nVar.f9136b = 0;
            nVar.f9137c = 0;
            new C1433h(nVar);
            this.f21858t0 = C1425W.f18113d;
            this.f21843l0 = C1554o.f20179c;
            this.f21839h.a(this.f21845m0);
            E(1, 10, Integer.valueOf(generateAudioSessionId));
            E(2, 10, Integer.valueOf(generateAudioSessionId));
            E(1, 3, this.f21845m0);
            E(2, 4, Integer.valueOf(this.f21841k0));
            E(2, 5, 0);
            E(1, 9, Boolean.valueOf(this.f21848o0));
            E(2, 7, this.f21867z);
            E(6, 8, this.f21867z);
            E(-1, 16, Integer.valueOf(this.f21854r0));
            this.f21835d.a();
        } catch (Throwable th) {
            this.f21835d.a();
            throw th;
        }
    }

    public static long x(W w10) {
        C1415L c1415l = new C1415L();
        C1414K c1414k = new C1414K();
        w10.f21658a.g(w10.f21659b.f3881a, c1414k);
        long j = w10.f21660c;
        if (j != -9223372036854775807L) {
            return c1414k.f18046e + j;
        }
        return w10.f21658a.m(c1414k.f18044c, c1415l, 0L).f18061l;
    }

    public final Pair A(AbstractC1416M abstractC1416M, int i3, long j) {
        if (abstractC1416M.p()) {
            this.f21863w0 = i3;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f21865x0 = j;
            return null;
        }
        if (i3 == -1 || i3 >= abstractC1416M.o()) {
            i3 = abstractC1416M.a(false);
            j = AbstractC1560u.V(abstractC1416M.m(i3, (C1415L) this.f4728a, 0L).f18061l);
        }
        return abstractC1416M.i((C1415L) this.f4728a, this.f21849p, i3, AbstractC1560u.J(j));
    }

    public final void B(final int i3, final int i10) {
        C1554o c1554o = this.f21843l0;
        if (i3 == c1554o.f20180a && i10 == c1554o.f20181b) {
            return;
        }
        this.f21843l0 = new C1554o(i3, i10);
        this.f21844m.e(24, new InterfaceC1546g() { // from class: v0.q
            @Override // r0.InterfaceC1546g
            /* renamed from: invoke */
            public final void mo0invoke(Object obj) {
                ((InterfaceC1410G) obj).A(i3, i10);
            }
        });
        E(2, 14, new C1554o(i3, i10));
    }

    public final void C() {
        L();
        boolean w10 = w();
        int d8 = this.f21816B.d(2, w10);
        I(d8, d8 == -1 ? 2 : 1, w10);
        W w11 = this.f21861v0;
        if (w11.f21662e != 1) {
            return;
        }
        W e10 = w11.e(null);
        W g10 = e10.g(e10.f21658a.p() ? 4 : 2);
        this.f21821G++;
        C1557r c1557r = this.f21842l.j;
        c1557r.getClass();
        C1556q b2 = C1557r.b();
        b2.f20183a = c1557r.f20185a.obtainMessage(29);
        b2.b();
        J(g10, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void D() {
        SurfaceHolder surfaceHolder = this.f21832Z;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f21866y);
            this.f21832Z = null;
        }
    }

    public final void E(int i3, int i10, Object obj) {
        for (AbstractC1810e abstractC1810e : this.f21838g) {
            if (i3 == -1 || abstractC1810e.f21717b == i3) {
                int u2 = u(this.f21861v0);
                AbstractC1416M abstractC1416M = this.f21861v0.f21658a;
                if (u2 == -1) {
                    u2 = 0;
                }
                C1802E c1802e = this.f21842l;
                Z z2 = new Z(c1802e, abstractC1810e, abstractC1416M, u2, this.f21864x, c1802e.f21563l);
                AbstractC1550k.g(!z2.f21683g);
                z2.f21680d = i10;
                AbstractC1550k.g(!z2.f21683g);
                z2.f21681e = obj;
                z2.c();
            }
        }
    }

    public final void F(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (AbstractC1810e abstractC1810e : this.f21838g) {
            if (abstractC1810e.f21717b == 2) {
                int u2 = u(this.f21861v0);
                AbstractC1416M abstractC1416M = this.f21861v0.f21658a;
                int i3 = u2 == -1 ? 0 : u2;
                C1802E c1802e = this.f21842l;
                Z z10 = new Z(c1802e, abstractC1810e, abstractC1416M, i3, this.f21864x, c1802e.f21563l);
                AbstractC1550k.g(!z10.f21683g);
                z10.f21680d = 1;
                AbstractC1550k.g(!z10.f21683g);
                z10.f21681e = surface;
                z10.c();
                arrayList.add(z10);
            }
        }
        Surface surface2 = this.f21830X;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Z) it.next()).a(this.f21819E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z2 = true;
            }
            Surface surface3 = this.f21830X;
            Surface surface4 = this.f21831Y;
            if (surface3 == surface4) {
                surface4.release();
                this.f21831Y = null;
            }
        }
        this.f21830X = surface;
        if (z2) {
            C1817l c1817l = new C1817l(2, new H9.b(StubApp.getString2(23651)), 1003);
            W w10 = this.f21861v0;
            W b2 = w10.b(w10.f21659b);
            b2.f21673q = b2.f21675s;
            b2.f21674r = 0L;
            W e10 = b2.g(1).e(c1817l);
            this.f21821G++;
            C1557r c1557r = this.f21842l.j;
            c1557r.getClass();
            C1556q b10 = C1557r.b();
            b10.f20183a = c1557r.f20185a.obtainMessage(6);
            b10.b();
            J(e10, 0, false, 5, -9223372036854775807L, -1);
        }
    }

    public final void G(Surface surface) {
        L();
        D();
        F(surface);
        int i3 = surface == null ? 0 : -1;
        B(i3, i3);
    }

    public final void H() {
        int k3;
        int e10;
        C1409F c1409f = this.f21827P;
        int i3 = AbstractC1560u.f20190a;
        C1830z c1830z = this.f21837f;
        boolean y10 = c1830z.y();
        AbstractC1416M t3 = c1830z.t();
        boolean p8 = t3.p();
        C1415L c1415l = (C1415L) c1830z.f4728a;
        boolean z2 = !p8 && t3.m(c1830z.q(), c1415l, 0L).f18058h;
        AbstractC1416M t10 = c1830z.t();
        if (t10.p()) {
            k3 = -1;
        } else {
            int q10 = c1830z.q();
            c1830z.L();
            int i10 = c1830z.f21820F;
            if (i10 == 1) {
                i10 = 0;
            }
            c1830z.L();
            k3 = t10.k(q10, i10);
        }
        boolean z10 = k3 != -1;
        AbstractC1416M t11 = c1830z.t();
        if (t11.p()) {
            e10 = -1;
        } else {
            int q11 = c1830z.q();
            c1830z.L();
            int i11 = c1830z.f21820F;
            if (i11 == 1) {
                i11 = 0;
            }
            c1830z.L();
            e10 = t11.e(q11, i11, false);
        }
        boolean z11 = e10 != -1;
        AbstractC1416M t12 = c1830z.t();
        boolean z12 = !t12.p() && t12.m(c1830z.q(), c1415l, 0L).a();
        AbstractC1416M t13 = c1830z.t();
        boolean z13 = !t13.p() && t13.m(c1830z.q(), c1415l, 0L).f18059i;
        boolean p9 = c1830z.t().p();
        C0879c c0879c = new C0879c(17);
        C1436k c1436k = this.f21834c.f18029a;
        C0398e c0398e = (C0398e) c0879c.f13742a;
        c0398e.getClass();
        for (int i12 = 0; i12 < c1436k.f18154a.size(); i12++) {
            c0398e.c(c1436k.a(i12));
        }
        boolean z14 = !y10;
        c0879c.j(4, z14);
        c0879c.j(5, z2 && !y10);
        c0879c.j(6, z10 && !y10);
        c0879c.j(7, !p9 && (z10 || !z12 || z2) && !y10);
        c0879c.j(8, z11 && !y10);
        c0879c.j(9, !p9 && (z11 || (z12 && z13)) && !y10);
        c0879c.j(10, z14);
        c0879c.j(11, z2 && !y10);
        c0879c.j(12, z2 && !y10);
        C1409F c1409f2 = new C1409F(c0398e.e());
        this.f21827P = c1409f2;
        if (c1409f2.equals(c1409f)) {
            return;
        }
        this.f21844m.c(13, new r(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final void I(int i3, int i10, boolean z2) {
        ?? r13 = (!z2 || i3 == -1) ? 0 : 1;
        int i11 = i3 == 0 ? 1 : 0;
        W w10 = this.f21861v0;
        if (w10.f21668l == r13 && w10.f21670n == i11 && w10.f21669m == i10) {
            return;
        }
        this.f21821G++;
        W w11 = this.f21861v0;
        boolean z10 = w11.f21672p;
        W w12 = w11;
        if (z10) {
            w12 = w11.a();
        }
        W d8 = w12.d(i10, i11, r13);
        int i12 = (i11 << 4) | i10;
        C1557r c1557r = this.f21842l.j;
        c1557r.getClass();
        C1556q b2 = C1557r.b();
        b2.f20183a = c1557r.f20185a.obtainMessage(1, r13, i12);
        b2.b();
        J(d8, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03ba A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(final v0.W r33, final int r34, boolean r35, int r36, long r37, int r39) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1830z.J(v0.W, int, boolean, int, long, int):void");
    }

    public final void K() {
        L();
        int i3 = this.f21861v0.f21662e;
        C1145A c1145a = this.f21818D;
        C1223z c1223z = this.f21817C;
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                L();
                boolean z2 = this.f21861v0.f21672p;
                w();
                c1223z.getClass();
                w();
                c1145a.getClass();
                return;
            }
            if (i3 != 4) {
                throw new IllegalStateException();
            }
        }
        c1223z.getClass();
        c1145a.getClass();
    }

    public final void L() {
        R4.b bVar = this.f21835d;
        synchronized (bVar) {
            boolean z2 = false;
            while (!bVar.f6177b) {
                try {
                    bVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f21860v.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f21860v.getThread().getName();
            int i3 = AbstractC1560u.f20190a;
            Locale locale = Locale.US;
            String j = AbstractC1482f.j(StubApp.getString2(23652), name, StubApp.getString2(23653), name2, StubApp.getString2(23654));
            if (this.f21850p0) {
                throw new IllegalStateException(j);
            }
            AbstractC1550k.x(StubApp.getString2(11614), j, this.f21852q0 ? null : new IllegalStateException());
            this.f21852q0 = true;
        }
    }

    @Override // Mb.b
    public final void j(int i3, long j) {
        L();
        if (i3 == -1) {
            return;
        }
        AbstractC1550k.c(i3 >= 0);
        AbstractC1416M abstractC1416M = this.f21861v0.f21658a;
        if (abstractC1416M.p() || i3 < abstractC1416M.o()) {
            w0.c cVar = this.f21857t;
            if (!cVar.f21997i) {
                w0.a E10 = cVar.E();
                cVar.f21997i = true;
                cVar.J(E10, -1, new w0.b(4));
            }
            this.f21821G++;
            if (y()) {
                AbstractC1550k.w(StubApp.getString2(11614), StubApp.getString2(23655));
                C0466t c0466t = new C0466t(this.f21861v0);
                c0466t.f(1);
                C1830z c1830z = this.f21840k.f21802a;
                c1830z.j.c(new com.even.translate.a(20, c1830z, c0466t));
                return;
            }
            W w10 = this.f21861v0;
            int i10 = w10.f21662e;
            if (i10 == 3 || (i10 == 4 && !abstractC1416M.p())) {
                w10 = this.f21861v0.g(2);
            }
            int q10 = q();
            W z2 = z(w10, abstractC1416M, A(abstractC1416M, i3, j));
            this.f21842l.j.a(3, new C1801D(abstractC1416M, i3, AbstractC1560u.J(j))).b();
            J(z2, 0, true, 1, s(z2), q10);
        }
    }

    public final o0.y l() {
        AbstractC1416M t3 = t();
        if (t3.p()) {
            return this.f21859u0;
        }
        C1447v c1447v = t3.m(q(), (C1415L) this.f4728a, 0L).f18053c;
        o0.x a3 = this.f21859u0.a();
        o0.y yVar = c1447v.f18251d;
        if (yVar != null) {
            CharSequence charSequence = yVar.f18283a;
            if (charSequence != null) {
                a3.f18256a = charSequence;
            }
            CharSequence charSequence2 = yVar.f18284b;
            if (charSequence2 != null) {
                a3.f18257b = charSequence2;
            }
            CharSequence charSequence3 = yVar.f18285c;
            if (charSequence3 != null) {
                a3.f18258c = charSequence3;
            }
            CharSequence charSequence4 = yVar.f18286d;
            if (charSequence4 != null) {
                a3.f18259d = charSequence4;
            }
            CharSequence charSequence5 = yVar.f18287e;
            if (charSequence5 != null) {
                a3.f18260e = charSequence5;
            }
            byte[] bArr = yVar.f18288f;
            if (bArr != null) {
                a3.f18261f = bArr == null ? null : (byte[]) bArr.clone();
                a3.f18262g = yVar.f18289g;
            }
            Integer num = yVar.f18290h;
            if (num != null) {
                a3.f18263h = num;
            }
            Integer num2 = yVar.f18291i;
            if (num2 != null) {
                a3.f18264i = num2;
            }
            Integer num3 = yVar.j;
            if (num3 != null) {
                a3.j = num3;
            }
            Boolean bool = yVar.f18292k;
            if (bool != null) {
                a3.f18265k = bool;
            }
            Integer num4 = yVar.f18293l;
            if (num4 != null) {
                a3.f18266l = num4;
            }
            Integer num5 = yVar.f18294m;
            if (num5 != null) {
                a3.f18266l = num5;
            }
            Integer num6 = yVar.f18295n;
            if (num6 != null) {
                a3.f18267m = num6;
            }
            Integer num7 = yVar.f18296o;
            if (num7 != null) {
                a3.f18268n = num7;
            }
            Integer num8 = yVar.f18297p;
            if (num8 != null) {
                a3.f18269o = num8;
            }
            Integer num9 = yVar.f18298q;
            if (num9 != null) {
                a3.f18270p = num9;
            }
            Integer num10 = yVar.f18299r;
            if (num10 != null) {
                a3.f18271q = num10;
            }
            CharSequence charSequence6 = yVar.f18300s;
            if (charSequence6 != null) {
                a3.f18272r = charSequence6;
            }
            CharSequence charSequence7 = yVar.f18301t;
            if (charSequence7 != null) {
                a3.f18273s = charSequence7;
            }
            CharSequence charSequence8 = yVar.f18302u;
            if (charSequence8 != null) {
                a3.f18274t = charSequence8;
            }
            Integer num11 = yVar.f18303v;
            if (num11 != null) {
                a3.f18275u = num11;
            }
            Integer num12 = yVar.f18304w;
            if (num12 != null) {
                a3.f18276v = num12;
            }
            CharSequence charSequence9 = yVar.f18305x;
            if (charSequence9 != null) {
                a3.f18277w = charSequence9;
            }
            CharSequence charSequence10 = yVar.f18306y;
            if (charSequence10 != null) {
                a3.f18278x = charSequence10;
            }
            Integer num13 = yVar.f18307z;
            if (num13 != null) {
                a3.f18279y = num13;
            }
            M4.I i3 = yVar.f18282A;
            if (!i3.isEmpty()) {
                a3.f18280z = M4.I.m(i3);
            }
        }
        return new o0.y(a3);
    }

    public final long m() {
        L();
        if (y()) {
            W w10 = this.f21861v0;
            return w10.f21667k.equals(w10.f21659b) ? AbstractC1560u.V(this.f21861v0.f21673q) : v();
        }
        L();
        if (this.f21861v0.f21658a.p()) {
            return this.f21865x0;
        }
        W w11 = this.f21861v0;
        long j = 0;
        if (w11.f21667k.f3884d != w11.f21659b.f3884d) {
            return AbstractC1560u.V(w11.f21658a.m(q(), (C1415L) this.f4728a, 0L).f18062m);
        }
        long j3 = w11.f21673q;
        if (this.f21861v0.f21667k.b()) {
            W w12 = this.f21861v0;
            w12.f21658a.g(w12.f21667k.f3881a, this.f21849p).d(this.f21861v0.f21667k.f3882b);
        } else {
            j = j3;
        }
        W w13 = this.f21861v0;
        AbstractC1416M abstractC1416M = w13.f21658a;
        Object obj = w13.f21667k.f3881a;
        C1414K c1414k = this.f21849p;
        abstractC1416M.g(obj, c1414k);
        return AbstractC1560u.V(j + c1414k.f18046e);
    }

    public final long n(W w10) {
        if (!w10.f21659b.b()) {
            return AbstractC1560u.V(s(w10));
        }
        Object obj = w10.f21659b.f3881a;
        AbstractC1416M abstractC1416M = w10.f21658a;
        C1414K c1414k = this.f21849p;
        abstractC1416M.g(obj, c1414k);
        long j = w10.f21660c;
        if (j == -9223372036854775807L) {
            return AbstractC1560u.V(abstractC1416M.m(u(w10), (C1415L) this.f4728a, 0L).f18061l);
        }
        return AbstractC1560u.V(j) + AbstractC1560u.V(c1414k.f18046e);
    }

    public final int o() {
        L();
        if (y()) {
            return this.f21861v0.f21659b.f3882b;
        }
        return -1;
    }

    public final int p() {
        L();
        if (y()) {
            return this.f21861v0.f21659b.f3883c;
        }
        return -1;
    }

    public final int q() {
        L();
        int u2 = u(this.f21861v0);
        if (u2 == -1) {
            return 0;
        }
        return u2;
    }

    public final long r() {
        L();
        return AbstractC1560u.V(s(this.f21861v0));
    }

    public final long s(W w10) {
        if (w10.f21658a.p()) {
            return AbstractC1560u.J(this.f21865x0);
        }
        long j = w10.f21672p ? w10.j() : w10.f21675s;
        if (w10.f21659b.b()) {
            return j;
        }
        AbstractC1416M abstractC1416M = w10.f21658a;
        Object obj = w10.f21659b.f3881a;
        C1414K c1414k = this.f21849p;
        abstractC1416M.g(obj, c1414k);
        return j + c1414k.f18046e;
    }

    public final AbstractC1416M t() {
        L();
        return this.f21861v0.f21658a;
    }

    public final int u(W w10) {
        if (w10.f21658a.p()) {
            return this.f21863w0;
        }
        return w10.f21658a.g(w10.f21659b.f3881a, this.f21849p).f18044c;
    }

    public final long v() {
        L();
        if (!y()) {
            AbstractC1416M t3 = t();
            if (t3.p()) {
                return -9223372036854775807L;
            }
            return AbstractC1560u.V(t3.m(q(), (C1415L) this.f4728a, 0L).f18062m);
        }
        W w10 = this.f21861v0;
        L0.B b2 = w10.f21659b;
        AbstractC1416M abstractC1416M = w10.f21658a;
        Object obj = b2.f3881a;
        C1414K c1414k = this.f21849p;
        abstractC1416M.g(obj, c1414k);
        return AbstractC1560u.V(c1414k.a(b2.f3882b, b2.f3883c));
    }

    public final boolean w() {
        L();
        return this.f21861v0.f21668l;
    }

    public final boolean y() {
        L();
        return this.f21861v0.f21659b.b();
    }

    public final W z(W w10, AbstractC1416M abstractC1416M, Pair pair) {
        List list;
        AbstractC1550k.c(abstractC1416M.p() || pair != null);
        AbstractC1416M abstractC1416M2 = w10.f21658a;
        long n10 = n(w10);
        W h2 = w10.h(abstractC1416M);
        if (abstractC1416M.p()) {
            L0.B b2 = W.f21657u;
            long J10 = AbstractC1560u.J(this.f21865x0);
            W b10 = h2.c(b2, J10, J10, J10, 0L, h0.f4092d, this.f21833b, M4.Z.f4578e).b(b2);
            b10.f21673q = b10.f21675s;
            return b10;
        }
        Object obj = h2.f21659b.f3881a;
        boolean equals = obj.equals(pair.first);
        L0.B b11 = !equals ? new L0.B(pair.first) : h2.f21659b;
        long longValue = ((Long) pair.second).longValue();
        long J11 = AbstractC1560u.J(n10);
        if (!abstractC1416M2.p()) {
            J11 -= abstractC1416M2.g(obj, this.f21849p).f18046e;
        }
        if (!equals || longValue < J11) {
            L0.B b12 = b11;
            AbstractC1550k.g(!b12.b());
            h0 h0Var = !equals ? h0.f4092d : h2.f21665h;
            O0.w wVar = !equals ? this.f21833b : h2.f21666i;
            if (equals) {
                list = h2.j;
            } else {
                M4.G g10 = M4.I.f4549b;
                list = M4.Z.f4578e;
            }
            W b13 = h2.c(b12, longValue, longValue, longValue, 0L, h0Var, wVar, list).b(b12);
            b13.f21673q = longValue;
            return b13;
        }
        if (longValue != J11) {
            L0.B b14 = b11;
            AbstractC1550k.g(!b14.b());
            long max = Math.max(0L, h2.f21674r - (longValue - J11));
            long j = h2.f21673q;
            if (h2.f21667k.equals(h2.f21659b)) {
                j = longValue + max;
            }
            W c10 = h2.c(b14, longValue, longValue, longValue, max, h2.f21665h, h2.f21666i, h2.j);
            c10.f21673q = j;
            return c10;
        }
        int b15 = abstractC1416M.b(h2.f21667k.f3881a);
        if (b15 != -1 && abstractC1416M.f(b15, this.f21849p, false).f18044c == abstractC1416M.g(b11.f3881a, this.f21849p).f18044c) {
            return h2;
        }
        abstractC1416M.g(b11.f3881a, this.f21849p);
        long a3 = b11.b() ? this.f21849p.a(b11.f3882b, b11.f3883c) : this.f21849p.f18045d;
        L0.B b16 = b11;
        W b17 = h2.c(b16, h2.f21675s, h2.f21675s, h2.f21661d, a3 - h2.f21675s, h2.f21665h, h2.f21666i, h2.j).b(b16);
        b17.f21673q = a3;
        return b17;
    }
}
