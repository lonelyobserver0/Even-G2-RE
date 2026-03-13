package androidx.appcompat.widget;

import K4.c;
import N.I;
import Q2.g;
import Z9.C0366a;
import a0.C0379a;
import aa.C0398e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.internal.measurement.D1;
import d0.C0767E;
import f4.C0879c;
import h.AbstractC0997a;
import i.RunnableC1018B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.h;
import m.l;
import m.n;
import n.C1345k;
import n.C1373y;
import n.InterfaceC1340h0;
import n.L0;
import n.S0;
import n.T0;
import n.U0;
import n.V0;
import n.W0;
import n.X0;
import n.Z0;
import n.a1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f9561A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f9562B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f9563C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f9564D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9565E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9566F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f9567G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f9568H;

    /* renamed from: I, reason: collision with root package name */
    public final int[] f9569I;

    /* renamed from: K, reason: collision with root package name */
    public final g f9570K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f9571L;

    /* renamed from: O, reason: collision with root package name */
    public W0 f9572O;

    /* renamed from: P, reason: collision with root package name */
    public final C0879c f9573P;

    /* renamed from: R, reason: collision with root package name */
    public Z0 f9574R;

    /* renamed from: T, reason: collision with root package name */
    public C1345k f9575T;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f9576a;

    /* renamed from: b, reason: collision with root package name */
    public AppCompatTextView f9577b;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f9578c;

    /* renamed from: d, reason: collision with root package name */
    public C1373y f9579d;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatImageView f9580e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f9581f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f9582g;

    /* renamed from: h, reason: collision with root package name */
    public C1373y f9583h;
    public U0 h0;
    public View j;

    /* renamed from: k, reason: collision with root package name */
    public Context f9584k;

    /* renamed from: k0, reason: collision with root package name */
    public C0398e f9585k0;

    /* renamed from: l, reason: collision with root package name */
    public int f9586l;

    /* renamed from: l0, reason: collision with root package name */
    public C0379a f9587l0;

    /* renamed from: m, reason: collision with root package name */
    public int f9588m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f9589m0;

    /* renamed from: n, reason: collision with root package name */
    public int f9590n;

    /* renamed from: n0, reason: collision with root package name */
    public OnBackInvokedCallback f9591n0;

    /* renamed from: o0, reason: collision with root package name */
    public OnBackInvokedDispatcher f9592o0;

    /* renamed from: p, reason: collision with root package name */
    public final int f9593p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f9594p0;

    /* renamed from: q, reason: collision with root package name */
    public final int f9595q;

    /* renamed from: q0, reason: collision with root package name */
    public final RunnableC1018B f9596q0;

    /* renamed from: r, reason: collision with root package name */
    public int f9597r;

    /* renamed from: s, reason: collision with root package name */
    public int f9598s;

    /* renamed from: t, reason: collision with root package name */
    public int f9599t;

    /* renamed from: v, reason: collision with root package name */
    public int f9600v;

    /* renamed from: w, reason: collision with root package name */
    public L0 f9601w;

    /* renamed from: x, reason: collision with root package name */
    public int f9602x;

    /* renamed from: y, reason: collision with root package name */
    public int f9603y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9604z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static V0 h() {
        V0 v02 = new V0(-2, -2);
        v02.f17470b = 0;
        v02.f17469a = 8388627;
        return v02;
    }

    public static V0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof V0;
        if (z2) {
            V0 v02 = (V0) layoutParams;
            V0 v03 = new V0(v02);
            v03.f17470b = 0;
            v03.f17470b = v02.f17470b;
            return v03;
        }
        if (z2) {
            V0 v04 = new V0((V0) layoutParams);
            v04.f17470b = 0;
            return v04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            V0 v05 = new V0(layoutParams);
            v05.f17470b = 0;
            return v05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        V0 v06 = new V0(marginLayoutParams);
        v06.f17470b = 0;
        ((ViewGroup.MarginLayoutParams) v06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) v06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) v06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) v06).bottomMargin = marginLayoutParams.bottomMargin;
        return v06;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i3, ArrayList arrayList) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                V0 v02 = (V0) childAt.getLayoutParams();
                if (v02.f17470b == 0 && t(childAt)) {
                    int i11 = v02.f17469a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            V0 v03 = (V0) childAt2.getLayoutParams();
            if (v03.f17470b == 0 && t(childAt2)) {
                int i13 = v03.f17469a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        V0 h2 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (V0) layoutParams;
        h2.f17470b = 1;
        if (!z2 || this.j == null) {
            addView(view, h2);
        } else {
            view.setLayoutParams(h2);
            this.f9568H.add(view);
        }
    }

    public final void c() {
        if (this.f9583h == null) {
            C1373y c1373y = new C1373y(getContext(), null, 2130903970);
            this.f9583h = c1373y;
            c1373y.setImageDrawable(this.f9581f);
            this.f9583h.setContentDescription(this.f9582g);
            V0 h2 = h();
            h2.f17469a = (this.f9593p & 112) | 8388611;
            h2.f17470b = 2;
            this.f9583h.setLayoutParams(h2);
            this.f9583h.setOnClickListener(new c(this, 7));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof V0);
    }

    public final void d() {
        if (this.f9601w == null) {
            L0 l02 = new L0();
            l02.f17425a = 0;
            l02.f17426b = 0;
            l02.f17427c = Integer.MIN_VALUE;
            l02.f17428d = Integer.MIN_VALUE;
            l02.f17429e = 0;
            l02.f17430f = 0;
            l02.f17431g = false;
            l02.f17432h = false;
            this.f9601w = l02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f9576a;
        if (actionMenuView.f9478r == null) {
            l lVar = (l) actionMenuView.getMenu();
            if (this.h0 == null) {
                this.h0 = new U0(this);
            }
            this.f9576a.setExpandedActionViewsExclusive(true);
            lVar.b(this.h0, this.f9584k);
            v();
        }
    }

    public final void f() {
        if (this.f9576a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f9576a = actionMenuView;
            actionMenuView.setPopupTheme(this.f9586l);
            this.f9576a.setOnMenuItemClickListener(this.f9573P);
            ActionMenuView actionMenuView2 = this.f9576a;
            C0398e c0398e = this.f9585k0;
            C0366a c0366a = new C0366a(this, 20);
            actionMenuView2.f9483x = c0398e;
            actionMenuView2.f9484y = c0366a;
            V0 h2 = h();
            h2.f17469a = (this.f9593p & 112) | 8388613;
            this.f9576a.setLayoutParams(h2);
            b(this.f9576a, false);
        }
    }

    public final void g() {
        if (this.f9579d == null) {
            this.f9579d = new C1373y(getContext(), null, 2130903970);
            V0 h2 = h();
            h2.f17469a = (this.f9593p & 112) | 8388611;
            this.f9579d.setLayoutParams(h2);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1373y c1373y = this.f9583h;
        if (c1373y != null) {
            return c1373y.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1373y c1373y = this.f9583h;
        if (c1373y != null) {
            return c1373y.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        L0 l02 = this.f9601w;
        if (l02 != null) {
            return l02.f17431g ? l02.f17425a : l02.f17426b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f9603y;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        L0 l02 = this.f9601w;
        if (l02 != null) {
            return l02.f17425a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        L0 l02 = this.f9601w;
        if (l02 != null) {
            return l02.f17426b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        L0 l02 = this.f9601w;
        if (l02 != null) {
            return l02.f17431g ? l02.f17426b : l02.f17425a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f9602x;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.f9576a;
        return (actionMenuView == null || (lVar = actionMenuView.f9478r) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f9603y, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f9602x, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f9580e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f9580e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f9576a.getMenu();
    }

    public View getNavButtonView() {
        return this.f9579d;
    }

    public CharSequence getNavigationContentDescription() {
        C1373y c1373y = this.f9579d;
        if (c1373y != null) {
            return c1373y.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1373y c1373y = this.f9579d;
        if (c1373y != null) {
            return c1373y.getDrawable();
        }
        return null;
    }

    public C1345k getOuterActionMenuPresenter() {
        return this.f9575T;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f9576a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f9584k;
    }

    public int getPopupTheme() {
        return this.f9586l;
    }

    public CharSequence getSubtitle() {
        return this.f9562B;
    }

    public final TextView getSubtitleTextView() {
        return this.f9578c;
    }

    public CharSequence getTitle() {
        return this.f9561A;
    }

    public int getTitleMarginBottom() {
        return this.f9600v;
    }

    public int getTitleMarginEnd() {
        return this.f9598s;
    }

    public int getTitleMarginStart() {
        return this.f9597r;
    }

    public int getTitleMarginTop() {
        return this.f9599t;
    }

    public final TextView getTitleTextView() {
        return this.f9577b;
    }

    public InterfaceC1340h0 getWrapper() {
        if (this.f9574R == null) {
            this.f9574R = new Z0(this, true);
        }
        return this.f9574R;
    }

    public final int j(View view, int i3) {
        V0 v02 = (V0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i11 = v02.f17469a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.f9604z & 112;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) v02).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) v02).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) v02).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    public final void m() {
        Iterator it = this.f9571L.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f9570K.f5712c).iterator();
        while (it2.hasNext()) {
            ((C0767E) it2.next()).f13132a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f9571L = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f9568H.contains(view);
    }

    public final boolean o() {
        C1345k c1345k;
        ActionMenuView actionMenuView = this.f9576a;
        return (actionMenuView == null || (c1345k = actionMenuView.f9482w) == null || !c1345k.k()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f9596q0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9566F = false;
        }
        if (!this.f9566F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f9566F = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f9566F = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c8 A[LOOP:2: B:47:0x02c6->B:48:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0318 A[LOOP:3: B:56:0x0316->B:57:0x0318, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        char c10;
        Object[] objArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c10 = 0;
        } else {
            c10 = 1;
            objArr = false;
        }
        if (t(this.f9579d)) {
            s(this.f9579d, i3, 0, i10, this.f9595q);
            i11 = k(this.f9579d) + this.f9579d.getMeasuredWidth();
            i12 = Math.max(0, l(this.f9579d) + this.f9579d.getMeasuredHeight());
            i13 = View.combineMeasuredStates(0, this.f9579d.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (t(this.f9583h)) {
            s(this.f9583h, i3, 0, i10, this.f9595q);
            i11 = k(this.f9583h) + this.f9583h.getMeasuredWidth();
            i12 = Math.max(i12, l(this.f9583h) + this.f9583h.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f9583h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11);
        int max2 = Math.max(0, currentContentInsetStart - i11);
        Object[] objArr2 = objArr;
        int[] iArr = this.f9569I;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (t(this.f9576a)) {
            s(this.f9576a, i3, max, i10, this.f9595q);
            i14 = k(this.f9576a) + this.f9576a.getMeasuredWidth();
            i12 = Math.max(i12, l(this.f9576a) + this.f9576a.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f9576a.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i14);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i14);
        if (t(this.j)) {
            max3 += r(this.j, i3, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.j) + this.j.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.j.getMeasuredState());
        }
        if (t(this.f9580e)) {
            max3 += r(this.f9580e, i3, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.f9580e) + this.f9580e.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f9580e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (((V0) childAt.getLayoutParams()).f17470b == 0 && t(childAt)) {
                max3 += r(childAt, i3, max3, i10, 0, iArr);
                int max4 = Math.max(i12, l(childAt) + childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
                i12 = max4;
            } else {
                max3 = max3;
            }
        }
        int i20 = max3;
        int i21 = this.f9599t + this.f9600v;
        int i22 = this.f9597r + this.f9598s;
        if (t(this.f9577b)) {
            r(this.f9577b, i3, i20 + i22, i10, i21, iArr);
            int k3 = k(this.f9577b) + this.f9577b.getMeasuredWidth();
            i15 = l(this.f9577b) + this.f9577b.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i13, this.f9577b.getMeasuredState());
            i17 = k3;
        } else {
            i15 = 0;
            i16 = i13;
            i17 = 0;
        }
        if (t(this.f9578c)) {
            i17 = Math.max(i17, r(this.f9578c, i3, i20 + i22, i10, i21 + i15, iArr));
            i15 += l(this.f9578c) + this.f9578c.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i16, this.f9578c.getMeasuredState());
        }
        int max5 = Math.max(i12, i15);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i20 + i17;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i16 << 16);
        if (this.f9589m0) {
            int childCount2 = getChildCount();
            for (int i23 = 0; i23 < childCount2; i23++) {
                View childAt2 = getChildAt(i23);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i18);
        }
        i18 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i18);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof X0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        X0 x02 = (X0) parcelable;
        super.onRestoreInstanceState(x02.f5920a);
        ActionMenuView actionMenuView = this.f9576a;
        l lVar = actionMenuView != null ? actionMenuView.f9478r : null;
        int i3 = x02.f17483c;
        if (i3 != 0 && this.h0 != null && lVar != null && (findItem = lVar.findItem(i3)) != null) {
            findItem.expandActionView();
        }
        if (x02.f17484d) {
            RunnableC1018B runnableC1018B = this.f9596q0;
            removeCallbacks(runnableC1018B);
            post(runnableC1018B);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        L0 l02 = this.f9601w;
        boolean z2 = i3 == 1;
        if (z2 == l02.f17431g) {
            return;
        }
        l02.f17431g = z2;
        if (!l02.f17432h) {
            l02.f17425a = l02.f17429e;
            l02.f17426b = l02.f17430f;
            return;
        }
        if (z2) {
            int i10 = l02.f17428d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = l02.f17429e;
            }
            l02.f17425a = i10;
            int i11 = l02.f17427c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = l02.f17430f;
            }
            l02.f17426b = i11;
            return;
        }
        int i12 = l02.f17427c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = l02.f17429e;
        }
        l02.f17425a = i12;
        int i13 = l02.f17428d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = l02.f17430f;
        }
        l02.f17426b = i13;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n nVar;
        X0 x02 = new X0(super.onSaveInstanceState());
        U0 u02 = this.h0;
        if (u02 != null && (nVar = u02.f17467b) != null) {
            x02.f17483c = nVar.f16951a;
        }
        x02.f17484d = o();
        return x02;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9565E = false;
        }
        if (!this.f9565E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f9565E = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f9565E = false;
        return true;
    }

    public final int p(View view, int i3, int i10, int[] iArr) {
        V0 v02 = (V0) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) v02).leftMargin - iArr[0];
        int max = Math.max(0, i11) + i3;
        iArr[0] = Math.max(0, -i11);
        int j = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) v02).rightMargin + max;
    }

    public final int q(View view, int i3, int i10, int[] iArr) {
        V0 v02 = (V0) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) v02).rightMargin - iArr[1];
        int max = i3 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int j = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) v02).leftMargin);
    }

    public final int r(View view, int i3, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i3, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f9594p0 != z2) {
            this.f9594p0 = z2;
            v();
        }
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(D1.m(getContext(), i3));
    }

    public void setCollapsible(boolean z2) {
        this.f9589m0 = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f9603y) {
            this.f9603y = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f9602x) {
            this.f9602x = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(D1.m(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(D1.m(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f9579d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(W0 w02) {
        this.f9572O = w02;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f9576a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f9586l != i3) {
            this.f9586l = i3;
            if (i3 == 0) {
                this.f9584k = getContext();
            } else {
                this.f9584k = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f9600v = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f9598s = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f9597r = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f9599t = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        C1345k c1345k;
        ActionMenuView actionMenuView = this.f9576a;
        return (actionMenuView == null || (c1345k = actionMenuView.f9482w) == null || !c1345k.l()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a3 = T0.a(this);
            U0 u02 = this.h0;
            boolean z2 = (u02 == null || u02.f17467b == null || a3 == null || !isAttachedToWindow() || !this.f9594p0) ? false : true;
            if (z2 && this.f9592o0 == null) {
                if (this.f9591n0 == null) {
                    this.f9591n0 = T0.b(new S0(this, 0));
                }
                T0.c(a3, this.f9591n0);
                this.f9592o0 = a3;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f9592o0) == null) {
                return;
            }
            T0.d(onBackInvokedDispatcher, this.f9591n0);
            this.f9592o0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, 2130903971);
        this.f9604z = 8388627;
        this.f9567G = new ArrayList();
        this.f9568H = new ArrayList();
        this.f9569I = new int[2];
        this.f9570K = new g(new S0(this, 1));
        this.f9571L = new ArrayList();
        this.f9573P = new C0879c(this);
        this.f9596q0 = new RunnableC1018B(this, 14);
        Context context2 = getContext();
        int[] iArr = AbstractC0997a.f14416x;
        a5.c E10 = a5.c.E(context2, attributeSet, iArr, 2130903971);
        I.h(this, context, iArr, attributeSet, (TypedArray) E10.f9283c, 2130903971);
        TypedArray typedArray = (TypedArray) E10.f9283c;
        this.f9588m = typedArray.getResourceId(28, 0);
        this.f9590n = typedArray.getResourceId(19, 0);
        this.f9604z = typedArray.getInteger(0, 8388627);
        this.f9593p = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f9600v = dimensionPixelOffset;
        this.f9599t = dimensionPixelOffset;
        this.f9598s = dimensionPixelOffset;
        this.f9597r = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f9597r = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f9598s = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f9599t = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f9600v = dimensionPixelOffset5;
        }
        this.f9595q = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        L0 l02 = this.f9601w;
        l02.f17432h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            l02.f17429e = dimensionPixelSize;
            l02.f17425a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            l02.f17430f = dimensionPixelSize2;
            l02.f17426b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            l02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f9602x = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f9603y = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f9581f = E10.r(4);
        this.f9582g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f9584k = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable r8 = E10.r(16);
        if (r8 != null) {
            setNavigationIcon(r8);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable r10 = E10.r(11);
        if (r10 != null) {
            setLogo(r10);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(E10.p(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(E10.p(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        E10.I();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        V0 v02 = new V0(context, attributeSet);
        v02.f17469a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0997a.f14395b);
        v02.f17469a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        v02.f17470b = 0;
        return v02;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1373y c1373y = this.f9583h;
        if (c1373y != null) {
            c1373y.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f9583h.setImageDrawable(drawable);
        } else {
            C1373y c1373y = this.f9583h;
            if (c1373y != null) {
                c1373y.setImageDrawable(this.f9581f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f9580e == null) {
                this.f9580e = new AppCompatImageView(getContext(), null);
            }
            if (!n(this.f9580e)) {
                b(this.f9580e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f9580e;
            if (appCompatImageView != null && n(appCompatImageView)) {
                removeView(this.f9580e);
                this.f9568H.remove(this.f9580e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f9580e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f9580e == null) {
            this.f9580e = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f9580e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C1373y c1373y = this.f9579d;
        if (c1373y != null) {
            c1373y.setContentDescription(charSequence);
            a1.a(this.f9579d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f9579d)) {
                b(this.f9579d, true);
            }
        } else {
            C1373y c1373y = this.f9579d;
            if (c1373y != null && n(c1373y)) {
                removeView(this.f9579d);
                this.f9568H.remove(this.f9579d);
            }
        }
        C1373y c1373y2 = this.f9579d;
        if (c1373y2 != null) {
            c1373y2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f9578c;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.f9578c);
                this.f9568H.remove(this.f9578c);
            }
        } else {
            if (this.f9578c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f9578c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f9578c.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f9590n;
                if (i3 != 0) {
                    this.f9578c.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f9564D;
                if (colorStateList != null) {
                    this.f9578c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f9578c)) {
                b(this.f9578c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f9578c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f9562B = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f9564D = colorStateList;
        AppCompatTextView appCompatTextView = this.f9578c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f9577b;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.f9577b);
                this.f9568H.remove(this.f9577b);
            }
        } else {
            if (this.f9577b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f9577b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f9577b.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f9588m;
                if (i3 != 0) {
                    this.f9577b.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f9563C;
                if (colorStateList != null) {
                    this.f9577b.setTextColor(colorStateList);
                }
            }
            if (!n(this.f9577b)) {
                b(this.f9577b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f9577b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f9561A = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f9563C = colorStateList;
        AppCompatTextView appCompatTextView = this.f9577b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
