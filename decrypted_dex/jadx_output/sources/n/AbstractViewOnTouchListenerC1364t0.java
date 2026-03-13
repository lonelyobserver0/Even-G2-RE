package n;

import android.view.View;
import android.view.ViewConfiguration;
import m.InterfaceC1255B;

/* renamed from: n.t0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractViewOnTouchListenerC1364t0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f17610a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17611b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17612c;

    /* renamed from: d, reason: collision with root package name */
    public final View f17613d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC1362s0 f17614e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC1362s0 f17615f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17616g;

    /* renamed from: h, reason: collision with root package name */
    public int f17617h;
    public final int[] j = new int[2];

    public AbstractViewOnTouchListenerC1364t0(View view) {
        this.f17613d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f17610a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f17611b = tapTimeout;
        this.f17612c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC1362s0 runnableC1362s0 = this.f17615f;
        View view = this.f17613d;
        if (runnableC1362s0 != null) {
            view.removeCallbacks(runnableC1362s0);
        }
        RunnableC1362s0 runnableC1362s02 = this.f17614e;
        if (runnableC1362s02 != null) {
            view.removeCallbacks(runnableC1362s02);
        }
    }

    public abstract InterfaceC1255B b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC1255B b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.AbstractViewOnTouchListenerC1364t0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f17616g = false;
        this.f17617h = -1;
        RunnableC1362s0 runnableC1362s0 = this.f17614e;
        if (runnableC1362s0 != null) {
            this.f17613d.removeCallbacks(runnableC1362s0);
        }
    }
}
