package androidx.preference;

import C1.a;
import C1.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9986a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9987b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f9988c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f9989d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9990e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9991f;

    /* renamed from: g, reason: collision with root package name */
    public a f9992g;

    public Preference(Context context, AttributeSet attributeSet, int i3) {
        this.f9987b = IntCompanionObject.MAX_VALUE;
        this.f9986a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1040f, i3, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f9990e = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f9988c = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f9989d = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f9987b = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, IntCompanionObject.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, 2131427440));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z2 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.getString(19) == null) {
            obtainStyledAttributes.getString(10);
        }
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z2));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z2));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f9991f = c(18, obtainStyledAttributes);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f9991f = c(11, obtainStyledAttributes);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        a aVar = this.f9992g;
        return aVar != null ? aVar.h(this) : this.f9989d;
    }

    public void b() {
    }

    public Object c(int i3, TypedArray typedArray) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i3 = preference2.f9987b;
        int i10 = this.f9987b;
        if (i10 != i3) {
            return i10 - i3;
        }
        CharSequence charSequence = preference2.f9988c;
        CharSequence charSequence2 = this.f9988c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.f9988c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb2.append(charSequence);
            sb2.append(' ');
        }
        CharSequence a3 = a();
        if (!TextUtils.isEmpty(a3)) {
            sb2.append(a3);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, E.b.b(context, 2130903765, R.attr.preferenceStyle));
    }
}
