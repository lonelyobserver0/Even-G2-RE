package m8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f17263a;

    public y(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f17263a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(y.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.RoutesSetError");
        return Intrinsics.areEqual(this.f17263a, ((y) obj).f17263a);
    }

    public final int hashCode() {
        return this.f17263a.hashCode();
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(21166)), this.f17263a, StubApp.getString2(2142));
    }
}
