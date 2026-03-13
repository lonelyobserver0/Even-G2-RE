package b3;

import X2.C0359a;
import X2.C0360b;
import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0444t;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.AccuracyLevel;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.IntervalSettings;
import com.mapbox.common.location.Location;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.common.location.LocationService;
import com.mapbox.common.location.LocationServiceFactory;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapInitOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* renamed from: b3.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0503e implements PlatformView, DefaultLifecycleObserver, X2.d {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f10610n = {Reflection.property1(new PropertyReference1Impl(C0503e.class, StubApp.getString2(8977), StubApp.getString2(8978), 0))};

    /* renamed from: a, reason: collision with root package name */
    public final Context f10611a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f10612b;

    /* renamed from: c, reason: collision with root package name */
    public final BinaryMessenger f10613c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10614d;

    /* renamed from: e, reason: collision with root package name */
    public final MapView f10615e;

    /* renamed from: f, reason: collision with root package name */
    public final C0359a f10616f;

    /* renamed from: g, reason: collision with root package name */
    public Location f10617g;

    /* renamed from: h, reason: collision with root package name */
    public final DeviceLocationProvider f10618h;
    public List j;

    /* renamed from: k, reason: collision with root package name */
    public final b7.c f10619k;

    /* renamed from: l, reason: collision with root package name */
    public final double f10620l;

    /* renamed from: m, reason: collision with root package name */
    public final double f10621m;

    public C0503e(Context context, Map map, BinaryMessenger messenger, InterfaceC0444t lifecycleOwner, int i3) {
        boolean z2;
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f10611a = context;
        this.f10612b = map;
        this.f10613c = messenger;
        this.f10614d = i3;
        this.j = CollectionsKt.emptyList();
        this.f10620l = 1.0d;
        this.f10621m = 1.34d;
        C0499a listener = new C0499a();
        V8.D d8 = new V8.D(this, 1);
        boolean z10 = context instanceof AbstractActivityC0364d;
        if (z10) {
            z2 = ((AbstractActivityC0364d) context).j();
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            z2 = true;
        }
        C0500b c0500b = new C0500b(lifecycleOwner.i(), z2, 0);
        this.f10616f = new C0359a(messenger, String.valueOf(i3));
        String valueOf = String.valueOf(i3);
        X2.d.f8263Q.getClass();
        X2.c.a(messenger, this, valueOf);
        String string2 = StubApp.getString2(7105);
        if (context != null) {
            C0360b navigationOptionsProvider = new C0360b(this, 3);
            Lazy lazy = H8.b.f2941a;
            Intrinsics.checkNotNullParameter(navigationOptionsProvider, "navigationOptionsProvider");
            D9.l.d(StubApp.getString2(2973), StubApp.getString2(2972));
            H8.b.a().b(navigationOptionsProvider);
            MapView mapView = new MapView(context, new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null));
            mapView.setBackgroundColor(-1);
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
            Intrinsics.checkNotNullParameter(listener, "listener");
            o5.f16794h.add(listener);
            Double d10 = o5.f16792f;
            if (d10 != null) {
                listener.a(d10.doubleValue());
            }
            androidx.lifecycle.L.e(mapView, c0500b);
            MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
            CameraOptions.Builder bearing = new CameraOptions.Builder().pitch(Double.valueOf(0.0d)).zoom(Double.valueOf(8.0d)).bearing(Double.valueOf(0.0d));
            Location location = this.f10617g;
            double longitude = location != null ? location.getLongitude() : 0.0d;
            Location location2 = this.f10617g;
            CameraOptions build = bearing.center(Point.fromLngLat(longitude, location2 != null ? location2.getLatitude() : 0.0d)).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            mapboxMapDeprecated.setCamera(build);
            this.f10615e = mapView;
            LocationService orCreate = LocationServiceFactory.getOrCreate();
            Intrinsics.checkNotNullExpressionValue(orCreate, "getOrCreate(...)");
            Expected<LocationError, DeviceLocationProvider> deviceLocationProvider = orCreate.getDeviceLocationProvider(new LocationProviderRequest.Builder().interval(new IntervalSettings.Builder().interval(0L).minimumInterval(0L).maximumInterval(0L).build()).displacement(Float.valueOf(0.0f)).accuracy(AccuracyLevel.HIGHEST).build());
            if (deviceLocationProvider.isValue()) {
                DeviceLocationProvider value = deviceLocationProvider.getValue();
                Intrinsics.checkNotNull(value);
                this.f10618h = value;
            } else {
                Log.e(string2, StubApp.getString2(9141));
            }
            DeviceLocationProvider deviceLocationProvider2 = this.f10618h;
            if (deviceLocationProvider2 != null) {
                deviceLocationProvider2.addLocationObserver(d8);
            }
            Intrinsics.checkNotNullParameter(mapView, "<this>");
            X6.j plugin4 = mapView.getPlugin(StubApp.getString2(9142));
            Intrinsics.checkNotNull(plugin4);
            a7.g gVar = (a7.g) plugin4;
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            a7.h type = a7.h.f9323a;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            A3.s sVar = gVar.f9319a;
            if (sVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegateProvider");
                sVar = null;
            }
            b7.c cVar = new b7.c(sVar);
            gVar.f9320b.add(new WeakReference(cVar));
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager");
            this.f10619k = cVar;
            C0502d i10 = new C0502d(this);
            Intrinsics.checkNotNullParameter(i10, "i");
            cVar.f9318s.add(i10);
        } else {
            R2.c.c(string2, StubApp.getString2(9143));
        }
        W.a.u(lifecycleOwner, new C0501c(), new J2.d(this, 4));
    }

    public final void a(List locations) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        String str = StubApp.getString2(9144) + locations.size() + StubApp.getString2(9145);
        String string2 = StubApp.getString2(7105);
        R2.c.b(string2, str);
        if (this.f10615e == null) {
            R2.c.c(string2, StubApp.getString2(9146));
            return;
        }
        this.j = locations;
        b7.c cVar = this.f10619k;
        if (cVar != null) {
            cVar.f();
        }
        if (locations.isEmpty()) {
            R2.c.b(string2, StubApp.getString2(9147));
            return;
        }
        List list = this.j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            X2.l lVar = (X2.l) obj;
            double d8 = lVar.f8299c;
            if (-90.0d <= d8 && d8 <= 90.0d) {
                double d10 = lVar.f8300d;
                if (-180.0d <= d10 && d10 <= 180.0d) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList.isEmpty()) {
            R2.c.f(string2, StubApp.getString2(9148));
            return;
        }
        if (arrayList.size() != this.j.size()) {
            R2.c.f(string2, StubApp.getString2(9149) + (this.j.size() - arrayList.size()) + StubApp.getString2(9150));
        }
        try {
            Context context = this.f10611a;
            Bitmap iconImageBitmap = null;
            if (context != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                try {
                    Drawable drawable = context.getDrawable(2131165336);
                    if (drawable != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        drawable.setBounds(0, 0, 100, 100);
                        drawable.draw(canvas);
                        iconImageBitmap = createBitmap;
                    }
                } catch (Exception e10) {
                    R2.c.c(StubApp.getString2("9152"), StubApp.getString2("9151") + e10.getMessage());
                }
            }
            if (iconImageBitmap == null) {
                R2.c.c(string2, StubApp.getString2("9153"));
                return;
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i10 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                X2.l lVar2 = (X2.l) next;
                b7.d dVar = new b7.d();
                Point point = Point.fromLngLat(lVar2.f8300d, lVar2.f8299c);
                Intrinsics.checkNotNullExpressionValue(point, "fromLngLat(...)");
                Intrinsics.checkNotNullParameter(point, "point");
                dVar.f10720b = point;
                JsonObject jsonElement = new JsonObject();
                jsonElement.addProperty(StubApp.getString2("8110"), Integer.valueOf(i3));
                jsonElement.addProperty(StubApp.getString2("662"), new Gson().toJson(lVar2));
                Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
                dVar.f10719a = jsonElement;
                Intrinsics.checkNotNullParameter(iconImageBitmap, "iconImageBitmap");
                dVar.f10721c = iconImageBitmap;
                dVar.f10722d = Double.valueOf(this.f10620l);
                arrayList2.add(dVar);
                i3 = i10;
            }
            if (cVar != null) {
                cVar.e(arrayList2);
            }
            R2.c.b(string2, StubApp.getString2("9154") + arrayList2.size() + StubApp.getString2("9155"));
            X2.l lVar3 = (X2.l) arrayList.get(0);
            R2.c.b(string2, StubApp.getString2("9156") + lVar3.f8299c + StubApp.getString2("81") + lVar3.f8300d);
            b(lVar3.f8300d, lVar3.f8299c, Double.valueOf(8.0d));
        } catch (Exception e11) {
            E1.a.u(StubApp.getString2(9157), e11.getMessage(), string2);
        }
    }

    public final void b(double d8, double d10, Double d11) {
        MapView mapView = this.f10615e;
        if (mapView == null) {
            R2.c.f(StubApp.getString2(7105), StubApp.getString2(9158));
            return;
        }
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.center(Point.fromLngLat(d8, d10));
        builder.padding(new EdgeInsets(24.0d, 24.0d, 24.0d, 24.0d));
        if (d11 != null) {
            builder.zoom(Double.valueOf(d11.doubleValue()));
        }
        builder.pitch(Double.valueOf(0.0d));
        builder.bearing(Double.valueOf(0.0d));
        CameraOptions build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(block).build()");
        MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
        DecelerateInterpolator interpolator = new DecelerateInterpolator();
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Unit unit = Unit.INSTANCE;
        Y6.k.d(mapboxMapDeprecated, build, new Y6.t(null, 500L, interpolator));
    }

    public final void c(long j) {
        String str = StubApp.getString2(9159) + j;
        String string2 = StubApp.getString2(7105);
        R2.c.b(string2, str);
        if (this.f10615e == null) {
            R2.c.c(string2, StubApp.getString2(9160));
            return;
        }
        if (j < 0 || j >= this.j.size()) {
            R2.c.f(string2, StubApp.getString2(9162) + j + StubApp.getString2(9163) + this.j.size());
            return;
        }
        X2.l lVar = (X2.l) this.j.get((int) j);
        b(lVar.f8300d, lVar.f8299c, null);
        b7.c cVar = this.f10619k;
        if (cVar != null) {
            LinkedHashMap linkedHashMap = cVar.f9305e;
            Collection values = linkedHashMap.values();
            Intrinsics.checkNotNullExpressionValue(values, "annotationMap.values");
            LinkedHashMap linkedHashMap2 = cVar.f9306f;
            Collection values2 = linkedHashMap2.values();
            Intrinsics.checkNotNullExpressionValue(values2, "dragAnnotationMap.values");
            List plus = CollectionsKt___CollectionsKt.plus(values, (Iterable) values2);
            if (plus != null) {
                int i3 = 0;
                for (Object obj : plus) {
                    int i10 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    b7.a annotation = (b7.a) obj;
                    Point point = annotation.f10711c;
                    annotation.f10710b.addProperty(StubApp.getString2(8523), Double.valueOf((point.latitude() == lVar.f8299c && point.longitude() == lVar.f8300d) ? this.f10621m : this.f10620l));
                    Intrinsics.checkNotNullParameter(annotation, "annotation");
                    String str2 = annotation.f10709a;
                    if (linkedHashMap.containsKey(str2)) {
                        linkedHashMap.put(str2, annotation);
                        cVar.m();
                    } else if (linkedHashMap2.containsKey(str2)) {
                        linkedHashMap2.put(str2, annotation);
                        cVar.l();
                    } else {
                        MapboxLogger.logE(StubApp.getString2(8509), StubApp.getString2(9161) + annotation + StubApp.getString2(8508));
                    }
                    i3 = i10;
                }
            }
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public final void dispose() {
        R2.c.b(StubApp.getString2(7105), StubApp.getString2(9049));
        String valueOf = String.valueOf(this.f10614d);
        X2.d.f8263Q.getClass();
        X2.c.a(this.f10613c, null, valueOf);
        this.j = CollectionsKt.emptyList();
        b7.c cVar = this.f10619k;
        if (cVar != null) {
            cVar.f();
        }
        MapView mapView = this.f10615e;
        if (mapView != null) {
            mapView.onDestroy();
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public final View getView() {
        MapView mapView = this.f10615e;
        if (mapView == null) {
            return null;
        }
        if (mapView != null) {
            return mapView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapView");
        return null;
    }
}
