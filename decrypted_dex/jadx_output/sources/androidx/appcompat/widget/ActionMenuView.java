package androidx.appcompat.widget;

import a0.C0379a;
import aa.C0398e;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import i2.u;
import kotlin.jvm.internal.IntCompanionObject;
import l4.C1223z;
import m.j;
import m.k;
import m.l;
import m.n;
import m.w;
import m.z;
import n.C1337g;
import n.C1343j;
import n.C1345k;
import n.C1349m;
import n.C1366u0;
import n.InterfaceC1347l;
import n.InterfaceC1351n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ActionMenuView extends LinearLayoutCompat implements k, z {

    /* renamed from: A, reason: collision with root package name */
    public int f9474A;

    /* renamed from: B, reason: collision with root package name */
    public final int f9475B;

    /* renamed from: C, reason: collision with root package name */
    public final int f9476C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC1351n f9477D;

    /* renamed from: r, reason: collision with root package name */
    public l f9478r;

    /* renamed from: s, reason: collision with root package name */
    public Context f9479s;

    /* renamed from: t, reason: collision with root package name */
    public int f9480t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9481v;

    /* renamed from: w, reason: collision with root package name */
    public C1345k f9482w;

    /* renamed from: x, reason: collision with root package name */
    public C0398e f9483x;

    /* renamed from: y, reason: collision with root package name */
    public j f9484y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9485z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f9475B = (int) (56.0f * f10);
        this.f9476C = (int) (f10 * 4.0f);
        this.f9479s = context;
        this.f9480t = 0;
    }

    public static C1349m j() {
        C1349m c1349m = new C1349m(-2, -2);
        c1349m.f17557a = false;
        ((LinearLayout.LayoutParams) c1349m).gravity = 16;
        return c1349m;
    }

    public static C1349m k(ViewGroup.LayoutParams layoutParams) {
        C1349m c1349m;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C1349m) {
            C1349m c1349m2 = (C1349m) layoutParams;
            c1349m = new C1349m(c1349m2);
            c1349m.f17557a = c1349m2.f17557a;
        } else {
            c1349m = new C1349m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1349m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1349m).gravity = 16;
        }
        return c1349m;
    }

    @Override // m.z
    public final void b(l lVar) {
        this.f9478r = lVar;
    }

    @Override // m.k
    public final boolean c(n nVar) {
        return this.f9478r.q(nVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1349m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C1366u0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public final C1366u0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1349m(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f9478r == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.f9478r = lVar;
            lVar.f16926e = new C0379a(this, 19);
            C1345k c1345k = new C1345k(context);
            this.f9482w = c1345k;
            c1345k.f17542m = true;
            c1345k.f17543n = true;
            w wVar = this.f9483x;
            if (wVar == null) {
                wVar = new C1223z(19);
            }
            c1345k.f17536e = wVar;
            this.f9478r.b(c1345k, this.f9479s);
            C1345k c1345k2 = this.f9482w;
            c1345k2.f17539h = this;
            this.f9478r = c1345k2.f17534c;
        }
        return this.f9478r;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1345k c1345k = this.f9482w;
        C1343j c1343j = c1345k.j;
        if (c1343j != null) {
            return c1343j.getDrawable();
        }
        if (c1345k.f17541l) {
            return c1345k.f17540k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f9480t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1366u0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i3) {
        boolean z2 = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof InterfaceC1347l)) {
            z2 = ((InterfaceC1347l) childAt).b();
        }
        return (i3 <= 0 || !(childAt2 instanceof InterfaceC1347l)) ? z2 : ((InterfaceC1347l) childAt2).c() | z2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1345k c1345k = this.f9482w;
        if (c1345k != null) {
            c1345k.f();
            if (this.f9482w.k()) {
                this.f9482w.g();
                this.f9482w.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1345k c1345k = this.f9482w;
        if (c1345k != null) {
            c1345k.g();
            C1337g c1337g = c1345k.f17550w;
            if (c1337g == null || !c1337g.b()) {
                return;
            }
            c1337g.f16996i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        int width;
        int i13;
        if (!this.f9485z) {
            super.onLayout(z2, i3, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i11 - i3;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z10 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C1349m c1349m = (C1349m) childAt.getLayoutParams();
                if (c1349m.f17557a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z10) {
                        i13 = getPaddingLeft() + ((LinearLayout.LayoutParams) c1349m).leftMargin;
                        width = i13 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1349m).rightMargin;
                        i13 = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(i13, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1349m).leftMargin) + ((LinearLayout.LayoutParams) c1349m).rightMargin;
                    l(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int max = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                C1349m c1349m2 = (C1349m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1349m2.f17557a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) c1349m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1349m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            C1349m c1349m3 = (C1349m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1349m3.f17557a) {
                int i27 = paddingLeft + ((LinearLayout.LayoutParams) c1349m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft = u.C(measuredWidth4, ((LinearLayout.LayoutParams) c1349m3).rightMargin, max, i27);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        l lVar;
        boolean z2 = this.f9485z;
        boolean z10 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f9485z = z10;
        if (z2 != z10) {
            this.f9474A = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f9485z && (lVar = this.f9478r) != null && size != this.f9474A) {
            this.f9474A = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f9485z || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                C1349m c1349m = (C1349m) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) c1349m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1349m).leftMargin = 0;
            }
            super.onMeasure(i3, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.f9475B;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z11 = false;
        int i25 = 0;
        long j = 0;
        while (true) {
            i11 = this.f9476C;
            if (i24 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i24);
            int i26 = size3;
            int i27 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z12) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                C1349m c1349m2 = (C1349m) childAt.getLayoutParams();
                c1349m2.f17562f = false;
                c1349m2.f17559c = 0;
                c1349m2.f17558b = 0;
                c1349m2.f17560d = false;
                ((LinearLayout.LayoutParams) c1349m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1349m2).rightMargin = 0;
                c1349m2.f17561e = z12 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i28 = c1349m2.f17557a ? 1 : i18;
                C1349m c1349m3 = (C1349m) childAt.getLayoutParams();
                int i29 = i18;
                i13 = i20;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i27, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z12 ? (ActionMenuItemView) childAt : null;
                boolean z13 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z14 = z13;
                if (i28 <= 0 || (z13 && i28 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i28, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z14 && i14 < 2) {
                        i14 = 2;
                    }
                }
                c1349m3.f17560d = !c1349m3.f17557a && z14;
                c1349m3.f17558b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, 1073741824), makeMeasureSpec);
                i23 = Math.max(i23, i14);
                if (c1349m2.f17560d) {
                    i25++;
                }
                if (c1349m2.f17557a) {
                    z11 = true;
                }
                i18 = i29 - i14;
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j |= 1 << i24;
                }
            }
            i24++;
            size3 = i26;
            paddingBottom = i27;
            i20 = i13;
        }
        int i30 = size3;
        int i31 = i18;
        int i32 = i20;
        boolean z15 = z11 && i22 == 2;
        int i33 = i31;
        boolean z16 = false;
        while (i25 > 0 && i33 > 0) {
            int i34 = IntCompanionObject.MAX_VALUE;
            long j3 = 0;
            int i35 = 0;
            int i36 = 0;
            while (i36 < childCount2) {
                boolean z17 = z15;
                C1349m c1349m4 = (C1349m) getChildAt(i36).getLayoutParams();
                int i37 = i21;
                if (c1349m4.f17560d) {
                    int i38 = c1349m4.f17558b;
                    if (i38 < i34) {
                        j3 = 1 << i36;
                        i34 = i38;
                        i35 = 1;
                    } else if (i38 == i34) {
                        j3 |= 1 << i36;
                        i35++;
                    }
                }
                i36++;
                i21 = i37;
                z15 = z17;
            }
            boolean z18 = z15;
            i12 = i21;
            j |= j3;
            if (i35 > i33) {
                break;
            }
            int i39 = i34 + 1;
            int i40 = 0;
            while (i40 < childCount2) {
                View childAt2 = getChildAt(i40);
                C1349m c1349m5 = (C1349m) childAt2.getLayoutParams();
                boolean z19 = z11;
                long j10 = 1 << i40;
                if ((j3 & j10) != 0) {
                    if (z18 && c1349m5.f17561e) {
                        r11 = 1;
                        r11 = 1;
                        if (i33 == 1) {
                            childAt2.setPadding(i11 + i32, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1349m5.f17558b += r11;
                    c1349m5.f17562f = r11;
                    i33--;
                } else if (c1349m5.f17558b == i39) {
                    j |= j10;
                }
                i40++;
                z11 = z19;
            }
            i21 = i12;
            z15 = z18;
            z16 = true;
        }
        i12 = i21;
        boolean z20 = !z11 && i22 == 1;
        if (i33 > 0 && j != 0 && (i33 < i22 - 1 || z20 || i23 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z20) {
                if ((j & 1) != 0 && !((C1349m) getChildAt(0).getLayoutParams()).f17561e) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount2 - 1;
                if ((j & (1 << i41)) != 0 && !((C1349m) getChildAt(i41).getLayoutParams()).f17561e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i33 * i32) / bitCount) : 0;
            boolean z21 = z16;
            for (int i43 = 0; i43 < childCount2; i43++) {
                if ((j & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    C1349m c1349m6 = (C1349m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1349m6.f17559c = i42;
                        c1349m6.f17562f = true;
                        if (i43 == 0 && !c1349m6.f17561e) {
                            ((LinearLayout.LayoutParams) c1349m6).leftMargin = (-i42) / 2;
                        }
                        z21 = true;
                    } else if (c1349m6.f17557a) {
                        c1349m6.f17559c = i42;
                        c1349m6.f17562f = true;
                        ((LinearLayout.LayoutParams) c1349m6).rightMargin = (-i42) / 2;
                        z21 = true;
                    } else {
                        if (i43 != 0) {
                            ((LinearLayout.LayoutParams) c1349m6).leftMargin = i42 / 2;
                        }
                        if (i43 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c1349m6).rightMargin = i42 / 2;
                        }
                    }
                }
            }
            z16 = z21;
        }
        if (z16) {
            for (int i44 = 0; i44 < childCount2; i44++) {
                View childAt4 = getChildAt(i44);
                C1349m c1349m7 = (C1349m) childAt4.getLayoutParams();
                if (c1349m7.f17562f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1349m7.f17558b * i32) + c1349m7.f17559c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i30);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f9482w.f17547s = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC1351n interfaceC1351n) {
        this.f9477D = interfaceC1351n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1345k c1345k = this.f9482w;
        C1343j c1343j = c1345k.j;
        if (c1343j != null) {
            c1343j.setImageDrawable(drawable);
        } else {
            c1345k.f17541l = true;
            c1345k.f17540k = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f9481v = z2;
    }

    public void setPopupTheme(int i3) {
        if (this.f9480t != i3) {
            this.f9480t = i3;
            if (i3 == 0) {
                this.f9479s = getContext();
            } else {
                this.f9479s = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(C1345k c1345k) {
        this.f9482w = c1345k;
        c1345k.f17539h = this;
        this.f9478r = c1345k.f17534c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1349m(getContext(), attributeSet);
    }
}
