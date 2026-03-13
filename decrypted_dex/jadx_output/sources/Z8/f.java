package Z8;

import Qb.C0203k;
import com.mapbox.navigator.AdasisFacadeBuilder;
import com.mapbox.navigator.AdasisFacadeHandle;
import com.mapbox.navigator.BillingProductType;
import com.mapbox.navigator.CacheFactory;
import com.mapbox.navigator.CacheHandle;
import com.mapbox.navigator.ConfigHandle;
import com.mapbox.navigator.Experimental;
import com.mapbox.navigator.GraphAccessor;
import com.mapbox.navigator.HistoryRecorderHandle;
import com.mapbox.navigator.InputsServiceHandle;
import com.mapbox.navigator.Navigator;
import com.mapbox.navigator.NavigatorObserver;
import com.mapbox.navigator.RoadObjectMatcher;
import com.mapbox.navigator.RoadObjectMatcherConfig;
import com.mapbox.navigator.RoadObjectsStore;
import com.mapbox.navigator.RouteAlternativesControllerInterface;
import com.mapbox.navigator.RouterType;
import com.mapbox.navigator.SetRoutesParams;
import com.mapbox.navigator.SetRoutesReason;
import com.mapbox.navigator.Telemetry;
import com.mapbox.navigator.TilesConfig;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final HistoryRecorderHandle f9049a;

    /* renamed from: b, reason: collision with root package name */
    public final RoadObjectMatcherConfig f9050b;

    /* renamed from: c, reason: collision with root package name */
    public final ConfigHandle f9051c;

    /* renamed from: d, reason: collision with root package name */
    public final E0 f9052d;

    /* renamed from: e, reason: collision with root package name */
    public Navigator f9053e;

    /* renamed from: f, reason: collision with root package name */
    public RoadObjectMatcher f9054f;

    /* renamed from: g, reason: collision with root package name */
    public RoadObjectsStore f9055g;

    /* renamed from: h, reason: collision with root package name */
    public Experimental f9056h;

    /* renamed from: i, reason: collision with root package name */
    public CacheHandle f9057i;
    public RouteAlternativesControllerInterface j;

    /* renamed from: k, reason: collision with root package name */
    public Telemetry f9058k;

    /* renamed from: l, reason: collision with root package name */
    public AdasisFacadeHandle f9059l;

    /* renamed from: m, reason: collision with root package name */
    public final InputsServiceHandle f9060m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet f9061n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f9062o;

    public f(TilesConfig tilesConfig, HistoryRecorderHandle historyRecorderHandle, RoadObjectMatcherConfig roadObjectMatcherConfig, ConfigHandle config, E0 eventsMetadataProvider) {
        Intrinsics.checkNotNullParameter(tilesConfig, "tilesConfig");
        Intrinsics.checkNotNullParameter(roadObjectMatcherConfig, "roadObjectMatcherConfig");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(eventsMetadataProvider, "eventsMetadataProvider");
        this.f9049a = historyRecorderHandle;
        this.f9050b = roadObjectMatcherConfig;
        this.f9051c = config;
        this.f9052d = eventsMetadataProvider;
        Intrinsics.checkNotNullParameter(config, "config");
        InputsServiceHandle build = InputsServiceHandle.build(config, historyRecorderHandle);
        Intrinsics.checkNotNullExpressionValue(build, "build(config, historyRecorder)");
        this.f9060m = build;
        this.f9061n = new CopyOnWriteArraySet();
        b(tilesConfig);
        this.f9062o = new ArrayList();
    }

    public final Navigator a() {
        Navigator navigator = this.f9053e;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void b(TilesConfig tilesConfig) {
        String string2;
        CacheHandle build;
        AdasisFacadeHandle build2;
        AdasisFacadeHandle adasisFacadeHandle;
        Navigator navigator;
        GraphAccessor graphAccessor;
        RoadObjectMatcher roadObjectMatcher;
        RoadObjectsStore roadObjectsStore;
        Experimental experimental;
        RouteAlternativesControllerInterface routeAlternativesControllerInterface;
        Telemetry telemetry;
        AdasisFacadeHandle adasisFacadeHandle2;
        E7.a aVar = E7.a.f1927a;
        boolean a3 = E7.a.a();
        String string22 = StubApp.getString2(7647);
        String string23 = StubApp.getString2(7648);
        String string24 = StubApp.getString2(2448);
        HistoryRecorderHandle historyRecorderHandle = this.f9049a;
        ConfigHandle configHandle = this.f9051c;
        if (a3) {
            string2 = StubApp.getString2(7649);
            E7.a.c(string2);
            try {
                long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                Intrinsics.checkNotNullParameter(configHandle, string24);
                Intrinsics.checkNotNullParameter(tilesConfig, string23);
                build = CacheFactory.build(tilesConfig, configHandle, historyRecorderHandle, BillingProductType.CF);
                Intrinsics.checkNotNullExpressionValue(build, string22);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
                E7.a.b(string2);
            } finally {
            }
        } else {
            Intrinsics.checkNotNullParameter(configHandle, string24);
            Intrinsics.checkNotNullParameter(tilesConfig, string23);
            build = CacheFactory.build(tilesConfig, configHandle, historyRecorderHandle, BillingProductType.CF);
            Intrinsics.checkNotNullExpressionValue(build, string22);
        }
        CacheHandle cacheHandle = build;
        if (E7.a.a()) {
            string2 = StubApp.getString2(7650);
            E7.a.c(string2);
            try {
                long m1480markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                build2 = AdasisFacadeBuilder.build(configHandle, cacheHandle, historyRecorderHandle);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto2));
                E7.a.b(string2);
            } finally {
            }
        } else {
            build2 = AdasisFacadeBuilder.build(configHandle, cacheHandle, historyRecorderHandle);
        }
        Intrinsics.checkNotNullExpressionValue(build2, "PerformanceTracker.track…orderComposite)\n        }");
        this.f9059l = build2;
        boolean a9 = E7.a.a();
        String string25 = StubApp.getString2(7651);
        String string26 = StubApp.getString2(7652);
        String string27 = StubApp.getString2(7653);
        if (a9) {
            E7.a.c(StubApp.getString2(7654));
            try {
                long m1480markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                ConfigHandle configHandle2 = this.f9051c;
                HistoryRecorderHandle historyRecorderHandle2 = this.f9049a;
                InputsServiceHandle inputsServiceHandle = this.f9060m;
                AdasisFacadeHandle adasisFacadeHandle3 = this.f9059l;
                if (adasisFacadeHandle3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string27);
                    adasisFacadeHandle = null;
                } else {
                    adasisFacadeHandle = adasisFacadeHandle3;
                }
                Intrinsics.checkNotNullParameter(cacheHandle, string26);
                Intrinsics.checkNotNullParameter(configHandle2, string24);
                Intrinsics.checkNotNullParameter(inputsServiceHandle, string25);
                Intrinsics.checkNotNullParameter(adasisFacadeHandle, string27);
                navigator = new Navigator(configHandle2, cacheHandle, historyRecorderHandle2, RouterType.HYBRID, inputsServiceHandle, adasisFacadeHandle, null);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto3));
            } catch (Throwable th) {
                throw th;
            }
        } else {
            AdasisFacadeHandle adasisFacadeHandle4 = this.f9059l;
            if (adasisFacadeHandle4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string27);
                adasisFacadeHandle2 = null;
            } else {
                adasisFacadeHandle2 = adasisFacadeHandle4;
            }
            Intrinsics.checkNotNullParameter(cacheHandle, string26);
            ConfigHandle configHandle3 = this.f9051c;
            Intrinsics.checkNotNullParameter(configHandle3, string24);
            InputsServiceHandle inputsServiceHandle2 = this.f9060m;
            Intrinsics.checkNotNullParameter(inputsServiceHandle2, string25);
            Intrinsics.checkNotNullParameter(adasisFacadeHandle2, string27);
            navigator = new Navigator(configHandle3, cacheHandle, this.f9049a, RouterType.HYBRID, inputsServiceHandle2, adasisFacadeHandle2, null);
        }
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.f9053e = navigator;
        Intrinsics.checkNotNullParameter(cacheHandle, "<set-?>");
        this.f9057i = cacheHandle;
        if (E7.a.a()) {
            string2 = StubApp.getString2(7655);
            E7.a.c(string2);
            try {
                long m1480markNowz9LOYto4 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                GraphAccessor graphAccessor2 = new GraphAccessor(cacheHandle);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto4));
                E7.a.b(string2);
                graphAccessor = graphAccessor2;
            } finally {
            }
        } else {
            graphAccessor = new GraphAccessor(cacheHandle);
        }
        Intrinsics.checkNotNullParameter(graphAccessor, "<set-?>");
        boolean a10 = E7.a.a();
        RoadObjectMatcherConfig roadObjectMatcherConfig = this.f9050b;
        if (a10) {
            string2 = StubApp.getString2(7656);
            E7.a.c(string2);
            try {
                long m1480markNowz9LOYto5 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                RoadObjectMatcher roadObjectMatcher2 = new RoadObjectMatcher(cacheHandle, roadObjectMatcherConfig);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto5));
                E7.a.b(string2);
                roadObjectMatcher = roadObjectMatcher2;
            } finally {
            }
        } else {
            roadObjectMatcher = new RoadObjectMatcher(cacheHandle, roadObjectMatcherConfig);
        }
        Intrinsics.checkNotNullParameter(roadObjectMatcher, "<set-?>");
        this.f9054f = roadObjectMatcher;
        if (E7.a.a()) {
            string2 = StubApp.getString2(7657);
            E7.a.c(string2);
            try {
                long m1480markNowz9LOYto6 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                RoadObjectsStore roadObjectStore = a().roadObjectStore();
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto6));
                E7.a.b(string2);
                roadObjectsStore = roadObjectStore;
            } finally {
            }
        } else {
            roadObjectsStore = a().roadObjectStore();
        }
        Intrinsics.checkNotNullExpressionValue(roadObjectsStore, "PerformanceTracker.track…adObjectStore()\n        }");
        Intrinsics.checkNotNullParameter(roadObjectsStore, "<set-?>");
        this.f9055g = roadObjectsStore;
        if (E7.a.a()) {
            string2 = StubApp.getString2(7658);
            E7.a.c(string2);
            try {
                long m1480markNowz9LOYto7 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                Experimental experimental2 = a().getExperimental();
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto7));
                E7.a.b(string2);
                experimental = experimental2;
            } finally {
            }
        } else {
            experimental = a().getExperimental();
        }
        Intrinsics.checkNotNullExpressionValue(experimental, "PerformanceTracker.track…or.experimental\n        }");
        Intrinsics.checkNotNullParameter(experimental, "<set-?>");
        this.f9056h = experimental;
        if (E7.a.a()) {
            string2 = StubApp.getString2(7659);
            E7.a.c(string2);
            try {
                long m1480markNowz9LOYto8 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                RouteAlternativesControllerInterface routeAlternativesController = a().getRouteAlternativesController();
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto8));
                E7.a.b(string2);
                routeAlternativesControllerInterface = routeAlternativesController;
            } finally {
            }
        } else {
            routeAlternativesControllerInterface = a().getRouteAlternativesController();
        }
        Intrinsics.checkNotNullExpressionValue(routeAlternativesControllerInterface, "PerformanceTracker.track…tivesController\n        }");
        Intrinsics.checkNotNullParameter(routeAlternativesControllerInterface, "<set-?>");
        this.j = routeAlternativesControllerInterface;
        boolean a11 = E7.a.a();
        E0 e02 = this.f9052d;
        if (a11) {
            string2 = StubApp.getString2(7660);
            E7.a.c(string2);
            try {
                long m1480markNowz9LOYto9 = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                Telemetry telemetry2 = a().getTelemetry(e02);
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto9));
                E7.a.b(string2);
                telemetry = telemetry2;
            } finally {
            }
        } else {
            telemetry = a().getTelemetry(e02);
        }
        Intrinsics.checkNotNullExpressionValue(telemetry, "PerformanceTracker.track…tadataProvider)\n        }");
        Intrinsics.checkNotNullParameter(telemetry, "<set-?>");
        this.f9058k = telemetry;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.mapbox.navigation.base.route.g r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z8.f.c(com.mapbox.navigation.base.route.g, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object d(com.mapbox.navigation.base.route.g gVar, int i3, List list, SetRoutesReason setRoutesReason, ContinuationImpl continuationImpl) {
        SetRoutesParams setRoutesParams;
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuationImpl));
        c0203k.s();
        Navigator a3 = a();
        if (gVar != null) {
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.mapbox.navigation.base.route.g gVar2 = (com.mapbox.navigation.base.route.g) it.next();
                Intrinsics.checkNotNullParameter(gVar2, "<this>");
                arrayList.add(gVar2.f12501d);
            }
            setRoutesParams = new SetRoutesParams(gVar.f12501d, i3, arrayList);
        } else {
            setRoutesParams = null;
        }
        a3.setRoutes(setRoutesParams, setRoutesReason, new O8.e(c0203k));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return r8;
    }

    public final void e(ArrayList languages) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        a().config().mutableSettings().setUserLanguages(languages);
    }

    public final void f() {
        a().setElectronicHorizonObserver(null);
        a().setFallbackVersionsObserver(null);
        ArrayList arrayList = this.f9062o;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a().removeObserver((NavigatorObserver) it.next());
        }
        arrayList.clear();
    }
}
