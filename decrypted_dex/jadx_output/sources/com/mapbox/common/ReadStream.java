package com.mapbox.common;

import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface ReadStream {
    boolean isExhausted();

    boolean isReadable();

    Expected<String, Long> read(Buffer buffer);

    long readBytes();
}
