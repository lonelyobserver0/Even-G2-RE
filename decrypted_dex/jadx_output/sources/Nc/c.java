package Nc;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c extends UploadDataProvider {

    /* renamed from: a, reason: collision with root package name */
    public volatile FileChannel f5052a;

    /* renamed from: b, reason: collision with root package name */
    public final b f5053b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5054c = new Object();

    public c(b bVar) {
        this.f5053b = bVar;
    }

    public final FileChannel a() {
        if (this.f5052a == null) {
            synchronized (this.f5054c) {
                try {
                    if (this.f5052a == null) {
                        this.f5052a = this.f5053b.b();
                    }
                } finally {
                }
            }
        }
        return this.f5052a;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileChannel fileChannel = this.f5052a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException(StubApp.getString2(25424));
        }
        FileChannel a3 = a();
        int i3 = 0;
        while (i3 == 0) {
            int read = a3.read(byteBuffer);
            if (read == -1) {
                break;
            } else {
                i3 += read;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
