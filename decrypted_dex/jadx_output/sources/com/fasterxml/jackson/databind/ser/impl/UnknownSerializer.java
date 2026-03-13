package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.util.NativeImageUtil;
import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class UnknownSerializer extends ToEmptyObjectSerializer {
    public UnknownSerializer() {
        super((Class<?>) Object.class);
    }

    public void failForEmpty(SerializerProvider serializerProvider, Object obj) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        boolean needsReflectionConfiguration = NativeImageUtil.needsReflectionConfiguration(cls);
        String string2 = StubApp.getString2(11010);
        if (needsReflectionConfiguration) {
            serializerProvider.reportBadDefinition(handledType(), string2 + cls.getName() + StubApp.getString2(11011));
            return;
        }
        serializerProvider.reportBadDefinition(handledType(), string2 + cls.getName() + StubApp.getString2(11012));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (serializerProvider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(serializerProvider, obj);
        }
        super.serialize(obj, jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        if (serializerProvider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(serializerProvider, obj);
        }
        super.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
    }

    public UnknownSerializer(Class<?> cls) {
        super(cls);
    }
}
