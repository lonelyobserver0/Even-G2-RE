package androidx.recyclerview.widget;

import N.C0164j;
import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t.C1697j;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class RecyclerView extends ViewGroup {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    g0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    C mAdapter;
    C0449b mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private E mChildDrawingOrderCallback;
    C0450c mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private F mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC0464q mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private Q mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    I mItemAnimator;
    private G mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<J> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    M mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final X mObserver;
    private List<O> mOnChildAttachStateListeners;
    private P mOnFlingListener;
    private final ArrayList<Q> mOnItemTouchListeners;
    final List<e0> mPendingAccessibilityImportanceChange;
    private Y mPendingSavedState;
    boolean mPostedAnimatorRunner;
    C0462o mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final V mRecycler;
    W mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private S mScrollListener;
    private List<S> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0164j mScrollingChildHelper;
    final b0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final d0 mViewFlinger;
    private final q0 mViewInfoProcessCallback;
    final r0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new S.d(1);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(e0 e0Var) {
        View view = e0Var.f10140a;
        boolean z2 = view.getParent() == this;
        this.mRecycler.k(getChildViewHolder(view));
        if (e0Var.j()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.mChildHelper.a(-1, view, true);
            return;
        }
        C0450c c0450c = this.mChildHelper;
        int indexOfChild = c0450c.f10121a.f9998a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0450c.f10122b.N(indexOfChild);
            c0450c.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(e0 e0Var, e0 e0Var2, H h2, H h4, boolean z2, boolean z10) {
        e0Var.n(false);
        if (z2) {
            addAnimatingView(e0Var);
        }
        if (e0Var != e0Var2) {
            if (z10) {
                addAnimatingView(e0Var2);
            }
            e0Var.f10147h = e0Var2;
            addAnimatingView(e0Var);
            this.mRecycler.k(e0Var);
            e0Var2.n(false);
            e0Var2.f10148i = e0Var;
        }
        if (this.mItemAnimator.a(e0Var, e0Var2, h2, h4)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(e0 e0Var) {
        WeakReference weakReference = e0Var.f10141b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == e0Var.f10140a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            e0Var.f10141b = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i3, int i10) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(M.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i3), Integer.valueOf(i10)};
                } catch (NoSuchMethodException e10) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((M) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            }
        }
    }

    private boolean didChildRangeChange(int i3, int i10) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i3 && iArr[1] == i10) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i3 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i3 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        obtain.setContentChangeTypes(i3);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        p0 p0Var;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f10116i = false;
        startInterceptRequestLayout();
        r0 r0Var = this.mViewInfoStore;
        r0Var.f10285a.clear();
        r0Var.f10286b.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        b0 b0Var = this.mState;
        b0Var.f10115h = b0Var.j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        b0Var.f10114g = b0Var.f10117k;
        b0Var.f10112e = this.mAdapter.a();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int e10 = this.mChildHelper.e();
            for (int i3 = 0; i3 < e10; i3++) {
                e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i3));
                if (!childViewHolderInt.o() && (!childViewHolderInt.f() || this.mAdapter.f10000b)) {
                    I i10 = this.mItemAnimator;
                    I.b(childViewHolderInt);
                    childViewHolderInt.c();
                    i10.getClass();
                    H h2 = new H();
                    h2.a(childViewHolderInt);
                    C1697j c1697j = this.mViewInfoStore.f10285a;
                    p0 p0Var2 = (p0) c1697j.get(childViewHolderInt);
                    if (p0Var2 == null) {
                        p0Var2 = p0.a();
                        c1697j.put(childViewHolderInt, p0Var2);
                    }
                    p0Var2.f10275b = h2;
                    p0Var2.f10274a |= 4;
                    if (this.mState.f10115h && childViewHolderInt.k() && !childViewHolderInt.h() && !childViewHolderInt.o() && !childViewHolderInt.f()) {
                        this.mViewInfoStore.f10286b.d(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f10117k) {
            saveOldPositions();
            b0 b0Var2 = this.mState;
            boolean z2 = b0Var2.f10113f;
            b0Var2.f10113f = false;
            this.mLayout.V(this.mRecycler, b0Var2);
            this.mState.f10113f = z2;
            for (int i11 = 0; i11 < this.mChildHelper.e(); i11++) {
                e0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i11));
                if (!childViewHolderInt2.o() && ((p0Var = (p0) this.mViewInfoStore.f10285a.get(childViewHolderInt2)) == null || (p0Var.f10274a & 4) == 0)) {
                    I.b(childViewHolderInt2);
                    boolean z10 = (childViewHolderInt2.j & 8192) != 0;
                    I i12 = this.mItemAnimator;
                    childViewHolderInt2.c();
                    i12.getClass();
                    H h4 = new H();
                    h4.a(childViewHolderInt2);
                    if (z10) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, h4);
                    } else {
                        C1697j c1697j2 = this.mViewInfoStore.f10285a;
                        p0 p0Var3 = (p0) c1697j2.get(childViewHolderInt2);
                        if (p0Var3 == null) {
                            p0Var3 = p0.a();
                            c1697j2.put(childViewHolderInt2, p0Var3);
                        }
                        p0Var3.f10274a |= 2;
                        p0Var3.f10275b = h4;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f10111d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.b();
        this.mState.f10112e = this.mAdapter.a();
        b0 b0Var = this.mState;
        b0Var.f10110c = 0;
        b0Var.f10114g = false;
        this.mLayout.V(this.mRecycler, b0Var);
        b0 b0Var2 = this.mState;
        b0Var2.f10113f = false;
        this.mPendingSavedState = null;
        b0Var2.j = b0Var2.j && this.mItemAnimator != null;
        b0Var2.f10111d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void dispatchLayoutStep3() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.dispatchLayoutStep3():void");
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        Q q10 = this.mInterceptingOnItemTouchListener;
        if (q10 == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        C0461n c0461n = (C0461n) q10;
        if (c0461n.f10247v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean d8 = c0461n.d(motionEvent.getX(), motionEvent.getY());
                boolean c10 = c0461n.c(motionEvent.getX(), motionEvent.getY());
                if (d8 || c10) {
                    if (c10) {
                        c0461n.f10248w = 1;
                        c0461n.f10241p = (int) motionEvent.getX();
                    } else if (d8) {
                        c0461n.f10248w = 2;
                        c0461n.f10238m = (int) motionEvent.getY();
                    }
                    c0461n.f(2);
                }
            } else if (motionEvent.getAction() == 1 && c0461n.f10247v == 2) {
                c0461n.f10238m = 0.0f;
                c0461n.f10241p = 0.0f;
                c0461n.f(1);
                c0461n.f10248w = 0;
            } else if (motionEvent.getAction() == 2 && c0461n.f10247v == 2) {
                c0461n.g();
                int i3 = c0461n.f10248w;
                int i10 = c0461n.f10228b;
                if (i3 == 1) {
                    float x7 = motionEvent.getX();
                    int[] iArr = c0461n.f10250y;
                    iArr[0] = i10;
                    int i11 = c0461n.f10242q - i10;
                    iArr[1] = i11;
                    float max = Math.max(i10, Math.min(i11, x7));
                    if (Math.abs(c0461n.f10240o - max) >= 2.0f) {
                        int e10 = C0461n.e(c0461n.f10241p, max, iArr, c0461n.f10244s.computeHorizontalScrollRange(), c0461n.f10244s.computeHorizontalScrollOffset(), c0461n.f10242q);
                        if (e10 != 0) {
                            c0461n.f10244s.scrollBy(e10, 0);
                        }
                        c0461n.f10241p = max;
                    }
                }
                if (c0461n.f10248w == 2) {
                    float y10 = motionEvent.getY();
                    int[] iArr2 = c0461n.f10249x;
                    iArr2[0] = i10;
                    int i12 = c0461n.f10243r - i10;
                    iArr2[1] = i12;
                    float max2 = Math.max(i10, Math.min(i12, y10));
                    if (Math.abs(c0461n.f10237l - max2) >= 2.0f) {
                        int e11 = C0461n.e(c0461n.f10238m, max2, iArr2, c0461n.f10244s.computeVerticalScrollRange(), c0461n.f10244s.computeVerticalScrollOffset(), c0461n.f10243r);
                        if (e11 != 0) {
                            c0461n.f10244s.scrollBy(0, e11);
                        }
                        c0461n.f10238m = max2;
                    }
                }
            }
        }
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean findInterceptingOnItemTouchListener(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList<androidx.recyclerview.widget.Q> r1 = r11.mOnItemTouchListeners
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L69
            java.util.ArrayList<androidx.recyclerview.widget.Q> r4 = r11.mOnItemTouchListeners
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.Q r4 = (androidx.recyclerview.widget.Q) r4
            r5 = r4
            androidx.recyclerview.widget.n r5 = (androidx.recyclerview.widget.C0461n) r5
            int r6 = r5.f10247v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L5e
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L66
            if (r6 != 0) goto L41
            if (r9 == 0) goto L66
        L41:
            if (r9 == 0) goto L4e
            r5.f10248w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f10241p = r6
            goto L5a
        L4e:
            if (r6 == 0) goto L5a
            r5.f10248w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f10238m = r6
        L5a:
            r5.f(r8)
            goto L60
        L5e:
            if (r6 != r8) goto L66
        L60:
            r5 = 3
            if (r0 == r5) goto L66
            r11.mInterceptingOnItemTouchListener = r4
            return r7
        L66:
            int r3 = r3 + 1
            goto Lc
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findInterceptingOnItemTouchListener(android.view.MotionEvent):boolean");
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e10 = this.mChildHelper.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i3 = IntCompanionObject.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < e10; i11++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
            if (!childViewHolderInt.o()) {
                int b2 = childViewHolderInt.b();
                if (b2 < i3) {
                    i3 = b2;
                }
                if (b2 > i10) {
                    i10 = b2;
                }
            }
        }
        iArr[0] = i3;
        iArr[1] = i10;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i3));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        e0 findViewHolderForAdapterPosition;
        View view;
        b0 b0Var = this.mState;
        int i3 = b0Var.f10118l;
        if (i3 == -1) {
            i3 = 0;
        }
        int b2 = b0Var.b();
        for (int i10 = i3; i10 < b2; i10++) {
            e0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i10);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            View view2 = findViewHolderForAdapterPosition2.f10140a;
            if (view2.hasFocusable()) {
                return view2;
            }
        }
        int min = Math.min(b2, i3);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            view = findViewHolderForAdapterPosition.f10140a;
        } while (!view.hasFocusable());
        return view;
    }

    public static e0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((N) view.getLayoutParams()).f10052a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        N n10 = (N) view.getLayoutParams();
        Rect rect2 = n10.f10053b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) n10).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) n10).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) n10).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) n10).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private C0164j getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0164j(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, e0 e0Var, e0 e0Var2) {
        int e10 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e10; i3++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i3));
            if (childViewHolderInt != e0Var && getChangedHolderKey(childViewHolderInt) == j) {
                C c10 = this.mAdapter;
                if (c10 == null || !c10.f10000b) {
                    StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb2.append(childViewHolderInt);
                    sb2.append(" \n View Holder 2:");
                    sb2.append(e0Var);
                    throw new IllegalStateException(Xa.h.j(this, sb2));
                }
                StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb3.append(childViewHolderInt);
                sb3.append(" \n View Holder 2:");
                sb3.append(e0Var);
                throw new IllegalStateException(Xa.h.j(this, sb3));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e0Var2 + " cannot be found but it is necessary for " + e0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int e10 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e10; i3++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.o() && childViewHolderInt.k()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap weakHashMap = N.I.f4732a;
        if (N.D.a(this) == 0) {
            N.D.b(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0450c(new B(this));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i3) {
        int i10;
        if (view2 != null && view2 != this && findContainingItemView(view2) != null) {
            if (view != null && findContainingItemView(view) != null) {
                this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
                this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
                offsetDescendantRectToMyCoords(view, this.mTempRect);
                offsetDescendantRectToMyCoords(view2, this.mTempRect2);
                RecyclerView recyclerView = this.mLayout.f10039b;
                WeakHashMap weakHashMap = N.I.f4732a;
                char c10 = 65535;
                int i11 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
                Rect rect = this.mTempRect;
                int i12 = rect.left;
                Rect rect2 = this.mTempRect2;
                int i13 = rect2.left;
                if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
                    i10 = 1;
                } else {
                    int i14 = rect.right;
                    int i15 = rect2.right;
                    i10 = ((i14 > i15 || i12 >= i15) && i12 > i13) ? -1 : 0;
                }
                int i16 = rect.top;
                int i17 = rect2.top;
                if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
                    c10 = 1;
                } else {
                    int i18 = rect.bottom;
                    int i19 = rect2.bottom;
                    if ((i18 <= i19 && i16 < i19) || i16 <= i17) {
                        c10 = 0;
                    }
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 17) {
                            if (i3 != 33) {
                                if (i3 != 66) {
                                    if (i3 != 130) {
                                        StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                        sb2.append(i3);
                                        throw new IllegalArgumentException(Xa.h.j(this, sb2));
                                    }
                                    if (c10 > 0) {
                                    }
                                } else if (i10 > 0) {
                                }
                            } else if (c10 < 0) {
                            }
                        } else if (i10 < 0) {
                        }
                    } else if (c10 > 0 || (c10 == 0 && i10 * i11 >= 0)) {
                    }
                } else if (c10 < 0 || (c10 == 0 && i10 * i11 <= 0)) {
                }
            }
            return true;
        }
        return false;
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i3);
            int x7 = (int) (motionEvent.getX(i3) + 0.5f);
            this.mLastTouchX = x7;
            this.mInitialTouchX = x7;
            int y10 = (int) (motionEvent.getY(i3) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void processAdapterUpdatesAndSetAnimationFlags() {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.processAdapterUpdatesAndSetAnimationFlags():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            Q.b.a(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            Q.b.a(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            Q.b.a(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            Q.b.a(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            java.util.WeakHashMap r7 = N.I.f4732a
            r6.postInvalidateOnAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void recoverFocusFromState() {
        /*
            r8 = this;
            boolean r0 = r8.mPreserveFocusAfterLayout
            if (r0 == 0) goto Lac
            androidx.recyclerview.widget.C r0 = r8.mAdapter
            if (r0 == 0) goto Lac
            boolean r0 = r8.hasFocus()
            if (r0 == 0) goto Lac
            int r0 = r8.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto Lac
            int r0 = r8.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L26
            boolean r0 = r8.isFocused()
            if (r0 == 0) goto L26
            goto Lac
        L26:
            boolean r0 = r8.isFocused()
            if (r0 != 0) goto L57
            android.view.View r0 = r8.getFocusedChild()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD
            if (r1 == 0) goto L4c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L40
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L4c
        L40:
            androidx.recyclerview.widget.c r0 = r8.mChildHelper
            int r0 = r0.e()
            if (r0 != 0) goto L57
            r8.requestFocus()
            return
        L4c:
            androidx.recyclerview.widget.c r1 = r8.mChildHelper
            java.util.ArrayList r1 = r1.f10123c
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L57
            goto Lac
        L57:
            androidx.recyclerview.widget.b0 r0 = r8.mState
            long r0 = r0.f10119m
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 == 0) goto L6d
            androidx.recyclerview.widget.C r4 = r8.mAdapter
            boolean r4 = r4.f10000b
            if (r4 == 0) goto L6d
            androidx.recyclerview.widget.e0 r0 = r8.findViewHolderForItemId(r0)
            goto L6e
        L6d:
            r0 = r5
        L6e:
            if (r0 == 0) goto L85
            androidx.recyclerview.widget.c r1 = r8.mChildHelper
            java.util.ArrayList r1 = r1.f10123c
            android.view.View r0 = r0.f10140a
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L85
            boolean r1 = r0.hasFocusable()
            if (r1 != 0) goto L83
            goto L85
        L83:
            r5 = r0
            goto L91
        L85:
            androidx.recyclerview.widget.c r0 = r8.mChildHelper
            int r0 = r0.e()
            if (r0 <= 0) goto L91
            android.view.View r5 = r8.findNextViewToFocus()
        L91:
            if (r5 == 0) goto Lac
            androidx.recyclerview.widget.b0 r0 = r8.mState
            int r0 = r0.f10120n
            long r6 = (long) r0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto La9
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto La9
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto La9
            r5 = r0
        La9:
            r5.requestFocus()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.recoverFocusFromState():void");
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = N.I.f4732a;
            postInvalidateOnAnimation();
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof N) {
            N n10 = (N) layoutParams;
            if (!n10.f10054c) {
                Rect rect = this.mTempRect;
                int i3 = rect.left;
                Rect rect2 = n10.f10053b;
                rect.left = i3 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.e0(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        b0 b0Var = this.mState;
        b0Var.f10119m = -1L;
        b0Var.f10118l = -1;
        b0Var.f10120n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        e0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        b0 b0Var = this.mState;
        b0Var.f10119m = this.mAdapter.f10000b ? findContainingViewHolder.f10144e : -1L;
        int i3 = -1;
        if (!this.mDataSetHasChangedAfterLayout) {
            if (findContainingViewHolder.h()) {
                i3 = findContainingViewHolder.f10143d;
            } else {
                RecyclerView recyclerView = findContainingViewHolder.f10156r;
                if (recyclerView != null) {
                    i3 = recyclerView.getAdapterPositionFor(findContainingViewHolder);
                }
            }
        }
        b0Var.f10118l = i3;
        this.mState.f10120n = getDeepestFocusedViewWithId(findContainingViewHolder.f10140a);
    }

    private void setAdapterInternal(C c10, boolean z2, boolean z10) {
        C c11 = this.mAdapter;
        if (c11 != null) {
            c11.f9999a.unregisterObserver(this.mObserver);
            this.mAdapter.getClass();
        }
        if (!z2 || z10) {
            removeAndRecycleViews();
        }
        C0449b c0449b = this.mAdapterHelper;
        c0449b.i(c0449b.f10104b);
        c0449b.i(c0449b.f10105c);
        C c12 = this.mAdapter;
        this.mAdapter = c10;
        if (c10 != null) {
            c10.f9999a.registerObserver(this.mObserver);
        }
        V v2 = this.mRecycler;
        C c13 = this.mAdapter;
        v2.f10084a.clear();
        v2.e();
        U c14 = v2.c();
        if (c12 != null) {
            c14.f10083b--;
        }
        if (!z2 && c14.f10083b == 0) {
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = c14.f10082a;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                ((T) sparseArray.valueAt(i3)).f10078a.clear();
                i3++;
            }
        }
        if (c13 != null) {
            c14.f10083b++;
        } else {
            c14.getClass();
        }
        this.mState.f10113f = true;
    }

    private void stopScrollersInternal() {
        C0470x c0470x;
        d0 d0Var = this.mViewFlinger;
        d0Var.f10133g.removeCallbacks(d0Var);
        d0Var.f10129c.abortAnimation();
        M m4 = this.mLayout;
        if (m4 == null || (c0470x = m4.f10042e) == null) {
            return;
        }
        c0470x.g();
    }

    public void absorbGlows(int i3, int i10) {
        if (i3 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i3);
            }
        }
        if (i10 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i10);
            }
        }
        if (i3 == 0 && i10 == 0) {
            return;
        }
        WeakHashMap weakHashMap = N.I.f4732a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i3, int i10) {
        M m4 = this.mLayout;
        if (m4 != null) {
            m4.getClass();
        }
        super.addFocusables(arrayList, i3, i10);
    }

    public void addItemDecoration(J j, int i3) {
        M m4 = this.mLayout;
        if (m4 != null) {
            m4.c("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i3 < 0) {
            this.mItemDecorations.add(j);
        } else {
            this.mItemDecorations.add(i3, j);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(O o5) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(o5);
    }

    public void addOnItemTouchListener(Q q10) {
        this.mOnItemTouchListeners.add(q10);
    }

    public void addOnScrollListener(S s10) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(s10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void animateAppearance(androidx.recyclerview.widget.e0 r8, androidx.recyclerview.widget.H r9, androidx.recyclerview.widget.H r10) {
        /*
            r7 = this;
            r0 = 0
            r8.n(r0)
            androidx.recyclerview.widget.I r0 = r7.mItemAnimator
            r1 = r0
            androidx.recyclerview.widget.j r1 = (androidx.recyclerview.widget.C0457j) r1
            if (r9 == 0) goto L1b
            r1.getClass()
            int r3 = r9.f10009a
            int r5 = r10.f10009a
            if (r3 != r5) goto L1d
            int r0 = r9.f10010b
            int r2 = r10.f10010b
            if (r0 == r2) goto L1b
            goto L1d
        L1b:
            r2 = r8
            goto L27
        L1d:
            int r4 = r9.f10010b
            int r6 = r10.f10010b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L36
        L27:
            r1.l(r2)
            android.view.View r8 = r2.f10140a
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.f10189i
            r8.add(r2)
            r8 = 1
        L36:
            if (r8 == 0) goto L3b
            r7.postAnimationRunner()
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.animateAppearance(androidx.recyclerview.widget.e0, androidx.recyclerview.widget.H, androidx.recyclerview.widget.H):void");
    }

    public void animateDisappearance(e0 e0Var, H h2, H h4) {
        boolean z2;
        addAnimatingView(e0Var);
        e0Var.n(false);
        C0457j c0457j = (C0457j) this.mItemAnimator;
        c0457j.getClass();
        int i3 = h2.f10009a;
        int i10 = h2.f10010b;
        View view = e0Var.f10140a;
        int left = h4 == null ? view.getLeft() : h4.f10009a;
        int top = h4 == null ? view.getTop() : h4.f10010b;
        if (e0Var.h() || (i3 == left && i10 == top)) {
            c0457j.l(e0Var);
            c0457j.f10188h.add(e0Var);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0457j.g(e0Var, i3, i10, left, top);
        }
        if (z2) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(Xa.h.j(this, AbstractC1856e.b(str)));
        }
        throw new IllegalStateException(Xa.h.j(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(Xa.h.j(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(Xa.h.j(this, new StringBuilder(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(e0 e0Var) {
        I i3 = this.mItemAnimator;
        if (i3 != null) {
            return (e0Var.c().isEmpty() && ((C0457j) i3).f10187g && !e0Var.f()) ? false : true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof N) && this.mLayout.f((N) layoutParams);
    }

    public void clearOldPositions() {
        int h2 = this.mChildHelper.h();
        for (int i3 = 0; i3 < h2; i3++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (!childViewHolderInt.o()) {
                childViewHolderInt.f10143d = -1;
                childViewHolderInt.f10146g = -1;
            }
        }
        V v2 = this.mRecycler;
        ArrayList arrayList = v2.f10086c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e0 e0Var = (e0) arrayList.get(i10);
            e0Var.f10143d = -1;
            e0Var.f10146g = -1;
        }
        ArrayList arrayList2 = v2.f10084a;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            e0 e0Var2 = (e0) arrayList2.get(i11);
            e0Var2.f10143d = -1;
            e0Var2.f10146g = -1;
        }
        ArrayList arrayList3 = v2.f10085b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                e0 e0Var3 = (e0) v2.f10085b.get(i12);
                e0Var3.f10143d = -1;
                e0Var3.f10146g = -1;
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<O> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<S> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        M m4 = this.mLayout;
        if (m4 != null && m4.d()) {
            return this.mLayout.j(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        M m4 = this.mLayout;
        if (m4 != null && m4.d()) {
            return this.mLayout.k(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        M m4 = this.mLayout;
        if (m4 != null && m4.d()) {
            return this.mLayout.l(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        M m4 = this.mLayout;
        if (m4 != null && m4.e()) {
            return this.mLayout.m(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        M m4 = this.mLayout;
        if (m4 != null && m4.e()) {
            return this.mLayout.n(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        M m4 = this.mLayout;
        if (m4 != null && m4.e()) {
            return this.mLayout.o(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i3, int i10) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            z2 = false;
        } else {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = N.I.f4732a;
            postInvalidateOnAnimation();
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i3 = J.g.f3258a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.f()) {
            this.mAdapterHelper.getClass();
            if (this.mAdapterHelper.f()) {
                int i10 = J.g.f3258a;
                Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                Trace.endSection();
            }
        }
    }

    public void defaultOnMeasure(int i3, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = N.I.f4732a;
        setMeasuredDimension(M.g(i3, paddingRight, getMinimumWidth()), M.g(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        int size;
        getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        if (this.mOnChildAttachStateListeners == null || r2.size() - 1 < 0) {
            return;
        }
        this.mOnChildAttachStateListeners.get(size).getClass();
        throw new ClassCastException();
    }

    public void dispatchChildDetached(View view) {
        int size;
        getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        if (this.mOnChildAttachStateListeners == null || r2.size() - 1 < 0) {
            return;
        }
        this.mOnChildAttachStateListeners.get(size).getClass();
        throw new ClassCastException();
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        b0 b0Var = this.mState;
        b0Var.f10116i = false;
        if (b0Var.f10111d == 1) {
            dispatchLayoutStep1();
            this.mLayout.j0(this);
            dispatchLayoutStep2();
        } else {
            C0449b c0449b = this.mAdapterHelper;
            if ((c0449b.f10105c.isEmpty() || c0449b.f10104b.isEmpty()) && this.mLayout.f10050n == getWidth() && this.mLayout.f10051o == getHeight()) {
                this.mLayout.j0(this);
            } else {
                this.mLayout.j0(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z2) {
        return getScrollingChildHelper().a(f10, f11, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i3, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i3, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i3, i10, i11, i12, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i3) {
        M m4 = this.mLayout;
        if (m4 != null) {
            m4.Z(i3);
        }
        onScrollStateChanged(i3);
        S s10 = this.mScrollListener;
        if (s10 != null) {
            s10.a(this, i3);
        }
        List<S> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i3);
            }
        }
    }

    public void dispatchOnScrolled(int i3, int i10) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i3, scrollY - i10);
        onScrolled(i3, i10);
        S s10 = this.mScrollListener;
        if (s10 != null) {
            s10.b(this, i3, i10);
        }
        List<S> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i3, i10);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i3;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            e0 e0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (e0Var.f10140a.getParent() == this && !e0Var.o() && (i3 = e0Var.f10155q) != -1) {
                WeakHashMap weakHashMap = N.I.f4732a;
                e0Var.f10140a.setImportantForAccessibility(i3);
                e0Var.f10155q = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z10 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.mItemDecorations.get(i3).b(canvas);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z2 |= z10;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) ? z2 : true) {
            WeakHashMap weakHashMap = N.I.f4732a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(b0 b0Var) {
        if (getScrollState() != 2) {
            b0Var.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f10129c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        b0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int e10 = this.mChildHelper.e() - 1; e10 >= 0; e10--) {
            View d8 = this.mChildHelper.d(e10);
            float translationX = d8.getTranslationX();
            float translationY = d8.getTranslationY();
            if (f10 >= d8.getLeft() + translationX && f10 <= d8.getRight() + translationX && f11 >= d8.getTop() + translationY && f11 <= d8.getBottom() + translationY) {
                return d8;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public e0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public e0 findViewHolderForAdapterPosition(int i3) {
        e0 e0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h2 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h2; i10++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.h() && getAdapterPositionFor(childViewHolderInt) == i3) {
                if (!this.mChildHelper.f10123c.contains(childViewHolderInt.f10140a)) {
                    return childViewHolderInt;
                }
                e0Var = childViewHolderInt;
            }
        }
        return e0Var;
    }

    public e0 findViewHolderForItemId(long j) {
        C c10 = this.mAdapter;
        e0 e0Var = null;
        if (c10 != null && c10.f10000b) {
            int h2 = this.mChildHelper.h();
            for (int i3 = 0; i3 < h2; i3++) {
                e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
                if (childViewHolderInt != null && !childViewHolderInt.h() && childViewHolderInt.f10144e == j) {
                    if (!this.mChildHelper.f10123c.contains(childViewHolderInt.f10140a)) {
                        return childViewHolderInt;
                    }
                    e0Var = childViewHolderInt;
                }
            }
        }
        return e0Var;
    }

    public e0 findViewHolderForLayoutPosition(int i3) {
        return findViewHolderForPosition(i3, false);
    }

    @Deprecated
    public e0 findViewHolderForPosition(int i3) {
        return findViewHolderForPosition(i3, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fling(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r9, int r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        M m4 = this.mLayout;
        if (m4 != null) {
            return m4.r();
        }
        throw new IllegalStateException(Xa.h.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        M m4 = this.mLayout;
        if (m4 != null) {
            return m4.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(Xa.h.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionFor(e0 e0Var) {
        if (((e0Var.j & 524) != 0) || !e0Var.e()) {
            return -1;
        }
        C0449b c0449b = this.mAdapterHelper;
        int i3 = e0Var.f10142c;
        ArrayList arrayList = c0449b.f10104b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0448a c0448a = (C0448a) arrayList.get(i10);
            int i11 = c0448a.f10100a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = c0448a.f10101b;
                    if (i12 <= i3) {
                        int i13 = c0448a.f10102c;
                        if (i12 + i13 > i3) {
                            return -1;
                        }
                        i3 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = c0448a.f10101b;
                    if (i14 == i3) {
                        i3 = c0448a.f10102c;
                    } else {
                        if (i14 < i3) {
                            i3--;
                        }
                        if (c0448a.f10102c <= i3) {
                            i3++;
                        }
                    }
                }
            } else if (c0448a.f10101b <= i3) {
                i3 += c0448a.f10102c;
            }
        }
        return i3;
    }

    @Override // android.view.View
    public int getBaseline() {
        M m4 = this.mLayout;
        if (m4 == null) {
            return super.getBaseline();
        }
        m4.getClass();
        return -1;
    }

    public long getChangedHolderKey(e0 e0Var) {
        return this.mAdapter.f10000b ? e0Var.f10144e : e0Var.f10142c;
    }

    public int getChildAdapterPosition(View view) {
        RecyclerView recyclerView;
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt == null || (recyclerView = childViewHolderInt.f10156r) == null) {
            return -1;
        }
        return recyclerView.getAdapterPositionFor(childViewHolderInt);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i3, int i10) {
        return super.getChildDrawingOrder(i3, i10);
    }

    public long getChildItemId(View view) {
        e0 childViewHolderInt;
        C c10 = this.mAdapter;
        if (c10 == null || !c10.f10000b || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.f10144e;
    }

    public int getChildLayoutPosition(View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.b();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public e0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public g0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public F getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public I getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        N n10 = (N) view.getLayoutParams();
        boolean z2 = n10.f10054c;
        Rect rect = n10.f10053b;
        if (!z2 || (this.mState.f10114g && (n10.f10052a.k() || n10.f10052a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.mTempRect.set(0, 0, 0, 0);
            J j = this.mItemDecorations.get(i3);
            Rect rect2 = this.mTempRect;
            j.getClass();
            ((N) view.getLayoutParams()).f10052a.getClass();
            rect2.set(0, 0, 0, 0);
            int i10 = rect.left;
            Rect rect3 = this.mTempRect;
            rect.left = i10 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        n10.f10054c = false;
        return rect;
    }

    public J getItemDecorationAt(int i3) {
        int itemDecorationCount = getItemDecorationCount();
        if (i3 >= 0 && i3 < itemDecorationCount) {
            return this.mItemDecorations.get(i3);
        }
        throw new IndexOutOfBoundsException(i3 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public M getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public P getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public U getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.f();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C0449b(new B(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(Xa.h.j(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new C0461n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(2131099795), resources.getDimensionPixelSize(2131099797), resources.getDimensionPixelOffset(2131099796));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        M m4 = this.mLayout;
        if (m4 != null) {
            m4.c("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        I i3 = this.mItemAnimator;
        return i3 != null && i3.f();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f4794d;
    }

    public void jumpToPositionForSmoothScroller(int i3) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.h0(i3);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int h2 = this.mChildHelper.h();
        for (int i3 = 0; i3 < h2; i3++) {
            ((N) this.mChildHelper.g(i3).getLayoutParams()).f10054c = true;
        }
        ArrayList arrayList = this.mRecycler.f10086c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            N n10 = (N) ((e0) arrayList.get(i10)).f10140a.getLayoutParams();
            if (n10 != null) {
                n10.f10054c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h2 = this.mChildHelper.h();
        for (int i3 = 0; i3 < h2; i3++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.o()) {
                childViewHolderInt.a(6);
            }
        }
        markItemDecorInsetsDirty();
        V v2 = this.mRecycler;
        ArrayList arrayList = v2.f10086c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e0 e0Var = (e0) arrayList.get(i10);
            if (e0Var != null) {
                e0Var.a(6);
                e0Var.a(1024);
            }
        }
        C c10 = v2.f10091h.mAdapter;
        if (c10 == null || !c10.f10000b) {
            v2.e();
        }
    }

    public void offsetChildrenHorizontal(int i3) {
        int e10 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e10; i10++) {
            this.mChildHelper.d(i10).offsetLeftAndRight(i3);
        }
    }

    public void offsetChildrenVertical(int i3) {
        int e10 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e10; i10++) {
            this.mChildHelper.d(i10).offsetTopAndBottom(i3);
        }
    }

    public void offsetPositionRecordsForInsert(int i3, int i10) {
        int h2 = this.mChildHelper.h();
        for (int i11 = 0; i11 < h2; i11++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.o() && childViewHolderInt.f10142c >= i3) {
                childViewHolderInt.l(i10, false);
                this.mState.f10113f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f10086c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            e0 e0Var = (e0) arrayList.get(i12);
            if (e0Var != null && e0Var.f10142c >= i3) {
                e0Var.l(i10, true);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int h2 = this.mChildHelper.h();
        int i18 = -1;
        if (i3 < i10) {
            i12 = i3;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i3;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < h2; i19++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i19));
            if (childViewHolderInt != null && (i17 = childViewHolderInt.f10142c) >= i12 && i17 <= i11) {
                if (i17 == i3) {
                    childViewHolderInt.l(i10 - i3, false);
                } else {
                    childViewHolderInt.l(i13, false);
                }
                this.mState.f10113f = true;
            }
        }
        V v2 = this.mRecycler;
        v2.getClass();
        if (i3 < i10) {
            i15 = i3;
            i14 = i10;
        } else {
            i14 = i3;
            i18 = 1;
            i15 = i10;
        }
        ArrayList arrayList = v2.f10086c;
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            e0 e0Var = (e0) arrayList.get(i20);
            if (e0Var != null && (i16 = e0Var.f10142c) >= i15 && i16 <= i14) {
                if (i16 == i3) {
                    e0Var.l(i10 - i3, false);
                } else {
                    e0Var.l(i18, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i3, int i10, boolean z2) {
        int i11 = i3 + i10;
        int h2 = this.mChildHelper.h();
        for (int i12 = 0; i12 < h2; i12++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.o()) {
                int i13 = childViewHolderInt.f10142c;
                if (i13 >= i11) {
                    childViewHolderInt.l(-i10, z2);
                    this.mState.f10113f = true;
                } else if (i13 >= i3) {
                    childViewHolderInt.a(8);
                    childViewHolderInt.l(-i10, z2);
                    childViewHolderInt.f10142c = i3 - 1;
                    this.mState.f10113f = true;
                }
            }
        }
        V v2 = this.mRecycler;
        ArrayList arrayList = v2.f10086c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e0 e0Var = (e0) arrayList.get(size);
            if (e0Var != null) {
                int i14 = e0Var.f10142c;
                if (i14 >= i11) {
                    e0Var.l(-i10, z2);
                } else if (i14 >= i3) {
                    e0Var.a(8);
                    v2.f(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.mFirstLayoutComplete = r2
            androidx.recyclerview.widget.M r2 = r5.mLayout
            if (r2 == 0) goto L1e
            r2.f10044g = r1
        L1e:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L73
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.RunnableC0464q.f10277e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.q r1 = (androidx.recyclerview.widget.RunnableC0464q) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L6c
            androidx.recyclerview.widget.q r1 = new androidx.recyclerview.widget.q
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f10279a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f10282d = r2
            r5.mGapWorker = r1
            java.util.WeakHashMap r1 = N.I.f4732a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5e
            if (r1 == 0) goto L5e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5e
            goto L60
        L5e:
            r1 = 1114636288(0x42700000, float:60.0)
        L60:
            androidx.recyclerview.widget.q r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f10281c = r3
            r0.set(r2)
        L6c:
            androidx.recyclerview.widget.q r0 = r5.mGapWorker
            java.util.ArrayList r0 = r0.f10279a
            r0.add(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC0464q runnableC0464q;
        super.onDetachedFromWindow();
        I i3 = this.mItemAnimator;
        if (i3 != null) {
            i3.e();
        }
        stopScroll();
        this.mIsAttached = false;
        M m4 = this.mLayout;
        if (m4 != null) {
            m4.f10044g = false;
            m4.L(this);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (p0.f10273d.a() != null) {
        }
        if (!ALLOW_THREAD_GAP_WORK || (runnableC0464q = this.mGapWorker) == null) {
            return;
        }
        runnableC0464q.f10279a.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.mItemDecorations.get(i3).a(this);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.M r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L40
            androidx.recyclerview.widget.M r0 = r5.mLayout
            boolean r0 = r0.e()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            androidx.recyclerview.widget.M r3 = r5.mLayout
            boolean r3 = r3.d()
            if (r3 == 0) goto L3e
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L66
        L3e:
            r3 = r2
            goto L66
        L40:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L64
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.M r3 = r5.mLayout
            boolean r3 = r3.e()
            if (r3 == 0) goto L59
            float r0 = -r0
            goto L3e
        L59:
            androidx.recyclerview.widget.M r3 = r5.mLayout
            boolean r3 = r3.d()
            if (r3 == 0) goto L64
            r3 = r0
            r0 = r2
            goto L66
        L64:
            r0 = r2
            r3 = r0
        L66:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6e:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.scrollByInternal(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.mLayoutSuppressed) {
            this.mInterceptingOnItemTouchListener = null;
            if (findInterceptingOnItemTouchListener(motionEvent)) {
                cancelScroll();
                return true;
            }
            M m4 = this.mLayout;
            if (m4 != null) {
                boolean d8 = m4.d();
                boolean e10 = this.mLayout.e();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x7 = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x7;
                    this.mInitialTouchX = x7;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y10;
                    this.mInitialTouchY = y10;
                    if (this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        stopNestedScroll(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i3 = d8;
                    if (e10) {
                        i3 = (d8 ? 1 : 0) | 2;
                    }
                    startNestedScroll(i3, 0);
                } else if (actionMasked == 1) {
                    this.mVelocityTracker.clear();
                    stopNestedScroll(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i10 = x10 - this.mInitialTouchX;
                        int i11 = y11 - this.mInitialTouchY;
                        if (d8 == 0 || Math.abs(i10) <= this.mTouchSlop) {
                            z2 = false;
                        } else {
                            this.mLastTouchX = x10;
                            z2 = true;
                        }
                        if (e10 && Math.abs(i11) > this.mTouchSlop) {
                            this.mLastTouchY = y11;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    cancelScroll();
                } else if (actionMasked == 5) {
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x11;
                    this.mInitialTouchX = x11;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y12;
                    this.mInitialTouchY = y12;
                } else if (actionMasked == 6) {
                    onPointerUp(motionEvent);
                }
                if (this.mScrollState == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        int i13 = J.g.f3258a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        M m4 = this.mLayout;
        if (m4 == null) {
            defaultOnMeasure(i3, i10);
            return;
        }
        if (m4.G()) {
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.mLayout.f10039b.defaultOnMeasure(i3, i10);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.mAdapter == null) {
                return;
            }
            if (this.mState.f10111d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.k0(i3, i10);
            this.mState.f10116i = true;
            dispatchLayoutStep2();
            this.mLayout.m0(i3, i10);
            if (this.mLayout.p0()) {
                this.mLayout.k0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f10116i = true;
                dispatchLayoutStep2();
                this.mLayout.m0(i3, i10);
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.f10039b.defaultOnMeasure(i3, i10);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            b0 b0Var = this.mState;
            if (b0Var.f10117k) {
                b0Var.f10114g = true;
            } else {
                this.mAdapterHelper.b();
                this.mState.f10114g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f10117k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        C c10 = this.mAdapter;
        if (c10 != null) {
            this.mState.f10112e = c10.a();
        } else {
            this.mState.f10112e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.f10039b.defaultOnMeasure(i3, i10);
        stopInterceptRequestLayout(false);
        this.mState.f10114g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof Y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Y y10 = (Y) parcelable;
        this.mPendingSavedState = y10;
        super.onRestoreInstanceState(y10.f5920a);
        M m4 = this.mLayout;
        if (m4 == null || (parcelable2 = this.mPendingSavedState.f10092c) == null) {
            return;
        }
        m4.X(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Y y10 = new Y(super.onSaveInstanceState());
        Y y11 = this.mPendingSavedState;
        if (y11 != null) {
            y10.f10092c = y11.f10092c;
            return y10;
        }
        M m4 = this.mLayout;
        if (m4 != null) {
            y10.f10092c = m4.Y();
            return y10;
        }
        y10.f10092c = null;
        return y10;
    }

    public void onScrollStateChanged(int i3) {
    }

    public void onScrolled(int i3, int i10) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (i3 == i11 && i10 == i12) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = N.I.f4732a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(e0 e0Var, H h2) {
        e0Var.j &= -8193;
        if (this.mState.f10115h && e0Var.k() && !e0Var.h() && !e0Var.o()) {
            this.mViewInfoStore.f10286b.d(getChangedHolderKey(e0Var), e0Var);
        }
        C1697j c1697j = this.mViewInfoStore.f10285a;
        p0 p0Var = (p0) c1697j.get(e0Var);
        if (p0Var == null) {
            p0Var = p0.a();
            c1697j.put(e0Var, p0Var);
        }
        p0Var.f10275b = h2;
        p0Var.f10274a |= 4;
    }

    public void removeAndRecycleViews() {
        I i3 = this.mItemAnimator;
        if (i3 != null) {
            i3.e();
        }
        M m4 = this.mLayout;
        if (m4 != null) {
            m4.a0(this.mRecycler);
            this.mLayout.b0(this.mRecycler);
        }
        V v2 = this.mRecycler;
        v2.f10084a.clear();
        v2.e();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C0450c c0450c = this.mChildHelper;
        B b2 = c0450c.f10121a;
        int indexOfChild = b2.f9998a.indexOfChild(view);
        boolean z2 = true;
        if (indexOfChild == -1) {
            c0450c.j(view);
        } else {
            Cc.a aVar = c0450c.f10122b;
            if (aVar.I(indexOfChild)) {
                aVar.L(indexOfChild);
                c0450c.j(view);
                b2.b(indexOfChild);
            } else {
                z2 = false;
            }
        }
        if (z2) {
            e0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.k(childViewHolderInt);
            this.mRecycler.h(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z2);
        return z2;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.j()) {
                childViewHolderInt.j &= -257;
            } else if (!childViewHolderInt.o()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(Xa.h.j(this, sb2));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(J j) {
        M m4 = this.mLayout;
        if (m4 != null) {
            m4.c("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(j);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i3) {
        int itemDecorationCount = getItemDecorationCount();
        if (i3 >= 0 && i3 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i3));
            return;
        }
        throw new IndexOutOfBoundsException(i3 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(O o5) {
        List<O> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(o5);
    }

    public void removeOnItemTouchListener(Q q10) {
        this.mOnItemTouchListeners.remove(q10);
        if (this.mInterceptingOnItemTouchListener == q10) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(S s10) {
        List<S> list = this.mScrollListeners;
        if (list != null) {
            list.remove(s10);
        }
    }

    public void repositionShadowingViews() {
        e0 e0Var;
        int e10 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e10; i3++) {
            View d8 = this.mChildHelper.d(i3);
            e0 childViewHolder = getChildViewHolder(d8);
            if (childViewHolder != null && (e0Var = childViewHolder.f10148i) != null) {
                View view = e0Var.f10140a;
                int left = d8.getLeft();
                int top = d8.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        C0470x c0470x = this.mLayout.f10042e;
        if ((c0470x == null || !c0470x.f10324e) && !isComputingLayout() && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.e0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.mOnItemTouchListeners.get(i3).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int h2 = this.mChildHelper.h();
        for (int i3 = 0; i3 < h2; i3++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (!childViewHolderInt.o() && childViewHolderInt.f10143d == -1) {
                childViewHolderInt.f10143d = childViewHolderInt.f10142c;
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i3, int i10) {
        M m4 = this.mLayout;
        if (m4 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean d8 = m4.d();
        boolean e10 = this.mLayout.e();
        if (d8 || e10) {
            if (!d8) {
                i3 = 0;
            }
            if (!e10) {
                i10 = 0;
            }
            scrollByInternal(i3, i10, null);
        }
    }

    public boolean scrollByInternal(int i3, int i10, MotionEvent motionEvent) {
        int i11;
        int i12;
        int i13;
        int i14;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i3, i10, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i15 = iArr2[0];
            int i16 = iArr2[1];
            i13 = i3 - i15;
            i14 = i10 - i16;
            i12 = i16;
            i11 = i15;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i11, i12, i13, i14, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i17 = iArr4[0];
        int i18 = i13 - i17;
        int i19 = iArr4[1];
        int i20 = i14 - i19;
        boolean z2 = (i17 == 0 && i19 == 0) ? false : true;
        int i21 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i22 = iArr5[0];
        this.mLastTouchX = i21 - i22;
        int i23 = this.mLastTouchY;
        int i24 = iArr5[1];
        this.mLastTouchY = i23 - i24;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i22;
        iArr6[1] = iArr6[1] + i24;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                pullGlows(motionEvent.getX(), i18, motionEvent.getY(), i20);
            }
            considerReleasingGlowsOnScroll(i3, i10);
        }
        if (i11 != 0 || i12 != 0) {
            dispatchOnScrolled(i11, i12);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i11 == 0 && i12 == 0) ? false : true;
    }

    public void scrollStep(int i3, int i10, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i11 = J.g.f3258a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int g02 = i3 != 0 ? this.mLayout.g0(i3, this.mRecycler, this.mState) : 0;
        int i02 = i10 != 0 ? this.mLayout.i0(i10, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = g02;
            iArr[1] = i02;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i3, int i10) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i3) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        M m4 = this.mLayout;
        if (m4 == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            m4.h0(i3);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(g0 g0Var) {
        this.mAccessibilityDelegate = g0Var;
        N.I.i(this, g0Var);
    }

    public void setAdapter(C c10) {
        setLayoutFrozen(false);
        setAdapterInternal(c10, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(E e10) {
        if (e10 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(e0 e0Var, int i3) {
        if (isComputingLayout()) {
            e0Var.f10155q = i3;
            this.mPendingAccessibilityImportanceChange.add(e0Var);
            return false;
        }
        View view = e0Var.f10140a;
        WeakHashMap weakHashMap = N.I.f4732a;
        view.setImportantForAccessibility(i3);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(F f10) {
        f10.getClass();
        this.mEdgeEffectFactory = f10;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(I i3) {
        I i10 = this.mItemAnimator;
        if (i10 != null) {
            i10.e();
            this.mItemAnimator.f10011a = null;
        }
        this.mItemAnimator = i3;
        if (i3 != null) {
            i3.f10011a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i3) {
        V v2 = this.mRecycler;
        v2.f10088e = i3;
        v2.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(M m4) {
        RecyclerView recyclerView;
        if (m4 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            I i3 = this.mItemAnimator;
            if (i3 != null) {
                i3.e();
            }
            this.mLayout.a0(this.mRecycler);
            this.mLayout.b0(this.mRecycler);
            V v2 = this.mRecycler;
            v2.f10084a.clear();
            v2.e();
            if (this.mIsAttached) {
                M m10 = this.mLayout;
                m10.f10044g = false;
                m10.L(this);
            }
            this.mLayout.n0(null);
            this.mLayout = null;
        } else {
            V v8 = this.mRecycler;
            v8.f10084a.clear();
            v8.e();
        }
        C0450c c0450c = this.mChildHelper;
        c0450c.f10122b.M();
        ArrayList arrayList = c0450c.f10123c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c0450c.f10121a.f9998a;
            if (size < 0) {
                break;
            }
            e0 childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                recyclerView.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.f10154p);
                childViewHolderInt.f10154p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = m4;
        if (m4 != null) {
            if (m4.f10039b != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(m4);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(Xa.h.j(m4.f10039b, sb2));
            }
            m4.n0(this);
            if (this.mIsAttached) {
                this.mLayout.f10044g = true;
            }
        }
        this.mRecycler.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0164j scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f4794d) {
            WeakHashMap weakHashMap = N.I.f4732a;
            N.B.m(scrollingChildHelper.f4793c);
        }
        scrollingChildHelper.f4794d = z2;
    }

    public void setOnFlingListener(P p8) {
        this.mOnFlingListener = p8;
    }

    @Deprecated
    public void setOnScrollListener(S s10) {
        this.mScrollListener = s10;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(U u2) {
        V v2 = this.mRecycler;
        if (v2.f10090g != null) {
            r1.f10083b--;
        }
        v2.f10090g = u2;
        if (u2 == null || v2.f10091h.getAdapter() == null) {
            return;
        }
        v2.f10090g.f10083b++;
    }

    public void setRecyclerListener(W w10) {
    }

    public void setScrollState(int i3) {
        if (i3 == this.mScrollState) {
            return;
        }
        this.mScrollState = i3;
        if (i3 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i3);
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(c0 c0Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i3, int i10) {
        smoothScrollBy(i3, i10, null);
    }

    public void smoothScrollToPosition(int i3) {
        if (this.mLayoutSuppressed) {
            return;
        }
        M m4 = this.mLayout;
        if (m4 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            m4.r0(this, i3);
        }
    }

    public void startInterceptRequestLayout() {
        int i3 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i3;
        if (i3 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().g(i3, 0);
    }

    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(C c10, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(c10, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i3, int i10, Object obj) {
        int i11;
        int i12;
        int h2 = this.mChildHelper.h();
        int i13 = i10 + i3;
        for (int i14 = 0; i14 < h2; i14++) {
            View g10 = this.mChildHelper.g(i14);
            e0 childViewHolderInt = getChildViewHolderInt(g10);
            if (childViewHolderInt != null && !childViewHolderInt.o() && (i12 = childViewHolderInt.f10142c) >= i3 && i12 < i13) {
                childViewHolderInt.a(2);
                if (obj == null) {
                    childViewHolderInt.a(1024);
                } else if ((1024 & childViewHolderInt.j) == 0) {
                    if (childViewHolderInt.f10149k == null) {
                        ArrayList arrayList = new ArrayList();
                        childViewHolderInt.f10149k = arrayList;
                        childViewHolderInt.f10150l = Collections.unmodifiableList(arrayList);
                    }
                    childViewHolderInt.f10149k.add(obj);
                }
                ((N) g10.getLayoutParams()).f10054c = true;
            }
        }
        V v2 = this.mRecycler;
        ArrayList arrayList2 = v2.f10086c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            e0 e0Var = (e0) arrayList2.get(size);
            if (e0Var != null && (i11 = e0Var.f10142c) >= i3 && i11 < i13) {
                e0Var.a(2);
                v2.f(size);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130903783);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.e0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.c r0 = r5.mChildHelper
            int r0 = r0.h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3c
            androidx.recyclerview.widget.c r3 = r5.mChildHelper
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.e0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L39
            boolean r4 = r3.h()
            if (r4 != 0) goto L39
            if (r7 == 0) goto L23
            int r4 = r3.f10142c
            if (r4 == r6) goto L2a
            goto L39
        L23:
            int r4 = r3.b()
            if (r4 == r6) goto L2a
            goto L39
        L2a:
            androidx.recyclerview.widget.c r1 = r5.mChildHelper
            java.util.ArrayList r1 = r1.f10123c
            android.view.View r4 = r3.f10140a
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L38
            r1 = r3
            goto L39
        L38:
            return r3
        L39:
            int r2 = r2 + 1
            goto L8
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.e0");
    }

    public void onExitLayoutOrScroll(boolean z2) {
        int i3 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i3;
        if (i3 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i3, int i10, Interpolator interpolator) {
        smoothScrollBy(i3, i10, interpolator, Integer.MIN_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        int i10 = 1;
        this.mObserver = new X();
        this.mRecycler = new V(this);
        this.mViewInfoStore = new r0();
        this.mUpdateChildViewsRunnable = new A(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new F();
        C0457j c0457j = new C0457j();
        c0457j.f10011a = null;
        c0457j.f10012b = new ArrayList();
        c0457j.f10013c = 120L;
        c0457j.f10014d = 120L;
        c0457j.f10015e = 250L;
        c0457j.f10016f = 250L;
        c0457j.f10187g = true;
        c0457j.f10188h = new ArrayList();
        c0457j.f10189i = new ArrayList();
        c0457j.j = new ArrayList();
        c0457j.f10190k = new ArrayList();
        c0457j.f10191l = new ArrayList();
        c0457j.f10192m = new ArrayList();
        c0457j.f10193n = new ArrayList();
        c0457j.f10194o = new ArrayList();
        c0457j.f10195p = new ArrayList();
        c0457j.f10196q = new ArrayList();
        c0457j.f10197r = new ArrayList();
        this.mItemAnimator = c0457j;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new d0(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C0462o() : null;
        b0 b0Var = new b0();
        b0Var.f10108a = -1;
        b0Var.f10109b = 0;
        b0Var.f10110c = 0;
        b0Var.f10111d = 1;
        b0Var.f10112e = 0;
        b0Var.f10113f = false;
        b0Var.f10114g = false;
        b0Var.f10115h = false;
        b0Var.f10116i = false;
        b0Var.j = false;
        b0Var.f10117k = false;
        this.mState = b0Var;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new B(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new A(this, i10);
        this.mViewInfoProcessCallback = new B(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        this.mScaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f10011a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap weakHashMap = N.I.f4732a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new g0(this));
        int[] iArr = I1.a.f3102a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i3, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(7), (StateListDrawable) obtainStyledAttributes.getDrawable(4), obtainStyledAttributes.getDrawable(5));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i3, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i3, 0);
        }
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
    }

    public boolean dispatchNestedPreScroll(int i3, int i10, int[] iArr, int[] iArr2, int i11) {
        return getScrollingChildHelper().c(i3, i10, iArr, iArr2, i11);
    }

    public boolean dispatchNestedScroll(int i3, int i10, int i11, int i12, int[] iArr, int i13) {
        return getScrollingChildHelper().d(i3, i10, i11, i12, iArr, i13, null);
    }

    public boolean hasNestedScrollingParent(int i3) {
        return getScrollingChildHelper().f(i3);
    }

    public void smoothScrollBy(int i3, int i10, Interpolator interpolator, int i11) {
        smoothScrollBy(i3, i10, interpolator, i11, false);
    }

    public boolean startNestedScroll(int i3, int i10) {
        return getScrollingChildHelper().g(i3, i10);
    }

    public void stopNestedScroll(int i3) {
        getScrollingChildHelper().h(i3);
    }

    public void smoothScrollBy(int i3, int i10, Interpolator interpolator, int i11, boolean z2) {
        M m4 = this.mLayout;
        if (m4 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!m4.d()) {
            i3 = 0;
        }
        if (!this.mLayout.e()) {
            i10 = 0;
        }
        if (i3 == 0 && i10 == 0) {
            return;
        }
        if (i11 != Integer.MIN_VALUE && i11 <= 0) {
            scrollBy(i3, i10);
            return;
        }
        if (z2) {
            int i12 = i3 != 0 ? 1 : 0;
            if (i10 != 0) {
                i12 |= 2;
            }
            startNestedScroll(i12, 1);
        }
        this.mViewFlinger.b(i3, i10, interpolator, i11);
    }

    public final void dispatchNestedScroll(int i3, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i3, i10, i11, i12, iArr, i13, iArr2);
    }

    public void addItemDecoration(J j) {
        addItemDecoration(j, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        M m4 = this.mLayout;
        if (m4 != null) {
            return m4.t(layoutParams);
        }
        throw new IllegalStateException(Xa.h.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
