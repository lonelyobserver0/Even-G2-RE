package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdF64Array implements RdF64ArrayInterface {
    protected long peer;

    public static class RdF64ArrayPeerCleaner implements Runnable {
        private long peer;

        public RdF64ArrayPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdF64Array.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdF64Array(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdF64ArrayPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdF64ArrayInterface
    public native double get(long j);

    @Override // com.mapbox.navigator.route_data.RdF64ArrayInterface
    public native long size();
}
