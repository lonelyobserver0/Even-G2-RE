package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.stub.StubApp;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ParserBase extends ParserMinimalBase {
    protected static final JacksonFeatureSet<StreamReadCapability> JSON_READ_CAPABILITIES = JsonParser.DEFAULT_READ_CAPABILITIES;
    protected byte[] _binaryValue;
    protected ByteArrayBuilder _byteArrayBuilder;
    protected boolean _closed;
    protected long _currInputProcessed;
    protected int _currInputRow;
    protected int _currInputRowStart;
    protected int _expLength;
    protected int _fractLength;
    protected int _inputEnd;
    protected int _inputPtr;
    protected int _intLength;
    protected final IOContext _ioContext;
    protected boolean _nameCopied;
    protected char[] _nameCopyBuffer;
    protected JsonToken _nextToken;
    protected int _numTypesValid;
    protected BigDecimal _numberBigDecimal;
    protected BigInteger _numberBigInt;
    protected double _numberDouble;
    protected float _numberFloat;
    protected int _numberInt;
    protected long _numberLong;
    protected boolean _numberNegative;
    protected String _numberString;
    protected JsonReadContext _parsingContext;
    protected final TextBuffer _textBuffer;
    protected int _tokenInputCol;
    protected int _tokenInputRow;
    protected long _tokenInputTotal;

    public ParserBase(IOContext iOContext, int i3) {
        super(i3);
        this._currInputRow = 1;
        this._tokenInputRow = 1;
        this._numTypesValid = 0;
        this._ioContext = iOContext;
        this._textBuffer = iOContext.constructTextBuffer();
        this._parsingContext = JsonReadContext.createRootContext(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i3) ? DupDetector.rootDetector(this) : null);
    }

    private void _parseSlowFloat(int i3) throws IOException {
        try {
            if (i3 == 16) {
                this._numberBigDecimal = null;
                this._numberString = this._textBuffer.contentsAsString();
                this._numTypesValid = 16;
            } else if (i3 == 32) {
                this._numberFloat = this._textBuffer.contentsAsFloat(isEnabled(JsonParser.Feature.USE_FAST_DOUBLE_PARSER));
                this._numTypesValid = 32;
            } else {
                this._numberDouble = this._textBuffer.contentsAsDouble(isEnabled(JsonParser.Feature.USE_FAST_DOUBLE_PARSER));
                this._numTypesValid = 8;
            }
        } catch (NumberFormatException e10) {
            _wrapError(StubApp.getString2(10322) + _longNumberDesc(this._textBuffer.contentsAsString()) + StubApp.getString2(74), e10);
        }
    }

    private void _parseSlowInt(int i3) throws IOException {
        String contentsAsString = this._textBuffer.contentsAsString();
        try {
            int i10 = this._intLength;
            char[] textBuffer = this._textBuffer.getTextBuffer();
            int textOffset = this._textBuffer.getTextOffset();
            boolean z2 = this._numberNegative;
            if (z2) {
                textOffset++;
            }
            if (NumberInput.inLongRange(textBuffer, textOffset, i10, z2)) {
                this._numberLong = Long.parseLong(contentsAsString);
                this._numTypesValid = 2;
                return;
            }
            if (i3 == 1 || i3 == 2) {
                _reportTooLongIntegral(i3, contentsAsString);
            }
            if (i3 != 8 && i3 != 32) {
                this._numberBigInt = null;
                this._numberString = contentsAsString;
                this._numTypesValid = 4;
                return;
            }
            this._numberDouble = NumberInput.parseDouble(contentsAsString, isEnabled(JsonParser.Feature.USE_FAST_DOUBLE_PARSER));
            this._numTypesValid = 8;
        } catch (NumberFormatException e10) {
            _wrapError(StubApp.getString2(10322) + _longNumberDesc(contentsAsString) + StubApp.getString2(74), e10);
        }
    }

    public static int[] growArrayBy(int[] iArr, int i3) {
        return iArr == null ? new int[i3] : Arrays.copyOf(iArr, iArr.length + i3);
    }

    public void _checkStdFeatureChanges(int i3, int i10) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i10 & mask) == 0 || (i3 & mask) == 0) {
            return;
        }
        if (this._parsingContext.getDupDetector() == null) {
            this._parsingContext = this._parsingContext.withDupDetector(DupDetector.rootDetector(this));
        } else {
            this._parsingContext = this._parsingContext.withDupDetector(null);
        }
    }

    public abstract void _closeInput() throws IOException;

    public ContentReference _contentReference() {
        return JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this._features) ? this._ioContext.contentReference() : ContentReference.unknown();
    }

    public final int _decodeBase64Escape(Base64Variant base64Variant, int i3, int i10) throws IOException {
        if (i3 != 92) {
            throw reportInvalidBase64Char(base64Variant, i3, i10);
        }
        char _decodeEscaped = _decodeEscaped();
        if (_decodeEscaped <= ' ' && i10 == 0) {
            return -1;
        }
        int decodeBase64Char = base64Variant.decodeBase64Char((int) _decodeEscaped);
        if (decodeBase64Char >= 0 || decodeBase64Char == -2) {
            return decodeBase64Char;
        }
        throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i10);
    }

    public abstract char _decodeEscaped() throws IOException;

    public final int _eofAsNextChar() throws JsonParseException {
        _handleEOF();
        return -1;
    }

    public BigDecimal _getBigDecimal() {
        BigDecimal bigDecimal = this._numberBigDecimal;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        String str = this._numberString;
        if (str == null) {
            throw new IllegalStateException(StubApp.getString2(10323));
        }
        BigDecimal parseBigDecimal = NumberInput.parseBigDecimal(str);
        this._numberBigDecimal = parseBigDecimal;
        this._numberString = null;
        return parseBigDecimal;
    }

    public BigInteger _getBigInteger() {
        BigInteger bigInteger = this._numberBigInt;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = this._numberString;
        if (str == null) {
            throw new IllegalStateException(StubApp.getString2(10324));
        }
        BigInteger parseBigInteger = NumberInput.parseBigInteger(str);
        this._numberBigInt = parseBigInteger;
        this._numberString = null;
        return parseBigInteger;
    }

    public ByteArrayBuilder _getByteArrayBuilder() {
        ByteArrayBuilder byteArrayBuilder = this._byteArrayBuilder;
        if (byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder();
        } else {
            byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    public void _handleBase64MissingPadding(Base64Variant base64Variant) throws IOException {
        _reportError(base64Variant.missingPaddingMessage());
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public void _handleEOF() throws JsonParseException {
        if (this._parsingContext.inRoot()) {
            return;
        }
        _reportInvalidEOF(String.format(StubApp.getString2(10325), this._parsingContext.inArray() ? StubApp.getString2(10292) : StubApp.getString2(10291), this._parsingContext.startLocation(_contentReference())), null);
    }

    public char _handleUnrecognizedCharacterEscape(char c10) throws JsonProcessingException {
        if (isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || (c10 == '\'' && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES))) {
            return c10;
        }
        _reportError(StubApp.getString2(10326) + ParserMinimalBase._getCharDesc(c10));
        return c10;
    }

    public int _parseIntValue() throws IOException {
        if (this._closed) {
            _reportError(StubApp.getString2(10327));
        }
        if (this._currToken != JsonToken.VALUE_NUMBER_INT || this._intLength > 9) {
            _parseNumericValue(1);
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
            return this._numberInt;
        }
        int contentsAsInt = this._textBuffer.contentsAsInt(this._numberNegative);
        this._numberInt = contentsAsInt;
        this._numTypesValid = 1;
        return contentsAsInt;
    }

    public void _parseNumericValue(int i3) throws IOException {
        if (this._closed) {
            _reportError(StubApp.getString2(10327));
        }
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT) {
            if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                _parseSlowFloat(i3);
                return;
            } else {
                _reportError(StubApp.getString2(10328), jsonToken);
                return;
            }
        }
        int i10 = this._intLength;
        if (i10 <= 9) {
            this._numberInt = this._textBuffer.contentsAsInt(this._numberNegative);
            this._numTypesValid = 1;
            return;
        }
        if (i10 > 18) {
            _parseSlowInt(i3);
            return;
        }
        long contentsAsLong = this._textBuffer.contentsAsLong(this._numberNegative);
        if (i10 == 10) {
            if (this._numberNegative) {
                if (contentsAsLong >= -2147483648L) {
                    this._numberInt = (int) contentsAsLong;
                    this._numTypesValid = 1;
                    return;
                }
            } else if (contentsAsLong <= 2147483647L) {
                this._numberInt = (int) contentsAsLong;
                this._numTypesValid = 1;
                return;
            }
        }
        this._numberLong = contentsAsLong;
        this._numTypesValid = 2;
    }

    public void _releaseBuffers() throws IOException {
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    public void _reportMismatchedEndMarker(int i3, char c10) throws JsonParseException {
        JsonReadContext parsingContext = getParsingContext();
        _reportError(String.format(StubApp.getString2(10329), Character.valueOf((char) i3), Character.valueOf(c10), parsingContext.typeDesc(), parsingContext.startLocation(_contentReference())));
    }

    public void _reportTooLongIntegral(int i3, String str) throws IOException {
        if (i3 == 1) {
            reportOverflowInt(str);
        } else {
            reportOverflowLong(str);
        }
    }

    public void _throwUnquotedSpace(int i3, String str) throws JsonParseException {
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i3 > 32) {
            _reportError(StubApp.getString2(10330) + ParserMinimalBase._getCharDesc((char) i3) + StubApp.getString2(10331) + str);
        }
    }

    public String _validJsonTokenList() throws IOException {
        return _validJsonValueList();
    }

    public String _validJsonValueList() throws IOException {
        return isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS) ? StubApp.getString2(10332) : StubApp.getString2(10333);
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this._closed) {
            return;
        }
        this._inputPtr = Math.max(this._inputPtr, this._inputEnd);
        this._closed = true;
        try {
            _closeInput();
        } finally {
            _releaseBuffers();
        }
    }

    public void convertNumberToBigDecimal() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 8) != 0) {
            this._numberBigDecimal = NumberInput.parseBigDecimal(getText());
        } else if ((i3 & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(_getBigInteger());
        } else if ((i3 & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((i3 & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberInt);
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 16;
    }

    public void convertNumberToBigInteger() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 16) != 0) {
            this._numberBigInt = _getBigDecimal().toBigInteger();
        } else if ((i3 & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((i3 & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberInt);
        } else if ((i3 & 8) != 0) {
            this._numberBigInt = BigDecimal.valueOf(this._numberDouble).toBigInteger();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 4;
    }

    public void convertNumberToDouble() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 16) != 0) {
            this._numberDouble = _getBigDecimal().doubleValue();
        } else if ((i3 & 4) != 0) {
            this._numberDouble = _getBigInteger().doubleValue();
        } else if ((i3 & 2) != 0) {
            this._numberDouble = this._numberLong;
        } else if ((i3 & 1) != 0) {
            this._numberDouble = this._numberInt;
        } else if ((i3 & 32) != 0) {
            this._numberDouble = this._numberFloat;
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 8;
    }

    public void convertNumberToFloat() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 16) != 0) {
            this._numberFloat = _getBigDecimal().floatValue();
        } else if ((i3 & 4) != 0) {
            this._numberFloat = _getBigInteger().floatValue();
        } else if ((i3 & 2) != 0) {
            this._numberFloat = this._numberLong;
        } else if ((i3 & 1) != 0) {
            this._numberFloat = this._numberInt;
        } else if ((i3 & 8) != 0) {
            this._numberFloat = (float) this._numberDouble;
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 32;
    }

    public void convertNumberToInt() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 2) != 0) {
            long j = this._numberLong;
            int i10 = (int) j;
            if (i10 != j) {
                reportOverflowInt(getText(), currentToken());
            }
            this._numberInt = i10;
        } else if ((i3 & 4) != 0) {
            BigInteger _getBigInteger = _getBigInteger();
            if (ParserMinimalBase.BI_MIN_INT.compareTo(_getBigInteger) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(_getBigInteger) < 0) {
                reportOverflowInt();
            }
            this._numberInt = _getBigInteger.intValue();
        } else if ((i3 & 8) != 0) {
            double d8 = this._numberDouble;
            if (d8 < -2.147483648E9d || d8 > 2.147483647E9d) {
                reportOverflowInt();
            }
            this._numberInt = (int) this._numberDouble;
        } else if ((i3 & 16) != 0) {
            BigDecimal _getBigDecimal = _getBigDecimal();
            if (ParserMinimalBase.BD_MIN_INT.compareTo(_getBigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(_getBigDecimal) < 0) {
                reportOverflowInt();
            }
            this._numberInt = _getBigDecimal.intValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 1;
    }

    public void convertNumberToLong() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 1) != 0) {
            this._numberLong = this._numberInt;
        } else if ((i3 & 4) != 0) {
            BigInteger _getBigInteger = _getBigInteger();
            if (ParserMinimalBase.BI_MIN_LONG.compareTo(_getBigInteger) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(_getBigInteger) < 0) {
                reportOverflowLong();
            }
            this._numberLong = _getBigInteger.longValue();
        } else if ((i3 & 8) != 0) {
            double d8 = this._numberDouble;
            if (d8 < -9.223372036854776E18d || d8 > 9.223372036854776E18d) {
                reportOverflowLong();
            }
            this._numberLong = (long) this._numberDouble;
        } else if ((i3 & 16) != 0) {
            BigDecimal _getBigDecimal = _getBigDecimal();
            if (ParserMinimalBase.BD_MIN_LONG.compareTo(_getBigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(_getBigDecimal) < 0) {
                reportOverflowLong();
            }
            this._numberLong = _getBigDecimal.longValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 4) == 0) {
            if (i3 == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return _getBigInteger();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() throws IOException {
        JsonReadContext parent;
        JsonToken jsonToken = this._currToken;
        return ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (parent = this._parsingContext.getParent()) != null) ? parent.getCurrentName() : this._parsingContext.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 16) == 0) {
            if (i3 == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return _getBigDecimal();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 8) == 0) {
            if (i3 == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return this._numberDouble;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 32) == 0) {
            if (i3 == 0) {
                _parseNumericValue(32);
            }
            if ((this._numTypesValid & 32) == 0) {
                convertNumberToFloat();
            }
        }
        return this._numberFloat;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 1) == 0) {
            if (i3 == 0) {
                return _parseIntValue();
            }
            if ((i3 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 2) == 0) {
            if (i3 == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i3 = this._numTypesValid;
            return (i3 & 1) != 0 ? JsonParser.NumberType.INT : (i3 & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER;
        }
        int i10 = this._numTypesValid;
        return (i10 & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : (i10 & 32) != 0 ? JsonParser.NumberType.FLOAT : JsonParser.NumberType.DOUBLE;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i3 = this._numTypesValid;
            if ((i3 & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i3 & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i3 & 4) != 0) {
                return _getBigInteger();
            }
            _throwInternal();
        }
        int i10 = this._numTypesValid;
        if ((i10 & 16) != 0) {
            return _getBigDecimal();
        }
        if ((i10 & 32) != 0) {
            return Float.valueOf(this._numberFloat);
        }
        if ((i10 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(this._numberDouble);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValueExact() throws IOException {
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(0);
            }
            int i3 = this._numTypesValid;
            if ((i3 & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i3 & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i3 & 4) != 0) {
                return _getBigInteger();
            }
            _throwInternal();
        }
        if (this._numTypesValid == 0) {
            _parseNumericValue(16);
        }
        int i10 = this._numTypesValid;
        if ((i10 & 16) != 0) {
            return _getBigDecimal();
        }
        if ((i10 & 32) != 0) {
            return Float.valueOf(this._numberFloat);
        }
        if ((i10 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(this._numberDouble);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isNaN() {
        if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT || (this._numTypesValid & 8) == 0) {
            return false;
        }
        double d8 = this._numberDouble;
        return Double.isNaN(d8) || Double.isInfinite(d8);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser overrideStdFeatures(int i3, int i10) {
        int i11 = this._features;
        int i12 = (i3 & i10) | ((~i10) & i11);
        int i13 = i11 ^ i12;
        if (i13 != 0) {
            this._features = i12;
            _checkStdFeatureChanges(i12, i13);
        }
        return this;
    }

    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i3, int i10) throws IllegalArgumentException {
        return reportInvalidBase64Char(base64Variant, i3, i10, null);
    }

    public final JsonToken resetAsNaN(String str, double d8) {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d8;
        this._numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken resetFloat(boolean z2, int i3, int i10, int i11) {
        this._numberNegative = z2;
        this._intLength = i3;
        this._fractLength = i10;
        this._expLength = i11;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken resetInt(boolean z2, int i3) {
        this._numberNegative = z2;
        this._intLength = i3;
        this._fractLength = 0;
        this._expLength = 0;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCurrentValue(Object obj) {
        this._parsingContext.setCurrentValue(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser setFeatureMask(int i3) {
        int i10 = this._features ^ i3;
        if (i10 != 0) {
            this._features = i3;
            _checkStdFeatureChanges(i3, i10);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonReadContext getParsingContext() {
        return this._parsingContext;
    }

    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i3, int i10, String str) throws IllegalArgumentException {
        String str2;
        if (i3 <= 32) {
            str2 = String.format(StubApp.getString2(10334), Integer.toHexString(i3), Integer.valueOf(i10 + 1));
        } else if (base64Variant.usesPaddingChar(i3)) {
            str2 = StubApp.getString2(10335) + base64Variant.getPaddingChar() + StubApp.getString2(10336) + (i10 + 1) + StubApp.getString2(10337);
        } else {
            boolean isDefined = Character.isDefined(i3);
            String string2 = StubApp.getString2(10338);
            if (!isDefined || Character.isISOControl(i3)) {
                str2 = StubApp.getString2(10341) + Integer.toHexString(i3) + string2;
            } else {
                str2 = StubApp.getString2(10339) + ((char) i3) + StubApp.getString2(10340) + Integer.toHexString(i3) + string2;
            }
        }
        if (str != null) {
            str2 = AbstractC1482f.h(str2, StubApp.getString2(994), str);
        }
        return new IllegalArgumentException(str2);
    }

    public final int _decodeBase64Escape(Base64Variant base64Variant, char c10, int i3) throws IOException {
        if (c10 == '\\') {
            char _decodeEscaped = _decodeEscaped();
            if (_decodeEscaped <= ' ' && i3 == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char(_decodeEscaped);
            if (decodeBase64Char >= 0 || (decodeBase64Char == -2 && i3 >= 2)) {
                return decodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i3);
        }
        throw reportInvalidBase64Char(base64Variant, c10, i3);
    }
}
