package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ReadStreamNative implements ReadStream {
    protected long peer;

    public static class ReadStreamPeerCleaner implements Runnable {
        private long peer;

        public ReadStreamPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReadStreamNative.cleanNativePeer(this.peer);
        }
    }

    public ReadStreamNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ReadStreamPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.ReadStream
    /* renamed from: isExhausted */
    public native boolean getExhausted();

    @Override // com.mapbox.common.ReadStream
    public native boolean isReadable();

    @Override // com.mapbox.common.ReadStream
    public native Expected<String, Long> read(Buffer buffer);

    @Override // com.mapbox.common.ReadStream
    /* renamed from: readBytes */
    public native long getProcessed();
}
