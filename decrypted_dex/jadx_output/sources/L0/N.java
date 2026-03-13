package L0;

import android.net.Uri;
import com.stub.StubApp;
import g1.C0951b;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import m1.C1268d;
import r0.AbstractC1550k;
import t0.C1711k;
import t0.C1725y;
import t0.InterfaceC1708h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class N implements P0.l {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3921a;

    /* renamed from: b, reason: collision with root package name */
    public final C1725y f3922b;

    /* renamed from: c, reason: collision with root package name */
    public final Q2.g f3923c;

    /* renamed from: d, reason: collision with root package name */
    public final Q f3924d;

    /* renamed from: e, reason: collision with root package name */
    public final R4.b f3925e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f3927g;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public C1711k f3929k;

    /* renamed from: l, reason: collision with root package name */
    public T0.H f3930l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3931m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q f3932n;

    /* renamed from: f, reason: collision with root package name */
    public final T0.s f3926f = new T0.s();

    /* renamed from: h, reason: collision with root package name */
    public boolean f3928h = true;

    public N(Q q10, Uri uri, InterfaceC1708h interfaceC1708h, Q2.g gVar, Q q11, R4.b bVar) {
        this.f3932n = q10;
        this.f3921a = uri;
        this.f3922b = new C1725y(interfaceC1708h);
        this.f3923c = gVar;
        this.f3924d = q11;
        this.f3925e = bVar;
        C0123t.f4129c.getAndIncrement();
        this.f3929k = a(0L);
    }

    public final C1711k a(long j) {
        Map map = Collections.EMPTY_MAP;
        this.f3932n.getClass();
        Map map2 = Q.h0;
        Uri uri = this.f3921a;
        AbstractC1550k.i(uri, StubApp.getString2(505));
        return new C1711k(uri, 1, null, map2, j, -1L, null, 6);
    }

    @Override // P0.l
    public final void l() {
        InterfaceC1708h interfaceC1708h;
        T0.o oVar;
        int i3;
        int i10 = 0;
        while (i10 == 0 && !this.f3927g) {
            try {
                long j = this.f3926f.f7043a;
                C1711k a3 = a(j);
                this.f3929k = a3;
                long n10 = this.f3922b.n(a3);
                if (this.f3927g) {
                    if (i10 != 1 && this.f3923c.B() != -1) {
                        this.f3926f.f7043a = this.f3923c.B();
                    }
                    W.a.a(this.f3922b);
                    return;
                }
                if (n10 != -1) {
                    n10 += j;
                    Q q10 = this.f3932n;
                    q10.f3971s.post(new L(q10, 0));
                }
                long j3 = n10;
                this.f3932n.f3973v = C0951b.d(this.f3922b.f21123a.s());
                C1725y c1725y = this.f3922b;
                C0951b c0951b = this.f3932n.f3973v;
                if (c0951b == null || (i3 = c0951b.f14210f) == -1) {
                    interfaceC1708h = c1725y;
                } else {
                    interfaceC1708h = new C0122s(c1725y, i3, this);
                    Q q11 = this.f3932n;
                    q11.getClass();
                    T0.H B7 = q11.B(new P(0, true));
                    this.f3930l = B7;
                    B7.d(Q.f3937k0);
                }
                this.f3923c.G(interfaceC1708h, this.f3921a, this.f3922b.f21123a.s(), j, j3, this.f3924d);
                if (this.f3932n.f3973v != null && (oVar = (T0.o) this.f3923c.f5712c) != null && (oVar instanceof C1268d)) {
                    ((C1268d) oVar).f17035r = true;
                }
                if (this.f3928h) {
                    Q2.g gVar = this.f3923c;
                    long j10 = this.j;
                    T0.o oVar2 = (T0.o) gVar.f5712c;
                    oVar2.getClass();
                    oVar2.b(j, j10);
                    this.f3928h = false;
                }
                while (i10 == 0 && !this.f3927g) {
                    try {
                        R4.b bVar = this.f3925e;
                        synchronized (bVar) {
                            while (!bVar.f6177b) {
                                bVar.wait();
                            }
                        }
                        Q2.g gVar2 = this.f3923c;
                        T0.s sVar = this.f3926f;
                        T0.o oVar3 = (T0.o) gVar2.f5712c;
                        oVar3.getClass();
                        T0.l lVar = (T0.l) gVar2.f5713d;
                        lVar.getClass();
                        i10 = oVar3.c(lVar, sVar);
                        long B9 = this.f3923c.B();
                        if (B9 > this.f3932n.j + j) {
                            R4.b bVar2 = this.f3925e;
                            synchronized (bVar2) {
                                bVar2.f6177b = false;
                            }
                            Q q12 = this.f3932n;
                            q12.f3971s.post(q12.f3970r);
                            j = B9;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.f3923c.B() != -1) {
                    this.f3926f.f7043a = this.f3923c.B();
                }
                W.a.a(this.f3922b);
            } catch (Throwable th) {
                if (i10 != 1 && this.f3923c.B() != -1) {
                    this.f3926f.f7043a = this.f3923c.B();
                }
                W.a.a(this.f3922b);
                throw th;
            }
        }
    }

    @Override // P0.l
    public final void o() {
        this.f3927g = true;
    }
}
