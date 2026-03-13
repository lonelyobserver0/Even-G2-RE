package com.google.android.material.chip;

import D4.g;
import D4.j;
import G.b;
import I4.k;
import I4.t;
import L.f;
import N.B;
import N.I;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n.C1359r;
import r4.AbstractC1567a;
import s4.C1599b;
import z4.C2007a;
import z4.C2008b;
import z4.InterfaceC2009c;
import z4.d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Chip extends C1359r implements InterfaceC2009c, t {

    /* renamed from: x, reason: collision with root package name */
    public static final Rect f11868x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f11869y = {R.attr.state_selected};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f11870z = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public d f11871e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f11872f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f11873g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f11874h;
    public CompoundButton.OnCheckedChangeListener j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11875k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11876l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11877m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11878n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11879p;

    /* renamed from: q, reason: collision with root package name */
    public int f11880q;

    /* renamed from: r, reason: collision with root package name */
    public int f11881r;

    /* renamed from: s, reason: collision with root package name */
    public final C2008b f11882s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f11883t;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f11884v;

    /* renamed from: w, reason: collision with root package name */
    public final g f11885w;

    public Chip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903212);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f11883t = new Rect();
        this.f11884v = new RectF();
        this.f11885w = new g(this, 1);
        if (attributeSet != null) {
            String string2 = StubApp.getString2(12462);
            String attributeValue = attributeSet.getAttributeValue(string2, StubApp.getString2(5287));
            String string22 = StubApp.getString2(12463);
            if (attributeValue != null) {
                Log.w(string22, StubApp.getString2(12464));
            }
            if (attributeSet.getAttributeValue(string2, StubApp.getString2(12465)) != null) {
                throw new UnsupportedOperationException(StubApp.getString2(12484));
            }
            if (attributeSet.getAttributeValue(string2, StubApp.getString2(12466)) != null) {
                throw new UnsupportedOperationException(StubApp.getString2(12483));
            }
            String attributeValue2 = attributeSet.getAttributeValue(string2, StubApp.getString2(12467));
            String string23 = StubApp.getString2(12468);
            if (attributeValue2 != null) {
                throw new UnsupportedOperationException(string23);
            }
            if (attributeSet.getAttributeValue(string2, StubApp.getString2(12469)) != null) {
                throw new UnsupportedOperationException(string23);
            }
            if (!attributeSet.getAttributeBooleanValue(string2, StubApp.getString2(12470), true) || attributeSet.getAttributeIntValue(string2, StubApp.getString2(9964), 1) != 1 || attributeSet.getAttributeIntValue(string2, StubApp.getString2(12471), 1) != 1 || attributeSet.getAttributeIntValue(string2, StubApp.getString2(12472), 1) != 1) {
                throw new UnsupportedOperationException(StubApp.getString2(12482));
            }
            if (attributeSet.getAttributeIntValue(string2, StubApp.getString2(12473), 8388627) != 8388627) {
                Log.w(string22, StubApp.getString2(12474));
            }
        }
        d dVar = new d(context, attributeSet);
        int[] iArr = AbstractC1567a.f20323b;
        Context context2 = dVar.f24099w0;
        j.a(context2, attributeSet, 2130903212, 2131821245);
        j.b(context2, attributeSet, iArr, 2130903212, 2131821245, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130903212, 2131821245);
        dVar.W0 = obtainStyledAttributes.hasValue(35);
        ColorStateList o5 = L1.o(context2, obtainStyledAttributes, 22);
        if (dVar.f24102z != o5) {
            dVar.f24102z = o5;
            dVar.onStateChange(dVar.getState());
        }
        ColorStateList o10 = L1.o(context2, obtainStyledAttributes, 9);
        if (dVar.f24047A != o10) {
            dVar.f24047A = o10;
            dVar.onStateChange(dVar.getState());
        }
        float dimension = obtainStyledAttributes.getDimension(17, 0.0f);
        if (dVar.f24049B != dimension) {
            dVar.f24049B = dimension;
            dVar.invalidateSelf();
            dVar.s();
        }
        if (obtainStyledAttributes.hasValue(10)) {
            dVar.x(obtainStyledAttributes.getDimension(10, 0.0f));
        }
        dVar.C(L1.o(context2, obtainStyledAttributes, 20));
        dVar.D(obtainStyledAttributes.getDimension(21, 0.0f));
        dVar.M(L1.o(context2, obtainStyledAttributes, 34));
        String text = obtainStyledAttributes.getText(4);
        text = text == null ? "" : text;
        if (!TextUtils.equals(dVar.f24059G, text)) {
            dVar.f24059G = text;
            dVar.f24052C0.f1331d = true;
            dVar.invalidateSelf();
            dVar.s();
        }
        dVar.N((!obtainStyledAttributes.hasValue(0) || (resourceId3 = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? null : new F4.d(context2, resourceId3));
        int i3 = obtainStyledAttributes.getInt(2, 0);
        if (i3 == 1) {
            dVar.f24081T0 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            dVar.f24081T0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            dVar.f24081T0 = TextUtils.TruncateAt.END;
        }
        dVar.B(obtainStyledAttributes.getBoolean(16, false));
        String string24 = StubApp.getString2(12475);
        if (attributeSet != null && attributeSet.getAttributeValue(string24, StubApp.getString2(12476)) != null && attributeSet.getAttributeValue(string24, StubApp.getString2(12477)) == null) {
            dVar.B(obtainStyledAttributes.getBoolean(13, false));
        }
        dVar.y(L1.p(context2, obtainStyledAttributes, 12));
        if (obtainStyledAttributes.hasValue(15)) {
            dVar.A(L1.o(context2, obtainStyledAttributes, 15));
        }
        dVar.z(obtainStyledAttributes.getDimension(14, 0.0f));
        dVar.J(obtainStyledAttributes.getBoolean(29, false));
        if (attributeSet != null && attributeSet.getAttributeValue(string24, StubApp.getString2(12478)) != null && attributeSet.getAttributeValue(string24, StubApp.getString2(12479)) == null) {
            dVar.J(obtainStyledAttributes.getBoolean(24, false));
        }
        dVar.E(L1.p(context2, obtainStyledAttributes, 23));
        dVar.I(L1.o(context2, obtainStyledAttributes, 28));
        dVar.G(obtainStyledAttributes.getDimension(26, 0.0f));
        dVar.u(obtainStyledAttributes.getBoolean(5, false));
        dVar.w(obtainStyledAttributes.getBoolean(8, false));
        if (attributeSet != null && attributeSet.getAttributeValue(string24, StubApp.getString2(12480)) != null && attributeSet.getAttributeValue(string24, StubApp.getString2(12481)) == null) {
            dVar.w(obtainStyledAttributes.getBoolean(7, false));
        }
        dVar.v(L1.p(context2, obtainStyledAttributes, 6));
        dVar.f24089m0 = (!obtainStyledAttributes.hasValue(37) || (resourceId2 = obtainStyledAttributes.getResourceId(37, 0)) == 0) ? null : C1599b.a(context2, resourceId2);
        dVar.f24090n0 = (!obtainStyledAttributes.hasValue(31) || (resourceId = obtainStyledAttributes.getResourceId(31, 0)) == 0) ? null : C1599b.a(context2, resourceId);
        float dimension2 = obtainStyledAttributes.getDimension(19, 0.0f);
        if (dVar.f24091o0 != dimension2) {
            dVar.f24091o0 = dimension2;
            dVar.invalidateSelf();
            dVar.s();
        }
        dVar.L(obtainStyledAttributes.getDimension(33, 0.0f));
        dVar.K(obtainStyledAttributes.getDimension(32, 0.0f));
        float dimension3 = obtainStyledAttributes.getDimension(39, 0.0f);
        if (dVar.f24094r0 != dimension3) {
            dVar.f24094r0 = dimension3;
            dVar.invalidateSelf();
            dVar.s();
        }
        float dimension4 = obtainStyledAttributes.getDimension(38, 0.0f);
        if (dVar.f24095s0 != dimension4) {
            dVar.f24095s0 = dimension4;
            dVar.invalidateSelf();
            dVar.s();
        }
        dVar.H(obtainStyledAttributes.getDimension(27, 0.0f));
        dVar.F(obtainStyledAttributes.getDimension(25, 0.0f));
        float dimension5 = obtainStyledAttributes.getDimension(11, 0.0f);
        if (dVar.f24098v0 != dimension5) {
            dVar.f24098v0 = dimension5;
            dVar.invalidateSelf();
            dVar.s();
        }
        dVar.f24083V0 = obtainStyledAttributes.getDimensionPixelSize(3, IntCompanionObject.MAX_VALUE);
        obtainStyledAttributes.recycle();
        j.a(context, attributeSet, 2130903212, 2131821245);
        j.b(context, attributeSet, iArr, 2130903212, 2131821245, new int[0]);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, 2130903212, 2131821245);
        this.f11879p = obtainStyledAttributes2.getBoolean(30, false);
        this.f11881r = (int) Math.ceil(obtainStyledAttributes2.getDimension(18, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes2.recycle();
        setChipDrawable(dVar);
        dVar.g(B.e(this));
        j.a(context, attributeSet, 2130903212, 2131821245);
        j.b(context, attributeSet, iArr, 2130903212, 2131821245, new int[0]);
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, iArr, 2130903212, 2131821245);
        boolean hasValue = obtainStyledAttributes3.hasValue(35);
        obtainStyledAttributes3.recycle();
        C2008b c2008b = new C2008b(this, this);
        this.f11882s = c2008b;
        I.i(this, c2008b);
        if (!hasValue) {
            setOutlineProvider(new C2007a(this));
        }
        setChecked(this.f11875k);
        setText(dVar.f24059G);
        setEllipsize(dVar.f24081T0);
        setIncludeFontPadding(false);
        f();
        if (!this.f11871e.f24082U0) {
            setSingleLine();
        }
        setGravity(8388627);
        e();
        if (this.f11879p) {
            setMinHeight(this.f11881r);
        }
        this.f11880q = getLayoutDirection();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.RectF getCloseIconTouchBounds() {
        /*
            r5 = this;
            android.graphics.RectF r0 = r5.f11884v
            r0.setEmpty()
            z4.d r1 = r5.f11871e
            if (r1 == 0) goto L52
            android.graphics.drawable.Drawable r2 = r1.f24077R
            if (r2 == 0) goto L13
            boolean r3 = r2 instanceof G.b
            if (r3 == 0) goto L14
            G.b r2 = (G.b) r2
        L13:
            r2 = 0
        L14:
            if (r2 == 0) goto L52
            android.graphics.Rect r2 = r1.getBounds()
            r0.setEmpty()
            boolean r3 = r1.Q()
            if (r3 == 0) goto L52
            float r3 = r1.f24098v0
            float r4 = r1.f24097u0
            float r3 = r3 + r4
            float r4 = r1.f24085Y
            float r3 = r3 + r4
            float r4 = r1.f24096t0
            float r3 = r3 + r4
            float r4 = r1.f24095s0
            float r3 = r3 + r4
            int r1 = r1.getLayoutDirection()
            if (r1 != 0) goto L40
            int r1 = r2.right
            float r1 = (float) r1
            r0.right = r1
            float r1 = r1 - r3
            r0.left = r1
            goto L48
        L40:
            int r1 = r2.left
            float r1 = (float) r1
            r0.left = r1
            float r1 = r1 + r3
            r0.right = r1
        L48:
            int r1 = r2.top
            float r1 = (float) r1
            r0.top = r1
            int r1 = r2.bottom
            float r1 = (float) r1
            r0.bottom = r1
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.getCloseIconTouchBounds():android.graphics.RectF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i3 = (int) closeIconTouchBounds.left;
        int i10 = (int) closeIconTouchBounds.top;
        int i11 = (int) closeIconTouchBounds.right;
        int i12 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f11883t;
        rect.set(i3, i10, i11, i12);
        return rect;
    }

    private F4.d getTextAppearance() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24052C0.f1333f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f11877m != z2) {
            this.f11877m = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f11876l != z2) {
            this.f11876l = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i3) {
        this.f11881r = i3;
        if (!this.f11879p) {
            if (this.f11872f != null) {
                this.f11872f = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                d();
                return;
            }
            return;
        }
        int max = Math.max(0, i3 - ((int) this.f11871e.f24049B));
        int max2 = Math.max(0, i3 - this.f11871e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f11872f != null) {
                this.f11872f = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                d();
                return;
            }
            return;
        }
        int i10 = max2 > 0 ? max2 / 2 : 0;
        int i11 = max > 0 ? max / 2 : 0;
        if (this.f11872f != null) {
            Rect rect = new Rect();
            this.f11872f.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                return;
            }
        }
        if (getMinHeight() != i3) {
            setMinHeight(i3);
        }
        if (getMinWidth() != i3) {
            setMinWidth(i3);
        }
        this.f11872f = new InsetDrawable((Drawable) this.f11871e, i10, i11, i10, i11);
    }

    public final boolean c() {
        d dVar = this.f11871e;
        return dVar != null && dVar.h0;
    }

    public final void d() {
        ColorStateList colorStateList = this.f11871e.f24057F;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f11873g = new RippleDrawable(colorStateList, getBackgroundDrawable(), null);
        this.f11871e.getClass();
        RippleDrawable rippleDrawable = this.f11873g;
        WeakHashMap weakHashMap = I.f4732a;
        setBackground(rippleDrawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = 0
            java.lang.Class<S.b> r1 = S.b.class
            r2 = 12485(0x30c5, float:1.7495E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r3 = 12463(0x30af, float:1.7464E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            int r4 = r11.getAction()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 10
            z4.b r7 = r10.f11882s
            r8 = 1
            if (r4 != r6) goto L6e
            java.lang.String r4 = "2374"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            java.lang.reflect.Field r4 = r1.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            r4.setAccessible(r8)     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            int r4 = r4.intValue()     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            if (r4 == r5) goto L6e
            java.lang.String r4 = "1269"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r9)     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            r1.setAccessible(r8)     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            r1.invoke(r7, r4)     // Catch: java.lang.NoSuchFieldException -> L57 java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b java.lang.NoSuchMethodException -> L5d
            goto Lcb
        L57:
            r1 = move-exception
            goto L5f
        L59:
            r1 = move-exception
            goto L63
        L5b:
            r1 = move-exception
            goto L67
        L5d:
            r1 = move-exception
            goto L6b
        L5f:
            android.util.Log.e(r3, r2, r1)
            goto L6e
        L63:
            android.util.Log.e(r3, r2, r1)
            goto L6e
        L67:
            android.util.Log.e(r3, r2, r1)
            goto L6e
        L6b:
            android.util.Log.e(r3, r2, r1)
        L6e:
            android.view.accessibility.AccessibilityManager r1 = r7.f6414h
            boolean r2 = r1.isEnabled()
            r3 = 0
            if (r2 == 0) goto Lc3
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L7e
            goto Lc3
        L7e:
            int r1 = r11.getAction()
            r2 = 7
            if (r1 == r2) goto L94
            r2 = 9
            if (r1 == r2) goto L94
            if (r1 == r6) goto L8c
            goto Lc3
        L8c:
            int r0 = r7.f6418m
            if (r0 == r5) goto Lc3
            r7.r(r5)
            goto Lcb
        L94:
            float r1 = r11.getX()
            float r2 = r11.getY()
            com.google.android.material.chip.Chip r4 = r7.f24044q
            z4.d r6 = r4.f11871e
            if (r6 == 0) goto Lbc
            android.graphics.drawable.Drawable r6 = r6.f24077R
            if (r6 == 0) goto Lae
            boolean r9 = r6 instanceof G.b
            if (r9 == 0) goto Lad
            G.b r6 = (G.b) r6
            goto Lae
        Lad:
            r0 = r6
        Lae:
            if (r0 == 0) goto Lbc
            android.graphics.RectF r0 = r4.getCloseIconTouchBounds()
            boolean r0 = r0.contains(r1, r2)
            if (r0 == 0) goto Lbc
            r0 = r8
            goto Lbd
        Lbc:
            r0 = r3
        Lbd:
            r7.r(r0)
            if (r0 == r5) goto Lc3
            goto Lcb
        Lc3:
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto Lca
            goto Lcb
        Lca:
            r8 = r3
        Lcb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C2008b c2008b = this.f11882s;
        c2008b.getClass();
        boolean z2 = false;
        int i3 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i10 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i10 = 33;
                                } else if (keyCode == 21) {
                                    i10 = 17;
                                } else if (keyCode != 22) {
                                    i10 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i3 < repeatCount && c2008b.m(i10, null)) {
                                    i3++;
                                    z10 = true;
                                }
                                z2 = z10;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i11 = c2008b.f6417l;
                    if (i11 != Integer.MIN_VALUE) {
                        Chip chip = c2008b.f24044q;
                        if (i11 == 0) {
                            chip.performClick();
                        } else if (i11 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f11874h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            chip.f11882s.q(1, 1);
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = c2008b.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = c2008b.m(1, null);
            }
        }
        if (!z2 || c2008b.f6417l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // n.C1359r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i3;
        super.drawableStateChanged();
        d dVar = this.f11871e;
        boolean z2 = false;
        if (dVar != null && d.r(dVar.f24077R)) {
            d dVar2 = this.f11871e;
            ?? isEnabled = isEnabled();
            int i10 = isEnabled;
            if (this.f11878n) {
                i10 = isEnabled + 1;
            }
            int i11 = i10;
            if (this.f11877m) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.f11876l) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (this.f11878n) {
                iArr[i3] = 16842908;
                i3++;
            }
            if (this.f11877m) {
                iArr[i3] = 16843623;
                i3++;
            }
            if (this.f11876l) {
                iArr[i3] = 16842919;
                i3++;
            }
            if (isChecked()) {
                iArr[i3] = 16842913;
            }
            if (!Arrays.equals(dVar2.f24076Q0, iArr)) {
                dVar2.f24076Q0 = iArr;
                if (dVar2.Q()) {
                    z2 = dVar2.t(dVar2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        d dVar;
        if (TextUtils.isEmpty(getText()) || (dVar = this.f11871e) == null) {
            return;
        }
        int o5 = (int) (dVar.o() + dVar.f24098v0 + dVar.f24095s0);
        d dVar2 = this.f11871e;
        int n10 = (int) (dVar2.n() + dVar2.f24091o0 + dVar2.f24094r0);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = I.f4732a;
        setPaddingRelative(n10, paddingTop, o5, paddingBottom);
    }

    public final void f() {
        TextPaint paint = getPaint();
        d dVar = this.f11871e;
        if (dVar != null) {
            paint.drawableState = dVar.getState();
        }
        F4.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.c(getContext(), paint, this.f11885w);
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f11872f;
        return insetDrawable == null ? this.f11871e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24088l0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24047A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.p();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f11871e;
    }

    public float getChipEndPadding() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24098v0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        d dVar = this.f11871e;
        if (dVar == null || (drawable = dVar.f24063I) == 0) {
            return null;
        }
        if (!(drawable instanceof b)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24068L;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24066K;
        }
        return null;
    }

    public float getChipMinHeight() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24049B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24091o0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24053D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24055E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        d dVar = this.f11871e;
        if (dVar == null || (drawable = dVar.f24077R) == 0) {
            return null;
        }
        if (!(drawable instanceof b)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24086Z;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24097u0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24085Y;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24096t0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24084X;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24081T0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        C2008b c2008b = this.f11882s;
        if (c2008b.f6417l == 1 || c2008b.f6416k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C1599b getHideMotionSpec() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24090n0;
        }
        return null;
    }

    public float getIconEndPadding() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24093q0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24092p0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24057F;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f11871e.f3151a.f3135a;
    }

    public C1599b getShowMotionSpec() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24089m0;
        }
        return null;
    }

    public float getTextEndPadding() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24095s0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        d dVar = this.f11871e;
        if (dVar != null) {
            return dVar.f24094r0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        F1.y(this, this.f11871e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f11869y);
        }
        if (c()) {
            View.mergeDrawableStates(onCreateDrawableState, f11870z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i3, Rect rect) {
        super.onFocusChanged(z2, i3, rect);
        C2008b c2008b = this.f11882s;
        int i10 = c2008b.f6417l;
        if (i10 != Integer.MIN_VALUE) {
            c2008b.j(i10);
        }
        if (z2) {
            c2008b.m(i3, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (c() || isClickable()) {
            accessibilityNodeInfo.setClassName(c() ? StubApp.getString2(5905) : StubApp.getString2(5906));
        } else {
            accessibilityNodeInfo.setClassName(StubApp.getString2(5904));
        }
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i3) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        if (this.f11880q != i3) {
            this.f11880q = i3;
            e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L25;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L46
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L41
            goto L4c
        L21:
            boolean r0 = r5.f11876l
            if (r0 == 0) goto L4c
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L4d
        L2c:
            boolean r0 = r5.f11876l
            if (r0 == 0) goto L41
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f11874h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            z4.b r0 = r5.f11882s
            r0.q(r3, r3)
            r0 = r3
            goto L42
        L41:
            r0 = r2
        L42:
            r5.setCloseIconPressed(r2)
            goto L4d
        L46:
            if (r1 == 0) goto L4c
            r5.setCloseIconPressed(r3)
            goto L2a
        L4c:
            r0 = r2
        L4d:
            if (r0 != 0) goto L57
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L56
            goto L57
        L56:
            return r2
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f11873g) {
            super.setBackground(drawable);
        } else {
            Log.w(StubApp.getString2(12463), StubApp.getString2(12464));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        Log.w(StubApp.getString2(12463), StubApp.getString2(12486));
    }

    @Override // n.C1359r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f11873g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w(StubApp.getString2(12463), StubApp.getString2(12487));
        }
    }

    @Override // n.C1359r, android.view.View
    public void setBackgroundResource(int i3) {
        Log.w(StubApp.getString2(12463), StubApp.getString2(12488));
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w(StubApp.getString2(12463), StubApp.getString2(12489));
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w(StubApp.getString2(12463), StubApp.getString2(12490));
    }

    public void setCheckable(boolean z2) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.u(z2);
        }
    }

    public void setCheckableResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.u(dVar.f24099w0.getResources().getBoolean(i3));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        d dVar = this.f11871e;
        if (dVar == null) {
            this.f11875k = z2;
            return;
        }
        if (dVar.h0) {
            boolean isChecked = isChecked();
            super.setChecked(z2);
            if (isChecked == z2 || (onCheckedChangeListener = this.j) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.v(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i3) {
        setCheckedIconVisible(i3);
    }

    public void setCheckedIconResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.v(D1.m(dVar.f24099w0, i3));
        }
    }

    public void setCheckedIconVisible(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.w(dVar.f24099w0.getResources().getBoolean(i3));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        d dVar = this.f11871e;
        if (dVar == null || dVar.f24047A == colorStateList) {
            return;
        }
        dVar.f24047A = colorStateList;
        dVar.onStateChange(dVar.getState());
    }

    public void setChipBackgroundColorResource(int i3) {
        ColorStateList j;
        d dVar = this.f11871e;
        if (dVar == null || dVar.f24047A == (j = D1.j(dVar.f24099w0, i3))) {
            return;
        }
        dVar.f24047A = j;
        dVar.onStateChange(dVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.x(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.x(dVar.f24099w0.getResources().getDimension(i3));
        }
    }

    public void setChipDrawable(d dVar) {
        d dVar2 = this.f11871e;
        if (dVar2 != dVar) {
            if (dVar2 != null) {
                dVar2.f24079S0 = new WeakReference(null);
            }
            this.f11871e = dVar;
            dVar.f24082U0 = false;
            dVar.f24079S0 = new WeakReference(this);
            b(this.f11881r);
            d();
        }
    }

    public void setChipEndPadding(float f10) {
        d dVar = this.f11871e;
        if (dVar == null || dVar.f24098v0 == f10) {
            return;
        }
        dVar.f24098v0 = f10;
        dVar.invalidateSelf();
        dVar.s();
    }

    public void setChipEndPaddingResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            float dimension = dVar.f24099w0.getResources().getDimension(i3);
            if (dVar.f24098v0 != dimension) {
                dVar.f24098v0 = dimension;
                dVar.invalidateSelf();
                dVar.s();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.y(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i3) {
        setChipIconVisible(i3);
    }

    public void setChipIconResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.y(D1.m(dVar.f24099w0, i3));
        }
    }

    public void setChipIconSize(float f10) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.z(f10);
        }
    }

    public void setChipIconSizeResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.z(dVar.f24099w0.getResources().getDimension(i3));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.A(colorStateList);
        }
    }

    public void setChipIconTintResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.A(D1.j(dVar.f24099w0, i3));
        }
    }

    public void setChipIconVisible(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.B(dVar.f24099w0.getResources().getBoolean(i3));
        }
    }

    public void setChipMinHeight(float f10) {
        d dVar = this.f11871e;
        if (dVar == null || dVar.f24049B == f10) {
            return;
        }
        dVar.f24049B = f10;
        dVar.invalidateSelf();
        dVar.s();
    }

    public void setChipMinHeightResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            float dimension = dVar.f24099w0.getResources().getDimension(i3);
            if (dVar.f24049B != dimension) {
                dVar.f24049B = dimension;
                dVar.invalidateSelf();
                dVar.s();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        d dVar = this.f11871e;
        if (dVar == null || dVar.f24091o0 == f10) {
            return;
        }
        dVar.f24091o0 = f10;
        dVar.invalidateSelf();
        dVar.s();
    }

    public void setChipStartPaddingResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            float dimension = dVar.f24099w0.getResources().getDimension(i3);
            if (dVar.f24091o0 != dimension) {
                dVar.f24091o0 = dimension;
                dVar.invalidateSelf();
                dVar.s();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.C(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.C(D1.j(dVar.f24099w0, i3));
        }
    }

    public void setChipStrokeWidth(float f10) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.D(f10);
        }
    }

    public void setChipStrokeWidthResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.D(dVar.f24099w0.getResources().getDimension(i3));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i3) {
        setText(getResources().getString(i3));
    }

    public void setCloseIcon(Drawable drawable) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.E(drawable);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        d dVar = this.f11871e;
        if (dVar == null || dVar.f24086Z == charSequence) {
            return;
        }
        String str = L.b.f3867b;
        L.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? L.b.f3870e : L.b.f3869d;
        bVar.getClass();
        if (charSequence == null) {
            spannableStringBuilder = null;
        } else {
            boolean l9 = f.f3879c.l(charSequence, charSequence.length());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean l10 = (l9 ? f.f3878b : f.f3877a).l(charSequence, charSequence.length());
            String str2 = L.b.f3868c;
            String str3 = L.b.f3867b;
            boolean z2 = bVar.f3871a;
            spannableStringBuilder2.append((CharSequence) ((z2 || !(l10 || L.b.a(charSequence) == 1)) ? (!z2 || (l10 && L.b.a(charSequence) != -1)) ? "" : str2 : str3));
            if (l9 != z2) {
                spannableStringBuilder2.append(l9 ? (char) 8235 : (char) 8234);
                spannableStringBuilder2.append(charSequence);
                spannableStringBuilder2.append((char) 8236);
            } else {
                spannableStringBuilder2.append(charSequence);
            }
            boolean l11 = (l9 ? f.f3878b : f.f3877a).l(charSequence, charSequence.length());
            if (!z2 && (l11 || L.b.b(charSequence) == 1)) {
                str2 = str3;
            } else if (!z2 || (l11 && L.b.b(charSequence) != -1)) {
                str2 = "";
            }
            spannableStringBuilder2.append((CharSequence) str2);
            spannableStringBuilder = spannableStringBuilder2;
        }
        dVar.f24086Z = spannableStringBuilder;
        dVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i3) {
        setCloseIconVisible(i3);
    }

    public void setCloseIconEndPadding(float f10) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.F(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.F(dVar.f24099w0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.E(D1.m(dVar.f24099w0, i3));
        }
    }

    public void setCloseIconSize(float f10) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.G(f10);
        }
    }

    public void setCloseIconSizeResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.G(dVar.f24099w0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.H(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.H(dVar.f24099w0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.I(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.I(D1.j(dVar.f24099w0, i3));
        }
    }

    public void setCloseIconVisible(int i3) {
        setCloseIconVisible(getResources().getBoolean(i3));
    }

    @Override // n.C1359r, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(StubApp.getString2(12483));
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException(StubApp.getString2(12468));
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // n.C1359r, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(StubApp.getString2(12483));
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException(StubApp.getString2(12468));
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i10, int i11, int i12) {
        if (i3 != 0) {
            throw new UnsupportedOperationException(StubApp.getString2(12483));
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException(StubApp.getString2(12468));
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i10, int i11, int i12) {
        if (i3 != 0) {
            throw new UnsupportedOperationException(StubApp.getString2(12483));
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException(StubApp.getString2(12468));
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i3, i10, i11, i12);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.g(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f11871e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException(StubApp.getString2(12492));
        }
        super.setEllipsize(truncateAt);
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.f24081T0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f11879p = z2;
        b(this.f11881r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i3) {
        if (i3 != 8388627) {
            Log.w(StubApp.getString2(12463), StubApp.getString2(12474));
        } else {
            super.setGravity(i3);
        }
    }

    public void setHideMotionSpec(C1599b c1599b) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.f24090n0 = c1599b;
        }
    }

    public void setHideMotionSpecResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.f24090n0 = C1599b.a(dVar.f24099w0, i3);
        }
    }

    public void setIconEndPadding(float f10) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.K(f10);
        }
    }

    public void setIconEndPaddingResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.K(dVar.f24099w0.getResources().getDimension(i3));
        }
    }

    public void setIconStartPadding(float f10) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.L(f10);
        }
    }

    public void setIconStartPaddingResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.L(dVar.f24099w0.getResources().getDimension(i3));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i3) {
        if (this.f11871e == null) {
            return;
        }
        super.setLayoutDirection(i3);
    }

    @Override // android.widget.TextView
    public void setLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException(StubApp.getString2(12482));
        }
        super.setLines(i3);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException(StubApp.getString2(12482));
        }
        super.setMaxLines(i3);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i3) {
        super.setMaxWidth(i3);
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.f24083V0 = i3;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException(StubApp.getString2(12482));
        }
        super.setMinLines(i3);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f11874h = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.M(colorStateList);
        }
        this.f11871e.getClass();
        d();
    }

    public void setRippleColorResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.M(D1.j(dVar.f24099w0, i3));
            this.f11871e.getClass();
            d();
        }
    }

    @Override // I4.t
    public void setShapeAppearanceModel(k kVar) {
        this.f11871e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C1599b c1599b) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.f24089m0 = c1599b;
        }
    }

    public void setShowMotionSpecResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.f24089m0 = C1599b.a(dVar.f24099w0, i3);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException(StubApp.getString2(12482));
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        d dVar = this.f11871e;
        if (dVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(dVar.f24082U0 ? null : charSequence, bufferType);
        d dVar2 = this.f11871e;
        if (dVar2 == null || TextUtils.equals(dVar2.f24059G, charSequence)) {
            return;
        }
        dVar2.f24059G = charSequence;
        dVar2.f24052C0.f1331d = true;
        dVar2.invalidateSelf();
        dVar2.s();
    }

    public void setTextAppearance(F4.d dVar) {
        d dVar2 = this.f11871e;
        if (dVar2 != null) {
            dVar2.N(dVar);
        }
        f();
    }

    public void setTextAppearanceResource(int i3) {
        setTextAppearance(getContext(), i3);
    }

    public void setTextEndPadding(float f10) {
        d dVar = this.f11871e;
        if (dVar == null || dVar.f24095s0 == f10) {
            return;
        }
        dVar.f24095s0 = f10;
        dVar.invalidateSelf();
        dVar.s();
    }

    public void setTextEndPaddingResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            float dimension = dVar.f24099w0.getResources().getDimension(i3);
            if (dVar.f24095s0 != dimension) {
                dVar.f24095s0 = dimension;
                dVar.invalidateSelf();
                dVar.s();
            }
        }
    }

    public void setTextStartPadding(float f10) {
        d dVar = this.f11871e;
        if (dVar == null || dVar.f24094r0 == f10) {
            return;
        }
        dVar.f24094r0 = f10;
        dVar.invalidateSelf();
        dVar.s();
    }

    public void setTextStartPaddingResource(int i3) {
        d dVar = this.f11871e;
        if (dVar != null) {
            float dimension = dVar.f24099w0.getResources().getDimension(i3);
            if (dVar.f24094r0 != dimension) {
                dVar.f24094r0 = dimension;
                dVar.invalidateSelf();
                dVar.s();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.J(z2);
        }
    }

    public void setCheckedIconVisible(boolean z2) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.w(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.B(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(StubApp.getString2(12483));
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException(StubApp.getString2(12468));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(StubApp.getString2(12484));
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException(StubApp.getString2(12491));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.N(new F4.d(dVar.f24099w0, i3));
        }
        f();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i3) {
        super.setTextAppearance(i3);
        d dVar = this.f11871e;
        if (dVar != null) {
            dVar.N(new F4.d(dVar.f24099w0, i3));
        }
        f();
    }
}
