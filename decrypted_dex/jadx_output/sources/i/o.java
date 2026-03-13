package i;

import android.os.PowerManager;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class o {
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
