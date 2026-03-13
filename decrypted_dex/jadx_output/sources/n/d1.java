package n;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class d1 {
    public static void a(View view, Rect rect, Rect rect2) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }
}
