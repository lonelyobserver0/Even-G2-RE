package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AtomicIntegerDeserializer extends StdScalarDeserializer<AtomicInteger> {
    public AtomicIntegerDeserializer() {
        super((Class<?>) AtomicInteger.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicInteger();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Integer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AtomicInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.isExpectedNumberIntToken()) {
            return new AtomicInteger(jsonParser.getIntValue());
        }
        Integer _parseInteger = _parseInteger(jsonParser, deserializationContext, AtomicInteger.class);
        if (_parseInteger == null) {
            return null;
        }
        return new AtomicInteger(_parseInteger.intValue());
    }
}
