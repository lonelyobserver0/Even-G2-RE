package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdStepArray implements RdStepArrayInterface {
    protected long peer;

    public static class RdStepArrayPeerCleaner implements Runnable {
        private long peer;

        public RdStepArrayPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdStepArray.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdStepArray(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdStepArrayPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdStepArrayInterface
    public native RdStep get(long j);

    @Override // com.mapbox.navigator.route_data.RdStepArrayInterface
    public native long size();
}
