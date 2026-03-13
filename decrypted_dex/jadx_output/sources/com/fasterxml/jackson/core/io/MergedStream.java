package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MergedStream extends InputStream {
    private byte[] _b;
    private final IOContext _ctxt;
    private final int _end;
    private final InputStream _in;
    private int _ptr;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i3, int i10) {
        this._ctxt = iOContext;
        this._in = inputStream;
        this._b = bArr;
        this._ptr = i3;
        this._end = i10;
    }

    private void _free() {
        byte[] bArr = this._b;
        if (bArr != null) {
            this._b = null;
            IOContext iOContext = this._ctxt;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this._b != null ? this._end - this._ptr : this._in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        _free();
        this._in.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i3) {
        if (this._b == null) {
            this._in.mark(i3);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this._b == null && this._in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this._b;
        if (bArr == null) {
            return this._in.read();
        }
        int i3 = this._ptr;
        int i10 = i3 + 1;
        this._ptr = i10;
        int i11 = bArr[i3] & UByte.MAX_VALUE;
        if (i10 >= this._end) {
            _free();
        }
        return i11;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this._b == null) {
            this._in.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j3;
        if (this._b != null) {
            int i3 = this._end;
            int i10 = this._ptr;
            j3 = i3 - i10;
            if (j3 > j) {
                this._ptr = i10 + ((int) j);
                return j;
            }
            _free();
            j -= j3;
        } else {
            j3 = 0;
        }
        return j > 0 ? this._in.skip(j) + j3 : j3;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i3, int i10) throws IOException {
        byte[] bArr2 = this._b;
        if (bArr2 != null) {
            int i11 = this._end;
            int i12 = this._ptr;
            int i13 = i11 - i12;
            if (i10 > i13) {
                i10 = i13;
            }
            System.arraycopy(bArr2, i12, bArr, i3, i10);
            int i14 = this._ptr + i10;
            this._ptr = i14;
            if (i14 >= this._end) {
                _free();
            }
            return i10;
        }
        return this._in.read(bArr, i3, i10);
    }
}
