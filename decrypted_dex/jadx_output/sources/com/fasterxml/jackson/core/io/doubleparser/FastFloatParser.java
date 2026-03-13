package com.fasterxml.jackson.core.io.doubleparser;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class FastFloatParser {
    private static final FloatBitsFromCharArray CHAR_ARRAY_PARSER = new FloatBitsFromCharArray();
    private static final FloatBitsFromCharSequence CHAR_SEQ_PARSER = new FloatBitsFromCharSequence();

    public static float parseFloat(CharSequence charSequence) throws NumberFormatException {
        return parseFloat(charSequence, 0, charSequence.length());
    }

    public static float parseFloat(CharSequence charSequence, int i3, int i10) throws NumberFormatException {
        long parseFloatingPointLiteral = CHAR_SEQ_PARSER.parseFloatingPointLiteral(charSequence, i3, i10);
        if (parseFloatingPointLiteral != -1) {
            return Float.intBitsToFloat((int) parseFloatingPointLiteral);
        }
        throw new NumberFormatException(StubApp.getString2(10401));
    }
}
