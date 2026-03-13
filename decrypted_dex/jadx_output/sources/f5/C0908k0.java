package f5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* renamed from: f5.k0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0908k0 extends M0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14062a;

    public C0908k0(String str) {
        this.f14062a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        return this.f14062a.equals(((C0908k0) ((M0) obj)).f14062a);
    }

    public final int hashCode() {
        return this.f14062a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(17659)), this.f14062a, StubApp.getString2(265));
    }
}
