package com.fasterxml.jackson.core.io;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class UTF8Writer extends Writer {
    private final IOContext _context;
    private OutputStream _out;
    private byte[] _outBuffer;
    private final int _outBufferEnd;
    private int _outPtr = 0;
    private int _surrogate;

    public UTF8Writer(IOContext iOContext, OutputStream outputStream) {
        this._context = iOContext;
        this._out = outputStream;
        this._outBuffer = iOContext.allocWriteEncodingBuffer();
        this._outBufferEnd = r1.length - 4;
    }

    public static void illegalSurrogate(int i3) throws IOException {
        throw new IOException(illegalSurrogateDesc(i3));
    }

    public static String illegalSurrogateDesc(int i3) {
        String string2 = StubApp.getString2(10396);
        if (i3 > 1114111) {
            return string2 + Integer.toHexString(i3) + StubApp.getString2(10397);
        }
        if (i3 < 55296) {
            return string2 + Integer.toHexString(i3) + StubApp.getString2(10400);
        }
        String string22 = StubApp.getString2(74);
        if (i3 <= 56319) {
            return StubApp.getString2(10398) + Integer.toHexString(i3) + string22;
        }
        return StubApp.getString2(10399) + Integer.toHexString(i3) + string22;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i3 = this._outPtr;
            if (i3 > 0) {
                outputStream.write(this._outBuffer, 0, i3);
                this._outPtr = 0;
            }
            OutputStream outputStream2 = this._out;
            this._out = null;
            byte[] bArr = this._outBuffer;
            if (bArr != null) {
                this._outBuffer = null;
                this._context.releaseWriteEncodingBuffer(bArr);
            }
            outputStream2.close();
            int i10 = this._surrogate;
            this._surrogate = 0;
            if (i10 > 0) {
                illegalSurrogate(i10);
            }
        }
    }

    public int convertSurrogate(int i3) throws IOException {
        int i10 = this._surrogate;
        this._surrogate = 0;
        if (i3 >= 56320 && i3 <= 57343) {
            return (i3 - 56320) + ((i10 - 55296) << 10) + PKIFailureInfo.notAuthorized;
        }
        throw new IOException(StubApp.getString2(10375) + Integer.toHexString(i10) + StubApp.getString2(10376) + Integer.toHexString(i3) + StubApp.getString2(10377));
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i3 = this._outPtr;
            if (i3 > 0) {
                outputStream.write(this._outBuffer, 0, i3);
                this._outPtr = 0;
            }
            this._out.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        write(c10);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0025, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(char[] r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.UTF8Writer.write(char[], int, int):void");
    }

    @Override // java.io.Writer
    public void write(int i3) throws IOException {
        int i10;
        if (this._surrogate > 0) {
            i3 = convertSurrogate(i3);
        } else if (i3 >= 55296 && i3 <= 57343) {
            if (i3 > 56319) {
                illegalSurrogate(i3);
            }
            this._surrogate = i3;
            return;
        }
        int i11 = this._outPtr;
        if (i11 >= this._outBufferEnd) {
            this._out.write(this._outBuffer, 0, i11);
            this._outPtr = 0;
        }
        if (i3 < 128) {
            byte[] bArr = this._outBuffer;
            int i12 = this._outPtr;
            this._outPtr = i12 + 1;
            bArr[i12] = (byte) i3;
            return;
        }
        int i13 = this._outPtr;
        if (i3 < 2048) {
            byte[] bArr2 = this._outBuffer;
            int i14 = i13 + 1;
            bArr2[i13] = (byte) ((i3 >> 6) | 192);
            i10 = i13 + 2;
            bArr2[i14] = (byte) ((i3 & 63) | 128);
        } else if (i3 <= 65535) {
            byte[] bArr3 = this._outBuffer;
            bArr3[i13] = (byte) ((i3 >> 12) | BERTags.FLAGS);
            int i15 = i13 + 2;
            bArr3[i13 + 1] = (byte) (((i3 >> 6) & 63) | 128);
            i10 = i13 + 3;
            bArr3[i15] = (byte) ((i3 & 63) | 128);
        } else {
            if (i3 > 1114111) {
                illegalSurrogate(i3);
            }
            byte[] bArr4 = this._outBuffer;
            bArr4[i13] = (byte) ((i3 >> 18) | 240);
            bArr4[i13 + 1] = (byte) (((i3 >> 12) & 63) | 128);
            int i16 = i13 + 3;
            bArr4[i13 + 2] = (byte) (((i3 >> 6) & 63) | 128);
            i10 = i13 + 4;
            bArr4[i16] = (byte) ((i3 & 63) | 128);
        }
        this._outPtr = i10;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0029, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(java.lang.String r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.UTF8Writer.write(java.lang.String, int, int):void");
    }
}
