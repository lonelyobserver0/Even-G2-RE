package com.mapbox.bindgen;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CleanerService {
    private static final Cleaner cleaner = Cleaner.create();

    public static void register(Object obj, Runnable runnable) {
        cleaner.register(obj, runnable);
    }
}
