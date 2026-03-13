package com.mapbox.maps;

import Qb.L;
import X6.r;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.mapbox.maps.debugoptions.DebugOptionsController;
import com.mapbox.maps.debugoptions.MapViewDebugOptions;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.mapbox.maps.renderer.MapboxSurfaceHolderRenderer;
import com.mapbox.maps.renderer.MapboxTextureViewRenderer;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.maps.renderer.widget.Widget;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl;
import com.stub.StubApp;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0089\u0001\u008a\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fB5\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\u0012B#\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\b\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010\u0018J\u000f\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010\u0018J\u000f\u0010+\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u00100\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0011\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00103\u001a\u00020\u00162\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b3\u00107J\u0017\u00109\u001a\u00020\u00162\u0006\u00108\u001a\u00020.H\u0007¢\u0006\u0004\b9\u0010:J\u0019\u0010<\u001a\u00020\u00162\b\b\u0001\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\u00020\u00162\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ#\u0010H\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010G*\u00020F2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020.2\u0006\u0010-\u001a\u00020JH\u0017¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020.2\u0006\u0010-\u001a\u00020JH\u0016¢\u0006\u0004\bM\u0010LJ\u0017\u0010N\u001a\u00020.2\u0006\u0010-\u001a\u00020JH\u0016¢\u0006\u0004\bN\u0010LJ\u0017\u0010P\u001a\u00020\u00162\u0006\u00106\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020\u00162\u0006\u0010S\u001a\u00020RH\u0017¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\u00162\u0006\u0010W\u001a\u00020VH\u0017¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020.2\u0006\u0010W\u001a\u00020VH\u0017¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\\\u0010\u0018J\u0017\u0010_\u001a\u00020\u00162\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\u00162\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\ba\u0010`J#\u0010d\u001a\u00020.*\u00020J2\u0006\u0010b\u001a\u00020J2\u0006\u0010c\u001a\u00020\rH\u0002¢\u0006\u0004\bd\u0010eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010f\u001a\u00020\u00138@@BX\u0080.¢\u0006\f\n\u0004\b\u0014\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020k0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020J0n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001b\u0010c\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010m\u001a\u0004\br\u0010sR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020t0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010mR\u001b\u0010{\u001a\u00020v8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bw\u0010x*\u0004\by\u0010zR4\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020}0|2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020}0|8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u0010\u0084\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u001f\u0010\u0088\u0001\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\u000f\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001*\u0005\b\u0087\u0001\u0010z¨\u0006\u008b\u0001"}, d2 = {"Lcom/mapbox/maps/MapView;", "Landroid/widget/FrameLayout;", "Lg7/f;", "Lcom/mapbox/maps/MapControllable;", "Landroid/content/Context;", "context", "Lcom/mapbox/maps/MapInitOptions;", "mapInitOptions", "<init>", "(Landroid/content/Context;Lcom/mapbox/maps/MapInitOptions;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "initOptions", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/mapbox/maps/MapInitOptions;)V", "Lcom/mapbox/maps/MapController;", "mapController", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/mapbox/maps/MapController;)V", "", "onAttachedToWindow", "()V", "parseTypedArray$maps_sdk_release", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/mapbox/maps/MapInitOptions;", "parseTypedArray", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "(II)V", "onStart", "onStop", "onResume", "onLowMemory", "onDestroy", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMapDeprecated", "()Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "Ljava/lang/Runnable;", "event", "", "needRender", "queueEvent", "(Ljava/lang/Runnable;Z)V", "Landroid/graphics/Bitmap;", "snapshot", "()Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", "listener", "(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V", "enabled", "setSnapshotLegacyMode", "(Z)V", "fps", "setMaximumFps", "(I)V", "LX6/r;", "plugin", "createPlugin", "(LX6/r;)V", "", "id", "removePlugin", "(Ljava/lang/String;)V", "LX6/j;", "T", "getPlugin", "(Ljava/lang/String;)LX6/j;", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onInterceptTouchEvent", "onGenericMotionEvent", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setOnFpsChangedListener", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "renderThreadStatsRecorder", "setRenderThreadStatsRecorder", "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V", "Lcom/mapbox/maps/renderer/widget/Widget;", "widget", "addWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)V", "removeWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)Z", "scheduleThreadServiceTypeReset", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "rendererSetupErrorListener", "addRendererSetupErrorListener", "(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V", "removeRendererSetupErrorListener", "moveEvent", "touchSlop", "hypot", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;I)Z", "<set-?>", "Lcom/mapbox/maps/MapController;", "getMapController$maps_sdk_release", "()Lcom/mapbox/maps/MapController;", "Lkotlin/Lazy;", "Lcom/mapbox/maps/debugoptions/DebugOptionsController;", "debugOptionsControllerDelegate", "Lkotlin/Lazy;", "", "interceptedViewAnnotationEvents", "Ljava/util/List;", "touchSlop$delegate", "getTouchSlop", "()I", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;", "viewAnnotationManagerDelegate", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "getViewAnnotationManager", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "getViewAnnotationManager$delegate", "(Lcom/mapbox/maps/MapView;)Ljava/lang/Object;", "viewAnnotationManager", "", "Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;", "value", "getDebugOptions", "()Ljava/util/Set;", "setDebugOptions", "(Ljava/util/Set;)V", "debugOptions", "mapboxMap", "getDebugOptionsController", "()Lcom/mapbox/maps/debugoptions/DebugOptionsController;", "getDebugOptionsController$delegate", "debugOptionsController", "Companion", "OnSnapshotReady", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MapView extends FrameLayout implements g7.f, MapControllable {
    public static final /* synthetic */ int DEFAULT_ANTIALIASING_SAMPLE_COUNT = 1;
    public static final /* synthetic */ int DEFAULT_FPS = 60;
    private final Lazy<DebugOptionsController> debugOptionsControllerDelegate;
    private List<MotionEvent> interceptedViewAnnotationEvents;
    private MapController mapController;

    /* renamed from: touchSlop$delegate, reason: from kotlin metadata */
    private final Lazy touchSlop;
    private final Lazy<ViewAnnotationManagerImpl> viewAnnotationManagerDelegate;
    private static final String TAG = StubApp.getString2(13990);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0081\u0002¢\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/MapView$Companion;", "", "()V", "DEFAULT_ANTIALIASING_SAMPLE_COUNT", "", "DEFAULT_FPS", "TAG", "", "invoke", "Lcom/mapbox/maps/MapView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "mapController", "Lcom/mapbox/maps/MapController;", "invoke$maps_sdk_release", "isRenderingSupported", "", "isTerrainRenderingSupported", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ MapView invoke$maps_sdk_release(Context context, AttributeSet attrs, MapController mapController) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mapController, "mapController");
            return new MapView(context, attrs, mapController, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final boolean isRenderingSupported() {
            EGLCore eGLCore = new EGLCore(false, 1, null, "", 4, null);
            boolean prepareEgl = eGLCore.prepareEgl();
            eGLCore.release();
            return prepareEgl;
        }

        @JvmStatic
        public final boolean isTerrainRenderingSupported() {
            EGLCore eGLCore = new EGLCore(false, 1, null, "", 4, null);
            boolean prepareEgl = eGLCore.prepareEgl();
            EGLSurface createOffscreenSurface = eGLCore.createOffscreenSurface(1, 1);
            eGLCore.makeCurrent(createOffscreenSurface);
            IntBuffer allocate = IntBuffer.allocate(1);
            GLES20.glGetIntegerv(35660, allocate);
            allocate.rewind();
            boolean z2 = allocate.get() > 0;
            eGLCore.releaseSurface(createOffscreenSurface);
            eGLCore.release();
            return prepareEgl && z2;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/MapView$OnSnapshotReady;", "", "onSnapshotReady", "", "bitmap", "Landroid/graphics/Bitmap;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnSnapshotReady {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MapView(Context context) {
        this(context, (MapInitOptions) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final DebugOptionsController getDebugOptionsController() {
        return this.debugOptionsControllerDelegate.getValue();
    }

    private final int getTouchSlop() {
        return ((Number) this.touchSlop.getValue()).intValue();
    }

    private final boolean hypot(MotionEvent motionEvent, MotionEvent motionEvent2, int i3) {
        int pointerCount = motionEvent2.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent2.getPointerId(i10);
            int findPointerIndex = motionEvent.findPointerIndex(pointerId);
            int findPointerIndex2 = motionEvent2.findPointerIndex(pointerId);
            if (findPointerIndex != -1 && findPointerIndex2 != -1 && ((float) Math.hypot(motionEvent.getX(findPointerIndex) - motionEvent2.getX(findPointerIndex2), motionEvent.getY(findPointerIndex) - motionEvent2.getY(findPointerIndex2))) > i3) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean isRenderingSupported() {
        return INSTANCE.isRenderingSupported();
    }

    @JvmStatic
    public static final boolean isTerrainRenderingSupported() {
        return INSTANCE.isTerrainRenderingSupported();
    }

    @Override // com.mapbox.maps.MapControllable
    public void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        Intrinsics.checkNotNullParameter(rendererSetupErrorListener, "rendererSetupErrorListener");
        getMapController$maps_sdk_release().addRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void addWidget(Widget widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        getMapController$maps_sdk_release().addWidget(widget);
    }

    public final void createPlugin(r plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        getMapController$maps_sdk_release().createPlugin(this, plugin);
    }

    public final Set<MapViewDebugOptions> getDebugOptions() {
        return getDebugOptionsController().getOptions();
    }

    public final /* synthetic */ MapController getMapController$maps_sdk_release() {
        MapController mapController = this.mapController;
        if (mapController != null) {
            return mapController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapController");
        return null;
    }

    @Override // com.mapbox.maps.MapControllable
    /* renamed from: getMapboxMap */
    public MapboxMap getMapboxMapDeprecated() {
        return getMapController$maps_sdk_release().getMapboxMapDeprecated();
    }

    @Override // g7.f
    public <T extends X6.j> T getPlugin(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return (T) getMapController$maps_sdk_release().getPlugin(id);
    }

    public final ViewAnnotationManager getViewAnnotationManager() {
        return this.viewAnnotationManagerDelegate.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        getMapController$maps_sdk_release().onAttachedToWindow$maps_sdk_release(this);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onDestroy() {
        if (this.viewAnnotationManagerDelegate.isInitialized()) {
            ViewAnnotationManager viewAnnotationManager = getViewAnnotationManager();
            Intrinsics.checkNotNull(viewAnnotationManager, "null cannot be cast to non-null type com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl");
            ((ViewAnnotationManagerImpl) viewAnnotationManager).destroy();
        }
        getMapController$maps_sdk_release().onDestroy();
    }

    @Override // android.view.View, com.mapbox.maps.MapControllable
    public boolean onGenericMotionEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return getMapController$maps_sdk_release().onGenericMotionEvent(event) || super.onGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    List<MotionEvent> list = this.interceptedViewAnnotationEvents;
                    if (list == null || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (hypot((MotionEvent) it.next(), event, getTouchSlop())) {
                                return true;
                            }
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            final int pointerId = event.getPointerId(event.getActionIndex());
                            CollectionsKt__MutableCollectionsKt.removeAll((List) this.interceptedViewAnnotationEvents, (Function1) new Function1<MotionEvent, Boolean>() { // from class: com.mapbox.maps.MapView$onInterceptTouchEvent$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(MotionEvent it2) {
                                    Intrinsics.checkNotNullParameter(it2, "it");
                                    return Boolean.valueOf(pointerId == it2.getPointerId(it2.getActionIndex()));
                                }
                            });
                            return false;
                        }
                    }
                }
                return false;
            }
            this.interceptedViewAnnotationEvents.clear();
            return false;
        }
        List<MotionEvent> list2 = this.interceptedViewAnnotationEvents;
        MotionEvent obtain = MotionEvent.obtain(event);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(event)");
        list2.add(obtain);
        return false;
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onLowMemory() {
        getMapController$maps_sdk_release().onLowMemory();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onResume() {
        getMapController$maps_sdk_release().onResume();
    }

    @Override // android.view.View
    public void onSizeChanged(int w10, int h2, int oldw, int oldh) {
        super.onSizeChanged(w10, h2, oldw, oldh);
        if (w10 == oldw && h2 == oldh) {
            return;
        }
        onSizeChanged(w10, h2);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStart() {
        getMapController$maps_sdk_release().setScreenRefreshRate$maps_sdk_release(60);
        L.j(getMapController$maps_sdk_release().getLifecycleScope(), null, new MapView$onStart$1(this, null), 3);
        getMapController$maps_sdk_release().onStart();
        if (this.debugOptionsControllerDelegate.isInitialized()) {
            getDebugOptionsController().setStarted(true);
        }
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStop() {
        getMapController$maps_sdk_release().onStop();
        if (this.debugOptionsControllerDelegate.isInitialized()) {
            getDebugOptionsController().setStarted(false);
        }
    }

    @Override // android.view.View, com.mapbox.maps.MapControllable
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        boolean z2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.interceptedViewAnnotationEvents.isEmpty()) {
            List<MotionEvent> list = this.interceptedViewAnnotationEvents;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((MotionEvent) it.next()).getEventTime() == event.getEventTime()) {
                    }
                }
            }
            z2 = false;
            for (MotionEvent motionEvent : this.interceptedViewAnnotationEvents) {
                z2 = getMapController$maps_sdk_release().onTouchEvent(motionEvent) || z2;
                motionEvent.recycle();
            }
            this.interceptedViewAnnotationEvents.clear();
            return !getMapController$maps_sdk_release().onTouchEvent(event) || z2;
        }
        z2 = false;
        this.interceptedViewAnnotationEvents.clear();
        if (getMapController$maps_sdk_release().onTouchEvent(event)) {
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    public final /* synthetic */ MapInitOptions parseTypedArray$maps_sdk_release(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            MapOptions parseMapOptions = MapAttributeParser.INSTANCE.parseMapOptions(obtainStyledAttributes, context.getResources().getDisplayMetrics().density);
            String str = null;
            CameraOptions parseCameraOptions$default = CameraAttributeParser.parseCameraOptions$default(CameraAttributeParser.INSTANCE, obtainStyledAttributes, 0.0f, 2, null);
            boolean z2 = obtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_mapSurface, 0) != 0;
            String string = obtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_styleUri);
            if (string == null) {
                string = "mapbox://styles/mapbox/standard";
            }
            int integer = obtainStyledAttributes.getInteger(R.styleable.mapbox_MapView_mapbox_mapAntialiasingSampleCount, 1);
            String string2 = obtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_mapName);
            if (string2 == null) {
                string2 = "";
            }
            String str2 = string2;
            String str3 = string;
            if (str3.length() != 0) {
                str = str3;
            }
            MapInitOptions mapInitOptions = new MapInitOptions(context, parseMapOptions, null, null, false, str, attrs, integer, str2, 28, null);
            mapInitOptions.setCameraOptions(parseCameraOptions$default);
            mapInitOptions.setTextureView(z2);
            obtainStyledAttributes.recycle();
            return mapInitOptions;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public void queueEvent(Runnable event, boolean needRender) {
        Intrinsics.checkNotNullParameter(event, "event");
        getMapController$maps_sdk_release().queueEvent(event, needRender);
    }

    public final void removePlugin(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        getMapController$maps_sdk_release().removePlugin(id);
    }

    @Override // com.mapbox.maps.MapControllable
    public void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        Intrinsics.checkNotNullParameter(rendererSetupErrorListener, "rendererSetupErrorListener");
        getMapController$maps_sdk_release().removeRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public boolean removeWidget(Widget widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        return getMapController$maps_sdk_release().removeWidget(widget);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final void scheduleThreadServiceTypeReset() {
        getMapController$maps_sdk_release().getRenderer().getRenderThread$maps_sdk_release().scheduleThreadServiceTypeReset();
    }

    public final void setDebugOptions(Set<MapViewDebugOptions> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getDebugOptionsController().setOptions(value);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setMaximumFps(int fps) {
        getMapController$maps_sdk_release().setMaximumFps(fps);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setOnFpsChangedListener(OnFpsChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getMapController$maps_sdk_release().setOnFpsChangedListener(listener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        Intrinsics.checkNotNullParameter(renderThreadStatsRecorder, "renderThreadStatsRecorder");
        getMapController$maps_sdk_release().setRenderThreadStatsRecorder(renderThreadStatsRecorder);
    }

    @MapboxExperimental
    public final void setSnapshotLegacyMode(boolean enabled) {
        getMapController$maps_sdk_release().getRenderer().setSnapshotLegacyModeEnabled$maps_sdk_release(enabled);
    }

    @Override // com.mapbox.maps.MapControllable
    public Bitmap snapshot() {
        return getMapController$maps_sdk_release().snapshot();
    }

    public /* synthetic */ MapView(Context context, AttributeSet attributeSet, MapController mapController, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, mapController);
    }

    @Override // com.mapbox.maps.MapControllable
    public void snapshot(OnSnapshotReady listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getMapController$maps_sdk_release().snapshot(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapView(Context context, MapInitOptions mapInitOptions) {
        this(context, null, 0, 0, mapInitOptions);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapInitOptions, "mapInitOptions");
    }

    @Override // com.mapbox.maps.MapControllable
    public void onSizeChanged(int w10, int h2) {
        if (isInEditMode()) {
            return;
        }
        getMapController$maps_sdk_release().onSizeChanged(w10, h2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MapView(android.content.Context r14, com.mapbox.maps.MapInitOptions r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r13 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L16
            com.mapbox.maps.MapInitOptions r1 = new com.mapbox.maps.MapInitOptions
            r11 = 510(0x1fe, float:7.15E-43)
            r12 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15 = r1
        L16:
            r13.<init>(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.MapView.<init>(android.content.Context, com.mapbox.maps.MapInitOptions, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private MapView(Context context, AttributeSet attributeSet, int i3, int i10, MapInitOptions mapInitOptions) {
        super(context, attributeSet, i3, i10);
        MapInitOptions mapInitOptions2;
        View surfaceView;
        MapboxRenderer mapboxTextureViewRenderer;
        this.debugOptionsControllerDelegate = LazyKt.lazy(new Function0<DebugOptionsController>() { // from class: com.mapbox.maps.MapView$debugOptionsControllerDelegate$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DebugOptionsController invoke() {
                MapView mapView = MapView.this;
                return new DebugOptionsController(mapView, mapView.getMapController$maps_sdk_release().getMapboxMapDeprecated());
            }
        });
        this.interceptedViewAnnotationEvents = new ArrayList();
        this.touchSlop = LazyKt.lazy(new Function0<Integer>() { // from class: com.mapbox.maps.MapView$touchSlop$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(ViewConfiguration.get(MapView.this.getContext()).getScaledTouchSlop());
            }
        });
        this.viewAnnotationManagerDelegate = LazyKt.lazy(new Function0<ViewAnnotationManagerImpl>() { // from class: com.mapbox.maps.MapView$viewAnnotationManagerDelegate$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final ViewAnnotationManagerImpl invoke() {
                return new ViewAnnotationManagerImpl(MapView.this, null, 2, 0 == true ? 1 : 0);
            }
        });
        if (attributeSet != null) {
            mapInitOptions2 = parseTypedArray$maps_sdk_release(context, attributeSet);
        } else {
            mapInitOptions2 = mapInitOptions == null ? new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null) : mapInitOptions;
        }
        if (isInEditMode()) {
            return;
        }
        if (mapInitOptions2.getTextureView()) {
            surfaceView = new TextureView(context, attributeSet);
        } else {
            surfaceView = new SurfaceView(context, attributeSet);
        }
        ContextMode contextMode = mapInitOptions2.getMapOptions().getContextMode();
        contextMode = contextMode == null ? ContextMode.UNIQUE : contextMode;
        Intrinsics.checkNotNullExpressionValue(contextMode, "resolvedMapInitOptions.m…ode ?: ContextMode.UNIQUE");
        if (surfaceView instanceof SurfaceView) {
            SurfaceHolder holder = ((SurfaceView) surfaceView).getHolder();
            Intrinsics.checkNotNullExpressionValue(holder, "view.holder");
            mapboxTextureViewRenderer = new MapboxSurfaceHolderRenderer(holder, mapInitOptions2.getAntialiasingSampleCount(), contextMode, mapInitOptions2.getMapName());
        } else if (surfaceView instanceof TextureView) {
            mapboxTextureViewRenderer = new MapboxTextureViewRenderer((TextureView) surfaceView, mapInitOptions2.getAntialiasingSampleCount(), contextMode, mapInitOptions2.getMapName());
        } else {
            throw new IllegalArgumentException(StubApp.getString2(13991));
        }
        this.mapController = new MapController(mapboxTextureViewRenderer, mapInitOptions2);
        addView(surfaceView, 0);
        getMapController$maps_sdk_release().initializePlugins(mapInitOptions2, this);
    }

    private MapView(Context context, AttributeSet attributeSet, MapController mapController) {
        super(context, attributeSet, 0, 0);
        this.debugOptionsControllerDelegate = LazyKt.lazy(new Function0<DebugOptionsController>() { // from class: com.mapbox.maps.MapView$debugOptionsControllerDelegate$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DebugOptionsController invoke() {
                MapView mapView = MapView.this;
                return new DebugOptionsController(mapView, mapView.getMapController$maps_sdk_release().getMapboxMapDeprecated());
            }
        });
        this.interceptedViewAnnotationEvents = new ArrayList();
        this.touchSlop = LazyKt.lazy(new Function0<Integer>() { // from class: com.mapbox.maps.MapView$touchSlop$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(ViewConfiguration.get(MapView.this.getContext()).getScaledTouchSlop());
            }
        });
        this.viewAnnotationManagerDelegate = LazyKt.lazy(new Function0<ViewAnnotationManagerImpl>() { // from class: com.mapbox.maps.MapView$viewAnnotationManagerDelegate$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final ViewAnnotationManagerImpl invoke() {
                return new ViewAnnotationManagerImpl(MapView.this, null, 2, 0 == true ? 1 : 0);
            }
        });
        this.mapController = mapController;
    }
}
