package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.Writer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SegmentedStringWriter extends Writer {
    private final TextBuffer _buffer;

    public SegmentedStringWriter(BufferRecycler bufferRecycler) {
        this._buffer = new TextBuffer(bufferRecycler);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String getAndClear() {
        String contentsAsString = this._buffer.contentsAsString();
        this._buffer.releaseBuffers();
        return contentsAsString;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this._buffer.append(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i3, int i10) {
        this._buffer.append(cArr, i3, i10);
    }

    @Override // java.io.Writer
    public void write(int i3) {
        this._buffer.append((char) i3);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        write(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        this._buffer.append(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this._buffer.append(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i3, int i10) {
        this._buffer.append(str, i3, i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i3, int i10) {
        String charSequence2 = charSequence.subSequence(i3, i10).toString();
        this._buffer.append(charSequence2, 0, charSequence2.length());
        return this;
    }
}
