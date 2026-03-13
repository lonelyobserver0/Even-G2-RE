package s5;

import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f20758a;

    @Override // java.io.OutputStream
    public final void write(int i3) {
        this.f20758a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f20758a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i10) {
        int i11;
        if (i3 >= 0 && i3 <= bArr.length && i10 >= 0 && (i11 = i3 + i10) <= bArr.length && i11 >= 0) {
            this.f20758a += i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
