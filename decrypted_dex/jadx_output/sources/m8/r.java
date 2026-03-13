package m8;

import Qb.InterfaceC0221t0;
import Qb.J;
import Qb.K0;
import Qb.L;
import Qb.L0;
import Qb.W;
import R8.C0250h;
import R8.C0251i;
import V8.C0353e;
import Z9.C0366a;
import a.AbstractC0378a;
import a0.C0379a;
import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import b3.C0515q;
import b3.C0517s;
import com.google.android.gms.internal.measurement.L1;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.BillingService;
import com.mapbox.common.BillingSessionStatus;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.ReachabilityInterface;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.SessionSKUIdentifier;
import com.mapbox.common.TileDataDomain;
import com.mapbox.common.TileStore;
import com.mapbox.common.location.LocationServiceFactory;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.core.internal.MapboxNavigationSDKInitializerImpl;
import com.mapbox.navigator.AdasisFacadeHandle;
import com.mapbox.navigator.AlertsServiceOptions;
import com.mapbox.navigator.CacheHandle;
import com.mapbox.navigator.ConfigFactory;
import com.mapbox.navigator.ConfigHandle;
import com.mapbox.navigator.ElectronicHorizonOptions;
import com.mapbox.navigator.Experimental;
import com.mapbox.navigator.HistoryRecorderHandle;
import com.mapbox.navigator.NavigatorConfig;
import com.mapbox.navigator.PollingConfig;
import com.mapbox.navigator.ProfileApplication;
import com.mapbox.navigator.ProfilePlatform;
import com.mapbox.navigator.RerouteControllerInterface;
import com.mapbox.navigator.RerouteDetectorInterface;
import com.mapbox.navigator.RerouteStrategyForMatchRoute;
import com.mapbox.navigator.RoadObjectMatcherConfig;
import com.mapbox.navigator.RoadObjectsStore;
import com.mapbox.navigator.RouteAlternativesControllerInterface;
import com.mapbox.navigator.RouterInterface;
import com.mapbox.navigator.SettingsProfile;
import com.mapbox.navigator.TileEndpointConfiguration;
import com.mapbox.navigator.TilesConfig;
import com.stub.StubApp;
import f4.C0879c;
import f4.C0882f;
import h8.InterfaceC1012b;
import i5.C1059c;
import i8.C1064b;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import l4.C1145A;
import l4.C1223z;
import l4.E0;
import o8.C1464a;
import org.json.JSONException;
import org.json.JSONObject;
import s.C1590a;
import sa.C1608a;
import t8.C1739a;
import v0.C1803F;
import w8.C1870a;
import x8.C1918a;
import x8.C1919b;
import y8.C1976a;
import y8.InterfaceC1977b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r {

    /* renamed from: O, reason: collision with root package name */
    public static volatile boolean f17206O;

    /* renamed from: A, reason: collision with root package name */
    public final Field f17207A;

    /* renamed from: B, reason: collision with root package name */
    public final Oc.a f17208B;

    /* renamed from: C, reason: collision with root package name */
    public final LinkedHashSet f17209C;

    /* renamed from: D, reason: collision with root package name */
    public final C0250h f17210D;

    /* renamed from: E, reason: collision with root package name */
    public final C0882f f17211E;

    /* renamed from: F, reason: collision with root package name */
    public Long f17212F;

    /* renamed from: G, reason: collision with root package name */
    public Integer f17213G;

    /* renamed from: H, reason: collision with root package name */
    public final List f17214H;

    /* renamed from: I, reason: collision with root package name */
    public final Y8.d f17215I;

    /* renamed from: J, reason: collision with root package name */
    public final S8.a f17216J;

    /* renamed from: K, reason: collision with root package name */
    public final Z9.q f17217K;

    /* renamed from: L, reason: collision with root package name */
    public volatile boolean f17218L;

    /* renamed from: M, reason: collision with root package name */
    public Z8.f f17219M;

    /* renamed from: N, reason: collision with root package name */
    public final Lazy f17220N;

    /* renamed from: a, reason: collision with root package name */
    public final L7.i f17221a;

    /* renamed from: b, reason: collision with root package name */
    public final D9.h f17222b;

    /* renamed from: c, reason: collision with root package name */
    public final C1739a f17223c;

    /* renamed from: d, reason: collision with root package name */
    public final C1739a f17224d;

    /* renamed from: e, reason: collision with root package name */
    public final C1739a f17225e;

    /* renamed from: f, reason: collision with root package name */
    public final C1608a f17226f;

    /* renamed from: g, reason: collision with root package name */
    public final D9.f f17227g;

    /* renamed from: h, reason: collision with root package name */
    public final q8.d f17228h;

    /* renamed from: i, reason: collision with root package name */
    public final V8.q f17229i;
    public final V8.v j;

    /* renamed from: k, reason: collision with root package name */
    public final C1283d f17230k;

    /* renamed from: l, reason: collision with root package name */
    public final C1281b f17231l;

    /* renamed from: m, reason: collision with root package name */
    public final B3.h f17232m;

    /* renamed from: n, reason: collision with root package name */
    public final B6.a f17233n;

    /* renamed from: o, reason: collision with root package name */
    public final D9.e f17234o;

    /* renamed from: p, reason: collision with root package name */
    public final I7.b f17235p;

    /* renamed from: q, reason: collision with root package name */
    public final t f17236q;

    /* renamed from: r, reason: collision with root package name */
    public final P8.i f17237r;

    /* renamed from: s, reason: collision with root package name */
    public final C1464a f17238s;

    /* renamed from: t, reason: collision with root package name */
    public final B3.s f17239t;

    /* renamed from: u, reason: collision with root package name */
    public final Zb.e f17240u;

    /* renamed from: v, reason: collision with root package name */
    public final Q2.g f17241v;

    /* renamed from: w, reason: collision with root package name */
    public final v f17242w;

    /* renamed from: x, reason: collision with root package name */
    public final Y.m f17243x;

    /* renamed from: y, reason: collision with root package name */
    public final C1059c f17244y;

    /* renamed from: z, reason: collision with root package name */
    public final C1284e f17245z;

    public r(L7.i navigationOptions) {
        Pair pair;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Pair pair2;
        Z8.h hVar;
        E0 eventsMetadataProvider;
        Z8.f fVar;
        C1059c router;
        C0882f c0882f;
        InterfaceC1012b tripNotification;
        U8.d tripService;
        B3.h tripSessionLocationEngine;
        V8.q qVar;
        Pair pair3;
        B6.a aVar;
        V8.q tripSession;
        Z9.q qVar2;
        P8.i iVar;
        V8.q qVar3;
        q8.d directionsSession;
        Oc.a i3;
        q8.d dVar;
        CacheHandle cache;
        CacheHandle cache2;
        Pair pair4;
        int i10 = 12;
        int i11 = 1;
        int i12 = 2;
        Intrinsics.checkNotNullParameter(navigationOptions, "navigationOptions");
        D9.h threadController = new D9.h();
        threadController.f1517a = L.b();
        threadController.f1518b = L.b();
        C1739a historyRecorder = new C1739a(navigationOptions);
        C1739a copilotHistoryRecorder = new C1739a(navigationOptions);
        C1739a compositeRecorder = new C1739a(navigationOptions);
        Intrinsics.checkNotNullParameter(navigationOptions.f4277a, "context");
        String string2 = StubApp.getString2(21113);
        Y8.b bVar = Y8.b.f8836a;
        Intrinsics.checkNotNullParameter(bVar, string2);
        A0.c permissionsChecker = new A0.c();
        permissionsChecker.f29a = bVar;
        C1608a lowMemoryManager = new C1608a(2);
        Intrinsics.checkNotNullParameter(navigationOptions, "navigationOptions");
        Intrinsics.checkNotNullParameter(threadController, "threadController");
        Intrinsics.checkNotNullParameter(historyRecorder, "historyRecorder");
        Intrinsics.checkNotNullParameter(copilotHistoryRecorder, "copilotHistoryRecorder");
        Intrinsics.checkNotNullParameter(compositeRecorder, "compositeRecorder");
        Intrinsics.checkNotNullParameter(permissionsChecker, "permissionsChecker");
        Intrinsics.checkNotNullParameter(lowMemoryManager, "lowMemoryManager");
        this.f17221a = navigationOptions;
        this.f17222b = threadController;
        this.f17223c = historyRecorder;
        this.f17224d = copilotHistoryRecorder;
        this.f17225e = compositeRecorder;
        this.f17226f = lowMemoryManager;
        this.f17227g = threadController.a();
        this.f17234o = new D9.e(Ec.l.a(-1, 0, 6));
        this.f17235p = new I7.b();
        L7.m trafficOverrideOptions = navigationOptions.f4288m;
        Intrinsics.checkNotNullParameter(trafficOverrideOptions, "trafficOverrideOptions");
        C1919b lowSpeedAnalyzer = new C1919b();
        Intrinsics.checkNotNullParameter(lowSpeedAnalyzer, "lowSpeedAnalyzer");
        InterfaceC1977b[] chain = {new C1919b(), new C1918a(), new C1918a(), new C1976a()};
        C1870a fallbackValue = C1870a.f22144a;
        Intrinsics.checkNotNullParameter(fallbackValue, "fallbackValue");
        Intrinsics.checkNotNullParameter(chain, "chain");
        IntRange heavy = trafficOverrideOptions.f4293c;
        IntRange severe = trafficOverrideOptions.f4294d;
        IntRange low = trafficOverrideOptions.f4291a;
        IntRange moderate = trafficOverrideOptions.f4292b;
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(moderate, "moderate");
        Intrinsics.checkNotNullParameter(heavy, "heavy");
        Intrinsics.checkNotNullParameter(severe, "severe");
        C1803F c1803f = new C1803F();
        c1803f.f21581a = moderate;
        c1803f.f21582b = severe;
        new C1145A(c1803f);
        t tVar = new t();
        tVar.f17249a = CollectionsKt.emptyList();
        this.f17236q = tVar;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        ElectronicHorizonOptions electronicHorizonOptions = new ElectronicHorizonOptions(500.0d, (byte) 0, 50.0d, true, null, new AlertsServiceOptions(bool, bool, bool2, bool2, bool2), false);
        Vb.f scope = threadController.a().f1513b;
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f17239t = new B3.s(new u5.d(i10), scope);
        this.f17240u = Zb.f.a();
        Xb.d dVar2 = W.f5838a;
        Rb.d dVar3 = Vb.q.f7968a;
        I8.a aVar2 = I8.a.f3234a;
        int ordinal = u8.k.f21475a.ordinal();
        if (ordinal == 0) {
            pair = TuplesKt.to(StubApp.getString2(2158), StubApp.getString2(2159));
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            pair = TuplesKt.to(StubApp.getString2(2156), StubApp.getString2(2157));
        }
        this.f17241v = new Q2.g(dVar2, dVar3, aVar2, new SdkInformation((String) pair.component1(), StubApp.getString2(2160), (String) pair.component2()), I8.b.f3235a, new C1590a(5));
        this.f17242w = new v();
        this.f17243x = new Y.m(28);
        NavigatorConfig navigatorConfig = new NavigatorConfig(null, electronicHorizonOptions, new PollingConfig(Double.valueOf(1000 / 1000.0d), Double.valueOf(2000 / 1000.0d), Double.valueOf(1000 / 1000.0d)), null, null, bool, RerouteStrategyForMatchRoute.REROUTE_DISABLED);
        this.f17245z = new C1284e(this, 0);
        this.f17209C = new LinkedHashSet();
        this.f17214H = CollectionsKt.listOf((Object[]) new C1739a[]{historyRecorder, copilotHistoryRecorder});
        Context context = navigationOptions.f4277a;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        this.f17216J = new S8.a((Application) context);
        E7.a aVar3 = E7.a.f1927a;
        String string22 = StubApp.getString2(21114);
        if (E7.a.a()) {
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                BaseMapboxInitializer.INSTANCE.init(MapboxNavigationSDKInitializerImpl.class);
                Unit unit = Unit.INSTANCE;
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
            } finally {
            }
        } else {
            BaseMapboxInitializer.INSTANCE.init(MapboxNavigationSDKInitializerImpl.class);
            Unit unit2 = Unit.INSTANCE;
        }
        if (f17206O) {
            throw new IllegalStateException(StubApp.getString2(21137));
        }
        f17206O = true;
        L7.c deviceProfile = navigationOptions.f4280d;
        Intrinsics.checkNotNullParameter(deviceProfile, "deviceProfile");
        Intrinsics.checkNotNullParameter(navigatorConfig, "navigatorConfig");
        SettingsProfile settingsProfile = new SettingsProfile(ProfileApplication.MOBILE, ProfilePlatform.ANDROID);
        Intrinsics.checkNotNullParameter("", StubApp.getString2(2448));
        if (StringsKt.isBlank("")) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject("");
            } catch (JSONException e10) {
                D9.l.e(StubApp.getString2(21115) + e10 + StubApp.getString2(81), null);
                jSONObject = new JSONObject();
            }
        }
        String objectName = StubApp.getString2(2045);
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(objectName, "objectName");
        if (jSONObject.has(objectName)) {
            jSONObject2 = jSONObject.getJSONObject(objectName);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "{\n        getJSONObject(objectName)\n    }");
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject.put(objectName, jSONObject3);
            jSONObject2 = jSONObject3;
        }
        jSONObject2.put(StubApp.getString2(21116), true);
        String jSONObject4 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject4, "rootJson.toString()");
        ConfigHandle config = ConfigFactory.build(settingsProfile, navigatorConfig, jSONObject4);
        Intrinsics.checkNotNullExpressionValue(config, "build(\n            setti….customConfig),\n        )");
        G7.a aVar4 = G7.a.f2450a;
        L7.l routingTilesOptions = this.f17221a.f4279c;
        Intrinsics.checkNotNullParameter(routingTilesOptions, "routingTilesOptions");
        C1223z provider = new C1223z(18);
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (aVar4) {
            D9.l.d(StubApp.getString2("2327"), StubApp.getString2("2328"));
            TileStore create = TileStore.create();
            Intrinsics.checkNotNullExpressionValue(create, "create()");
            G7.a.f2451b = create;
            Unit unit3 = Unit.INSTANCE;
        }
        L7.l lVar = this.f17221a.f4279c;
        TilesConfig tilesConfig = f("", false);
        E7.a aVar5 = E7.a.f1927a;
        boolean a3 = E7.a.a();
        String string23 = StubApp.getString2(2160);
        String string24 = StubApp.getString2(2159);
        String string25 = StubApp.getString2(2158);
        String string26 = StubApp.getString2(2157);
        String string27 = StubApp.getString2(2156);
        C1739a c1739a = this.f17224d;
        C1739a c1739a2 = this.f17223c;
        if (a3) {
            string22 = StubApp.getString2(21117);
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                String a9 = c1739a2.a();
                String b2 = c1739a.f21220c.b();
                int ordinal2 = u8.k.f21475a.ordinal();
                if (ordinal2 == 0) {
                    pair2 = TuplesKt.to(string25, string24);
                } else {
                    if (ordinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair2 = TuplesKt.to(string27, string26);
                }
                Z8.h e11 = W.a.e(config, a9, b2, new SdkInformation((String) pair2.component1(), string23, (String) pair2.component2()));
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto2));
                E7.a.b(string22);
                hVar = e11;
            } finally {
            }
        } else {
            String a10 = c1739a2.a();
            String b10 = c1739a.f21220c.b();
            int ordinal3 = u8.k.f21475a.ordinal();
            if (ordinal3 == 0) {
                pair4 = TuplesKt.to(string25, string24);
            } else {
                if (ordinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                pair4 = TuplesKt.to(string27, string26);
            }
            hVar = W.a.e(config, a10, b10, new SdkInformation((String) pair4.component1(), string23, (String) pair4.component2()));
        }
        HistoryRecorderHandle historyRecorderHandle = hVar.f9065c;
        string22 = StubApp.getString2(21118);
        if (E7.a.a()) {
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                L7.l lVar2 = this.f17221a.f4279c;
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto3));
                E7.a.b(string22);
            } finally {
            }
        } else {
            L7.l lVar3 = this.f17221a.f4279c;
        }
        Context context2 = this.f17221a.f4277a;
        S8.a lifecycleMonitor = this.f17216J;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(lifecycleMonitor, "lifecycleMonitor");
        boolean a11 = E7.a.a();
        String string28 = StubApp.getString2(21119);
        if (a11) {
            string22 = StubApp.getString2(21120);
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto4 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                Context origApplicationContext = StubApp.getOrigApplicationContext(context2.getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(origApplicationContext, string28);
                E0 e02 = new E0(origApplicationContext, lifecycleMonitor);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto4));
                E7.a.b(string22);
                eventsMetadataProvider = e02;
            } finally {
            }
        } else {
            Context origApplicationContext2 = StubApp.getOrigApplicationContext(context2.getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(origApplicationContext2, string28);
            eventsMetadataProvider = new E0(origApplicationContext2, lifecycleMonitor);
        }
        L7.k roadObjectMatcherOptions = this.f17221a.f4289n;
        Intrinsics.checkNotNullParameter(roadObjectMatcherOptions, "roadObjectMatcherOptions");
        RoadObjectMatcherConfig roadObjectMatcherConfig = new RoadObjectMatcherConfig(null, TileDataDomain.NAVIGATION);
        Intrinsics.checkNotNullParameter(tilesConfig, "tilesConfig");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(eventsMetadataProvider, "eventsMetadataProvider");
        Intrinsics.checkNotNullParameter(roadObjectMatcherConfig, "roadObjectMatcherConfig");
        if (E7.a.a()) {
            E0 e03 = eventsMetadataProvider;
            string22 = StubApp.getString2(21121);
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto5 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                fVar = new Z8.f(tilesConfig, historyRecorderHandle, roadObjectMatcherConfig, config, e03);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto5));
                E7.a.b(string22);
            } finally {
            }
        } else {
            fVar = new Z8.f(tilesConfig, historyRecorderHandle, roadObjectMatcherConfig, config, eventsMetadataProvider);
        }
        this.f17219M = fVar;
        J7.o routeParsingManager = new J7.o();
        C9.e action = new C9.e(1, this, r.class, StubApp.getString2(21122), StubApp.getString2(21123), 0, 3);
        Intrinsics.checkNotNullParameter(action, "action");
        routeParsingManager.f3450b = action;
        string22 = StubApp.getString2(21124);
        if (E7.a.a()) {
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto6 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                RouterInterface router2 = g().a().getRouter();
                Intrinsics.checkNotNullExpressionValue(router2, "navigator.router");
                router = new C1059c(router2, this.f17222b, routeParsingManager, new A0.c(this.f17225e));
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto6));
                E7.a.b(string22);
            } finally {
            }
        } else {
            RouterInterface router3 = g().a().getRouter();
            Intrinsics.checkNotNullExpressionValue(router3, "navigator.router");
            router = new C1059c(router3, this.f17222b, routeParsingManager, new A0.c(this.f17225e));
        }
        this.f17244y = router;
        string22 = StubApp.getString2(21125);
        if (E7.a.a()) {
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto7 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                Experimental experimental = g().f9056h;
                if (experimental == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("experimental");
                    experimental = null;
                }
                C0882f c0882f2 = new C0882f(experimental);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto7));
                E7.a.b(string22);
                c0882f = c0882f2;
            } finally {
            }
        } else {
            Experimental experimental2 = g().f9056h;
            if (experimental2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("experimental");
                experimental2 = null;
            }
            c0882f = new C0882f(experimental2);
        }
        this.f17211E = c0882f;
        this.f17223c.f21218a = hVar.f9063a;
        this.f17224d.f21218a = hVar.f9064b;
        this.f17225e.f21218a = hVar.f9065c;
        V8.v navigationSession = new V8.v();
        this.j = navigationSession;
        C1283d stateObserver = new C1283d();
        this.f17230k = stateObserver;
        Intrinsics.checkNotNullParameter(stateObserver, "historyRecordingStateHandler");
        C1281b observer = new C1281b(stateObserver.f17160a.a());
        Intrinsics.checkNotNullParameter(observer, "observer");
        stateObserver.f17162c.add(observer);
        observer.a(stateObserver.f17160a);
        this.f17231l = observer;
        string22 = StubApp.getString2(21126);
        if (E7.a.a()) {
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto8 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                InterfaceC1012b interfaceC1012b = (InterfaceC1012b) MapboxModuleProvider.INSTANCE.createModule(C6.b.f1128g, new A8.a(this, i10));
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto8));
                E7.a.b(string22);
                tripNotification = interfaceC1012b;
            } finally {
            }
        } else {
            tripNotification = (InterfaceC1012b) MapboxModuleProvider.INSTANCE.createModule(C6.b.f1128g, new A8.a(this, i10));
        }
        if (Intrinsics.areEqual(tripNotification.getClass().getName(), "com.mapbox.navigation.trip.notification.internal.MapboxTripNotification")) {
            Field declaredField = tripNotification.getClass().getDeclaredField(StubApp.getString2(21127));
            declaredField.setAccessible(true);
            this.f17207A = declaredField;
        }
        Context applicationContext = this.f17221a.f4277a;
        D9.h threadController2 = this.f17222b;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(tripNotification, "tripNotification");
        Intrinsics.checkNotNullParameter(threadController2, "threadController");
        if (E7.a.a()) {
            string22 = StubApp.getString2(21128);
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto9 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                U8.d dVar4 = new U8.d(applicationContext, tripNotification, threadController2);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto9));
                E7.a.b(string22);
                tripService = dVar4;
            } finally {
            }
        } else {
            tripService = new U8.d(applicationContext, tripNotification, threadController2);
        }
        L7.g locationOptions = this.f17221a.f4287l;
        Intrinsics.checkNotNullParameter(locationOptions, "locationOptions");
        if (E7.a.a()) {
            string22 = StubApp.getString2(21129);
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto10 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                B3.h hVar2 = new B3.h(locationOptions);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto10));
                E7.a.b(string22);
                tripSessionLocationEngine = hVar2;
            } finally {
            }
        } else {
            tripSessionLocationEngine = new B3.h(locationOptions);
        }
        this.f17232m = tripSessionLocationEngine;
        Z8.f navigator = g();
        D9.h threadController3 = this.f17222b;
        Intrinsics.checkNotNullParameter(this.f17221a.f4283g, "<this>");
        Intrinsics.checkNotNullParameter(tripService, "tripService");
        Intrinsics.checkNotNullParameter(tripSessionLocationEngine, "tripSessionLocationEngine");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(threadController3, "threadController");
        if (E7.a.a()) {
            B3.h hVar3 = tripSessionLocationEngine;
            U8.d dVar5 = tripService;
            E7.a.c(StubApp.getString2(21130));
            try {
                long m1480markNowz9LOYto11 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                qVar = new V8.q(dVar5, hVar3, navigator, threadController3, new B3.s(navigator, threadController3));
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto11));
            } finally {
            }
        } else {
            qVar = new V8.q(tripService, tripSessionLocationEngine, navigator, threadController3, new B3.s(navigator, threadController3));
        }
        V8.q tripSession2 = qVar;
        this.f17229i = tripSession2;
        tripSession2.c(this.f17242w);
        Intrinsics.checkNotNullParameter(navigationSession, "stateObserver");
        tripSession2.f7880l.add(navigationSession);
        navigationSession.b(tripSession2.f7886r);
        Intrinsics.checkNotNullParameter(stateObserver, "stateObserver");
        tripSession2.f7880l.add(stateObserver);
        stateObserver.b(tripSession2.f7886r);
        Intrinsics.checkNotNullParameter(router, "router");
        q8.d directionsSession2 = new q8.d(router);
        this.f17228h = directionsSession2;
        Intrinsics.checkNotNullParameter(navigationSession, "routesObserver");
        directionsSession2.f20090b.add(navigationSession);
        q8.g gVar = directionsSession2.f20092d;
        if (gVar != null) {
            navigationSession.a(gVar);
        }
        if (this.f17212F == null) {
            ReachabilityInterface reachabilityInterface = u8.g.f21466a;
            D9.e connectivityHandler = this.f17234o;
            Intrinsics.checkNotNullParameter(connectivityHandler, "connectivityHandler");
            this.f17212F = Long.valueOf(u8.g.f21466a.addListener(connectivityHandler));
        }
        L7.m mVar = this.f17221a.f4288m;
        Intrinsics.checkNotNullParameter(tripSession2, "tripSession");
        C1464a arrivalProgressObserver = new C1464a(tripSession2);
        this.f17238s = arrivalProgressObserver;
        C1145A arrivalController = new C1145A(20);
        Intrinsics.checkNotNullParameter(arrivalController, "arrivalController");
        tripSession2.c(arrivalProgressObserver);
        I4.e skuIdProvider = new I4.e(i11);
        int ordinal4 = u8.k.f21475a.ordinal();
        if (ordinal4 == 0) {
            pair3 = TuplesKt.to(StubApp.getString2(2158), StubApp.getString2(2159));
        } else {
            if (ordinal4 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            pair3 = TuplesKt.to(StubApp.getString2(2156), StubApp.getString2(2157));
        }
        SdkInformation sdkInformation = new SdkInformation((String) pair3.component1(), StubApp.getString2(2160), (String) pair3.component2());
        Intrinsics.checkNotNullParameter(navigationSession, "navigationSession");
        Intrinsics.checkNotNullParameter(tripSession2, "tripSession");
        Intrinsics.checkNotNullParameter(arrivalProgressObserver, "arrivalProgressObserver");
        Intrinsics.checkNotNullParameter(skuIdProvider, "skuIdProvider");
        Intrinsics.checkNotNullParameter(sdkInformation, "sdkInformation");
        if (E7.a.a()) {
            string22 = StubApp.getString2(21131);
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto12 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                aVar = new B6.a(navigationSession, arrivalProgressObserver, tripSession2, skuIdProvider, sdkInformation);
                tripSession = tripSession2;
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto12));
                E7.a.b(string22);
            } finally {
            }
        } else {
            aVar = new B6.a(navigationSession, arrivalProgressObserver, tripSession2, skuIdProvider, sdkInformation);
            tripSession = tripSession2;
        }
        this.f17233n = aVar;
        Z8.f nativeNavigator = g();
        Intrinsics.checkNotNullParameter(tripSession, "tripSession");
        Intrinsics.checkNotNullParameter(nativeNavigator, "nativeNavigator");
        if (E7.a.a()) {
            string22 = StubApp.getString2(21132);
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto13 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                Z9.q qVar4 = new Z9.q(tripSession, nativeNavigator);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto13));
                E7.a.b(string22);
                qVar2 = qVar4;
            } finally {
            }
        } else {
            qVar2 = new Z9.q(tripSession, nativeNavigator);
        }
        this.f17217K = qVar2;
        I4.e eVar = new I4.e(17);
        com.mapbox.navigation.base.route.l options = this.f17221a.f4284h;
        Z8.f navigator2 = g();
        D9.h threadController4 = this.f17222b;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(navigator2, "navigator");
        Intrinsics.checkNotNullParameter(tripSession, "tripSession");
        Intrinsics.checkNotNullParameter(threadController4, "threadController");
        Intrinsics.checkNotNullParameter(routeParsingManager, "routeParsingManager");
        Intrinsics.checkNotNullParameter(directionsSession2, "directionsSession");
        if (E7.a.a()) {
            string22 = StubApp.getString2(21133);
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto14 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                iVar = new P8.i(options, navigator2, tripSession, threadController4, routeParsingManager, directionsSession2);
                qVar3 = tripSession;
                directionsSession = directionsSession2;
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto14));
                E7.a.b(string22);
            } finally {
            }
        } else {
            iVar = new P8.i(options, navigator2, tripSession, threadController4, routeParsingManager, directionsSession2);
            qVar3 = tripSession;
            directionsSession = directionsSession2;
        }
        P8.i iVar2 = iVar;
        this.f17237r = iVar2;
        iVar2.i(new A9.m(4, iVar2, new C9.e(1, this, r.class, StubApp.getString2(21134), StubApp.getString2(21135), 0, 4)));
        Rb.d additionalContext = Vb.q.f7968a;
        Rb.d additionalContext2 = additionalContext.f6359c;
        com.mapbox.navigation.base.route.n routeRefreshOptions = this.f17221a.f4282f;
        v routesProgressDataProvider = this.f17242w;
        Y.m evDynamicDataHolder = this.f17243x;
        D9.k timeProvider = D9.k.f1527a;
        Intrinsics.checkNotNullParameter(additionalContext, "dispatcher");
        Intrinsics.checkNotNullParameter(additionalContext2, "immediateDispatcher");
        Intrinsics.checkNotNullParameter(routeRefreshOptions, "routeRefreshOptions");
        Intrinsics.checkNotNullParameter(directionsSession, "directionsSession");
        Intrinsics.checkNotNullParameter(routesProgressDataProvider, "routesProgressDataProvider");
        Intrinsics.checkNotNullParameter(evDynamicDataHolder, "evDynamicDataHolder");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        R8.y routeRefresher = new R8.y(new C0879c(routesProgressDataProvider), new C0366a(evDynamicDataHolder), new C2.i(), directionsSession);
        L0 parentJob = L.b();
        long j = routeRefreshOptions.f12514a;
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        Intrinsics.checkNotNullParameter(additionalContext, "additionalContext");
        Vb.f scope2 = J.a(CoroutineContext.Element.DefaultImpls.plus(new L0(parentJob), additionalContext));
        Intrinsics.checkNotNullParameter(routeRefresher, "routeRefresher");
        Intrinsics.checkNotNullParameter(scope2, "scope");
        R8.B routeRefresherExecutor = new R8.B();
        routeRefresherExecutor.f6252b = routeRefresher;
        routeRefresherExecutor.f6251a = j;
        routeRefresherExecutor.f6253c = scope2;
        Z9.C stateHolder = new Z9.C(23, (byte) 0);
        E0 e04 = new E0(20);
        R8.D listener = new R8.D(stateHolder, e04, new s2.d(C0251i.f6302a), routeRefreshOptions.f12514a * 3);
        E0 attemptListener = new E0(e04);
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        Intrinsics.checkNotNullParameter(additionalContext2, "additionalContext");
        Vb.f parentScope = J.a(CoroutineContext.Element.DefaultImpls.plus(new L0(parentJob), additionalContext2));
        D9.k timeProvider2 = D9.k.f1527a;
        Intrinsics.checkNotNullParameter(routeRefresherExecutor, "routeRefresherExecutor");
        q8.d dVar6 = directionsSession;
        Intrinsics.checkNotNullParameter(routeRefreshOptions, "routeRefreshOptions");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(attemptListener, "attemptListener");
        Intrinsics.checkNotNullParameter(timeProvider2, "timeProvider");
        long j3 = routeRefreshOptions.f12514a;
        D9.k timeProvider3 = D9.k.f1527a;
        Intrinsics.checkNotNullParameter(timeProvider3, "timeProvider");
        Lc.e delayer = new Lc.e();
        delayer.f4404a = j3;
        delayer.f4405b = j3;
        i2.o retryStrategy = new i2.o();
        Intrinsics.checkNotNullParameter(routeRefresherExecutor, "routeRefresherExecutor");
        Intrinsics.checkNotNullParameter(delayer, "delayer");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(attemptListener, "attemptListener");
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        Intrinsics.checkNotNullParameter(retryStrategy, "retryStrategy");
        A3.s sVar = new A3.s();
        sVar.f189a = routeRefresherExecutor;
        sVar.f190b = delayer;
        sVar.f191c = stateHolder;
        sVar.f192d = listener;
        sVar.f193e = attemptListener;
        sVar.f194f = parentScope;
        sVar.f195g = retryStrategy;
        sVar.f196h = D9.l.i(parentScope);
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        Intrinsics.checkNotNullParameter(additionalContext, "additionalContext");
        C0250h c0250h = new C0250h(parentJob, sVar, new F5.c(routeRefresherExecutor, stateHolder, J.a(CoroutineContext.Element.DefaultImpls.plus(new L0(parentJob), additionalContext)), listener, attemptListener), stateHolder, e04, listener);
        this.f17210D = c0250h;
        C1285f observer2 = new C1285f(this);
        Intrinsics.checkNotNullParameter(observer2, "observer");
        E0 e05 = (E0) c0250h.f6300e;
        Intrinsics.checkNotNullParameter(observer2, "observer");
        ((CopyOnWriteArraySet) e05.f16037b).add(observer2);
        Intrinsics.checkNotNullParameter(this, "<this>");
        RerouteControllerInterface rerouteController = g().a().getRerouteController();
        Intrinsics.checkNotNullParameter(this, "<this>");
        RerouteDetectorInterface rerouteDetector = g().a().getRerouteDetector();
        if (rerouteController == null || rerouteDetector == null) {
            i3 = AbstractC0378a.i(dVar6, qVar3, eVar, this.f17221a.b(), this.f17222b, this.f17243x);
            dVar = dVar6;
        } else {
            Intrinsics.checkNotNullParameter(this, "<this>");
            i3 = new O8.p(g(), rerouteController, rerouteDetector, new Vb.l(dVar6), new E9.q(this, i12), this.f17227g.a(), W.a(), new A0.c(this.f17225e));
            dVar = dVar6;
        }
        V8.q qVar5 = qVar3;
        this.f17208B = i3;
        C0515q e12 = e();
        C1286g d8 = d();
        qVar5.b(c());
        qVar5.e(d8, i3);
        Unit unit4 = Unit.INSTANCE;
        j(e12);
        j(new h(c0250h));
        l();
        Intrinsics.checkNotNullParameter(g(), "navigator");
        Intrinsics.checkNotNullParameter(g(), "navigator");
        string22 = StubApp.getString2(21136);
        if (E7.a.a()) {
            E7.a.c(string22);
            try {
                long m1480markNowz9LOYto15 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                L7.l routingTilesOptions2 = this.f17221a.f4279c;
                CacheHandle cacheHandle = g().f9057i;
                if (cacheHandle != null) {
                    cache = cacheHandle;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("cache");
                    cache = null;
                }
                u5.d nativeFactoryWrapper = new u5.d(10);
                Intrinsics.checkNotNullParameter(routingTilesOptions2, "routingTilesOptions");
                Intrinsics.checkNotNullParameter(cache, "cache");
                Intrinsics.checkNotNullParameter(nativeFactoryWrapper, "nativeFactoryWrapper");
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto15));
            } finally {
            }
        } else {
            L7.l routingTilesOptions3 = this.f17221a.f4279c;
            CacheHandle cacheHandle2 = g().f9057i;
            if (cacheHandle2 != null) {
                cache2 = cacheHandle2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("cache");
                cache2 = null;
            }
            u5.d nativeFactoryWrapper2 = new u5.d(10);
            Intrinsics.checkNotNullParameter(routingTilesOptions3, "routingTilesOptions");
            Intrinsics.checkNotNullParameter(cache2, "cache");
            Intrinsics.checkNotNullParameter(nativeFactoryWrapper2, "nativeFactoryWrapper");
        }
        new Q2.g(g());
        this.f17215I = I4.e.n(this.f17221a.a(), g());
        AbstractC0378a.k(this.f17221a.f4279c, aVar4.a());
        v routeProgressObserver = AbstractC0378a.c(dVar, new d.y(this));
        Intrinsics.checkNotNullParameter(routeProgressObserver, "routeProgressObserver");
        qVar5.c(routeProgressObserver);
        this.f17226f.a(this.f17245z);
        this.f17220N = LazyKt.lazy(new j(this, 0));
    }

    public static final void a(r rVar, boolean z2, String str) {
        rVar.getClass();
        D9.l.d(StubApp.getString2(21138) + z2 + StubApp.getString2(21139) + str, StubApp.getString2(6668));
        L.j(rVar.f17227g.f1513b, null, new n(rVar, z2, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(m8.r r4, java.util.List r5, m8.G r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof m8.q
            if (r0 == 0) goto L13
            r0 = r7
            m8.q r0 = (m8.q) r0
            int r1 = r0.f17205d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17205d = r1
            goto L18
        L13:
            m8.q r0 = new m8.q
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f17203b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17205d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2b
            m8.r r4 = r0.f17202a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L48
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r5 = 275(0x113, float:3.85E-43)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f17202a = r4
            r0.f17205d = r3
            V8.q r7 = r4.f17229i
            java.lang.Object r7 = r7.g(r5, r6, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r5 = r7
            V8.s r5 = (V8.s) r5
            boolean r6 = r5 instanceof V8.t
            if (r6 == 0) goto L5a
            P8.i r4 = r4.f17237r
            V8.t r5 = (V8.t) r5
            java.util.List r6 = r5.f7896a
            java.util.List r5 = r5.f7897b
            r4.f(r6, r5)
        L5a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.r.b(m8.r, java.util.List, m8.G, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final V8.h c() {
        return new V8.h(this, 1);
    }

    public final C1286g d() {
        return new C1286g(this);
    }

    public final C0515q e() {
        return new C0515q(this, 1);
    }

    public final TilesConfig f(String str, boolean z2) {
        String str2;
        L7.i iVar = this.f17221a;
        Context applicationContext = iVar.f4277a;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        L7.l options = iVar.f4279c;
        Intrinsics.checkNotNullParameter(options, "options");
        String absolutePath = new File(applicationContext.getFilesDir(), StubApp.getString2(21140)).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(applicationContext.…ATH_SUB_DIR).absolutePath");
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean exists = file.exists();
        String string2 = StubApp.getString2(21141);
        if (exists) {
            D9.l.f(StubApp.getString2(692) + file.length() + StubApp.getString2(693), string2);
            str2 = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(str2, "{\n            logI(\"Init…ir.absolutePath\n        }");
        } else {
            D9.l.e(StubApp.getString2(21142) + file.getAbsolutePath(), string2);
            str2 = "";
        }
        return new TilesConfig(str2, G7.a.f2450a.a(), null, null, new TileEndpointConfiguration(options.f4290a.toString(), StubApp.getString2(21143), str, z2, "", 56), null);
    }

    public final Z8.f g() {
        Z8.f fVar = this.f17219M;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException(StubApp.getString2(21144));
    }

    public final void h(List list, G g10, C0379a c0379a) {
        if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(21145));
            sb2.append(Ec.l.r(g10));
            sb2.append(StubApp.getString2(21146));
            ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.mapbox.navigation.base.route.g) it.next()).f12506i);
            }
            sb2.append(arrayList);
            D9.l.f(sb2.toString(), StubApp.getString2(6668));
        }
        q8.f params = new q8.f(list);
        q8.d dVar = this.f17228h;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Iterator it2 = dVar.f20091c.iterator();
        if (it2.hasNext()) {
            throw com.mapbox.common.b.e(it2);
        }
        if (Intrinsics.areEqual(g10, C1278B.f17148a) ? true : g10 instanceof C1279C ? true : g10 instanceof F ? true : g10 instanceof E) {
            Oc.a aVar = this.f17208B;
            if (aVar != null) {
                aVar.u();
            }
        } else if (!(g10 instanceof D)) {
            boolean z2 = g10 instanceof C1277A;
        }
        L.j(this.f17222b.a().f1513b, Vb.q.f7968a.f6359c, new i(this, g10, list, c0379a, null), 2);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final void i() {
        List<Pair> list;
        List<Pair> list2;
        if (this.f17218L) {
            return;
        }
        D9.l.d(StubApp.getString2(7369), StubApp.getString2(6668));
        this.f17226f.k(this.f17245z);
        Y8.d dVar = this.f17215I;
        dVar.f8839a.unregisterReceiver(dVar.f8841c);
        B6.a aVar = this.f17233n;
        V8.v vVar = (V8.v) aVar.f667a;
        n8.b navigationSessionStateObserver = (n8.b) aVar.f673g;
        Intrinsics.checkNotNullParameter(navigationSessionStateObserver, "navigationSessionStateObserver");
        vVar.f7899a.remove(navigationSessionStateObserver);
        C1464a c1464a = (C1464a) aVar.f668b;
        C0517s arrivalObserver = (C0517s) aVar.f674h;
        Intrinsics.checkNotNullParameter(arrivalObserver, "arrivalObserver");
        c1464a.f18386b.remove(arrivalObserver);
        SessionSKUIdentifier i3 = aVar.i();
        if (i3 != null) {
            ((BillingService) ((C0366a) aVar.f672f).f9105b).stopBillingSession(i3);
            if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
                D9.l.f(L1.h(i3).concat(StubApp.getString2(21147)), StubApp.getString2(647));
            }
        }
        C1059c c1059c = this.f17228h.f20089a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c1059c.f14845d;
        list = MapsKt___MapsKt.toList(linkedHashMap);
        for (Pair pair : list) {
            long longValue = ((Number) pair.component1()).longValue();
            E8.e eVar = (E8.e) pair.component2();
            eVar.f1942b.invoke();
            linkedHashMap.remove(Long.valueOf(longValue));
            InterfaceC0221t0 interfaceC0221t0 = eVar.f1941a;
            if (interfaceC0221t0 != null) {
                interfaceC0221t0.d(null);
            }
        }
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c1059c.f14846e;
        list2 = MapsKt___MapsKt.toList(linkedHashMap2);
        for (Pair pair2 : list2) {
            long longValue2 = ((Number) pair2.component1()).longValue();
            E8.e eVar2 = (E8.e) pair2.component2();
            eVar2.f1942b.invoke();
            linkedHashMap2.remove(Long.valueOf(longValue2));
            InterfaceC0221t0 interfaceC0221t02 = eVar2.f1941a;
            if (interfaceC0221t02 != null) {
                interfaceC0221t02.d(null);
            }
        }
        c1059c.j().cancelAll();
        this.f17228h.f20090b.clear();
        Q2.g gVar = this.f17241v;
        Iterator it = CollectionsKt.toList((LinkedHashSet) gVar.f5713d).iterator();
        while (it.hasNext()) {
            gVar.w(((Number) it.next()).longValue());
        }
        Iterator it2 = ((LinkedHashMap) gVar.f5712c).keySet().iterator();
        while (it2.hasNext()) {
            gVar.w(((Number) it2.next()).longValue());
        }
        this.f17229i.h();
        this.f17229i.f7878i.clear();
        this.f17229i.j.clear();
        this.f17229i.f7879k.clear();
        this.f17229i.f7880l.clear();
        this.f17229i.f7881m.clear();
        this.f17229i.f7882n.clear();
        B3.s sVar = this.f17229i.f7873d;
        ((CopyOnWriteArraySet) sVar.f652d).clear();
        Z8.f fVar = (Z8.f) sVar.f651c;
        fVar.a().setElectronicHorizonObserver(null);
        Z9.q roadObjectsStoreObserver = (Z9.q) sVar.f654f;
        Intrinsics.checkNotNullParameter(roadObjectsStoreObserver, "roadObjectsStoreObserver");
        RoadObjectsStore roadObjectsStore = fVar.f9055g;
        String string2 = StubApp.getString2(21148);
        if (roadObjectsStore == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            roadObjectsStore = null;
        }
        roadObjectsStore.removeObserver(roadObjectsStoreObserver);
        V8.q qVar = this.f17229i;
        qVar.f7883o.clear();
        qVar.f7872c.a().setFallbackVersionsObserver(null);
        V8.q qVar2 = this.f17229i;
        qVar2.f7888t = null;
        Q2.g gVar2 = qVar2.f7893y;
        if (gVar2 != null) {
            ((Oc.a) gVar2.f5712c).U((C0353e) gVar2.f5713d);
        }
        qVar2.f7893y = null;
        B3.h hVar = this.f17232m;
        hVar.getClass();
        LocationServiceFactory.getOrCreate().setUserDefinedDeviceLocationProviderFactory(null);
        ((HandlerThread) hVar.f616g).quit();
        P8.i iVar = this.f17237r;
        ((RouteAlternativesControllerInterface) iVar.f5636i).removeAllObservers();
        iVar.f5637k = null;
        K0 k02 = (K0) iVar.f5635h;
        if (k02 != null) {
            k02.d(null);
        }
        ((CopyOnWriteArraySet) this.f17217K.f9143b).clear();
        h(CollectionsKt.emptyList(), C1278B.f17148a, null);
        g().a().reset(null);
        Z8.f g10 = g();
        g10.f();
        RoadObjectsStore roadObjectsStore2 = g10.f9055g;
        if (roadObjectsStore2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            roadObjectsStore2 = null;
        }
        roadObjectsStore2.removeAllCustomRoadObjects();
        g10.f9061n.clear();
        g().a().shutdown();
        this.f17209C.clear();
        this.f17238s.f18386b.clear();
        this.j.f7899a.clear();
        this.f17230k.f17161b.clear();
        this.f17230k.f17162c.clear();
        this.f17231l.f17154a.clear();
        C0250h c0250h = this.f17210D;
        E0 e02 = (E0) c0250h.f6300e;
        ((CopyOnWriteArraySet) e02.f16037b).clear();
        ((CopyOnWriteArraySet) e02.f16038c).clear();
        ((CopyOnWriteArraySet) ((Z9.C) c0250h.f6299d).f9077b).clear();
        ((L0) c0250h.f6296a).d(null);
        ((CopyOnWriteArrayList) this.f17239t.f654f).clear();
        L.e(this.f17222b.f1517a);
        L.e(this.f17222b.f1518b);
        Long l9 = this.f17212F;
        if (l9 != null) {
            u8.g.f21466a.removeListener(l9.longValue());
            this.f17212F = null;
        }
        AdasisFacadeHandle adasisFacadeHandle = g().f9059l;
        if (adasisFacadeHandle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adasisFacade");
            adasisFacadeHandle = null;
        }
        adasisFacadeHandle.resetAdasisMessageCallback();
        Iterator it3 = this.f17214H.iterator();
        while (it3.hasNext()) {
            ((C1739a) it3.next()).f21221d.clear();
        }
        i8.d dVar2 = i8.d.f14937a;
        android.support.v4.media.session.b.i();
        this.f17219M = null;
        this.f17218L = true;
        f17206O = false;
    }

    public final void j(q8.e routesObserver) {
        Intrinsics.checkNotNullParameter(routesObserver, "routesObserver");
        D9.f a3 = this.f17222b.a();
        L.j(a3.f1513b, Vb.q.f7968a.f6359c, new o(this, routesObserver, null), 2);
    }

    public final void k(List routes, int i3, C0379a c0379a) {
        G e10;
        G g10;
        Intrinsics.checkNotNullParameter(routes, "routes");
        if (!routes.isEmpty()) {
            com.mapbox.navigation.base.route.g navigationRoute = (com.mapbox.navigation.base.route.g) CollectionsKt.first(routes);
            B6.a aVar = this.f17233n;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(navigationRoute, "navigationRoute");
            SessionSKUIdentifier i10 = aVar.i();
            if (i10 == SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP) {
                P7.b bVar = ((V8.q) aVar.f669c).f7890v;
                ArrayList h2 = bVar == null ? null : B6.a.h(bVar.f5562a, new A8.a(bVar, 13));
                ArrayList h4 = B6.a.h(navigationRoute, new C1064b(i3, 1, aVar));
                if (h2 != null && !h2.isEmpty() && !h4.isEmpty() && h2.size() == h4.size()) {
                    int i11 = 0;
                    for (Object obj : h2) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (Y3.a.i((Point) obj, (Point) h4.get(i11), StubApp.getString2(2712)) <= 100.0d) {
                            i11 = i12;
                        }
                    }
                }
                SessionSKUIdentifier sessionSKUIdentifier = SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP;
                C0366a c0366a = (C0366a) aVar.f672f;
                BillingSessionStatus sessionStatus = ((BillingService) c0366a.f9105b).getSessionStatus(sessionSKUIdentifier);
                Intrinsics.checkNotNullExpressionValue(sessionStatus, "billingService.getSessionStatus(skuIdentifier)");
                boolean z2 = sessionStatus == BillingSessionStatus.SESSION_PAUSED;
                aVar.b(sessionSKUIdentifier, 0L, StubApp.getString2(21149) + h2 + StubApp.getString2(21150) + h4);
                if (z2) {
                    ((BillingService) c0366a.f9105b).pauseBillingSession(sessionSKUIdentifier);
                    if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
                        D9.l.f(L1.h(i10).concat(StubApp.getString2(21151)), StubApp.getString2(647));
                    }
                }
            }
        }
        if (routes.isEmpty()) {
            g10 = C1278B.f17148a;
        } else {
            Object first = CollectionsKt.first((List<? extends Object>) routes);
            q8.d dVar = this.f17228h;
            if (Intrinsics.areEqual(first, CollectionsKt.firstOrNull(dVar.a()))) {
                e10 = new C1277A(i3);
            } else {
                List a3 = dVar.a();
                ArrayList arrayList = new ArrayList(CollectionsKt.f(a3));
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.mapbox.navigation.base.route.g) it.next()).f12506i);
                }
                e10 = arrayList.contains(((com.mapbox.navigation.base.route.g) CollectionsKt.first(routes)).f12506i) ? new E(i3) : new C1279C(i3);
            }
            g10 = e10;
        }
        h(routes, g10, c0379a);
    }

    public final void l() {
        t observer = this.f17236q;
        j(observer);
        Intrinsics.checkNotNullParameter(observer, "observer");
        B3.s sVar = this.f17239t;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(observer, "observer");
        ((CopyOnWriteArrayList) sVar.f654f).add(observer);
        L8.f fVar = (L8.f) sVar.f653e;
        if (fVar != null) {
            observer.b(fVar);
        }
    }
}
