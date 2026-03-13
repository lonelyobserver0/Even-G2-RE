package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class InputsServiceHandle implements InputsServiceHandleInterface {
    protected long peer;

    public static class InputsServiceHandlePeerCleaner implements Runnable {
        private long peer;

        public InputsServiceHandlePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            InputsServiceHandle.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public InputsServiceHandle(long j) {
        setPeer(j);
    }

    public static native InputsServiceHandle build(ConfigHandle configHandle, HistoryRecorderHandle historyRecorderHandle);

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new InputsServiceHandlePeerCleaner(j));
    }

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateAltimeterData(AltimeterData altimeterData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateCompassData(CompassData compassData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateEtcGateInfo(ETCGateInfo eTCGateInfo);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateImuTemperatureData(ImuTemperatureData imuTemperatureData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateLaneSensorInfo(LaneSensorInfo laneSensorInfo);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateOdometryData(OdometryData odometryData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateOrientationData(OrientationData orientationData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateRawAccelerometerData(RawAccelerometerData rawAccelerometerData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateRawGnssData(RawGnssData rawGnssData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateRawGravityData(RawGravityData rawGravityData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateRawGyroscopeData(RawGyroscopeData rawGyroscopeData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateRawLocation(FixLocation fixLocation);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateSpeedData(SpeedData speedData);

    @Override // com.mapbox.navigator.InputsServiceHandleInterface
    public native void updateWeatherData(WeatherData weatherData);
}
