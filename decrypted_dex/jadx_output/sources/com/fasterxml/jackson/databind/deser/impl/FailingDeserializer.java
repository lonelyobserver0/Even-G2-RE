package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FailingDeserializer extends StdDeserializer<Object> {
    protected final String _message;

    public FailingDeserializer(String str) {
        this(Object.class, str);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportInputMismatch(this, this._message, new Object[0]);
        return null;
    }

    public FailingDeserializer(Class<?> cls, String str) {
        super(cls);
        this._message = str;
    }
}
