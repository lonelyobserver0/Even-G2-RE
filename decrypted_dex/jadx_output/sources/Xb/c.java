package Xb;

import Qb.AbstractC0204k0;
import Qb.C;
import Vb.AbstractC0355a;
import Vb.x;
import com.stub.StubApp;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c extends AbstractC0204k0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final c f8628a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final C f8629b = k.f8644a.limitedParallelism(AbstractC0355a.i(RangesKt.coerceAtLeast(64, x.f7974a), 12, StubApp.getString2(25935)));

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException(StubApp.getString2(25936));
    }

    @Override // Qb.C
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        f8629b.dispatch(coroutineContext, runnable);
    }

    @Override // Qb.C
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        f8629b.dispatchYield(coroutineContext, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // Qb.C
    public final C limitedParallelism(int i3) {
        return k.f8644a.limitedParallelism(i3);
    }

    @Override // Qb.C
    public final String toString() {
        return StubApp.getString2(25937);
    }
}
