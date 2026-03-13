package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Collection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JsonDeserializer<T> implements NullValueProvider {

    public static abstract class None extends JsonDeserializer<Object> {
    }

    public abstract T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException;

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t3) throws IOException, JacksonException {
        deserializationContext.handleBadMerge(this);
        return deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException, JacksonException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        StringBuilder l9 = b.l(StubApp.getString2(10536), str, StubApp.getString2(10537));
        l9.append(getClass().getName());
        l9.append(StubApp.getString2(10538));
        throw new IllegalArgumentException(l9.toString());
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public Collection<Object> getKnownPropertyNames() {
        return null;
    }

    @Deprecated
    public T getNullValue() {
        return null;
    }

    public ObjectIdReader getObjectIdReader() {
        return null;
    }

    public Class<?> handledType() {
        return null;
    }

    public boolean isCachable() {
        return false;
    }

    public LogicalType logicalType() {
        return null;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public JsonDeserializer<T> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this;
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer, T t3) throws IOException, JacksonException {
        deserializationContext.handleBadMerge(this);
        return deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue();
    }
}
