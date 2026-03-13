package com.mapbox.maps.viewannotation;

import Xa.h;
import android.graphics.Rect;
import android.os.Looper;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.AnnotatedFeature;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CoordinateBounds;
import com.mapbox.maps.DelegatingViewAnnotationPositionDescriptor;
import com.mapbox.maps.DelegatingViewAnnotationPositionsUpdateListener;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxViewAnnotationException;
import com.mapbox.maps.ProjectedMeters;
import com.mapbox.maps.R;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.ViewAnnotationAnchor;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.renderer.MapboxRenderThread;
import com.mapbox.maps.util.CameraOptionsUtils;
import com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000ù\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001@\b\u0001\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u0002:\u0004\u0085\u0001\u0086\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020(H\u0016J\u0018\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u000bH\u0016J\u001a\u0010/\u001a\u00020\n2\b\b\u0001\u00102\u001a\u0002032\u0006\u00101\u001a\u00020\u000bH\u0016J6\u0010/\u001a\u00020-2\b\b\u0001\u00102\u001a\u0002032\u0006\u00101\u001a\u00020\u000b2\u0006\u00104\u001a\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020-07H\u0016JH\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u00010<2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0\u000f2\u0006\u0010=\u001a\u0002092\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020-\u0018\u000107H\u0002J%\u0010?\u001a\u00020@2\u0006\u00100\u001a\u00020\n2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0002¢\u0006\u0002\u0010EJ\u0010\u0010F\u001a\u00020D2\u0006\u0010G\u001a\u00020%H\u0002J\u0010\u0010H\u001a\u00020B2\u0006\u0010G\u001a\u00020%H\u0002J)\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010G\u001a\u00020%2\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0002\u0010OJ;\u0010P\u001a\u0004\u0018\u0001092\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010Q\u001a\u0004\u0018\u00010N2\b\u0010R\u001a\u0004\u0018\u00010NH\u0017¢\u0006\u0002\u0010SJM\u0010P\u001a\u00020-2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010Q\u001a\u0004\u0018\u00010N2\b\u0010R\u001a\u0004\u0018\u00010N2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020-07H\u0016¢\u0006\u0002\u0010UJQ\u0010V\u001a\u0004\u0018\u0001092\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010Q\u001a\u0004\u0018\u00010N2\b\u0010R\u001a\u0004\u0018\u00010N2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020-\u0018\u000107H\u0002¢\u0006\u0002\u0010WJ\u0006\u0010X\u001a\u00020-J \u0010Y\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0Z2\u0006\u0010[\u001a\u00020\\H\u0002J,\u0010]\u001a\u0004\u0018\u0001H^\"\u0006\b\u0000\u0010^\u0018\u00012\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u0002H^0`H\u0082\b¢\u0006\u0002\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010\n2\u0006\u0010[\u001a\u00020\\H\u0016J\u0012\u0010c\u001a\u0004\u0018\u00010\u000b2\u0006\u00100\u001a\u00020\nH\u0016J\u0012\u0010c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010[\u001a\u00020\\H\u0016J\u001c\u0010d\u001a\u0004\u0018\u00010L2\u0006\u0010G\u001a\u00020%2\b\u0010e\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010f\u001a\u00020gH\u0016J*\u0010h\u001a\u0004\u0018\u0001092\b\u0010i\u001a\u0004\u0018\u0001092\u0014\u0010j\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020-\u0018\u000107H\u0002J\u0010\u0010k\u001a\u00020-2\u0006\u00100\u001a\u00020\nH\u0002J\u0018\u0010l\u001a\u00020-2\u0006\u0010G\u001a\u00020%2\u0006\u0010m\u001a\u00020\u0010H\u0002J\u0018\u0010n\u001a\u00020-2\u0006\u0010G\u001a\u00020%2\u0006\u0010m\u001a\u00020\u0010H\u0002J\"\u0010o\u001a\u00020-2\u0006\u0010G\u001a\u00020%2\u0006\u0010m\u001a\u00020\u00102\b\b\u0002\u0010p\u001a\u00020qH\u0002J\u0016\u0010r\u001a\u00020-2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0017J\u0016\u0010t\u001a\u00020-2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0018\u0010u\u001a\u00020-2\u0006\u0010v\u001a\u00020\n2\u0006\u00101\u001a\u00020\u000bH\u0002J\u0010\u0010w\u001a\u00020-2\u0006\u0010x\u001a\u00020%H\u0002J\b\u0010y\u001a\u00020-H\u0016J\u0010\u0010z\u001a\u00020-2\u0006\u0010.\u001a\u00020(H\u0016J\u0010\u0010{\u001a\u00020q2\u0006\u00100\u001a\u00020\nH\u0016J\u0010\u0010|\u001a\u00020-2\u0006\u0010}\u001a\u00020gH\u0016J\u0018\u0010~\u001a\u00020q2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u000bH\u0016J\u001a\u0010\u007f\u001a\u00020-2\u0006\u0010x\u001a\u00020%2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0002J\u0011\u0010\u0082\u0001\u001a\u00020-2\u0006\u00101\u001a\u00020\u000bH\u0002J\u001a\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001*\u00020%2\b\u0010e\u001a\u0004\u0018\u00010\u0010H\u0002R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000RJ\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b8V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010+¨\u0006\u0087\u0001"}, d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;", "mapView", "Lcom/mapbox/maps/MapView;", "viewAnnotationsLayout", "Landroid/widget/FrameLayout;", "(Lcom/mapbox/maps/MapView;Landroid/widget/FrameLayout;)V", "annotations", "", "Landroid/view/View;", "Lcom/mapbox/maps/ViewAnnotationOptions;", "getAnnotations", "()Ljava/util/Map;", "currentPositionDescriptors", "", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "mapboxMap", "Lcom/mapbox/maps/MapboxMap;", "pixelRatio", "", "renderThread", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "updatedPositionDescriptors", "value", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "viewAnnotationAvoidLayers", "getViewAnnotationAvoidLayers$annotations", "()V", "getViewAnnotationAvoidLayers", "()Ljava/util/HashSet;", "setViewAnnotationAvoidLayers", "(Ljava/util/HashSet;)V", "viewAnnotations", "", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;", "viewUpdatedListenerSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;", "getViewUpdatedListenerSet$maps_sdk_release$annotations", "getViewUpdatedListenerSet$maps_sdk_release", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "addOnViewAnnotationUpdatedListener", "", "listener", "addViewAnnotation", "view", "options", "resId", "", "asyncInflater", "Landroidx/asynclayoutinflater/view/AsyncLayoutInflater;", "asyncInflateCallback", "Lkotlin/Function1;", "adjustCameraForAnnotations", "Lcom/mapbox/maps/CameraOptions;", "cameraForViewAnnotationPoints", "edgeInsets", "Lcom/mapbox/maps/EdgeInsets;", "cameraOptionsWithNoZoom", "resultCallback", "buildAttachStateListener", "com/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1", "onGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onDrawListener", "Landroid/view/ViewTreeObserver$OnDrawListener;", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnDrawListener;)Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1;", "buildDrawListener", "viewAnnotation", "buildGlobalLayoutListener", "calculateCoordinateBoundForAnnotation", "Lcom/mapbox/maps/CoordinateBounds;", "annotationFrame", "Landroid/graphics/Rect;", "zoom", "", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Landroid/graphics/Rect;Ljava/lang/Double;)Lcom/mapbox/maps/CoordinateBounds;", "cameraForAnnotations", "bearing", "pitch", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "result", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)V", "cameraForAnnotationsImpl", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;", "destroy", "findByAnnotatedLayerFeature", "Lkotlin/Pair;", "annotatedLayerFeature", "Lcom/mapbox/maps/AnnotatedLayerFeature;", "getValue", "V", "expected", "Lcom/mapbox/bindgen/Expected;", "(Lcom/mapbox/bindgen/Expected;)Ljava/lang/Object;", "getViewAnnotation", "getViewAnnotationOptions", "getViewAnnotationOptionsFrame", "positionDescriptor", "getViewAnnotationUpdateMode", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "invokeCallbackAndReturn", "camera", "callback", "measureView", "notifyAnchorCoordinateListeners", "newPositionDescriptor", "notifyAnchorListeners", "notifyPositionListeners", "positionChanged", "", "onDelegatingViewAnnotationPositionsUpdate", "positions", "positionAnnotationViews", "prepareViewAnnotation", "inflatedView", "remove", "annotation", "removeAllViewAnnotations", "removeOnViewAnnotationUpdatedListener", "removeViewAnnotation", "setViewAnnotationUpdateMode", "mode", "updateViewAnnotation", "updateVisibilityAndNotifyUpdateListeners", "currentVisibility", "Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;", "validateOptions", "coordinate", "Lcom/mapbox/geojson/Point;", "Companion", "ViewAnnotation", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ViewAnnotationManagerImpl extends DelegatingViewAnnotationPositionsUpdateListener implements ViewAnnotationManager {
    private static final int MAX_ADJUST_BOUNDS_COUNTER = 2;
    private static final int USER_FIXED_DIMENSION = -1;
    private List<DelegatingViewAnnotationPositionDescriptor> currentPositionDescriptors;
    private final MapboxMap mapboxMap;
    private final float pixelRatio;
    private final MapboxRenderThread renderThread;
    private volatile List<DelegatingViewAnnotationPositionDescriptor> updatedPositionDescriptors;
    private final Map<String, ViewAnnotation> viewAnnotations;
    private final FrameLayout viewAnnotationsLayout;
    private final CopyOnWriteArraySet<OnViewAnnotationUpdatedListener> viewUpdatedListenerSet;
    private static final String EXCEPTION_TEXT_FEATURE_IS_NULL = StubApp.getString2(14602);
    private static final String TAG = StubApp.getString2(14603);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0001¢\u0006\u0002\b\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$Companion;", "", "()V", "EXCEPTION_TEXT_FEATURE_IS_NULL", "", "MAX_ADJUST_BOUNDS_COUNTER", "", "TAG", "USER_FIXED_DIMENSION", "needToReorderZ", "", "currentPositionDescriptors", "", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "updatedPositionDescriptors", "needToReorderZ$maps_sdk_release", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean needToReorderZ$maps_sdk_release(List<DelegatingViewAnnotationPositionDescriptor> currentPositionDescriptors, List<DelegatingViewAnnotationPositionDescriptor> updatedPositionDescriptors) {
            Intrinsics.checkNotNullParameter(currentPositionDescriptors, "currentPositionDescriptors");
            Intrinsics.checkNotNullParameter(updatedPositionDescriptors, "updatedPositionDescriptors");
            if (currentPositionDescriptors.size() < updatedPositionDescriptors.size()) {
                return true;
            }
            if (!currentPositionDescriptors.isEmpty() && !updatedPositionDescriptors.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i3 = 0;
                int i10 = 0;
                while (i3 < currentPositionDescriptors.size() && i10 < updatedPositionDescriptors.size()) {
                    if (Intrinsics.areEqual(currentPositionDescriptors.get(i3).getIdentifier(), updatedPositionDescriptors.get(i10).getIdentifier())) {
                        i3++;
                        i10++;
                    } else {
                        if (linkedHashSet.contains(updatedPositionDescriptors.get(i10).getIdentifier())) {
                            return true;
                        }
                        while (i3 < currentPositionDescriptors.size() && !Intrinsics.areEqual(currentPositionDescriptors.get(i3).getIdentifier(), updatedPositionDescriptors.get(i10).getIdentifier())) {
                            String identifier = currentPositionDescriptors.get(i3).getIdentifier();
                            Intrinsics.checkNotNullExpressionValue(identifier, "currentPositionDescripto…[currentIndex].identifier");
                            linkedHashSet.add(identifier);
                            i3++;
                        }
                    }
                }
                while (i10 < updatedPositionDescriptors.size()) {
                    if (linkedHashSet.contains(updatedPositionDescriptors.get(i10).getIdentifier())) {
                        return true;
                    }
                    i10++;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewAnnotationAnchor.values().length];
            try {
                iArr[ViewAnnotationAnchor.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewAnnotationAnchor.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewAnnotationAnchor.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ViewAnnotationAnchor.LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ViewAnnotationAnchor.RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ViewAnnotationManagerImpl(MapView mapView, FrameLayout frameLayout, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(mapView, (i3 & 2) != 0 ? new FrameLayout(mapView.getContext()) : frameLayout);
    }

    private static final void addViewAnnotation$lambda$0(ViewAnnotationManagerImpl this$0, ViewAnnotationOptions options, Function1 asyncInflateCallback, View view, int i3, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(asyncInflateCallback, "$asyncInflateCallback");
        Intrinsics.checkNotNullParameter(view, "view");
        this$0.prepareViewAnnotation(view, options);
        asyncInflateCallback.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraOptions adjustCameraForAnnotations(CameraOptions cameraForViewAnnotationPoints, EdgeInsets edgeInsets, List<ViewAnnotation> viewAnnotations, CameraOptions cameraOptionsWithNoZoom, Function1<? super CameraOptions, Unit> resultCallback) {
        CameraOptions cameraOptions = null;
        if (CameraOptionsUtils.isEmpty(cameraForViewAnnotationPoints)) {
            return invokeCallbackAndReturn(null, resultCallback);
        }
        CameraOptions cameraOptions2 = cameraForViewAnnotationPoints;
        Triple triple = null;
        Triple triple2 = null;
        Triple triple3 = null;
        Triple triple4 = null;
        boolean z2 = false;
        int i3 = 1;
        while (!z2 && i3 <= 2) {
            Double zoom = cameraOptions2.getZoom();
            i3++;
            Triple triple5 = triple4;
            Triple triple6 = triple3;
            Triple triple7 = triple2;
            Triple triple8 = triple;
            boolean z10 = true;
            for (ViewAnnotation viewAnnotation : viewAnnotations) {
                Rect viewAnnotationOptionsFrame = getViewAnnotationOptionsFrame(viewAnnotation, viewAnnotation.getPositionDescriptor());
                if (viewAnnotationOptionsFrame == null) {
                    viewAnnotationOptionsFrame = new Rect(0, 0, 0, 0);
                }
                CoordinateBounds calculateCoordinateBoundForAnnotation = calculateCoordinateBoundForAnnotation(viewAnnotation, viewAnnotationOptionsFrame, zoom);
                if (calculateCoordinateBoundForAnnotation != null) {
                    if (triple8 == null || ((Number) triple8.getThird()).doubleValue() < calculateCoordinateBoundForAnnotation.north()) {
                        triple8 = new Triple(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(calculateCoordinateBoundForAnnotation.north()));
                        z10 = false;
                    }
                    if (triple7 == null || ((Number) triple7.getThird()).doubleValue() < calculateCoordinateBoundForAnnotation.east()) {
                        triple7 = new Triple(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(calculateCoordinateBoundForAnnotation.east()));
                        z10 = false;
                    }
                    if (triple5 == null || ((Number) triple5.getThird()).doubleValue() > calculateCoordinateBoundForAnnotation.south()) {
                        triple5 = new Triple(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(calculateCoordinateBoundForAnnotation.south()));
                        z10 = false;
                    }
                    if (triple6 == null || ((Number) triple6.getThird()).doubleValue() > calculateCoordinateBoundForAnnotation.west()) {
                        triple6 = new Triple(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(calculateCoordinateBoundForAnnotation.west()));
                        z10 = false;
                    }
                }
            }
            if (triple8 == null || triple7 == null || triple5 == null || triple6 == null) {
                MapboxLogger.logW(StubApp.getString2(14603), StubApp.getString2(14604));
                return invokeCallbackAndReturn(null, resultCallback);
            }
            Point coordinate = coordinate((ViewAnnotation) triple6.getFirst(), ((ViewAnnotation) triple6.getFirst()).getPositionDescriptor());
            Intrinsics.checkNotNull(coordinate);
            double longitude = coordinate.longitude();
            Point coordinate2 = coordinate((ViewAnnotation) triple5.getFirst(), ((ViewAnnotation) triple5.getFirst()).getPositionDescriptor());
            Intrinsics.checkNotNull(coordinate2);
            Point fromLngLat = Point.fromLngLat(longitude, coordinate2.latitude());
            Point coordinate3 = coordinate((ViewAnnotation) triple7.getFirst(), ((ViewAnnotation) triple7.getFirst()).getPositionDescriptor());
            Intrinsics.checkNotNull(coordinate3);
            double longitude2 = coordinate3.longitude();
            Point coordinate4 = coordinate((ViewAnnotation) triple8.getFirst(), ((ViewAnnotation) triple8.getFirst()).getPositionDescriptor());
            Intrinsics.checkNotNull(coordinate4);
            List<Point> listOf = CollectionsKt.listOf((Object[]) new Point[]{fromLngLat, Point.fromLngLat(longitude2, coordinate4.latitude())});
            double doubleValue = (edgeInsets != null ? Double.valueOf(edgeInsets.getTop()) : 0).doubleValue();
            Rect rect = (Rect) triple8.getSecond();
            double abs = Math.abs((rect != null ? Integer.valueOf(rect.top) : Double.valueOf(0.0d)).doubleValue()) + doubleValue;
            double doubleValue2 = (edgeInsets != null ? Double.valueOf(edgeInsets.getLeft()) : 0).doubleValue();
            Rect rect2 = (Rect) triple6.getSecond();
            double abs2 = Math.abs((rect2 != null ? Integer.valueOf(rect2.left) : Double.valueOf(0.0d)).doubleValue()) + doubleValue2;
            double doubleValue3 = (edgeInsets != null ? Double.valueOf(edgeInsets.getBottom()) : 0).doubleValue();
            Rect rect3 = (Rect) triple5.getSecond();
            double abs3 = Math.abs((rect3 != null ? Integer.valueOf(rect3.bottom) : Double.valueOf(0.0d)).doubleValue()) + doubleValue3;
            double doubleValue4 = (edgeInsets != null ? Double.valueOf(edgeInsets.getRight()) : 0).doubleValue();
            Rect rect4 = (Rect) triple7.getSecond();
            cameraOptions2 = this.mapboxMap.cameraForCoordinates(listOf, cameraOptionsWithNoZoom, new EdgeInsets(abs, abs2, abs3, Math.abs((rect4 != null ? Integer.valueOf(rect4.right) : Double.valueOf(0.0d)).doubleValue()) + doubleValue4), null, null);
            z2 = z10;
            triple = triple8;
            triple2 = triple7;
            triple3 = triple6;
            triple4 = triple5;
            cameraOptions = null;
        }
        return invokeCallbackAndReturn(!CameraOptionsUtils.isEmpty(cameraOptions2) ? cameraOptions2 : cameraOptions, resultCallback);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl$buildAttachStateListener$1] */
    private final ViewAnnotationManagerImpl$buildAttachStateListener$1 buildAttachStateListener(final View view, final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, final ViewTreeObserver.OnDrawListener onDrawListener) {
        return new View.OnAttachStateChangeListener() { // from class: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl$buildAttachStateListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v2) {
                Intrinsics.checkNotNullParameter(v2, "v");
                view.getViewTreeObserver().addOnDrawListener(onDrawListener);
                view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v2) {
                Intrinsics.checkNotNullParameter(v2, "v");
                view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
                view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        };
    }

    private final ViewTreeObserver.OnDrawListener buildDrawListener(final ViewAnnotation viewAnnotation) {
        return new ViewTreeObserver.OnDrawListener() { // from class: com.mapbox.maps.viewannotation.c
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                ViewAnnotationManagerImpl.buildDrawListener$lambda$21(ViewAnnotationManagerImpl.ViewAnnotation.this, this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildDrawListener$lambda$21(ViewAnnotation viewAnnotation, ViewAnnotationManagerImpl this$0) {
        Intrinsics.checkNotNullParameter(viewAnnotation, "$viewAnnotation");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (viewAnnotation.getHandleVisibilityAutomatically()) {
            boolean z2 = viewAnnotation.getView().getVisibility() == 0;
            if (z2 && viewAnnotation.isVisible()) {
                return;
            }
            if (z2 || viewAnnotation.getVisibility() != ViewAnnotationVisibility.INVISIBLE) {
                if (z2 || viewAnnotation.getVisibility() != ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED) {
                    if (z2) {
                        ViewAnnotation viewAnnotation2 = this$0.viewAnnotations.get(viewAnnotation.getId());
                        if (viewAnnotation2 != null) {
                            viewAnnotation2.setPositioned(false);
                        }
                        viewAnnotation.getView().setVisibility(4);
                    }
                    this$0.updateVisibilityAndNotifyUpdateListeners(viewAnnotation, z2 ? ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED : ViewAnnotationVisibility.INVISIBLE);
                    Expected viewAnnotationOptions$maps_sdk_release = this$0.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
                    if (viewAnnotationOptions$maps_sdk_release.isError()) {
                        throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
                    }
                    ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
                    if (viewAnnotationOptions != null ? Intrinsics.areEqual(viewAnnotationOptions.getVisible(), Boolean.valueOf(z2)) : false) {
                        return;
                    }
                    MapboxMap mapboxMap = this$0.mapboxMap;
                    String id = viewAnnotation.getId();
                    ViewAnnotationOptions build = new ViewAnnotationOptions.Builder().visible(Boolean.valueOf(z2)).build();
                    Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …e)\n              .build()");
                    Expected updateViewAnnotation$maps_sdk_release = mapboxMap.updateViewAnnotation$maps_sdk_release(id, build);
                    if (updateViewAnnotation$maps_sdk_release.isError()) {
                        throw new MapboxViewAnnotationException((String) updateViewAnnotation$maps_sdk_release.getError());
                    }
                    updateViewAnnotation$maps_sdk_release.getValue();
                }
            }
        }
    }

    private final ViewTreeObserver.OnGlobalLayoutListener buildGlobalLayoutListener(final ViewAnnotation viewAnnotation) {
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.mapbox.maps.viewannotation.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewAnnotationManagerImpl.buildGlobalLayoutListener$lambda$22(ViewAnnotationManagerImpl.ViewAnnotation.this, this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildGlobalLayoutListener$lambda$22(ViewAnnotation viewAnnotation, ViewAnnotationManagerImpl this$0) {
        Intrinsics.checkNotNullParameter(viewAnnotation, "$viewAnnotation");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int measuredWidth = viewAnnotation.getMeasuredWidth();
        String string2 = StubApp.getString2(14605);
        if (measuredWidth != -1 && viewAnnotation.getView().getMeasuredWidth() > 0 && viewAnnotation.getView().getMeasuredWidth() != viewAnnotation.getMeasuredWidth()) {
            viewAnnotation.setMeasuredWidth(viewAnnotation.getView().getMeasuredWidth());
            MapboxMap mapboxMap = this$0.mapboxMap;
            String id = viewAnnotation.getId();
            ViewAnnotationOptions build = new ViewAnnotationOptions.Builder().width(Double.valueOf(viewAnnotation.getView().getMeasuredWidth())).build();
            Intrinsics.checkNotNullExpressionValue(build, string2);
            Expected updateViewAnnotation$maps_sdk_release = mapboxMap.updateViewAnnotation$maps_sdk_release(id, build);
            if (updateViewAnnotation$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) updateViewAnnotation$maps_sdk_release.getError());
            }
            updateViewAnnotation$maps_sdk_release.getValue();
        }
        if (viewAnnotation.getMeasuredHeight() == -1 || viewAnnotation.getView().getMeasuredHeight() <= 0 || viewAnnotation.getView().getMeasuredHeight() == viewAnnotation.getMeasuredHeight()) {
            return;
        }
        viewAnnotation.setMeasuredHeight(viewAnnotation.getView().getMeasuredHeight());
        MapboxMap mapboxMap2 = this$0.mapboxMap;
        String id2 = viewAnnotation.getId();
        ViewAnnotationOptions build2 = new ViewAnnotationOptions.Builder().height(Double.valueOf(viewAnnotation.getView().getMeasuredHeight())).build();
        Intrinsics.checkNotNullExpressionValue(build2, string2);
        Expected updateViewAnnotation$maps_sdk_release2 = mapboxMap2.updateViewAnnotation$maps_sdk_release(id2, build2);
        if (updateViewAnnotation$maps_sdk_release2.isError()) {
            throw new MapboxViewAnnotationException((String) updateViewAnnotation$maps_sdk_release2.getError());
        }
        updateViewAnnotation$maps_sdk_release2.getValue();
    }

    private final CoordinateBounds calculateCoordinateBoundForAnnotation(ViewAnnotation viewAnnotation, Rect annotationFrame, Double zoom) {
        Point coordinate = coordinate(viewAnnotation, viewAnnotation.getPositionDescriptor());
        if (coordinate == null) {
            return null;
        }
        double metersPerPixelAtLatitude = zoom == null ? this.mapboxMap.getMetersPerPixelAtLatitude(coordinate.latitude()) : this.mapboxMap.getMetersPerPixelAtLatitude(coordinate.latitude(), zoom.doubleValue());
        ProjectedMeters projectedMetersForCoordinate = this.mapboxMap.projectedMetersForCoordinate(coordinate);
        double d8 = metersPerPixelAtLatitude / this.pixelRatio;
        double abs = (Math.abs(annotationFrame.top) * d8) + projectedMetersForCoordinate.getNorthing();
        double abs2 = (Math.abs(annotationFrame.right) * d8) + projectedMetersForCoordinate.getEasting();
        return new CoordinateBounds(this.mapboxMap.coordinateForProjectedMeters(new ProjectedMeters(projectedMetersForCoordinate.getNorthing() - (Math.abs(annotationFrame.bottom) * d8), projectedMetersForCoordinate.getEasting() - (Math.abs(annotationFrame.left) * d8))), this.mapboxMap.coordinateForProjectedMeters(new ProjectedMeters(abs, abs2)));
    }

    private final CameraOptions cameraForAnnotationsImpl(List<? extends View> annotations, final EdgeInsets edgeInsets, Double bearing, Double pitch, final Function1<? super CameraOptions, Unit> resultCallback) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : annotations) {
            if (((View) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        final ArrayList<ViewAnnotation> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            Iterator<T> it2 = this.viewAnnotations.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(((ViewAnnotation) next).getView(), view)) {
                    obj2 = next;
                    break;
                }
            }
            ViewAnnotation viewAnnotation = (ViewAnnotation) obj2;
            if (viewAnnotation != null) {
                arrayList2.add(viewAnnotation);
            }
        }
        if (arrayList2.isEmpty()) {
            return invokeCallbackAndReturn(null, resultCallback);
        }
        ArrayList arrayList3 = new ArrayList();
        for (ViewAnnotation viewAnnotation2 : arrayList2) {
            Point coordinate = coordinate(viewAnnotation2, viewAnnotation2.getPositionDescriptor());
            if (coordinate != null) {
                arrayList3.add(coordinate);
            }
        }
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.pitch(pitch);
        builder.bearing(bearing);
        final CameraOptions build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(block).build()");
        if (resultCallback == null) {
            return adjustCameraForAnnotations(this.mapboxMap.cameraForCoordinates(arrayList3, build, new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d), null, null), edgeInsets, arrayList2, build, null);
        }
        this.mapboxMap.cameraForCoordinates(arrayList3, build, new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d), null, null, new Function1<CameraOptions, Unit>() { // from class: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CameraOptions cameraOptions) {
                invoke2(cameraOptions);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CameraOptions cameraForViewAnnotationPoints) {
                Intrinsics.checkNotNullParameter(cameraForViewAnnotationPoints, "cameraForViewAnnotationPoints");
                ViewAnnotationManagerImpl.this.adjustCameraForAnnotations(cameraForViewAnnotationPoints, edgeInsets, arrayList2, build, resultCallback);
            }
        });
        return null;
    }

    private final Point coordinate(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor) {
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (viewAnnotationOptions$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
        }
        ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
        if (viewAnnotationOptions == null) {
            return null;
        }
        AnnotatedFeature annotatedFeature = viewAnnotationOptions.getAnnotatedFeature();
        Intrinsics.checkNotNull(annotatedFeature);
        if (!annotatedFeature.isGeometry()) {
            if (delegatingViewAnnotationPositionDescriptor != null) {
                return delegatingViewAnnotationPositionDescriptor.getAnchorCoordinate();
            }
            return null;
        }
        AnnotatedFeature annotatedFeature2 = viewAnnotationOptions.getAnnotatedFeature();
        Intrinsics.checkNotNull(annotatedFeature2);
        Geometry geometry = annotatedFeature2.getGeometry();
        if (geometry instanceof Point) {
            return (Point) geometry;
        }
        return null;
    }

    private final Pair<View, ViewAnnotationOptions> findByAnnotatedLayerFeature(AnnotatedLayerFeature annotatedLayerFeature) {
        Object obj;
        AnnotatedFeature annotatedFeature;
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ViewAnnotation> entry : map.entrySet()) {
            String key = entry.getKey();
            View view = entry.getValue().getView();
            Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(key);
            if (viewAnnotationOptions$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
            }
            arrayList.add(TuplesKt.to(view, viewAnnotationOptions$maps_sdk_release.getValue()));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) ((Pair) obj).component2();
            if (viewAnnotationOptions != null && (annotatedFeature = viewAnnotationOptions.getAnnotatedFeature()) != null && annotatedFeature.isAnnotatedLayerFeature()) {
                AnnotatedFeature annotatedFeature2 = viewAnnotationOptions.getAnnotatedFeature();
                if (Intrinsics.areEqual(annotatedFeature2 != null ? annotatedFeature2.getAnnotatedLayerFeature() : null, annotatedLayerFeature)) {
                    break;
                }
            }
        }
        Pair<View, ViewAnnotationOptions> pair = (Pair) obj;
        return pair == null ? new Pair<>(null, null) : pair;
    }

    private final /* synthetic */ <V> V getValue(Expected<String, V> expected) {
        if (expected.isError()) {
            throw new MapboxViewAnnotationException(expected.getError());
        }
        return expected.getValue();
    }

    @MapboxExperimental
    public static /* synthetic */ void getViewAnnotationAvoidLayers$annotations() {
    }

    private final Rect getViewAnnotationOptionsFrame(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor positionDescriptor) {
        int i3;
        int i10;
        ViewAnnotationAnchorConfig build;
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (viewAnnotationOptions$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
        }
        ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
        if (viewAnnotationOptions == null || viewAnnotationOptions.getWidth() == null || viewAnnotationOptions.getHeight() == null) {
            return null;
        }
        Double width = viewAnnotationOptions.getWidth();
        Intrinsics.checkNotNull(width);
        if (width.doubleValue() > 0.0d) {
            Double width2 = viewAnnotationOptions.getWidth();
            Intrinsics.checkNotNull(width2);
            i3 = (int) (width2.doubleValue() * 0.5d);
        } else {
            i3 = 0;
        }
        Double height = viewAnnotationOptions.getHeight();
        Intrinsics.checkNotNull(height);
        if (height.doubleValue() > 0.0d) {
            Double height2 = viewAnnotationOptions.getHeight();
            Intrinsics.checkNotNull(height2);
            i10 = (int) (height2.doubleValue() * 0.5d);
        } else {
            i10 = 0;
        }
        int i11 = -i3;
        int i12 = -i10;
        Rect rect = new Rect(i11, i12, i3, i10);
        if (positionDescriptor == null || (build = positionDescriptor.getAnchorConfig()) == null) {
            build = new ViewAnnotationAnchorConfig.Builder().anchor(ViewAnnotationAnchor.CENTER).build();
        }
        switch (WhenMappings.$EnumSwitchMapping$0[build.getAnchor().ordinal()]) {
            case 1:
                rect.offset(0, i10);
                break;
            case 2:
                rect.offset(i3, i10);
                break;
            case 3:
                rect.offset(i11, i10);
                break;
            case 4:
                rect.offset(0, i12);
                break;
            case 5:
                rect.offset(i3, i12);
                break;
            case 6:
                rect.offset(i11, i12);
                break;
            case 7:
                rect.offset(i3, 0);
                break;
            case 8:
                rect.offset(i11, 0);
                break;
            default:
                rect.offset(0, 0);
                break;
        }
        rect.offset((int) build.getOffsetX(), (int) build.getOffsetY());
        return rect;
    }

    public static /* synthetic */ void getViewUpdatedListenerSet$maps_sdk_release$annotations() {
    }

    private final CameraOptions invokeCallbackAndReturn(CameraOptions camera, Function1<? super CameraOptions, Unit> callback) {
        CameraOptions cameraOptions;
        if (callback != null) {
            if (camera == null) {
                cameraOptions = new CameraOptions.Builder().build();
                Intrinsics.checkNotNullExpressionValue(cameraOptions, "Builder().apply(block).build()");
            } else {
                cameraOptions = camera;
            }
            callback.invoke(cameraOptions);
        }
        return camera;
    }

    private final void measureView(View view) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        boolean z2 = view.getTag(R.id.composeView) != null;
        if (z2) {
            this.viewAnnotationsLayout.addView(view);
        }
        view.measure(makeMeasureSpec, makeMeasureSpec);
        if (z2) {
            this.viewAnnotationsLayout.removeView(view);
        }
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private final void notifyAnchorCoordinateListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor newPositionDescriptor) {
        DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
        if (Intrinsics.areEqual(positionDescriptor != null ? positionDescriptor.getAnchorCoordinate() : null, newPositionDescriptor.getAnchorCoordinate())) {
            return;
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view = viewAnnotation.getView();
            Point anchorCoordinate = newPositionDescriptor.getAnchorCoordinate();
            Intrinsics.checkNotNullExpressionValue(anchorCoordinate, "newPositionDescriptor.anchorCoordinate");
            onViewAnnotationUpdatedListener.onViewAnnotationAnchorCoordinateUpdated(view, anchorCoordinate);
        }
    }

    private final void notifyAnchorListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor newPositionDescriptor) {
        DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
        if (Intrinsics.areEqual(positionDescriptor != null ? positionDescriptor.getAnchorConfig() : null, newPositionDescriptor.getAnchorConfig())) {
            return;
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view = viewAnnotation.getView();
            ViewAnnotationAnchorConfig anchorConfig = newPositionDescriptor.getAnchorConfig();
            Intrinsics.checkNotNullExpressionValue(anchorConfig, "newPositionDescriptor.anchorConfig");
            onViewAnnotationUpdatedListener.onViewAnnotationAnchorUpdated(view, anchorConfig);
        }
    }

    private final void notifyPositionListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor newPositionDescriptor, boolean positionChanged) {
        if (!positionChanged) {
            DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
            if (Intrinsics.areEqual(positionDescriptor != null ? positionDescriptor.getLeftTopCoordinate() : null, newPositionDescriptor.getLeftTopCoordinate())) {
                DelegatingViewAnnotationPositionDescriptor positionDescriptor2 = viewAnnotation.getPositionDescriptor();
                if (Intrinsics.areEqual(positionDescriptor2 != null ? Double.valueOf(positionDescriptor2.getWidth()) : null, newPositionDescriptor.getWidth())) {
                    DelegatingViewAnnotationPositionDescriptor positionDescriptor3 = viewAnnotation.getPositionDescriptor();
                    if (Intrinsics.areEqual(positionDescriptor3 != null ? Double.valueOf(positionDescriptor3.getHeight()) : null, newPositionDescriptor.getHeight())) {
                        return;
                    }
                }
            }
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view = viewAnnotation.getView();
            ScreenCoordinate leftTopCoordinate = newPositionDescriptor.getLeftTopCoordinate();
            Intrinsics.checkNotNullExpressionValue(leftTopCoordinate, "newPositionDescriptor.leftTopCoordinate");
            onViewAnnotationUpdatedListener.onViewAnnotationPositionUpdated(view, leftTopCoordinate, newPositionDescriptor.getWidth(), newPositionDescriptor.getHeight());
        }
    }

    public static /* synthetic */ void notifyPositionListeners$default(ViewAnnotationManagerImpl viewAnnotationManagerImpl, ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        viewAnnotationManagerImpl.notifyPositionListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDelegatingViewAnnotationPositionsUpdate$lambda$20(ViewAnnotationManagerImpl this$0, List immutableUpdatedPositionDescriptorsCopy, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(immutableUpdatedPositionDescriptorsCopy, "$immutableUpdatedPositionDescriptorsCopy");
        this$0.positionAnnotationViews(immutableUpdatedPositionDescriptorsCopy);
    }

    private final void positionAnnotationViews(List<DelegatingViewAnnotationPositionDescriptor> updatedPositionDescriptors) {
        boolean needToReorderZ$maps_sdk_release = INSTANCE.needToReorderZ$maps_sdk_release(this.currentPositionDescriptors, updatedPositionDescriptors);
        this.currentPositionDescriptors = updatedPositionDescriptors;
        for (DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor : updatedPositionDescriptors) {
            ViewAnnotation viewAnnotation = this.viewAnnotations.get(delegatingViewAnnotationPositionDescriptor.getIdentifier());
            if (viewAnnotation != null) {
                View view = viewAnnotation.getView();
                view.setTranslationX((float) delegatingViewAnnotationPositionDescriptor.getLeftTopCoordinate().getX());
                view.setTranslationY((float) delegatingViewAnnotationPositionDescriptor.getLeftTopCoordinate().getY());
                ViewGroup.LayoutParams viewLayoutParams = viewAnnotation.getViewLayoutParams();
                if (viewAnnotation.getMeasuredWidth() == -1) {
                    viewLayoutParams.width = (int) delegatingViewAnnotationPositionDescriptor.getWidth();
                }
                if (viewAnnotation.getMeasuredHeight() == -1) {
                    viewLayoutParams.height = (int) delegatingViewAnnotationPositionDescriptor.getHeight();
                }
                if (!viewAnnotation.isVisible() && this.viewAnnotationsLayout.indexOfChild(viewAnnotation.getView()) == -1) {
                    viewAnnotation.setPositioned(true);
                    this.viewAnnotationsLayout.addView(viewAnnotation.getView(), viewAnnotation.getViewLayoutParams());
                    updateVisibilityAndNotifyUpdateListeners(viewAnnotation, viewAnnotation.getView().getVisibility() == 0 ? ViewAnnotationVisibility.VISIBLE_AND_POSITIONED : ViewAnnotationVisibility.INVISIBLE);
                }
                if (viewAnnotation.isPositioned()) {
                    notifyPositionListeners$default(this, viewAnnotation, delegatingViewAnnotationPositionDescriptor, false, 4, null);
                } else {
                    viewAnnotation.setPositioned(true);
                    viewAnnotation.getView().setVisibility(0);
                    updateVisibilityAndNotifyUpdateListeners(viewAnnotation, ViewAnnotationVisibility.VISIBLE_AND_POSITIONED);
                    notifyPositionListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor, true);
                }
                notifyAnchorListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor);
                notifyAnchorCoordinateListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor);
                viewAnnotation.setPositionDescriptor(delegatingViewAnnotationPositionDescriptor);
                if (needToReorderZ$maps_sdk_release) {
                    viewAnnotation.getView().bringToFront();
                }
            }
        }
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ViewAnnotation> entry : map.entrySet()) {
            if (entry.getValue().getView().getVisibility() == 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            List<DelegatingViewAnnotationPositionDescriptor> list = this.currentPositionDescriptors;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((DelegatingViewAnnotationPositionDescriptor) it.next()).getIdentifier(), entry2.getKey())) {
                        break;
                    }
                }
            }
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            ViewAnnotation viewAnnotation2 = (ViewAnnotation) ((Map.Entry) it2.next()).getValue();
            this.viewAnnotationsLayout.removeView(viewAnnotation2.getView());
            updateVisibilityAndNotifyUpdateListeners(viewAnnotation2, ViewAnnotationVisibility.INVISIBLE);
        }
    }

    private final void prepareViewAnnotation(View inflatedView, ViewAnnotationOptions options) {
        measureView(inflatedView);
        ViewGroup.LayoutParams layoutParams = inflatedView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        int i3 = layoutParams.width;
        if (i3 < 0) {
            i3 = inflatedView.getMeasuredWidth();
        }
        int i10 = layoutParams.height;
        if (i10 < 0) {
            i10 = inflatedView.getMeasuredHeight();
        }
        ViewAnnotationOptions.Builder builder = options.toBuilder();
        Double width = options.getWidth();
        if (width == null) {
            width = Double.valueOf(i3);
        }
        ViewAnnotationOptions.Builder width2 = builder.width(width);
        Double height = options.getHeight();
        if (height == null) {
            height = Double.valueOf(i10);
        }
        ViewAnnotationOptions updatedOptions = width2.height(height).build();
        boolean z2 = options.getVisible() == null;
        ViewAnnotationVisibility viewAnnotationVisibility = ViewAnnotationVisibility.INITIAL;
        if (options.getWidth() != null) {
            i3 = -1;
        }
        ViewAnnotation viewAnnotation = new ViewAnnotation(inflatedView, layoutParams, null, z2, viewAnnotationVisibility, i3, options.getHeight() != null ? -1 : i10, null, false, null, 516, null);
        viewAnnotation.setAttachStateListener(buildAttachStateListener(viewAnnotation.getView(), buildGlobalLayoutListener(viewAnnotation), buildDrawListener(viewAnnotation)));
        inflatedView.addOnAttachStateChangeListener(viewAnnotation.getAttachStateListener());
        this.viewAnnotations.put(viewAnnotation.getId(), viewAnnotation);
        MapboxMap mapboxMap = this.mapboxMap;
        String id = viewAnnotation.getId();
        Intrinsics.checkNotNullExpressionValue(updatedOptions, "updatedOptions");
        Expected addViewAnnotation$maps_sdk_release = mapboxMap.addViewAnnotation$maps_sdk_release(id, updatedOptions);
        if (addViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) addViewAnnotation$maps_sdk_release.getError());
        }
        addViewAnnotation$maps_sdk_release.getValue();
    }

    private final void remove(ViewAnnotation annotation) {
        this.viewAnnotationsLayout.removeView(annotation.getView());
        updateVisibilityAndNotifyUpdateListeners(annotation, ViewAnnotationVisibility.INVISIBLE);
        View.OnAttachStateChangeListener attachStateListener = annotation.getAttachStateListener();
        if (attachStateListener != null) {
            attachStateListener.onViewDetachedFromWindow(annotation.getView());
        }
        annotation.getView().removeOnAttachStateChangeListener(annotation.getAttachStateListener());
        annotation.setAttachStateListener(null);
        Expected removeViewAnnotation$maps_sdk_release = this.mapboxMap.removeViewAnnotation$maps_sdk_release(annotation.getId());
        if (removeViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) removeViewAnnotation$maps_sdk_release.getError());
        }
        removeViewAnnotation$maps_sdk_release.getValue();
    }

    private final void updateVisibilityAndNotifyUpdateListeners(ViewAnnotation annotation, ViewAnnotationVisibility currentVisibility) {
        if (annotation.getVisibility() != currentVisibility) {
            if (annotation.getVisibility() == ViewAnnotationVisibility.INITIAL && currentVisibility == ViewAnnotationVisibility.INVISIBLE) {
                return;
            }
            boolean isVisible = annotation.isVisible();
            boolean z2 = currentVisibility == ViewAnnotationVisibility.VISIBLE_AND_POSITIONED || currentVisibility == ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED;
            annotation.setVisibility(currentVisibility);
            if (this.viewUpdatedListenerSet.isEmpty() || z2 == isVisible) {
                return;
            }
            Iterator<T> it = this.viewUpdatedListenerSet.iterator();
            while (it.hasNext()) {
                ((OnViewAnnotationUpdatedListener) it.next()).onViewAnnotationVisibilityUpdated(annotation.getView(), z2);
            }
        }
    }

    private final void validateOptions(ViewAnnotationOptions options) {
        if (options.getAnnotatedFeature() == null) {
            throw new IllegalArgumentException(StubApp.getString2(14602));
        }
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.viewUpdatedListenerSet.add(listener);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addViewAnnotation(int resId, ViewAnnotationOptions options, AsyncLayoutInflater asyncInflater, final Function1<? super View, Unit> asyncInflateCallback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(asyncInflater, "asyncInflater");
        Intrinsics.checkNotNullParameter(asyncInflateCallback, "asyncInflateCallback");
        validateOptions(options);
        asyncInflater.inflate(resId, this.viewAnnotationsLayout, new AsyncLayoutInflater.OnInflateFinishedListener() { // from class: com.mapbox.maps.viewannotation.a
        });
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    @MapboxDelicateApi
    public CameraOptions cameraForAnnotations(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return cameraForAnnotationsImpl(annotations, edgeInsets, bearing, pitch, null);
    }

    public final void destroy() {
        this.mapboxMap.setViewAnnotationPositionsUpdateListener$maps_sdk_release(null);
        this.viewUpdatedListenerSet.clear();
        removeAllViewAnnotations();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public Map<View, ViewAnnotationOptions> getAnnotations() {
        Map<View, ViewAnnotationOptions> map;
        Map<String, ViewAnnotation> map2 = this.viewAnnotations;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ViewAnnotation>> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            ViewAnnotation value = it.next().getValue();
            Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(value.getId());
            if (viewAnnotationOptions$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
            }
            ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
            Pair pair = viewAnnotationOptions != null ? TuplesKt.to(value.getView(), viewAnnotationOptions) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        map = MapsKt__MapsKt.toMap(arrayList);
        return map;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public View getViewAnnotation(AnnotatedLayerFeature annotatedLayerFeature) {
        Intrinsics.checkNotNullParameter(annotatedLayerFeature, "annotatedLayerFeature");
        return findByAnnotatedLayerFeature(annotatedLayerFeature).getFirst();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public HashSet<String> getViewAnnotationAvoidLayers() {
        return this.mapboxMap.getViewAnnotationAvoidLayers$maps_sdk_release();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationOptions getViewAnnotationOptions(AnnotatedLayerFeature annotatedLayerFeature) {
        Intrinsics.checkNotNullParameter(annotatedLayerFeature, "annotatedLayerFeature");
        return findByAnnotatedLayerFeature(annotatedLayerFeature).getSecond();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationUpdateMode getViewAnnotationUpdateMode() {
        return this.renderThread.getViewAnnotationMode();
    }

    public final CopyOnWriteArraySet<OnViewAnnotationUpdatedListener> getViewUpdatedListenerSet$maps_sdk_release() {
        return this.viewUpdatedListenerSet;
    }

    @Override // com.mapbox.maps.DelegatingViewAnnotationPositionsUpdateListener
    public void onDelegatingViewAnnotationPositionsUpdate(List<DelegatingViewAnnotationPositionDescriptor> positions) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            final List<DelegatingViewAnnotationPositionDescriptor> list = this.updatedPositionDescriptors;
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.mapbox.maps.viewannotation.b
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    ViewAnnotationManagerImpl.onDelegatingViewAnnotationPositionsUpdate$lambda$20(ViewAnnotationManagerImpl.this, list, j);
                }
            });
        } else {
            this.renderThread.setNeedViewAnnotationSync$maps_sdk_release(true);
            this.updatedPositionDescriptors = positions;
        }
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void removeAllViewAnnotations() {
        Iterator<Map.Entry<String, ViewAnnotation>> it = this.viewAnnotations.entrySet().iterator();
        while (it.hasNext()) {
            remove(it.next().getValue());
            it.remove();
        }
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void removeOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.viewUpdatedListenerSet.remove(listener);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public boolean removeViewAnnotation(View view) {
        Object obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator<T> it = this.viewAnnotations.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ViewAnnotation) ((Map.Entry) obj).getValue()).getView(), view)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        String str = (String) entry.getKey();
        ViewAnnotation viewAnnotation = (ViewAnnotation) entry.getValue();
        this.viewAnnotations.remove(str);
        remove(viewAnnotation);
        return true;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void setViewAnnotationAvoidLayers(HashSet<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mapboxMap.setViewAnnotationAvoidLayers$maps_sdk_release(value);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void setViewAnnotationUpdateMode(ViewAnnotationUpdateMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.renderThread.setViewAnnotationMode$maps_sdk_release(mode);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public boolean updateViewAnnotation(View view, ViewAnnotationOptions options) {
        Object obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        Iterator<T> it = this.viewAnnotations.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ViewAnnotation) obj).getView(), view)) {
                break;
            }
        }
        ViewAnnotation viewAnnotation = (ViewAnnotation) obj;
        if (viewAnnotation == null) {
            return false;
        }
        viewAnnotation.setHandleVisibilityAutomatically(options.getVisible() == null);
        if (options.getWidth() != null) {
            viewAnnotation.setMeasuredWidth(-1);
        }
        if (options.getHeight() != null) {
            viewAnnotation.setMeasuredHeight(-1);
        }
        Expected updateViewAnnotation$maps_sdk_release = this.mapboxMap.updateViewAnnotation$maps_sdk_release(viewAnnotation.getId(), options);
        if (updateViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) updateViewAnnotation$maps_sdk_release.getError());
        }
        updateViewAnnotation$maps_sdk_release.getValue();
        return true;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void cameraForAnnotations(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch, Function1<? super CameraOptions, Unit> result) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(result, "result");
        cameraForAnnotationsImpl(annotations, edgeInsets, bearing, pitch, result);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationOptions getViewAnnotationOptions(View view) {
        Object obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator<T> it = this.viewAnnotations.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ViewAnnotation) obj).getView(), view)) {
                break;
            }
        }
        ViewAnnotation viewAnnotation = (ViewAnnotation) obj;
        if (viewAnnotation == null) {
            return null;
        }
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (viewAnnotationOptions$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
        }
        return (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
    }

    public ViewAnnotationManagerImpl(MapView mapView, FrameLayout viewAnnotationsLayout) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(viewAnnotationsLayout, "viewAnnotationsLayout");
        this.viewAnnotationsLayout = viewAnnotationsLayout;
        MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
        this.mapboxMap = mapboxMapDeprecated;
        this.renderThread = mapView.getMapController$maps_sdk_release().getRenderer().getRenderThread$maps_sdk_release();
        this.pixelRatio = mapView.getResources().getDisplayMetrics().density;
        this.viewAnnotations = new LinkedHashMap();
        this.viewUpdatedListenerSet = new CopyOnWriteArraySet<>();
        this.updatedPositionDescriptors = CollectionsKt.emptyList();
        this.currentPositionDescriptors = CollectionsKt.emptyList();
        viewAnnotationsLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mapView.addView(viewAnnotationsLayout, 1);
        mapView.requestDisallowInterceptTouchEvent(false);
        mapboxMapDeprecated.setViewAnnotationPositionsUpdateListener$maps_sdk_release(this);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public View addViewAnnotation(int resId, ViewAnnotationOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        validateOptions(options);
        View view = LayoutInflater.from(this.viewAnnotationsLayout.getContext()).inflate(resId, (ViewGroup) this.viewAnnotationsLayout, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        prepareViewAnnotation(view, options);
        return view;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addViewAnnotation(View view, ViewAnnotationOptions options) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, ViewAnnotation>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().getValue().getView(), view)) {
                    throw new MapboxViewAnnotationException(StubApp.getString2(14606) + view + StubApp.getString2(14607));
                }
            }
        }
        validateOptions(options);
        prepareViewAnnotation(view, options);
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b1\b\u0082\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003Jq\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010@\u001a\u00020\t2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\rHÖ\u0001J\t\u0010C\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006D"}, d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;", "", "view", "Landroid/view/View;", "viewLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "attachStateListener", "Landroid/view/View$OnAttachStateChangeListener;", "handleVisibilityAutomatically", "", "visibility", "Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;", "measuredWidth", "", "measuredHeight", "positionDescriptor", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "isPositioned", "id", "", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;Landroid/view/View$OnAttachStateChangeListener;ZLcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;IILcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;ZLjava/lang/String;)V", "getAttachStateListener", "()Landroid/view/View$OnAttachStateChangeListener;", "setAttachStateListener", "(Landroid/view/View$OnAttachStateChangeListener;)V", "getHandleVisibilityAutomatically", "()Z", "setHandleVisibilityAutomatically", "(Z)V", "getId", "()Ljava/lang/String;", "setPositioned", "isVisible", "getMeasuredHeight", "()I", "setMeasuredHeight", "(I)V", "getMeasuredWidth", "setMeasuredWidth", "getPositionDescriptor", "()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "setPositionDescriptor", "(Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V", "getView", "()Landroid/view/View;", "getViewLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "setViewLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "getVisibility", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;", "setVisibility", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ViewAnnotation {
        private View.OnAttachStateChangeListener attachStateListener;
        private boolean handleVisibilityAutomatically;
        private final String id;
        private boolean isPositioned;
        private int measuredHeight;
        private int measuredWidth;
        private DelegatingViewAnnotationPositionDescriptor positionDescriptor;
        private final View view;
        private ViewGroup.LayoutParams viewLayoutParams;
        private ViewAnnotationVisibility visibility;

        public ViewAnnotation(View view, ViewGroup.LayoutParams viewLayoutParams, View.OnAttachStateChangeListener onAttachStateChangeListener, boolean z2, ViewAnnotationVisibility visibility, int i3, int i10, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z10, String id) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(viewLayoutParams, "viewLayoutParams");
            Intrinsics.checkNotNullParameter(visibility, "visibility");
            Intrinsics.checkNotNullParameter(id, "id");
            this.view = view;
            this.viewLayoutParams = viewLayoutParams;
            this.attachStateListener = onAttachStateChangeListener;
            this.handleVisibilityAutomatically = z2;
            this.visibility = visibility;
            this.measuredWidth = i3;
            this.measuredHeight = i10;
            this.positionDescriptor = delegatingViewAnnotationPositionDescriptor;
            this.isPositioned = z10;
            this.id = id;
        }

        public static /* synthetic */ ViewAnnotation copy$default(ViewAnnotation viewAnnotation, View view, ViewGroup.LayoutParams layoutParams, View.OnAttachStateChangeListener onAttachStateChangeListener, boolean z2, ViewAnnotationVisibility viewAnnotationVisibility, int i3, int i10, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                view = viewAnnotation.view;
            }
            if ((i11 & 2) != 0) {
                layoutParams = viewAnnotation.viewLayoutParams;
            }
            if ((i11 & 4) != 0) {
                onAttachStateChangeListener = viewAnnotation.attachStateListener;
            }
            if ((i11 & 8) != 0) {
                z2 = viewAnnotation.handleVisibilityAutomatically;
            }
            if ((i11 & 16) != 0) {
                viewAnnotationVisibility = viewAnnotation.visibility;
            }
            if ((i11 & 32) != 0) {
                i3 = viewAnnotation.measuredWidth;
            }
            if ((i11 & 64) != 0) {
                i10 = viewAnnotation.measuredHeight;
            }
            if ((i11 & 128) != 0) {
                delegatingViewAnnotationPositionDescriptor = viewAnnotation.positionDescriptor;
            }
            if ((i11 & 256) != 0) {
                z10 = viewAnnotation.isPositioned;
            }
            if ((i11 & 512) != 0) {
                str = viewAnnotation.id;
            }
            boolean z11 = z10;
            String str2 = str;
            int i12 = i10;
            DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor2 = delegatingViewAnnotationPositionDescriptor;
            ViewAnnotationVisibility viewAnnotationVisibility2 = viewAnnotationVisibility;
            int i13 = i3;
            return viewAnnotation.copy(view, layoutParams, onAttachStateChangeListener, z2, viewAnnotationVisibility2, i13, i12, delegatingViewAnnotationPositionDescriptor2, z11, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final View getView() {
            return this.view;
        }

        /* renamed from: component10, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final ViewGroup.LayoutParams getViewLayoutParams() {
            return this.viewLayoutParams;
        }

        /* renamed from: component3, reason: from getter */
        public final View.OnAttachStateChangeListener getAttachStateListener() {
            return this.attachStateListener;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHandleVisibilityAutomatically() {
            return this.handleVisibilityAutomatically;
        }

        /* renamed from: component5, reason: from getter */
        public final ViewAnnotationVisibility getVisibility() {
            return this.visibility;
        }

        /* renamed from: component6, reason: from getter */
        public final int getMeasuredWidth() {
            return this.measuredWidth;
        }

        /* renamed from: component7, reason: from getter */
        public final int getMeasuredHeight() {
            return this.measuredHeight;
        }

        /* renamed from: component8, reason: from getter */
        public final DelegatingViewAnnotationPositionDescriptor getPositionDescriptor() {
            return this.positionDescriptor;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsPositioned() {
            return this.isPositioned;
        }

        public final ViewAnnotation copy(View view, ViewGroup.LayoutParams viewLayoutParams, View.OnAttachStateChangeListener attachStateListener, boolean handleVisibilityAutomatically, ViewAnnotationVisibility visibility, int measuredWidth, int measuredHeight, DelegatingViewAnnotationPositionDescriptor positionDescriptor, boolean isPositioned, String id) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(viewLayoutParams, "viewLayoutParams");
            Intrinsics.checkNotNullParameter(visibility, StubApp.getString2(1338));
            Intrinsics.checkNotNullParameter(id, StubApp.getString2(290));
            return new ViewAnnotation(view, viewLayoutParams, attachStateListener, handleVisibilityAutomatically, visibility, measuredWidth, measuredHeight, positionDescriptor, isPositioned, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewAnnotation)) {
                return false;
            }
            ViewAnnotation viewAnnotation = (ViewAnnotation) other;
            return Intrinsics.areEqual(this.view, viewAnnotation.view) && Intrinsics.areEqual(this.viewLayoutParams, viewAnnotation.viewLayoutParams) && Intrinsics.areEqual(this.attachStateListener, viewAnnotation.attachStateListener) && this.handleVisibilityAutomatically == viewAnnotation.handleVisibilityAutomatically && this.visibility == viewAnnotation.visibility && this.measuredWidth == viewAnnotation.measuredWidth && this.measuredHeight == viewAnnotation.measuredHeight && Intrinsics.areEqual(this.positionDescriptor, viewAnnotation.positionDescriptor) && this.isPositioned == viewAnnotation.isPositioned && Intrinsics.areEqual(this.id, viewAnnotation.id);
        }

        public final View.OnAttachStateChangeListener getAttachStateListener() {
            return this.attachStateListener;
        }

        public final boolean getHandleVisibilityAutomatically() {
            return this.handleVisibilityAutomatically;
        }

        public final String getId() {
            return this.id;
        }

        public final int getMeasuredHeight() {
            return this.measuredHeight;
        }

        public final int getMeasuredWidth() {
            return this.measuredWidth;
        }

        public final DelegatingViewAnnotationPositionDescriptor getPositionDescriptor() {
            return this.positionDescriptor;
        }

        public final View getView() {
            return this.view;
        }

        public final ViewGroup.LayoutParams getViewLayoutParams() {
            return this.viewLayoutParams;
        }

        public final ViewAnnotationVisibility getVisibility() {
            return this.visibility;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (this.viewLayoutParams.hashCode() + (this.view.hashCode() * 31)) * 31;
            View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
            int hashCode2 = (hashCode + (onAttachStateChangeListener == null ? 0 : onAttachStateChangeListener.hashCode())) * 31;
            boolean z2 = this.handleVisibilityAutomatically;
            int i3 = z2;
            if (z2 != 0) {
                i3 = 1;
            }
            int e10 = E1.a.e(this.measuredHeight, E1.a.e(this.measuredWidth, (this.visibility.hashCode() + ((hashCode2 + i3) * 31)) * 31, 31), 31);
            DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor = this.positionDescriptor;
            int hashCode3 = (e10 + (delegatingViewAnnotationPositionDescriptor != null ? delegatingViewAnnotationPositionDescriptor.hashCode() : 0)) * 31;
            boolean z10 = this.isPositioned;
            return this.id.hashCode() + ((hashCode3 + (z10 ? 1 : z10 ? 1 : 0)) * 31);
        }

        public final boolean isPositioned() {
            return this.isPositioned;
        }

        public final boolean isVisible() {
            ViewAnnotationVisibility viewAnnotationVisibility = this.visibility;
            return viewAnnotationVisibility == ViewAnnotationVisibility.VISIBLE_AND_POSITIONED || viewAnnotationVisibility == ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED;
        }

        public final void setAttachStateListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
            this.attachStateListener = onAttachStateChangeListener;
        }

        public final void setHandleVisibilityAutomatically(boolean z2) {
            this.handleVisibilityAutomatically = z2;
        }

        public final void setMeasuredHeight(int i3) {
            this.measuredHeight = i3;
        }

        public final void setMeasuredWidth(int i3) {
            this.measuredWidth = i3;
        }

        public final void setPositionDescriptor(DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor) {
            this.positionDescriptor = delegatingViewAnnotationPositionDescriptor;
        }

        public final void setPositioned(boolean z2) {
            this.isPositioned = z2;
        }

        public final void setViewLayoutParams(ViewGroup.LayoutParams layoutParams) {
            Intrinsics.checkNotNullParameter(layoutParams, "<set-?>");
            this.viewLayoutParams = layoutParams;
        }

        public final void setVisibility(ViewAnnotationVisibility viewAnnotationVisibility) {
            Intrinsics.checkNotNullParameter(viewAnnotationVisibility, "<set-?>");
            this.visibility = viewAnnotationVisibility;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(14593));
            sb2.append(this.view);
            sb2.append(StubApp.getString2(14594));
            sb2.append(this.viewLayoutParams);
            sb2.append(StubApp.getString2(14595));
            sb2.append(this.attachStateListener);
            sb2.append(StubApp.getString2(14596));
            sb2.append(this.handleVisibilityAutomatically);
            sb2.append(StubApp.getString2(14597));
            sb2.append(this.visibility);
            sb2.append(StubApp.getString2(14598));
            sb2.append(this.measuredWidth);
            sb2.append(StubApp.getString2(14599));
            sb2.append(this.measuredHeight);
            sb2.append(StubApp.getString2(14600));
            sb2.append(this.positionDescriptor);
            sb2.append(StubApp.getString2(14601));
            sb2.append(this.isPositioned);
            sb2.append(StubApp.getString2(2296));
            return h.s(sb2, this.id, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ ViewAnnotation(android.view.View r14, android.view.ViewGroup.LayoutParams r15, android.view.View.OnAttachStateChangeListener r16, boolean r17, com.mapbox.maps.viewannotation.ViewAnnotationVisibility r18, int r19, int r20, com.mapbox.maps.DelegatingViewAnnotationPositionDescriptor r21, boolean r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
            /*
                r13 = this;
                r0 = r24
                r1 = r0 & 4
                if (r1 == 0) goto L9
                r1 = 0
                r5 = r1
                goto Lb
            L9:
                r5 = r16
            Lb:
                r0 = r0 & 512(0x200, float:7.17E-43)
                if (r0 == 0) goto L2d
                java.util.UUID r0 = java.util.UUID.randomUUID()
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "randomUUID().toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r12 = r0
            L1d:
                r2 = r13
                r3 = r14
                r4 = r15
                r6 = r17
                r7 = r18
                r8 = r19
                r9 = r20
                r10 = r21
                r11 = r22
                goto L30
            L2d:
                r12 = r23
                goto L1d
            L30:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl.ViewAnnotation.<init>(android.view.View, android.view.ViewGroup$LayoutParams, android.view.View$OnAttachStateChangeListener, boolean, com.mapbox.maps.viewannotation.ViewAnnotationVisibility, int, int, com.mapbox.maps.DelegatingViewAnnotationPositionDescriptor, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
