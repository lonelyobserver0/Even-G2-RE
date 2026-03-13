package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class d implements Expected.Action, QueryFeatureStateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FeatureStateCallback f12435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypedFeaturesetDescriptor f12436b;

    public /* synthetic */ d(FeatureStateCallback featureStateCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor) {
        this.f12435a = featureStateCallback;
        this.f12436b = typedFeaturesetDescriptor;
    }

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public void run(Expected expected) {
        MapboxMap.getFeatureState$lambda$34(this.f12435a, this.f12436b, expected);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.getFeatureState$lambda$34$lambda$33(this.f12435a, this.f12436b, (Value) obj);
    }
}
