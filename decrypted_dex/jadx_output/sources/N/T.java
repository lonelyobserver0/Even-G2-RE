package N;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.stub.StubApp;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class T extends Z {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f4748i;
    public static Method j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f4749k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f4750l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f4751m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f4752c;

    /* renamed from: d, reason: collision with root package name */
    public F.c[] f4753d;

    /* renamed from: e, reason: collision with root package name */
    public F.c f4754e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f4755f;

    /* renamed from: g, reason: collision with root package name */
    public F.c f4756g;

    /* renamed from: h, reason: collision with root package name */
    public int f4757h;

    public T(c0 c0Var, WindowInsets windowInsets) {
        super(c0Var);
        this.f4754e = null;
        this.f4752c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private F.c s(int i3, boolean z2) {
        F.c cVar = F.c.f2164e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i3 & i10) != 0) {
                F.c t3 = t(i10, z2);
                cVar = F.c.a(Math.max(cVar.f2165a, t3.f2165a), Math.max(cVar.f2166b, t3.f2166b), Math.max(cVar.f2167c, t3.f2167c), Math.max(cVar.f2168d, t3.f2168d));
            }
        }
        return cVar;
    }

    private F.c u() {
        c0 c0Var = this.f4755f;
        return c0Var != null ? c0Var.f4771a.h() : F.c.f2164e;
    }

    private F.c v(View view) {
        String string2 = StubApp.getString2(3609);
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException(StubApp.getString2(3617));
        }
        if (!f4748i) {
            w();
        }
        Method method = j;
        if (method != null && f4749k != null && f4750l != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w(string2, StubApp.getString2("3615"), new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f4750l.get(f4751m.get(invoke));
                if (rect != null) {
                    return F.c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e10) {
                Log.e(string2, StubApp.getString2(3616) + e10.getMessage(), e10);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void w() {
        try {
            j = View.class.getDeclaredMethod(StubApp.getString2("3618"), new Class[0]);
            Class<?> cls = Class.forName(StubApp.getString2("3619"));
            f4749k = cls;
            f4750l = cls.getDeclaredField(StubApp.getString2("3620"));
            f4751m = Class.forName(StubApp.getString2("3621")).getDeclaredField(StubApp.getString2("3622"));
            f4750l.setAccessible(true);
            f4751m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e(StubApp.getString2(3609), StubApp.getString2(3616) + e10.getMessage(), e10);
        }
        f4748i = true;
    }

    public static boolean y(int i3, int i10) {
        return (i3 & 6) == (i10 & 6);
    }

    @Override // N.Z
    public void d(View view) {
        F.c v2 = v(view);
        if (v2 == null) {
            v2 = F.c.f2164e;
        }
        x(v2);
    }

    @Override // N.Z
    public F.c f(int i3) {
        return s(i3, false);
    }

    @Override // N.Z
    public final F.c j() {
        if (this.f4754e == null) {
            WindowInsets windowInsets = this.f4752c;
            this.f4754e = F.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f4754e;
    }

    @Override // N.Z
    public c0 l(int i3, int i10, int i11, int i12) {
        c0 g10 = c0.g(this.f4752c, null);
        int i13 = Build.VERSION.SDK_INT;
        S q10 = i13 >= 34 ? new Q(g10) : i13 >= 30 ? new P(g10) : i13 >= 29 ? new O(g10) : new N(g10);
        q10.d(c0.e(j(), i3, i10, i11, i12));
        q10.c(c0.e(h(), i3, i10, i11, i12));
        return q10.b();
    }

    @Override // N.Z
    public boolean n() {
        return this.f4752c.isRound();
    }

    @Override // N.Z
    public void o(F.c[] cVarArr) {
        this.f4753d = cVarArr;
    }

    @Override // N.Z
    public void p(c0 c0Var) {
        this.f4755f = c0Var;
    }

    @Override // N.Z
    public void r(int i3) {
        this.f4757h = i3;
    }

    public F.c t(int i3, boolean z2) {
        F.c h2;
        int i10;
        F.c cVar = F.c.f2164e;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 8) {
                    F.c[] cVarArr = this.f4753d;
                    h2 = cVarArr != null ? cVarArr[3] : null;
                    if (h2 != null) {
                        return h2;
                    }
                    F.c j3 = j();
                    F.c u2 = u();
                    int i11 = j3.f2168d;
                    if (i11 > u2.f2168d) {
                        return F.c.a(0, 0, 0, i11);
                    }
                    F.c cVar2 = this.f4756g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i10 = this.f4756g.f2168d) > u2.f2168d) {
                        return F.c.a(0, 0, 0, i10);
                    }
                } else {
                    if (i3 == 16) {
                        return i();
                    }
                    if (i3 == 32) {
                        return g();
                    }
                    if (i3 == 64) {
                        return k();
                    }
                    if (i3 == 128) {
                        c0 c0Var = this.f4755f;
                        C0162h e10 = c0Var != null ? c0Var.f4771a.e() : e();
                        if (e10 != null) {
                            DisplayCutout displayCutout = e10.f4790a;
                            return F.c.a(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                        }
                    }
                }
            } else {
                if (z2) {
                    F.c u10 = u();
                    F.c h4 = h();
                    return F.c.a(Math.max(u10.f2165a, h4.f2165a), 0, Math.max(u10.f2167c, h4.f2167c), Math.max(u10.f2168d, h4.f2168d));
                }
                if ((this.f4757h & 2) == 0) {
                    F.c j10 = j();
                    c0 c0Var2 = this.f4755f;
                    h2 = c0Var2 != null ? c0Var2.f4771a.h() : null;
                    int i12 = j10.f2168d;
                    if (h2 != null) {
                        i12 = Math.min(i12, h2.f2168d);
                    }
                    return F.c.a(j10.f2165a, 0, j10.f2167c, i12);
                }
            }
        } else {
            if (z2) {
                return F.c.a(0, Math.max(u().f2166b, j().f2166b), 0, 0);
            }
            if ((this.f4757h & 4) == 0) {
                return F.c.a(0, j().f2166b, 0, 0);
            }
        }
        return cVar;
    }

    public void x(F.c cVar) {
        this.f4756g = cVar;
    }
}
