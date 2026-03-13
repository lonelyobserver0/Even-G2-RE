package N;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Z {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f4764b;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f4765a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f4764b = (i3 >= 34 ? new Q() : i3 >= 30 ? new P() : i3 >= 29 ? new O() : new N()).b().f4771a.a().f4771a.b().f4771a.c();
    }

    public Z(c0 c0Var) {
        this.f4765a = c0Var;
    }

    public c0 a() {
        return this.f4765a;
    }

    public c0 b() {
        return this.f4765a;
    }

    public c0 c() {
        return this.f4765a;
    }

    public void d(View view) {
    }

    public C0162h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z2 = (Z) obj;
        return n() == z2.n() && m() == z2.m() && Objects.equals(j(), z2.j()) && Objects.equals(h(), z2.h()) && Objects.equals(e(), z2.e());
    }

    public F.c f(int i3) {
        return F.c.f2164e;
    }

    public F.c g() {
        return j();
    }

    public F.c h() {
        return F.c.f2164e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public F.c i() {
        return j();
    }

    public F.c j() {
        return F.c.f2164e;
    }

    public F.c k() {
        return j();
    }

    public c0 l(int i3, int i10, int i11, int i12) {
        return f4764b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(F.c[] cVarArr) {
    }

    public void p(c0 c0Var) {
    }

    public void q(F.c cVar) {
    }

    public void r(int i3) {
    }
}
