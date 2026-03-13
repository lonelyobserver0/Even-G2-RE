package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ByteBufferBackedOutputStream extends OutputStream {
    protected final ByteBuffer _b;

    public ByteBufferBackedOutputStream(ByteBuffer byteBuffer) {
        this._b = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        this._b.put((byte) i3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        this._b.put(bArr, i3, i10);
    }
}
