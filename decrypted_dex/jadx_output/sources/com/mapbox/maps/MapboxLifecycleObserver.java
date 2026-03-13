package com.mapbox.maps;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/MapboxLifecycleObserver;", "", "onDestroy", "", "onLowMemory", "onResume", "onStart", "onStop", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface MapboxLifecycleObserver {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onResume(MapboxLifecycleObserver mapboxLifecycleObserver) {
        }
    }

    void onDestroy();

    void onLowMemory();

    void onResume();

    void onStart();

    void onStop();
}
