package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum MemoryMonitorState {
    OK(StubApp.getString2(13381)),
    APP_RUNNING_IN_BACKGROUND(StubApp.getString2(13382)),
    MEMORY_THRESHOLD_REACHED(StubApp.getString2(13384)),
    SYSTEM_MEMORY_WARNING_RECEIVED(StubApp.getString2(13386));

    private String str;

    MemoryMonitorState(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
