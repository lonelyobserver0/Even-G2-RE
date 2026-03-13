package com.google.gson;

import java.lang.reflect.Type;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface JsonDeserializationContext {
    <T> T deserialize(JsonElement jsonElement, Type type) throws JsonParseException;
}
