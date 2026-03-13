package N;

import android.view.View;
import android.view.Window;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d0 extends Y3.a {

    /* renamed from: f, reason: collision with root package name */
    public final Window f4778f;

    public d0(Window window) {
        this.f4778f = window;
    }

    @Override // Y3.a
    public final void v(boolean z2) {
        Window window = this.f4778f;
        if (!z2) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }

    @Override // Y3.a
    public final void w(boolean z2) {
        Window window = this.f4778f;
        if (!z2) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
