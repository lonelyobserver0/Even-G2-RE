package com.mapbox.common;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.LifecycleService;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0002\b\u000b\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002*+B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u001c\u0010\"\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020!2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0011H\u0016J\u0006\u0010%\u001a\u00020\u0019J\u0006\u0010&\u001a\u00020\u0019J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0011H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020!H\u0002J\u001c\u0010)\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010j\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010j\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/mapbox/common/LifecycleMonitorAndroid;", "Lcom/mapbox/common/LifecycleMonitorInterface;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "lifecycleService", "Lcom/mapbox/common/LifecycleService;", "lifecycleServiceCallback", "com/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1", "Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1;", "lifecycleServiceConnection", "com/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1", "Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;", "monitorState", "Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;", "observers", "Ljava/util/HashMap;", "Lcom/mapbox/common/LifecycleObserver;", "Landroid/os/Handler;", "Lkotlin/collections/HashMap;", "pendingLifecycleStateCallbacks", "Lcom/mapbox/common/GetLifecycleStateCallback;", "pendingMonitoringStateCallbacks", "Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;", "getLifecycleState", "", "callback", "getMonitoringState", "notifyObservers", "state", "Lcom/mapbox/common/LifecycleMonitoringState;", "error", "", "Lcom/mapbox/common/LifecycleState;", "notifyPendingCallbacks", "registerObserver", "observer", "start", "stop", "unregisterObserver", "updateLifecycleState", "updateMonitorState", "Companion", "MonitorState", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LifecycleMonitorAndroid implements LifecycleMonitorInterface {
    private final Context context;
    private LifecycleService lifecycleService;
    private final LifecycleMonitorAndroid$lifecycleServiceCallback$1 lifecycleServiceCallback;
    private final LifecycleMonitorAndroid$lifecycleServiceConnection$1 lifecycleServiceConnection;
    private MonitorState monitorState;
    private HashMap<LifecycleObserver, Handler> observers;
    private HashMap<GetLifecycleStateCallback, Handler> pendingLifecycleStateCallbacks;
    private HashMap<GetLifecycleMonitoringStateCallback, Handler> pendingMonitoringStateCallbacks;
    public static final String TAG = StubApp.getString2(13337);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/LifecycleMonitorAndroid$Companion;", "", "()V", "TAG", "", "create", "Lcom/mapbox/common/LifecycleMonitorInterface;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final LifecycleMonitorInterface create() {
            return new LifecycleMonitorAndroid(MapboxSDKCommon.INSTANCE.getContext(), null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;", "", "(Ljava/lang/String;I)V", "STARTING", "STARTED", "STOPPING", "STOPPED", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum MonitorState {
        STARTING,
        STARTED,
        STOPPING,
        STOPPED
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MonitorState.values().length];
            try {
                iArr[MonitorState.STOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonitorState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MonitorState.STARTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MonitorState.STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ LifecycleMonitorAndroid(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @JvmStatic
    public static final LifecycleMonitorInterface create() {
        return INSTANCE.create();
    }

    private final synchronized void notifyObservers(LifecycleMonitoringState state, String error) {
        try {
            for (Map.Entry<LifecycleObserver, Handler> entry : this.observers.entrySet()) {
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new Ab.c(entry, state, error, 9));
                } else {
                    entry.getKey().onMonitoringStateChanged(state, error);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$4$lambda$2$lambda$1(Map.Entry observer, LifecycleMonitoringState state, String str) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        Intrinsics.checkNotNullParameter(state, "$state");
        ((LifecycleObserver) observer.getKey()).onMonitoringStateChanged(state, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$8$lambda$6$lambda$5(Map.Entry observer, LifecycleState state) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        Intrinsics.checkNotNullParameter(state, "$state");
        ((LifecycleObserver) observer.getKey()).onLifecycleStateChanged(state);
    }

    private final synchronized void notifyPendingCallbacks(LifecycleMonitoringState state, String error) {
        Expected<String, LifecycleMonitoringState> createError;
        if (error != null) {
            try {
                createError = ExpectedFactory.createError(error);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            createError = null;
        }
        if (createError == null) {
            createError = ExpectedFactory.createValue(state);
            Intrinsics.checkNotNullExpressionValue(createError, "run {\n            Expect…ateValue(state)\n        }");
        }
        for (Map.Entry<GetLifecycleMonitoringStateCallback, Handler> entry : this.pendingMonitoringStateCallbacks.entrySet()) {
            Handler value = entry.getValue();
            if (value != null) {
                value.post(new c(entry, createError, 1));
            } else {
                entry.getKey().run(createError);
            }
        }
        this.pendingMonitoringStateCallbacks.clear();
    }

    public static /* synthetic */ void notifyPendingCallbacks$default(LifecycleMonitorAndroid lifecycleMonitorAndroid, LifecycleState lifecycleState, String str, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        lifecycleMonitorAndroid.notifyPendingCallbacks(lifecycleState, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPendingCallbacks$lambda$14$lambda$12$lambda$11(Map.Entry callback, Expected result) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(result, "$result");
        ((GetLifecycleMonitoringStateCallback) callback.getKey()).run(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPendingCallbacks$lambda$20$lambda$18$lambda$17(Map.Entry callback, Expected result) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(result, "$result");
        ((GetLifecycleStateCallback) callback.getKey()).run(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void updateLifecycleState(LifecycleState state) {
        notifyPendingCallbacks$default(this, state, null, 2, null);
        notifyObservers(state);
    }

    private final synchronized void updateMonitorState(MonitorState state, String error) {
        try {
            this.monitorState = state;
            if (error != null) {
                notifyPendingCallbacks(LifecycleState.UNKNOWN, error);
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i3 == 2) {
                LifecycleMonitoringState lifecycleMonitoringState = LifecycleMonitoringState.STOPPED;
                notifyPendingCallbacks(lifecycleMonitoringState, error);
                notifyObservers(lifecycleMonitoringState, error);
            } else if (i3 == 4) {
                LifecycleMonitoringState lifecycleMonitoringState2 = LifecycleMonitoringState.STARTED;
                notifyPendingCallbacks(lifecycleMonitoringState2, error);
                notifyObservers(lifecycleMonitoringState2, error);
                if (this.observers.isEmpty() && this.pendingLifecycleStateCallbacks.isEmpty()) {
                    stop();
                }
            }
        } finally {
        }
    }

    public static /* synthetic */ void updateMonitorState$default(LifecycleMonitorAndroid lifecycleMonitorAndroid, MonitorState monitorState, String str, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        lifecycleMonitorAndroid.updateMonitorState(monitorState, str);
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void getLifecycleState(final GetLifecycleStateCallback callback) {
        LifecycleService lifecycleService;
        try {
            Intrinsics.checkNotNullParameter(callback, "callback");
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.monitorState.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                HashMap<GetLifecycleStateCallback, Handler> hashMap = this.pendingLifecycleStateCallbacks;
                Looper myLooper = Looper.myLooper();
                hashMap.put(callback, myLooper != null ? new Handler(myLooper) : null);
                if (this.monitorState != MonitorState.STARTING) {
                    start();
                }
            } else if (i3 == 4 && (lifecycleService = this.lifecycleService) != null) {
                lifecycleService.getLifecycleState(Looper.myLooper(), new Function1<LifecycleState, Unit>() { // from class: com.mapbox.common.LifecycleMonitorAndroid$getLifecycleState$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LifecycleState lifecycleState) {
                        invoke2(lifecycleState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LifecycleState state) {
                        Intrinsics.checkNotNullParameter(state, "state");
                        GetLifecycleStateCallback.this.run(ExpectedFactory.createValue(state));
                    }
                });
            }
        } finally {
        }
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void getMonitoringState(GetLifecycleMonitoringStateCallback callback) {
        try {
            Intrinsics.checkNotNullParameter(callback, "callback");
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.monitorState.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    callback.run(ExpectedFactory.createValue(LifecycleMonitoringState.STOPPED));
                } else if (i3 != 3) {
                    if (i3 == 4) {
                        callback.run(ExpectedFactory.createValue(LifecycleMonitoringState.STARTED));
                    }
                }
            }
            HashMap<GetLifecycleMonitoringStateCallback, Handler> hashMap = this.pendingMonitoringStateCallbacks;
            Looper myLooper = Looper.myLooper();
            hashMap.put(callback, myLooper != null ? new Handler(myLooper) : null);
        } finally {
        }
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void registerObserver(LifecycleObserver observer) {
        try {
            Intrinsics.checkNotNullParameter(observer, "observer");
            HashMap<LifecycleObserver, Handler> hashMap = this.observers;
            Looper myLooper = Looper.myLooper();
            hashMap.put(observer, myLooper != null ? new Handler(myLooper) : null);
            if (this.monitorState != MonitorState.STARTED) {
                start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void start() {
        MonitorState monitorState = this.monitorState;
        MonitorState monitorState2 = MonitorState.STARTING;
        if (monitorState != monitorState2 && monitorState != MonitorState.STARTED) {
            updateMonitorState$default(this, monitorState2, null, 2, null);
            if (this.context.bindService(new Intent(this.context, (Class<?>) LifecycleService.class), this.lifecycleServiceConnection, 1)) {
                return;
            }
            Log.error(StubApp.getString2("13338"), StubApp.getString2("13337"));
            updateMonitorState(MonitorState.STOPPED, StubApp.getString2("13339"));
        }
    }

    public final synchronized void stop() {
        try {
            MonitorState monitorState = this.monitorState;
            MonitorState monitorState2 = MonitorState.STOPPING;
            if (monitorState != monitorState2 && monitorState != MonitorState.STOPPED) {
                updateMonitorState$default(this, monitorState2, null, 2, null);
                LifecycleService lifecycleService = this.lifecycleService;
                if (lifecycleService != null) {
                    this.context.unbindService(this.lifecycleServiceConnection);
                    lifecycleService.stopSelf();
                }
                this.lifecycleServiceConnection.onServiceDisconnected(null);
            }
        } finally {
        }
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void unregisterObserver(LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.remove(observer);
        if (this.observers.isEmpty()) {
            stop();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.mapbox.common.LifecycleMonitorAndroid$lifecycleServiceCallback$1] */
    private LifecycleMonitorAndroid(Context context) {
        this.context = context;
        this.monitorState = MonitorState.STOPPED;
        this.observers = new HashMap<>();
        this.pendingLifecycleStateCallbacks = new HashMap<>();
        this.pendingMonitoringStateCallbacks = new HashMap<>();
        this.lifecycleServiceCallback = new LifecycleService.Callback() { // from class: com.mapbox.common.LifecycleMonitorAndroid$lifecycleServiceCallback$1
            @Override // com.mapbox.common.LifecycleService.Callback
            public void onLifecycleStateChanged(LifecycleState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                LifecycleMonitorAndroid.this.updateLifecycleState(state);
            }
        };
        this.lifecycleServiceConnection = new LifecycleMonitorAndroid$lifecycleServiceConnection$1(this);
    }

    private final synchronized void notifyObservers(LifecycleState state) {
        try {
            for (Map.Entry<LifecycleObserver, Handler> entry : this.observers.entrySet()) {
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new com.even.translate.a(1, entry, state));
                } else {
                    entry.getKey().onLifecycleStateChanged(state);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void notifyPendingCallbacks(LifecycleState state, String error) {
        Expected<String, LifecycleState> createError;
        if (error != null) {
            try {
                createError = ExpectedFactory.createError(error);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            createError = null;
        }
        if (createError == null) {
            createError = ExpectedFactory.createValue(state);
            Intrinsics.checkNotNullExpressionValue(createError, "run {\n            Expect…ateValue(state)\n        }");
        }
        for (Map.Entry<GetLifecycleStateCallback, Handler> entry : this.pendingLifecycleStateCallbacks.entrySet()) {
            Handler value = entry.getValue();
            if (value != null) {
                value.post(new c(entry, createError, 0));
            } else {
                entry.getKey().run(createError);
            }
        }
        this.pendingLifecycleStateCallbacks.clear();
    }
}
