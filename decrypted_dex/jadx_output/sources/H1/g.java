package H1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class g {
    public static PackageInfo a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
