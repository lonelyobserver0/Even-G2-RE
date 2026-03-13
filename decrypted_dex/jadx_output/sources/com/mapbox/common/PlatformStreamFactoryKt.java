package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0007¨\u0006\b"}, d2 = {"fileReadStream", "Lcom/mapbox/common/ReadStream;", "path", "", "memoryReadStream", "str", "asReadStream", "Ljava/io/InputStream;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class PlatformStreamFactoryKt {
    public static final ReadStream asReadStream(final InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new ReadStream() { // from class: com.mapbox.common.PlatformStreamFactoryKt$asReadStream$1
            private boolean exhausted;
            private long processed;

            @Override // com.mapbox.common.ReadStream
            /* renamed from: isExhausted, reason: from getter */
            public boolean getExhausted() {
                return this.exhausted;
            }

            @Override // com.mapbox.common.ReadStream
            public boolean isReadable() {
                return true;
            }

            @Override // com.mapbox.common.ReadStream
            public Expected<String, Long> read(Buffer commonBuffer) {
                Intrinsics.checkNotNullParameter(commonBuffer, "commonBuffer");
                try {
                    ByteBuffer buffer = commonBuffer.getData().getBuffer();
                    Intrinsics.checkNotNullExpressionValue(buffer, "commonBuffer.data.buffer");
                    long j = 0;
                    while (true) {
                        if (j >= buffer.capacity()) {
                            break;
                        }
                        int read = inputStream.read();
                        if (read == -1) {
                            this.exhausted = true;
                            break;
                        }
                        buffer.put((byte) read);
                        j++;
                    }
                    this.processed += j;
                    Expected<String, Long> createValue = ExpectedFactory.createValue(Long.valueOf(j));
                    Intrinsics.checkNotNullExpressionValue(createValue, "createValue(read)");
                    return createValue;
                } catch (Exception e10) {
                    String message = e10.getMessage();
                    if (message == null) {
                        message = StubApp.getString2(13424);
                    }
                    Expected<String, Long> createError = ExpectedFactory.createError(message);
                    Intrinsics.checkNotNullExpressionValue(createError, "createError(e.message ?: \"Unknown stream error\")");
                    return createError;
                }
            }

            @Override // com.mapbox.common.ReadStream
            /* renamed from: readBytes, reason: from getter */
            public long getProcessed() {
                return this.processed;
            }
        };
    }

    public static final ReadStream fileReadStream(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return asReadStream(new FileInputStream(new File(path)));
    }

    public static final ReadStream memoryReadStream(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return asReadStream(new ByteArrayInputStream(bytes));
    }
}
