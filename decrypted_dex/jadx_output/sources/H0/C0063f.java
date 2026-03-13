package H0;

import android.os.Handler;
import r0.AbstractC1560u;

/* renamed from: H0.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0063f implements P0.l {

    /* renamed from: a, reason: collision with root package name */
    public final int f2543a;

    /* renamed from: b, reason: collision with root package name */
    public final x f2544b;

    /* renamed from: c, reason: collision with root package name */
    public final C2.d f2545c;

    /* renamed from: d, reason: collision with root package name */
    public final Z9.C f2546d;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0061d f2548f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0062e f2549g;

    /* renamed from: h, reason: collision with root package name */
    public C0064g f2550h;
    public T0.l j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f2551k;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f2553m;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f2547e = AbstractC1560u.m(null);

    /* renamed from: l, reason: collision with root package name */
    public volatile long f2552l = -9223372036854775807L;

    public C0063f(int i3, x xVar, C2.d dVar, Z9.C c10, InterfaceC0061d interfaceC0061d) {
        this.f2543a = i3;
        this.f2544b = xVar;
        this.f2545c = dVar;
        this.f2546d = c10;
        this.f2548f = interfaceC0061d;
    }

    @Override // P0.l
    public final void l() {
        if (this.f2551k) {
            this.f2551k = false;
        }
        try {
            if (this.f2549g == null) {
                InterfaceC0062e e10 = this.f2548f.e(this.f2543a);
                this.f2549g = e10;
                this.f2547e.post(new Ab.c(this, e10.c(), this.f2549g, 3));
                InterfaceC0062e interfaceC0062e = this.f2549g;
                interfaceC0062e.getClass();
                this.j = new T0.l(interfaceC0062e, 0L, -1L);
                C0064g c0064g = new C0064g(this.f2544b.f2656a, this.f2543a);
                this.f2550h = c0064g;
                c0064g.f(this.f2546d);
            }
            while (!this.f2551k) {
                if (this.f2552l != -9223372036854775807L) {
                    C0064g c0064g2 = this.f2550h;
                    c0064g2.getClass();
                    c0064g2.b(this.f2553m, this.f2552l);
                    this.f2552l = -9223372036854775807L;
                }
                C0064g c0064g3 = this.f2550h;
                c0064g3.getClass();
                T0.l lVar = this.j;
                lVar.getClass();
                if (c0064g3.c(lVar, new T0.s()) == -1) {
                    break;
                }
            }
            this.f2551k = false;
            InterfaceC0062e interfaceC0062e2 = this.f2549g;
            interfaceC0062e2.getClass();
            if (interfaceC0062e2.h()) {
                W.a.a(this.f2549g);
                this.f2549g = null;
            }
        } catch (Throwable th) {
            InterfaceC0062e interfaceC0062e3 = this.f2549g;
            interfaceC0062e3.getClass();
            if (interfaceC0062e3.h()) {
                W.a.a(this.f2549g);
                this.f2549g = null;
            }
            throw th;
        }
    }

    @Override // P0.l
    public final void o() {
        this.f2551k = true;
    }
}
