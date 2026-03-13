package androidx.preference;

import C1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903884);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1044k, 2130903884, 0);
        if (obtainStyledAttributes.getString(7) == null) {
            obtainStyledAttributes.getString(0);
        }
        if (obtainStyledAttributes.getString(6) == null) {
            obtainStyledAttributes.getString(1);
        }
        if (obtainStyledAttributes.getString(9) == null) {
            obtainStyledAttributes.getString(3);
        }
        if (obtainStyledAttributes.getString(8) == null) {
            obtainStyledAttributes.getString(4);
        }
        obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
