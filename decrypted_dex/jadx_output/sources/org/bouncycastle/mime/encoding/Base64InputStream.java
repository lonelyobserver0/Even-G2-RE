package org.bouncycastle.mime.encoding;

import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Base64InputStream extends InputStream {
    private static final byte[] decodingTable = new byte[128];
    InputStream in;
    int[] outBuf = new int[3];
    int bufPtr = 3;

    static {
        for (int i3 = 65; i3 <= 90; i3++) {
            decodingTable[i3] = (byte) (i3 - 65);
        }
        for (int i10 = 97; i10 <= 122; i10++) {
            decodingTable[i10] = (byte) (i10 - 71);
        }
        for (int i11 = 48; i11 <= 57; i11++) {
            decodingTable[i11] = (byte) (i11 + 4);
        }
        byte[] bArr = decodingTable;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public Base64InputStream(InputStream inputStream) {
        this.in = inputStream;
    }

    private int decode(int i3, int i10, int i11, int i12, int[] iArr) throws EOFException {
        if (i12 < 0) {
            throw new EOFException(StubApp.getString2(33026));
        }
        if (i11 == 61) {
            byte[] bArr = decodingTable;
            iArr[2] = (((bArr[i3] & UByte.MAX_VALUE) << 2) | ((bArr[i10] & UByte.MAX_VALUE) >> 4)) & 255;
            return 2;
        }
        if (i12 == 61) {
            byte[] bArr2 = decodingTable;
            byte b2 = bArr2[i3];
            byte b10 = bArr2[i10];
            byte b11 = bArr2[i11];
            iArr[1] = ((b2 << 2) | (b10 >> 4)) & 255;
            iArr[2] = ((b10 << 4) | (b11 >> 2)) & 255;
            return 1;
        }
        byte[] bArr3 = decodingTable;
        byte b12 = bArr3[i3];
        byte b13 = bArr3[i10];
        byte b14 = bArr3[i11];
        byte b15 = bArr3[i12];
        iArr[0] = ((b12 << 2) | (b13 >> 4)) & 255;
        iArr[1] = ((b13 << 4) | (b14 >> 2)) & 255;
        iArr[2] = ((b14 << 6) | b15) & 255;
        return 0;
    }

    private int readIgnoreSpace() throws IOException {
        while (true) {
            int read = this.in.read();
            if (read != 9 && read != 32) {
                return read;
            }
        }
    }

    private int readIgnoreSpaceFirst() throws IOException {
        while (true) {
            int read = this.in.read();
            if (read != 9 && read != 10 && read != 13 && read != 32) {
                return read;
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        Base64InputStream base64InputStream;
        if (this.bufPtr > 2) {
            int readIgnoreSpaceFirst = readIgnoreSpaceFirst();
            if (readIgnoreSpaceFirst < 0) {
                return -1;
            }
            base64InputStream = this;
            base64InputStream.bufPtr = base64InputStream.decode(readIgnoreSpaceFirst, readIgnoreSpace(), readIgnoreSpace(), readIgnoreSpace(), this.outBuf);
        } else {
            base64InputStream = this;
        }
        int[] iArr = base64InputStream.outBuf;
        int i3 = base64InputStream.bufPtr;
        base64InputStream.bufPtr = i3 + 1;
        return iArr[i3];
    }
}
