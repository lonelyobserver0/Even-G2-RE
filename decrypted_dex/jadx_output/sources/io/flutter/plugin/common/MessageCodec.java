package io.flutter.plugin.common;

import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface MessageCodec<T> {
    T decodeMessage(ByteBuffer byteBuffer);

    ByteBuffer encodeMessage(T t3);
}
