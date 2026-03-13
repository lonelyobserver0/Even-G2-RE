package com.mapbox.maps.renderer;

import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.Surface;
import com.mapbox.common.MapboxTracing;
import com.mapbox.maps.ContextMode;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.maps.renderer.gl.TextureRenderer;
import com.mapbox.maps.renderer.widget.Widget;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.maps.viewannotation.ViewAnnotationUpdateMode;
import com.stub.StubApp;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 «\u00012\u00020\u0001:\u0002«\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eBO\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0002\u0010\u001cJ\u000e\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020|J\b\u0010}\u001a\u00020\u0007H\u0002J\b\u0010~\u001a\u00020\u0007H\u0002J\b\u0010\u007f\u001a\u00020\u0007H\u0002J\u0011\u0010\u0080\u0001\u001a\u00020\u00072\u0006\u0010h\u001a\u00020iH\u0002J\t\u0010\u0081\u0001\u001a\u00020zH\u0002J\t\u0010\u0082\u0001\u001a\u00020zH\u0002J\u000f\u0010\u0083\u0001\u001a\u00020zH\u0001¢\u0006\u0003\b\u0084\u0001J\u0013\u0010\u0085\u0001\u001a\u00020z2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0016J\u0018\u0010\u0088\u0001\u001a\u00020z2\r\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020L0KH\u0002J\u0013\u0010\u008a\u0001\u001a\u00020z2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0002J!\u0010\u008b\u0001\u001a\u00020z2\u0006\u0010h\u001a\u00020i2\u0006\u0010x\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0007J\t\u0010\u008c\u0001\u001a\u00020zH\u0007J\u0019\u0010\u008d\u0001\u001a\u00020z2\u0006\u0010x\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0007J\t\u0010\u008e\u0001\u001a\u00020zH\u0007J\u001e\u0010\u008f\u0001\u001a\u00020z2\u0007\u0010\u0090\u0001\u001a\u00020L2\n\b\u0002\u0010\u0091\u0001\u001a\u00030\u0087\u0001H\u0002J\u0015\u0010\u0092\u0001\u001a\u00020z2\n\b\u0002\u0010\u0091\u0001\u001a\u00030\u0087\u0001H\u0002J\u0014\u0010\u0093\u0001\u001a\u00020z2\t\b\u0002\u0010\u0094\u0001\u001a\u00020\u0007H\u0002J'\u0010\u0095\u0001\u001a\u00020z2\u0006\u0010h\u001a\u00020i2\u0006\u0010x\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0000¢\u0006\u0003\b\u0096\u0001J\u0012\u0010\u0097\u0001\u001a\u00020z2\u0007\u0010\u0090\u0001\u001a\u00020LH\u0007J\u0014\u0010\u0098\u0001\u001a\u00020z2\t\b\u0002\u0010\u0099\u0001\u001a\u00020\u0007H\u0002J\t\u0010\u009a\u0001\u001a\u00020zH\u0002J\u000f\u0010\u009b\u0001\u001a\u00020\u00072\u0006\u0010{\u001a\u00020|J\u001c\u0010\u009c\u0001\u001a\u00020z2\u0010\b\u0004\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020z0\u009e\u0001H\u0082\bJ\t\u0010\u009f\u0001\u001a\u00020zH\u0002J\t\u0010 \u0001\u001a\u00020zH\u0007J\u0007\u0010¡\u0001\u001a\u00020zJ\u0012\u0010¢\u0001\u001a\u00020z2\u0007\u0010£\u0001\u001a\u00020\tH\u0007J\u0012\u0010¤\u0001\u001a\u00020\u00072\u0007\u0010\u0094\u0001\u001a\u00020\u0007H\u0002J\u0012\u0010¥\u0001\u001a\u00020z2\u0007\u0010¦\u0001\u001a\u00020\tH\u0007J\t\u0010§\u0001\u001a\u00020zH\u0002J#\u0010¨\u0001\u001a\u00020z2\u0007\u0010©\u0001\u001a\u00020\r2\u000e\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00020z0\u009e\u0001H\u0082\bR\u0014\u0010\u001d\u001a\u00020\rX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00078\u0000@@X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R$\u0010.\u001a\u00020/8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b0\u0010\u001f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R/\u00107\u001a\u0004\u0018\u0001062\b\u00105\u001a\u0004\u0018\u0001068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010?\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bA\u0010BR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010E\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\bF\u0010%R\u001a\u0010G\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010#\"\u0004\bI\u0010%R\"\u0010J\u001a\b\u0012\u0004\u0012\u00020L0K8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010\u001f\u001a\u0004\bN\u0010OR$\u0010P\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bQ\u0010\u001f\u001a\u0004\bR\u0010#\"\u0004\bS\u0010%R\u000e\u0010T\u001a\u00020UX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010V\u001a\b\u0012\u0004\u0012\u00020L0K8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010\u001f\u001a\u0004\bX\u0010OR\u0014\u0010Y\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u000e\u0010\\\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010]\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010#R\u000e\u0010_\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010`\u001a\u0004\u0018\u00010aX\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bb\u0010\u001f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u000e\u0010g\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010h\u001a\u0004\u0018\u00010i8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bj\u0010\u001f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010p\u001a\u00020qX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u000e\u0010v\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006¬\u0001"}, d2 = {"Lcom/mapbox/maps/renderer/MapboxRenderThread;", "Landroid/view/Choreographer$FrameCallback;", "mapboxRenderer", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "mapboxWidgetRenderer", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "translucentSurface", "", "antialiasingSampleCount", "", "contextMode", "Lcom/mapbox/maps/ContextMode;", "mapName", "", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;ZILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V", "handlerThread", "Lcom/mapbox/maps/renderer/RenderHandlerThread;", "eglCore", "Lcom/mapbox/maps/renderer/egl/EGLCore;", "fpsManager", "Lcom/mapbox/maps/renderer/FpsManager;", "widgetTextureRenderer", "Lcom/mapbox/maps/renderer/gl/TextureRenderer;", "surfaceProcessingLock", "Ljava/util/concurrent/locks/ReentrantLock;", "createCondition", "Ljava/util/concurrent/locks/Condition;", "destroyCondition", "(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;Lcom/mapbox/maps/renderer/RenderHandlerThread;Lcom/mapbox/maps/renderer/egl/EGLCore;Lcom/mapbox/maps/renderer/FpsManager;Lcom/mapbox/maps/renderer/gl/TextureRenderer;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;)V", "TAG", "getTAG$annotations", "()V", "awaitingNextVsync", "getAwaitingNextVsync$maps_sdk_release$annotations", "getAwaitingNextVsync$maps_sdk_release", "()Z", "setAwaitingNextVsync$maps_sdk_release", "(Z)V", "eglContextCreated", "value", "eglContextMadeCurrent", "getEglContextMadeCurrent$maps_sdk_release$annotations", "getEglContextMadeCurrent$maps_sdk_release", "setEglContextMadeCurrent$maps_sdk_release", "getEglCore$maps_sdk_release", "()Lcom/mapbox/maps/renderer/egl/EGLCore;", "eglSurface", "Landroid/opengl/EGLSurface;", "getEglSurface$maps_sdk_release$annotations", "getEglSurface$maps_sdk_release", "()Landroid/opengl/EGLSurface;", "setEglSurface$maps_sdk_release", "(Landroid/opengl/EGLSurface;)V", "<set-?>", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "fpsChangedListener", "getFpsChangedListener$maps_sdk_release", "()Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setFpsChangedListener$maps_sdk_release", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "fpsChangedListener$delegate", "Lkotlin/properties/ReadWriteProperty;", "height", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler$delegate", "Lkotlin/Lazy;", "nativeRenderCreated", "setNativeRenderCreated", "needViewAnnotationSync", "getNeedViewAnnotationSync$maps_sdk_release", "setNeedViewAnnotationSync$maps_sdk_release", "nonRenderEventQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/mapbox/maps/renderer/RenderEvent;", "getNonRenderEventQueue$maps_sdk_release$annotations", "getNonRenderEventQueue$maps_sdk_release", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "paused", "getPaused$maps_sdk_release$annotations", "getPaused$maps_sdk_release", "setPaused$maps_sdk_release", "prepareRenderFrameRunnable", "Ljava/lang/Runnable;", "renderEventQueue", "getRenderEventQueue$maps_sdk_release$annotations", "getRenderEventQueue$maps_sdk_release", "renderHandlerThread", "getRenderHandlerThread$maps_sdk_release", "()Lcom/mapbox/maps/renderer/RenderHandlerThread;", "renderNotSupported", "renderThreadPrepared", "getRenderThreadPrepared", "renderThreadPreparedLock", "renderThreadStatsRecorder", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "getRenderThreadStatsRecorder$maps_sdk_release$annotations", "getRenderThreadStatsRecorder$maps_sdk_release", "()Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "setRenderThreadStatsRecorder$maps_sdk_release", "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V", "sizeChanged", "surface", "Landroid/view/Surface;", "getSurface$maps_sdk_release$annotations", "getSurface$maps_sdk_release", "()Landroid/view/Surface;", "setSurface$maps_sdk_release", "(Landroid/view/Surface;)V", "swapBuffersFunc", "viewAnnotationMode", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "getViewAnnotationMode$maps_sdk_release", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "setViewAnnotationMode$maps_sdk_release", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V", "widgetRenderCreated", "widgetRenderer", "width", "addWidget", "", "widget", "Lcom/mapbox/maps/renderer/widget/Widget;", "checkAndroidSurface", "checkEglConfig", "checkEglContextCurrent", "checkEglSurface", "checkSurfaceSizeChanged", "checkWidgetRender", "destroy", "destroy$maps_sdk_release", "doFrame", "frameTimeNanos", "", "drainQueue", "originalQueue", "draw", "onSurfaceCreated", "onSurfaceDestroyed", "onSurfaceSizeChanged", "pause", "postNonRenderEvent", "renderEvent", "delayMillis", "postPrepareRenderFrame", "prepareRenderFrame", "creatingSurface", "processAndroidSurface", "processAndroidSurface$maps_sdk_release", "queueRenderEvent", "releaseAll", "tryRecreate", "releaseEglSurface", "removeWidget", "renderPreparedGuardedRun", "block", "Lkotlin/Function0;", "resetGlState", "resume", "scheduleThreadServiceTypeReset", "setScreenRefreshRate", "refreshRate", "setUpRenderThread", "setUserRefreshRate", "fps", "swapBuffers", "trace", "sectionName", "section", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxRenderThread implements Choreographer.FrameCallback {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MapboxRenderThread.class, StubApp.getString2(14446), StubApp.getString2(14445), 0))};
    public static final long RESET_THREAD_SERVICE_TYPE_DELAY_MS = 300;
    public static final long RETRY_DELAY_MS = 50;
    private final String TAG;
    private volatile boolean awaitingNextVsync;
    private final ContextMode contextMode;
    private final Condition createCondition;
    private final Condition destroyCondition;
    private boolean eglContextCreated;
    private boolean eglContextMadeCurrent;
    private final EGLCore eglCore;
    private EGLSurface eglSurface;

    /* renamed from: fpsChangedListener$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty fpsChangedListener;
    private final FpsManager fpsManager;
    private int height;

    /* renamed from: mainHandler$delegate, reason: from kotlin metadata */
    private final Lazy mainHandler;
    private final MapboxRenderer mapboxRenderer;
    private boolean nativeRenderCreated;
    private boolean needViewAnnotationSync;
    private final ConcurrentLinkedQueue<RenderEvent> nonRenderEventQueue;
    private volatile boolean paused;
    private final Runnable prepareRenderFrameRunnable;
    private final ConcurrentLinkedQueue<RenderEvent> renderEventQueue;
    private final RenderHandlerThread renderHandlerThread;
    private boolean renderNotSupported;
    private final ReentrantLock renderThreadPreparedLock;
    private RenderThreadStatsRecorder renderThreadStatsRecorder;
    private boolean sizeChanged;
    private Surface surface;
    private final ReentrantLock surfaceProcessingLock;
    private final Choreographer.FrameCallback swapBuffersFunc;
    private final boolean translucentSurface;
    private volatile ViewAnnotationUpdateMode viewAnnotationMode;
    private boolean widgetRenderCreated;
    private final MapboxWidgetRenderer widgetRenderer;
    private final TextureRenderer widgetTextureRenderer;
    private int width;

    public MapboxRenderThread(MapboxRenderer mapboxRenderer, MapboxWidgetRenderer mapboxWidgetRenderer, boolean z2, int i3, ContextMode contextMode, String mapName) {
        Intrinsics.checkNotNullParameter(mapboxRenderer, "mapboxRenderer");
        Intrinsics.checkNotNullParameter(mapboxWidgetRenderer, "mapboxWidgetRenderer");
        Intrinsics.checkNotNullParameter(contextMode, "contextMode");
        Intrinsics.checkNotNullParameter(mapName, "mapName");
        this.renderEventQueue = new ConcurrentLinkedQueue<>();
        this.nonRenderEventQueue = new ConcurrentLinkedQueue<>();
        this.mainHandler = LazyKt.lazy(MapboxRenderThread$mainHandler$2.INSTANCE);
        this.renderThreadPreparedLock = new ReentrantLock();
        Delegates delegates = Delegates.INSTANCE;
        final DefaultConstructorMarker defaultConstructorMarker = null;
        this.fpsChangedListener = new ObservableProperty<OnFpsChangedListener>(defaultConstructorMarker) { // from class: com.mapbox.maps.renderer.MapboxRenderThread$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, OnFpsChangedListener oldValue, OnFpsChangedListener newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                OnFpsChangedListener onFpsChangedListener = newValue;
                if (Intrinsics.areEqual(oldValue, onFpsChangedListener)) {
                    return;
                }
                MapboxRenderThread mapboxRenderThread = this;
                MapboxRenderThread.postNonRenderEvent$default(mapboxRenderThread, new RenderEvent(new MapboxRenderThread$fpsChangedListener$2$1(mapboxRenderThread, onFpsChangedListener), false), 0L, 2, null);
            }
        };
        this.viewAnnotationMode = ViewAnnotationManager.DEFAULT_UPDATE_MODE;
        this.prepareRenderFrameRunnable = new b(this, 0);
        this.swapBuffersFunc = new Choreographer.FrameCallback() { // from class: com.mapbox.maps.renderer.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                MapboxRenderThread.swapBuffersFunc$lambda$6(MapboxRenderThread.this, j);
            }
        };
        this.translucentSurface = z2;
        this.mapboxRenderer = mapboxRenderer;
        this.widgetRenderer = mapboxWidgetRenderer;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14447));
        sb2.append(!StringsKt.isBlank(mapName) ? E1.a.j(StubApp.getString2(639), mapName) : "");
        this.TAG = sb2.toString();
        EGLCore eGLCore = new EGLCore(z2, i3, null, mapName, 4, null);
        this.eglCore = eGLCore;
        this.eglSurface = eGLCore.getEglNoSurface();
        this.widgetTextureRenderer = new TextureRenderer(0.0f, 1, defaultConstructorMarker);
        this.contextMode = contextMode;
        RenderHandlerThread renderHandlerThread = new RenderHandlerThread(mapName);
        this.renderHandlerThread = renderHandlerThread;
        this.fpsManager = new FpsManager(renderHandlerThread.start(), mapName);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.surfaceProcessingLock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "surfaceProcessingLock.newCondition()");
        this.createCondition = newCondition;
        Condition newCondition2 = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition2, "surfaceProcessingLock.newCondition()");
        this.destroyCondition = newCondition2;
    }

    private final boolean checkAndroidSurface() {
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            return true;
        }
        String str = this.TAG;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14448));
        Surface surface2 = this.surface;
        sb2.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
        sb2.append(StubApp.getString2(14449));
        MapboxLogger.logW(str, sb2.toString());
        postPrepareRenderFrame(50L);
        return false;
    }

    private final boolean checkEglConfig() {
        if (!this.eglContextCreated) {
            if (!this.eglCore.prepareEgl()) {
                MapboxLogger.logE(this.TAG, StubApp.getString2(14450));
                this.renderNotSupported = true;
                return false;
            }
            this.eglContextCreated = true;
        }
        return true;
    }

    private final boolean checkEglContextCurrent() {
        if (this.eglCore.makeCurrent(this.eglSurface)) {
            return true;
        }
        MapboxLogger.logW(this.TAG, StubApp.getString2(14451));
        postPrepareRenderFrame(50L);
        return false;
    }

    private final boolean checkEglSurface(Surface surface) {
        if (!Intrinsics.areEqual(this.eglSurface, this.eglCore.getEglNoSurface())) {
            return true;
        }
        EGLSurface createWindowSurface = this.eglCore.createWindowSurface(surface);
        this.eglSurface = createWindowSurface;
        if (!Intrinsics.areEqual(createWindowSurface, this.eglCore.getEglNoSurface())) {
            return true;
        }
        MapboxLogger.logW(this.TAG, StubApp.getString2(14452));
        postPrepareRenderFrame(50L);
        return false;
    }

    private final void checkSurfaceSizeChanged() {
        if (this.sizeChanged) {
            this.mapboxRenderer.onSurfaceChanged(this.width, this.height);
            this.widgetRenderer.onSurfaceChanged(this.width, this.height);
            this.sizeChanged = false;
        }
    }

    private final void checkWidgetRender() {
        if (this.eglContextCreated && !this.widgetRenderCreated && this.widgetRenderer.hasWidgets()) {
            this.widgetRenderer.setSharedContext(this.eglCore.getEglContext());
            this.widgetRenderCreated = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroy$lambda$29$lambda$28$lambda$27(MapboxRenderThread this$0) {
        ReentrantLock reentrantLock;
        boolean z2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.surfaceProcessingLock.lock();
        boolean z10 = true;
        try {
            if (this$0.eglContextMadeCurrent) {
                z2 = true;
            } else {
                this$0.destroyCondition.signal();
                this$0.surfaceProcessingLock.unlock();
                z2 = false;
            }
            try {
                if (this$0.nativeRenderCreated) {
                    releaseAll$default(this$0, false, 1, null);
                }
                this$0.renderHandlerThread.clearRenderEventQueue();
                this$0.fpsManager.destroy();
                this$0.eglCore.clearRendererStateListeners$maps_sdk_release();
                this$0.mapboxRenderer.setMap$maps_sdk_release(null);
                this$0.renderHandlerThread.stop();
                if (z2) {
                    this$0.destroyCondition.signal();
                    this$0.surfaceProcessingLock.unlock();
                    return;
                }
                reentrantLock = this$0.surfaceProcessingLock;
                reentrantLock.lock();
                try {
                    this$0.createCondition.signal();
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    this$0.surfaceProcessingLock.lock();
                    try {
                        this$0.destroyCondition.signal();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                boolean z11 = z2;
                th = th;
                z10 = z11;
                if (z10) {
                    this$0.destroyCondition.signal();
                    this$0.surfaceProcessingLock.unlock();
                } else {
                    reentrantLock = this$0.surfaceProcessingLock;
                    reentrantLock.lock();
                    try {
                        this$0.createCondition.signal();
                        Unit unit2 = Unit.INSTANCE;
                        reentrantLock.unlock();
                        this$0.surfaceProcessingLock.lock();
                        try {
                            this$0.destroyCondition.signal();
                        } finally {
                        }
                    } finally {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void drainQueue(ConcurrentLinkedQueue<RenderEvent> originalQueue) {
        RenderEvent poll = originalQueue.poll();
        while (poll != null) {
            Runnable runnable = poll.getRunnable();
            if (runnable != null) {
                runnable.run();
            }
            poll = originalQueue.poll();
        }
    }

    private final void draw(long frameTimeNanos) {
        FpsManager fpsManager = this.fpsManager;
        RenderThreadStatsRecorder renderThreadStatsRecorder = this.renderThreadStatsRecorder;
        if (!fpsManager.preRender(frameTimeNanos, renderThreadStatsRecorder != null && renderThreadStatsRecorder.isRecording())) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        if (this.contextMode == ContextMode.SHARED) {
            GLES20.glClear(17664);
        }
        if (this.widgetRenderer.hasWidgets()) {
            if (this.widgetRenderer.getNeedRender()) {
                this.widgetRenderer.renderToFrameBuffer();
                this.eglCore.makeCurrent(this.eglSurface);
            }
            this.mapboxRenderer.render();
            resetGlState();
            if (this.widgetRenderer.hasTexture()) {
                this.widgetTextureRenderer.render(this.widgetRenderer.getTexture());
            }
        } else {
            this.mapboxRenderer.render();
        }
        drainQueue(this.renderEventQueue);
        this.fpsManager.postRender();
        if (this.needViewAnnotationSync && Intrinsics.areEqual(this.viewAnnotationMode, ViewAnnotationUpdateMode.MAP_SYNCHRONIZED)) {
            Choreographer.getInstance().postFrameCallback(this.swapBuffersFunc);
            GLES20.glFlush();
        } else {
            swapBuffers();
        }
        this.needViewAnnotationSync = false;
    }

    public static /* synthetic */ void getAwaitingNextVsync$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getEglContextMadeCurrent$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getEglSurface$maps_sdk_release$annotations() {
    }

    private final Handler getMainHandler() {
        return (Handler) this.mainHandler.getValue();
    }

    public static /* synthetic */ void getNonRenderEventQueue$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getPaused$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getRenderEventQueue$maps_sdk_release$annotations() {
    }

    private final boolean getRenderThreadPrepared() {
        boolean z2;
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            if (this.eglContextMadeCurrent) {
                if (this.nativeRenderCreated) {
                    z2 = true;
                    return z2;
                }
            }
            z2 = false;
            return z2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static /* synthetic */ void getRenderThreadStatsRecorder$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getSurface$maps_sdk_release$annotations() {
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceCreated$lambda$18$lambda$17$lambda$16(MapboxRenderThread this$0, Surface surface, int i3, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(surface, "$surface");
        this$0.processAndroidSurface$maps_sdk_release(surface, i3, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceDestroyed$lambda$14$lambda$13$lambda$12(MapboxRenderThread this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.awaitingNextVsync = false;
        Choreographer.getInstance().removeFrameCallback(this$0);
        ReentrantLock reentrantLock = this$0.surfaceProcessingLock;
        reentrantLock.lock();
        try {
            if (this$0.nativeRenderCreated && (this$0.mapboxRenderer instanceof MapboxTextureViewRenderer)) {
                releaseAll$default(this$0, false, 1, null);
                this$0.renderHandlerThread.clearRenderEventQueue();
            } else {
                this$0.releaseEglSurface();
            }
            this$0.fpsManager.onSurfaceDestroyed();
            this$0.destroyCondition.signal();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceSizeChanged$lambda$10(MapboxRenderThread this$0, int i3, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.width = i3;
        this$0.height = i10;
        this$0.sizeChanged = true;
        prepareRenderFrame$default(this$0, false, 1, null);
    }

    private final void postNonRenderEvent(RenderEvent renderEvent, long delayMillis) {
        if (this.awaitingNextVsync) {
            this.nonRenderEventQueue.add(renderEvent);
        } else {
            this.renderHandlerThread.postDelayed(new com.even.translate.a(5, this, renderEvent), delayMillis);
        }
    }

    public static /* synthetic */ void postNonRenderEvent$default(MapboxRenderThread mapboxRenderThread, RenderEvent renderEvent, long j, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            j = 0;
        }
        mapboxRenderThread.postNonRenderEvent(renderEvent, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postNonRenderEvent$lambda$23(MapboxRenderThread this$0, RenderEvent renderEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(renderEvent, "$renderEvent");
        if (this$0.getRenderThreadPrepared()) {
            Runnable runnable = renderEvent.getRunnable();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (this$0.paused) {
            this$0.nonRenderEventQueue.add(renderEvent);
        } else {
            MapboxLogger.logW(this$0.TAG, StubApp.getString2(14453));
            this$0.postNonRenderEvent(renderEvent, 50L);
        }
    }

    private final void postPrepareRenderFrame(long delayMillis) {
        this.renderHandlerThread.postDelayed(this.prepareRenderFrameRunnable, delayMillis);
    }

    public static /* synthetic */ void postPrepareRenderFrame$default(MapboxRenderThread mapboxRenderThread, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = 0;
        }
        mapboxRenderThread.postPrepareRenderFrame(j);
    }

    private final void prepareRenderFrame(boolean creatingSurface) {
        if (!this.awaitingNextVsync || creatingSurface) {
            if ((this.renderNotSupported || this.paused) && !creatingSurface) {
                MapboxLogger.logI(this.TAG, StubApp.getString2(14454) + this.renderNotSupported + StubApp.getString2(14455) + this.paused + ')');
                return;
            }
            if (creatingSurface || !getRenderThreadPrepared()) {
                boolean platformTracingEnabled = MapboxTracing.INSTANCE.getPlatformTracingEnabled();
                String string2 = StubApp.getString2(14456);
                String string22 = StubApp.getString2(14457);
                if (platformTracingEnabled) {
                    Trace.beginSection(StubApp.getString2(14458));
                    try {
                        if (!setUpRenderThread(creatingSurface)) {
                            String str = this.TAG;
                            StringBuilder sb2 = new StringBuilder(string22);
                            sb2.append(creatingSurface);
                            sb2.append(string2);
                            sb2.append(!getRenderThreadPrepared());
                            sb2.append(')');
                            MapboxLogger.logI(str, sb2.toString());
                        }
                    } finally {
                        Trace.endSection();
                    }
                } else if (!setUpRenderThread(creatingSurface)) {
                    String str2 = this.TAG;
                    StringBuilder sb3 = new StringBuilder(string22);
                    sb3.append(creatingSurface);
                    sb3.append(string2);
                    sb3.append(!getRenderThreadPrepared());
                    sb3.append(')');
                    MapboxLogger.logI(str2, sb3.toString());
                }
            }
            checkWidgetRender();
            checkSurfaceSizeChanged();
            Choreographer.getInstance().postFrameCallback(this);
            this.awaitingNextVsync = true;
        }
    }

    public static /* synthetic */ void prepareRenderFrame$default(MapboxRenderThread mapboxRenderThread, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        mapboxRenderThread.prepareRenderFrame(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareRenderFrameRunnable$lambda$4(MapboxRenderThread this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        prepareRenderFrame$default(this$0, false, 1, null);
    }

    private final void releaseAll(boolean tryRecreate) {
        boolean platformTracingEnabled = MapboxTracing.INSTANCE.getPlatformTracingEnabled();
        String string2 = StubApp.getString2(14459);
        if (!platformTracingEnabled) {
            this.mapboxRenderer.destroyRenderer();
            MapboxLogger.logI(this.TAG, string2);
            this.renderEventQueue.clear();
            this.nonRenderEventQueue.clear();
            setNativeRenderCreated(false);
            releaseEglSurface();
            if (this.eglContextCreated) {
                this.eglCore.release();
            }
            this.eglContextCreated = false;
            if (tryRecreate) {
                setUpRenderThread(true);
                return;
            }
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
                return;
            }
            return;
        }
        Trace.beginSection(StubApp.getString2(14460));
        try {
            this.mapboxRenderer.destroyRenderer();
            MapboxLogger.logI(this.TAG, string2);
            this.renderEventQueue.clear();
            this.nonRenderEventQueue.clear();
            setNativeRenderCreated(false);
            releaseEglSurface();
            if (this.eglContextCreated) {
                this.eglCore.release();
            }
            this.eglContextCreated = false;
            if (tryRecreate) {
                setUpRenderThread(true);
            } else {
                Surface surface2 = this.surface;
                if (surface2 != null) {
                    surface2.release();
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static /* synthetic */ void releaseAll$default(MapboxRenderThread mapboxRenderThread, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        mapboxRenderThread.releaseAll(z2);
    }

    private final void releaseEglSurface() {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            this.widgetTextureRenderer.release();
            this.eglCore.releaseSurface(this.eglSurface);
            setEglContextMadeCurrent$maps_sdk_release(false);
            this.eglSurface = this.eglCore.getEglNoSurface();
            this.widgetRenderCreated = false;
            this.widgetRenderer.release();
            return;
        }
        Trace.beginSection(StubApp.getString2(14461));
        try {
            this.widgetTextureRenderer.release();
            this.eglCore.releaseSurface(this.eglSurface);
            setEglContextMadeCurrent$maps_sdk_release(false);
            this.eglSurface = this.eglCore.getEglNoSurface();
            this.widgetRenderCreated = false;
            this.widgetRenderer.release();
        } finally {
            Trace.endSection();
        }
    }

    private final void renderPreparedGuardedRun(final Function0<Unit> block) {
        if (getRenderThreadPrepared()) {
            block.invoke();
            return;
        }
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            MapboxLogger.logI(this.TAG, StubApp.getString2(14462));
            this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.MapboxRenderThread$renderPreparedGuardedRun$1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean upRenderThread;
                    String str;
                    String str2;
                    upRenderThread = MapboxRenderThread.this.setUpRenderThread(true);
                    if (!upRenderThread) {
                        str = MapboxRenderThread.this.TAG;
                        MapboxLogger.logI(str, StubApp.getString2(14444));
                    } else {
                        block.invoke();
                        str2 = MapboxRenderThread.this.TAG;
                        MapboxLogger.logI(str2, StubApp.getString2(14443));
                    }
                }
            });
        } else {
            if (this.paused) {
                return;
            }
            String str = this.TAG;
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(14463));
            Surface surface2 = this.surface;
            sb2.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
            sb2.append(StubApp.getString2(14464));
            MapboxLogger.logI(str, sb2.toString());
        }
    }

    private final void resetGlState() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        GLES20.glBlendEquation(32774);
        GLES20.glDisable(2960);
        GLES20.glDisable(2929);
        GLES20.glUseProgram(0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleThreadServiceTypeReset$lambda$24(MapboxRenderThread this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MapboxLogger.logI(this$0.TAG, StubApp.getString2(14465) + Thread.currentThread().getName() + StubApp.getString2(14466));
        this$0.mapboxRenderer.resetThreadServiceType();
    }

    private final void setNativeRenderCreated(boolean z2) {
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            this.nativeRenderCreated = z2;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setScreenRefreshRate$lambda$15(MapboxRenderThread this$0, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.fpsManager.setScreenRefreshRate(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setUpRenderThread(boolean creatingSurface) {
        String string2 = StubApp.getString2(14467);
        ReentrantLock reentrantLock = this.surfaceProcessingLock;
        reentrantLock.lock();
        try {
            try {
                MapboxLogger.logI(this.TAG, string2 + creatingSurface + StubApp.getString2("14468") + this.nativeRenderCreated + StubApp.getString2("14469") + this.eglContextMadeCurrent + StubApp.getString2("14470") + this.eglContextCreated + StubApp.getString2("14471") + this.paused);
                boolean checkEglConfig = checkEglConfig();
                boolean checkAndroidSurface = checkAndroidSurface();
                if (checkEglConfig && checkAndroidSurface) {
                    if (creatingSurface) {
                        this.eglCore.makeNothingCurrent();
                    }
                    Surface surface = this.surface;
                    Intrinsics.checkNotNull(surface);
                    if (checkEglSurface(surface)) {
                        setEglContextMadeCurrent$maps_sdk_release(checkEglContextCurrent());
                        if (this.eglContextMadeCurrent) {
                            if (!this.nativeRenderCreated) {
                                setNativeRenderCreated(true);
                                this.mapboxRenderer.createRenderer();
                                MapboxLogger.logI(this.TAG, StubApp.getString2("14472"));
                                this.mapboxRenderer.onSurfaceChanged(this.width, this.height);
                            }
                            this.createCondition.signal();
                            return true;
                        }
                    }
                }
                this.createCondition.signal();
                reentrantLock.unlock();
                return false;
            } catch (Throwable th) {
                this.createCondition.signal();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUserRefreshRate$lambda$19(MapboxRenderThread this$0, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.fpsManager.setUserRefreshRate(i3);
    }

    private final void swapBuffers() {
        int swapBuffers = this.eglCore.swapBuffers(this.eglSurface);
        if (swapBuffers != 12288) {
            if (swapBuffers == 12302) {
                MapboxLogger.logW(this.TAG, StubApp.getString2(14475));
                releaseAll(true);
                return;
            }
            MapboxLogger.logW(this.TAG, StubApp.getString2(14473) + swapBuffers + StubApp.getString2(14474));
            releaseEglSurface();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swapBuffersFunc$lambda$6(MapboxRenderThread this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.swapBuffers();
    }

    private final void trace(String sectionName, Function0<Unit> section) {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            section.invoke();
            return;
        }
        Trace.beginSection(StubApp.getString2(14476) + sectionName);
        try {
            section.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            Trace.endSection();
            InlineMarker.finallyEnd(1);
        }
    }

    public final void addWidget(Widget widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        this.widgetRenderer.addWidget(widget);
    }

    public final void destroy$maps_sdk_release() {
        ReentrantLock reentrantLock;
        int i3 = 1;
        boolean platformTracingEnabled = MapboxTracing.INSTANCE.getPlatformTracingEnabled();
        String string2 = StubApp.getString2(14477);
        String string22 = StubApp.getString2(14478);
        String string23 = StubApp.getString2(14479);
        String string24 = StubApp.getString2(14480);
        if (!platformTracingEnabled) {
            MapboxLogger.logI(this.TAG, string24);
            reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new b(this, i3));
                    MapboxLogger.logI(this.TAG, string23);
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, string22);
                } else {
                    MapboxLogger.logI(this.TAG, string2);
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return;
            } finally {
            }
        }
        Trace.beginSection(StubApp.getString2(14481));
        try {
            MapboxLogger.logI(this.TAG, string24);
            reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new b(this, i3));
                    MapboxLogger.logI(this.TAG, string23);
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, string22);
                } else {
                    MapboxLogger.logI(this.TAG, string2);
                }
                Unit unit2 = Unit.INSTANCE;
                reentrantLock.unlock();
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        RenderThreadStatsRecorder renderThreadStatsRecorder;
        RenderThreadStatsRecorder renderThreadStatsRecorder2;
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            RenderThreadStatsRecorder renderThreadStatsRecorder3 = this.renderThreadStatsRecorder;
            long elapsedRealtimeNanos = (renderThreadStatsRecorder3 == null || !renderThreadStatsRecorder3.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (getRenderThreadPrepared() && !this.paused) {
                draw(frameTimeNanos);
            }
            this.awaitingNextVsync = false;
            drainQueue(this.nonRenderEventQueue);
            RenderThreadStatsRecorder renderThreadStatsRecorder4 = this.renderThreadStatsRecorder;
            long elapsedRealtimeNanos2 = (renderThreadStatsRecorder4 == null || !renderThreadStatsRecorder4.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (elapsedRealtimeNanos == 0 || elapsedRealtimeNanos2 == 0 || (renderThreadStatsRecorder = this.renderThreadStatsRecorder) == null) {
                return;
            }
            renderThreadStatsRecorder.addFrameStats$maps_sdk_release((elapsedRealtimeNanos2 - elapsedRealtimeNanos) / 1000000.0d, this.fpsManager.getSkippedNow());
            return;
        }
        Trace.beginSection(StubApp.getString2(14482));
        try {
            RenderThreadStatsRecorder renderThreadStatsRecorder5 = this.renderThreadStatsRecorder;
            long elapsedRealtimeNanos3 = (renderThreadStatsRecorder5 == null || !renderThreadStatsRecorder5.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (getRenderThreadPrepared() && !this.paused) {
                draw(frameTimeNanos);
            }
            this.awaitingNextVsync = false;
            drainQueue(this.nonRenderEventQueue);
            RenderThreadStatsRecorder renderThreadStatsRecorder6 = this.renderThreadStatsRecorder;
            long elapsedRealtimeNanos4 = (renderThreadStatsRecorder6 == null || !renderThreadStatsRecorder6.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (elapsedRealtimeNanos3 != 0 && elapsedRealtimeNanos4 != 0 && (renderThreadStatsRecorder2 = this.renderThreadStatsRecorder) != null) {
                renderThreadStatsRecorder2.addFrameStats$maps_sdk_release((elapsedRealtimeNanos4 - elapsedRealtimeNanos3) / 1000000.0d, this.fpsManager.getSkippedNow());
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: getAwaitingNextVsync$maps_sdk_release, reason: from getter */
    public final boolean getAwaitingNextVsync() {
        return this.awaitingNextVsync;
    }

    /* renamed from: getEglContextMadeCurrent$maps_sdk_release, reason: from getter */
    public final boolean getEglContextMadeCurrent() {
        return this.eglContextMadeCurrent;
    }

    /* renamed from: getEglCore$maps_sdk_release, reason: from getter */
    public final EGLCore getEglCore() {
        return this.eglCore;
    }

    /* renamed from: getEglSurface$maps_sdk_release, reason: from getter */
    public final EGLSurface getEglSurface() {
        return this.eglSurface;
    }

    public final OnFpsChangedListener getFpsChangedListener$maps_sdk_release() {
        return (OnFpsChangedListener) this.fpsChangedListener.getValue(this, $$delegatedProperties[0]);
    }

    /* renamed from: getNeedViewAnnotationSync$maps_sdk_release, reason: from getter */
    public final boolean getNeedViewAnnotationSync() {
        return this.needViewAnnotationSync;
    }

    public final ConcurrentLinkedQueue<RenderEvent> getNonRenderEventQueue$maps_sdk_release() {
        return this.nonRenderEventQueue;
    }

    /* renamed from: getPaused$maps_sdk_release, reason: from getter */
    public final boolean getPaused() {
        return this.paused;
    }

    public final ConcurrentLinkedQueue<RenderEvent> getRenderEventQueue$maps_sdk_release() {
        return this.renderEventQueue;
    }

    /* renamed from: getRenderHandlerThread$maps_sdk_release, reason: from getter */
    public final RenderHandlerThread getRenderHandlerThread() {
        return this.renderHandlerThread;
    }

    /* renamed from: getRenderThreadStatsRecorder$maps_sdk_release, reason: from getter */
    public final RenderThreadStatsRecorder getRenderThreadStatsRecorder() {
        return this.renderThreadStatsRecorder;
    }

    /* renamed from: getSurface$maps_sdk_release, reason: from getter */
    public final Surface getSurface() {
        return this.surface;
    }

    /* renamed from: getViewAnnotationMode$maps_sdk_release, reason: from getter */
    public final ViewAnnotationUpdateMode getViewAnnotationMode() {
        return this.viewAnnotationMode;
    }

    public final void onSurfaceCreated(final Surface surface, final int width, final int height) {
        ReentrantLock reentrantLock;
        Intrinsics.checkNotNullParameter(surface, "surface");
        boolean platformTracingEnabled = MapboxTracing.INSTANCE.getPlatformTracingEnabled();
        String string2 = StubApp.getString2(14483);
        String string22 = StubApp.getString2(14484);
        String string23 = StubApp.getString2(14485);
        String string24 = StubApp.getString2(14486);
        if (!platformTracingEnabled) {
            MapboxLogger.logI(this.TAG, string24);
            reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            MapboxRenderThread.onSurfaceCreated$lambda$18$lambda$17$lambda$16(MapboxRenderThread.this, surface, width, height);
                        }
                    });
                    MapboxLogger.logI(this.TAG, string23);
                    this.createCondition.await();
                    MapboxLogger.logI(this.TAG, string22);
                } else {
                    MapboxLogger.logI(this.TAG, string2);
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return;
            } finally {
            }
        }
        Trace.beginSection(StubApp.getString2(14487));
        try {
            MapboxLogger.logI(this.TAG, string24);
            reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            MapboxRenderThread.onSurfaceCreated$lambda$18$lambda$17$lambda$16(MapboxRenderThread.this, surface, width, height);
                        }
                    });
                    MapboxLogger.logI(this.TAG, string23);
                    this.createCondition.await();
                    MapboxLogger.logI(this.TAG, string22);
                } else {
                    MapboxLogger.logI(this.TAG, string2);
                }
                Unit unit2 = Unit.INSTANCE;
                reentrantLock.unlock();
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void onSurfaceDestroyed() {
        ReentrantLock reentrantLock;
        int i3 = 2;
        boolean platformTracingEnabled = MapboxTracing.INSTANCE.getPlatformTracingEnabled();
        String string2 = StubApp.getString2(14488);
        String string22 = StubApp.getString2(14489);
        String string23 = StubApp.getString2(14490);
        String string24 = StubApp.getString2(14491);
        if (!platformTracingEnabled) {
            MapboxLogger.logI(this.TAG, string24);
            reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new b(this, i3));
                    MapboxLogger.logI(this.TAG, string23);
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, string22);
                } else {
                    MapboxLogger.logI(this.TAG, string2);
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return;
            } finally {
            }
        }
        Trace.beginSection(StubApp.getString2(14492));
        try {
            MapboxLogger.logI(this.TAG, string24);
            reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new b(this, i3));
                    MapboxLogger.logI(this.TAG, string23);
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, string22);
                } else {
                    MapboxLogger.logI(this.TAG, string2);
                }
                Unit unit2 = Unit.INSTANCE;
                reentrantLock.unlock();
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void onSurfaceSizeChanged(int width, int height) {
        if (this.width == width && this.height == height) {
            return;
        }
        this.renderHandlerThread.post(new com.mapbox.maps.c(this, width, height, 1));
    }

    public final void pause() {
        this.paused = true;
        MapboxLogger.logI(this.TAG, StubApp.getString2(14493));
    }

    public final void processAndroidSurface$maps_sdk_release(Surface surface, int width, int height) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (!Intrinsics.areEqual(this.surface, surface)) {
            if (this.surface != null) {
                MapboxLogger.logI(this.TAG, StubApp.getString2(14494));
                releaseAll$default(this, false, 1, null);
            }
            this.surface = surface;
        }
        this.width = width;
        this.height = height;
        this.widgetRenderer.onSurfaceChanged(width, height);
        prepareRenderFrame(true);
    }

    public final void queueRenderEvent(RenderEvent renderEvent) {
        Intrinsics.checkNotNullParameter(renderEvent, "renderEvent");
        if (!renderEvent.getNeedRender()) {
            postNonRenderEvent$default(this, renderEvent, 0L, 2, null);
            return;
        }
        if (renderEvent.getRunnable() != null) {
            this.renderEventQueue.add(renderEvent);
        }
        if (getRenderThreadPrepared()) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            MapboxLogger.logI(this.TAG, StubApp.getString2(14462));
            this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.MapboxRenderThread$queueRenderEvent$$inlined$renderPreparedGuardedRun$1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean upRenderThread;
                    String str;
                    String str2;
                    upRenderThread = MapboxRenderThread.this.setUpRenderThread(true);
                    if (!upRenderThread) {
                        str = MapboxRenderThread.this.TAG;
                        MapboxLogger.logI(str, StubApp.getString2(14444));
                    } else {
                        MapboxRenderThread.postPrepareRenderFrame$default(this, 0L, 1, null);
                        str2 = MapboxRenderThread.this.TAG;
                        MapboxLogger.logI(str2, StubApp.getString2(14443));
                    }
                }
            });
        } else {
            if (this.paused) {
                return;
            }
            String str = this.TAG;
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(14463));
            Surface surface2 = this.surface;
            sb2.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
            sb2.append(StubApp.getString2(14464));
            MapboxLogger.logI(str, sb2.toString());
        }
    }

    public final boolean removeWidget(Widget widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        return this.widgetRenderer.removeWidget(widget);
    }

    public final void resume() {
        this.paused = false;
        String str = this.TAG;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14495));
        sb2.append(getRenderThreadPrepared());
        sb2.append(StubApp.getString2(14496));
        Surface surface = this.surface;
        sb2.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        MapboxLogger.logI(str, sb2.toString());
        if (getRenderThreadPrepared()) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        Surface surface2 = this.surface;
        if (surface2 != null && surface2.isValid()) {
            MapboxLogger.logI(this.TAG, StubApp.getString2(14462));
            this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.MapboxRenderThread$resume$$inlined$renderPreparedGuardedRun$1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean upRenderThread;
                    String str2;
                    String str3;
                    upRenderThread = MapboxRenderThread.this.setUpRenderThread(true);
                    if (!upRenderThread) {
                        str2 = MapboxRenderThread.this.TAG;
                        MapboxLogger.logI(str2, StubApp.getString2(14444));
                    } else {
                        MapboxRenderThread.postPrepareRenderFrame$default(this, 0L, 1, null);
                        str3 = MapboxRenderThread.this.TAG;
                        MapboxLogger.logI(str3, StubApp.getString2(14443));
                    }
                }
            });
        } else {
            if (this.paused) {
                return;
            }
            String str2 = this.TAG;
            StringBuilder sb3 = new StringBuilder(StubApp.getString2(14463));
            Surface surface3 = this.surface;
            sb3.append(surface3 != null ? Boolean.valueOf(surface3.isValid()) : null);
            sb3.append(StubApp.getString2(14464));
            MapboxLogger.logI(str2, sb3.toString());
        }
    }

    public final void scheduleThreadServiceTypeReset() {
        MapboxLogger.logI(this.TAG, StubApp.getString2(14497));
        getMainHandler().postDelayed(new b(this, 3), 300L);
    }

    public final void setAwaitingNextVsync$maps_sdk_release(boolean z2) {
        this.awaitingNextVsync = z2;
    }

    public final void setEglContextMadeCurrent$maps_sdk_release(boolean z2) {
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            this.eglContextMadeCurrent = z2;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setEglSurface$maps_sdk_release(EGLSurface eGLSurface) {
        Intrinsics.checkNotNullParameter(eGLSurface, "<set-?>");
        this.eglSurface = eGLSurface;
    }

    public final void setFpsChangedListener$maps_sdk_release(OnFpsChangedListener onFpsChangedListener) {
        this.fpsChangedListener.setValue(this, $$delegatedProperties[0], onFpsChangedListener);
    }

    public final void setNeedViewAnnotationSync$maps_sdk_release(boolean z2) {
        this.needViewAnnotationSync = z2;
    }

    public final void setPaused$maps_sdk_release(boolean z2) {
        this.paused = z2;
    }

    public final void setRenderThreadStatsRecorder$maps_sdk_release(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        this.renderThreadStatsRecorder = renderThreadStatsRecorder;
    }

    public final void setScreenRefreshRate(int refreshRate) {
        this.renderHandlerThread.post(new a(this, refreshRate, 1));
    }

    public final void setSurface$maps_sdk_release(Surface surface) {
        this.surface = surface;
    }

    public final void setUserRefreshRate(int fps) {
        this.renderHandlerThread.post(new a(this, fps, 0));
    }

    public final void setViewAnnotationMode$maps_sdk_release(ViewAnnotationUpdateMode viewAnnotationUpdateMode) {
        Intrinsics.checkNotNullParameter(viewAnnotationUpdateMode, "<set-?>");
        this.viewAnnotationMode = viewAnnotationUpdateMode;
    }

    public MapboxRenderThread(MapboxRenderer mapboxRenderer, MapboxWidgetRenderer mapboxWidgetRenderer, RenderHandlerThread handlerThread, EGLCore eglCore, FpsManager fpsManager, TextureRenderer widgetTextureRenderer, ReentrantLock surfaceProcessingLock, Condition createCondition, Condition destroyCondition) {
        Intrinsics.checkNotNullParameter(mapboxRenderer, "mapboxRenderer");
        Intrinsics.checkNotNullParameter(mapboxWidgetRenderer, "mapboxWidgetRenderer");
        Intrinsics.checkNotNullParameter(handlerThread, "handlerThread");
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        Intrinsics.checkNotNullParameter(fpsManager, "fpsManager");
        Intrinsics.checkNotNullParameter(widgetTextureRenderer, "widgetTextureRenderer");
        Intrinsics.checkNotNullParameter(surfaceProcessingLock, "surfaceProcessingLock");
        Intrinsics.checkNotNullParameter(createCondition, "createCondition");
        Intrinsics.checkNotNullParameter(destroyCondition, "destroyCondition");
        this.renderEventQueue = new ConcurrentLinkedQueue<>();
        this.nonRenderEventQueue = new ConcurrentLinkedQueue<>();
        this.mainHandler = LazyKt.lazy(MapboxRenderThread$mainHandler$2.INSTANCE);
        this.renderThreadPreparedLock = new ReentrantLock();
        Delegates delegates = Delegates.INSTANCE;
        final Object obj = null;
        this.fpsChangedListener = new ObservableProperty<OnFpsChangedListener>(obj) { // from class: com.mapbox.maps.renderer.MapboxRenderThread$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, OnFpsChangedListener oldValue, OnFpsChangedListener newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                OnFpsChangedListener onFpsChangedListener = newValue;
                if (Intrinsics.areEqual(oldValue, onFpsChangedListener)) {
                    return;
                }
                MapboxRenderThread mapboxRenderThread = this;
                MapboxRenderThread.postNonRenderEvent$default(mapboxRenderThread, new RenderEvent(new MapboxRenderThread$fpsChangedListener$2$1(mapboxRenderThread, onFpsChangedListener), false), 0L, 2, null);
            }
        };
        this.viewAnnotationMode = ViewAnnotationManager.DEFAULT_UPDATE_MODE;
        this.prepareRenderFrameRunnable = new b(this, 0);
        this.swapBuffersFunc = new Choreographer.FrameCallback() { // from class: com.mapbox.maps.renderer.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                MapboxRenderThread.swapBuffersFunc$lambda$6(MapboxRenderThread.this, j);
            }
        };
        this.translucentSurface = false;
        this.mapboxRenderer = mapboxRenderer;
        this.widgetRenderer = mapboxWidgetRenderer;
        this.renderHandlerThread = handlerThread;
        this.eglCore = eglCore;
        this.fpsManager = fpsManager;
        this.widgetTextureRenderer = widgetTextureRenderer;
        this.eglSurface = eglCore.getEglNoSurface();
        this.contextMode = ContextMode.UNIQUE;
        this.surfaceProcessingLock = surfaceProcessingLock;
        this.createCondition = createCondition;
        this.destroyCondition = destroyCondition;
        this.TAG = "";
    }
}
