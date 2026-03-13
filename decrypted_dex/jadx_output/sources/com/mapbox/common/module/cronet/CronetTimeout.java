package com.mapbox.common.module.cronet;

import com.mapbox.common.Scheduler;
import com.mapbox.common.Task;
import com.mapbox.common.TaskOptions;
import com.mapbox.common.TaskPriority;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mapbox/common/module/cronet/CronetTimeout;", "Lcom/mapbox/common/Task;", "sequencedScheduler", "Lcom/mapbox/common/Scheduler;", "timeoutSeconds", "", "action", "(Lcom/mapbox/common/Scheduler;JLcom/mapbox/common/Task;)V", "deadline", "Ljava/util/concurrent/atomic/AtomicLong;", "timeout", "cancel", "", "resetDeadline", "run", "scheduleCallback", "options", "Lcom/mapbox/common/TaskOptions;", "start", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CronetTimeout implements Task {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final TaskOptions DEFAULT_TIMEOUT_TASK_OPTIONS = new TaskOptions(60000, TaskPriority.DEFAULT);
    private final Task action;
    private AtomicLong deadline;
    private final Scheduler sequencedScheduler;
    private final long timeout;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/module/cronet/CronetTimeout$Companion;", "", "()V", "DEFAULT_TIMEOUT_TASK_OPTIONS", "Lcom/mapbox/common/TaskOptions;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CronetTimeout(Scheduler sequencedScheduler, long j, Task action) {
        Intrinsics.checkNotNullParameter(sequencedScheduler, "sequencedScheduler");
        Intrinsics.checkNotNullParameter(action, "action");
        this.sequencedScheduler = sequencedScheduler;
        this.action = action;
        this.deadline = new AtomicLong(-1L);
        this.timeout = j * 1000;
    }

    private final void scheduleCallback(TaskOptions options) {
        this.sequencedScheduler.schedule(this, options);
    }

    public final void cancel() {
        this.deadline.set(-1L);
    }

    public final void resetDeadline() {
        long nowMilliseconds;
        AtomicLong atomicLong = this.deadline;
        nowMilliseconds = CronetTimeoutKt.nowMilliseconds();
        atomicLong.set(nowMilliseconds + this.timeout);
    }

    @Override // com.mapbox.common.Task
    public void run() {
        long nowMilliseconds;
        long j = this.deadline.get();
        if (j == -1) {
            return;
        }
        nowMilliseconds = CronetTimeoutKt.nowMilliseconds();
        if (j <= nowMilliseconds) {
            this.action.run();
        } else {
            scheduleCallback(new TaskOptions(j - nowMilliseconds, TaskPriority.DEFAULT));
        }
    }

    public final void start() {
        resetDeadline();
        long j = this.timeout;
        TaskOptions taskOptions = DEFAULT_TIMEOUT_TASK_OPTIONS;
        if (j != taskOptions.getDelay()) {
            taskOptions = new TaskOptions(this.timeout, TaskPriority.DEFAULT);
        }
        scheduleCallback(taskOptions);
    }
}
