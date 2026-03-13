package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class EventsServiceResponseCallbackNative implements EventsServiceResponseCallback {
    private long peer;

    public static class EventsServiceResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        public EventsServiceResponseCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            EventsServiceResponseCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private EventsServiceResponseCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new EventsServiceResponseCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.EventsServiceResponseCallback
    public native void run(Expected<EventsServiceError, None> expected);
}
