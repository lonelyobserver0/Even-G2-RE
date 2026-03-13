package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class OfflineSwitch {
    protected long peer;

    public static class OfflineSwitchPeerCleaner implements Runnable {
        private long peer;

        public OfflineSwitchPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineSwitch.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public OfflineSwitch(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native OfflineSwitch getInstance();

    public static native void reset();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new OfflineSwitchPeerCleaner(j));
    }

    public native boolean isMapboxStackConnected();

    public native void registerObserver(OfflineSwitchObserver offlineSwitchObserver);

    public native void setMapboxStackConnected(boolean z2);

    public native void unregisterObserver(OfflineSwitchObserver offlineSwitchObserver);
}
