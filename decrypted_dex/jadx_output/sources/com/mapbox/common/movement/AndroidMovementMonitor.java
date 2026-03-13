package com.mapbox.common.movement;

import android.os.Handler;
import android.os.Looper;
import com.even.translate.a;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementInfoCallback;
import com.mapbox.common.MovementModeObserver;
import com.mapbox.common.MovementModeProvider;
import com.mapbox.common.MovementMonitorInterface;
import com.mapbox.common.movement.ActivityRecognitionClient;
import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/mapbox/common/movement/AndroidMovementMonitor;", "Lcom/mapbox/common/MovementMonitorInterface;", "activityRecognition", "Lcom/mapbox/common/movement/ActivityRecognitionClient;", "(Lcom/mapbox/common/movement/ActivityRecognitionClient;)V", "observers", "", "Lcom/mapbox/common/MovementModeObserver;", "Landroid/os/Handler;", "sdkMovementInfo", "Lcom/mapbox/common/MovementInfo;", "systemMovementInfo", "getMovementInfo", "", "callback", "Lcom/mapbox/common/MovementInfoCallback;", "notifyObservers", "movementInfo", "onPlatformMovementInfoAvailable", "info", "registerObserver", "observer", "setMovementInfo", "unregisterObserver", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AndroidMovementMonitor implements MovementMonitorInterface {
    private final ActivityRecognitionClient activityRecognition;
    private final Map<MovementModeObserver, Handler> observers;
    private MovementInfo sdkMovementInfo;
    private MovementInfo systemMovementInfo;
    private static final String NO_MOVEMENT_INFO_ERROR = StubApp.getString2(13837);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/movement/AndroidMovementMonitor$Companion;", "", "()V", "NO_MOVEMENT_INFO_ERROR", "", "create", "Lcom/mapbox/common/MovementMonitorInterface;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final MovementMonitorInterface create() {
            ActivityRecognitionClient activityRecognitionClient;
            if (GoogleActivityRecognition.INSTANCE.isAvailable$common_release()) {
                activityRecognitionClient = new GoogleActivityRecognition(MapboxSDKCommon.INSTANCE.getContext(), null, 2, 0 == true ? 1 : 0);
            } else {
                activityRecognitionClient = StubActivityRecognition.INSTANCE;
            }
            return new AndroidMovementMonitor(activityRecognitionClient);
        }

        private Companion() {
        }
    }

    public AndroidMovementMonitor(ActivityRecognitionClient activityRecognition) {
        Intrinsics.checkNotNullParameter(activityRecognition, "activityRecognition");
        this.activityRecognition = activityRecognition;
        this.observers = new LinkedHashMap();
        activityRecognition.addObserver(new ActivityRecognitionClient.Observer() { // from class: com.mapbox.common.movement.AndroidMovementMonitor.1
            @Override // com.mapbox.common.movement.ActivityRecognitionClient.Observer
            public synchronized void onMovementInfo(MovementInfo info) {
                Intrinsics.checkNotNullParameter(info, "info");
                AndroidMovementMonitor.this.onPlatformMovementInfoAvailable(info);
            }
        });
    }

    @JvmStatic
    public static final MovementMonitorInterface create() {
        return INSTANCE.create();
    }

    private final void notifyObservers(MovementInfo movementInfo) {
        for (Map.Entry<MovementModeObserver, Handler> entry : this.observers.entrySet()) {
            MovementModeObserver key = entry.getKey();
            Handler value = entry.getValue();
            if (value == null || Intrinsics.areEqual(value.getLooper(), Looper.myLooper())) {
                key.onMovementModeChanged(movementInfo);
            } else {
                value.post(new a(4, key, movementInfo));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$2$lambda$1(MovementModeObserver observer, MovementInfo movementInfo) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        Intrinsics.checkNotNullParameter(movementInfo, "$movementInfo");
        observer.onMovementModeChanged(movementInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onPlatformMovementInfoAvailable(MovementInfo info) {
        this.systemMovementInfo = info;
        notifyObservers(info);
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void getMovementInfo(MovementInfoCallback callback) {
        Expected<String, MovementInfo> createError;
        try {
            Intrinsics.checkNotNullParameter(callback, "callback");
            MovementInfo movementInfo = this.systemMovementInfo;
            if (movementInfo == null) {
                movementInfo = this.sdkMovementInfo;
            }
            if (movementInfo != null) {
                createError = ExpectedFactory.createValue(movementInfo);
                Intrinsics.checkNotNullExpressionValue(createError, "{\n            ExpectedFa…mentInfo>(info)\n        }");
            } else {
                createError = ExpectedFactory.createError(StubApp.getString2("13837"));
                Intrinsics.checkNotNullExpressionValue(createError, "{\n            ExpectedFa…ENT_INFO_ERROR)\n        }");
            }
            callback.run(createError);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void registerObserver(MovementModeObserver observer) {
        try {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Map<MovementModeObserver, Handler> map = this.observers;
            Looper myLooper = Looper.myLooper();
            map.put(observer, myLooper != null ? new Handler(myLooper) : null);
            if (this.observers.size() == 1) {
                this.activityRecognition.start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void setMovementInfo(MovementInfo movementInfo) {
        Intrinsics.checkNotNullParameter(movementInfo, "movementInfo");
        if (!this.activityRecognition.isPlatformActivityRecognitionAvailable()) {
            this.sdkMovementInfo = new MovementInfo(movementInfo.getMovementMode(), MovementModeProvider.SDK);
            notifyObservers(movementInfo);
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void unregisterObserver(MovementModeObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.remove(observer);
        if (this.observers.isEmpty()) {
            this.activityRecognition.stop();
        }
    }
}
