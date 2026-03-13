package com.fasterxml.jackson.dataformat.cbor;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.dataformat.cbor.CBORGenerator;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CBORFactory extends JsonFactory {
    protected int _formatGeneratorFeatures;
    protected int _formatParserFeatures;
    static final int DEFAULT_CBOR_PARSER_FEATURE_FLAGS = CBORParser.Feature.collectDefaults();
    static final int DEFAULT_CBOR_GENERATOR_FEATURE_FLAGS = CBORGenerator.Feature.collectDefaults();

    public CBORFactory() {
        this(null);
    }

    private final CBORGenerator _createCBORGenerator(IOContext iOContext, int i3, int i10, ObjectCodec objectCodec, OutputStream outputStream) throws IOException {
        CBORGenerator cBORGenerator = new CBORGenerator(iOContext, i3, i10, this._objectCodec, outputStream);
        if (CBORGenerator.Feature.WRITE_TYPE_HEADER.enabledIn(i10)) {
            cBORGenerator.writeTag(55799);
        }
        return cBORGenerator;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public IOContext _createContext(ContentReference contentReference, boolean z2) {
        return super._createContext(contentReference, z2);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, IOContext iOContext) throws IOException {
        return (Writer) _nonByteTarget();
    }

    public <T> T _nonByteTarget() {
        throw new UnsupportedOperationException(StubApp.getString2(11153));
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public boolean canHandleBinaryNatively() {
        return true;
    }

    public CBORFactory(ObjectCodec objectCodec) {
        super(objectCodec);
        this._formatParserFeatures = DEFAULT_CBOR_PARSER_FEATURE_FLAGS;
        this._formatGeneratorFeatures = DEFAULT_CBOR_GENERATOR_FEATURE_FLAGS;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORGenerator _createGenerator(Writer writer, IOContext iOContext) throws IOException {
        return (CBORGenerator) _nonByteTarget();
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORParser _createParser(byte[] bArr, int i3, int i10, IOContext iOContext) throws IOException {
        return new CBORParserBootstrapper(iOContext, bArr, i3, i10).constructParser(this._factoryFeatures, this._parserFeatures, this._formatParserFeatures, this._objectCodec, this._byteSymbolCanonicalizer);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORGenerator _createUTF8Generator(OutputStream outputStream, IOContext iOContext) throws IOException {
        return _createCBORGenerator(iOContext, this._generatorFeatures, this._formatGeneratorFeatures, this._objectCodec, outputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        IOContext _createContext = _createContext(_createContentReference(outputStream), false);
        return _createCBORGenerator(_createContext, this._generatorFeatures, this._formatGeneratorFeatures, this._objectCodec, _decorate(outputStream, _createContext));
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORParser createParser(byte[] bArr) throws IOException {
        return createParser(bArr, 0, bArr.length);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public CBORParser createParser(byte[] bArr, int i3, int i10) throws IOException {
        return _createParser(bArr, i3, i10, _createContext(_createContentReference(bArr, i3, i10), true));
    }
}
