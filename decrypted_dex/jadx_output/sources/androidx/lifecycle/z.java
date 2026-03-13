package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import o.C1402a;
import o.C1403b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class z {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f9939k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static z f9940l;

    /* renamed from: m, reason: collision with root package name */
    public static z f9941m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9942a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final p.f f9943b = new p.f();

    /* renamed from: c, reason: collision with root package name */
    public int f9944c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9945d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f9946e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f9947f;

    /* renamed from: g, reason: collision with root package name */
    public int f9948g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9949h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9950i;
    public final L9.n j;

    public z() {
        Object obj = f9939k;
        this.f9947f = obj;
        this.j = new L9.n(this, 21);
        this.f9946e = obj;
        this.f9948g = -1;
    }

    public static void a(String str) {
        C1402a.Y().f18013c.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(E1.a.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(y yVar) {
        if (this.f9949h) {
            this.f9950i = true;
            return;
        }
        this.f9949h = true;
        do {
            this.f9950i = false;
            if (yVar != null) {
                if (yVar.f9936b) {
                    int i3 = yVar.f9937c;
                    int i10 = this.f9948g;
                    if (i3 < i10) {
                        yVar.f9937c = i10;
                        yVar.f9935a.c(this.f9946e);
                    }
                }
                yVar = null;
            } else {
                p.f fVar = this.f9943b;
                fVar.getClass();
                p.d dVar = new p.d(fVar);
                fVar.f19600c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    y yVar2 = (y) ((Map.Entry) dVar.next()).getValue();
                    if (yVar2.f9936b) {
                        int i11 = yVar2.f9937c;
                        int i12 = this.f9948g;
                        if (i11 < i12) {
                            yVar2.f9937c = i12;
                            yVar2.f9935a.c(this.f9946e);
                        }
                    }
                    if (this.f9950i) {
                        break;
                    }
                }
            }
        } while (this.f9950i);
        this.f9949h = false;
    }

    public final void c(A a3) {
        Object obj;
        a("observeForever");
        y yVar = new y(this, a3);
        p.f fVar = this.f9943b;
        p.c a9 = fVar.a(a3);
        if (a9 != null) {
            obj = a9.f19592b;
        } else {
            p.c cVar = new p.c(a3, yVar);
            fVar.f19601d++;
            p.c cVar2 = fVar.f19599b;
            if (cVar2 == null) {
                fVar.f19598a = cVar;
                fVar.f19599b = cVar;
            } else {
                cVar2.f19593c = cVar;
                cVar.f19594d = cVar2;
                fVar.f19599b = cVar;
            }
            obj = null;
        }
        if (((y) obj) != null) {
            return;
        }
        yVar.a(true);
    }

    public void d(Object obj) {
        boolean z2;
        synchronized (this.f9942a) {
            z2 = this.f9947f == f9939k;
            this.f9947f = obj;
        }
        if (z2) {
            C1402a Y5 = C1402a.Y();
            L9.n nVar = this.j;
            C1403b c1403b = Y5.f18013c;
            if (c1403b.f18016e == null) {
                synchronized (c1403b.f18014c) {
                    try {
                        if (c1403b.f18016e == null) {
                            c1403b.f18016e = Handler.createAsync(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c1403b.f18016e.post(nVar);
        }
    }

    public final void e(A a3) {
        a("removeObserver");
        y yVar = (y) this.f9943b.b(a3);
        if (yVar == null) {
            return;
        }
        yVar.a(false);
    }

    public void f(Object obj) {
        a("setValue");
        this.f9948g++;
        this.f9946e = obj;
        b(null);
    }
}
