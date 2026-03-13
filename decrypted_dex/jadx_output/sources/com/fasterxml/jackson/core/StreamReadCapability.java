package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.JacksonFeature;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum StreamReadCapability implements JacksonFeature {
    DUPLICATE_PROPERTIES(false),
    SCALARS_AS_OBJECTS(false),
    UNTYPED_SCALARS(false),
    EXACT_FLOATS(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    StreamReadCapability(boolean z2) {
        this._defaultState = z2;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public int getMask() {
        return this._mask;
    }
}
