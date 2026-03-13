package com.fasterxml.jackson.databind.deser.std;

import Xa.h;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.CompactStringObjectMap;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class EnumDeserializer extends StdScalarDeserializer<Object> implements ContextualDeserializer {
    protected final Boolean _caseInsensitive;
    private final Enum<?> _enumDefaultValue;
    protected Object[] _enumsByIndex;
    protected final boolean _isFromIntValue;
    protected final CompactStringObjectMap _lookupByName;
    protected CompactStringObjectMap _lookupByToString;

    /* renamed from: com.fasterxml.jackson.databind.deser.std.EnumDeserializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction = iArr;
            try {
                iArr[CoercionAction.AsNull.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.AsEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public EnumDeserializer(EnumResolver enumResolver, Boolean bool) {
        super(enumResolver.getEnumClass());
        this._lookupByName = enumResolver.constructLookup();
        this._enumsByIndex = enumResolver.getRawEnums();
        this._enumDefaultValue = enumResolver.getDefaultValue();
        this._caseInsensitive = bool;
        this._isFromIntValue = enumResolver.isFromIntValue();
    }

    private final Object _deserializeAltString(JsonParser jsonParser, DeserializationContext deserializationContext, CompactStringObjectMap compactStringObjectMap, String str) throws IOException {
        char charAt;
        DeserializationContext deserializationContext2;
        CoercionAction _checkCoercionFail;
        String trim = str.trim();
        if (trim.isEmpty()) {
            if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this._enumDefaultValue;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            if (str.isEmpty()) {
                deserializationContext2 = deserializationContext;
                _checkCoercionFail = _checkCoercionFail(deserializationContext2, _findCoercionFromEmptyString(deserializationContext), handledType(), str, StubApp.getString2(10707));
            } else {
                deserializationContext2 = deserializationContext;
                _checkCoercionFail = _checkCoercionFail(deserializationContext2, _findCoercionFromBlankString(deserializationContext2), handledType(), str, StubApp.getString2(10708));
            }
            int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[_checkCoercionFail.ordinal()];
            if (i3 == 2 || i3 == 3) {
                return getEmptyValue(deserializationContext2);
            }
            return null;
        }
        if (Boolean.TRUE.equals(this._caseInsensitive)) {
            Object findCaseInsensitive = compactStringObjectMap.findCaseInsensitive(trim);
            if (findCaseInsensitive != null) {
                return findCaseInsensitive;
            }
        } else if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && !this._isFromIntValue && (charAt = trim.charAt(0)) >= '0' && charAt <= '9') {
            try {
                int parseInt = Integer.parseInt(trim);
                if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                    return deserializationContext.handleWeirdStringValue(_enumClass(), trim, StubApp.getString2("10719"), new Object[0]);
                }
                if (parseInt >= 0) {
                    Object[] objArr = this._enumsByIndex;
                    if (parseInt < objArr.length) {
                        return objArr[parseInt];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this._enumDefaultValue;
        }
        if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return deserializationContext.handleWeirdStringValue(_enumClass(), trim, StubApp.getString2(10720), compactStringObjectMap.keys());
    }

    public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod, annotatedMethod.getParameterType(0), valueInstantiator, settableBeanPropertyArr);
    }

    public static JsonDeserializer<?> deserializerForNoArgsCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod);
    }

    public Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.hasToken(JsonToken.START_ARRAY) ? _deserializeFromArray(jsonParser, deserializationContext) : deserializationContext.handleUnexpectedToken(_enumClass(), jsonParser);
    }

    public Class<?> _enumClass() {
        return handledType();
    }

    public Object _fromInteger(JsonParser jsonParser, DeserializationContext deserializationContext, int i3) throws IOException {
        EnumDeserializer enumDeserializer;
        DeserializationContext deserializationContext2;
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.Integer);
        if (findCoercionAction != CoercionAction.Fail) {
            enumDeserializer = this;
            deserializationContext2 = deserializationContext;
        } else {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i3), StubApp.getString2(10721), new Object[0]);
            }
            enumDeserializer = this;
            deserializationContext2 = deserializationContext;
            enumDeserializer._checkCoercionFail(deserializationContext2, findCoercionAction, handledType(), Integer.valueOf(i3), h.g(i3, StubApp.getString2(10722), StubApp.getString2(74)));
        }
        int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[findCoercionAction.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            return getEmptyValue(deserializationContext2);
        }
        if (i3 >= 0) {
            Object[] objArr = enumDeserializer._enumsByIndex;
            if (i3 < objArr.length) {
                return objArr[i3];
            }
        }
        if (enumDeserializer._enumDefaultValue != null && deserializationContext2.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return enumDeserializer._enumDefaultValue;
        }
        if (deserializationContext2.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return deserializationContext2.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i3), StubApp.getString2(10723), Integer.valueOf(enumDeserializer._enumsByIndex.length - 1));
    }

    public Object _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        Object find;
        CompactStringObjectMap _getToStringLookup = deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? _getToStringLookup(deserializationContext) : this._lookupByName;
        Object find2 = _getToStringLookup.find(str);
        if (find2 != null) {
            return find2;
        }
        String trim = str.trim();
        return (trim == str || (find = _getToStringLookup.find(trim)) == null) ? _deserializeAltString(jsonParser, deserializationContext, _getToStringLookup, trim) : find;
    }

    public CompactStringObjectMap _getToStringLookup(DeserializationContext deserializationContext) {
        CompactStringObjectMap constructLookup;
        CompactStringObjectMap compactStringObjectMap = this._lookupByToString;
        if (compactStringObjectMap != null) {
            return compactStringObjectMap;
        }
        synchronized (this) {
            constructLookup = EnumResolver.constructUsingToString(deserializationContext.getConfig(), _enumClass()).constructLookup();
        }
        this._lookupByToString = constructLookup;
        return constructLookup;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (findFormatFeature == null) {
            findFormatFeature = this._caseInsensitive;
        }
        return withResolved(findFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.hasToken(JsonToken.VALUE_STRING) ? _fromString(jsonParser, deserializationContext, jsonParser.getText()) : jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? this._isFromIntValue ? _fromString(jsonParser, deserializationContext, jsonParser.getText()) : _fromInteger(jsonParser, deserializationContext, jsonParser.getIntValue()) : jsonParser.isExpectedStartObjectToken() ? _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass)) : _deserializeOther(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._enumDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    public EnumDeserializer withResolved(Boolean bool) {
        return Objects.equals(this._caseInsensitive, bool) ? this : new EnumDeserializer(this, bool);
    }

    public EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        super(enumDeserializer);
        this._lookupByName = enumDeserializer._lookupByName;
        this._enumsByIndex = enumDeserializer._enumsByIndex;
        this._enumDefaultValue = enumDeserializer._enumDefaultValue;
        this._caseInsensitive = bool;
        this._isFromIntValue = enumDeserializer._isFromIntValue;
    }
}
