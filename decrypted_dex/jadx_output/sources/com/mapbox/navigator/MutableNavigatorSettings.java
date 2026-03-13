package com.mapbox.navigator;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface MutableNavigatorSettings {
    Float avoidManeuverSeconds();

    void setAvoidManeuverSeconds(Float f10);

    void setTestingContext(TestingContext testingContext);

    void setUserLanguages(List<String> list);

    void setVehicleType(VehicleType vehicleType);

    TestingContext testingContext();

    String userLanguageSupportedByValhalla();

    List<String> userLanguages();

    VehicleType vehicleType();
}
