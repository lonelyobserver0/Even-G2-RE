package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ConfigFactory implements ConfigFactoryInterface {
    protected long peer;

    public static class ConfigFactoryPeerCleaner implements Runnable {
        private long peer;

        public ConfigFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ConfigFactory(long j) {
        setPeer(j);
    }

    public static native ConfigHandle build(SettingsProfile settingsProfile, NavigatorConfig navigatorConfig, String str);

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ConfigFactoryPeerCleaner(j));
    }
}
