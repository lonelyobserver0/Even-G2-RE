package com.fasterxml.jackson.core.io.doubleparser;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
abstract class AbstractFloatingPointBitsFromCharSequence extends AbstractFloatValueParser {
    private boolean isDigit(char c10) {
        return '0' <= c10 && c10 <= '9';
    }

    private long parseDecFloatLiteral(CharSequence charSequence, int i3, int i10, int i11, boolean z2, boolean z10) {
        char c10;
        int i12;
        int i13;
        int i14;
        long j;
        long j3;
        int i15;
        int i16;
        long j10;
        boolean z11;
        int i17;
        int tryToParseEightDigits;
        AbstractFloatingPointBitsFromCharSequence abstractFloatingPointBitsFromCharSequence = this;
        CharSequence charSequence2 = charSequence;
        int i18 = i11;
        int i19 = -1;
        int i20 = i3;
        long j11 = 0;
        char c11 = 0;
        boolean z12 = false;
        while (true) {
            c10 = '.';
            if (i20 >= i18) {
                break;
            }
            c11 = charSequence2.charAt(i20);
            if (!abstractFloatingPointBitsFromCharSequence.isDigit(c11)) {
                if (c11 != '.') {
                    break;
                }
                z12 |= i19 >= 0;
                int i21 = i20;
                while (i21 < i18 - 8 && (tryToParseEightDigits = abstractFloatingPointBitsFromCharSequence.tryToParseEightDigits(charSequence2, i21 + 1)) >= 0) {
                    j11 = (j11 * 100000000) + tryToParseEightDigits;
                    i21 += 8;
                }
                int i22 = i20;
                i20 = i21;
                i19 = i22;
            } else {
                j11 = ((j11 * 10) + c11) - 48;
            }
            i20++;
        }
        if (i19 < 0) {
            i12 = i20 - i3;
            i19 = i20;
            i13 = 0;
        } else {
            i12 = (i20 - i3) - 1;
            i13 = (i19 - i20) + 1;
        }
        if (c11 == 'e' || c11 == 'E') {
            i14 = i20 + 1;
            c11 = i14 < i18 ? charSequence2.charAt(i14) : (char) 0;
            j = 48;
            boolean z13 = c11 == '-';
            if (z13 || c11 == '+') {
                i14 = i20 + 2;
                c11 = i14 < i18 ? charSequence2.charAt(i14) : (char) 0;
            }
            z12 |= !abstractFloatingPointBitsFromCharSequence.isDigit(c11);
            j3 = 10;
            i15 = 0;
            while (true) {
                if (i15 < 1024) {
                    i15 = ((i15 * 10) + c11) - 48;
                }
                i14++;
                c11 = i14 < i18 ? charSequence2.charAt(i14) : (char) 0;
                if (!abstractFloatingPointBitsFromCharSequence.isDigit(c11)) {
                    break;
                }
                abstractFloatingPointBitsFromCharSequence = this;
                charSequence2 = charSequence;
                i18 = i11;
            }
            if (z13) {
                i15 = -i15;
            }
            i13 += i15;
        } else {
            i14 = i20;
            j = 48;
            j3 = 10;
            i15 = 0;
        }
        if (i14 < i18 && (c11 == 'd' || c11 == 'D' || c11 == 'f' || c11 == 'F')) {
            i14++;
        }
        int skipWhitespace = abstractFloatingPointBitsFromCharSequence.skipWhitespace(charSequence2, i14, i18);
        if (z12 || skipWhitespace < i18) {
            return -1L;
        }
        if (!z10 && i12 == 0) {
            return -1L;
        }
        if (i12 > 19) {
            int i23 = i3;
            int i24 = 0;
            long j12 = 0;
            while (i23 < i20) {
                char charAt = charSequence2.charAt(i23);
                if (charAt != c10) {
                    if (Long.compareUnsigned(j12, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j12 = ((j12 * j3) + charAt) - j;
                } else {
                    i24++;
                }
                i23++;
                c10 = '.';
            }
            boolean z14 = i23 < i20;
            i16 = i13;
            i17 = (i19 - i23) + i24 + i15;
            j10 = j12;
            z11 = z14;
        } else {
            i16 = i13;
            j10 = j11;
            z11 = false;
            i17 = 0;
        }
        return abstractFloatingPointBitsFromCharSequence.valueOfFloatLiteral(charSequence2, i10, i18, z2, j10, i16, z11, i17);
    }

    private long parseHexFloatLiteral(CharSequence charSequence, int i3, int i10, int i11, boolean z2) {
        int i12;
        int min;
        char c10;
        boolean z10;
        char c11;
        int i13;
        int i14;
        int i15;
        long j;
        boolean z11;
        int i16;
        int i17 = i3;
        long j3 = 0;
        int i18 = -1;
        char c12 = 0;
        boolean z12 = false;
        while (true) {
            if (i17 >= i11) {
                break;
            }
            c12 = charSequence.charAt(i17);
            byte b2 = c12 > 127 ? (byte) -1 : AbstractFloatValueParser.CHAR_TO_HEX_MAP[c12];
            if (b2 < 0) {
                if (b2 != -4) {
                    break;
                }
                z12 |= i18 >= 0;
                i18 = i17;
            } else {
                j3 = (j3 << 4) | b2;
            }
            i17++;
        }
        if (i18 < 0) {
            i12 = i17 - i3;
            i18 = i17;
            min = 0;
        } else {
            i12 = (i17 - i3) - 1;
            min = Math.min((i18 - i17) + 1, 1024) * 4;
        }
        boolean z13 = c12 == 'p' || c12 == 'P';
        if (z13) {
            i14 = i17 + 1;
            if (i14 < i11) {
                c10 = 4;
                c11 = charSequence.charAt(i14);
            } else {
                c10 = 4;
                c11 = 0;
            }
            z10 = true;
            boolean z14 = c11 == '-';
            if (z14 || c11 == '+') {
                i14 = i17 + 2;
                c11 = i14 < i11 ? charSequence.charAt(i14) : (char) 0;
            }
            boolean z15 = (!isDigit(c11)) | z12;
            int i19 = 0;
            do {
                if (i19 < 1024) {
                    i19 = ((i19 * 10) + c11) - 48;
                }
                i14++;
                c11 = i14 < i11 ? charSequence.charAt(i14) : (char) 0;
            } while (isDigit(c11));
            if (z14) {
                i19 = -i19;
            }
            min += i19;
            i13 = i19;
            z12 = z15;
        } else {
            c10 = 4;
            z10 = true;
            c11 = c12;
            i13 = 0;
            i14 = i17;
        }
        if (i14 < i11 && (c11 == 'd' || c11 == 'D' || c11 == 'f' || c11 == 'F')) {
            i14++;
        }
        int skipWhitespace = skipWhitespace(charSequence, i14, i11);
        if (z12 || skipWhitespace < i11 || i12 == 0 || !z13) {
            return -1L;
        }
        if (i12 > 16) {
            int i20 = i3;
            int i21 = 0;
            long j10 = 0;
            while (i20 < i17) {
                char charAt = charSequence.charAt(i20);
                byte b10 = charAt > 127 ? (byte) -1 : AbstractFloatValueParser.CHAR_TO_HEX_MAP[charAt];
                if (b10 < 0) {
                    i21++;
                } else {
                    if (Long.compareUnsigned(j10, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j10 = (j10 << c10) | b10;
                }
                i20++;
            }
            boolean z16 = i20 < i17 ? z10 : false;
            skipWhitespace = i20;
            i15 = min;
            boolean z17 = z16;
            i16 = i21;
            j = j10;
            z11 = z17;
        } else {
            i15 = min;
            j = j3;
            z11 = false;
            i16 = 0;
        }
        return valueOfHexLiteral(charSequence, i10, i11, z2, j, i15, z11, (i18 - skipWhitespace) + i16 + i13);
    }

    private long parseInfinity(CharSequence charSequence, int i3, int i10, boolean z2) {
        int i11 = i3 + 7;
        if (i11 < i10 && charSequence.charAt(i3) == 'I' && charSequence.charAt(i3 + 1) == 'n' && charSequence.charAt(i3 + 2) == 'f' && charSequence.charAt(i3 + 3) == 'i' && charSequence.charAt(i3 + 4) == 'n' && charSequence.charAt(i3 + 5) == 'i' && charSequence.charAt(i3 + 6) == 't' && charSequence.charAt(i11) == 'y' && skipWhitespace(charSequence, i3 + 8, i10) == i10) {
            return z2 ? negativeInfinity() : positiveInfinity();
        }
        return -1L;
    }

    private long parseNaN(CharSequence charSequence, int i3, int i10) {
        int i11 = i3 + 2;
        if (i11 < i10 && charSequence.charAt(i3 + 1) == 'a' && charSequence.charAt(i11) == 'N' && skipWhitespace(charSequence, i3 + 3, i10) == i10) {
            return nan();
        }
        return -1L;
    }

    private int skipWhitespace(CharSequence charSequence, int i3, int i10) {
        while (i3 < i10 && charSequence.charAt(i3) <= ' ') {
            i3++;
        }
        return i3;
    }

    private int tryToParseEightDigits(CharSequence charSequence, int i3) {
        return FastDoubleSwar.tryToParseEightDigitsUtf16(charSequence.charAt(i3) | (charSequence.charAt(i3 + 1) << 16) | (charSequence.charAt(i3 + 2) << 32) | (charSequence.charAt(i3 + 3) << 48), (charSequence.charAt(i3 + 7) << 48) | charSequence.charAt(i3 + 4) | (charSequence.charAt(i3 + 5) << 16) | (charSequence.charAt(i3 + 6) << 32));
    }

    public abstract long nan();

    public abstract long negativeInfinity();

    public long parseFloatingPointLiteral(CharSequence charSequence, int i3, int i10) {
        int skipWhitespace;
        char c10;
        int i11;
        AbstractFloatingPointBitsFromCharSequence abstractFloatingPointBitsFromCharSequence;
        CharSequence charSequence2;
        int i12;
        int i13 = i3 + i10;
        if (i3 < 0 || i13 > charSequence.length() || (skipWhitespace = skipWhitespace(charSequence, i3, i13)) == i13) {
            return -1L;
        }
        char charAt = charSequence.charAt(skipWhitespace);
        boolean z2 = false;
        if (charAt == '-') {
            c10 = 0;
            z2 = true;
        } else {
            c10 = 0;
        }
        if (z2 || charAt == '+') {
            skipWhitespace++;
            charAt = skipWhitespace < i13 ? charSequence.charAt(skipWhitespace) : c10;
            if (charAt == 0) {
                return -1L;
            }
        }
        if (charAt >= 'I') {
            return charAt == 'N' ? parseNaN(charSequence, skipWhitespace, i13) : parseInfinity(charSequence, skipWhitespace, i13, z2);
        }
        boolean z10 = charAt != '0' ? c10 : true;
        if (z10) {
            int i14 = skipWhitespace + 1;
            char charAt2 = i14 < i13 ? charSequence.charAt(i14) : c10;
            if (charAt2 == 'x' || charAt2 == 'X') {
                return parseHexFloatLiteral(charSequence, skipWhitespace + 2, i3, i13, z2);
            }
            i11 = i14;
            charSequence2 = charSequence;
            i12 = i3;
            abstractFloatingPointBitsFromCharSequence = this;
        } else {
            i11 = skipWhitespace;
            abstractFloatingPointBitsFromCharSequence = this;
            charSequence2 = charSequence;
            i12 = i3;
        }
        return abstractFloatingPointBitsFromCharSequence.parseDecFloatLiteral(charSequence2, i11, i12, i13, z2, z10);
    }

    public abstract long positiveInfinity();

    public abstract long valueOfFloatLiteral(CharSequence charSequence, int i3, int i10, boolean z2, long j, int i11, boolean z10, int i12);

    public abstract long valueOfHexLiteral(CharSequence charSequence, int i3, int i10, boolean z2, long j, int i11, boolean z10, int i12);
}
