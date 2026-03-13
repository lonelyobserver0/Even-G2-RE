package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class CoercionConfig implements Serializable {
    private static final int INPUT_SHAPE_COUNT = CoercionInputShape.values().length;
    protected final CoercionAction[] _coercionsByShape = new CoercionAction[INPUT_SHAPE_COUNT];
    protected Boolean _acceptBlankAsEmpty = null;

    public CoercionAction findAction(CoercionInputShape coercionInputShape) {
        return this._coercionsByShape[coercionInputShape.ordinal()];
    }

    public Boolean getAcceptBlankAsEmpty() {
        return this._acceptBlankAsEmpty;
    }
}
