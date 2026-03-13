package tb;

import android.os.Trace;
import com.stub.StubApp;
import f5.u0;

/* renamed from: tb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1748a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + StubApp.getString2(10450);
    }

    public static void d(String str) {
        Trace.beginSection(u0.A(a(str)));
    }
}
