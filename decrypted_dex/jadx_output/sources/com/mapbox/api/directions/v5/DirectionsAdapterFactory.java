package com.mapbox.api.directions.v5;

import com.google.gson.TypeAdapterFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class DirectionsAdapterFactory implements TypeAdapterFactory {
    public static TypeAdapterFactory a() {
        return new AutoValueGson_DirectionsAdapterFactory();
    }
}
