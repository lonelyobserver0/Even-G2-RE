package com.google.android.material.theme;

import D4.j;
import E4.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.measurement.L1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import i.y;
import n.C1298C;
import n.C1357q;
import n.C1359r;
import r4.AbstractC1567a;
import y4.C1971a;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MaterialComponentsViewInflater extends y {
    private static int floatingToolbarItemBackgroundResId = -1;

    @Override // i.y
    public C1357q createButton(Context context, AttributeSet attributeSet) {
        return shouldInflateAppCompatButton(context, attributeSet) ? new C1357q(context, attributeSet) : new MaterialButton(context, attributeSet);
    }

    @Override // i.y
    public C1359r createCheckBox(Context context, AttributeSet attributeSet) {
        C1971a c1971a = new C1971a(j.d(context, attributeSet, 2130903186, 2131821250), attributeSet, 2130903186);
        Context context2 = c1971a.getContext();
        int[] iArr = AbstractC1567a.f20331k;
        j.a(context2, attributeSet, 2130903186, 2131821250);
        j.b(context2, attributeSet, iArr, 2130903186, 2131821250, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130903186, 2131821250);
        if (obtainStyledAttributes.hasValue(0)) {
            c1971a.setButtonTintList(L1.o(context2, obtainStyledAttributes, 0));
        }
        c1971a.f23512f = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        return c1971a;
    }

    @Override // i.y
    public C1298C createRadioButton(Context context, AttributeSet attributeSet) {
        a aVar = new a(j.d(context, attributeSet, 2130903775, 2131821251), attributeSet);
        Context context2 = aVar.getContext();
        int[] iArr = AbstractC1567a.f20332l;
        j.a(context2, attributeSet, 2130903775, 2131821251);
        j.b(context2, attributeSet, iArr, 2130903775, 2131821251, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130903775, 2131821251);
        aVar.f1902f = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    @Override // i.y
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    public boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        return false;
    }
}
