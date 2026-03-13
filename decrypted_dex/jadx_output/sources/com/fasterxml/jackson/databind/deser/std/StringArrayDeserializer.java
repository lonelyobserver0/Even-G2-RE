package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements ContextualDeserializer {
    private static final String[] NO_STRINGS = new String[0];
    public static final StringArrayDeserializer instance = new StringArrayDeserializer();
    protected JsonDeserializer<String> _elementDeserializer;
    protected final NullValueProvider _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    public StringArrayDeserializer() {
        this(null, null, null);
    }

    private final String[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        StringArrayDeserializer stringArrayDeserializer;
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        String _parseString;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return jsonParser.hasToken(JsonToken.VALUE_STRING) ? _deserializeFromString(jsonParser, deserializationContext) : (String[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            _parseString = (String) this._nullProvider.getNullValue(deserializationContext);
        } else {
            if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
                String text = jsonParser.getText();
                if (text.isEmpty()) {
                    CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyString);
                    if (findCoercionAction != CoercionAction.Fail) {
                        return (String[]) _deserializeFromEmptyString(jsonParser, deserializationContext, findCoercionAction, handledType(), StubApp.getString2(10707));
                    }
                } else {
                    jsonParser2 = jsonParser;
                    deserializationContext2 = deserializationContext;
                    if (StdDeserializer._isBlank(text)) {
                        LogicalType logicalType = logicalType();
                        Class<?> handledType = handledType();
                        CoercionAction coercionAction = CoercionAction.Fail;
                        CoercionAction findCoercionFromBlankString = deserializationContext2.findCoercionFromBlankString(logicalType, handledType, coercionAction);
                        if (findCoercionFromBlankString != coercionAction) {
                            return (String[]) _deserializeFromEmptyString(jsonParser2, deserializationContext2, findCoercionFromBlankString, handledType(), StubApp.getString2(10708));
                        }
                    }
                    stringArrayDeserializer = this;
                    _parseString = _parseString(jsonParser2, deserializationContext2, stringArrayDeserializer._nullProvider);
                }
            }
            stringArrayDeserializer = this;
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
            _parseString = _parseString(jsonParser2, deserializationContext2, stringArrayDeserializer._nullProvider);
        }
        return new String[]{_parseString};
    }

    public final String[] _deserializeCustom(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        int length;
        Object[] resetAndStart;
        String deserialize;
        int i3;
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        if (strArr == null) {
            resetAndStart = leaseObjectBuffer.resetAndStart();
            length = 0;
        } else {
            length = strArr.length;
            resetAndStart = leaseObjectBuffer.resetAndStart(strArr, length);
        }
        JsonDeserializer<String> jsonDeserializer = this._elementDeserializer;
        while (true) {
            try {
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (jsonParser.nextTextValue() == null) {
                    JsonToken currentToken = jsonParser.currentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr2 = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, length, String.class);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr2;
                    }
                    if (currentToken != JsonToken.VALUE_NULL) {
                        deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        deserialize = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                } else {
                    deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                }
                resetAndStart[length] = deserialize;
                length = i3;
            } catch (Exception e11) {
                e = e11;
                length = i3;
                throw JsonMappingException.wrapWithPath(e, String.class, length);
            }
            if (length >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                length = 0;
            }
            i3 = length + 1;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer<?> findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._elementDeserializer);
        JavaType constructType = deserializationContext.constructType(String.class);
        JsonDeserializer<?> findContextualValueDeserializer = findConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(constructType, beanProperty) : deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, constructType);
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, String[].class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        NullValueProvider findContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, findContextualValueDeserializer);
        if (findContextualValueDeserializer != null && isDefaultDeserializer(findContextualValueDeserializer)) {
            findContextualValueDeserializer = null;
        }
        return (this._elementDeserializer == findContextualValueDeserializer && Objects.equals(this._unwrapSingle, findFormatFeature) && this._nullProvider == findContentNullProvider) ? this : new StringArrayDeserializer(findContextualValueDeserializer, findContentNullProvider, findFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return NO_STRINGS;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringArrayDeserializer(JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super((Class<?>) String[].class);
        this._elementDeserializer = jsonDeserializer;
        this._nullProvider = nullValueProvider;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String nextTextValue;
        int i3;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, null);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i10 = 0;
        while (true) {
            try {
                nextTextValue = jsonParser.nextTextValue();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (nextTextValue == null) {
                    JsonToken currentToken = jsonParser.currentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i10, String.class);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr;
                    }
                    if (currentToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            nextTextValue = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        nextTextValue = _parseString(jsonParser, deserializationContext, this._nullProvider);
                    }
                }
                resetAndStart[i10] = nextTextValue;
                i10 = i3;
            } catch (Exception e11) {
                e = e11;
                i10 = i3;
                throw JsonMappingException.wrapWithPath(e, resetAndStart, leaseObjectBuffer.bufferedSize() + i10);
            }
            if (i10 >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                i10 = 0;
            }
            i3 = i10 + 1;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        String nextTextValue;
        int i3;
        if (!jsonParser.isExpectedStartArrayToken()) {
            String[] handleNonArray = handleNonArray(jsonParser, deserializationContext);
            if (handleNonArray == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[handleNonArray.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(handleNonArray, 0, strArr2, length, handleNonArray.length);
            return strArr2;
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, strArr);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = strArr.length;
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart(strArr, length2);
        while (true) {
            try {
                nextTextValue = jsonParser.nextTextValue();
                if (nextTextValue == null) {
                    JsonToken currentToken = jsonParser.currentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr3 = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, length2, String.class);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr3;
                    }
                    if (currentToken == JsonToken.VALUE_NULL) {
                        if (this._skipNullValues) {
                            return NO_STRINGS;
                        }
                        nextTextValue = (String) this._nullProvider.getNullValue(deserializationContext);
                    } else {
                        nextTextValue = _parseString(jsonParser, deserializationContext, this._nullProvider);
                    }
                }
                if (length2 >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    length2 = 0;
                }
                i3 = length2 + 1;
            } catch (Exception e10) {
                e = e10;
            }
            try {
                resetAndStart[length2] = nextTextValue;
                length2 = i3;
            } catch (Exception e11) {
                e = e11;
                length2 = i3;
                throw JsonMappingException.wrapWithPath(e, resetAndStart, leaseObjectBuffer.bufferedSize() + length2);
            }
        }
    }
}
