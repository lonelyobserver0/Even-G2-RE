package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdStep implements RdStepInterface {
    protected long peer;

    public static class RdStepPeerCleaner implements Runnable {
        private long peer;

        public RdStepPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdStep.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdStep(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdStepPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdStepInterface
    public native double distance();

    @Override // com.mapbox.navigator.route_data.RdStepInterface
    public native RdDrivingSide drivingSide();

    @Override // com.mapbox.navigator.route_data.RdStepInterface
    public native double duration();

    @Override // com.mapbox.navigator.route_data.RdStepInterface
    public native RdCoordinateArray geometry();

    @Override // com.mapbox.navigator.route_data.RdStepInterface
    public native List<RdIntersection> intersections();

    @Override // com.mapbox.navigator.route_data.RdStepInterface
    public native RdManeuver maneuver();

    @Override // com.mapbox.navigator.route_data.RdStepInterface
    public native String name();

    @Override // com.mapbox.navigator.route_data.RdStepInterface
    public native RdRoadShield roadShield();

    @Override // com.mapbox.navigator.route_data.RdStepInterface
    public native List<RdVoiceInstruction> voiceInstructions();
}
