package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class i implements Expected.Transformer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f12444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraOptions f12445c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EdgeInsets f12446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Double f12447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ScreenCoordinate f12448f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MapboxMap f12449g;

    public /* synthetic */ i(List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d8, ScreenCoordinate screenCoordinate, MapboxMap mapboxMap, int i3) {
        this.f12443a = i3;
        this.f12444b = list;
        this.f12445c = cameraOptions;
        this.f12446d = edgeInsets;
        this.f12447e = d8;
        this.f12448f = screenCoordinate;
        this.f12449g = mapboxMap;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public final Object invoke(Object obj) {
        CameraOptions invoke$lambda$1;
        CameraOptions cameraForCoordinates$lambda$17;
        switch (this.f12443a) {
            case 0:
                Double d8 = this.f12447e;
                ScreenCoordinate screenCoordinate = this.f12448f;
                invoke$lambda$1 = MapboxMap$cameraForCoordinates$3.invoke$lambda$1(this.f12444b, this.f12445c, this.f12446d, d8, screenCoordinate, this.f12449g, (String) obj);
                return invoke$lambda$1;
            default:
                Double d10 = this.f12447e;
                ScreenCoordinate screenCoordinate2 = this.f12448f;
                cameraForCoordinates$lambda$17 = MapboxMap.cameraForCoordinates$lambda$17(this.f12444b, this.f12445c, this.f12446d, d10, screenCoordinate2, this.f12449g, (String) obj);
                return cameraForCoordinates$lambda$17;
        }
    }
}
