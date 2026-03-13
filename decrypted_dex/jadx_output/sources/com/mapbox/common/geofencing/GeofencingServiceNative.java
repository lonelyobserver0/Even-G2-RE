package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.geojson.Feature;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0097 J\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fH\u0097 J\u0011\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0011H\u0097 J\u0019\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0015H\u0097 J\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0019H\u0097 J\u0011\u0010\u001a\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001bH\u0097 J\u0019\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u001dH\u0097 J\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u001fH\u0097 R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingServiceNative;", "Lcom/mapbox/common/geofencing/GeofencingService;", "nativePeer", "", "(J)V", "peer", "addFeature", "", "feature", "Lcom/mapbox/geojson/Feature;", "callback", "Lcom/mapbox/common/geofencing/AddFeatureCallback;", "addObserver", "observer", "Lcom/mapbox/common/geofencing/GeofencingObserver;", "Lcom/mapbox/common/geofencing/AddObserverCallback;", "clearFeatures", "Lcom/mapbox/common/geofencing/ClearFeaturesCallback;", "configure", "options", "Lcom/mapbox/common/geofencing/GeofencingOptions;", "Lcom/mapbox/common/geofencing/ConfigureCallback;", "getFeature", "identifier", "", "Lcom/mapbox/common/geofencing/GetFeatureCallback;", "getOptions", "Lcom/mapbox/common/geofencing/GetOptionsCallback;", "removeFeature", "Lcom/mapbox/common/geofencing/RemoveFeatureCallback;", "removeObserver", "Lcom/mapbox/common/geofencing/RemoveObserverCallback;", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GeofencingServiceNative implements GeofencingService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0083 ¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingServiceNative$Companion;", "", "()V", "cleanNativePeer", "", "peer", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void cleanNativePeer(long peer) {
            GeofencingServiceNative.cleanNativePeer(peer);
        }

        private Companion() {
        }
    }

    private GeofencingServiceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new a(j, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(long j) {
        INSTANCE.cleanNativePeer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native void cleanNativePeer(long j);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void addFeature(Feature feature, AddFeatureCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void addObserver(GeofencingObserver observer, AddObserverCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void clearFeatures(ClearFeaturesCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void configure(GeofencingOptions options, ConfigureCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void getFeature(String identifier, GetFeatureCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void getOptions(GetOptionsCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void removeFeature(String identifier, RemoveFeatureCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void removeObserver(GeofencingObserver observer, RemoveObserverCallback callback);
}
