package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class SensorsServiceNative implements SensorsService {
    protected long peer;

    public static class SensorsServicePeerCleaner implements Runnable {
        private long peer;

        public SensorsServicePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SensorsServiceNative.cleanNativePeer(this.peer);
        }
    }

    public SensorsServiceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SensorsServicePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.SensorsService
    public native void addObserver(SensorsServiceObserver sensorsServiceObserver);

    @Override // com.mapbox.navigator.SensorsService
    public native void removeObserver(SensorsServiceObserver sensorsServiceObserver);

    @Override // com.mapbox.navigator.SensorsService
    public native void updateAssistedDrivingData(AssistedDrivingData assistedDrivingData);

    @Override // com.mapbox.navigator.SensorsService
    public native void updateCameraLaneData(CameraLaneData cameraLaneData);

    @Override // com.mapbox.navigator.SensorsService
    public native void updateDetectedObjectsData(DetectedObjectsData detectedObjectsData);

    @Override // com.mapbox.navigator.SensorsService
    public native void updateExternalMatcherLaneData(ExternalMatcherLaneData externalMatcherLaneData);

    @Override // com.mapbox.navigator.SensorsService
    public native void updateTurnSignalStatusData(TurnSignalStatusData turnSignalStatusData);
}
