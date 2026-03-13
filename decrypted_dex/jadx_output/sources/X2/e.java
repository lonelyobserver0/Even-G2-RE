package X2;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f8264a;

    /* renamed from: b, reason: collision with root package name */
    public final double f8265b;

    public e(double d8, double d10) {
        this.f8264a = d8;
        this.f8265b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Double.compare(this.f8264a, eVar.f8264a) == 0 && Double.compare(this.f8265b, eVar.f8265b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f8265b) + (Double.hashCode(this.f8264a) * 31);
    }

    public final String toString() {
        return StubApp.getString2(7064) + this.f8264a + StubApp.getString2(7065) + this.f8265b + StubApp.getString2(74);
    }
}
