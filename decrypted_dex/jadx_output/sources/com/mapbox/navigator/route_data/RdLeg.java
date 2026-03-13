package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdLeg implements RdLegInterface {
    protected long peer;

    public static class RdLegPeerCleaner implements Runnable {
        private long peer;

        public RdLegPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdLeg.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdLeg(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdLegPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdLegInterface
    public native double distance();

    @Override // com.mapbox.navigator.route_data.RdLegInterface
    public native double duration();

    @Override // com.mapbox.navigator.route_data.RdLegInterface
    public native RdStepArray steps();

    @Override // com.mapbox.navigator.route_data.RdLegInterface
    public native String summary();
}
