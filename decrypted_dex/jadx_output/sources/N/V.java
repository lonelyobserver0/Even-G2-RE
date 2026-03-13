package N;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class V extends U {
    public V(c0 c0Var, WindowInsets windowInsets) {
        super(c0Var, windowInsets);
    }

    @Override // N.Z
    public c0 a() {
        return c0.g(this.f4752c.consumeDisplayCutout(), null);
    }

    @Override // N.Z
    public C0162h e() {
        DisplayCutout displayCutout = this.f4752c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0162h(displayCutout);
    }

    @Override // N.Z
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v2 = (V) obj;
        return Objects.equals(this.f4752c, v2.f4752c) && Objects.equals(this.f4756g, v2.f4756g) && T.y(this.f4757h, v2.f4757h);
    }

    @Override // N.Z
    public int hashCode() {
        return this.f4752c.hashCode();
    }
}
