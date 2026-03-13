package com.fasterxml.jackson.databind.deser.std;

import E1.a;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class StdDeserializer<T> extends JsonDeserializer<T> implements Serializable {
    protected final Class<?> _valueClass;
    protected final JavaType _valueType;
    protected static final int F_MASK_INT_COERCIONS = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask() | DeserializationFeature.USE_LONG_FOR_INTS.getMask();

    @Deprecated
    protected static final int F_MASK_ACCEPT_ARRAYS = DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask() | DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask();

    /* renamed from: com.fasterxml.jackson.databind.deser.std.StdDeserializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.Fail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public StdDeserializer(Class<?> cls) {
        this._valueClass = cls;
        this._valueType = null;
    }

    public static final boolean _isBlank(String str) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) > ' ') {
                return false;
            }
        }
        return true;
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final double _parseDouble(String str, boolean z2) throws NumberFormatException {
        return NumberInput.parseDouble(str, z2);
    }

    public final boolean _byteOverflow(int i3) {
        return i3 < -128 || i3 > 255;
    }

    public CoercionAction _checkBooleanToStringCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        return _checkToStringCoercion(jsonParser, deserializationContext, cls, Boolean.valueOf(jsonParser.getBooleanValue()), CoercionInputShape.Boolean);
    }

    public CoercionAction _checkCoercionFail(DeserializationContext deserializationContext, CoercionAction coercionAction, Class<?> cls, Object obj, String str) throws IOException {
        if (coercionAction == CoercionAction.Fail) {
            deserializationContext.reportBadCoercion(this, cls, obj, "Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", str, _coercedTypeDesc());
        }
        return coercionAction;
    }

    public Double _checkDoubleSpecialValue(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char charAt = str.charAt(0);
        if (charAt == '-') {
            if (_isNegInf(str)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (charAt == 'I') {
            if (_isPosInf(str)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            return null;
        }
        if (charAt == 'N' && _isNaN(str)) {
            return Double.valueOf(Double.NaN);
        }
        return null;
    }

    public Float _checkFloatSpecialValue(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char charAt = str.charAt(0);
        if (charAt == '-') {
            if (_isNegInf(str)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (charAt == 'I') {
            if (_isPosInf(str)) {
                return Float.valueOf(Float.POSITIVE_INFINITY);
            }
            return null;
        }
        if (charAt == 'N' && _isNaN(str)) {
            return Float.valueOf(Float.NaN);
        }
        return null;
    }

    public CoercionAction _checkFloatToIntCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(LogicalType.Integer, cls, CoercionInputShape.Float);
        if (findCoercionAction != CoercionAction.Fail) {
            return findCoercionAction;
        }
        return _checkCoercionFail(deserializationContext, findCoercionAction, cls, jsonParser.getNumberValue(), "Floating-point value (" + jsonParser.getText() + ")");
    }

    public CoercionAction _checkFloatToStringCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        return _checkToStringCoercion(jsonParser, deserializationContext, cls, jsonParser.getNumberValue(), CoercionInputShape.Float);
    }

    public CoercionAction _checkFromStringCoercion(DeserializationContext deserializationContext, String str) throws IOException {
        return _checkFromStringCoercion(deserializationContext, str, logicalType(), handledType());
    }

    public CoercionAction _checkIntToFloatCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(LogicalType.Float, cls, CoercionInputShape.Integer);
        if (findCoercionAction != CoercionAction.Fail) {
            return findCoercionAction;
        }
        return _checkCoercionFail(deserializationContext, findCoercionAction, cls, jsonParser.getNumberValue(), "Integer value (" + jsonParser.getText() + ")");
    }

    public CoercionAction _checkIntToStringCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        return _checkToStringCoercion(jsonParser, deserializationContext, cls, jsonParser.getNumberValue(), CoercionInputShape.Integer);
    }

    public boolean _checkTextualNull(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        if (!_hasTextualNull(str)) {
            return false;
        }
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (!deserializationContext.isEnabled(mapperFeature)) {
            _reportFailedNullCoerce(deserializationContext, true, mapperFeature, "String \"null\"");
        }
        return true;
    }

    public CoercionAction _checkToStringCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls, Object obj, CoercionInputShape coercionInputShape) throws IOException {
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(LogicalType.Textual, cls, coercionInputShape);
        if (findCoercionAction != CoercionAction.Fail) {
            return findCoercionAction;
        }
        return _checkCoercionFail(deserializationContext, findCoercionAction, cls, obj, coercionInputShape.name() + " value (" + jsonParser.getText() + ")");
    }

    public Boolean _coerceBooleanFromInt(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(LogicalType.Boolean, cls, CoercionInputShape.Integer);
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[findCoercionAction.ordinal()];
        if (i3 == 1) {
            return Boolean.FALSE;
        }
        if (i3 == 2) {
            return null;
        }
        if (i3 != 4) {
            if (jsonParser.getNumberType() == JsonParser.NumberType.INT) {
                return Boolean.valueOf(jsonParser.getIntValue() != 0);
            }
            return Boolean.valueOf(!"0".equals(jsonParser.getText()));
        }
        _checkCoercionFail(deserializationContext, findCoercionAction, cls, jsonParser.getNumberValue(), "Integer value (" + jsonParser.getText() + ")");
        return Boolean.FALSE;
    }

    public Object _coerceIntegral(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.getBigIntegerValue() : deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) ? Long.valueOf(jsonParser.getLongValue()) : jsonParser.getNumberValue();
    }

    public String _coercedTypeDesc() {
        String classDescription;
        JavaType valueType = getValueType();
        boolean z2 = true;
        if (valueType == null || valueType.isPrimitive()) {
            Class<?> handledType = handledType();
            if (!handledType.isArray() && !Collection.class.isAssignableFrom(handledType) && !Map.class.isAssignableFrom(handledType)) {
                z2 = false;
            }
            classDescription = ClassUtil.getClassDescription(handledType);
        } else {
            if (!valueType.isContainerType() && !valueType.isReferenceType()) {
                z2 = false;
            }
            classDescription = ClassUtil.getTypeDescription(valueType);
        }
        return z2 ? a.j("element of ", classDescription) : AbstractC1482f.g(classDescription, " value");
    }

    public T _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        CoercionAction _findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean isEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (isEnabled || _findCoercionFromEmptyArray != CoercionAction.Fail) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[_findCoercionFromEmptyArray.ordinal()];
                if (i3 == 1) {
                    return (T) getEmptyValue(deserializationContext);
                }
                if (i3 == 2 || i3 == 3) {
                    return getNullValue(deserializationContext);
                }
            } else if (isEnabled) {
                T _deserializeWrappedValue = _deserializeWrappedValue(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return _deserializeWrappedValue;
            }
        }
        return (T) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
    }

    public Object _deserializeFromEmptyString(JsonParser jsonParser, DeserializationContext deserializationContext, CoercionAction coercionAction, Class<?> cls, String str) throws IOException {
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[coercionAction.ordinal()];
        if (i3 == 1) {
            return getEmptyValue(deserializationContext);
        }
        if (i3 != 4) {
            return null;
        }
        _checkCoercionFail(deserializationContext, coercionAction, cls, "", "empty String (\"\")");
        return null;
    }

    public T _deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ValueInstantiator valueInstantiator = getValueInstantiator();
        Class<?> handledType = handledType();
        String valueAsString = jsonParser.getValueAsString();
        if (valueInstantiator != null && valueInstantiator.canCreateFromString()) {
            return (T) valueInstantiator.createFromString(deserializationContext, valueAsString);
        }
        if (valueAsString.isEmpty()) {
            return (T) _deserializeFromEmptyString(jsonParser, deserializationContext, deserializationContext.findCoercionAction(logicalType(), handledType, CoercionInputShape.EmptyString), handledType, "empty String (\"\")");
        }
        if (_isBlank(valueAsString)) {
            return (T) _deserializeFromEmptyString(jsonParser, deserializationContext, deserializationContext.findCoercionFromBlankString(logicalType(), handledType, CoercionAction.Fail), handledType, "blank String (all whitespace)");
        }
        if (valueInstantiator != null) {
            valueAsString = valueAsString.trim();
            if (valueInstantiator.canCreateFromInt() && deserializationContext.findCoercionAction(LogicalType.Integer, Integer.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                return (T) valueInstantiator.createFromInt(deserializationContext, _parseIntPrimitive(deserializationContext, valueAsString));
            }
            if (valueInstantiator.canCreateFromLong() && deserializationContext.findCoercionAction(LogicalType.Integer, Long.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                return (T) valueInstantiator.createFromLong(deserializationContext, _parseLongPrimitive(deserializationContext, valueAsString));
            }
            if (valueInstantiator.canCreateFromBoolean() && deserializationContext.findCoercionAction(LogicalType.Boolean, Boolean.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                String trim = valueAsString.trim();
                if ("true".equals(trim)) {
                    return (T) valueInstantiator.createFromBoolean(deserializationContext, true);
                }
                if ("false".equals(trim)) {
                    return (T) valueInstantiator.createFromBoolean(deserializationContext, false);
                }
            }
        }
        return (T) deserializationContext.handleMissingInstantiator(handledType, valueInstantiator, deserializationContext.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", valueAsString);
    }

    public T _deserializeWrappedValue(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.hasToken(JsonToken.START_ARRAY) ? (T) handleNestedArrayForSingle(jsonParser, deserializationContext) : deserialize(jsonParser, deserializationContext);
    }

    public CoercionAction _findCoercionFromBlankString(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionFromBlankString(logicalType(), handledType(), CoercionAction.Fail);
    }

    public CoercionAction _findCoercionFromEmptyArray(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyArray);
    }

    public CoercionAction _findCoercionFromEmptyString(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyString);
    }

    public final NullValueProvider _findNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, Nulls nulls, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        if (nulls == Nulls.FAIL) {
            if (beanProperty == null) {
                return NullsFailProvider.constructForRootValue(deserializationContext.constructType(jsonDeserializer == null ? Object.class : jsonDeserializer.handledType()));
            }
            return NullsFailProvider.constructForProperty(beanProperty);
        }
        if (nulls != Nulls.AS_EMPTY) {
            if (nulls == Nulls.SKIP) {
                return NullsConstantProvider.skipper();
            }
            return null;
        }
        if (jsonDeserializer == null) {
            return null;
        }
        if (jsonDeserializer instanceof BeanDeserializerBase) {
            BeanDeserializerBase beanDeserializerBase = (BeanDeserializerBase) jsonDeserializer;
            if (!beanDeserializerBase.getValueInstantiator().canCreateUsingDefault()) {
                JavaType valueType = beanProperty == null ? beanDeserializerBase.getValueType() : beanProperty.getType();
                return (NullValueProvider) deserializationContext.reportBadDefinition(valueType, String.format("Cannot create empty instance of %s, no default Creator", valueType));
            }
        }
        AccessPattern emptyAccessPattern = jsonDeserializer.getEmptyAccessPattern();
        return emptyAccessPattern == AccessPattern.ALWAYS_NULL ? NullsConstantProvider.nuller() : emptyAccessPattern == AccessPattern.CONSTANT ? NullsConstantProvider.forValue(jsonDeserializer.getEmptyValue(deserializationContext)) : new NullsAsEmptyProvider(jsonDeserializer);
    }

    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    public final boolean _intOverflow(long j) {
        return j < -2147483648L || j > 2147483647L;
    }

    public boolean _isFalse(String str) {
        char charAt = str.charAt(0);
        if (charAt == 'f') {
            return "false".equals(str);
        }
        if (charAt == 'F') {
            return "FALSE".equals(str) || "False".equals(str);
        }
        return false;
    }

    public final boolean _isIntNumber(String str) {
        int i3;
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt != '-' && charAt != '+') {
            i3 = 0;
        } else {
            if (length == 1) {
                return false;
            }
            i3 = 1;
        }
        while (i3 < length) {
            char charAt2 = str.charAt(i3);
            if (charAt2 > '9' || charAt2 < '0') {
                return false;
            }
            i3++;
        }
        return true;
    }

    public final boolean _isNaN(String str) {
        return "NaN".equals(str);
    }

    public final boolean _isNegInf(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public final boolean _isPosInf(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public boolean _isTrue(String str) {
        char charAt = str.charAt(0);
        if (charAt == 't') {
            return "true".equals(str);
        }
        if (charAt == 'T') {
            return "TRUE".equals(str) || "True".equals(str);
        }
        return false;
    }

    public Number _nonNullNumber(Number number) {
        if (number == null) {
            return 0;
        }
        return number;
    }

    public final Boolean _parseBoolean(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String extractScalarFromObject;
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId == 1) {
            extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        } else {
            if (currentTokenId == 3) {
                return (Boolean) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId != 6) {
                if (currentTokenId == 7) {
                    return _coerceBooleanFromInt(jsonParser, deserializationContext, cls);
                }
                switch (currentTokenId) {
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    default:
                        return (Boolean) deserializationContext.handleUnexpectedToken(cls, jsonParser);
                }
            }
            extractScalarFromObject = jsonParser.getText();
        }
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject, LogicalType.Boolean, cls);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            return null;
        }
        if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return Boolean.FALSE;
        }
        String trim = extractScalarFromObject.trim();
        int length = trim.length();
        if (length == 4) {
            if (_isTrue(trim)) {
                return Boolean.TRUE;
            }
        } else if (length == 5 && _isFalse(trim)) {
            return Boolean.FALSE;
        }
        if (_checkTextualNull(deserializationContext, trim)) {
            return null;
        }
        return (Boolean) deserializationContext.handleWeirdStringValue(cls, trim, "only \"true\" or \"false\" recognized", new Object[0]);
    }

    public final boolean _parseBooleanPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String extractScalarFromObject;
        int currentTokenId = jsonParser.currentTokenId();
        Class<?> cls = Boolean.TYPE;
        if (currentTokenId != 1) {
            if (currentTokenId != 3) {
                if (currentTokenId == 6) {
                    extractScalarFromObject = jsonParser.getText();
                } else {
                    if (currentTokenId == 7) {
                        return Boolean.TRUE.equals(_coerceBooleanFromInt(jsonParser, deserializationContext, cls));
                    }
                    switch (currentTokenId) {
                        case 9:
                            return true;
                        case 11:
                            _verifyNullForPrimitive(deserializationContext);
                        case 10:
                            return false;
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Boolean) handleNestedArrayForSingle(jsonParser, deserializationContext)).booleanValue();
                }
                boolean _parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseBooleanPrimitive;
            }
            return ((Boolean) deserializationContext.handleUnexpectedToken(cls, jsonParser)).booleanValue();
        }
        extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject, LogicalType.Boolean, cls);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return false;
        }
        if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return false;
        }
        String trim = extractScalarFromObject.trim();
        int length = trim.length();
        if (length == 4) {
            if (_isTrue(trim)) {
                return true;
            }
        } else if (length == 5 && _isFalse(trim)) {
            return false;
        }
        if (_hasTextualNull(trim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, trim);
            return false;
        }
        return Boolean.TRUE.equals((Boolean) deserializationContext.handleWeirdStringValue(cls, trim, "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized", new Object[0]));
    }

    public final byte _parseBytePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String extractScalarFromObject;
        int currentTokenId = jsonParser.currentTokenId();
        Class<?> cls = Byte.TYPE;
        if (currentTokenId != 1) {
            if (currentTokenId != 3) {
                if (currentTokenId == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return (byte) 0;
                }
                if (currentTokenId == 6) {
                    extractScalarFromObject = jsonParser.getText();
                } else {
                    if (currentTokenId == 7) {
                        return jsonParser.getByteValue();
                    }
                    if (currentTokenId == 8) {
                        CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                        if (_checkFloatToIntCoercion == CoercionAction.AsNull || _checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (byte) 0;
                        }
                        return jsonParser.getByteValue();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Byte) handleNestedArrayForSingle(jsonParser, deserializationContext)).byteValue();
                }
                byte _parseBytePrimitive = _parseBytePrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseBytePrimitive;
            }
            return ((Byte) deserializationContext.handleUnexpectedToken(deserializationContext.constructType(cls), jsonParser)).byteValue();
        }
        extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject, LogicalType.Integer, cls);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return (byte) 0;
        }
        if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (byte) 0;
        }
        String trim = extractScalarFromObject.trim();
        if (_hasTextualNull(trim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, trim);
            return (byte) 0;
        }
        try {
            int parseInt = NumberInput.parseInt(trim);
            return _byteOverflow(parseInt) ? ((Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue() : (byte) parseInt;
        } catch (IllegalArgumentException unused) {
            return ((Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid `byte` value", new Object[0])).byteValue();
        }
    }

    public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String extractScalarFromObject;
        long longValue;
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId == 1) {
            extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        } else {
            if (currentTokenId == 3) {
                return _parseDateFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId == 11) {
                return (Date) getNullValue(deserializationContext);
            }
            if (currentTokenId != 6) {
                if (currentTokenId != 7) {
                    return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
                }
                try {
                    longValue = jsonParser.getLongValue();
                } catch (StreamReadException unused) {
                    longValue = ((Number) deserializationContext.handleWeirdNumberValue(this._valueClass, jsonParser.getNumberValue(), "not a valid 64-bit `long` for creating `java.util.Date`", new Object[0])).longValue();
                }
                return new Date(longValue);
            }
            extractScalarFromObject = jsonParser.getText();
        }
        return _parseDate(extractScalarFromObject.trim(), deserializationContext);
    }

    public Date _parseDateFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        CoercionAction _findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean isEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (isEnabled || _findCoercionFromEmptyArray != CoercionAction.Fail) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[_findCoercionFromEmptyArray.ordinal()];
                if (i3 == 1) {
                    return (Date) getEmptyValue(deserializationContext);
                }
                if (i3 == 2 || i3 == 3) {
                    return (Date) getNullValue(deserializationContext);
                }
            } else if (isEnabled) {
                if (nextToken == JsonToken.START_ARRAY) {
                    return (Date) handleNestedArrayForSingle(jsonParser, deserializationContext);
                }
                Date _parseDate = _parseDate(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseDate;
            }
        }
        return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r0 != 8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double _parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r6.currentTokenId()
            r1 = 1
            java.lang.Class r2 = java.lang.Double.TYPE
            r3 = 0
            if (r0 == r1) goto L67
            r1 = 3
            if (r0 == r1) goto L39
            r1 = 11
            if (r0 == r1) goto L35
            r1 = 6
            if (r0 == r1) goto L30
            r1 = 7
            if (r0 == r1) goto L1d
            r1 = 8
            if (r0 == r1) goto L2b
            goto L5c
        L1d:
            com.fasterxml.jackson.databind.cfg.CoercionAction r7 = r5._checkIntToFloatCoercion(r6, r7, r2)
            com.fasterxml.jackson.databind.cfg.CoercionAction r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull
            if (r7 != r0) goto L26
            return r3
        L26:
            com.fasterxml.jackson.databind.cfg.CoercionAction r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty
            if (r7 != r0) goto L2b
            return r3
        L2b:
            double r6 = r6.getDoubleValue()
            return r6
        L30:
            java.lang.String r0 = r6.getText()
            goto L6b
        L35:
            r5._verifyNullForPrimitive(r7)
            return r3
        L39:
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r7.isEnabled(r0)
            if (r0 == 0) goto L5c
            com.fasterxml.jackson.core.JsonToken r0 = r6.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            if (r0 != r1) goto L54
            java.lang.Object r6 = r5.handleNestedArrayForSingle(r6, r7)
            java.lang.Double r6 = (java.lang.Double) r6
            double r6 = r6.doubleValue()
            return r6
        L54:
            double r0 = r5._parseDoublePrimitive(r6, r7)
            r5._verifyEndArrayForSingle(r6, r7)
            return r0
        L5c:
            java.lang.Object r6 = r7.handleUnexpectedToken(r2, r6)
            java.lang.Number r6 = (java.lang.Number) r6
            double r6 = r6.doubleValue()
            return r6
        L67:
            java.lang.String r0 = r7.extractScalarFromObject(r6, r5, r2)
        L6b:
            java.lang.Double r1 = r5._checkDoubleSpecialValue(r0)
            if (r1 == 0) goto L76
            double r6 = r1.doubleValue()
            return r6
        L76:
            com.fasterxml.jackson.databind.type.LogicalType r1 = com.fasterxml.jackson.databind.type.LogicalType.Integer
            com.fasterxml.jackson.databind.cfg.CoercionAction r1 = r5._checkFromStringCoercion(r7, r0, r1, r2)
            com.fasterxml.jackson.databind.cfg.CoercionAction r2 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull
            if (r1 != r2) goto L84
            r5._verifyNullForPrimitive(r7)
            return r3
        L84:
            com.fasterxml.jackson.databind.cfg.CoercionAction r2 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty
            if (r1 != r2) goto L89
            return r3
        L89:
            java.lang.String r0 = r0.trim()
            boolean r1 = r5._hasTextualNull(r0)
            if (r1 == 0) goto L97
            r5._verifyNullForPrimitiveCoercion(r7, r0)
            return r3
        L97:
            double r6 = r5._parseDoublePrimitive(r6, r7, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r0 != 8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float _parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r5.currentTokenId()
            r1 = 1
            java.lang.Class r2 = java.lang.Float.TYPE
            r3 = 0
            if (r0 == r1) goto L66
            r1 = 3
            if (r0 == r1) goto L38
            r1 = 11
            if (r0 == r1) goto L34
            r1 = 6
            if (r0 == r1) goto L2f
            r1 = 7
            if (r0 == r1) goto L1c
            r1 = 8
            if (r0 == r1) goto L2a
            goto L5b
        L1c:
            com.fasterxml.jackson.databind.cfg.CoercionAction r6 = r4._checkIntToFloatCoercion(r5, r6, r2)
            com.fasterxml.jackson.databind.cfg.CoercionAction r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull
            if (r6 != r0) goto L25
            return r3
        L25:
            com.fasterxml.jackson.databind.cfg.CoercionAction r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty
            if (r6 != r0) goto L2a
            return r3
        L2a:
            float r5 = r5.getFloatValue()
            return r5
        L2f:
            java.lang.String r0 = r5.getText()
            goto L6a
        L34:
            r4._verifyNullForPrimitive(r6)
            return r3
        L38:
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r6.isEnabled(r0)
            if (r0 == 0) goto L5b
            com.fasterxml.jackson.core.JsonToken r0 = r5.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            if (r0 != r1) goto L53
            java.lang.Object r5 = r4.handleNestedArrayForSingle(r5, r6)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            return r5
        L53:
            float r0 = r4._parseFloatPrimitive(r5, r6)
            r4._verifyEndArrayForSingle(r5, r6)
            return r0
        L5b:
            java.lang.Object r5 = r6.handleUnexpectedToken(r2, r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            return r5
        L66:
            java.lang.String r0 = r6.extractScalarFromObject(r5, r4, r2)
        L6a:
            java.lang.Float r1 = r4._checkFloatSpecialValue(r0)
            if (r1 == 0) goto L75
            float r5 = r1.floatValue()
            return r5
        L75:
            com.fasterxml.jackson.databind.type.LogicalType r1 = com.fasterxml.jackson.databind.type.LogicalType.Integer
            com.fasterxml.jackson.databind.cfg.CoercionAction r1 = r4._checkFromStringCoercion(r6, r0, r1, r2)
            com.fasterxml.jackson.databind.cfg.CoercionAction r2 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull
            if (r1 != r2) goto L83
            r4._verifyNullForPrimitive(r6)
            return r3
        L83:
            com.fasterxml.jackson.databind.cfg.CoercionAction r2 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty
            if (r1 != r2) goto L88
            return r3
        L88:
            java.lang.String r0 = r0.trim()
            boolean r1 = r4._hasTextualNull(r0)
            if (r1 == 0) goto L96
            r4._verifyNullForPrimitiveCoercion(r6, r0)
            return r3
        L96:
            float r5 = r4._parseFloatPrimitive(r5, r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):float");
    }

    public final int _parseIntPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String extractScalarFromObject;
        int currentTokenId = jsonParser.currentTokenId();
        Class<?> cls = Integer.TYPE;
        if (currentTokenId != 1) {
            if (currentTokenId != 3) {
                if (currentTokenId == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0;
                }
                if (currentTokenId == 6) {
                    extractScalarFromObject = jsonParser.getText();
                } else {
                    if (currentTokenId == 7) {
                        return jsonParser.getIntValue();
                    }
                    if (currentTokenId == 8) {
                        CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                        if (_checkFloatToIntCoercion == CoercionAction.AsNull || _checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return 0;
                        }
                        return jsonParser.getValueAsInt();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Integer) handleNestedArrayForSingle(jsonParser, deserializationContext)).intValue();
                }
                int _parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseIntPrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken(cls, jsonParser)).intValue();
        }
        extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject, LogicalType.Integer, cls);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0;
        }
        if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0;
        }
        String trim = extractScalarFromObject.trim();
        if (!_hasTextualNull(trim)) {
            return _parseIntPrimitive(deserializationContext, trim);
        }
        _verifyNullForPrimitiveCoercion(deserializationContext, trim);
        return 0;
    }

    public final Integer _parseInteger(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String extractScalarFromObject;
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId == 1) {
            extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        } else {
            if (currentTokenId == 3) {
                return (Integer) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId == 11) {
                return (Integer) getNullValue(deserializationContext);
            }
            if (currentTokenId != 6) {
                if (currentTokenId == 7) {
                    return Integer.valueOf(jsonParser.getIntValue());
                }
                if (currentTokenId != 8) {
                    return (Integer) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                return _checkFloatToIntCoercion == CoercionAction.AsNull ? (Integer) getNullValue(deserializationContext) : _checkFloatToIntCoercion == CoercionAction.AsEmpty ? (Integer) getEmptyValue(deserializationContext) : Integer.valueOf(jsonParser.getValueAsInt());
            }
            extractScalarFromObject = jsonParser.getText();
        }
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            return (Integer) getNullValue(deserializationContext);
        }
        if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (Integer) getEmptyValue(deserializationContext);
        }
        String trim = extractScalarFromObject.trim();
        return _checkTextualNull(deserializationContext, trim) ? (Integer) getNullValue(deserializationContext) : _parseInteger(deserializationContext, trim);
    }

    public final Long _parseLong(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String extractScalarFromObject;
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId == 1) {
            extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        } else {
            if (currentTokenId == 3) {
                return (Long) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId == 11) {
                return (Long) getNullValue(deserializationContext);
            }
            if (currentTokenId != 6) {
                if (currentTokenId == 7) {
                    return Long.valueOf(jsonParser.getLongValue());
                }
                if (currentTokenId != 8) {
                    return (Long) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                return _checkFloatToIntCoercion == CoercionAction.AsNull ? (Long) getNullValue(deserializationContext) : _checkFloatToIntCoercion == CoercionAction.AsEmpty ? (Long) getEmptyValue(deserializationContext) : Long.valueOf(jsonParser.getValueAsLong());
            }
            extractScalarFromObject = jsonParser.getText();
        }
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            return (Long) getNullValue(deserializationContext);
        }
        if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (Long) getEmptyValue(deserializationContext);
        }
        String trim = extractScalarFromObject.trim();
        return _checkTextualNull(deserializationContext, trim) ? (Long) getNullValue(deserializationContext) : _parseLong(deserializationContext, trim);
    }

    public final long _parseLongPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String extractScalarFromObject;
        int currentTokenId = jsonParser.currentTokenId();
        Class<?> cls = Long.TYPE;
        if (currentTokenId != 1) {
            if (currentTokenId != 3) {
                if (currentTokenId == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0L;
                }
                if (currentTokenId == 6) {
                    extractScalarFromObject = jsonParser.getText();
                } else {
                    if (currentTokenId == 7) {
                        return jsonParser.getLongValue();
                    }
                    if (currentTokenId == 8) {
                        CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                        if (_checkFloatToIntCoercion == CoercionAction.AsNull || _checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return 0L;
                        }
                        return jsonParser.getValueAsLong();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Long) handleNestedArrayForSingle(jsonParser, deserializationContext)).longValue();
                }
                long _parseLongPrimitive = _parseLongPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseLongPrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken(cls, jsonParser)).longValue();
        }
        extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject, LogicalType.Integer, cls);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0L;
        }
        if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0L;
        }
        String trim = extractScalarFromObject.trim();
        if (!_hasTextualNull(trim)) {
            return _parseLongPrimitive(deserializationContext, trim);
        }
        _verifyNullForPrimitiveCoercion(deserializationContext, trim);
        return 0L;
    }

    public final short _parseShortPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String extractScalarFromObject;
        int currentTokenId = jsonParser.currentTokenId();
        Class<?> cls = Short.TYPE;
        if (currentTokenId != 1) {
            if (currentTokenId != 3) {
                if (currentTokenId == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return (short) 0;
                }
                if (currentTokenId == 6) {
                    extractScalarFromObject = jsonParser.getText();
                } else {
                    if (currentTokenId == 7) {
                        return jsonParser.getShortValue();
                    }
                    if (currentTokenId == 8) {
                        CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                        if (_checkFloatToIntCoercion == CoercionAction.AsNull || _checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (short) 0;
                        }
                        return jsonParser.getShortValue();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Short) handleNestedArrayForSingle(jsonParser, deserializationContext)).shortValue();
                }
                short _parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseShortPrimitive;
            }
            return ((Short) deserializationContext.handleUnexpectedToken(deserializationContext.constructType(cls), jsonParser)).shortValue();
        }
        extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject, LogicalType.Integer, cls);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return (short) 0;
        }
        if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (short) 0;
        }
        String trim = extractScalarFromObject.trim();
        if (_hasTextualNull(trim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, trim);
            return (short) 0;
        }
        try {
            int parseInt = NumberInput.parseInt(trim);
            return _shortOverflow(parseInt) ? ((Short) deserializationContext.handleWeirdStringValue(cls, trim, "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue() : (short) parseInt;
        } catch (IllegalArgumentException unused) {
            return ((Short) deserializationContext.handleWeirdStringValue(cls, trim, "not a valid `short` value", new Object[0])).shortValue();
        }
    }

    public final String _parseString(JsonParser jsonParser, DeserializationContext deserializationContext, NullValueProvider nullValueProvider) throws IOException {
        String valueAsString;
        CoercionAction coercionAction = CoercionAction.TryConvert;
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId == 1) {
            return deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        }
        if (currentTokenId == 12) {
            Object embeddedObject = jsonParser.getEmbeddedObject();
            if (embeddedObject instanceof byte[]) {
                return deserializationContext.getBase64Variant().encode((byte[]) embeddedObject, false);
            }
            if (embeddedObject == null) {
                return null;
            }
            return embeddedObject.toString();
        }
        switch (currentTokenId) {
            case 6:
                return jsonParser.getText();
            case 7:
                coercionAction = _checkIntToStringCoercion(jsonParser, deserializationContext, this._valueClass);
                break;
            case 8:
                coercionAction = _checkFloatToStringCoercion(jsonParser, deserializationContext, this._valueClass);
                break;
            case 9:
            case 10:
                coercionAction = _checkBooleanToStringCoercion(jsonParser, deserializationContext, this._valueClass);
                break;
        }
        return coercionAction == CoercionAction.AsNull ? (String) nullValueProvider.getNullValue(deserializationContext) : coercionAction == CoercionAction.AsEmpty ? "" : (!jsonParser.currentToken().isScalarValue() || (valueAsString = jsonParser.getValueAsString()) == null) ? (String) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser) : valueAsString;
    }

    public void _reportFailedNullCoerce(DeserializationContext deserializationContext, boolean z2, Enum<?> r52, String str) throws JsonMappingException {
        deserializationContext.reportInputMismatch(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str, _coercedTypeDesc(), z2 ? "enable" : "disable", r52.getDeclaringClass().getSimpleName(), r52.name());
    }

    public final boolean _shortOverflow(int i3) {
        return i3 < -32768 || i3 > 32767;
    }

    public void _verifyEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
    }

    public final void _verifyNullForPrimitive(DeserializationContext deserializationContext) throws JsonMappingException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            deserializationContext.reportInputMismatch(this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", _coercedTypeDesc());
        }
    }

    public final void _verifyNullForPrimitiveCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        boolean z2;
        MapperFeature mapperFeature;
        MapperFeature mapperFeature2 = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature2)) {
            DeserializationFeature deserializationFeature = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
            if (!deserializationContext.isEnabled(deserializationFeature)) {
                return;
            }
            z2 = false;
            mapperFeature = deserializationFeature;
        } else {
            z2 = true;
            mapperFeature = mapperFeature2;
        }
        _reportFailedNullCoerce(deserializationContext, z2, mapperFeature, str.isEmpty() ? "empty String (\"\")" : a.k("String \"", str, "\""));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public NullValueProvider findContentNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Nulls findContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (findContentNullStyle == Nulls.SKIP) {
            return NullsConstantProvider.skipper();
        }
        if (findContentNullStyle != Nulls.FAIL) {
            NullValueProvider _findNullProvider = _findNullProvider(deserializationContext, beanProperty, findContentNullStyle, jsonDeserializer);
            return _findNullProvider != null ? _findNullProvider : jsonDeserializer;
        }
        if (beanProperty != null) {
            return NullsFailProvider.constructForProperty(beanProperty, beanProperty.getType().getContentType());
        }
        JavaType constructType = deserializationContext.constructType(jsonDeserializer.handledType());
        if (constructType.isContainerType()) {
            constructType = constructType.getContentType();
        }
        return NullsFailProvider.constructForRootValue(constructType);
    }

    public Nulls findContentNullStyle(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        return beanProperty != null ? beanProperty.getMetadata().getContentNulls() : deserializationContext.getConfig().getDefaultSetterInfo().getContentNulls();
    }

    public JsonDeserializer<?> findConvertingContentDeserializer(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        AnnotatedMember member;
        Object findDeserializationContentConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (findDeserializationContentConverter = annotationIntrospector.findDeserializationContentConverter(member)) == null) {
            return jsonDeserializer;
        }
        Converter<Object, Object> converterInstance = deserializationContext.converterInstance(beanProperty.getMember(), findDeserializationContentConverter);
        JavaType inputType = converterInstance.getInputType(deserializationContext.getTypeFactory());
        if (jsonDeserializer == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(inputType, beanProperty);
        }
        return new StdDelegatingDeserializer(converterInstance, inputType, jsonDeserializer);
    }

    public JsonDeserializer<Object> findDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return deserializationContext.findContextualValueDeserializer(javaType, beanProperty);
    }

    public Boolean findFormatFeature(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, cls);
        if (findFormatOverrides != null) {
            return findFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public JsonFormat.Value findFormatOverrides(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyFormat(deserializationContext.getConfig(), cls) : deserializationContext.getDefaultPropertyFormat(cls);
    }

    public final NullValueProvider findValueNullProvider(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) throws JsonMappingException {
        if (settableBeanProperty != null) {
            return _findNullProvider(deserializationContext, settableBeanProperty, propertyMetadata.getValueNulls(), settableBeanProperty.getValueDeserializer());
        }
        return null;
    }

    public ValueInstantiator getValueInstantiator() {
        return null;
    }

    public JavaType getValueType() {
        return this._valueType;
    }

    public void handleMissingEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportWrongTokenException(this, JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", handledType().getName());
    }

    public Object handleNestedArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser.currentToken(), jsonParser, "Cannot deserialize instance of " + ClassUtil.nameOf(this._valueClass) + " out of " + JsonToken.START_ARRAY + " token: nested Arrays not allowed with DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS", new Object[0]);
    }

    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (obj == null) {
            obj = handledType();
        }
        if (deserializationContext.handleUnknownProperty(jsonParser, this, obj, str)) {
            return;
        }
        jsonParser.skipChildren();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this._valueClass;
    }

    public boolean isDefaultDeserializer(JsonDeserializer<?> jsonDeserializer) {
        return ClassUtil.isJacksonStdImpl(jsonDeserializer);
    }

    public boolean isDefaultKeyDeserializer(KeyDeserializer keyDeserializer) {
        return ClassUtil.isJacksonStdImpl(keyDeserializer);
    }

    public CoercionAction _checkFromStringCoercion(DeserializationContext deserializationContext, String str, LogicalType logicalType, Class<?> cls) throws IOException {
        if (str.isEmpty()) {
            return _checkCoercionFail(deserializationContext, deserializationContext.findCoercionAction(logicalType, cls, CoercionInputShape.EmptyString), cls, str, "empty String (\"\")");
        }
        if (_isBlank(str)) {
            return _checkCoercionFail(deserializationContext, deserializationContext.findCoercionFromBlankString(logicalType, cls, CoercionAction.Fail), cls, str, "blank String (all whitespace)");
        }
        if (deserializationContext.isEnabled(StreamReadCapability.UNTYPED_SCALARS)) {
            return CoercionAction.TryConvert;
        }
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType, cls, CoercionInputShape.String);
        if (findCoercionAction == CoercionAction.Fail) {
            deserializationContext.reportInputMismatch(this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, _coercedTypeDesc());
        }
        return findCoercionAction;
    }

    public JavaType getValueType(DeserializationContext deserializationContext) {
        JavaType javaType = this._valueType;
        return javaType != null ? javaType : deserializationContext.constructType(this._valueClass);
    }

    public StdDeserializer(JavaType javaType) {
        this._valueClass = javaType == null ? Object.class : javaType.getRawClass();
        this._valueType = javaType;
    }

    public StdDeserializer(StdDeserializer<?> stdDeserializer) {
        this._valueClass = stdDeserializer._valueClass;
        this._valueType = stdDeserializer._valueType;
    }

    public Date _parseDate(String str, DeserializationContext deserializationContext) throws IOException {
        try {
            if (str.isEmpty()) {
                if (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[_checkFromStringCoercion(deserializationContext, str).ordinal()] != 1) {
                    return null;
                }
                return new Date(0L);
            }
            if (_hasTextualNull(str)) {
                return null;
            }
            return deserializationContext.parseDate(str);
        } catch (IllegalArgumentException e10) {
            return (Date) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid representation (error: %s)", ClassUtil.exceptionMessage(e10));
        }
    }

    public final Integer _parseInteger(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            if (str.length() > 9) {
                long parseLong = NumberInput.parseLong(str);
                if (_intOverflow(parseLong)) {
                    return (Integer) deserializationContext.handleWeirdStringValue(Integer.class, str, "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)", str, Integer.MIN_VALUE, Integer.valueOf(IntCompanionObject.MAX_VALUE));
                }
                return Integer.valueOf((int) parseLong);
            }
            return Integer.valueOf(NumberInput.parseInt(str));
        } catch (IllegalArgumentException unused) {
            return (Integer) deserializationContext.handleWeirdStringValue(Integer.class, str, "not a valid `java.lang.Integer` value", new Object[0]);
        }
    }

    public final Long _parseLong(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return Long.valueOf(NumberInput.parseLong(str));
        } catch (IllegalArgumentException unused) {
            return (Long) deserializationContext.handleWeirdStringValue(Long.class, str, "not a valid `java.lang.Long` value", new Object[0]);
        }
    }

    public final int _parseIntPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        Class<?> cls = Integer.TYPE;
        try {
            if (str.length() > 9) {
                long parseLong = NumberInput.parseLong(str);
                return _intOverflow(parseLong) ? _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(cls, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.valueOf(IntCompanionObject.MAX_VALUE))).intValue() : (int) parseLong;
            }
            return NumberInput.parseInt(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(cls, str, "not a valid `int` value", new Object[0])).intValue();
        }
    }

    public final long _parseLongPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return NumberInput.parseLong(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Long.TYPE, str, "not a valid `long` value", new Object[0])).longValue();
        }
    }

    public final double _parseDoublePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return _parseDouble(str, jsonParser.isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER));
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Double.TYPE, str, "not a valid `double` value (as String to convert)", new Object[0])).doubleValue();
        }
    }

    public final float _parseFloatPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return NumberInput.parseFloat(str, jsonParser.isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER));
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Float.TYPE, str, "not a valid `float` value", new Object[0])).floatValue();
        }
    }
}
