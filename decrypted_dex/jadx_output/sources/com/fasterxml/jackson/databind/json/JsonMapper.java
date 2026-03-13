package com.fasterxml.jackson.databind.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JsonMapper extends ObjectMapper {
    public JsonMapper() {
        this(new JsonFactory());
    }

    public JsonMapper(JsonFactory jsonFactory) {
        super(jsonFactory);
    }
}
