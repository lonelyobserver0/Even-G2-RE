package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface InputsServiceHandleInterface {
    void updateAltimeterData(AltimeterData altimeterData);

    void updateCompassData(CompassData compassData);

    void updateEtcGateInfo(ETCGateInfo eTCGateInfo);

    void updateImuTemperatureData(ImuTemperatureData imuTemperatureData);

    void updateLaneSensorInfo(LaneSensorInfo laneSensorInfo);

    void updateOdometryData(OdometryData odometryData);

    void updateOrientationData(OrientationData orientationData);

    void updateRawAccelerometerData(RawAccelerometerData rawAccelerometerData);

    void updateRawGnssData(RawGnssData rawGnssData);

    void updateRawGravityData(RawGravityData rawGravityData);

    void updateRawGyroscopeData(RawGyroscopeData rawGyroscopeData);

    void updateRawLocation(FixLocation fixLocation);

    void updateSpeedData(SpeedData speedData);

    void updateWeatherData(WeatherData weatherData);
}
