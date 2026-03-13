package l;

import N.L;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f15707c;

    /* renamed from: d, reason: collision with root package name */
    public Tc.d f15708d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15709e;

    /* renamed from: b, reason: collision with root package name */
    public long f15706b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f15710f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15705a = new ArrayList();

    public final void a() {
        if (this.f15709e) {
            Iterator it = this.f15705a.iterator();
            while (it.hasNext()) {
                ((L) it.next()).b();
            }
            this.f15709e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f15709e) {
            return;
        }
        Iterator it = this.f15705a.iterator();
        while (it.hasNext()) {
            L l9 = (L) it.next();
            long j = this.f15706b;
            if (j >= 0) {
                l9.c(j);
            }
            BaseInterpolator baseInterpolator = this.f15707c;
            if (baseInterpolator != null && (view = (View) l9.f4740a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f15708d != null) {
                l9.d(this.f15710f);
            }
            View view2 = (View) l9.f4740a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f15709e = true;
    }
}
