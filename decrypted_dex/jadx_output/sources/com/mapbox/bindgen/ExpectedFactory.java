package com.mapbox.bindgen;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ExpectedFactory {
    private ExpectedFactory() {
    }

    public static <E, V> Expected<E, V> createError(E e10) {
        return new Expected<>(e10, null);
    }

    public static <E> Expected<E, None> createNone() {
        return new Expected<>(null, None.getInstance());
    }

    public static <E, V> Expected<E, V> createValue(V v2) {
        return new Expected<>(null, v2);
    }
}
