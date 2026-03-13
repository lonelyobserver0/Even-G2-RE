package com.fasterxml.jackson.core;

import E1.a;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JsonParser implements Closeable {
    protected static final JacksonFeatureSet<StreamReadCapability> DEFAULT_READ_CAPABILITIES = JacksonFeatureSet.fromDefaults(StreamReadCapability.values());
    protected int _features;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true),
        USE_FAST_DOUBLE_PARSER(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

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

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i3) {
            return (i3 & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public JsonParser() {
        this._features = JsonFactory.DEFAULT_PARSER_FEATURE_FLAGS;
    }

    public JsonParseException _constructError(String str) {
        return new JsonParseException(this, str).withRequestPayload(null);
    }

    public JsonParseException _constructReadException(String str) {
        return _constructError(str);
    }

    public boolean canReadObjectId() {
        return false;
    }

    public boolean canReadTypeId() {
        return false;
    }

    public abstract void clearCurrentToken();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public String currentName() throws IOException {
        return getCurrentName();
    }

    public abstract JsonToken currentToken();

    public abstract int currentTokenId();

    public abstract BigInteger getBigIntegerValue() throws IOException;

    public byte[] getBinaryValue() throws IOException {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public abstract byte[] getBinaryValue(Base64Variant base64Variant) throws IOException;

    public boolean getBooleanValue() throws IOException {
        JsonToken currentToken = currentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (currentToken == JsonToken.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException(this, StubApp.getString2(10284) + currentToken + StubApp.getString2(10285)).withRequestPayload(null);
    }

    public byte getByteValue() throws IOException {
        int intValue = getIntValue();
        if (intValue >= -128 && intValue <= 255) {
            return (byte) intValue;
        }
        throw new InputCoercionException(this, a.k(StubApp.getString2(10286), getText(), StubApp.getString2(10287)), JsonToken.VALUE_NUMBER_INT, Byte.TYPE);
    }

    public abstract ObjectCodec getCodec();

    public abstract JsonLocation getCurrentLocation();

    public abstract String getCurrentName() throws IOException;

    public abstract JsonToken getCurrentToken();

    public abstract BigDecimal getDecimalValue() throws IOException;

    public abstract double getDoubleValue() throws IOException;

    public Object getEmbeddedObject() throws IOException {
        return null;
    }

    public abstract float getFloatValue() throws IOException;

    public abstract int getIntValue() throws IOException;

    public abstract long getLongValue() throws IOException;

    public abstract NumberType getNumberType() throws IOException;

    public abstract Number getNumberValue() throws IOException;

    public Number getNumberValueExact() throws IOException {
        return getNumberValue();
    }

    public Object getObjectId() throws IOException {
        return null;
    }

    public abstract JsonStreamContext getParsingContext();

    public abstract JacksonFeatureSet<StreamReadCapability> getReadCapabilities();

    public short getShortValue() throws IOException {
        int intValue = getIntValue();
        if (intValue >= -32768 && intValue <= 32767) {
            return (short) intValue;
        }
        throw new InputCoercionException(this, a.k(StubApp.getString2(10286), getText(), StubApp.getString2(10288)), JsonToken.VALUE_NUMBER_INT, Short.TYPE);
    }

    public abstract String getText() throws IOException;

    public abstract char[] getTextCharacters() throws IOException;

    public abstract int getTextLength() throws IOException;

    public abstract int getTextOffset() throws IOException;

    public abstract JsonLocation getTokenLocation();

    public Object getTypeId() throws IOException {
        return null;
    }

    public abstract int getValueAsInt() throws IOException;

    public abstract long getValueAsLong() throws IOException;

    public abstract String getValueAsString() throws IOException;

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public abstract boolean hasToken(JsonToken jsonToken);

    public abstract boolean hasTokenId(int i3);

    public boolean isEnabled(Feature feature) {
        return feature.enabledIn(this._features);
    }

    public abstract boolean isExpectedNumberIntToken();

    public abstract boolean isExpectedStartArrayToken();

    public abstract boolean isExpectedStartObjectToken();

    public abstract boolean isNaN() throws IOException;

    public String nextFieldName() throws IOException {
        if (nextToken() == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return null;
    }

    public String nextTextValue() throws IOException {
        if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    public abstract JsonToken nextToken() throws IOException;

    public JsonParser overrideFormatFeatures(int i3, int i10) {
        return this;
    }

    public JsonParser overrideStdFeatures(int i3, int i10) {
        return setFeatureMask((i3 & i10) | (this._features & (~i10)));
    }

    public abstract int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException;

    public boolean requiresCustomCodec() {
        return false;
    }

    public void setCurrentValue(Object obj) {
        JsonStreamContext parsingContext = getParsingContext();
        if (parsingContext != null) {
            parsingContext.setCurrentValue(obj);
        }
    }

    @Deprecated
    public JsonParser setFeatureMask(int i3) {
        this._features = i3;
        return this;
    }

    public abstract JsonParser skipChildren() throws IOException;

    public JsonParseException _constructReadException(String str, Object obj) {
        return _constructReadException(String.format(str, obj));
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return streamReadFeature.mappedFeature().enabledIn(this._features);
    }

    public JsonParser(int i3) {
        this._features = i3;
    }

    public JsonParseException _constructReadException(String str, Object obj, Object obj2) {
        return _constructReadException(String.format(str, obj, obj2));
    }
}
