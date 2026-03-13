package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ReachabilityFactory {
    protected long peer;

    public static class ReachabilityFactoryPeerCleaner implements Runnable {
        private long peer;

        public ReachabilityFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ReachabilityFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native ReachabilityInterface reachability(String str);

    public static native void reset();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ReachabilityFactoryPeerCleaner(j));
    }
}
