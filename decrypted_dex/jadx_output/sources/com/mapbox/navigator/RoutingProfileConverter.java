package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoutingProfileConverter implements RoutingProfileConverterInterface {
    protected long peer;

    public static class RoutingProfileConverterPeerCleaner implements Runnable {
        private long peer;

        public RoutingProfileConverterPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RoutingProfileConverter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoutingProfileConverter(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RoutingProfileConverterPeerCleaner(j));
    }

    public static native RoutingProfile toRoutingProfile(String str);

    public static native RoutingProfile toRoutingProfile(String str, String str2);

    public static native String toString(RoutingProfile routingProfile);
}
