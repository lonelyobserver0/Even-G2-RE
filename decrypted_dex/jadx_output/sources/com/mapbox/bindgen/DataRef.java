package com.mapbox.bindgen;

import com.stub.StubApp;
import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DataRef {
    private ByteBuffer buffer;
    private long peer;

    public static class DataRefPeerCleaner implements Runnable {
        private long peer;

        public DataRefPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            DataRef.cleanNativePeer(this.peer);
        }
    }

    public DataRef(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException(StubApp.getString2(13180));
        }
        this.buffer = byteBuffer;
    }

    public static DataRef allocateNative(int i3) {
        if (i3 >= 0) {
            return allocateNativeMemory(i3);
        }
        throw new IllegalArgumentException(StubApp.getString2(13181));
    }

    public static native DataRef allocateNativeMemory(int i3);

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        CleanerService.register(this.buffer, new DataRefPeerCleaner(j));
    }

    public ByteBuffer getBuffer() {
        return this.buffer.duplicate();
    }

    private DataRef(long j, ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        setPeer(j);
    }
}
