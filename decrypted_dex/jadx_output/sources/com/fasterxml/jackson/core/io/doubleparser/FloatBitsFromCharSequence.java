package com.fasterxml.jackson.core.io.doubleparser;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class FloatBitsFromCharSequence extends AbstractFloatingPointBitsFromCharSequence {
    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public long nan() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public long negativeInfinity() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public long positiveInfinity() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public long valueOfFloatLiteral(CharSequence charSequence, int i3, int i10, boolean z2, long j, int i11, boolean z10, int i12) {
        float decFloatLiteralToFloat = FastFloatMath.decFloatLiteralToFloat(z2, j, i11, z10, i12);
        if (Float.isNaN(decFloatLiteralToFloat)) {
            decFloatLiteralToFloat = Float.parseFloat(charSequence.subSequence(i3, i10).toString());
        }
        return Float.floatToRawIntBits(decFloatLiteralToFloat);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public long valueOfHexLiteral(CharSequence charSequence, int i3, int i10, boolean z2, long j, int i11, boolean z10, int i12) {
        float hexFloatLiteralToFloat = FastFloatMath.hexFloatLiteralToFloat(z2, j, i11, z10, i12);
        if (Float.isNaN(hexFloatLiteralToFloat)) {
            hexFloatLiteralToFloat = Float.parseFloat(charSequence.subSequence(i3, i10).toString());
        }
        return Float.floatToRawIntBits(hexFloatLiteralToFloat);
    }
}
