package b3;

import D5.C0043g;
import Qb.K0;
import Qb.W;
import R8.C0250h;
import Xa.AbstractActivityC0364d;
import a.AbstractC0378a;
import android.animation.AnimatorSet;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0444t;
import com.even.navigate.service.NavigationForegroundService;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.L1;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.AccuracyLevel;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.IntervalSettings;
import com.mapbox.common.location.Location;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.common.location.LocationService;
import com.mapbox.common.location.LocationServiceFactory;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapInitOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Snapshotter;
import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineColorResources;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineScaleExpressions;
import com.stub.StubApp;
import f9.AbstractC0934b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformView;
import j7.C1094b;
import j9.C1099d;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.C1119c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import l4.E0;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import p0.AbstractC1482f;
import q8.AbstractC1526a;
import s.C1590a;
import t9.AbstractC1740a;
import w.AbstractC1856e;

/* renamed from: b3.N, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0498N implements PlatformView, DefaultLifecycleObserver {

    /* renamed from: Q0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f10532Q0 = {Reflection.property1(new PropertyReference1Impl(C0498N.class, StubApp.getString2(8977), StubApp.getString2(8978), 0))};

    /* renamed from: R0, reason: collision with root package name */
    public static volatile Boolean f10533R0;

    /* renamed from: A, reason: collision with root package name */
    public long f10534A;

    /* renamed from: A0, reason: collision with root package name */
    public final C0497M f10535A0;

    /* renamed from: B, reason: collision with root package name */
    public final long f10536B;

    /* renamed from: B0, reason: collision with root package name */
    public final C0515q f10537B0;

    /* renamed from: C, reason: collision with root package name */
    public long f10538C;

    /* renamed from: C0, reason: collision with root package name */
    public final x f10539C0;

    /* renamed from: D, reason: collision with root package name */
    public final long f10540D;

    /* renamed from: D0, reason: collision with root package name */
    public final C0496L f10541D0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f10542E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f10543E0;

    /* renamed from: F, reason: collision with root package name */
    public final Handler f10544F;

    /* renamed from: F0, reason: collision with root package name */
    public final C0517s f10545F0;

    /* renamed from: G, reason: collision with root package name */
    public RunnableC0512n f10546G;

    /* renamed from: G0, reason: collision with root package name */
    public final E0 f10547G0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f10548H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f10549H0;

    /* renamed from: I, reason: collision with root package name */
    public Snapshotter f10550I;

    /* renamed from: I0, reason: collision with root package name */
    public Snapshotter f10551I0;

    /* renamed from: J0, reason: collision with root package name */
    public int f10552J0;

    /* renamed from: K, reason: collision with root package name */
    public Snapshotter f10553K;

    /* renamed from: K0, reason: collision with root package name */
    public final int f10554K0;

    /* renamed from: L, reason: collision with root package name */
    public Style f10555L;

    /* renamed from: L0, reason: collision with root package name */
    public final Object f10556L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f10557M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f10558N0;

    /* renamed from: O, reason: collision with root package name */
    public LineString f10559O;

    /* renamed from: O0, reason: collision with root package name */
    public int f10560O0;

    /* renamed from: P, reason: collision with root package name */
    public double f10561P;

    /* renamed from: P0, reason: collision with root package name */
    public final int f10562P0;

    /* renamed from: R, reason: collision with root package name */
    public Double f10563R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f10564T;

    /* renamed from: X, reason: collision with root package name */
    public Snapshotter f10565X;

    /* renamed from: Y, reason: collision with root package name */
    public Snapshotter f10566Y;

    /* renamed from: Z, reason: collision with root package name */
    public Style f10567Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10568a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f10569b;

    /* renamed from: c, reason: collision with root package name */
    public final BinaryMessenger f10570c;

    /* renamed from: d, reason: collision with root package name */
    public final F5.c f10571d;

    /* renamed from: e, reason: collision with root package name */
    public final MapView f10572e;

    /* renamed from: f, reason: collision with root package name */
    public final DeviceLocationProvider f10573f;

    /* renamed from: g, reason: collision with root package name */
    public Location f10574g;

    /* renamed from: h, reason: collision with root package name */
    public final j9.e f10575h;
    public List h0;
    public final i9.d j;

    /* renamed from: k, reason: collision with root package name */
    public final x9.t f10576k;

    /* renamed from: k0, reason: collision with root package name */
    public int f10577k0;

    /* renamed from: l, reason: collision with root package name */
    public final x9.I f10578l;

    /* renamed from: l0, reason: collision with root package name */
    public String f10579l0;

    /* renamed from: m, reason: collision with root package name */
    public final C1590a f10580m;

    /* renamed from: m0, reason: collision with root package name */
    public int f10581m0;

    /* renamed from: n, reason: collision with root package name */
    public E9.k f10582n;

    /* renamed from: n0, reason: collision with root package name */
    public long f10583n0;

    /* renamed from: o0, reason: collision with root package name */
    public final long f10584o0;

    /* renamed from: p, reason: collision with root package name */
    public D5.B f10585p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f10586p0;

    /* renamed from: q, reason: collision with root package name */
    public final Vb.f f10587q;

    /* renamed from: q0, reason: collision with root package name */
    public C8.a f10588q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10589r;

    /* renamed from: r0, reason: collision with root package name */
    public final long f10590r0;

    /* renamed from: s, reason: collision with root package name */
    public String f10591s;

    /* renamed from: s0, reason: collision with root package name */
    public L9.n f10592s0;

    /* renamed from: t, reason: collision with root package name */
    public final double f10593t;

    /* renamed from: t0, reason: collision with root package name */
    public Double f10594t0;

    /* renamed from: u0, reason: collision with root package name */
    public Point f10595u0;

    /* renamed from: v, reason: collision with root package name */
    public X2.j f10596v;

    /* renamed from: v0, reason: collision with root package name */
    public int f10597v0;

    /* renamed from: w, reason: collision with root package name */
    public Y2.a f10598w;

    /* renamed from: w0, reason: collision with root package name */
    public final int f10599w0;

    /* renamed from: x, reason: collision with root package name */
    public long f10600x;

    /* renamed from: x0, reason: collision with root package name */
    public long f10601x0;

    /* renamed from: y, reason: collision with root package name */
    public final long f10602y;

    /* renamed from: y0, reason: collision with root package name */
    public final C0509k f10603y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10604z;

    /* renamed from: z0, reason: collision with root package name */
    public final Lazy f10605z0;

    public C0498N(Context context, Map map, BinaryMessenger messenger, InterfaceC0444t lifecycleOwner, F5.c mapEventCallback) {
        boolean z2;
        final C0498N c0498n;
        int i3;
        String str;
        boolean z10;
        int i10 = 5;
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(mapEventCallback, "mapEventCallback");
        this.f10568a = context;
        this.f10569b = map;
        this.f10570c = messenger;
        this.f10571d = mapEventCallback;
        this.f10580m = new C1590a(2);
        Xb.d dVar = W.f5838a;
        this.f10587q = Qb.J.a(Vb.q.f7968a);
        this.f10593t = 17.0d;
        this.f10596v = X2.j.f8289c;
        this.f10602y = 500L;
        this.f10536B = 1500L;
        this.f10540D = DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT;
        this.f10544F = new Handler(Looper.getMainLooper());
        this.f10584o0 = 3000L;
        C0492H listener = new C0492H();
        this.f10590r0 = 100L;
        this.f10599w0 = 5;
        C0490F c0490f = new C0490F(this);
        C0491G c0491g = new C0491G(this);
        C0506h listener2 = new C0506h(this, 0);
        V8.D d8 = new V8.D(this, 2);
        String string2 = StubApp.getString2(8979);
        String string22 = StubApp.getString2(103);
        Log.d(string22, string2);
        boolean z11 = context instanceof AbstractActivityC0364d;
        if (z11) {
            z2 = ((AbstractActivityC0364d) context).j();
        } else {
            if (z11) {
                throw new NoWhenBranchMatchedException();
            }
            z2 = true;
        }
        C0500b c0500b = new C0500b(lifecycleOwner.i(), z2, 1);
        if (context != null) {
            C0508j navigationOptionsProvider = new C0508j(this, i10);
            Lazy lazy = H8.b.f2941a;
            Intrinsics.checkNotNullParameter(navigationOptionsProvider, "navigationOptionsProvider");
            D9.l.d(StubApp.getString2(2973), StubApp.getString2(2972));
            H8.b.a().b(navigationOptionsProvider);
            Log.d(string22, StubApp.getString2(8980));
            i3 = 1;
            MapView mapView = new MapView(context, new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null));
            Intrinsics.checkNotNullParameter(mapView, "<this>");
            X6.j plugin = mapView.getPlugin(StubApp.getString2(8981));
            Intrinsics.checkNotNull(plugin);
            ((r7.g) plugin).h();
            Intrinsics.checkNotNullParameter(mapView, "<this>");
            X6.j plugin2 = mapView.getPlugin(StubApp.getString2(8982));
            Intrinsics.checkNotNull(plugin2);
            ((c7.h) plugin2).e();
            Intrinsics.checkNotNullParameter(mapView, "<this>");
            X6.j plugin3 = mapView.getPlugin(StubApp.getString2(8983));
            Intrinsics.checkNotNull(plugin3);
            ((o7.d) plugin3).e();
            Ec.l.o(mapView).l(Ec.l.e(true));
            Ec.l.o(mapView).k();
            Ec.l.o(mapView).m();
            Ec.l.o(mapView).n();
            l7.r o5 = Ec.l.o(mapView);
            o5.getClass();
            Intrinsics.checkNotNullParameter(listener2, "listener");
            o5.f16794h.add(listener2);
            Double d10 = o5.f16792f;
            if (d10 != null) {
                listener2.a(d10.doubleValue());
            }
            androidx.lifecycle.L.e(mapView, c0500b);
            Y6.j jVar = (Y6.j) Y6.k.e(mapView);
            jVar.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            jVar.f8768e.add(listener);
            Intrinsics.checkNotNullParameter(mapView, "<this>");
            String string23 = StubApp.getString2(8511);
            X6.j plugin4 = mapView.getPlugin(string23);
            Intrinsics.checkNotNull(plugin4);
            i7.o oVar = (i7.o) ((i7.c) plugin4);
            oVar.getClass();
            Intrinsics.checkNotNullParameter(c0490f, StubApp.getString2(8984));
            oVar.f14918r.add(c0490f);
            Intrinsics.checkNotNullParameter(mapView, "<this>");
            X6.j plugin5 = mapView.getPlugin(string23);
            Intrinsics.checkNotNull(plugin5);
            i7.o oVar2 = (i7.o) ((i7.c) plugin5);
            oVar2.getClass();
            Intrinsics.checkNotNullParameter(c0491g, StubApp.getString2(8985));
            oVar2.f14920s.add(c0491g);
            c0498n = this;
            c0498n.f10572e = mapView;
            Boolean bool = f10533R0;
            String string24 = StubApp.getString2(74);
            String string25 = StubApp.getString2(7129);
            String string26 = StubApp.getString2(7127);
            String string27 = StubApp.getString2(7126);
            if (bool != null) {
                Boolean bool2 = f10533R0;
                Intrinsics.checkNotNull(bool2);
                z10 = bool2.booleanValue();
                str = string22;
                R2.c.b(str, StubApp.getString2(8986) + z10 + string25 + (z10 ? string27 : string26) + string24);
            } else {
                str = string22;
                R2.c.b(str, StubApp.getString2(8987));
                z10 = false;
            }
            c0498n.f10589r = z10;
            R2.c.b(str, StubApp.getString2(8988) + z10 + string25 + (z10 ? string27 : string26) + string24);
            c0498n.t();
            LocationService orCreate = LocationServiceFactory.getOrCreate();
            Intrinsics.checkNotNullExpressionValue(orCreate, "getOrCreate(...)");
            Expected<LocationError, DeviceLocationProvider> deviceLocationProvider = orCreate.getDeviceLocationProvider(new LocationProviderRequest.Builder().interval(new IntervalSettings.Builder().interval(1000L).minimumInterval(500L).maximumInterval(2000L).build()).displacement(Float.valueOf(1.0f)).accuracy(AccuracyLevel.HIGHEST).build());
            if (deviceLocationProvider.isValue()) {
                DeviceLocationProvider value = deviceLocationProvider.getValue();
                Intrinsics.checkNotNull(value);
                c0498n.f10573f = value;
                R2.c.b(str, StubApp.getString2(8989));
            } else {
                Log.e(str, StubApp.getString2(8990) + deviceLocationProvider.getError());
                R2.c.c(str, StubApp.getString2(8991) + deviceLocationProvider.getError());
            }
            DeviceLocationProvider deviceLocationProvider2 = c0498n.f10573f;
            if (deviceLocationProvider2 != null) {
                deviceLocationProvider2.addLocationObserver(d8);
            }
            DeviceLocationProvider deviceLocationProvider3 = c0498n.f10573f;
            if (deviceLocationProvider3 != null) {
                deviceLocationProvider3.getLastLocation(new C0508j(c0498n, 7));
            }
            Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
            Application application = origApplicationContext instanceof Application ? (Application) origApplicationContext : null;
            if (application == null) {
                R2.c.f(str, StubApp.getString2(8992));
            } else {
                C8.a aVar = new C8.a(c0498n, 2);
                c0498n.f10588q0 = aVar;
                Intrinsics.checkNotNull(aVar);
                application.registerActivityLifecycleCallbacks(aVar);
                R2.c.b(str, StubApp.getString2(8993));
            }
            j9.e eVar = new j9.e(mapView.getMapboxMapDeprecated());
            c0498n.f10575h = eVar;
            Intrinsics.checkNotNull(context);
            double d11 = context.getResources().getDisplayMetrics().density;
            double d12 = d11 * 80.0d;
            EdgeInsets edgeInsets = new EdgeInsets(d12, d12, d11 * 150.0d, d12);
            Intrinsics.checkNotNullParameter(edgeInsets, "<set-?>");
            eVar.f15406o = edgeInsets;
            c0498n.j = new i9.d(mapView.getMapboxMapDeprecated(), Y6.k.e(mapView), eVar);
            ((C1099d) eVar.f15395c.f8674b).f15390i = false;
            eVar.c();
            Intrinsics.checkNotNullParameter(mapView, "<this>");
            Object plugin6 = mapView.getPlugin(string23);
            Intrinsics.checkNotNull(plugin6);
            L1 l12 = (L1) ((i7.c) plugin6);
            l12.getClass();
            i7.o oVar3 = (i7.o) l12;
            C1094b c1094b = oVar3.f14919r0;
            if (c1094b.f15362e) {
                X6.t scrollMode = c1094b.f15363f;
                Intrinsics.checkNotNullParameter(scrollMode, "scrollMode");
                C1094b c1094b2 = new C1094b(c1094b.f15358a, c1094b.f15359b, c1094b.f15360c, c1094b.f15361d, false, scrollMode, c1094b.f15364g, c1094b.f15365h, c1094b.j, c1094b.f15366k, c1094b.f15367l, c1094b.f15368m, c1094b.f15369n, c1094b.f15370p, c1094b.f15371q, c1094b.f15372r, c1094b.f15373s);
                Intrinsics.checkNotNullParameter(c1094b2, "<set-?>");
                oVar3.f14919r0 = c1094b2;
            }
            IntRange intRange = J7.e.f3416a;
            IntRange intRange2 = J7.e.f3417b;
            IntRange intRange3 = J7.e.f3418c;
            IntRange intRange4 = J7.e.f3419d;
            List emptyList = CollectionsKt.emptyList();
            String str2 = StubApp.getString2(8994) + RouteLineColorResources.class.getCanonicalName();
            boolean isEmpty = CollectionsKt.intersect(intRange, intRange2).isEmpty();
            String string28 = StubApp.getString2(8995);
            if (!isEmpty) {
                Log.e(str2, string28);
            } else if (!CollectionsKt.intersect(intRange, intRange3).isEmpty()) {
                Log.e(str2, string28);
            } else if (!CollectionsKt.intersect(intRange, intRange4).isEmpty()) {
                Log.e(str2, StubApp.getString2(9001));
            } else if (!CollectionsKt.intersect(intRange2, intRange3).isEmpty()) {
                Log.e(str2, StubApp.getString2(9000));
            } else if (!CollectionsKt.intersect(intRange2, intRange4).isEmpty()) {
                Log.e(str2, StubApp.getString2(8999));
            } else if (CollectionsKt.intersect(intRange3, intRange4).isEmpty()) {
                c0498n.f10576k = new x9.t(new MapboxRouteLineApiOptions(intRange, intRange2, intRange3, intRange4, emptyList, false, false, false, 62500000L, false, null));
                Intrinsics.checkNotNullParameter(context, "context");
                RouteLineColorResources routeLineColorResources = new RouteLineColorResources(AbstractC1740a.f21224c, AbstractC1740a.f21226e, AbstractC1740a.f21227f, AbstractC1740a.f21228g, AbstractC1740a.f21229h, AbstractC1740a.f21225d, 0, 0, 0, 0, 0, AbstractC1740a.j, AbstractC1740a.f21233m, AbstractC1740a.f21234n, AbstractC1740a.f21235o, AbstractC1740a.f21236p, AbstractC1740a.f21232l, AbstractC1740a.f21237q, AbstractC1740a.f21241u, 0, 0, AbstractC1740a.f21238r, AbstractC1740a.f21242v, 0, 0, AbstractC1740a.f21230i, AbstractC1740a.f21231k, 0, 0, AbstractC1740a.f21243w, null);
                r9.r rVar = r9.r.f20461a;
                RouteLineScaleExpressions routeLineScaleExpressions = new RouteLineScaleExpressions(r9.r.c(CollectionsKt.listOf((Object[]) new y9.q[]{new y9.q(4.0f, 3.0f, 1.0f), new y9.q(10.0f, 4.0f, 1.0f), new y9.q(13.0f, 6.0f, 1.0f), new y9.q(16.0f, 10.0f, 1.0f), new y9.q(19.0f, 14.0f, 1.0f), new y9.q(22.0f, 18.0f, 1.0f)})), r9.r.c(CollectionsKt.listOf((Object[]) new y9.q[]{new y9.q(10.0f, 7.0f, 1.0f), new y9.q(14.0f, 10.5f, 1.0f), new y9.q(16.5f, 15.5f, 1.0f), new y9.q(19.0f, 24.0f, 1.0f), new y9.q(22.0f, 29.0f, 1.0f)})), r9.r.c(CollectionsKt.listOf((Object[]) new y9.q[]{new y9.q(4.0f, 3.0f, 1.0f), new y9.q(10.0f, 4.0f, 1.0f), new y9.q(13.0f, 6.0f, 1.0f), new y9.q(16.0f, 10.0f, 1.0f), new y9.q(19.0f, 14.0f, 1.0f), new y9.q(22.0f, 18.0f, 1.0f)})), r9.r.c(CollectionsKt.listOf((Object[]) new y9.q[]{new y9.q(4.0f, 3.0f, 1.0f), new y9.q(10.0f, 4.0f, 1.0f), new y9.q(13.0f, 6.0f, 1.0f), new y9.q(16.0f, 10.0f, 1.0f), new y9.q(19.0f, 14.0f, 1.0f), new y9.q(22.0f, 18.0f, 1.0f)})), r9.r.c(CollectionsKt.listOf((Object[]) new y9.q[]{new y9.q(10.0f, 7.0f, 1.0f), new y9.q(14.0f, 10.5f, 1.0f), new y9.q(16.5f, 15.5f, 1.0f), new y9.q(19.0f, 24.0f, 1.0f), new y9.q(22.0f, 29.0f, 1.0f)})), r9.r.c(CollectionsKt.listOf((Object[]) new y9.q[]{new y9.q(4.0f, 3.0f, 1.0f), new y9.q(10.0f, 4.0f, 1.0f), new y9.q(13.0f, 6.0f, 1.0f), new y9.q(16.0f, 10.0f, 1.0f), new y9.q(19.0f, 14.0f, 1.0f), new y9.q(22.0f, 18.0f, 1.0f)})), r9.r.c(CollectionsKt.listOf((Object[]) new y9.q[]{new y9.q(10.0f, 7.0f, 2.0f), new y9.q(14.0f, 10.5f, 2.0f), new y9.q(16.5f, 15.5f, 2.0f), new y9.q(19.0f, 24.0f, 2.0f), new y9.q(22.0f, 29.0f, 2.0f)})), null);
                List list = AbstractC1740a.f21223b;
                int i11 = AbstractC1740a.f21239s;
                int i12 = AbstractC1740a.f21240t;
                List listOf = CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(0.0d), Double.valueOf(0.0d)});
                Drawable m4 = D1.m(context, i11);
                Drawable m10 = D1.m(context, i12);
                if (m4 == null) {
                    throw new IllegalArgumentException(StubApp.getString2(8997));
                }
                if (m10 == null) {
                    throw new IllegalArgumentException(StubApp.getString2(8996));
                }
                c0498n.f10578l = new x9.I(new y9.g(context, routeLineColorResources, routeLineScaleExpressions, list, i11, m4, i12, m10, listOf));
                mapView.getMapboxMapDeprecated().addOnMapLoadedListener(new C0508j(c0498n, 6));
            } else {
                Log.e(str2, StubApp.getString2(8998));
            }
            throw new IllegalStateException(StubApp.getString2(9002));
        }
        c0498n = this;
        i3 = 1;
        R2.c.b(string22, StubApp.getString2(9003));
        c0498n.f10603y0 = new C0509k(c0498n, i3);
        final int i13 = 0;
        c0498n.f10605z0 = LazyKt.lazy(new Function0(c0498n) { // from class: b3.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0498N f10648b;

            {
                this.f10648b = c0498n;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C0498N c0498n2 = this.f10648b;
                switch (i13) {
                    case 0:
                        return new C0509k(c0498n2, 2);
                    default:
                        Context applicationContext = c0498n2.f10568a;
                        Intrinsics.checkNotNull(applicationContext);
                        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                        Context applicationContext2 = StubApp.getOrigApplicationContext(applicationContext.getApplicationContext());
                        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                        Context origApplicationContext2 = StubApp.getOrigApplicationContext(applicationContext.getApplicationContext());
                        Intrinsics.checkNotNullExpressionValue(origApplicationContext2, "applicationContext.applicationContext");
                        Locale t3 = Oc.a.t(applicationContext);
                        y7.b bVar = new y7.b(origApplicationContext2, t3, Tc.d.l(t3));
                        L7.l lVar = new L7.l(new URI(StubApp.getString2(2971)));
                        L7.c cVar = new L7.c();
                        L7.d dVar2 = new L7.d(new L7.a());
                        TimeUnit timeUnit = TimeUnit.MINUTES;
                        long millis = timeUnit.toMillis(5L);
                        long j = com.mapbox.navigation.base.route.n.f12513b;
                        if (millis < j) {
                            StringBuilder m11 = AbstractC1482f.m(millis, StubApp.getString2(2974), StubApp.getString2(2975));
                            m11.append(j);
                            throw new IllegalStateException(m11.toString().toString());
                        }
                        com.mapbox.navigation.base.route.n nVar = new com.mapbox.navigation.base.route.n(millis);
                        L7.j jVar2 = new L7.j();
                        com.mapbox.navigation.base.route.l lVar2 = new com.mapbox.navigation.base.route.l(timeUnit.toMillis(5L));
                        L7.f fVar = new L7.f();
                        L7.e eVar2 = new L7.e();
                        LocationProviderRequest request = L7.g.f4273b;
                        Intrinsics.checkNotNullExpressionValue(request, "request");
                        L7.g gVar = new L7.g(request);
                        L7.b bVar2 = new L7.b();
                        L7.m mVar = new L7.m(J7.e.f3416a, J7.e.f3417b, J7.e.f3418c, J7.e.f3419d);
                        L7.k kVar = new L7.k();
                        Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                        L7.i navigationOptions = new L7.i(applicationContext2, bVar, lVar, cVar, dVar2, nVar, jVar2, lVar2, fVar, eVar2, bVar2, gVar, mVar, kVar);
                        Lazy lazy2 = H8.b.f2941a;
                        Intrinsics.checkNotNullParameter(navigationOptions, "navigationOptions");
                        D9.l.d(StubApp.getString2(2973), StubApp.getString2(2972));
                        H8.b.a().b(new C2.d(navigationOptions, 17));
                        return Unit.INSTANCE;
                }
            }
        });
        c0498n.f10535A0 = new C0497M(c0498n);
        c0498n.f10537B0 = new C0515q(c0498n, i13);
        c0498n.f10539C0 = new x(c0498n);
        c0498n.f10541D0 = new C0496L(c0498n);
        c0498n.f10545F0 = new C0517s(c0498n, 0);
        final int i14 = 1;
        c0498n.f10547G0 = W.a.u(lifecycleOwner, new y(c0498n), new Function0(c0498n) { // from class: b3.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0498N f10648b;

            {
                this.f10648b = c0498n;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C0498N c0498n2 = this.f10648b;
                switch (i14) {
                    case 0:
                        return new C0509k(c0498n2, 2);
                    default:
                        Context applicationContext = c0498n2.f10568a;
                        Intrinsics.checkNotNull(applicationContext);
                        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                        Context applicationContext2 = StubApp.getOrigApplicationContext(applicationContext.getApplicationContext());
                        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                        Context origApplicationContext2 = StubApp.getOrigApplicationContext(applicationContext.getApplicationContext());
                        Intrinsics.checkNotNullExpressionValue(origApplicationContext2, "applicationContext.applicationContext");
                        Locale t3 = Oc.a.t(applicationContext);
                        y7.b bVar = new y7.b(origApplicationContext2, t3, Tc.d.l(t3));
                        L7.l lVar = new L7.l(new URI(StubApp.getString2(2971)));
                        L7.c cVar = new L7.c();
                        L7.d dVar2 = new L7.d(new L7.a());
                        TimeUnit timeUnit = TimeUnit.MINUTES;
                        long millis = timeUnit.toMillis(5L);
                        long j = com.mapbox.navigation.base.route.n.f12513b;
                        if (millis < j) {
                            StringBuilder m11 = AbstractC1482f.m(millis, StubApp.getString2(2974), StubApp.getString2(2975));
                            m11.append(j);
                            throw new IllegalStateException(m11.toString().toString());
                        }
                        com.mapbox.navigation.base.route.n nVar = new com.mapbox.navigation.base.route.n(millis);
                        L7.j jVar2 = new L7.j();
                        com.mapbox.navigation.base.route.l lVar2 = new com.mapbox.navigation.base.route.l(timeUnit.toMillis(5L));
                        L7.f fVar = new L7.f();
                        L7.e eVar2 = new L7.e();
                        LocationProviderRequest request = L7.g.f4273b;
                        Intrinsics.checkNotNullExpressionValue(request, "request");
                        L7.g gVar = new L7.g(request);
                        L7.b bVar2 = new L7.b();
                        L7.m mVar = new L7.m(J7.e.f3416a, J7.e.f3417b, J7.e.f3418c, J7.e.f3419d);
                        L7.k kVar = new L7.k();
                        Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                        L7.i navigationOptions = new L7.i(applicationContext2, bVar, lVar, cVar, dVar2, nVar, jVar2, lVar2, fVar, eVar2, bVar2, gVar, mVar, kVar);
                        Lazy lazy2 = H8.b.f2941a;
                        Intrinsics.checkNotNullParameter(navigationOptions, "navigationOptions");
                        D9.l.d(StubApp.getString2(2973), StubApp.getString2(2972));
                        H8.b.a().b(new C2.d(navigationOptions, 17));
                        return Unit.INSTANCE;
                }
            }
        });
        c0498n.f10554K0 = 3;
        c0498n.f10556L0 = new Object();
        c0498n.f10562P0 = 20;
    }

    public static final Bitmap a(C0498N c0498n, int i3) {
        c0498n.getClass();
        try {
            Context context = c0498n.f10568a;
            if (context != null) {
                return BitmapFactory.decodeResource(context.getResources(), i3);
            }
            return null;
        } catch (Exception e10) {
            R2.c.c(StubApp.getString2(103), StubApp.getString2(9004) + i3 + StubApp.getString2(6618) + e10.getMessage());
            return null;
        }
    }

    public static final void b(C0498N c0498n, Function1 function1) {
        R2.c.b(StubApp.getString2(103), StubApp.getString2(9005) + c0498n.f10598w);
        Qb.L.j(c0498n.f10587q, null, new z(c0498n, function1, null), 3);
    }

    public static final void c(C0498N c0498n) {
        if (c0498n.f10542E) {
            c0498n.f10542E = false;
            c0498n.f10538C = System.currentTimeMillis();
            if (c0498n.f10598w == Y2.a.f8731b) {
                RunnableC0512n runnableC0512n = c0498n.f10546G;
                Handler handler = c0498n.f10544F;
                if (runnableC0512n != null) {
                    handler.removeCallbacks(runnableC0512n);
                }
                RunnableC0512n runnableC0512n2 = new RunnableC0512n(c0498n, 1);
                c0498n.f10546G = runnableC0512n2;
                Intrinsics.checkNotNull(runnableC0512n2);
                handler.postDelayed(runnableC0512n2, c0498n.f10540D);
            }
        }
    }

    public static final Long f(C0498N c0498n, Float f10) {
        c0498n.getClass();
        if (f10 != null) {
            double doubleValue = f10.doubleValue();
            boolean isNaN = Double.isNaN(doubleValue);
            String string2 = StubApp.getString2(103);
            if (isNaN || Double.isInfinite(doubleValue)) {
                R2.c.f(string2, StubApp.getString2(9011) + doubleValue);
                return null;
            }
            if (doubleValue < 0.0d) {
                R2.c.f(string2, StubApp.getString2(9006) + doubleValue + StubApp.getString2(9007));
                return null;
            }
            if (doubleValue > 1.0E7d) {
                R2.c.f(string2, StubApp.getString2(9008) + doubleValue + StubApp.getString2(9009));
                return null;
            }
            try {
                return Long.valueOf((long) doubleValue);
            } catch (Exception e10) {
                R2.c.f(string2, StubApp.getString2(9010) + e10.getMessage() + StubApp.getString2(6624) + doubleValue);
            }
        }
        return null;
    }

    public static final Long g(C0498N c0498n, Double d8) {
        c0498n.getClass();
        double doubleValue = d8.doubleValue();
        boolean isNaN = Double.isNaN(doubleValue);
        String string2 = StubApp.getString2(103);
        if (isNaN || Double.isInfinite(doubleValue)) {
            R2.c.f(string2, StubApp.getString2(9016) + doubleValue);
            return null;
        }
        if (doubleValue < 0.0d) {
            R2.c.f(string2, StubApp.getString2(9012) + doubleValue + StubApp.getString2(9007));
            return null;
        }
        if (doubleValue > 86400.0d) {
            R2.c.f(string2, StubApp.getString2(9013) + doubleValue + StubApp.getString2(9014));
            return null;
        }
        try {
            return Long.valueOf((long) doubleValue);
        } catch (Exception e10) {
            R2.c.f(string2, StubApp.getString2(9015) + e10.getMessage() + StubApp.getString2(5021) + doubleValue);
            return null;
        }
    }

    public static final void i(C0498N c0498n) {
        if (c0498n.f10592s0 != null) {
            return;
        }
        try {
            MapView mapView = c0498n.f10572e;
            if (mapView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapView");
                mapView = null;
            }
            CameraState cameraState = mapView.getMapboxMapDeprecated().getCameraState();
            c0498n.f10594t0 = Double.valueOf(cameraState.getZoom());
            c0498n.f10595u0 = cameraState.getCenter();
        } catch (Exception unused) {
        }
        L9.n nVar = new L9.n(c0498n, 22);
        c0498n.f10592s0 = nVar;
        Handler handler = c0498n.f10544F;
        Intrinsics.checkNotNull(nVar);
        handler.post(nVar);
    }

    public static double j(Point point, Point point2) {
        double longitude = point2.longitude() - point.longitude();
        point2.latitude();
        point.latitude();
        double atan2 = (Math.atan2(Math.cos(point2.latitude()) * Math.sin(longitude), (Math.sin(point2.latitude()) * Math.cos(point.latitude())) - (Math.cos(longitude) * (Math.cos(point2.latitude()) * Math.sin(point.latitude())))) * 180) / 3.141592653589793d;
        double d8 = 360;
        return (atan2 + d8) % d8;
    }

    public static String q() {
        return String.valueOf(new Date().getTime() + Random.INSTANCE.nextInt(1, 10000));
    }

    public final void B(boolean z2) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f10538C;
        long j3 = currentTimeMillis - j;
        if (j <= 0 || j3 >= this.f10540D) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (z2 || currentTimeMillis2 - this.f10600x > this.f10602y) {
                this.f10604z = true;
                this.f10534A = currentTimeMillis2;
                this.f10544F.postDelayed(new RunnableC0512n(this, 0), this.f10536B);
                i9.d dVar = this.j;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationCamera");
                    dVar = null;
                }
                k9.g transitionOptions = i9.d.f14948m;
                k9.g frameTransitionOptions = i9.d.f14949n;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(transitionOptions, "stateTransitionOptions");
                Intrinsics.checkNotNullParameter(frameTransitionOptions, "frameTransitionOptions");
                int c10 = AbstractC1856e.c(dVar.f14959k);
                if (c10 == 0 || (c10 != 1 && c10 != 2 && (c10 == 3 || c10 == 4))) {
                    CameraOptions cameraOptions = dVar.f14952c.f15409r.f15413a;
                    a5.c cVar = dVar.f14953d;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
                    Intrinsics.checkNotNullParameter(transitionOptions, "transitionOptions");
                    Y.m mVar = (Y.m) cVar.f9282b;
                    Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
                    Intrinsics.checkNotNullParameter(transitionOptions, "transitionOptions");
                    AnimatorSet N3 = ((a5.c) mVar.f8675c).N(cameraOptions, transitionOptions);
                    C0250h c0250h = new C0250h((Y6.a) cVar.f9283c, (MapboxMap) cVar.f9284d, N3);
                    i9.c listener = new i9.c(dVar, 2, frameTransitionOptions, 3);
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    N3.addListener(new C1119c(listener, c0250h));
                    dVar.b(c0250h);
                }
                this.f10600x = currentTimeMillis2;
            }
        }
    }

    public final void C() {
        Snapshotter snapshotter = this.f10550I;
        if (snapshotter != null) {
            snapshotter.cancel();
        }
        Snapshotter snapshotter2 = this.f10550I;
        if (snapshotter2 != null) {
            snapshotter2.destroy();
        }
        this.f10550I = null;
        Snapshotter snapshotter3 = this.f10553K;
        if (snapshotter3 != null) {
            snapshotter3.cancel();
        }
        Snapshotter snapshotter4 = this.f10553K;
        if (snapshotter4 != null) {
            snapshotter4.destroy();
        }
        this.f10553K = null;
        this.f10555L = null;
        this.f10559O = null;
        this.f10561P = 0.0d;
        this.f10548H = false;
    }

    public final void D() {
        synchronized (this.f10556L0) {
            try {
                Snapshotter snapshotter = this.f10551I0;
                if (snapshotter != null) {
                    snapshotter.cancel();
                }
                this.f10551I0 = null;
                this.f10557M0 = false;
                this.f10558N0 = false;
                this.f10560O0 = 0;
                Snapshotter snapshotter2 = this.f10565X;
                if (snapshotter2 != null) {
                    snapshotter2.cancel();
                }
                Snapshotter snapshotter3 = this.f10565X;
                if (snapshotter3 != null) {
                    snapshotter3.destroy();
                }
                this.f10565X = null;
                Snapshotter snapshotter4 = this.f10566Y;
                if (snapshotter4 != null) {
                    snapshotter4.cancel();
                }
                Snapshotter snapshotter5 = this.f10566Y;
                if (snapshotter5 != null) {
                    snapshotter5.destroy();
                }
                this.f10566Y = null;
                this.f10567Z = null;
                this.f10549H0 = false;
                this.f10552J0 = 0;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void E() {
        MapView mapView;
        j9.e eVar;
        j9.e eVar2;
        Y2.a aVar;
        String string2 = StubApp.getString2(9017);
        String string22 = StubApp.getString2(9018);
        String str = StubApp.getString2(9019) + this.f10598w;
        String string23 = StubApp.getString2(103);
        R2.c.b(string23, str);
        try {
            this.f10564T = false;
            List a3 = s().f17228h.a();
            if (a3.isEmpty()) {
                R2.c.f(string23, StubApp.getString2("9020"));
                this.f10564T = true;
                return;
            }
            R2.c.b(string23, string22 + a3.size() + StubApp.getString2("9021"));
            Y2.a aVar2 = this.f10598w;
            if (aVar2 != Y2.a.f8731b && aVar2 != (aVar = Y2.a.f8730a)) {
                R2.c.b(string23, string2 + aVar2 + StubApp.getString2("9022"));
                this.f10598w = aVar;
            }
            MapView mapView2 = this.f10572e;
            String string24 = StubApp.getString2(3464);
            i9.d dVar = null;
            if (mapView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string24);
                mapView = null;
            } else {
                mapView = mapView2;
            }
            Style styleDeprecated = mapView.getMapboxMapDeprecated().getStyleDeprecated();
            if (styleDeprecated == null) {
                R2.c.f(string23, StubApp.getString2("9027"));
                if (mapView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string24);
                    mapView2 = null;
                }
                mapView2.getMapboxMapDeprecated().addOnMapLoadedListener(new C0508j(this, 4));
                return;
            }
            R2.c.b(string23, StubApp.getString2("9023"));
            x9.t tVar = this.f10576k;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("routeLineApi");
                tVar = null;
            }
            tVar.e(a3, new C0507i(this, styleDeprecated, 3));
            com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) CollectionsKt.firstOrNull(a3);
            if (gVar != null) {
                j9.e eVar3 = this.f10575h;
                String string25 = StubApp.getString2(9024);
                if (eVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string25);
                    eVar = null;
                } else {
                    eVar = eVar3;
                }
                eVar.d(gVar);
                if (eVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string25);
                    eVar2 = null;
                } else {
                    eVar2 = eVar3;
                }
                eVar2.f15402k.f10727a = Double.valueOf(this.f10593t);
                if (eVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string25);
                    eVar3 = null;
                }
                eVar3.c();
                i9.d dVar2 = this.j;
                if (dVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationCamera");
                } else {
                    dVar = dVar2;
                }
                i9.d.a(dVar);
                R2.c.b(string23, StubApp.getString2("9025"));
            }
            this.f10564T = true;
            R2.c.b(string23, StubApp.getString2("9026"));
        } catch (Exception e10) {
            String message = e10.getMessage();
            String string26 = StubApp.getString2(9028);
            R2.c.c(string23, string26 + message);
            Log.e(string23, string26 + e10.getMessage(), e10);
            this.f10564T = true;
        }
    }

    public final void F(List list, Function1 function1, boolean z2) {
        Double horizontalAccuracy;
        String str = StubApp.getString2(9029) + list.size() + StubApp.getString2(9030) + this.f10596v;
        String string2 = StubApp.getString2(103);
        R2.c.b(string2, str);
        if (this.f10574g == null) {
            R2.c.c(string2, StubApp.getString2(9031));
            if (function1 != null) {
                Result.Companion companion = Result.INSTANCE;
                function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(9032))))));
                return;
            }
            return;
        }
        if (list.isEmpty()) {
            R2.c.c(string2, StubApp.getString2(9033));
            if (function1 != null) {
                Result.Companion companion2 = Result.INSTANCE;
                function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(9034))))));
                return;
            }
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C0510l c0510l = function1 != null ? new C0510l(atomicBoolean, function1, this, 0) : null;
        K0 j = Qb.L.j(this.f10587q, null, new C0495K(atomicBoolean, c0510l, this, null), 3);
        this.h0 = list;
        Location location = this.f10574g;
        Intrinsics.checkNotNull(location);
        double longitude = location.getLongitude();
        Location location2 = this.f10574g;
        Intrinsics.checkNotNull(location2);
        List listOf = CollectionsKt.listOf(Point.fromLngLat(longitude, location2.getLatitude()));
        ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X2.e eVar = (X2.e) it.next();
            arrayList.add(Point.fromLngLat(eVar.f8265b, eVar.f8264a));
        }
        List<Point> plus = CollectionsKt___CollectionsKt.plus((Collection) listOf, (Iterable) arrayList);
        String string22 = this.f10596v == X2.j.f8290d ? StubApp.getString2(5803) : StubApp.getString2(5804);
        Location location3 = this.f10574g;
        double doubleValue = (location3 == null || (horizontalAccuracy = location3.getHorizontalAccuracy()) == null) ? 50.0d : horizontalAccuracy.doubleValue();
        Location location4 = this.f10574g;
        long currentTimeMillis = location4 != null ? System.currentTimeMillis() - location4.getTimestamp() : 0L;
        double max = currentTimeMillis > 10000 ? 200.0d : doubleValue > 50.0d ? Math.max(150.0d, 2.0d * doubleValue) : 100.0d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(plus));
        for (Point point : plus) {
            arrayList2.add(Double.valueOf(max));
        }
        String r8 = r();
        X2.j jVar = this.f10596v;
        C0510l c0510l2 = c0510l;
        StringBuilder t3 = i2.u.t(StubApp.getString2(9035), r8, StubApp.getString2(9036), string22, StubApp.getString2(9037));
        t3.append(jVar);
        t3.append(StubApp.getString2(9038));
        t3.append(max);
        t3.append(StubApp.getString2(9039));
        t3.append(currentTimeMillis);
        t3.append(StubApp.getString2(9040));
        t3.append(doubleValue);
        t3.append(StubApp.getString2(2374));
        R2.c.b(string2, t3.toString());
        RouteOptions.Builder builder = RouteOptions.builder();
        Intrinsics.checkNotNullExpressionValue(builder, "builder(...)");
        AbstractC1526a.c(builder);
        RouteOptions.Builder profile = builder.profile(string22);
        Intrinsics.checkNotNullExpressionValue(profile, "profile(...)");
        Context context = this.f10568a;
        Intrinsics.checkNotNull(context);
        AbstractC1526a.d(profile, context);
        RouteOptions.Builder language = profile.coordinatesList(plus).alternatives(Boolean.FALSE).language(r8);
        Boolean bool = Boolean.TRUE;
        RouteOptions routeOptions = language.steps(bool).voiceInstructions(bool).radiusesList(arrayList2).build();
        Intrinsics.checkNotNullExpressionValue(routeOptions, "build(...)");
        m8.r s10 = s();
        C0494J callback = new C0494J(this, j, c0510l2, routeOptions, z2);
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s10.f17228h.b(routeOptions, new E8.c(E8.b.f1932a, E8.a.f1930b), callback);
    }

    public final void G(List stops, X2.j travelMode, Function1 function1) {
        Intrinsics.checkNotNullParameter(stops, "stops");
        Intrinsics.checkNotNullParameter(travelMode, "travelMode");
        String string2 = StubApp.getString2(103);
        R2.c.b(string2, StubApp.getString2(9041));
        this.f10596v = travelMode;
        R2.c.b(string2, StubApp.getString2(9042) + stops.size() + StubApp.getString2(9043));
        if (this.f10574g == null) {
            R2.c.c(string2, StubApp.getString2(9044));
        } else if (stops.isEmpty()) {
            R2.c.c(string2, StubApp.getString2(9045));
        } else {
            l(stops, X2.j.f8289c);
            l(stops, X2.j.f8290d);
        }
        F(stops, function1, false);
    }

    public final void H(String languageIdentifier) {
        Intrinsics.checkNotNullParameter(languageIdentifier, "languageIdentifier");
        String str = this.f10591s;
        this.f10591s = languageIdentifier;
        if (Intrinsics.areEqual(str, languageIdentifier) || this.f10572e == null) {
            return;
        }
        R2.c.b(StubApp.getString2(103), AbstractC1482f.j(StubApp.getString2(9046), str, StubApp.getString2(9047), languageIdentifier, StubApp.getString2(9048)));
        t();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public final void dispose() {
        String string2 = StubApp.getString2(103);
        String string22 = StubApp.getString2(9049);
        R2.c.b(string2, string22);
        Log.d(string2, string22);
        if (this.f10572e != null) {
            String string23 = StubApp.getString2(9050);
            R2.c.f(string2, string23);
            Log.w(string2, string23);
            D();
            C();
            this.f10564T = false;
            this.f10548H = false;
            this.f10549H0 = false;
            return;
        }
        R2.c.b(string2, StubApp.getString2(9051));
        this.f10564T = false;
        this.f10598w = null;
        D();
        C();
        Qb.J.b(this.f10587q);
        D5.B b2 = this.f10585p;
        if (b2 != null) {
            b2.v();
        }
        E9.k kVar = this.f10582n;
        if (kVar != null) {
            ((ConcurrentLinkedQueue) kVar.f2084e).clear();
            kVar.a(true);
            E9.p pVar = (E9.p) kVar.f2085f;
            MediaPlayer mediaPlayer = pVar.f2095b;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            pVar.f2095b = null;
            pVar.f2098e = null;
            pVar.f2096c = 1.0f;
            E9.w wVar = (E9.w) kVar.f2086g;
            Qb.L.e(wVar.f2112d.f1512a);
            TextToSpeech textToSpeech = wVar.f2113e;
            textToSpeech.setOnUtteranceProgressListener(null);
            textToSpeech.shutdown();
            wVar.f2116h = null;
            wVar.f2114f = 1.0f;
            kVar.f2080a = true;
        }
        C8.a aVar = this.f10588q0;
        if (aVar != null) {
            Context context = this.f10568a;
            Context origApplicationContext = context != null ? StubApp.getOrigApplicationContext(context.getApplicationContext()) : null;
            Application application = origApplicationContext instanceof Application ? (Application) origApplicationContext : null;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(aVar);
            }
            this.f10588q0 = null;
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public final View getView() {
        MapView mapView = this.f10572e;
        if (mapView == null) {
            return null;
        }
        if (mapView != null) {
            return mapView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapView");
        return null;
    }

    public final void l(List list, X2.j jVar) {
        Double horizontalAccuracy;
        String str = StubApp.getString2(9052) + jVar;
        String string2 = StubApp.getString2(103);
        R2.c.b(string2, str);
        Location location = this.f10574g;
        Intrinsics.checkNotNull(location);
        double longitude = location.getLongitude();
        Location location2 = this.f10574g;
        Intrinsics.checkNotNull(location2);
        List listOf = CollectionsKt.listOf(Point.fromLngLat(longitude, location2.getLatitude()));
        ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X2.e eVar = (X2.e) it.next();
            arrayList.add(Point.fromLngLat(eVar.f8265b, eVar.f8264a));
        }
        List<Point> plus = CollectionsKt___CollectionsKt.plus((Collection) listOf, (Iterable) arrayList);
        String string22 = jVar == X2.j.f8290d ? StubApp.getString2(5803) : StubApp.getString2(5804);
        Location location3 = this.f10574g;
        double doubleValue = (location3 == null || (horizontalAccuracy = location3.getHorizontalAccuracy()) == null) ? 50.0d : horizontalAccuracy.doubleValue();
        Location location4 = this.f10574g;
        long currentTimeMillis = location4 != null ? System.currentTimeMillis() - location4.getTimestamp() : 0L;
        double max = currentTimeMillis > 10000 ? 200.0d : doubleValue > 50.0d ? Math.max(150.0d, 2.0d * doubleValue) : 100.0d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(plus));
        for (Point point : plus) {
            arrayList2.add(Double.valueOf(max));
        }
        String r8 = r();
        StringBuilder t3 = i2.u.t(StubApp.getString2(9053), r8, StubApp.getString2(9036), string22, StubApp.getString2(9038));
        t3.append(max);
        t3.append(StubApp.getString2(9039));
        t3.append(currentTimeMillis);
        t3.append(StubApp.getString2(9040));
        t3.append(doubleValue);
        t3.append(StubApp.getString2(2374));
        R2.c.b(string2, t3.toString());
        RouteOptions.Builder builder = RouteOptions.builder();
        Intrinsics.checkNotNullExpressionValue(builder, "builder(...)");
        AbstractC1526a.c(builder);
        RouteOptions.Builder profile = builder.profile(string22);
        Intrinsics.checkNotNullExpressionValue(profile, "profile(...)");
        Context context = this.f10568a;
        Intrinsics.checkNotNull(context);
        AbstractC1526a.d(profile, context);
        RouteOptions.Builder language = profile.coordinatesList(plus).alternatives(Boolean.FALSE).language(r8);
        Boolean bool = Boolean.TRUE;
        RouteOptions routeOptions = language.steps(bool).voiceInstructions(bool).radiusesList(arrayList2).build();
        Intrinsics.checkNotNullExpressionValue(routeOptions, "build(...)");
        m8.r s10 = s();
        V6.b callback = new V6.b(7, this, jVar);
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s10.f17228h.b(routeOptions, new E8.c(E8.b.f1932a, E8.a.f1930b), callback);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:76|(2:79|77)|80|81|(2:84|82)|85|86|(1:88)(1:226)|89|(1:91)(1:225)|92|(1:94)(1:224)|95|(1:97)(1:223)|98|99|(1:101)(1:222)|102|(1:104)(1:221)|105|(4:107|(1:109)(2:202|(1:204)(2:205|(1:207)(1:208)))|110|111)(4:209|(1:211)(2:214|(1:216)(2:217|(1:219)(1:220)))|212|213)|112|113|(2:115|(1:117)(2:143|(1:145)(2:146|(1:148)(2:149|(1:151)(2:152|(1:154)(2:155|(1:157)(2:158|(1:160)(2:161|(1:163)(2:164|(1:166)(2:167|(1:169)(1:170)))))))))))(2:171|(1:173)(2:174|(1:176)(2:177|(1:179)(2:180|(1:182)(2:183|(1:185)(2:186|(4:188|119|120|(5:140|134|(1:136)|137|130)(5:124|(2:126|127)(1:139)|128|129|130))(2:189|(1:191)(2:192|(1:194)(2:195|(1:197)(2:198|(1:200)(1:201)))))))))))|118|119|120|(1:122)|140|134|(0)|137|130) */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0680, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0681, code lost:
    
        r16 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0213 A[Catch: Exception -> 0x0239, TryCatch #9 {Exception -> 0x0239, blocks: (B:283:0x01d7, B:284:0x01f3, B:286:0x01f9, B:288:0x01ff, B:290:0x0213, B:291:0x023b, B:292:0x0257), top: B:282:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x023b A[Catch: Exception -> 0x0239, TryCatch #9 {Exception -> 0x0239, blocks: (B:283:0x01d7, B:284:0x01f3, B:286:0x01f9, B:288:0x01ff, B:290:0x0213, B:291:0x023b, B:292:0x0257), top: B:282:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(X2.z r52) {
        /*
            Method dump skipped, instructions count: 2002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0498N.m(X2.z):void");
    }

    public final void n() {
        j9.e eVar;
        j9.e eVar2;
        String string2 = StubApp.getString2(103);
        String string22 = StubApp.getString2(9084);
        String string23 = StubApp.getString2(9085);
        String string24 = StubApp.getString2(9086);
        try {
            if (this.f10564T) {
                R2.c.b(string2, StubApp.getString2("9087"));
                return;
            }
            R2.c.b(string2, StubApp.getString2("9088"));
            MapView mapView = this.f10572e;
            if (mapView == null) {
                R2.c.f(string2, StubApp.getString2("9089"));
                return;
            }
            List a3 = s().f17228h.a();
            if (a3.isEmpty()) {
                R2.c.b(string2, StubApp.getString2("9090"));
                this.f10564T = true;
                return;
            }
            Y2.a aVar = this.f10598w;
            i9.d dVar = null;
            if (aVar != Y2.a.f8731b) {
                R2.c.b(string2, string24 + aVar + StubApp.getString2("9091"));
                o();
                u(null);
                this.f10564T = true;
                return;
            }
            R2.c.b(string2, string23 + a3.size() + StubApp.getString2("9092"));
            com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) CollectionsKt.firstOrNull(a3);
            if (gVar == null) {
                R2.c.f(string2, StubApp.getString2("9093"));
                this.f10564T = true;
                return;
            }
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            String profile = gVar.f12500c.profile();
            Intrinsics.checkNotNullExpressionValue(profile, "profile(...)");
            X2.j jVar = Intrinsics.areEqual(profile, "walking") ? X2.j.f8289c : Intrinsics.areEqual(profile, "cycling") ? X2.j.f8290d : X2.j.f8289c;
            this.f10596v = jVar;
            R2.c.b(string2, string22 + jVar);
            this.f10598w = Y2.a.f8730a;
            R2.c.b(string2, StubApp.getString2("9094"));
            Style styleDeprecated = mapView.getMapboxMapDeprecated().getStyleDeprecated();
            if (styleDeprecated == null) {
                R2.c.f(string2, StubApp.getString2("9098"));
                mapView.getMapboxMapDeprecated().addOnMapLoadedListener(new C0508j(this, 0));
                return;
            }
            R2.c.b(string2, StubApp.getString2("9095"));
            x9.t tVar = this.f10576k;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("routeLineApi");
                tVar = null;
            }
            tVar.e(a3, new C0507i(this, styleDeprecated, 0));
            j9.e eVar3 = this.f10575h;
            String string25 = StubApp.getString2(9024);
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string25);
                eVar = null;
            } else {
                eVar = eVar3;
            }
            eVar.d(gVar);
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string25);
                eVar2 = null;
            } else {
                eVar2 = eVar3;
            }
            eVar2.f15402k.f10727a = Double.valueOf(this.f10593t);
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string25);
                eVar3 = null;
            }
            eVar3.c();
            i9.d dVar2 = this.j;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navigationCamera");
            } else {
                dVar = dVar2;
            }
            i9.d.a(dVar);
            R2.c.b(string2, StubApp.getString2("9096"));
            this.f10564T = true;
            R2.c.b(string2, StubApp.getString2("9097"));
        } catch (Exception e10) {
            String message = e10.getMessage();
            String string26 = StubApp.getString2(9099);
            R2.c.c(string2, string26 + message);
            Log.e(string2, string26 + e10.getMessage(), e10);
        }
    }

    public final void o() {
        String string2 = StubApp.getString2(103);
        R2.c.b(string2, StubApp.getString2(9100));
        MapView mapView = this.f10572e;
        if (mapView == null) {
            R2.c.f(string2, StubApp.getString2(9101));
            return;
        }
        s().k(CollectionsKt.emptyList(), 0, null);
        s().f17228h.a();
        try {
            Style styleDeprecated = mapView.getMapboxMapDeprecated().getStyleDeprecated();
            if (styleDeprecated != null) {
                x9.t tVar = this.f10576k;
                if (tVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("routeLineApi");
                    tVar = null;
                }
                tVar.c(new C0507i(this, styleDeprecated, 1));
            }
            mapView.getMapboxMapDeprecated().triggerRepaint();
        } catch (Exception e10) {
            E1.a.u(StubApp.getString2(9102), e10.getMessage(), string2);
            Log.e(string2, StubApp.getString2(9103), e10);
        }
        this.f10579l0 = null;
        this.f10581m0 = 0;
        Context context = this.f10568a;
        if (context != null) {
            int i3 = NavigationForegroundService.f11136b;
            AbstractC0378a.C(context);
            R2.c.b(string2, StubApp.getString2(9104));
        }
        this.f10598w = null;
        this.f10596v = X2.j.f8289c;
    }

    public final String r() {
        boolean equals;
        boolean equals2;
        String str = this.f10591s;
        if (str == null) {
            str = Locale.getDefault().toLanguageTag();
        }
        Intrinsics.checkNotNull(str);
        String string2 = StubApp.getString2(9105);
        if (!StringsKt.L(str, string2) && !StringsKt.L(str, StubApp.getString2(9106)) && !StringsKt.L(str, StubApp.getString2(9107))) {
            string2 = StubApp.getString2(9108);
            if (!StringsKt.L(str, string2) && !StringsKt.L(str, StubApp.getString2(9109))) {
                equals = StringsKt__StringsJVMKt.equals(str, StubApp.getString2(9110), true);
                if (!equals) {
                    equals2 = StringsKt__StringsJVMKt.equals(str, StubApp.getString2(9111), true);
                    if (!equals2) {
                        return str;
                    }
                }
            }
        }
        return string2;
    }

    public final m8.r s() {
        return (m8.r) this.f10547G0.getValue(this, f10532Q0[0]);
    }

    public final void t() {
        String language = r();
        String str = this.f10591s;
        if (str == null) {
            str = StubApp.getString2(1116);
        }
        String languageTag = Locale.getDefault().toLanguageTag();
        StringBuilder t3 = i2.u.t(StubApp.getString2(9112), language, StubApp.getString2(9113), str, StubApp.getString2(9114));
        t3.append(languageTag);
        t3.append(StubApp.getString2(74));
        String sb2 = t3.toString();
        String string2 = StubApp.getString2(103);
        R2.c.b(string2, sb2);
        D5.B b2 = this.f10585p;
        if (b2 != null) {
            b2.v();
        }
        this.f10585p = null;
        this.f10582n = null;
        Context context = this.f10568a;
        Intrinsics.checkNotNull(context);
        G9.a options = new G9.a();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(options, "options");
        D5.B b10 = new D5.B();
        b10.f1340a = new LinkedHashMap();
        b10.f1341b = LazyKt.lazy(E9.b.f2052b);
        b10.f1342c = LazyKt.lazy(E9.b.f2053c);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(options, "options");
        b10.f1343d = new E0(new Q2.g(language, new C1590a(5), options, (C9.b) AbstractC0934b.f14183a.getValue()), new Z9.C(new File(StubApp.getOrigApplicationContext(context.getApplicationContext()).getCacheDir(), StubApp.getString2(9115))));
        this.f10585p = b10;
        this.f10582n = new E9.k(context, language);
        boolean z2 = this.f10589r;
        R2.c.b(string2, StubApp.getString2(9116) + z2 + StubApp.getString2(9117) + (z2 ? StubApp.getString2(7126) : StubApp.getString2(7127)) + StubApp.getString2(9118) + language);
        if (this.f10589r) {
            E9.k kVar = this.f10582n;
            if (kVar != null) {
                kVar.i(new F9.e(0.0f));
            }
            R2.c.b(string2, StubApp.getString2(9119));
            return;
        }
        E9.k kVar2 = this.f10582n;
        if (kVar2 != null) {
            kVar2.i(new F9.e(1.0f));
        }
        R2.c.b(string2, StubApp.getString2(9120));
    }

    public final void u(Double d8) {
        R2.c.b(StubApp.getString2(103), StubApp.getString2(9121) + d8);
        Location location = this.f10574g;
        if (location == null) {
            DeviceLocationProvider deviceLocationProvider = this.f10573f;
            if (deviceLocationProvider != null) {
                deviceLocationProvider.getLastLocation(new C0043g(16, this, d8));
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(location);
        double longitude = location.getLongitude();
        Location location2 = this.f10574g;
        Intrinsics.checkNotNull(location2);
        w(longitude, location2.getLatitude(), d8);
    }

    public final void w(double d8, double d10, Double d11) {
        R2.c.b(StubApp.getString2(103), StubApp.getString2(9122) + d8 + StubApp.getString2(9123) + d10 + StubApp.getString2(9124) + d11);
        x(d8, d10, d11);
    }

    public final void x(double d8, double d10, Double d11) {
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.center(Point.fromLngLat(d8, d10));
        if (d11 != null) {
            builder.zoom(Double.valueOf(d11.doubleValue()));
        }
        builder.pitch(Double.valueOf(0.0d));
        builder.bearing(Double.valueOf(0.0d));
        CameraOptions build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(block).build()");
        MapView mapView = this.f10572e;
        if (mapView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapView");
            mapView = null;
        }
        MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
        Unit unit = Unit.INSTANCE;
        Y6.k.d(mapboxMapDeprecated, build, new Y6.t(null, 1000L, null));
    }

    public final void y() {
        R2.c.b(StubApp.getString2(103), StubApp.getString2(9125));
        Qb.L.j(this.f10587q, null, new C0485A(this, null), 3);
    }

    public final void z(List stops, X2.j travelMode, Function1 function1) {
        int i3 = 2;
        Intrinsics.checkNotNullParameter(stops, "stops");
        Intrinsics.checkNotNullParameter(travelMode, "travelMode");
        int i10 = this.f10577k0 + 1;
        this.f10577k0 = i10;
        String str = StubApp.getString2(9126) + this.f10598w + StubApp.getString2(9127) + i10;
        String string2 = StubApp.getString2(103);
        R2.c.b(string2, str);
        Y2.a aVar = this.f10598w;
        Y2.a aVar2 = Y2.a.f8731b;
        Vb.f fVar = this.f10587q;
        if (aVar == aVar2) {
            R2.c.f(string2, StubApp.getString2(9128));
            Qb.L.j(fVar, null, new C0486B(this, stops, travelMode, function1, null), 3);
            return;
        }
        R2.c.b(string2, StubApp.getString2(9129) + r());
        if (this.f10585p == null || this.f10582n == null) {
            R2.c.b(string2, StubApp.getString2(9130));
            t();
        }
        this.f10596v = travelMode;
        if (this.f10574g == null) {
            if (this.f10577k0 < 10) {
                Qb.L.j(fVar, null, new C0487C(this, stops, travelMode, function1, null), 3);
                return;
            }
            R2.c.c(string2, StubApp.getString2(9131));
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(9132))))));
            return;
        }
        this.f10577k0 = 0;
        if (this.f10598w == null && !s().f17228h.a().isEmpty()) {
            R2.c.b(string2, StubApp.getString2(9133));
            s().k(CollectionsKt.emptyList(), 0, null);
            MapView mapView = this.f10572e;
            if (mapView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapView");
                mapView = null;
            }
            Style styleDeprecated = mapView.getMapboxMapDeprecated().getStyleDeprecated();
            if (styleDeprecated != null) {
                x9.t tVar = this.f10576k;
                if (tVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("routeLineApi");
                    tVar = null;
                }
                tVar.c(new C0507i(this, styleDeprecated, i3));
            }
        }
        Y2.a aVar3 = this.f10598w;
        int i11 = aVar3 == null ? -1 : AbstractC0516r.f10651a[aVar3.ordinal()];
        if (i11 == -1) {
            R2.c.b(string2, StubApp.getString2(9138));
            F(stops, function1, true);
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            R2.c.b(string2, StubApp.getString2(9134));
            y();
            Qb.L.j(fVar, null, new C0489E(this, stops, function1, null), 3);
            return;
        }
        R2.c.b(string2, StubApp.getString2(9135));
        if (!s().f17228h.a().isEmpty()) {
            R2.c.b(string2, StubApp.getString2(9137));
            Qb.L.j(fVar, null, new C0488D(this, function1, null), 3);
        } else {
            R2.c.f(string2, StubApp.getString2(9136));
            this.f10598w = null;
            F(stops, function1, true);
        }
    }
}
