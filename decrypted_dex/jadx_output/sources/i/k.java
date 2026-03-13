package i;

import android.app.LocaleManager;
import android.os.LocaleList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class k {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
