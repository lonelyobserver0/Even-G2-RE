package com.fasterxml.jackson.core.io;

import com.stub.StubApp;
import java.math.BigDecimal;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BigDecimalParser {
    private static int adjustScale(int i3, long j) {
        long j3 = i3 - j;
        if (j3 <= 2147483647L && j3 >= -2147483648L) {
            return (int) j3;
        }
        throw new NumberFormatException(StubApp.getString2(10360) + j3 + StubApp.getString2(10361) + i3 + StubApp.getString2(10362) + j);
    }

    public static BigDecimal parse(String str) {
        return parse(str.toCharArray());
    }

    private static BigDecimal parseBigDecimal(char[] cArr, int i3, int i10, int i11) {
        int i12;
        BigDecimal bigDecimalRec;
        int i13;
        int i14 = i3 + i10;
        int i15 = i3;
        int i16 = i15;
        int i17 = -1;
        int i18 = -1;
        int i19 = 0;
        boolean z2 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (i15 < i14) {
            char c10 = cArr[i15];
            String string2 = StubApp.getString2(10368);
            String string22 = StubApp.getString2(10369);
            if (c10 != '+') {
                if (c10 == 'E' || c10 == 'e') {
                    if (i17 >= 0) {
                        throw new NumberFormatException(StubApp.getString2(10371));
                    }
                    i17 = i15;
                } else if (c10 != '-') {
                    if (c10 != '.') {
                        if (i18 >= 0 && i17 == -1) {
                            i19++;
                        }
                    } else {
                        if (i18 >= 0) {
                            throw new NumberFormatException(StubApp.getString2(10370));
                        }
                        i18 = i15;
                    }
                } else if (i17 >= 0) {
                    if (z10) {
                        throw new NumberFormatException(string22);
                    }
                    z10 = true;
                } else {
                    if (z2) {
                        throw new NumberFormatException(string2);
                    }
                    i13 = i15 + 1;
                    z2 = true;
                    z11 = true;
                    i16 = i13;
                }
            } else if (i17 >= 0) {
                if (z10) {
                    throw new NumberFormatException(string22);
                }
                z10 = true;
            } else {
                if (z2) {
                    throw new NumberFormatException(string2);
                }
                i13 = i15 + 1;
                z2 = true;
                i16 = i13;
            }
            i15++;
        }
        if (i17 >= 0) {
            i12 = Integer.parseInt(new String(cArr, i17 + 1, (i14 - i17) - 1));
            i19 = adjustScale(i19, i12);
            i14 = i17;
        } else {
            i12 = 0;
        }
        if (i18 >= 0) {
            int i20 = (i14 - i18) - 1;
            bigDecimalRec = toBigDecimalRec(cArr, i16, i18 - i16, i12, i11).add(toBigDecimalRec(cArr, i18 + 1, i20, i12 - i20, i11));
        } else {
            bigDecimalRec = toBigDecimalRec(cArr, i16, i14 - i16, i12, i11);
        }
        if (i19 != 0) {
            bigDecimalRec = bigDecimalRec.setScale(i19);
        }
        return z11 ? bigDecimalRec.negate() : bigDecimalRec;
    }

    private static BigDecimal toBigDecimalRec(char[] cArr, int i3, int i10, int i11, int i12) {
        if (i10 <= i12) {
            return i10 == 0 ? BigDecimal.ZERO : new BigDecimal(cArr, i3, i10).movePointRight(i11);
        }
        int i13 = i10 / 2;
        return toBigDecimalRec(cArr, i3, i13, (i11 + i10) - i13, i12).add(toBigDecimalRec(cArr, i3 + i13, i10 - i13, i11, i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.math.BigDecimal parse(char[] r3, int r4, int r5) {
        /*
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 >= r0) goto Le
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> La java.lang.ArithmeticException -> Lc
            r0.<init>(r3, r4, r5)     // Catch: java.lang.NumberFormatException -> La java.lang.ArithmeticException -> Lc
            return r0
        La:
            r0 = move-exception
            goto L15
        Lc:
            r0 = move-exception
            goto L15
        Le:
            int r0 = r5 / 10
            java.math.BigDecimal r3 = parseBigDecimal(r3, r4, r5, r0)     // Catch: java.lang.NumberFormatException -> La java.lang.ArithmeticException -> Lc
            return r3
        L15:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L22
            r0 = 10363(0x287b, float:1.4522E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
        L22:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r5 > r1) goto L2c
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3, r4, r5)
            goto L53
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = new java.lang.String
            char[] r4 = java.util.Arrays.copyOfRange(r3, r4, r1)
            r2.<init>(r4)
            r5.append(r2)
            r4 = 10364(0x287c, float:1.4523E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r5.append(r4)
            int r3 = r3.length
            r4 = 10365(0x287d, float:1.4524E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            java.lang.String r1 = p0.AbstractC1482f.f(r3, r4, r5)
        L53:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r4 = 10366(0x287e, float:1.4526E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r5 = 10367(0x287f, float:1.4527E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            java.lang.String r4 = p0.AbstractC1482f.i(r4, r1, r5, r0)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.BigDecimalParser.parse(char[], int, int):java.math.BigDecimal");
    }

    public static BigDecimal parse(char[] cArr) {
        return parse(cArr, 0, cArr.length);
    }
}
