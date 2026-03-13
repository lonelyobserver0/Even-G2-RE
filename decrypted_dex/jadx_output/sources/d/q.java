package d;

import N.d0;
import N.e0;
import N.f0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class q extends p {
    @Override // d.o
    public void a(C0758C statusBarStyle, C0758C navigationBarStyle, Window window, View view, boolean z2, boolean z10) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        W.a.w(window);
        statusBarStyle.getClass();
        window.setStatusBarColor(0);
        navigationBarStyle.getClass();
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(navigationBarStyle.f13044a == 0);
        int i3 = Build.VERSION.SDK_INT;
        Y3.a f0Var = i3 >= 35 ? new f0(window) : i3 >= 30 ? new e0(window) : new d0(window);
        f0Var.w(!z2);
        f0Var.v(!z10);
    }
}
