package N;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0171q f4800a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f4800a = new C0170p(nestedScrollView);
        } else {
            this.f4800a = new I4.e(14);
        }
    }
}
