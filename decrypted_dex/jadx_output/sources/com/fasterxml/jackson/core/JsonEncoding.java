package com.fasterxml.jackson.core;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum JsonEncoding {
    UTF8(StubApp.getString2(640), false, 8),
    UTF16_BE(StubApp.getString2(2880), true, 16),
    UTF16_LE(StubApp.getString2(2881), false, 16),
    UTF32_BE(StubApp.getString2(10240), true, 32),
    UTF32_LE(StubApp.getString2(10242), false, 32);

    private final boolean _bigEndian;
    private final int _bits;
    private final String _javaName;

    JsonEncoding(String str, boolean z2, int i3) {
        this._javaName = str;
        this._bigEndian = z2;
        this._bits = i3;
    }

    public int bits() {
        return this._bits;
    }

    public String getJavaName() {
        return this._javaName;
    }

    public boolean isBigEndian() {
        return this._bigEndian;
    }
}
