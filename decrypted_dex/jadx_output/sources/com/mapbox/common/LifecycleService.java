package com.mapbox.common;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.mapbox.common.LifecycleService;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r*\u0001\u0006\b\u0007\u0018\u0000 -2\u00020\u0001:\u0004*+,-B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\r\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0018J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0013H\u0002J\u0010\u0010%\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010'\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0012H\u0002J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\tH\u0002J\f\u0010)\u001a\u00020\t*\u00020\u0013H\u0002R\u0012\u0010\u0003\u001a\u00060\u0004R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR6\u0010\u000f\u001a*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u00130\u0010j\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/mapbox/common/LifecycleService;", "Landroid/app/Service;", "()V", "binder", "Lcom/mapbox/common/LifecycleService$Binder;", "callback", "com/mapbox/common/LifecycleService$callback$1", "Lcom/mapbox/common/LifecycleService$callback$1;", "currentLifecycleState", "Lcom/mapbox/common/LifecycleState;", "lifecycleCallback", "Lcom/mapbox/common/LifecycleService$Callback;", "lifecycleState", "getLifecycleState", "()Lcom/mapbox/common/LifecycleState;", "registeredActivities", "Ljava/util/HashMap;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "Lcom/mapbox/common/LifecycleService$ActivityState;", "Lkotlin/collections/HashMap;", "", "looper", "Landroid/os/Looper;", "Lkotlin/Function1;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onTrimMemory", "level", "", "registerActivityWithState", "activity", "state", "setCallback", "observer", "unregisterActivity", "updateLifecycleState", "toLifecycleState", "ActivityState", "Binder", "Callback", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LifecycleService extends Service {
    public static final String TAG = StubApp.getString2(13347);
    private Callback lifecycleCallback;
    private final HashMap<WeakReference<Activity>, ActivityState> registeredActivities = new HashMap<>();
    private final Binder binder = new Binder();
    private LifecycleState currentLifecycleState = LifecycleState.UNKNOWN;
    private final LifecycleService$callback$1 callback = new Application.ActivityLifecycleCallbacks() { // from class: com.mapbox.common.LifecycleService$callback$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LifecycleService.this.registerActivityWithState(activity, LifecycleService.ActivityState.Created);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LifecycleService.this.unregisterActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LifecycleService.this.registerActivityWithState(activity, LifecycleService.ActivityState.Paused);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LifecycleService.this.registerActivityWithState(activity, LifecycleService.ActivityState.Resumed);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            LifecycleService.this.registerActivityWithState(activity, LifecycleService.ActivityState.SaveInstanceState);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LifecycleService.this.registerActivityWithState(activity, LifecycleService.ActivityState.Started);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            LifecycleService.this.registerActivityWithState(activity, LifecycleService.ActivityState.Stopped);
        }
    };

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/common/LifecycleService$ActivityState;", "", "(Ljava/lang/String;I)V", "Unknown", "Created", "Started", "Resumed", "Paused", "Stopped", "SaveInstanceState", "Destroyed", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum ActivityState {
        Unknown,
        Created,
        Started,
        Resumed,
        Paused,
        Stopped,
        SaveInstanceState,
        Destroyed
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/LifecycleService$Binder;", "Landroid/os/Binder;", "(Lcom/mapbox/common/LifecycleService;)V", "getService", "Lcom/mapbox/common/LifecycleService;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class Binder extends android.os.Binder {
        public Binder() {
        }

        /* renamed from: getService, reason: from getter */
        public final LifecycleService getThis$0() {
            return LifecycleService.this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/common/LifecycleService$Callback;", "", "onLifecycleStateChanged", "", "state", "Lcom/mapbox/common/LifecycleState;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Callback {
        void onLifecycleStateChanged(LifecycleState state);
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivityState.values().length];
            try {
                iArr[ActivityState.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityState.Created.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityState.Started.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivityState.Resumed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActivityState.Paused.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ActivityState.Stopped.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ActivityState.SaveInstanceState.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ActivityState.Destroyed.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        StubApp.interface11(5139);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void getLifecycleState$lambda$10$lambda$9$lambda$8(Function1 function1);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void getLifecycleState$lambda$6$lambda$5(Function1 function1);

    /* JADX INFO: Access modifiers changed from: private */
    public final native synchronized void registerActivityWithState(Activity activity, ActivityState state);

    /* JADX INFO: Access modifiers changed from: private */
    public final native LifecycleState toLifecycleState(ActivityState activityState);

    /* JADX INFO: Access modifiers changed from: private */
    public final native synchronized void unregisterActivity(Activity activity);

    /* JADX INFO: Access modifiers changed from: private */
    public final native synchronized void updateLifecycleState(LifecycleState state);

    @Deprecated(message = "Use asynchronous methods to get lifecycle state")
    public final native LifecycleState getLifecycleState();

    public final native void getLifecycleState(Looper looper, Function1<? super LifecycleState, Unit> callback);

    @Override // android.app.Service
    public native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public native void onCreate();

    @Override // android.app.Service
    public native void onDestroy();

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public native void onTrimMemory(int level);

    public final native synchronized void setCallback(Callback observer);
}
