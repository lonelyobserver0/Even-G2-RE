package N;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Y extends X {

    /* renamed from: s, reason: collision with root package name */
    public static final c0 f4763s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f4763s = c0.g(windowInsets, null);
    }

    public Y(c0 c0Var, WindowInsets windowInsets) {
        super(c0Var, windowInsets);
    }

    @Override // N.X, N.T, N.Z
    public F.c f(int i3) {
        Insets insets;
        insets = this.f4752c.getInsets(b0.a(i3));
        return F.c.b(insets);
    }
}
