package org.bouncycastle.util.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BufferingOutputStream extends OutputStream {
    private final byte[] buf;
    private int bufOff;
    private final OutputStream other;

    public BufferingOutputStream(OutputStream outputStream) {
        this.other = outputStream;
        this.buf = new byte[4096];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        this.other.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.other.write(this.buf, 0, this.bufOff);
        this.bufOff = 0;
        Arrays.fill(this.buf, (byte) 0);
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        byte[] bArr = this.buf;
        int i10 = this.bufOff;
        int i11 = i10 + 1;
        this.bufOff = i11;
        bArr[i10] = (byte) i3;
        if (i11 == bArr.length) {
            flush();
        }
    }

    public BufferingOutputStream(OutputStream outputStream, int i3) {
        this.other = outputStream;
        this.buf = new byte[i3];
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        byte[] bArr2;
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i11 = this.bufOff;
        if (i10 < length - i11) {
            System.arraycopy(bArr, i3, bArr3, i11, i10);
        } else {
            int length2 = bArr3.length - i11;
            System.arraycopy(bArr, i3, bArr3, i11, length2);
            this.bufOff += length2;
            flush();
            int i12 = i3 + length2;
            i10 -= length2;
            while (true) {
                bArr2 = this.buf;
                if (i10 < bArr2.length) {
                    break;
                }
                this.other.write(bArr, i12, bArr2.length);
                byte[] bArr4 = this.buf;
                i12 += bArr4.length;
                i10 -= bArr4.length;
            }
            if (i10 <= 0) {
                return;
            } else {
                System.arraycopy(bArr, i12, bArr2, this.bufOff, i10);
            }
        }
        this.bufOff += i10;
    }
}
