package com.mapbox.maps;

import java.lang.ref.WeakReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class l implements StyleDataLoadedCallback, StyleLoadedCallback, StyleImageMissingCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f12451a;

    public /* synthetic */ l(WeakReference weakReference) {
        this.f12451a = weakReference;
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        Snapshotter._init_$lambda$5(this.f12451a, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        Snapshotter._init_$lambda$11(this.f12451a, styleImageMissing);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        Snapshotter._init_$lambda$9(this.f12451a, styleLoaded);
    }
}
