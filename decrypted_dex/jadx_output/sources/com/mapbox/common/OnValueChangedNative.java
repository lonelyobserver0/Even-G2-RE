package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class OnValueChangedNative implements OnValueChanged {
    private long peer;

    public static class OnValueChangedPeerCleaner implements Runnable {
        private long peer;

        public OnValueChangedPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnValueChangedNative.cleanNativePeer(this.peer);
        }
    }

    private OnValueChangedNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OnValueChangedPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.OnValueChanged
    public native void run(String str, Value value, Value value2);
}
