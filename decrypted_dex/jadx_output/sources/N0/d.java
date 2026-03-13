package N0;

import L0.B;
import L0.Z;
import M4.I;
import V8.C0352d;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import l4.C1145A;
import l4.C1221y;
import o0.AbstractC1405B;
import o0.C1438m;
import q1.e;
import q1.i;
import r0.AbstractC1550k;
import sb.C1644e0;
import v0.AbstractC1810e;
import v0.C1803F;
import v0.C1830z;
import v0.SurfaceHolderCallbackC1827w;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends AbstractC1810e implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public e f4816A;

    /* renamed from: B, reason: collision with root package name */
    public i f4817B;

    /* renamed from: C, reason: collision with root package name */
    public q1.c f4818C;

    /* renamed from: D, reason: collision with root package name */
    public q1.c f4819D;

    /* renamed from: E, reason: collision with root package name */
    public int f4820E;

    /* renamed from: F, reason: collision with root package name */
    public final Handler f4821F;

    /* renamed from: G, reason: collision with root package name */
    public final SurfaceHolderCallbackC1827w f4822G;

    /* renamed from: H, reason: collision with root package name */
    public final C1803F f4823H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f4824I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4825K;

    /* renamed from: L, reason: collision with root package name */
    public C1438m f4826L;

    /* renamed from: O, reason: collision with root package name */
    public long f4827O;

    /* renamed from: P, reason: collision with root package name */
    public long f4828P;

    /* renamed from: R, reason: collision with root package name */
    public IOException f4829R;

    /* renamed from: t, reason: collision with root package name */
    public final C1221y f4830t;

    /* renamed from: v, reason: collision with root package name */
    public final u0.e f4831v;

    /* renamed from: w, reason: collision with root package name */
    public a f4832w;

    /* renamed from: x, reason: collision with root package name */
    public final A0.c f4833x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4834y;

    /* renamed from: z, reason: collision with root package name */
    public int f4835z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w, Looper looper) {
        super(3);
        A0.c cVar = c.f4815u;
        this.f4822G = surfaceHolderCallbackC1827w;
        this.f4821F = looper == null ? null : new Handler(looper, this);
        this.f4833x = cVar;
        this.f4830t = new C1221y(22);
        this.f4831v = new u0.e(1);
        this.f4823H = new C1803F();
        this.f4828P = -9223372036854775807L;
        this.f4827O = -9223372036854775807L;
    }

    @Override // v0.AbstractC1810e
    public final int B(C1438m c1438m) {
        if (!Objects.equals(c1438m.f18216n, StubApp.getString2(462))) {
            A0.c cVar = this.f4833x;
            cVar.getClass();
            if (!((C1145A) cVar.f29a).c(c1438m)) {
                String str = c1438m.f18216n;
                if (!Objects.equals(str, StubApp.getString2(467)) && !Objects.equals(str, StubApp.getString2(3654)) && !Objects.equals(str, StubApp.getString2(503))) {
                    return AbstractC1405B.k(str) ? AbstractC1810e.f(1, 0, 0, 0) : AbstractC1810e.f(0, 0, 0, 0);
                }
            }
        }
        return AbstractC1810e.f(c1438m.f18202L == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void D() {
        AbstractC1550k.f(StubApp.getString2(3655) + this.f4826L.f18216n + StubApp.getString2(3656), Objects.equals(this.f4826L.f18216n, StubApp.getString2(467)) || Objects.equals(this.f4826L.f18216n, StubApp.getString2(3654)) || Objects.equals(this.f4826L.f18216n, StubApp.getString2(503)));
    }

    public final long E() {
        if (this.f4820E == -1) {
            return LongCompanionObject.MAX_VALUE;
        }
        this.f4818C.getClass();
        return this.f4820E >= this.f4818C.g() ? LongCompanionObject.MAX_VALUE : this.f4818C.e(this.f4820E);
    }

    public final long F(long j) {
        AbstractC1550k.g(j != -9223372036854775807L);
        return j - this.f21725l;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r3.equals(com.stub.StubApp.getString2(467)) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            r7 = this;
            r0 = 1
            r7.f4834y = r0
            o0.m r1 = r7.f4826L
            r1.getClass()
            A0.c r2 = r7.f4833x
            r2.getClass()
            java.lang.String r3 = r1.f18216n
            if (r3 == 0) goto L5c
            int r4 = r1.f18198H
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L3b;
                case 1566015601: goto L2d;
                case 1566016562: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = r5
            goto L4a
        L1d:
            r0 = 503(0x1f7, float:7.05E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2b
            goto L1b
        L2b:
            r0 = 2
            goto L4a
        L2d:
            r6 = 467(0x1d3, float:6.54E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L4a
            goto L1b
        L3b:
            r0 = 3654(0xe46, float:5.12E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L49
            goto L1b
        L49:
            r0 = 0
        L4a:
            switch(r0) {
                case 0: goto L56;
                case 1: goto L56;
                case 2: goto L4e;
                default: goto L4d;
            }
        L4d:
            goto L5c
        L4e:
            r1.f r0 = new r1.f
            java.util.List r1 = r1.f18219q
            r0.<init>(r4, r1)
            goto L82
        L56:
            r1.c r0 = new r1.c
            r0.<init>(r3, r4)
            goto L82
        L5c:
            java.lang.Object r0 = r2.f29a
            l4.A r0 = (l4.C1145A) r0
            boolean r2 = r0.c(r1)
            if (r2 == 0) goto L8a
            q1.l r0 = r0.e(r1)
            D0.b r1 = new D0.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r3 = 3657(0xe49, float:5.125E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L82:
            r7.f4816A = r0
            long r1 = r7.f21726m
            r0.b(r1)
            return
        L8a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 2007(0x7d7, float:2.812E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r1 = E1.a.j(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.d.G():void");
    }

    public final void H(q0.c cVar) {
        I i3 = cVar.f19861a;
        SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w = this.f4822G;
        surfaceHolderCallbackC1827w.f21810a.f21844m.e(27, new C0352d(1, i3));
        C1830z c1830z = surfaceHolderCallbackC1827w.f21810a;
        c1830z.getClass();
        c1830z.f21844m.e(27, new C1644e0(cVar, 7));
    }

    public final void I() {
        this.f4817B = null;
        this.f4820E = -1;
        q1.c cVar = this.f4818C;
        if (cVar != null) {
            cVar.t();
            this.f4818C = null;
        }
        q1.c cVar2 = this.f4819D;
        if (cVar2 != null) {
            cVar2.t();
            this.f4819D = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        H((q0.c) message.obj);
        return true;
    }

    @Override // v0.AbstractC1810e
    public final String j() {
        return StubApp.getString2(3658);
    }

    @Override // v0.AbstractC1810e
    public final boolean l() {
        return this.f4825K;
    }

    @Override // v0.AbstractC1810e
    public final boolean n() {
        if (this.f4826L != null) {
            if (this.f4829R == null) {
                try {
                    Z z2 = this.j;
                    z2.getClass();
                    z2.a();
                } catch (IOException e10) {
                    this.f4829R = e10;
                }
            }
            if (this.f4829R != null) {
                C1438m c1438m = this.f4826L;
                c1438m.getClass();
                if (Objects.equals(c1438m.f18216n, StubApp.getString2(462))) {
                    a aVar = this.f4832w;
                    aVar.getClass();
                    return aVar.a(this.f4827O) != Long.MIN_VALUE;
                }
                if (!this.f4825K) {
                    if (this.f4824I) {
                        q1.c cVar = this.f4818C;
                        long j = this.f4827O;
                        if (cVar == null || cVar.e(cVar.g() - 1) <= j) {
                            q1.c cVar2 = this.f4819D;
                            long j3 = this.f4827O;
                            if ((cVar2 == null || cVar2.e(cVar2.g() - 1) <= j3) && this.f4817B != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // v0.AbstractC1810e
    public final void o() {
        this.f4826L = null;
        this.f4828P = -9223372036854775807L;
        M4.Z z2 = M4.Z.f4578e;
        F(this.f4827O);
        q0.c cVar = new q0.c(z2);
        Handler handler = this.f4821F;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            H(cVar);
        }
        this.f4827O = -9223372036854775807L;
        if (this.f4816A != null) {
            I();
            e eVar = this.f4816A;
            eVar.getClass();
            eVar.release();
            this.f4816A = null;
            this.f4835z = 0;
        }
    }

    @Override // v0.AbstractC1810e
    public final void q(long j, boolean z2) {
        this.f4827O = j;
        a aVar = this.f4832w;
        if (aVar != null) {
            aVar.clear();
        }
        M4.Z z10 = M4.Z.f4578e;
        F(this.f4827O);
        q0.c cVar = new q0.c(z10);
        Handler handler = this.f4821F;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            H(cVar);
        }
        this.f4824I = false;
        this.f4825K = false;
        this.f4828P = -9223372036854775807L;
        C1438m c1438m = this.f4826L;
        if (c1438m == null || Objects.equals(c1438m.f18216n, StubApp.getString2(462))) {
            return;
        }
        if (this.f4835z == 0) {
            I();
            e eVar = this.f4816A;
            eVar.getClass();
            eVar.flush();
            eVar.b(this.f21726m);
            return;
        }
        I();
        e eVar2 = this.f4816A;
        eVar2.getClass();
        eVar2.release();
        this.f4816A = null;
        this.f4835z = 0;
        G();
    }

    @Override // v0.AbstractC1810e
    public final void v(C1438m[] c1438mArr, long j, long j3, B b2) {
        C1438m c1438m = c1438mArr[0];
        this.f4826L = c1438m;
        if (Objects.equals(c1438m.f18216n, StubApp.getString2(462))) {
            this.f4832w = this.f4826L.f18199I == 1 ? new b() : new Bb.a(1);
            return;
        }
        D();
        if (this.f4816A != null) {
            this.f4835z = 1;
        } else {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0259 A[EXC_TOP_SPLITTER, LOOP:2: B:99:0x0259->B:120:0x0259, LOOP_START, SYNTHETIC] */
    @Override // v0.AbstractC1810e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.d.x(long, long):void");
    }
}
