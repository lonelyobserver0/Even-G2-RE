package androidx.preference;

import C1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: h, reason: collision with root package name */
    public final int f9993h;
    public final int j;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903800);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1043i, 2130903800, 0);
        int i3 = obtainStyledAttributes.getInt(3, 0);
        int i10 = obtainStyledAttributes.getInt(1, 100);
        i10 = i10 < i3 ? i3 : i10;
        if (i10 != this.f9993h) {
            this.f9993h = i10;
        }
        int i11 = obtainStyledAttributes.getInt(4, 0);
        if (i11 != this.j) {
            this.j = Math.min(this.f9993h - i3, Math.abs(i11));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(int i3, TypedArray typedArray) {
        return Integer.valueOf(typedArray.getInt(i3, 0));
    }
}
