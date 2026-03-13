package com.fasterxml.jackson.core.io.schubfach;

import com.stub.StubApp;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class DoubleToDecimal {
    private final byte[] bytes = new byte[24];
    private int index;

    private DoubleToDecimal() {
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
        if (i3 >= 100) {
            int i10 = (i3 * 1311) >>> 17;
            appendDigit(i10);
            i3 -= i10 * 100;
        }
        int i11 = (i3 * 103) >>> 10;
        appendDigit(i11);
        appendDigit(i3 - (i11 * 10));
    }

    private void lowDigits(int i3) {
        if (i3 != 0) {
            append8Digits(i3);
        }
        removeTrailingZeroes();
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

    private static long rop(long j, long j3, long j10) {
        long multiplyHigh = MathUtils.multiplyHigh(j3, j10);
        long j11 = j * j10;
        long multiplyHigh2 = MathUtils.multiplyHigh(j, j10);
        long j12 = (j11 >>> 1) + multiplyHigh;
        return (multiplyHigh2 + (j12 >>> 63)) | (((j12 & LongCompanionObject.MAX_VALUE) + LongCompanionObject.MAX_VALUE) >>> 63);
    }

    private int toChars(long j, int i3) {
        int flog10pow2 = MathUtils.flog10pow2(64 - Long.numberOfLeadingZeros(j));
        if (j >= MathUtils.pow10(flog10pow2)) {
            flog10pow2++;
        }
        long pow10 = j * MathUtils.pow10(17 - flog10pow2);
        int i10 = i3 + flog10pow2;
        long multiplyHigh = MathUtils.multiplyHigh(pow10, 193428131138340668L) >>> 20;
        int i11 = (int) (pow10 - (100000000 * multiplyHigh));
        int i12 = (int) ((1441151881 * multiplyHigh) >>> 57);
        int i13 = (int) (multiplyHigh - (100000000 * i12));
        return (i10 <= 0 || i10 > 7) ? (-3 >= i10 || i10 > 0) ? toChars3(i12, i13, i11, i10) : toChars2(i12, i13, i11, i10) : toChars1(i12, i13, i11, i10);
    }

    private int toChars1(int i3, int i10, int i11, int i12) {
        appendDigit(i3);
        int y10 = y(i10);
        int i13 = 1;
        while (i13 < i12) {
            int i14 = y10 * 10;
            appendDigit(i14 >>> 28);
            y10 = i14 & 268435455;
            i13++;
        }
        append(46);
        while (i13 <= 8) {
            int i15 = y10 * 10;
            appendDigit(i15 >>> 28);
            y10 = i15 & 268435455;
            i13++;
        }
        lowDigits(i11);
        return 0;
    }

    private int toChars2(int i3, int i10, int i11, int i12) {
        appendDigit(0);
        append(46);
        while (i12 < 0) {
            appendDigit(0);
            i12++;
        }
        appendDigit(i3);
        append8Digits(i10);
        lowDigits(i11);
        return 0;
    }

    private int toChars3(int i3, int i10, int i11, int i12) {
        appendDigit(i3);
        append(46);
        append8Digits(i10);
        lowDigits(i11);
        exponent(i12 - 1);
        return 0;
    }

    private int toDecimal(double d8) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d8);
        long j = 4503599627370495L & doubleToRawLongBits;
        int i3 = ((int) (doubleToRawLongBits >>> 52)) & 2047;
        if (i3 >= 2047) {
            if (j != 0) {
                return 5;
            }
            return doubleToRawLongBits > 0 ? 3 : 4;
        }
        this.index = -1;
        if (doubleToRawLongBits < 0) {
            append(45);
        }
        if (i3 == 0) {
            return j != 0 ? j < 3 ? toDecimal(-1074, j * 10, -1) : toDecimal(-1074, j, 0) : doubleToRawLongBits == 0 ? 1 : 2;
        }
        int i10 = 1075 - i3;
        long j3 = j | 4503599627370496L;
        if ((i10 < 53) & (i10 > 0)) {
            long j10 = j3 >> i10;
            if ((j10 << i10) == j3) {
                return toChars(j10, 0);
            }
        }
        return toDecimal(-i10, j3, 0);
    }

    private String toDecimalString(double d8) {
        int decimal = toDecimal(d8);
        return decimal != 0 ? decimal != 1 ? decimal != 2 ? decimal != 3 ? decimal != 4 ? StubApp.getString2(10402) : StubApp.getString2(10403) : StubApp.getString2(10404) : StubApp.getString2(10405) : StubApp.getString2(995) : charsToString();
    }

    public static String toString(double d8) {
        return new DoubleToDecimal().toDecimalString(d8);
    }

    private int y(int i3) {
        return ((int) (MathUtils.multiplyHigh((i3 + 1) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    private int toDecimal(int i3, long j, int i10) {
        long j3;
        int flog10threeQuartersPow2;
        char c10;
        long j10;
        int i11 = ((int) j) & 1;
        long j11 = j << 2;
        long j12 = j11 + 2;
        if ((j != 4503599627370496L) | (i3 == -1074)) {
            j3 = j11 - 2;
            flog10threeQuartersPow2 = MathUtils.flog10pow2(i3);
        } else {
            j3 = j11 - 1;
            flog10threeQuartersPow2 = MathUtils.flog10threeQuartersPow2(i3);
        }
        int flog2pow10 = i3 + MathUtils.flog2pow10(-flog10threeQuartersPow2) + 2;
        long g12 = MathUtils.g1(flog10threeQuartersPow2);
        long g02 = MathUtils.g0(flog10threeQuartersPow2);
        long rop = rop(g12, g02, j11 << flog2pow10);
        long rop2 = rop(g12, g02, j3 << flog2pow10);
        long rop3 = rop(g12, g02, j12 << flog2pow10);
        long j13 = rop >> 2;
        if (j13 >= 100) {
            j10 = 1;
            long multiplyHigh = MathUtils.multiplyHigh(j13, 1844674407370955168L) * 10;
            long j14 = multiplyHigh + 10;
            c10 = 1;
            int i12 = flog10threeQuartersPow2;
            long j15 = i11;
            boolean z2 = rop2 + j15 <= (multiplyHigh << 2);
            if (z2 != ((j14 << 2) + j15 <= rop3)) {
                if (!z2) {
                    multiplyHigh = j14;
                }
                return toChars(multiplyHigh, i12);
            }
            flog10threeQuartersPow2 = i12;
        } else {
            c10 = 1;
            j10 = 1;
        }
        long j16 = j13 + j10;
        long j17 = i11;
        char c11 = rop2 + j17 <= (j13 << 2) ? c10 : (char) 0;
        if (c11 != ((j16 << 2) + j17 <= rop3 ? c10 : (char) 0)) {
            if (c11 == 0) {
                j13 = j16;
            }
            return toChars(j13, flog10threeQuartersPow2 + i10);
        }
        long j18 = rop - ((j13 + j16) << c10);
        if (j18 >= 0 && (j18 != 0 || (j13 & j10) != 0)) {
            j13 = j16;
        }
        return toChars(j13, flog10threeQuartersPow2 + i10);
    }
}
