package androidx.coordinatorlayout.widget;

import A.b;
import A.d;
import A.e;
import A.f;
import A.h;
import A.i;
import A.j;
import D5.B;
import M.c;
import N.AbstractC0179z;
import N.I;
import N.InterfaceC0165k;
import N.InterfaceC0166l;
import N.c0;
import Z9.n;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import t.C1697j;
import z.AbstractC1984a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0165k, InterfaceC0166l {

    /* renamed from: A, reason: collision with root package name */
    public static final c f9632A;

    /* renamed from: w, reason: collision with root package name */
    public static final String f9633w;

    /* renamed from: x, reason: collision with root package name */
    public static final Class[] f9634x;

    /* renamed from: y, reason: collision with root package name */
    public static final ThreadLocal f9635y;

    /* renamed from: z, reason: collision with root package name */
    public static final i f9636z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9637a;

    /* renamed from: b, reason: collision with root package name */
    public final B f9638b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9639c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9640d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f9641e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f9642f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9643g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9644h;
    public final int[] j;

    /* renamed from: k, reason: collision with root package name */
    public View f9645k;

    /* renamed from: l, reason: collision with root package name */
    public View f9646l;

    /* renamed from: m, reason: collision with root package name */
    public f f9647m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9648n;

    /* renamed from: p, reason: collision with root package name */
    public c0 f9649p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9650q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f9651r;

    /* renamed from: s, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f9652s;

    /* renamed from: t, reason: collision with root package name */
    public F5.c f9653t;

    /* renamed from: v, reason: collision with root package name */
    public final n f9654v;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f9633w = r02 != null ? r02.getName() : null;
        f9636z = new i(0);
        f9634x = new Class[]{Context.class, AttributeSet.class};
        f9635y = new ThreadLocal();
        f9632A = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903269);
        this.f9637a = new ArrayList();
        this.f9638b = new B(1);
        this.f9639c = new ArrayList();
        this.f9640d = new ArrayList();
        this.f9641e = new int[2];
        this.f9642f = new int[2];
        this.f9654v = new n(1);
        int[] iArr = AbstractC1984a.f23634a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 2130903269, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 2130903269, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.j = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.j[i3] = (int) (r2[i3] * f10);
            }
        }
        this.f9651r = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new d(this));
        WeakHashMap weakHashMap = I.f4732a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f9632A.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i3, Rect rect, Rect rect2, e eVar, int i10, int i11) {
        int i12 = eVar.f10c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i3);
        int i13 = eVar.f11d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i3);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        int width = i16 != 1 ? i16 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i17 != 16 ? i17 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i14 == 1) {
            width -= i10 / 2;
        } else if (i14 != 5) {
            width -= i10;
        }
        if (i15 == 16) {
            height -= i11 / 2;
        } else if (i15 != 80) {
            height -= i11;
        }
        rect2.set(width, height, i10 + width, i11 + height);
    }

    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f9b) {
            A.c cVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (A.c) cls.getAnnotation(A.c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    b bVar = (b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    b bVar2 = eVar.f8a;
                    if (bVar2 != bVar) {
                        if (bVar2 != null) {
                            bVar2.e();
                        }
                        eVar.f8a = bVar;
                        eVar.f9b = true;
                        if (bVar != null) {
                            bVar.c(eVar);
                        }
                    }
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            eVar.f9b = true;
        }
        return eVar;
    }

    public static void u(View view, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i10 = eVar.f16i;
        if (i10 != i3) {
            WeakHashMap weakHashMap = I.f4732a;
            view.offsetLeftAndRight(i3 - i10);
            eVar.f16i = i3;
        }
    }

    public static void v(View view, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i10 = eVar.j;
        if (i10 != i3) {
            WeakHashMap weakHashMap = I.f4732a;
            view.offsetTopAndBottom(i3 - i10);
            eVar.j = i3;
        }
    }

    @Override // N.InterfaceC0166l
    public final void a(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i13) && (bVar = eVar.f8a) != null) {
                    int[] iArr2 = this.f9641e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.l(this, childAt, view, i3, i10, i11, i12, i13, iArr2);
                    i14 = i11 > 0 ? Math.max(i14, iArr2[0]) : Math.min(i14, iArr2[0]);
                    i15 = i12 > 0 ? Math.max(i15, iArr2[1]) : Math.min(i15, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i14;
        iArr[1] = iArr[1] + i15;
        if (z2) {
            p(1);
        }
    }

    @Override // N.InterfaceC0165k
    public final void b(View view, int i3, int i10, int i11, int i12, int i13) {
        a(view, i3, i10, i11, i12, 0, this.f9642f);
    }

    @Override // N.InterfaceC0165k
    public final boolean c(View view, View view2, int i3, int i10) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f8a;
                if (bVar != null) {
                    boolean q10 = bVar.q(this, childAt, view, view2, i3, i10);
                    z2 |= q10;
                    if (i10 == 0) {
                        eVar.f19m = q10;
                    } else if (i10 == 1) {
                        eVar.f20n = q10;
                    }
                } else if (i10 == 0) {
                    eVar.f19m = false;
                } else if (i10 == 1) {
                    eVar.f20n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // N.InterfaceC0165k
    public final void d(View view, View view2, int i3, int i10) {
        n nVar = this.f9654v;
        if (i10 == 1) {
            nVar.f9137c = i3;
        } else {
            nVar.f9136b = i3;
        }
        this.f9646l = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        b bVar = ((e) view.getLayoutParams()).f8a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9651r;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // N.InterfaceC0165k
    public final void e(View view, int i3) {
        n nVar = this.f9654v;
        if (i3 == 1) {
            nVar.f9137c = 0;
        } else {
            nVar.f9136b = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i3)) {
                b bVar = eVar.f8a;
                if (bVar != null) {
                    bVar.r(childAt, view, i3);
                }
                if (i3 == 0) {
                    eVar.f19m = false;
                } else if (i3 == 1) {
                    eVar.f20n = false;
                }
            }
        }
        this.f9646l = null;
    }

    @Override // N.InterfaceC0165k
    public final void f(View view, int i3, int i10, int[] iArr, int i11) {
        b bVar;
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z2 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i11) && (bVar = eVar.f8a) != null) {
                    int[] iArr2 = this.f9641e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.j(childAt, view, i10, iArr2, i11);
                    i12 = i3 > 0 ? Math.max(i12, iArr2[0]) : Math.min(i12, iArr2[0]);
                    i13 = i10 > 0 ? Math.max(i13, iArr2[1]) : Math.min(i13, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i12;
        iArr[1] = i13;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f9637a);
    }

    public final c0 getLastWindowInsets() {
        return this.f9649p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n nVar = this.f9654v;
        return nVar.f9137c | nVar.f9136b;
    }

    public Drawable getStatusBarBackground() {
        return this.f9651r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i3, int i10) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i3) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i3 + max, i10 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        C1697j c1697j = (C1697j) this.f9638b.f1341b;
        int i3 = c1697j.f21040c;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i3; i10++) {
            ArrayList arrayList2 = (ArrayList) c1697j.i(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1697j.f(i10));
            }
        }
        ArrayList arrayList3 = this.f9640d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = j.f27a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = j.f27a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        j.a(this, view, matrix);
        ThreadLocal threadLocal3 = j.f28b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i3) {
        int[] iArr = this.j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i3);
            return 0;
        }
        if (i3 >= 0 && i3 < iArr.length) {
            return iArr[i3];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i3 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i3, int i10) {
        c cVar = f9632A;
        Rect g10 = g();
        k(view, g10);
        try {
            return g10.contains(i3, i10);
        } finally {
            g10.setEmpty();
            cVar.b(g10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f9648n) {
            if (this.f9647m == null) {
                this.f9647m = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f9647m);
        }
        if (this.f9649p == null) {
            WeakHashMap weakHashMap = I.f4732a;
            if (getFitsSystemWindows()) {
                AbstractC0179z.c(this);
            }
        }
        this.f9644h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f9648n && this.f9647m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f9647m);
        }
        View view = this.f9646l;
        if (view != null) {
            e(view, 0);
        }
        this.f9644h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f9650q || this.f9651r == null) {
            return;
        }
        c0 c0Var = this.f9649p;
        int d8 = c0Var != null ? c0Var.d() : 0;
        if (d8 > 0) {
            this.f9651r.setBounds(0, 0, getWidth(), d8);
            this.f9651r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r8 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r8;
        }
        t(true);
        return r8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        b bVar;
        WeakHashMap weakHashMap = I.f4732a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f9637a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f8a) == null || !bVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        boolean z2;
        ArrayList arrayList;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        b bVar;
        e eVar;
        View view;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        int max;
        s();
        int childCount = getChildCount();
        int i20 = 0;
        loop0: while (true) {
            if (i20 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = getChildAt(i20);
            C1697j c1697j = (C1697j) this.f9638b.f1341b;
            int i21 = c1697j.f21040c;
            for (int i22 = 0; i22 < i21; i22++) {
                ArrayList arrayList2 = (ArrayList) c1697j.i(i22);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i20++;
        }
        if (z2 != this.f9648n) {
            if (z2) {
                if (this.f9644h) {
                    if (this.f9647m == null) {
                        this.f9647m = new f(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f9647m);
                }
                this.f9648n = true;
            } else {
                if (this.f9644h && this.f9647m != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f9647m);
                }
                this.f9648n = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = I.f4732a;
        int layoutDirection = getLayoutDirection();
        boolean z12 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i23 = paddingLeft + paddingRight;
        int i24 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z13 = this.f9649p != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.f9637a;
        int size3 = arrayList3.size();
        int i25 = 0;
        int i26 = 0;
        while (i25 < size3) {
            View view2 = (View) arrayList3.get(i25);
            int i27 = suggestedMinimumWidth;
            int i28 = suggestedMinimumHeight;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i13 = size3;
                i17 = paddingRight;
                suggestedMinimumWidth = i27;
                suggestedMinimumHeight = i28;
                z10 = false;
                i16 = i25;
                i18 = paddingLeft;
            } else {
                e eVar2 = (e) view2.getLayoutParams();
                int i29 = eVar2.f12e;
                if (i29 < 0 || mode == 0) {
                    arrayList = arrayList3;
                } else {
                    int m4 = m(i29);
                    int i30 = eVar2.f10c;
                    if (i30 == 0) {
                        i30 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i30, layoutDirection) & 7;
                    arrayList = arrayList3;
                    if ((absoluteGravity == 3 && !z12) || (absoluteGravity == 5 && z12)) {
                        z11 = false;
                        max = Math.max(0, (size - paddingRight) - m4);
                    } else if ((absoluteGravity == 5 && !z12) || (absoluteGravity == 3 && z12)) {
                        z11 = false;
                        max = Math.max(0, m4 - paddingLeft);
                    }
                    z10 = z11;
                    i11 = max;
                    if (z13 || view2.getFitsSystemWindows()) {
                        i12 = i3;
                        i13 = size3;
                        i14 = i10;
                    } else {
                        int c10 = this.f9649p.c() + this.f9649p.b();
                        int a3 = this.f9649p.a() + this.f9649p.d();
                        i12 = View.MeasureSpec.makeMeasureSpec(size - c10, mode);
                        i13 = size3;
                        i14 = View.MeasureSpec.makeMeasureSpec(size2 - a3, mode2);
                    }
                    bVar = eVar2.f8a;
                    if (bVar == null && bVar.h(this, view2)) {
                        i18 = paddingLeft;
                        i19 = i28;
                        i17 = paddingRight;
                        eVar = eVar2;
                        view = view2;
                        i15 = i27;
                        i16 = i25;
                    } else {
                        int i31 = paddingRight;
                        eVar = eVar2;
                        view = view2;
                        i15 = i27;
                        i16 = i25;
                        int i32 = i12;
                        i17 = i31;
                        i18 = paddingLeft;
                        i19 = i28;
                        measureChildWithMargins(view, i32, i11, i14, 0);
                    }
                    int max2 = Math.max(i15, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int max3 = Math.max(i19, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    i26 = View.combineMeasuredStates(i26, view.getMeasuredState());
                    suggestedMinimumWidth = max2;
                    suggestedMinimumHeight = max3;
                }
                i11 = 0;
                z10 = false;
                if (z13) {
                }
                i12 = i3;
                i13 = size3;
                i14 = i10;
                bVar = eVar2.f8a;
                if (bVar == null) {
                }
                int i312 = paddingRight;
                eVar = eVar2;
                view = view2;
                i15 = i27;
                i16 = i25;
                int i322 = i12;
                i17 = i312;
                i18 = paddingLeft;
                i19 = i28;
                measureChildWithMargins(view, i322, i11, i14, 0);
                int max22 = Math.max(i15, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int max32 = Math.max(i19, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                i26 = View.combineMeasuredStates(i26, view.getMeasuredState());
                suggestedMinimumWidth = max22;
                suggestedMinimumHeight = max32;
            }
            i25 = i16 + 1;
            paddingLeft = i18;
            size3 = i13;
            arrayList3 = arrayList;
            paddingRight = i17;
        }
        setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i3, (-16777216) & i26), View.resolveSizeAndState(suggestedMinimumHeight, i10, i26 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f8a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        b bVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f8a) != null) {
                    z2 |= bVar.i(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        f(view, i3, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        b(view, i3, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        d(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f5920a);
        SparseArray sparseArray = hVar.f24c;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            b bVar = n(childAt).f8a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable o5;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).f8a;
            if (id != -1 && bVar != null && (o5 = bVar.o(childAt)) != null) {
                sparseArray.append(id, o5);
            }
        }
        hVar.f24c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return c(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f9645k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f9645k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            A.e r6 = (A.e) r6
            A.b r6 = r6.f8a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f9645k
            boolean r6 = r6.s(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.f9645k
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0047 A[EDGE_INSN: B:117:0x0047->B:9:0x0047 BREAK  A[LOOP:2: B:109:0x02ad->B:115:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i3) {
        Rect g10;
        Rect g11;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f17k;
        if (view2 == null && eVar.f13f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f9632A;
        if (view2 != null) {
            g10 = g();
            g11 = g();
            try {
                k(view2, g10);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i3, g10, g11, eVar2, measuredWidth, measuredHeight);
                h(eVar2, g11, measuredWidth, measuredHeight);
                view.layout(g11.left, g11.top, g11.right, g11.bottom);
                return;
            } finally {
                g10.setEmpty();
                cVar.b(g10);
                g11.setEmpty();
                cVar.b(g11);
            }
        }
        int i10 = eVar.f12e;
        if (i10 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            g10 = g();
            g10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f9649p != null) {
                WeakHashMap weakHashMap = I.f4732a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g10.left = this.f9649p.b() + g10.left;
                    g10.top = this.f9649p.d() + g10.top;
                    g10.right -= this.f9649p.c();
                    g10.bottom -= this.f9649p.a();
                }
            }
            g11 = g();
            int i11 = eVar3.f10c;
            if ((i11 & 7) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            Gravity.apply(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), g10, g11, i3);
            view.layout(g11.left, g11.top, g11.right, g11.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i12 = eVar4.f10c;
        if (i12 == 0) {
            i12 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i3);
        int i13 = absoluteGravity & 7;
        int i14 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i3 == 1) {
            i10 = width - i10;
        }
        int m4 = m(i10) - measuredWidth2;
        if (i13 == 1) {
            m4 += measuredWidth2 / 2;
        } else if (i13 == 5) {
            m4 += measuredWidth2;
        }
        int i15 = i14 != 16 ? i14 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(m4, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i15, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i3) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f9639c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        i iVar = f9636z;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            b bVar = ((e) view.getLayoutParams()).f8a;
            if (z2 && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i3 == 0) {
                        bVar.f(this, view, motionEvent2);
                    } else if (i3 == 1) {
                        bVar.s(this, view, motionEvent2);
                    }
                }
            } else if (!z2 && bVar != null) {
                if (i3 == 0) {
                    z2 = bVar.f(this, view, motionEvent);
                } else if (i3 == 1) {
                    z2 = bVar.s(this, view, motionEvent);
                }
                if (z2) {
                    this.f9645k = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        b bVar = ((e) view.getLayoutParams()).f8a;
        if (bVar != null) {
            bVar.m(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f9643g) {
            return;
        }
        t(false);
        this.f9643g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9652s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f9651r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f9651r = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f9651r.setState(getDrawableState());
                }
                Drawable drawable3 = this.f9651r;
                WeakHashMap weakHashMap = I.f4732a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f9651r.setVisible(getVisibility() == 0, false);
                this.f9651r.setCallback(this);
            }
            WeakHashMap weakHashMap2 = I.f4732a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i3) {
        setStatusBarBackground(new ColorDrawable(i3));
    }

    public void setStatusBarBackgroundResource(int i3) {
        setStatusBarBackground(i3 != 0 ? getContext().getDrawable(i3) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z2 = i3 == 0;
        Drawable drawable = this.f9651r;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f9651r.setVisible(z2, false);
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            b bVar = ((e) childAt.getLayoutParams()).f8a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    bVar.f(this, childAt, obtain);
                } else {
                    bVar.s(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((e) getChildAt(i10).getLayoutParams()).getClass();
        }
        this.f9645k = null;
        this.f9643g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9651r;
    }

    public final void w() {
        WeakHashMap weakHashMap = I.f4732a;
        if (!getFitsSystemWindows()) {
            N.B.l(this, null);
            return;
        }
        if (this.f9653t == null) {
            this.f9653t = new F5.c(this, 1);
        }
        N.B.l(this, this.f9653t);
        setSystemUiVisibility(PlatformPlugin.DEFAULT_SYSTEM_UI);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }
}
