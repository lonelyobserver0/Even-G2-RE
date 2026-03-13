package D5;

import com.stub.StubApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: D5.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0040d extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f1415a;

    /* renamed from: b, reason: collision with root package name */
    public long f1416b;

    public C0040d(InputStream inputStream) {
        super(inputStream);
        this.f1416b = -1L;
        this.f1415a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f1415a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i3) {
        ((FilterInputStream) this).in.mark(i3);
        this.f1416b = this.f1415a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f1415a == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f1415a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException(StubApp.getString2("1427"));
        }
        if (this.f1416b == -1) {
            throw new IOException(StubApp.getString2("1426"));
        }
        ((FilterInputStream) this).in.reset();
        this.f1415a = this.f1416b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f1415a));
        this.f1415a -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        long j = this.f1415a;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i3, (int) Math.min(i10, j));
        if (read != -1) {
            this.f1415a -= read;
        }
        return read;
    }
}
