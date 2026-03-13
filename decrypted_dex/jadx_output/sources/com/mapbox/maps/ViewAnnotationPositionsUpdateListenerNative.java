package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ViewAnnotationPositionsUpdateListenerNative implements ViewAnnotationPositionsUpdateListener {
    protected long peer;

    public static class ViewAnnotationPositionsUpdateListenerPeerCleaner implements Runnable {
        private long peer;

        public ViewAnnotationPositionsUpdateListenerPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewAnnotationPositionsUpdateListenerNative.cleanNativePeer(this.peer);
        }
    }

    public ViewAnnotationPositionsUpdateListenerNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ViewAnnotationPositionsUpdateListenerPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.ViewAnnotationPositionsUpdateListener
    public native void onViewAnnotationPositionsUpdate(List<ViewAnnotationPositionDescriptor> list);
}
