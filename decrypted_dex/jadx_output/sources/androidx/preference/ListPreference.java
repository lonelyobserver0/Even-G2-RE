package androidx.preference;

import C1.a;
import C1.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import u5.d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence[] f9985h;
    public final String j;

    public ListPreference(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1038d, i3, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f9985h = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (d.f21450b == null) {
                d.f21450b = new d(3);
            }
            this.f9992g = d.f21450b;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.f1040f, i3, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.j = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        a aVar = this.f9992g;
        if (aVar != null) {
            return aVar.h(this);
        }
        CharSequence a3 = super.a();
        String str = this.j;
        if (str != null) {
            String format = String.format(str, "");
            if (!TextUtils.equals(format, a3)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return a3;
    }

    @Override // androidx.preference.Preference
    public final Object c(int i3, TypedArray typedArray) {
        return typedArray.getString(i3);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, E.b.b(context, 2130903300, R.attr.dialogPreferenceStyle));
    }
}
