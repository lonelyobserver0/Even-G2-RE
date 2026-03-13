package androidx.preference;

import android.content.res.TypedArray;
import java.util.HashSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903300(0x7f030104, float:1.7413414E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = E.b.b(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int[] r1 = C1.b.f1039e
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L23
            r4.getTextArray(r2)
        L23:
            r5 = 3
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L2e
            r5 = 1
            r4.getTextArray(r5)
        L2e:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final Object c(int i3, TypedArray typedArray) {
        CharSequence[] textArray = typedArray.getTextArray(i3);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
