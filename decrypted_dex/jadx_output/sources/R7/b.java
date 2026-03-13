package R7;

import Ac.m;
import Z7.g;
import com.mapbox.navigator.RoadObject;
import com.stub.StubApp;
import i2.u;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6229b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f6230c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6231d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f6232e;

    /* renamed from: f, reason: collision with root package name */
    public final RoadObject f6233f;

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f6234g;

    public b(String id, int i3, Double d8, String provider, Boolean bool, RoadObject nativeRoadObject) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
        this.f6228a = id;
        this.f6229b = i3;
        this.f6230c = d8;
        this.f6231d = provider;
        this.f6232e = bool;
        this.f6233f = nativeRoadObject;
        this.f6234g = LazyKt.lazy(new m(this, 9));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.RoadObject");
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f6228a, bVar.f6228a) && this.f6229b == bVar.f6229b && Intrinsics.areEqual(this.f6230c, bVar.f6230c) && Intrinsics.areEqual((g) this.f6234g.getValue(), (g) bVar.f6234g.getValue()) && Intrinsics.areEqual(this.f6231d, bVar.f6231d) && Intrinsics.areEqual(this.f6233f, bVar.f6233f) && Intrinsics.areEqual(this.f6232e, bVar.f6232e);
    }

    public int hashCode() {
        int hashCode = ((this.f6228a.hashCode() * 31) + this.f6229b) * 31;
        Double d8 = this.f6230c;
        int hashCode2 = (this.f6233f.hashCode() + u.d((((g) this.f6234g.getValue()).hashCode() + ((hashCode + (d8 != null ? d8.hashCode() : 0)) * 31)) * 31, 31, this.f6231d)) * 31;
        Boolean bool = this.f6232e;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return StubApp.getString2(5743) + this.f6228a + StubApp.getString2(5744) + this.f6229b + StubApp.getString2(5307) + this.f6230c + StubApp.getString2(5745) + ((g) this.f6234g.getValue()) + StubApp.getString2(5746) + this.f6231d + StubApp.getString2(5747) + this.f6232e + ')';
    }
}
