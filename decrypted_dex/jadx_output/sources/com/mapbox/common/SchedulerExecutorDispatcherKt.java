package com.mapbox.common;

import Qb.AbstractC0204k0;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/Scheduler;", "Ljava/util/concurrent/Executor;", "asExecutor", "(Lcom/mapbox/common/Scheduler;)Ljava/util/concurrent/Executor;", "LQb/k0;", "asDispatcher", "(Lcom/mapbox/common/Scheduler;)LQb/k0;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SchedulerExecutorDispatcherKt {
    public static final AbstractC0204k0 asDispatcher(Scheduler scheduler) {
        Intrinsics.checkNotNullParameter(scheduler, "<this>");
        return new SchedulerExecutorDispatcher(asExecutor(scheduler));
    }

    public static final Executor asExecutor(final Scheduler scheduler) {
        Intrinsics.checkNotNullParameter(scheduler, "<this>");
        return new Executor() { // from class: com.mapbox.common.SchedulerExecutorDispatcherKt$asExecutor$1
            @Override // java.util.concurrent.Executor
            public void execute(final Runnable command) {
                Scheduler.this.schedule(new Task() { // from class: com.mapbox.common.SchedulerExecutorDispatcherKt$asExecutor$1$execute$1
                    @Override // com.mapbox.common.Task
                    public void run() {
                        Runnable runnable = command;
                        Intrinsics.checkNotNull(runnable);
                        runnable.run();
                    }
                }, new TaskOptions(0L, TaskPriority.DEFAULT));
            }
        };
    }
}
