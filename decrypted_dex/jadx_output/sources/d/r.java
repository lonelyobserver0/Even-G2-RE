package d;

import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r extends q {
    @Override // d.p
    public void b(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
