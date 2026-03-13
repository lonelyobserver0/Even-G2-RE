package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0461n extends J implements Q {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f10223C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f10224D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f10225A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC0458k f10226B;

    /* renamed from: a, reason: collision with root package name */
    public final int f10227a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10228b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f10229c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f10230d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10231e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10232f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f10233g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f10234h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10235i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public int f10236k;

    /* renamed from: l, reason: collision with root package name */
    public int f10237l;

    /* renamed from: m, reason: collision with root package name */
    public float f10238m;

    /* renamed from: n, reason: collision with root package name */
    public int f10239n;

    /* renamed from: o, reason: collision with root package name */
    public int f10240o;

    /* renamed from: p, reason: collision with root package name */
    public float f10241p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f10244s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f10251z;

    /* renamed from: q, reason: collision with root package name */
    public int f10242q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f10243r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10245t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10246u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f10247v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f10248w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f10249x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f10250y = new int[2];

    public C0461n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i10, int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10251z = ofFloat;
        this.f10225A = 0;
        RunnableC0458k runnableC0458k = new RunnableC0458k(this, 0);
        this.f10226B = runnableC0458k;
        C0459l c0459l = new C0459l(this);
        this.f10229c = stateListDrawable;
        this.f10230d = drawable;
        this.f10233g = stateListDrawable2;
        this.f10234h = drawable2;
        this.f10231e = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f10232f = Math.max(i3, drawable.getIntrinsicWidth());
        this.f10235i = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f10227a = i10;
        this.f10228b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new T1.i(this));
        ofFloat.addUpdateListener(new C0460m(this));
        RecyclerView recyclerView2 = this.f10244s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f10244s.removeOnItemTouchListener(this);
            this.f10244s.removeOnScrollListener(c0459l);
            this.f10244s.removeCallbacks(runnableC0458k);
        }
        this.f10244s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f10244s.addOnItemTouchListener(this);
        this.f10244s.addOnScrollListener(c0459l);
    }

    public static int e(float f10, float f11, int[] iArr, int i3, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 != 0) {
            int i13 = i3 - i11;
            int i14 = (int) (((f11 - f10) / i12) * i13);
            int i15 = i10 + i14;
            if (i15 < i13 && i15 >= 0) {
                return i14;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.J
    public final void b(Canvas canvas) {
        int i3 = this.f10242q;
        RecyclerView recyclerView = this.f10244s;
        if (i3 != recyclerView.getWidth() || this.f10243r != recyclerView.getHeight()) {
            this.f10242q = recyclerView.getWidth();
            this.f10243r = recyclerView.getHeight();
            f(0);
            return;
        }
        if (this.f10225A != 0) {
            if (this.f10245t) {
                int i10 = this.f10242q;
                int i11 = this.f10231e;
                int i12 = i10 - i11;
                int i13 = this.f10237l;
                int i14 = this.f10236k;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable = this.f10229c;
                stateListDrawable.setBounds(0, 0, i11, i14);
                int i16 = this.f10243r;
                int i17 = this.f10232f;
                Drawable drawable = this.f10230d;
                drawable.setBounds(0, 0, i17, i16);
                WeakHashMap weakHashMap = N.I.f4732a;
                if (recyclerView.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i11, i15);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i11, -i15);
                } else {
                    canvas.translate(i12, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i15);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i12, -i15);
                }
            }
            if (this.f10246u) {
                int i18 = this.f10243r;
                int i19 = this.f10235i;
                int i20 = i18 - i19;
                int i21 = this.f10240o;
                int i22 = this.f10239n;
                int i23 = i21 - (i22 / 2);
                StateListDrawable stateListDrawable2 = this.f10233g;
                stateListDrawable2.setBounds(0, 0, i22, i19);
                int i24 = this.f10242q;
                int i25 = this.j;
                Drawable drawable2 = this.f10234h;
                drawable2.setBounds(0, 0, i24, i25);
                canvas.translate(0.0f, i20);
                drawable2.draw(canvas);
                canvas.translate(i23, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i23, -i20);
            }
        }
    }

    public final boolean c(float f10, float f11) {
        if (f11 < this.f10243r - this.f10235i) {
            return false;
        }
        int i3 = this.f10240o;
        int i10 = this.f10239n;
        return f10 >= ((float) (i3 - (i10 / 2))) && f10 <= ((float) ((i10 / 2) + i3));
    }

    public final boolean d(float f10, float f11) {
        RecyclerView recyclerView = this.f10244s;
        WeakHashMap weakHashMap = N.I.f4732a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i3 = this.f10231e;
        if (!z2 ? f10 >= this.f10242q - i3 : f10 <= i3 / 2) {
            int i10 = this.f10237l;
            int i11 = this.f10236k / 2;
            if (f11 >= i10 - i11 && f11 <= i11 + i10) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i3) {
        RunnableC0458k runnableC0458k = this.f10226B;
        StateListDrawable stateListDrawable = this.f10229c;
        if (i3 == 2 && this.f10247v != 2) {
            stateListDrawable.setState(f10223C);
            this.f10244s.removeCallbacks(runnableC0458k);
        }
        if (i3 == 0) {
            this.f10244s.invalidate();
        } else {
            g();
        }
        if (this.f10247v == 2 && i3 != 2) {
            stateListDrawable.setState(f10224D);
            this.f10244s.removeCallbacks(runnableC0458k);
            this.f10244s.postDelayed(runnableC0458k, 1200);
        } else if (i3 == 1) {
            this.f10244s.removeCallbacks(runnableC0458k);
            this.f10244s.postDelayed(runnableC0458k, 1500);
        }
        this.f10247v = i3;
    }

    public final void g() {
        int i3 = this.f10225A;
        ValueAnimator valueAnimator = this.f10251z;
        if (i3 != 0) {
            if (i3 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f10225A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
