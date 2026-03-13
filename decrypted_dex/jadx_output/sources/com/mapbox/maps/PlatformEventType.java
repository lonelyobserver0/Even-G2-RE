package com.mapbox.maps;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum PlatformEventType {
    CLICK,
    LONG_CLICK,
    DRAG_BEGIN,
    DRAG,
    DRAG_END;

    private int getValue() {
        return ordinal();
    }
}
