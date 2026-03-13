package F7;

import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f2298a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2299b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2300c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2301d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2302e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2303f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2304g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2305h;

    public g(long j, long j3, long j10, String responseParseThread, long j11, long j12, long j13, long j14) {
        Intrinsics.checkNotNullParameter(responseParseThread, "responseParseThread");
        this.f2298a = j;
        this.f2299b = j3;
        this.f2300c = j10;
        this.f2301d = responseParseThread;
        this.f2302e = j11;
        this.f2303f = j12;
        this.f2304g = j13;
        this.f2305h = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2298a == gVar.f2298a && this.f2299b == gVar.f2299b && this.f2300c == gVar.f2300c && Intrinsics.areEqual(this.f2301d, gVar.f2301d) && this.f2302e == gVar.f2302e && this.f2303f == gVar.f2303f && this.f2304g == gVar.f2304g && this.f2305h == gVar.f2305h;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2305h) + com.mapbox.common.b.b(com.mapbox.common.b.b(com.mapbox.common.b.b(u.d(com.mapbox.common.b.b(com.mapbox.common.b.b(Long.hashCode(this.f2298a) * 31, 31, this.f2299b), 31, this.f2300c), 31, this.f2301d), 31, this.f2302e), 31, this.f2303f), 31, this.f2304g);
    }

    public final String toString() {
        return StubApp.getString2(2129) + this.f2298a + StubApp.getString2(2130) + this.f2299b + StubApp.getString2(2131) + this.f2300c + StubApp.getString2(2132) + this.f2301d + StubApp.getString2(2133) + this.f2302e + StubApp.getString2(2134) + this.f2303f + StubApp.getString2(2135) + this.f2304g + StubApp.getString2(2136) + this.f2305h + ')';
    }
}
