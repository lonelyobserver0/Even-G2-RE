package N;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class X extends W {

    /* renamed from: r, reason: collision with root package name */
    public static final c0 f4762r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f4762r = c0.g(windowInsets, null);
    }

    public X(c0 c0Var, WindowInsets windowInsets) {
        super(c0Var, windowInsets);
    }

    @Override // N.T, N.Z
    public final void d(View view) {
    }

    @Override // N.T, N.Z
    public F.c f(int i3) {
        Insets insets;
        insets = this.f4752c.getInsets(a0.a(i3));
        return F.c.b(insets);
    }
}
