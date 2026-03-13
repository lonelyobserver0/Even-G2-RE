package com.google.gson.internal;

import i2.u;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PreJava9DateFormatProvider {
    private PreJava9DateFormatProvider() {
    }

    private static String getDatePartOfDateTimePattern(int i3) {
        if (i3 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i3 == 1) {
            return "MMMM d, yyyy";
        }
        if (i3 == 2) {
            return "MMM d, yyyy";
        }
        if (i3 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException(u.p(i3, "Unknown DateFormat style: "));
    }

    private static String getTimePartOfDateTimePattern(int i3) {
        if (i3 == 0 || i3 == 1) {
            return "h:mm:ss a z";
        }
        if (i3 == 2) {
            return "h:mm:ss a";
        }
        if (i3 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException(u.p(i3, "Unknown DateFormat style: "));
    }

    public static DateFormat getUsDateTimeFormat(int i3, int i10) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i3) + " " + getTimePartOfDateTimePattern(i10), Locale.US);
    }
}
