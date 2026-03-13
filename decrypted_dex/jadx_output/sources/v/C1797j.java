package v;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1797j implements Q4.c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f21518a;

    /* renamed from: b, reason: collision with root package name */
    public final C1796i f21519b = new C1796i(this);

    public C1797j(C1795h c1795h) {
        this.f21518a = new WeakReference(c1795h);
    }

    @Override // Q4.c
    public final void a(Runnable runnable, Executor executor) {
        this.f21519b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        C1795h c1795h = (C1795h) this.f21518a.get();
        boolean cancel = this.f21519b.cancel(z2);
        if (cancel && c1795h != null) {
            c1795h.f21513a = null;
            c1795h.f21514b = null;
            c1795h.f21515c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f21519b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21519b.f21510a instanceof C1788a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f21519b.isDone();
    }

    public final String toString() {
        return this.f21519b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f21519b.get(j, timeUnit);
    }
}
