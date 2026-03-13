package f8;

import R7.b;
import com.mapbox.navigator.RoadObject;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0932a extends b {

    /* renamed from: h, reason: collision with root package name */
    public final int f14180h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14181i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0932a(String id, int i3, String str, Double d8, String provider, Boolean bool, RoadObject nativeRoadObject) {
        super(id, 2, d8, provider, bool, nativeRoadObject);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
        this.f14180h = i3;
        this.f14181i = str;
    }

    @Override // R7.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0932a.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.tollcollection.TollCollection");
        C0932a c0932a = (C0932a) obj;
        return this.f14180h == c0932a.f14180h && Intrinsics.areEqual(this.f14181i, c0932a.f14181i);
    }

    @Override // R7.b
    public final int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.f14180h) * 31;
        String str = this.f14181i;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // R7.b
    public final String toString() {
        return StubApp.getString2(17734) + this.f14180h + StubApp.getString2(17735) + this.f14181i + StubApp.getString2(6022) + super.toString();
    }
}
