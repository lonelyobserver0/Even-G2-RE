package com.google.android.material.appbar;

import D4.j;
import I4.g;
import N.B;
import N.I;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.measurement.F1;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MaterialToolbar extends Toolbar {
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(j.d(context, attributeSet, 2130903971, 2131821299), attributeSet, 0);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.h(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.f(context2);
            WeakHashMap weakHashMap = I.f4732a;
            gVar.g(B.e(this));
            setBackground(gVar);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            F1.y(this, (g) background);
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).g(f10);
        }
    }
}
