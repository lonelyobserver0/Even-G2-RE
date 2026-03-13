package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface SensorsServiceObserver {
    void onAssistedDrivingData(AssistedDrivingData assistedDrivingData);

    void onCameraLaneData(CameraLaneData cameraLaneData);

    void onDetectedObjectsData(DetectedObjectsData detectedObjectsData);

    void onExternalMatcherLaneData(ExternalMatcherLaneData externalMatcherLaneData);

    void onTurnSignalStatusData(TurnSignalStatusData turnSignalStatusData);
}
