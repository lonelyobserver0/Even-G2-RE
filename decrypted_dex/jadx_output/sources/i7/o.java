package i7;

import A3.s;
import B6.q;
import D5.A;
import Y6.t;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.L1;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.DragInteraction;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapController;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.util.CoreGesturesHandler;
import com.stub.StubApp;
import f0.C0868a;
import j7.C1093a;
import j7.C1094b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o extends L1 implements c, X6.m {

    /* renamed from: s0, reason: collision with root package name */
    public static final t f14881s0;

    /* renamed from: A, reason: collision with root package name */
    public ScreenCoordinate f14882A;

    /* renamed from: B, reason: collision with root package name */
    public ScreenCoordinate f14883B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f14884C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f14885D;

    /* renamed from: E, reason: collision with root package name */
    public float f14886E;

    /* renamed from: F, reason: collision with root package name */
    public float f14887F;

    /* renamed from: G, reason: collision with root package name */
    public float f14888G;

    /* renamed from: H, reason: collision with root package name */
    public double f14889H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f14890I;

    /* renamed from: K, reason: collision with root package name */
    public float f14891K;

    /* renamed from: L, reason: collision with root package name */
    public double f14892L;

    /* renamed from: O, reason: collision with root package name */
    public double f14893O;

    /* renamed from: P, reason: collision with root package name */
    public ScreenCoordinate f14894P;

    /* renamed from: R, reason: collision with root package name */
    public float f14895R;

    /* renamed from: T, reason: collision with root package name */
    public float f14896T;

    /* renamed from: X, reason: collision with root package name */
    public float f14897X;

    /* renamed from: Y, reason: collision with root package name */
    public double f14898Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f14899Z;

    /* renamed from: d, reason: collision with root package name */
    public final Context f14900d;

    /* renamed from: e, reason: collision with root package name */
    public float f14901e;

    /* renamed from: f, reason: collision with root package name */
    public B6.a f14902f;

    /* renamed from: g, reason: collision with root package name */
    public e f14903g;

    /* renamed from: h, reason: collision with root package name */
    public Y.m f14904h;
    public ScreenCoordinate h0;
    public MapboxStyleManager j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f14905k;

    /* renamed from: k0, reason: collision with root package name */
    public ValueAnimator[] f14906k0;

    /* renamed from: l, reason: collision with root package name */
    public MapboxMap f14907l;

    /* renamed from: l0, reason: collision with root package name */
    public ValueAnimator[] f14908l0;

    /* renamed from: m, reason: collision with root package name */
    public MapboxMap f14909m;

    /* renamed from: m0, reason: collision with root package name */
    public final ArrayList f14910m0;

    /* renamed from: n, reason: collision with root package name */
    public MapboxMap f14911n;

    /* renamed from: n0, reason: collision with root package name */
    public final C0868a f14912n0;

    /* renamed from: o0, reason: collision with root package name */
    public CoreGesturesHandler f14913o0;

    /* renamed from: p, reason: collision with root package name */
    public Y6.a f14914p;

    /* renamed from: p0, reason: collision with root package name */
    public final Handler f14915p0;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArraySet f14916q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f14917q0;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArraySet f14918r;

    /* renamed from: r0, reason: collision with root package name */
    public C1094b f14919r0;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArraySet f14920s;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArraySet f14921t;

    /* renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArraySet f14922v;

    /* renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArraySet f14923w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArraySet f14924x;

    /* renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArraySet f14925y;

    /* renamed from: z, reason: collision with root package name */
    public ScreenCoordinate f14926z;

    static {
        String owner = StubApp.getString2(687);
        Intrinsics.checkNotNullParameter(owner, "owner");
        f14881s0 = new t(owner, 0L, null);
    }

    public o(Context context, float f10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14901e = 1.0f;
        this.f14905k = new LinkedHashSet();
        this.f14916q = new CopyOnWriteArraySet();
        this.f14918r = new CopyOnWriteArraySet();
        this.f14920s = new CopyOnWriteArraySet();
        this.f14921t = new CopyOnWriteArraySet();
        this.f14922v = new CopyOnWriteArraySet();
        this.f14923w = new CopyOnWriteArraySet();
        this.f14924x = new CopyOnWriteArraySet();
        this.f14925y = new CopyOnWriteArraySet();
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(0.0d, 0.0d);
        this.f14926z = screenCoordinate;
        this.f14882A = screenCoordinate;
        this.f14883B = screenCoordinate;
        this.f14884C = true;
        this.f14910m0 = new ArrayList();
        this.f14912n0 = new C0868a(2);
        this.f14900d = context;
        this.f14901e = f10;
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, p.f14927a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            A8.a initializer = new A8.a(obtainStyledAttributes, 11);
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            C1093a c1093a = new C1093a();
            initializer.invoke(c1093a);
            C1094b a3 = c1093a.a();
            obtainStyledAttributes.recycle();
            Intrinsics.checkNotNullParameter(a3, "<set-?>");
            this.f14919r0 = a3;
            this.f14915p0 = new Handler(Looper.getMainLooper());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void I() {
        boolean z2 = this.f14919r0.f15360c;
        Y6.a aVar = null;
        String string2 = StubApp.getString2(688);
        if (z2) {
            B6.a aVar2 = this.f14902f;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                aVar2 = null;
            }
            if (((B6.d) aVar2.f674h).f709q) {
                return;
            }
        }
        C1094b c1094b = this.f14919r0;
        if (c1094b.f15359b || c1094b.f15365h || c1094b.f15364g) {
            B6.a aVar3 = this.f14902f;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                aVar3 = null;
            }
            if (((q) aVar3.f670d).f709q) {
                return;
            }
        }
        if (this.f14919r0.f15358a) {
            B6.a aVar4 = this.f14902f;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                aVar4 = null;
            }
            if (((B6.j) aVar4.f671e).f709q) {
                return;
            }
        }
        if (this.f14919r0.f15362e) {
            B6.a aVar5 = this.f14902f;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                aVar5 = null;
            }
            if (((B6.k) aVar5.f672f).f709q) {
                return;
            }
        }
        Y6.a aVar6 = this.f14914p;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsPlugin");
        } else {
            aVar = aVar6;
        }
        ((Y6.j) aVar).b(CollectionsKt.toList(this.f14916q));
    }

    public final ValueAnimator[] J(double d8, double d10, ScreenCoordinate screenCoordinate, long j) {
        int i3 = 2;
        int i10 = 1;
        Y6.a aVar = this.f14914p;
        String string2 = StubApp.getString2(686);
        Y6.a aVar2 = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            aVar = null;
        }
        Object[] targets = Arrays.copyOf(new Double[]{Double.valueOf(d10 + d8)}, 1);
        Intrinsics.checkNotNullParameter(targets, "targets");
        String owner = StubApp.getString2(687);
        Intrinsics.checkNotNullParameter(owner, "owner");
        Y6.m options = new Y6.m(Arrays.copyOf(targets, targets.length), Double.valueOf(d8), owner);
        C0868a c0868a = this.f14912n0;
        l lVar = new l(c0868a, j, 3);
        ((Y6.j) aVar).getClass();
        Intrinsics.checkNotNullParameter(options, "options");
        Z6.j jVar = new Z6.j(options, lVar);
        jVar.addListener(new k(this, i3));
        CoreGesturesHandler coreGesturesHandler = this.f14913o0;
        if (coreGesturesHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coreGesturesHandler");
            coreGesturesHandler = null;
        }
        jVar.addListener(coreGesturesHandler.getCoreGestureAnimatorHandler());
        Y6.a aVar3 = this.f14914p;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            aVar2 = aVar3;
        }
        Object[] targets2 = Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate}, 1);
        Intrinsics.checkNotNullParameter(targets2, "targets");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Y6.m options2 = new Y6.m(Arrays.copyOf(targets2, targets2.length), screenCoordinate, owner);
        l lVar2 = new l(c0868a, j, 2);
        ((Y6.j) aVar2).getClass();
        Intrinsics.checkNotNullParameter(options2, "options");
        Z6.a aVar4 = new Z6.a(options2, lVar2);
        aVar4.addListener(new k(this, i10));
        return new ValueAnimator[]{jVar, aVar4};
    }

    public final void K() {
        if (this.f14917q0) {
            Y.m mVar = this.f14904h;
            if (mVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gestureState");
                mVar = null;
            }
            mVar.w(EnumC1061a.f14854a);
            this.f14917q0 = false;
        }
    }

    public final g7.c L() {
        MapboxMap mapboxMap = this.f14911n;
        if (mapboxMap != null) {
            return mapboxMap;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapInteractionDelegate");
        return null;
    }

    public final void M(boolean z2, ScreenCoordinate zoomFocalPoint) {
        Intrinsics.checkNotNullParameter(zoomFocalPoint, "zoomFocalPoint");
        P(this.f14906k0);
        B6.a aVar = this.f14902f;
        MapboxMap mapboxMap = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gesturesManager");
            aVar = null;
        }
        Intrinsics.checkNotNullExpressionValue((q) aVar.f670d, "gesturesManager.standardScaleGestureDetector");
        Iterator it = this.f14924x.iterator();
        if (it.hasNext()) {
            throw com.mapbox.common.b.e(it);
        }
        MapboxMap mapboxMap2 = this.f14909m;
        if (mapboxMap2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapCameraManagerDelegate");
        } else {
            mapboxMap = mapboxMap2;
        }
        ValueAnimator[] J10 = J(mapboxMap.getCameraState().getZoom(), z2 ? 1 : -1, zoomFocalPoint, 300L);
        this.f14906k0 = J10;
        O(J10);
    }

    public final boolean N(ScreenCoordinate pixel) {
        String upperCase;
        Intrinsics.checkNotNullParameter(pixel, "pixel");
        MapboxStyleManager mapboxStyleManager = this.j;
        MapboxMap mapboxMap = null;
        StylePropertyValue styleProjectionProperty = mapboxStyleManager != null ? mapboxStyleManager.getStyleProjectionProperty(StubApp.getString2(ModuleDescriptor.MODULE_VERSION)) : null;
        if (styleProjectionProperty == null) {
            return false;
        }
        StylePropertyValueKind kind = styleProjectionProperty.getKind();
        StylePropertyValueKind stylePropertyValueKind = StylePropertyValueKind.UNDEFINED;
        String string2 = StubApp.getString2(18598);
        if (kind == stylePropertyValueKind) {
            upperCase = string2;
        } else {
            Object contents = styleProjectionProperty.getValue().getContents();
            Intrinsics.checkNotNull(contents, "null cannot be cast to non-null type kotlin.String");
            upperCase = ((String) contents).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        }
        if (!Intrinsics.areEqual(upperCase, string2)) {
            return false;
        }
        MapboxMap mapboxMap2 = this.f14907l;
        if (mapboxMap2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapTransformDelegate");
            mapboxMap2 = null;
        }
        double height = 0.04d * mapboxMap2.getSize().getHeight();
        double min = Math.min(10.0d, height / 2);
        double x7 = pixel.getX();
        boolean isNaN = Double.isNaN(x7);
        double d8 = 0.0d;
        String string22 = StubApp.getString2(18583);
        if (isNaN) {
            MapboxLogger.logE(string22, StubApp.getString2(18599));
            x7 = 0.0d;
        }
        double y10 = pixel.getY();
        if (Double.isNaN(y10)) {
            MapboxLogger.logE(string22, StubApp.getString2(18600));
        } else {
            d8 = y10;
        }
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(x7, d8 - height);
        MapboxMap mapboxMap3 = this.f14909m;
        String string23 = StubApp.getString2(689);
        if (mapboxMap3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string23);
            mapboxMap3 = null;
        }
        Point coordinateForPixel = mapboxMap3.coordinateForPixel(screenCoordinate);
        MapboxMap mapboxMap4 = this.f14909m;
        if (mapboxMap4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string23);
        } else {
            mapboxMap = mapboxMap4;
        }
        return mapboxMap.pixelForCoordinate(coordinateForPixel).getY() >= screenCoordinate.getY() + min;
    }

    public final void O(ValueAnimator[] valueAnimatorArr) {
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            this.f14910m0.add(valueAnimator);
        }
        Handler handler = this.f14915p0;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new B0.o(this, 25), 150L);
    }

    public final void P(ValueAnimator[] valueAnimatorArr) {
        if (valueAnimatorArr != null) {
            Y6.a aVar = this.f14914p;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsPlugin");
                aVar = null;
            }
            ((Y6.j) aVar).n((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length), true);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // X6.j
    public final void a(s delegateProvider) {
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        n callback = new n(this, 0);
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((MapboxMap) delegateProvider.f189a).getStyle(new X6.i(callback, 0));
        this.f14907l = (MapboxMap) delegateProvider.f192d;
        this.f14909m = (MapboxMap) delegateProvider.f190b;
        String string2 = StubApp.getString2(6077);
        MapboxMap mapboxMap = (MapboxMap) delegateProvider.f197i;
        Intrinsics.checkNotNullParameter(mapboxMap, string2);
        this.f14911n = mapboxMap;
        Y6.a aVar = (Y6.a) ((MapController) delegateProvider.f194f).getPlugin(StubApp.getString2(7571));
        if (aVar == null) {
            String exceptionMessage = StubApp.getString2(8517);
            Intrinsics.checkNotNullParameter(exceptionMessage, "exceptionMessage");
            throw new A(exceptionMessage, 2);
        }
        this.f14914p = aVar;
        Y6.l listener = new Y6.l() { // from class: i7.d
            @Override // Y6.l
            public final void a(Serializable serializable) {
                EdgeInsets it = (EdgeInsets) serializable;
                o this$0 = o.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.f14885D = true;
            }
        };
        Intrinsics.checkNotNullParameter(listener, "listener");
        ((Y6.j) aVar).f8769f.add(listener);
        MapboxMap mapboxMap2 = this.f14907l;
        MapboxMap mapboxMap3 = null;
        if (mapboxMap2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapTransformDelegate");
            mapboxMap2 = null;
        }
        MapboxMap mapboxMap4 = this.f14909m;
        if (mapboxMap4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapCameraManagerDelegate");
        } else {
            mapboxMap3 = mapboxMap4;
        }
        this.f14913o0 = new CoreGesturesHandler(mapboxMap2, mapboxMap3);
    }

    @Override // X6.m
    public final void b(Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.j = style;
    }

    @Override // X6.a
    public final void e(Context context, AttributeSet attributeSet, float f10) {
        Intrinsics.checkNotNullParameter(context, "context");
        B6.a gesturesManager = new B6.a(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gesturesManager, "gesturesManager");
        this.f14902f = gesturesManager;
        this.f14904h = new Y.m(gesturesManager);
        this.f14901e = f10;
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f14927a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            A8.a initializer = new A8.a(obtainStyledAttributes, 11);
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            C1093a c1093a = new C1093a();
            initializer.invoke(c1093a);
            C1094b a3 = c1093a.a();
            obtainStyledAttributes.recycle();
            Intrinsics.checkNotNullParameter(a3, "<set-?>");
            this.f14919r0 = a3;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // X6.j
    public final void g() {
        this.j = null;
        LinkedHashSet linkedHashSet = this.f14905k;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        linkedHashSet.clear();
        this.f14916q.clear();
        this.f14915p0.removeCallbacksAndMessages(null);
    }

    @Override // X6.j
    public final void initialize() {
        B6.a aVar = this.f14902f;
        B6.a aVar2 = null;
        String string2 = StubApp.getString2(688);
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            aVar = null;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        hashSet.add(1);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(3);
        hashSet2.add(2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(1);
        hashSet3.add(6);
        aVar.getClass();
        List asList = Arrays.asList(hashSet, hashSet2, hashSet3);
        ArrayList arrayList = (ArrayList) aVar.f667a;
        arrayList.clear();
        arrayList.addAll(asList);
        ((B6.j) aVar.f671e).f715v = 3.0f;
        ((B6.k) aVar.f672f).f719v = 45.0f;
        this.f14902f = aVar;
        Context context = this.f14900d;
        i iVar = new i(this, context.getResources().getDimension(2131099813));
        e eVar = new e(this);
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f14903g = eVar;
        this.f14886E = context.getResources().getDimension(2131099828);
        this.f14887F = context.getResources().getDimension(2131099825);
        this.f14888G = context.getResources().getDimension(2131099829);
        this.f14889H = context.getResources().getDimension(2131099815) * 0.004d;
        g gVar = new g(this);
        this.f14895R = context.getResources().getDimension(2131099827);
        this.f14896T = context.getResources().getDimension(2131099808);
        this.f14897X = context.getResources().getDimension(2131099826);
        this.f14898Y = context.getResources().getDimension(2131099815) * 2.2000000000000003E-4d;
        this.f14899Z = context.getResources().getDimension(2131099813);
        f fVar = new f(this);
        h hVar = new h(this);
        j jVar = new j(this);
        B6.a aVar3 = this.f14902f;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            aVar3 = null;
        }
        ((B6.o) aVar3.f669c).f682h = iVar;
        B6.a aVar4 = this.f14902f;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            aVar4 = null;
        }
        e eVar2 = this.f14903g;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moveGestureListener");
            eVar2 = null;
        }
        ((B6.d) aVar4.f674h).f682h = eVar2;
        B6.a aVar5 = this.f14902f;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            aVar5 = null;
        }
        ((q) aVar5.f670d).f682h = gVar;
        B6.a aVar6 = this.f14902f;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            aVar6 = null;
        }
        ((B6.j) aVar6.f671e).f682h = fVar;
        B6.a aVar7 = this.f14902f;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            aVar7 = null;
        }
        ((B6.k) aVar7.f672f).f682h = hVar;
        B6.a aVar8 = this.f14902f;
        if (aVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            aVar2 = aVar8;
        }
        ((B6.g) aVar2.f673g).f682h = jVar;
        Cancelable addInteraction = L().addInteraction(ClickInteraction.INSTANCE.map(new n(this, 1)));
        LinkedHashSet linkedHashSet = this.f14905k;
        linkedHashSet.add(addInteraction);
        linkedHashSet.add(L().addInteraction(LongClickInteraction.INSTANCE.map(new n(this, 2))));
        linkedHashSet.add(L().addInteraction(DragInteraction.INSTANCE.invoke(new n(this, 3), new n(this, 4), new n(this, 5))));
    }

    @Override // X6.l
    public final void onSizeChanged(int i3, int i10) {
        this.f14882A = new ScreenCoordinate(i3 / 2, i10 / 2);
        this.f14884C = true;
    }

    public o(Context context, AttributeSet attributeSet, float f10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f14901e = 1.0f;
        this.f14905k = new LinkedHashSet();
        this.f14916q = new CopyOnWriteArraySet();
        this.f14918r = new CopyOnWriteArraySet();
        this.f14920s = new CopyOnWriteArraySet();
        this.f14921t = new CopyOnWriteArraySet();
        this.f14922v = new CopyOnWriteArraySet();
        this.f14923w = new CopyOnWriteArraySet();
        this.f14924x = new CopyOnWriteArraySet();
        this.f14925y = new CopyOnWriteArraySet();
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(0.0d, 0.0d);
        this.f14926z = screenCoordinate;
        this.f14882A = screenCoordinate;
        this.f14883B = screenCoordinate;
        this.f14884C = true;
        this.f14910m0 = new ArrayList();
        this.f14912n0 = new C0868a(2);
        this.f14900d = context;
        this.f14901e = f10;
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f14927a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            A8.a initializer = new A8.a(obtainStyledAttributes, 11);
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            C1093a c1093a = new C1093a();
            initializer.invoke(c1093a);
            C1094b a3 = c1093a.a();
            obtainStyledAttributes.recycle();
            Intrinsics.checkNotNullParameter(a3, "<set-?>");
            this.f14919r0 = a3;
            this.f14915p0 = new Handler(Looper.getMainLooper());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
