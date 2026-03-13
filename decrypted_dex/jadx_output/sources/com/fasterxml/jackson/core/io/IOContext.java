package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class IOContext {
    protected byte[] _base64Buffer;
    protected final BufferRecycler _bufferRecycler;
    protected char[] _concatCBuffer;
    protected final ContentReference _contentReference;
    protected JsonEncoding _encoding;
    protected final boolean _managedResource;
    protected char[] _nameCopyBuffer;
    protected byte[] _readIOBuffer;

    @Deprecated
    protected final Object _sourceRef;
    protected char[] _tokenCBuffer;
    protected byte[] _writeEncodingBuffer;

    public IOContext(BufferRecycler bufferRecycler, ContentReference contentReference, boolean z2) {
        this._bufferRecycler = bufferRecycler;
        this._contentReference = contentReference;
        this._sourceRef = contentReference.getRawContent();
        this._managedResource = z2;
    }

    private IllegalArgumentException wrongBuf() {
        return new IllegalArgumentException(StubApp.getString2(10373));
    }

    public final void _verifyAlloc(Object obj) {
        if (obj != null) {
            throw new IllegalStateException(StubApp.getString2(10374));
        }
    }

    public final void _verifyRelease(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw wrongBuf();
        }
    }

    public byte[] allocBase64Buffer() {
        _verifyAlloc(this._base64Buffer);
        byte[] allocByteBuffer = this._bufferRecycler.allocByteBuffer(3);
        this._base64Buffer = allocByteBuffer;
        return allocByteBuffer;
    }

    public char[] allocConcatBuffer() {
        _verifyAlloc(this._concatCBuffer);
        char[] allocCharBuffer = this._bufferRecycler.allocCharBuffer(1);
        this._concatCBuffer = allocCharBuffer;
        return allocCharBuffer;
    }

    public char[] allocNameCopyBuffer(int i3) {
        _verifyAlloc(this._nameCopyBuffer);
        char[] allocCharBuffer = this._bufferRecycler.allocCharBuffer(3, i3);
        this._nameCopyBuffer = allocCharBuffer;
        return allocCharBuffer;
    }

    public char[] allocTokenBuffer() {
        _verifyAlloc(this._tokenCBuffer);
        char[] allocCharBuffer = this._bufferRecycler.allocCharBuffer(0);
        this._tokenCBuffer = allocCharBuffer;
        return allocCharBuffer;
    }

    public byte[] allocWriteEncodingBuffer() {
        _verifyAlloc(this._writeEncodingBuffer);
        byte[] allocByteBuffer = this._bufferRecycler.allocByteBuffer(1);
        this._writeEncodingBuffer = allocByteBuffer;
        return allocByteBuffer;
    }

    public TextBuffer constructTextBuffer() {
        return new TextBuffer(this._bufferRecycler);
    }

    public ContentReference contentReference() {
        return this._contentReference;
    }

    public JsonEncoding getEncoding() {
        return this._encoding;
    }

    public boolean isResourceManaged() {
        return this._managedResource;
    }

    public void releaseBase64Buffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._base64Buffer);
            this._base64Buffer = null;
            this._bufferRecycler.releaseByteBuffer(3, bArr);
        }
    }

    public void releaseConcatBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._concatCBuffer);
            this._concatCBuffer = null;
            this._bufferRecycler.releaseCharBuffer(1, cArr);
        }
    }

    public void releaseNameCopyBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._nameCopyBuffer);
            this._nameCopyBuffer = null;
            this._bufferRecycler.releaseCharBuffer(3, cArr);
        }
    }

    public void releaseReadIOBuffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._readIOBuffer);
            this._readIOBuffer = null;
            this._bufferRecycler.releaseByteBuffer(0, bArr);
        }
    }

    public void releaseTokenBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._tokenCBuffer);
            this._tokenCBuffer = null;
            this._bufferRecycler.releaseCharBuffer(0, cArr);
        }
    }

    public void releaseWriteEncodingBuffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._writeEncodingBuffer);
            this._writeEncodingBuffer = null;
            this._bufferRecycler.releaseByteBuffer(1, bArr);
        }
    }

    public void setEncoding(JsonEncoding jsonEncoding) {
        this._encoding = jsonEncoding;
    }

    public final void _verifyRelease(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw wrongBuf();
        }
    }

    public byte[] allocWriteEncodingBuffer(int i3) {
        _verifyAlloc(this._writeEncodingBuffer);
        byte[] allocByteBuffer = this._bufferRecycler.allocByteBuffer(1, i3);
        this._writeEncodingBuffer = allocByteBuffer;
        return allocByteBuffer;
    }
}
