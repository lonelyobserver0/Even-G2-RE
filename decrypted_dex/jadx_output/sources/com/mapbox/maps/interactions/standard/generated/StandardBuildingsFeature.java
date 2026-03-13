package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.geojson.Feature;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsFeature;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsState;", "id", "Lcom/mapbox/maps/FeaturesetFeatureId;", "importId", "", "originalFeature", "Lcom/mapbox/geojson/Feature;", "state", "(Lcom/mapbox/maps/FeaturesetFeatureId;Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsState;)V", "group", "getGroup", "()Ljava/lang/String;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StandardBuildingsFeature extends FeaturesetFeature<StandardBuildingsState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardBuildingsFeature(FeaturesetFeatureId featuresetFeatureId, String str, Feature originalFeature, StandardBuildingsState state) {
        super(featuresetFeatureId, new StandardBuildings(str), state, originalFeature);
        Intrinsics.checkNotNullParameter(originalFeature, "originalFeature");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public final String getGroup() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(663));
    }
}
