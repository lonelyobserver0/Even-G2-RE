package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object[]> implements ContextualDeserializer {
    protected final Class<?> _elementClass;
    protected JsonDeserializer<Object> _elementDeserializer;
    protected final TypeDeserializer _elementTypeDeserializer;
    protected final Object[] _emptyValue;
    protected final boolean _untyped;

    public ObjectArrayDeserializer(JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        ArrayType arrayType = (ArrayType) javaType;
        Class<?> rawClass = arrayType.getContentType().getRawClass();
        this._elementClass = rawClass;
        this._untyped = rawClass == Object.class;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = typeDeserializer;
        this._emptyValue = arrayType.getEmptyArray();
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer<?> jsonDeserializer = this._elementDeserializer;
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._containerType.getRawClass(), JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonDeserializer<?> findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer);
        JavaType contentType = this._containerType.getContentType();
        JsonDeserializer<?> findContextualValueDeserializer = findConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, contentType);
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return withResolved(typeDeserializer, findContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, findContextualValueDeserializer), findFormatFeature);
    }

    public Byte[] deserializeFromBase64(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        byte[] binaryValue = jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
        Byte[] bArr = new Byte[binaryValue.length];
        int length = binaryValue.length;
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3] = Byte.valueOf(binaryValue[i3]);
        }
        return bArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._elementDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._emptyValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object[] handleNonArray(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.Boolean r0 = r9._unwrapSingle
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 == r1) goto L34
            if (r0 != 0) goto L11
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            boolean r0 = r11.isEnabled(r0)
            if (r0 == 0) goto L11
            goto L34
        L11:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            boolean r0 = r10.hasToken(r0)
            if (r0 == 0) goto L2b
            java.lang.Class<?> r0 = r9._elementClass
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r0 != r1) goto L24
            java.lang.Byte[] r10 = r9.deserializeFromBase64(r10, r11)
            return r10
        L24:
            java.lang.Object r10 = r9._deserializeFromString(r10, r11)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            return r10
        L2b:
            com.fasterxml.jackson.databind.JavaType r0 = r9._containerType
            java.lang.Object r10 = r11.handleUnexpectedToken(r0, r10)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            return r10
        L34:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            boolean r0 = r10.hasToken(r0)
            if (r0 == 0) goto L4c
            boolean r10 = r9._skipNullValues
            if (r10 == 0) goto L43
            java.lang.Object[] r10 = r9._emptyValue
            return r10
        L43:
            com.fasterxml.jackson.databind.deser.NullValueProvider r10 = r9._nullProvider
            java.lang.Object r10 = r10.getNullValue(r11)
            r0 = r9
            goto Lc6
        L4c:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            boolean r0 = r10.hasToken(r0)
            if (r0 == 0) goto L85
            java.lang.String r0 = r10.getText()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L89
            com.fasterxml.jackson.databind.type.LogicalType r0 = r9.logicalType()
            java.lang.Class r1 = r9.handledType()
            com.fasterxml.jackson.databind.cfg.CoercionInputShape r2 = com.fasterxml.jackson.databind.cfg.CoercionInputShape.EmptyString
            com.fasterxml.jackson.databind.cfg.CoercionAction r6 = r11.findCoercionAction(r0, r1, r2)
            com.fasterxml.jackson.databind.cfg.CoercionAction r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.Fail
            if (r6 == r0) goto L85
            java.lang.Class r7 = r9.handledType()
            r8 = 10707(0x29d3, float:1.5004E-41)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r10 = r3._deserializeFromEmptyString(r4, r5, r6, r7, r8)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            return r10
        L85:
            r0 = r9
            r1 = r10
            r2 = r11
            goto Lb5
        L89:
            r1 = r10
            r2 = r11
            boolean r10 = com.fasterxml.jackson.databind.deser.std.StdDeserializer._isBlank(r0)
            if (r10 == 0) goto Lb4
            com.fasterxml.jackson.databind.type.LogicalType r10 = r9.logicalType()
            java.lang.Class r11 = r9.handledType()
            com.fasterxml.jackson.databind.cfg.CoercionAction r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.Fail
            com.fasterxml.jackson.databind.cfg.CoercionAction r3 = r2.findCoercionFromBlankString(r10, r11, r0)
            if (r3 == r0) goto Lb4
            java.lang.Class r4 = r9.handledType()
            r5 = 10708(0x29d4, float:1.5005E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r0 = r9
            java.lang.Object r10 = r0._deserializeFromEmptyString(r1, r2, r3, r4, r5)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            return r10
        Lb4:
            r0 = r9
        Lb5:
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r10 = r0._elementTypeDeserializer
            if (r10 != 0) goto Lc0
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r10 = r0._elementDeserializer
            java.lang.Object r10 = r10.deserialize(r1, r2)
            goto Lc6
        Lc0:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r11 = r0._elementDeserializer
            java.lang.Object r10 = r11.deserializeWithType(r1, r2, r10)
        Lc6:
            boolean r11 = r0._untyped
            r1 = 1
            if (r11 == 0) goto Lce
            java.lang.Object[] r11 = new java.lang.Object[r1]
            goto Ld6
        Lce:
            java.lang.Class<?> r11 = r0._elementClass
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r11, r1)
            java.lang.Object[] r11 = (java.lang.Object[]) r11
        Ld6:
            r1 = 0
            r11[r1] = r10
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer.handleNonArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Object[]");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._elementDeserializer == null && this._elementTypeDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    public ObjectArrayDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        return (Objects.equals(bool, this._unwrapSingle) && nullValueProvider == this._nullProvider && jsonDeserializer == this._elementDeserializer && typeDeserializer == this._elementTypeDeserializer) ? this : new ObjectArrayDeserializer(this, jsonDeserializer, typeDeserializer, nullValueProvider, bool);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object[] deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return (Object[]) typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object[] completeAndClearBuffer;
        Object deserializeWithType;
        int i3;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        int i10 = 0;
        while (true) {
            try {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (nextToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            deserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (typeDeserializer == null) {
                        deserializeWithType = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        deserializeWithType = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    }
                    resetAndStart[i10] = deserializeWithType;
                    i10 = i3;
                } catch (Exception e10) {
                    e = e10;
                    i10 = i3;
                    throw JsonMappingException.wrapWithPath(e, resetAndStart, leaseObjectBuffer.bufferedSize() + i10);
                }
                if (i10 >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i10 = 0;
                }
                i3 = i10 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
        if (this._untyped) {
            completeAndClearBuffer = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i10);
        } else {
            completeAndClearBuffer = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i10, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
        return completeAndClearBuffer;
    }

    public ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super(objectArrayDeserializer, nullValueProvider, bool);
        this._elementClass = objectArrayDeserializer._elementClass;
        this._untyped = objectArrayDeserializer._untyped;
        this._emptyValue = objectArrayDeserializer._emptyValue;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = typeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        Object[] completeAndClearBuffer;
        Object deserializeWithType;
        int i3;
        if (!jsonParser.isExpectedStartArrayToken()) {
            Object[] handleNonArray = handleNonArray(jsonParser, deserializationContext);
            if (handleNonArray == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[handleNonArray.length + length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(handleNonArray, 0, objArr2, length, handleNonArray.length);
            return objArr2;
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = objArr.length;
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart(objArr, length2);
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        while (true) {
            try {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (nextToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            deserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (typeDeserializer == null) {
                        deserializeWithType = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        deserializeWithType = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    }
                    resetAndStart[length2] = deserializeWithType;
                    length2 = i3;
                } catch (Exception e10) {
                    e = e10;
                    length2 = i3;
                    throw JsonMappingException.wrapWithPath(e, resetAndStart, leaseObjectBuffer.bufferedSize() + length2);
                }
                if (length2 >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    length2 = 0;
                }
                i3 = length2 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
        if (this._untyped) {
            completeAndClearBuffer = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, length2);
        } else {
            completeAndClearBuffer = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, length2, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
        return completeAndClearBuffer;
    }
}
