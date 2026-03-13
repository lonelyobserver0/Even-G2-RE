package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JsonEOFException extends JsonParseException {
    protected final JsonToken _token;

    public JsonEOFException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        super(jsonParser, str);
        this._token = jsonToken;
    }
}
