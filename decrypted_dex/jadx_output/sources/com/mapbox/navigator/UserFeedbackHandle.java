package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class UserFeedbackHandle implements UserFeedbackHandleInterface {
    protected long peer;

    public static class UserFeedbackHandlePeerCleaner implements Runnable {
        private long peer;

        public UserFeedbackHandlePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            UserFeedbackHandle.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public UserFeedbackHandle(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new UserFeedbackHandlePeerCleaner(j));
    }

    @Override // com.mapbox.navigator.UserFeedbackHandleInterface
    public native UserFeedbackMetadata getMetadata();
}
