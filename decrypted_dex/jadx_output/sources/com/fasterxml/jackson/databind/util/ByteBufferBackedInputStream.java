package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ByteBufferBackedInputStream extends InputStream {
    protected final ByteBuffer _b;

    public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
        this._b = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this._b.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this._b.hasRemaining()) {
            return this._b.get() & UByte.MAX_VALUE;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i3, int i10) throws IOException {
        if (!this._b.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i10, this._b.remaining());
        this._b.get(bArr, i3, min);
        return min;
    }
}
