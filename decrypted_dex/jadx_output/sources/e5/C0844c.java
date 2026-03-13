package e5;

import com.stub.StubApp;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0844c {

    /* renamed from: a, reason: collision with root package name */
    public final String f13607a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13608b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f13609c;

    public C0844c(String sessionId, long j, Map additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        this.f13607a = sessionId;
        this.f13608b = j;
        this.f13609c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0844c)) {
            return false;
        }
        C0844c c0844c = (C0844c) obj;
        return Intrinsics.areEqual(this.f13607a, c0844c.f13607a) && this.f13608b == c0844c.f13608b && Intrinsics.areEqual(this.f13609c, c0844c.f13609c);
    }

    public final int hashCode() {
        return this.f13609c.hashCode() + com.mapbox.common.b.b(this.f13607a.hashCode() * 31, 31, this.f13608b);
    }

    public final String toString() {
        return StubApp.getString2(17281) + this.f13607a + StubApp.getString2(5059) + this.f13608b + StubApp.getString2(17282) + this.f13609c + ')';
    }
}
