package n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: n.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1357q extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C1355p f17580a;

    /* renamed from: b, reason: collision with root package name */
    public final C1322X f17581b;

    /* renamed from: c, reason: collision with root package name */
    public C1371x f17582c;

    public C1357q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130903162);
    }

    private C1371x getEmojiTextViewHelper() {
        if (this.f17582c == null) {
            this.f17582c = new C1371x(this);
        }
        return this.f17582c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1355p c1355p = this.f17580a;
        if (c1355p != null) {
            c1355p.a();
        }
        C1322X c1322x = this.f17581b;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1355p c1355p = this.f17580a;
        if (c1355p != null) {
            return c1355p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1355p c1355p = this.f17580a;
        if (c1355p != null) {
            return c1355p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17581b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17581b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        super.onLayout(z2, i3, i10, i11, i12);
        C1322X c1322x = this.f17581b;
        if (c1322x != null) {
            c1322x.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        super.setAutoSizeTextTypeWithDefaults(i3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1355p c1355p = this.f17580a;
        if (c1355p != null) {
            c1355p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1355p c1355p = this.f17580a;
        if (c1355p != null) {
            c1355p.f(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        C1322X c1322x = this.f17581b;
        if (c1322x != null) {
            c1322x.f17471a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1355p c1355p = this.f17580a;
        if (c1355p != null) {
            c1355p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1355p c1355p = this.f17580a;
        if (c1355p != null) {
            c1355p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1322X c1322x = this.f17581b;
        c1322x.i(colorStateList);
        c1322x.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1322X c1322x = this.f17581b;
        c1322x.j(mode);
        c1322x.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1322X c1322x = this.f17581b;
        if (c1322x != null) {
            c1322x.g(context, i3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1357q(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        P0.a(context);
        O0.a(this, getContext());
        C1355p c1355p = new C1355p(this);
        this.f17580a = c1355p;
        c1355p.d(attributeSet, i3);
        C1322X c1322x = new C1322X(this);
        this.f17581b = c1322x;
        c1322x.f(attributeSet, i3);
        c1322x.b();
        getEmojiTextViewHelper().b(attributeSet, i3);
    }
}
