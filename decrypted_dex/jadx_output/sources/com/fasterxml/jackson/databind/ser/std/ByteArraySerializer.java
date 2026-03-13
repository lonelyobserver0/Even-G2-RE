package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ByteArraySerializer extends StdSerializer<byte[]> {
    public ByteArraySerializer() {
        super(byte[].class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(byte[] bArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeBinary(serializerProvider.getConfig().getBase64Variant(), bArr, 0, bArr.length);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(byte[] bArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(bArr, JsonToken.VALUE_EMBEDDED_OBJECT));
        jsonGenerator.writeBinary(serializerProvider.getConfig().getBase64Variant(), bArr, 0, bArr.length);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }
}
