package com.mapbox.maps;

import com.mapbox.common.geofencing.GeofencingUtils;
import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/MapGeofencingConsentImpl;", "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "()V", "getUserConsent", "", "setUserConsent", "", "isConsentGiven", "callback", "Lcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;", "shouldShowConsent", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapGeofencingConsentImpl implements MapGeofencingConsent {
    @Override // com.mapbox.maps.geofencing.MapGeofencingConsent
    public boolean getUserConsent() {
        return GeofencingUtils.INSTANCE.getUserConsent();
    }

    @Override // com.mapbox.maps.geofencing.MapGeofencingConsent
    public void setUserConsent(boolean isConsentGiven, GeofencingUtilsUserConsentResponseCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        GeofencingUtils.INSTANCE.setUserConsent(isConsentGiven, callback);
    }

    @Override // com.mapbox.maps.geofencing.MapGeofencingConsent
    public boolean shouldShowConsent() {
        GeofencingUtils.Companion companion = GeofencingUtils.INSTANCE;
        return !companion.getUserConsent() || companion.isActive();
    }
}
