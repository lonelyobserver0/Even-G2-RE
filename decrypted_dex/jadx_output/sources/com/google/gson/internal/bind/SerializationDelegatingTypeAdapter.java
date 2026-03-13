package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class SerializationDelegatingTypeAdapter<T> extends TypeAdapter<T> {
    public abstract TypeAdapter<T> getSerializationDelegate();
}
