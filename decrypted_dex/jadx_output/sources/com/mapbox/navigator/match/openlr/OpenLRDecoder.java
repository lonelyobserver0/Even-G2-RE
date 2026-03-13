package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class OpenLRDecoder implements OpenLRDecoderInterface {
    protected long peer;

    public static class OpenLRDecoderPeerCleaner implements Runnable {
        private long peer;

        public OpenLRDecoderPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenLRDecoder.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public OpenLRDecoder(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native Expected<DecodingError, LocationReference> decode(OpenLR openLR);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new OpenLRDecoderPeerCleaner(j));
    }
}
