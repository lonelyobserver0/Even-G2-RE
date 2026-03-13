package N;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class C {
    public static c0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        c0 g10 = c0.g(rootWindowInsets, null);
        Z z2 = g10.f4771a;
        z2.p(g10);
        z2.d(view.getRootView());
        return g10;
    }

    public static void b(View view, int i3, int i10) {
        view.setScrollIndicators(i3, i10);
    }
}
