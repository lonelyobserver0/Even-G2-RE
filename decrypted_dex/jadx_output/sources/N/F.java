package N;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class F {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3, int i10) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i3, i10);
    }
}
