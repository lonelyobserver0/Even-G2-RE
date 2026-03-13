package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdLegClosureArray implements RdLegClosureArrayInterface {
    protected long peer;

    public static class RdLegClosureArrayPeerCleaner implements Runnable {
        private long peer;

        public RdLegClosureArrayPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdLegClosureArray.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdLegClosureArray(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdLegClosureArrayPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdLegClosureArrayInterface
    public native RdLegClosure get(long j);

    @Override // com.mapbox.navigator.route_data.RdLegClosureArrayInterface
    public native long size();
}
