package com.mapbox.common.location;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.location.BaseDeviceLocationProvider;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\n\b\u0000\u0018\u0000 12\u00020\u0001:\u000212B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0015J\b\u0010\u001e\u001a\u00020\u001cH\u0015J\b\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0017J\n\u0010*\u001a\u0004\u0018\u00010\u0007H\u0007J\n\u0010+\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H\u0017J\b\u00100\u001a\u00020\u0007H\u0016R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/mapbox/common/location/AndroidDeviceLocationProvider;", "Lcom/mapbox/common/location/BaseDeviceLocationProvider;", "context", "Landroid/content/Context;", "request", "Lcom/mapbox/common/location/LocationProviderRequest;", "locationProviderName", "", "(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;Ljava/lang/String;)V", "locationListener", "com/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1", "Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1;", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "locationManager$delegate", "Lkotlin/Lazy;", "locationManagerHandlerThread", "Landroid/os/HandlerThread;", "persistentId", "", "getPersistentId$annotations", "()V", "getPersistentId", "()I", "providerName", "createLocationManagerWithHandlerThread", "", "doStart", "doStop", "extractAttributesFromRequest", "Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;", "extractResult", "", "Lcom/mapbox/common/location/Location;", "intent", "Landroid/content/Intent;", "getLastLocation", "Lcom/mapbox/common/Cancelable;", "callback", "Lcom/mapbox/common/location/GetLocationCallback;", "getLocationProviderName", "getName", "removeLocationUpdates", "pendingIntent", "Landroid/app/PendingIntent;", "requestLocationUpdates", "toString", "Companion", "LocationRequestAttributes", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AndroidDeviceLocationProvider extends BaseDeviceLocationProvider {
    private final AndroidDeviceLocationProvider$locationListener$1 locationListener;

    /* renamed from: locationManager$delegate, reason: from kotlin metadata */
    private final Lazy locationManager;
    private HandlerThread locationManagerHandlerThread;
    private final String locationProviderName;
    private final int persistentId;
    private final String providerName;

    @Deprecated
    private static final String TAG = StubApp.getString2(13604);
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/location/AndroidDeviceLocationProvider$Companion;", "", "()V", "TAG", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;", "", "criteria", "Landroid/location/Criteria;", "minInterval", "", "minDisplacement", "", "(Landroid/location/Criteria;JF)V", "getCriteria", "()Landroid/location/Criteria;", "getMinDisplacement", "()F", "getMinInterval", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class LocationRequestAttributes {
        private final Criteria criteria;
        private final float minDisplacement;
        private final long minInterval;

        public LocationRequestAttributes(Criteria criteria, long j, float f10) {
            Intrinsics.checkNotNullParameter(criteria, "criteria");
            this.criteria = criteria;
            this.minInterval = j;
            this.minDisplacement = f10;
        }

        public static /* synthetic */ LocationRequestAttributes copy$default(LocationRequestAttributes locationRequestAttributes, Criteria criteria, long j, float f10, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                criteria = locationRequestAttributes.criteria;
            }
            if ((i3 & 2) != 0) {
                j = locationRequestAttributes.minInterval;
            }
            if ((i3 & 4) != 0) {
                f10 = locationRequestAttributes.minDisplacement;
            }
            return locationRequestAttributes.copy(criteria, j, f10);
        }

        /* renamed from: component1, reason: from getter */
        public final Criteria getCriteria() {
            return this.criteria;
        }

        /* renamed from: component2, reason: from getter */
        public final long getMinInterval() {
            return this.minInterval;
        }

        /* renamed from: component3, reason: from getter */
        public final float getMinDisplacement() {
            return this.minDisplacement;
        }

        public final LocationRequestAttributes copy(Criteria criteria, long minInterval, float minDisplacement) {
            Intrinsics.checkNotNullParameter(criteria, "criteria");
            return new LocationRequestAttributes(criteria, minInterval, minDisplacement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationRequestAttributes)) {
                return false;
            }
            LocationRequestAttributes locationRequestAttributes = (LocationRequestAttributes) other;
            return Intrinsics.areEqual(this.criteria, locationRequestAttributes.criteria) && this.minInterval == locationRequestAttributes.minInterval && Float.compare(this.minDisplacement, locationRequestAttributes.minDisplacement) == 0;
        }

        public final Criteria getCriteria() {
            return this.criteria;
        }

        public final float getMinDisplacement() {
            return this.minDisplacement;
        }

        public final long getMinInterval() {
            return this.minInterval;
        }

        public int hashCode() {
            return Float.hashCode(this.minDisplacement) + com.mapbox.common.b.b(this.criteria.hashCode() * 31, 31, this.minInterval);
        }

        public String toString() {
            return StubApp.getString2(13601) + this.criteria + StubApp.getString2(13602) + this.minInterval + StubApp.getString2(13603) + this.minDisplacement + ')';
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
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BaseDeviceLocationProvider.DeviceLocationProviderMode.values().length];
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.mapbox.common.location.AndroidDeviceLocationProvider$locationListener$1] */
    public AndroidDeviceLocationProvider(final Context context, LocationProviderRequest locationProviderRequest, String str) {
        super(context, locationProviderRequest);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locationProviderName = str;
        if (str == null) {
            str = null;
            if ((locationProviderRequest != null ? locationProviderRequest.getAccuracy() : null) == AccuracyLevel.PASSIVE) {
                str = StubApp.getString2(1094);
            }
        }
        this.providerName = str;
        this.locationManager = LazyKt.lazy(new Function0<LocationManager>() { // from class: com.mapbox.common.location.AndroidDeviceLocationProvider$locationManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LocationManager invoke() {
                Object systemService = context.getSystemService(StubApp.getString2(662));
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                return (LocationManager) systemService;
            }
        });
        this.locationListener = new LocationListener() { // from class: com.mapbox.common.location.AndroidDeviceLocationProvider$locationListener$1
            @Override // android.location.LocationListener
            public void onLocationChanged(android.location.Location location) {
                Intrinsics.checkNotNullParameter(location, "location");
                AndroidDeviceLocationProvider.this.notifyLocationUpdate(CollectionsKt.arrayListOf(LocationServiceUtils.toCommonLocation(location)));
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
            }

            @Override // android.location.LocationListener
            @Deprecated(message = "Deprecated in Java")
            public void onStatusChanged(String provider, int status, Bundle extras) {
            }
        };
        this.persistentId = Objects.hash(DeviceLocationProviderType.ANDROID.name(), str, String.valueOf(locationProviderRequest));
    }

    private final void createLocationManagerWithHandlerThread() {
        this.locationManagerHandlerThread = new HandlerThread(StubApp.getString2(13605));
    }

    private final LocationRequestAttributes extractAttributesFromRequest() {
        Criteria criteria;
        Long l9;
        Float valueOf;
        IntervalSettings interval;
        Expected<LocationError, Criteria> criteria2;
        LocationProviderRequest request = getRequest();
        if (request == null || (criteria2 = LocationProviderSettingsExtKt.toCriteria(request)) == null || (criteria = criteria2.getValue()) == null) {
            criteria = new Criteria();
        }
        LocationProviderRequest request2 = getRequest();
        if (request2 == null || (interval = request2.getInterval()) == null || (l9 = interval.getMinimumInterval()) == null) {
            l9 = 1000L;
        }
        long longValue = l9.longValue();
        LocationProviderRequest request3 = getRequest();
        if (request3 == null || (valueOf = request3.getDisplacement()) == null) {
            valueOf = Float.valueOf(0.0f);
        }
        return new LocationRequestAttributes(criteria, longValue, valueOf.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$2(BaseDeviceLocationProvider.LocationCancelable cancelable, final GetLocationCallback callback, final android.location.Location location) {
        Intrinsics.checkNotNullParameter(cancelable, "$cancelable");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        cancelable.invokeIfNotCanceled(new Function0<Unit>() { // from class: com.mapbox.common.location.AndroidDeviceLocationProvider$getLastLocation$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GetLocationCallback.this.run(LocationServiceUtils.toCommonLocation(location));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$3(BaseDeviceLocationProvider.LocationCancelable cancelable, final GetLocationCallback callback) {
        Intrinsics.checkNotNullParameter(cancelable, "$cancelable");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        cancelable.invokeIfNotCanceled(new Function0<Unit>() { // from class: com.mapbox.common.location.AndroidDeviceLocationProvider$getLastLocation$2$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GetLocationCallback.this.run(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$4(BaseDeviceLocationProvider.LocationCancelable cancelable, final GetLocationCallback callback) {
        Intrinsics.checkNotNullParameter(cancelable, "$cancelable");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        cancelable.invokeIfNotCanceled(new Function0<Unit>() { // from class: com.mapbox.common.location.AndroidDeviceLocationProvider$getLastLocation$3$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GetLocationCallback.this.run(null);
            }
        });
    }

    private final LocationManager getLocationManager() {
        return (LocationManager) this.locationManager.getValue();
    }

    public static /* synthetic */ void getPersistentId$annotations() {
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    @SuppressLint({"MissingPermission"})
    public synchronized void doStart() {
        BaseDeviceLocationProvider.DeviceLocationProviderMode deviceLocationProviderMode;
        MapboxCommonLogger mapboxCommonLogger;
        String string2 = StubApp.getString2(13606);
        String string22 = StubApp.getString2(13607);
        synchronized (this) {
            createLocationManagerWithHandlerThread();
            LocationRequestAttributes extractAttributesFromRequest = extractAttributesFromRequest();
            Criteria criteria = extractAttributesFromRequest.getCriteria();
            long minInterval = extractAttributesFromRequest.getMinInterval();
            float minDisplacement = extractAttributesFromRequest.getMinDisplacement();
            PermissionStatus permissionStatus = LocationServiceUtils.getPermissionStatus(getContext());
            MapboxCommonLogger mapboxCommonLogger2 = MapboxCommonLogger.INSTANCE;
            mapboxCommonLogger2.logD$common_release(StubApp.getString2("13604"), string22 + permissionStatus);
            BaseDeviceLocationProvider.DeviceLocationProviderMode deviceLocationProviderMode2 = BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE;
            int i3 = WhenMappings.$EnumSwitchMapping$0[permissionStatus.ordinal()];
            if (i3 == 1 || i3 == 2) {
                deviceLocationProviderMode = BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK;
                HandlerThread handlerThread = this.locationManagerHandlerThread;
                if (handlerThread != null) {
                    handlerThread.start();
                }
                if (this.providerName != null) {
                    Looper looper = null;
                    LocationManager locationManager = getLocationManager();
                    String str = this.providerName;
                    AndroidDeviceLocationProvider$locationListener$1 androidDeviceLocationProvider$locationListener$1 = this.locationListener;
                    HandlerThread handlerThread2 = this.locationManagerHandlerThread;
                    if (handlerThread2 != null) {
                        looper = handlerThread2.getLooper();
                    }
                    locationManager.requestLocationUpdates(str, minInterval, minDisplacement, androidDeviceLocationProvider$locationListener$1, looper);
                    mapboxCommonLogger = mapboxCommonLogger2;
                } else {
                    Looper looper2 = null;
                    LocationManager locationManager2 = getLocationManager();
                    AndroidDeviceLocationProvider$locationListener$1 androidDeviceLocationProvider$locationListener$12 = this.locationListener;
                    HandlerThread handlerThread3 = this.locationManagerHandlerThread;
                    if (handlerThread3 != null) {
                        looper2 = handlerThread3.getLooper();
                    }
                    mapboxCommonLogger = mapboxCommonLogger2;
                    locationManager2.requestLocationUpdates(minInterval, minDisplacement, criteria, androidDeviceLocationProvider$locationListener$12, looper2);
                }
            } else {
                if (i3 != 3) {
                    this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
                    return;
                }
                deviceLocationProviderMode = BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT;
                if (this.providerName != null) {
                    getLocationManager().requestLocationUpdates(this.providerName, minInterval, minDisplacement, getLocationUpdatePendingIntent());
                } else {
                    getLocationManager().requestLocationUpdates(minInterval, minDisplacement, criteria, getLocationUpdatePendingIntent());
                }
                mapboxCommonLogger = mapboxCommonLogger2;
            }
            setCurrentMode(deviceLocationProviderMode);
            this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STARTED;
            mapboxCommonLogger.logD$common_release(StubApp.getString2("13604"), string2 + getCurrentMode());
            if (permissionStatus == PermissionStatus.BACKGROUND) {
                LocationUpdatesReceiver.INSTANCE.addDeviceLocationProvider$common_release(getPersistentId(), this);
            }
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    @SuppressLint({"MissingPermission"})
    public synchronized void doStop() {
        String string2 = StubApp.getString2(13608);
        synchronized (this) {
            try {
                int i3 = WhenMappings.$EnumSwitchMapping$1[getCurrentMode().ordinal()];
                if (i3 == 1) {
                    getLocationManager().removeUpdates(this.locationListener);
                    HandlerThread handlerThread = this.locationManagerHandlerThread;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                } else if (i3 == 2) {
                    getLocationManager().removeUpdates(getLocationUpdatePendingIntent());
                    LocationUpdatesReceiver.INSTANCE.removeDeviceLocationProvider$common_release(getPersistentId());
                } else if (i3 == 3) {
                    MapboxCommonLogger.INSTANCE.logE$common_release(StubApp.getString2("13604"), string2 + getCurrentMode());
                }
                this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public List<Location> extractResult(Intent intent) {
        Bundle extras;
        Intrinsics.checkNotNullParameter(intent, "intent");
        String string2 = StubApp.getString2(662);
        if (!intent.hasExtra(string2) || (extras = intent.getExtras()) == null) {
            return CollectionsKt.emptyList();
        }
        Object obj = extras.get(string2);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.location.Location");
        return CollectionsKt.listOf(LocationServiceUtils.toCommonLocation((android.location.Location) obj));
    }

    @Override // com.mapbox.common.location.LocationProvider
    @SuppressLint({"MissingPermission"})
    public Cancelable getLastLocation(GetLocationCallback callback) {
        Object obj;
        String string2 = StubApp.getString2(13609);
        String string22 = StubApp.getString2(13604);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Handler handler = new Handler(Looper.getMainLooper());
        BaseDeviceLocationProvider.LocationCancelable locationCancelable = new BaseDeviceLocationProvider.LocationCancelable();
        try {
            List<String> allProviders = getLocationManager().getAllProviders();
            Intrinsics.checkNotNullExpressionValue(allProviders, "locationManager.allProviders");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = allProviders.iterator();
            while (it.hasNext()) {
                android.location.Location lastKnownLocation = getLocationManager().getLastKnownLocation((String) it.next());
                if (lastKnownLocation != null) {
                    arrayList.add(lastKnownLocation);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    long millis = TimeUnit.NANOSECONDS.toMillis(((android.location.Location) next).getElapsedRealtimeNanos());
                    do {
                        Object next2 = it2.next();
                        long millis2 = TimeUnit.NANOSECONDS.toMillis(((android.location.Location) next2).getElapsedRealtimeNanos());
                        if (millis < millis2) {
                            next = next2;
                            millis = millis2;
                        }
                    } while (it2.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            android.location.Location location = (android.location.Location) obj;
            if (location != null) {
                handler.post(new c(locationCancelable, callback, location, 1));
                return locationCancelable;
            }
            LocationError locationError = new LocationError(LocationErrorCode.NOT_AVAILABLE, StubApp.getString2("13610"));
            MapboxCommonLogger.INSTANCE.logW$common_release(string22, string2 + locationError.getMessage());
            handler.post(new d(1, locationCancelable, callback));
            return locationCancelable;
        } catch (Exception e10) {
            MapboxCommonLogger.INSTANCE.logW$common_release(string22, string2 + e10.getMessage());
            handler.post(new d(2, locationCancelable, callback));
            return locationCancelable;
        }
    }

    public final String getLocationProviderName() {
        return this.locationProviderName;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public String getName() {
        return StubApp.getString2(13611);
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public int getPersistentId() {
        return this.persistentId;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        getLocationManager().removeUpdates(pendingIntent);
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    @SuppressLint({"MissingPermission"})
    public void requestLocationUpdates(PendingIntent pendingIntent) {
        String str;
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        LocationRequestAttributes extractAttributesFromRequest = extractAttributesFromRequest();
        Criteria criteria = extractAttributesFromRequest.getCriteria();
        long minInterval = extractAttributesFromRequest.getMinInterval();
        float minDisplacement = extractAttributesFromRequest.getMinDisplacement();
        String string2 = StubApp.getString2(1094);
        if (criteria != null) {
            String bestProvider = getLocationManager().getBestProvider(criteria, true);
            if (bestProvider != null) {
                str = bestProvider;
                getLocationManager().requestLocationUpdates(str, minInterval, minDisplacement, pendingIntent);
            }
            MapboxCommonLogger.INSTANCE.logW$common_release(StubApp.getString2(13604), StubApp.getString2(13612) + criteria + StubApp.getString2(13613));
        }
        str = string2;
        getLocationManager().requestLocationUpdates(str, minInterval, minDisplacement, pendingIntent);
    }

    public String toString() {
        return StubApp.getString2(13614) + getPersistentId() + StubApp.getString2(13615) + this.locationProviderName + StubApp.getString2(13616) + getRequest() + ']';
    }
}
