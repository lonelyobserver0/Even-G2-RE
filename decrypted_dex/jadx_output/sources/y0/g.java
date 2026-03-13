package y0;

import B0.v;
import L0.AbstractC0105a;
import L0.B;
import L0.C0123t;
import L0.InterfaceC0129z;
import P0.o;
import P0.p;
import P0.q;
import P0.r;
import Z9.C0366a;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.stub.StubApp;
import f4.C0879c;
import f4.C0882f;
import java.io.IOException;
import java.util.HashMap;
import o0.AbstractC1448w;
import o0.C1443r;
import o0.C1444s;
import o0.C1447v;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1725y;
import t0.InterfaceC1707g;
import t0.InterfaceC1708h;
import t0.InterfaceC1726z;
import z0.C1987c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g extends AbstractC0105a {

    /* renamed from: A, reason: collision with root package name */
    public final C0879c f23373A;

    /* renamed from: B, reason: collision with root package name */
    public final p f23374B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC1708h f23375C;

    /* renamed from: D, reason: collision with root package name */
    public o f23376D;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC1726z f23377E;

    /* renamed from: F, reason: collision with root package name */
    public v f23378F;

    /* renamed from: G, reason: collision with root package name */
    public Handler f23379G;

    /* renamed from: H, reason: collision with root package name */
    public C1443r f23380H;

    /* renamed from: I, reason: collision with root package name */
    public Uri f23381I;

    /* renamed from: K, reason: collision with root package name */
    public final Uri f23382K;

    /* renamed from: L, reason: collision with root package name */
    public C1987c f23383L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f23384O;

    /* renamed from: P, reason: collision with root package name */
    public long f23385P;

    /* renamed from: R, reason: collision with root package name */
    public long f23386R;

    /* renamed from: T, reason: collision with root package name */
    public long f23387T;

    /* renamed from: X, reason: collision with root package name */
    public int f23388X;

    /* renamed from: Y, reason: collision with root package name */
    public long f23389Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f23390Z;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23391h;
    public C1447v h0;
    public final InterfaceC1707g j;

    /* renamed from: k, reason: collision with root package name */
    public final Bc.i f23392k;

    /* renamed from: l, reason: collision with root package name */
    public final I4.e f23393l;

    /* renamed from: m, reason: collision with root package name */
    public final A0.j f23394m;

    /* renamed from: n, reason: collision with root package name */
    public final I4.e f23395n;

    /* renamed from: p, reason: collision with root package name */
    public final p2.h f23396p;

    /* renamed from: q, reason: collision with root package name */
    public final long f23397q;

    /* renamed from: r, reason: collision with root package name */
    public final long f23398r;

    /* renamed from: s, reason: collision with root package name */
    public final A0.f f23399s;

    /* renamed from: t, reason: collision with root package name */
    public final q f23400t;

    /* renamed from: v, reason: collision with root package name */
    public final C0366a f23401v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f23402w;

    /* renamed from: x, reason: collision with root package name */
    public final SparseArray f23403x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC1965c f23404y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC1965c f23405z;

    static {
        AbstractC1448w.a(StubApp.getString2(24576));
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [y0.c] */
    public g(C1447v c1447v, InterfaceC1707g interfaceC1707g, q qVar, Bc.i iVar, I4.e eVar, A0.j jVar, I4.e eVar2, long j, long j3) {
        this.h0 = c1447v;
        this.f23380H = c1447v.f18250c;
        C1444s c1444s = c1447v.f18249b;
        c1444s.getClass();
        Uri uri = c1444s.f18242a;
        this.f23381I = uri;
        this.f23382K = uri;
        this.f23383L = null;
        this.j = interfaceC1707g;
        this.f23400t = qVar;
        this.f23392k = iVar;
        this.f23394m = jVar;
        this.f23395n = eVar2;
        this.f23397q = j;
        this.f23398r = j3;
        this.f23393l = eVar;
        this.f23396p = new p2.h(13);
        this.f23391h = false;
        this.f23399s = a(null);
        this.f23402w = new Object();
        this.f23403x = new SparseArray();
        this.f23373A = new C0879c(this);
        this.f23389Y = -9223372036854775807L;
        this.f23387T = -9223372036854775807L;
        this.f23401v = new C0366a(this, 27);
        this.f23374B = new C0882f(this, 19);
        final int i3 = 0;
        this.f23404y = new Runnable(this) { // from class: y0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f23361b;

            {
                this.f23361b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f23361b.B();
                        break;
                    default:
                        this.f23361b.A(false);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f23405z = new Runnable(this) { // from class: y0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f23361b;

            {
                this.f23361b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f23361b.B();
                        break;
                    default:
                        this.f23361b.A(false);
                        break;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean w(z0.h r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            java.util.List r2 = r5.f23680c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            z0.a r2 = (z0.C1985a) r2
            int r2 = r2.f23637b
            r3 = 1
            if (r2 == r3) goto L1c
            r4 = 2
            if (r2 != r4) goto L19
            goto L1c
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            return r3
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.g.w(z0.h):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0380, code lost:
    
        if (r15.f18232a == (-9223372036854775807L)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0174, code lost:
    
        r11 = r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01db A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [int] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v31, types: [O0.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(boolean r43) {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.g.A(boolean):void");
    }

    public final void B() {
        Uri uri;
        this.f23379G.removeCallbacks(this.f23404y);
        if (this.f23376D.c()) {
            return;
        }
        if (this.f23376D.d()) {
            this.f23384O = true;
            return;
        }
        synchronized (this.f23402w) {
            uri = this.f23381I;
        }
        this.f23384O = false;
        r rVar = new r(this.f23375C, uri, 4, this.f23400t);
        C0366a c0366a = this.f23401v;
        this.f23395n.getClass();
        this.f23376D.f(rVar, c0366a, 3);
        this.f23399s.h(new C0123t(rVar.f5436b), rVar.f5437c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // L0.AbstractC0105a
    public final InterfaceC0129z b(B b2, P0.e eVar, long j) {
        int intValue = ((Integer) b2.f3881a).intValue() - this.f23390Z;
        A0.f a3 = a(b2);
        A0.f fVar = new A0.f(this.f4042d.f34c, 0, b2);
        int i3 = this.f23390Z + intValue;
        C1987c c1987c = this.f23383L;
        InterfaceC1726z interfaceC1726z = this.f23377E;
        long j3 = this.f23387T;
        w0.j jVar = this.f4045g;
        AbstractC1550k.h(jVar);
        C1964b c1964b = new C1964b(i3, c1987c, this.f23396p, intValue, this.f23392k, interfaceC1726z, this.f23394m, fVar, this.f23395n, a3, j3, this.f23374B, eVar, this.f23393l, this.f23373A, jVar);
        this.f23403x.put(i3, c1964b);
        return c1964b;
    }

    @Override // L0.AbstractC0105a
    public final synchronized C1447v h() {
        return this.h0;
    }

    @Override // L0.AbstractC0105a
    public final void j() {
        this.f23374B.a();
    }

    @Override // L0.AbstractC0105a
    public final void l(InterfaceC1726z interfaceC1726z) {
        this.f23377E = interfaceC1726z;
        Looper myLooper = Looper.myLooper();
        w0.j jVar = this.f4045g;
        AbstractC1550k.h(jVar);
        A0.j jVar2 = this.f23394m;
        jVar2.c(myLooper, jVar);
        jVar2.prepare();
        if (this.f23391h) {
            A(false);
            return;
        }
        this.f23375C = this.j.g();
        this.f23376D = new o(StubApp.getString2(8150));
        this.f23379G = AbstractC1560u.m(null);
        B();
    }

    @Override // L0.AbstractC0105a
    public final void n(InterfaceC0129z interfaceC0129z) {
        C1964b c1964b = (C1964b) interfaceC0129z;
        m mVar = c1964b.f23349n;
        mVar.j = true;
        mVar.f23437d.removeCallbacksAndMessages(null);
        for (M0.h hVar : c1964b.f23354t) {
            hVar.B(c1964b);
        }
        c1964b.f23353s = null;
        this.f23403x.remove(c1964b.f23338a);
    }

    @Override // L0.AbstractC0105a
    public final void q() {
        this.f23384O = false;
        this.f23375C = null;
        o oVar = this.f23376D;
        if (oVar != null) {
            oVar.e(null);
            this.f23376D = null;
        }
        this.f23385P = 0L;
        this.f23386R = 0L;
        this.f23381I = this.f23382K;
        this.f23378F = null;
        Handler handler = this.f23379G;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f23379G = null;
        }
        this.f23387T = -9223372036854775807L;
        this.f23388X = 0;
        this.f23389Y = -9223372036854775807L;
        this.f23403x.clear();
        p2.h hVar = this.f23396p;
        ((HashMap) hVar.f19671a).clear();
        ((HashMap) hVar.f19672b).clear();
        ((HashMap) hVar.f19673c).clear();
        this.f23394m.release();
    }

    @Override // L0.AbstractC0105a
    public final synchronized void v(C1447v c1447v) {
        this.h0 = c1447v;
    }

    public final void x() {
        boolean z2;
        o oVar = this.f23376D;
        d dVar = new d(this);
        synchronized (Q0.b.f5690b) {
            z2 = Q0.b.f5691c;
        }
        if (z2) {
            dVar.a();
            return;
        }
        if (oVar == null) {
            oVar = new o(StubApp.getString2(24577));
        }
        oVar.f(new u5.d(16), new Z9.q(dVar, 17), 1);
    }

    public final void y(r rVar, long j) {
        long j3 = rVar.f5435a;
        C1725y c1725y = rVar.f5438d;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j);
        this.f23395n.getClass();
        this.f23399s.c(c0123t, rVar.f5437c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void z(IOException iOException) {
        AbstractC1550k.l(StubApp.getString2(8150), StubApp.getString2(24578), iOException);
        this.f23387T = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        A(true);
    }
}
