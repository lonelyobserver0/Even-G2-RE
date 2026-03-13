package T1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final u f7149a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f7150b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f7149a = new v();
        } else {
            f7149a = new u();
        }
        f7150b = new c(5, Float.class, StubApp.getString2(6148));
        new c(6, Rect.class, StubApp.getString2(6149));
    }

    public static void a(View view, int i3, int i10, int i11, int i12) {
        f7149a.G(view, i3, i10, i11, i12);
    }
}
