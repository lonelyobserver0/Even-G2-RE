package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.gms.internal.measurement.D1;

/* renamed from: n.r, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1359r extends CheckBox {

    /* renamed from: a, reason: collision with root package name */
    public final C1363t f17594a;

    /* renamed from: b, reason: collision with root package name */
    public final C1355p f17595b;

    /* renamed from: c, reason: collision with root package name */
    public final C1322X f17596c;

    /* renamed from: d, reason: collision with root package name */
    public C1371x f17597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359r(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        P0.a(context);
        O0.a(this, getContext());
        C1363t c1363t = new C1363t(this);
        this.f17594a = c1363t;
        c1363t.c(attributeSet, i3);
        C1355p c1355p = new C1355p(this);
        this.f17595b = c1355p;
        c1355p.d(attributeSet, i3);
        C1322X c1322x = new C1322X(this);
        this.f17596c = c1322x;
        c1322x.f(attributeSet, i3);
        getEmojiTextViewHelper().b(attributeSet, i3);
    }

    private C1371x getEmojiTextViewHelper() {
        if (this.f17597d == null) {
            this.f17597d = new C1371x(this);
        }
        return this.f17597d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1355p c1355p = this.f17595b;
        if (c1355p != null) {
            c1355p.a();
        }
        C1322X c1322x = this.f17596c;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1355p c1355p = this.f17595b;
        if (c1355p != null) {
            return c1355p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1355p c1355p = this.f17595b;
        if (c1355p != null) {
            return c1355p.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C1363t c1363t = this.f17594a;
        if (c1363t != null) {
            return c1363t.f17604a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1363t c1363t = this.f17594a;
        if (c1363t != null) {
            return c1363t.f17605b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17596c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17596c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1355p c1355p = this.f17595b;
        if (c1355p != null) {
            c1355p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1355p c1355p = this.f17595b;
        if (c1355p != null) {
            c1355p.f(i3);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1363t c1363t = this.f17594a;
        if (c1363t != null) {
            if (c1363t.f17608e) {
                c1363t.f17608e = false;
            } else {
                c1363t.f17608e = true;
                c1363t.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.f17596c;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.f17596c;
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
        C1355p c1355p = this.f17595b;
        if (c1355p != null) {
            c1355p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1355p c1355p = this.f17595b;
        if (c1355p != null) {
            c1355p.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1363t c1363t = this.f17594a;
        if (c1363t != null) {
            c1363t.f17604a = colorStateList;
            c1363t.f17606c = true;
            c1363t.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1363t c1363t = this.f17594a;
        if (c1363t != null) {
            c1363t.f17605b = mode;
            c1363t.f17607d = true;
            c1363t.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1322X c1322x = this.f17596c;
        c1322x.i(colorStateList);
        c1322x.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1322X c1322x = this.f17596c;
        c1322x.j(mode);
        c1322x.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i3) {
        setButtonDrawable(D1.m(getContext(), i3));
    }
}
