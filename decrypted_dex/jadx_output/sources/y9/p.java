package y9;

import com.stub.StubApp;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final double f23593a;

    /* renamed from: b, reason: collision with root package name */
    public final k[] f23594b;

    /* renamed from: c, reason: collision with root package name */
    public final k[][] f23595c;

    /* renamed from: d, reason: collision with root package name */
    public final k[][][] f23596d;

    public p(double d8, k[] routeDistances, k[][] legsDistances, k[][][] stepsDistances) {
        Intrinsics.checkNotNullParameter(routeDistances, "routeDistances");
        Intrinsics.checkNotNullParameter(legsDistances, "legsDistances");
        Intrinsics.checkNotNullParameter(stepsDistances, "stepsDistances");
        this.f23593a = d8;
        this.f23594b = routeDistances;
        this.f23595c = legsDistances;
        this.f23596d = stepsDistances;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(p.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.RouteLineGranularDistances");
        p pVar = (p) obj;
        return this.f23593a == pVar.f23593a && Arrays.equals(this.f23594b, pVar.f23594b) && ArraysKt.contentDeepEquals(this.f23595c, pVar.f23595c) && ArraysKt.contentDeepEquals(this.f23596d, pVar.f23596d);
    }

    public final int hashCode() {
        return ArraysKt.contentDeepHashCode(this.f23596d) + ((ArraysKt.contentDeepHashCode(this.f23595c) + ((Arrays.hashCode(this.f23594b) + (Double.hashCode(this.f23593a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(24706) + this.f23593a + StubApp.getString2(24707) + Arrays.toString(this.f23594b) + StubApp.getString2(24708) + Arrays.toString(this.f23595c) + StubApp.getString2(24709) + Arrays.toString(this.f23596d) + ')';
    }
}
