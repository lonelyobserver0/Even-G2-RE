package M7;

import Xa.h;
import com.mapbox.api.directions.v5.models.MapboxShield;
import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4677a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4678b;

    /* renamed from: c, reason: collision with root package name */
    public final MapboxShield f4679c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4680d;

    public b(String text, String language, MapboxShield mapboxShield, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(language, "language");
        this.f4677a = text;
        this.f4678b = language;
        this.f4679c = mapboxShield;
        this.f4680d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.road.model.RoadComponent");
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f4677a, bVar.f4677a) && Intrinsics.areEqual(this.f4678b, bVar.f4678b) && Intrinsics.areEqual(this.f4679c, bVar.f4679c) && Intrinsics.areEqual(this.f4680d, bVar.f4680d);
    }

    public final int hashCode() {
        int d8 = u.d(this.f4677a.hashCode() * 31, 31, this.f4678b);
        MapboxShield mapboxShield = this.f4679c;
        int hashCode = (d8 + (mapboxShield != null ? mapboxShield.hashCode() : 0)) * 31;
        String str = this.f4680d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3561));
        sb2.append(this.f4677a);
        sb2.append(StubApp.getString2(3562));
        sb2.append(this.f4678b);
        sb2.append(StubApp.getString2(3563));
        sb2.append(this.f4679c);
        sb2.append(StubApp.getString2(3564));
        return h.s(sb2, this.f4680d, ')');
    }
}
