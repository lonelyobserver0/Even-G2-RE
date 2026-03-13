package m8;

import com.stub.StubApp;

/* renamed from: m8.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1277A extends G {

    /* renamed from: a, reason: collision with root package name */
    public final int f17147a;

    public C1277A(int i3) {
        this.f17147a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1277A) && this.f17147a == ((C1277A) obj).f17147a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17147a);
    }

    public final String toString() {
        return com.mapbox.common.b.j(new StringBuilder(StubApp.getString2(21090)), this.f17147a, ')');
    }
}
