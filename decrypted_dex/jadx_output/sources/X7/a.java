package X7;

import com.mapbox.navigator.RoadObject;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends R7.b {

    /* renamed from: h, reason: collision with root package name */
    public final c f8479h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String id, c info, Double d8, String provider, Boolean bool, RoadObject nativeRoadObject) {
        super(id, 6, d8, provider, bool, nativeRoadObject);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
        this.f8479h = info;
    }

    @Override // R7.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.incident.Incident");
        return Intrinsics.areEqual(this.f8479h, ((a) obj).f8479h);
    }

    @Override // R7.b
    public final int hashCode() {
        return this.f8479h.hashCode() + (super.hashCode() * 31);
    }

    @Override // R7.b
    public final String toString() {
        return StubApp.getString2(7290) + this.f8479h + StubApp.getString2(6022) + super.toString();
    }
}
