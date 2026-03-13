package org.bouncycastle.mime.encoding;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Base64Encoder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Base64OutputStream extends FilterOutputStream {
    private static final Base64Encoder ENCODER = new Base64Encoder();
    private static final int INBUF_SIZE = 54;
    private static final int OUTBUF_SIZE = 74;
    private final byte[] inBuf;
    private int inPos;
    private final byte[] outBuf;

    public Base64OutputStream(OutputStream outputStream) {
        super(outputStream);
        this.inBuf = new byte[54];
        byte[] bArr = new byte[74];
        this.outBuf = bArr;
        this.inPos = 0;
        bArr[72] = 13;
        bArr[73] = 10;
    }

    private void encodeBlock(byte[] bArr, int i3) throws IOException {
        ENCODER.encode(bArr, i3, 54, this.outBuf, 0);
        ((FilterOutputStream) this).out.write(this.outBuf, 0, 74);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i3 = this.inPos;
        if (i3 > 0) {
            int encode = ENCODER.encode(this.inBuf, 0, i3, this.outBuf, 0);
            this.inPos = 0;
            byte[] bArr = this.outBuf;
            bArr[encode] = 13;
            bArr[encode + 1] = 10;
            ((FilterOutputStream) this).out.write(bArr, 0, encode + 2);
        }
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i3) throws IOException {
        byte[] bArr = this.inBuf;
        int i10 = this.inPos;
        int i11 = i10 + 1;
        this.inPos = i11;
        bArr[i10] = (byte) i3;
        if (i11 == 54) {
            encodeBlock(bArr, 0);
            this.inPos = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        int i11 = this.inPos;
        int i12 = 54 - i11;
        if (i10 < i12) {
            System.arraycopy(bArr, i3, this.inBuf, i11, i10);
            this.inPos += i10;
            return;
        }
        if (i11 > 0) {
            System.arraycopy(bArr, i3, this.inBuf, i11, i12);
            encodeBlock(this.inBuf, 0);
        } else {
            i12 = 0;
        }
        while (true) {
            int i13 = i10 - i12;
            if (i13 < 54) {
                System.arraycopy(bArr, i3 + i12, this.inBuf, 0, i13);
                this.inPos = i13;
                return;
            } else {
                encodeBlock(bArr, i3 + i12);
                i12 += 54;
            }
        }
    }
}
