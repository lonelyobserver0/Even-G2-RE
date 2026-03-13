package l7;

import Qb.InterfaceC0221t0;
import Qb.J;
import Qb.L;
import Tb.b0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import b3.C0506h;
import com.mapbox.common.location.LocationError;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import i5.C1059c;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import n7.C1391a;
import n7.C1392b;
import n7.C1393c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r implements X6.j, X6.m, X6.c, X6.a {

    /* renamed from: a, reason: collision with root package name */
    public A3.s f16787a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f16788b;

    /* renamed from: c, reason: collision with root package name */
    public v f16789c;

    /* renamed from: d, reason: collision with root package name */
    public C1059c f16790d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16791e;

    /* renamed from: f, reason: collision with root package name */
    public Double f16792f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f16793g = new CopyOnWriteArraySet();

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f16794h = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet j = new CopyOnWriteArraySet();

    /* renamed from: k, reason: collision with root package name */
    public final p f16795k = new p(this);

    /* renamed from: l, reason: collision with root package name */
    public final C0506h f16796l = new C0506h(this, 1);

    /* renamed from: m, reason: collision with root package name */
    public final q f16797m = new q(this);

    /* renamed from: n, reason: collision with root package name */
    public C1393c f16798n;

    @Override // X6.j
    public final void a(A3.s delegateProvider) {
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        this.f16787a = delegateProvider;
    }

    @Override // X6.m
    public final void b(Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        v vVar = this.f16789c;
        if (vVar != null) {
            Intrinsics.checkNotNullParameter(style, "style");
            vVar.f16813n.l(style);
            a5.c cVar = vVar.f16804d;
            Intrinsics.checkNotNullParameter(style, "style");
            cVar.f9282b = style;
        }
    }

    @Override // X6.a
    public final void e(Context context, AttributeSet attributeSet, float f10) {
        X6.f locationPuck;
        List emptyList;
        List emptyList2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16788b = new WeakReference(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.f16820a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            boolean z2 = obtainStyledAttributes.getBoolean(91, false);
            int i3 = obtainStyledAttributes.getInt(54, -1);
            if (i3 == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(59, -1);
                Integer valueOf = Integer.valueOf(resourceId);
                if (resourceId == -1) {
                    valueOf = null;
                }
                ImageHolder from = valueOf != null ? ImageHolder.INSTANCE.from(valueOf.intValue()) : null;
                int resourceId2 = obtainStyledAttributes.getResourceId(55, -1);
                Integer valueOf2 = Integer.valueOf(resourceId2);
                if (resourceId2 == -1) {
                    valueOf2 = null;
                }
                ImageHolder from2 = valueOf2 != null ? ImageHolder.INSTANCE.from(valueOf2.intValue()) : null;
                int resourceId3 = obtainStyledAttributes.getResourceId(58, -1);
                Integer valueOf3 = Integer.valueOf(resourceId3);
                if (resourceId3 == -1) {
                    valueOf3 = null;
                }
                locationPuck = new X6.d(from, from2, valueOf3 != null ? ImageHolder.INSTANCE.from(valueOf3.intValue()) : null, obtainStyledAttributes.getString(57), obtainStyledAttributes.getFloat(56, 1.0f));
            } else if (i3 != 1) {
                locationPuck = Ec.l.e(z2);
            } else {
                String string = obtainStyledAttributes.getString(86);
                if (string == null) {
                    throw new IllegalArgumentException(StubApp.getString2("20936"));
                }
                List listOf = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(obtainStyledAttributes.getFloat(89, 0.0f)), Float.valueOf(obtainStyledAttributes.getFloat(88, 0.0f))});
                float f11 = obtainStyledAttributes.getFloat(71, 1.0f);
                List listOf2 = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(obtainStyledAttributes.getFloat(80, 1.0f)), Float.valueOf(obtainStyledAttributes.getFloat(81, 1.0f)), Float.valueOf(obtainStyledAttributes.getFloat(82, 1.0f))});
                String string2 = obtainStyledAttributes.getString(78);
                List listOf3 = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(obtainStyledAttributes.getFloat(84, 0.0f)), Float.valueOf(obtainStyledAttributes.getFloat(83, 0.0f)), Float.valueOf(obtainStyledAttributes.getFloat(85, 0.0f))});
                List listOf4 = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(obtainStyledAttributes.getFloat(75, 0.0f)), Float.valueOf(obtainStyledAttributes.getFloat(76, 0.0f)), Float.valueOf(obtainStyledAttributes.getFloat(77, 90.0f))});
                boolean z10 = obtainStyledAttributes.getBoolean(61, true);
                boolean z11 = obtainStyledAttributes.getBoolean(73, true);
                X6.o oVar = X6.o.values()[obtainStyledAttributes.getInt(79, 1)];
                float f12 = obtainStyledAttributes.getFloat(69, 1.0f);
                String string3 = obtainStyledAttributes.getString(70);
                String string4 = obtainStyledAttributes.getString(72);
                String string5 = obtainStyledAttributes.getString(74);
                int color = obtainStyledAttributes.getColor(62, Color.parseColor(StubApp.getString2("20935")));
                String string6 = obtainStyledAttributes.getString(63);
                float f13 = obtainStyledAttributes.getFloat(64, 0.0f);
                String string7 = obtainStyledAttributes.getString(65);
                try {
                    String[] stringArray = obtainStyledAttributes.getResources().getStringArray(obtainStyledAttributes.getResourceId(60, 0));
                    Intrinsics.checkNotNullExpressionValue(stringArray, "typedArray.resources.get…k3DMaterialOverrides, 0))");
                    emptyList = ArraysKt.toList(stringArray);
                } catch (Exception unused) {
                    emptyList = CollectionsKt.emptyList();
                }
                List list = emptyList;
                try {
                    String[] stringArray2 = obtainStyledAttributes.getResources().getStringArray(obtainStyledAttributes.getResourceId(87, 0));
                    Intrinsics.checkNotNullExpressionValue(stringArray2, "typedArray.resources.get…nPuck3DNodeOverrides, 0))");
                    emptyList2 = ArraysKt.toList(stringArray2);
                } catch (Exception unused2) {
                    emptyList2 = CollectionsKt.emptyList();
                }
                List list2 = emptyList2;
                X6.n nVar = X6.n.values()[obtainStyledAttributes.getInt(68, 1)];
                String string8 = obtainStyledAttributes.getString(66);
                if (string8 == null) {
                    string8 = StubApp.getString2("5107");
                }
                locationPuck = new X6.e(string, listOf, f11, listOf2, string2, listOf3, listOf4, z10, z11, oVar, f12, string3, string4, string5, color, string6, f13, string7, list, list2, nVar, string8, obtainStyledAttributes.getString(67));
            }
            C1391a initializer = new C1391a(obtainStyledAttributes, f10, z2);
            Intrinsics.checkNotNullParameter(locationPuck, "locationPuck");
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            C1392b c1392b = new C1392b(locationPuck);
            initializer.invoke(c1392b);
            C1393c a3 = c1392b.a();
            obtainStyledAttributes.recycle();
            Intrinsics.checkNotNullParameter(a3, "<set-?>");
            this.f16798n = a3;
            if (j().f17866a && this.f16790d == null) {
                Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(origApplicationContext, "context.applicationContext");
                C1059c c1059c = new C1059c(origApplicationContext, 8);
                C1393c j = j();
                ((b0) c1059c.f14845d).g(j.f17874k ? j.f17875l : null);
                this.f16790d = c1059c;
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // X6.j
    public final void g() {
    }

    public final void h() {
        WeakReference weakReference;
        A3.s sVar;
        if (j().f17866a) {
            A3.s sVar2 = this.f16787a;
            String string2 = StubApp.getString2(20937);
            if (sVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                sVar2 = null;
            }
            MapboxMap style = (MapboxMap) sVar2.f196h;
            v vVar = this.f16789c;
            if (vVar != null && vVar.f16813n.c() && this.f16791e) {
                return;
            }
            if (this.f16789c == null) {
                C1393c j = j();
                WeakReference weakReference2 = this.f16788b;
                if (weakReference2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("weakContext");
                    weakReference = null;
                } else {
                    weakReference = weakReference2;
                }
                A3.s sVar3 = this.f16787a;
                if (sVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    sVar = null;
                } else {
                    sVar = sVar3;
                }
                String str = j().f17873h;
                String str2 = j().j;
                Intrinsics.checkNotNullParameter(style, "style");
                a5.c cVar = new a5.c(18, false);
                cVar.f9282b = style;
                cVar.f9283c = str;
                cVar.f9284d = str2;
                float pixelRatio = style.getPixelRatio();
                p indicatorPositionChangedListener = this.f16795k;
                Intrinsics.checkNotNullParameter(indicatorPositionChangedListener, "indicatorPositionChangedListener");
                String string22 = StubApp.getString2(20938);
                C0506h c0506h = this.f16796l;
                Intrinsics.checkNotNullParameter(c0506h, string22);
                q indicatorAccuracyRadiusChangedListener = this.f16797m;
                Intrinsics.checkNotNullParameter(indicatorAccuracyRadiusChangedListener, "indicatorAccuracyRadiusChangedListener");
                p2.h hVar = new p2.h();
                hVar.f19671a = new m7.f(c0506h);
                hVar.f19672b = new m7.g(indicatorPositionChangedListener);
                hVar.f19673c = new m7.c(indicatorAccuracyRadiusChangedListener);
                hVar.f19674d = new m7.h(pixelRatio);
                this.f16789c = new v(j, weakReference, sVar, cVar, hVar);
            }
            v vVar2 = this.f16789c;
            if (vVar2 != null) {
                vVar2.c(style);
            }
            v vVar3 = this.f16789c;
            if (vVar3 != null) {
                m7.h hVar2 = (m7.h) vVar3.f16805e.f19674d;
                if (hVar2.f17139d) {
                    hVar2.d();
                }
            }
            C1059c c1059c = this.f16790d;
            if (c1059c != null) {
                Intrinsics.checkNotNullParameter(this, "locationConsumer");
                LocationError error = (LocationError) c1059c.f14844c;
                if (error != null) {
                    Intrinsics.checkNotNull(error);
                    Intrinsics.checkNotNullParameter(error, "error");
                    if (this.f16789c != null) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        MapboxLogger.logW(StubApp.getString2(20940), StubApp.getString2(20939) + error);
                    }
                } else {
                    InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) ((ConcurrentHashMap) c1059c.f14848g).put(this, L.j(J.a(CoroutineContext.Element.DefaultImpls.plus(L.a(), (Rb.d) c1059c.f14843b)), null, new C1240j(c1059c, this, null), 3));
                    if (interfaceC0221t0 != null) {
                        interfaceC0221t0.d(null);
                    }
                }
            }
            this.f16791e = true;
        }
    }

    public final void i() {
        if (j().f17866a && !this.f16791e) {
            WeakReference weakReference = this.f16788b;
            if (weakReference == null) {
                Intrinsics.throwUninitializedPropertyAccessException("weakContext");
                weakReference = null;
            }
            Context context = (Context) weakReference.get();
            if (context != null) {
                if (this.f16790d == null) {
                    this.f16790d = new C1059c(context, 8);
                }
                h();
            }
        }
        if (!j().f17866a) {
            v vVar = this.f16789c;
            if (vVar != null) {
                vVar.f16806f = true;
                vVar.f16813n.hide();
                p2.h hVar = vVar.f16805e;
                ((m7.f) hVar.f19671a).b();
                ((m7.g) hVar.f19672b).b();
                ((m7.h) hVar.f19674d).b();
                ((m7.c) hVar.f19673c).b();
                vVar.f16813n.o();
                vVar.f16813n.k();
            }
            this.f16789c = null;
            C1059c c1059c = this.f16790d;
            if (c1059c != null) {
                c1059c.r(this);
            }
            this.f16791e = false;
            return;
        }
        v vVar2 = this.f16789c;
        if (vVar2 != null) {
            C1393c settings = j();
            Intrinsics.checkNotNullParameter(settings, "settings");
            vVar2.f16801a = settings;
            String str = settings.f17873h;
            a5.c cVar = vVar2.f16804d;
            cVar.f9283c = str;
            cVar.f9284d = settings.j;
            vVar2.f16813n.o();
            vVar2.f16813n.k();
            t b2 = vVar2.b(settings);
            vVar2.f16813n = b2;
            b2.j(settings.f17876m);
            vVar2.c((MapboxMap) vVar2.f16803c.f196h);
        }
        C1059c c1059c2 = this.f16790d;
        if (c1059c2 == null) {
            c1059c2 = null;
        }
        if (c1059c2 != null) {
            C1393c j = j();
            ((b0) c1059c2.f14845d).g(j.f17874k ? j.f17875l : null);
        }
    }

    @Override // X6.j
    public final void initialize() {
    }

    public final C1393c j() {
        C1393c c1393c = this.f16798n;
        if (c1393c != null) {
            return c1393c;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalSettings");
        return null;
    }

    public final void k() {
        if (!j().f17866a) {
            C1392b d8 = j().d();
            d8.f17855b = true;
            C1393c a3 = d8.a();
            Intrinsics.checkNotNullParameter(a3, "<set-?>");
            this.f16798n = a3;
            i();
        }
    }

    public final void l(X6.d locationPuck) {
        Intrinsics.checkNotNullParameter(locationPuck, "value");
        if (Intrinsics.areEqual(j().f17877n, locationPuck)) {
            return;
        }
        C1392b d8 = j().d();
        Intrinsics.checkNotNullParameter(locationPuck, "locationPuck");
        d8.f17854a = locationPuck;
        C1393c a3 = d8.a();
        Intrinsics.checkNotNullParameter(a3, "<set-?>");
        this.f16798n = a3;
        i();
    }

    public final void m() {
        X6.s puckBearing = X6.s.f8473b;
        Intrinsics.checkNotNullParameter(puckBearing, "value");
        if (j().f17875l != puckBearing) {
            C1392b d8 = j().d();
            Intrinsics.checkNotNullParameter(puckBearing, "puckBearing");
            d8.f17864l = puckBearing;
            C1393c a3 = d8.a();
            Intrinsics.checkNotNullParameter(a3, "<set-?>");
            this.f16798n = a3;
            i();
        }
    }

    public final void n() {
        if (!j().f17874k) {
            C1392b d8 = j().d();
            d8.f17863k = true;
            C1393c a3 = d8.a();
            Intrinsics.checkNotNullParameter(a3, "<set-?>");
            this.f16798n = a3;
            i();
        }
    }

    @Override // X6.c
    public final void onStart() {
        h();
    }

    @Override // X6.c
    public final void onStop() {
        this.f16791e = false;
        v vVar = this.f16789c;
        if (vVar != null) {
            p2.h hVar = vVar.f16805e;
            ((m7.f) hVar.f19671a).b();
            ((m7.g) hVar.f19672b).b();
            ((m7.h) hVar.f19674d).b();
            ((m7.c) hVar.f19673c).b();
        }
        C1059c c1059c = this.f16790d;
        if (c1059c != null) {
            c1059c.r(this);
        }
    }
}
