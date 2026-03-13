package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class EventsMetadataInterfaceNative implements EventsMetadataInterface {
    protected long peer;

    public static class EventsMetadataInterfacePeerCleaner implements Runnable {
        private long peer;

        public EventsMetadataInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            EventsMetadataInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public EventsMetadataInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new EventsMetadataInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.EventsMetadataInterface
    public native EventsMetadata provideEventsMetadata();
}
