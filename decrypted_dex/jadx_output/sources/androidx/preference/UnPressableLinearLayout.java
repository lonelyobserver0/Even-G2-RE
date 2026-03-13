package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class UnPressableLinearLayout extends LinearLayout {
    public UnPressableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z2) {
    }
}
