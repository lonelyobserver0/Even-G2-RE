package com.mapbox.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J,\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0007J,\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mapbox/common/LifecycleUtils;", "", "()V", "TAG", "", "threadPool", "Ljava/util/concurrent/ExecutorService;", "getAppLifecycleStateFromActivityManager", "Lcom/mapbox/common/LifecycleState;", "context", "Landroid/content/Context;", "buildVersion", "", "getAppStateLollipopAndHigher", "getAppStatePreLollipop", "getAppStateQAndHigher", "getLifecycleState", "", "looper", "Landroid/os/Looper;", "callback", "Lkotlin/Function1;", "hasServiceRunningInForeground", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LifecycleUtils {
    private static ExecutorService threadPool;
    private static final String TAG = StubApp.getString2(13360);
    public static final LifecycleUtils INSTANCE = new LifecycleUtils();

    static {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(1)");
        threadPool = newFixedThreadPool;
    }

    private LifecycleUtils() {
    }

    private final LifecycleState getAppStateLollipopAndHigher(Context context) {
        Object m40constructorimpl;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(StubApp.getString2(2680));
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        LifecycleState lifecycleState = LifecycleState.BACKGROUND;
        for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                if (appTask.getTaskInfo().id != -1) {
                    lifecycleState = LifecycleState.FOREGROUND;
                }
                m40constructorimpl = Result.m40constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(m40constructorimpl);
            if (m43exceptionOrNullimpl != null) {
                Log.error(StubApp.getString2(13361) + m43exceptionOrNullimpl, StubApp.getString2(13360));
            }
        }
        return lifecycleState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        r4 = r4.topActivity;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.mapbox.common.LifecycleState getAppStatePreLollipop(android.content.Context r8) {
        /*
            r7 = this;
            r0 = 2680(0xa78, float:3.755E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.Object r0 = r8.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L92
            android.content.Context r8 = r8.getApplicationContext()
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)
            java.lang.String r8 = r8.getPackageName()
            com.mapbox.common.LifecycleState r1 = com.mapbox.common.LifecycleState.UNKNOWN
            r2 = 32
            java.util.List r0 = r0.getRunningTasks(r2)
            java.util.Iterator r3 = r0.iterator()
        L27:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningTaskInfo r4 = (android.app.ActivityManager.RunningTaskInfo) r4
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L51
            android.content.ComponentName r4 = O.b.c(r4)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L51
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L51
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r8)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            com.mapbox.common.LifecycleState r1 = com.mapbox.common.LifecycleState.FOREGROUND     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r4 = move-exception
            goto L57
        L4e:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4c
            goto L52
        L51:
            r4 = 0
        L52:
            java.lang.Object r4 = kotlin.Result.m40constructorimpl(r4)     // Catch: java.lang.Throwable -> L4c
            goto L61
        L57:
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m40constructorimpl(r4)
        L61:
            java.lang.Throwable r4 = kotlin.Result.m43exceptionOrNullimpl(r4)
            if (r4 == 0) goto L27
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 13361(0x3431, float:1.8723E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = 13360(0x3430, float:1.8721E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            com.mapbox.common.Log.error(r4, r5)
            goto L27
        L85:
            int r8 = r0.size()
            if (r8 >= r2) goto L91
            com.mapbox.common.LifecycleState r8 = com.mapbox.common.LifecycleState.UNKNOWN
            if (r1 != r8) goto L91
            com.mapbox.common.LifecycleState r1 = com.mapbox.common.LifecycleState.BACKGROUND
        L91:
            return r1
        L92:
            com.mapbox.common.LifecycleState r8 = com.mapbox.common.LifecycleState.UNKNOWN
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.common.LifecycleUtils.getAppStatePreLollipop(android.content.Context):com.mapbox.common.LifecycleState");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.mapbox.common.LifecycleState] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private final LifecycleState getAppStateQAndHigher(Context context) {
        Object m40constructorimpl;
        boolean z2;
        String string2 = StubApp.getString2(13360);
        ActivityManager activityManager = (ActivityManager) context.getSystemService(StubApp.getString2(2680));
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        ?? it = activityManager.getAppTasks().iterator();
        while (it.hasNext()) {
            ActivityManager.AppTask appTask = (ActivityManager.AppTask) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                Log.info(StubApp.getString2("13362") + appTask.getTaskInfo(), string2);
                z2 = appTask.getTaskInfo().isRunning;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th));
                it = it;
            }
            if (z2) {
                it = LifecycleState.FOREGROUND;
                return it;
            }
            m40constructorimpl = Result.m40constructorimpl(Unit.INSTANCE);
            it = it;
            Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(m40constructorimpl);
            if (m43exceptionOrNullimpl != null) {
                Log.error(StubApp.getString2(13361) + m43exceptionOrNullimpl, string2);
            }
        }
        return LifecycleState.BACKGROUND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24(Context context, Looper looper, final Function1 callback) {
        Object m40constructorimpl;
        Object obj;
        final int i3 = 2;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        LifecycleUtils lifecycleUtils = INSTANCE;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!lifecycleUtils.hasServiceRunningInForeground(context)) {
                LifecycleState appLifecycleStateFromActivityManager = lifecycleUtils.getAppLifecycleStateFromActivityManager(context);
                if (looper != null) {
                    obj = Boolean.valueOf(new Handler(looper).post(new com.even.translate.a(i3, callback, appLifecycleStateFromActivityManager)));
                } else {
                    callback.invoke(appLifecycleStateFromActivityManager);
                    obj = Unit.INSTANCE;
                }
            } else if (looper != null) {
                obj = Boolean.valueOf(new Handler(looper).post(new Runnable() { // from class: com.mapbox.common.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                LifecycleService.getLifecycleState$lambda$6$lambda$5(callback);
                                break;
                            case 1:
                                LifecycleService.getLifecycleState$lambda$10$lambda$9$lambda$8(callback);
                                break;
                            case 2:
                                LifecycleUtils.getLifecycleState$lambda$24$lambda$20$lambda$17$lambda$16(callback);
                                break;
                            default:
                                LifecycleUtils.getLifecycleState$lambda$24$lambda$23$lambda$22$lambda$21(callback);
                                break;
                        }
                    }
                }));
            } else {
                callback.invoke(LifecycleState.FOREGROUND);
                obj = Unit.INSTANCE;
            }
            m40constructorimpl = Result.m40constructorimpl(obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(m40constructorimpl);
        if (m43exceptionOrNullimpl != null) {
            Log.error(StubApp.getString2(13349) + m43exceptionOrNullimpl, StubApp.getString2(13360));
            if (looper == null) {
                callback.invoke(LifecycleState.UNKNOWN);
            } else {
                final int i10 = 3;
                new Handler(looper).post(new Runnable() { // from class: com.mapbox.common.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                LifecycleService.getLifecycleState$lambda$6$lambda$5(callback);
                                break;
                            case 1:
                                LifecycleService.getLifecycleState$lambda$10$lambda$9$lambda$8(callback);
                                break;
                            case 2:
                                LifecycleUtils.getLifecycleState$lambda$24$lambda$20$lambda$17$lambda$16(callback);
                                break;
                            default:
                                LifecycleUtils.getLifecycleState$lambda$24$lambda$23$lambda$22$lambda$21(callback);
                                break;
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$20$lambda$17$lambda$16(Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(LifecycleState.FOREGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$20$lambda$19$lambda$18(Function1 callback, LifecycleState state) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(state, "$state");
        callback.invoke(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$23$lambda$22$lambda$21(Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(LifecycleState.UNKNOWN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasServiceRunningInForeground$lambda$15(Context context, Looper looper, Function1 callback) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        boolean hasServiceRunningInForeground = INSTANCE.hasServiceRunningInForeground(context);
        if (looper != null) {
            new Handler(looper).post(new f(1, callback, hasServiceRunningInForeground));
        } else {
            callback.invoke(Boolean.valueOf(hasServiceRunningInForeground));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasServiceRunningInForeground$lambda$15$lambda$14$lambda$13(Function1 callback, boolean z2) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(Boolean.valueOf(z2));
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final LifecycleState getAppLifecycleStateFromActivityManager(int buildVersion, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (Build.VERSION.SDK_INT < 29 || buildVersion < 29) ? buildVersion >= 21 ? getAppStateLollipopAndHigher(context) : getAppStatePreLollipop(context) : getAppStateQAndHigher(context);
    }

    @Deprecated(message = "Use asynchronous method")
    public final LifecycleState getLifecycleState(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            return hasServiceRunningInForeground(context) ? LifecycleState.FOREGROUND : getAppLifecycleStateFromActivityManager(context);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(Result.m40constructorimpl(ResultKt.createFailure(th)));
            if (m43exceptionOrNullimpl != null) {
                Log.error(StubApp.getString2(13349) + m43exceptionOrNullimpl, StubApp.getString2(13360));
            }
            return LifecycleState.UNKNOWN;
        }
    }

    @Deprecated(message = "Use asynchronous method")
    public final boolean hasServiceRunningInForeground(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        Intrinsics.checkNotNullParameter(context, "context");
        ActivityManager activityManager = (ActivityManager) context.getSystemService(StubApp.getString2(2680));
        String packageName = context.getPackageName();
        if (activityManager == null || (runningServices = activityManager.getRunningServices(IntCompanionObject.MAX_VALUE)) == null || runningServices.isEmpty()) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
            if (runningServiceInfo != null && Intrinsics.areEqual(runningServiceInfo.service.getPackageName(), packageName) && runningServiceInfo.foreground) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final LifecycleState getAppLifecycleStateFromActivityManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getAppLifecycleStateFromActivityManager(Build.VERSION.SDK_INT, context);
    }

    public final void hasServiceRunningInForeground(Context context, Looper looper, Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        threadPool.submit(new e(context, looper, callback, 0));
    }

    public final void getLifecycleState(Context context, Looper looper, Function1<? super LifecycleState, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        threadPool.submit(new e(context, looper, callback, 1));
    }
}
