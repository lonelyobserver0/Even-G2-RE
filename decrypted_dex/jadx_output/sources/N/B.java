package N;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class B {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131231113);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static c0 b(View view, c0 c0Var, Rect rect) {
        WindowInsets f10 = c0Var.f();
        if (f10 != null) {
            return c0.g(view.computeSystemWindowInsets(f10, rect), view);
        }
        rect.setEmpty();
        return c0Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    public static float g(View view) {
        return view.getZ();
    }

    public static boolean h(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void i(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void j(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void k(View view, float f10) {
        view.setElevation(f10);
    }

    public static void l(View view, InterfaceC0167m interfaceC0167m) {
        A a3 = interfaceC0167m != null ? new A(view, interfaceC0167m) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131231104, a3);
        }
        if (view.getTag(2131231103) != null) {
            return;
        }
        if (a3 != null) {
            view.setOnApplyWindowInsetsListener(a3);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131231113));
        }
    }

    public static void m(View view) {
        view.stopNestedScroll();
    }
}
