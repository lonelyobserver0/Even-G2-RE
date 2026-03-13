package m8;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class E extends G {

    /* renamed from: a, reason: collision with root package name */
    public final int f17151a;

    public E(int i3) {
        this.f17151a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && this.f17151a == ((E) obj).f17151a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17151a);
    }

    public final String toString() {
        return com.mapbox.common.b.j(new StringBuilder(StubApp.getString2(21094)), this.f17151a, ')');
    }
}
