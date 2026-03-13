package ra;

import java.io.EOFException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final PushbackInputStream f20506a;

    /* renamed from: b, reason: collision with root package name */
    public int f20507b = 0;

    public c(InputStream inputStream) {
        this.f20506a = new PushbackInputStream(inputStream, 32767);
    }

    @Override // ra.j
    public final void B(byte[] bArr) {
        this.f20506a.unread(bArr);
        this.f20507b -= bArr.length;
    }

    @Override // ra.j
    public final boolean c() {
        return peek() == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20506a.close();
    }

    @Override // ra.j
    public final long getPosition() {
        return this.f20507b;
    }

    @Override // ra.j
    public final void i(int i3, byte[] bArr) {
        this.f20506a.unread(bArr, 0, i3);
        this.f20507b -= i3;
    }

    @Override // ra.j
    public final int peek() {
        PushbackInputStream pushbackInputStream = this.f20506a;
        int read = pushbackInputStream.read();
        if (read != -1) {
            pushbackInputStream.unread(read);
        }
        return read;
    }

    @Override // ra.j
    public final int read() {
        int read = this.f20506a.read();
        this.f20507b++;
        return read;
    }

    @Override // ra.j
    public final void y(int i3) {
        this.f20506a.unread(i3);
        this.f20507b--;
    }

    @Override // ra.j
    public final byte[] z(int i3) {
        byte[] bArr = new byte[i3];
        int i10 = 0;
        do {
            int read = read(bArr, i10, i3 - i10);
            if (read < 0) {
                throw new EOFException();
            }
            i10 += read;
        } while (i10 < i3);
        return bArr;
    }

    @Override // ra.j
    public final int read(byte[] bArr) {
        int read = this.f20506a.read(bArr);
        if (read <= 0) {
            return -1;
        }
        this.f20507b += read;
        return read;
    }

    @Override // ra.j
    public final int read(byte[] bArr, int i3, int i10) {
        int read = this.f20506a.read(bArr, i3, i10);
        if (read <= 0) {
            return -1;
        }
        this.f20507b += read;
        return read;
    }
}
