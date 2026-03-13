package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdU32OptionalArray implements RdU32OptionalArrayInterface {
    protected long peer;

    public static class RdU32OptionalArrayPeerCleaner implements Runnable {
        private long peer;

        public RdU32OptionalArrayPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdU32OptionalArray.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdU32OptionalArray(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdU32OptionalArrayPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdU32OptionalArrayInterface
    public native Integer get(long j);

    @Override // com.mapbox.navigator.route_data.RdU32OptionalArrayInterface
    public native long size();
}
