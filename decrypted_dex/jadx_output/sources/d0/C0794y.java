package d0;

import N.AbstractC0179z;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import c0.AbstractC0547a;
import com.stub.StubApp;
import i.AbstractActivityC1027h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d0.y, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0794y extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13401a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13402b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f13403c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794y(Context context, AttributeSet attrs, M fm) {
        super(context, attrs);
        View view;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f13401a = new ArrayList();
        this.f13402b = new ArrayList();
        this.f13404d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = AbstractC0547a.f10776b;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0789t B7 = fm.B(id);
        if (classAttribute != null && B7 == null) {
            if (id == -1) {
                throw new IllegalStateException(E1.a.k(StubApp.getString2(16804), classAttribute, string != null ? StubApp.getString2(16650).concat(string) : ""));
            }
            C0768F G4 = fm.G();
            context.getClassLoader();
            AbstractComponentCallbacksC0789t a3 = G4.a(classAttribute);
            Intrinsics.checkNotNullExpressionValue(a3, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a3.f13388z = id;
            a3.f13346A = id;
            a3.f13347B = string;
            a3.f13384v = fm;
            C0791v c0791v = fm.f13179w;
            a3.f13385w = c0791v;
            a3.f13352G = true;
            if ((c0791v == null ? null : c0791v.f13391a) != null) {
                a3.f13352G = true;
            }
            C0771a c0771a = new C0771a(fm);
            c0771a.f13253o = true;
            a3.f13353H = this;
            c0771a.e(getId(), a3, string, 1);
            if (c0771a.f13246g) {
                throw new IllegalStateException(StubApp.getString2(16805));
            }
            M m4 = c0771a.f13254p;
            if (m4.f13179w != null && !m4.f13151J) {
                m4.y(true);
                c0771a.a(m4.f13153L, m4.f13154M);
                m4.f13159b = true;
                try {
                    m4.U(m4.f13153L, m4.f13154M);
                    m4.d();
                    m4.f0();
                    if (m4.f13152K) {
                        m4.f13152K = false;
                        m4.d0();
                    }
                    ((HashMap) m4.f13160c.f1341b).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    m4.d();
                    throw th;
                }
            }
        }
        Iterator it = fm.f13160c.A().iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = u2.f13216c;
            if (abstractComponentCallbacksC0789t.f13346A == getId() && (view = abstractComponentCallbacksC0789t.f13354I) != null && view.getParent() == null) {
                abstractComponentCallbacksC0789t.f13353H = this;
                u2.b();
            }
        }
    }

    public final void a(View view) {
        if (this.f13402b.contains(view)) {
            this.f13401a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i3, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        Object tag = child.getTag(2131230886);
        if ((tag instanceof AbstractComponentCallbacksC0789t ? (AbstractComponentCallbacksC0789t) tag : null) != null) {
            super.addView(child, i3, layoutParams);
            return;
        }
        throw new IllegalStateException((StubApp.getString2(16806) + child + StubApp.getString2(16807)).toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        N.c0 c0Var;
        Intrinsics.checkNotNullParameter(insets, "insets");
        N.c0 g10 = N.c0.g(insets, null);
        Intrinsics.checkNotNullExpressionValue(g10, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f13403c;
        if (onApplyWindowInsetsListener != null) {
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(this, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c0Var = N.c0.g(onApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = N.I.f4732a;
            WindowInsets f10 = g10.f();
            if (f10 != null) {
                WindowInsets b2 = AbstractC0179z.b(this, f10);
                if (!b2.equals(f10)) {
                    g10 = N.c0.g(b2, this);
                }
            }
            c0Var = g10;
        }
        Intrinsics.checkNotNullExpressionValue(c0Var, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c0Var.f4771a.m()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                N.I.b(getChildAt(i3), c0Var);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f13404d) {
            Iterator it = this.f13401a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f13404d) {
            ArrayList arrayList = this.f13401a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f13402b.remove(view);
        if (this.f13401a.remove(view)) {
            this.f13404d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0789t> F getFragment() {
        AbstractActivityC1027h abstractActivityC1027h;
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t;
        M m4;
        View view = this;
        while (true) {
            abstractActivityC1027h = null;
            if (view == null) {
                abstractComponentCallbacksC0789t = null;
                break;
            }
            Object tag = view.getTag(2131230886);
            abstractComponentCallbacksC0789t = tag instanceof AbstractComponentCallbacksC0789t ? (AbstractComponentCallbacksC0789t) tag : null;
            if (abstractComponentCallbacksC0789t != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0789t == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC1027h) {
                    abstractActivityC1027h = (AbstractActivityC1027h) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC1027h == null) {
                throw new IllegalStateException(StubApp.getString2(16811) + this + StubApp.getString2(16812));
            }
            m4 = ((C0791v) abstractActivityC1027h.f14605w.f9233b).f13394d;
        } else {
            if (abstractComponentCallbacksC0789t.f13385w == null || !abstractComponentCallbacksC0789t.f13374l) {
                throw new IllegalStateException(StubApp.getString2(16808) + abstractComponentCallbacksC0789t + StubApp.getString2(16809) + this + StubApp.getString2(16810));
            }
            m4 = abstractComponentCallbacksC0789t.l();
        }
        return (F) m4.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i3) {
        View view = getChildAt(i3);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i3, int i10) {
        int i11 = i3 + i10;
        for (int i12 = i3; i12 < i11; i12++) {
            View view = getChildAt(i12);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(i3, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i3, int i10) {
        int i11 = i3 + i10;
        for (int i12 = i3; i12 < i11; i12++) {
            View view = getChildAt(i12);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i3, i10);
    }

    @JvmName(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f13404d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException(StubApp.getString2(16813));
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13403c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.f13402b.add(view);
        }
        super.startViewTransition(view);
    }
}
