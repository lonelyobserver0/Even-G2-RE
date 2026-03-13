package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchedPointLocation implements MatchedPointLocationInterface {
    protected long peer;

    public static class MatchedPointLocationPeerCleaner implements Runnable {
        private long peer;

        public MatchedPointLocationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchedPointLocation.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchedPointLocation(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MatchedPointLocationPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.MatchedPointLocationInterface
    public native Position getPosition();
}
