package V8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w extends z {

    /* renamed from: a, reason: collision with root package name */
    public final String f7903a;

    public w(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f7903a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(w.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.trip.session.NavigationSessionState.ActiveGuidance");
        return Intrinsics.areEqual(this.f7903a, ((w) obj).f7903a);
    }

    public final int hashCode() {
        return this.f7903a.hashCode();
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(6736)), this.f7903a, StubApp.getString2(2142));
    }
}
