package n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import i.RunnableC1018B;
import java.lang.reflect.InvocationTargetException;

/* renamed from: n.q0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1358q0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f17583a;

    /* renamed from: b, reason: collision with root package name */
    public int f17584b;

    /* renamed from: c, reason: collision with root package name */
    public int f17585c;

    /* renamed from: d, reason: collision with root package name */
    public int f17586d;

    /* renamed from: e, reason: collision with root package name */
    public int f17587e;

    /* renamed from: f, reason: collision with root package name */
    public int f17588f;

    /* renamed from: g, reason: collision with root package name */
    public C1354o0 f17589g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17590h;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17591k;

    /* renamed from: l, reason: collision with root package name */
    public Q.d f17592l;

    /* renamed from: m, reason: collision with root package name */
    public RunnableC1018B f17593m;

    public C1358q0(Context context, boolean z2) {
        super(context, null, 2130903323);
        this.f17583a = new Rect();
        this.f17584b = 0;
        this.f17585c = 0;
        this.f17586d = 0;
        this.f17587e = 0;
        this.j = z2;
        setCacheColorHint(0);
    }

    public final int a(int i3, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i11 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i3, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i10) {
                return i10;
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1358q0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f17583a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f17593m != null) {
            return;
        }
        super.drawableStateChanged();
        C1354o0 c1354o0 = this.f17589g;
        if (c1354o0 != null) {
            c1354o0.f17572b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f17591k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.j && this.f17590h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f17593m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i3 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f17593m == null) {
            RunnableC1018B runnableC1018B = new RunnableC1018B(this, 12);
            this.f17593m = runnableC1018B;
            post(runnableC1018B);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i3 < 30 || !AbstractC1350m0.f17566d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC1350m0.f17563a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1350m0.f17564b.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC1350m0.f17565c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    } catch (InvocationTargetException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f17591k && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f17588f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC1018B runnableC1018B = this.f17593m;
        if (runnableC1018B != null) {
            C1358q0 c1358q0 = (C1358q0) runnableC1018B.f14503b;
            c1358q0.f17593m = null;
            c1358q0.removeCallbacks(runnableC1018B);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f17590h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1354o0 c1354o0 = null;
        if (drawable != null) {
            C1354o0 c1354o02 = new C1354o0();
            Drawable drawable2 = c1354o02.f17571a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1354o02.f17571a = drawable;
            drawable.setCallback(c1354o02);
            c1354o02.f17572b = true;
            c1354o0 = c1354o02;
        }
        this.f17589g = c1354o0;
        super.setSelector(c1354o0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f17584b = rect.left;
        this.f17585c = rect.top;
        this.f17586d = rect.right;
        this.f17587e = rect.bottom;
    }
}
