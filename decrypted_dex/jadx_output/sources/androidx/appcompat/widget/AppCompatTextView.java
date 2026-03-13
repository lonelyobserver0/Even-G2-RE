package androidx.appcompat.widget;

import F.e;
import L.c;
import L.d;
import N.AbstractC0172s;
import Y3.a;
import a4.f;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.D1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import n.C1296B;
import n.C1317S;
import n.C1322X;
import n.C1324Z;
import n.C1355p;
import n.C1371x;
import n.InterfaceC1323Y;
import n.O0;
import n.P0;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AppCompatTextView extends TextView {
    private final C1355p mBackgroundTintHelper;
    private C1371x mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<d> mPrecomputedTextFuture;
    private InterfaceC1323Y mSuperCaller;
    private final C1317S mTextClassifierHelper;
    private final C1322X mTextHelper;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C1371x getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C1371x(this);
        }
        return this.mEmojiTextViewHelper;
    }

    public final void d() {
        Future<d> future = this.mPrecomputedTextFuture;
        if (future == null) {
            return;
        }
        try {
            this.mPrecomputedTextFuture = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            PrecomputedText.Params textMetricsParams = getTextMetricsParams();
            textMetricsParams.getTextPaint();
            textMetricsParams.getTextDirection();
            textMetricsParams.getBreakStrategy();
            textMetricsParams.getHyphenationFrequency();
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1355p c1355p = this.mBackgroundTintHelper;
        if (c1355p != null) {
            c1355p.a();
        }
        C1322X c1322x = this.mTextHelper;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC1323Y getSuperCaller() {
        if (this.mSuperCaller == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.mSuperCaller = new C1324Z(this);
            } else {
                this.mSuperCaller = new C1296B(this);
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1355p c1355p = this.mBackgroundTintHelper;
        if (c1355p != null) {
            return c1355p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1355p c1355p = this.mBackgroundTintHelper;
        if (c1355p != null) {
            return c1355p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public c getTextMetricsParamsCompat() {
        return new c(getTextMetricsParams());
    }

    public boolean isEmojiCompatEnabled() {
        return ((a) getEmojiTextViewHelper().f17629b.f20712b).n();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        C1322X.h(editorInfo, onCreateInputConnection, this);
        D1.p(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || i3 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        super.onLayout(z2, i3, i10, i11, i12);
        C1322X c1322x = this.mTextHelper;
        if (c1322x != null) {
            c1322x.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i10) {
        d();
        super.onMeasure(i3, i10);
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
    public void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i10, int i11, int i12) throws IllegalArgumentException {
        super.setAutoSizeTextTypeUniformWithConfiguration(i3, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) throws IllegalArgumentException {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        super.setAutoSizeTextTypeWithDefaults(i3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1355p c1355p = this.mBackgroundTintHelper;
        if (c1355p != null) {
            c1355p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1355p c1355p = this.mBackgroundTintHelper;
        if (c1355p != null) {
            c1355p.f(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.mTextHelper;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.mTextHelper;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.mTextHelper;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.mTextHelper;
        if (c1322x != null) {
            c1322x.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        getSuperCaller().b(i3);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        getSuperCaller().a(i3);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        AbstractC1526a.J(this, i3);
    }

    public void setPrecomputedText(d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        PrecomputedText.Params textMetricsParams = getTextMetricsParams();
        textMetricsParams.getTextPaint();
        textMetricsParams.getTextDirection();
        textMetricsParams.getBreakStrategy();
        textMetricsParams.getHyphenationFrequency();
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1355p c1355p = this.mBackgroundTintHelper;
        if (c1355p != null) {
            c1355p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1355p c1355p = this.mBackgroundTintHelper;
        if (c1355p != null) {
            c1355p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.i(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.j(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1322X c1322x = this.mTextHelper;
        if (c1322x != null) {
            c1322x.g(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<d> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f3873b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        getPaint().set(cVar.f3872a);
        setBreakStrategy(cVar.f3874c);
        setHyphenationFrequency(cVar.f3875d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i3, float f10) {
        super.setTextSize(i3, f10);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i3) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i3 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            f fVar = e.f2170a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i3);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        P0.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        O0.a(this, getContext());
        C1355p c1355p = new C1355p(this);
        this.mBackgroundTintHelper = c1355p;
        c1355p.d(attributeSet, i3);
        C1322X c1322x = new C1322X(this);
        this.mTextHelper = c1322x;
        c1322x.f(attributeSet, i3);
        c1322x.b();
        this.mTextClassifierHelper = new C1317S();
        getEmojiTextViewHelper().b(attributeSet, i3);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3, float f10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().c(i3, f10);
        } else if (i10 >= 34) {
            AbstractC0172s.i(this, i3, f10);
        } else {
            AbstractC1526a.J(this, Math.round(TypedValue.applyDimension(i3, f10, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? D1.m(context, i3) : null, i10 != 0 ? D1.m(context, i10) : null, i11 != 0 ? D1.m(context, i11) : null, i12 != 0 ? D1.m(context, i12) : null);
        C1322X c1322x = this.mTextHelper;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i3, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? D1.m(context, i3) : null, i10 != 0 ? D1.m(context, i10) : null, i11 != 0 ? D1.m(context, i11) : null, i12 != 0 ? D1.m(context, i12) : null);
        C1322X c1322x = this.mTextHelper;
        if (c1322x != null) {
            c1322x.b();
        }
    }
}
