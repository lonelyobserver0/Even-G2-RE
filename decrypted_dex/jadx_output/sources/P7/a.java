package P7;

import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5553a;

    /* renamed from: b, reason: collision with root package name */
    public final RouteLeg f5554b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5555c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5556d;

    /* renamed from: e, reason: collision with root package name */
    public final double f5557e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5558f;

    /* renamed from: g, reason: collision with root package name */
    public final d f5559g;

    /* renamed from: h, reason: collision with root package name */
    public final LegStep f5560h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5561i;
    public final com.mapbox.navigation.base.route.a j;

    public a(int i3, RouteLeg routeLeg, float f10, float f11, double d8, float f12, d dVar, LegStep legStep, int i10, com.mapbox.navigation.base.route.a aVar) {
        this.f5553a = i3;
        this.f5554b = routeLeg;
        this.f5555c = f10;
        this.f5556d = f11;
        this.f5557e = d8;
        this.f5558f = f12;
        this.f5559g = dVar;
        this.f5560h = legStep;
        this.f5561i = i10;
        this.j = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.RouteLegProgress");
        a aVar = (a) obj;
        return this.f5553a == aVar.f5553a && Intrinsics.areEqual(this.f5554b, aVar.f5554b) && this.f5555c == aVar.f5555c && this.f5556d == aVar.f5556d && this.f5557e == aVar.f5557e && this.f5558f == aVar.f5558f && Intrinsics.areEqual(this.f5559g, aVar.f5559g) && Intrinsics.areEqual(this.f5560h, aVar.f5560h) && this.f5561i == aVar.f5561i && Intrinsics.areEqual(this.j, aVar.j);
    }

    public final int hashCode() {
        int i3 = this.f5553a * 31;
        RouteLeg routeLeg = this.f5554b;
        int hashCode = (Float.hashCode(this.f5558f) + E1.a.d(this.f5557e, (Float.hashCode(this.f5556d) + ((Float.hashCode(this.f5555c) + ((i3 + (routeLeg != null ? routeLeg.hashCode() : 0)) * 31)) * 31)) * 31, 31)) * 31;
        d dVar = this.f5559g;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        LegStep legStep = this.f5560h;
        int e10 = E1.a.e(this.f5561i, (hashCode2 + (legStep != null ? legStep.hashCode() : 0)) * 31, 31);
        com.mapbox.navigation.base.route.a aVar = this.j;
        return e10 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(4986) + this.f5553a + StubApp.getString2(4987) + this.f5554b + StubApp.getString2(4988) + this.f5555c + StubApp.getString2(4989) + this.f5556d + StubApp.getString2(4990) + this.f5557e + StubApp.getString2(4991) + this.f5558f + StubApp.getString2(4992) + this.f5559g + StubApp.getString2(4993) + this.f5560h + StubApp.getString2(4994) + this.f5561i + StubApp.getString2(4995) + this.j + ')';
    }
}
