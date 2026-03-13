package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.FeaturesetDescriptor;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPoi;", "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiState;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;", "importId", "", "(Ljava/lang/String;)V", "getImportId", "()Ljava/lang/String;", "equals", "", "other", "", "getFeatureState", "rawState", "Lcom/mapbox/bindgen/Value;", "getFeaturesetFeature", "feature", "Lcom/mapbox/geojson/Feature;", "featureNamespace", "hashCode", "", "toFeaturesetDescriptor", "Lcom/mapbox/maps/FeaturesetDescriptor;", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StandardPoi extends TypedFeaturesetDescriptor<StandardPoiState, StandardPoiFeature> {
    private final String importId;
    public static final String FEATURESET_ID = StubApp.getString2(14386);

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public StandardPoi() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(StandardPoi.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.maps.interactions.standard.generated.StandardPoi");
        return Intrinsics.areEqual(this.importId, ((StandardPoi) other).importId);
    }

    public final String getImportId() {
        return this.importId;
    }

    public int hashCode() {
        String str = this.importId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
    public FeaturesetDescriptor toFeaturesetDescriptor() {
        String str = this.importId;
        if (str == null) {
            str = StubApp.getString2(14379);
        }
        return new FeaturesetDescriptor(StubApp.getString2(14386), str, null);
    }

    public /* synthetic */ StandardPoi(String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str);
    }

    @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
    public StandardPoiState getFeatureState(Value rawState) {
        Intrinsics.checkNotNullParameter(rawState, "rawState");
        return new StandardPoiState(rawState);
    }

    @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
    public StandardPoiFeature getFeaturesetFeature(Feature feature, String featureNamespace, Value rawState) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(rawState, "rawState");
        String id = feature.id();
        return id != null ? new StandardPoiFeature(new FeaturesetFeatureId(id, featureNamespace), this.importId, feature, getFeatureState(rawState)) : new StandardPoiFeature(null, this.importId, feature, getFeatureState(rawState));
    }

    @JvmOverloads
    public StandardPoi(String str) {
        this.importId = str;
    }
}
