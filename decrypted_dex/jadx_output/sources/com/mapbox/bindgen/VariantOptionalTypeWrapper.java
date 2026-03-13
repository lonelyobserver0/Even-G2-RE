package com.mapbox.bindgen;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class VariantOptionalTypeWrapper {
    private final Object value;

    public VariantOptionalTypeWrapper(Object obj) {
        this.value = obj;
    }

    public static VariantOptionalTypeWrapper valueOf(Object obj) {
        return new VariantOptionalTypeWrapper(obj);
    }

    public Object getValue() {
        return this.value;
    }
}
