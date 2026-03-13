package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    protected final JsonDeserializer<?> _adapterDeserializer;

    public static final class Adapter {
    }

    @Deprecated
    public StackTraceElementDeserializer() {
        this(null);
    }

    public static JsonDeserializer<?> construct(DeserializationContext deserializationContext) throws JsonMappingException {
        return deserializationContext == null ? new StackTraceElementDeserializer() : new StackTraceElementDeserializer(deserializationContext.findNonContextualValueDeserializer(deserializationContext.constructType(Adapter.class)));
    }

    public StackTraceElement constructValue(DeserializationContext deserializationContext, Adapter adapter) {
        throw null;
    }

    public StackTraceElementDeserializer(JsonDeserializer<?> jsonDeserializer) {
        super((Class<?>) StackTraceElement.class);
        this._adapterDeserializer = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.START_OBJECT || currentToken == JsonToken.FIELD_NAME) {
            JsonDeserializer<?> jsonDeserializer = this._adapterDeserializer;
            if (jsonDeserializer == null) {
                if (deserializationContext.readValue(jsonParser, Adapter.class) != null) {
                    throw new ClassCastException();
                }
            } else if (jsonDeserializer.deserialize(jsonParser, deserializationContext) != null) {
                throw new ClassCastException();
            }
            return constructValue(deserializationContext, null);
        }
        if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            return (StackTraceElement) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        jsonParser.nextToken();
        StackTraceElement deserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
        return deserialize;
    }
}
