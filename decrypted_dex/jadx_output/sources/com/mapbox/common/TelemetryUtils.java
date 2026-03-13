package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TelemetryUtils {
    protected long peer;

    public static class TelemetryUtilsPeerCleaner implements Runnable {
        private long peer;

        public TelemetryUtilsPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryUtils.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TelemetryUtils() {
        initialize();
    }

    public static native void cleanNativePeer(long j);

    public static native TelemetryCollectionState getClientServerEventsCollectionState();

    public static native boolean getEventsCollectionState();

    public static native String getUserID();

    private native void initialize();

    public static native void setEventsCollectionState(boolean z2, TelemetryUtilsResponseCallback telemetryUtilsResponseCallback);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryUtilsPeerCleaner(j));
    }

    public native void registerTelemetryCollectionStateObserver(TelemetryCollectionStateObserver telemetryCollectionStateObserver);

    public native void unregisterTelemetryCollectionStateObserver(TelemetryCollectionStateObserver telemetryCollectionStateObserver);

    public TelemetryUtils(long j) {
        setPeer(j);
    }
}
