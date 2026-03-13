package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class InteractionHandlerNative implements InteractionHandler {
    protected long peer;

    public static class InteractionHandlerPeerCleaner implements Runnable {
        private long peer;

        public InteractionHandlerPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            InteractionHandlerNative.cleanNativePeer(this.peer);
        }
    }

    public InteractionHandlerNative(long j) {
        this.peer = j;
        CleanerService.register(this, new InteractionHandlerPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.InteractionHandler
    public native boolean handleBegin(QueriedFeature queriedFeature, InteractionContext interactionContext);

    @Override // com.mapbox.maps.InteractionHandler
    public native void handleChange(InteractionContext interactionContext);

    @Override // com.mapbox.maps.InteractionHandler
    public native void handleEnd(InteractionContext interactionContext);
}
