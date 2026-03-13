package N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f4770b;

    /* renamed from: a, reason: collision with root package name */
    public final Z f4771a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            f4770b = Y.f4763s;
        } else if (i3 >= 30) {
            f4770b = X.f4762r;
        } else {
            f4770b = Z.f4764b;
        }
    }

    public c0(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            this.f4771a = new Y(this, windowInsets);
            return;
        }
        if (i3 >= 30) {
            this.f4771a = new X(this, windowInsets);
        } else if (i3 >= 29) {
            this.f4771a = new W(this, windowInsets);
        } else {
            this.f4771a = new V(this, windowInsets);
        }
    }

    public static F.c e(F.c cVar, int i3, int i10, int i11, int i12) {
        int max = Math.max(0, cVar.f2165a - i3);
        int max2 = Math.max(0, cVar.f2166b - i10);
        int max3 = Math.max(0, cVar.f2167c - i11);
        int max4 = Math.max(0, cVar.f2168d - i12);
        return (max == i3 && max2 == i10 && max3 == i11 && max4 == i12) ? cVar : F.c.a(max, max2, max3, max4);
    }

    public static c0 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        c0 c0Var = new c0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = I.f4732a;
            c0 a3 = C.a(view);
            Z z2 = c0Var.f4771a;
            z2.p(a3);
            z2.d(view.getRootView());
            z2.r(view.getWindowSystemUiVisibility());
        }
        return c0Var;
    }

    public final int a() {
        return this.f4771a.j().f2168d;
    }

    public final int b() {
        return this.f4771a.j().f2165a;
    }

    public final int c() {
        return this.f4771a.j().f2167c;
    }

    public final int d() {
        return this.f4771a.j().f2166b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        return Objects.equals(this.f4771a, ((c0) obj).f4771a);
    }

    public final WindowInsets f() {
        Z z2 = this.f4771a;
        if (z2 instanceof T) {
            return ((T) z2).f4752c;
        }
        return null;
    }

    public final int hashCode() {
        Z z2 = this.f4771a;
        if (z2 == null) {
            return 0;
        }
        return z2.hashCode();
    }

    public c0() {
        this.f4771a = new Z(this);
    }
}
