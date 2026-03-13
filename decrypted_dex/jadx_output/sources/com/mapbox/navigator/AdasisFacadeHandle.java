package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisFacadeHandle implements AdasisFacadeHandleInterface {
    protected long peer;

    public static class AdasisFacadeHandlePeerCleaner implements Runnable {
        private long peer;

        public AdasisFacadeHandlePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdasisFacadeHandle.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisFacadeHandle(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new AdasisFacadeHandlePeerCleaner(j));
    }

    @Override // com.mapbox.navigator.AdasisFacadeHandleInterface
    public native void resetAdasisMessageCallback();

    @Override // com.mapbox.navigator.AdasisFacadeHandleInterface
    public native void setAdasisMessageCallback(ADASISv2MessageCallback aDASISv2MessageCallback, AdasisConfig adasisConfig);

    @Override // com.mapbox.navigator.AdasisFacadeHandleInterface
    public native void triggerResetOfEhProvider();
}
