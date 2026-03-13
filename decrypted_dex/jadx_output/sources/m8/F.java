package m8;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class F extends G {

    /* renamed from: a, reason: collision with root package name */
    public final int f17152a;

    public F(int i3) {
        this.f17152a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F) && this.f17152a == ((F) obj).f17152a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17152a);
    }

    public final String toString() {
        return com.mapbox.common.b.j(new StringBuilder(StubApp.getString2(21095)), this.f17152a, ')');
    }
}
