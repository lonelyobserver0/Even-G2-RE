package com.fasterxml.jackson.core.io.doubleparser;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class DoubleBitsFromCharSequence extends AbstractFloatingPointBitsFromCharSequence {
    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public long nan() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public long negativeInfinity() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public long positiveInfinity() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public long valueOfFloatLiteral(CharSequence charSequence, int i3, int i10, boolean z2, long j, int i11, boolean z10, int i12) {
        double tryDecFloatToDoubleTruncated = FastDoubleMath.tryDecFloatToDoubleTruncated(z2, j, i11, z10, i12);
        if (Double.isNaN(tryDecFloatToDoubleTruncated)) {
            tryDecFloatToDoubleTruncated = Double.parseDouble(charSequence.subSequence(i3, i10).toString());
        }
        return Double.doubleToRawLongBits(tryDecFloatToDoubleTruncated);
    }

    @Override // com.fasterxml.jackson.core.io.doubleparser.AbstractFloatingPointBitsFromCharSequence
    public long valueOfHexLiteral(CharSequence charSequence, int i3, int i10, boolean z2, long j, int i11, boolean z10, int i12) {
        double tryHexFloatToDoubleTruncated = FastDoubleMath.tryHexFloatToDoubleTruncated(z2, j, i11, z10, i12);
        if (Double.isNaN(tryHexFloatToDoubleTruncated)) {
            tryHexFloatToDoubleTruncated = Double.parseDouble(charSequence.subSequence(i3, i10).toString());
        }
        return Double.doubleToRawLongBits(tryHexFloatToDoubleTruncated);
    }
}
