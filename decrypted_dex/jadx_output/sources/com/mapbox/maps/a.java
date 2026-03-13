package com.mapbox.maps;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements CameraChangedCoalescedCallback, StyleDataLoadedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapController f12425a;

    public /* synthetic */ a(MapController mapController) {
        this.f12425a = mapController;
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced cameraChangedCoalesced) {
        MapController._init_$lambda$0(this.f12425a, cameraChangedCoalesced);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        MapController._init_$lambda$2(this.f12425a, styleDataLoaded);
    }
}
