package com.google.android.material.chip;

import D4.e;
import D4.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.stub.StubApp;
import r4.AbstractC1567a;
import z4.f;
import z4.g;
import z4.h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ChipGroup extends e {

    /* renamed from: d, reason: collision with root package name */
    public int f11886d;

    /* renamed from: e, reason: collision with root package name */
    public int f11887e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11888f;

    /* renamed from: g, reason: collision with root package name */
    public final z4.e f11889g;

    /* renamed from: h, reason: collision with root package name */
    public final h f11890h;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11891k;

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903197);
        this.f1319c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1567a.f20327f, 0, 0);
        this.f1317a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1318b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f11889g = new z4.e(this);
        h hVar = new h(this);
        this.f11890h = hVar;
        this.j = -1;
        this.f11891k = false;
        int[] iArr = AbstractC1567a.f20324c;
        j.a(context, attributeSet, 2130903197, 2131821249);
        j.b(context, attributeSet, iArr, 2130903197, 2131821249, new int[0]);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, 2130903197, 2131821249);
        int dimensionPixelOffset = obtainStyledAttributes2.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(obtainStyledAttributes2.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(obtainStyledAttributes2.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(obtainStyledAttributes2.getBoolean(4, false));
        setSingleSelection(obtainStyledAttributes2.getBoolean(5, false));
        int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
        if (resourceId != -1) {
            this.j = resourceId;
        }
        obtainStyledAttributes2.recycle();
        super.setOnHierarchyChangeListener(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i3) {
        this.j = i3;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i10 = this.j;
                if (i10 != -1 && this.f11888f) {
                    b(i10, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i3, layoutParams);
    }

    public final void b(int i3, boolean z2) {
        View findViewById = findViewById(i3);
        if (findViewById instanceof Chip) {
            this.f11891k = true;
            ((Chip) findViewById).setChecked(z2);
            this.f11891k = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof f);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f11888f) {
            return this.j;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f11886d;
    }

    public int getChipSpacingVertical() {
        return this.f11887e;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i3 = this.j;
        if (i3 != -1) {
            b(i3, true);
            setCheckedId(this.j);
        }
    }

    public void setChipSpacing(int i3) {
        setChipSpacingHorizontal(i3);
        setChipSpacingVertical(i3);
    }

    public void setChipSpacingHorizontal(int i3) {
        if (this.f11886d != i3) {
            this.f11886d = i3;
            setItemSpacing(i3);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i3) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i3));
    }

    public void setChipSpacingResource(int i3) {
        setChipSpacing(getResources().getDimensionPixelOffset(i3));
    }

    public void setChipSpacingVertical(int i3) {
        if (this.f11887e != i3) {
            this.f11887e = i3;
            setLineSpacing(i3);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i3) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i3));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException(StubApp.getString2(12493));
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException(StubApp.getString2(12493));
    }

    @Deprecated
    public void setFlexWrap(int i3) {
        throw new UnsupportedOperationException(StubApp.getString2(12494));
    }

    public void setOnCheckedChangeListener(g gVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f11890h.f24105a = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i3) {
        throw new UnsupportedOperationException(StubApp.getString2(12495));
    }

    @Deprecated
    public void setShowDividerVertical(int i3) {
        throw new UnsupportedOperationException(StubApp.getString2(12495));
    }

    @Override // D4.e
    public void setSingleLine(boolean z2) {
        super.setSingleLine(z2);
    }

    public void setSingleSelection(boolean z2) {
        if (this.f11888f != z2) {
            this.f11888f = z2;
            this.f11891k = true;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f11891k = false;
            setCheckedId(-1);
        }
    }

    public void setSingleLine(int i3) {
        setSingleLine(getResources().getBoolean(i3));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f(layoutParams);
    }

    public void setSingleSelection(int i3) {
        setSingleSelection(getResources().getBoolean(i3));
    }
}
