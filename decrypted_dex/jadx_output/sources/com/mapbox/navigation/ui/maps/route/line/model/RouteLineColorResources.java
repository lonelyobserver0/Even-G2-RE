package com.mapbox.navigation.ui.maps.route.line.model;

import androidx.annotation.Keep;
import com.mapbox.common.b;
import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t9.AbstractC1740a;
import y9.i;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001:\u0001#Bµ\u0002\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0001\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010*R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010*R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010*R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010*R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010*R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010*R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b8\u0010*R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b9\u0010*R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b:\u0010*R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b;\u0010*R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b<\u0010*R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b=\u0010*R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b>\u0010*R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b?\u0010*R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b@\u0010*R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010/\u001a\u0004\bA\u0010*R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\bB\u0010*R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010/\u001a\u0004\bC\u0010*R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\bD\u0010*R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\bE\u0010*R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\bF\u0010*R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010/\u001a\u0004\bG\u0010*R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\bH\u0010*R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010/\u001a\u0004\bI\u0010*R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\bJ\u0010*R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\bK\u0010*R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010/\u001a\u0004\bL\u0010*R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010/\u001a\u0004\bM\u0010*¨\u0006N"}, d2 = {"Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineColorResources;", "", "", "routeDefaultColor", "routeLowCongestionColor", "routeModerateCongestionColor", "routeHeavyCongestionColor", "routeSevereCongestionColor", "routeUnknownCongestionColor", "inactiveRouteLegLowCongestionColor", "inactiveRouteLegModerateCongestionColor", "inactiveRouteLegHeavyCongestionColor", "inactiveRouteLegSevereCongestionColor", "inactiveRouteLegUnknownCongestionColor", "alternativeRouteDefaultColor", "alternativeRouteLowCongestionColor", "alternativeRouteModerateCongestionColor", "alternativeRouteHeavyCongestionColor", "alternativeRouteSevereCongestionColor", "alternativeRouteUnknownCongestionColor", "restrictedRoadColor", "routeClosureColor", "inactiveRouteLegRestrictedRoadColor", "inactiveRouteLegClosureColor", "alternativeRouteRestrictedRoadColor", "alternativeRouteClosureColor", "routeLineTraveledColor", "routeLineTraveledCasingColor", "routeCasingColor", "alternativeRouteCasingColor", "inactiveRouteLegCasingColor", "inActiveRouteLegsColor", "blurColor", "<init>", "(IIIIIIIIIIIIIIIIIIIIIIIIIIIIII)V", "Ly9/i;", "toBuilder", "()Ly9/i;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRouteDefaultColor", "getRouteLowCongestionColor", "getRouteModerateCongestionColor", "getRouteHeavyCongestionColor", "getRouteSevereCongestionColor", "getRouteUnknownCongestionColor", "getInactiveRouteLegLowCongestionColor", "getInactiveRouteLegModerateCongestionColor", "getInactiveRouteLegHeavyCongestionColor", "getInactiveRouteLegSevereCongestionColor", "getInactiveRouteLegUnknownCongestionColor", "getAlternativeRouteDefaultColor", "getAlternativeRouteLowCongestionColor", "getAlternativeRouteModerateCongestionColor", "getAlternativeRouteHeavyCongestionColor", "getAlternativeRouteSevereCongestionColor", "getAlternativeRouteUnknownCongestionColor", "getRestrictedRoadColor", "getRouteClosureColor", "getInactiveRouteLegRestrictedRoadColor", "getInactiveRouteLegClosureColor", "getAlternativeRouteRestrictedRoadColor", "getAlternativeRouteClosureColor", "getRouteLineTraveledColor", "getRouteLineTraveledCasingColor", "getRouteCasingColor", "getAlternativeRouteCasingColor", "getInactiveRouteLegCasingColor", "getInActiveRouteLegsColor", "getBlurColor", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RouteLineColorResources {
    private final int alternativeRouteCasingColor;
    private final int alternativeRouteClosureColor;
    private final int alternativeRouteDefaultColor;
    private final int alternativeRouteHeavyCongestionColor;
    private final int alternativeRouteLowCongestionColor;
    private final int alternativeRouteModerateCongestionColor;
    private final int alternativeRouteRestrictedRoadColor;
    private final int alternativeRouteSevereCongestionColor;
    private final int alternativeRouteUnknownCongestionColor;
    private final int blurColor;
    private final int inActiveRouteLegsColor;
    private final int inactiveRouteLegCasingColor;
    private final int inactiveRouteLegClosureColor;
    private final int inactiveRouteLegHeavyCongestionColor;
    private final int inactiveRouteLegLowCongestionColor;
    private final int inactiveRouteLegModerateCongestionColor;
    private final int inactiveRouteLegRestrictedRoadColor;
    private final int inactiveRouteLegSevereCongestionColor;
    private final int inactiveRouteLegUnknownCongestionColor;
    private final int restrictedRoadColor;
    private final int routeCasingColor;
    private final int routeClosureColor;
    private final int routeDefaultColor;
    private final int routeHeavyCongestionColor;
    private final int routeLineTraveledCasingColor;
    private final int routeLineTraveledColor;
    private final int routeLowCongestionColor;
    private final int routeModerateCongestionColor;
    private final int routeSevereCongestionColor;
    private final int routeUnknownCongestionColor;

    public /* synthetic */ RouteLineColorResources(int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, DefaultConstructorMarker defaultConstructorMarker) {
        this(i3, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RouteLineColorResources.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.RouteLineColorResources");
        RouteLineColorResources routeLineColorResources = (RouteLineColorResources) other;
        return this.routeDefaultColor == routeLineColorResources.routeDefaultColor && this.routeLowCongestionColor == routeLineColorResources.routeLowCongestionColor && this.routeModerateCongestionColor == routeLineColorResources.routeModerateCongestionColor && this.routeHeavyCongestionColor == routeLineColorResources.routeHeavyCongestionColor && this.routeSevereCongestionColor == routeLineColorResources.routeSevereCongestionColor && this.routeUnknownCongestionColor == routeLineColorResources.routeUnknownCongestionColor && this.routeClosureColor == routeLineColorResources.routeClosureColor && this.inactiveRouteLegLowCongestionColor == routeLineColorResources.inactiveRouteLegLowCongestionColor && this.inactiveRouteLegModerateCongestionColor == routeLineColorResources.inactiveRouteLegModerateCongestionColor && this.inactiveRouteLegHeavyCongestionColor == routeLineColorResources.inactiveRouteLegHeavyCongestionColor && this.inactiveRouteLegSevereCongestionColor == routeLineColorResources.inactiveRouteLegSevereCongestionColor && this.inactiveRouteLegUnknownCongestionColor == routeLineColorResources.inactiveRouteLegUnknownCongestionColor && this.inactiveRouteLegClosureColor == routeLineColorResources.inactiveRouteLegClosureColor && this.restrictedRoadColor == routeLineColorResources.restrictedRoadColor && this.inactiveRouteLegRestrictedRoadColor == routeLineColorResources.inactiveRouteLegRestrictedRoadColor && this.alternativeRouteDefaultColor == routeLineColorResources.alternativeRouteDefaultColor && this.alternativeRouteLowCongestionColor == routeLineColorResources.alternativeRouteLowCongestionColor && this.alternativeRouteModerateCongestionColor == routeLineColorResources.alternativeRouteModerateCongestionColor && this.alternativeRouteHeavyCongestionColor == routeLineColorResources.alternativeRouteHeavyCongestionColor && this.alternativeRouteSevereCongestionColor == routeLineColorResources.alternativeRouteSevereCongestionColor && this.alternativeRouteUnknownCongestionColor == routeLineColorResources.alternativeRouteUnknownCongestionColor && this.alternativeRouteRestrictedRoadColor == routeLineColorResources.alternativeRouteRestrictedRoadColor && this.alternativeRouteClosureColor == routeLineColorResources.alternativeRouteClosureColor && this.routeLineTraveledColor == routeLineColorResources.routeLineTraveledColor && this.routeLineTraveledCasingColor == routeLineColorResources.routeLineTraveledCasingColor && this.routeCasingColor == routeLineColorResources.routeCasingColor && this.inActiveRouteLegsColor == routeLineColorResources.inActiveRouteLegsColor && this.alternativeRouteCasingColor == routeLineColorResources.alternativeRouteCasingColor && this.inactiveRouteLegCasingColor == routeLineColorResources.inactiveRouteLegCasingColor && this.blurColor == routeLineColorResources.blurColor;
    }

    public final int getAlternativeRouteCasingColor() {
        return this.alternativeRouteCasingColor;
    }

    public final int getAlternativeRouteClosureColor() {
        return this.alternativeRouteClosureColor;
    }

    public final int getAlternativeRouteDefaultColor() {
        return this.alternativeRouteDefaultColor;
    }

    public final int getAlternativeRouteHeavyCongestionColor() {
        return this.alternativeRouteHeavyCongestionColor;
    }

    public final int getAlternativeRouteLowCongestionColor() {
        return this.alternativeRouteLowCongestionColor;
    }

    public final int getAlternativeRouteModerateCongestionColor() {
        return this.alternativeRouteModerateCongestionColor;
    }

    public final int getAlternativeRouteRestrictedRoadColor() {
        return this.alternativeRouteRestrictedRoadColor;
    }

    public final int getAlternativeRouteSevereCongestionColor() {
        return this.alternativeRouteSevereCongestionColor;
    }

    public final int getAlternativeRouteUnknownCongestionColor() {
        return this.alternativeRouteUnknownCongestionColor;
    }

    public final int getBlurColor() {
        return this.blurColor;
    }

    public final int getInActiveRouteLegsColor() {
        return this.inActiveRouteLegsColor;
    }

    public final int getInactiveRouteLegCasingColor() {
        return this.inactiveRouteLegCasingColor;
    }

    public final int getInactiveRouteLegClosureColor() {
        return this.inactiveRouteLegClosureColor;
    }

    public final int getInactiveRouteLegHeavyCongestionColor() {
        return this.inactiveRouteLegHeavyCongestionColor;
    }

    public final int getInactiveRouteLegLowCongestionColor() {
        return this.inactiveRouteLegLowCongestionColor;
    }

    public final int getInactiveRouteLegModerateCongestionColor() {
        return this.inactiveRouteLegModerateCongestionColor;
    }

    public final int getInactiveRouteLegRestrictedRoadColor() {
        return this.inactiveRouteLegRestrictedRoadColor;
    }

    public final int getInactiveRouteLegSevereCongestionColor() {
        return this.inactiveRouteLegSevereCongestionColor;
    }

    public final int getInactiveRouteLegUnknownCongestionColor() {
        return this.inactiveRouteLegUnknownCongestionColor;
    }

    public final int getRestrictedRoadColor() {
        return this.restrictedRoadColor;
    }

    public final int getRouteCasingColor() {
        return this.routeCasingColor;
    }

    public final int getRouteClosureColor() {
        return this.routeClosureColor;
    }

    public final int getRouteDefaultColor() {
        return this.routeDefaultColor;
    }

    public final int getRouteHeavyCongestionColor() {
        return this.routeHeavyCongestionColor;
    }

    public final int getRouteLineTraveledCasingColor() {
        return this.routeLineTraveledCasingColor;
    }

    public final int getRouteLineTraveledColor() {
        return this.routeLineTraveledColor;
    }

    public final int getRouteLowCongestionColor() {
        return this.routeLowCongestionColor;
    }

    public final int getRouteModerateCongestionColor() {
        return this.routeModerateCongestionColor;
    }

    public final int getRouteSevereCongestionColor() {
        return this.routeSevereCongestionColor;
    }

    public final int getRouteUnknownCongestionColor() {
        return this.routeUnknownCongestionColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.routeDefaultColor * 31) + this.routeLowCongestionColor) * 31) + this.routeModerateCongestionColor) * 31) + this.routeHeavyCongestionColor) * 31) + this.routeSevereCongestionColor) * 31) + this.routeUnknownCongestionColor) * 31) + this.routeClosureColor) * 31) + this.inactiveRouteLegLowCongestionColor) * 31) + this.inactiveRouteLegModerateCongestionColor) * 31) + this.inactiveRouteLegHeavyCongestionColor) * 31) + this.inactiveRouteLegSevereCongestionColor) * 31) + this.inactiveRouteLegUnknownCongestionColor) * 31) + this.inactiveRouteLegClosureColor) * 31) + this.restrictedRoadColor) * 31) + this.inactiveRouteLegRestrictedRoadColor) * 31) + this.alternativeRouteDefaultColor) * 31) + this.alternativeRouteLowCongestionColor) * 31) + this.alternativeRouteModerateCongestionColor) * 31) + this.alternativeRouteHeavyCongestionColor) * 31) + this.alternativeRouteSevereCongestionColor) * 31) + this.alternativeRouteUnknownCongestionColor) * 31) + this.alternativeRouteRestrictedRoadColor) * 31) + this.alternativeRouteClosureColor) * 31) + this.routeLineTraveledColor) * 31) + this.routeLineTraveledCasingColor) * 31) + this.routeCasingColor) * 31) + this.alternativeRouteCasingColor) * 31) + this.inactiveRouteLegCasingColor) * 31) + this.inActiveRouteLegsColor) * 31) + this.blurColor;
    }

    public final i toBuilder() {
        i iVar = new i();
        List list = AbstractC1740a.f21222a;
        return iVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14829));
        sb2.append(this.routeDefaultColor);
        sb2.append(StubApp.getString2(14830));
        sb2.append(this.routeLowCongestionColor);
        sb2.append(StubApp.getString2(14831));
        sb2.append(this.routeModerateCongestionColor);
        sb2.append(StubApp.getString2(14832));
        sb2.append(this.routeHeavyCongestionColor);
        sb2.append(StubApp.getString2(14833));
        sb2.append(this.routeSevereCongestionColor);
        sb2.append(StubApp.getString2(14834));
        sb2.append(this.routeUnknownCongestionColor);
        sb2.append(StubApp.getString2(14835));
        sb2.append(this.inactiveRouteLegLowCongestionColor);
        sb2.append(StubApp.getString2(14836));
        sb2.append(this.inactiveRouteLegModerateCongestionColor);
        sb2.append(StubApp.getString2(14837));
        sb2.append(this.inactiveRouteLegHeavyCongestionColor);
        sb2.append(StubApp.getString2(14838));
        sb2.append(this.inactiveRouteLegSevereCongestionColor);
        sb2.append(StubApp.getString2(14839));
        sb2.append(this.inactiveRouteLegUnknownCongestionColor);
        sb2.append(StubApp.getString2(14840));
        sb2.append(this.routeClosureColor);
        sb2.append(StubApp.getString2(14841));
        sb2.append(this.inactiveRouteLegClosureColor);
        sb2.append(StubApp.getString2(14842));
        sb2.append(this.restrictedRoadColor);
        sb2.append(StubApp.getString2(14843));
        sb2.append(this.inactiveRouteLegRestrictedRoadColor);
        sb2.append(StubApp.getString2(14844));
        sb2.append(this.alternativeRouteDefaultColor);
        sb2.append(StubApp.getString2(14845));
        sb2.append(this.alternativeRouteLowCongestionColor);
        sb2.append(StubApp.getString2(14846));
        sb2.append(this.alternativeRouteModerateCongestionColor);
        sb2.append(StubApp.getString2(14847));
        sb2.append(this.alternativeRouteHeavyCongestionColor);
        sb2.append(StubApp.getString2(14848));
        sb2.append(this.alternativeRouteSevereCongestionColor);
        sb2.append(StubApp.getString2(14849));
        sb2.append(this.alternativeRouteUnknownCongestionColor);
        sb2.append(StubApp.getString2(14850));
        sb2.append(this.alternativeRouteRestrictedRoadColor);
        sb2.append(StubApp.getString2(14851));
        sb2.append(this.alternativeRouteClosureColor);
        sb2.append(StubApp.getString2(14852));
        sb2.append(this.routeLineTraveledColor);
        sb2.append(StubApp.getString2(14853));
        sb2.append(this.routeLineTraveledCasingColor);
        sb2.append(StubApp.getString2(14854));
        sb2.append(this.routeCasingColor);
        sb2.append(StubApp.getString2(14855));
        sb2.append(this.alternativeRouteCasingColor);
        sb2.append(StubApp.getString2(14856));
        sb2.append(this.inactiveRouteLegCasingColor);
        sb2.append(StubApp.getString2(14857));
        sb2.append(this.inActiveRouteLegsColor);
        sb2.append(StubApp.getString2(14858));
        return b.j(sb2, this.blurColor, ')');
    }

    private RouteLineColorResources(int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38) {
        this.routeDefaultColor = i3;
        this.routeLowCongestionColor = i10;
        this.routeModerateCongestionColor = i11;
        this.routeHeavyCongestionColor = i12;
        this.routeSevereCongestionColor = i13;
        this.routeUnknownCongestionColor = i14;
        this.inactiveRouteLegLowCongestionColor = i15;
        this.inactiveRouteLegModerateCongestionColor = i16;
        this.inactiveRouteLegHeavyCongestionColor = i17;
        this.inactiveRouteLegSevereCongestionColor = i18;
        this.inactiveRouteLegUnknownCongestionColor = i19;
        this.alternativeRouteDefaultColor = i20;
        this.alternativeRouteLowCongestionColor = i21;
        this.alternativeRouteModerateCongestionColor = i22;
        this.alternativeRouteHeavyCongestionColor = i23;
        this.alternativeRouteSevereCongestionColor = i24;
        this.alternativeRouteUnknownCongestionColor = i25;
        this.restrictedRoadColor = i26;
        this.routeClosureColor = i27;
        this.inactiveRouteLegRestrictedRoadColor = i28;
        this.inactiveRouteLegClosureColor = i29;
        this.alternativeRouteRestrictedRoadColor = i30;
        this.alternativeRouteClosureColor = i31;
        this.routeLineTraveledColor = i32;
        this.routeLineTraveledCasingColor = i33;
        this.routeCasingColor = i34;
        this.alternativeRouteCasingColor = i35;
        this.inactiveRouteLegCasingColor = i36;
        this.inActiveRouteLegsColor = i37;
        this.blurColor = i38;
    }
}
