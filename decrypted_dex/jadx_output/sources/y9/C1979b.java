package y9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y9.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1979b {

    /* renamed from: a, reason: collision with root package name */
    public final double f23551a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23552b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23553c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23554d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23555e;

    public C1979b(double d8, String trafficCongestionIdentifier, String str, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(trafficCongestionIdentifier, "trafficCongestionIdentifier");
        this.f23551a = d8;
        this.f23552b = trafficCongestionIdentifier;
        this.f23553c = str;
        this.f23554d = i3;
        this.f23555e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1979b)) {
            return false;
        }
        C1979b c1979b = (C1979b) obj;
        return Double.compare(this.f23551a, c1979b.f23551a) == 0 && Intrinsics.areEqual(this.f23552b, c1979b.f23552b) && Intrinsics.areEqual(this.f23553c, c1979b.f23553c) && this.f23554d == c1979b.f23554d && this.f23555e == c1979b.f23555e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int d8 = i2.u.d(Double.hashCode(this.f23551a) * 31, 31, this.f23552b);
        String str = this.f23553c;
        int e10 = E1.a.e(this.f23554d, (d8 + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z2 = this.f23555e;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return e10 + i3;
    }

    public final String toString() {
        return StubApp.getString2(24674) + this.f23551a + StubApp.getString2(24675) + this.f23552b + StubApp.getString2(12798) + this.f23553c + StubApp.getString2(5025) + this.f23554d + StubApp.getString2(24676) + this.f23555e + ')';
    }
}
