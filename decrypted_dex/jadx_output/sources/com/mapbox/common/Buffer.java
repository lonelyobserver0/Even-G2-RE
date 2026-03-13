package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Buffer {
    protected long peer;

    public static class BufferPeerCleaner implements Runnable {
        private long peer;

        public BufferPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Buffer.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Buffer(DataRef dataRef) {
        initialize(dataRef);
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(DataRef dataRef);

    private native DataRef nativeGetData();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new BufferPeerCleaner(j));
    }

    public DataRef getData() {
        return nativeGetData();
    }

    public Buffer(long j) {
        setPeer(j);
    }
}
