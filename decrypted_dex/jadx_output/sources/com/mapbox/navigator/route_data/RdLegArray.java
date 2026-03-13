package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdLegArray implements RdLegArrayInterface {
    protected long peer;

    public static class RdLegArrayPeerCleaner implements Runnable {
        private long peer;

        public RdLegArrayPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdLegArray.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdLegArray(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdLegArrayPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdLegArrayInterface
    public native RdLeg get(long j);

    @Override // com.mapbox.navigator.route_data.RdLegArrayInterface
    public native long size();
}
