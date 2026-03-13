package com.mapbox.common.location;

import com.mapbox.bindgen.Expected;
import com.stub.StubApp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J2\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH&J(\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\rH&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&¨\u0006\u001b"}, d2 = {"Lcom/mapbox/common/location/LocationService;", "", "getAccuracyAuthorization", "Lcom/mapbox/common/location/AccuracyAuthorization;", "getDeviceLocationProvider", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/LocationError;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "type", "Lcom/mapbox/common/location/DeviceLocationProviderType;", "request", "Lcom/mapbox/common/location/LocationProviderRequest;", "allowUserDefined", "", "extendedParameters", "Lcom/mapbox/common/location/ExtendedLocationProviderParameters;", "getPermissionStatus", "Lcom/mapbox/common/location/PermissionStatus;", "isAvailable", "registerObserver", "", "observer", "Lcom/mapbox/common/location/LocationServiceObserver;", "setUserDefinedDeviceLocationProviderFactory", "factory", "Lcom/mapbox/common/location/DeviceLocationProviderFactory;", "unregisterObserver", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface LocationService {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Expected getDeviceLocationProvider$default(LocationService locationService, LocationProviderRequest locationProviderRequest, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(StubApp.getString2(13683));
            }
            if ((i3 & 1) != 0) {
                locationProviderRequest = null;
            }
            return locationService.getDeviceLocationProvider(locationProviderRequest);
        }

        public static /* synthetic */ Expected getDeviceLocationProvider$default(LocationService locationService, DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, boolean z2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(StubApp.getString2(13683));
            }
            if ((i3 & 2) != 0) {
                locationProviderRequest = null;
            }
            if ((i3 & 4) != 0) {
                z2 = true;
            }
            return locationService.getDeviceLocationProvider(deviceLocationProviderType, locationProviderRequest, z2);
        }

        public static /* synthetic */ Expected getDeviceLocationProvider$default(LocationService locationService, ExtendedLocationProviderParameters extendedLocationProviderParameters, LocationProviderRequest locationProviderRequest, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(StubApp.getString2(13683));
            }
            if ((i3 & 2) != 0) {
                locationProviderRequest = null;
            }
            return locationService.getDeviceLocationProvider(extendedLocationProviderParameters, locationProviderRequest);
        }
    }

    AccuracyAuthorization getAccuracyAuthorization();

    Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(DeviceLocationProviderType type, LocationProviderRequest request, boolean allowUserDefined);

    Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(ExtendedLocationProviderParameters extendedParameters, LocationProviderRequest request);

    Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(LocationProviderRequest request);

    PermissionStatus getPermissionStatus();

    boolean isAvailable();

    void registerObserver(LocationServiceObserver observer);

    void setUserDefinedDeviceLocationProviderFactory(DeviceLocationProviderFactory factory);

    void unregisterObserver(LocationServiceObserver observer);
}
