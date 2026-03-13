package com.mapbox.common.experimental.wss_backend;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum WsOpCode {
    TEXT,
    BINARY,
    CONTINUATION,
    CLOSE,
    PING,
    PONG;

    private int getValue() {
        return ordinal();
    }
}
