package com.google.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private ISO8601Utils() {
    }

    private static boolean checkOffset(String str, int i3, char c10) {
        return i3 < str.length() && str.charAt(i3) == c10;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i3) {
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                return i3;
            }
            i3++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb2, int i3, int i10) {
        String num = Integer.toString(i3);
        for (int length = i10 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8 A[Catch: IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:18:0x0062, B:20:0x0072, B:21:0x0074, B:23:0x0080, B:24:0x0083, B:26:0x0089, B:30:0x0093, B:35:0x00a3, B:37:0x00ab, B:43:0x00e2, B:45:0x00e8, B:47:0x00ee, B:48:0x017f, B:55:0x00ff, B:56:0x0115, B:57:0x0116, B:60:0x0126, B:62:0x0133, B:65:0x013c, B:67:0x014e, B:70:0x015d, B:71:0x017a, B:73:0x017d, B:74:0x0122, B:75:0x01b1, B:76:0x01b8, B:77:0x00c5, B:78:0x00c8), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b1 A[Catch: IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:18:0x0062, B:20:0x0072, B:21:0x0074, B:23:0x0080, B:24:0x0083, B:26:0x0089, B:30:0x0093, B:35:0x00a3, B:37:0x00ab, B:43:0x00e2, B:45:0x00e8, B:47:0x00ee, B:48:0x017f, B:55:0x00ff, B:56:0x0115, B:57:0x0116, B:60:0x0126, B:62:0x0133, B:65:0x013c, B:67:0x014e, B:70:0x015d, B:71:0x017a, B:73:0x017d, B:74:0x0122, B:75:0x01b1, B:76:0x01b8, B:77:0x00c5, B:78:0x00c8), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i3, int i10) throws NumberFormatException {
        int i11;
        int i12;
        if (i3 < 0 || i10 > str.length() || i3 > i10) {
            throw new NumberFormatException(str);
        }
        if (i3 < i10) {
            i12 = i3 + 1;
            int digit = Character.digit(str.charAt(i3), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i3, i10));
            }
            i11 = -digit;
        } else {
            i11 = 0;
            i12 = i3;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int digit2 = Character.digit(str.charAt(i12), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i3, i10));
            }
            i11 = (i11 * 10) - digit2;
            i12 = i13;
        }
        return -i11;
    }

    public static String format(Date date, boolean z2) {
        return format(date, z2, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z2, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z2 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        padInt(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(13), 2);
        if (z2) {
            sb2.append('.');
            padInt(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i3 = offset / 60000;
            int abs = Math.abs(i3 / 60);
            int abs2 = Math.abs(i3 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            padInt(sb2, abs, 2);
            sb2.append(':');
            padInt(sb2, abs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }
}
