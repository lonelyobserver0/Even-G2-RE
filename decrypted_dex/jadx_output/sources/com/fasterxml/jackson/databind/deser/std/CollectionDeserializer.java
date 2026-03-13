package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CollectionDeserializer extends ContainerDeserializerBase<Collection<Object>> implements ContextualDeserializer {
    protected final JsonDeserializer<Object> _delegateDeserializer;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    public static final class CollectionReferring extends ReadableObjectId.Referring {
        private final CollectionReferringAccumulator _parent;
        public final List<Object> next;

        public CollectionReferring(CollectionReferringAccumulator collectionReferringAccumulator, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            super(unresolvedForwardReference, cls);
            this.next = new ArrayList();
            this._parent = collectionReferringAccumulator;
        }
    }

    public static class CollectionReferringAccumulator {
        private List<CollectionReferring> _accumulator = new ArrayList();
        private final Class<?> _elementType;
        private final Collection<Object> _result;

        public CollectionReferringAccumulator(Class<?> cls, Collection<Object> collection) {
            this._elementType = cls;
            this._result = collection;
        }

        public void add(Object obj) {
            if (this._accumulator.isEmpty()) {
                this._result.add(obj);
            } else {
                this._accumulator.get(r0.size() - 1).next.add(obj);
            }
        }

        public ReadableObjectId.Referring handleUnresolvedReference(UnresolvedForwardReference unresolvedForwardReference) {
            CollectionReferring collectionReferring = new CollectionReferring(this, unresolvedForwardReference, this._elementType);
            this._accumulator.add(collectionReferring);
            return collectionReferring;
        }
    }

    public CollectionDeserializer(JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator) {
        this(javaType, jsonDeserializer, typeDeserializer, valueInstantiator, null, null, null);
    }

    public Collection<Object> _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object deserialize;
        jsonParser.setCurrentValue(collection);
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer.getObjectIdReader() != null) {
            return _deserializeWithObjectId(jsonParser, deserializationContext, collection);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                return collection;
            }
            try {
                if (nextToken != JsonToken.VALUE_NULL) {
                    deserialize = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                } else if (!this._skipNullValues) {
                    deserialize = this._nullProvider.getNullValue(deserializationContext);
                }
                collection.add(deserialize);
            } catch (Exception e10) {
                if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    ClassUtil.throwIfRTE(e10);
                }
                throw JsonMappingException.wrapWithPath(e10, collection, collection.size());
            }
        }
    }

    public Collection<Object> _deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        Class<?> handledType = handledType();
        if (str.isEmpty()) {
            CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType, CoercionInputShape.EmptyString);
            if (findCoercionAction != null && findCoercionAction != CoercionAction.Fail) {
                return (Collection) _deserializeFromEmptyString(jsonParser, deserializationContext, findCoercionAction, handledType, StubApp.getString2(10707));
            }
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
        } else {
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
            if (StdDeserializer._isBlank(str)) {
                LogicalType logicalType = logicalType();
                CoercionAction coercionAction = CoercionAction.Fail;
                CoercionAction findCoercionFromBlankString = deserializationContext2.findCoercionFromBlankString(logicalType, handledType, coercionAction);
                if (findCoercionFromBlankString != coercionAction) {
                    return (Collection) _deserializeFromEmptyString(jsonParser2, deserializationContext2, findCoercionFromBlankString, handledType, StubApp.getString2(10708));
                }
            }
        }
        return handleNonArray(jsonParser2, deserializationContext2, createDefaultInstance(deserializationContext2));
    }

    public Collection<Object> _deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object deserialize;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        jsonParser.setCurrentValue(collection);
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        CollectionReferringAccumulator collectionReferringAccumulator = new CollectionReferringAccumulator(this._containerType.getContentType().getRawClass(), collection);
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                return collection;
            }
            try {
            } catch (UnresolvedForwardReference e10) {
                e10.getRoid().appendReferring(collectionReferringAccumulator.handleUnresolvedReference(e10));
            } catch (Exception e11) {
                if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    ClassUtil.throwIfRTE(e11);
                }
                throw JsonMappingException.wrapWithPath(e11, collection, collection.size());
            }
            if (nextToken != JsonToken.VALUE_NULL) {
                deserialize = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            } else if (!this._skipNullValues) {
                deserialize = this._nullProvider.getNullValue(deserializationContext);
            }
            collectionReferringAccumulator.add(deserialize);
        }
    }

    public Collection<Object> createDefaultInstance(DeserializationContext deserializationContext) throws IOException {
        return (Collection) this._valueInstantiator.createUsingDefault(deserializationContext);
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

    public final Collection<Object> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object deserialize;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        try {
            if (!jsonParser.hasToken(JsonToken.VALUE_NULL)) {
                deserialize = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            } else {
                if (this._skipNullValues) {
                    return collection;
                }
                deserialize = this._nullProvider.getNullValue(deserializationContext);
            }
            collection.add(deserialize);
            return collection;
        } catch (Exception e10) {
            if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                ClassUtil.throwIfRTE(e10);
            }
            throw JsonMappingException.wrapWithPath(e10, Object.class, collection.size());
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._valueTypeDeserializer == null && this._delegateDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    public CollectionDeserializer withResolved(JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        return new CollectionDeserializer(this._containerType, jsonDeserializer2, typeDeserializer, this._valueInstantiator, jsonDeserializer, nullValueProvider, bool);
    }

    public CollectionDeserializer(JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator, JsonDeserializer<Object> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType, nullValueProvider, bool);
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = jsonDeserializer2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.deser.std.CollectionDeserializer createContextual(com.fasterxml.jackson.databind.DeserializationContext r8, com.fasterxml.jackson.databind.BeanProperty r9) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7._valueInstantiator
            if (r0 == 0) goto L71
            boolean r0 = r0.canCreateUsingDelegate()
            if (r0 == 0) goto L3a
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r8.getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getDelegateType(r1)
            if (r0 != 0) goto L34
            com.fasterxml.jackson.databind.JavaType r1 = r7._containerType
            com.fasterxml.jackson.databind.deser.ValueInstantiator r2 = r7._valueInstantiator
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            r3 = 10709(0x29d5, float:1.5007E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r8.reportBadDefinition(r1, r2)
        L34:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.findDeserializer(r8, r0, r9)
        L38:
            r2 = r0
            goto L73
        L3a:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7._valueInstantiator
            boolean r0 = r0.canCreateUsingArrayDelegate()
            if (r0 == 0) goto L71
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r8.getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getArrayDelegateType(r1)
            if (r0 != 0) goto L6c
            com.fasterxml.jackson.databind.JavaType r1 = r7._containerType
            com.fasterxml.jackson.databind.deser.ValueInstantiator r2 = r7._valueInstantiator
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            r3 = 10710(0x29d6, float:1.5008E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r8.reportBadDefinition(r1, r2)
        L6c:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.findDeserializer(r8, r0, r9)
            goto L38
        L71:
            r0 = 0
            goto L38
        L73:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r1 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r6 = r7.findFormatFeature(r8, r9, r0, r1)
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r7._valueDeserializer
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.findConvertingContentDeserializer(r8, r9, r0)
            com.fasterxml.jackson.databind.JavaType r1 = r7._containerType
            com.fasterxml.jackson.databind.JavaType r1 = r1.getContentType()
            if (r0 != 0) goto L8f
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r8.findContextualValueDeserializer(r1, r9)
        L8d:
            r3 = r0
            goto L94
        L8f:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r8.handleSecondaryContextualization(r0, r9, r1)
            goto L8d
        L94:
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r0 = r7._valueTypeDeserializer
            if (r0 == 0) goto L9c
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r0 = r0.forProperty(r9)
        L9c:
            r4 = r0
            com.fasterxml.jackson.databind.deser.NullValueProvider r5 = r7.findContentNullProvider(r8, r9, r3)
            java.lang.Boolean r8 = r7._unwrapSingle
            boolean r8 = java.util.Objects.equals(r6, r8)
            if (r8 == 0) goto Lb9
            com.fasterxml.jackson.databind.deser.NullValueProvider r8 = r7._nullProvider
            if (r5 != r8) goto Lb9
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r8 = r7._delegateDeserializer
            if (r2 != r8) goto Lb9
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r8 = r7._valueDeserializer
            if (r3 != r8) goto Lb9
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r8 = r7._valueTypeDeserializer
            if (r4 == r8) goto Lbb
        Lb9:
            r1 = r7
            goto Lbc
        Lbb:
            return r7
        Lbc:
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r8 = r1.withResolved(r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (jsonParser.isExpectedStartArrayToken()) {
            return _deserializeFromArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
        }
        if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext, jsonParser.getText());
        }
        return handleNonArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        if (jsonParser.isExpectedStartArrayToken()) {
            return _deserializeFromArray(jsonParser, deserializationContext, collection);
        }
        return handleNonArray(jsonParser, deserializationContext, collection);
    }
}
