package y9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineColorResources;
import com.stub.StubApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public static final u f23607A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ u[] f23608B;

    /* renamed from: a, reason: collision with root package name */
    public static final u f23609a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f23610b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f23611c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f23612d;

    /* renamed from: e, reason: collision with root package name */
    public static final u f23613e;

    /* renamed from: f, reason: collision with root package name */
    public static final u f23614f;

    /* renamed from: g, reason: collision with root package name */
    public static final u f23615g;

    /* renamed from: h, reason: collision with root package name */
    public static final u f23616h;
    public static final u j;

    /* renamed from: k, reason: collision with root package name */
    public static final u f23617k;

    /* renamed from: l, reason: collision with root package name */
    public static final u f23618l;

    /* renamed from: m, reason: collision with root package name */
    public static final u f23619m;

    /* renamed from: n, reason: collision with root package name */
    public static final u f23620n;

    /* renamed from: p, reason: collision with root package name */
    public static final u f23621p;

    /* renamed from: q, reason: collision with root package name */
    public static final u f23622q;

    /* renamed from: r, reason: collision with root package name */
    public static final u f23623r;

    /* renamed from: s, reason: collision with root package name */
    public static final u f23624s;

    /* renamed from: t, reason: collision with root package name */
    public static final u f23625t;

    /* renamed from: v, reason: collision with root package name */
    public static final u f23626v;

    /* renamed from: w, reason: collision with root package name */
    public static final u f23627w;

    /* renamed from: x, reason: collision with root package name */
    public static final u f23628x;

    /* renamed from: y, reason: collision with root package name */
    public static final u f23629y;

    /* renamed from: z, reason: collision with root package name */
    public static final u f23630z;

    static {
        u uVar = new u(StubApp.getString2(24714), 0);
        f23609a = uVar;
        u uVar2 = new u(StubApp.getString2(24715), 1);
        f23610b = uVar2;
        u uVar3 = new u(StubApp.getString2(24716), 2);
        f23611c = uVar3;
        u uVar4 = new u(StubApp.getString2(24717), 3);
        f23612d = uVar4;
        u uVar5 = new u(StubApp.getString2(24718), 4);
        f23613e = uVar5;
        u uVar6 = new u(StubApp.getString2(24719), 5);
        f23614f = uVar6;
        u uVar7 = new u(StubApp.getString2(24720), 6);
        u uVar8 = new u(StubApp.getString2(24721), 7);
        f23615g = uVar8;
        u uVar9 = new u(StubApp.getString2(24722), 8);
        f23616h = uVar9;
        u uVar10 = new u(StubApp.getString2(24723), 9);
        u uVar11 = new u(StubApp.getString2(24724), 10);
        u uVar12 = new u(StubApp.getString2(24725), 11);
        u uVar13 = new u(StubApp.getString2(24726), 12);
        j = uVar13;
        u uVar14 = new u(StubApp.getString2(24727), 13);
        f23617k = uVar14;
        u uVar15 = new u(StubApp.getString2(24728), 14);
        f23618l = uVar15;
        u uVar16 = new u(StubApp.getString2(24729), 15);
        f23619m = uVar16;
        u uVar17 = new u(StubApp.getString2(24730), 16);
        f23620n = uVar17;
        u uVar18 = new u(StubApp.getString2(24731), 17);
        u uVar19 = new u(StubApp.getString2(24732), 18);
        f23621p = uVar19;
        u uVar20 = new u(StubApp.getString2(24733), 19);
        f23622q = uVar20;
        u uVar21 = new u(StubApp.getString2(24734), 20);
        f23623r = uVar21;
        u uVar22 = new u(StubApp.getString2(24735), 21);
        f23624s = uVar22;
        u uVar23 = new u(StubApp.getString2(24736), 22);
        f23625t = uVar23;
        u uVar24 = new u(StubApp.getString2(24737), 23);
        f23626v = uVar24;
        u uVar25 = new u(StubApp.getString2(24738), 24);
        f23627w = uVar25;
        u uVar26 = new u(StubApp.getString2(24739), 25);
        f23628x = uVar26;
        u uVar27 = new u(StubApp.getString2(24740), 26);
        u uVar28 = new u(StubApp.getString2(24741), 27);
        f23629y = uVar28;
        u uVar29 = new u(StubApp.getString2(24742), 28);
        f23630z = uVar29;
        u uVar30 = new u(StubApp.getString2(24743), 29);
        f23607A = uVar30;
        f23608B = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27, uVar28, uVar29, uVar30};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f23608B.clone();
    }

    public final int a(RouteLineViewOptionsData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        RouteLineColorResources routeLineColorResources = data.getRouteLineColorResources();
        switch (ordinal()) {
            case 0:
                return routeLineColorResources.getRouteDefaultColor();
            case 1:
                return routeLineColorResources.getRouteLowCongestionColor();
            case 2:
                return routeLineColorResources.getRouteModerateCongestionColor();
            case 3:
                return routeLineColorResources.getRouteHeavyCongestionColor();
            case 4:
                return routeLineColorResources.getRouteSevereCongestionColor();
            case 5:
                return routeLineColorResources.getRouteUnknownCongestionColor();
            case 6:
                return routeLineColorResources.getRouteCasingColor();
            case 7:
                return routeLineColorResources.getRouteClosureColor();
            case 8:
                return routeLineColorResources.getRestrictedRoadColor();
            case 9:
                return routeLineColorResources.getRouteLineTraveledColor();
            case 10:
                return routeLineColorResources.getRouteLineTraveledCasingColor();
            case 11:
                return routeLineColorResources.getInActiveRouteLegsColor();
            case 12:
                return routeLineColorResources.getInactiveRouteLegLowCongestionColor();
            case 13:
                return routeLineColorResources.getInactiveRouteLegModerateCongestionColor();
            case 14:
                return routeLineColorResources.getInactiveRouteLegHeavyCongestionColor();
            case 15:
                return routeLineColorResources.getInactiveRouteLegSevereCongestionColor();
            case 16:
                return routeLineColorResources.getInactiveRouteLegUnknownCongestionColor();
            case 17:
                return routeLineColorResources.getInactiveRouteLegCasingColor();
            case 18:
                return routeLineColorResources.getInactiveRouteLegClosureColor();
            case 19:
                return routeLineColorResources.getInactiveRouteLegRestrictedRoadColor();
            case 20:
                return routeLineColorResources.getAlternativeRouteDefaultColor();
            case 21:
                return routeLineColorResources.getAlternativeRouteLowCongestionColor();
            case 22:
                return routeLineColorResources.getAlternativeRouteModerateCongestionColor();
            case 23:
                return routeLineColorResources.getAlternativeRouteHeavyCongestionColor();
            case 24:
                return routeLineColorResources.getAlternativeRouteSevereCongestionColor();
            case 25:
                return routeLineColorResources.getAlternativeRouteUnknownCongestionColor();
            case 26:
                return routeLineColorResources.getAlternativeRouteCasingColor();
            case 27:
                return routeLineColorResources.getAlternativeRouteClosureColor();
            case 28:
                return routeLineColorResources.getAlternativeRouteRestrictedRoadColor();
            case 29:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
