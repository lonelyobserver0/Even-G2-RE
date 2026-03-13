package V8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class x extends z {

    /* renamed from: a, reason: collision with root package name */
    public final String f7904a;

    public x(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f7904a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(x.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.trip.session.NavigationSessionState.FreeDrive");
        return Intrinsics.areEqual(this.f7904a, ((x) obj).f7904a);
    }

    public final int hashCode() {
        return this.f7904a.hashCode();
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(6737)), this.f7904a, StubApp.getString2(2142));
    }
}
