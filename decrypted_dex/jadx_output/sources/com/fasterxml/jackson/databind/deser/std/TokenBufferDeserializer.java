package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TokenBufferDeserializer extends StdScalarDeserializer<TokenBuffer> {
    public TokenBufferDeserializer() {
        super((Class<?>) TokenBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.bufferForInputBuffering(jsonParser).deserialize(jsonParser, deserializationContext);
    }
}
