package com.mapbox.maps;

import Qb.H;
import Qb.I;
import Qb.J;
import Qb.L;
import Qb.L0;
import Qb.W;
import Vb.q;
import X6.m;
import X6.r;
import X6.u;
import Y6.t;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import c5.B;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxOptions;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.Style;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.widget.Widget;
import com.mapbox.maps.util.CoreGesturesHandler;
import com.stub.StubApp;
import i7.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import k7.C1115a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u0002:\u0004\u0087\u0001\u0088\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0007\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b'\u0010&J\u001f\u0010+\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020-2\u0006\u0010.\u001a\u00020$H\u0016¢\u0006\u0004\b/\u00100J\u0011\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00102\u001a\u00020\u001b2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b2\u00106J\u0017\u00108\u001a\u00020\u001b2\u0006\u00107\u001a\u00020(H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u001b2\u0006\u00105\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020$2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bK\u0010JJ\u0017\u0010N\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020(H\u0000¢\u0006\u0004\bM\u00109J#\u0010S\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010P*\u00020O2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010Y\u001a\u00020\u001b2\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\b[\u0010\\J!\u0010^\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020\u00052\n\b\u0002\u0010V\u001a\u0004\u0018\u00010U¢\u0006\u0004\b^\u0010_J\u0017\u0010b\u001a\u00020\u001b2\u0006\u0010V\u001a\u00020UH\u0000¢\u0006\u0004\b`\u0010aR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010c\u001a\u0004\bd\u0010eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010gR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010hR\u0014\u0010i\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010kR\u0014\u0010l\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001a\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bo\u0010p\u0012\u0004\bq\u0010\u001dR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010w\u001a\u00020v8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR+\u0010|\u001a\u00020{8\u0000@\u0000X\u0081\u000e¢\u0006\u001b\n\u0004\b|\u0010}\u0012\u0005\b\u0082\u0001\u0010\u001d\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u0086\u0001R\u0014\u0010\u0010\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u0089\u0001"}, d2 = {"Lcom/mapbox/maps/MapController;", "Lg7/f;", "Lcom/mapbox/maps/MapControllable;", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "renderer", "Lcom/mapbox/maps/MapInitOptions;", "mapInitOptions", "<init>", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/MapInitOptions;)V", "Lcom/mapbox/maps/NativeObserver;", "nativeObserver", "Lcom/mapbox/maps/ContextMode;", "contextMode", "Lcom/mapbox/maps/NativeMapImpl;", "nativeMap", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "LX6/k;", "pluginRegistry", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "onStyleLoadingFinishedListener", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/ContextMode;Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/MapboxMap;LX6/k;Lcom/mapbox/maps/StyleDataLoadedCallback;)V", "getNativeMap", "()Lcom/mapbox/maps/NativeMapImpl;", "getMapboxMapDeprecated", "()Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "", "onStart", "()V", "onStop", "onResume", "onDestroy", "onLowMemory", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onGenericMotionEvent", "", "w", "h", "onSizeChanged", "(II)V", "Ljava/lang/Runnable;", "needRender", "queueEvent", "(Ljava/lang/Runnable;Z)V", "Landroid/graphics/Bitmap;", "snapshot", "()Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", "listener", "(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V", "fps", "setMaximumFps", "(I)V", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setOnFpsChangedListener", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "renderThreadStatsRecorder", "setRenderThreadStatsRecorder", "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V", "Lcom/mapbox/maps/renderer/widget/Widget;", "widget", "addWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)V", "removeWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)Z", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "rendererSetupErrorListener", "addRendererSetupErrorListener", "(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V", "removeRendererSetupErrorListener", "refreshRate", "setScreenRefreshRate$maps_sdk_release", "setScreenRefreshRate", "LX6/j;", "T", "", "id", "getPlugin", "(Ljava/lang/String;)LX6/j;", "Lcom/mapbox/maps/MapView;", "mapView", "LX6/r;", "plugin", "createPlugin", "(Lcom/mapbox/maps/MapView;LX6/r;)V", "removePlugin", "(Ljava/lang/String;)V", "options", "initializePlugins", "(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapView;)V", "onAttachedToWindow$maps_sdk_release", "(Lcom/mapbox/maps/MapView;)V", "onAttachedToWindow", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "getRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/MapboxRenderer;", "Lcom/mapbox/maps/NativeObserver;", "Lcom/mapbox/maps/MapInitOptions;", "Lcom/mapbox/maps/NativeMapImpl;", "_mapboxMap", "Lcom/mapbox/maps/MapboxMap;", "LX6/k;", "styleDataLoadedCallback", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cameraChangedCoalescedCallback", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "getCameraChangedCoalescedCallback$annotations", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/mapbox/common/Cancelable;", "cancelableSubscriberSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "LQb/I;", "lifecycleScope", "LQb/I;", "getLifecycleScope$maps_sdk_release", "()LQb/I;", "Lcom/mapbox/maps/MapController$LifecycleState;", "lifecycleState", "Lcom/mapbox/maps/MapController$LifecycleState;", "getLifecycleState$maps_sdk_release", "()Lcom/mapbox/maps/MapController$LifecycleState;", "setLifecycleState$maps_sdk_release", "(Lcom/mapbox/maps/MapController$LifecycleState;)V", "getLifecycleState$maps_sdk_release$annotations", "Lcom/mapbox/maps/Style;", "style", "Lcom/mapbox/maps/Style;", "Lcom/mapbox/maps/ContextMode;", "Companion", "LifecycleState", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapController implements g7.f, MapControllable {
    private final MapboxMap _mapboxMap;
    private final CameraChangedCoalescedCallback cameraChangedCoalescedCallback;
    private final CopyOnWriteArraySet<Cancelable> cancelableSubscriberSet;
    private ContextMode contextMode;
    private final I lifecycleScope;
    private LifecycleState lifecycleState;
    private final MapInitOptions mapInitOptions;
    private final NativeMapImpl nativeMap;
    private final NativeObserver nativeObserver;
    private final X6.k pluginRegistry;
    private final MapboxRenderer renderer;
    private Style style;
    private final StyleDataLoadedCallback styleDataLoadedCallback;
    private static final String PLUGIN_MISSING_TEMPLATE = StubApp.getString2(13935);
    public static final String TAG = StubApp.getString2(13936);
    private static final String VIEW_HIERARCHY_MISSING_TEMPLATE = StubApp.getString2(13937);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/MapController$LifecycleState;", "", "(Ljava/lang/String;I)V", "STATE_STOPPED", "STATE_STARTED", "STATE_DESTROYED", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum LifecycleState {
        STATE_STOPPED,
        STATE_STARTED,
        STATE_DESTROYED
    }

    public MapController(MapboxRenderer renderer, MapInitOptions mapInitOptions) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(mapInitOptions, "mapInitOptions");
        this.cancelableSubscriberSet = new CopyOnWriteArraySet<>();
        L0 b2 = L.b();
        Xb.d dVar = W.f5838a;
        Vb.f a3 = J.a(CoroutineContext.Element.DefaultImpls.plus(b2, q.f7968a.f6359c));
        this.lifecycleScope = new Vb.f(a3.f7941a.plus(new H(StubApp.getString2(13938))));
        this.lifecycleState = LifecycleState.STATE_STOPPED;
        if (StringsKt.isBlank(MapboxOptions.getAccessToken())) {
            throw new MapboxConfigurationException();
        }
        this.renderer = renderer;
        this.mapInitOptions = mapInitOptions;
        this.contextMode = mapInitOptions.getMapOptions().getContextMode();
        MapProvider mapProvider = MapProvider.INSTANCE;
        NativeMapImpl nativeMapWrapper = mapProvider.getNativeMapWrapper(mapInitOptions, renderer);
        this.nativeMap = nativeMapWrapper;
        NativeObserver nativeObserver = new NativeObserver(nativeMapWrapper);
        this.nativeObserver = nativeObserver;
        this._mapboxMap = mapProvider.getMapboxMap(nativeMapWrapper, nativeObserver, mapInitOptions.getMapOptions().getPixelRatio());
        getMapboxMapDeprecated().setRenderHandler$maps_sdk_release(renderer.getRenderThread$maps_sdk_release().getRenderHandlerThread().getHandler());
        this.pluginRegistry = mapProvider.getMapPluginRegistry(getMapboxMapDeprecated(), this, mapProvider.getMapTelemetryInstance(mapInitOptions.getContext()), mapProvider.getMapGeofencingConsent());
        this.cameraChangedCoalescedCallback = new a(this);
        this.styleDataLoadedCallback = new a(this);
        renderer.setMap(nativeMapWrapper);
        CameraOptions cameraOptions = mapInitOptions.getCameraOptions();
        if (cameraOptions != null) {
            getMapboxMapDeprecated().setCamera(cameraOptions);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MapController this$0, CameraChangedCoalesced it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        X6.k kVar = this$0.pluginRegistry;
        CameraState cameraState = it.getCameraState();
        Intrinsics.checkNotNullExpressionValue(cameraState, "it.cameraState");
        kVar.a(cameraState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MapController this$0, StyleDataLoaded eventData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        if (eventData.getType() == StyleDataLoadedType.STYLE) {
            this$0.getMapboxMapDeprecated().getStyle(new X6.i(this$0, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2$lambda$1(MapController this$0, Style style) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(style, "style");
        this$0.style = style;
        X6.k kVar = this$0.pluginRegistry;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(style, "style");
        Iterator it = kVar.f8463g.iterator();
        while (it.hasNext()) {
            ((m) it.next()).b(style);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(X6.k pluginRegistry, CameraChangedCoalesced it) {
        Intrinsics.checkNotNullParameter(pluginRegistry, "$pluginRegistry");
        Intrinsics.checkNotNullParameter(it, "it");
        CameraState cameraState = it.getCameraState();
        Intrinsics.checkNotNullExpressionValue(cameraState, "it.cameraState");
        pluginRegistry.a(cameraState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addRendererSetupErrorListener$lambda$10(MapController this$0, RendererSetupErrorListener rendererSetupErrorListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rendererSetupErrorListener, "$rendererSetupErrorListener");
        this$0.renderer.getRenderThread$maps_sdk_release().getEglCore().addRendererStateListener$maps_sdk_release(rendererSetupErrorListener);
    }

    private static /* synthetic */ void getCameraChangedCoalescedCallback$annotations() {
    }

    public static /* synthetic */ void getLifecycleState$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void initializePlugins$default(MapController mapController, MapInitOptions mapInitOptions, MapView mapView, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            mapView = null;
        }
        mapController.initializePlugins(mapInitOptions, mapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSizeChanged$lambda$9(MapController this$0, int i3, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.renderer.onSurfaceChanged(i3, i10);
        this$0.nativeMap.setSizeSet$maps_sdk_release(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRendererSetupErrorListener$lambda$11(MapController this$0, RendererSetupErrorListener rendererSetupErrorListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rendererSetupErrorListener, "$rendererSetupErrorListener");
        this$0.renderer.getRenderThread$maps_sdk_release().getEglCore().removeRendererStateListener$maps_sdk_release(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    public void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        Intrinsics.checkNotNullParameter(rendererSetupErrorListener, "rendererSetupErrorListener");
        this.renderer.getRenderThread$maps_sdk_release().getRenderHandlerThread().post(new b(this, rendererSetupErrorListener, 0));
    }

    @Override // com.mapbox.maps.MapControllable
    public void addWidget(Widget widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        if (this.contextMode != ContextMode.SHARED) {
            throw new RuntimeException(StubApp.getString2(13939));
        }
        widget.setTriggerRepaintAction$maps_sdk_release(new Function0<Unit>() { // from class: com.mapbox.maps.MapController$addWidget$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MapController.this.getRenderer().scheduleRepaint();
            }
        });
        this.renderer.getRenderThread$maps_sdk_release().addWidget(widget);
        this.renderer.scheduleRepaint();
    }

    public final void createPlugin(MapView mapView, r plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        X6.k kVar = this.pluginRegistry;
        MapInitOptions mapInitOptions = this.mapInitOptions;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(mapInitOptions, "mapInitOptions");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        X6.j jVar = plugin.f8471b;
        String str = plugin.f8470a;
        if (jVar == null) {
            throw new MapboxConfigurationException(Xa.h.n(StubApp.getString2(13940), '!', str));
        }
        LinkedHashMap linkedHashMap = kVar.f8460d;
        if (linkedHashMap.containsKey(str)) {
            X6.j jVar2 = (X6.j) linkedHashMap.get(str);
            if (jVar2 != null) {
                jVar2.initialize();
                return;
            }
            return;
        }
        if ((plugin.f8471b instanceof u) && mapView == null) {
            String message = StubApp.getString2(6769) + jVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            throw new X6.b(message);
        }
        linkedHashMap.put(str, jVar);
        jVar.a(kVar.f8457a);
        if (jVar instanceof u) {
            u uVar = (u) jVar;
            Intrinsics.checkNotNull(mapView);
            View f10 = uVar.f(mapView, mapInitOptions.getAttrs(), mapInitOptions.getMapOptions().getPixelRatio());
            mapView.addView(f10);
            uVar.c(f10);
        }
        if (jVar instanceof X6.a) {
            ((X6.a) jVar).e(mapInitOptions.getContext(), mapInitOptions.getAttrs(), mapInitOptions.getMapOptions().getPixelRatio());
        }
        if (jVar instanceof X6.l) {
            kVar.f8464h.add(jVar);
            Pair pair = kVar.f8459c;
            if (pair != null) {
                ((X6.l) jVar).onSizeChanged(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
            }
        }
        if (jVar instanceof X6.h) {
            kVar.f8461e.add(jVar);
        }
        if (jVar instanceof i7.c) {
            kVar.f8462f.add(jVar);
        }
        if (jVar instanceof m) {
            kVar.f8463g.add(jVar);
        }
        if (jVar instanceof k7.c) {
            kVar.f8465i = (k7.c) jVar;
        }
        jVar.initialize();
        if (kVar.f8458b == 1 && (jVar instanceof X6.c)) {
            ((X6.c) jVar).onStart();
        }
    }

    /* renamed from: getLifecycleScope$maps_sdk_release, reason: from getter */
    public final I getLifecycleScope() {
        return this.lifecycleScope;
    }

    /* renamed from: getLifecycleState$maps_sdk_release, reason: from getter */
    public final LifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    @Override // com.mapbox.maps.MapControllable
    /* renamed from: getMapboxMap, reason: from getter and merged with bridge method [inline-methods] */
    public MapboxMap getMapboxMapDeprecated() {
        return this._mapboxMap;
    }

    public final NativeMapImpl getNativeMap() {
        return this.nativeMap;
    }

    @Override // g7.f
    public <T extends X6.j> T getPlugin(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        X6.k kVar = this.pluginRegistry;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        return (T) kVar.f8460d.get(id);
    }

    /* renamed from: getRenderer$maps_sdk_release, reason: from getter */
    public final MapboxRenderer getRenderer() {
        return this.renderer;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initializePlugins(com.mapbox.maps.MapInitOptions r10, com.mapbox.maps.MapView r11) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.MapController.initializePlugins(com.mapbox.maps.MapInitOptions, com.mapbox.maps.MapView):void");
    }

    public final void onAttachedToWindow$maps_sdk_release(MapView mapView) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        X6.k kVar = this.pluginRegistry;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        if (kVar.f8465i != null) {
            Intrinsics.checkNotNullParameter(mapView, "mapView");
            Intrinsics.checkNotNullParameter(mapView, "observer");
            k7.d dVar = new k7.d(mapView);
            MapboxLogger.logI(StubApp.getString2(13948), StubApp.getString2(13949));
            k7.b bVar = new k7.b(mapView);
            mapView.getContext().registerComponentCallbacks(bVar);
            dVar.f15480b.a(new C1115a(mapView, dVar, mapView, bVar));
        }
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onDestroy() {
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_DESTROYED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        J.b(this.lifecycleScope);
        Iterator it = this.pluginRegistry.f8460d.entrySet().iterator();
        while (it.hasNext()) {
            ((X6.j) ((Map.Entry) it.next()).getValue()).g();
        }
        this.nativeObserver.onDestroy();
        this.renderer.onDestroy();
        getMapboxMapDeprecated().onDestroy$maps_sdk_release();
        this.style = null;
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onGenericMotionEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        X6.k kVar = this.pluginRegistry;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator it = kVar.f8462f.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                o oVar = (o) ((i7.c) it.next());
                oVar.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if ((event.getSource() & 2) == 2 && event.getActionMasked() == 8 && oVar.f14919r0.f15359b) {
                    Y6.a aVar = oVar.f14914p;
                    String string2 = StubApp.getString2(686);
                    Y6.a aVar2 = null;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        aVar = null;
                    }
                    ((Y6.j) aVar).b(CollectionsKt.toList(oVar.f14916q));
                    float axisValue = event.getAxisValue(9);
                    MapboxMap mapboxMap = oVar.f14909m;
                    if (mapboxMap == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapCameraManagerDelegate");
                        mapboxMap = null;
                    }
                    double zoom = mapboxMap.getCameraState().getZoom();
                    Y6.a aVar3 = oVar.f14914p;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        aVar3 = null;
                    }
                    ScreenCoordinate i3 = ((Y6.j) aVar3).i();
                    ScreenCoordinate a3 = a4.f.a(event);
                    Y6.a aVar4 = oVar.f14914p;
                    if (aVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        aVar4 = null;
                    }
                    ((Y6.j) aVar4).getClass();
                    double log2 = MathKt.log2(axisValue) + zoom;
                    Y6.a aVar5 = oVar.f14914p;
                    if (aVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        aVar5 = null;
                    }
                    CameraOptions build = new CameraOptions.Builder().anchor(a3).zoom(Double.valueOf(log2)).build();
                    Intrinsics.checkNotNullExpressionValue(build, "Builder().anchor(anchor).zoom(zoom).build()");
                    t tVar = o.f14881s0;
                    ((Y6.j) aVar5).e(build, o.f14881s0, null);
                    Y6.a aVar6 = oVar.f14914p;
                    if (aVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        aVar2 = aVar6;
                    }
                    ((Y6.j) aVar2).l(i3);
                }
                z2 = true;
            }
            return z2;
        }
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onLowMemory() {
        getMapboxMapDeprecated().reduceMemoryUse();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onResume() {
        this.renderer.onResume();
    }

    @Override // com.mapbox.maps.MapControllable
    public void onSizeChanged(int w10, int h2) {
        this.nativeMap.setSizeSet$maps_sdk_release(false);
        this.renderer.queueRenderEvent(new c(this, w10, h2, 0));
        X6.k kVar = this.pluginRegistry;
        kVar.getClass();
        kVar.f8459c = TuplesKt.to(Integer.valueOf(w10), Integer.valueOf(h2));
        Iterator it = kVar.f8464h.iterator();
        while (it.hasNext()) {
            ((X6.l) it.next()).onSizeChanged(w10, h2);
        }
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStart() {
        String styleUri;
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_STARTED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        Style style = getMapboxMapDeprecated().getStyleDeprecated();
        if (style != null && !Intrinsics.areEqual(style, this.style)) {
            this.style = style;
            X6.k kVar = this.pluginRegistry;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(style, "style");
            Iterator it = kVar.f8463g.iterator();
            while (it.hasNext()) {
                ((m) it.next()).b(style);
            }
        }
        NativeObserver nativeObserver = this.nativeObserver;
        this.cancelableSubscriberSet.add(NativeObserver.subscribeCameraChangedCoalesced$default(nativeObserver, this.cameraChangedCoalescedCallback, null, 2, null));
        this.cancelableSubscriberSet.add(NativeObserver.subscribeStyleDataLoaded$default(nativeObserver, this.styleDataLoadedCallback, null, null, 6, null));
        this.renderer.onStart();
        if (!getMapboxMapDeprecated().getIsStyleLoadInitiated() && (styleUri = this.mapInitOptions.getStyleUri()) != null) {
            MapboxMap.loadStyle$default(getMapboxMapDeprecated(), styleUri, (Style.OnStyleLoaded) null, 2, (Object) null);
        }
        this.pluginRegistry.b(1);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStop() {
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_STOPPED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        Iterator<T> it = this.cancelableSubscriberSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.cancelableSubscriberSet.clear();
        this.renderer.onStop();
        this.pluginRegistry.b(2);
        MapProvider.INSTANCE.flushPendingEvents();
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onTouchEvent(MotionEvent event) {
        boolean z2;
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator it = this.pluginRegistry.f8462f.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                o oVar = (o) ((i7.c) it.next());
                oVar.getClass();
                if (event != null && (event.getButtonState() == 0 || event.getButtonState() == 1)) {
                    int actionMasked = event.getActionMasked();
                    Y6.a aVar = null;
                    CoreGesturesHandler coreGesturesHandler = null;
                    ArrayList arrayList = oVar.f14910m0;
                    Handler handler = oVar.f14915p0;
                    if (actionMasked == 0) {
                        handler.removeCallbacksAndMessages(null);
                        arrayList.clear();
                        oVar.P(oVar.f14906k0);
                        oVar.P(oVar.f14908l0);
                    }
                    B6.a aVar2 = oVar.f14902f;
                    if (aVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("gesturesManager");
                        aVar2 = null;
                    }
                    Iterator it2 = ((CopyOnWriteArrayList) aVar2.f668b).iterator();
                    boolean z11 = false;
                    while (it2.hasNext()) {
                        B6.b bVar = (B6.b) it2.next();
                        MotionEvent motionEvent = bVar.f679e;
                        if (motionEvent != null) {
                            motionEvent.recycle();
                            bVar.f679e = null;
                        }
                        MotionEvent motionEvent2 = bVar.f678d;
                        if (motionEvent2 != null) {
                            bVar.f679e = MotionEvent.obtain(motionEvent2);
                            bVar.f678d.recycle();
                            bVar.f678d = null;
                        }
                        MotionEvent obtain = MotionEvent.obtain(event);
                        bVar.f678d = obtain;
                        bVar.f680f = obtain.getEventTime() - bVar.f678d.getDownTime();
                        if (bVar.a(event)) {
                            z11 = true;
                        }
                    }
                    int actionMasked2 = event.getActionMasked();
                    String string2 = StubApp.getString2(13950);
                    if (actionMasked2 == 1) {
                        oVar.K();
                        CoreGesturesHandler coreGesturesHandler2 = oVar.f14913o0;
                        if (coreGesturesHandler2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            coreGesturesHandler2 = null;
                        }
                        coreGesturesHandler2.notifyCoreTouchEnded();
                        z2 = z11;
                        if (!arrayList.isEmpty()) {
                            handler.removeCallbacksAndMessages(null);
                            Y6.a aVar3 = oVar.f14914p;
                            if (aVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsPlugin");
                            } else {
                                aVar = aVar3;
                            }
                            Object[] array = arrayList.toArray(new ValueAnimator[0]);
                            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) array;
                            ((Y6.j) aVar).k((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length));
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                ((ValueAnimator) it3.next()).start();
                            }
                            arrayList.clear();
                            z2 = z11;
                        }
                    } else if (actionMasked2 != 3) {
                        z2 = z11;
                        if (actionMasked2 == 5) {
                            oVar.K();
                            z2 = z11;
                        }
                    } else {
                        arrayList.clear();
                        CoreGesturesHandler coreGesturesHandler3 = oVar.f14913o0;
                        if (coreGesturesHandler3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                        } else {
                            coreGesturesHandler = coreGesturesHandler3;
                        }
                        coreGesturesHandler.notifyCoreTouchEnded();
                        oVar.K();
                        z2 = z11;
                    }
                } else {
                    z2 = false;
                }
                if (z2 || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public void queueEvent(Runnable event, boolean needRender) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (needRender) {
            this.renderer.queueRenderEvent(event);
        } else {
            this.renderer.queueNonRenderEvent(event);
        }
    }

    public final void removePlugin(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        X6.k kVar = this.pluginRegistry;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        LinkedHashMap linkedHashMap = kVar.f8460d;
        X6.j jVar = (X6.j) linkedHashMap.get(id);
        if (jVar instanceof X6.h) {
            kVar.f8461e.remove(jVar);
        } else if (jVar instanceof i7.c) {
            kVar.f8462f.remove(jVar);
        } else if (jVar instanceof m) {
            kVar.f8463g.remove(jVar);
        } else if (jVar instanceof X6.l) {
            kVar.f8464h.remove(jVar);
        } else if (jVar instanceof k7.c) {
            kVar.f8465i = null;
        }
        if (jVar != null) {
            jVar.g();
        }
        linkedHashMap.remove(id);
        MapboxLogger.logI(StubApp.getString2(13953), StubApp.getString2(13951) + id + StubApp.getString2(13952));
    }

    @Override // com.mapbox.maps.MapControllable
    public void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        Intrinsics.checkNotNullParameter(rendererSetupErrorListener, "rendererSetupErrorListener");
        this.renderer.getRenderThread$maps_sdk_release().getRenderHandlerThread().post(new b(this, rendererSetupErrorListener, 1));
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean removeWidget(Widget widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        boolean removeWidget = this.renderer.getRenderThread$maps_sdk_release().removeWidget(widget);
        if (removeWidget) {
            this.renderer.scheduleRepaint();
        }
        return removeWidget;
    }

    public final void setLifecycleState$maps_sdk_release(LifecycleState lifecycleState) {
        Intrinsics.checkNotNullParameter(lifecycleState, "<set-?>");
        this.lifecycleState = lifecycleState;
    }

    @Override // com.mapbox.maps.MapControllable
    public void setMaximumFps(int fps) {
        this.renderer.setMaximumFps(fps);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setOnFpsChangedListener(OnFpsChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.renderer.setOnFpsChangedListener(listener);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        Intrinsics.checkNotNullParameter(renderThreadStatsRecorder, "renderThreadStatsRecorder");
        this.renderer.getRenderThread$maps_sdk_release().setRenderThreadStatsRecorder$maps_sdk_release(renderThreadStatsRecorder);
    }

    public final void setScreenRefreshRate$maps_sdk_release(int refreshRate) {
        if (refreshRate <= 0) {
            MapboxLogger.logE(StubApp.getString2(13936), StubApp.getString2(13954));
        } else {
            this.renderer.getRenderThread$maps_sdk_release().setScreenRefreshRate(refreshRate);
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public Bitmap snapshot() {
        return this.renderer.snapshot();
    }

    @Override // com.mapbox.maps.MapControllable
    public void snapshot(MapView.OnSnapshotReady listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.renderer.snapshot(listener);
    }

    public MapController(MapboxRenderer renderer, NativeObserver nativeObserver, MapInitOptions mapInitOptions, ContextMode contextMode, NativeMapImpl nativeMap, MapboxMap mapboxMap, X6.k pluginRegistry, StyleDataLoadedCallback onStyleLoadingFinishedListener) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(nativeObserver, "nativeObserver");
        Intrinsics.checkNotNullParameter(mapInitOptions, "mapInitOptions");
        Intrinsics.checkNotNullParameter(nativeMap, "nativeMap");
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(pluginRegistry, "pluginRegistry");
        Intrinsics.checkNotNullParameter(onStyleLoadingFinishedListener, "onStyleLoadingFinishedListener");
        this.cancelableSubscriberSet = new CopyOnWriteArraySet<>();
        L0 b2 = L.b();
        Xb.d dVar = W.f5838a;
        Vb.f a3 = J.a(CoroutineContext.Element.DefaultImpls.plus(b2, q.f7968a.f6359c));
        this.lifecycleScope = new Vb.f(a3.f7941a.plus(new H(StubApp.getString2(13938))));
        this.lifecycleState = LifecycleState.STATE_STOPPED;
        this.renderer = renderer;
        this.nativeObserver = nativeObserver;
        this.mapInitOptions = mapInitOptions;
        this.contextMode = contextMode;
        this.nativeMap = nativeMap;
        this._mapboxMap = mapboxMap;
        this.pluginRegistry = pluginRegistry;
        this.cameraChangedCoalescedCallback = new B(pluginRegistry, 6);
        this.styleDataLoadedCallback = onStyleLoadingFinishedListener;
    }
}
