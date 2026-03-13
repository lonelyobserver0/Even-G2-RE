package com.google.gson;

import com.google.gson.reflect.TypeToken;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface TypeAdapterFactory {
    <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken);
}
