package com.fasterxml.jackson.databind.cfg;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum JsonNodeFeature implements DatatypeFeature {
    READ_NULL_PROPERTIES(true),
    WRITE_NULL_PROPERTIES(true);

    private final boolean _enabledByDefault;
    private final int _mask = 1 << ordinal();

    JsonNodeFeature(boolean z2) {
        this._enabledByDefault = z2;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public boolean enabledByDefault() {
        return this._enabledByDefault;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public boolean enabledIn(int i3) {
        return (i3 & this._mask) != 0;
    }

    @Override // com.fasterxml.jackson.databind.cfg.DatatypeFeature
    public int featureIndex() {
        return 1;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public int getMask() {
        return this._mask;
    }
}
