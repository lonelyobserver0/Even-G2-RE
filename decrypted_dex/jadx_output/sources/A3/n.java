package A3;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends z {

    /* renamed from: a, reason: collision with root package name */
    public final l f183a;

    public n(l lVar) {
        this.f183a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        Object obj2 = y.f216a;
        ((n) zVar).getClass();
        return obj2.equals(obj2) && this.f183a.equals(((n) zVar).f183a);
    }

    public final int hashCode() {
        return ((y.f216a.hashCode() ^ 1000003) * 1000003) ^ this.f183a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(267) + y.f216a + StubApp.getString2(268) + this.f183a + StubApp.getString2(265);
    }
}
