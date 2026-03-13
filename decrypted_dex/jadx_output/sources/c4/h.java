package c4;

import android.os.Handler;
import android.os.Looper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class h extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Looper looper, int i3) {
        super(looper);
        switch (i3) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            case 2:
            default:
                Looper.getMainLooper();
                break;
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }
}
