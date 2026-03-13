package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ConfigurationServiceObserverNative implements ConfigurationServiceObserver {
    protected long peer;

    public static class ConfigurationServiceObserverPeerCleaner implements Runnable {
        private long peer;

        public ConfigurationServiceObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationServiceObserverNative.cleanNativePeer(this.peer);
        }
    }

    public ConfigurationServiceObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ConfigurationServiceObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didEncounterError(ConfigurationServiceError configurationServiceError);

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didStartUpdate();

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didUpdate(ConfigurationOptions configurationOptions);
}
