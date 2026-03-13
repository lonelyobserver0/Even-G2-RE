package com.mapbox.maps.interactions.standard.generated;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsFeature;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsState;", "id", "Lcom/mapbox/maps/FeaturesetFeatureId;", "importId", "", "originalFeature", "Lcom/mapbox/geojson/Feature;", "state", "(Lcom/mapbox/maps/FeaturesetFeatureId;Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsState;)V", "landmarkId", "getLandmarkId", "()Ljava/lang/String;", "name", "getName", "nameEn", "getNameEn", "shortName", "getShortName", "shortNameEn", "getShortNameEn", "type", "getType", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StandardLandmarkIconsFeature extends FeaturesetFeature<StandardLandmarkIconsState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardLandmarkIconsFeature(FeaturesetFeatureId featuresetFeatureId, String str, Feature originalFeature, StandardLandmarkIconsState state) {
        super(featuresetFeatureId, new StandardLandmarkIcons(str), state, originalFeature);
        Intrinsics.checkNotNullParameter(originalFeature, "originalFeature");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public final String getLandmarkId() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(290));
    }

    public final String getName() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
    }

    public final String getNameEn() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(14387));
    }

    public final String getShortName() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(14388));
    }

    public final String getShortNameEn() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(14389));
    }

    public final String getType() {
        return getOriginalFeature().getStringProperty(StubApp.getString2(660));
    }
}
