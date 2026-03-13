package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002!\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\tH\u0096 J.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001f\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0097 J\t\u0010\u0016\u001a\u00020\u0017H\u0096 J\t\u0010\u0018\u001a\u00020\u0013H\u0096 J\u0011\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096 J\u0013\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096 J\u0011\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006#"}, d2 = {"Lcom/mapbox/common/location/LocationServiceNative;", "Lcom/mapbox/common/location/LocationService;", "peer", "", "(J)V", "getPeer", "()J", "setPeer", "getAccuracyAuthorization", "Lcom/mapbox/common/location/AccuracyAuthorization;", "getDeviceLocationProvider", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/LocationError;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "type", "Lcom/mapbox/common/location/DeviceLocationProviderType;", "request", "Lcom/mapbox/common/location/LocationProviderRequest;", "allowUserDefined", "", "extendedParameters", "Lcom/mapbox/common/location/ExtendedLocationProviderParameters;", "getPermissionStatus", "Lcom/mapbox/common/location/PermissionStatus;", "isAvailable", "registerObserver", "", "observer", "Lcom/mapbox/common/location/LocationServiceObserver;", "setUserDefinedDeviceLocationProviderFactory", "factory", "Lcom/mapbox/common/location/DeviceLocationProviderFactory;", "unregisterObserver", "Companion", "LocationServicePeerCleaner", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LocationServiceNative implements LocationService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0087 ¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/LocationServiceNative$Companion;", "", "()V", "cleanNativePeer", "", "peer", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void cleanNativePeer(long peer) {
            LocationServiceNative.cleanNativePeer(peer);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/LocationServiceNative$LocationServicePeerCleaner;", "Ljava/lang/Runnable;", "peer", "", "(J)V", "run", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class LocationServicePeerCleaner implements Runnable {
        private final long peer;

        public LocationServicePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationServiceNative.INSTANCE.cleanNativePeer(this.peer);
        }
    }

    public LocationServiceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LocationServicePeerCleaner(j));
    }

    @JvmStatic
    public static final native void cleanNativePeer(long j);

    @Override // com.mapbox.common.location.LocationService
    public native AccuracyAuthorization getAccuracyAuthorization();

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(DeviceLocationProviderType type, LocationProviderRequest request, boolean allowUserDefined) {
        Intrinsics.checkNotNullParameter(type, "type");
        throw new RuntimeException(StubApp.getString2(13692));
    }

    @Override // com.mapbox.common.location.LocationService
    public native Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(LocationProviderRequest request);

    public final long getPeer() {
        return this.peer;
    }

    @Override // com.mapbox.common.location.LocationService
    public native PermissionStatus getPermissionStatus();

    @Override // com.mapbox.common.location.LocationService
    public native boolean isAvailable();

    @Override // com.mapbox.common.location.LocationService
    public native void registerObserver(LocationServiceObserver observer);

    public final void setPeer(long j) {
        this.peer = j;
    }

    @Override // com.mapbox.common.location.LocationService
    public native void setUserDefinedDeviceLocationProviderFactory(DeviceLocationProviderFactory factory);

    @Override // com.mapbox.common.location.LocationService
    public native void unregisterObserver(LocationServiceObserver observer);

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(ExtendedLocationProviderParameters extendedParameters, LocationProviderRequest request) {
        Intrinsics.checkNotNullParameter(extendedParameters, "extendedParameters");
        throw new RuntimeException(StubApp.getString2(13692));
    }
}
