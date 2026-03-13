package N;

import android.view.DisplayCutout;
import com.stub.StubApp;
import java.util.Objects;

/* renamed from: N.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0162h {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f4790a;

    public C0162h(DisplayCutout displayCutout) {
        this.f4790a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0162h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f4790a, ((C0162h) obj).f4790a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f4790a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(3643) + this.f4790a + StubApp.getString2(265);
    }
}
