package com.google.android.material.button;

import D4.j;
import Ec.l;
import I4.f;
import I4.g;
import I4.k;
import I4.t;
import N.I;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.gms.internal.measurement.L1;
import com.mapbox.common.b;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n.C1357q;
import r4.AbstractC1567a;
import x4.C1909b;
import x4.InterfaceC1908a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MaterialButton extends C1357q implements Checkable, t {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f11856q = {R.attr.state_checkable};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f11857r = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final C1909b f11858d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f11859e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f11860f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f11861g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f11862h;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f11863k;

    /* renamed from: l, reason: collision with root package name */
    public int f11864l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11865m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11866n;

    /* renamed from: p, reason: collision with root package name */
    public int f11867p;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(j.d(context, attributeSet, 2130903699, 2131821231), attributeSet, 2130903699);
        this.f11859e = new LinkedHashSet();
        this.f11865m = false;
        this.f11866n = false;
        Context context2 = getContext();
        int[] iArr = AbstractC1567a.f20329h;
        j.a(context2, attributeSet, 2130903699, 2131821231);
        j.b(context2, attributeSet, iArr, 2130903699, 2131821231, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130903699, 2131821231);
        this.f11864l = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        int i3 = obtainStyledAttributes.getInt(14, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f11860f = j.e(i3, mode);
        this.f11861g = L1.o(getContext(), obtainStyledAttributes, 13);
        this.f11862h = L1.p(getContext(), obtainStyledAttributes, 9);
        this.f11867p = obtainStyledAttributes.getInteger(10, 1);
        this.j = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        C1909b c1909b = new C1909b(this, k.b(context2, attributeSet, 2130903699, 2131821231).a());
        this.f11858d = c1909b;
        c1909b.f22851c = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        c1909b.f22852d = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        c1909b.f22853e = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        c1909b.f22854f = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        if (obtainStyledAttributes.hasValue(7)) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            c1909b.f22855g = dimensionPixelSize;
            c1909b.c(c1909b.f22850b.f(dimensionPixelSize));
            c1909b.f22863p = true;
        }
        c1909b.f22856h = obtainStyledAttributes.getDimensionPixelSize(19, 0);
        c1909b.f22857i = j.e(obtainStyledAttributes.getInt(6, -1), mode);
        c1909b.j = L1.o(getContext(), obtainStyledAttributes, 5);
        c1909b.f22858k = L1.o(getContext(), obtainStyledAttributes, 18);
        c1909b.f22859l = L1.o(getContext(), obtainStyledAttributes, 15);
        c1909b.f22864q = obtainStyledAttributes.getBoolean(4, false);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        WeakHashMap weakHashMap = I.f4732a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        g gVar = new g(c1909b.f22850b);
        gVar.f(getContext());
        gVar.setTintList(c1909b.j);
        PorterDuff.Mode mode2 = c1909b.f22857i;
        if (mode2 != null) {
            gVar.setTintMode(mode2);
        }
        float f10 = c1909b.f22856h;
        ColorStateList colorStateList = c1909b.f22858k;
        gVar.f3151a.j = f10;
        gVar.invalidateSelf();
        f fVar = gVar.f3151a;
        if (fVar.f3138d != colorStateList) {
            fVar.f3138d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(c1909b.f22850b);
        gVar2.setTint(0);
        float f11 = c1909b.f22856h;
        int m4 = c1909b.f22861n ? l.m(this, 2130903249) : 0;
        gVar2.f3151a.j = f11;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(m4);
        f fVar2 = gVar2.f3151a;
        if (fVar2.f3138d != valueOf) {
            fVar2.f3138d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(c1909b.f22850b);
        c1909b.f22860m = gVar3;
        gVar3.setTint(-1);
        ColorStateList colorStateList2 = c1909b.f22859l;
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2 == null ? ColorStateList.valueOf(0) : colorStateList2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), c1909b.f22851c, c1909b.f22853e, c1909b.f22852d, c1909b.f22854f), c1909b.f22860m);
        c1909b.f22865r = rippleDrawable;
        setInternalBackground(rippleDrawable);
        g b2 = c1909b.b(false);
        if (b2 != null) {
            b2.g(dimensionPixelSize2);
        }
        setPaddingRelative(paddingStart + c1909b.f22851c, paddingTop + c1909b.f22853e, paddingEnd + c1909b.f22852d, paddingBottom + c1909b.f22854f);
        obtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.f11864l);
        b(this.f11862h != null);
    }

    private String getA11yClassName() {
        C1909b c1909b = this.f11858d;
        return ((c1909b == null || !c1909b.f22864q) ? Button.class : CompoundButton.class).getName();
    }

    public final boolean a() {
        C1909b c1909b = this.f11858d;
        return (c1909b == null || c1909b.f22862o) ? false : true;
    }

    public final void b(boolean z2) {
        Drawable drawable = this.f11862h;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f11862h = mutate;
            mutate.setTintList(this.f11861g);
            PorterDuff.Mode mode = this.f11860f;
            if (mode != null) {
                this.f11862h.setTintMode(mode);
            }
            int i3 = this.j;
            if (i3 == 0) {
                i3 = this.f11862h.getIntrinsicWidth();
            }
            int i10 = this.j;
            if (i10 == 0) {
                i10 = this.f11862h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f11862h;
            int i11 = this.f11863k;
            drawable2.setBounds(i11, 0, i3 + i11, i10);
        }
        int i12 = this.f11867p;
        boolean z10 = true;
        if (i12 != 1 && i12 != 2) {
            z10 = false;
        }
        if (z2) {
            if (z10) {
                setCompoundDrawablesRelative(this.f11862h, null, null, null);
                return;
            } else {
                setCompoundDrawablesRelative(null, null, this.f11862h, null);
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[2];
        if ((!z10 || drawable3 == this.f11862h) && (z10 || drawable4 == this.f11862h)) {
            return;
        }
        if (z10) {
            setCompoundDrawablesRelative(this.f11862h, null, null, null);
        } else {
            setCompoundDrawablesRelative(null, null, this.f11862h, null);
        }
    }

    public final void c() {
        if (this.f11862h == null || getLayout() == null) {
            return;
        }
        int i3 = this.f11867p;
        if (i3 == 1 || i3 == 3) {
            this.f11863k = 0;
            b(false);
            return;
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
        int i10 = this.j;
        if (i10 == 0) {
            i10 = this.f11862h.getIntrinsicWidth();
        }
        int measuredWidth = getMeasuredWidth() - min;
        WeakHashMap weakHashMap = I.f4732a;
        int paddingEnd = ((((measuredWidth - getPaddingEnd()) - i10) - this.f11864l) - getPaddingStart()) / 2;
        if ((getLayoutDirection() == 1) != (this.f11867p == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f11863k != paddingEnd) {
            this.f11863k = paddingEnd;
            b(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f11858d.f22855g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f11862h;
    }

    public int getIconGravity() {
        return this.f11867p;
    }

    public int getIconPadding() {
        return this.f11864l;
    }

    public int getIconSize() {
        return this.j;
    }

    public ColorStateList getIconTint() {
        return this.f11861g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11860f;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f11858d.f22859l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (a()) {
            return this.f11858d.f22850b;
        }
        throw new IllegalStateException(StubApp.getString2(12457));
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f11858d.f22858k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f11858d.f22856h;
        }
        return 0;
    }

    @Override // n.C1357q
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f11858d.j : super.getSupportBackgroundTintList();
    }

    @Override // n.C1357q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f11858d.f22857i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11865m;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        F1.y(this, this.f11858d.b(false));
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        C1909b c1909b = this.f11858d;
        if (c1909b != null && c1909b.f22864q) {
            View.mergeDrawableStates(onCreateDrawableState, f11856q);
        }
        if (this.f11865m) {
            View.mergeDrawableStates(onCreateDrawableState, f11857r);
        }
        return onCreateDrawableState;
    }

    @Override // n.C1357q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f11865m);
    }

    @Override // n.C1357q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C1909b c1909b = this.f11858d;
        accessibilityNodeInfo.setCheckable(c1909b != null && c1909b.f22864q);
        accessibilityNodeInfo.setChecked(this.f11865m);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        c();
    }

    @Override // n.C1357q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        c();
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        if (!a()) {
            super.setBackgroundColor(i3);
            return;
        }
        C1909b c1909b = this.f11858d;
        if (c1909b.b(false) != null) {
            c1909b.b(false).setTint(i3);
        }
    }

    @Override // n.C1357q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w(StubApp.getString2(12458), StubApp.getString2(12459));
        C1909b c1909b = this.f11858d;
        c1909b.f22862o = true;
        ColorStateList colorStateList = c1909b.j;
        MaterialButton materialButton = c1909b.f22849a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c1909b.f22857i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // n.C1357q, android.view.View
    public void setBackgroundResource(int i3) {
        setBackgroundDrawable(i3 != 0 ? D1.m(getContext(), i3) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (a()) {
            this.f11858d.f22864q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        C1909b c1909b = this.f11858d;
        if (c1909b == null || !c1909b.f22864q || !isEnabled() || this.f11865m == z2) {
            return;
        }
        this.f11865m = z2;
        refreshDrawableState();
        if (this.f11866n) {
            return;
        }
        this.f11866n = true;
        Iterator it = this.f11859e.iterator();
        if (it.hasNext()) {
            throw b.e(it);
        }
        this.f11866n = false;
    }

    public void setCornerRadius(int i3) {
        if (a()) {
            C1909b c1909b = this.f11858d;
            if (c1909b.f22863p && c1909b.f22855g == i3) {
                return;
            }
            c1909b.f22855g = i3;
            c1909b.f22863p = true;
            c1909b.c(c1909b.f22850b.f(i3));
        }
    }

    public void setCornerRadiusResource(int i3) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i3));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f11858d.b(false).g(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f11862h != drawable) {
            this.f11862h = drawable;
            b(true);
        }
    }

    public void setIconGravity(int i3) {
        if (this.f11867p != i3) {
            this.f11867p = i3;
            c();
        }
    }

    public void setIconPadding(int i3) {
        if (this.f11864l != i3) {
            this.f11864l = i3;
            setCompoundDrawablePadding(i3);
        }
    }

    public void setIconResource(int i3) {
        setIcon(i3 != 0 ? D1.m(getContext(), i3) : null);
    }

    public void setIconSize(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(12460));
        }
        if (this.j != i3) {
            this.j = i3;
            b(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f11861g != colorStateList) {
            this.f11861g = colorStateList;
            b(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f11860f != mode) {
            this.f11860f = mode;
            b(false);
        }
    }

    public void setIconTintResource(int i3) {
        setIconTint(D1.j(getContext(), i3));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1908a interfaceC1908a) {
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            C1909b c1909b = this.f11858d;
            if (c1909b.f22859l != colorStateList) {
                c1909b.f22859l = colorStateList;
                MaterialButton materialButton = c1909b.f22849a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i3) {
        if (a()) {
            setRippleColor(D1.j(getContext(), i3));
        }
    }

    @Override // I4.t
    public void setShapeAppearanceModel(k kVar) {
        if (!a()) {
            throw new IllegalStateException(StubApp.getString2(12461));
        }
        this.f11858d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (a()) {
            C1909b c1909b = this.f11858d;
            c1909b.f22861n = z2;
            c1909b.d();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            C1909b c1909b = this.f11858d;
            if (c1909b.f22858k != colorStateList) {
                c1909b.f22858k = colorStateList;
                c1909b.d();
            }
        }
    }

    public void setStrokeColorResource(int i3) {
        if (a()) {
            setStrokeColor(D1.j(getContext(), i3));
        }
    }

    public void setStrokeWidth(int i3) {
        if (a()) {
            C1909b c1909b = this.f11858d;
            if (c1909b.f22856h != i3) {
                c1909b.f22856h = i3;
                c1909b.d();
            }
        }
    }

    public void setStrokeWidthResource(int i3) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i3));
        }
    }

    @Override // n.C1357q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1909b c1909b = this.f11858d;
        if (c1909b.j != colorStateList) {
            c1909b.j = colorStateList;
            if (c1909b.b(false) != null) {
                c1909b.b(false).setTintList(c1909b.j);
            }
        }
    }

    @Override // n.C1357q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1909b c1909b = this.f11858d;
        if (c1909b.f22857i != mode) {
            c1909b.f22857i = mode;
            if (c1909b.b(false) == null || c1909b.f22857i == null) {
                return;
            }
            c1909b.b(false).setTintMode(c1909b.f22857i);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f11865m);
    }
}
