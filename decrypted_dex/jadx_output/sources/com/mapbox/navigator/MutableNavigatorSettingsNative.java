package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class MutableNavigatorSettingsNative implements MutableNavigatorSettings {
    protected long peer;

    public static class MutableNavigatorSettingsPeerCleaner implements Runnable {
        private long peer;

        public MutableNavigatorSettingsPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MutableNavigatorSettingsNative.cleanNativePeer(this.peer);
        }
    }

    public MutableNavigatorSettingsNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MutableNavigatorSettingsPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native Float avoidManeuverSeconds();

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native void setAvoidManeuverSeconds(Float f10);

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native void setTestingContext(TestingContext testingContext);

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native void setUserLanguages(List<String> list);

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native void setVehicleType(VehicleType vehicleType);

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native TestingContext testingContext();

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native String userLanguageSupportedByValhalla();

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native List<String> userLanguages();

    @Override // com.mapbox.navigator.MutableNavigatorSettings
    public native VehicleType vehicleType();
}
