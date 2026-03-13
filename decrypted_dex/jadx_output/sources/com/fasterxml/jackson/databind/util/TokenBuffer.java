package com.fasterxml.jackson.databind.util;

import E1.a;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TokenBuffer extends JsonGenerator {
    protected static final int DEFAULT_GENERATOR_FEATURES = JsonGenerator.Feature.collectDefaults();
    protected int _appendAt;
    protected boolean _closed;
    protected Segment _first;
    protected boolean _forceBigDecimal;
    protected boolean _hasNativeObjectIds;
    protected boolean _hasNativeTypeIds;
    protected Segment _last;
    protected boolean _mayHaveNativeIds;
    protected ObjectCodec _objectCodec;
    protected Object _objectId;
    protected JsonStreamContext _parentContext;
    protected Object _typeId;
    protected boolean _hasNativeId = false;
    protected int _generatorFeatures = DEFAULT_GENERATOR_FEATURES;
    protected JsonWriteContext _writeContext = JsonWriteContext.createRootContext(null);

    /* renamed from: com.fasterxml.jackson.databind.util.TokenBuffer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[JsonParser.NumberType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[JsonParser.NumberType.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = iArr2;
            try {
                iArr2[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class Parser extends ParserMinimalBase {
        protected transient ByteArrayBuilder _byteBuilder;
        protected boolean _closed;
        protected ObjectCodec _codec;
        protected final boolean _hasNativeIds;
        protected final boolean _hasNativeObjectIds;
        protected final boolean _hasNativeTypeIds;
        protected TokenBufferReadContext _parsingContext;
        protected Segment _segment;
        protected JsonLocation _location = null;
        protected int _segmentPtr = -1;

        public Parser(Segment segment, ObjectCodec objectCodec, boolean z2, boolean z10, JsonStreamContext jsonStreamContext) {
            this._segment = segment;
            this._codec = objectCodec;
            this._parsingContext = TokenBufferReadContext.createRootContext(jsonStreamContext);
            this._hasNativeTypeIds = z2;
            this._hasNativeObjectIds = z10;
            this._hasNativeIds = z2 || z10;
        }

        private final boolean _smallerThanInt(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        private final boolean _smallerThanLong(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        public final void _checkIsNumber() throws JacksonException {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                throw _constructError(StubApp.getString2(10284) + this._currToken + StubApp.getString2(11135));
            }
        }

        public int _convertNumberToInt(Number number) throws IOException {
            if (number instanceof Long) {
                long longValue = number.longValue();
                int i3 = (int) longValue;
                if (i3 != longValue) {
                    reportOverflowInt();
                }
                return i3;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (ParserMinimalBase.BI_MIN_INT.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(bigInteger) < 0) {
                    reportOverflowInt();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double doubleValue = number.doubleValue();
                    if (doubleValue < -2.147483648E9d || doubleValue > 2.147483647E9d) {
                        reportOverflowInt();
                    }
                    return (int) doubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (ParserMinimalBase.BD_MIN_INT.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(bigDecimal) < 0) {
                        reportOverflowInt();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.intValue();
        }

        public long _convertNumberToLong(Number number) throws IOException {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (ParserMinimalBase.BI_MIN_LONG.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(bigInteger) < 0) {
                    reportOverflowLong();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double doubleValue = number.doubleValue();
                    if (doubleValue < -9.223372036854776E18d || doubleValue > 9.223372036854776E18d) {
                        reportOverflowLong();
                    }
                    return (long) doubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (ParserMinimalBase.BD_MIN_LONG.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(bigDecimal) < 0) {
                        reportOverflowLong();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.longValue();
        }

        public final Object _currentObject() {
            return this._segment.get(this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
        public void _handleEOF() {
            _throwInternal();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadObjectId() {
            return this._hasNativeObjectIds;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadTypeId() {
            return this._hasNativeTypeIds;
        }

        @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this._closed) {
                return;
            }
            this._closed = true;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String currentName() {
            JsonToken jsonToken = this._currToken;
            return (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) ? this._parsingContext.getParent().getCurrentName() : this._parsingContext.getCurrentName();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigInteger getBigIntegerValue() throws IOException {
            Number numberValue = getNumberValue();
            return numberValue instanceof BigInteger ? (BigInteger) numberValue : getNumberType() == JsonParser.NumberType.BIG_DECIMAL ? ((BigDecimal) numberValue).toBigInteger() : BigInteger.valueOf(numberValue.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof byte[]) {
                    return (byte[]) _currentObject;
                }
            }
            if (this._currToken != JsonToken.VALUE_STRING) {
                throw _constructError(StubApp.getString2(10284) + this._currToken + StubApp.getString2(11136));
            }
            String text = getText();
            if (text == null) {
                return null;
            }
            ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
            if (byteArrayBuilder == null) {
                byteArrayBuilder = new ByteArrayBuilder(100);
                this._byteBuilder = byteArrayBuilder;
            } else {
                byteArrayBuilder.reset();
            }
            _decodeBase64(text, byteArrayBuilder, base64Variant);
            return byteArrayBuilder.toByteArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public ObjectCodec getCodec() {
            return this._codec;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation getCurrentLocation() {
            JsonLocation jsonLocation = this._location;
            return jsonLocation == null ? JsonLocation.NA : jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public String getCurrentName() {
            return currentName();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigDecimal getDecimalValue() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigDecimal) {
                return (BigDecimal) numberValue;
            }
            int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[getNumberType().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return new BigDecimal((BigInteger) numberValue);
                }
                if (i3 != 5) {
                    return BigDecimal.valueOf(numberValue.doubleValue());
                }
            }
            return BigDecimal.valueOf(numberValue.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public double getDoubleValue() throws IOException {
            return getNumberValue().doubleValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getEmbeddedObject() {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return _currentObject();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public float getFloatValue() throws IOException {
            return getNumberValue().floatValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int getIntValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            return ((numberValue instanceof Integer) || _smallerThanInt(numberValue)) ? numberValue.intValue() : _convertNumberToInt(numberValue);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public long getLongValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            return ((numberValue instanceof Long) || _smallerThanLong(numberValue)) ? numberValue.longValue() : _convertNumberToLong(numberValue);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonParser.NumberType getNumberType() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (numberValue instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberValue instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberValue instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberValue instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberValue instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberValue instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Number getNumberValue() throws IOException {
            _checkIsNumber();
            Object _currentObject = _currentObject();
            if (_currentObject instanceof Number) {
                return (Number) _currentObject;
            }
            if (_currentObject instanceof String) {
                String str = (String) _currentObject;
                return str.indexOf(46) >= 0 ? Double.valueOf(NumberInput.parseDouble(str, isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER))) : Long.valueOf(NumberInput.parseLong(str));
            }
            if (_currentObject == null) {
                return null;
            }
            throw new IllegalStateException(a.h(_currentObject, StubApp.getString2(11137)));
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getObjectId() {
            return this._segment.findObjectId(this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonStreamContext getParsingContext() {
            return this._parsingContext;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
            return JsonParser.DEFAULT_READ_CAPABILITIES;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public String getText() {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                return _currentObject instanceof String ? (String) _currentObject : ClassUtil.nullOrToString(_currentObject);
            }
            if (jsonToken == null) {
                return null;
            }
            int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonToken.ordinal()];
            return (i3 == 7 || i3 == 8) ? ClassUtil.nullOrToString(_currentObject()) : this._currToken.asString();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public char[] getTextCharacters() {
            String text = getText();
            if (text == null) {
                return null;
            }
            return text.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int getTextLength() {
            String text = getText();
            if (text == null) {
                return 0;
            }
            return text.length();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int getTextOffset() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation getTokenLocation() {
            return getCurrentLocation();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getTypeId() {
            return this._segment.findTypeId(this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean hasTextCharacters() {
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean isNaN() {
            if (this._currToken == JsonToken.VALUE_NUMBER_FLOAT) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof Double) {
                    Double d8 = (Double) _currentObject;
                    return d8.isNaN() || d8.isInfinite();
                }
                if (_currentObject instanceof Float) {
                    Float f10 = (Float) _currentObject;
                    return f10.isNaN() || f10.isInfinite();
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String nextFieldName() throws IOException {
            Segment segment;
            if (!this._closed && (segment = this._segment) != null) {
                int i3 = this._segmentPtr + 1;
                if (i3 < 16) {
                    JsonToken type = segment.type(i3);
                    JsonToken jsonToken = JsonToken.FIELD_NAME;
                    if (type == jsonToken) {
                        this._segmentPtr = i3;
                        this._currToken = jsonToken;
                        Object obj = this._segment.get(i3);
                        String obj2 = obj instanceof String ? (String) obj : obj.toString();
                        this._parsingContext.setCurrentName(obj2);
                        return obj2;
                    }
                }
                if (nextToken() == JsonToken.FIELD_NAME) {
                    return currentName();
                }
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public JsonToken nextToken() throws IOException {
            Segment segment;
            if (this._closed || (segment = this._segment) == null) {
                return null;
            }
            int i3 = this._segmentPtr + 1;
            this._segmentPtr = i3;
            if (i3 >= 16) {
                this._segmentPtr = 0;
                Segment next = segment.next();
                this._segment = next;
                if (next == null) {
                    return null;
                }
            }
            JsonToken type = this._segment.type(this._segmentPtr);
            this._currToken = type;
            if (type == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                this._parsingContext.setCurrentName(_currentObject instanceof String ? (String) _currentObject : _currentObject.toString());
            } else if (type == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext();
            } else if (type == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext();
            } else if (type == JsonToken.END_OBJECT || type == JsonToken.END_ARRAY) {
                this._parsingContext = this._parsingContext.parentOrCopy();
            } else {
                this._parsingContext.updateForValue();
            }
            return this._currToken;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] binaryValue = getBinaryValue(base64Variant);
            if (binaryValue == null) {
                return 0;
            }
            outputStream.write(binaryValue, 0, binaryValue.length);
            return binaryValue.length;
        }

        public void setLocation(JsonLocation jsonLocation) {
            this._location = jsonLocation;
        }
    }

    public TokenBuffer(JsonParser jsonParser, DeserializationContext deserializationContext) {
        this._objectCodec = jsonParser.getCodec();
        this._parentContext = jsonParser.getParsingContext();
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = jsonParser.canReadTypeId();
        boolean canReadObjectId = jsonParser.canReadObjectId();
        this._hasNativeObjectIds = canReadObjectId;
        this._mayHaveNativeIds = this._hasNativeTypeIds || canReadObjectId;
        this._forceBigDecimal = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : false;
    }

    private final void _appendNativeIds(StringBuilder sb2) {
        Object findObjectId = this._last.findObjectId(this._appendAt - 1);
        if (findObjectId != null) {
            sb2.append(StubApp.getString2(11138));
            sb2.append(String.valueOf(findObjectId));
            sb2.append(']');
        }
        Object findTypeId = this._last.findTypeId(this._appendAt - 1);
        if (findTypeId != null) {
            sb2.append(StubApp.getString2(11139));
            sb2.append(String.valueOf(findTypeId));
            sb2.append(']');
        }
    }

    private final void _checkNativeIds(JsonParser jsonParser) throws IOException {
        Object typeId = jsonParser.getTypeId();
        this._typeId = typeId;
        if (typeId != null) {
            this._hasNativeId = true;
        }
        Object objectId = jsonParser.getObjectId();
        this._objectId = objectId;
        if (objectId != null) {
            this._hasNativeId = true;
        }
    }

    private void _copyBufferValue(JsonParser jsonParser, JsonToken jsonToken) throws IOException {
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        switch (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonToken.ordinal()]) {
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[jsonParser.getNumberType().ordinal()];
                if (i3 == 1) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (i3 != 2) {
                    writeNumber(jsonParser.getLongValue());
                    return;
                } else {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                }
            case 8:
                if (this._forceBigDecimal) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else {
                    _appendValue(JsonToken.VALUE_NUMBER_FLOAT, jsonParser.getNumberValueExact());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException(StubApp.getString2(11140) + jsonToken);
        }
    }

    public final void _appendEndMarker(JsonToken jsonToken) {
        Segment append = this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    public final void _appendFieldName(Object obj) {
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, JsonToken.FIELD_NAME, obj, this._objectId, this._typeId) : this._last.append(this._appendAt, JsonToken.FIELD_NAME, obj);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    public final void _appendStartMarker(JsonToken jsonToken) {
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    public final void _appendValue(JsonToken jsonToken) {
        this._writeContext.writeValue();
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    public void _copyBufferContents(JsonParser jsonParser) throws IOException {
        int i3 = 1;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                return;
            }
            int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[nextToken.ordinal()];
            if (i10 == 1) {
                if (this._mayHaveNativeIds) {
                    _checkNativeIds(jsonParser);
                }
                writeStartObject();
            } else if (i10 == 2) {
                writeEndObject();
                i3--;
                if (i3 == 0) {
                    return;
                }
            } else if (i10 == 3) {
                if (this._mayHaveNativeIds) {
                    _checkNativeIds(jsonParser);
                }
                writeStartArray();
            } else if (i10 == 4) {
                writeEndArray();
                i3--;
                if (i3 == 0) {
                    return;
                }
            } else if (i10 != 5) {
                _copyBufferValue(jsonParser, nextToken);
            } else {
                if (this._mayHaveNativeIds) {
                    _checkNativeIds(jsonParser);
                }
                writeFieldName(jsonParser.currentName());
            }
            i3++;
        }
    }

    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException(StubApp.getString2(11141));
    }

    public TokenBuffer append(TokenBuffer tokenBuffer) throws IOException {
        if (!this._hasNativeTypeIds) {
            this._hasNativeTypeIds = tokenBuffer.canWriteTypeId();
        }
        if (!this._hasNativeObjectIds) {
            this._hasNativeObjectIds = tokenBuffer.canWriteObjectId();
        }
        this._mayHaveNativeIds = this._hasNativeTypeIds || this._hasNativeObjectIds;
        JsonParser asParser = tokenBuffer.asParser();
        while (asParser.nextToken() != null) {
            copyCurrentStructure(asParser);
        }
        return this;
    }

    public JsonParser asParser() {
        return asParser(this._objectCodec);
    }

    public JsonParser asParserOnFirstToken() throws IOException {
        JsonParser asParser = asParser(this._objectCodec);
        asParser.nextToken();
        return asParser;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteBinaryNatively() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteObjectId() {
        return this._hasNativeObjectIds;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteTypeId() {
        return this._hasNativeTypeIds;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this._closed = true;
    }

    public void copyCurrentStructure(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.FIELD_NAME) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeFieldName(jsonParser.currentName());
            currentToken = jsonParser.nextToken();
        } else if (currentToken == null) {
            throw new IllegalStateException(StubApp.getString2(11142));
        }
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[currentToken.ordinal()];
        if (i3 == 1) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeStartObject();
            _copyBufferContents(jsonParser);
            return;
        }
        if (i3 == 2) {
            writeEndObject();
            return;
        }
        if (i3 != 3) {
            if (i3 != 4) {
                _copyBufferValue(jsonParser, currentToken);
                return;
            } else {
                writeEndArray();
                return;
            }
        }
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        writeStartArray();
        _copyBufferContents(jsonParser);
    }

    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken nextToken;
        if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
            copyCurrentStructure(jsonParser);
            return this;
        }
        writeStartObject();
        do {
            copyCurrentStructure(jsonParser);
            nextToken = jsonParser.nextToken();
        } while (nextToken == JsonToken.FIELD_NAME);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        if (nextToken != jsonToken) {
            deserializationContext.reportWrongTokenException(TokenBuffer.class, jsonToken, StubApp.getString2(11143) + nextToken, new Object[0]);
        }
        writeEndObject();
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    public JsonToken firstToken() {
        return this._first.type(0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
    }

    public int getFeatureMask() {
        return this._generatorFeatures;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideStdFeatures(int i3, int i10) {
        this._generatorFeatures = (i3 & i10) | (getFeatureMask() & (~i10));
        return this;
    }

    public String toString() {
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(11144));
        JsonParser asParser = asParser();
        int i3 = 0;
        boolean z2 = this._hasNativeTypeIds || this._hasNativeObjectIds;
        while (true) {
            try {
                JsonToken nextToken = asParser.nextToken();
                if (nextToken == null) {
                    break;
                }
                if (z2) {
                    _appendNativeIds(b2);
                }
                if (i3 < 100) {
                    if (i3 > 0) {
                        b2.append(StubApp.getString2("81"));
                    }
                    b2.append(nextToken.toString());
                    if (nextToken == JsonToken.FIELD_NAME) {
                        b2.append('(');
                        b2.append(asParser.currentName());
                        b2.append(')');
                    }
                }
                i3++;
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        if (i3 >= 100) {
            b2.append(StubApp.getString2(11145));
            b2.append(i3 - 100);
            b2.append(StubApp.getString2(11146));
        }
        b2.append(']');
        return b2.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i3, int i10) throws IOException {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        writeObject(bArr2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z2) throws IOException {
        _appendValue(z2 ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() throws IOException {
        _appendEndMarker(JsonToken.END_ARRAY);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() throws IOException {
        _appendEndMarker(JsonToken.END_OBJECT);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeFieldName(String str) throws IOException {
        this._writeContext.writeFieldName(str);
        _appendFieldName(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _appendValue(JsonToken.VALUE_NULL);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s10) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s10));
    }

    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof RawValue)) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec == null) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            objectCodec.writeValue(this, obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObjectId(Object obj) {
        this._objectId = obj;
        this._hasNativeId = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        if (str == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeTypeId(Object obj) {
        this._typeId = obj;
        this._hasNativeId = true;
    }

    public static final class Segment {
        private static final JsonToken[] TOKEN_TYPES_BY_INDEX;
        protected TreeMap<Integer, Object> _nativeIds;
        protected Segment _next;
        protected long _tokenTypes;
        protected final Object[] _tokens = new Object[16];

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            TOKEN_TYPES_BY_INDEX = jsonTokenArr;
            JsonToken[] values = JsonToken.values();
            System.arraycopy(values, 1, jsonTokenArr, 1, Math.min(15, values.length - 1));
        }

        private final int _objectIdIndex(int i3) {
            return i3 + i3 + 1;
        }

        private final int _typeIdIndex(int i3) {
            return i3 + i3;
        }

        private final void assignNativeIds(int i3, Object obj, Object obj2) {
            if (this._nativeIds == null) {
                this._nativeIds = new TreeMap<>();
            }
            if (obj != null) {
                this._nativeIds.put(Integer.valueOf(_objectIdIndex(i3)), obj);
            }
            if (obj2 != null) {
                this._nativeIds.put(Integer.valueOf(_typeIdIndex(i3)), obj2);
            }
        }

        private void set(int i3, JsonToken jsonToken) {
            long ordinal = jsonToken.ordinal();
            if (i3 > 0) {
                ordinal <<= i3 << 2;
            }
            this._tokenTypes |= ordinal;
        }

        public Segment append(int i3, JsonToken jsonToken) {
            if (i3 < 16) {
                set(i3, jsonToken);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken);
            return this._next;
        }

        public Object findObjectId(int i3) {
            TreeMap<Integer, Object> treeMap = this._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(_objectIdIndex(i3)));
        }

        public Object findTypeId(int i3) {
            TreeMap<Integer, Object> treeMap = this._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(_typeIdIndex(i3)));
        }

        public Object get(int i3) {
            return this._tokens[i3];
        }

        public Segment next() {
            return this._next;
        }

        public JsonToken type(int i3) {
            long j = this._tokenTypes;
            if (i3 > 0) {
                j >>= i3 << 2;
            }
            return TOKEN_TYPES_BY_INDEX[((int) j) & 15];
        }

        private void set(int i3, JsonToken jsonToken, Object obj, Object obj2) {
            long ordinal = jsonToken.ordinal();
            if (i3 > 0) {
                ordinal <<= i3 << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
            assignNativeIds(i3, obj, obj2);
        }

        public Segment append(int i3, JsonToken jsonToken, Object obj, Object obj2) {
            if (i3 < 16) {
                set(i3, jsonToken, obj, obj2);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2);
            return this._next;
        }

        private void set(int i3, JsonToken jsonToken, Object obj) {
            this._tokens[i3] = obj;
            long ordinal = jsonToken.ordinal();
            if (i3 > 0) {
                ordinal <<= i3 << 2;
            }
            this._tokenTypes |= ordinal;
        }

        private void set(int i3, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this._tokens[i3] = obj;
            long ordinal = jsonToken.ordinal();
            if (i3 > 0) {
                ordinal <<= i3 << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
            assignNativeIds(i3, obj2, obj3);
        }

        public Segment append(int i3, JsonToken jsonToken, Object obj) {
            if (i3 < 16) {
                set(i3, jsonToken, obj);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj);
            return this._next;
        }

        public Segment append(int i3, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i3 < 16) {
                set(i3, jsonToken, obj, obj2, obj3);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2, obj3);
            return this._next;
        }
    }

    public JsonParser asParser(ObjectCodec objectCodec) {
        return new Parser(this._first, objectCodec, this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final JsonWriteContext getOutputContext() {
        return this._writeContext;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i3) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i3));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        _reportUnsupportedOperation();
    }

    public JsonParser asParser(JsonParser jsonParser) {
        Parser parser = new Parser(this._first, jsonParser.getCodec(), this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
        parser.setLocation(jsonParser.getTokenLocation());
        return parser;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        this._writeContext.writeFieldName(serializableString.getValue());
        _appendFieldName(serializableString);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i3, int i10) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i3, int i10) throws IOException {
        writeString(new String(cArr, i3, i10));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d8) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d8));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c10) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        if (serializableString == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, serializableString);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f10) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f10));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj, int i3) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext(obj);
    }

    public final void _appendValue(JsonToken jsonToken, Object obj) {
        Segment append;
        this._writeContext.writeValue();
        if (this._hasNativeId) {
            append = this._last.append(this._appendAt, jsonToken, obj, this._objectId, this._typeId);
        } else {
            append = this._last.append(this._appendAt, jsonToken, obj);
        }
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj, int i3) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, str);
    }
}
