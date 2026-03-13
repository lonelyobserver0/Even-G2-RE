package S1;

import android.os.Trace;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {
    public static void a(int i3, String str) {
        Trace.beginAsyncSection(str, i3);
    }

    public static void b(int i3, String str) {
        Trace.endAsyncSection(str, i3);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
