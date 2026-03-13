package com.mapbox.common;

import Qb.AbstractC0204k0;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/mapbox/common/SchedulerExecutorDispatcher;", "LQb/k0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "close", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SchedulerExecutorDispatcher extends AbstractC0204k0 {
    private final Executor executor;

    public SchedulerExecutorDispatcher(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // Qb.C
    public void dispatch(CoroutineContext context, Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        getExecutor().execute(block);
    }

    public Executor getExecutor() {
        return this.executor;
    }
}
