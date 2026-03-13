package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ElectronicHorizonPosition implements ElectronicHorizonPositionInterface {
    protected long peer;

    public static class ElectronicHorizonPositionPeerCleaner implements Runnable {
        private long peer;

        public ElectronicHorizonPositionPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ElectronicHorizonPosition.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ElectronicHorizonPosition(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ElectronicHorizonPositionPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.ElectronicHorizonPositionInterface
    public native GraphPosition position();

    @Override // com.mapbox.navigator.ElectronicHorizonPositionInterface
    public native ElectronicHorizon tree();

    @Override // com.mapbox.navigator.ElectronicHorizonPositionInterface
    public native ElectronicHorizonResultType type();
}
