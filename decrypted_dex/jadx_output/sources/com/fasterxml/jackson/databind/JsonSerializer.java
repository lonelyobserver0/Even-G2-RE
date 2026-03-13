package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.stub.StubApp;
import java.io.IOException;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JsonSerializer<T> {

    public static abstract class None extends JsonSerializer<Object> {
    }

    public abstract Class<T> handledType();

    public boolean isEmpty(SerializerProvider serializerProvider, T t3) {
        return t3 == null;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public abstract void serialize(T t3, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException;

    /* JADX WARN: Multi-variable type inference failed */
    public void serializeWithType(T t3, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Class handledType = handledType();
        if (handledType == null) {
            handledType = t3.getClass();
        }
        serializerProvider.reportBadDefinition((Class<?>) handledType, AbstractC1482f.j(StubApp.getString2(10543), handledType.getName(), StubApp.getString2(10544), getClass().getName(), StubApp.getString2(74)));
    }

    public JsonSerializer<T> unwrappingSerializer(NameTransformer nameTransformer) {
        return this;
    }

    public boolean usesObjectId() {
        return false;
    }
}
