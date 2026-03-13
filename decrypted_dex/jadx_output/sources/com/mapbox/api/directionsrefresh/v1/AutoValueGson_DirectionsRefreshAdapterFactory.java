package com.mapbox.api.directionsrefresh.v1;

import F6.a;
import F6.b;
import F6.c;
import F6.d;
import F6.e;
import F6.f;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValueGson_DirectionsRefreshAdapterFactory extends DirectionsRefreshAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (b.class.isAssignableFrom(rawType)) {
            return new a(gson, 0);
        }
        if (d.class.isAssignableFrom(rawType)) {
            return new c(gson, 0);
        }
        if (f.class.isAssignableFrom(rawType)) {
            return new e(gson, 0);
        }
        return null;
    }
}
