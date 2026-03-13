package com.mapbox.navigation.ui.maps.internal.route.line;

import S6.a;
import S6.b;
import androidx.annotation.Keep;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineColorResources;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineScaleExpressions;
import com.stub.StubApp;
import i2.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.signers.ISOTrailers;
import z9.AbstractC2017a;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bQ\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b0\u0010,J\u0010\u00101\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b3\u00102J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b4\u0010*J\u0010\u00105\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b9\u0010/J\u0012\u0010:\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b<\u0010,J\u0010\u0010=\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b=\u0010/J\u0010\u0010>\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b>\u0010,J\u0010\u0010?\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b?\u0010;J\u0012\u0010@\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bB\u0010,J\u0010\u0010C\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bC\u0010/J\u0010\u0010D\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bD\u0010/J\u0010\u0010E\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bE\u0010,J\u0086\u0002\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\bH\u0010;J\u0010\u0010I\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\bI\u00102J\u001a\u0010K\u001a\u00020\u000b2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010O\u001a\u0004\bP\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bR\u0010*R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010S\u001a\u0004\bT\u0010,R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010S\u001a\u0004\bU\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010V\u001a\u0004\bW\u0010/R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010S\u001a\u0004\bX\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Y\u001a\u0004\bZ\u00102R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\b[\u00102R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\b\\\u0010*R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010]\u001a\u0004\b^\u00106R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u00108R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\ba\u0010/R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010b\u001a\u0004\bc\u0010;R\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010S\u001a\u0004\bd\u0010,R\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010V\u001a\u0004\be\u0010/R\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010S\u001a\u0004\bf\u0010,R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010b\u001a\u0004\bg\u0010;R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010h\u001a\u0004\bi\u0010AR\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010S\u001a\u0004\bj\u0010,R\u0017\u0010 \u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010V\u001a\u0004\bk\u0010/R\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010V\u001a\u0004\bl\u0010/R\u0017\u0010\"\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010S\u001a\u0004\bm\u0010,¨\u0006n"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewOptionsData;", "", "Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineColorResources;", "routeLineColorResources", "Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineScaleExpressions;", "scaleExpressions", "", "", "restrictedRoadDashArray", "restrictedRoadOpacity", "restrictedRoadLineWidth", "", "displaySoftGradientForTraffic", "softGradientTransition", "", "originIconId", "destinationIconId", "waypointLayerIconOffset", "LS6/a;", "waypointLayerIconAnchor", "LS6/b;", "iconPitchAlignment", "displayRestrictedRoadSections", "", "routeLineBelowLayerId", "tolerance", "shareLineGeometrySources", "lineDepthOcclusionFactor", "slotName", "Lz9/a;", "fadeOnHighZoomsConfig", "routeLineBlurWidth", "routeLineBlurEnabled", "applyTrafficColorsToRouteLineBlur", "routeLineBlurOpacity", "<init>", "(Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineColorResources;Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineScaleExpressions;Ljava/util/List;DDZDIILjava/util/List;LS6/a;LS6/b;ZLjava/lang/String;DZDLjava/lang/String;Lz9/a;DZZD)V", "component1", "()Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineColorResources;", "component2", "()Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineScaleExpressions;", "component3", "()Ljava/util/List;", "component4", "()D", "component5", "component6", "()Z", "component7", "component8", "()I", "component9", "component10", "component11", "()LS6/a;", "component12", "()LS6/b;", "component13", "component14", "()Ljava/lang/String;", "component15", "component16", "component17", "component18", "component19", "()Lz9/a;", "component20", "component21", "component22", "component23", "copy", "(Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineColorResources;Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineScaleExpressions;Ljava/util/List;DDZDIILjava/util/List;LS6/a;LS6/b;ZLjava/lang/String;DZDLjava/lang/String;Lz9/a;DZZD)Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineViewOptionsData;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineColorResources;", "getRouteLineColorResources", "Lcom/mapbox/navigation/ui/maps/route/line/model/RouteLineScaleExpressions;", "getScaleExpressions", "Ljava/util/List;", "getRestrictedRoadDashArray", "D", "getRestrictedRoadOpacity", "getRestrictedRoadLineWidth", "Z", "getDisplaySoftGradientForTraffic", "getSoftGradientTransition", "I", "getOriginIconId", "getDestinationIconId", "getWaypointLayerIconOffset", "LS6/a;", "getWaypointLayerIconAnchor", "LS6/b;", "getIconPitchAlignment", "getDisplayRestrictedRoadSections", "Ljava/lang/String;", "getRouteLineBelowLayerId", "getTolerance", "getShareLineGeometrySources", "getLineDepthOcclusionFactor", "getSlotName", "Lz9/a;", "getFadeOnHighZoomsConfig", "getRouteLineBlurWidth", "getRouteLineBlurEnabled", "getApplyTrafficColorsToRouteLineBlur", "getRouteLineBlurOpacity", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class RouteLineViewOptionsData {
    private final boolean applyTrafficColorsToRouteLineBlur;
    private final int destinationIconId;
    private final boolean displayRestrictedRoadSections;
    private final boolean displaySoftGradientForTraffic;
    private final AbstractC2017a fadeOnHighZoomsConfig;
    private final b iconPitchAlignment;
    private final double lineDepthOcclusionFactor;
    private final int originIconId;
    private final List<Double> restrictedRoadDashArray;
    private final double restrictedRoadLineWidth;
    private final double restrictedRoadOpacity;
    private final String routeLineBelowLayerId;
    private final boolean routeLineBlurEnabled;
    private final double routeLineBlurOpacity;
    private final double routeLineBlurWidth;
    private final RouteLineColorResources routeLineColorResources;
    private final RouteLineScaleExpressions scaleExpressions;
    private final boolean shareLineGeometrySources;
    private final String slotName;
    private final double softGradientTransition;
    private final double tolerance;
    private final a waypointLayerIconAnchor;
    private final List<Double> waypointLayerIconOffset;

    public RouteLineViewOptionsData(RouteLineColorResources routeLineColorResources, RouteLineScaleExpressions scaleExpressions, List<Double> restrictedRoadDashArray, double d8, double d10, boolean z2, double d11, int i3, int i10, List<Double> waypointLayerIconOffset, a waypointLayerIconAnchor, b iconPitchAlignment, boolean z10, String str, double d12, boolean z11, double d13, String slotName, AbstractC2017a abstractC2017a, double d14, boolean z12, boolean z13, double d15) {
        Intrinsics.checkNotNullParameter(routeLineColorResources, "routeLineColorResources");
        Intrinsics.checkNotNullParameter(scaleExpressions, "scaleExpressions");
        Intrinsics.checkNotNullParameter(restrictedRoadDashArray, "restrictedRoadDashArray");
        Intrinsics.checkNotNullParameter(waypointLayerIconOffset, "waypointLayerIconOffset");
        Intrinsics.checkNotNullParameter(waypointLayerIconAnchor, "waypointLayerIconAnchor");
        Intrinsics.checkNotNullParameter(iconPitchAlignment, "iconPitchAlignment");
        Intrinsics.checkNotNullParameter(slotName, "slotName");
        this.routeLineColorResources = routeLineColorResources;
        this.scaleExpressions = scaleExpressions;
        this.restrictedRoadDashArray = restrictedRoadDashArray;
        this.restrictedRoadOpacity = d8;
        this.restrictedRoadLineWidth = d10;
        this.displaySoftGradientForTraffic = z2;
        this.softGradientTransition = d11;
        this.originIconId = i3;
        this.destinationIconId = i10;
        this.waypointLayerIconOffset = waypointLayerIconOffset;
        this.waypointLayerIconAnchor = waypointLayerIconAnchor;
        this.iconPitchAlignment = iconPitchAlignment;
        this.displayRestrictedRoadSections = z10;
        this.routeLineBelowLayerId = str;
        this.tolerance = d12;
        this.shareLineGeometrySources = z11;
        this.lineDepthOcclusionFactor = d13;
        this.slotName = slotName;
        this.routeLineBlurWidth = d14;
        this.routeLineBlurEnabled = z12;
        this.applyTrafficColorsToRouteLineBlur = z13;
        this.routeLineBlurOpacity = d15;
    }

    public static /* synthetic */ RouteLineViewOptionsData copy$default(RouteLineViewOptionsData routeLineViewOptionsData, RouteLineColorResources routeLineColorResources, RouteLineScaleExpressions routeLineScaleExpressions, List list, double d8, double d10, boolean z2, double d11, int i3, int i10, List list2, a aVar, b bVar, boolean z10, String str, double d12, boolean z11, double d13, String str2, AbstractC2017a abstractC2017a, double d14, boolean z12, boolean z13, double d15, int i11, Object obj) {
        AbstractC2017a abstractC2017a2;
        double d16;
        boolean z14;
        boolean z15;
        RouteLineColorResources routeLineColorResources2 = (i11 & 1) != 0 ? routeLineViewOptionsData.routeLineColorResources : routeLineColorResources;
        RouteLineScaleExpressions routeLineScaleExpressions2 = (i11 & 2) != 0 ? routeLineViewOptionsData.scaleExpressions : routeLineScaleExpressions;
        List list3 = (i11 & 4) != 0 ? routeLineViewOptionsData.restrictedRoadDashArray : list;
        double d17 = (i11 & 8) != 0 ? routeLineViewOptionsData.restrictedRoadOpacity : d8;
        double d18 = (i11 & 16) != 0 ? routeLineViewOptionsData.restrictedRoadLineWidth : d10;
        boolean z16 = (i11 & 32) != 0 ? routeLineViewOptionsData.displaySoftGradientForTraffic : z2;
        double d19 = (i11 & 64) != 0 ? routeLineViewOptionsData.softGradientTransition : d11;
        int i12 = (i11 & 128) != 0 ? routeLineViewOptionsData.originIconId : i3;
        int i13 = (i11 & 256) != 0 ? routeLineViewOptionsData.destinationIconId : i10;
        List list4 = (i11 & 512) != 0 ? routeLineViewOptionsData.waypointLayerIconOffset : list2;
        a aVar2 = (i11 & 1024) != 0 ? routeLineViewOptionsData.waypointLayerIconAnchor : aVar;
        RouteLineColorResources routeLineColorResources3 = routeLineColorResources2;
        b bVar2 = (i11 & 2048) != 0 ? routeLineViewOptionsData.iconPitchAlignment : bVar;
        boolean z17 = (i11 & 4096) != 0 ? routeLineViewOptionsData.displayRestrictedRoadSections : z10;
        String str3 = (i11 & 8192) != 0 ? routeLineViewOptionsData.routeLineBelowLayerId : str;
        double d20 = (i11 & 16384) != 0 ? routeLineViewOptionsData.tolerance : d12;
        boolean z18 = (i11 & 32768) != 0 ? routeLineViewOptionsData.shareLineGeometrySources : z11;
        double d21 = (i11 & PKIFailureInfo.notAuthorized) != 0 ? routeLineViewOptionsData.lineDepthOcclusionFactor : d13;
        String str4 = (i11 & PKIFailureInfo.unsupportedVersion) != 0 ? routeLineViewOptionsData.slotName : str2;
        if ((i11 & PKIFailureInfo.transactionIdInUse) != 0) {
            routeLineViewOptionsData.getClass();
            abstractC2017a2 = null;
        } else {
            abstractC2017a2 = abstractC2017a;
        }
        String str5 = str4;
        AbstractC2017a abstractC2017a3 = abstractC2017a2;
        double d22 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? routeLineViewOptionsData.routeLineBlurWidth : d14;
        boolean z19 = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? routeLineViewOptionsData.routeLineBlurEnabled : z12;
        boolean z20 = (i11 & PKIFailureInfo.badSenderNonce) != 0 ? routeLineViewOptionsData.applyTrafficColorsToRouteLineBlur : z13;
        if ((i11 & 4194304) != 0) {
            z14 = z19;
            z15 = z20;
            d16 = routeLineViewOptionsData.routeLineBlurOpacity;
        } else {
            d16 = d15;
            z14 = z19;
            z15 = z20;
        }
        return routeLineViewOptionsData.copy(routeLineColorResources3, routeLineScaleExpressions2, list3, d17, d18, z16, d19, i12, i13, list4, aVar2, bVar2, z17, str3, d20, z18, d21, str5, abstractC2017a3, d22, z14, z15, d16);
    }

    /* renamed from: component1, reason: from getter */
    public final RouteLineColorResources getRouteLineColorResources() {
        return this.routeLineColorResources;
    }

    public final List<Double> component10() {
        return this.waypointLayerIconOffset;
    }

    /* renamed from: component11, reason: from getter */
    public final a getWaypointLayerIconAnchor() {
        return this.waypointLayerIconAnchor;
    }

    /* renamed from: component12, reason: from getter */
    public final b getIconPitchAlignment() {
        return this.iconPitchAlignment;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getDisplayRestrictedRoadSections() {
        return this.displayRestrictedRoadSections;
    }

    /* renamed from: component14, reason: from getter */
    public final String getRouteLineBelowLayerId() {
        return this.routeLineBelowLayerId;
    }

    /* renamed from: component15, reason: from getter */
    public final double getTolerance() {
        return this.tolerance;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getShareLineGeometrySources() {
        return this.shareLineGeometrySources;
    }

    /* renamed from: component17, reason: from getter */
    public final double getLineDepthOcclusionFactor() {
        return this.lineDepthOcclusionFactor;
    }

    /* renamed from: component18, reason: from getter */
    public final String getSlotName() {
        return this.slotName;
    }

    public final AbstractC2017a component19() {
        return null;
    }

    /* renamed from: component2, reason: from getter */
    public final RouteLineScaleExpressions getScaleExpressions() {
        return this.scaleExpressions;
    }

    /* renamed from: component20, reason: from getter */
    public final double getRouteLineBlurWidth() {
        return this.routeLineBlurWidth;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getRouteLineBlurEnabled() {
        return this.routeLineBlurEnabled;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getApplyTrafficColorsToRouteLineBlur() {
        return this.applyTrafficColorsToRouteLineBlur;
    }

    /* renamed from: component23, reason: from getter */
    public final double getRouteLineBlurOpacity() {
        return this.routeLineBlurOpacity;
    }

    public final List<Double> component3() {
        return this.restrictedRoadDashArray;
    }

    /* renamed from: component4, reason: from getter */
    public final double getRestrictedRoadOpacity() {
        return this.restrictedRoadOpacity;
    }

    /* renamed from: component5, reason: from getter */
    public final double getRestrictedRoadLineWidth() {
        return this.restrictedRoadLineWidth;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDisplaySoftGradientForTraffic() {
        return this.displaySoftGradientForTraffic;
    }

    /* renamed from: component7, reason: from getter */
    public final double getSoftGradientTransition() {
        return this.softGradientTransition;
    }

    /* renamed from: component8, reason: from getter */
    public final int getOriginIconId() {
        return this.originIconId;
    }

    /* renamed from: component9, reason: from getter */
    public final int getDestinationIconId() {
        return this.destinationIconId;
    }

    public final RouteLineViewOptionsData copy(RouteLineColorResources routeLineColorResources, RouteLineScaleExpressions scaleExpressions, List<Double> restrictedRoadDashArray, double restrictedRoadOpacity, double restrictedRoadLineWidth, boolean displaySoftGradientForTraffic, double softGradientTransition, int originIconId, int destinationIconId, List<Double> waypointLayerIconOffset, a waypointLayerIconAnchor, b iconPitchAlignment, boolean displayRestrictedRoadSections, String routeLineBelowLayerId, double tolerance, boolean shareLineGeometrySources, double lineDepthOcclusionFactor, String slotName, AbstractC2017a fadeOnHighZoomsConfig, double routeLineBlurWidth, boolean routeLineBlurEnabled, boolean applyTrafficColorsToRouteLineBlur, double routeLineBlurOpacity) {
        Intrinsics.checkNotNullParameter(routeLineColorResources, StubApp.getString2(14768));
        Intrinsics.checkNotNullParameter(scaleExpressions, StubApp.getString2(14769));
        Intrinsics.checkNotNullParameter(restrictedRoadDashArray, StubApp.getString2(14770));
        Intrinsics.checkNotNullParameter(waypointLayerIconOffset, StubApp.getString2(14771));
        Intrinsics.checkNotNullParameter(waypointLayerIconAnchor, StubApp.getString2(14772));
        Intrinsics.checkNotNullParameter(iconPitchAlignment, StubApp.getString2(14773));
        Intrinsics.checkNotNullParameter(slotName, StubApp.getString2(14774));
        return new RouteLineViewOptionsData(routeLineColorResources, scaleExpressions, restrictedRoadDashArray, restrictedRoadOpacity, restrictedRoadLineWidth, displaySoftGradientForTraffic, softGradientTransition, originIconId, destinationIconId, waypointLayerIconOffset, waypointLayerIconAnchor, iconPitchAlignment, displayRestrictedRoadSections, routeLineBelowLayerId, tolerance, shareLineGeometrySources, lineDepthOcclusionFactor, slotName, fadeOnHighZoomsConfig, routeLineBlurWidth, routeLineBlurEnabled, applyTrafficColorsToRouteLineBlur, routeLineBlurOpacity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteLineViewOptionsData)) {
            return false;
        }
        RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) other;
        return Intrinsics.areEqual(this.routeLineColorResources, routeLineViewOptionsData.routeLineColorResources) && Intrinsics.areEqual(this.scaleExpressions, routeLineViewOptionsData.scaleExpressions) && Intrinsics.areEqual(this.restrictedRoadDashArray, routeLineViewOptionsData.restrictedRoadDashArray) && Double.compare(this.restrictedRoadOpacity, routeLineViewOptionsData.restrictedRoadOpacity) == 0 && Double.compare(this.restrictedRoadLineWidth, routeLineViewOptionsData.restrictedRoadLineWidth) == 0 && this.displaySoftGradientForTraffic == routeLineViewOptionsData.displaySoftGradientForTraffic && Double.compare(this.softGradientTransition, routeLineViewOptionsData.softGradientTransition) == 0 && this.originIconId == routeLineViewOptionsData.originIconId && this.destinationIconId == routeLineViewOptionsData.destinationIconId && Intrinsics.areEqual(this.waypointLayerIconOffset, routeLineViewOptionsData.waypointLayerIconOffset) && Intrinsics.areEqual(this.waypointLayerIconAnchor, routeLineViewOptionsData.waypointLayerIconAnchor) && Intrinsics.areEqual(this.iconPitchAlignment, routeLineViewOptionsData.iconPitchAlignment) && this.displayRestrictedRoadSections == routeLineViewOptionsData.displayRestrictedRoadSections && Intrinsics.areEqual(this.routeLineBelowLayerId, routeLineViewOptionsData.routeLineBelowLayerId) && Double.compare(this.tolerance, routeLineViewOptionsData.tolerance) == 0 && this.shareLineGeometrySources == routeLineViewOptionsData.shareLineGeometrySources && Double.compare(this.lineDepthOcclusionFactor, routeLineViewOptionsData.lineDepthOcclusionFactor) == 0 && Intrinsics.areEqual(this.slotName, routeLineViewOptionsData.slotName) && Intrinsics.areEqual((Object) null, (Object) null) && Double.compare(this.routeLineBlurWidth, routeLineViewOptionsData.routeLineBlurWidth) == 0 && this.routeLineBlurEnabled == routeLineViewOptionsData.routeLineBlurEnabled && this.applyTrafficColorsToRouteLineBlur == routeLineViewOptionsData.applyTrafficColorsToRouteLineBlur && Double.compare(this.routeLineBlurOpacity, routeLineViewOptionsData.routeLineBlurOpacity) == 0;
    }

    public final boolean getApplyTrafficColorsToRouteLineBlur() {
        return this.applyTrafficColorsToRouteLineBlur;
    }

    public final int getDestinationIconId() {
        return this.destinationIconId;
    }

    public final boolean getDisplayRestrictedRoadSections() {
        return this.displayRestrictedRoadSections;
    }

    public final boolean getDisplaySoftGradientForTraffic() {
        return this.displaySoftGradientForTraffic;
    }

    public final AbstractC2017a getFadeOnHighZoomsConfig() {
        return null;
    }

    public final b getIconPitchAlignment() {
        return this.iconPitchAlignment;
    }

    public final double getLineDepthOcclusionFactor() {
        return this.lineDepthOcclusionFactor;
    }

    public final int getOriginIconId() {
        return this.originIconId;
    }

    public final List<Double> getRestrictedRoadDashArray() {
        return this.restrictedRoadDashArray;
    }

    public final double getRestrictedRoadLineWidth() {
        return this.restrictedRoadLineWidth;
    }

    public final double getRestrictedRoadOpacity() {
        return this.restrictedRoadOpacity;
    }

    public final String getRouteLineBelowLayerId() {
        return this.routeLineBelowLayerId;
    }

    public final boolean getRouteLineBlurEnabled() {
        return this.routeLineBlurEnabled;
    }

    public final double getRouteLineBlurOpacity() {
        return this.routeLineBlurOpacity;
    }

    public final double getRouteLineBlurWidth() {
        return this.routeLineBlurWidth;
    }

    public final RouteLineColorResources getRouteLineColorResources() {
        return this.routeLineColorResources;
    }

    public final RouteLineScaleExpressions getScaleExpressions() {
        return this.scaleExpressions;
    }

    public final boolean getShareLineGeometrySources() {
        return this.shareLineGeometrySources;
    }

    public final String getSlotName() {
        return this.slotName;
    }

    public final double getSoftGradientTransition() {
        return this.softGradientTransition;
    }

    public final double getTolerance() {
        return this.tolerance;
    }

    public final a getWaypointLayerIconAnchor() {
        return this.waypointLayerIconAnchor;
    }

    public final List<Double> getWaypointLayerIconOffset() {
        return this.waypointLayerIconOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int d8 = E1.a.d(this.restrictedRoadLineWidth, E1.a.d(this.restrictedRoadOpacity, E1.a.g((this.scaleExpressions.hashCode() + (this.routeLineColorResources.hashCode() * 31)) * 31, 31, this.restrictedRoadDashArray), 31), 31);
        boolean z2 = this.displaySoftGradientForTraffic;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int g10 = E1.a.g(E1.a.e(this.destinationIconId, E1.a.e(this.originIconId, E1.a.d(this.softGradientTransition, (d8 + i3) * 31, 31), 31), 31), 31, this.waypointLayerIconOffset);
        this.waypointLayerIconAnchor.getClass();
        this.iconPitchAlignment.getClass();
        int i10 = (((g10 - 1364013995) * 31) + 107868) * 31;
        boolean z10 = this.displayRestrictedRoadSections;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        String str = this.routeLineBelowLayerId;
        int d10 = E1.a.d(this.tolerance, (i12 + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z11 = this.shareLineGeometrySources;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int d11 = E1.a.d(this.routeLineBlurWidth, u.d(E1.a.d(this.lineDepthOcclusionFactor, (d10 + i13) * 31, 31), 961, this.slotName), 31);
        boolean z12 = this.routeLineBlurEnabled;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (d11 + i14) * 31;
        boolean z13 = this.applyTrafficColorsToRouteLineBlur;
        return Double.hashCode(this.routeLineBlurOpacity) + ((i15 + (z13 ? 1 : z13 ? 1 : 0)) * 31);
    }

    public String toString() {
        return StubApp.getString2(14775) + this.routeLineColorResources + StubApp.getString2(14776) + this.scaleExpressions + StubApp.getString2(14777) + this.restrictedRoadDashArray + StubApp.getString2(14778) + this.restrictedRoadOpacity + StubApp.getString2(14779) + this.restrictedRoadLineWidth + StubApp.getString2(14780) + this.displaySoftGradientForTraffic + StubApp.getString2(14781) + this.softGradientTransition + StubApp.getString2(14782) + this.originIconId + StubApp.getString2(14783) + this.destinationIconId + StubApp.getString2(14784) + this.waypointLayerIconOffset + StubApp.getString2(14785) + this.waypointLayerIconAnchor + StubApp.getString2(14786) + this.iconPitchAlignment + StubApp.getString2(14787) + this.displayRestrictedRoadSections + StubApp.getString2(14788) + this.routeLineBelowLayerId + StubApp.getString2(14789) + this.tolerance + StubApp.getString2(14790) + this.shareLineGeometrySources + StubApp.getString2(14791) + this.lineDepthOcclusionFactor + StubApp.getString2(14792) + this.slotName + StubApp.getString2(14793) + this.routeLineBlurWidth + StubApp.getString2(14794) + this.routeLineBlurEnabled + StubApp.getString2(14795) + this.applyTrafficColorsToRouteLineBlur + StubApp.getString2(ISOTrailers.TRAILER_SHA512_224) + this.routeLineBlurOpacity + ')';
    }
}
