package com.mapbox.common;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class IdGenerator {
    private static final AtomicLong counter = new AtomicLong();

    public static long getNewId() {
        return counter.incrementAndGet();
    }
}
