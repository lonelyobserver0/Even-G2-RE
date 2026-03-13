package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.util.RequestPayload;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JsonParseException extends StreamReadException {
    public JsonParseException(JsonParser jsonParser, String str) {
        super(jsonParser, str);
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    public JsonParseException withRequestPayload(RequestPayload requestPayload) {
        return this;
    }

    public JsonParseException(JsonParser jsonParser, String str, Throwable th) {
        super(jsonParser, str, th);
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException, com.fasterxml.jackson.core.JacksonException
    public JsonParser getProcessor() {
        return super.getProcessor();
    }

    public JsonParseException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super(jsonParser, str, jsonLocation);
    }
}
