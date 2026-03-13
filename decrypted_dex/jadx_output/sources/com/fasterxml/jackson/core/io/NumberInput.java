package com.fasterxml.jackson.core.io;

import E1.a;
import com.fasterxml.jackson.core.io.doubleparser.FastDoubleParser;
import com.fasterxml.jackson.core.io.doubleparser.FastFloatParser;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class NumberInput {
    static final String MIN_LONG_STR_NO_SIGN = String.valueOf(Long.MIN_VALUE).substring(1);
    static final String MAX_LONG_STR = String.valueOf(LongCompanionObject.MAX_VALUE);

    public static boolean inLongRange(char[] cArr, int i3, int i10, boolean z2) {
        String str = z2 ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str.length();
        if (i10 < length) {
            return true;
        }
        if (i10 > length) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            int charAt = cArr[i3 + i11] - str.charAt(i11);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static int parseAsInt(String str, int i3) {
        String trim;
        int length;
        if (str != null && (length = (trim = str.trim()).length()) != 0) {
            int i10 = 0;
            char charAt = trim.charAt(0);
            if (charAt == '+') {
                trim = trim.substring(1);
                length = trim.length();
            } else if (charAt == '-') {
                i10 = 1;
            }
            while (i10 < length) {
                try {
                    char charAt2 = trim.charAt(i10);
                    if (charAt2 > '9' || charAt2 < '0') {
                        return (int) parseDouble(trim, true);
                    }
                    i10++;
                } catch (NumberFormatException unused) {
                }
            }
            return Integer.parseInt(trim);
        }
        return i3;
    }

    public static long parseAsLong(String str, long j) {
        String trim;
        int length;
        if (str != null && (length = (trim = str.trim()).length()) != 0) {
            int i3 = 0;
            char charAt = trim.charAt(0);
            if (charAt == '+') {
                trim = trim.substring(1);
                length = trim.length();
            } else if (charAt == '-') {
                i3 = 1;
            }
            while (i3 < length) {
                try {
                    char charAt2 = trim.charAt(i3);
                    if (charAt2 > '9' || charAt2 < '0') {
                        return (long) parseDouble(trim, true);
                    }
                    i3++;
                } catch (NumberFormatException unused) {
                }
            }
            return Long.parseLong(trim);
        }
        return j;
    }

    public static BigDecimal parseBigDecimal(String str) throws NumberFormatException {
        return BigDecimalParser.parse(str);
    }

    public static BigInteger parseBigInteger(String str) throws NumberFormatException {
        return str.length() > 1250 ? BigDecimalParser.parse(str).toBigInteger() : new BigInteger(str);
    }

    public static double parseDouble(String str) throws NumberFormatException {
        return parseDouble(str, false);
    }

    public static float parseFloat(String str, boolean z2) throws NumberFormatException {
        return z2 ? FastFloatParser.parseFloat(str) : Float.parseFloat(str);
    }

    public static int parseInt(char[] cArr, int i3, int i10) {
        if (i10 > 0 && cArr[i3] == '+') {
            i3++;
            i10--;
        }
        int i11 = cArr[(i3 + i10) - 1] - '0';
        switch (i10) {
            case 9:
                i11 = a.f(cArr[i3], 48, 100000000, i11);
                i3++;
            case 8:
                i11 = a.f(cArr[i3], 48, 10000000, i11);
                i3++;
            case 7:
                i11 = a.f(cArr[i3], 48, DurationKt.NANOS_IN_MILLIS, i11);
                i3++;
            case 6:
                i11 = a.f(cArr[i3], 48, 100000, i11);
                i3++;
            case 5:
                i11 = a.f(cArr[i3], 48, 10000, i11);
                i3++;
            case 4:
                i11 = a.f(cArr[i3], 48, 1000, i11);
                i3++;
            case 3:
                i11 = a.f(cArr[i3], 48, 100, i11);
                i3++;
            case 2:
                return a.f(cArr[i3], 48, 10, i11);
            default:
                return i11;
        }
    }

    public static long parseLong(char[] cArr, int i3, int i10) {
        int i11 = i10 - 9;
        return (parseInt(cArr, i3, i11) * 1000000000) + parseInt(cArr, i3 + i11, 9);
    }

    public static double parseDouble(String str, boolean z2) throws NumberFormatException {
        return z2 ? FastDoubleParser.parseDouble(str) : Double.parseDouble(str);
    }

    public static long parseLong(String str) {
        if (str.length() <= 9) {
            return parseInt(str);
        }
        return Long.parseLong(str);
    }

    public static boolean inLongRange(String str, boolean z2) {
        String str2 = z2 ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int charAt = str.charAt(i3) - str2.charAt(i3);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        return java.lang.Integer.parseInt(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int parseInt(java.lang.String r10) {
        /*
            r0 = 0
            char r1 = r10.charAt(r0)
            int r2 = r10.length()
            r3 = 45
            r4 = 1
            if (r1 != r3) goto Lf
            r0 = r4
        Lf:
            r3 = 2
            r5 = 10
            if (r0 == 0) goto L24
            if (r2 == r4) goto L1f
            if (r2 <= r5) goto L19
            goto L1f
        L19:
            char r1 = r10.charAt(r4)
            r4 = r3
            goto L2d
        L1f:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L24:
            r6 = 9
            if (r2 <= r6) goto L2d
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L2d:
            r6 = 57
            if (r1 > r6) goto L82
            r7 = 48
            if (r1 >= r7) goto L36
            goto L82
        L36:
            int r1 = r1 - r7
            if (r4 >= r2) goto L7d
            int r8 = r4 + 1
            char r9 = r10.charAt(r4)
            if (r9 > r6) goto L78
            if (r9 >= r7) goto L44
            goto L78
        L44:
            int r1 = r1 * 10
            int r9 = r9 - r7
            int r1 = r1 + r9
            if (r8 >= r2) goto L7d
            int r4 = r4 + r3
            char r3 = r10.charAt(r8)
            if (r3 > r6) goto L73
            if (r3 >= r7) goto L54
            goto L73
        L54:
            int r1 = r1 * 10
            int r3 = r3 - r7
            int r1 = r1 + r3
            if (r4 >= r2) goto L7d
        L5a:
            int r3 = r4 + 1
            char r4 = r10.charAt(r4)
            if (r4 > r6) goto L6e
            if (r4 >= r7) goto L65
            goto L6e
        L65:
            int r1 = r1 * r5
            int r4 = r4 + (-48)
            int r1 = r1 + r4
            if (r3 < r2) goto L6c
            goto L7d
        L6c:
            r4 = r3
            goto L5a
        L6e:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L73:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L78:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L7d:
            if (r0 == 0) goto L81
            int r10 = -r1
            return r10
        L81:
            return r1
        L82:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseInt(java.lang.String):int");
    }
}
