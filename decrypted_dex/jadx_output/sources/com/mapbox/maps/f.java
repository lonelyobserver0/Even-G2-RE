package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.interactions.QueryRenderedFeaturesetFeaturesCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class f implements QueryRenderedFeaturesCallback, Expected.Action {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ QueryRenderedFeaturesetFeaturesCallback f12439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypedFeaturesetDescriptor f12440b;

    public /* synthetic */ f(TypedFeaturesetDescriptor typedFeaturesetDescriptor, QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback) {
        this.f12439a = queryRenderedFeaturesetFeaturesCallback;
        this.f12440b = typedFeaturesetDescriptor;
    }

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        MapboxMap.queryRenderedFeatures$lambda$44(this.f12439a, this.f12440b, expected);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.queryRenderedFeatures$lambda$44$lambda$43(this.f12439a, this.f12440b, (List) obj);
    }
}
