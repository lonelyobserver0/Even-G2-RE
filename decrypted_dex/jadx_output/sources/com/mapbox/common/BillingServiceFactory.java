package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BillingServiceFactory {
    protected long peer;

    public static class BillingServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public BillingServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            BillingServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public BillingServiceFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native BillingService getInstance();

    public static native void reset();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new BillingServiceFactoryPeerCleaner(j));
    }
}
