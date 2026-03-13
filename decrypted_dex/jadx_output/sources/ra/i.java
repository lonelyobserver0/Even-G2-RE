package ra;

import java.io.EOFException;
import qa.C1531b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final C1531b f20546a;

    public i(C1531b c1531b) {
        this.f20546a = c1531b;
    }

    @Override // ra.j
    public final void B(byte[] bArr) {
        this.f20546a.a(bArr.length);
    }

    @Override // ra.j
    public final boolean c() {
        return this.f20546a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20546a.close();
    }

    @Override // ra.j
    public final long getPosition() {
        return this.f20546a.f20109l;
    }

    @Override // ra.j
    public final void i(int i3, byte[] bArr) {
        this.f20546a.a(i3);
    }

    @Override // ra.j
    public final int peek() {
        return this.f20546a.peek();
    }

    @Override // ra.j
    public final int read() {
        return this.f20546a.read();
    }

    @Override // ra.j
    public final void y(int i3) {
        this.f20546a.a(1);
    }

    @Override // ra.j
    public final byte[] z(int i3) {
        C1531b c1531b = this.f20546a;
        byte[] bArr = new byte[i3];
        int i10 = 0;
        do {
            int read = c1531b.read(bArr, i10, i3 - i10);
            if (read < 0) {
                throw new EOFException();
            }
            i10 += read;
        } while (i10 < i3);
        return bArr;
    }

    @Override // ra.j
    public final int read(byte[] bArr) {
        return this.f20546a.read(bArr, 0, bArr.length);
    }

    @Override // ra.j
    public final int read(byte[] bArr, int i3, int i10) {
        return this.f20546a.read(bArr, 0, 10);
    }
}
