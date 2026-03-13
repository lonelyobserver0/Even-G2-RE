package com.fasterxml.jackson.dataformat.cbor;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CBORParserBootstrapper {
    protected final IOContext _context;
    protected final byte[] _inputBuffer;
    protected int _inputEnd;
    protected int _inputProcessed;
    protected int _inputPtr;
    protected final InputStream _in = null;
    protected final boolean _bufferRecyclable = false;

    public CBORParserBootstrapper(IOContext iOContext, byte[] bArr, int i3, int i10) {
        this._context = iOContext;
        this._inputBuffer = bArr;
        this._inputPtr = i3;
        this._inputEnd = i10 + i3;
        this._inputProcessed = -i3;
    }

    public CBORParser constructParser(int i3, int i10, int i11, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer) throws IOException, JsonParseException {
        ByteQuadsCanonicalizer makeChildOrPlaceholder = byteQuadsCanonicalizer.makeChildOrPlaceholder(i3);
        ensureLoaded(1);
        return new CBORParser(this._context, i10, i11, objectCodec, makeChildOrPlaceholder, this._in, this._inputBuffer, this._inputPtr, this._inputEnd, this._bufferRecyclable);
    }

    public boolean ensureLoaded(int i3) throws IOException {
        if (this._in == null) {
            return false;
        }
        int i10 = this._inputEnd - this._inputPtr;
        while (i10 < i3) {
            InputStream inputStream = this._in;
            byte[] bArr = this._inputBuffer;
            int i11 = this._inputEnd;
            int read = inputStream.read(bArr, i11, bArr.length - i11);
            if (read < 1) {
                return false;
            }
            this._inputEnd += read;
            i10 += read;
        }
        return true;
    }
}
