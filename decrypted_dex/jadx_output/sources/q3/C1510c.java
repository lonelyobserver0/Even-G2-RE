package q3;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;

/* renamed from: q3.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1510c {

    /* renamed from: a, reason: collision with root package name */
    public C1514g f19935a;

    /* renamed from: b, reason: collision with root package name */
    public ValueAnimator f19936b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f19937c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19938d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19939e;

    public final void a() {
        this.f19935a.getScrollHandle();
    }

    public final void b(float f10, float f11) {
        e();
        this.f19936b = ValueAnimator.ofFloat(f10, f11);
        C1508a c1508a = new C1508a(this, 0);
        this.f19936b.setInterpolator(new DecelerateInterpolator());
        this.f19936b.addUpdateListener(c1508a);
        this.f19936b.addListener(c1508a);
        this.f19936b.setDuration(400L);
        this.f19936b.start();
    }

    public final void c(float f10, float f11) {
        e();
        this.f19936b = ValueAnimator.ofFloat(f10, f11);
        C1508a c1508a = new C1508a(this, 1);
        this.f19936b.setInterpolator(new DecelerateInterpolator());
        this.f19936b.addUpdateListener(c1508a);
        this.f19936b.addListener(c1508a);
        this.f19936b.setDuration(400L);
        this.f19936b.start();
    }

    public final void d(float f10, float f11, float f12, float f13) {
        e();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f13);
        this.f19936b = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        C1509b c1509b = new C1509b(this, f10, f11);
        this.f19936b.addUpdateListener(c1509b);
        this.f19936b.addListener(c1509b);
        this.f19936b.setDuration(400L);
        this.f19936b.start();
    }

    public final void e() {
        ValueAnimator valueAnimator = this.f19936b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f19936b = null;
        }
        this.f19938d = false;
        this.f19937c.forceFinished(true);
    }
}
