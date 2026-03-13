package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.JacksonFeature;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class JacksonFeatureSet<F extends JacksonFeature> {
    protected int _enabled;

    public JacksonFeatureSet(int i3) {
        this._enabled = i3;
    }

    public static <F extends JacksonFeature> JacksonFeatureSet<F> fromDefaults(F[] fArr) {
        if (fArr.length > 31) {
            throw new IllegalArgumentException(String.format(StubApp.getString2(10495), fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
        }
        int i3 = 0;
        for (F f10 : fArr) {
            if (f10.enabledByDefault()) {
                i3 |= f10.getMask();
            }
        }
        return new JacksonFeatureSet<>(i3);
    }

    public boolean isEnabled(F f10) {
        return (f10.getMask() & this._enabled) != 0;
    }

    public JacksonFeatureSet<F> with(F f10) {
        int mask = f10.getMask() | this._enabled;
        return mask == this._enabled ? this : new JacksonFeatureSet<>(mask);
    }
}
