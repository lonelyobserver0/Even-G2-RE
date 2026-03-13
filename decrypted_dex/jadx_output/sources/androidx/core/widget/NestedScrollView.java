package androidx.core.widget;

import A0.c;
import N.B;
import N.C0161g;
import N.C0164j;
import N.I;
import N.InterfaceC0166l;
import N.r;
import P.a;
import Q.e;
import Q.f;
import Q.g;
import Z9.n;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import hc.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0166l {

    /* renamed from: F, reason: collision with root package name */
    public static final float f9671F = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: G, reason: collision with root package name */
    public static final e f9672G = new e(0);

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f9673H = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public g f9674A;

    /* renamed from: B, reason: collision with root package name */
    public final n f9675B;

    /* renamed from: C, reason: collision with root package name */
    public final C0164j f9676C;

    /* renamed from: D, reason: collision with root package name */
    public float f9677D;

    /* renamed from: E, reason: collision with root package name */
    public final C0161g f9678E;

    /* renamed from: a, reason: collision with root package name */
    public final float f9679a;

    /* renamed from: b, reason: collision with root package name */
    public long f9680b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f9681c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f9682d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f9683e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f9684f;

    /* renamed from: g, reason: collision with root package name */
    public r f9685g;

    /* renamed from: h, reason: collision with root package name */
    public int f9686h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9687k;

    /* renamed from: l, reason: collision with root package name */
    public View f9688l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9689m;

    /* renamed from: n, reason: collision with root package name */
    public VelocityTracker f9690n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9691p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9692q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9693r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9694s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9695t;

    /* renamed from: v, reason: collision with root package name */
    public int f9696v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f9697w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f9698x;

    /* renamed from: y, reason: collision with root package name */
    public int f9699y;

    /* renamed from: z, reason: collision with root package name */
    public int f9700z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903729);
        this.f9681c = new Rect();
        this.j = true;
        this.f9687k = false;
        this.f9688l = null;
        this.f9689m = false;
        this.f9692q = true;
        this.f9696v = -1;
        this.f9697w = new int[2];
        this.f9698x = new int[2];
        this.f9678E = new C0161g(getContext(), new c(this));
        int i3 = Build.VERSION.SDK_INT;
        this.f9683e = i3 >= 31 ? Q.c.a(context, attributeSet) : new EdgeEffect(context);
        this.f9684f = i3 >= 31 ? Q.c.a(context, attributeSet) : new EdgeEffect(context);
        this.f9679a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f9682d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f9693r = viewConfiguration.getScaledTouchSlop();
        this.f9694s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9695t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9673H, 2130903729, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f9675B = new n(1);
        this.f9676C = new C0164j(this);
        setNestedScrollingEnabled(true);
        I.i(this, f9672G);
    }

    private r getScrollFeedbackProvider() {
        if (this.f9685g == null) {
            this.f9685g = new r(this);
        }
        return this.f9685g;
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override // N.InterfaceC0166l
    public final void a(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        o(i12, i13, iArr);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // N.InterfaceC0165k
    public final void b(View view, int i3, int i10, int i11, int i12, int i13) {
        o(i12, i13, null);
    }

    @Override // N.InterfaceC0165k
    public final boolean c(View view, View view2, int i3, int i10) {
        return (i3 & 2) != 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // N.InterfaceC0165k
    public final void d(View view, View view2, int i3, int i10) {
        n nVar = this.f9675B;
        if (i10 == 1) {
            nVar.f9137c = i3;
        } else {
            nVar.f9136b = i3;
        }
        w(2, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z2) {
        return this.f9676C.a(f10, f11, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f9676C.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i10, int[] iArr, int[] iArr2) {
        return this.f9676C.c(i3, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i10, int i11, int i12, int[] iArr) {
        return this.f9676C.d(i3, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f9683e;
        int i10 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft();
            } else {
                i3 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i3, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f9684f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i10 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i10 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // N.InterfaceC0165k
    public final void e(View view, int i3) {
        n nVar = this.f9675B;
        if (i3 == 1) {
            nVar.f9137c = 0;
        } else {
            nVar.f9136b = 0;
        }
        y(i3);
    }

    @Override // N.InterfaceC0165k
    public final void f(View view, int i3, int i10, int[] iArr, int i11) {
        i(i3, i10, iArr, null, i11);
    }

    public final boolean g(int i3) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !n(findNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f9681c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            t(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i3);
        }
        if (view != null && view.isFocused() && !n(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(PKIFailureInfo.unsupportedVersion);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n nVar = this.f9675B;
        return nVar.f9137c | nVar.f9136b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f9677D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f9677D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f9677D;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i10 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i11 = rect.bottom;
        if (i11 > i10 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i10, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i11 >= i10) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i10 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f9676C.f(0);
    }

    public final boolean i(int i3, int i10, int[] iArr, int[] iArr2, int i11) {
        return this.f9676C.c(i3, i10, iArr, null, i11);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f9676C.f4794d;
    }

    public final boolean j(KeyEvent keyEvent) {
        this.f9681c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(130) : g(130);
                    }
                    if (keyCode == 62) {
                        r(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(130);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        r(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final void k(int i3) {
        if (getChildCount() > 0) {
            this.f9682d.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, IntCompanionObject.MAX_VALUE, 0, 0);
            w(2, 1);
            this.f9700z = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                a.a(this, Math.abs(this.f9682d.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i3) {
        int childCount;
        boolean z2 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f9681c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i3, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i3, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i3, int i10) {
        Rect rect = this.f9681c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i10;
    }

    public final void o(int i3, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f9676C.d(0, scrollY2, 0, i3 - scrollY2, null, i10, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9687k = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x012d, code lost:
    
        if (r6 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00d9, code lost:
    
        if (r7 >= 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f9689m) {
            return true;
        }
        int i3 = action & 255;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    int i10 = this.f9696v;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i10 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f9686h) > this.f9693r && (2 & getNestedScrollAxes()) == 0) {
                                this.f9689m = true;
                                this.f9686h = y10;
                                if (this.f9690n == null) {
                                    this.f9690n = VelocityTracker.obtain();
                                }
                                this.f9690n.addMovement(motionEvent);
                                this.f9699y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i3 != 3) {
                    if (i3 == 6) {
                        p(motionEvent);
                    }
                }
            }
            this.f9689m = false;
            this.f9696v = -1;
            VelocityTracker velocityTracker = this.f9690n;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9690n = null;
            }
            if (this.f9682d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else {
            int y11 = (int) motionEvent.getY();
            int x7 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y11 >= childAt.getTop() - scrollY && y11 < childAt.getBottom() - scrollY && x7 >= childAt.getLeft() && x7 < childAt.getRight()) {
                    this.f9686h = y11;
                    this.f9696v = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f9690n;
                    if (velocityTracker2 == null) {
                        this.f9690n = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f9690n.addMovement(motionEvent);
                    this.f9682d.computeScrollOffset();
                    if (!x(motionEvent) && this.f9682d.isFinished()) {
                        z2 = false;
                    }
                    this.f9689m = z2;
                    w(2, 0);
                }
            }
            if (!x(motionEvent) && this.f9682d.isFinished()) {
                z2 = false;
            }
            this.f9689m = z2;
            VelocityTracker velocityTracker3 = this.f9690n;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f9690n = null;
            }
        }
        return this.f9689m;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z2, i3, i10, i11, i12);
        int i14 = 0;
        this.j = false;
        View view = this.f9688l;
        if (view != null && m(view, this)) {
            View view2 = this.f9688l;
            Rect rect = this.f9681c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        this.f9688l = null;
        if (!this.f9687k) {
            if (this.f9674A != null) {
                scrollTo(getScrollX(), this.f9674A.f5686a);
                this.f9674A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i13 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i13 = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i13 && scrollY >= 0) {
                i14 = paddingTop + scrollY > i13 ? i13 - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f9687k = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (this.f9691p && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        k((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f9676C.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        i(i3, i10, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        o(i12, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        d(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i10, boolean z2, boolean z10) {
        super.scrollTo(i3, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i3) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (findNextFocus != null && n(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i3, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.f9674A = gVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f5686a = getScrollY();
        return gVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !n(findFocus, 0, i12)) {
            return;
        }
        Rect rect = this.f9681c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h2 = h(rect);
        if (h2 != 0) {
            if (this.f9692q) {
                v(0, h2, false);
            } else {
                scrollBy(0, h2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return c(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9696v) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f9686h = (int) motionEvent.getY(i3);
            this.f9696v = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f9690n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i3, int i10, int i11, int i12) {
        int i13;
        boolean z2;
        int i14;
        boolean z10;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i15 = i11 + i3;
        if (i10 <= 0 && i10 >= 0) {
            i13 = i10;
            z2 = false;
        } else {
            i13 = 0;
            z2 = true;
        }
        if (i15 > i12) {
            i14 = i12;
        } else {
            if (i15 >= 0) {
                i14 = i15;
                z10 = false;
                if (z10 && !this.f9676C.f(1)) {
                    this.f9682d.springBack(i13, i14, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i13, i14);
                return !z2 || z10;
            }
            i14 = 0;
        }
        z10 = true;
        if (z10) {
            this.f9682d.springBack(i13, i14, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i13, i14);
        if (z2) {
        }
    }

    public final void r(int i3) {
        boolean z2 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f9681c;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i10 = rect.top;
        int i11 = height + i10;
        rect.bottom = i11;
        s(i3, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.j) {
            this.f9688l = view2;
        } else {
            Rect rect = this.f9681c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h2 = h(rect);
        boolean z10 = h2 != 0;
        if (z10) {
            if (z2) {
                scrollBy(0, h2);
                return z10;
            }
            v(0, h2, false);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f9690n) != null) {
            velocityTracker.recycle();
            this.f9690n = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.j = true;
        super.requestLayout();
    }

    public final boolean s(int i3, int i10, int i11) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = height + scrollY;
        boolean z10 = i3 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i10 < scrollY || i11 > i12) {
            t(z10 ? i10 - scrollY : i11 - i12, -1, null, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i3);
        }
        return z2;
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i10 < 0) {
                i10 = 0;
            } else if (height + i10 > height2) {
                i10 = height2 - height;
            }
            if (i3 == getScrollX() && i10 == getScrollY()) {
                return;
            }
            super.scrollTo(i3, i10);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f9691p) {
            this.f9691p = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0164j c0164j = this.f9676C;
        if (c0164j.f4794d) {
            WeakHashMap weakHashMap = I.f4732a;
            B.m(c0164j.f4793c);
        }
        c0164j.f4794d = z2;
    }

    public void setOnScrollChangeListener(f fVar) {
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f9692q = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return this.f9676C.g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(int r21, int r22, android.view.MotionEvent r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.t(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    public final boolean u(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float y10 = b.y(edgeEffect) * getHeight();
        float abs = Math.abs(-i3) * 0.35f;
        float f10 = this.f9679a * 0.015f;
        double log = Math.log(abs / f10);
        double d8 = f9671F;
        return ((float) (Math.exp((d8 / (d8 - 1.0d)) * log) * ((double) f10))) < y10;
    }

    public final void v(int i3, int i10, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f9680b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f9682d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                w(2, 1);
            } else {
                y(1);
            }
            this.f9700z = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f9682d.isFinished()) {
                this.f9682d.abortAnimation();
                y(1);
            }
            scrollBy(i3, i10);
        }
        this.f9680b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean w(int i3, int i10) {
        return this.f9676C.g(2, i10);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f9683e;
        if (b.y(edgeEffect) != 0.0f) {
            b.T(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f9684f;
        if (b.y(edgeEffect2) == 0.0f) {
            return z2;
        }
        b.T(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i3) {
        this.f9676C.h(i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
