package T1;

import android.view.ViewGroup;
import android.view.WindowId;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f7171a;

    public z(ViewGroup viewGroup) {
        this.f7171a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && ((z) obj).f7171a.equals(this.f7171a);
    }

    public final int hashCode() {
        return this.f7171a.hashCode();
    }
}
