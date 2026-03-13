package A3;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w extends J {

    /* renamed from: a, reason: collision with root package name */
    public final I f214a;

    /* renamed from: b, reason: collision with root package name */
    public final H f215b;

    public w(I i3, H h2) {
        this.f214a = i3;
        this.f215b = h2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            J j = (J) obj;
            I i3 = this.f214a;
            if (i3 != null ? i3.equals(((w) j).f214a) : ((w) j).f214a == null) {
                H h2 = this.f215b;
                if (h2 != null ? h2.equals(((w) j).f215b) : ((w) j).f215b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        I i3 = this.f214a;
        int hashCode = ((i3 == null ? 0 : i3.hashCode()) ^ 1000003) * 1000003;
        H h2 = this.f215b;
        return (h2 != null ? h2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return StubApp.getString2(341) + this.f214a + StubApp.getString2(342) + this.f215b + StubApp.getString2(265);
    }
}
