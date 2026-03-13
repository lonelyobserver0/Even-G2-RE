package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public G f10011a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10012b;

    /* renamed from: c, reason: collision with root package name */
    public long f10013c;

    /* renamed from: d, reason: collision with root package name */
    public long f10014d;

    /* renamed from: e, reason: collision with root package name */
    public long f10015e;

    /* renamed from: f, reason: collision with root package name */
    public long f10016f;

    public static void b(e0 e0Var) {
        RecyclerView recyclerView;
        int i3 = e0Var.j;
        if (e0Var.f() || (i3 & 4) != 0 || (recyclerView = e0Var.f10156r) == null) {
            return;
        }
        recyclerView.getAdapterPositionFor(e0Var);
    }

    public abstract boolean a(e0 e0Var, e0 e0Var2, H h2, H h4);

    public final void c(e0 e0Var) {
        G g10 = this.f10011a;
        if (g10 != null) {
            B b2 = (B) g10;
            b2.getClass();
            e0Var.n(true);
            if (e0Var.f10147h != null && e0Var.f10148i == null) {
                e0Var.f10147h = null;
            }
            e0Var.f10148i = null;
            if ((e0Var.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = b2.f9998a;
            View view = e0Var.f10140a;
            if (recyclerView.removeAnimatingView(view) || !e0Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(e0 e0Var);

    public abstract void e();

    public abstract boolean f();
}
