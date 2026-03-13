package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StringSerializer extends StdScalarSerializer<Object> {
    public StringSerializer() {
        super(String.class, false);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        return ((String) obj).isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString((String) obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.writeString((String) obj);
    }
}
