package com.google.android.material.textfield;

import D4.c;
import D4.d;
import D4.j;
import I4.a;
import I4.g;
import I4.k;
import K4.b;
import K4.f;
import K4.h;
import K4.n;
import K4.o;
import K4.p;
import K4.r;
import K4.s;
import K4.t;
import K4.u;
import K4.v;
import K4.w;
import N.I;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.gms.internal.measurement.L1;
import com.google.android.material.internal.CheckableImageButton;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n.AbstractC1346k0;
import n.C1365u;
import p0.AbstractC1482f;
import r4.AbstractC1567a;
import s4.AbstractC1598a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public final int f11977A;

    /* renamed from: A0, reason: collision with root package name */
    public int f11978A0;

    /* renamed from: B, reason: collision with root package name */
    public final int f11979B;

    /* renamed from: B0, reason: collision with root package name */
    public int f11980B0;

    /* renamed from: C, reason: collision with root package name */
    public int f11981C;

    /* renamed from: C0, reason: collision with root package name */
    public final int f11982C0;

    /* renamed from: D, reason: collision with root package name */
    public int f11983D;

    /* renamed from: D0, reason: collision with root package name */
    public final int f11984D0;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f11985E;

    /* renamed from: E0, reason: collision with root package name */
    public final int f11986E0;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f11987F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f11988F0;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f11989G;

    /* renamed from: G0, reason: collision with root package name */
    public final c f11990G0;

    /* renamed from: H, reason: collision with root package name */
    public Typeface f11991H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f11992H0;

    /* renamed from: I, reason: collision with root package name */
    public final CheckableImageButton f11993I;

    /* renamed from: I0, reason: collision with root package name */
    public ValueAnimator f11994I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f11995J0;

    /* renamed from: K, reason: collision with root package name */
    public ColorStateList f11996K;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f11997K0;

    /* renamed from: L, reason: collision with root package name */
    public boolean f11998L;

    /* renamed from: O, reason: collision with root package name */
    public PorterDuff.Mode f11999O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f12000P;

    /* renamed from: R, reason: collision with root package name */
    public ColorDrawable f12001R;

    /* renamed from: T, reason: collision with root package name */
    public View.OnLongClickListener f12002T;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f12003a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f12004b;

    /* renamed from: c, reason: collision with root package name */
    public EditText f12005c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f12006d;

    /* renamed from: e, reason: collision with root package name */
    public final r f12007e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12008f;

    /* renamed from: g, reason: collision with root package name */
    public int f12009g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12010h;
    public final LinkedHashSet h0;
    public AppCompatTextView j;

    /* renamed from: k, reason: collision with root package name */
    public int f12011k;

    /* renamed from: k0, reason: collision with root package name */
    public int f12012k0;

    /* renamed from: l, reason: collision with root package name */
    public int f12013l;

    /* renamed from: l0, reason: collision with root package name */
    public final SparseArray f12014l0;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f12015m;

    /* renamed from: m0, reason: collision with root package name */
    public final CheckableImageButton f12016m0;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f12017n;

    /* renamed from: n0, reason: collision with root package name */
    public final LinkedHashSet f12018n0;

    /* renamed from: o0, reason: collision with root package name */
    public ColorStateList f12019o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12020p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f12021p0;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f12022q;

    /* renamed from: q0, reason: collision with root package name */
    public PorterDuff.Mode f12023q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12024r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f12025r0;

    /* renamed from: s, reason: collision with root package name */
    public g f12026s;

    /* renamed from: s0, reason: collision with root package name */
    public ColorDrawable f12027s0;

    /* renamed from: t, reason: collision with root package name */
    public g f12028t;

    /* renamed from: t0, reason: collision with root package name */
    public Drawable f12029t0;

    /* renamed from: u0, reason: collision with root package name */
    public final CheckableImageButton f12030u0;

    /* renamed from: v, reason: collision with root package name */
    public final k f12031v;

    /* renamed from: v0, reason: collision with root package name */
    public View.OnLongClickListener f12032v0;

    /* renamed from: w, reason: collision with root package name */
    public final int f12033w;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f12034w0;

    /* renamed from: x, reason: collision with root package name */
    public int f12035x;

    /* renamed from: x0, reason: collision with root package name */
    public ColorStateList f12036x0;

    /* renamed from: y, reason: collision with root package name */
    public final int f12037y;

    /* renamed from: y0, reason: collision with root package name */
    public final int f12038y0;

    /* renamed from: z, reason: collision with root package name */
    public int f12039z;

    /* renamed from: z0, reason: collision with root package name */
    public final int f12040z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v56 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(j.d(context, attributeSet, 2130903943, 2131821210), attributeSet, 2130903943);
        int i3;
        ?? r52;
        this.f12007e = new r(this);
        this.f11985E = new Rect();
        this.f11987F = new Rect();
        this.f11989G = new RectF();
        this.h0 = new LinkedHashSet();
        this.f12012k0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f12014l0 = sparseArray;
        this.f12018n0 = new LinkedHashSet();
        c cVar = new c(this);
        this.f11990G0 = cVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f12003a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f12004b = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        frameLayout.addView(frameLayout2);
        LinearInterpolator linearInterpolator = AbstractC1598a.f20746a;
        cVar.f1285H = linearInterpolator;
        cVar.f();
        cVar.f1284G = linearInterpolator;
        cVar.f();
        if (cVar.f1297h != 8388659) {
            cVar.f1297h = 8388659;
            cVar.f();
        }
        int[] iArr = AbstractC1567a.f20340t;
        j.a(context2, attributeSet, 2130903943, 2131821210);
        j.b(context2, attributeSet, iArr, 2130903943, 2131821210, 16, 14, 28, 32, 36);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130903943, 2131821210);
        a5.c cVar2 = new a5.c(context2, obtainStyledAttributes);
        this.f12020p = obtainStyledAttributes.getBoolean(35, true);
        setHint(obtainStyledAttributes.getText(1));
        this.f11992H0 = obtainStyledAttributes.getBoolean(34, true);
        k a3 = k.b(context2, attributeSet, 2130903943, 2131821210).a();
        this.f12031v = a3;
        this.f12033w = context2.getResources().getDimensionPixelOffset(2131099985);
        this.f12037y = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(10, context2.getResources().getDimensionPixelSize(2131099986));
        this.f11977A = dimensionPixelSize;
        this.f11979B = obtainStyledAttributes.getDimensionPixelSize(11, context2.getResources().getDimensionPixelSize(2131099987));
        this.f12039z = dimensionPixelSize;
        float dimension = obtainStyledAttributes.getDimension(8, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(7, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(6, -1.0f);
        I4.j e10 = a3.e();
        if (dimension >= 0.0f) {
            e10.f3176e = new a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e10.f3177f = new a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e10.f3178g = new a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e10.f3179h = new a(dimension4);
        }
        this.f12031v = e10.a();
        ColorStateList n10 = L1.n(context2, cVar2, 2);
        if (n10 != null) {
            int defaultColor = n10.getDefaultColor();
            this.f11980B0 = defaultColor;
            this.f11983D = defaultColor;
            if (n10.isStateful()) {
                this.f11982C0 = n10.getColorForState(new int[]{-16842910}, -1);
                this.f11984D0 = n10.getColorForState(new int[]{R.attr.state_hovered}, -1);
            } else {
                ColorStateList j = D1.j(context2, 2131034331);
                this.f11982C0 = j.getColorForState(new int[]{-16842910}, -1);
                this.f11984D0 = j.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            i3 = 0;
        } else {
            i3 = 0;
            this.f11983D = 0;
            this.f11980B0 = 0;
            this.f11982C0 = 0;
            this.f11984D0 = 0;
        }
        if (obtainStyledAttributes.hasValue(i3)) {
            ColorStateList p8 = cVar2.p(i3);
            this.f12036x0 = p8;
            this.f12034w0 = p8;
        }
        ColorStateList n11 = L1.n(context2, cVar2, 9);
        if (n11 == null || !n11.isStateful()) {
            this.f11978A0 = obtainStyledAttributes.getColor(9, 0);
            this.f12038y0 = context2.getColor(2131034349);
            this.f11986E0 = context2.getColor(2131034350);
            this.f12040z0 = context2.getColor(2131034353);
        } else {
            this.f12038y0 = n11.getDefaultColor();
            this.f11986E0 = n11.getColorForState(new int[]{-16842910}, -1);
            this.f12040z0 = n11.getColorForState(new int[]{R.attr.state_hovered}, -1);
            this.f11978A0 = n11.getColorForState(new int[]{R.attr.state_focused}, -1);
        }
        if (obtainStyledAttributes.getResourceId(36, -1) != -1) {
            r52 = 0;
            setHintTextAppearance(obtainStyledAttributes.getResourceId(36, 0));
        } else {
            r52 = 0;
        }
        int resourceId = obtainStyledAttributes.getResourceId(28, r52);
        boolean z2 = obtainStyledAttributes.getBoolean(24, r52);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131427375, frameLayout, (boolean) r52);
        this.f12030u0 = checkableImageButton;
        frameLayout.addView(checkableImageButton);
        checkableImageButton.setVisibility(8);
        if (obtainStyledAttributes.hasValue(25)) {
            setErrorIconDrawable(cVar2.r(25));
        }
        if (obtainStyledAttributes.hasValue(26)) {
            setErrorIconTintList(L1.n(context2, cVar2, 26));
        }
        if (obtainStyledAttributes.hasValue(27)) {
            setErrorIconTintMode(j.e(obtainStyledAttributes.getInt(27, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(2131755102));
        WeakHashMap weakHashMap = I.f4732a;
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int resourceId2 = obtainStyledAttributes.getResourceId(32, 0);
        boolean z10 = obtainStyledAttributes.getBoolean(31, false);
        CharSequence text = obtainStyledAttributes.getText(30);
        boolean z11 = obtainStyledAttributes.getBoolean(12, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(13, -1));
        this.f12013l = obtainStyledAttributes.getResourceId(16, 0);
        this.f12011k = obtainStyledAttributes.getResourceId(14, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131427376, (ViewGroup) frameLayout, false);
        this.f11993I = checkableImageButton2;
        frameLayout.addView(checkableImageButton2);
        checkableImageButton2.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (obtainStyledAttributes.hasValue(47)) {
            setStartIconDrawable(cVar2.r(47));
            if (obtainStyledAttributes.hasValue(46)) {
                setStartIconContentDescription(obtainStyledAttributes.getText(46));
            }
            setStartIconCheckable(obtainStyledAttributes.getBoolean(45, true));
        }
        if (obtainStyledAttributes.hasValue(48)) {
            setStartIconTintList(L1.n(context2, cVar2, 48));
        }
        if (obtainStyledAttributes.hasValue(49)) {
            setStartIconTintMode(j.e(obtainStyledAttributes.getInt(49, -1), null));
        }
        setHelperTextEnabled(z10);
        setHelperText(text);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f12013l);
        setCounterOverflowTextAppearance(this.f12011k);
        if (obtainStyledAttributes.hasValue(29)) {
            setErrorTextColor(cVar2.p(29));
        }
        if (obtainStyledAttributes.hasValue(33)) {
            setHelperTextColor(cVar2.p(33));
        }
        if (obtainStyledAttributes.hasValue(37)) {
            setHintTextColor(cVar2.p(37));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            setCounterTextColor(cVar2.p(17));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setCounterOverflowTextColor(cVar2.p(15));
        }
        setCounterEnabled(z11);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(3, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131427375, (ViewGroup) frameLayout2, false);
        this.f12016m0 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        sparseArray.append(-1, new K4.g(this, 0));
        sparseArray.append(0, new K4.g(this, 1));
        sparseArray.append(1, new t(this));
        sparseArray.append(2, new f(this));
        sparseArray.append(3, new o(this));
        if (obtainStyledAttributes.hasValue(21)) {
            setEndIconMode(obtainStyledAttributes.getInt(21, 0));
            if (obtainStyledAttributes.hasValue(20)) {
                setEndIconDrawable(cVar2.r(20));
            }
            if (obtainStyledAttributes.hasValue(19)) {
                setEndIconContentDescription(obtainStyledAttributes.getText(19));
            }
            setEndIconCheckable(obtainStyledAttributes.getBoolean(18, true));
        } else if (obtainStyledAttributes.hasValue(40)) {
            setEndIconMode(obtainStyledAttributes.getBoolean(40, false) ? 1 : 0);
            setEndIconDrawable(cVar2.r(39));
            setEndIconContentDescription(obtainStyledAttributes.getText(38));
            if (obtainStyledAttributes.hasValue(41)) {
                setEndIconTintList(L1.n(context2, cVar2, 41));
            }
            if (obtainStyledAttributes.hasValue(42)) {
                setEndIconTintMode(j.e(obtainStyledAttributes.getInt(42, -1), null));
            }
        }
        if (!obtainStyledAttributes.hasValue(40)) {
            if (obtainStyledAttributes.hasValue(22)) {
                setEndIconTintList(L1.n(context2, cVar2, 22));
            }
            if (obtainStyledAttributes.hasValue(23)) {
                setEndIconTintMode(j.e(obtainStyledAttributes.getInt(23, -1), null));
            }
        }
        cVar2.I();
        setImportantForAccessibility(2);
    }

    public static void d(CheckableImageButton checkableImageButton, boolean z2, ColorStateList colorStateList, boolean z10, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z2 || z10)) {
            drawable = drawable.mutate();
            if (z2) {
                drawable.setTintList(colorStateList);
            }
            if (z10) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private p getEndIconDelegate() {
        SparseArray sparseArray = this.f12014l0;
        p pVar = (p) sparseArray.get(this.f12012k0);
        return pVar != null ? pVar : (p) sparseArray.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.f12030u0;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (this.f12012k0 == 0 || !g()) {
            return null;
        }
        return this.f12016m0;
    }

    public static void j(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z2);
            }
        }
    }

    public static void k(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = I.f4732a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z10 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z10 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        boolean z2;
        boolean z10;
        if (this.f12005c != null) {
            throw new IllegalArgumentException(StubApp.getString2(12526));
        }
        if (this.f12012k0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i(StubApp.getString2(12524), StubApp.getString2(12525));
        }
        this.f12005c = editText;
        h();
        setTextInputAccessibilityDelegate(new v(this));
        Typeface typeface = this.f12005c.getTypeface();
        c cVar = this.f11990G0;
        F4.a aVar = cVar.f1310v;
        if (aVar != null) {
            aVar.f2215e = true;
        }
        if (cVar.f1307s != typeface) {
            cVar.f1307s = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cVar.f1308t != typeface) {
            cVar.f1308t = typeface;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z2 || z10) {
            cVar.f();
        }
        float textSize = this.f12005c.getTextSize();
        if (cVar.f1298i != textSize) {
            cVar.f1298i = textSize;
            cVar.f();
        }
        int gravity = this.f12005c.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (cVar.f1297h != i3) {
            cVar.f1297h = i3;
            cVar.f();
        }
        if (cVar.f1296g != gravity) {
            cVar.f1296g = gravity;
            cVar.f();
        }
        this.f12005c.addTextChangedListener(new K4.a(this, 3));
        if (this.f12034w0 == null) {
            this.f12034w0 = this.f12005c.getHintTextColors();
        }
        if (this.f12020p) {
            if (TextUtils.isEmpty(this.f12022q)) {
                CharSequence hint = this.f12005c.getHint();
                this.f12006d = hint;
                setHint(hint);
                this.f12005c.setHint((CharSequence) null);
            }
            this.f12024r = true;
        }
        if (this.j != null) {
            m(this.f12005c.getText().length());
        }
        o();
        this.f12007e.b();
        this.f11993I.bringToFront();
        this.f12004b.bringToFront();
        this.f12030u0.bringToFront();
        Iterator it = this.h0.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this);
        }
        r(false, true);
    }

    private void setErrorIconVisible(boolean z2) {
        this.f12030u0.setVisibility(z2 ? 0 : 8);
        this.f12004b.setVisibility(z2 ? 8 : 0);
        if (this.f12012k0 != 0) {
            return;
        }
        p();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f12022q)) {
            return;
        }
        this.f12022q = charSequence;
        c cVar = this.f11990G0;
        if (charSequence == null || !TextUtils.equals(cVar.f1311w, charSequence)) {
            cVar.f1311w = charSequence;
            cVar.f1312x = null;
            Bitmap bitmap = cVar.f1314z;
            if (bitmap != null) {
                bitmap.recycle();
                cVar.f1314z = null;
            }
            cVar.f();
        }
        if (this.f11988F0) {
            return;
        }
        i();
    }

    public final void a(float f10) {
        int i3 = 1;
        c cVar = this.f11990G0;
        if (cVar.f1292c == f10) {
            return;
        }
        if (this.f11994I0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f11994I0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC1598a.f20747b);
            this.f11994I0.setDuration(167L);
            this.f11994I0.addUpdateListener(new n(this, i3));
        }
        this.f11994I0.setFloatValues(cVar.f1292c, f10);
        this.f11994I0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i3, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f12003a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        q();
        setEditText((EditText) view);
    }

    public final void b() {
        int i3;
        int i10;
        int i11;
        g gVar = this.f12026s;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.f12031v);
        if (this.f12035x == 2 && (i10 = this.f12039z) > -1 && (i11 = this.f11981C) != 0) {
            g gVar2 = this.f12026s;
            gVar2.f3151a.j = i10;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i11);
            I4.f fVar = gVar2.f3151a;
            if (fVar.f3138d != valueOf) {
                fVar.f3138d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i12 = this.f11983D;
        if (this.f12035x == 1) {
            TypedValue v2 = F1.v(getContext(), 2130903249);
            i12 = F.a.b(this.f11983D, v2 != null ? v2.data : 0);
        }
        this.f11983D = i12;
        this.f12026s.h(ColorStateList.valueOf(i12));
        if (this.f12012k0 == 3) {
            this.f12005c.getBackground().invalidateSelf();
        }
        g gVar3 = this.f12028t;
        if (gVar3 != null) {
            if (this.f12039z > -1 && (i3 = this.f11981C) != 0) {
                gVar3.h(ColorStateList.valueOf(i3));
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        d(this.f12016m0, this.f12021p0, this.f12019o0, this.f12025r0, this.f12023q0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i3) {
        EditText editText;
        if (this.f12006d == null || (editText = this.f12005c) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i3);
            return;
        }
        boolean z2 = this.f12024r;
        this.f12024r = false;
        CharSequence hint = editText.getHint();
        this.f12005c.setHint(this.f12006d);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i3);
        } finally {
            this.f12005c.setHint(hint);
            this.f12024r = z2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f11997K0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f11997K0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        super.draw(canvas);
        if (this.f12020p) {
            c cVar = this.f11990G0;
            cVar.getClass();
            int save = canvas.save();
            if (cVar.f1312x == null || !cVar.f1291b) {
                canvas2 = canvas;
            } else {
                float f10 = cVar.f1305q;
                float f11 = cVar.f1306r;
                TextPaint textPaint = cVar.f1282E;
                textPaint.ascent();
                textPaint.descent();
                float f12 = cVar.f1278A;
                if (f12 != 1.0f) {
                    canvas.scale(f12, f12, f10, f11);
                }
                CharSequence charSequence = cVar.f1312x;
                canvas2 = canvas;
                canvas2.drawText(charSequence, 0, charSequence.length(), f10, f11, textPaint);
            }
            canvas2.restoreToCount(save);
        } else {
            canvas2 = canvas;
        }
        g gVar = this.f12028t;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f12039z;
            this.f12028t.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f11995J0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f11995J0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            D4.c r3 = r4.f11990G0
            if (r3 == 0) goto L2f
            r3.f1280C = r1
            android.content.res.ColorStateList r1 = r3.f1300l
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f1299k
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.f()
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            java.util.WeakHashMap r3 = N.I.f4732a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L3f
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            r4.r(r0, r2)
            r4.o()
            r4.s()
            if (r1 == 0) goto L4e
            r4.invalidate()
        L4e:
            r4.f11995J0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (!this.f12020p) {
            return 0;
        }
        int i3 = this.f12035x;
        c cVar = this.f11990G0;
        if (i3 == 0 || i3 == 1) {
            TextPaint textPaint = cVar.f1283F;
            textPaint.setTextSize(cVar.j);
            textPaint.setTypeface(cVar.f1307s);
            return (int) (-textPaint.ascent());
        }
        if (i3 != 2) {
            return 0;
        }
        TextPaint textPaint2 = cVar.f1283F;
        textPaint2.setTextSize(cVar.j);
        textPaint2.setTypeface(cVar.f1307s);
        return (int) ((-textPaint2.ascent()) / 2.0f);
    }

    public final boolean f() {
        return this.f12020p && !TextUtils.isEmpty(this.f12022q) && (this.f12026s instanceof h);
    }

    public final boolean g() {
        return this.f12004b.getVisibility() == 0 && this.f12016m0.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f12005c;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i3 = this.f12035x;
        if (i3 == 1 || i3 == 2) {
            return this.f12026s;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f11983D;
    }

    public int getBoxBackgroundMode() {
        return this.f12035x;
    }

    public float getBoxCornerRadiusBottomEnd() {
        g gVar = this.f12026s;
        return gVar.f3151a.f3135a.f3190h.a(gVar.d());
    }

    public float getBoxCornerRadiusBottomStart() {
        g gVar = this.f12026s;
        return gVar.f3151a.f3135a.f3189g.a(gVar.d());
    }

    public float getBoxCornerRadiusTopEnd() {
        g gVar = this.f12026s;
        return gVar.f3151a.f3135a.f3188f.a(gVar.d());
    }

    public float getBoxCornerRadiusTopStart() {
        g gVar = this.f12026s;
        return gVar.f3151a.f3135a.f3187e.a(gVar.d());
    }

    public int getBoxStrokeColor() {
        return this.f11978A0;
    }

    public int getCounterMaxLength() {
        return this.f12009g;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f12008f && this.f12010h && (appCompatTextView = this.j) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f12015m;
    }

    public ColorStateList getCounterTextColor() {
        return this.f12015m;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f12034w0;
    }

    public EditText getEditText() {
        return this.f12005c;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f12016m0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f12016m0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f12012k0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f12016m0;
    }

    public CharSequence getError() {
        r rVar = this.f12007e;
        if (rVar.f3700l) {
            return rVar.f3699k;
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f12007e.f3701m;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f12030u0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        AppCompatTextView appCompatTextView = this.f12007e.f3701m;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        r rVar = this.f12007e;
        if (rVar.f3705q) {
            return rVar.f3704p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f12007e.f3706r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f12020p) {
            return this.f12022q;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        c cVar = this.f11990G0;
        TextPaint textPaint = cVar.f1283F;
        textPaint.setTextSize(cVar.j);
        textPaint.setTypeface(cVar.f1307s);
        return -textPaint.ascent();
    }

    public final int getHintCurrentCollapsedTextColor() {
        c cVar = this.f11990G0;
        return cVar.c(cVar.f1300l);
    }

    public ColorStateList getHintTextColor() {
        return this.f12036x0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f12016m0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f12016m0.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f11993I.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f11993I.getDrawable();
    }

    public Typeface getTypeface() {
        return this.f11991H;
    }

    public final void h() {
        int i3 = this.f12035x;
        if (i3 != 0) {
            k kVar = this.f12031v;
            if (i3 == 1) {
                this.f12026s = new g(kVar);
                this.f12028t = new g();
            } else {
                if (i3 != 2) {
                    throw new IllegalArgumentException(AbstractC1482f.f(this.f12035x, StubApp.getString2(12527), new StringBuilder()));
                }
                if (!this.f12020p || (this.f12026s instanceof h)) {
                    this.f12026s = new g(kVar);
                } else {
                    this.f12026s = new h(kVar);
                }
                this.f12028t = null;
            }
        } else {
            this.f12026s = null;
            this.f12028t = null;
        }
        EditText editText = this.f12005c;
        if (editText != null && this.f12026s != null && editText.getBackground() == null && this.f12035x != 0) {
            EditText editText2 = this.f12005c;
            g gVar = this.f12026s;
            WeakHashMap weakHashMap = I.f4732a;
            editText2.setBackground(gVar);
        }
        s();
        if (this.f12035x != 0) {
            q();
        }
    }

    public final void i() {
        float measureText;
        float f10;
        float f11;
        float measureText2;
        if (f()) {
            RectF rectF = this.f11989G;
            c cVar = this.f11990G0;
            CharSequence charSequence = cVar.f1311w;
            WeakHashMap weakHashMap = I.f4732a;
            boolean l9 = (cVar.f1290a.getLayoutDirection() == 1 ? L.f.f3880d : L.f.f3879c).l(charSequence, charSequence.length());
            TextPaint textPaint = cVar.f1283F;
            Rect rect = cVar.f1294e;
            if (l9) {
                float f12 = rect.right;
                if (cVar.f1311w == null) {
                    measureText = 0.0f;
                } else {
                    textPaint.setTextSize(cVar.j);
                    textPaint.setTypeface(cVar.f1307s);
                    CharSequence charSequence2 = cVar.f1311w;
                    measureText = textPaint.measureText(charSequence2, 0, charSequence2.length());
                }
                f10 = f12 - measureText;
            } else {
                f10 = rect.left;
            }
            rectF.left = f10;
            rectF.top = rect.top;
            if (l9) {
                f11 = rect.right;
            } else {
                if (cVar.f1311w == null) {
                    measureText2 = 0.0f;
                } else {
                    textPaint.setTextSize(cVar.j);
                    textPaint.setTypeface(cVar.f1307s);
                    CharSequence charSequence3 = cVar.f1311w;
                    measureText2 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                }
                f11 = measureText2 + f10;
            }
            rectF.right = f11;
            float f13 = rect.top;
            textPaint.setTextSize(cVar.j);
            textPaint.setTypeface(cVar.f1307s);
            float f14 = (-textPaint.ascent()) + f13;
            float f15 = rectF.left;
            float f16 = this.f12033w;
            rectF.left = f15 - f16;
            rectF.top -= f16;
            rectF.right += f16;
            rectF.bottom = f14 + f16;
            rectF.offset(-getPaddingLeft(), 0.0f);
            h hVar = (h) this.f12026s;
            hVar.getClass();
            hVar.l(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public final void l(AppCompatTextView appCompatTextView, int i3) {
        try {
            appCompatTextView.setTextAppearance(i3);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(2131820924);
        appCompatTextView.setTextColor(getContext().getColor(2131034217));
    }

    public final void m(int i3) {
        boolean z2 = this.f12010h;
        if (this.f12009g == -1) {
            this.j.setText(String.valueOf(i3));
            this.j.setContentDescription(null);
            this.f12010h = false;
        } else {
            AppCompatTextView appCompatTextView = this.j;
            WeakHashMap weakHashMap = I.f4732a;
            if (appCompatTextView.getAccessibilityLiveRegion() == 1) {
                this.j.setAccessibilityLiveRegion(0);
            }
            this.f12010h = i3 > this.f12009g;
            Context context = getContext();
            this.j.setContentDescription(context.getString(this.f12010h ? 2131755049 : 2131755048, Integer.valueOf(i3), Integer.valueOf(this.f12009g)));
            if (z2 != this.f12010h) {
                n();
                if (this.f12010h) {
                    this.j.setAccessibilityLiveRegion(1);
                }
            }
            this.j.setText(getContext().getString(2131755050, Integer.valueOf(i3), Integer.valueOf(this.f12009g)));
        }
        if (this.f12005c == null || z2 == this.f12010h) {
            return;
        }
        r(false, false);
        s();
        o();
    }

    public final void n() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.j;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.f12010h ? this.f12011k : this.f12013l);
            if (!this.f12010h && (colorStateList2 = this.f12015m) != null) {
                this.j.setTextColor(colorStateList2);
            }
            if (!this.f12010h || (colorStateList = this.f12017n) == null) {
                return;
            }
            this.j.setTextColor(colorStateList);
        }
    }

    public final void o() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f12005c;
        if (editText == null || this.f12035x != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1346k0.f17554a;
        Drawable mutate = background.mutate();
        r rVar = this.f12007e;
        if (rVar.e()) {
            AppCompatTextView appCompatTextView2 = rVar.f3701m;
            mutate.setColorFilter(C1365u.c(appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
        } else if (this.f12010h && (appCompatTextView = this.j) != null) {
            mutate.setColorFilter(C1365u.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f12005c.refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        super.onLayout(z2, i3, i10, i11, i12);
        EditText editText = this.f12005c;
        if (editText != null) {
            ThreadLocal threadLocal = d.f1315a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f11985E;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = d.f1315a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            d.a(this, editText, matrix);
            ThreadLocal threadLocal3 = d.f1316b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f12028t;
            if (gVar != null) {
                int i13 = rect.bottom;
                gVar.setBounds(rect.left, i13 - this.f11979B, rect.right, i13);
            }
            if (this.f12020p) {
                EditText editText2 = this.f12005c;
                if (editText2 == null) {
                    throw new IllegalStateException();
                }
                int i14 = rect.bottom;
                Rect rect2 = this.f11987F;
                rect2.bottom = i14;
                int i15 = this.f12035x;
                if (i15 == 1) {
                    rect2.left = editText2.getCompoundPaddingLeft() + rect.left;
                    rect2.top = rect.top + this.f12037y;
                    rect2.right = rect.right - this.f12005c.getCompoundPaddingRight();
                } else if (i15 != 2) {
                    rect2.left = editText2.getCompoundPaddingLeft() + rect.left;
                    rect2.top = getPaddingTop();
                    rect2.right = rect.right - this.f12005c.getCompoundPaddingRight();
                } else {
                    rect2.left = editText2.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - e();
                    rect2.right = rect.right - this.f12005c.getPaddingRight();
                }
                c cVar = this.f11990G0;
                cVar.getClass();
                int i16 = rect2.left;
                int i17 = rect2.top;
                int i18 = rect2.right;
                int i19 = rect2.bottom;
                Rect rect3 = cVar.f1294e;
                if (rect3.left != i16 || rect3.top != i17 || rect3.right != i18 || rect3.bottom != i19) {
                    rect3.set(i16, i17, i18, i19);
                    cVar.f1281D = true;
                    cVar.e();
                }
                if (this.f12005c == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = cVar.f1283F;
                textPaint.setTextSize(cVar.f1298i);
                textPaint.setTypeface(cVar.f1308t);
                float f10 = -textPaint.ascent();
                rect2.left = this.f12005c.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f12035x != 1 || this.f12005c.getMinLines() > 1) ? rect.top + this.f12005c.getCompoundPaddingTop() : (int) (rect.centerY() - (f10 / 2.0f));
                rect2.right = rect.right - this.f12005c.getCompoundPaddingRight();
                int compoundPaddingBottom = this.f12035x == 1 ? (int) (rect2.top + f10) : rect.bottom - this.f12005c.getCompoundPaddingBottom();
                rect2.bottom = compoundPaddingBottom;
                int i20 = rect2.left;
                int i21 = rect2.top;
                int i22 = rect2.right;
                Rect rect4 = cVar.f1293d;
                if (rect4.left != i20 || rect4.top != i21 || rect4.right != i22 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i20, i21, i22, compoundPaddingBottom);
                    cVar.f1281D = true;
                    cVar.e();
                }
                cVar.f();
                if (!f() || this.f11988F0) {
                    return;
                }
                i();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int max;
        super.onMeasure(i3, i10);
        boolean z2 = false;
        if (this.f12005c != null && this.f12005c.getMeasuredHeight() < (max = Math.max(this.f12016m0.getMeasuredHeight(), this.f11993I.getMeasuredHeight()))) {
            this.f12005c.setMinimumHeight(max);
            z2 = true;
        }
        boolean p8 = p();
        if (z2 || p8) {
            this.f12005c.post(new u(this, 1));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w wVar = (w) parcelable;
        super.onRestoreInstanceState(wVar.f5920a);
        setError(wVar.f3716c);
        if (wVar.f3717d) {
            this.f12016m0.post(new u(this, 0));
        }
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w wVar = new w(super.onSaveInstanceState());
        if (this.f12007e.e()) {
            wVar.f3716c = getError();
        }
        wVar.f3717d = this.f12012k0 != 0 && this.f12016m0.f11958d;
        return wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p() {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        if (this.f12035x != 1) {
            FrameLayout frameLayout = this.f12003a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e10 = e();
            if (e10 != layoutParams.topMargin) {
                layoutParams.topMargin = e10;
                frameLayout.requestLayout();
            }
        }
    }

    public final void r(boolean z2, boolean z10) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f12005c;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f12005c;
        boolean z12 = editText2 != null && editText2.hasFocus();
        r rVar = this.f12007e;
        boolean e10 = rVar.e();
        ColorStateList colorStateList2 = this.f12034w0;
        c cVar = this.f11990G0;
        if (colorStateList2 != null) {
            cVar.g(colorStateList2);
            ColorStateList colorStateList3 = this.f12034w0;
            if (cVar.f1299k != colorStateList3) {
                cVar.f1299k = colorStateList3;
                cVar.f();
            }
        }
        if (!isEnabled) {
            int i3 = this.f11986E0;
            cVar.g(ColorStateList.valueOf(i3));
            ColorStateList valueOf = ColorStateList.valueOf(i3);
            if (cVar.f1299k != valueOf) {
                cVar.f1299k = valueOf;
                cVar.f();
            }
        } else if (e10) {
            AppCompatTextView appCompatTextView2 = rVar.f3701m;
            cVar.g(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f12010h && (appCompatTextView = this.j) != null) {
            cVar.g(appCompatTextView.getTextColors());
        } else if (z12 && (colorStateList = this.f12036x0) != null) {
            cVar.g(colorStateList);
        }
        if (z11 || (isEnabled() && (z12 || e10))) {
            if (z10 || this.f11988F0) {
                ValueAnimator valueAnimator = this.f11994I0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f11994I0.cancel();
                }
                if (z2 && this.f11992H0) {
                    a(1.0f);
                } else {
                    cVar.h(1.0f);
                }
                this.f11988F0 = false;
                if (f()) {
                    i();
                    return;
                }
                return;
            }
            return;
        }
        if (z10 || !this.f11988F0) {
            ValueAnimator valueAnimator2 = this.f11994I0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f11994I0.cancel();
            }
            if (z2 && this.f11992H0) {
                a(0.0f);
            } else {
                cVar.h(0.0f);
            }
            if (f() && !((h) this.f12026s).f3660A.isEmpty() && f()) {
                ((h) this.f12026s).l(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f11988F0 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():void");
    }

    public void setBoxBackgroundColor(int i3) {
        if (this.f11983D != i3) {
            this.f11983D = i3;
            this.f11980B0 = i3;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i3) {
        setBoxBackgroundColor(getContext().getColor(i3));
    }

    public void setBoxBackgroundMode(int i3) {
        if (i3 == this.f12035x) {
            return;
        }
        this.f12035x = i3;
        if (this.f12005c != null) {
            h();
        }
    }

    public void setBoxStrokeColor(int i3) {
        if (this.f11978A0 != i3) {
            this.f11978A0 = i3;
            s();
        }
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f12008f != z2) {
            r rVar = this.f12007e;
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.j = appCompatTextView;
                appCompatTextView.setId(2131231127);
                Typeface typeface = this.f11991H;
                if (typeface != null) {
                    this.j.setTypeface(typeface);
                }
                this.j.setMaxLines(1);
                rVar.a(this.j, 2);
                n();
                if (this.j != null) {
                    EditText editText = this.f12005c;
                    m(editText == null ? 0 : editText.getText().length());
                }
            } else {
                rVar.h(this.j, 2);
                this.j = null;
            }
            this.f12008f = z2;
        }
    }

    public void setCounterMaxLength(int i3) {
        if (this.f12009g != i3) {
            if (i3 > 0) {
                this.f12009g = i3;
            } else {
                this.f12009g = -1;
            }
            if (!this.f12008f || this.j == null) {
                return;
            }
            EditText editText = this.f12005c;
            m(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setCounterOverflowTextAppearance(int i3) {
        if (this.f12011k != i3) {
            this.f12011k = i3;
            n();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f12017n != colorStateList) {
            this.f12017n = colorStateList;
            n();
        }
    }

    public void setCounterTextAppearance(int i3) {
        if (this.f12013l != i3) {
            this.f12013l = i3;
            n();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f12015m != colorStateList) {
            this.f12015m = colorStateList;
            n();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f12034w0 = colorStateList;
        this.f12036x0 = colorStateList;
        if (this.f12005c != null) {
            r(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        j(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f12016m0.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f12016m0.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i3) {
        setEndIconContentDescription(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void setEndIconDrawable(int i3) {
        setEndIconDrawable(i3 != 0 ? D1.m(getContext(), i3) : null);
    }

    public void setEndIconMode(int i3) {
        int i10 = this.f12012k0;
        this.f12012k0 = i3;
        setEndIconVisible(i3 != 0);
        if (!getEndIconDelegate().b(this.f12035x)) {
            throw new IllegalStateException(StubApp.getString2(12528) + this.f12035x + StubApp.getString2(12529) + i3);
        }
        getEndIconDelegate().a();
        c();
        Iterator it = this.f12018n0.iterator();
        while (it.hasNext()) {
            ((s) it.next()).getClass();
            EditText editText = getEditText();
            if (editText != null && i10 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f12032v0;
        CheckableImageButton checkableImageButton = this.f12016m0;
        checkableImageButton.setOnClickListener(onClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12032v0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f12016m0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f12019o0 != colorStateList) {
            this.f12019o0 = colorStateList;
            this.f12021p0 = true;
            c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f12023q0 != mode) {
            this.f12023q0 = mode;
            this.f12025r0 = true;
            c();
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (g() != z2) {
            this.f12016m0.setVisibility(z2 ? 0 : 4);
            p();
        }
    }

    public void setError(CharSequence charSequence) {
        r rVar = this.f12007e;
        if (!rVar.f3700l) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            rVar.g();
            return;
        }
        rVar.c();
        rVar.f3699k = charSequence;
        rVar.f3701m.setText(charSequence);
        int i3 = rVar.f3698i;
        if (i3 != 1) {
            rVar.j = 1;
        }
        rVar.j(i3, rVar.j, rVar.i(rVar.f3701m, charSequence));
    }

    public void setErrorEnabled(boolean z2) {
        r rVar = this.f12007e;
        if (rVar.f3700l == z2) {
            return;
        }
        rVar.c();
        TextInputLayout textInputLayout = rVar.f3691b;
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(rVar.f3690a, null);
            rVar.f3701m = appCompatTextView;
            appCompatTextView.setId(2131231128);
            Typeface typeface = rVar.f3709u;
            if (typeface != null) {
                rVar.f3701m.setTypeface(typeface);
            }
            int i3 = rVar.f3702n;
            rVar.f3702n = i3;
            AppCompatTextView appCompatTextView2 = rVar.f3701m;
            if (appCompatTextView2 != null) {
                textInputLayout.l(appCompatTextView2, i3);
            }
            ColorStateList colorStateList = rVar.f3703o;
            rVar.f3703o = colorStateList;
            AppCompatTextView appCompatTextView3 = rVar.f3701m;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            rVar.f3701m.setVisibility(4);
            AppCompatTextView appCompatTextView4 = rVar.f3701m;
            WeakHashMap weakHashMap = I.f4732a;
            appCompatTextView4.setAccessibilityLiveRegion(1);
            rVar.a(rVar.f3701m, 0);
        } else {
            rVar.g();
            rVar.h(rVar.f3701m, 0);
            rVar.f3701m = null;
            textInputLayout.o();
            textInputLayout.s();
        }
        rVar.f3700l = z2;
    }

    public void setErrorIconDrawable(int i3) {
        setErrorIconDrawable(i3 != 0 ? D1.m(getContext(), i3) : null);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        CheckableImageButton checkableImageButton = this.f12030u0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.f12030u0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i3) {
        r rVar = this.f12007e;
        rVar.f3702n = i3;
        AppCompatTextView appCompatTextView = rVar.f3701m;
        if (appCompatTextView != null) {
            rVar.f3691b.l(appCompatTextView, i3);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        r rVar = this.f12007e;
        rVar.f3703o = colorStateList;
        AppCompatTextView appCompatTextView = rVar.f3701m;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        r rVar = this.f12007e;
        if (isEmpty) {
            if (rVar.f3705q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!rVar.f3705q) {
            setHelperTextEnabled(true);
        }
        rVar.c();
        rVar.f3704p = charSequence;
        rVar.f3706r.setText(charSequence);
        int i3 = rVar.f3698i;
        if (i3 != 2) {
            rVar.j = 2;
        }
        rVar.j(i3, rVar.j, rVar.i(rVar.f3706r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        r rVar = this.f12007e;
        rVar.f3708t = colorStateList;
        AppCompatTextView appCompatTextView = rVar.f3706r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        r rVar = this.f12007e;
        if (rVar.f3705q == z2) {
            return;
        }
        rVar.c();
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(rVar.f3690a, null);
            rVar.f3706r = appCompatTextView;
            appCompatTextView.setId(2131231129);
            Typeface typeface = rVar.f3709u;
            if (typeface != null) {
                rVar.f3706r.setTypeface(typeface);
            }
            rVar.f3706r.setVisibility(4);
            AppCompatTextView appCompatTextView2 = rVar.f3706r;
            WeakHashMap weakHashMap = I.f4732a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i3 = rVar.f3707s;
            rVar.f3707s = i3;
            AppCompatTextView appCompatTextView3 = rVar.f3706r;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i3);
            }
            ColorStateList colorStateList = rVar.f3708t;
            rVar.f3708t = colorStateList;
            AppCompatTextView appCompatTextView4 = rVar.f3706r;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            rVar.a(rVar.f3706r, 1);
        } else {
            rVar.c();
            int i10 = rVar.f3698i;
            if (i10 == 2) {
                rVar.j = 0;
            }
            rVar.j(i10, rVar.j, rVar.i(rVar.f3706r, null));
            rVar.h(rVar.f3706r, 1);
            rVar.f3706r = null;
            TextInputLayout textInputLayout = rVar.f3691b;
            textInputLayout.o();
            textInputLayout.s();
        }
        rVar.f3705q = z2;
    }

    public void setHelperTextTextAppearance(int i3) {
        r rVar = this.f12007e;
        rVar.f3707s = i3;
        AppCompatTextView appCompatTextView = rVar.f3706r;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i3);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f12020p) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f11992H0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f12020p) {
            this.f12020p = z2;
            if (z2) {
                CharSequence hint = this.f12005c.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f12022q)) {
                        setHint(hint);
                    }
                    this.f12005c.setHint((CharSequence) null);
                }
                this.f12024r = true;
            } else {
                this.f12024r = false;
                if (!TextUtils.isEmpty(this.f12022q) && TextUtils.isEmpty(this.f12005c.getHint())) {
                    this.f12005c.setHint(this.f12022q);
                }
                setHintInternal(null);
            }
            if (this.f12005c != null) {
                q();
            }
        }
    }

    public void setHintTextAppearance(int i3) {
        c cVar = this.f11990G0;
        TextInputLayout textInputLayout = cVar.f1290a;
        F4.d dVar = new F4.d(textInputLayout.getContext(), i3);
        ColorStateList colorStateList = dVar.f2222b;
        if (colorStateList != null) {
            cVar.f1300l = colorStateList;
        }
        float f10 = dVar.f2221a;
        if (f10 != 0.0f) {
            cVar.j = f10;
        }
        ColorStateList colorStateList2 = dVar.f2226f;
        if (colorStateList2 != null) {
            cVar.f1289L = colorStateList2;
        }
        cVar.f1287J = dVar.f2227g;
        cVar.f1288K = dVar.f2228h;
        cVar.f1286I = dVar.f2229i;
        F4.a aVar = cVar.f1310v;
        if (aVar != null) {
            aVar.f2215e = true;
        }
        A0.c cVar2 = new A0.c(cVar);
        dVar.a();
        cVar.f1310v = new F4.a(cVar2, dVar.f2231l);
        dVar.b(textInputLayout.getContext(), cVar.f1310v);
        cVar.f();
        this.f12036x0 = cVar.f1300l;
        if (this.f12005c != null) {
            r(false, false);
            q();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f12036x0 != colorStateList) {
            if (this.f12034w0 == null) {
                this.f11990G0.g(colorStateList);
            }
            this.f12036x0 = colorStateList;
            if (this.f12005c != null) {
                r(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i3) {
        setPasswordVisibilityToggleContentDescription(i3 != 0 ? getResources().getText(i3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i3) {
        setPasswordVisibilityToggleDrawable(i3 != 0 ? D1.m(getContext(), i3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.f12012k0 != 1) {
            setEndIconMode(1);
        } else {
            if (z2) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f12019o0 = colorStateList;
        this.f12021p0 = true;
        c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f12023q0 = mode;
        this.f12025r0 = true;
        c();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f11993I.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i3) {
        setStartIconContentDescription(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void setStartIconDrawable(int i3) {
        setStartIconDrawable(i3 != 0 ? D1.m(getContext(), i3) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f12002T;
        CheckableImageButton checkableImageButton = this.f11993I;
        checkableImageButton.setOnClickListener(onClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12002T = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f11993I;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f11996K != colorStateList) {
            this.f11996K = colorStateList;
            this.f11998L = true;
            d(this.f11993I, true, colorStateList, this.f12000P, this.f11999O);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f11999O != mode) {
            this.f11999O = mode;
            this.f12000P = true;
            d(this.f11993I, this.f11998L, this.f11996K, true, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        CheckableImageButton checkableImageButton = this.f11993I;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            p();
        }
    }

    public void setTextInputAccessibilityDelegate(v vVar) {
        EditText editText = this.f12005c;
        if (editText != null) {
            I.i(editText, vVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z2;
        if (typeface != this.f11991H) {
            this.f11991H = typeface;
            c cVar = this.f11990G0;
            F4.a aVar = cVar.f1310v;
            boolean z10 = true;
            if (aVar != null) {
                aVar.f2215e = true;
            }
            if (cVar.f1307s != typeface) {
                cVar.f1307s = typeface;
                z2 = true;
            } else {
                z2 = false;
            }
            if (cVar.f1308t != typeface) {
                cVar.f1308t = typeface;
            } else {
                z10 = false;
            }
            if (z2 || z10) {
                cVar.f();
            }
            r rVar = this.f12007e;
            if (typeface != rVar.f3709u) {
                rVar.f3709u = typeface;
                AppCompatTextView appCompatTextView = rVar.f3701m;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = rVar.f3706r;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.j;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f12016m0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f12016m0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f12030u0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f12007e.f3700l);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f11993I.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f11993I;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            d(checkableImageButton, this.f11998L, this.f11996K, this.f12000P, this.f11999O);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f12016m0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f12016m0.setImageDrawable(drawable);
    }
}
