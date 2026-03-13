package com.fasterxml.jackson.core.io;

import com.stub.StubApp;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import kotlin.UByte;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class UTF32Reader extends Reader {
    protected final boolean _bigEndian;
    protected byte[] _buffer;
    protected int _byteCount;
    protected int _charCount;
    protected final IOContext _context;
    protected InputStream _in;
    protected int _length;
    protected final boolean _managedBuffers;
    protected int _ptr;
    protected char _surrogate = 0;
    protected char[] _tmpBuf;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i3, int i10, boolean z2) {
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i3;
        this._length = i10;
        this._bigEndian = z2;
        this._managedBuffers = inputStream != null;
    }

    private void freeBuffers() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            IOContext iOContext = this._context;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    private boolean loadMore(int i3) throws IOException {
        byte[] bArr;
        InputStream inputStream = this._in;
        if (inputStream == null || (bArr = this._buffer) == null) {
            return false;
        }
        this._byteCount = (this._length - i3) + this._byteCount;
        if (i3 > 0) {
            int i10 = this._ptr;
            if (i10 > 0) {
                System.arraycopy(bArr, i10, bArr, 0, i3);
                this._ptr = 0;
            }
            this._length = i3;
        } else {
            this._ptr = 0;
            int read = inputStream.read(bArr);
            if (read < 1) {
                this._length = 0;
                if (read < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    return false;
                }
                reportStrangeStream();
            }
            this._length = read;
        }
        while (true) {
            int i11 = this._length;
            if (i11 >= 4) {
                return true;
            }
            InputStream inputStream2 = this._in;
            byte[] bArr2 = this._buffer;
            int read2 = inputStream2.read(bArr2, i11, bArr2.length - i11);
            if (read2 < 1) {
                if (read2 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    reportUnexpectedEOF(this._length, 4);
                }
                reportStrangeStream();
            }
            this._length += read2;
        }
    }

    private void reportBounds(char[] cArr, int i3, int i10) throws IOException {
        throw new ArrayIndexOutOfBoundsException(String.format(StubApp.getString2(10387), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(cArr.length)));
    }

    private void reportInvalid(int i3, int i10, String str) throws IOException {
        int i11 = (this._byteCount + this._ptr) - 1;
        throw new CharConversionException(StubApp.getString2(10388) + Integer.toHexString(i3) + str + StubApp.getString2(10389) + (this._charCount + i10) + StubApp.getString2(10390) + i11 + StubApp.getString2(74));
    }

    private void reportStrangeStream() throws IOException {
        throw new IOException(StubApp.getString2(10391));
    }

    private void reportUnexpectedEOF(int i3, int i10) throws IOException {
        int i11 = this._byteCount + i3;
        int i12 = this._charCount;
        StringBuilder l9 = AbstractC1482f.l(i3, StubApp.getString2(10392), i10, StubApp.getString2(10393), StubApp.getString2(10394));
        l9.append(i12);
        l9.append(StubApp.getString2(10390));
        l9.append(i11);
        l9.append(StubApp.getString2(74));
        throw new CharConversionException(l9.toString());
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            freeBuffers();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this._tmpBuf == null) {
            this._tmpBuf = new char[1];
        }
        if (read(this._tmpBuf, 0, 1) < 1) {
            return -1;
        }
        return this._tmpBuf[0];
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i3, int i10) throws IOException {
        int i11;
        int i12;
        int i13;
        if (this._buffer == null) {
            return -1;
        }
        if (i10 < 1) {
            return i10;
        }
        if (i3 < 0 || i3 + i10 > cArr.length) {
            reportBounds(cArr, i3, i10);
        }
        int i14 = i10 + i3;
        char c10 = this._surrogate;
        if (c10 != 0) {
            i11 = i3 + 1;
            cArr[i3] = c10;
            this._surrogate = (char) 0;
        } else {
            int i15 = this._length - this._ptr;
            if (i15 < 4 && !loadMore(i15)) {
                if (i15 == 0) {
                    return -1;
                }
                reportUnexpectedEOF(this._length - this._ptr, 4);
            }
            i11 = i3;
        }
        int i16 = this._length - 4;
        while (true) {
            if (i11 >= i14) {
                break;
            }
            int i17 = this._ptr;
            if (i17 > i16) {
                break;
            }
            if (this._bigEndian) {
                byte[] bArr = this._buffer;
                i12 = (bArr[i17] << 8) | (bArr[i17 + 1] & UByte.MAX_VALUE);
                i13 = (bArr[i17 + 3] & UByte.MAX_VALUE) | ((bArr[i17 + 2] & UByte.MAX_VALUE) << 8);
            } else {
                byte[] bArr2 = this._buffer;
                int i18 = (bArr2[i17] & UByte.MAX_VALUE) | ((bArr2[i17 + 1] & UByte.MAX_VALUE) << 8);
                i12 = (bArr2[i17 + 3] << 8) | (bArr2[i17 + 2] & UByte.MAX_VALUE);
                i13 = i18;
            }
            this._ptr = i17 + 4;
            if (i12 != 0) {
                int i19 = 65535 & i12;
                int i20 = i13 | ((i19 - 1) << 16);
                if (i19 > 16) {
                    reportInvalid(i20, i11 - i3, String.format(StubApp.getString2(10395), 1114111));
                }
                int i21 = i11 + 1;
                cArr[i11] = (char) ((i20 >> 10) + 55296);
                int i22 = (i20 & 1023) | 56320;
                if (i21 >= i14) {
                    this._surrogate = (char) i20;
                    i11 = i21;
                    break;
                }
                i13 = i22;
                i11 = i21;
            }
            cArr[i11] = (char) i13;
            i11++;
        }
        int i23 = i11 - i3;
        this._charCount += i23;
        return i23;
    }
}
