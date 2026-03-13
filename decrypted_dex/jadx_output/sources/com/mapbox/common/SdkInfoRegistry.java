package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SdkInfoRegistry implements SdkInfoRegistryInterface {
    protected long peer;

    public static class SdkInfoRegistryPeerCleaner implements Runnable {
        private long peer;

        public SdkInfoRegistryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SdkInfoRegistry.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInfoRegistry(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SdkInfoRegistryPeerCleaner(j));
    }

    @Override // com.mapbox.common.SdkInfoRegistryInterface
    public native List<SdkInformation> getSdkInformation();

    @Override // com.mapbox.common.SdkInfoRegistryInterface
    public native void registerSdkInformation(SdkInformation sdkInformation);
}
