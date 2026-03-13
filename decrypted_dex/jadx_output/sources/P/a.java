package P;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {
    public static void a(NestedScrollView nestedScrollView, float f10) {
        try {
            nestedScrollView.setFrameContentVelocity(f10);
        } catch (LinkageError unused) {
        }
    }

    public static void b(EditorInfo editorInfo) {
        editorInfo.setStylusHandwritingEnabled(true);
    }
}
