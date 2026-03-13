package n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.gms.internal.measurement.D1;

/* renamed from: n.z, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1375z extends MultiAutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f17635d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C1355p f17636a;

    /* renamed from: b, reason: collision with root package name */
    public final C1322X f17637b;

    /* renamed from: c, reason: collision with root package name */
    public final C1296B f17638c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1375z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903103);
        P0.a(context);
        O0.a(this, getContext());
        a5.c E10 = a5.c.E(getContext(), attributeSet, f17635d, 2130903103);
        if (((TypedArray) E10.f9283c).hasValue(0)) {
            setDropDownBackgroundDrawable(E10.r(0));
        }
        E10.I();
        C1355p c1355p = new C1355p(this);
        this.f17636a = c1355p;
        c1355p.d(attributeSet, 2130903103);
        C1322X c1322x = new C1322X(this);
        this.f17637b = c1322x;
        c1322x.f(attributeSet, 2130903103);
        c1322x.b();
        C1296B c1296b = new C1296B(this);
        this.f17638c = c1296b;
        c1296b.e(attributeSet, 2130903103);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener d8 = c1296b.d(keyListener);
        if (d8 == keyListener) {
            return;
        }
        super.setKeyListener(d8);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1355p c1355p = this.f17636a;
        if (c1355p != null) {
            c1355p.a();
        }
        C1322X c1322x = this.f17637b;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1355p c1355p = this.f17636a;
        if (c1355p != null) {
            return c1355p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1355p c1355p = this.f17636a;
        if (c1355p != null) {
            return c1355p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17637b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17637b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        D1.p(editorInfo, onCreateInputConnection, this);
        return this.f17638c.f(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1355p c1355p = this.f17636a;
        if (c1355p != null) {
            c1355p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1355p c1355p = this.f17636a;
        if (c1355p != null) {
            c1355p.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.f17637b;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.f17637b;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(D1.m(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f17638c.g(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f17638c.d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1355p c1355p = this.f17636a;
        if (c1355p != null) {
            c1355p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1355p c1355p = this.f17636a;
        if (c1355p != null) {
            c1355p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1322X c1322x = this.f17637b;
        c1322x.i(colorStateList);
        c1322x.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1322X c1322x = this.f17637b;
        c1322x.j(mode);
        c1322x.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1322X c1322x = this.f17637b;
        if (c1322x != null) {
            c1322x.g(context, i3);
        }
    }
}
