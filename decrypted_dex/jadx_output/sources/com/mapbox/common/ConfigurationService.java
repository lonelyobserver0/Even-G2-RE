package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ConfigurationService {
    protected long peer;

    public static class ConfigurationServicePeerCleaner implements Runnable {
        private long peer;

        public ConfigurationServicePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ConfigurationService(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native ConfigurationService getOrCreate(EventsServerOptions eventsServerOptions);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ConfigurationServicePeerCleaner(j));
    }

    public native void getConfig(ConfigurationServiceGetConfigCallback configurationServiceGetConfigCallback);

    public native void registerObserver(ConfigurationServiceObserver configurationServiceObserver);

    public native void unregisterObserver(ConfigurationServiceObserver configurationServiceObserver);
}
