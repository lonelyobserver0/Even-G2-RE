package com.mapbox.api.matching.v5.models;

import G6.g;
import G6.h;
import G6.i;
import G6.j;
import G6.k;
import G6.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.mapbox.api.geocoding.v5.models.f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValueGson_MapMatchingAdapterFactory extends MapMatchingAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (com.mapbox.api.geocoding.v5.models.a.class.isAssignableFrom(rawType)) {
            return new F6.c(gson, 5);
        }
        if (com.mapbox.api.geocoding.v5.models.c.class.isAssignableFrom(rawType)) {
            return new com.mapbox.api.geocoding.v5.models.b(gson);
        }
        if (com.mapbox.api.geocoding.v5.models.d.class.isAssignableFrom(rawType)) {
            return new G6.e(gson, 3);
        }
        if (com.mapbox.api.geocoding.v5.models.e.class.isAssignableFrom(rawType)) {
            return new F6.a(gson, 4);
        }
        if (f.class.isAssignableFrom(rawType)) {
            return new F6.c(gson, 6);
        }
        if (com.mapbox.api.geocoding.v6.a.class.isAssignableFrom(rawType)) {
            return new i(gson, 1);
        }
        if (com.mapbox.api.geocoding.v6.b.class.isAssignableFrom(rawType)) {
            return new F6.e(gson, 1);
        }
        if (G6.a.class.isAssignableFrom(rawType)) {
            return new F6.c(gson, 1);
        }
        if (G6.b.class.isAssignableFrom(rawType)) {
            return new F6.a(gson, 1);
        }
        if (G6.c.class.isAssignableFrom(rawType)) {
            return new F6.c(gson, 2);
        }
        if (G6.d.class.isAssignableFrom(rawType)) {
            return new F6.c(gson, 3);
        }
        if (G6.f.class.isAssignableFrom(rawType)) {
            return new G6.e(gson, 0);
        }
        if (g.class.isAssignableFrom(rawType)) {
            return new G6.e(gson, 1);
        }
        if (h.class.isAssignableFrom(rawType)) {
            return new F6.c(gson, 4);
        }
        if (j.class.isAssignableFrom(rawType)) {
            return new i(gson, 0);
        }
        if (k.class.isAssignableFrom(rawType)) {
            return new F6.a(gson, 2);
        }
        if (l.class.isAssignableFrom(rawType)) {
            return new F6.a(gson, 3);
        }
        if (a.class.isAssignableFrom(rawType)) {
            return new F6.c(gson, 7);
        }
        if (e.class.isAssignableFrom(rawType)) {
            return new F6.e(gson, 2);
        }
        if (c.class.isAssignableFrom(rawType)) {
            return new G6.e(gson, 4);
        }
        if (d.class.isAssignableFrom(rawType)) {
            return new G6.e(gson, 5);
        }
        if (H6.a.class.isAssignableFrom(rawType)) {
            return new G6.e(gson, 2);
        }
        if (com.mapbox.api.optimization.v1.models.a.class.isAssignableFrom(rawType)) {
            return new G6.e(gson, 6);
        }
        if (com.mapbox.api.optimization.v1.models.b.class.isAssignableFrom(rawType)) {
            return new G6.e(gson, 7);
        }
        if (com.mapbox.api.routetiles.v1.versions.models.a.class.isAssignableFrom(rawType)) {
            return new F6.c(gson, 8);
        }
        return null;
    }
}
