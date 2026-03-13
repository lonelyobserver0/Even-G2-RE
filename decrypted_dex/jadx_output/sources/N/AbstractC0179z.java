package N;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: N.z, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0179z {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i3 = J.f4737a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
