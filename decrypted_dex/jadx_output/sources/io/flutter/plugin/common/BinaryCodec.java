package io.flutter.plugin.common;

import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class BinaryCodec implements MessageCodec<ByteBuffer> {
    public static final BinaryCodec INSTANCE = new BinaryCodec();
    public static final BinaryCodec INSTANCE_DIRECT = new BinaryCodec(true);
    private final boolean returnsDirectByteBufferFromDecoding;

    private BinaryCodec() {
        this.returnsDirectByteBufferFromDecoding = false;
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public ByteBuffer encodeMessage(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public ByteBuffer decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null || this.returnsDirectByteBufferFromDecoding) {
            return byteBuffer;
        }
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        allocate.put(byteBuffer);
        allocate.rewind();
        return allocate;
    }

    private BinaryCodec(boolean z2) {
        this.returnsDirectByteBufferFromDecoding = z2;
    }
}
