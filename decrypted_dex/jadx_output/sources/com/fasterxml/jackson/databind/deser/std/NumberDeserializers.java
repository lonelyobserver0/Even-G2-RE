package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class NumberDeserializers {
    private static final HashSet<String> _classNames = new HashSet<>();

    /* renamed from: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction = iArr;
            try {
                iArr[CoercionAction.Fail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.AsEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @JacksonStdImpl
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer instance = new BigDecimalDeserializer();

        public BigDecimalDeserializer() {
            super((Class<?>) BigDecimal.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return LogicalType.Float;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            int currentTokenId = jsonParser.currentTokenId();
            if (currentTokenId == 1) {
                extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (currentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (currentTokenId != 6) {
                    if (currentTokenId == 7) {
                        CoercionAction _checkIntToFloatCoercion = _checkIntToFloatCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (_checkIntToFloatCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (_checkIntToFloatCoercion == CoercionAction.AsEmpty) {
                            return (BigDecimal) getEmptyValue(deserializationContext);
                        }
                    } else if (currentTokenId != 8) {
                        return (BigDecimal) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    return jsonParser.getDecimalValue();
                }
                extractScalarFromObject = jsonParser.getText();
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigDecimal) getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            if (_hasTextualNull(trim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return NumberInput.parseBigDecimal(trim);
            } catch (IllegalArgumentException unused) {
                return (BigDecimal) deserializationContext.handleWeirdStringValue(this._valueClass, trim, StubApp.getString2(10746), new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer instance = new BigIntegerDeserializer();

        public BigIntegerDeserializer() {
            super((Class<?>) BigInteger.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public BigInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            if (jsonParser.isExpectedNumberIntToken()) {
                return jsonParser.getBigIntegerValue();
            }
            int currentTokenId = jsonParser.currentTokenId();
            if (currentTokenId == 1) {
                extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (currentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (currentTokenId != 6) {
                    if (currentTokenId != 8) {
                        return (BigInteger) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                    return _checkFloatToIntCoercion == CoercionAction.AsNull ? getNullValue(deserializationContext) : _checkFloatToIntCoercion == CoercionAction.AsEmpty ? (BigInteger) getEmptyValue(deserializationContext) : jsonParser.getDecimalValue().toBigInteger();
                }
                extractScalarFromObject = jsonParser.getText();
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigInteger) getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            if (_hasTextualNull(trim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return NumberInput.parseBigInteger(trim);
            } catch (IllegalArgumentException unused) {
                return (BigInteger) deserializationContext.handleWeirdStringValue(this._valueClass, trim, StubApp.getString2(10746), new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
        static final BooleanDeserializer primitiveInstance = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        static final BooleanDeserializer wrapperInstance = new BooleanDeserializer(Boolean.class, null);

        public BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
            super(cls, LogicalType.Boolean, bool, Boolean.FALSE);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken currentToken = jsonParser.currentToken();
            return currentToken == JsonToken.VALUE_TRUE ? Boolean.TRUE : currentToken == JsonToken.VALUE_FALSE ? Boolean.FALSE : this._primitive ? Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext)) : _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            JsonToken currentToken = jsonParser.currentToken();
            return currentToken == JsonToken.VALUE_TRUE ? Boolean.TRUE : currentToken == JsonToken.VALUE_FALSE ? Boolean.FALSE : this._primitive ? Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext)) : _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }
    }

    @JacksonStdImpl
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
        static final ByteDeserializer primitiveInstance = new ByteDeserializer(Byte.TYPE, (byte) 0);
        static final ByteDeserializer wrapperInstance = new ByteDeserializer(Byte.class, null);

        public ByteDeserializer(Class<Byte> cls, Byte b2) {
            super(cls, LogicalType.Integer, b2, (byte) 0);
        }

        public Byte _parseByte(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            int currentTokenId = jsonParser.currentTokenId();
            if (currentTokenId == 1) {
                extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (currentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (currentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (currentTokenId != 6) {
                    if (currentTokenId == 7) {
                        return Byte.valueOf(jsonParser.getByteValue());
                    }
                    if (currentTokenId != 8) {
                        return (Byte) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                    return _checkFloatToIntCoercion == CoercionAction.AsNull ? getNullValue(deserializationContext) : _checkFloatToIntCoercion == CoercionAction.AsEmpty ? (Byte) getEmptyValue(deserializationContext) : Byte.valueOf(jsonParser.getByteValue());
                }
                extractScalarFromObject = jsonParser.getText();
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Byte) getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, trim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int parseInt = NumberInput.parseInt(trim);
                return _byteOverflow(parseInt) ? (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, StubApp.getString2(10747), new Object[0]) : Byte.valueOf((byte) parseInt);
            } catch (IllegalArgumentException unused) {
                return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, StubApp.getString2(10748), new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.isExpectedNumberIntToken() ? Byte.valueOf(jsonParser.getByteValue()) : this._primitive ? Byte.valueOf(_parseBytePrimitive(jsonParser, deserializationContext)) : _parseByte(jsonParser, deserializationContext);
        }
    }

    @JacksonStdImpl
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
        static final CharacterDeserializer primitiveInstance = new CharacterDeserializer(Character.TYPE, 0);
        static final CharacterDeserializer wrapperInstance = new CharacterDeserializer(Character.class, null);

        public CharacterDeserializer(Class<Character> cls, Character ch) {
            super(cls, LogicalType.Integer, ch, (char) 0);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            DeserializationContext deserializationContext2;
            String extractScalarFromObject;
            DeserializationContext deserializationContext3;
            int currentTokenId = jsonParser.currentTokenId();
            if (currentTokenId == 1) {
                deserializationContext2 = deserializationContext;
                extractScalarFromObject = deserializationContext2.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (currentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (currentTokenId == 11) {
                    if (this._primitive) {
                        _verifyNullForPrimitive(deserializationContext);
                    }
                    return getNullValue(deserializationContext);
                }
                if (currentTokenId != 6) {
                    if (currentTokenId != 7) {
                        return (Character) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.Integer);
                    int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[findCoercionAction.ordinal()];
                    if (i3 == 1) {
                        deserializationContext3 = deserializationContext;
                        _checkCoercionFail(deserializationContext3, findCoercionAction, this._valueClass, jsonParser.getNumberValue(), StubApp.getString2(10722) + jsonParser.getText() + StubApp.getString2(74));
                    } else {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                return (Character) getEmptyValue(deserializationContext);
                            }
                            int intValue = jsonParser.getIntValue();
                            return (intValue < 0 || intValue > 65535) ? (Character) deserializationContext.handleWeirdNumberValue(handledType(), Integer.valueOf(intValue), StubApp.getString2(10749), new Object[0]) : Character.valueOf((char) intValue);
                        }
                        deserializationContext3 = deserializationContext;
                    }
                    return getNullValue(deserializationContext3);
                }
                deserializationContext2 = deserializationContext;
                extractScalarFromObject = jsonParser.getText();
            }
            if (extractScalarFromObject.length() == 1) {
                return Character.valueOf(extractScalarFromObject.charAt(0));
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext2, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext2);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Character) getEmptyValue(deserializationContext2);
            }
            String trim = extractScalarFromObject.trim();
            return _checkTextualNull(deserializationContext2, trim) ? getNullValue(deserializationContext2) : (Character) deserializationContext2.handleWeirdStringValue(handledType(), trim, StubApp.getString2(10750), new Object[0]);
        }
    }

    @JacksonStdImpl
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
        static final DoubleDeserializer primitiveInstance = new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0d));
        static final DoubleDeserializer wrapperInstance = new DoubleDeserializer(Double.class, null);

        public DoubleDeserializer(Class<Double> cls, Double d8) {
            super(cls, LogicalType.Float, d8, Double.valueOf(0.0d));
        }

        public final Double _parseDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            int currentTokenId = jsonParser.currentTokenId();
            if (currentTokenId == 1) {
                extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (currentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (currentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (currentTokenId != 6) {
                    if (currentTokenId == 7) {
                        CoercionAction _checkIntToFloatCoercion = _checkIntToFloatCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (_checkIntToFloatCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (_checkIntToFloatCoercion == CoercionAction.AsEmpty) {
                            return (Double) getEmptyValue(deserializationContext);
                        }
                    } else if (currentTokenId != 8) {
                        return (Double) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    return Double.valueOf(jsonParser.getDoubleValue());
                }
                extractScalarFromObject = jsonParser.getText();
            }
            Double _checkDoubleSpecialValue = _checkDoubleSpecialValue(extractScalarFromObject);
            if (_checkDoubleSpecialValue != null) {
                return _checkDoubleSpecialValue;
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Double) getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, trim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return Double.valueOf(StdDeserializer._parseDouble(trim, jsonParser.isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
            } catch (IllegalArgumentException unused) {
                return (Double) deserializationContext.handleWeirdStringValue(this._valueClass, trim, StubApp.getString2(10751), new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT) ? Double.valueOf(jsonParser.getDoubleValue()) : this._primitive ? Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext)) : _parseDouble(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT) ? Double.valueOf(jsonParser.getDoubleValue()) : this._primitive ? Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext)) : _parseDouble(jsonParser, deserializationContext);
        }
    }

    @JacksonStdImpl
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
        static final FloatDeserializer primitiveInstance = new FloatDeserializer(Float.TYPE, Float.valueOf(0.0f));
        static final FloatDeserializer wrapperInstance = new FloatDeserializer(Float.class, null);

        public FloatDeserializer(Class<Float> cls, Float f10) {
            super(cls, LogicalType.Float, f10, Float.valueOf(0.0f));
        }

        public final Float _parseFloat(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            int currentTokenId = jsonParser.currentTokenId();
            if (currentTokenId == 1) {
                extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (currentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (currentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (currentTokenId != 6) {
                    if (currentTokenId == 7) {
                        CoercionAction _checkIntToFloatCoercion = _checkIntToFloatCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (_checkIntToFloatCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (_checkIntToFloatCoercion == CoercionAction.AsEmpty) {
                            return (Float) getEmptyValue(deserializationContext);
                        }
                    } else if (currentTokenId != 8) {
                        return (Float) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    return Float.valueOf(jsonParser.getFloatValue());
                }
                extractScalarFromObject = jsonParser.getText();
            }
            Float _checkFloatSpecialValue = _checkFloatSpecialValue(extractScalarFromObject);
            if (_checkFloatSpecialValue != null) {
                return _checkFloatSpecialValue;
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Float) getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, trim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return Float.valueOf(NumberInput.parseFloat(trim, jsonParser.isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
            } catch (IllegalArgumentException unused) {
                return (Float) deserializationContext.handleWeirdStringValue(this._valueClass, trim, StubApp.getString2(10752), new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT) ? Float.valueOf(jsonParser.getFloatValue()) : this._primitive ? Float.valueOf(_parseFloatPrimitive(jsonParser, deserializationContext)) : _parseFloat(jsonParser, deserializationContext);
        }
    }

    @JacksonStdImpl
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
        static final IntegerDeserializer primitiveInstance = new IntegerDeserializer(Integer.TYPE, 0);
        static final IntegerDeserializer wrapperInstance = new IntegerDeserializer(Integer.class, null);

        public IntegerDeserializer(Class<Integer> cls, Integer num) {
            super(cls, LogicalType.Integer, num, 0);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public boolean isCachable() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.isExpectedNumberIntToken() ? Integer.valueOf(jsonParser.getIntValue()) : this._primitive ? Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext)) : _parseInteger(jsonParser, deserializationContext, Integer.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            return jsonParser.isExpectedNumberIntToken() ? Integer.valueOf(jsonParser.getIntValue()) : this._primitive ? Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext)) : _parseInteger(jsonParser, deserializationContext, Integer.class);
        }
    }

    @JacksonStdImpl
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
        static final LongDeserializer primitiveInstance = new LongDeserializer(Long.TYPE, 0L);
        static final LongDeserializer wrapperInstance = new LongDeserializer(Long.class, null);

        public LongDeserializer(Class<Long> cls, Long l9) {
            super(cls, LogicalType.Integer, l9, 0L);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public boolean isCachable() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.isExpectedNumberIntToken() ? Long.valueOf(jsonParser.getLongValue()) : this._primitive ? Long.valueOf(_parseLongPrimitive(jsonParser, deserializationContext)) : _parseLong(jsonParser, deserializationContext, Long.class);
        }
    }

    @JacksonStdImpl
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer instance = new NumberDeserializer();

        public NumberDeserializer() {
            super((Class<?>) Number.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            int currentTokenId = jsonParser.currentTokenId();
            if (currentTokenId == 1) {
                extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (currentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (currentTokenId != 6) {
                    return currentTokenId != 7 ? currentTokenId != 8 ? deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser) : (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) || jsonParser.isNaN()) ? jsonParser.getNumberValue() : jsonParser.getDecimalValue() : deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
                }
                extractScalarFromObject = jsonParser.getText();
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            if (_hasTextualNull(trim)) {
                return getNullValue(deserializationContext);
            }
            if (_isPosInf(trim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (_isNegInf(trim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (_isNaN(trim)) {
                return Double.valueOf(Double.NaN);
            }
            try {
                if (!_isIntNumber(trim)) {
                    return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? NumberInput.parseBigDecimal(trim) : Double.valueOf(NumberInput.parseDouble(trim, jsonParser.isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return NumberInput.parseBigInteger(trim);
                }
                long parseLong = NumberInput.parseLong(trim);
                return (deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) || parseLong > 2147483647L || parseLong < -2147483648L) ? Long.valueOf(parseLong) : Integer.valueOf((int) parseLong);
            } catch (IllegalArgumentException unused) {
                return deserializationContext.handleWeirdStringValue(this._valueClass, trim, StubApp.getString2(10753), new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            int currentTokenId = jsonParser.currentTokenId();
            return (currentTokenId == 6 || currentTokenId == 7 || currentTokenId == 8) ? deserialize(jsonParser, deserializationContext) : typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }
    }

    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        protected final T _emptyValue;
        protected final LogicalType _logicalType;
        protected final T _nullValue;
        protected final boolean _primitive;

        public PrimitiveOrWrapperDeserializer(Class<T> cls, LogicalType logicalType, T t3, T t10) {
            super((Class<?>) cls);
            this._logicalType = logicalType;
            this._nullValue = t3;
            this._emptyValue = t10;
            this._primitive = cls.isPrimitive();
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return this._emptyValue;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public final T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
            if (this._primitive && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                deserializationContext.reportInputMismatch(this, StubApp.getString2(10754), ClassUtil.classNameOf(handledType()));
            }
            return this._nullValue;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return this._logicalType;
        }
    }

    @JacksonStdImpl
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
        static final ShortDeserializer primitiveInstance = new ShortDeserializer(Short.TYPE, 0);
        static final ShortDeserializer wrapperInstance = new ShortDeserializer(Short.class, null);

        public ShortDeserializer(Class<Short> cls, Short sh) {
            super(cls, LogicalType.Integer, sh, (short) 0);
        }

        public Short _parseShort(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            int currentTokenId = jsonParser.currentTokenId();
            if (currentTokenId == 1) {
                extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (currentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (currentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (currentTokenId != 6) {
                    if (currentTokenId == 7) {
                        return Short.valueOf(jsonParser.getShortValue());
                    }
                    if (currentTokenId != 8) {
                        return (Short) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                    return _checkFloatToIntCoercion == CoercionAction.AsNull ? getNullValue(deserializationContext) : _checkFloatToIntCoercion == CoercionAction.AsEmpty ? (Short) getEmptyValue(deserializationContext) : Short.valueOf(jsonParser.getShortValue());
                }
                extractScalarFromObject = jsonParser.getText();
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Short) getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, trim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int parseInt = NumberInput.parseInt(trim);
                return _shortOverflow(parseInt) ? (Short) deserializationContext.handleWeirdStringValue(this._valueClass, trim, StubApp.getString2(10755), new Object[0]) : Short.valueOf((short) parseInt);
            } catch (IllegalArgumentException unused) {
                return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, trim, StubApp.getString2(10756), new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.isExpectedNumberIntToken() ? Short.valueOf(jsonParser.getShortValue()) : this._primitive ? Short.valueOf(_parseShortPrimitive(jsonParser, deserializationContext)) : _parseShort(jsonParser, deserializationContext);
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i3 = 0; i3 < 11; i3++) {
            _classNames.add(clsArr[i3].getName());
        }
    }

    public static JsonDeserializer<?> find(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return IntegerDeserializer.primitiveInstance;
            }
            if (cls == Boolean.TYPE) {
                return BooleanDeserializer.primitiveInstance;
            }
            if (cls == Long.TYPE) {
                return LongDeserializer.primitiveInstance;
            }
            if (cls == Double.TYPE) {
                return DoubleDeserializer.primitiveInstance;
            }
            if (cls == Character.TYPE) {
                return CharacterDeserializer.primitiveInstance;
            }
            if (cls == Byte.TYPE) {
                return ByteDeserializer.primitiveInstance;
            }
            if (cls == Short.TYPE) {
                return ShortDeserializer.primitiveInstance;
            }
            if (cls == Float.TYPE) {
                return FloatDeserializer.primitiveInstance;
            }
            if (cls == Void.TYPE) {
                return NullifyingDeserializer.instance;
            }
        } else {
            if (!_classNames.contains(str)) {
                return null;
            }
            if (cls == Integer.class) {
                return IntegerDeserializer.wrapperInstance;
            }
            if (cls == Boolean.class) {
                return BooleanDeserializer.wrapperInstance;
            }
            if (cls == Long.class) {
                return LongDeserializer.wrapperInstance;
            }
            if (cls == Double.class) {
                return DoubleDeserializer.wrapperInstance;
            }
            if (cls == Character.class) {
                return CharacterDeserializer.wrapperInstance;
            }
            if (cls == Byte.class) {
                return ByteDeserializer.wrapperInstance;
            }
            if (cls == Short.class) {
                return ShortDeserializer.wrapperInstance;
            }
            if (cls == Float.class) {
                return FloatDeserializer.wrapperInstance;
            }
            if (cls == Number.class) {
                return NumberDeserializer.instance;
            }
            if (cls == BigDecimal.class) {
                return BigDecimalDeserializer.instance;
            }
            if (cls == BigInteger.class) {
                return BigIntegerDeserializer.instance;
            }
        }
        throw new IllegalArgumentException(StubApp.getString2(10757).concat(cls.getName()));
    }
}
