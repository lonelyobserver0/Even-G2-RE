package com.mapbox.maps.interactions;

import com.google.gson.JsonObject;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeatureState;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B3\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u001b\u0010\u0006\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/mapbox/maps/interactions/FeaturesetFeature;", "FS", "Lcom/mapbox/maps/interactions/FeatureState;", "", "id", "Lcom/mapbox/maps/FeaturesetFeatureId;", "descriptor", "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "state", "originalFeature", "Lcom/mapbox/geojson/Feature;", "(Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/geojson/Feature;)V", "getDescriptor", "()Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "geometry", "Lcom/mapbox/geojson/Geometry;", "getGeometry", "()Lcom/mapbox/geojson/Geometry;", "getId", "()Lcom/mapbox/maps/FeaturesetFeatureId;", "getOriginalFeature$sdk_base_release", "()Lcom/mapbox/geojson/Feature;", "properties", "Lorg/json/JSONObject;", "getProperties", "()Lorg/json/JSONObject;", "properties$delegate", "Lkotlin/Lazy;", "getState", "()Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/interactions/FeatureState;", "equals", "", "other", "hashCode", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FeaturesetFeature<FS extends FeatureState> {
    private final TypedFeaturesetDescriptor<FS, ?> descriptor;
    private final Geometry geometry;
    private final FeaturesetFeatureId id;
    private final Feature originalFeature;

    /* renamed from: properties$delegate, reason: from kotlin metadata */
    private final Lazy properties;
    private final FS state;

    public FeaturesetFeature(FeaturesetFeatureId featuresetFeatureId, TypedFeaturesetDescriptor<FS, ?> descriptor, FS state, Feature originalFeature) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(originalFeature, "originalFeature");
        this.id = featuresetFeatureId;
        this.descriptor = descriptor;
        this.state = state;
        this.originalFeature = originalFeature;
        Geometry geometry = originalFeature.geometry();
        Intrinsics.checkNotNull(geometry);
        this.geometry = geometry;
        this.properties = LazyKt.lazy(new Function0<JSONObject>(this) { // from class: com.mapbox.maps.interactions.FeaturesetFeature$properties$2
            final /* synthetic */ FeaturesetFeature<FS> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final JSONObject invoke() {
                JsonObject properties = this.this$0.getOriginalFeature().properties();
                return properties != null ? new JSONObject(properties.toString()) : new JSONObject();
            }
        });
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.maps.interactions.FeaturesetFeature<*>");
        FeaturesetFeature featuresetFeature = (FeaturesetFeature) other;
        return Intrinsics.areEqual(this.descriptor, featuresetFeature.descriptor) && Intrinsics.areEqual(this.originalFeature, featuresetFeature.originalFeature) && Intrinsics.areEqual(this.state, featuresetFeature.state) && Intrinsics.areEqual(this.id, featuresetFeature.id);
    }

    public final TypedFeaturesetDescriptor<FS, ?> getDescriptor() {
        return this.descriptor;
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public final FeaturesetFeatureId getId() {
        return this.id;
    }

    /* renamed from: getOriginalFeature$sdk_base_release, reason: from getter */
    public final Feature getOriginalFeature() {
        return this.originalFeature;
    }

    public final JSONObject getProperties() {
        return (JSONObject) this.properties.getValue();
    }

    public final FS getState() {
        return this.state;
    }

    public int hashCode() {
        return Objects.hash(this.descriptor, this.originalFeature, this.state, this.id);
    }
}
