package c8;

import Xa.h;
import com.mapbox.navigator.RoadObject;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0575a extends R7.b {

    /* renamed from: h, reason: collision with root package name */
    public final C0576b f11044h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0575a(String id, C0576b info, Double d8, String provider, Boolean bool, RoadObject nativeRoadObject) {
        super(id, 8, d8, provider, bool, nativeRoadObject);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
        this.f11044h = info;
    }

    @Override // R7.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0575a.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.railwaycrossing.RailwayCrossing");
        return Intrinsics.areEqual(this.f11044h, ((C0575a) obj).f11044h);
    }

    @Override // R7.b
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        this.f11044h.getClass();
        return C0576b.class.hashCode() + hashCode;
    }

    @Override // R7.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(9635));
        sb2.append(this.f11044h);
        sb2.append(StubApp.getString2(6022));
        return h.s(sb2, super.toString(), ')');
    }
}
