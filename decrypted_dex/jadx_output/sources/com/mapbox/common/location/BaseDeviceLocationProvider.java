package com.mapbox.common.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.location.DeviceLocationProvider;
import com.stub.StubApp;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b \u0018\u0000 62\u00020\u00012\u00020\u0002:\u00046789B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\"H$J\b\u0010(\u001a\u00020\"H$J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-H&J\u0016\u0010.\u001a\u00020\"2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\u0011H&J\u0010\u00103\u001a\u00020\"2\u0006\u00102\u001a\u00020\u0011H&J\b\u00104\u001a\u00020\"H\u0007J\b\u00105\u001a\u00020\"H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b \u0010\u0019¨\u0006:"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider;", "Lcom/mapbox/common/location/BaseLocationProvider;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "context", "Landroid/content/Context;", "request", "Lcom/mapbox/common/location/LocationProviderRequest;", "(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V", "getContext", "()Landroid/content/Context;", "currentMode", "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;", "getCurrentMode", "()Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;", "setCurrentMode", "(Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;)V", "locationUpdatePendingIntent", "Landroid/app/PendingIntent;", "getLocationUpdatePendingIntent", "()Landroid/app/PendingIntent;", "locationUpdatePendingIntent$delegate", "Lkotlin/Lazy;", "persistentId", "", "getPersistentId$annotations", "()V", "getPersistentId", "()I", "getRequest", "()Lcom/mapbox/common/location/LocationProviderRequest;", "state", "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;", "getState$annotations", "addLocationObserver", "", "observer", "Lcom/mapbox/common/location/LocationObserver;", "looper", "Landroid/os/Looper;", "doStart", "doStop", "extractResult", "", "Lcom/mapbox/common/location/Location;", "intent", "Landroid/content/Intent;", "notifyLocationUpdate", "locations", "removeLocationObserver", "removeLocationUpdates", "pendingIntent", "requestLocationUpdates", "start", "stop", "Companion", "DeviceLocationProviderMode", "DeviceLocationProviderState", "LocationCancelable", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BaseDeviceLocationProvider extends BaseLocationProvider implements DeviceLocationProvider {
    private final Context context;
    private DeviceLocationProviderMode currentMode;

    /* renamed from: locationUpdatePendingIntent$delegate, reason: from kotlin metadata */
    private final Lazy locationUpdatePendingIntent;
    private final LocationProviderRequest request;

    @JvmField
    public DeviceLocationProviderState state;

    @Deprecated
    private static final String TAG = StubApp.getString2(13623);
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$Companion;", "", "()V", "TAG", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;", "", "(Ljava/lang/String;I)V", "NONE", "CALLBACK", "PENDING_INTENT", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DeviceLocationProviderMode {
        NONE,
        CALLBACK,
        PENDING_INTENT
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;", "", "(Ljava/lang/String;I)V", "STOPPED", "STOPPING", "STARTED", "STARTING", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DeviceLocationProviderState {
        STOPPED,
        STOPPING,
        STARTED,
        STARTING
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;", "Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/common/location/BaseDeviceLocationProvider;)V", "isCanceled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cancel", "", "invokeIfNotCanceled", "cb", "Lkotlin/Function0;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class LocationCancelable implements Cancelable {
        private final AtomicBoolean isCanceled = new AtomicBoolean(false);

        public LocationCancelable() {
        }

        @Override // com.mapbox.common.Cancelable
        public void cancel() {
            this.isCanceled.set(true);
        }

        public final void invokeIfNotCanceled(Function0<Unit> cb2) {
            Intrinsics.checkNotNullParameter(cb2, "cb");
            if (this.isCanceled.get()) {
                MapboxCommonLogger.INSTANCE.logW$common_release(StubApp.getString2(13619), StubApp.getString2(13620));
            } else {
                cb2.invoke();
            }
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceLocationProviderState.values().length];
            try {
                iArr[DeviceLocationProviderState.STARTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceLocationProviderState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceLocationProviderState.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceLocationProviderState.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseDeviceLocationProvider(Context context, LocationProviderRequest locationProviderRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.request = locationProviderRequest;
        this.state = DeviceLocationProviderState.STOPPED;
        this.locationUpdatePendingIntent = LazyKt.lazy(new Function0<PendingIntent>() { // from class: com.mapbox.common.location.BaseDeviceLocationProvider$locationUpdatePendingIntent$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PendingIntent invoke() {
                Intent intent = new Intent(BaseDeviceLocationProvider.this.getContext(), (Class<?>) LocationUpdatesReceiver.class);
                intent.setAction(StubApp.getString2(13621));
                int i3 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
                intent.putExtra(StubApp.getString2(13622), BaseDeviceLocationProvider.this.getPersistentId());
                return PendingIntent.getBroadcast(BaseDeviceLocationProvider.this.getContext(), BaseDeviceLocationProvider.this.getPersistentId(), intent, i3);
            }
        });
        this.currentMode = DeviceLocationProviderMode.NONE;
    }

    public static /* synthetic */ void getPersistentId$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public synchronized void addLocationObserver(LocationObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.addLocationObserver(observer);
        start();
    }

    public abstract void doStart();

    public abstract void doStop();

    public abstract List<Location> extractResult(Intent intent);

    public final Context getContext() {
        return this.context;
    }

    public final DeviceLocationProviderMode getCurrentMode() {
        return this.currentMode;
    }

    public final PendingIntent getLocationUpdatePendingIntent() {
        Object value = this.locationUpdatePendingIntent.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-locationUpdatePendingIntent>(...)");
        return (PendingIntent) value;
    }

    public String getName() {
        return DeviceLocationProvider.DefaultImpls.getName(this);
    }

    public abstract int getPersistentId();

    public final LocationProviderRequest getRequest() {
        return this.request;
    }

    @Override // com.mapbox.common.location.BaseLocationProvider
    public synchronized void notifyLocationUpdate(List<? extends Location> locations) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        if (this.state == DeviceLocationProviderState.STARTED) {
            super.notifyLocationUpdate(locations);
        }
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public synchronized void removeLocationObserver(LocationObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.removeLocationObserver(observer);
        if (getObservers().isEmpty()) {
            stop();
        }
    }

    public abstract void removeLocationUpdates(PendingIntent pendingIntent);

    public abstract void requestLocationUpdates(PendingIntent pendingIntent);

    public final void setCurrentMode(DeviceLocationProviderMode deviceLocationProviderMode) {
        Intrinsics.checkNotNullParameter(deviceLocationProviderMode, "<set-?>");
        this.currentMode = deviceLocationProviderMode;
    }

    public final void start() {
        Object m40constructorimpl;
        String string2 = StubApp.getString2(13623);
        String string22 = StubApp.getString2(13624);
        String string23 = StubApp.getString2(13625);
        try {
            Result.Companion companion = Result.INSTANCE;
            MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
            mapboxCommonLogger.logD$common_release(string2, string23 + this + StubApp.getString2("9384") + this.state);
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
            if (i3 == 1 || i3 == 2) {
                mapboxCommonLogger.logW$common_release(string2, string22 + this.state);
            } else if (i3 == 3 || i3 == 4) {
                this.state = DeviceLocationProviderState.STARTING;
                doStart();
            }
            m40constructorimpl = Result.m40constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(m40constructorimpl);
        if (m43exceptionOrNullimpl != null) {
            MapboxCommonLogger.INSTANCE.logE$common_release(string2, StubApp.getString2(13626) + this.state + ' ' + m43exceptionOrNullimpl);
            this.state = DeviceLocationProviderState.STOPPED;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #1 {, blocks: (B:14:0x0086, B:16:0x008c, B:26:0x007c, B:4:0x0016, B:13:0x0075, B:22:0x0054, B:23:0x006e), top: B:3:0x0016, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void stop() {
        /*
            r6 = this;
            r0 = 13627(0x353b, float:1.9095E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 13628(0x353c, float:1.9097E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r2 = 13629(0x353d, float:1.9098E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            monitor-enter(r6)
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L6c
            com.mapbox.common.MapboxCommonLogger r3 = com.mapbox.common.MapboxCommonLogger.INSTANCE     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = "13623"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            r5.append(r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "13630"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: java.lang.Throwable -> L6c
            r5.append(r2)     // Catch: java.lang.Throwable -> L6c
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderState r2 = r6.state     // Catch: java.lang.Throwable -> L6c
            r5.append(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L6c
            r3.logD$common_release(r4, r2)     // Catch: java.lang.Throwable -> L6c
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderState r2 = r6.state     // Catch: java.lang.Throwable -> L6c
            int[] r4 = com.mapbox.common.location.BaseDeviceLocationProvider.WhenMappings.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L6c
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L6c
            r2 = r4[r2]     // Catch: java.lang.Throwable -> L6c
            r4 = 1
            if (r2 == r4) goto L6e
            r4 = 2
            if (r2 == r4) goto L6e
            r4 = 3
            if (r2 == r4) goto L54
            r4 = 4
            if (r2 == r4) goto L54
            goto L75
        L54:
            java.lang.String r2 = "13623"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderState r1 = r6.state     // Catch: java.lang.Throwable -> L6c
            r4.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L6c
            r3.logW$common_release(r2, r1)     // Catch: java.lang.Throwable -> L6c
            goto L75
        L6c:
            r1 = move-exception
            goto L7c
        L6e:
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderState r1 = com.mapbox.common.location.BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPING     // Catch: java.lang.Throwable -> L6c
            r6.state = r1     // Catch: java.lang.Throwable -> L6c
            r6.doStop()     // Catch: java.lang.Throwable -> L6c
        L75:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r1 = kotlin.Result.m40constructorimpl(r1)     // Catch: java.lang.Throwable -> L6c
            goto L86
        L7c:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r1 = kotlin.Result.m40constructorimpl(r1)     // Catch: java.lang.Throwable -> Lae
        L86:
            java.lang.Throwable r1 = kotlin.Result.m43exceptionOrNullimpl(r1)     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto Lb0
            com.mapbox.common.MapboxCommonLogger r2 = com.mapbox.common.MapboxCommonLogger.INSTANCE     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "13623"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> Lae
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lae
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderState r0 = r6.state     // Catch: java.lang.Throwable -> Lae
            r4.append(r0)     // Catch: java.lang.Throwable -> Lae
            r0 = 32
            r4.append(r0)     // Catch: java.lang.Throwable -> Lae
            r4.append(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lae
            r2.logE$common_release(r3, r0)     // Catch: java.lang.Throwable -> Lae
            goto Lb0
        Lae:
            r0 = move-exception
            goto Lb2
        Lb0:
            monitor-exit(r6)
            return
        Lb2:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lae
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.common.location.BaseDeviceLocationProvider.stop():void");
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public synchronized void addLocationObserver(LocationObserver observer, Looper looper) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(looper, "looper");
        super.addLocationObserver(observer, looper);
        start();
    }
}
