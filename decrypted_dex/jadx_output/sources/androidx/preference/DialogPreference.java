package androidx.preference;

import C1.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1036b, i3, 0);
        if (obtainStyledAttributes.getString(9) == null) {
            obtainStyledAttributes.getString(0);
        }
        if (obtainStyledAttributes.getString(8) == null) {
            obtainStyledAttributes.getString(1);
        }
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        if (obtainStyledAttributes.getString(11) == null) {
            obtainStyledAttributes.getString(3);
        }
        if (obtainStyledAttributes.getString(10) == null) {
            obtainStyledAttributes.getString(4);
        }
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, E.b.b(context, 2130903300, R.attr.dialogPreferenceStyle));
    }
}
