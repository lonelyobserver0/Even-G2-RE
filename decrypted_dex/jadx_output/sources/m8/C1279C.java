package m8;

import com.stub.StubApp;

/* renamed from: m8.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1279C extends G {

    /* renamed from: a, reason: collision with root package name */
    public final int f17149a;

    public C1279C(int i3) {
        this.f17149a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1279C) && this.f17149a == ((C1279C) obj).f17149a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17149a);
    }

    public final String toString() {
        return com.mapbox.common.b.j(new StringBuilder(StubApp.getString2(21091)), this.f17149a, ')');
    }
}
