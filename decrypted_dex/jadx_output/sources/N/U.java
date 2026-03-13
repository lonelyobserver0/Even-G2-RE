package N;

import android.view.WindowInsets;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class U extends T {

    /* renamed from: n, reason: collision with root package name */
    public F.c f4758n;

    public U(c0 c0Var, WindowInsets windowInsets) {
        super(c0Var, windowInsets);
        this.f4758n = null;
    }

    @Override // N.Z
    public c0 b() {
        return c0.g(this.f4752c.consumeStableInsets(), null);
    }

    @Override // N.Z
    public c0 c() {
        return c0.g(this.f4752c.consumeSystemWindowInsets(), null);
    }

    @Override // N.Z
    public final F.c h() {
        if (this.f4758n == null) {
            WindowInsets windowInsets = this.f4752c;
            this.f4758n = F.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f4758n;
    }

    @Override // N.Z
    public boolean m() {
        return this.f4752c.isConsumed();
    }

    @Override // N.Z
    public void q(F.c cVar) {
        this.f4758n = cVar;
    }
}
