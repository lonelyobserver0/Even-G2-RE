package Q0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f5687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A1.a f5688b;

    public a(ExecutorService executorService, A1.a aVar) {
        this.f5687a = executorService;
        this.f5688b = aVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5687a.execute(runnable);
    }
}
