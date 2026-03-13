package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ConfigurationServiceGetConfigCallbackNative implements ConfigurationServiceGetConfigCallback {
    private long peer;

    public static class ConfigurationServiceGetConfigCallbackPeerCleaner implements Runnable {
        private long peer;

        public ConfigurationServiceGetConfigCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationServiceGetConfigCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ConfigurationServiceGetConfigCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ConfigurationServiceGetConfigCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.ConfigurationServiceGetConfigCallback
    public native void run(Expected<ConfigurationServiceError, ConfigurationOptions> expected);
}
