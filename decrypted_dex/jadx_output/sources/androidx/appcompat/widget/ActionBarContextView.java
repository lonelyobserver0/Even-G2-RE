package androidx.appcompat.widget;

import K4.c;
import N.I;
import N.L;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.D1;
import h.AbstractC0997a;
import i2.u;
import l.AbstractC1130a;
import m.l;
import m.z;
import n.C1325a;
import n.C1337g;
import n.C1345k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C1325a f9425a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9426b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f9427c;

    /* renamed from: d, reason: collision with root package name */
    public C1345k f9428d;

    /* renamed from: e, reason: collision with root package name */
    public int f9429e;

    /* renamed from: f, reason: collision with root package name */
    public L f9430f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9431g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9432h;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f9433k;

    /* renamed from: l, reason: collision with root package name */
    public View f9434l;

    /* renamed from: m, reason: collision with root package name */
    public View f9435m;

    /* renamed from: n, reason: collision with root package name */
    public View f9436n;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f9437p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f9438q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f9439r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9440s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9441t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9442v;

    /* renamed from: w, reason: collision with root package name */
    public final int f9443w;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903068);
        int resourceId;
        this.f9425a = new C1325a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130903042, typedValue, true) || typedValue.resourceId == 0) {
            this.f9426b = context;
        } else {
            this.f9426b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0997a.f14397d, 2130903068, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : D1.m(context, resourceId));
        this.f9440s = obtainStyledAttributes.getResourceId(5, 0);
        this.f9441t = obtainStyledAttributes.getResourceId(4, 0);
        this.f9429e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f9443w = obtainStyledAttributes.getResourceId(2, 2131427333);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i3, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i10);
        return Math.max(0, i3 - view.getMeasuredWidth());
    }

    public static int g(View view, int i3, int i10, int i11, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int c10 = u.c(i11, measuredHeight, 2, i10);
        if (z2) {
            view.layout(i3 - measuredWidth, c10, i3, measuredHeight + c10);
        } else {
            view.layout(i3, c10, i3 + measuredWidth, measuredHeight + c10);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC1130a abstractC1130a) {
        View view = this.f9434l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f9443w, (ViewGroup) this, false);
            this.f9434l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f9434l);
        }
        View findViewById = this.f9434l.findViewById(2131230779);
        this.f9435m = findViewById;
        findViewById.setOnClickListener(new c(abstractC1130a, 6));
        l c10 = abstractC1130a.c();
        C1345k c1345k = this.f9428d;
        if (c1345k != null) {
            c1345k.g();
            C1337g c1337g = c1345k.f17550w;
            if (c1337g != null && c1337g.b()) {
                c1337g.f16996i.dismiss();
            }
        }
        C1345k c1345k2 = new C1345k(getContext());
        this.f9428d = c1345k2;
        c1345k2.f17542m = true;
        c1345k2.f17543n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c10.b(this.f9428d, this.f9426b);
        C1345k c1345k3 = this.f9428d;
        z zVar = c1345k3.f17539h;
        if (zVar == null) {
            z zVar2 = (z) c1345k3.f17535d.inflate(c1345k3.f17537f, (ViewGroup) this, false);
            c1345k3.f17539h = zVar2;
            zVar2.b(c1345k3.f17534c);
            c1345k3.f();
        }
        z zVar3 = c1345k3.f17539h;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(c1345k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f9427c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f9427c, layoutParams);
    }

    public final void d() {
        if (this.f9437p == null) {
            LayoutInflater.from(getContext()).inflate(2131427328, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f9437p = linearLayout;
            this.f9438q = (TextView) linearLayout.findViewById(2131230770);
            this.f9439r = (TextView) this.f9437p.findViewById(2131230769);
            int i3 = this.f9440s;
            if (i3 != 0) {
                this.f9438q.setTextAppearance(getContext(), i3);
            }
            int i10 = this.f9441t;
            if (i10 != 0) {
                this.f9439r.setTextAppearance(getContext(), i10);
            }
        }
        this.f9438q.setText(this.j);
        this.f9439r.setText(this.f9433k);
        boolean isEmpty = TextUtils.isEmpty(this.j);
        boolean isEmpty2 = TextUtils.isEmpty(this.f9433k);
        this.f9439r.setVisibility(!isEmpty2 ? 0 : 8);
        this.f9437p.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f9437p.getParent() == null) {
            addView(this.f9437p);
        }
    }

    public final void e() {
        removeAllViews();
        this.f9436n = null;
        this.f9427c = null;
        this.f9428d = null;
        View view = this.f9435m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f9430f != null ? this.f9425a.f17503b : getVisibility();
    }

    public int getContentHeight() {
        return this.f9429e;
    }

    public CharSequence getSubtitle() {
        return this.f9433k;
    }

    public CharSequence getTitle() {
        return this.j;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            L l9 = this.f9430f;
            if (l9 != null) {
                l9.b();
            }
            super.setVisibility(i3);
        }
    }

    public final L i(int i3, long j) {
        L l9 = this.f9430f;
        if (l9 != null) {
            l9.b();
        }
        C1325a c1325a = this.f9425a;
        if (i3 != 0) {
            L a3 = I.a(this);
            a3.a(0.0f);
            a3.c(j);
            c1325a.f17504c.f9430f = a3;
            c1325a.f17503b = i3;
            a3.d(c1325a);
            return a3;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        L a9 = I.a(this);
        a9.a(1.0f);
        a9.c(j);
        c1325a.f17504c.f9430f = a9;
        c1325a.f17503b = i3;
        a9.d(c1325a);
        return a9;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0997a.f14394a, 2130903045, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C1345k c1345k = this.f9428d;
        if (c1345k != null) {
            Configuration configuration2 = c1345k.f17533b.getResources().getConfiguration();
            int i3 = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            c1345k.f17546r = (configuration2.smallestScreenWidthDp > 600 || i3 > 600 || (i3 > 960 && i10 > 720) || (i3 > 720 && i10 > 960)) ? 5 : (i3 >= 500 || (i3 > 640 && i10 > 480) || (i3 > 480 && i10 > 640)) ? 4 : i3 >= 360 ? 3 : 2;
            l lVar = c1345k.f17534c;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1345k c1345k = this.f9428d;
        if (c1345k != null) {
            c1345k.g();
            C1337g c1337g = this.f9428d.f17550w;
            if (c1337g == null || !c1337g.b()) {
                return;
            }
            c1337g.f16996i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9432h = false;
        }
        if (!this.f9432h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f9432h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f9432h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        boolean z10 = getLayoutDirection() == 1;
        int paddingRight = z10 ? (i11 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.f9434l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9434l.getLayoutParams();
            int i13 = z10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = z10 ? paddingRight - i13 : paddingRight + i13;
            int g10 = g(this.f9434l, i15, paddingTop, paddingTop2, z10) + i15;
            paddingRight = z10 ? g10 - i14 : g10 + i14;
        }
        LinearLayout linearLayout = this.f9437p;
        if (linearLayout != null && this.f9436n == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f9437p, paddingRight, paddingTop, paddingTop2, z10);
        }
        View view2 = this.f9436n;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z10);
        }
        int paddingLeft = z10 ? getPaddingLeft() : (i11 - i3) - getPaddingRight();
        ActionMenuView actionMenuView = this.f9427c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i3);
        int i11 = this.f9429e;
        if (i11 <= 0) {
            i11 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i12 = i11 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        View view = this.f9434l;
        if (view != null) {
            int f10 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9434l.getLayoutParams();
            paddingLeft = f10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f9427c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f9427c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f9437p;
        if (linearLayout != null && this.f9436n == null) {
            if (this.f9442v) {
                this.f9437p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f9437p.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f9437p.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f9436n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i13 = layoutParams.width;
            int i14 = i13 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i13 >= 0) {
                paddingLeft = Math.min(i13, paddingLeft);
            }
            int i15 = layoutParams.height;
            int i16 = i15 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i15 >= 0) {
                i12 = Math.min(i15, i12);
            }
            this.f9436n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i14), View.MeasureSpec.makeMeasureSpec(i12, i16));
        }
        if (this.f9429e > 0) {
            setMeasuredDimension(size, i11);
            return;
        }
        int childCount = getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i17) {
                i17 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9431g = false;
        }
        if (!this.f9431g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f9431g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f9431g = false;
        return true;
    }

    public void setContentHeight(int i3) {
        this.f9429e = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f9436n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f9436n = view;
        if (view != null && (linearLayout = this.f9437p) != null) {
            removeView(linearLayout);
            this.f9437p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f9433k = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.j = charSequence;
        d();
        I.j(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f9442v) {
            requestLayout();
        }
        this.f9442v = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
