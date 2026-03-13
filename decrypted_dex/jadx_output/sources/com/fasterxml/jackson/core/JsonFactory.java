package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.JacksonFeature;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.Writer;
import kotlin.text.Typography;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JsonFactory extends TokenStreamFactory implements Serializable {
    protected final transient ByteQuadsCanonicalizer _byteSymbolCanonicalizer;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected int _maximumNonEscapedChar;
    protected ObjectCodec _objectCodec;
    protected int _parserFeatures;
    protected final char _quoteChar;
    protected final transient CharsToNameCanonicalizer _rootCharSymbols;
    protected SerializableString _rootValueSeparator;
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    public static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    public enum Feature implements JacksonFeature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        private final boolean _defaultState;

        Feature(boolean z2) {
            this._defaultState = z2;
        }

        public static int collectDefaults() {
            int i3 = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i3 |= feature.getMask();
                }
            }
            return i3;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public boolean enabledIn(int i3) {
            return (i3 & getMask()) != 0;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this(null);
    }

    public ContentReference _createContentReference(Object obj) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj);
    }

    public IOContext _createContext(ContentReference contentReference, boolean z2) {
        if (contentReference == null) {
            contentReference = ContentReference.unknown();
        }
        return new IOContext(_getBufferRecycler(), contentReference, z2);
    }

    public JsonGenerator _createGenerator(Writer writer, IOContext iOContext) throws IOException {
        WriterBasedJsonGenerator writerBasedJsonGenerator = new WriterBasedJsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        int i3 = this._maximumNonEscapedChar;
        if (i3 > 0) {
            writerBasedJsonGenerator.setHighestNonEscapedChar(i3);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            writerBasedJsonGenerator.setRootValueSeparator(serializableString);
        }
        return writerBasedJsonGenerator;
    }

    public JsonParser _createParser(byte[] bArr, int i3, int i10, IOContext iOContext) throws IOException {
        return new ByteSourceJsonBootstrapper(iOContext, bArr, i3, i10).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    public JsonGenerator _createUTF8Generator(OutputStream outputStream, IOContext iOContext) throws IOException {
        UTF8JsonGenerator uTF8JsonGenerator = new UTF8JsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        int i3 = this._maximumNonEscapedChar;
        if (i3 > 0) {
            uTF8JsonGenerator.setHighestNonEscapedChar(i3);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            uTF8JsonGenerator.setRootValueSeparator(serializableString);
        }
        return uTF8JsonGenerator;
    }

    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, IOContext iOContext) throws IOException {
        return jsonEncoding == JsonEncoding.UTF8 ? new UTF8Writer(iOContext, outputStream) : new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    public final OutputStream _decorate(OutputStream outputStream, IOContext iOContext) throws IOException {
        return outputStream;
    }

    public BufferRecycler _getBufferRecycler() {
        return Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures) ? BufferRecyclers.getBufferRecycler() : new BufferRecycler();
    }

    public boolean canHandleBinaryNatively() {
        return false;
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        IOContext _createContext = _createContext(_createContentReference(outputStream), false);
        _createContext.setEncoding(jsonEncoding);
        return jsonEncoding == JsonEncoding.UTF8 ? _createUTF8Generator(_decorate(outputStream, _createContext), _createContext) : _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    public JsonParser createParser(byte[] bArr) throws IOException, JsonParseException {
        return _createParser(bArr, 0, bArr.length, _createContext(_createContentReference(bArr), true));
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
        this._quoteChar = Typography.quote;
    }

    public ContentReference _createContentReference(Object obj, int i3, int i10) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj, i3, i10);
    }

    public final Writer _decorate(Writer writer, IOContext iOContext) throws IOException {
        return writer;
    }

    public JsonParser createParser(byte[] bArr, int i3, int i10) throws IOException, JsonParseException {
        _checkRangeBoundsForByteArray(bArr, i3, i10);
        return _createParser(bArr, i3, i10, _createContext(_createContentReference(bArr, i3, i10), true));
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        IOContext _createContext = _createContext(_createContentReference(writer), false);
        return _createGenerator(_decorate(writer, _createContext), _createContext);
    }
}
