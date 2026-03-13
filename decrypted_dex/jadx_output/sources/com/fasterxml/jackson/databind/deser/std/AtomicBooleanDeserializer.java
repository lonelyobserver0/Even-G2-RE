package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AtomicBooleanDeserializer extends StdScalarDeserializer<AtomicBoolean> {
    public AtomicBooleanDeserializer() {
        super((Class<?>) AtomicBoolean.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicBoolean(false);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Boolean;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AtomicBoolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return new AtomicBoolean(true);
        }
        if (currentToken == JsonToken.VALUE_FALSE) {
            return new AtomicBoolean(false);
        }
        Boolean _parseBoolean = _parseBoolean(jsonParser, deserializationContext, AtomicBoolean.class);
        if (_parseBoolean == null) {
            return null;
        }
        return new AtomicBoolean(_parseBoolean.booleanValue());
    }
}
