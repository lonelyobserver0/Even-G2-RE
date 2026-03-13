package com.google.gson;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l9) {
            return l9 == null ? JsonNull.INSTANCE : new JsonPrimitive(l9);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l9) {
            return l9 == null ? JsonNull.INSTANCE : new JsonPrimitive(l9.toString());
        }
    };

    public abstract JsonElement serialize(Long l9);
}
