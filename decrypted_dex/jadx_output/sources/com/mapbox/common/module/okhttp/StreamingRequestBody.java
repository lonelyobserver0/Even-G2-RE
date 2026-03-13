package com.mapbox.common.module.okhttp;

import Kc.C0101h;
import Kc.InterfaceC0102i;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Buffer;
import com.mapbox.common.ReadStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import wc.AbstractC1879D;
import wc.v;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/mapbox/common/module/okhttp/StreamingRequestBody;", "Lwc/D;", "Lcom/mapbox/common/ReadStream;", "inputStream", "Lwc/v;", CMSAttributeTableGenerator.CONTENT_TYPE, "<init>", "(Lcom/mapbox/common/ReadStream;Lwc/v;)V", "()Lwc/v;", "", "isOneShot", "()Z", "", "contentLength", "()J", "LKc/i;", "sink", "", "writeTo", "(LKc/i;)V", "Lcom/mapbox/common/ReadStream;", "getInputStream", "()Lcom/mapbox/common/ReadStream;", "Lwc/v;", "getContentType", "LKc/h;", "buffer", "LKc/h;", "getBuffer", "()LKc/h;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StreamingRequestBody extends AbstractC1879D {
    private final C0101h buffer;
    private final v contentType;
    private final ReadStream inputStream;

    public StreamingRequestBody(ReadStream inputStream, v vVar) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        this.inputStream = inputStream;
        this.contentType = vVar;
        this.buffer = new C0101h();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4096);
        Buffer buffer = new Buffer(new DataRef(byteBuffer));
        while (!this.inputStream.getExhausted()) {
            byteBuffer.clear();
            Expected<String, Long> read = this.inputStream.read(buffer);
            Intrinsics.checkNotNullExpressionValue(read, "inputStream.read(commonBuffer)");
            if (!read.isValue()) {
                String error = read.getError();
                Intrinsics.checkNotNull(error);
                throw new IOException(error);
            }
            Long value = read.getValue();
            Intrinsics.checkNotNull(value);
            byteBuffer.limit((int) value.longValue());
            C0101h c0101h = this.buffer;
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            c0101h.write(byteBuffer);
        }
    }

    @Override // wc.AbstractC1879D
    public long contentLength() {
        return this.buffer.f3819b;
    }

    @Override // wc.AbstractC1879D
    /* renamed from: contentType, reason: from getter */
    public v getContentType() {
        return this.contentType;
    }

    public final C0101h getBuffer() {
        return this.buffer;
    }

    public final v getContentType() {
        return this.contentType;
    }

    public final ReadStream getInputStream() {
        return this.inputStream;
    }

    @Override // wc.AbstractC1879D
    public boolean isOneShot() {
        return false;
    }

    @Override // wc.AbstractC1879D
    public void writeTo(InterfaceC0102i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.t(this.buffer.d());
    }
}
