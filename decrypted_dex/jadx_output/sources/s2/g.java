package s2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l4.O0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f20716b;

    /* renamed from: d, reason: collision with root package name */
    public volatile Runnable f20718d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f20715a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Object f20717c = new Object();

    public g(ExecutorService executorService) {
        this.f20716b = executorService;
    }

    public final void a() {
        synchronized (this.f20717c) {
            try {
                Runnable runnable = (Runnable) this.f20715a.poll();
                this.f20718d = runnable;
                if (runnable != null) {
                    this.f20716b.execute(this.f20718d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f20717c) {
            try {
                this.f20715a.add(new O0(17, this, runnable));
                if (this.f20718d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
