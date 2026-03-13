package androidx.appcompat.widget;

import N.C0176w;
import N.I;
import T1.c;
import Y.h;
import Y3.a;
import a0.C0387i;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.gms.internal.measurement.D1;
import h.AbstractC0997a;
import java.util.WeakHashMap;
import k.C1101a;
import n.AbstractC1346k0;
import n.C1322X;
import n.C1371x;
import n.O0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: o0, reason: collision with root package name */
    public static final c f9518o0 = new c(7, Float.class, "thumbPos");

    /* renamed from: p0, reason: collision with root package name */
    public static final int[] f9519p0 = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public final VelocityTracker f9520A;

    /* renamed from: B, reason: collision with root package name */
    public final int f9521B;

    /* renamed from: C, reason: collision with root package name */
    public float f9522C;

    /* renamed from: D, reason: collision with root package name */
    public int f9523D;

    /* renamed from: E, reason: collision with root package name */
    public int f9524E;

    /* renamed from: F, reason: collision with root package name */
    public int f9525F;

    /* renamed from: G, reason: collision with root package name */
    public int f9526G;

    /* renamed from: H, reason: collision with root package name */
    public int f9527H;

    /* renamed from: I, reason: collision with root package name */
    public int f9528I;

    /* renamed from: K, reason: collision with root package name */
    public int f9529K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f9530L;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f9531O;

    /* renamed from: P, reason: collision with root package name */
    public final ColorStateList f9532P;

    /* renamed from: R, reason: collision with root package name */
    public StaticLayout f9533R;

    /* renamed from: T, reason: collision with root package name */
    public StaticLayout f9534T;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f9535a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f9536b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f9537c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9538d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9539e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f9540f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f9541g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f9542h;
    public final C1101a h0;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9543k;

    /* renamed from: k0, reason: collision with root package name */
    public ObjectAnimator f9544k0;

    /* renamed from: l, reason: collision with root package name */
    public int f9545l;

    /* renamed from: l0, reason: collision with root package name */
    public C1371x f9546l0;

    /* renamed from: m, reason: collision with root package name */
    public int f9547m;

    /* renamed from: m0, reason: collision with root package name */
    public C0387i f9548m0;

    /* renamed from: n, reason: collision with root package name */
    public int f9549n;

    /* renamed from: n0, reason: collision with root package name */
    public final Rect f9550n0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9551p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f9552q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f9553r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f9554s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f9555t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9556v;

    /* renamed from: w, reason: collision with root package name */
    public int f9557w;

    /* renamed from: x, reason: collision with root package name */
    public final int f9558x;

    /* renamed from: y, reason: collision with root package name */
    public float f9559y;

    /* renamed from: z, reason: collision with root package name */
    public float f9560z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903886);
        int resourceId;
        this.f9536b = null;
        this.f9537c = null;
        this.f9538d = false;
        this.f9539e = false;
        this.f9541g = null;
        this.f9542h = null;
        this.j = false;
        this.f9543k = false;
        this.f9520A = VelocityTracker.obtain();
        this.f9530L = true;
        this.f9550n0 = new Rect();
        O0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f9531O = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0997a.f14414v;
        a5.c E10 = a5.c.E(context, attributeSet, iArr, 2130903886);
        I.h(this, context, iArr, attributeSet, (TypedArray) E10.f9283c, 2130903886);
        Drawable r8 = E10.r(2);
        this.f9535a = r8;
        if (r8 != null) {
            r8.setCallback(this);
        }
        Drawable r10 = E10.r(11);
        this.f9540f = r10;
        if (r10 != null) {
            r10.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) E10.f9283c;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f9556v = typedArray.getBoolean(3, true);
        this.f9545l = typedArray.getDimensionPixelSize(8, 0);
        this.f9547m = typedArray.getDimensionPixelSize(5, 0);
        this.f9549n = typedArray.getDimensionPixelSize(6, 0);
        this.f9551p = typedArray.getBoolean(4, false);
        ColorStateList p8 = E10.p(9);
        if (p8 != null) {
            this.f9536b = p8;
            this.f9538d = true;
        }
        PorterDuff.Mode c10 = AbstractC1346k0.c(typedArray.getInt(10, -1), null);
        if (this.f9537c != c10) {
            this.f9537c = c10;
            this.f9539e = true;
        }
        if (this.f9538d || this.f9539e) {
            a();
        }
        ColorStateList p9 = E10.p(12);
        if (p9 != null) {
            this.f9541g = p9;
            this.j = true;
        }
        PorterDuff.Mode c11 = AbstractC1346k0.c(typedArray.getInt(13, -1), null);
        if (this.f9542h != c11) {
            this.f9542h = c11;
            this.f9543k = true;
        }
        if (this.j || this.f9543k) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0997a.f14415w);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = D1.j(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f9532P = colorStateList;
            } else {
                this.f9532P = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i3 = obtainStyledAttributes.getInt(1, -1);
            int i10 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i3 != 1 ? i3 != 2 ? i3 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i10 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
                setSwitchTypeface(defaultFromStyle);
                int i11 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i10;
                textPaint.setFakeBoldText((i11 & 1) != 0);
                textPaint.setTextSkewX((2 & i11) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C1101a c1101a = new C1101a();
                c1101a.f15419a = context2.getResources().getConfiguration().locale;
                this.h0 = c1101a;
            } else {
                this.h0 = null;
            }
            setTextOnInternal(this.f9552q);
            setTextOffInternal(this.f9554s);
            obtainStyledAttributes.recycle();
        }
        new C1322X(this).f(attributeSet, 2130903886);
        E10.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f9558x = viewConfiguration.getScaledTouchSlop();
        this.f9521B = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, 2130903886);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C1371x getEmojiTextViewHelper() {
        if (this.f9546l0 == null) {
            this.f9546l0 = new C1371x(this);
        }
        return this.f9546l0;
    }

    private boolean getTargetCheckedState() {
        return this.f9522C > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f9522C : this.f9522C) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f9540f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f9550n0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f9535a;
        Rect b2 = drawable2 != null ? AbstractC1346k0.b(drawable2) : AbstractC1346k0.f17556c;
        return ((((this.f9523D - this.f9525F) - rect.left) - rect.right) - b2.left) - b2.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f9554s = charSequence;
        C1371x emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod D6 = ((a) emojiTextViewHelper.f17629b.f20712b).D(this.h0);
        if (D6 != null) {
            charSequence = D6.getTransformation(charSequence, this);
        }
        this.f9555t = charSequence;
        this.f9534T = null;
        if (this.f9556v) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f9552q = charSequence;
        C1371x emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod D6 = ((a) emojiTextViewHelper.f17629b.f20712b).D(this.h0);
        if (D6 != null) {
            charSequence = D6.getTransformation(charSequence, this);
        }
        this.f9553r = charSequence;
        this.f9533R = null;
        if (this.f9556v) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f9535a;
        if (drawable != null) {
            if (this.f9538d || this.f9539e) {
                Drawable mutate = drawable.mutate();
                this.f9535a = mutate;
                if (this.f9538d) {
                    mutate.setTintList(this.f9536b);
                }
                if (this.f9539e) {
                    this.f9535a.setTintMode(this.f9537c);
                }
                if (this.f9535a.isStateful()) {
                    this.f9535a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f9540f;
        if (drawable != null) {
            if (this.j || this.f9543k) {
                Drawable mutate = drawable.mutate();
                this.f9540f = mutate;
                if (this.j) {
                    mutate.setTintList(this.f9541g);
                }
                if (this.f9543k) {
                    this.f9540f.setTintMode(this.f9542h);
                }
                if (this.f9540f.isStateful()) {
                    this.f9540f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f9552q);
        setTextOffInternal(this.f9554s);
        requestLayout();
    }

    public final void d() {
        if (this.f9548m0 == null && ((a) this.f9546l0.f17629b.f20712b).n() && h.f8658k != null) {
            h a3 = h.a();
            int b2 = a3.b();
            if (b2 == 3 || b2 == 0) {
                C0387i c0387i = new C0387i(this);
                this.f9548m0 = c0387i;
                a3.f(c0387i);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        int i10;
        int i11 = this.f9526G;
        int i12 = this.f9527H;
        int i13 = this.f9528I;
        int i14 = this.f9529K;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.f9535a;
        Rect b2 = drawable != null ? AbstractC1346k0.b(drawable) : AbstractC1346k0.f17556c;
        Drawable drawable2 = this.f9540f;
        Rect rect = this.f9550n0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i15 = rect.left;
            thumbOffset += i15;
            if (b2 != null) {
                int i16 = b2.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = b2.top;
                int i18 = rect.top;
                i3 = i17 > i18 ? (i17 - i18) + i12 : i12;
                int i19 = b2.right;
                int i20 = rect.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = b2.bottom;
                int i22 = rect.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                    this.f9540f.setBounds(i11, i3, i13, i10);
                }
            } else {
                i3 = i12;
            }
            i10 = i14;
            this.f9540f.setBounds(i11, i3, i13, i10);
        }
        Drawable drawable3 = this.f9535a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i23 = thumbOffset - rect.left;
            int i24 = thumbOffset + this.f9525F + rect.right;
            this.f9535a.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f9535a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
        Drawable drawable2 = this.f9540f;
        if (drawable2 != null) {
            drawable2.setHotspot(f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9535a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f9540f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f9523D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f9549n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f9523D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f9549n : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public boolean getShowText() {
        return this.f9556v;
    }

    public boolean getSplitTrack() {
        return this.f9551p;
    }

    public int getSwitchMinWidth() {
        return this.f9547m;
    }

    public int getSwitchPadding() {
        return this.f9549n;
    }

    public CharSequence getTextOff() {
        return this.f9554s;
    }

    public CharSequence getTextOn() {
        return this.f9552q;
    }

    public Drawable getThumbDrawable() {
        return this.f9535a;
    }

    public final float getThumbPosition() {
        return this.f9522C;
    }

    public int getThumbTextPadding() {
        return this.f9545l;
    }

    public ColorStateList getThumbTintList() {
        return this.f9536b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f9537c;
    }

    public Drawable getTrackDrawable() {
        return this.f9540f;
    }

    public ColorStateList getTrackTintList() {
        return this.f9541g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f9542h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9535a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f9540f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f9544k0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f9544k0.end();
        this.f9544k0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9519p0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f9540f;
        Rect rect = this.f9550n0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.f9527H;
        int i10 = this.f9529K;
        int i11 = i3 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.f9535a;
        if (drawable != null) {
            if (!this.f9551p || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b2 = AbstractC1346k0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b2.left;
                rect.right -= b2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f9533R : this.f9534T;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f9532P;
            TextPaint textPaint = this.f9531O;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i11 + i12) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f9552q : this.f9554s;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        int i13;
        int width;
        int i14;
        int i15;
        int i16;
        super.onLayout(z2, i3, i10, i11, i12);
        int i17 = 0;
        if (this.f9535a != null) {
            Drawable drawable = this.f9540f;
            Rect rect = this.f9550n0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b2 = AbstractC1346k0.b(this.f9535a);
            i13 = Math.max(0, b2.left - rect.left);
            i17 = Math.max(0, b2.right - rect.right);
        } else {
            i13 = 0;
        }
        if (getLayoutDirection() == 1) {
            i14 = getPaddingLeft() + i13;
            width = ((this.f9523D + i14) - i13) - i17;
        } else {
            width = (getWidth() - getPaddingRight()) - i17;
            i14 = (width - this.f9523D) + i13 + i17;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i18 = this.f9524E;
            int i19 = height - (i18 / 2);
            i15 = i18 + i19;
            i16 = i19;
        } else if (gravity != 80) {
            i16 = getPaddingTop();
            i15 = this.f9524E + i16;
        } else {
            i15 = getHeight() - getPaddingBottom();
            i16 = i15 - this.f9524E;
        }
        this.f9526G = i14;
        this.f9527H = i16;
        this.f9529K = i15;
        this.f9528I = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13 = 0;
        if (this.f9556v) {
            StaticLayout staticLayout = this.f9533R;
            TextPaint textPaint = this.f9531O;
            if (staticLayout == null) {
                CharSequence charSequence = this.f9553r;
                this.f9533R = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f9534T == null) {
                CharSequence charSequence2 = this.f9555t;
                this.f9534T = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f9535a;
        Rect rect = this.f9550n0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i11 = (this.f9535a.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.f9535a.getIntrinsicHeight();
        } else {
            i11 = 0;
            i12 = 0;
        }
        this.f9525F = Math.max(this.f9556v ? (this.f9545l * 2) + Math.max(this.f9533R.getWidth(), this.f9534T.getWidth()) : 0, i11);
        Drawable drawable2 = this.f9540f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i13 = this.f9540f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i14 = rect.left;
        int i15 = rect.right;
        Drawable drawable3 = this.f9535a;
        if (drawable3 != null) {
            Rect b2 = AbstractC1346k0.b(drawable3);
            i14 = Math.max(i14, b2.left);
            i15 = Math.max(i15, b2.right);
        }
        int max = this.f9530L ? Math.max(this.f9547m, (this.f9525F * 2) + i14 + i15) : this.f9547m;
        int max2 = Math.max(i13, i12);
        this.f9523D = max;
        this.f9524E = max2;
        super.onMeasure(i3, i10);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f9552q : this.f9554s;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f9552q;
                if (obj == null) {
                    obj = getResources().getString(2131755016);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = I.f4732a;
                new C0176w(2131231108, CharSequence.class, 64, 30, 2).d(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f9554s;
            if (obj3 == null) {
                obj3 = getResources().getString(2131755015);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = I.f4732a;
            new C0176w(2131231108, CharSequence.class, 64, 30, 2).d(this, obj4);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f9544k0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f9518o0, isChecked ? 1.0f : 0.0f);
        this.f9544k0 = ofFloat;
        ofFloat.setDuration(250L);
        this.f9544k0.setAutoCancel(true);
        this.f9544k0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
        setTextOnInternal(this.f9552q);
        setTextOffInternal(this.f9554s);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.f9530L = z2;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.f9556v != z2) {
            this.f9556v = z2;
            requestLayout();
            if (z2) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f9551p = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i3) {
        this.f9547m = i3;
        requestLayout();
    }

    public void setSwitchPadding(int i3) {
        this.f9549n = i3;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f9531O;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f9554s;
        if (obj == null) {
            obj = getResources().getString(2131755015);
        }
        WeakHashMap weakHashMap = I.f4732a;
        new C0176w(2131231108, CharSequence.class, 64, 30, 2).d(this, obj);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f9552q;
        if (obj == null) {
            obj = getResources().getString(2131755016);
        }
        WeakHashMap weakHashMap = I.f4732a;
        new C0176w(2131231108, CharSequence.class, 64, 30, 2).d(this, obj);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f9535a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9535a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f9522C = f10;
        invalidate();
    }

    public void setThumbResource(int i3) {
        setThumbDrawable(D1.m(getContext(), i3));
    }

    public void setThumbTextPadding(int i3) {
        this.f9545l = i3;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f9536b = colorStateList;
        this.f9538d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f9537c = mode;
        this.f9539e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f9540f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9540f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i3) {
        setTrackDrawable(D1.m(getContext(), i3));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f9541g = colorStateList;
        this.j = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f9542h = mode;
        this.f9543k = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9535a || drawable == this.f9540f;
    }
}
