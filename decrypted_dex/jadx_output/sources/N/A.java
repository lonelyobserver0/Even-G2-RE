package N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public c0 f4729a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0167m f4731c;

    public A(View view, InterfaceC0167m interfaceC0167m) {
        this.f4730b = view;
        this.f4731c = interfaceC0167m;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        c0 g10 = c0.g(windowInsets, view);
        int i3 = Build.VERSION.SDK_INT;
        InterfaceC0167m interfaceC0167m = this.f4731c;
        if (i3 < 30) {
            B.a(windowInsets, this.f4730b);
            if (g10.equals(this.f4729a)) {
                return interfaceC0167m.d(view, g10).f();
            }
        }
        this.f4729a = g10;
        c0 d8 = interfaceC0167m.d(view, g10);
        if (i3 >= 30) {
            return d8.f();
        }
        WeakHashMap weakHashMap = I.f4732a;
        AbstractC0179z.c(view);
        return d8.f();
    }
}
