package com.mapbox.common.location;

import R4.i;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcelable;
import c5.B;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.location.BaseDeviceLocationProvider;
import com.stub.StubApp;
import i4.AbstractC1047k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q4.j;

@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0012\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0015J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\n\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u001bH\u0002J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, d2 = {"Lcom/mapbox/common/location/GoogleDeviceLocationProvider;", "Lcom/mapbox/common/location/BaseDeviceLocationProvider;", "context", "Landroid/content/Context;", "request", "Lcom/mapbox/common/location/LocationProviderRequest;", "(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V", "fusedLocationClientHandlerThread", "Landroid/os/HandlerThread;", "fusedLocationProviderClient", "Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;", "getFusedLocationProviderClient$annotations", "()V", "getFusedLocationProviderClient", "()Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;", "setFusedLocationProviderClient", "(Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;)V", "locationCallback", "com/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1", "Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;", "persistentId", "", "getPersistentId", "()I", "createFusedLocationClientHandler", "Landroid/os/Looper;", "doStart", "", "doStop", "extractResult", "", "Lcom/mapbox/common/location/Location;", "intent", "Landroid/content/Intent;", "getLastLocation", "Lcom/mapbox/common/Cancelable;", "callback", "Lcom/mapbox/common/location/GetLocationCallback;", "getName", "", "quitFusedLocationClientHandler", "removeLocationUpdates", "pendingIntent", "Landroid/app/PendingIntent;", "requestLocationUpdates", "toString", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GoogleDeviceLocationProvider extends BaseDeviceLocationProvider {
    private HandlerThread fusedLocationClientHandlerThread;
    private ProxyGoogleFusedLocationProviderClient fusedLocationProviderClient;
    private final GoogleDeviceLocationProvider$locationCallback$1 locationCallback;
    private final int persistentId;
    private static final String TAG = StubApp.getString2(13639);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/GoogleDeviceLocationProvider$Companion;", "", "()V", "TAG", "", "isAvailable", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isAvailable() throws IncompatibleGooglePlayServicesLocationVersion {
            return LocationServiceUtils.getGooglePlayServicesBundled() && ProxyGoogleFusedLocationProviderClient.INSTANCE.getAvailable$common_release() && GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayServicesReady();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PermissionStatus.values().length];
            try {
                iArr[PermissionStatus.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionStatus.GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionStatus.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PermissionStatus.DENIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BaseDeviceLocationProvider.DeviceLocationProviderMode.values().length];
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.mapbox.common.location.GoogleDeviceLocationProvider$locationCallback$1] */
    public GoogleDeviceLocationProvider(Context context, LocationProviderRequest locationProviderRequest) {
        super(context, locationProviderRequest);
        Intrinsics.checkNotNullParameter(context, "context");
        this.fusedLocationProviderClient = new ProxyGoogleFusedLocationProviderClient(context);
        this.locationCallback = new AbstractC1047k() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider$locationCallback$1
            @Override // i4.AbstractC1047k
            public void onLocationResult(LocationResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                GoogleDeviceLocationProvider googleDeviceLocationProvider = GoogleDeviceLocationProvider.this;
                List<android.location.Location> list = result.f11798a;
                Intrinsics.checkNotNullExpressionValue(list, "result.locations");
                ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
                for (android.location.Location it : list) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(LocationServiceUtils.toCommonLocation(it));
                }
                googleDeviceLocationProvider.notifyLocationUpdate(arrayList);
            }
        };
        this.persistentId = Objects.hash(DeviceLocationProviderType.GOOGLE_PLAY_SERVICES.name(), String.valueOf(locationProviderRequest));
    }

    private final Looper createFusedLocationClientHandler() {
        HandlerThread handlerThread = new HandlerThread(StubApp.getString2(13646));
        this.fusedLocationClientHandlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.fusedLocationClientHandlerThread;
        if (handlerThread2 != null) {
            return handlerThread2.getLooper();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStart$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStart$lambda$1(PermissionStatus permission, GoogleDeviceLocationProvider this$0, Exception exception) {
        Intrinsics.checkNotNullParameter(permission, "$permission");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(exception, "exception");
        MapboxCommonLogger.INSTANCE.logE$common_release(StubApp.getString2(13639), StubApp.getString2(13647) + exception);
        if (permission == PermissionStatus.DENIED) {
            FeatureTelemetryCounter.create(StubApp.getString2(13648)).increment();
        } else {
            FeatureTelemetryCounter.create(StubApp.getString2(13649)).increment();
        }
        this$0.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
        this$0.setCurrentMode(BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE);
        if (this$0.getCurrentMode() == BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK) {
            this$0.quitFusedLocationClientHandler();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStop$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStop$lambda$3(GoogleDeviceLocationProvider this$0, Exception exception) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(exception, "exception");
        MapboxCommonLogger.INSTANCE.logE$common_release(StubApp.getString2(13639), StubApp.getString2(13650) + exception);
        this$0.quitFusedLocationClientHandler();
    }

    public static /* synthetic */ void getFusedLocationProviderClient$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$6(BaseDeviceLocationProvider.LocationCancelable cancelable, GetLocationCallback callback, j it) {
        Intrinsics.checkNotNullParameter(cancelable, "$cancelable");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        cancelable.invokeIfNotCanceled(new GoogleDeviceLocationProvider$getLastLocation$1$1(it, cancelable, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void quitFusedLocationClientHandler() {
        HandlerThread handlerThread = this.fusedLocationClientHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeLocationUpdates$lambda$10(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        MapboxCommonLogger.INSTANCE.logE$common_release(StubApp.getString2(13639), StubApp.getString2(13651) + exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeLocationUpdates$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLocationUpdates$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLocationUpdates$lambda$8(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        MapboxCommonLogger.INSTANCE.logE$common_release(StubApp.getString2(13639), StubApp.getString2(13652) + exception);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009b A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0008, B:6:0x000e, B:8:0x0014, B:11:0x0024, B:19:0x0057, B:21:0x009b, B:23:0x00ac, B:27:0x0068, B:28:0x006d, B:29:0x006e, B:30:0x0083, B:31:0x0020), top: B:3:0x0008 }] */
    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void doStart() {
        /*
            r6 = this;
            r0 = 13607(0x3527, float:1.9067E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            monitor-enter(r6)
            com.mapbox.common.location.LocationProviderRequest r1 = r6.getRequest()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L20
            com.mapbox.bindgen.Expected r1 = com.mapbox.common.location.LocationProviderSettingsExtKt.toLocationRequest(r1)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L20
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.location.LocationRequest r1 = (com.google.android.gms.location.LocationRequest) r1     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L24
            goto L20
        L1d:
            r0 = move-exception
            goto Lb6
        L20:
            com.google.android.gms.location.LocationRequest r1 = com.google.android.gms.location.LocationRequest.d()     // Catch: java.lang.Throwable -> L1d
        L24:
            android.content.Context r2 = r6.getContext()     // Catch: java.lang.Throwable -> L1d
            com.mapbox.common.location.PermissionStatus r2 = com.mapbox.common.location.LocationServiceUtils.getPermissionStatus(r2)     // Catch: java.lang.Throwable -> L1d
            com.mapbox.common.MapboxCommonLogger r3 = com.mapbox.common.MapboxCommonLogger.INSTANCE     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = "13639"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            r5.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L1d
            r3.logD$common_release(r4, r0)     // Catch: java.lang.Throwable -> L1d
            int[] r0 = com.mapbox.common.location.GoogleDeviceLocationProvider.WhenMappings.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L1d
            int r3 = r2.ordinal()     // Catch: java.lang.Throwable -> L1d
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L1d
            r3 = 1
            if (r0 == r3) goto L83
            r3 = 2
            if (r0 == r3) goto L83
            r3 = 3
            if (r0 == r3) goto L6e
            r1 = 4
            if (r0 != r1) goto L68
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "13653"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.mapbox.common.location.FailedTask r1 = new com.mapbox.common.location.FailedTask     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            goto L99
        L68:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r0     // Catch: java.lang.Throwable -> L1d
        L6e:
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderMode r0 = com.mapbox.common.location.BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT     // Catch: java.lang.Throwable -> L1d
            r6.setCurrentMode(r0)     // Catch: java.lang.Throwable -> L1d
            com.mapbox.common.location.ProxyGoogleFusedLocationProviderClient r0 = r6.fusedLocationProviderClient     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "locationRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.lang.Throwable -> L1d
            android.app.PendingIntent r3 = r6.getLocationUpdatePendingIntent()     // Catch: java.lang.Throwable -> L1d
            q4.j r1 = r0.requestLocationUpdates(r1, r3)     // Catch: java.lang.Throwable -> L1d
            goto L99
        L83:
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderMode r0 = com.mapbox.common.location.BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK     // Catch: java.lang.Throwable -> L1d
            r6.setCurrentMode(r0)     // Catch: java.lang.Throwable -> L1d
            com.mapbox.common.location.ProxyGoogleFusedLocationProviderClient r0 = r6.fusedLocationProviderClient     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "locationRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.lang.Throwable -> L1d
            com.mapbox.common.location.GoogleDeviceLocationProvider$locationCallback$1 r3 = r6.locationCallback     // Catch: java.lang.Throwable -> L1d
            android.os.Looper r4 = r6.createFusedLocationClientHandler()     // Catch: java.lang.Throwable -> L1d
            q4.j r1 = r0.requestLocationUpdates(r1, r3, r4)     // Catch: java.lang.Throwable -> L1d
        L99:
            if (r1 == 0) goto Lb4
            com.mapbox.common.location.GoogleDeviceLocationProvider$doStart$1 r0 = new com.mapbox.common.location.GoogleDeviceLocationProvider$doStart$1     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            com.mapbox.common.location.a r3 = new com.mapbox.common.location.a     // Catch: java.lang.Throwable -> L1d
            r4 = 2
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L1d
            q4.j r0 = r1.addOnSuccessListener(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto Lb4
            com.mapbox.common.location.b r1 = new com.mapbox.common.location.b     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2, r6)     // Catch: java.lang.Throwable -> L1d
            r0.addOnFailureListener(r1)     // Catch: java.lang.Throwable -> L1d
        Lb4:
            monitor-exit(r6)
            return
        Lb6:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.common.location.GoogleDeviceLocationProvider.doStart():void");
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public synchronized void doStop() {
        j removeLocationUpdates;
        String string2 = StubApp.getString2(13654);
        String string22 = StubApp.getString2(13655);
        synchronized (this) {
            try {
                MapboxCommonLogger.INSTANCE.logD$common_release(StubApp.getString2("13639"), string22 + getCurrentMode() + StubApp.getString2("13656") + this.state);
                int i3 = WhenMappings.$EnumSwitchMapping$1[getCurrentMode().ordinal()];
                if (i3 == 1) {
                    removeLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(this.locationCallback);
                } else if (i3 == 2) {
                    removeLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(getLocationUpdatePendingIntent());
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    removeLocationUpdates = new FailedTask(new Exception(string2 + getCurrentMode()));
                }
                if (removeLocationUpdates != null) {
                    j addOnSuccessListener = removeLocationUpdates.addOnSuccessListener(new a(1, new Function1<Void, Unit>() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider$doStop$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Void r12) {
                            invoke2(r12);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Void r52) {
                            MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
                            String str = StubApp.getString2(13641) + GoogleDeviceLocationProvider.this.state + StubApp.getString2(13638) + GoogleDeviceLocationProvider.this.getCurrentMode();
                            String string23 = StubApp.getString2(13639);
                            mapboxCommonLogger.logD$common_release(string23, str);
                            GoogleDeviceLocationProvider googleDeviceLocationProvider = GoogleDeviceLocationProvider.this;
                            if (googleDeviceLocationProvider.state == BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPING) {
                                googleDeviceLocationProvider.quitFusedLocationClientHandler();
                                GoogleDeviceLocationProvider.this.setCurrentMode(BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE);
                                GoogleDeviceLocationProvider.this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
                            } else {
                                mapboxCommonLogger.logD$common_release(string23, StubApp.getString2(13642) + GoogleDeviceLocationProvider.this.state);
                            }
                            LocationUpdatesReceiver.INSTANCE.removeDeviceLocationProvider$common_release(GoogleDeviceLocationProvider.this.getPersistentId());
                        }
                    }));
                    if (addOnSuccessListener != null) {
                        addOnSuccessListener.addOnFailureListener(new B(this, 4));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public List<Location> extractResult(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable.Creator<LocationResult> creator = LocationResult.CREATOR;
        LocationResult locationResult = null;
        locationResult = null;
        if (intent != null) {
            String string2 = StubApp.getString2(13657);
            boolean hasExtra = intent.hasExtra(string2);
            String string22 = StubApp.getString2(13658);
            if (hasExtra || intent.hasExtra(string22)) {
                Parcelable.Creator<LocationResult> creator2 = LocationResult.CREATOR;
                byte[] byteArrayExtra = intent.getByteArrayExtra(string22);
                locationResult = (LocationResult) (byteArrayExtra != null ? android.support.v4.media.session.b.n(byteArrayExtra, creator2) : null);
                if (locationResult == null) {
                    locationResult = (LocationResult) intent.getParcelableExtra(string2);
                }
            }
        }
        if (locationResult == null) {
            return CollectionsKt.emptyList();
        }
        List<android.location.Location> list = locationResult.f11798a;
        Intrinsics.checkNotNullExpressionValue(list, "locationResult.locations");
        ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
        for (android.location.Location location : list) {
            Intrinsics.checkNotNullExpressionValue(location, "location");
            arrayList.add(LocationServiceUtils.toCommonLocation(location));
        }
        return arrayList;
    }

    public final ProxyGoogleFusedLocationProviderClient getFusedLocationProviderClient() {
        return this.fusedLocationProviderClient;
    }

    @Override // com.mapbox.common.location.LocationProvider
    public Cancelable getLastLocation(GetLocationCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseDeviceLocationProvider.LocationCancelable locationCancelable = new BaseDeviceLocationProvider.LocationCancelable();
        j lastLocation = this.fusedLocationProviderClient.getLastLocation();
        if (lastLocation != null) {
            lastLocation.addOnCompleteListener(new b(locationCancelable, callback));
        }
        return locationCancelable;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public String getName() {
        return StubApp.getString2(13659);
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public int getPersistentId() {
        return this.persistentId;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        j removeLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(pendingIntent);
        if (removeLocationUpdates != null) {
            j addOnSuccessListener = removeLocationUpdates.addOnSuccessListener(new a(0, new Function1<Void, Unit>() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider$removeLocationUpdates$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Void r12) {
                    invoke2(r12);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Void r32) {
                    MapboxCommonLogger.INSTANCE.logD$common_release(StubApp.getString2(13639), StubApp.getString2(13644));
                }
            }));
            if (addOnSuccessListener != null) {
                addOnSuccessListener.addOnFailureListener(new i(27));
            }
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public void requestLocationUpdates(PendingIntent pendingIntent) {
        LocationRequest locationRequest;
        Expected<LocationError, LocationRequest> locationRequest2;
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        LocationProviderRequest request = getRequest();
        if (request == null || (locationRequest2 = LocationProviderSettingsExtKt.toLocationRequest(request)) == null || (locationRequest = locationRequest2.getValue()) == null) {
            locationRequest = LocationRequest.d();
        }
        ProxyGoogleFusedLocationProviderClient proxyGoogleFusedLocationProviderClient = this.fusedLocationProviderClient;
        Intrinsics.checkNotNullExpressionValue(locationRequest, "locationRequest");
        j requestLocationUpdates = proxyGoogleFusedLocationProviderClient.requestLocationUpdates(locationRequest, pendingIntent);
        if (requestLocationUpdates != null) {
            j addOnSuccessListener = requestLocationUpdates.addOnSuccessListener(new a(3, new Function1<Void, Unit>() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider$requestLocationUpdates$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Void r12) {
                    invoke2(r12);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Void r32) {
                    MapboxCommonLogger.INSTANCE.logD$common_release(StubApp.getString2(13639), StubApp.getString2(13645));
                }
            }));
            if (addOnSuccessListener != null) {
                addOnSuccessListener.addOnFailureListener(new i(28));
            }
        }
    }

    public final void setFusedLocationProviderClient(ProxyGoogleFusedLocationProviderClient proxyGoogleFusedLocationProviderClient) {
        Intrinsics.checkNotNullParameter(proxyGoogleFusedLocationProviderClient, "<set-?>");
        this.fusedLocationProviderClient = proxyGoogleFusedLocationProviderClient;
    }

    public String toString() {
        return StubApp.getString2(13660) + getPersistentId() + StubApp.getString2(13661) + getRequest() + ']';
    }
}
