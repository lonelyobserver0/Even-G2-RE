package kotlin.concurrent;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a\u001a\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001\u001aO\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aM\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aO\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aM\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a'\u0010\u0015\u001a\u00020\u00012\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"schedule", "Ljava/util/TimerTask;", "Ljava/util/Timer;", "delay", "", "action", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "time", "Ljava/util/Date;", "period", "scheduleAtFixedRate", "timer", "name", "", "daemon", "", "initialDelay", "startAt", "fixedRateTimer", "timerTask", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName(name = "TimersKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class TimersKt {
    @InlineOnly
    private static final Timer fixedRateTimer(String str, boolean z2, long j, long j3, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.scheduleAtFixedRate(new TimersKt$timerTask$1(action), j, j3);
        return timer;
    }

    public static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z2, long j, long j3, Function1 action, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = null;
        }
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            j = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.scheduleAtFixedRate(new TimersKt$timerTask$1(action), j, j3);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, long j, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, j);
        return timersKt$timerTask$1;
    }

    @InlineOnly
    private static final TimerTask scheduleAtFixedRate(Timer timer, long j, long j3, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.scheduleAtFixedRate(timersKt$timerTask$1, j, j3);
        return timersKt$timerTask$1;
    }

    @PublishedApi
    public static final Timer timer(String str, boolean z2) {
        return str == null ? new Timer(z2) : new Timer(str, z2);
    }

    public static /* synthetic */ Timer timer$default(String str, boolean z2, long j, long j3, Function1 action, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = null;
        }
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            j = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.schedule(new TimersKt$timerTask$1(action), j, j3);
        return timer;
    }

    @InlineOnly
    private static final TimerTask timerTask(Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new TimersKt$timerTask$1(action);
    }

    @InlineOnly
    private static final Timer timer(String str, boolean z2, long j, long j3, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.schedule(new TimersKt$timerTask$1(action), j, j3);
        return timer;
    }

    @InlineOnly
    private static final Timer fixedRateTimer(String str, boolean z2, Date startAt, long j, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.scheduleAtFixedRate(new TimersKt$timerTask$1(action), startAt, j);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, Date time, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, time);
        return timersKt$timerTask$1;
    }

    @InlineOnly
    private static final TimerTask scheduleAtFixedRate(Timer timer, Date time, long j, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.scheduleAtFixedRate(timersKt$timerTask$1, time, j);
        return timersKt$timerTask$1;
    }

    public static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z2, Date startAt, long j, Function1 action, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = null;
        }
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.scheduleAtFixedRate(new TimersKt$timerTask$1(action), startAt, j);
        return timer;
    }

    @InlineOnly
    private static final Timer timer(String str, boolean z2, Date startAt, long j, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.schedule(new TimersKt$timerTask$1(action), startAt, j);
        return timer;
    }

    public static /* synthetic */ Timer timer$default(String str, boolean z2, Date startAt, long j, Function1 action, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = null;
        }
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.schedule(new TimersKt$timerTask$1(action), startAt, j);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, long j, long j3, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, j, j3);
        return timersKt$timerTask$1;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, Date time, long j, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, time, j);
        return timersKt$timerTask$1;
    }
}
