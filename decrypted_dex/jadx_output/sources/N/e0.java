package N;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class e0 extends Y3.a {

    /* renamed from: f, reason: collision with root package name */
    public final WindowInsetsController f4779f;

    /* renamed from: g, reason: collision with root package name */
    public final Window f4780g;

    public e0(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f4779f = insetsController;
        this.f4780g = window;
    }

    @Override // Y3.a
    public final void v(boolean z2) {
        Window window = this.f4780g;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f4779f.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f4779f.setSystemBarsAppearance(0, 16);
    }

    @Override // Y3.a
    public final void w(boolean z2) {
        Window window = this.f4780g;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f4779f.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f4779f.setSystemBarsAppearance(0, 8);
    }
}
