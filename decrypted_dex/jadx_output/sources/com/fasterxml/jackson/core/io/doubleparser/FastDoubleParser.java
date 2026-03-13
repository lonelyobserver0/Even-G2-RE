package com.fasterxml.jackson.core.io.doubleparser;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class FastDoubleParser {
    private static final DoubleBitsFromCharArray CHAR_ARRAY_PARSER = new DoubleBitsFromCharArray();
    private static final DoubleBitsFromCharSequence CHAR_SEQ_PARSER = new DoubleBitsFromCharSequence();

    public static double parseDouble(CharSequence charSequence) throws NumberFormatException {
        return parseDouble(charSequence, 0, charSequence.length());
    }

    public static double parseDouble(CharSequence charSequence, int i3, int i10) throws NumberFormatException {
        long parseFloatingPointLiteral = CHAR_SEQ_PARSER.parseFloatingPointLiteral(charSequence, i3, i10);
        if (parseFloatingPointLiteral != -1) {
            return Double.longBitsToDouble(parseFloatingPointLiteral);
        }
        throw new NumberFormatException(StubApp.getString2(10401));
    }
}
