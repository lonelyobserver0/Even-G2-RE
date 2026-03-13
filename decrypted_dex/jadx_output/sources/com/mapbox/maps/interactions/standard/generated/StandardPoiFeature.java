package com.mapbox.maps.interactions.standard.generated;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiState;", "id", "Lcom/mapbox/maps/FeaturesetFeatureId;", "importId", "", "originalFeature", "Lcom/mapbox/geojson/Feature;", "state", "(Lcom/mapbox/maps/FeaturesetFeatureId;Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lcom/mapbox/maps/interactions/standard/generated/StandardPoiState;)V", "airportRef", "getAirportRef", "()Ljava/lang/String;", "class", "getClass", "geometry", "Lcom/mapbox/geojson/Point;", "getGeometry", "()Lcom/mapbox/geojson/Point;", "group", "getGroup", "maki", "getMaki", "name", "getName", "transitMode", "getTransitMode", "transitNetwork", "getTransitNetwork", "transitStopType", "getTransitStopType", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StandardPoiFeature extends FeaturesetFeature<StandardPoiState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardPoiFeature(FeaturesetFeatureId featuresetFeatureId, String str, Feature originalFeature, StandardPoiState state) {
        super(featuresetFeatureId, new StandardPoi(str), state, originalFeature);
        Intrinsics.checkNotNullParameter(originalFeature, "originalFeature");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public final String getAirportRef() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(14393));
    }

    public final String getClass() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(11020));
    }

    public final String getGroup() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(663));
    }

    public final String getMaki() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(2070));
    }

    public final String getName() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
    }

    public final String getTransitMode() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(14394));
    }

    public final String getTransitNetwork() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(14395));
    }

    public final String getTransitStopType() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(14396));
    }

    @Override // com.mapbox.maps.interactions.FeaturesetFeature
    public Point getGeometry() {
        Geometry geometry = super.getGeometry();
        Intrinsics.checkNotNull(geometry, "null cannot be cast to non-null type com.mapbox.geojson.Point");
        return (Point) geometry;
    }
}
