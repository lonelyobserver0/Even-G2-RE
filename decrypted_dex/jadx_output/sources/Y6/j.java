package Y6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.threading.AnimationThreadController;
import com.mapbox.maps.util.CameraOptionsUtils;
import com.stub.StubApp;
import f0.C0868a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j implements a, X6.h {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f8762B = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, StubApp.getString2(6013), StubApp.getString2(7548), 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, StubApp.getString2(3779), StubApp.getString2(7549), 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, StubApp.getString2(7550), StubApp.getString2(7551), 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, StubApp.getString2(7552), StubApp.getString2(7553), 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, StubApp.getString2(1329), StubApp.getString2(7554), 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, StubApp.getString2(7555), StubApp.getString2(7556), 0))};

    /* renamed from: A, reason: collision with root package name */
    public final K4.m f8763A;

    /* renamed from: c, reason: collision with root package name */
    public s f8766c;

    /* renamed from: m, reason: collision with root package name */
    public final h f8774m;

    /* renamed from: n, reason: collision with root package name */
    public final h f8775n;

    /* renamed from: p, reason: collision with root package name */
    public final h f8776p;

    /* renamed from: q, reason: collision with root package name */
    public final h f8777q;

    /* renamed from: r, reason: collision with root package name */
    public final h f8778r;

    /* renamed from: s, reason: collision with root package name */
    public final h f8779s;

    /* renamed from: t, reason: collision with root package name */
    public final CameraOptions.Builder f8780t;

    /* renamed from: v, reason: collision with root package name */
    public A3.s f8781v;

    /* renamed from: w, reason: collision with root package name */
    public MapboxMap f8782w;

    /* renamed from: x, reason: collision with root package name */
    public MapboxMap f8783x;

    /* renamed from: y, reason: collision with root package name */
    public final Ac.m f8784y;

    /* renamed from: z, reason: collision with root package name */
    public r f8785z;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f8764a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f8765b = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f8767d = new CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f8768e = new CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f8769f = new CopyOnWriteArraySet();

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f8770g = new CopyOnWriteArraySet();

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f8771h = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet j = new CopyOnWriteArraySet();

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArraySet f8772k = new CopyOnWriteArraySet();

    /* renamed from: l, reason: collision with root package name */
    public final List f8773l = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.25f), Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f)});

    public j() {
        Delegates delegates = Delegates.INSTANCE;
        this.f8774m = new h(this, 0);
        this.f8775n = new h(this, 1);
        this.f8776p = new h(this, 2);
        this.f8777q = new h(this, 3);
        this.f8778r = new h(this, 4);
        this.f8779s = new h(this, 5);
        this.f8780t = new CameraOptions.Builder();
        this.f8784y = new Ac.m(this, 13);
        this.f8763A = new K4.m(this, 3);
    }

    @Override // X6.j
    public final void a(A3.s delegateProvider) {
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        this.f8781v = delegateProvider;
        this.f8782w = (MapboxMap) delegateProvider.f190b;
        this.f8783x = (MapboxMap) delegateProvider.f192d;
        A3.s sVar = this.f8781v;
        A3.s sVar2 = null;
        String string2 = StubApp.getString2(7557);
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            sVar = null;
        }
        sVar.getClass();
        A3.s sVar3 = this.f8781v;
        if (sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            sVar2 = sVar3;
        }
        r rVar = new r(sVar2);
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.f8785z = rVar;
    }

    public final void b(List exceptOwnerList) {
        boolean contains;
        s sVar;
        boolean contains2;
        Intrinsics.checkNotNullParameter(exceptOwnerList, "exceptOwnerList");
        Iterator it = new HashSet(this.f8764a).iterator();
        while (it.hasNext()) {
            Z6.d dVar = (Z6.d) it.next();
            contains2 = CollectionsKt___CollectionsKt.contains(exceptOwnerList, dVar.f8994b);
            if (!contains2) {
                AnimationThreadController.INSTANCE.postOnAnimatorThread(new c(dVar, 0));
            }
        }
        s sVar2 = this.f8766c;
        contains = CollectionsKt___CollectionsKt.contains(exceptOwnerList, sVar2 != null ? sVar2.f8824a : null);
        if (contains || (sVar = this.f8766c) == null) {
            return;
        }
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new d(sVar, 0));
    }

    @Override // X6.h
    public final void d(Point center, EdgeInsets padding, double d8, double d10, double d11) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Double valueOf = Double.valueOf(d11);
        KProperty<?>[] kPropertyArr = f8762B;
        this.f8778r.setValue(this, kPropertyArr[4], valueOf);
        this.f8774m.setValue(this, kPropertyArr[0], center);
        this.f8776p.setValue(this, kPropertyArr[2], padding);
        Double valueOf2 = Double.valueOf(d10);
        this.f8779s.setValue(this, kPropertyArr[5], valueOf2);
        Double valueOf3 = Double.valueOf(d8);
        this.f8775n.setValue(this, kPropertyArr[1], valueOf3);
    }

    public final Cancelable e(CameraOptions cameraOptions, t tVar, AnimatorListenerAdapter animatorListenerAdapter) {
        Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
        if (CameraOptionsUtils.isEmpty(cameraOptions)) {
            MapboxLogger.logW(StubApp.getString2(374), StubApp.getString2(7558));
            return new b(0);
        }
        r rVar = this.f8785z;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsFactory");
            rVar = null;
        }
        C0868a c0868a = r.f8819d;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
        ArrayList arrayList = new ArrayList();
        CameraState cameraState = rVar.f8823c.getCameraState();
        Point center = cameraOptions.getCenter();
        HashMap hashMap = r.f8820e;
        boolean z2 = true;
        String string2 = StubApp.getString2(7559);
        if (center != null) {
            Object[] copyOf = Arrays.copyOf(new Point[]{center}, 1);
            Intrinsics.checkNotNullParameter(copyOf, string2);
            Point center2 = cameraState.getCenter();
            Intrinsics.checkNotNullExpressionValue(center2, "currentCameraState.center");
            Unit unit = Unit.INSTANCE;
            arrayList.add(new Z6.f(new m(Arrays.copyOf(copyOf, copyOf.length), center2, null), z2, (Function1) hashMap.get(n.f8789a)));
        }
        ScreenCoordinate anchor = cameraOptions.getAnchor();
        if (anchor != null) {
            Object[] copyOf2 = Arrays.copyOf(new ScreenCoordinate[]{anchor}, 1);
            Intrinsics.checkNotNullParameter(copyOf2, string2);
            arrayList.add(new Z6.a(new m(Arrays.copyOf(copyOf2, copyOf2.length), anchor, null), (Function1) hashMap.get(n.f8793e)));
        }
        Double bearing = cameraOptions.getBearing();
        if (bearing != null) {
            Object[] copyOf3 = Arrays.copyOf(new Double[]{bearing}, 1);
            Intrinsics.checkNotNullParameter(copyOf3, string2);
            arrayList.add(new Z6.e(new m(Arrays.copyOf(copyOf3, copyOf3.length), Double.valueOf(cameraState.getBearing()), null), (Function1) hashMap.get(n.f8791c)));
        }
        EdgeInsets padding = cameraOptions.getPadding();
        if (padding != null) {
            Object[] copyOf4 = Arrays.copyOf(new EdgeInsets[]{padding}, 1);
            Intrinsics.checkNotNullParameter(copyOf4, string2);
            EdgeInsets padding2 = cameraState.getPadding();
            Intrinsics.checkNotNullExpressionValue(padding2, "currentCameraState.padding");
            arrayList.add(new Z6.g(new m(Arrays.copyOf(copyOf4, copyOf4.length), padding2, null), (Function1) hashMap.get(n.f8794f)));
        }
        Double pitch = cameraOptions.getPitch();
        if (pitch != null) {
            Object[] copyOf5 = Arrays.copyOf(new Double[]{pitch}, 1);
            Intrinsics.checkNotNullParameter(copyOf5, string2);
            arrayList.add(new Z6.h(new m(Arrays.copyOf(copyOf5, copyOf5.length), Double.valueOf(cameraState.getPitch()), null), (Function1) hashMap.get(n.f8792d)));
        }
        Double zoom = cameraOptions.getZoom();
        if (zoom != null) {
            Object[] copyOf6 = Arrays.copyOf(new Double[]{zoom}, 1);
            Intrinsics.checkNotNullParameter(copyOf6, string2);
            arrayList.add(new Z6.j(new m(Arrays.copyOf(copyOf6, copyOf6.length), Double.valueOf(cameraState.getZoom()), null), (Function1) hashMap.get(n.f8790b)));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            Intrinsics.checkNotNull(valueAnimator, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.animator.CameraAnimator<*>");
            arrayList2.add((Z6.d) valueAnimator);
        }
        Object[] array = arrayList2.toArray(new Z6.d[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return m((Z6.d[]) array, tVar, animatorListenerAdapter);
    }

    @Override // X6.j
    public final void g() {
        HashSet hashSet = this.f8764a;
        Object[] array = hashSet.toArray(new Z6.d[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Z6.d[] dVarArr = (Z6.d[]) array;
        n((ValueAnimator[]) Arrays.copyOf(dVarArr, dVarArr.length), true);
        s sVar = this.f8766c;
        if (sVar != null) {
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new d(sVar, 0));
        }
        this.f8767d.clear();
        this.f8768e.clear();
        this.f8771h.clear();
        this.j.clear();
        this.f8770g.clear();
        this.f8769f.clear();
        this.f8772k.clear();
        hashSet.clear();
    }

    public final Cancelable h(CameraOptions cameraOptions, t tVar) {
        Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
        if (CameraOptionsUtils.isEmpty(cameraOptions)) {
            MapboxLogger.logW(StubApp.getString2(374), StubApp.getString2(7560));
            return new b(0);
        }
        r rVar = this.f8785z;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsFactory");
            rVar = null;
        }
        C0868a c0868a = r.f8819d;
        return m(rVar.a(cameraOptions, null), tVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScreenCoordinate i() {
        return (ScreenCoordinate) this.f8777q.getValue(this, f8762B[3]);
    }

    @Override // X6.j
    public final void initialize() {
    }

    public final void j(ValueAnimator... animators) {
        Intrinsics.checkNotNullParameter(animators, "animators");
        int length = animators.length;
        String string2 = StubApp.getString2(374);
        if (length == 0) {
            MapboxLogger.logW(string2, StubApp.getString2(7561));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ValueAnimator valueAnimator : animators) {
            if (valueAnimator instanceof Z6.d) {
                Z6.d dVar = (Z6.d) valueAnimator;
                dVar.f9002l = true;
                if (dVar.f8994b == null) {
                    dVar.f8994b = StubApp.getString2(7562);
                }
                arrayList.add(valueAnimator);
            } else {
                MapboxLogger.logE(string2, StubApp.getString2(7563));
            }
        }
        Object[] array = arrayList.toArray(new Z6.d[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Z6.d[] dVarArr = (Z6.d[]) array;
        k((ValueAnimator[]) Arrays.copyOf(dVarArr, dVarArr.length));
        AnimatorSet animatorSet = new AnimatorSet();
        Object[] array2 = arrayList.toArray(new Z6.d[0]);
        Intrinsics.checkNotNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Z6.d[] dVarArr2 = (Z6.d[]) array2;
        animatorSet.playTogether((Animator[]) Arrays.copyOf(dVarArr2, dVarArr2.length));
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new Ac.m(animatorSet, 14));
    }

    public final void k(ValueAnimator... cameraAnimators) {
        Intrinsics.checkNotNullParameter(cameraAnimators, "cameraAnimators");
        AnimationThreadController.INSTANCE.postOnMainThread(new A9.m(6, cameraAnimators, this));
    }

    public final void l(ScreenCoordinate screenCoordinate) {
        this.f8777q.setValue(this, f8762B[3], screenCoordinate);
    }

    public final Cancelable m(Z6.d[] dVarArr, t tVar, AnimatorListenerAdapter animatorListenerAdapter) {
        String str;
        if (dVarArr.length == 0) {
            MapboxLogger.logW(StubApp.getString2(374), StubApp.getString2(7564));
            return new b(0);
        }
        int length = dVarArr.length;
        int i3 = 0;
        while (true) {
            str = tVar.f8826a;
            if (i3 >= length) {
                break;
            }
            Z6.d dVar = dVarArr[i3];
            dVar.f9002l = true;
            dVar.f8994b = str;
            i3++;
        }
        s sVar = this.f8766c;
        if (sVar != null) {
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new d(sVar, 0));
        }
        k((ValueAnimator[]) Arrays.copyOf(dVarArr, dVarArr.length));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(tVar.f8827b.longValue());
        TimeInterpolator timeInterpolator = tVar.f8828c;
        if (timeInterpolator != null) {
            animatorSet.setInterpolator(timeInterpolator);
        }
        AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
        animationThreadController.postOnAnimatorThread(new Ac.l(animatorSet, this, animatorListenerAdapter, 3));
        animatorSet.playTogether((Animator[]) Arrays.copyOf(dVarArr, dVarArr.length));
        MapboxMap mapboxMap = null;
        CameraAnimationHint a3 = k.a(animatorSet, this.f8773l, null);
        if (a3 != null) {
            MapboxMap mapboxMap2 = this.f8783x;
            if (mapboxMap2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapTransformDelegate");
            } else {
                mapboxMap = mapboxMap2;
            }
            mapboxMap.setCameraAnimationHint(a3);
        }
        s sVar2 = new s(str, animatorSet);
        this.f8766c = sVar2;
        animationThreadController.postOnAnimatorThread(new d(sVar2, 1));
        return sVar2;
    }

    public final void n(ValueAnimator[] cameraAnimators, boolean z2) {
        Intrinsics.checkNotNullParameter(cameraAnimators, "cameraAnimators");
        AnimationThreadController.INSTANCE.postOnMainThread(new i(cameraAnimators, this, z2));
    }
}
