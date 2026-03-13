package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FreeCameraOptions {
    protected long peer;

    public static class FreeCameraOptionsPeerCleaner implements Runnable {
        private long peer;

        public FreeCameraOptionsPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            FreeCameraOptions.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public FreeCameraOptions(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new FreeCameraOptionsPeerCleaner(j));
    }

    public native Double getAltitude();

    public native Point getLocation();

    public long getNativePtr() {
        return this.peer;
    }

    public native Vec4 getOrientation();

    public native Vec3 getPosition();

    public native void lookAtPoint(Point point);

    public native void lookAtPoint(Point point, double d8);

    public native void lookAtPoint(Point point, double d8, Vec3 vec3);

    public native void setAltitude(double d8);

    public native void setLocation(Point point);

    public native void setLocation(Point point, double d8);

    public native void setOrientation(Vec4 vec4);

    public native void setPitchBearing(double d8, double d10);

    public native void setPosition(Vec3 vec3);
}
