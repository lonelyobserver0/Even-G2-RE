package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class StdScalarSerializer<T> extends StdSerializer<T> {
    public StdScalarSerializer(Class<T> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(T t3, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(t3, JsonToken.VALUE_STRING));
        serialize(t3, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public StdScalarSerializer(Class<?> cls, boolean z2) {
        super(cls);
    }
}
