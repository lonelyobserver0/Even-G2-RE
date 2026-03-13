package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface SensorsService {
    void addObserver(SensorsServiceObserver sensorsServiceObserver);

    void removeObserver(SensorsServiceObserver sensorsServiceObserver);

    void updateAssistedDrivingData(AssistedDrivingData assistedDrivingData);

    void updateCameraLaneData(CameraLaneData cameraLaneData);

    void updateDetectedObjectsData(DetectedObjectsData detectedObjectsData);

    void updateExternalMatcherLaneData(ExternalMatcherLaneData externalMatcherLaneData);

    void updateTurnSignalStatusData(TurnSignalStatusData turnSignalStatusData);
}
