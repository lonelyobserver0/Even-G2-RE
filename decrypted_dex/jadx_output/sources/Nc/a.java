package Nc;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a extends UploadDataProvider {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f5051a;

    public a(ByteBuffer byteBuffer) {
        this.f5051a = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f5051a.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException(StubApp.getString2(25424));
        }
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f5051a;
        if (remaining >= byteBuffer2.remaining()) {
            byteBuffer.put(byteBuffer2);
        } else {
            int limit = byteBuffer2.limit();
            byteBuffer.put(byteBuffer2);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindSucceeded();
    }
}
