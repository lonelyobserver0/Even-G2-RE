package androidx.appcompat.widget;

import F.c;
import K4.m;
import N.AbstractC0179z;
import N.B;
import N.I;
import N.InterfaceC0165k;
import N.InterfaceC0166l;
import N.N;
import N.O;
import N.P;
import N.Q;
import N.S;
import N.Z;
import N.c0;
import Z9.n;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.gms.internal.measurement.D1;
import i.H;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import l.j;
import m.l;
import m.w;
import n.C1333e;
import n.C1335f;
import n.C1345k;
import n.InterfaceC1331d;
import n.InterfaceC1338g0;
import n.InterfaceC1340h0;
import n.RunnableC1329c;
import n.U0;
import n.Z0;

@SuppressLint({"UnknownNullness"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1338g0, InterfaceC0165k, InterfaceC0166l {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f9444F = {2130903043, R.attr.windowContentOverlay};

    /* renamed from: G, reason: collision with root package name */
    public static final c0 f9445G;

    /* renamed from: H, reason: collision with root package name */
    public static final Rect f9446H;

    /* renamed from: A, reason: collision with root package name */
    public final m f9447A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC1329c f9448B;

    /* renamed from: C, reason: collision with root package name */
    public final RunnableC1329c f9449C;

    /* renamed from: D, reason: collision with root package name */
    public final n f9450D;

    /* renamed from: E, reason: collision with root package name */
    public final C1335f f9451E;

    /* renamed from: a, reason: collision with root package name */
    public int f9452a;

    /* renamed from: b, reason: collision with root package name */
    public int f9453b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f9454c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f9455d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1340h0 f9456e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f9457f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9458g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9459h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9460k;

    /* renamed from: l, reason: collision with root package name */
    public int f9461l;

    /* renamed from: m, reason: collision with root package name */
    public int f9462m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f9463n;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f9464p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f9465q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f9466r;

    /* renamed from: s, reason: collision with root package name */
    public c0 f9467s;

    /* renamed from: t, reason: collision with root package name */
    public c0 f9468t;

    /* renamed from: v, reason: collision with root package name */
    public c0 f9469v;

    /* renamed from: w, reason: collision with root package name */
    public c0 f9470w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1331d f9471x;

    /* renamed from: y, reason: collision with root package name */
    public OverScroller f9472y;

    /* renamed from: z, reason: collision with root package name */
    public ViewPropertyAnimator f9473z;

    static {
        int i3 = Build.VERSION.SDK_INT;
        S q10 = i3 >= 34 ? new Q() : i3 >= 30 ? new P() : i3 >= 29 ? new O() : new N();
        q10.d(c.a(0, 1, 0, 1));
        f9445G = q10.b();
        f9446H = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9453b = 0;
        this.f9463n = new Rect();
        this.f9464p = new Rect();
        this.f9465q = new Rect();
        this.f9466r = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        c0 c0Var = c0.f4770b;
        this.f9467s = c0Var;
        this.f9468t = c0Var;
        this.f9469v = c0Var;
        this.f9470w = c0Var;
        this.f9447A = new m(this, 6);
        this.f9448B = new RunnableC1329c(this, 0);
        this.f9449C = new RunnableC1329c(this, 1);
        i(context);
        this.f9450D = new n(1);
        C1335f c1335f = new C1335f(context);
        c1335f.setWillNotDraw(true);
        this.f9451E = c1335f;
        addView(c1335f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z10;
        C1333e c1333e = (C1333e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1333e).leftMargin;
        int i10 = rect.left;
        if (i3 != i10) {
            ((ViewGroup.MarginLayoutParams) c1333e).leftMargin = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c1333e).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c1333e).topMargin = i12;
            z10 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) c1333e).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) c1333e).rightMargin = i14;
            z10 = true;
        }
        if (z2) {
            int i15 = ((ViewGroup.MarginLayoutParams) c1333e).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) c1333e).bottomMargin = i16;
                return true;
            }
        }
        return z10;
    }

    @Override // N.InterfaceC0166l
    public final void a(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        b(view, i3, i10, i11, i12, i13);
    }

    @Override // N.InterfaceC0165k
    public final void b(View view, int i3, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i3, i10, i11, i12);
        }
    }

    @Override // N.InterfaceC0165k
    public final boolean c(View view, View view2, int i3, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1333e;
    }

    @Override // N.InterfaceC0165k
    public final void d(View view, View view2, int i3, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.f9457f != null) {
            if (this.f9455d.getVisibility() == 0) {
                i3 = (int) (this.f9455d.getTranslationY() + this.f9455d.getBottom() + 0.5f);
            } else {
                i3 = 0;
            }
            this.f9457f.setBounds(0, i3, getWidth(), this.f9457f.getIntrinsicHeight() + i3);
            this.f9457f.draw(canvas);
        }
    }

    @Override // N.InterfaceC0165k
    public final void e(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // N.InterfaceC0165k
    public final void f(View view, int i3, int i10, int[] iArr, int i11) {
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1333e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1333e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f9455d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n nVar = this.f9450D;
        return nVar.f9137c | nVar.f9136b;
    }

    public CharSequence getTitle() {
        k();
        return ((Z0) this.f9456e).f17488a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f9448B);
        removeCallbacks(this.f9449C);
        ViewPropertyAnimator viewPropertyAnimator = this.f9473z;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f9444F);
        this.f9452a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f9457f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f9472y = new OverScroller(context);
    }

    public final void j(int i3) {
        k();
        if (i3 == 2) {
            ((Z0) this.f9456e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i3 == 5) {
            ((Z0) this.f9456e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i3 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC1340h0 wrapper;
        if (this.f9454c == null) {
            this.f9454c = (ContentFrameLayout) findViewById(2131230765);
            this.f9455d = (ActionBarContainer) findViewById(2131230766);
            KeyEvent.Callback findViewById = findViewById(2131230764);
            if (findViewById instanceof InterfaceC1340h0) {
                wrapper = (InterfaceC1340h0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f9456e = wrapper;
        }
    }

    public final void l(l lVar, w wVar) {
        k();
        Z0 z02 = (Z0) this.f9456e;
        C1345k c1345k = z02.f17499m;
        Toolbar toolbar = z02.f17488a;
        if (c1345k == null) {
            z02.f17499m = new C1345k(toolbar.getContext());
        }
        C1345k c1345k2 = z02.f17499m;
        c1345k2.f17536e = wVar;
        if (lVar == null && toolbar.f9576a == null) {
            return;
        }
        toolbar.f();
        l lVar2 = toolbar.f9576a.f9478r;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.r(toolbar.f9575T);
            lVar2.r(toolbar.h0);
        }
        if (toolbar.h0 == null) {
            toolbar.h0 = new U0(toolbar);
        }
        c1345k2.f17547s = true;
        if (lVar != null) {
            lVar.b(c1345k2, toolbar.f9584k);
            lVar.b(toolbar.h0, toolbar.f9584k);
        } else {
            c1345k2.c(toolbar.f9584k, null);
            toolbar.h0.c(toolbar.f9584k, null);
            c1345k2.f();
            toolbar.h0.f();
        }
        toolbar.f9576a.setPopupTheme(toolbar.f9586l);
        toolbar.f9576a.setPresenter(c1345k2);
        toolbar.f9575T = c1345k2;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        c0 g10 = c0.g(windowInsets, this);
        boolean g11 = g(this.f9455d, new Rect(g10.b(), g10.d(), g10.c(), g10.a()), false);
        WeakHashMap weakHashMap = I.f4732a;
        Rect rect = this.f9463n;
        B.b(this, g10, rect);
        int i3 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        Z z2 = g10.f4771a;
        c0 l9 = z2.l(i3, i10, i11, i12);
        this.f9467s = l9;
        boolean z10 = true;
        if (!this.f9468t.equals(l9)) {
            this.f9468t = this.f9467s;
            g11 = true;
        }
        Rect rect2 = this.f9464p;
        if (rect2.equals(rect)) {
            z10 = g11;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return z2.a().f4771a.c().f4771a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = I.f4732a;
        AbstractC0179z.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C1333e c1333e = (C1333e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) c1333e).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) c1333e).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z2) {
        if (!this.j || !z2) {
            return false;
        }
        this.f9472y.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, IntCompanionObject.MAX_VALUE);
        if (this.f9472y.getFinalY() > this.f9455d.getHeight()) {
            h();
            this.f9449C.run();
        } else {
            h();
            this.f9448B.run();
        }
        this.f9460k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        int i13 = this.f9461l + i10;
        this.f9461l = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        H h2;
        j jVar;
        this.f9450D.f9136b = i3;
        this.f9461l = getActionBarHideOffset();
        h();
        InterfaceC1331d interfaceC1331d = this.f9471x;
        if (interfaceC1331d == null || (jVar = (h2 = (H) interfaceC1331d).f14544t) == null) {
            return;
        }
        jVar.a();
        h2.f14544t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f9455d.getVisibility() != 0) {
            return false;
        }
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.j || this.f9460k) {
            return;
        }
        if (this.f9461l <= this.f9455d.getHeight()) {
            h();
            postDelayed(this.f9448B, 600L);
        } else {
            h();
            postDelayed(this.f9449C, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        k();
        int i10 = this.f9462m ^ i3;
        this.f9462m = i3;
        boolean z2 = (i3 & 4) == 0;
        boolean z10 = (i3 & 256) != 0;
        InterfaceC1331d interfaceC1331d = this.f9471x;
        if (interfaceC1331d != null) {
            H h2 = (H) interfaceC1331d;
            h2.f14540p = !z10;
            if (z2 || !z10) {
                if (h2.f14541q) {
                    h2.f14541q = false;
                    h2.Y(true);
                }
            } else if (!h2.f14541q) {
                h2.f14541q = true;
                h2.Y(true);
            }
        }
        if ((i10 & 256) == 0 || this.f9471x == null) {
            return;
        }
        WeakHashMap weakHashMap = I.f4732a;
        AbstractC0179z.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        this.f9453b = i3;
        InterfaceC1331d interfaceC1331d = this.f9471x;
        if (interfaceC1331d != null) {
            ((H) interfaceC1331d).f14539o = i3;
        }
    }

    public void setActionBarHideOffset(int i3) {
        h();
        this.f9455d.setTranslationY(-Math.max(0, Math.min(i3, this.f9455d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1331d interfaceC1331d) {
        this.f9471x = interfaceC1331d;
        if (getWindowToken() != null) {
            ((H) this.f9471x).f14539o = this.f9453b;
            int i3 = this.f9462m;
            if (i3 != 0) {
                onWindowSystemUiVisibilityChanged(i3);
                WeakHashMap weakHashMap = I.f4732a;
                AbstractC0179z.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f9459h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.j) {
            this.j = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        k();
        Z0 z02 = (Z0) this.f9456e;
        z02.f17491d = i3 != 0 ? D1.m(z02.f17488a.getContext(), i3) : null;
        z02.c();
    }

    public void setLogo(int i3) {
        k();
        Z0 z02 = (Z0) this.f9456e;
        z02.f17492e = i3 != 0 ? D1.m(z02.f17488a.getContext(), i3) : null;
        z02.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f9458g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i3) {
    }

    @Override // n.InterfaceC1338g0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((Z0) this.f9456e).f17497k = callback;
    }

    @Override // n.InterfaceC1338g0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        Z0 z02 = (Z0) this.f9456e;
        if (z02.f17494g) {
            return;
        }
        z02.f17495h = charSequence;
        if ((z02.f17489b & 8) != 0) {
            Toolbar toolbar = z02.f17488a;
            toolbar.setTitle(charSequence);
            if (z02.f17494g) {
                I.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1333e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        Z0 z02 = (Z0) this.f9456e;
        z02.f17491d = drawable;
        z02.c();
    }
}
