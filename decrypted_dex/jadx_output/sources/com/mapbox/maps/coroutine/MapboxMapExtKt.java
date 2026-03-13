package com.mapbox.maps.coroutine;

import Qb.C0203k;
import Qb.W;
import Tb.C0322c;
import Tb.InterfaceC0327h;
import Tb.Q;
import Vb.q;
import Xb.d;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.FeatureExtensionValue;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.QueryFeatureExtensionCallback;
import com.mapbox.maps.QueryFeatureStateCallback;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.UtilsKt$suspendMapboxCancellableCoroutine$2$1;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\n\u001aC\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a?\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aK\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a7\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aG\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a!\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(*\u00020\u00002\u0006\u0010'\u001a\u00020\bH\u0007¢\u0006\u0004\b*\u0010+\u001aQ\u00106\u001a\u00020/*\u00020\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u000105H\u0087@ø\u0001\u0000¢\u0006\u0004\b6\u00107\"\u001b\u0010;\u001a\b\u0012\u0004\u0012\u0002080(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u001b\u0010>\u001a\b\u0012\u0004\u0012\u00020<0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b=\u0010:\"\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020?0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b@\u0010:\"\u001b\u0010D\u001a\b\u0012\u0004\u0012\u00020B0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bC\u0010:\"\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020E0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bF\u0010:\"$\u0010L\u001a\b\u0012\u0004\u0012\u00020H0(*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010:\"\u001b\u0010O\u001a\b\u0012\u0004\u0012\u00020M0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bN\u0010:\"\u001b\u0010R\u001a\b\u0012\u0004\u0012\u00020P0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bQ\u0010:\"\u001b\u0010U\u001a\b\u0012\u0004\u0012\u00020S0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bT\u0010:\"\u001b\u0010X\u001a\b\u0012\u0004\u0012\u00020V0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bW\u0010:\"\u001b\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bZ\u0010:\"\u001b\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b]\u0010:\"\u001b\u0010a\u001a\b\u0012\u0004\u0012\u00020_0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b`\u0010:\"\u001b\u0010d\u001a\b\u0012\u0004\u0012\u00020b0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bc\u0010:\"\u001b\u0010g\u001a\b\u0012\u0004\u0012\u00020e0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bf\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006h"}, d2 = {"Lcom/mapbox/maps/MapboxMap;", "Lcom/mapbox/maps/Style;", "awaitStyle", "(Lcom/mapbox/maps/MapboxMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LM6/a;", "styleExtension", "awaitLoadStyle", "(Lcom/mapbox/maps/MapboxMap;LM6/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "style", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sourceIdentifier", "Lcom/mapbox/geojson/Feature;", "cluster", "", "limit", "offset", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/FeatureExtensionValue;", "getGeoJsonClusterLeaves", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGeoJsonClusterChildren", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGeoJsonClusterExpansionZoom", "sourceId", "sourceLayerId", "featureId", "Lcom/mapbox/bindgen/Value;", "getFeatureState", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stateKey", "Lcom/mapbox/bindgen/None;", "removeFeatureState", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetFeatureStates", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "setFeatureState", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eventName", "LTb/h;", "Lcom/mapbox/maps/GenericEvent;", "genericEvents", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;)LTb/h;", "", "Lcom/mapbox/geojson/Point;", "coordinates", "Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/EdgeInsets;", "coordinatesPadding", "", "maxZoom", "Lcom/mapbox/maps/ScreenCoordinate;", "cameraForCoordinates", "(Lcom/mapbox/maps/MapboxMap;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/mapbox/maps/MapLoaded;", "getMapLoadedEvents", "(Lcom/mapbox/maps/MapboxMap;)LTb/h;", "mapLoadedEvents", "Lcom/mapbox/maps/MapLoadingError;", "getMapLoadingErrorEvents", "mapLoadingErrorEvents", "Lcom/mapbox/maps/StyleLoaded;", "getStyleLoadedEvents", "styleLoadedEvents", "Lcom/mapbox/maps/StyleDataLoaded;", "getStyleDataLoadedEvents", "styleDataLoadedEvents", "Lcom/mapbox/maps/CameraChanged;", "getCameraChangedEvents", "cameraChangedEvents", "Lcom/mapbox/maps/CameraChangedCoalesced;", "getCameraChangedCoalescedEvents", "getCameraChangedCoalescedEvents$annotations", "(Lcom/mapbox/maps/MapboxMap;)V", "cameraChangedCoalescedEvents", "Lcom/mapbox/maps/MapIdle;", "getMapIdleEvents", "mapIdleEvents", "Lcom/mapbox/maps/SourceAdded;", "getSourceAddedEvents", "sourceAddedEvents", "Lcom/mapbox/maps/SourceRemoved;", "getSourceRemovedEvents", "sourceRemovedEvents", "Lcom/mapbox/maps/SourceDataLoaded;", "getSourceDataLoadedEvents", "sourceDataLoadedEvents", "Lcom/mapbox/maps/StyleImageMissing;", "getStyleImageMissingEvents", "styleImageMissingEvents", "Lcom/mapbox/maps/StyleImageRemoveUnused;", "getStyleImageRemoveUnusedEvents", "styleImageRemoveUnusedEvents", "Lcom/mapbox/maps/RenderFrameStarted;", "getRenderFrameStartedEvents", "renderFrameStartedEvents", "Lcom/mapbox/maps/RenderFrameFinished;", "getRenderFrameFinishedEvents", "renderFrameFinishedEvents", "Lcom/mapbox/maps/ResourceRequest;", "getResourceRequestEvents", "resourceRequestEvents", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxMapExtKt {
    public static final /* synthetic */ Object awaitLoadStyle(MapboxMap mapboxMap, M6.a aVar, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        mapboxMap.loadStyle(aVar, new MapboxMapExtKt$awaitLoadStyle$2$1(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final /* synthetic */ Object awaitStyle(MapboxMap mapboxMap, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        mapboxMap.getStyle(new MapboxMapExtKt$awaitStyle$2$1(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated because extension is shadowed by non-suspend method", replaceWith = @ReplaceWith(expression = "awaitCameraForCoordinates(coordinates, camera, coordinatesPadding, maxZoom, offset)", imports = {}))
    public static final /* synthetic */ Object cameraForCoordinates(MapboxMap mapboxMap, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d8, ScreenCoordinate screenCoordinate, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        mapboxMap.cameraForCoordinates(list, cameraOptions, edgeInsets, d8, screenCoordinate, new MapboxMapExtKt$cameraForCoordinates$2$1(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static /* synthetic */ Object cameraForCoordinates$default(MapboxMap mapboxMap, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d8, ScreenCoordinate screenCoordinate, Continuation continuation, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            edgeInsets = null;
        }
        if ((i3 & 8) != 0) {
            d8 = null;
        }
        if ((i3 & 16) != 0) {
            screenCoordinate = null;
        }
        return cameraForCoordinates(mapboxMap, list, cameraOptions, edgeInsets, d8, screenCoordinate, continuation);
    }

    @MapboxExperimental
    public static final InterfaceC0327h genericEvents(MapboxMap mapboxMap, String eventName) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        C0322c e10 = Q.e(new MapboxMapExtKt$genericEvents$1(mapboxMap, eventName, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getCameraChangedCoalescedEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$cameraChangedCoalescedEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static /* synthetic */ void getCameraChangedCoalescedEvents$annotations(MapboxMap mapboxMap) {
    }

    public static final InterfaceC0327h getCameraChangedEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$cameraChangedEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final /* synthetic */ Object getFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, Continuation continuation) {
        final C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        c0203k.u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getFeatureState(str, str2, str3, new QueryFeatureStateCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getFeatureState$2$1
            @Override // com.mapbox.maps.QueryFeatureStateCallback
            public final void run(Expected<String, Value> p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                c0203k.resumeWith(Result.m40constructorimpl(p02));
            }
        })));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8;
    }

    public static /* synthetic */ Object getFeatureState$default(MapboxMap mapboxMap, String str, String str2, String str3, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        return getFeatureState(mapboxMap, str, str2, str3, continuation);
    }

    public static final /* synthetic */ Object getGeoJsonClusterChildren(MapboxMap mapboxMap, String str, Feature feature, Continuation continuation) {
        final C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        c0203k.u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterChildren(str, feature, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterChildren$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                c0203k.resumeWith(Result.m40constructorimpl(p02));
            }
        })));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8;
    }

    public static final /* synthetic */ Object getGeoJsonClusterExpansionZoom(MapboxMap mapboxMap, String str, Feature feature, Continuation continuation) {
        final C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        c0203k.u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterExpansionZoom(str, feature, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterExpansionZoom$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                c0203k.resumeWith(Result.m40constructorimpl(p02));
            }
        })));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8;
    }

    public static final /* synthetic */ Object getGeoJsonClusterLeaves(MapboxMap mapboxMap, String str, Feature feature, long j, long j3, Continuation continuation) {
        final C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        c0203k.u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterLeaves(str, feature, j, j3, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterLeaves$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                c0203k.resumeWith(Result.m40constructorimpl(p02));
            }
        })));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8;
    }

    public static final InterfaceC0327h getMapIdleEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$mapIdleEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getMapLoadedEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$mapLoadedEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getMapLoadingErrorEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$mapLoadingErrorEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getRenderFrameFinishedEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$renderFrameFinishedEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getRenderFrameStartedEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$renderFrameStartedEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getResourceRequestEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$resourceRequestEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getSourceAddedEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$sourceAddedEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getSourceDataLoadedEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$sourceDataLoadedEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getSourceRemovedEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$sourceRemovedEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getStyleDataLoadedEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$styleDataLoadedEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getStyleImageMissingEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$styleImageMissingEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getStyleImageRemoveUnusedEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$styleImageRemoveUnusedEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final InterfaceC0327h getStyleLoadedEvents(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        C0322c e10 = Q.e(new MapboxMapExtKt$styleLoadedEvents$1(mapboxMap, null));
        d dVar = W.f5838a;
        return Q.d(Q.k(e10, q.f7968a.f6359c), -1);
    }

    public static final /* synthetic */ Object removeFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, String str4, Continuation continuation) {
        final C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        c0203k.u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.removeFeatureState(str, str2, str3, str4, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$removeFeatureState$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                c0203k.resumeWith(Result.m40constructorimpl(p02));
            }
        })));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8;
    }

    public static /* synthetic */ Object removeFeatureState$default(MapboxMap mapboxMap, String str, String str2, String str3, String str4, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        if ((i3 & 8) != 0) {
            str4 = null;
        }
        return removeFeatureState(mapboxMap, str, str2, str3, str4, continuation);
    }

    public static final /* synthetic */ Object resetFeatureStates(MapboxMap mapboxMap, String str, String str2, Continuation continuation) {
        final C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        c0203k.u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.resetFeatureStates(str, str2, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$resetFeatureStates$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                c0203k.resumeWith(Result.m40constructorimpl(p02));
            }
        })));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8;
    }

    public static /* synthetic */ Object resetFeatureStates$default(MapboxMap mapboxMap, String str, String str2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        return resetFeatureStates(mapboxMap, str, str2, continuation);
    }

    public static final /* synthetic */ Object setFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, Value value, Continuation continuation) {
        final C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        c0203k.u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.setFeatureState(str, str2, str3, value, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$setFeatureState$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                c0203k.resumeWith(Result.m40constructorimpl(p02));
            }
        })));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8;
    }

    public static /* synthetic */ Object setFeatureState$default(MapboxMap mapboxMap, String str, String str2, String str3, Value value, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        return setFeatureState(mapboxMap, str, str2, str3, value, continuation);
    }

    public static final /* synthetic */ Object awaitLoadStyle(MapboxMap mapboxMap, String str, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        mapboxMap.loadStyle(str, new MapboxMapExtKt$awaitLoadStyle$4$1(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
