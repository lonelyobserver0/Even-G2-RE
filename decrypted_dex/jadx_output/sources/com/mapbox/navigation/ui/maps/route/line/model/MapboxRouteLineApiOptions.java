package com.mapbox.navigation.ui.maps.route.line.model;

import E1.a;
import androidx.annotation.Keep;
import com.mapbox.common.b;
import com.stub.StubApp;
import i2.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import y9.e;
import y9.f;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u0000 12\u00020\u0001:\u0002\u00132B_\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b#\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R \u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010'\u0012\u0004\b/\u00100\u001a\u0004\b\u0010\u0010)¨\u00063"}, d2 = {"Lcom/mapbox/navigation/ui/maps/route/line/model/MapboxRouteLineApiOptions;", "", "Lkotlin/ranges/IntRange;", "lowCongestionRange", "moderateCongestionRange", "heavyCongestionRange", "severeCongestionRange", "", "", "trafficBackfillRoadClasses", "", "calculateRestrictedRoadSections", "styleInactiveRouteLegsIndependently", "vanishingRouteLineEnabled", "", "vanishingRouteLineUpdateIntervalNano", "isRouteCalloutsEnabled", "<init>", "(Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;Ljava/util/List;ZZZJZ)V", "Ly9/e;", "toBuilder", "()Ly9/e;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/ranges/IntRange;", "getLowCongestionRange", "()Lkotlin/ranges/IntRange;", "getModerateCongestionRange", "getHeavyCongestionRange", "getSevereCongestionRange", "Ljava/util/List;", "getTrafficBackfillRoadClasses", "()Ljava/util/List;", "Z", "getCalculateRestrictedRoadSections", "()Z", "getStyleInactiveRouteLegsIndependently", "getVanishingRouteLineEnabled", "J", "getVanishingRouteLineUpdateIntervalNano", "()J", "isRouteCalloutsEnabled$annotations", "()V", "Companion", "y9/f", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxRouteLineApiOptions {
    private static final f Companion = new f();
    private final boolean calculateRestrictedRoadSections;
    private final IntRange heavyCongestionRange;
    private final boolean isRouteCalloutsEnabled;
    private final IntRange lowCongestionRange;
    private final IntRange moderateCongestionRange;
    private final IntRange severeCongestionRange;
    private final boolean styleInactiveRouteLegsIndependently;
    private final List<String> trafficBackfillRoadClasses;
    private final boolean vanishingRouteLineEnabled;
    private final long vanishingRouteLineUpdateIntervalNano;

    public /* synthetic */ MapboxRouteLineApiOptions(IntRange intRange, IntRange intRange2, IntRange intRange3, IntRange intRange4, List list, boolean z2, boolean z10, boolean z11, long j, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(intRange, intRange2, intRange3, intRange4, list, z2, z10, z11, j, z12);
    }

    public static /* synthetic */ void isRouteCalloutsEnabled$annotations() {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MapboxRouteLineApiOptions.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions");
        MapboxRouteLineApiOptions mapboxRouteLineApiOptions = (MapboxRouteLineApiOptions) other;
        return Intrinsics.areEqual(this.lowCongestionRange, mapboxRouteLineApiOptions.lowCongestionRange) && Intrinsics.areEqual(this.moderateCongestionRange, mapboxRouteLineApiOptions.moderateCongestionRange) && Intrinsics.areEqual(this.heavyCongestionRange, mapboxRouteLineApiOptions.heavyCongestionRange) && Intrinsics.areEqual(this.severeCongestionRange, mapboxRouteLineApiOptions.severeCongestionRange) && Intrinsics.areEqual(this.trafficBackfillRoadClasses, mapboxRouteLineApiOptions.trafficBackfillRoadClasses) && this.calculateRestrictedRoadSections == mapboxRouteLineApiOptions.calculateRestrictedRoadSections && this.styleInactiveRouteLegsIndependently == mapboxRouteLineApiOptions.styleInactiveRouteLegsIndependently && this.vanishingRouteLineEnabled == mapboxRouteLineApiOptions.vanishingRouteLineEnabled && this.vanishingRouteLineUpdateIntervalNano == mapboxRouteLineApiOptions.vanishingRouteLineUpdateIntervalNano && this.isRouteCalloutsEnabled == mapboxRouteLineApiOptions.isRouteCalloutsEnabled;
    }

    public final boolean getCalculateRestrictedRoadSections() {
        return this.calculateRestrictedRoadSections;
    }

    public final IntRange getHeavyCongestionRange() {
        return this.heavyCongestionRange;
    }

    public final IntRange getLowCongestionRange() {
        return this.lowCongestionRange;
    }

    public final IntRange getModerateCongestionRange() {
        return this.moderateCongestionRange;
    }

    public final IntRange getSevereCongestionRange() {
        return this.severeCongestionRange;
    }

    public final boolean getStyleInactiveRouteLegsIndependently() {
        return this.styleInactiveRouteLegsIndependently;
    }

    public final List<String> getTrafficBackfillRoadClasses() {
        return this.trafficBackfillRoadClasses;
    }

    public final boolean getVanishingRouteLineEnabled() {
        return this.vanishingRouteLineEnabled;
    }

    public final long getVanishingRouteLineUpdateIntervalNano() {
        return this.vanishingRouteLineUpdateIntervalNano;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRouteCalloutsEnabled) + b.b(u.e(u.e(u.e(a.g((this.severeCongestionRange.hashCode() + ((this.heavyCongestionRange.hashCode() + ((this.moderateCongestionRange.hashCode() + (this.lowCongestionRange.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.trafficBackfillRoadClasses), 31, this.calculateRestrictedRoadSections), 31, this.styleInactiveRouteLegsIndependently), 31, this.vanishingRouteLineEnabled), 31, this.vanishingRouteLineUpdateIntervalNano);
    }

    /* renamed from: isRouteCalloutsEnabled, reason: from getter */
    public final boolean getIsRouteCalloutsEnabled() {
        return this.isRouteCalloutsEnabled;
    }

    public final e toBuilder() {
        e eVar = new e();
        IntRange intRange = J7.e.f3416a;
        eVar.f23564a = CollectionsKt.emptyList();
        IntRange range = this.lowCongestionRange;
        Intrinsics.checkNotNullParameter(range, "range");
        boolean a3 = f.a(Companion, range);
        String string2 = StubApp.getString2(14816);
        if (!a3) {
            throw new IllegalArgumentException(string2);
        }
        IntRange range2 = this.moderateCongestionRange;
        Intrinsics.checkNotNullParameter(range2, "range");
        if (!f.a(Companion, range2)) {
            throw new IllegalArgumentException(string2);
        }
        IntRange range3 = this.heavyCongestionRange;
        Intrinsics.checkNotNullParameter(range3, "range");
        if (!f.a(Companion, range3)) {
            throw new IllegalArgumentException(string2);
        }
        IntRange range4 = this.severeCongestionRange;
        Intrinsics.checkNotNullParameter(range4, "range");
        if (!f.a(Companion, range4)) {
            throw new IllegalArgumentException(string2);
        }
        List<String> roadClasses = this.trafficBackfillRoadClasses;
        Intrinsics.checkNotNullParameter(roadClasses, "roadClasses");
        eVar.f23564a = roadClasses;
        return eVar;
    }

    public String toString() {
        return StubApp.getString2(14817) + this.lowCongestionRange + StubApp.getString2(14818) + this.moderateCongestionRange + StubApp.getString2(14819) + this.heavyCongestionRange + StubApp.getString2(14820) + this.severeCongestionRange + StubApp.getString2(14821) + this.trafficBackfillRoadClasses + StubApp.getString2(14822) + this.calculateRestrictedRoadSections + StubApp.getString2(14823) + this.styleInactiveRouteLegsIndependently + StubApp.getString2(14824) + this.vanishingRouteLineEnabled + StubApp.getString2(14825) + this.vanishingRouteLineUpdateIntervalNano + StubApp.getString2(14826) + this.isRouteCalloutsEnabled + ')';
    }

    private MapboxRouteLineApiOptions(IntRange intRange, IntRange intRange2, IntRange intRange3, IntRange intRange4, List<String> list, boolean z2, boolean z10, boolean z11, long j, boolean z12) {
        this.lowCongestionRange = intRange;
        this.moderateCongestionRange = intRange2;
        this.heavyCongestionRange = intRange3;
        this.severeCongestionRange = intRange4;
        this.trafficBackfillRoadClasses = list;
        this.calculateRestrictedRoadSections = z2;
        this.styleInactiveRouteLegsIndependently = z10;
        this.vanishingRouteLineEnabled = z11;
        this.vanishingRouteLineUpdateIntervalNano = j;
        this.isRouteCalloutsEnabled = z12;
    }
}
