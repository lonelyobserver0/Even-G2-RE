package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DateUtil {
    private static final Map localeCache = new HashMap();
    static Locale EN_Locale = forEN();

    public static Date epochAdjust(Date date) throws ParseException {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = localeCache;
        synchronized (map) {
            try {
                Long l9 = (Long) map.get(locale);
                if (l9 == null) {
                    l9 = longValueOf(new SimpleDateFormat(StubApp.getString2("26743")).parse(StubApp.getString2("26848")).getTime());
                    map.put(locale, l9);
                }
                if (l9.longValue() == 0) {
                    return date;
                }
                return new Date(date.getTime() - l9.longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Locale forEN() {
        String language = Locale.getDefault().getLanguage();
        String string2 = StubApp.getString2(2887);
        if (string2.equalsIgnoreCase(language)) {
            return Locale.getDefault();
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i3 = 0; i3 != availableLocales.length; i3++) {
            if (string2.equalsIgnoreCase(availableLocales[i3].getLanguage())) {
                return availableLocales[i3];
            }
        }
        return Locale.getDefault();
    }

    private static Long longValueOf(long j) {
        return Long.valueOf(j);
    }
}
