package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.geojson.Point;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class IMUServiceNative implements IMUService {
    protected long peer;

    public static class IMUServicePeerCleaner implements Runnable {
        private long peer;

        public IMUServicePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IMUServiceNative.cleanNativePeer(this.peer);
        }
    }

    public IMUServiceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new IMUServicePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.IMUService
    public native int registerAltimeterUpdateCallback(AltimeterUpdateCallback altimeterUpdateCallback);

    @Override // com.mapbox.navigator.IMUService
    public native int registerCompassUpdateCallback(CompassUpdateCallback compassUpdateCallback);

    @Override // com.mapbox.navigator.IMUService
    public native int registerIMUUpdateCallback(IMUUpdateCallback iMUUpdateCallback);

    @Override // com.mapbox.navigator.IMUService
    public native void unregisterCallback(int i3);

    @Override // com.mapbox.navigator.IMUService
    public native void update(Point point, Float f10);
}
