package J7;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f3451a;

    public p(int i3) {
        this.f3451a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f3451a == ((p) obj).f3451a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3451a);
    }

    public final String toString() {
        return com.mapbox.common.b.j(new StringBuilder(StubApp.getString2(3033)), this.f3451a, ')');
    }
}
