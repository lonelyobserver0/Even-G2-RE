package com.fasterxml.jackson.core.base;

import E1.a;
import Xa.h;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.stub.StubApp;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ParserMinimalBase extends JsonParser {
    protected static final BigDecimal BD_MAX_INT;
    protected static final BigDecimal BD_MAX_LONG;
    protected static final BigDecimal BD_MIN_INT;
    protected static final BigDecimal BD_MIN_LONG;
    protected static final BigInteger BI_MAX_INT;
    protected static final BigInteger BI_MAX_LONG;
    protected static final BigInteger BI_MIN_INT;
    protected static final BigInteger BI_MIN_LONG;
    protected static final byte[] NO_BYTES = new byte[0];
    protected static final int[] NO_INTS = new int[0];
    protected JsonToken _currToken;
    protected JsonToken _lastClearedToken;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        BI_MIN_INT = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        BI_MAX_INT = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        BI_MIN_LONG = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(LongCompanionObject.MAX_VALUE);
        BI_MAX_LONG = valueOf4;
        BD_MIN_LONG = new BigDecimal(valueOf3);
        BD_MAX_LONG = new BigDecimal(valueOf4);
        BD_MIN_INT = new BigDecimal(valueOf);
        BD_MAX_INT = new BigDecimal(valueOf2);
    }

    public ParserMinimalBase() {
    }

    public static final String _getCharDesc(int i3) {
        char c10 = (char) i3;
        boolean isISOControl = Character.isISOControl(c10);
        String string2 = StubApp.getString2(74);
        if (isISOControl) {
            return h.g(i3, StubApp.getString2(10342), string2);
        }
        String string22 = StubApp.getString2(10343);
        String string23 = StubApp.getString2(620);
        if (i3 <= 255) {
            return string23 + c10 + string22 + i3 + string2;
        }
        return string23 + c10 + string22 + i3 + StubApp.getString2(10344) + Integer.toHexString(i3) + string2;
    }

    public final JsonParseException _constructError(String str, Throwable th) {
        return new JsonParseException(this, str, th);
    }

    public void _decodeBase64(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) throws IOException {
        try {
            base64Variant.decode(str, byteArrayBuilder);
        } catch (IllegalArgumentException e10) {
            _reportError(e10.getMessage());
        }
    }

    public abstract void _handleEOF() throws JsonParseException;

    public boolean _hasTextualNull(String str) {
        return StubApp.getString2(1116).equals(str);
    }

    public String _longIntegerDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith(StubApp.getString2(999))) {
            length--;
        }
        return String.format(StubApp.getString2(10345), Integer.valueOf(length));
    }

    public String _longNumberDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith(StubApp.getString2(999))) {
            length--;
        }
        return String.format(StubApp.getString2(10346), Integer.valueOf(length));
    }

    public final void _reportError(String str) throws JsonParseException {
        throw _constructError(str);
    }

    public void _reportInputCoercion(String str, JsonToken jsonToken, Class<?> cls) throws InputCoercionException {
        throw new InputCoercionException(this, str, jsonToken, cls);
    }

    public void _reportInvalidEOF() throws JsonParseException {
        _reportInvalidEOF(StubApp.getString2(943) + this._currToken, this._currToken);
    }

    public void _reportInvalidEOFInValue(JsonToken jsonToken) throws JsonParseException {
        _reportInvalidEOF(jsonToken == JsonToken.VALUE_STRING ? StubApp.getString2(10348) : (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? StubApp.getString2(10350) : StubApp.getString2(10349), jsonToken);
    }

    public void _reportMissingRootWS(int i3) throws JsonParseException {
        _reportUnexpectedChar(i3, StubApp.getString2(10351));
    }

    public void _reportUnexpectedChar(int i3, String str) throws JsonParseException {
        if (i3 < 0) {
            _reportInvalidEOF();
        }
        String k3 = a.k(StubApp.getString2(10352), _getCharDesc(i3), StubApp.getString2(74));
        if (str != null) {
            k3 = AbstractC1482f.h(k3, StubApp.getString2(994), str);
        }
        _reportError(k3);
    }

    public <T> T _reportUnexpectedNumberChar(int i3, String str) throws JsonParseException {
        String k3 = a.k(StubApp.getString2(10352), _getCharDesc(i3), StubApp.getString2(10353));
        if (str != null) {
            k3 = AbstractC1482f.h(k3, StubApp.getString2(994), str);
        }
        _reportError(k3);
        return null;
    }

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public void _throwInvalidSpace(int i3) throws JsonParseException {
        _reportError(StubApp.getString2(10354) + _getCharDesc((char) i3) + StubApp.getString2(10355));
    }

    public final void _wrapError(String str, Throwable th) throws JsonParseException {
        throw _constructError(str, th);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken currentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int currentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String getCurrentName() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String getText() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? getIntValue() : getValueAsInt(0);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong() throws IOException {
        JsonToken jsonToken = this._currToken;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? getLongValue() : getValueAsLong(0L);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        return getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTokenId(int i3) {
        JsonToken jsonToken = this._currToken;
        return jsonToken == null ? i3 == 0 : jsonToken.id() == i3;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedNumberIntToken() {
        return this._currToken == JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract JsonToken nextToken() throws IOException;

    public void reportInvalidNumber(String str) throws JsonParseException {
        _reportError(StubApp.getString2(10356) + str);
    }

    public void reportOverflowInt() throws IOException {
        reportOverflowInt(getText());
    }

    public void reportOverflowLong() throws IOException {
        reportOverflowLong(getText());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            int i3 = 1;
            while (true) {
                JsonToken nextToken = nextToken();
                if (nextToken == null) {
                    _handleEOF();
                    return this;
                }
                if (nextToken.isStructStart()) {
                    i3++;
                } else if (nextToken.isStructEnd()) {
                    i3--;
                    if (i3 == 0) {
                        break;
                    }
                } else if (nextToken == JsonToken.NOT_AVAILABLE) {
                    _reportError(StubApp.getString2(10359), getClass().getName());
                }
            }
        }
        return this;
    }

    public ParserMinimalBase(int i3) {
        super(i3);
    }

    public final void _reportError(String str, Object obj) throws JsonParseException {
        throw _constructError(String.format(str, obj));
    }

    public void _reportInvalidEOF(String str, JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, a.j(StubApp.getString2(10347), str));
    }

    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        return jsonToken == JsonToken.VALUE_STRING ? getText() : jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : getText();
    }

    public void reportOverflowInt(String str) throws IOException {
        reportOverflowInt(str, currentToken());
    }

    public void reportOverflowLong(String str) throws IOException {
        reportOverflowLong(str, currentToken());
    }

    public final void _reportError(String str, Object obj, Object obj2) throws JsonParseException {
        throw _constructError(String.format(str, obj, obj2));
    }

    public void reportOverflowInt(String str, JsonToken jsonToken) throws IOException {
        _reportInputCoercion(String.format(StubApp.getString2(10357), _longIntegerDesc(str), Integer.MIN_VALUE, Integer.valueOf(IntCompanionObject.MAX_VALUE)), jsonToken, Integer.TYPE);
    }

    public void reportOverflowLong(String str, JsonToken jsonToken) throws IOException {
        _reportInputCoercion(String.format(StubApp.getString2(10358), _longIntegerDesc(str), Long.MIN_VALUE, Long.valueOf(LongCompanionObject.MAX_VALUE)), jsonToken, Long.TYPE);
    }

    public int getValueAsInt(int i3) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        if (jsonToken == null) {
            return i3;
        }
        int id = jsonToken.id();
        if (id != 6) {
            switch (id) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    return embeddedObject instanceof Number ? ((Number) embeddedObject).intValue() : i3;
                default:
                    return i3;
            }
        }
        String text = getText();
        if (_hasTextualNull(text)) {
            return 0;
        }
        return NumberInput.parseAsInt(text, i3);
    }

    public long getValueAsLong(long j) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        if (jsonToken == null) {
            return j;
        }
        int id = jsonToken.id();
        if (id != 6) {
            switch (id) {
                case 9:
                    return 1L;
                case 10:
                case 11:
                    return 0L;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    return embeddedObject instanceof Number ? ((Number) embeddedObject).longValue() : j;
                default:
                    return j;
            }
        }
        String text = getText();
        if (_hasTextualNull(text)) {
            return 0L;
        }
        return NumberInput.parseAsLong(text, j);
    }
}
