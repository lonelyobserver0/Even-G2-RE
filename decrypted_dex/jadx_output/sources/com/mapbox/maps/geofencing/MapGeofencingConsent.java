package com.mapbox.maps.geofencing;

import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.maps.MapboxExperimental;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\u0003H'¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "", "getUserConsent", "", "setUserConsent", "", "isConsentGiven", "callback", "Lcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;", "shouldShowConsent", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface MapGeofencingConsent {
    @MapboxExperimental
    boolean getUserConsent();

    @MapboxExperimental
    void setUserConsent(boolean isConsentGiven, GeofencingUtilsUserConsentResponseCallback callback);

    @MapboxExperimental
    boolean shouldShowConsent();
}
