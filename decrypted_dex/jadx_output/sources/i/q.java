package i;

import Xa.C0362b;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import kotlin.time.DurationKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class q {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, v vVar) {
        Objects.requireNonNull(vVar);
        C0362b c0362b = new C0362b(vVar, 2);
        D2.b.o(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, c0362b);
        return c0362b;
    }

    public static void c(Object obj, Object obj2) {
        D2.b.o(obj).unregisterOnBackInvokedCallback(D2.b.k(obj2));
    }
}
