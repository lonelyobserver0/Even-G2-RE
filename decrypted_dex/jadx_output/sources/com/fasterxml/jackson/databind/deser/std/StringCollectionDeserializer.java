package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements ContextualDeserializer {
    protected final JsonDeserializer<Object> _delegateDeserializer;
    protected final JsonDeserializer<String> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;

    public StringCollectionDeserializer(JavaType javaType, JsonDeserializer<?> jsonDeserializer, ValueInstantiator valueInstantiator) {
        this(javaType, valueInstantiator, null, jsonDeserializer, jsonDeserializer, null);
    }

    private Collection<String> deserializeUsingCustom(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection, JsonDeserializer<String> jsonDeserializer) throws IOException {
        String deserialize;
        while (true) {
            try {
                if (jsonParser.nextTextValue() == null) {
                    JsonToken currentToken = jsonParser.currentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (currentToken != JsonToken.VALUE_NULL) {
                        deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        deserialize = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                } else {
                    deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                }
                collection.add(deserialize);
            } catch (Exception e10) {
                throw JsonMappingException.wrapWithPath(e10, collection, collection.size());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[Catch: Exception -> 0x00b5, TRY_ENTER, TryCatch #0 {Exception -> 0x00b5, blocks: (B:38:0x00ae, B:41:0x00b8), top: B:36:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[Catch: Exception -> 0x00b5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b5, blocks: (B:38:0x00ae, B:41:0x00b8), top: B:36:0x00ac }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Collection<java.lang.String> handleNonArray(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12, java.util.Collection<java.lang.String> r13) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.Boolean r0 = r10._unwrapSingle
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 == r1) goto L29
            if (r0 != 0) goto L11
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            boolean r0 = r12.isEnabled(r0)
            if (r0 == 0) goto L11
            goto L29
        L11:
            com.fasterxml.jackson.core.JsonToken r13 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            boolean r13 = r11.hasToken(r13)
            if (r13 == 0) goto L20
            java.lang.Object r11 = r10._deserializeFromString(r11, r12)
            java.util.Collection r11 = (java.util.Collection) r11
            return r11
        L20:
            com.fasterxml.jackson.databind.JavaType r13 = r10._containerType
            java.lang.Object r11 = r12.handleUnexpectedToken(r13, r11)
            java.util.Collection r11 = (java.util.Collection) r11
            return r11
        L29:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> r0 = r10._valueDeserializer
            com.fasterxml.jackson.core.JsonToken r1 = r11.currentToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r1 != r2) goto L43
            boolean r11 = r10._skipNullValues
            if (r11 == 0) goto L38
            return r13
        L38:
            com.fasterxml.jackson.databind.deser.NullValueProvider r11 = r10._nullProvider
            java.lang.Object r11 = r11.getNullValue(r12)
            java.lang.String r11 = (java.lang.String) r11
            r1 = r10
            goto Lbe
        L43:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            boolean r1 = r11.hasToken(r1)
            if (r1 == 0) goto L7c
            java.lang.String r1 = r11.getText()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L80
            com.fasterxml.jackson.databind.type.LogicalType r1 = r10.logicalType()
            java.lang.Class r2 = r10.handledType()
            com.fasterxml.jackson.databind.cfg.CoercionInputShape r3 = com.fasterxml.jackson.databind.cfg.CoercionInputShape.EmptyString
            com.fasterxml.jackson.databind.cfg.CoercionAction r7 = r12.findCoercionAction(r1, r2, r3)
            com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.Fail
            if (r7 == r1) goto L7c
            java.lang.Class r8 = r10.handledType()
            r9 = 10707(0x29d3, float:1.5004E-41)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object r11 = r4._deserializeFromEmptyString(r5, r6, r7, r8, r9)
            java.util.Collection r11 = (java.util.Collection) r11
            return r11
        L7c:
            r1 = r10
            r2 = r11
            r3 = r12
            goto Lac
        L80:
            r2 = r11
            r3 = r12
            boolean r11 = com.fasterxml.jackson.databind.deser.std.StdDeserializer._isBlank(r1)
            if (r11 == 0) goto Lab
            com.fasterxml.jackson.databind.type.LogicalType r11 = r10.logicalType()
            java.lang.Class r12 = r10.handledType()
            com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.Fail
            com.fasterxml.jackson.databind.cfg.CoercionAction r4 = r3.findCoercionFromBlankString(r11, r12, r1)
            if (r4 == r1) goto Lab
            java.lang.Class r5 = r10.handledType()
            r6 = 10708(0x29d4, float:1.5005E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r1 = r10
            java.lang.Object r11 = r1._deserializeFromEmptyString(r2, r3, r4, r5, r6)
            java.util.Collection r11 = (java.util.Collection) r11
            return r11
        Lab:
            r1 = r10
        Lac:
            if (r0 != 0) goto Lb8
            com.fasterxml.jackson.databind.deser.NullValueProvider r11 = r1._nullProvider     // Catch: java.lang.Exception -> Lb5
            java.lang.String r11 = r10._parseString(r2, r3, r11)     // Catch: java.lang.Exception -> Lb5
            goto Lbe
        Lb5:
            r0 = move-exception
            r11 = r0
            goto Lc2
        Lb8:
            java.lang.Object r11 = r0.deserialize(r2, r3)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> Lb5
        Lbe:
            r13.add(r11)
            return r13
        Lc2:
            int r12 = r13.size()
            com.fasterxml.jackson.databind.JsonMappingException r11 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(r11, r13, r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.handleNonArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Collection):java.util.Collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createContextual(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.BeanProperty r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            r1 = 0
            if (r0 == 0) goto L31
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.getArrayDelegateCreator()
            if (r0 == 0) goto L1a
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r6.getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getArrayDelegateType(r2)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r5.findDeserializer(r6, r0, r7)
            goto L32
        L1a:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.getDelegateCreator()
            if (r0 == 0) goto L31
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r6.getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getDelegateType(r2)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r5.findDeserializer(r6, r0, r7)
            goto L32
        L31:
            r0 = r1
        L32:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> r2 = r5._valueDeserializer
            com.fasterxml.jackson.databind.JavaType r3 = r5._containerType
            com.fasterxml.jackson.databind.JavaType r3 = r3.getContentType()
            if (r2 != 0) goto L47
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r5.findConvertingContentDeserializer(r6, r7, r2)
            if (r2 != 0) goto L4b
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r6.findContextualValueDeserializer(r3, r7)
            goto L4b
        L47:
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r6.handleSecondaryContextualization(r2, r7, r3)
        L4b:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r4 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r3 = r5.findFormatFeature(r6, r7, r3, r4)
            com.fasterxml.jackson.databind.deser.NullValueProvider r6 = r5.findContentNullProvider(r6, r7, r2)
            boolean r7 = r5.isDefaultDeserializer(r2)
            if (r7 == 0) goto L5e
            goto L5f
        L5e:
            r1 = r2
        L5f:
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r6 = r5.withResolved(r0, r1, r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._delegateDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    public StringCollectionDeserializer withResolved(JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        return (Objects.equals(this._unwrapSingle, bool) && this._nullProvider == nullValueProvider && this._valueDeserializer == jsonDeserializer2 && this._delegateDeserializer == jsonDeserializer) ? this : new StringCollectionDeserializer(this._containerType, this._valueInstantiator, jsonDeserializer, jsonDeserializer2, nullValueProvider, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType, nullValueProvider, bool);
        this._valueDeserializer = jsonDeserializer2;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        return deserialize(jsonParser, deserializationContext, (Collection<String>) this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String _parseString;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        JsonDeserializer<String> jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer != null) {
            return deserializeUsingCustom(jsonParser, deserializationContext, collection, jsonDeserializer);
        }
        while (true) {
            try {
                String nextTextValue = jsonParser.nextTextValue();
                if (nextTextValue != null) {
                    collection.add(nextTextValue);
                } else {
                    JsonToken currentToken = jsonParser.currentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (currentToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            _parseString = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        _parseString = _parseString(jsonParser, deserializationContext, this._nullProvider);
                    }
                    collection.add(_parseString);
                }
            } catch (Exception e10) {
                throw JsonMappingException.wrapWithPath(e10, collection, collection.size());
            }
        }
    }
}
