package F0;

import Ec.l;
import L0.B;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c1.C0548a;
import com.stub.StubApp;
import java.util.ArrayList;
import o0.C1404A;
import o0.C1438m;
import o0.x;
import o0.y;
import o0.z;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1549j;
import sb.C1644e0;
import v0.AbstractC1810e;
import v0.C1803F;
import v0.C1830z;
import v0.SurfaceHolderCallbackC1827w;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends AbstractC1810e implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public boolean f2184A;

    /* renamed from: B, reason: collision with root package name */
    public long f2185B;

    /* renamed from: C, reason: collision with root package name */
    public C1404A f2186C;

    /* renamed from: D, reason: collision with root package name */
    public long f2187D;

    /* renamed from: t, reason: collision with root package name */
    public final a f2188t;

    /* renamed from: v, reason: collision with root package name */
    public final SurfaceHolderCallbackC1827w f2189v;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f2190w;

    /* renamed from: x, reason: collision with root package name */
    public final C0548a f2191x;

    /* renamed from: y, reason: collision with root package name */
    public l f2192y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2193z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w, Looper looper) {
        super(5);
        a aVar = a.f2183a;
        this.f2189v = surfaceHolderCallbackC1827w;
        this.f2190w = looper == null ? null : new Handler(looper, this);
        this.f2188t = aVar;
        this.f2191x = new C0548a(1);
        this.f2187D = -9223372036854775807L;
    }

    @Override // v0.AbstractC1810e
    public final int B(C1438m c1438m) {
        if (this.f2188t.b(c1438m)) {
            return AbstractC1810e.f(c1438m.f18202L == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC1810e.f(0, 0, 0, 0);
    }

    public final void D(C1404A c1404a, ArrayList arrayList) {
        int i3 = 0;
        while (true) {
            z[] zVarArr = c1404a.f18017a;
            if (i3 >= zVarArr.length) {
                return;
            }
            C1438m a3 = zVarArr[i3].a();
            if (a3 != null) {
                a aVar = this.f2188t;
                if (aVar.b(a3)) {
                    l a9 = aVar.a(a3);
                    byte[] c10 = zVarArr[i3].c();
                    c10.getClass();
                    C0548a c0548a = this.f2191x;
                    c0548a.s();
                    c0548a.u(c10.length);
                    c0548a.f21396e.put(c10);
                    c0548a.v();
                    C1404A h2 = a9.h(c0548a);
                    if (h2 != null) {
                        D(h2, arrayList);
                    }
                    i3++;
                }
            }
            arrayList.add(zVarArr[i3]);
            i3++;
        }
    }

    public final long E(long j) {
        AbstractC1550k.g(j != -9223372036854775807L);
        AbstractC1550k.g(this.f2187D != -9223372036854775807L);
        return j - this.f2187D;
    }

    public final void F(C1404A c1404a) {
        SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w = this.f2189v;
        C1830z c1830z = surfaceHolderCallbackC1827w.f21810a;
        x a3 = c1830z.f21859u0.a();
        int i3 = 0;
        while (true) {
            z[] zVarArr = c1404a.f18017a;
            if (i3 >= zVarArr.length) {
                break;
            }
            zVarArr[i3].b(a3);
            i3++;
        }
        c1830z.f21859u0 = new y(a3);
        y l9 = c1830z.l();
        boolean equals = l9.equals(c1830z.f21828R);
        C1549j c1549j = c1830z.f21844m;
        if (!equals) {
            c1830z.f21828R = l9;
            c1549j.c(14, new C1644e0(surfaceHolderCallbackC1827w, 8));
        }
        c1549j.c(28, new C1644e0(c1404a, 9));
        c1549j.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        F((C1404A) message.obj);
        return true;
    }

    @Override // v0.AbstractC1810e
    public final String j() {
        return StubApp.getString2(2008);
    }

    @Override // v0.AbstractC1810e
    public final boolean l() {
        return this.f2184A;
    }

    @Override // v0.AbstractC1810e
    public final boolean n() {
        return true;
    }

    @Override // v0.AbstractC1810e
    public final void o() {
        this.f2186C = null;
        this.f2192y = null;
        this.f2187D = -9223372036854775807L;
    }

    @Override // v0.AbstractC1810e
    public final void q(long j, boolean z2) {
        this.f2186C = null;
        this.f2193z = false;
        this.f2184A = false;
    }

    @Override // v0.AbstractC1810e
    public final void v(C1438m[] c1438mArr, long j, long j3, B b2) {
        this.f2192y = this.f2188t.a(c1438mArr[0]);
        C1404A c1404a = this.f2186C;
        if (c1404a != null) {
            long j10 = this.f2187D;
            long j11 = c1404a.f18018b;
            long j12 = (j10 + j11) - j3;
            if (j11 != j12) {
                c1404a = new C1404A(j12, c1404a.f18017a);
            }
            this.f2186C = c1404a;
        }
        this.f2187D = j3;
    }

    @Override // v0.AbstractC1810e
    public final void x(long j, long j3) {
        boolean z2 = true;
        while (z2) {
            if (!this.f2193z && this.f2186C == null) {
                C0548a c0548a = this.f2191x;
                c0548a.s();
                C1803F c1803f = this.f21718c;
                c1803f.c();
                int w10 = w(c1803f, c0548a, 0);
                if (w10 == -4) {
                    if (c0548a.k(4)) {
                        this.f2193z = true;
                    } else if (c0548a.f21398g >= this.f21726m) {
                        c0548a.f10777k = this.f2185B;
                        c0548a.v();
                        l lVar = this.f2192y;
                        int i3 = AbstractC1560u.f20190a;
                        C1404A h2 = lVar.h(c0548a);
                        if (h2 != null) {
                            ArrayList arrayList = new ArrayList(h2.f18017a.length);
                            D(h2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f2186C = new C1404A(E(c0548a.f21398g), (z[]) arrayList.toArray(new z[0]));
                            }
                        }
                    }
                } else if (w10 == -5) {
                    C1438m c1438m = (C1438m) c1803f.f21582b;
                    c1438m.getClass();
                    this.f2185B = c1438m.f18221s;
                }
            }
            C1404A c1404a = this.f2186C;
            if (c1404a == null || c1404a.f18018b > E(j)) {
                z2 = false;
            } else {
                C1404A c1404a2 = this.f2186C;
                Handler handler = this.f2190w;
                if (handler != null) {
                    handler.obtainMessage(1, c1404a2).sendToTarget();
                } else {
                    F(c1404a2);
                }
                this.f2186C = null;
                z2 = true;
            }
            if (this.f2193z && this.f2186C == null) {
                this.f2184A = true;
            }
        }
    }
}
