package H5;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final String f2786a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2787b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2788c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2789d;

    public O(long j, String sessionId, String firstSessionId, int i3) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.f2786a = sessionId;
        this.f2787b = firstSessionId;
        this.f2788c = i3;
        this.f2789d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o5 = (O) obj;
        return Intrinsics.areEqual(this.f2786a, o5.f2786a) && Intrinsics.areEqual(this.f2787b, o5.f2787b) && this.f2788c == o5.f2788c && this.f2789d == o5.f2789d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2789d) + E1.a.e(this.f2788c, i2.u.d(this.f2786a.hashCode() * 31, 31, this.f2787b), 31);
    }

    public final String toString() {
        return StubApp.getString2(2572) + this.f2786a + StubApp.getString2(2573) + this.f2787b + StubApp.getString2(2574) + this.f2788c + StubApp.getString2(2575) + this.f2789d + ')';
    }
}
