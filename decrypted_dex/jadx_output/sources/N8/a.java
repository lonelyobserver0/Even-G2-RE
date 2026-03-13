package N8;

import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4940a;

    public a(ArrayList events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.f4940a = events;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.replay.history.ReplayEvents");
        return Intrinsics.areEqual(this.f4940a, ((a) obj).f4940a);
    }

    public final int hashCode() {
        return this.f4940a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(3788) + this.f4940a + ')';
    }
}
