package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AtomicLongDeserializer extends StdScalarDeserializer<AtomicLong> {
    public AtomicLongDeserializer() {
        super((Class<?>) AtomicLong.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicLong();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Integer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AtomicLong deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.isExpectedNumberIntToken()) {
            return new AtomicLong(jsonParser.getLongValue());
        }
        if (_parseLong(jsonParser, deserializationContext, AtomicLong.class) == null) {
            return null;
        }
        return new AtomicLong(r3.intValue());
    }
}
