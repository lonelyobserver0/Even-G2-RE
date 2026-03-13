package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class TwoStatePreference extends Preference {
    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final Object c(int i3, TypedArray typedArray) {
        return Boolean.valueOf(typedArray.getBoolean(i3, false));
    }
}
