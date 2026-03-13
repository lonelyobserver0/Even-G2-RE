package V7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7781a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7782b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7783c;

    public f(String roadObjectId, int i3, int i10) {
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        this.f7781a = roadObjectId;
        this.f7782b = i3;
        this.f7783c = i10;
    }

    public abstract Double a();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo");
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f7781a, fVar.f7781a) && this.f7782b == fVar.f7782b && this.f7783c == fVar.f7783c && Intrinsics.areEqual(a(), fVar.a());
    }

    public int hashCode() {
        int hashCode = ((((this.f7781a.hashCode() * 31) + this.f7782b) * 31) + this.f7783c) * 31;
        Double a3 = a();
        return hashCode + (a3 != null ? a3.hashCode() : 0);
    }

    public String toString() {
        return StubApp.getString2(6633) + this.f7781a + StubApp.getString2(6634) + this.f7782b + StubApp.getString2(6635) + this.f7783c + StubApp.getString2(5753) + a() + ')';
    }
}
