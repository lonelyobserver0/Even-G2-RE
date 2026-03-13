package H5;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final String f2818a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2819b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2820c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2821d;

    /* renamed from: e, reason: collision with root package name */
    public final C0078k f2822e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2823f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2824g;

    public X(String sessionId, String firstSessionId, int i3, long j, C0078k dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f2818a = sessionId;
        this.f2819b = firstSessionId;
        this.f2820c = i3;
        this.f2821d = j;
        this.f2822e = dataCollectionStatus;
        this.f2823f = firebaseInstallationId;
        this.f2824g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x7 = (X) obj;
        return Intrinsics.areEqual(this.f2818a, x7.f2818a) && Intrinsics.areEqual(this.f2819b, x7.f2819b) && this.f2820c == x7.f2820c && this.f2821d == x7.f2821d && Intrinsics.areEqual(this.f2822e, x7.f2822e) && Intrinsics.areEqual(this.f2823f, x7.f2823f) && Intrinsics.areEqual(this.f2824g, x7.f2824g);
    }

    public final int hashCode() {
        return this.f2824g.hashCode() + i2.u.d((this.f2822e.hashCode() + com.mapbox.common.b.b(E1.a.e(this.f2820c, i2.u.d(this.f2818a.hashCode() * 31, 31, this.f2819b), 31), 31, this.f2821d)) * 31, 31, this.f2823f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2585));
        sb2.append(this.f2818a);
        sb2.append(StubApp.getString2(2573));
        sb2.append(this.f2819b);
        sb2.append(StubApp.getString2(2574));
        sb2.append(this.f2820c);
        sb2.append(StubApp.getString2(2586));
        sb2.append(this.f2821d);
        sb2.append(StubApp.getString2(2587));
        sb2.append(this.f2822e);
        sb2.append(StubApp.getString2(2588));
        sb2.append(this.f2823f);
        sb2.append(StubApp.getString2(2589));
        return Xa.h.s(sb2, this.f2824g, ')');
    }
}
