package androidx.preference;

import android.content.res.TypedArray;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903328(0x7f030120, float:1.741347E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = E.b.b(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = C1.b.f1037c
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L2e
            I4.e r5 = I4.e.f3132b
            if (r5 != 0) goto L2a
            I4.e r5 = new I4.e
            r0 = 3
            r5.<init>(r0)
            I4.e.f3132b = r5
        L2a:
            I4.e r5 = I4.e.f3132b
            r3.f9992g = r5
        L2e:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final Object c(int i3, TypedArray typedArray) {
        return typedArray.getString(i3);
    }
}
