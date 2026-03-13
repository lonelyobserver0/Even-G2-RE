package i;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class p {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static J.e b(Configuration configuration) {
        return J.e.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(J.e eVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(eVar.f3256a.f3257a.toLanguageTags()));
    }

    public static void d(Configuration configuration, J.e eVar) {
        configuration.setLocales(LocaleList.forLanguageTags(eVar.f3256a.f3257a.toLanguageTags()));
    }
}
