package d5;

import a4.f;
import c5.B;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import q4.j;

/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ExecutorC0802b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f13414a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13415b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public j f13416c = f.m(null);

    public ExecutorC0802b(ExecutorService executorService) {
        this.f13414a = executorService;
    }

    public final j a(Runnable runnable) {
        j continueWithTask;
        synchronized (this.f13415b) {
            continueWithTask = this.f13416c.continueWithTask(this.f13414a, new B(runnable, 15));
            this.f13416c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13414a.execute(runnable);
    }
}
