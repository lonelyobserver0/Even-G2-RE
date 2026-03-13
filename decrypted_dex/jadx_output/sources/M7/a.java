package M7;

import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4676a;

    public a(ArrayList components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f4676a = components;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.road.model.Road");
        return Intrinsics.areEqual(this.f4676a, ((a) obj).f4676a);
    }

    public final int hashCode() {
        return this.f4676a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(3560) + this.f4676a + ')';
    }
}
