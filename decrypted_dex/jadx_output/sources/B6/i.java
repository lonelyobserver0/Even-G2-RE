package B6;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class i extends f {

    /* renamed from: p, reason: collision with root package name */
    public final Set f708p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f709q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f710r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f711s;

    /* renamed from: t, reason: collision with root package name */
    public float f712t;

    /* renamed from: u, reason: collision with root package name */
    public float f713u;

    public i(Context context, a aVar) {
        super(context, aVar);
        this.f708p = j();
    }

    @Override // B6.f, B6.b
    public boolean a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5 || actionMasked == 6 || actionMasked == 3) {
            g();
        }
        if (this.f710r) {
            this.f710r = false;
            g();
            i();
        }
        VelocityTracker velocityTracker = this.f711s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(this.f678d);
        }
        boolean a3 = super.a(motionEvent);
        if (actionMasked == 1 || actionMasked == 6) {
            if (this.f699l.size() < d() && this.f709q) {
                i();
                return true;
            }
        } else if (actionMasked == 3 && this.f709q) {
            i();
            return true;
        }
        return a3;
    }

    public final void h() {
        this.f709q = true;
        if (this.f711s == null) {
            this.f711s = VelocityTracker.obtain();
        }
    }

    public void i() {
        this.f709q = false;
        VelocityTracker velocityTracker = this.f711s;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
            this.f712t = this.f711s.getXVelocity();
            this.f713u = this.f711s.getYVelocity();
            this.f711s.recycle();
            this.f711s = null;
        }
        g();
    }

    public abstract HashSet j();
}
