package n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: n.e0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1334e0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C1355p f17517a;

    /* renamed from: b, reason: collision with root package name */
    public final C1322X f17518b;

    /* renamed from: c, reason: collision with root package name */
    public C1371x f17519c;

    public C1334e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        O0.a(this, getContext());
        C1355p c1355p = new C1355p(this);
        this.f17517a = c1355p;
        c1355p.d(attributeSet, R.attr.buttonStyleToggle);
        C1322X c1322x = new C1322X(this);
        this.f17518b = c1322x;
        c1322x.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1371x getEmojiTextViewHelper() {
        if (this.f17519c == null) {
            this.f17519c = new C1371x(this);
        }
        return this.f17519c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1355p c1355p = this.f17517a;
        if (c1355p != null) {
            c1355p.a();
        }
        C1322X c1322x = this.f17518b;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1355p c1355p = this.f17517a;
        if (c1355p != null) {
            return c1355p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1355p c1355p = this.f17517a;
        if (c1355p != null) {
            return c1355p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17518b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17518b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1355p c1355p = this.f17517a;
        if (c1355p != null) {
            c1355p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1355p c1355p = this.f17517a;
        if (c1355p != null) {
            c1355p.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.f17518b;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.f17518b;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1355p c1355p = this.f17517a;
        if (c1355p != null) {
            c1355p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1355p c1355p = this.f17517a;
        if (c1355p != null) {
            c1355p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1322X c1322x = this.f17518b;
        c1322x.i(colorStateList);
        c1322x.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1322X c1322x = this.f17518b;
        c1322x.j(mode);
        c1322x.b();
    }
}
