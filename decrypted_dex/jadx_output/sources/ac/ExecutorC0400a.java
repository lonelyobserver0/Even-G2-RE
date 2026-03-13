package ac;

import java.util.concurrent.Executor;

/* renamed from: ac.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class ExecutorC0400a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorC0400a f9348a = new ExecutorC0400a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
