package com.mapbox.maps.interactions;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.interactions.FeaturesetFeature;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\bç\u0080\u0001\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;", "FF", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "", "onQueryRenderedFeatures", "", "featuresetFeatures", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface QueryRenderedFeaturesetFeaturesCallback<FF extends FeaturesetFeature<?>> {
    void onQueryRenderedFeatures(List<? extends FF> featuresetFeatures);
}
