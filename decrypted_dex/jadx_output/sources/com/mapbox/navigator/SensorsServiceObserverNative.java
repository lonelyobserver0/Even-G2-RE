package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class SensorsServiceObserverNative implements SensorsServiceObserver {
    protected long peer;

    public static class SensorsServiceObserverPeerCleaner implements Runnable {
        private long peer;

        public SensorsServiceObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SensorsServiceObserverNative.cleanNativePeer(this.peer);
        }
    }

    public SensorsServiceObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SensorsServiceObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.SensorsServiceObserver
    public native void onAssistedDrivingData(AssistedDrivingData assistedDrivingData);

    @Override // com.mapbox.navigator.SensorsServiceObserver
    public native void onCameraLaneData(CameraLaneData cameraLaneData);

    @Override // com.mapbox.navigator.SensorsServiceObserver
    public native void onDetectedObjectsData(DetectedObjectsData detectedObjectsData);

    @Override // com.mapbox.navigator.SensorsServiceObserver
    public native void onExternalMatcherLaneData(ExternalMatcherLaneData externalMatcherLaneData);

    @Override // com.mapbox.navigator.SensorsServiceObserver
    public native void onTurnSignalStatusData(TurnSignalStatusData turnSignalStatusData);
}
