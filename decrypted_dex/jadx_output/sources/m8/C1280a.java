package m8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* renamed from: m8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1280a {

    /* renamed from: a, reason: collision with root package name */
    public final String f17153a;

    public C1280a(String copilotSessionId) {
        Intrinsics.checkNotNullParameter(copilotSessionId, "copilotSessionId");
        this.f17153a = copilotSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1280a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.DeveloperMetadata");
        return Intrinsics.areEqual(this.f17153a, ((C1280a) obj).f17153a);
    }

    public final int hashCode() {
        return this.f17153a.hashCode();
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(21096)), this.f17153a, StubApp.getString2(2142));
    }
}
