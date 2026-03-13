package com.google.android.material.snackbar;

import N.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import r4.AbstractC1567a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f11973a;

    /* renamed from: b, reason: collision with root package name */
    public Button f11974b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11975c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11976d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1567a.f20338r);
        this.f11975c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f11976d = obtainStyledAttributes.getDimensionPixelSize(5, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean a(int i3, int i10, int i11) {
        boolean z2;
        if (i3 != getOrientation()) {
            setOrientation(i3);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f11973a.getPaddingTop() == i10 && this.f11973a.getPaddingBottom() == i11) {
            return z2;
        }
        TextView textView = this.f11973a;
        WeakHashMap weakHashMap = I.f4732a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i10, textView.getPaddingEnd(), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f11974b;
    }

    public TextView getMessageView() {
        return this.f11973a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f11973a = (TextView) findViewById(2131231068);
        this.f11974b = (Button) findViewById(2131231067);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        super.onMeasure(i3, i10);
        int i12 = this.f11975c;
        if (i12 > 0 && getMeasuredWidth() > i12) {
            i3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            super.onMeasure(i3, i10);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131099786);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131099785);
        boolean z2 = this.f11973a.getLayout().getLineCount() > 1;
        if (!z2 || (i11 = this.f11976d) <= 0 || this.f11974b.getMeasuredWidth() <= i11) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i3, i10);
    }
}
