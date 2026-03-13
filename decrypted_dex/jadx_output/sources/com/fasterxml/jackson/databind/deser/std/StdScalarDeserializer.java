package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class StdScalarDeserializer<T> extends StdDeserializer<T> {
    public StdScalarDeserializer(Class<?> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t3) throws IOException {
        deserializationContext.handleBadMerge(this);
        return deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.OtherScalar;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public StdScalarDeserializer(StdScalarDeserializer<?> stdScalarDeserializer) {
        super(stdScalarDeserializer);
    }
}
