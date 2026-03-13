package com.google.android.material.internal;

import D4.a;
import D4.f;
import E.l;
import N.I;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import m.n;
import m.y;
import n.C1366u0;
import n.a1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class NavigationMenuItemView extends f implements y {

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f11961I = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public boolean f11962A;

    /* renamed from: B, reason: collision with root package name */
    public final CheckedTextView f11963B;

    /* renamed from: C, reason: collision with root package name */
    public FrameLayout f11964C;

    /* renamed from: D, reason: collision with root package name */
    public n f11965D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f11966E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f11967F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f11968G;

    /* renamed from: H, reason: collision with root package name */
    public final a f11969H;

    /* renamed from: y, reason: collision with root package name */
    public int f11970y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11971z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this, 1);
        this.f11969H = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131427374, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(2131099771));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(2131230848);
        this.f11963B = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        I.i(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f11964C == null) {
                this.f11964C = (FrameLayout) ((ViewStub) findViewById(2131230847)).inflate();
            }
            this.f11964C.removeAllViews();
            this.f11964C.addView(view);
        }
    }

    @Override // m.y
    public final void a(n nVar) {
        StateListDrawable stateListDrawable;
        this.f11965D = nVar;
        setVisibility(nVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(2130903233, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f11961I, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = I.f4732a;
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.f16955e);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.f16966q);
        a1.a(this, nVar.f16967r);
        n nVar2 = this.f11965D;
        CharSequence charSequence = nVar2.f16955e;
        CheckedTextView checkedTextView = this.f11963B;
        if (charSequence == null && nVar2.getIcon() == null && this.f11965D.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f11964C;
            if (frameLayout != null) {
                C1366u0 c1366u0 = (C1366u0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1366u0).width = -1;
                this.f11964C.setLayoutParams(c1366u0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f11964C;
        if (frameLayout2 != null) {
            C1366u0 c1366u02 = (C1366u0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1366u02).width = -2;
            this.f11964C.setLayoutParams(c1366u02);
        }
    }

    @Override // m.y
    public n getItemData() {
        return this.f11965D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        n nVar = this.f11965D;
        if (nVar != null && nVar.isCheckable() && this.f11965D.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f11961I);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f11962A != z2) {
            this.f11962A = z2;
            this.f11969H.h(this.f11963B, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.f11963B.setChecked(z2);
    }

    public void setHorizontalPadding(int i3) {
        setPadding(i3, 0, i3, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f11967F) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f11966E);
            }
            int i3 = this.f11970y;
            drawable.setBounds(0, 0, i3, i3);
        } else if (this.f11971z) {
            if (this.f11968G == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.f1716a;
                Drawable drawable2 = resources.getDrawable(2131165581, theme);
                this.f11968G = drawable2;
                if (drawable2 != null) {
                    int i10 = this.f11970y;
                    drawable2.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f11968G;
        }
        this.f11963B.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i3) {
        this.f11963B.setCompoundDrawablePadding(i3);
    }

    public void setIconSize(int i3) {
        this.f11970y = i3;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f11966E = colorStateList;
        this.f11967F = colorStateList != null;
        n nVar = this.f11965D;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i3) {
        this.f11963B.setMaxLines(i3);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f11971z = z2;
    }

    public void setTextAppearance(int i3) {
        this.f11963B.setTextAppearance(i3);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f11963B.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f11963B.setText(charSequence);
    }
}
