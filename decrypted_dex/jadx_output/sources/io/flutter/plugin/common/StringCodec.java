package io.flutter.plugin.common;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class StringCodec implements MessageCodec<String> {
    private static final Charset UTF8 = Charset.forName(StubApp.getString2(6206));
    public static final StringCodec INSTANCE = new StringCodec();

    private StringCodec() {
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public String decodeMessage(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i3;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i3 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i3 = 0;
        }
        return new String(bArr, i3, remaining, UTF8);
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public ByteBuffer encodeMessage(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(UTF8);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
