package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.measurement.F1;
import r4.AbstractC1567a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        TypedValue v2 = F1.v(context, 2130903929);
        if (v2 != null && v2.type == 18 && v2.data == 0) {
            return;
        }
        Resources.Theme theme = context.getTheme();
        int[] iArr = AbstractC1567a.f20335o;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int e10 = e(context, obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (e10 != -1) {
            return;
        }
        TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
        obtainStyledAttributes2.recycle();
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC1567a.f20334n);
            int e11 = e(getContext(), obtainStyledAttributes3, 0, 1);
            obtainStyledAttributes3.recycle();
            if (e11 >= 0) {
                setLineHeight(e11);
            }
        }
    }

    public static int e(Context context, TypedArray typedArray, int... iArr) {
        int i3 = -1;
        for (int i10 = 0; i10 < iArr.length && i3 < 0; i10++) {
            int i11 = iArr[i10];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i11, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i3 = dimensionPixelSize;
            } else {
                i3 = typedArray.getDimensionPixelSize(i11, -1);
            }
        }
        return i3;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        TypedValue v2 = F1.v(context, 2130903929);
        if (v2 != null && v2.type == 18 && v2.data == 0) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i3, AbstractC1567a.f20334n);
        int e10 = e(getContext(), obtainStyledAttributes, 0, 1);
        obtainStyledAttributes.recycle();
        if (e10 >= 0) {
            setLineHeight(e10);
        }
    }
}
