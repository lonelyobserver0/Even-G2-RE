package g8;

import com.mapbox.navigator.RoadObject;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0963a extends R7.b {

    /* renamed from: h, reason: collision with root package name */
    public final C0964b f14234h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0963a(String id, C0964b info, Double d8, String provider, Boolean bool, RoadObject nativeRoadObject) {
        super(id, 0, d8, provider, bool, nativeRoadObject);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
        this.f14234h = info;
    }

    @Override // R7.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0963a.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.tunnel.Tunnel");
        return Intrinsics.areEqual(this.f14234h, ((C0963a) obj).f14234h);
    }

    @Override // R7.b
    public final int hashCode() {
        return this.f14234h.hashCode() + (super.hashCode() * 31);
    }

    @Override // R7.b
    public final String toString() {
        return StubApp.getString2(17808) + this.f14234h + StubApp.getString2(6022) + super.toString();
    }
}
