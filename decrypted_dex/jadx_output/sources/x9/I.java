package x9;

import Qb.L;
import Qb.L0;
import Qb.W;
import com.google.android.gms.internal.measurement.F1;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LoggingLevel;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.Style;
import com.mapbox.maps.StyleManager;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineColorResources;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineScaleExpressions;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import p0.AbstractC1482f;
import q8.AbstractC1526a;
import q9.C1529a;
import u9.C1781a;
import u9.C1782b;
import v9.C1839a;
import x8.C1918a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final u.b f22946a;

    /* renamed from: b, reason: collision with root package name */
    public final w9.n f22947b;

    /* renamed from: c, reason: collision with root package name */
    public final u f22948c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22949d;

    /* renamed from: e, reason: collision with root package name */
    public Set f22950e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f22951f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f22952g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f22953h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f22954i;
    public final Set j;

    /* renamed from: k, reason: collision with root package name */
    public final Set f22955k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f22956l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f22957m;

    /* renamed from: n, reason: collision with root package name */
    public final Map f22958n;

    /* renamed from: o, reason: collision with root package name */
    public final Z9.C f22959o;

    /* renamed from: p, reason: collision with root package name */
    public final Vb.f f22960p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f22961q;

    public I(y9.g options) {
        Intrinsics.checkNotNullParameter(options, "options");
        C1918a routesExpector = new C1918a();
        new LinkedHashMap();
        u.b dataIdHolder = new u.b(1);
        w9.n sender = new w9.n();
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(routesExpector, "routesExpector");
        Intrinsics.checkNotNullParameter(dataIdHolder, "dataIdHolder");
        Intrinsics.checkNotNullParameter(sender, "sender");
        this.f22946a = dataIdHolder;
        this.f22947b = sender;
        u uVar = new u(options);
        this.f22948c = uVar;
        this.f22949d = true;
        this.f22950e = SetsKt.emptySet();
        this.f22951f = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22763), StubApp.getString2(22770), StubApp.getString2(22777), StubApp.getString2(22784)});
        this.f22952g = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22764), StubApp.getString2(22771), StubApp.getString2(22778), StubApp.getString2(22785)});
        this.f22953h = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22761), StubApp.getString2(22768), StubApp.getString2(22775), StubApp.getString2(22782)});
        this.f22954i = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22762), StubApp.getString2(22769), StubApp.getString2(22776), StubApp.getString2(22783)});
        this.j = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22766), StubApp.getString2(22773), StubApp.getString2(22780), StubApp.getString2(22786)});
        this.f22955k = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22767), StubApp.getString2(22774), StubApp.getString2(22781), StubApp.getString2(22787)});
        this.f22956l = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22783), StubApp.getString2(22782), StubApp.getString2(22785), StubApp.getString2(22786), StubApp.getString2(22784), StubApp.getString2(22787)});
        this.f22957m = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22765), StubApp.getString2(22772), StubApp.getString2(22779)});
        this.f22958n = MapsKt.mutableMapOf(TuplesKt.to(new y9.r(r9.r.f20464d), new y9.o(null)), TuplesKt.to(new y9.r(r9.r.f20465e), new y9.o(null)), TuplesKt.to(new y9.r(r9.r.f20466f), new y9.o(null)));
        L0 job = L.b();
        Xb.d dVar = W.f5838a;
        Vb.f scope = Qb.J.a(CoroutineContext.Element.DefaultImpls.plus(job, Vb.q.f7968a.f6359c));
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f22959o = new Z9.C(scope);
        L0 job2 = L.b();
        Vb.f scope2 = Qb.J.a(CoroutineContext.Element.DefaultImpls.plus(job2, W.f5838a));
        Intrinsics.checkNotNullParameter(job2, "job");
        Intrinsics.checkNotNullParameter(scope2, "scope");
        this.f22960p = scope2;
        this.f22961q = new CopyOnWriteArrayList();
        String string2 = StubApp.getString2(1485);
        RouteLineViewOptionsData routeLineViewOptionsData = uVar.f23083b;
        Intrinsics.checkNotNullParameter(routeLineViewOptionsData, string2);
        w9.h.f22164a.d(new w9.k(sender, routeLineViewOptionsData, null));
        sender.f22185b = routeLineViewOptionsData;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(x9.I r4, com.mapbox.maps.Style r5, java.lang.String r6, y9.l r7, java.util.Map r8, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof x9.C1920A
            if (r0 == 0) goto L13
            r0 = r10
            x9.A r0 = (x9.C1920A) r0
            int r1 = r0.f22900c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22900c = r1
            goto L18
        L13:
            x9.A r0 = new x9.A
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.f22898a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f22900c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r10)
            goto L55
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r5 = 275(0x113, float:3.85E-43)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.ResultKt.throwOnFailure(r10)
            if (r6 == 0) goto L41
            y9.r r10 = new y9.r
            r10.<init>(r6)
            goto L42
        L41:
            r10 = 0
        L42:
            java.lang.Object r6 = r8.get(r10)
            java.util.Set r6 = (java.util.Set) r6
            if (r6 == 0) goto L5b
            r0.f22900c = r3
            r8 = r9
            r9 = r0
            java.lang.Object r10 = r4.h(r5, r6, r7, r8, r9)
            if (r10 != r1) goto L55
            return r1
        L55:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L5a
            goto L5b
        L5a:
            return r10
        L5b:
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.I.a(x9.I, com.mapbox.maps.Style, java.lang.String, y9.l, java.util.Map, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object b(I i3, Style style) {
        String str;
        i3.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            r9.r rVar = r9.r.f20461a;
            String n10 = r9.r.n(style);
            if (n10 == null) {
                throw new NoSuchElementException();
            }
            if (r9.r.f20467g.contains(n10)) {
                str = r9.r.f20464d;
            } else if (r9.r.f20468h.contains(n10)) {
                str = r9.r.f20465e;
            } else {
                if (!r9.r.f20469i.contains(n10)) {
                    throw new NoSuchElementException();
                }
                str = r9.r.f20466f;
            }
            return Result.m40constructorimpl(new y9.r(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m40constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final void c(I i3, Style style, y9.g gVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        I i10;
        boolean z2;
        String str8;
        String str9;
        String str10;
        RouteLineScaleExpressions routeLineScaleExpressions;
        RouteLineColorResources routeLineColorResources;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z10 = i3.f22949d;
        String string2 = StubApp.getString2(22786);
        String string22 = StubApp.getString2(22783);
        String string23 = StubApp.getString2(22782);
        String string24 = StubApp.getString2(22785);
        String string25 = StubApp.getString2(22784);
        String string26 = StubApp.getString2(22780);
        String string27 = StubApp.getString2(22776);
        String string28 = StubApp.getString2(22775);
        String string29 = StubApp.getString2(22773);
        String string210 = StubApp.getString2(22769);
        String string211 = StubApp.getString2(22768);
        String string212 = StubApp.getString2(22771);
        String string213 = StubApp.getString2(22770);
        String string214 = StubApp.getString2(22766);
        String str15 = string2;
        String string215 = StubApp.getString2(22762);
        String str16 = string22;
        String string216 = StubApp.getString2(22761);
        String str17 = string23;
        String string217 = StubApp.getString2(22764);
        String str18 = string24;
        String string218 = StubApp.getString2(22763);
        String str19 = string25;
        String string219 = StubApp.getString2(22800);
        String str20 = string26;
        String string220 = StubApp.getString2(24189);
        String str21 = string27;
        String string221 = StubApp.getString2(24190);
        String str22 = string28;
        String string222 = StubApp.getString2(22760);
        String string223 = StubApp.getString2(5688);
        String string224 = StubApp.getString2(22778);
        String string225 = StubApp.getString2(22777);
        String string226 = StubApp.getString2(22801);
        String string227 = StubApp.getString2(9982);
        if (z10) {
            str = string222;
            str2 = string211;
            str3 = string221;
            str4 = string210;
            str5 = string220;
            str6 = string29;
            str7 = string223;
            i10 = i3;
            z2 = false;
        } else {
            r9.r rVar = r9.r.f20461a;
            Intrinsics.checkNotNullParameter(style, string227);
            Intrinsics.checkNotNullParameter(gVar, string223);
            if (style.styleSourceExists(string222) && style.styleSourceExists(string221) && style.styleSourceExists(string220) && style.styleLayerExists(string219) && style.styleLayerExists(string226) && style.styleLayerExists(string218) && style.styleLayerExists(string217) && style.styleLayerExists(string216) && style.styleLayerExists(string215) && style.styleLayerExists(string214) && style.styleLayerExists(string213) && style.styleLayerExists(string212)) {
                str = string222;
                str2 = string211;
                if (style.styleLayerExists(str2)) {
                    str3 = string221;
                    str4 = string210;
                    if (style.styleLayerExists(str4)) {
                        str5 = string220;
                        str6 = string29;
                        if (style.styleLayerExists(str6)) {
                            str7 = string223;
                            str14 = string225;
                            if (style.styleLayerExists(str14)) {
                                if (style.styleLayerExists(string224)) {
                                    string224 = string224;
                                    if (style.styleLayerExists(str22)) {
                                        str22 = str22;
                                        if (style.styleLayerExists(str21)) {
                                            str21 = str21;
                                            if (style.styleLayerExists(str20)) {
                                                str20 = str20;
                                                if (style.styleLayerExists(str19)) {
                                                    str19 = str19;
                                                    if (style.styleLayerExists(str18)) {
                                                        str18 = str18;
                                                        if (style.styleLayerExists(str17)) {
                                                            str17 = str17;
                                                            if (style.styleLayerExists(str16)) {
                                                                str16 = str16;
                                                                str13 = str15;
                                                                if (style.styleLayerExists(str13)) {
                                                                    return;
                                                                }
                                                                string225 = str14;
                                                                str15 = str13;
                                                                z2 = false;
                                                                i10 = i3;
                                                            } else {
                                                                str16 = str16;
                                                            }
                                                        } else {
                                                            str17 = str17;
                                                        }
                                                    } else {
                                                        str18 = str18;
                                                    }
                                                } else {
                                                    str19 = str19;
                                                }
                                            } else {
                                                str20 = str20;
                                            }
                                        } else {
                                            str21 = str21;
                                        }
                                    } else {
                                        str22 = str22;
                                    }
                                } else {
                                    string224 = string224;
                                }
                            }
                            str13 = str15;
                            string225 = str14;
                            str15 = str13;
                            z2 = false;
                            i10 = i3;
                        } else {
                            str7 = string223;
                            str13 = str15;
                            str14 = string225;
                            string225 = str14;
                            str15 = str13;
                            z2 = false;
                            i10 = i3;
                        }
                    } else {
                        str5 = string220;
                        str13 = str15;
                        str6 = string29;
                        str7 = string223;
                        str14 = string225;
                        string225 = str14;
                        str15 = str13;
                        z2 = false;
                        i10 = i3;
                    }
                } else {
                    str3 = string221;
                    str13 = str15;
                }
            } else {
                str = string222;
                str13 = str15;
                str2 = string211;
                str3 = string221;
            }
            str4 = string210;
            str5 = string220;
            str6 = string29;
            str7 = string223;
            str14 = string225;
            string225 = str14;
            str15 = str13;
            z2 = false;
            i10 = i3;
        }
        i10.f22949d = z2;
        r9.r rVar2 = r9.r.f20461a;
        Intrinsics.checkNotNullParameter(style, "<this>");
        StyleManager styleManager = style.getStyleManager();
        F5.c cVar = new F5.c(styleManager);
        Intrinsics.checkNotNullParameter(cVar, string227);
        cVar.q(string219);
        cVar.q(string226);
        cVar.q(string218);
        cVar.q(string217);
        cVar.q(string216);
        cVar.q(string215);
        cVar.q(string214);
        cVar.q(StubApp.getString2(22767));
        cVar.q(string213);
        cVar.q(string212);
        cVar.q(str2);
        cVar.q(str4);
        cVar.q(str6);
        cVar.q(StubApp.getString2(22774));
        cVar.q(string225);
        cVar.q(string224);
        String str23 = str22;
        cVar.q(str23);
        cVar.q(str21);
        String str24 = str20;
        cVar.q(str24);
        cVar.q(StubApp.getString2(22781));
        String str25 = str19;
        cVar.q(str25);
        cVar.q(str18);
        cVar.q(str17);
        cVar.q(str16);
        String str26 = str15;
        cVar.q(str26);
        cVar.q(StubApp.getString2(22787));
        String string228 = StubApp.getString2(24191);
        cVar.q(string228);
        String string229 = StubApp.getString2(22765);
        cVar.q(string229);
        String string230 = StubApp.getString2(22772);
        cVar.q(string230);
        String string231 = StubApp.getString2(22779);
        cVar.q(string231);
        String imageId = StubApp.getString2(22748);
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        String str27 = str2;
        Intrinsics.checkNotNullExpressionValue(styleManager.removeStyleImage(imageId), "originalStyleManager.removeStyleImage(imageId)");
        Intrinsics.checkNotNullParameter("destinationMarker", "imageId");
        Intrinsics.checkNotNullExpressionValue(styleManager.removeStyleImage("destinationMarker"), "originalStyleManager.removeStyleImage(imageId)");
        Intrinsics.checkNotNullParameter(style, string227);
        Intrinsics.checkNotNullParameter(gVar, str7);
        List<String> styleSlots = style.getStyleSlots();
        String string232 = StubApp.getString2(12974);
        boolean contains = styleSlots.contains(string232);
        if (contains) {
            str8 = "destinationMarker";
        } else {
            str8 = "destinationMarker";
            if (D9.l.a(D9.l.g(), LoggingLevel.ERROR)) {
                D9.l.e(StubApp.getString2(24192), StubApp.getString2(22758));
            }
        }
        Intrinsics.checkNotNullParameter(style, string227);
        new N6.d(1.0d);
        String str28 = string224;
        String str29 = str;
        String str30 = str8;
        String str31 = str4;
        String str32 = str21;
        String str33 = string225;
        String str34 = str6;
        r9.r.b(style, StubApp.getString2(19170), 0.375d, false, false);
        r9.r.b(style, StubApp.getString2(22760), 0.375d, true, false);
        r9.r.b(style, StubApp.getString2(24190), 0.375d, true, false);
        r9.r.b(style, StubApp.getString2(24189), 0.375d, true, false);
        boolean styleLayerExists = style.styleLayerExists(string226);
        String string233 = StubApp.getString2(24193);
        String string234 = StubApp.getString2(1339);
        if (!styleLayerExists) {
            Q6.a aVar = new Q6.a(string226, 0);
            aVar.i(new R6.a(string233, Double.valueOf(0.0d)));
            if (contains) {
                Intrinsics.checkNotNullParameter(string232, string234);
                aVar.i(new R6.a(string234, string232));
            }
            Unit unit = Unit.INSTANCE;
            F1.d(style, aVar, new LayerPosition(null, null, null));
        }
        boolean styleLayerExists2 = style.styleLayerExists(str33);
        RouteLineScaleExpressions routeLineScaleExpressions2 = gVar.f23567c;
        if (styleLayerExists2) {
            str9 = str5;
            str10 = string231;
        } else {
            str9 = str5;
            Q6.a d8 = AbstractC1482f.d(str33, str9);
            d8.p(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
            d8.m();
            d8.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d8);
            str10 = string231;
            AbstractC1526a.b(style, d8.f5743f, 0.0d);
            if (contains) {
                d8.q(string232);
            }
        }
        if (!style.styleLayerExists(str28)) {
            Q6.a d10 = AbstractC1482f.d(str28, str9);
            d10.p(routeLineScaleExpressions2.getRouteLineScaleExpression());
            d10.m();
            d10.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d10);
            AbstractC1526a.b(style, d10.f5743f, 0.0d);
            if (contains) {
                d10.q(string232);
            }
        }
        String str35 = str10;
        boolean styleLayerExists3 = style.styleLayerExists(str35);
        RouteLineColorResources routeLineColorResources2 = gVar.f23566b;
        String string235 = StubApp.getString2(24194);
        String string236 = StubApp.getString2(24195);
        if (styleLayerExists3) {
            routeLineScaleExpressions = routeLineScaleExpressions2;
            routeLineColorResources = routeLineColorResources2;
        } else {
            routeLineScaleExpressions = routeLineScaleExpressions2;
            Q6.a aVar2 = new Q6.a(6, str35, str9);
            aVar2.i(new R6.a(string236, Double.valueOf(0.4d)));
            aVar2.i(new R6.a(string235, Double.valueOf(5.0d)));
            aVar2.k();
            aVar2.n();
            aVar2.p(routeLineScaleExpressions.getRouteBlurScaleExpression());
            aVar2.m();
            aVar2.l(routeLineColorResources2.getBlurColor());
            AbstractC1482f.r(null, null, null, style, aVar2);
            routeLineColorResources = routeLineColorResources2;
            AbstractC1526a.b(style, aVar2.f5743f, 0.0d);
            if (contains) {
                aVar2.q(string232);
            }
        }
        if (!style.styleLayerExists(str23)) {
            Q6.a d11 = AbstractC1482f.d(str23, str9);
            d11.p(routeLineScaleExpressions.getRouteCasingLineScaleExpression());
            d11.m();
            d11.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d11);
            AbstractC1526a.b(style, d11.f5743f, 0.0d);
            if (contains) {
                d11.q(string232);
            }
        }
        if (!style.styleLayerExists(str32)) {
            Q6.a d12 = AbstractC1482f.d(str32, str9);
            d12.p(routeLineScaleExpressions.getRouteLineScaleExpression());
            d12.m();
            d12.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d12);
            AbstractC1526a.b(style, d12.f5743f, 0.0d);
            if (contains) {
                d12.q(string232);
            }
        }
        if (!style.styleLayerExists(str24)) {
            Q6.a d13 = AbstractC1482f.d(str24, str9);
            d13.p(routeLineScaleExpressions.getRouteTrafficLineScaleExpression());
            d13.m();
            d13.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d13);
            AbstractC1526a.b(style, d13.f5743f, 0.0d);
            if (contains) {
                d13.q(string232);
            }
        }
        if (style.styleLayerExists(string213)) {
            str11 = str3;
        } else {
            str11 = str3;
            Q6.a d14 = AbstractC1482f.d(string213, str11);
            d14.p(routeLineScaleExpressions.getRouteCasingLineScaleExpression());
            d14.m();
            d14.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d14);
            AbstractC1526a.b(style, d14.f5743f, 0.0d);
            if (contains) {
                d14.q(string232);
            }
        }
        if (!style.styleLayerExists(string212)) {
            Q6.a d15 = AbstractC1482f.d(string212, str11);
            d15.p(routeLineScaleExpressions.getRouteLineScaleExpression());
            d15.m();
            d15.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d15);
            AbstractC1526a.b(style, d15.f5743f, 0.0d);
            if (contains) {
                d15.q(string232);
            }
        }
        if (!style.styleLayerExists(string230)) {
            Q6.a aVar3 = new Q6.a(6, string230, str11);
            aVar3.i(new R6.a(string236, Double.valueOf(0.4d)));
            aVar3.i(new R6.a(string235, Double.valueOf(5.0d)));
            aVar3.k();
            aVar3.n();
            aVar3.p(routeLineScaleExpressions.getRouteBlurScaleExpression());
            aVar3.m();
            aVar3.l(routeLineColorResources.getBlurColor());
            AbstractC1482f.r(null, null, null, style, aVar3);
            AbstractC1526a.b(style, aVar3.f5743f, 0.0d);
            if (contains) {
                aVar3.q(string232);
            }
        }
        if (!style.styleLayerExists(str27)) {
            Q6.a d16 = AbstractC1482f.d(str27, str11);
            d16.p(routeLineScaleExpressions.getRouteCasingLineScaleExpression());
            d16.m();
            d16.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d16);
            AbstractC1526a.b(style, d16.f5743f, 0.0d);
            if (contains) {
                d16.q(string232);
            }
        }
        if (!style.styleLayerExists(str31)) {
            Q6.a d17 = AbstractC1482f.d(str31, str11);
            d17.p(routeLineScaleExpressions.getRouteLineScaleExpression());
            d17.m();
            d17.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d17);
            AbstractC1526a.b(style, d17.f5743f, 0.0d);
            if (contains) {
                d17.q(string232);
            }
        }
        if (!style.styleLayerExists(str34)) {
            Q6.a d18 = AbstractC1482f.d(str34, str11);
            d18.p(routeLineScaleExpressions.getRouteTrafficLineScaleExpression());
            d18.m();
            d18.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d18);
            AbstractC1526a.b(style, d18.f5743f, 0.0d);
            if (contains) {
                d18.q(string232);
            }
        }
        if (style.styleLayerExists(string218)) {
            str12 = str29;
        } else {
            str12 = str29;
            Q6.a d19 = AbstractC1482f.d(string218, str12);
            d19.p(routeLineScaleExpressions.getRouteCasingLineScaleExpression());
            d19.m();
            d19.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d19);
            AbstractC1526a.b(style, d19.f5743f, 0.0d);
            if (contains) {
                d19.q(string232);
            }
        }
        if (!style.styleLayerExists(string217)) {
            Q6.a d20 = AbstractC1482f.d(string217, str12);
            d20.p(routeLineScaleExpressions.getRouteLineScaleExpression());
            d20.m();
            d20.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d20);
            AbstractC1526a.b(style, d20.f5743f, 0.0d);
            if (contains) {
                d20.q(string232);
            }
        }
        if (!style.styleLayerExists(string229)) {
            Q6.a aVar4 = new Q6.a(6, string229, str12);
            aVar4.i(new R6.a(string236, Double.valueOf(0.4d)));
            aVar4.i(new R6.a(string235, Double.valueOf(5.0d)));
            aVar4.k();
            aVar4.n();
            aVar4.p(routeLineScaleExpressions.getRouteBlurScaleExpression());
            aVar4.m();
            aVar4.l(routeLineColorResources.getBlurColor());
            AbstractC1482f.r(null, null, null, style, aVar4);
            AbstractC1526a.b(style, aVar4.f5743f, 0.0d);
            if (contains) {
                aVar4.q(string232);
            }
        }
        if (!style.styleLayerExists(string216)) {
            Q6.a d21 = AbstractC1482f.d(string216, str12);
            d21.p(routeLineScaleExpressions.getRouteCasingLineScaleExpression());
            d21.m();
            d21.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d21);
            AbstractC1526a.b(style, d21.f5743f, 0.0d);
            if (contains) {
                d21.q(string232);
            }
        }
        if (!style.styleLayerExists(string215)) {
            Q6.a d22 = AbstractC1482f.d(string215, str12);
            d22.p(routeLineScaleExpressions.getRouteLineScaleExpression());
            d22.m();
            d22.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d22);
            AbstractC1526a.b(style, d22.f5743f, 0.0d);
            if (contains) {
                d22.q(string232);
            }
        }
        if (!style.styleLayerExists(string214)) {
            Q6.a d23 = AbstractC1482f.d(string214, str12);
            d23.p(routeLineScaleExpressions.getRouteTrafficLineScaleExpression());
            d23.m();
            d23.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d23);
            AbstractC1526a.b(style, d23.f5743f, 0.0d);
            if (contains) {
                d23.q(string232);
            }
        }
        if (!style.styleLayerExists(str25)) {
            Q6.a d24 = AbstractC1482f.d(str25, str12);
            d24.p(routeLineScaleExpressions.getRouteCasingLineScaleExpression());
            d24.m();
            d24.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d24);
            AbstractC1526a.b(style, d24.f5743f, 0.0d);
            if (contains) {
                d24.q(string232);
            }
        }
        String str36 = str18;
        if (!style.styleLayerExists(str36)) {
            Q6.a d25 = AbstractC1482f.d(str36, str12);
            d25.p(routeLineScaleExpressions.getRouteLineScaleExpression());
            d25.m();
            d25.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d25);
            AbstractC1526a.b(style, d25.f5743f, 0.0d);
            if (contains) {
                d25.q(string232);
            }
        }
        String str37 = str17;
        if (!style.styleLayerExists(str37)) {
            Q6.a d26 = AbstractC1482f.d(str37, str12);
            d26.p(routeLineScaleExpressions.getRouteCasingLineScaleExpression());
            d26.m();
            d26.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d26);
            AbstractC1526a.b(style, d26.f5743f, 0.0d);
            if (contains) {
                d26.q(string232);
            }
        }
        String str38 = str16;
        if (!style.styleLayerExists(str38)) {
            Q6.a d27 = AbstractC1482f.d(str38, str12);
            d27.p(routeLineScaleExpressions.getRouteLineScaleExpression());
            d27.m();
            d27.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d27);
            AbstractC1526a.b(style, d27.f5743f, 0.0d);
            if (contains) {
                d27.q(string232);
            }
        }
        if (!style.styleLayerExists(str26)) {
            Q6.a d28 = AbstractC1482f.d(str26, str12);
            d28.p(routeLineScaleExpressions.getRouteTrafficLineScaleExpression());
            d28.m();
            d28.l(-7829368);
            AbstractC1482f.r(null, null, null, style, d28);
            AbstractC1526a.b(style, d28.f5743f, 0.0d);
            if (contains) {
                d28.q(string232);
            }
        }
        if (!style.styleLayerExists(string219)) {
            Q6.a aVar5 = new Q6.a(string219, 0);
            aVar5.i(new R6.a(string233, Double.valueOf(0.0d)));
            if (contains) {
                Intrinsics.checkNotNullParameter(string232, string234);
                aVar5.i(new R6.a(string234, string232));
            }
            Unit unit2 = Unit.INSTANCE;
            F1.d(style, aVar5, new LayerPosition(null, null, null));
        }
        if (!style.hasStyleImage(imageId)) {
            style.addImage(imageId, Y3.a.k(gVar.f23570f));
        }
        if (!style.hasStyleImage(str30)) {
            style.addImage(str30, Y3.a.k(gVar.f23572h));
        }
        if (style.styleLayerExists(string228)) {
            return;
        }
        Q6.c cVar2 = new Q6.c(string228, StubApp.getString2(19170));
        String string237 = StubApp.getString2(9321);
        List list = gVar.f23573i;
        Intrinsics.checkNotNullParameter(list, string237);
        cVar2.i(new R6.a(StubApp.getString2(8522), list));
        S6.a iconAnchor = S6.a.f6593a;
        Intrinsics.checkNotNullParameter(iconAnchor, "iconAnchor");
        cVar2.i(new R6.a(StubApp.getString2(8520), iconAnchor));
        r9.d block = r9.d.f20414k;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(block, "block");
        N6.a aVar6 = new N6.a(StubApp.getString2(12201));
        block.invoke(aVar6);
        N6.d b2 = aVar6.b();
        Intrinsics.checkNotNullParameter(b2, StubApp.getString2(9212));
        cVar2.i(new R6.a("icon-image", b2));
        r9.d block2 = r9.d.f20420r;
        Intrinsics.checkNotNullParameter(block2, "block");
        Intrinsics.checkNotNullParameter(block2, "block");
        String operator = StubApp.getString2(22797);
        Intrinsics.checkNotNullParameter(operator, "operator");
        N6.c cVar3 = new N6.c(operator);
        block2.invoke(cVar3);
        N6.d iconSize = cVar3.b();
        Intrinsics.checkNotNullParameter(iconSize, "iconSize");
        Xa.h.y(StubApp.getString2(8523), iconSize, cVar2);
        if (contains) {
            Intrinsics.checkNotNullParameter(string232, string234);
            cVar2.i(new R6.a(string234, string232));
        }
        Unit unit3 = Unit.INSTANCE;
        S6.b iconPitchAlignment = S6.b.f6594a;
        Intrinsics.checkNotNullParameter(iconPitchAlignment, "iconPitchAlignment");
        cVar2.i(new R6.a(StubApp.getString2(24196), iconPitchAlignment));
        cVar2.k();
        cVar2.l(true);
        cVar2.i(new R6.a(StubApp.getString2(24197), Boolean.TRUE));
        F1.d(style, cVar2, new LayerPosition(null, null, null));
    }

    public static final C1782b d(I i3, C1529a c1529a) {
        C1781a c1781a;
        i3.getClass();
        List<C1839a> list = c1529a.f20098a;
        ArrayList arrayList = new ArrayList();
        for (C1839a c1839a : list) {
            String str = (String) i3.g().get(c1839a.f21889a.f12506i);
            if (str == null) {
                if (D9.l.a(D9.l.g(), LoggingLevel.WARNING)) {
                    D9.l.h(StubApp.getString2(24198) + c1839a.f21889a.f12506i + StubApp.getString2(24199), StubApp.getString2(19168));
                }
                c1781a = null;
            } else {
                c1781a = new C1781a(c1839a, str);
            }
            if (c1781a != null) {
                arrayList.add(c1781a);
            }
        }
        return new C1782b(arrayList);
    }

    public static void e(Style style, String str, S6.f fVar) {
        P6.c p8;
        if (!style.styleLayerExists(str) || (p8 = F1.p(style, str)) == null) {
            return;
        }
        p8.j(fVar);
    }

    public static void k(Style style, String str, FeatureCollection value, Integer num) {
        T6.d q10 = F1.q(style, str);
        if (q10 != null) {
            String dataId = num != null ? String.valueOf(num.intValue()) : null;
            if (dataId == null) {
                dataId = "";
            }
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(dataId, "dataId");
            ((U6.c) q10).h(value, dataId);
        }
    }

    public final v f(y9.l lVar, String str, Style style) {
        y9.s sVar;
        N6.d dVar = null;
        Double valueOf = (lVar == null || (sVar = lVar.f23585e) == null) ? null : Double.valueOf(sVar.f23601a);
        if (lVar != null && valueOf != null) {
            List value = CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(1.0d - valueOf.doubleValue()), Double.valueOf(1.0d)});
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(value, "value");
            N6.a aVar = new N6.a(StubApp.getString2(24200));
            aVar.a(new N6.d(value));
            dVar = aVar.b();
        }
        return new v(this, str, dVar, style);
    }

    public final LinkedHashMap g() {
        String str;
        Set intersect;
        Object firstOrNull;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f22958n.entrySet()) {
            String str2 = ((y9.r) entry.getKey()).f23600a;
            String str3 = ((y9.o) entry.getValue()).f23592a;
            if (str3 != null) {
                Set set = (Set) r9.r.f20470k.get(new y9.r(str2));
                if (set == null || (intersect = CollectionsKt.intersect(set, this.f22954i)) == null) {
                    str = null;
                } else {
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(intersect);
                    str = (String) firstOrNull;
                }
                if (str != null) {
                    linkedHashMap.put(str3, str);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0135 -> B:10:0x0136). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.mapbox.maps.Style r11, java.util.Set r12, y9.l r13, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.I.h(com.mapbox.maps.Style, java.util.Set, y9.l, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void i(Style style, Expected clearRouteLineValue) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(clearRouteLineValue, "clearRouteLineValue");
        E7.a aVar = E7.a.f1927a;
        boolean a3 = E7.a.a();
        Z9.C c10 = this.f22959o;
        if (!a3) {
            c10.g(new F(this, style, clearRouteLineValue, null));
            return;
        }
        String string2 = StubApp.getString2(24201);
        E7.a.c(string2);
        try {
            long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
            c10.g(new F(this, style, clearRouteLineValue, null));
            Unit unit = Unit.INSTANCE;
            Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
        } finally {
            E7.a.b(string2);
        }
    }

    public final void j(Style style, Expected routeDrawData) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(routeDrawData, "routeDrawData");
        E7.a aVar = E7.a.f1927a;
        boolean a3 = E7.a.a();
        Z9.C c10 = this.f22959o;
        if (!a3) {
            c10.g(new H(this, style, routeDrawData, null));
            return;
        }
        String string2 = StubApp.getString2(24202);
        E7.a.c(string2);
        try {
            long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
            c10.g(new H(this, style, routeDrawData, null));
            Unit unit = Unit.INSTANCE;
            Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
        } finally {
            E7.a.b(string2);
        }
    }
}
