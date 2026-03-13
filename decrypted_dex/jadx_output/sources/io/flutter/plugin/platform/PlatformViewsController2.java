package io.flutter.plugin.platform;

import Xa.C0361a;
import Xa.D;
import Xa.E;
import Xa.h;
import Xa.r;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import android.view.AttachedSurfaceControl;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import cb.C0584b;
import com.stub.StubApp;
import gb.I;
import gb.J;
import gb.K;
import gb.L;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.view.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PlatformViewsController2 implements PlatformViewsAccessibilityDelegate {
    private static final String TAG = StubApp.getString2(18785);
    private C0361a androidTouchProcessor;
    private Context context;
    private r flutterView;
    private final E motionEventTracker;
    private L platformViewsChannel;
    private PlatformViewRegistryImpl registry;
    private TextInputPlugin textInputPlugin;
    private FlutterJNI flutterJNI = null;
    private Surface overlayerSurface = null;
    private SurfaceControl overlaySurfaceControl = null;
    private final K channelHandler = new K() { // from class: io.flutter.plugin.platform.PlatformViewsController2.1
        @Override // gb.K
        public void clearFocus(int i3) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i3);
            String string2 = StubApp.getString2(18785);
            if (platformView == null) {
                h.B(i3, StubApp.getString2(18769), string2);
                return;
            }
            View view = platformView.getView();
            if (view == null) {
                h.B(i3, StubApp.getString2(18770), string2);
            } else {
                view.clearFocus();
            }
        }

        @Override // gb.K
        public void createPlatformView(I i3) {
            PlatformViewsController2.this.createFlutterPlatformView(i3);
        }

        @Override // gb.K
        public void dispose(int i3) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i3);
            String string2 = StubApp.getString2(18785);
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
            PlatformViewsController2.this.platformViews.remove(i3);
            try {
                platformView.dispose();
            } catch (RuntimeException e10) {
                Log.e(string2, StubApp.getString2(18776), e10);
            }
            C0584b c0584b = (C0584b) PlatformViewsController2.this.platformViewParent.get(i3);
            if (c0584b != null) {
                c0584b.removeAllViews();
                c0584b.a();
                ViewGroup viewGroup2 = (ViewGroup) c0584b.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(c0584b);
                }
                PlatformViewsController2.this.platformViewParent.remove(i3);
            }
        }

        @Override // gb.K
        public boolean isSurfaceControlEnabled() {
            if (PlatformViewsController2.this.flutterJNI == null) {
                return false;
            }
            return PlatformViewsController2.this.flutterJNI.IsSurfaceControlEnabled();
        }

        @Override // gb.K
        public void onTouch(J j) {
            int i3 = j.f14278a;
            float f10 = PlatformViewsController2.this.context.getResources().getDisplayMetrics().density;
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i3);
            String string2 = StubApp.getString2(18785);
            if (platformView == null) {
                h.B(i3, StubApp.getString2(18778), string2);
                return;
            }
            View view = platformView.getView();
            if (view == null) {
                h.B(i3, StubApp.getString2(18779), string2);
            } else {
                view.dispatchTouchEvent(PlatformViewsController2.this.toMotionEvent(f10, j));
            }
        }

        @Override // gb.K
        public void setDirection(int i3, int i10) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i3);
            String string2 = StubApp.getString2(18785);
            if (platformView == null) {
                h.B(i3, StubApp.getString2(18781), string2);
                return;
            }
            View view = platformView.getView();
            if (view == null) {
                h.B(i3, StubApp.getString2(18782), string2);
            } else {
                view.setLayoutDirection(i10);
            }
        }
    };
    private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
    private final SparseArray<PlatformView> platformViews = new SparseArray<>();
    private final SparseArray<C0584b> platformViewParent = new SparseArray<>();
    private final ArrayList<SurfaceControl.Transaction> pendingTransactions = new ArrayList<>();
    private final ArrayList<SurfaceControl.Transaction> activeTransactions = new ArrayList<>();

    public PlatformViewsController2() {
        if (E.f8515c == null) {
            E.f8515c = new E();
        }
        this.motionEventTracker = E.f8515c;
    }

    private void diposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    private float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initializePlatformViewIfNeeded$0(int i3, View view, boolean z2) {
        if (!z2) {
            TextInputPlugin textInputPlugin = this.textInputPlugin;
            if (textInputPlugin != null) {
                textInputPlugin.clearPlatformViewClient(i3);
                return;
            }
            return;
        }
        MethodChannel methodChannel = this.platformViewsChannel.f14293a;
        if (methodChannel == null) {
            return;
        }
        methodChannel.invokeMethod(StubApp.getString2(18786), Integer.valueOf(i3));
    }

    private void lockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.lockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionLocked();
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

    private int toLogicalPixels(double d8, float f10) {
        return (int) Math.round(d8 / f10);
    }

    private int toPhysicalPixels(double d8) {
        return (int) Math.round(d8 * getDisplayDensity());
    }

    private static void translateMotionEvent(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    private void unlockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.unlockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionUnlocked();
    }

    private static boolean validateDirection(int i3) {
        return i3 == 0 || i3 == 1;
    }

    @TargetApi(34)
    public void applyTransactions() {
        SurfaceControl.Transaction d8 = a.d();
        for (int i3 = 0; i3 < this.pendingTransactions.size(); i3++) {
            d8 = d8.merge(a.f(this.pendingTransactions.get(i3)));
        }
        d8.apply();
        this.pendingTransactions.clear();
    }

    public void attach(Context context, Za.d dVar) {
        if (this.context != null) {
            throw new AssertionError(StubApp.getString2(18787));
        }
        this.context = context;
        L l9 = new L(dVar);
        this.platformViewsChannel = l9;
        l9.f14294b = this.channelHandler;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void attachAccessibilityBridge(l lVar) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(lVar);
    }

    public void attachTextInputPlugin(TextInputPlugin textInputPlugin) {
        this.textInputPlugin = textInputPlugin;
    }

    public void attachToFlutterRenderer(io.flutter.embedding.engine.renderer.l lVar) {
        this.androidTouchProcessor = new C0361a(lVar, true);
    }

    public void attachToView(r rVar) {
        this.flutterView = rVar;
        for (int i3 = 0; i3 < this.platformViewParent.size(); i3++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i3));
        }
        for (int i10 = 0; i10 < this.platformViews.size(); i10++) {
            this.platformViews.valueAt(i10).onFlutterViewAttached(this.flutterView);
        }
    }

    public PlatformView createFlutterPlatformView(I i3) {
        PlatformViewFactory factory = this.registry.getFactory(i3.f14275b);
        if (factory == null) {
            throw new IllegalStateException(StubApp.getString2(18789) + i3.f14275b);
        }
        ByteBuffer byteBuffer = i3.f14277d;
        Object decodeMessage = byteBuffer != null ? factory.getCreateArgsCodec().decodeMessage(byteBuffer) : null;
        Context context = this.context;
        int i10 = i3.f14274a;
        PlatformView create = factory.create(context, i10, decodeMessage);
        View view = create.getView();
        if (view == null) {
            throw new IllegalStateException(StubApp.getString2(18788));
        }
        view.setLayoutDirection(i3.f14276c);
        this.platformViews.put(i10, create);
        maybeInvokeOnFlutterViewAttached(create);
        return create;
    }

    @TargetApi(34)
    public FlutterOverlaySurface createOverlaySurface() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        if (this.overlayerSurface == null) {
            SurfaceControl.Builder c10 = a.c();
            c10.setBufferSize(this.flutterView.getWidth(), this.flutterView.getHeight());
            c10.setFormat(1);
            c10.setName(StubApp.getString2(18808));
            c10.setOpaque(false);
            c10.setHidden(false);
            build = c10.build();
            rootSurfaceControl = this.flutterView.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            this.overlayerSurface = a.b(build);
            this.overlaySurfaceControl = build;
        }
        return new FlutterOverlaySurface(0, this.overlayerSurface);
    }

    @TargetApi(34)
    public SurfaceControl.Transaction createTransaction() {
        SurfaceControl.Transaction d8 = a.d();
        this.pendingTransactions.add(d8);
        return d8;
    }

    public void destroyOverlaySurface() {
        Surface surface = this.overlayerSurface;
        if (surface != null) {
            surface.release();
            this.overlayerSurface = null;
            this.overlaySurfaceControl = null;
        }
    }

    public void detach() {
        L l9 = this.platformViewsChannel;
        if (l9 != null) {
            l9.f14294b = null;
        }
        destroyOverlaySurface();
        this.platformViewsChannel = null;
        this.context = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge(null);
    }

    public void detachFromView() {
        for (int i3 = 0; i3 < this.platformViewParent.size(); i3++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i3));
        }
        destroyOverlaySurface();
        this.flutterView = null;
        for (int i10 = 0; i10 < this.platformViews.size(); i10++) {
            this.platformViews.valueAt(i10).onFlutterViewDetached();
        }
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public void disposePlatformView(int i3) {
        this.channelHandler.dispose(i3);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public View getPlatformViewById(int i3) {
        PlatformView platformView = this.platformViews.get(i3);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    @TargetApi(34)
    public void hideOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        SurfaceControl.Transaction d8 = a.d();
        d8.setVisibility(this.overlaySurfaceControl, false);
        d8.apply();
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
        c0584b.setOnDescendantFocusChangeListener(new c(this, i3, 1));
        this.platformViewParent.put(i3, c0584b);
        view.setImportantForAccessibility(4);
        c0584b.addView(view);
        this.flutterView.addView(c0584b);
        return true;
    }

    public void onDetachedFromJNI() {
        diposeAllViews();
    }

    public void onDisplayPlatformView(int i3, int i10, int i11, int i12, int i13, int i14, int i15, FlutterMutatorsStack flutterMutatorsStack) {
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
        }
    }

    @TargetApi(34)
    public void onEndFrame() {
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction d8 = a.d();
        for (int i3 = 0; i3 < this.activeTransactions.size(); i3++) {
            d8 = d8.merge(a.f(this.activeTransactions.get(i3)));
        }
        this.activeTransactions.clear();
        this.flutterView.invalidate();
        rootSurfaceControl = this.flutterView.getRootSurfaceControl();
        rootSurfaceControl.applyTransactionOnDraw(d8);
    }

    public void onPreEngineRestart() {
        diposeAllViews();
    }

    public void setFlutterJNI(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public void setRegistry(PlatformViewRegistry platformViewRegistry) {
        this.registry = (PlatformViewRegistryImpl) platformViewRegistry;
    }

    @TargetApi(34)
    public void showOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        SurfaceControl.Transaction d8 = a.d();
        d8.setVisibility(this.overlaySurfaceControl, true);
        d8.apply();
    }

    public synchronized void swapTransactions() {
        try {
            this.activeTransactions.clear();
            for (int i3 = 0; i3 < this.pendingTransactions.size(); i3++) {
                this.activeTransactions.add(a.f(this.pendingTransactions.get(i3)));
            }
            this.pendingTransactions.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public MotionEvent toMotionEvent(float f10, J j) {
        MotionEvent a3 = this.motionEventTracker.a(new D(j.f14292p));
        List<MotionEvent.PointerCoords> parsePointerCoordsList = parsePointerCoordsList(j.f14284g, f10);
        int i3 = j.f14282e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList.toArray(new MotionEvent.PointerCoords[i3]);
        if (a3 != null) {
            translateMotionEvent(a3, pointerCoordsArr);
            return a3;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) parsePointerPropertiesList(j.f14283f).toArray(new MotionEvent.PointerProperties[i3]);
        return MotionEvent.obtain(j.f14279b.longValue(), j.f14280c.longValue(), j.f14281d, j.f14282e, pointerPropertiesArr, pointerCoordsArr, j.f14285h, j.f14286i, j.j, j.f14287k, j.f14288l, j.f14289m, j.f14290n, j.f14291o);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i3) {
        return false;
    }

    private int toLogicalPixels(double d8) {
        return toLogicalPixels(d8, getDisplayDensity());
    }
}
