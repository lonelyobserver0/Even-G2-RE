package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BillingService {
    protected long peer;

    public static class BillingServicePeerCleaner implements Runnable {
        private long peer;

        public BillingServicePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            BillingService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public BillingService(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new BillingServicePeerCleaner(j));
    }

    public native void beginBillingSession(SdkInformation sdkInformation, SessionSKUIdentifier sessionSKUIdentifier, OnBillingServiceError onBillingServiceError, long j);

    public native String getSessionSKUTokenIfValid(SessionSKUIdentifier sessionSKUIdentifier);

    public native BillingSessionStatus getSessionStatus(SessionSKUIdentifier sessionSKUIdentifier);

    public native String getUserSKUToken(UserSKUIdentifier userSKUIdentifier);

    public native void pauseBillingSession(SessionSKUIdentifier sessionSKUIdentifier);

    public native void resumeBillingSession(SessionSKUIdentifier sessionSKUIdentifier, OnBillingServiceError onBillingServiceError);

    public native void stopBillingSession(SessionSKUIdentifier sessionSKUIdentifier);

    public native void triggerMaploadBillingEvent(MaploadSKUIdentifier maploadSKUIdentifier, OnBillingServiceError onBillingServiceError);

    public native void triggerUserBillingEvent(SdkInformation sdkInformation, UserSKUIdentifier userSKUIdentifier, OnBillingServiceError onBillingServiceError);
}
