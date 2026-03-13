package Za;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f9188a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f9189b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f9190c = new AtomicBoolean(false);

    public m(ExecutorService executorService) {
        this.f9188a = executorService;
    }

    @Override // Za.h
    public final void a(e eVar) {
        this.f9189b.add(eVar);
        this.f9188a.execute(new l(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.f9188a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f9189b;
        AtomicBoolean atomicBoolean = this.f9190c;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    executorService.execute(new l(this, 1));
                }
            }
        }
    }
}
