package a8;

import com.mapbox.navigator.RoadObject;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0392a extends R7.b {

    /* renamed from: h, reason: collision with root package name */
    public final C0393b f9325h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0392a(String id, C0393b info, Double d8, String provider, Boolean bool, RoadObject nativeRoadObject) {
        super(id, 12, d8, provider, bool, nativeRoadObject);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
        this.f9325h = info;
    }

    @Override // R7.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0392a.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.merge.MergingArea");
        return Intrinsics.areEqual(this.f9325h, ((C0392a) obj).f9325h);
    }

    @Override // R7.b
    public final int hashCode() {
        return this.f9325h.f9326a.hashCode() + (super.hashCode() * 31);
    }

    @Override // R7.b
    public final String toString() {
        return StubApp.getString2(8565) + this.f9325h + StubApp.getString2(3046) + super.toString();
    }
}
