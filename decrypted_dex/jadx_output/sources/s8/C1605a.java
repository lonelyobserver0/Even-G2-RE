package s8;

import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;
import y7.c;

/* renamed from: s8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1605a {

    /* renamed from: a, reason: collision with root package name */
    public final double f20813a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20814b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20815c;

    /* renamed from: d, reason: collision with root package name */
    public final c f20816d;

    public C1605a(double d8, String distanceAsString, String turfDistanceUnit, c unitType) {
        Intrinsics.checkNotNullParameter(distanceAsString, "distanceAsString");
        Intrinsics.checkNotNullParameter(turfDistanceUnit, "turfDistanceUnit");
        Intrinsics.checkNotNullParameter(unitType, "unitType");
        this.f20813a = d8;
        this.f20814b = distanceAsString;
        this.f20815c = turfDistanceUnit;
        this.f20816d = unitType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1605a)) {
            return false;
        }
        C1605a c1605a = (C1605a) obj;
        return Double.compare(this.f20813a, c1605a.f20813a) == 0 && Intrinsics.areEqual(this.f20814b, c1605a.f20814b) && Intrinsics.areEqual(this.f20815c, c1605a.f20815c) && this.f20816d == c1605a.f20816d;
    }

    public final int hashCode() {
        return this.f20816d.hashCode() + u.d(u.d(Double.hashCode(this.f20813a) * 31, 31, this.f20814b), 31, this.f20815c);
    }

    public final String toString() {
        return StubApp.getString2(23147) + this.f20813a + StubApp.getString2(23148) + this.f20814b + StubApp.getString2(23149) + this.f20815c + StubApp.getString2(23150) + this.f20816d + ')';
    }
}
