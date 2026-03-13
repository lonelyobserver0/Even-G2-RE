package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SdkInformationQuery implements SdkInformationQueryInterface {
    protected long peer;

    public static class SdkInformationQueryPeerCleaner implements Runnable {
        private long peer;

        public SdkInformationQueryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SdkInformationQuery.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInformationQuery(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native List<SdkInformation> getSdkInformation();

    public static native SdkInformation getSdkInformationByName(String str);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SdkInformationQueryPeerCleaner(j));
    }
}
