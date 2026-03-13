package N;

import android.view.WindowInsets;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class O extends S {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f4747a;

    public O() {
        this.f4747a = A.a.e();
    }

    @Override // N.S
    public c0 b() {
        WindowInsets build;
        a();
        build = this.f4747a.build();
        c0 g10 = c0.g(build, null);
        g10.f4771a.o(null);
        return g10;
    }

    @Override // N.S
    public void c(F.c cVar) {
        this.f4747a.setStableInsets(cVar.c());
    }

    @Override // N.S
    public void d(F.c cVar) {
        this.f4747a.setSystemWindowInsets(cVar.c());
    }

    public O(c0 c0Var) {
        super(c0Var);
        WindowInsets.Builder e10;
        WindowInsets f10 = c0Var.f();
        if (f10 != null) {
            e10 = A.a.f(f10);
        } else {
            e10 = A.a.e();
        }
        this.f4747a = e10;
    }
}
