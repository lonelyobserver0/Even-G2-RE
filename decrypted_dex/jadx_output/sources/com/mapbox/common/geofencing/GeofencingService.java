package com.mapbox.common.geofencing;

import com.mapbox.geojson.Feature;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\rH'J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0011H'J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0015H'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0017H'J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0019H'J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u001bH'¨\u0006\u001c"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingService;", "", "addFeature", "", "feature", "Lcom/mapbox/geojson/Feature;", "callback", "Lcom/mapbox/common/geofencing/AddFeatureCallback;", "addObserver", "observer", "Lcom/mapbox/common/geofencing/GeofencingObserver;", "Lcom/mapbox/common/geofencing/AddObserverCallback;", "clearFeatures", "Lcom/mapbox/common/geofencing/ClearFeaturesCallback;", "configure", "options", "Lcom/mapbox/common/geofencing/GeofencingOptions;", "Lcom/mapbox/common/geofencing/ConfigureCallback;", "getFeature", "identifier", "", "Lcom/mapbox/common/geofencing/GetFeatureCallback;", "getOptions", "Lcom/mapbox/common/geofencing/GetOptionsCallback;", "removeFeature", "Lcom/mapbox/common/geofencing/RemoveFeatureCallback;", "removeObserver", "Lcom/mapbox/common/geofencing/RemoveObserverCallback;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface GeofencingService {
    void addFeature(Feature feature, AddFeatureCallback callback);

    void addObserver(GeofencingObserver observer, AddObserverCallback callback);

    void clearFeatures(ClearFeaturesCallback callback);

    void configure(GeofencingOptions options, ConfigureCallback callback);

    void getFeature(String identifier, GetFeatureCallback callback);

    void getOptions(GetOptionsCallback callback);

    void removeFeature(String identifier, RemoveFeatureCallback callback);

    void removeObserver(GeofencingObserver observer, RemoveObserverCallback callback);
}
