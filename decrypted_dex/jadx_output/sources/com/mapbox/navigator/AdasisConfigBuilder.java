package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigBuilder implements AdasisConfigBuilderInterface {
    protected long peer;

    public static class AdasisConfigBuilderPeerCleaner implements Runnable {
        private long peer;

        public AdasisConfigBuilderPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdasisConfigBuilder.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigBuilder(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native AdasisConfig defaultOptions();

    public static native Expected<String, AdasisConfig> fromJson(String str);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new AdasisConfigBuilderPeerCleaner(j));
    }
}
