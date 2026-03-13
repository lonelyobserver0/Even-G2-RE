package v0;

import android.os.Looper;
import android.os.SystemClock;
import com.stub.StubApp;
import java.util.concurrent.TimeoutException;
import o0.AbstractC1416M;
import r0.AbstractC1550k;
import r0.C1555p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1810e f21677a;

    /* renamed from: b, reason: collision with root package name */
    public final X f21678b;

    /* renamed from: c, reason: collision with root package name */
    public final C1555p f21679c;

    /* renamed from: d, reason: collision with root package name */
    public int f21680d;

    /* renamed from: e, reason: collision with root package name */
    public Object f21681e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f21682f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21683g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21684h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21685i;

    public Z(X x7, AbstractC1810e abstractC1810e, AbstractC1416M abstractC1416M, int i3, C1555p c1555p, Looper looper) {
        this.f21678b = x7;
        this.f21677a = abstractC1810e;
        this.f21682f = looper;
        this.f21679c = c1555p;
    }

    public final synchronized void a(long j) {
        boolean z2;
        AbstractC1550k.g(this.f21683g);
        AbstractC1550k.g(this.f21682f.getThread() != Thread.currentThread());
        this.f21679c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z2 = this.f21685i;
            if (z2 || j <= 0) {
                break;
            }
            this.f21679c.getClass();
            wait(j);
            this.f21679c.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z2) {
            throw new TimeoutException(StubApp.getString2("23617"));
        }
    }

    public final synchronized void b(boolean z2) {
        this.f21684h = z2 | this.f21684h;
        this.f21685i = true;
        notifyAll();
    }

    public final void c() {
        AbstractC1550k.g(!this.f21683g);
        this.f21683g = true;
        C1802E c1802e = (C1802E) this.f21678b;
        synchronized (c1802e) {
            if (!c1802e.f21540F && c1802e.f21563l.getThread().isAlive()) {
                c1802e.j.a(14, this).b();
                return;
            }
            AbstractC1550k.w(StubApp.getString2("10086"), StubApp.getString2("23618"));
            b(false);
        }
    }
}
