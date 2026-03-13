package W7;

import R7.b;
import com.mapbox.navigator.RoadObject;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends b {

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8170h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String id, ArrayList name, Double d8, String provider, Boolean bool, RoadObject nativeRoadObject) {
        super(id, 9, d8, provider, bool, nativeRoadObject);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
        this.f8170h = name;
    }

    @Override // R7.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.ic.Interchange");
        return Intrinsics.areEqual(this.f8170h, ((a) obj).f8170h);
    }

    @Override // R7.b
    public final int hashCode() {
        return this.f8170h.hashCode();
    }

    @Override // R7.b
    public final String toString() {
        return StubApp.getString2(6928) + this.f8170h + StubApp.getString2(2142);
    }
}
