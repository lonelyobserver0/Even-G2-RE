package Y;

import android.os.Handler;
import android.os.Looper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
