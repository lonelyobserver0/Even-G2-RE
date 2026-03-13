package U6;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f7478a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7479b;

    public g(ArrayList bands, String layerId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(bands, "bands");
        this.f7478a = layerId;
        this.f7479b = bands;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.maps.extension.style.sources.generated.RasterArraySource.RasterDataLayer");
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f7478a, gVar.f7478a) && Intrinsics.areEqual(this.f7479b, gVar.f7479b);
    }

    public final int hashCode() {
        return Objects.hash(this.f7478a, this.f7479b);
    }

    public final String toString() {
        return StubApp.getString2(6377) + this.f7478a + StubApp.getString2(6378) + this.f7479b + ')';
    }
}
