package L7;

import com.mapbox.common.location.AccuracyLevel;
import com.mapbox.common.location.IntervalSettings;
import com.mapbox.common.location.LocationProviderRequest;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final LocationProviderRequest f4273b = new LocationProviderRequest.Builder().interval(new IntervalSettings.Builder().minimumInterval(500L).interval(1000L).build()).accuracy(AccuracyLevel.HIGH).build();

    /* renamed from: a, reason: collision with root package name */
    public final LocationProviderRequest f4274a;

    public g(LocationProviderRequest locationProviderRequest) {
        this.f4274a = locationProviderRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.options.LocationOptions");
        return Intrinsics.areEqual(this.f4274a, ((g) obj).f4274a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual("REAL", "REAL") && Intrinsics.areEqual("BEST", "BEST");
    }

    public final int hashCode() {
        return (((this.f4274a.hashCode() * 961) + 2511262) * 31) + 2035172;
    }

    public final String toString() {
        return StubApp.getString2(3432) + this.f4274a + StubApp.getString2(3433);
    }
}
