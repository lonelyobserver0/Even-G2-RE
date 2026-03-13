package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f10127a;

    /* renamed from: b, reason: collision with root package name */
    public int f10128b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f10129c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f10130d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10131e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10132f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10133g;

    public d0(RecyclerView recyclerView) {
        this.f10133g = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f10130d = interpolator;
        this.f10131e = false;
        this.f10132f = false;
        this.f10129c = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void a() {
        if (this.f10131e) {
            this.f10132f = true;
            return;
        }
        RecyclerView recyclerView = this.f10133g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = N.I.f4732a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i3, int i10, Interpolator interpolator, int i11) {
        int i12;
        RecyclerView recyclerView = this.f10133g;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i3);
            int abs2 = Math.abs(i10);
            boolean z2 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i10 * i10) + (i3 * i3));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i13 = width / 2;
            float f10 = width;
            float f11 = i13;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
            if (sqrt > 0) {
                i12 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    abs = abs2;
                }
                i12 = (int) (((abs / f10) + 1.0f) * 300.0f);
            }
            i11 = Math.min(i12, 2000);
        }
        int i14 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f10130d != interpolator) {
            this.f10130d = interpolator;
            this.f10129c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f10128b = 0;
        this.f10127a = 0;
        recyclerView.setScrollState(2);
        this.f10129c.startScroll(0, 0, i3, i10, i14);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10;
        int i11;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f10133g;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f10129c.abortAnimation();
            return;
        }
        this.f10132f = false;
        this.f10131e = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f10129c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i12 = currX - this.f10127a;
            int i13 = currY - this.f10128b;
            this.f10127a = currX;
            this.f10128b = currY;
            int i14 = i12;
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(i14, i13, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                i14 -= iArr2[0];
                i3 = i13 - iArr2[1];
            } else {
                i3 = i13;
            }
            int i15 = i14;
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(i15, i3);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(i15, i3, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i16 = iArr4[0];
                int i17 = iArr4[1];
                i15 -= i16;
                i3 -= i17;
                C0470x c0470x = recyclerView.mLayout.f10042e;
                if (c0470x != null && !c0470x.f10323d && c0470x.f10324e) {
                    int b2 = recyclerView.mState.b();
                    if (b2 == 0) {
                        c0470x.g();
                    } else if (c0470x.f10320a >= b2) {
                        c0470x.f10320a = b2 - 1;
                        c0470x.e(i16, i17);
                    } else {
                        c0470x.e(i16, i17);
                    }
                }
                i11 = i17;
                i10 = i16;
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i10, i11, i15, i3, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i18 = i15 - iArr6[0];
            int i19 = i3 - iArr6[1];
            if (i10 != 0 || i11 != 0) {
                recyclerView.dispatchOnScrolled(i10, i11);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
            C0470x c0470x2 = recyclerView.mLayout.f10042e;
            if ((c0470x2 == null || !c0470x2.f10323d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                    if (i19 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i19 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i20, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    C0462o c0462o = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = c0462o.f10260c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    c0462o.f10261d = 0;
                }
            } else {
                a();
                RunnableC0464q runnableC0464q = recyclerView.mGapWorker;
                if (runnableC0464q != null) {
                    runnableC0464q.a(recyclerView, i10, i11);
                }
            }
        }
        C0470x c0470x3 = recyclerView.mLayout.f10042e;
        if (c0470x3 != null && c0470x3.f10323d) {
            c0470x3.e(0, 0);
        }
        this.f10131e = false;
        if (!this.f10132f) {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = N.I.f4732a;
            recyclerView.postOnAnimation(this);
        }
    }
}
