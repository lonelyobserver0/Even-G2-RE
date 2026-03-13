package com.fasterxml.jackson.core.io.schubfach;

import com.stub.StubApp;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FloatToDecimal {
    private final byte[] bytes = new byte[15];
    private int index;

    private FloatToDecimal() {
    }

    private void append(int i3) {
        byte[] bArr = this.bytes;
        int i10 = this.index + 1;
        this.index = i10;
        bArr[i10] = (byte) i3;
    }

    private void append8Digits(int i3) {
        int y10 = y(i3);
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = y10 * 10;
            appendDigit(i11 >>> 28);
            y10 = i11 & 268435455;
        }
    }

    private void appendDigit(int i3) {
        byte[] bArr = this.bytes;
        int i10 = this.index + 1;
        this.index = i10;
        bArr[i10] = (byte) (i3 + 48);
    }

    private String charsToString() {
        return new String(this.bytes, 0, 0, this.index + 1);
    }

    private void exponent(int i3) {
        append(69);
        if (i3 < 0) {
            append(45);
            i3 = -i3;
        }
        if (i3 < 10) {
            appendDigit(i3);
            return;
        }
        int i10 = (i3 * 103) >>> 10;
        appendDigit(i10);
        appendDigit(i3 - (i10 * 10));
    }

    private void removeTrailingZeroes() {
        int i3;
        byte b2;
        while (true) {
            byte[] bArr = this.bytes;
            i3 = this.index;
            b2 = bArr[i3];
            if (b2 != 48) {
                break;
            } else {
                this.index = i3 - 1;
            }
        }
        if (b2 == 46) {
            this.index = i3 + 1;
        }
    }

    private static int rop(long j, long j3) {
        long multiplyHigh = MathUtils.multiplyHigh(j, j3);
        return (int) ((((multiplyHigh & BodyPartID.bodyIdMax) + BodyPartID.bodyIdMax) >>> 32) | (multiplyHigh >>> 31));
    }

    private int toChars(int i3, int i10) {
        int flog10pow2 = MathUtils.flog10pow2(32 - Integer.numberOfLeadingZeros(i3));
        if (i3 >= MathUtils.pow10(flog10pow2)) {
            flog10pow2++;
        }
        int pow10 = i3 * ((int) MathUtils.pow10(9 - flog10pow2));
        int i11 = i10 + flog10pow2;
        int i12 = (int) ((pow10 * 1441151881) >>> 57);
        int i13 = pow10 - (100000000 * i12);
        return (i11 <= 0 || i11 > 7) ? (-3 >= i11 || i11 > 0) ? toChars3(i12, i13, i11) : toChars2(i12, i13, i11) : toChars1(i12, i13, i11);
    }

    private int toChars1(int i3, int i10, int i11) {
        appendDigit(i3);
        int y10 = y(i10);
        int i12 = 1;
        while (i12 < i11) {
            int i13 = y10 * 10;
            appendDigit(i13 >>> 28);
            y10 = i13 & 268435455;
            i12++;
        }
        append(46);
        while (i12 <= 8) {
            int i14 = y10 * 10;
            appendDigit(i14 >>> 28);
            y10 = i14 & 268435455;
            i12++;
        }
        removeTrailingZeroes();
        return 0;
    }

    private int toChars2(int i3, int i10, int i11) {
        appendDigit(0);
        append(46);
        while (i11 < 0) {
            appendDigit(0);
            i11++;
        }
        appendDigit(i3);
        append8Digits(i10);
        removeTrailingZeroes();
        return 0;
    }

    private int toChars3(int i3, int i10, int i11) {
        appendDigit(i3);
        append(46);
        append8Digits(i10);
        removeTrailingZeroes();
        exponent(i11 - 1);
        return 0;
    }

    private int toDecimal(float f10) {
        int floatToRawIntBits = Float.floatToRawIntBits(f10);
        int i3 = 8388607 & floatToRawIntBits;
        int i10 = (floatToRawIntBits >>> 23) & 255;
        if (i10 >= 255) {
            if (i3 != 0) {
                return 5;
            }
            return floatToRawIntBits > 0 ? 3 : 4;
        }
        this.index = -1;
        if (floatToRawIntBits < 0) {
            append(45);
        }
        if (i10 == 0) {
            return i3 != 0 ? i3 < 8 ? toDecimal(-149, i3 * 10, -1) : toDecimal(-149, i3, 0) : floatToRawIntBits == 0 ? 1 : 2;
        }
        int i11 = 150 - i10;
        int i12 = i3 | 8388608;
        if ((i11 > 0) & (i11 < 24)) {
            int i13 = i12 >> i11;
            if ((i13 << i11) == i12) {
                return toChars(i13, 0);
            }
        }
        return toDecimal(-i11, i12, 0);
    }

    private String toDecimalString(float f10) {
        int decimal = toDecimal(f10);
        return decimal != 0 ? decimal != 1 ? decimal != 2 ? decimal != 3 ? decimal != 4 ? StubApp.getString2(10402) : StubApp.getString2(10403) : StubApp.getString2(10404) : StubApp.getString2(10405) : StubApp.getString2(995) : charsToString();
    }

    public static String toString(float f10) {
        return new FloatToDecimal().toDecimalString(f10);
    }

    private int y(int i3) {
        return ((int) (MathUtils.multiplyHigh((i3 + 1) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    private int toDecimal(int i3, int i10, int i11) {
        long j;
        int flog10threeQuartersPow2;
        int i12 = i10 & 1;
        long j3 = i10 << 2;
        long j10 = j3 + 2;
        if ((i10 != 8388608) | (i3 == -149)) {
            j = j3 - 2;
            flog10threeQuartersPow2 = MathUtils.flog10pow2(i3);
        } else {
            j = j3 - 1;
            flog10threeQuartersPow2 = MathUtils.flog10threeQuartersPow2(i3);
        }
        int flog2pow10 = i3 + MathUtils.flog2pow10(-flog10threeQuartersPow2) + 33;
        long g12 = 1 + MathUtils.g1(flog10threeQuartersPow2);
        int rop = rop(g12, j3 << flog2pow10);
        int rop2 = rop(g12, j << flog2pow10);
        int rop3 = rop(g12, j10 << flog2pow10);
        int i13 = rop >> 2;
        if (i13 >= 100) {
            int i14 = ((int) ((i13 * 1717986919) >>> 34)) * 10;
            int i15 = i14 + 10;
            boolean z2 = rop2 + i12 <= (i14 << 2);
            if (z2 != ((i15 << 2) + i12 <= rop3)) {
                if (!z2) {
                    i14 = i15;
                }
                return toChars(i14, flog10threeQuartersPow2);
            }
        }
        int i16 = i13 + 1;
        boolean z10 = rop2 + i12 <= (i13 << 2);
        if (z10 != ((i16 << 2) + i12 <= rop3)) {
            if (!z10) {
                i13 = i16;
            }
            return toChars(i13, flog10threeQuartersPow2 + i11);
        }
        int i17 = rop - ((i13 + i16) << 1);
        if (i17 >= 0 && (i17 != 0 || (i13 & 1) != 0)) {
            i13 = i16;
        }
        return toChars(i13, flog10threeQuartersPow2 + i11);
    }
}
