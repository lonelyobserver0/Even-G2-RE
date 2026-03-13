package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.FeaturesetFeature;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class e implements Expected.Action, QueryFeatureStateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FeatureStateCallback f12437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeaturesetFeature f12438b;

    public /* synthetic */ e(FeaturesetFeature featuresetFeature, FeatureStateCallback featureStateCallback) {
        this.f12437a = featureStateCallback;
        this.f12438b = featuresetFeature;
    }

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public void run(Expected expected) {
        MapboxMap.getFeatureState$lambda$30$lambda$29(this.f12437a, this.f12438b, expected);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.getFeatureState$lambda$30$lambda$29$lambda$28(this.f12437a, this.f12438b, (Value) obj);
    }
}
