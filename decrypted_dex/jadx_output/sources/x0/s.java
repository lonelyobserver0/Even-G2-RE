package x0;

import M4.G;
import M4.I;
import M4.Z;
import T0.C0313d;
import Z9.C0366a;
import a0.C0379a;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.stub.StubApp;
import f4.C0882f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k5.C1106a;
import o0.AbstractC1405B;
import o0.C1408E;
import o0.C1428c;
import o0.C1429d;
import o0.C1438m;
import p0.AbstractC1482f;
import p0.C1477a;
import p0.C1478b;
import p0.C1485i;
import p0.InterfaceC1480d;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.ThreadFactoryC1559t;
import s.C1590a;
import sa.C1608a;
import sb.C1644e0;
import v0.C1798A;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s {

    /* renamed from: j0, reason: collision with root package name */
    public static final Object f22730j0 = new Object();

    /* renamed from: k0, reason: collision with root package name */
    public static ScheduledExecutorService f22731k0;

    /* renamed from: l0, reason: collision with root package name */
    public static int f22732l0;

    /* renamed from: A, reason: collision with root package name */
    public n f22733A;

    /* renamed from: B, reason: collision with root package name */
    public n f22734B;

    /* renamed from: C, reason: collision with root package name */
    public C1408E f22735C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f22736D;

    /* renamed from: E, reason: collision with root package name */
    public ByteBuffer f22737E;

    /* renamed from: F, reason: collision with root package name */
    public int f22738F;

    /* renamed from: G, reason: collision with root package name */
    public long f22739G;

    /* renamed from: H, reason: collision with root package name */
    public long f22740H;

    /* renamed from: I, reason: collision with root package name */
    public long f22741I;

    /* renamed from: J, reason: collision with root package name */
    public long f22742J;

    /* renamed from: K, reason: collision with root package name */
    public int f22743K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f22744L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f22745M;

    /* renamed from: N, reason: collision with root package name */
    public long f22746N;

    /* renamed from: O, reason: collision with root package name */
    public float f22747O;

    /* renamed from: P, reason: collision with root package name */
    public ByteBuffer f22748P;

    /* renamed from: Q, reason: collision with root package name */
    public int f22749Q;

    /* renamed from: R, reason: collision with root package name */
    public ByteBuffer f22750R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f22751S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f22752T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f22753U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f22754V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f22755W;

    /* renamed from: X, reason: collision with root package name */
    public int f22756X;

    /* renamed from: Y, reason: collision with root package name */
    public C1429d f22757Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0366a f22758Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22759a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f22760a0;

    /* renamed from: b, reason: collision with root package name */
    public final C1608a f22761b;

    /* renamed from: b0, reason: collision with root package name */
    public long f22762b0;

    /* renamed from: c, reason: collision with root package name */
    public final l f22763c;

    /* renamed from: c0, reason: collision with root package name */
    public long f22764c0;

    /* renamed from: d, reason: collision with root package name */
    public final z f22765d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f22766d0;

    /* renamed from: e, reason: collision with root package name */
    public final Z f22767e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f22768e0;

    /* renamed from: f, reason: collision with root package name */
    public final Z f22769f;

    /* renamed from: f0, reason: collision with root package name */
    public Looper f22770f0;

    /* renamed from: g, reason: collision with root package name */
    public final k f22771g;

    /* renamed from: g0, reason: collision with root package name */
    public long f22772g0;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f22773h;
    public long h0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22774i;

    /* renamed from: i0, reason: collision with root package name */
    public Handler f22775i0;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public C1608a f22776k;

    /* renamed from: l, reason: collision with root package name */
    public final p f22777l;

    /* renamed from: m, reason: collision with root package name */
    public final p f22778m;

    /* renamed from: n, reason: collision with root package name */
    public final t f22779n;

    /* renamed from: o, reason: collision with root package name */
    public final C1590a f22780o;

    /* renamed from: p, reason: collision with root package name */
    public final t f22781p;

    /* renamed from: q, reason: collision with root package name */
    public w0.j f22782q;

    /* renamed from: r, reason: collision with root package name */
    public C0379a f22783r;

    /* renamed from: s, reason: collision with root package name */
    public m f22784s;

    /* renamed from: t, reason: collision with root package name */
    public m f22785t;

    /* renamed from: u, reason: collision with root package name */
    public C1477a f22786u;

    /* renamed from: v, reason: collision with root package name */
    public AudioTrack f22787v;

    /* renamed from: w, reason: collision with root package name */
    public b f22788w;

    /* renamed from: x, reason: collision with root package name */
    public m6.l f22789x;

    /* renamed from: y, reason: collision with root package name */
    public C1608a f22790y;

    /* renamed from: z, reason: collision with root package name */
    public C1428c f22791z;

    public s(K2.c cVar) {
        b bVar;
        Context context = (Context) cVar.f3639c;
        this.f22759a = context;
        C1428c c1428c = C1428c.f18127c;
        this.f22791z = c1428c;
        if (context != null) {
            b bVar2 = b.f22641c;
            int i3 = AbstractC1560u.f20190a;
            bVar = b.c(context, c1428c, null);
        } else {
            bVar = (b) cVar.f3640d;
        }
        this.f22788w = bVar;
        this.f22761b = (C1608a) cVar.f3641e;
        int i10 = AbstractC1560u.f20190a;
        this.f22774i = false;
        this.j = 0;
        this.f22779n = (t) cVar.f3642f;
        C1590a c1590a = (C1590a) cVar.f3644h;
        c1590a.getClass();
        this.f22780o = c1590a;
        this.f22771g = new k(new C0882f(this, 17));
        l lVar = new l();
        this.f22763c = lVar;
        z zVar = new z();
        zVar.f22828m = AbstractC1560u.f20195f;
        this.f22765d = zVar;
        C1485i c1485i = new C1485i();
        G g10 = I.f4549b;
        Object[] objArr = {c1485i, lVar, zVar};
        M4.r.b(3, objArr);
        this.f22767e = I.j(3, objArr);
        this.f22769f = I.q(new y());
        this.f22747O = 1.0f;
        this.f22756X = 0;
        this.f22757Y = new C1429d();
        C1408E c1408e = C1408E.f18025d;
        this.f22734B = new n(c1408e, 0L, 0L);
        this.f22735C = c1408e;
        this.f22736D = false;
        this.f22773h = new ArrayDeque();
        this.f22777l = new p();
        this.f22778m = new p();
        this.f22781p = (t) cVar.f3643g;
    }

    public static boolean p(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (AbstractC1560u.f20190a < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.x()
            sa.a r1 = r8.f22761b
            if (r0 != 0) goto L3f
            boolean r0 = r8.f22760a0
            if (r0 != 0) goto L39
            x0.m r0 = r8.f22785t
            int r2 = r0.f22711c
            if (r2 != 0) goto L39
            o0.m r0 = r0.f22709a
            int r0 = r0.f18195E
            o0.E r0 = r8.f22735C
            r1.getClass()
            float r2 = r0.f18026a
            java.lang.Object r3 = r1.f20822c
            p0.h r3 = (p0.C1484h) r3
            float r4 = r3.f19642c
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r5 = 1
            if (r4 == 0) goto L2c
            r3.f19642c = r2
            r3.f19648i = r5
        L2c:
            float r2 = r3.f19643d
            float r4 = r0.f18027b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L3b
            r3.f19643d = r4
            r3.f19648i = r5
            goto L3b
        L39:
            o0.E r0 = o0.C1408E.f18025d
        L3b:
            r8.f22735C = r0
        L3d:
            r3 = r0
            goto L42
        L3f:
            o0.E r0 = o0.C1408E.f18025d
            goto L3d
        L42:
            boolean r0 = r8.f22760a0
            if (r0 != 0) goto L59
            x0.m r0 = r8.f22785t
            int r2 = r0.f22711c
            if (r2 != 0) goto L59
            o0.m r0 = r0.f22709a
            int r0 = r0.f18195E
            boolean r0 = r8.f22736D
            java.lang.Object r1 = r1.f20821b
            x0.x r1 = (x0.x) r1
            r1.f22816o = r0
            goto L5a
        L59:
            r0 = 0
        L5a:
            r8.f22736D = r0
            java.util.ArrayDeque r0 = r8.f22773h
            x0.n r2 = new x0.n
            r4 = 0
            long r4 = java.lang.Math.max(r4, r9)
            x0.m r9 = r8.f22785t
            long r6 = r8.k()
            int r9 = r9.f22713e
            long r6 = r0.AbstractC1560u.P(r9, r6)
            r2.<init>(r3, r4, r6)
            r0.add(r2)
            x0.m r9 = r8.f22785t
            p0.a r9 = r9.f22717i
            r8.f22786u = r9
            r9.b()
            a0.a r9 = r8.f22783r
            if (r9 == 0) goto L9c
            boolean r10 = r8.f22736D
            java.lang.Object r9 = r9.f9233b
            x0.v r9 = (x0.v) r9
            v0.F r9 = r9.f22794X0
            java.lang.Object r0 = r9.f21581a
            android.os.Handler r0 = (android.os.Handler) r0
            if (r0 == 0) goto L9c
            R5.a r1 = new R5.a
            r2 = 3
            r1.<init>(r2, r9, r10)
            r0.post(r1)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.s.a(long):void");
    }

    public final AudioTrack b(C0313d c0313d, C1428c c1428c, int i3, C1438m c1438m) {
        try {
            try {
                AudioTrack a3 = this.f22781p.a(c0313d, c1428c, i3);
                int state = a3.getState();
                if (state == 1) {
                    return a3;
                }
                try {
                    a3.release();
                } catch (Exception unused) {
                }
                throw new g(state, c0313d.f6987b, c0313d.f6988c, c0313d.f6986a, c1438m, c0313d.f6990e, null);
            } catch (IllegalArgumentException e10) {
                e = e10;
                RuntimeException runtimeException = e;
                throw new g(0, c0313d.f6987b, c0313d.f6988c, c0313d.f6986a, c1438m, c0313d.f6990e, runtimeException);
            } catch (UnsupportedOperationException e11) {
                e = e11;
                RuntimeException runtimeException2 = e;
                throw new g(0, c0313d.f6987b, c0313d.f6988c, c0313d.f6986a, c1438m, c0313d.f6990e, runtimeException2);
            }
        } catch (IllegalArgumentException e12) {
            e = e12;
        } catch (UnsupportedOperationException e13) {
            e = e13;
        }
    }

    public final AudioTrack c(m mVar) {
        try {
            return b(mVar.a(), this.f22791z, this.f22756X, mVar.f22709a);
        } catch (g e10) {
            C0379a c0379a = this.f22783r;
            if (c0379a != null) {
                c0379a.v(e10);
            }
            throw e10;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017a, code lost:
    
        if (r6 > 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017d, code lost:
    
        if (r8 > 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0180, code lost:
    
        if (r8 < 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(o0.C1438m r28, int[] r29) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.s.d(o0.m, int[]):void");
    }

    public final void e(long j) {
        int write;
        C0379a c0379a;
        C1798A c1798a;
        boolean z2;
        if (this.f22750R == null) {
            return;
        }
        p pVar = this.f22778m;
        if (pVar.f22725a != null) {
            synchronized (f22730j0) {
                z2 = f22732l0 > 0;
            }
            if (z2 || SystemClock.elapsedRealtime() < pVar.f22727c) {
                return;
            }
        }
        int remaining = this.f22750R.remaining();
        if (this.f22760a0) {
            AbstractC1550k.g(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.f22762b0;
            } else {
                this.f22762b0 = j;
            }
            AudioTrack audioTrack = this.f22787v;
            ByteBuffer byteBuffer = this.f22750R;
            if (AbstractC1560u.f20190a >= 26) {
                write = audioTrack.write(byteBuffer, remaining, 1, 1000 * j);
            } else {
                if (this.f22737E == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f22737E = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f22737E.putInt(1431633921);
                }
                if (this.f22738F == 0) {
                    this.f22737E.putInt(4, remaining);
                    this.f22737E.putLong(8, j * 1000);
                    this.f22737E.position(0);
                    this.f22738F = remaining;
                }
                int remaining2 = this.f22737E.remaining();
                if (remaining2 > 0) {
                    int write2 = audioTrack.write(this.f22737E, remaining2, 1);
                    if (write2 < 0) {
                        this.f22738F = 0;
                        write = write2;
                    } else if (write2 < remaining2) {
                        write = 0;
                    }
                }
                write = audioTrack.write(byteBuffer, remaining, 1);
                if (write < 0) {
                    this.f22738F = 0;
                } else {
                    this.f22738F -= write;
                }
            }
        } else {
            write = this.f22787v.write(this.f22750R, remaining, 1);
        }
        this.f22764c0 = SystemClock.elapsedRealtime();
        if (write < 0) {
            if ((AbstractC1560u.f20190a >= 24 && write == -6) || write == -32) {
                if (k() <= 0) {
                    if (p(this.f22787v)) {
                        if (this.f22785t.f22711c == 1) {
                            this.f22766d0 = true;
                        }
                    }
                }
                r2 = true;
            }
            h hVar = new h(write, this.f22785t.f22709a, r2);
            C0379a c0379a2 = this.f22783r;
            if (c0379a2 != null) {
                c0379a2.v(hVar);
            }
            if (hVar.f22659b) {
                this.f22788w = b.f22641c;
                throw hVar;
            }
            pVar.a(hVar);
            return;
        }
        pVar.f22725a = null;
        pVar.f22726b = -9223372036854775807L;
        pVar.f22727c = -9223372036854775807L;
        if (p(this.f22787v)) {
            if (this.f22742J > 0) {
                this.f22768e0 = false;
            }
            if (this.f22754V && (c0379a = this.f22783r) != null && write < remaining && !this.f22768e0 && (c1798a = ((v) c0379a.f9233b).f1812I) != null) {
                c1798a.f21520a.f21549T = true;
            }
        }
        int i3 = this.f22785t.f22711c;
        if (i3 == 0) {
            this.f22741I += write;
        }
        if (write == remaining) {
            if (i3 != 0) {
                AbstractC1550k.g(this.f22750R == this.f22748P);
                this.f22742J = (this.f22743K * this.f22749Q) + this.f22742J;
            }
            this.f22750R = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r6 = this;
            p0.a r0 = r6.f22786u
            boolean r0 = r0.e()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.e(r1)
            java.nio.ByteBuffer r0 = r6.f22750R
            if (r0 != 0) goto L44
            goto L43
        L14:
            p0.a r0 = r6.f22786u
            boolean r5 = r0.e()
            if (r5 == 0) goto L2e
            boolean r5 = r0.f19605d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.f19605d = r4
            java.util.ArrayList r0 = r0.f19603b
            java.lang.Object r0 = r0.get(r3)
            p0.d r0 = (p0.InterfaceC1480d) r0
            r0.e()
        L2e:
            r6.t(r1)
            p0.a r0 = r6.f22786u
            boolean r0 = r0.d()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r0 = r6.f22750R
            if (r0 == 0) goto L43
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.s.f():boolean");
    }

    public final void g() {
        C1608a c1608a;
        if (o()) {
            this.f22739G = 0L;
            this.f22740H = 0L;
            this.f22741I = 0L;
            this.f22742J = 0L;
            this.f22768e0 = false;
            this.f22743K = 0;
            this.f22734B = new n(this.f22735C, 0L, 0L);
            this.f22746N = 0L;
            this.f22733A = null;
            this.f22773h.clear();
            this.f22748P = null;
            this.f22749Q = 0;
            this.f22750R = null;
            this.f22752T = false;
            this.f22751S = false;
            this.f22753U = false;
            this.f22737E = null;
            this.f22738F = 0;
            this.f22765d.f22830o = 0L;
            C1477a c1477a = this.f22785t.f22717i;
            this.f22786u = c1477a;
            c1477a.b();
            AudioTrack audioTrack = this.f22771g.f22685c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f22787v.pause();
            }
            if (p(this.f22787v)) {
                C1608a c1608a2 = this.f22776k;
                c1608a2.getClass();
                this.f22787v.unregisterStreamEventCallback((r) c1608a2.f20821b);
                ((Handler) c1608a2.f20820a).removeCallbacksAndMessages(null);
            }
            C0313d a3 = this.f22785t.a();
            m mVar = this.f22784s;
            if (mVar != null) {
                this.f22785t = mVar;
                this.f22784s = null;
            }
            k kVar = this.f22771g;
            kVar.d();
            kVar.f22685c = null;
            kVar.f22687e = null;
            if (AbstractC1560u.f20190a >= 24 && (c1608a = this.f22790y) != null) {
                o oVar = (o) c1608a.f20822c;
                oVar.getClass();
                ((AudioTrack) c1608a.f20820a).removeOnRoutingChangedListener(oVar);
                c1608a.f20822c = null;
                this.f22790y = null;
            }
            AudioTrack audioTrack2 = this.f22787v;
            C0379a c0379a = this.f22783r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f22730j0) {
                try {
                    if (f22731k0 == null) {
                        f22731k0 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1559t());
                    }
                    f22732l0++;
                    f22731k0.schedule(new G3.a(10, audioTrack2, c0379a, handler, a3), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f22787v = null;
        }
        p pVar = this.f22778m;
        pVar.f22725a = null;
        pVar.f22726b = -9223372036854775807L;
        pVar.f22727c = -9223372036854775807L;
        p pVar2 = this.f22777l;
        pVar2.f22725a = null;
        pVar2.f22726b = -9223372036854775807L;
        pVar2.f22727c = -9223372036854775807L;
        this.f22772g0 = 0L;
        this.h0 = 0L;
        Handler handler2 = this.f22775i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final d h(C1438m c1438m) {
        int i3;
        boolean booleanValue;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        if (this.f22766d0) {
            return d.f22649d;
        }
        C1428c c1428c = this.f22791z;
        C1590a c1590a = this.f22780o;
        c1590a.getClass();
        c1438m.getClass();
        c1428c.getClass();
        int i10 = AbstractC1560u.f20190a;
        if (i10 < 29 || (i3 = c1438m.f18194D) == -1) {
            return d.f22649d;
        }
        Boolean bool = (Boolean) c1590a.f20575b;
        boolean z2 = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = (Context) c1590a.f20574a;
            if (context != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService(StubApp.getString2(643));
                if (audioManager != null) {
                    String parameters = audioManager.getParameters(StubApp.getString2(24124));
                    c1590a.f20575b = Boolean.valueOf(parameters != null && parameters.equals(StubApp.getString2(24125)));
                } else {
                    c1590a.f20575b = Boolean.FALSE;
                }
            } else {
                c1590a.f20575b = Boolean.FALSE;
            }
            booleanValue = ((Boolean) c1590a.f20575b).booleanValue();
        }
        String str = c1438m.f18216n;
        str.getClass();
        int c10 = AbstractC1405B.c(str, c1438m.f18213k);
        if (c10 == 0 || i10 < AbstractC1560u.o(c10)) {
            return d.f22649d;
        }
        int q10 = AbstractC1560u.q(c1438m.f18193C);
        if (q10 == 0) {
            return d.f22649d;
        }
        try {
            AudioFormat p8 = AbstractC1560u.p(i3, q10, c10);
            if (i10 < 31) {
                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(p8, (AudioAttributes) c1428c.a().f9233b);
                if (!isOffloadedPlaybackSupported) {
                    return d.f22649d;
                }
                C1106a c1106a = new C1106a();
                c1106a.f15434a = true;
                c1106a.f15436c = booleanValue;
                return c1106a.a();
            }
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(p8, (AudioAttributes) c1428c.a().f9233b);
            if (playbackOffloadSupport == 0) {
                return d.f22649d;
            }
            C1106a c1106a2 = new C1106a();
            if (i10 > 32 && playbackOffloadSupport == 2) {
                z2 = true;
            }
            c1106a2.f15434a = true;
            c1106a2.f15435b = z2;
            c1106a2.f15436c = booleanValue;
            return c1106a2.a();
        } catch (IllegalArgumentException unused) {
            return d.f22649d;
        }
    }

    public final int i(C1438m c1438m) {
        q();
        if (StubApp.getString2(76).equals(c1438m.f18216n)) {
            int i3 = c1438m.f18195E;
            if (!AbstractC1560u.F(i3)) {
                AbstractC1482f.p(i3, StubApp.getString2(24126), StubApp.getString2(24116));
                return 0;
            }
            if (i3 != 2) {
                return 1;
            }
        } else if (this.f22788w.d(this.f22791z, c1438m) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        return this.f22785t.f22711c == 0 ? this.f22739G / r0.f22710b : this.f22740H;
    }

    public final long k() {
        m mVar = this.f22785t;
        if (mVar.f22711c != 0) {
            return this.f22742J;
        }
        long j = this.f22741I;
        long j3 = mVar.f22712d;
        int i3 = AbstractC1560u.f20190a;
        return ((j + j3) - 1) / j3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x00b4, code lost:
    
        if (n() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0113, code lost:
    
        if (r10.b() == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03a0, code lost:
    
        if (r5 == 0) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(long r28, java.nio.ByteBuffer r30, int r31) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.s.l(long, java.nio.ByteBuffer, int):boolean");
    }

    public final boolean m() {
        boolean isOffloadedPlayback;
        if (!o()) {
            return false;
        }
        if (AbstractC1560u.f20190a >= 29) {
            isOffloadedPlayback = this.f22787v.isOffloadedPlayback();
            if (isOffloadedPlayback && this.f22753U) {
                return false;
            }
        }
        return this.f22771g.c(k());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.s.n():boolean");
    }

    public final boolean o() {
        return this.f22787v != null;
    }

    public final void q() {
        Context context;
        b b2;
        Q9.c cVar;
        if (this.f22789x != null || (context = this.f22759a) == null) {
            return;
        }
        this.f22770f0 = Looper.myLooper();
        m6.l lVar = new m6.l(context, new C1644e0(this, 16), this.f22791z, this.f22758Z);
        this.f22789x = lVar;
        if (lVar.f17110b) {
            b2 = (b) lVar.f17116h;
            b2.getClass();
        } else {
            lVar.f17110b = true;
            c cVar2 = (c) lVar.f17115g;
            if (cVar2 != null) {
                cVar2.f22646a.registerContentObserver(cVar2.f22647b, false, cVar2);
            }
            int i3 = AbstractC1560u.f20190a;
            Handler handler = lVar.f17109a;
            Context context2 = (Context) lVar.f17111c;
            if (i3 >= 23 && (cVar = (Q9.c) lVar.f17113e) != null) {
                AudioManager audioManager = (AudioManager) context2.getSystemService(StubApp.getString2(643));
                audioManager.getClass();
                audioManager.registerAudioDeviceCallback(cVar, handler);
            }
            b2 = b.b(context2, context2.registerReceiver((R5.f) lVar.f17114f, new IntentFilter(StubApp.getString2(24108)), null, handler), (C1428c) lVar.j, (C0366a) lVar.f17117i);
            lVar.f17116h = b2;
        }
        this.f22788w = b2;
    }

    public final void r() {
        this.f22754V = true;
        if (o()) {
            k kVar = this.f22771g;
            if (kVar.f22705x != -9223372036854775807L) {
                kVar.f22682I.getClass();
                kVar.f22705x = AbstractC1560u.J(SystemClock.elapsedRealtime());
            }
            j jVar = kVar.f22687e;
            jVar.getClass();
            jVar.a();
            this.f22787v.play();
        }
    }

    public final void s() {
        if (this.f22752T) {
            return;
        }
        this.f22752T = true;
        long k3 = k();
        k kVar = this.f22771g;
        kVar.f22707z = kVar.b();
        kVar.f22682I.getClass();
        kVar.f22705x = AbstractC1560u.J(SystemClock.elapsedRealtime());
        kVar.f22674A = k3;
        if (p(this.f22787v)) {
            this.f22753U = false;
        }
        this.f22787v.stop();
        this.f22738F = 0;
    }

    public final void t(long j) {
        ByteBuffer byteBuffer;
        e(j);
        if (this.f22750R != null) {
            return;
        }
        if (!this.f22786u.e()) {
            ByteBuffer byteBuffer2 = this.f22748P;
            if (byteBuffer2 != null) {
                w(byteBuffer2);
                e(j);
                return;
            }
            return;
        }
        while (!this.f22786u.d()) {
            do {
                C1477a c1477a = this.f22786u;
                if (c1477a.e()) {
                    ByteBuffer byteBuffer3 = c1477a.f19604c[c1477a.c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c1477a.f(InterfaceC1480d.f19611a);
                        byteBuffer = c1477a.f19604c[c1477a.c()];
                    }
                } else {
                    byteBuffer = InterfaceC1480d.f19611a;
                }
                if (byteBuffer.hasRemaining()) {
                    w(byteBuffer);
                    e(j);
                } else {
                    ByteBuffer byteBuffer4 = this.f22748P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C1477a c1477a2 = this.f22786u;
                    ByteBuffer byteBuffer5 = this.f22748P;
                    if (c1477a2.e() && !c1477a2.f19605d) {
                        c1477a2.f(byteBuffer5);
                    }
                }
            } while (this.f22750R == null);
            return;
        }
    }

    public final void u() {
        g();
        G listIterator = this.f22767e.listIterator(0);
        while (listIterator.hasNext()) {
            ((InterfaceC1480d) listIterator.next()).reset();
        }
        G listIterator2 = this.f22769f.listIterator(0);
        while (listIterator2.hasNext()) {
            ((InterfaceC1480d) listIterator2.next()).reset();
        }
        C1477a c1477a = this.f22786u;
        if (c1477a != null) {
            int i3 = 0;
            while (true) {
                Z z2 = c1477a.f19602a;
                if (i3 >= z2.f4580d) {
                    break;
                }
                InterfaceC1480d interfaceC1480d = (InterfaceC1480d) z2.get(i3);
                interfaceC1480d.flush();
                interfaceC1480d.reset();
                i3++;
            }
            c1477a.f19604c = new ByteBuffer[0];
            C1478b c1478b = C1478b.f19606e;
            c1477a.f19605d = false;
        }
        this.f22754V = false;
        this.f22766d0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.f22787v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f22735C.f18026a).setPitch(this.f22735C.f18027b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                AbstractC1550k.x(StubApp.getString2(24116), StubApp.getString2(24131), e10);
            }
            C1408E c1408e = new C1408E(this.f22787v.getPlaybackParams().getSpeed(), this.f22787v.getPlaybackParams().getPitch());
            this.f22735C = c1408e;
            k kVar = this.f22771g;
            kVar.f22691i = c1408e.f18026a;
            j jVar = kVar.f22687e;
            if (jVar != null) {
                jVar.a();
            }
            kVar.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.s.w(java.nio.ByteBuffer):void");
    }

    public final boolean x() {
        m mVar = this.f22785t;
        return mVar != null && mVar.j && AbstractC1560u.f20190a >= 23;
    }
}
