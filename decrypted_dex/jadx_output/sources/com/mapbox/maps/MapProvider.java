package com.mapbox.maps;

import A3.s;
import Qb.H;
import Qb.I;
import Qb.J;
import Qb.L;
import Qb.W;
import Vb.q;
import android.content.Context;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.EventsServerOptions;
import com.mapbox.common.EventsService;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.TelemetryService;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import com.stub.StubApp;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J-\u0010*\u001a\u00020)2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020'¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u0010\u0003R\u0016\u00102\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/mapbox/maps/MapProvider;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LC6/b;", "type", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "(Landroid/content/Context;LC6/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "Lcom/mapbox/maps/MapView;", "Lcom/mapbox/maps/MapController;", "getController", "(Lcom/mapbox/maps/MapView;)Lcom/mapbox/maps/MapController;", "Lcom/mapbox/maps/MapInitOptions;", "mapInitOptions", "Lcom/mapbox/maps/MapClient;", "mapClient", "Lcom/mapbox/maps/NativeMapImpl;", "getNativeMapWrapper", "(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapClient;)Lcom/mapbox/maps/NativeMapImpl;", "mapView", "Lcom/mapbox/maps/Map;", "getNativeMapCore", "(Lcom/mapbox/maps/MapView;)Lcom/mapbox/maps/Map;", "nativeMap", "Lcom/mapbox/maps/NativeObserver;", "nativeObserver", "", "pixelRatio", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;F)Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "mapController", "Lcom/mapbox/maps/module/MapTelemetry;", "telemetry", "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "mapGeofencingConsent", "LX6/k;", "getMapPluginRegistry", "(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/module/MapTelemetry;Lcom/mapbox/maps/geofencing/MapGeofencingConsent;)LX6/k;", "getMapTelemetryInstance", "(Landroid/content/Context;)Lcom/mapbox/maps/module/MapTelemetry;", "getMapGeofencingConsent", "()Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "", "flushPendingEvents", "mapTelemetry", "Lcom/mapbox/maps/module/MapTelemetry;", "LQb/I;", "mainScope", "LQb/I;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapProvider {
    public static final MapProvider INSTANCE = new MapProvider();
    private static final I mainScope;
    private static MapTelemetry mapTelemetry;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C6.b.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        CoroutineContext plus = new H(StubApp.getString2(13936)).plus(L.b());
        Xb.d dVar = W.f5838a;
        mainScope = J.a(plus.plus(q.f7968a));
    }

    private MapProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushPendingEvents$lambda$1(Expected expected) {
        Intrinsics.checkNotNullParameter(expected, "expected");
        String str = (String) expected.getError();
        if (str != null) {
            MapboxLogger.logE(StubApp.getString2(13936), StubApp.getString2(13983).concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushPendingEvents$lambda$3(Expected expected) {
        Intrinsics.checkNotNullParameter(expected, "expected");
        String str = (String) expected.getError();
        if (str != null) {
            MapboxLogger.logE(StubApp.getString2(13936), StubApp.getString2(13984).concat(str));
        }
    }

    private final MapController getController(MapView mapView) {
        return mapView.getMapController$maps_sdk_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleProviderArgument[] paramsProvider(Context context, C6.b type) {
        if (WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return new ModuleProviderArgument[]{new ModuleProviderArgument(Context.class, StubApp.getOrigApplicationContext(context.getApplicationContext()))};
        }
        throw new IllegalArgumentException(type.name() + StubApp.getString2(13985));
    }

    public final void flushPendingEvents() {
        EventsService.getOrCreate(new EventsServerOptions(new SdkInformation(StubApp.getString2(13986), StubApp.getString2(13987), null), null)).flush(new com.mapbox.common.module.cronet.a(2));
        TelemetryService.getOrCreate().flush(new com.mapbox.common.module.cronet.a(3));
    }

    public final MapGeofencingConsent getMapGeofencingConsent() {
        return new MapGeofencingConsentImpl();
    }

    public final X6.k getMapPluginRegistry(MapboxMap mapboxMap, MapController mapController, MapTelemetry telemetry, MapGeofencingConsent mapGeofencingConsent) {
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(mapController, "mapController");
        Intrinsics.checkNotNullParameter(telemetry, "telemetry");
        Intrinsics.checkNotNullParameter(mapGeofencingConsent, "mapGeofencingConsent");
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(mapController, "mapController");
        Intrinsics.checkNotNullParameter(telemetry, "telemetry");
        Intrinsics.checkNotNullParameter(mapGeofencingConsent, "mapGeofencingConsent");
        s sVar = new s();
        sVar.f189a = mapboxMap;
        sVar.f190b = mapboxMap;
        sVar.f191c = mapboxMap;
        sVar.f192d = mapboxMap;
        sVar.f193e = LazyKt.lazy(new Ac.l(sVar, telemetry, mapGeofencingConsent, 2));
        sVar.f194f = mapController;
        sVar.f195g = mapboxMap;
        sVar.f196h = mapboxMap;
        sVar.f197i = mapboxMap;
        return new X6.k(sVar);
    }

    public final MapTelemetry getMapTelemetryInstance(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (mapTelemetry == null) {
            mapTelemetry = (MapTelemetry) MapboxModuleProvider.INSTANCE.createModule(C6.b.f1127f, new Function1<C6.b, ModuleProviderArgument[]>() { // from class: com.mapbox.maps.MapProvider$getMapTelemetryInstance$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final ModuleProviderArgument[] invoke(C6.b it) {
                    ModuleProviderArgument[] paramsProvider;
                    Intrinsics.checkNotNullParameter(it, "it");
                    paramsProvider = MapProvider.INSTANCE.paramsProvider(context, C6.b.f1127f);
                    return paramsProvider;
                }
            });
        }
        L.j(mainScope, null, new MapProvider$getMapTelemetryInstance$3(null), 3);
        MapTelemetry mapTelemetry2 = mapTelemetry;
        if (mapTelemetry2 != null) {
            return mapTelemetry2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapTelemetry");
        return null;
    }

    public final MapboxMap getMapboxMap(NativeMapImpl nativeMap, NativeObserver nativeObserver, float pixelRatio) {
        Intrinsics.checkNotNullParameter(nativeMap, "nativeMap");
        Intrinsics.checkNotNullParameter(nativeObserver, "nativeObserver");
        return MapboxMap.INSTANCE.invoke$maps_sdk_release(nativeMap, nativeObserver, pixelRatio);
    }

    public final Map getNativeMapCore(MapView mapView) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        return getController(mapView).getNativeMap().getMap();
    }

    public final NativeMapImpl getNativeMapWrapper(MapInitOptions mapInitOptions, MapClient mapClient) {
        Intrinsics.checkNotNullParameter(mapInitOptions, "mapInitOptions");
        Intrinsics.checkNotNullParameter(mapClient, "mapClient");
        return new NativeMapImpl(new Map(mapClient, mapInitOptions.getMapOptions()));
    }
}
