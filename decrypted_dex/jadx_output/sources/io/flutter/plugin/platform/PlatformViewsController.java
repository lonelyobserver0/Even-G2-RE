package io.flutter.plugin.platform;

import A2.g;
import B0.o;
import Xa.C0361a;
import Xa.E;
import Xa.h;
import Xa.i;
import Xa.j;
import Xa.q;
import Xa.r;
import a4.f;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import cb.C0584b;
import com.stub.StubApp;
import gb.D;
import gb.F;
import gb.G;
import gb.InterfaceC0971C;
import gb.M;
import i2.u;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p0.AbstractC1482f;
import sb.C1644e0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PlatformViewsController implements PlatformViewsAccessibilityDelegate {
    private static final String TAG = StubApp.getString2(18768);
    private static Class[] VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY = {SurfaceView.class};
    private static boolean enableImageRenderTarget = true;
    private static boolean enableSurfaceProducerRenderTarget = true;
    private C0361a androidTouchProcessor;
    private Context context;
    private r flutterView;
    private final E motionEventTracker;
    private M platformViewsChannel;
    private TextInputPlugin textInputPlugin;
    private io.flutter.view.r textureRegistry;
    private int nextOverlayLayerId = 0;
    private boolean flutterViewConvertedToImageView = false;
    private boolean synchronizeToNativeViewHierarchy = true;
    private boolean usesSoftwareRendering = false;
    private final G channelHandler = new AnonymousClass1();
    private final PlatformViewRegistryImpl registry = new PlatformViewRegistryImpl();
    final HashMap<Integer, VirtualDisplayController> vdControllers = new HashMap<>();
    private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
    final HashMap<Context, View> contextToEmbeddedView = new HashMap<>();
    private final SparseArray<PlatformOverlayView> overlayLayerViews = new SparseArray<>();
    private final HashSet<Integer> currentFrameUsedOverlayLayerIds = new HashSet<>();
    private final HashSet<Integer> currentFrameUsedPlatformViewIds = new HashSet<>();
    private final SparseArray<PlatformViewWrapper> viewWrappers = new SparseArray<>();
    private final SparseArray<PlatformView> platformViews = new SparseArray<>();
    private final SparseArray<C0584b> platformViewParent = new SparseArray<>();

    /* renamed from: io.flutter.plugin.platform.PlatformViewsController$1, reason: invalid class name */
    public class AnonymousClass1 implements G {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$resize$0(VirtualDisplayController virtualDisplayController, float f10, InterfaceC0971C interfaceC0971C) {
            PlatformViewsController.this.unlockInputConnection(virtualDisplayController);
            if (PlatformViewsController.this.context != null) {
                f10 = PlatformViewsController.this.getDisplayDensity();
            }
            int logicalPixels = PlatformViewsController.this.toLogicalPixels(virtualDisplayController.getRenderTargetWidth(), f10);
            int logicalPixels2 = PlatformViewsController.this.toLogicalPixels(virtualDisplayController.getRenderTargetHeight(), f10);
            MethodChannel.Result result = ((g) interfaceC0971C).f101b;
            HashMap hashMap = new HashMap();
            hashMap.put(StubApp.getString2(1650), Double.valueOf(logicalPixels));
            hashMap.put(StubApp.getString2(1651), Double.valueOf(logicalPixels2));
            result.success(hashMap);
        }

        @Override // gb.G
        public void clearFocus(int i3) {
            View view;
            boolean usesVirtualDisplay = PlatformViewsController.this.usesVirtualDisplay(i3);
            String string2 = StubApp.getString2(18768);
            if (usesVirtualDisplay) {
                view = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i3)).getView();
            } else {
                PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i3);
                if (platformView == null) {
                    h.B(i3, StubApp.getString2(18769), string2);
                    return;
                }
                view = platformView.getView();
            }
            if (view == null) {
                h.B(i3, StubApp.getString2(18770), string2);
            } else {
                view.clearFocus();
            }
        }

        @Override // gb.G
        public void createForPlatformViewLayer(D d8) {
            PlatformViewsController.this.enforceMinimumAndroidApiVersion(19);
            PlatformViewsController.this.ensureValidRequest(d8);
            PlatformViewsController.this.configureForHybridComposition(PlatformViewsController.this.createPlatformView(d8, false), d8);
        }

        @Override // gb.G
        public long createForTextureLayer(D d8) {
            PlatformViewsController.this.ensureValidRequest(d8);
            int i3 = d8.f14246a;
            if (PlatformViewsController.this.viewWrappers.get(i3) != null) {
                throw new IllegalStateException(u.p(i3, StubApp.getString2(18774)));
            }
            if (PlatformViewsController.this.textureRegistry == null) {
                throw new IllegalStateException(u.p(i3, StubApp.getString2(18773)));
            }
            if (PlatformViewsController.this.flutterView == null) {
                throw new IllegalStateException(u.p(i3, StubApp.getString2(18772)));
            }
            PlatformView createPlatformView = PlatformViewsController.this.createPlatformView(d8, true);
            View view = createPlatformView.getView();
            if (view.getParent() != null) {
                throw new IllegalStateException(StubApp.getString2(18771));
            }
            if (f.w(view, new C1644e0(PlatformViewsController.VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY, 3))) {
                if (d8.f14253h == 2) {
                    PlatformViewsController.this.configureForHybridComposition(createPlatformView, d8);
                    return -2L;
                }
                if (!PlatformViewsController.this.usesSoftwareRendering) {
                    return PlatformViewsController.this.configureForVirtualDisplay(createPlatformView, d8);
                }
            }
            return PlatformViewsController.this.configureForTextureLayerComposition(createPlatformView, d8);
        }

        @Override // gb.G
        public void dispose(int i3) {
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i3);
            String string2 = StubApp.getString2(18768);
            if (platformView == null) {
                h.B(i3, StubApp.getString2(18775), string2);
                return;
            }
            if (platformView.getView() != null) {
                View view = platformView.getView();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            PlatformViewsController.this.platformViews.remove(i3);
            try {
                platformView.dispose();
            } catch (RuntimeException e10) {
                Log.e(string2, StubApp.getString2(18776), e10);
            }
            if (PlatformViewsController.this.usesVirtualDisplay(i3)) {
                VirtualDisplayController virtualDisplayController = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i3));
                View view2 = virtualDisplayController.getView();
                if (view2 != null) {
                    PlatformViewsController.this.contextToEmbeddedView.remove(view2.getContext());
                }
                virtualDisplayController.dispose();
                PlatformViewsController.this.vdControllers.remove(Integer.valueOf(i3));
                return;
            }
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i3);
            if (platformViewWrapper != null) {
                platformViewWrapper.removeAllViews();
                platformViewWrapper.release();
                platformViewWrapper.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup2 = (ViewGroup) platformViewWrapper.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(platformViewWrapper);
                }
                PlatformViewsController.this.viewWrappers.remove(i3);
                return;
            }
            C0584b c0584b = (C0584b) PlatformViewsController.this.platformViewParent.get(i3);
            if (c0584b != null) {
                c0584b.removeAllViews();
                c0584b.a();
                ViewGroup viewGroup3 = (ViewGroup) c0584b.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(c0584b);
                }
                PlatformViewsController.this.platformViewParent.remove(i3);
            }
        }

        @Override // gb.G
        public void offset(int i3, double d8, double d10) {
            if (PlatformViewsController.this.usesVirtualDisplay(i3)) {
                return;
            }
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i3);
            if (platformViewWrapper == null) {
                h.B(i3, StubApp.getString2(18777), StubApp.getString2(18768));
                return;
            }
            int physicalPixels = PlatformViewsController.this.toPhysicalPixels(d8);
            int physicalPixels2 = PlatformViewsController.this.toPhysicalPixels(d10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
            layoutParams.topMargin = physicalPixels;
            layoutParams.leftMargin = physicalPixels2;
            platformViewWrapper.setLayoutParams(layoutParams);
        }

        @Override // gb.G
        public void onTouch(F f10) {
            int i3 = f10.f14258a;
            float f11 = PlatformViewsController.this.context.getResources().getDisplayMetrics().density;
            if (PlatformViewsController.this.usesVirtualDisplay(i3)) {
                PlatformViewsController.this.vdControllers.get(Integer.valueOf(i3)).dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f11, f10, true));
                return;
            }
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i3);
            String string2 = StubApp.getString2(18768);
            if (platformView == null) {
                h.B(i3, StubApp.getString2(18778), string2);
                return;
            }
            View view = platformView.getView();
            if (view == null) {
                h.B(i3, StubApp.getString2(18779), string2);
            } else {
                view.dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f11, f10, false));
            }
        }

        @Override // gb.G
        public void resize(gb.E e10, final InterfaceC0971C interfaceC0971C) {
            int physicalPixels = PlatformViewsController.this.toPhysicalPixels(e10.f14256b);
            int physicalPixels2 = PlatformViewsController.this.toPhysicalPixels(e10.f14257c);
            PlatformViewsController platformViewsController = PlatformViewsController.this;
            int i3 = e10.f14255a;
            if (platformViewsController.usesVirtualDisplay(i3)) {
                final float displayDensity = PlatformViewsController.this.getDisplayDensity();
                final VirtualDisplayController virtualDisplayController = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i3));
                PlatformViewsController.this.lockInputConnection(virtualDisplayController);
                virtualDisplayController.resize(physicalPixels, physicalPixels2, new Runnable() { // from class: io.flutter.plugin.platform.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlatformViewsController.AnonymousClass1.this.lambda$resize$0(virtualDisplayController, displayDensity, interfaceC0971C);
                    }
                });
                return;
            }
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i3);
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i3);
            if (platformView == null || platformViewWrapper == null) {
                h.B(i3, StubApp.getString2(18780), StubApp.getString2(18768));
                return;
            }
            if (physicalPixels > platformViewWrapper.getRenderTargetWidth() || physicalPixels2 > platformViewWrapper.getRenderTargetHeight()) {
                platformViewWrapper.resizeRenderTarget(physicalPixels, physicalPixels2);
            }
            ViewGroup.LayoutParams layoutParams = platformViewWrapper.getLayoutParams();
            layoutParams.width = physicalPixels;
            layoutParams.height = physicalPixels2;
            platformViewWrapper.setLayoutParams(layoutParams);
            View view = platformView.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = physicalPixels;
                layoutParams2.height = physicalPixels2;
                view.setLayoutParams(layoutParams2);
            }
            int logicalPixels = PlatformViewsController.this.toLogicalPixels(platformViewWrapper.getRenderTargetWidth());
            int logicalPixels2 = PlatformViewsController.this.toLogicalPixels(platformViewWrapper.getRenderTargetHeight());
            MethodChannel.Result result = ((g) interfaceC0971C).f101b;
            HashMap hashMap = new HashMap();
            hashMap.put(StubApp.getString2(1650), Double.valueOf(logicalPixels));
            hashMap.put(StubApp.getString2(1651), Double.valueOf(logicalPixels2));
            result.success(hashMap);
        }

        @Override // gb.G
        public void setDirection(int i3, int i10) {
            View view;
            if (!PlatformViewsController.validateDirection(i10)) {
                throw new IllegalStateException(AbstractC1482f.e(i10, StubApp.getString2(18783), i3, StubApp.getString2(18784), StubApp.getString2(74)));
            }
            boolean usesVirtualDisplay = PlatformViewsController.this.usesVirtualDisplay(i3);
            String string2 = StubApp.getString2(18768);
            if (usesVirtualDisplay) {
                view = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i3)).getView();
            } else {
                PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i3);
                if (platformView == null) {
                    h.B(i3, StubApp.getString2(18781), string2);
                    return;
                }
                view = platformView.getView();
            }
            if (view == null) {
                h.B(i3, StubApp.getString2(18782), string2);
            } else {
                view.setLayoutDirection(i10);
            }
        }

        @Override // gb.G
        public void synchronizeToNativeViewHierarchy(boolean z2) {
            PlatformViewsController.this.synchronizeToNativeViewHierarchy = z2;
        }
    }

    public PlatformViewsController() {
        if (E.f8515c == null) {
            E.f8515c = new E();
        }
        this.motionEventTracker = E.f8515c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void configureForHybridComposition(PlatformView platformView, D d8) {
        enforceMinimumAndroidApiVersion(19);
        int i3 = d8.f14246a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long configureForVirtualDisplay(PlatformView platformView, D d8) {
        enforceMinimumAndroidApiVersion(20);
        int i3 = d8.f14246a;
        PlatformViewRenderTarget makePlatformViewRenderTarget = makePlatformViewRenderTarget(this.textureRegistry);
        VirtualDisplayController create = VirtualDisplayController.create(this.context, this.accessibilityEventsDelegate, platformView, makePlatformViewRenderTarget, toPhysicalPixels(d8.f14248c), toPhysicalPixels(d8.f14249d), d8.f14246a, null, new d(this, d8, 1));
        int i10 = d8.f14246a;
        if (create != null) {
            this.vdControllers.put(Integer.valueOf(i10), create);
            View view = platformView.getView();
            this.contextToEmbeddedView.put(view.getContext(), view);
            return makePlatformViewRenderTarget.getId();
        }
        throw new IllegalStateException(StubApp.getString2(18790) + d8.f14247b + StubApp.getString2(18791) + i10);
    }

    private void diposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enforceMinimumAndroidApiVersion(int i3) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < i3) {
            throw new IllegalStateException(h.o(StubApp.getString2(18792), i10, i3, StubApp.getString2(18793)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureValidRequest(D d8) {
        if (validateDirection(d8.f14252g)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(18794));
        sb2.append(d8.f14252g);
        sb2.append(StubApp.getString2(18784));
        throw new IllegalStateException(AbstractC1482f.f(d8.f14246a, StubApp.getString2(74), sb2));
    }

    private void finishFrame(boolean z2) {
        for (int i3 = 0; i3 < this.overlayLayerViews.size(); i3++) {
            int keyAt = this.overlayLayerViews.keyAt(i3);
            PlatformOverlayView valueAt = this.overlayLayerViews.valueAt(i3);
            if (this.currentFrameUsedOverlayLayerIds.contains(Integer.valueOf(keyAt))) {
                Ya.c cVar = this.flutterView.f8575h;
                if (cVar != null) {
                    valueAt.attachToRenderer(cVar.f8862b);
                }
                z2 &= valueAt.acquireLatestImage();
            } else {
                if (!this.flutterViewConvertedToImageView) {
                    valueAt.detachFromRenderer();
                }
                valueAt.setVisibility(8);
                this.flutterView.removeView(valueAt);
            }
        }
        for (int i10 = 0; i10 < this.platformViewParent.size(); i10++) {
            int keyAt2 = this.platformViewParent.keyAt(i10);
            C0584b c0584b = this.platformViewParent.get(keyAt2);
            if (!this.currentFrameUsedPlatformViewIds.contains(Integer.valueOf(keyAt2)) || (!z2 && this.synchronizeToNativeViewHierarchy)) {
                c0584b.setVisibility(8);
            } else {
                c0584b.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    private void initializeRootImageViewIfNeeded() {
        if (!this.synchronizeToNativeViewHierarchy || this.flutterViewConvertedToImageView) {
            return;
        }
        r rVar = this.flutterView;
        rVar.f8571d.pause();
        j jVar = rVar.f8570c;
        if (jVar == null) {
            j jVar2 = new j(rVar.getContext(), rVar.getWidth(), rVar.getHeight(), i.f8545a);
            rVar.f8570c = jVar2;
            rVar.addView(jVar2);
        } else {
            jVar.resizeIfNeeded(rVar.getWidth(), rVar.getHeight());
        }
        rVar.f8572e = rVar.f8571d;
        j jVar3 = rVar.f8570c;
        rVar.f8571d = jVar3;
        Ya.c cVar = rVar.f8575h;
        if (cVar != null) {
            jVar3.attachToRenderer(cVar.f8862b);
        }
        this.flutterViewConvertedToImageView = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$configureForTextureLayerComposition$1(D d8, View view, boolean z2) {
        if (!z2) {
            TextInputPlugin textInputPlugin = this.textInputPlugin;
            if (textInputPlugin != null) {
                textInputPlugin.clearPlatformViewClient(d8.f14246a);
                return;
            }
            return;
        }
        M m4 = this.platformViewsChannel;
        int i3 = d8.f14246a;
        MethodChannel methodChannel = m4.f14295a;
        if (methodChannel == null) {
            return;
        }
        methodChannel.invokeMethod(StubApp.getString2(18786), Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$configureForVirtualDisplay$0(D d8, View view, boolean z2) {
        if (z2) {
            M m4 = this.platformViewsChannel;
            int i3 = d8.f14246a;
            MethodChannel methodChannel = m4.f14295a;
            if (methodChannel == null) {
                return;
            }
            methodChannel.invokeMethod(StubApp.getString2(18786), Integer.valueOf(i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initializePlatformViewIfNeeded$2(int i3, View view, boolean z2) {
        if (!z2) {
            TextInputPlugin textInputPlugin = this.textInputPlugin;
            if (textInputPlugin != null) {
                textInputPlugin.clearPlatformViewClient(i3);
                return;
            }
            return;
        }
        MethodChannel methodChannel = this.platformViewsChannel.f14295a;
        if (methodChannel == null) {
            return;
        }
        methodChannel.invokeMethod(StubApp.getString2(18786), Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEndFrame$3() {
        finishFrame(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.lockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionLocked();
    }

    private static PlatformViewRenderTarget makePlatformViewRenderTarget(io.flutter.view.r rVar) {
        int i3;
        if (!enableSurfaceProducerRenderTarget || (i3 = Build.VERSION.SDK_INT) < 29) {
            return (!enableImageRenderTarget || Build.VERSION.SDK_INT < 29) ? new SurfaceTexturePlatformViewRenderTarget(((l) rVar).d()) : new ImageReaderPlatformViewRenderTarget(((l) rVar).b());
        }
        return new SurfaceProducerPlatformViewRenderTarget(((l) rVar).c(i3 == 34 ? 2 : 1));
    }

    private void maybeInvokeOnFlutterViewAttached(PlatformView platformView) {
        r rVar = this.flutterView;
        if (rVar == null) {
            return;
        }
        platformView.onFlutterViewAttached(rVar);
    }

    private static MotionEvent.PointerCoords parsePointerCoords(Object obj, float f10) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d8 = f10;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d8);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d8);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d8);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d8);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d8);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d8);
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object obj, float f10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerCoords(it.next(), f10));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties parsePointerProperties(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerProperties(it.next()));
        }
        return arrayList;
    }

    private void removeOverlaySurfaces() {
        if (this.flutterView == null) {
            Log.e(StubApp.getString2(18768), StubApp.getString2(18795));
            return;
        }
        for (int i3 = 0; i3 < this.overlayLayerViews.size(); i3++) {
            this.flutterView.removeView(this.overlayLayerViews.valueAt(i3));
        }
        this.overlayLayerViews.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toLogicalPixels(double d8, float f10) {
        return (int) Math.round(d8 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toPhysicalPixels(double d8) {
        return (int) Math.round(d8 * getDisplayDensity());
    }

    private static void translateMotionEvent(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unlockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.unlockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionUnlocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean validateDirection(int i3) {
        return i3 == 0 || i3 == 1;
    }

    public void attach(Context context, io.flutter.view.r rVar, Za.d dVar) {
        if (this.context != null) {
            throw new AssertionError(StubApp.getString2(18787));
        }
        this.context = context;
        this.textureRegistry = rVar;
        M m4 = new M(dVar);
        this.platformViewsChannel = m4;
        m4.f14296b = this.channelHandler;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void attachAccessibilityBridge(io.flutter.view.l lVar) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(lVar);
    }

    public void attachTextInputPlugin(TextInputPlugin textInputPlugin) {
        this.textInputPlugin = textInputPlugin;
    }

    public void attachToFlutterRenderer(l lVar) {
        this.androidTouchProcessor = new C0361a(lVar, true);
    }

    public void attachToView(r rVar) {
        this.flutterView = rVar;
        for (int i3 = 0; i3 < this.viewWrappers.size(); i3++) {
            this.flutterView.addView(this.viewWrappers.valueAt(i3));
        }
        for (int i10 = 0; i10 < this.platformViewParent.size(); i10++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.platformViews.size(); i11++) {
            this.platformViews.valueAt(i11).onFlutterViewAttached(this.flutterView);
        }
    }

    public boolean checkInputConnectionProxy(View view) {
        if (view == null || !this.contextToEmbeddedView.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.contextToEmbeddedView.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(23)
    public long configureForTextureLayerComposition(PlatformView platformView, D d8) {
        PlatformViewWrapper platformViewWrapper;
        long j;
        enforceMinimumAndroidApiVersion(23);
        int i3 = d8.f14246a;
        int physicalPixels = toPhysicalPixels(d8.f14248c);
        int physicalPixels2 = toPhysicalPixels(d8.f14249d);
        if (this.usesSoftwareRendering) {
            platformViewWrapper = new PlatformViewWrapper(this.context);
            j = -1;
        } else {
            PlatformViewRenderTarget makePlatformViewRenderTarget = makePlatformViewRenderTarget(this.textureRegistry);
            PlatformViewWrapper platformViewWrapper2 = new PlatformViewWrapper(this.context, makePlatformViewRenderTarget);
            long id = makePlatformViewRenderTarget.getId();
            platformViewWrapper = platformViewWrapper2;
            j = id;
        }
        platformViewWrapper.setTouchProcessor(this.androidTouchProcessor);
        platformViewWrapper.resizeRenderTarget(physicalPixels, physicalPixels2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(physicalPixels, physicalPixels2);
        int physicalPixels3 = toPhysicalPixels(d8.f14250e);
        int physicalPixels4 = toPhysicalPixels(d8.f14251f);
        layoutParams.topMargin = physicalPixels3;
        layoutParams.leftMargin = physicalPixels4;
        platformViewWrapper.setLayoutParams(layoutParams);
        View view = platformView.getView();
        view.setLayoutParams(new FrameLayout.LayoutParams(physicalPixels, physicalPixels2));
        view.setImportantForAccessibility(4);
        platformViewWrapper.addView(view);
        platformViewWrapper.setOnDescendantFocusChangeListener(new d(this, d8, 0));
        this.flutterView.addView(platformViewWrapper);
        this.viewWrappers.append(d8.f14246a, platformViewWrapper);
        maybeInvokeOnFlutterViewAttached(platformView);
        return j;
    }

    public FlutterOverlaySurface createOverlaySurface(PlatformOverlayView platformOverlayView) {
        int i3 = this.nextOverlayLayerId;
        this.nextOverlayLayerId = i3 + 1;
        this.overlayLayerViews.put(i3, platformOverlayView);
        return new FlutterOverlaySurface(i3, platformOverlayView.getSurface());
    }

    public PlatformView createPlatformView(D d8, boolean z2) {
        PlatformViewFactory factory = this.registry.getFactory(d8.f14247b);
        if (factory == null) {
            throw new IllegalStateException(StubApp.getString2(18789) + d8.f14247b);
        }
        ByteBuffer byteBuffer = d8.f14254i;
        Object decodeMessage = byteBuffer != null ? factory.getCreateArgsCodec().decodeMessage(byteBuffer) : null;
        Context mutableContextWrapper = z2 ? new MutableContextWrapper(this.context) : this.context;
        int i3 = d8.f14246a;
        PlatformView create = factory.create(mutableContextWrapper, i3, decodeMessage);
        View view = create.getView();
        if (view == null) {
            throw new IllegalStateException(StubApp.getString2(18788));
        }
        view.setLayoutDirection(d8.f14252g);
        this.platformViews.put(i3, create);
        maybeInvokeOnFlutterViewAttached(create);
        return create;
    }

    public void destroyOverlaySurfaces() {
        for (int i3 = 0; i3 < this.overlayLayerViews.size(); i3++) {
            PlatformOverlayView valueAt = this.overlayLayerViews.valueAt(i3);
            valueAt.detachFromRenderer();
            valueAt.closeImageReader();
        }
    }

    public void detach() {
        M m4 = this.platformViewsChannel;
        if (m4 != null) {
            m4.f14296b = null;
        }
        destroyOverlaySurfaces();
        this.platformViewsChannel = null;
        this.context = null;
        this.textureRegistry = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge(null);
    }

    public void detachFromView() {
        for (int i3 = 0; i3 < this.viewWrappers.size(); i3++) {
            this.flutterView.removeView(this.viewWrappers.valueAt(i3));
        }
        for (int i10 = 0; i10 < this.platformViewParent.size(); i10++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i10));
        }
        destroyOverlaySurfaces();
        removeOverlaySurfaces();
        this.flutterView = null;
        this.flutterViewConvertedToImageView = false;
        for (int i11 = 0; i11 < this.platformViews.size(); i11++) {
            this.platformViews.valueAt(i11).onFlutterViewDetached();
        }
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public void disposePlatformView(int i3) {
        this.channelHandler.dispose(i3);
    }

    public SparseArray<PlatformOverlayView> getOverlayLayerViews() {
        return this.overlayLayerViews;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public View getPlatformViewById(int i3) {
        if (usesVirtualDisplay(i3)) {
            return this.vdControllers.get(Integer.valueOf(i3)).getView();
        }
        PlatformView platformView = this.platformViews.get(i3);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    public boolean initializePlatformViewIfNeeded(int i3) {
        PlatformView platformView = this.platformViews.get(i3);
        if (platformView == null) {
            return false;
        }
        if (this.platformViewParent.get(i3) != null) {
            return true;
        }
        View view = platformView.getView();
        if (view == null) {
            throw new IllegalStateException(StubApp.getString2(18788));
        }
        if (view.getParent() != null) {
            throw new IllegalStateException(StubApp.getString2(18771));
        }
        Context context = this.context;
        C0584b c0584b = new C0584b(context, context.getResources().getDisplayMetrics().density, this.androidTouchProcessor);
        c0584b.setOnDescendantFocusChangeListener(new c(this, i3, 0));
        this.platformViewParent.put(i3, c0584b);
        view.setImportantForAccessibility(4);
        c0584b.addView(view);
        this.flutterView.addView(c0584b);
        return true;
    }

    public void onBeginFrame() {
        this.currentFrameUsedOverlayLayerIds.clear();
        this.currentFrameUsedPlatformViewIds.clear();
    }

    public void onDetachedFromJNI() {
        diposeAllViews();
    }

    public void onDisplayOverlaySurface(int i3, int i10, int i11, int i12, int i13) {
        if (this.overlayLayerViews.get(i3) == null) {
            throw new IllegalStateException(h.g(i3, StubApp.getString2(18796), StubApp.getString2(18797)));
        }
        initializeRootImageViewIfNeeded();
        PlatformOverlayView platformOverlayView = this.overlayLayerViews.get(i3);
        if (platformOverlayView.getParent() == null) {
            this.flutterView.addView(platformOverlayView);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        platformOverlayView.setLayoutParams(layoutParams);
        platformOverlayView.setVisibility(0);
        platformOverlayView.bringToFront();
        this.currentFrameUsedOverlayLayerIds.add(Integer.valueOf(i3));
    }

    public void onDisplayPlatformView(int i3, int i10, int i11, int i12, int i13, int i14, int i15, FlutterMutatorsStack flutterMutatorsStack) {
        initializeRootImageViewIfNeeded();
        if (initializePlatformViewIfNeeded(i3)) {
            C0584b c0584b = this.platformViewParent.get(i3);
            c0584b.f11057a = flutterMutatorsStack;
            c0584b.f11059c = i10;
            c0584b.f11060d = i11;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            layoutParams.leftMargin = i10;
            layoutParams.topMargin = i11;
            c0584b.setLayoutParams(layoutParams);
            c0584b.setWillNotDraw(false);
            c0584b.setVisibility(0);
            c0584b.bringToFront();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i14, i15);
            View view = this.platformViews.get(i3).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams2);
                view.bringToFront();
            }
            this.currentFrameUsedPlatformViewIds.add(Integer.valueOf(i3));
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public void onEndFrame() {
        ?? r32;
        boolean z2 = false;
        if (!this.flutterViewConvertedToImageView || !this.currentFrameUsedPlatformViewIds.isEmpty()) {
            if (this.flutterViewConvertedToImageView) {
                j jVar = this.flutterView.f8570c;
                if (jVar != null ? jVar.acquireLatestImage() : false) {
                    z2 = true;
                }
            }
            finishFrame(z2);
            return;
        }
        this.flutterViewConvertedToImageView = false;
        r rVar = this.flutterView;
        o oVar = new o(this, 26);
        j jVar2 = rVar.f8570c;
        if (jVar2 == null || (r32 = rVar.f8572e) == 0) {
            return;
        }
        rVar.f8571d = r32;
        rVar.f8572e = null;
        l lVar = rVar.f8575h.f8862b;
        if (lVar != null) {
            r32.resume();
            q qVar = new q(rVar, lVar, oVar);
            lVar.f15057a.addIsDisplayingFlutterUiListener(qVar);
            if (lVar.f15060d) {
                qVar.b();
                return;
            }
            return;
        }
        jVar2.detachFromRenderer();
        j jVar3 = rVar.f8570c;
        if (jVar3 != null) {
            jVar3.closeImageReader();
            rVar.removeView(rVar.f8570c);
            rVar.f8570c = null;
        }
        oVar.run();
    }

    public void onPreEngineRestart() {
        diposeAllViews();
    }

    public void onResume() {
        Iterator<VirtualDisplayController> it = this.vdControllers.values().iterator();
        while (it.hasNext()) {
            it.next().resetSurface();
        }
    }

    public void onTrimMemory(int i3) {
        if (i3 < 40) {
            return;
        }
        Iterator<VirtualDisplayController> it = this.vdControllers.values().iterator();
        while (it.hasNext()) {
            it.next().clearSurface();
        }
    }

    public void setSoftwareRendering(boolean z2) {
        this.usesSoftwareRendering = z2;
    }

    public MotionEvent toMotionEvent(float f10, F f11, boolean z2) {
        MotionEvent a3 = this.motionEventTracker.a(new Xa.D(f11.f14272p));
        List<MotionEvent.PointerCoords> parsePointerCoordsList = parsePointerCoordsList(f11.f14264g, f10);
        int i3 = f11.f14262e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList.toArray(new MotionEvent.PointerCoords[i3]);
        if (!z2 && a3 != null) {
            translateMotionEvent(a3, pointerCoordsArr);
            return a3;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) parsePointerPropertiesList(f11.f14263f).toArray(new MotionEvent.PointerProperties[i3]);
        return MotionEvent.obtain(f11.f14259b.longValue(), f11.f14260c.longValue(), f11.f14261d, f11.f14262e, pointerPropertiesArr, pointerCoordsArr, f11.f14265h, f11.f14266i, f11.j, f11.f14267k, f11.f14268l, f11.f14269m, f11.f14270n, f11.f14271o);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i3) {
        return this.vdControllers.containsKey(Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toLogicalPixels(double d8) {
        return toLogicalPixels(d8, getDisplayDensity());
    }

    public FlutterOverlaySurface createOverlaySurface() {
        return createOverlaySurface(new PlatformOverlayView(this.flutterView.getContext(), this.flutterView.getWidth(), this.flutterView.getHeight(), this.accessibilityEventsDelegate));
    }
}
