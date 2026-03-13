package com.google.android.material.internal;

import D4.a;
import D4.b;
import N.I;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import n.C1373y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CheckableImageButton extends C1373y implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f11957g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f11958d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11959e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11960f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903434);
        this.f11959e = true;
        this.f11960f = true;
        I.i(this, new a(this, 0));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11958d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        return this.f11958d ? View.mergeDrawableStates(super.onCreateDrawableState(i3 + 1), f11957g) : super.onCreateDrawableState(i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f5920a);
        setChecked(bVar.f1277c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f1277c = this.f11958d;
        return bVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f11959e != z2) {
            this.f11959e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f11959e || this.f11958d == z2) {
            return;
        }
        this.f11958d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f11960f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f11960f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f11958d);
    }
}
