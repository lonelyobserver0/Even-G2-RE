package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class EventsServiceObserverNative implements EventsServiceObserver {
    protected long peer;

    public static class EventsServiceObserverPeerCleaner implements Runnable {
        private long peer;

        public EventsServiceObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            EventsServiceObserverNative.cleanNativePeer(this.peer);
        }
    }

    public EventsServiceObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new EventsServiceObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.EventsServiceObserver
    public native void didEncounterError(EventsServiceError eventsServiceError, Value value);

    @Override // com.mapbox.common.EventsServiceObserver
    public native void didSendEvents(Value value);
}
