package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y9.s;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BV\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000fJr\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u000fR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b.\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b/\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;", "", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;", "baseExpressionData", "casingExpressionData", "trafficExpressionData", "restrictedSectionExpressionData", "Ly9/s;", "trimOffset", "trailExpressionData", "trailCasingExpressionData", "blurExpressionCommandData", "<init>", "(Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Ly9/s;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;", "component2", "component3", "component4", "component5-MWEJ4U4", "()Ly9/s;", "component5", "component6", "component7", "component8", "copy-kGdvXWo", "(Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Ly9/s;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;)Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineDynamicEventData;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineExpressionEventData;", "getBaseExpressionData", "getCasingExpressionData", "getTrafficExpressionData", "getRestrictedSectionExpressionData", "Ly9/s;", "getTrimOffset-MWEJ4U4", "getTrailExpressionData", "getTrailCasingExpressionData", "getBlurExpressionCommandData", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class RouteLineDynamicEventData {
    private final RouteLineExpressionEventData baseExpressionData;
    private final RouteLineExpressionEventData blurExpressionCommandData;
    private final RouteLineExpressionEventData casingExpressionData;
    private final RouteLineExpressionEventData restrictedSectionExpressionData;
    private final RouteLineExpressionEventData trafficExpressionData;
    private final RouteLineExpressionEventData trailCasingExpressionData;
    private final RouteLineExpressionEventData trailExpressionData;
    private final s trimOffset;

    public /* synthetic */ RouteLineDynamicEventData(RouteLineExpressionEventData routeLineExpressionEventData, RouteLineExpressionEventData routeLineExpressionEventData2, RouteLineExpressionEventData routeLineExpressionEventData3, RouteLineExpressionEventData routeLineExpressionEventData4, s sVar, RouteLineExpressionEventData routeLineExpressionEventData5, RouteLineExpressionEventData routeLineExpressionEventData6, RouteLineExpressionEventData routeLineExpressionEventData7, DefaultConstructorMarker defaultConstructorMarker) {
        this(routeLineExpressionEventData, routeLineExpressionEventData2, routeLineExpressionEventData3, routeLineExpressionEventData4, sVar, routeLineExpressionEventData5, routeLineExpressionEventData6, routeLineExpressionEventData7);
    }

    /* renamed from: copy-kGdvXWo$default, reason: not valid java name */
    public static /* synthetic */ RouteLineDynamicEventData m32copykGdvXWo$default(RouteLineDynamicEventData routeLineDynamicEventData, RouteLineExpressionEventData routeLineExpressionEventData, RouteLineExpressionEventData routeLineExpressionEventData2, RouteLineExpressionEventData routeLineExpressionEventData3, RouteLineExpressionEventData routeLineExpressionEventData4, s sVar, RouteLineExpressionEventData routeLineExpressionEventData5, RouteLineExpressionEventData routeLineExpressionEventData6, RouteLineExpressionEventData routeLineExpressionEventData7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            routeLineExpressionEventData = routeLineDynamicEventData.baseExpressionData;
        }
        if ((i3 & 2) != 0) {
            routeLineExpressionEventData2 = routeLineDynamicEventData.casingExpressionData;
        }
        if ((i3 & 4) != 0) {
            routeLineExpressionEventData3 = routeLineDynamicEventData.trafficExpressionData;
        }
        if ((i3 & 8) != 0) {
            routeLineExpressionEventData4 = routeLineDynamicEventData.restrictedSectionExpressionData;
        }
        if ((i3 & 16) != 0) {
            sVar = routeLineDynamicEventData.trimOffset;
        }
        if ((i3 & 32) != 0) {
            routeLineExpressionEventData5 = routeLineDynamicEventData.trailExpressionData;
        }
        if ((i3 & 64) != 0) {
            routeLineExpressionEventData6 = routeLineDynamicEventData.trailCasingExpressionData;
        }
        if ((i3 & 128) != 0) {
            routeLineExpressionEventData7 = routeLineDynamicEventData.blurExpressionCommandData;
        }
        RouteLineExpressionEventData routeLineExpressionEventData8 = routeLineExpressionEventData6;
        RouteLineExpressionEventData routeLineExpressionEventData9 = routeLineExpressionEventData7;
        s sVar2 = sVar;
        RouteLineExpressionEventData routeLineExpressionEventData10 = routeLineExpressionEventData5;
        return routeLineDynamicEventData.m34copykGdvXWo(routeLineExpressionEventData, routeLineExpressionEventData2, routeLineExpressionEventData3, routeLineExpressionEventData4, sVar2, routeLineExpressionEventData10, routeLineExpressionEventData8, routeLineExpressionEventData9);
    }

    /* renamed from: component1, reason: from getter */
    public final RouteLineExpressionEventData getBaseExpressionData() {
        return this.baseExpressionData;
    }

    /* renamed from: component2, reason: from getter */
    public final RouteLineExpressionEventData getCasingExpressionData() {
        return this.casingExpressionData;
    }

    /* renamed from: component3, reason: from getter */
    public final RouteLineExpressionEventData getTrafficExpressionData() {
        return this.trafficExpressionData;
    }

    /* renamed from: component4, reason: from getter */
    public final RouteLineExpressionEventData getRestrictedSectionExpressionData() {
        return this.restrictedSectionExpressionData;
    }

    /* renamed from: component5-MWEJ4U4, reason: not valid java name and from getter */
    public final s getTrimOffset() {
        return this.trimOffset;
    }

    /* renamed from: component6, reason: from getter */
    public final RouteLineExpressionEventData getTrailExpressionData() {
        return this.trailExpressionData;
    }

    /* renamed from: component7, reason: from getter */
    public final RouteLineExpressionEventData getTrailCasingExpressionData() {
        return this.trailCasingExpressionData;
    }

    /* renamed from: component8, reason: from getter */
    public final RouteLineExpressionEventData getBlurExpressionCommandData() {
        return this.blurExpressionCommandData;
    }

    /* renamed from: copy-kGdvXWo, reason: not valid java name */
    public final RouteLineDynamicEventData m34copykGdvXWo(RouteLineExpressionEventData baseExpressionData, RouteLineExpressionEventData casingExpressionData, RouteLineExpressionEventData trafficExpressionData, RouteLineExpressionEventData restrictedSectionExpressionData, s trimOffset, RouteLineExpressionEventData trailExpressionData, RouteLineExpressionEventData trailCasingExpressionData, RouteLineExpressionEventData blurExpressionCommandData) {
        Intrinsics.checkNotNullParameter(baseExpressionData, "baseExpressionData");
        Intrinsics.checkNotNullParameter(casingExpressionData, "casingExpressionData");
        return new RouteLineDynamicEventData(baseExpressionData, casingExpressionData, trafficExpressionData, restrictedSectionExpressionData, trimOffset, trailExpressionData, trailCasingExpressionData, blurExpressionCommandData, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteLineDynamicEventData)) {
            return false;
        }
        RouteLineDynamicEventData routeLineDynamicEventData = (RouteLineDynamicEventData) other;
        return Intrinsics.areEqual(this.baseExpressionData, routeLineDynamicEventData.baseExpressionData) && Intrinsics.areEqual(this.casingExpressionData, routeLineDynamicEventData.casingExpressionData) && Intrinsics.areEqual(this.trafficExpressionData, routeLineDynamicEventData.trafficExpressionData) && Intrinsics.areEqual(this.restrictedSectionExpressionData, routeLineDynamicEventData.restrictedSectionExpressionData) && Intrinsics.areEqual(this.trimOffset, routeLineDynamicEventData.trimOffset) && Intrinsics.areEqual(this.trailExpressionData, routeLineDynamicEventData.trailExpressionData) && Intrinsics.areEqual(this.trailCasingExpressionData, routeLineDynamicEventData.trailCasingExpressionData) && Intrinsics.areEqual(this.blurExpressionCommandData, routeLineDynamicEventData.blurExpressionCommandData);
    }

    public final RouteLineExpressionEventData getBaseExpressionData() {
        return this.baseExpressionData;
    }

    public final RouteLineExpressionEventData getBlurExpressionCommandData() {
        return this.blurExpressionCommandData;
    }

    public final RouteLineExpressionEventData getCasingExpressionData() {
        return this.casingExpressionData;
    }

    public final RouteLineExpressionEventData getRestrictedSectionExpressionData() {
        return this.restrictedSectionExpressionData;
    }

    public final RouteLineExpressionEventData getTrafficExpressionData() {
        return this.trafficExpressionData;
    }

    public final RouteLineExpressionEventData getTrailCasingExpressionData() {
        return this.trailCasingExpressionData;
    }

    public final RouteLineExpressionEventData getTrailExpressionData() {
        return this.trailExpressionData;
    }

    /* renamed from: getTrimOffset-MWEJ4U4, reason: not valid java name */
    public final s m35getTrimOffsetMWEJ4U4() {
        return this.trimOffset;
    }

    public int hashCode() {
        int hashCode = (this.casingExpressionData.hashCode() + (this.baseExpressionData.hashCode() * 31)) * 31;
        RouteLineExpressionEventData routeLineExpressionEventData = this.trafficExpressionData;
        int hashCode2 = (hashCode + (routeLineExpressionEventData == null ? 0 : routeLineExpressionEventData.hashCode())) * 31;
        RouteLineExpressionEventData routeLineExpressionEventData2 = this.restrictedSectionExpressionData;
        int hashCode3 = (hashCode2 + (routeLineExpressionEventData2 == null ? 0 : routeLineExpressionEventData2.hashCode())) * 31;
        s sVar = this.trimOffset;
        int hashCode4 = (hashCode3 + (sVar == null ? 0 : Double.hashCode(sVar.f23601a))) * 31;
        RouteLineExpressionEventData routeLineExpressionEventData3 = this.trailExpressionData;
        int hashCode5 = (hashCode4 + (routeLineExpressionEventData3 == null ? 0 : routeLineExpressionEventData3.hashCode())) * 31;
        RouteLineExpressionEventData routeLineExpressionEventData4 = this.trailCasingExpressionData;
        int hashCode6 = (hashCode5 + (routeLineExpressionEventData4 == null ? 0 : routeLineExpressionEventData4.hashCode())) * 31;
        RouteLineExpressionEventData routeLineExpressionEventData5 = this.blurExpressionCommandData;
        return hashCode6 + (routeLineExpressionEventData5 != null ? routeLineExpressionEventData5.hashCode() : 0);
    }

    public String toString() {
        return StubApp.getString2(14747) + this.baseExpressionData + StubApp.getString2(14748) + this.casingExpressionData + StubApp.getString2(14749) + this.trafficExpressionData + StubApp.getString2(14750) + this.restrictedSectionExpressionData + StubApp.getString2(14751) + this.trimOffset + StubApp.getString2(14752) + this.trailExpressionData + StubApp.getString2(14753) + this.trailCasingExpressionData + StubApp.getString2(14754) + this.blurExpressionCommandData + ')';
    }

    private RouteLineDynamicEventData(RouteLineExpressionEventData routeLineExpressionEventData, RouteLineExpressionEventData routeLineExpressionEventData2, RouteLineExpressionEventData routeLineExpressionEventData3, RouteLineExpressionEventData routeLineExpressionEventData4, s sVar, RouteLineExpressionEventData routeLineExpressionEventData5, RouteLineExpressionEventData routeLineExpressionEventData6, RouteLineExpressionEventData routeLineExpressionEventData7) {
        this.baseExpressionData = routeLineExpressionEventData;
        this.casingExpressionData = routeLineExpressionEventData2;
        this.trafficExpressionData = routeLineExpressionEventData3;
        this.restrictedSectionExpressionData = routeLineExpressionEventData4;
        this.trimOffset = sVar;
        this.trailExpressionData = routeLineExpressionEventData5;
        this.trailCasingExpressionData = routeLineExpressionEventData6;
        this.blurExpressionCommandData = routeLineExpressionEventData7;
    }
}
