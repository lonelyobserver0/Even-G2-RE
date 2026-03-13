package i9;

import D9.l;
import R8.C0250h;
import Y.m;
import Y6.j;
import Y6.k;
import Z6.f;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.CameraAnimationHintStage;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import com.stub.StubApp;
import j9.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import k9.C1117a;
import k9.C1118b;
import k9.C1119c;
import k9.g;
import k9.h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: m, reason: collision with root package name */
    public static final g f14948m = new g(3500);

    /* renamed from: n, reason: collision with root package name */
    public static final g f14949n = new g(1000);

    /* renamed from: a, reason: collision with root package name */
    public final MapboxMap f14950a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.a f14951b;

    /* renamed from: c, reason: collision with root package name */
    public final e f14952c;

    /* renamed from: d, reason: collision with root package name */
    public final a5.c f14953d;

    /* renamed from: e, reason: collision with root package name */
    public C0250h f14954e;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f14955f;

    /* renamed from: g, reason: collision with root package name */
    public g f14956g;

    /* renamed from: h, reason: collision with root package name */
    public long f14957h;

    /* renamed from: i, reason: collision with root package name */
    public CameraOptions f14958i;
    public final CopyOnWriteArraySet j;

    /* renamed from: k, reason: collision with root package name */
    public int f14959k;

    /* renamed from: l, reason: collision with root package name */
    public long f14960l;

    public d(MapboxMap mapboxMap, Y6.a cameraPlugin, e viewportDataSource) {
        m stateTransition = new m(mapboxMap, cameraPlugin);
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(cameraPlugin, "cameraPlugin");
        Intrinsics.checkNotNullParameter(viewportDataSource, "viewportDataSource");
        Intrinsics.checkNotNullParameter(stateTransition, "stateTransition");
        h updateFrameAnimatorsOptions = new h();
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(cameraPlugin, "cameraPlugin");
        Intrinsics.checkNotNullParameter(viewportDataSource, "viewportDataSource");
        Intrinsics.checkNotNullParameter(stateTransition, "stateTransition");
        Intrinsics.checkNotNullParameter(updateFrameAnimatorsOptions, "updateFrameAnimatorsOptions");
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(cameraPlugin, "cameraPlugin");
        Intrinsics.checkNotNullParameter(stateTransition, "stateTransition");
        Intrinsics.checkNotNullParameter(updateFrameAnimatorsOptions, "updateFrameAnimatorsOptions");
        a5.c animatorsCreator = new a5.c(stateTransition, cameraPlugin, mapboxMap);
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(cameraPlugin, "cameraPlugin");
        Intrinsics.checkNotNullParameter(viewportDataSource, "viewportDataSource");
        Intrinsics.checkNotNullParameter(animatorsCreator, "animatorsCreator");
        this.f14950a = mapboxMap;
        this.f14951b = cameraPlugin;
        this.f14952c = viewportDataSource;
        this.f14953d = animatorsCreator;
        this.f14955f = new CopyOnWriteArraySet();
        this.f14956g = f14949n;
        this.j = new CopyOnWriteArraySet();
        this.f14959k = 1;
        C1065a viewportDataSourceUpdateObserver = new C1065a(this);
        Intrinsics.checkNotNullParameter(viewportDataSourceUpdateObserver, "viewportDataSourceUpdateObserver");
        viewportDataSource.f15410s.add(viewportDataSourceUpdateObserver);
        viewportDataSourceUpdateObserver.a(viewportDataSource.f15409r);
    }

    public static void a(d dVar) {
        Object obj;
        AnimatorSet d8;
        Object next;
        g transitionOptions = f14948m;
        g frameTransitionOptions = f14949n;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(transitionOptions, "stateTransitionOptions");
        Intrinsics.checkNotNullParameter(frameTransitionOptions, "frameTransitionOptions");
        int c10 = AbstractC1856e.c(dVar.f14959k);
        if (c10 == 0 || c10 == 1 || c10 == 2) {
            CameraOptions cameraOptions = dVar.f14952c.f15409r.f15414b;
            a5.c cVar = dVar.f14953d;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
            Intrinsics.checkNotNullParameter(transitionOptions, "transitionOptions");
            m mVar = (m) cVar.f9282b;
            Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
            Intrinsics.checkNotNullParameter(transitionOptions, "transitionOptions");
            double zoom = ((MapboxMap) mVar.f8674b).getCameraState().getZoom();
            Double zoom2 = cameraOptions.getZoom();
            if (zoom2 == null) {
                zoom2 = Double.valueOf(zoom);
            }
            double doubleValue = zoom2.doubleValue();
            a5.c cVar2 = (a5.c) mVar.f8675c;
            if (zoom < doubleValue) {
                d8 = cVar2.N(cameraOptions, transitionOptions);
            } else {
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
                Intrinsics.checkNotNullParameter(transitionOptions, "transitionOptions");
                ArrayList arrayList = new ArrayList();
                ((MapboxMap) cVar2.f9282b).getCameraState();
                Point center = cameraOptions.getCenter();
                String string2 = StubApp.getString2(5688);
                Y6.a aVar = (Y6.a) cVar2.f9283c;
                String string22 = StubApp.getString2(9619);
                String string23 = StubApp.getString2(8469);
                String string24 = StubApp.getString2(7559);
                if (center != null) {
                    Object[] copyOf = Arrays.copyOf(new Point[]{center}, 1);
                    Intrinsics.checkNotNullParameter(copyOf, string24);
                    Intrinsics.checkNotNullParameter(string23, string22);
                    Y6.m mVar2 = new Y6.m(Arrays.copyOf(copyOf, copyOf.length), null, string23);
                    ((j) aVar).getClass();
                    Intrinsics.checkNotNullParameter(mVar2, string2);
                    arrayList.add(new f(mVar2, false, k9.e.f15502b));
                }
                Double zoom3 = cameraOptions.getZoom();
                if (zoom3 != null) {
                    Object[] copyOf2 = Arrays.copyOf(new Double[]{zoom3}, 1);
                    Intrinsics.checkNotNullParameter(copyOf2, string24);
                    Intrinsics.checkNotNullParameter(string23, string22);
                    Y6.m mVar3 = new Y6.m(Arrays.copyOf(copyOf2, copyOf2.length), null, string23);
                    ((j) aVar).getClass();
                    Intrinsics.checkNotNullParameter(mVar3, string2);
                    arrayList.add(new Z6.j(mVar3, k9.e.f15503c));
                }
                Double bearing = cameraOptions.getBearing();
                if (bearing != null) {
                    Object[] copyOf3 = Arrays.copyOf(new Double[]{bearing}, 1);
                    Intrinsics.checkNotNullParameter(copyOf3, string24);
                    Intrinsics.checkNotNullParameter(string23, string22);
                    arrayList.add(k.b(aVar, new Y6.m(Arrays.copyOf(copyOf3, copyOf3.length), null, string23), k9.e.f15504d));
                }
                Double pitch = cameraOptions.getPitch();
                if (pitch != null) {
                    Object[] copyOf4 = Arrays.copyOf(new Double[]{pitch}, 1);
                    Intrinsics.checkNotNullParameter(copyOf4, string24);
                    Intrinsics.checkNotNullParameter(string23, string22);
                    Y6.m mVar4 = new Y6.m(Arrays.copyOf(copyOf4, copyOf4.length), null, string23);
                    ((j) aVar).getClass();
                    Intrinsics.checkNotNullParameter(mVar4, string2);
                    arrayList.add(new Z6.h(mVar4, k9.e.f15505e));
                }
                EdgeInsets padding = cameraOptions.getPadding();
                if (padding != null) {
                    Object[] copyOf5 = Arrays.copyOf(new EdgeInsets[]{padding}, 1);
                    Intrinsics.checkNotNullParameter(copyOf5, string24);
                    Intrinsics.checkNotNullParameter(string23, string22);
                    obj = null;
                    Y6.m mVar5 = new Y6.m(Arrays.copyOf(copyOf5, copyOf5.length), null, string23);
                    ((j) aVar).getClass();
                    Intrinsics.checkNotNullParameter(mVar5, string2);
                    arrayList.add(new Z6.g(mVar5, k9.e.f15506f));
                } else {
                    obj = null;
                }
                d8 = W.a.d(arrayList);
                Intrinsics.checkNotNullParameter(d8, "<this>");
                ArrayList<Animator> childAnimations = d8.getChildAnimations();
                Intrinsics.checkNotNullExpressionValue(childAnimations, "childAnimations");
                Iterator<T> it = childAnimations.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        Animator animator = (Animator) next;
                        long duration = animator.getDuration() + animator.getStartDelay();
                        do {
                            Object next2 = it.next();
                            Animator animator2 = (Animator) next2;
                            long duration2 = animator2.getDuration() + animator2.getStartDelay();
                            if (duration < duration2) {
                                next = next2;
                                duration = duration2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = obj;
                }
                Animator animator3 = (Animator) next;
                if (animator3 != null) {
                    long duration3 = animator3.getDuration() + animator3.getStartDelay();
                    if (duration3 > 3500) {
                        double d10 = 3500 / duration3;
                        ArrayList<Animator> childAnimations2 = d8.getChildAnimations();
                        Intrinsics.checkNotNullExpressionValue(childAnimations2, "childAnimations");
                        for (Animator animator4 : childAnimations2) {
                            animator4.setStartDelay((long) (animator4.getStartDelay() * d10));
                            animator4.setDuration((long) (animator4.getDuration() * d10));
                        }
                    }
                }
            }
            C0250h c0250h = new C0250h((Y6.a) cVar.f9283c, (MapboxMap) cVar.f9284d, d8);
            c listener = new c(dVar, 4, frameTransitionOptions, 5);
            Intrinsics.checkNotNullParameter(listener, "listener");
            d8.addListener(new C1119c(listener, c0250h));
            dVar.b(c0250h);
        }
    }

    public final void b(C0250h c0250h) {
        C0250h c0250h2 = this.f14954e;
        if (c0250h2 != null) {
            ((AnimatorSet) c0250h2.f6298c).cancel();
            ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) c0250h2.f6300e;
            ((j) ((Y6.a) c0250h2.f6296a)).n((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length), false);
        }
        this.f14954e = null;
        ((j) this.f14951b).l(null);
        ValueAnimator[] valueAnimatorArr2 = (ValueAnimator[]) c0250h.f6300e;
        ((j) ((Y6.a) c0250h.f6296a)).k((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr2, valueAnimatorArr2.length));
        MapboxMap mapboxMap = (MapboxMap) c0250h.f6297b;
        CameraState cameraState = mapboxMap.getCameraState();
        AnimatorSet animatorSet = (AnimatorSet) c0250h.f6298c;
        CameraAnimationHint a3 = k.a(animatorSet, (List) c0250h.f6299d, cameraState);
        if (a3 != null) {
            mapboxMap.setCameraAnimationHint(a3);
        }
        animatorSet.start();
        this.f14954e = c0250h;
    }

    public final void c(j9.f fVar) {
        CameraOptions cameraOptions;
        int c10 = AbstractC1856e.c(this.f14959k);
        String string2 = StubApp.getString2(18605);
        String string22 = StubApp.getString2(7559);
        String string23 = StubApp.getString2(8469);
        String string24 = StubApp.getString2(9619);
        String string25 = StubApp.getString2(5688);
        String string26 = StubApp.getString2(7578);
        String string27 = StubApp.getString2(18606);
        a5.c cVar = this.f14953d;
        if (c10 == 2) {
            CameraOptions cameraOptions2 = fVar.f15413a;
            g gVar = this.f14956g;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(cameraOptions2, string26);
            Intrinsics.checkNotNullParameter(gVar, string27);
            m mVar = (m) cVar.f9282b;
            Intrinsics.checkNotNullParameter(cameraOptions2, string26);
            Intrinsics.checkNotNullParameter(gVar, string27);
            a5.c cVar2 = (a5.c) mVar.f8675c;
            cVar2.getClass();
            Intrinsics.checkNotNullParameter(cameraOptions2, string26);
            Intrinsics.checkNotNullParameter(gVar, string27);
            C1118b c1118b = (C1118b) cVar2.f9284d;
            c1118b.getClass();
            Intrinsics.checkNotNullParameter(cameraOptions2, string26);
            Intrinsics.checkNotNullParameter(gVar, string27);
            ArrayList arrayList = new ArrayList();
            long coerceAtMost = RangesKt.coerceAtMost(1000L, gVar.f15509a);
            Point center = cameraOptions2.getCenter();
            Y6.a aVar = c1118b.f15499a;
            if (center != null) {
                Object[] copyOf = Arrays.copyOf(new Point[]{center}, 1);
                Intrinsics.checkNotNullParameter(copyOf, string22);
                Intrinsics.checkNotNullParameter(string23, string24);
                Y6.m mVar2 = new Y6.m(Arrays.copyOf(copyOf, copyOf.length), null, string23);
                C1117a c1117a = new C1117a(coerceAtMost, 0);
                ((j) aVar).getClass();
                Intrinsics.checkNotNullParameter(mVar2, string25);
                cameraOptions = cameraOptions2;
                arrayList.add(new f(mVar2, false, c1117a));
            } else {
                cameraOptions = cameraOptions2;
            }
            Double zoom = cameraOptions.getZoom();
            if (zoom != null) {
                Object[] copyOf2 = Arrays.copyOf(new Double[]{zoom}, 1);
                Intrinsics.checkNotNullParameter(copyOf2, string22);
                Intrinsics.checkNotNullParameter(string23, string24);
                Y6.m mVar3 = new Y6.m(Arrays.copyOf(copyOf2, copyOf2.length), null, string23);
                C1117a c1117a2 = new C1117a(coerceAtMost, 1);
                ((j) aVar).getClass();
                Intrinsics.checkNotNullParameter(mVar3, string25);
                arrayList.add(new Z6.j(mVar3, c1117a2));
            }
            Double bearing = cameraOptions.getBearing();
            if (bearing != null) {
                Object[] copyOf3 = Arrays.copyOf(new Double[]{bearing}, 1);
                Intrinsics.checkNotNullParameter(copyOf3, string22);
                Intrinsics.checkNotNullParameter(string23, string24);
                arrayList.add(k.b(aVar, new Y6.m(Arrays.copyOf(copyOf3, copyOf3.length), null, string23), new C1117a(coerceAtMost, 2)));
            }
            Double pitch = cameraOptions.getPitch();
            if (pitch != null) {
                Object[] copyOf4 = Arrays.copyOf(new Double[]{pitch}, 1);
                Intrinsics.checkNotNullParameter(copyOf4, string22);
                Intrinsics.checkNotNullParameter(string23, string24);
                Y6.m mVar4 = new Y6.m(Arrays.copyOf(copyOf4, copyOf4.length), null, string23);
                C1117a c1117a3 = new C1117a(coerceAtMost, 3);
                ((j) aVar).getClass();
                Intrinsics.checkNotNullParameter(mVar4, string25);
                arrayList.add(new Z6.h(mVar4, c1117a3));
            }
            EdgeInsets padding = cameraOptions.getPadding();
            if (padding != null) {
                Object[] copyOf5 = Arrays.copyOf(new EdgeInsets[]{padding}, 1);
                Intrinsics.checkNotNullParameter(copyOf5, string22);
                Intrinsics.checkNotNullParameter(string23, string24);
                Y6.m mVar5 = new Y6.m(Arrays.copyOf(copyOf5, copyOf5.length), null, string23);
                C1117a c1117a4 = new C1117a(coerceAtMost, 4);
                ((j) aVar).getClass();
                Intrinsics.checkNotNullParameter(mVar5, string25);
                arrayList.add(new Z6.g(mVar5, c1117a4));
            }
            C0250h c0250h = new C0250h((Y6.a) cVar.f9283c, (MapboxMap) cVar.f9284d, W.a.d(arrayList));
            b bVar = new b(this);
            Intrinsics.checkNotNullParameter(bVar, string2);
            ((CopyOnWriteArrayList) c0250h.f6301f).add(bVar);
            b(c0250h);
            return;
        }
        if (c10 != 4) {
            return;
        }
        CameraOptions cameraOptions3 = fVar.f15413a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14957h >= 1000 && !Intrinsics.areEqual(this.f14958i, cameraOptions3)) {
            this.f14957h = elapsedRealtime;
            this.f14958i = cameraOptions3;
            l.f(StubApp.getString2(18607) + cameraOptions3, StubApp.getString2(18604));
            CameraAnimationHint build = new CameraAnimationHint.Builder().stages(CollectionsKt.listOf(new CameraAnimationHintStage.Builder().camera(cameraOptions3).progress(1L).build())).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().stages(\n      …                ).build()");
            this.f14950a.setCameraAnimationHint(build);
        }
        g gVar2 = this.f14956g;
        cVar.getClass();
        CameraOptions cameraOptions4 = fVar.f15414b;
        Intrinsics.checkNotNullParameter(cameraOptions4, string26);
        Intrinsics.checkNotNullParameter(gVar2, string27);
        m mVar6 = (m) cVar.f9282b;
        Intrinsics.checkNotNullParameter(cameraOptions4, string26);
        Intrinsics.checkNotNullParameter(gVar2, string27);
        a5.c cVar3 = (a5.c) mVar6.f8675c;
        cVar3.getClass();
        Intrinsics.checkNotNullParameter(cameraOptions4, string26);
        Intrinsics.checkNotNullParameter(gVar2, string27);
        C1118b c1118b2 = (C1118b) cVar3.f9284d;
        c1118b2.getClass();
        Intrinsics.checkNotNullParameter(cameraOptions4, string26);
        Intrinsics.checkNotNullParameter(gVar2, string27);
        ArrayList arrayList2 = new ArrayList();
        long coerceAtMost2 = RangesKt.coerceAtMost(1000L, gVar2.f15509a);
        Point center2 = cameraOptions4.getCenter();
        Y6.a aVar2 = c1118b2.f15499a;
        if (center2 != null) {
            Object[] copyOf6 = Arrays.copyOf(new Point[]{center2}, 1);
            Intrinsics.checkNotNullParameter(copyOf6, string22);
            Intrinsics.checkNotNullParameter(string23, string24);
            Y6.m mVar7 = new Y6.m(Arrays.copyOf(copyOf6, copyOf6.length), null, string23);
            C1117a c1117a5 = new C1117a(coerceAtMost2, 0);
            ((j) aVar2).getClass();
            Intrinsics.checkNotNullParameter(mVar7, string25);
            arrayList2.add(new f(mVar7, false, c1117a5));
        }
        Double zoom2 = cameraOptions4.getZoom();
        if (zoom2 != null) {
            Object[] copyOf7 = Arrays.copyOf(new Double[]{zoom2}, 1);
            Intrinsics.checkNotNullParameter(copyOf7, string22);
            Intrinsics.checkNotNullParameter(string23, string24);
            Y6.m mVar8 = new Y6.m(Arrays.copyOf(copyOf7, copyOf7.length), null, string23);
            C1117a c1117a6 = new C1117a(coerceAtMost2, 1);
            ((j) aVar2).getClass();
            Intrinsics.checkNotNullParameter(mVar8, string25);
            arrayList2.add(new Z6.j(mVar8, c1117a6));
        }
        Double bearing2 = cameraOptions4.getBearing();
        if (bearing2 != null) {
            Object[] copyOf8 = Arrays.copyOf(new Double[]{bearing2}, 1);
            Intrinsics.checkNotNullParameter(copyOf8, string22);
            Intrinsics.checkNotNullParameter(string23, string24);
            arrayList2.add(k.b(aVar2, new Y6.m(Arrays.copyOf(copyOf8, copyOf8.length), null, string23), new C1117a(coerceAtMost2, 2)));
        }
        Double pitch2 = cameraOptions4.getPitch();
        if (pitch2 != null) {
            Object[] copyOf9 = Arrays.copyOf(new Double[]{pitch2}, 1);
            Intrinsics.checkNotNullParameter(copyOf9, string22);
            Intrinsics.checkNotNullParameter(string23, string24);
            Y6.m mVar9 = new Y6.m(Arrays.copyOf(copyOf9, copyOf9.length), null, string23);
            C1117a c1117a7 = new C1117a(coerceAtMost2, 3);
            ((j) aVar2).getClass();
            Intrinsics.checkNotNullParameter(mVar9, string25);
            arrayList2.add(new Z6.h(mVar9, c1117a7));
        }
        EdgeInsets padding2 = cameraOptions4.getPadding();
        if (padding2 != null) {
            Object[] copyOf10 = Arrays.copyOf(new EdgeInsets[]{padding2}, 1);
            Intrinsics.checkNotNullParameter(copyOf10, string22);
            Intrinsics.checkNotNullParameter(string23, string24);
            Y6.m mVar10 = new Y6.m(Arrays.copyOf(copyOf10, copyOf10.length), null, string23);
            C1117a c1117a8 = new C1117a(coerceAtMost2, 4);
            ((j) aVar2).getClass();
            Intrinsics.checkNotNullParameter(mVar10, string25);
            arrayList2.add(new Z6.g(mVar10, c1117a8));
        }
        C0250h c0250h2 = new C0250h((Y6.a) cVar.f9283c, (MapboxMap) cVar.f9284d, W.a.d(arrayList2));
        b bVar2 = new b(this);
        Intrinsics.checkNotNullParameter(bVar2, string2);
        ((CopyOnWriteArrayList) c0250h2.f6301f).add(bVar2);
        b(c0250h2);
    }
}
