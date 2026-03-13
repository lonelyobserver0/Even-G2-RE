package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ToStringSerializerBase extends StdSerializer<Object> {
    public ToStringSerializerBase(Class<?> cls) {
        super(cls, false);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        return valueToString(obj).isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(valueToString(obj));
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(obj, JsonToken.VALUE_STRING));
        serialize(obj, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public abstract String valueToString(Object obj);
}
