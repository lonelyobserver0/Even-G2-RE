package rc;

import Ab.f;
import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rc.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1586a {

    /* renamed from: a, reason: collision with root package name */
    public final long f20551a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20552b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20553c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20554d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20555e;

    /* renamed from: f, reason: collision with root package name */
    public final f f20556f;

    public C1586a(long j, boolean z2, int i3, int i10, long j3, f firmwareUpgradeMode) {
        Intrinsics.checkNotNullParameter(firmwareUpgradeMode, "firmwareUpgradeMode");
        this.f20551a = j;
        this.f20552b = z2;
        this.f20553c = i3;
        this.f20554d = i10;
        this.f20555e = j3;
        this.f20556f = firmwareUpgradeMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1586a)) {
            return false;
        }
        C1586a c1586a = (C1586a) obj;
        return this.f20551a == c1586a.f20551a && this.f20552b == c1586a.f20552b && this.f20553c == c1586a.f20553c && this.f20554d == c1586a.f20554d && this.f20555e == c1586a.f20555e && this.f20556f == c1586a.f20556f;
    }

    public final int hashCode() {
        return this.f20556f.hashCode() + com.mapbox.common.b.b(E1.a.e(this.f20554d, E1.a.e(this.f20553c, u.e(Long.hashCode(this.f20551a) * 31, 31, this.f20552b), 31), 31), 31, this.f20555e);
    }

    public final String toString() {
        return StubApp.getString2(35301) + this.f20551a + StubApp.getString2(35302) + this.f20552b + StubApp.getString2(35303) + this.f20553c + StubApp.getString2(35304) + this.f20554d + StubApp.getString2(35305) + this.f20555e + StubApp.getString2(35306) + this.f20556f + StubApp.getString2(74);
    }
}
