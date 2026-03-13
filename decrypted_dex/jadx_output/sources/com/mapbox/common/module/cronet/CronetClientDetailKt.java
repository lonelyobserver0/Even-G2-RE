package com.mapbox.common.module.cronet;

import Kc.C0101h;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Buffer;
import com.mapbox.common.ReadStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mapbox/common/ReadStream;", "LKc/h;", "toOkioBuffer", "(Lcom/mapbox/common/ReadStream;)LKc/h;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CronetClientDetailKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C0101h toOkioBuffer(ReadStream readStream) {
        C0101h c0101h = new C0101h();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4096);
        Buffer buffer = new Buffer(new DataRef(byteBuffer));
        while (!readStream.getExhausted()) {
            byteBuffer.clear();
            Expected<String, Long> read = readStream.read(buffer);
            Intrinsics.checkNotNullExpressionValue(read, "this.read(commonBuffer)");
            if (!read.isValue()) {
                String error = read.getError();
                Intrinsics.checkNotNull(error);
                throw new IOException(error);
            }
            Long value = read.getValue();
            Intrinsics.checkNotNull(value);
            byteBuffer.limit((int) value.longValue());
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            c0101h.write(byteBuffer);
        }
        return c0101h;
    }
}
