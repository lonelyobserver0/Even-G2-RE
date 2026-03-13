package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class NavigatorObserverNative implements NavigatorObserver {
    protected long peer;

    public static class NavigatorObserverPeerCleaner implements Runnable {
        private long peer;

        public NavigatorObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            NavigatorObserverNative.cleanNativePeer(this.peer);
        }
    }

    public NavigatorObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new NavigatorObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.NavigatorObserver
    public native void onRoutesChanged(RoutesChangeInfo routesChangeInfo);

    @Override // com.mapbox.navigator.NavigatorObserver
    public native void onStatus(NavigationStatusOrigin navigationStatusOrigin, NavigationStatus navigationStatus);
}
