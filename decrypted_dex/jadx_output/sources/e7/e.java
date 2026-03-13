package e7;

import A3.s;
import D5.A;
import N.K;
import X6.h;
import X6.u;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.measurement.D1;
import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapController;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.stub.StubApp;
import d7.C0806a;
import f7.C0930a;
import f7.C0931b;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e implements u, h, X6.c {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f13656a;

    /* renamed from: b, reason: collision with root package name */
    public final ValueAnimator f13657b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0850a f13658c;

    /* renamed from: d, reason: collision with root package name */
    public MapboxMap f13659d;

    /* renamed from: e, reason: collision with root package name */
    public double f13660e;

    /* renamed from: f, reason: collision with root package name */
    public Y6.a f13661f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13662g;

    /* renamed from: h, reason: collision with root package name */
    public C0931b f13663h;
    public final CopyOnWriteArraySet j;

    public e() {
        ValueAnimator fadeAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(fadeAnimator, "ofFloat(1f, 0f)");
        String string2 = StubApp.getString2(9628);
        d dVar = d.f13653b;
        Intrinsics.checkNotNullParameter(dVar, string2);
        Intrinsics.checkNotNullParameter(fadeAnimator, "fadeAnimator");
        this.f13656a = dVar;
        this.f13657b = fadeAnimator;
        String string22 = StubApp.getString2(9629);
        d dVar2 = d.f13654c;
        Intrinsics.checkNotNullParameter(dVar2, string22);
        C0930a c0930a = new C0930a();
        c0930a.f14158a = true;
        c0930a.f14159b = 8388661;
        c0930a.f14160c = 4.0f;
        c0930a.f14161d = 4.0f;
        c0930a.f14162e = 4.0f;
        c0930a.f14163f = 4.0f;
        c0930a.f14164g = 1.0f;
        c0930a.f14166i = true;
        c0930a.j = true;
        c0930a.f14167k = true;
        dVar2.invoke(c0930a);
        this.f13663h = new C0931b(c0930a.f14158a, c0930a.f14159b, c0930a.f14160c, c0930a.f14161d, c0930a.f14162e, c0930a.f14163f, c0930a.f14164g, c0930a.f14165h, c0930a.f14166i, c0930a.j, c0930a.f14167k, c0930a.f14168l);
        this.j = new CopyOnWriteArraySet();
        fadeAnimator.setDuration(500L);
        fadeAnimator.setStartDelay(500L);
        fadeAnimator.addListener(new Y6.f(this, 1));
        fadeAnimator.addUpdateListener(new K(this, 2));
    }

    @Override // X6.j
    public final void a(s delegateProvider) {
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        MapboxMap mapboxMap = (MapboxMap) delegateProvider.f190b;
        this.f13659d = mapboxMap;
        if (mapboxMap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapCameraManager");
            mapboxMap = null;
        }
        this.f13660e = mapboxMap.getCameraState().getBearing();
        Y6.a aVar = (Y6.a) ((MapController) delegateProvider.f194f).getPlugin(StubApp.getString2(7571));
        if (aVar != null) {
            this.f13661f = aVar;
        } else {
            String exceptionMessage = StubApp.getString2(8517);
            Intrinsics.checkNotNullParameter(exceptionMessage, "exceptionMessage");
            throw new A(exceptionMessage, 2);
        }
    }

    public final boolean b() {
        if (!this.f13663h.f14177k) {
            return false;
        }
        InterfaceC0850a interfaceC0850a = this.f13658c;
        InterfaceC0850a interfaceC0850a2 = null;
        String string2 = StubApp.getString2(17378);
        if (interfaceC0850a == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            interfaceC0850a = null;
        }
        if (Math.abs(((c) interfaceC0850a).getCompassRotation()) >= 359.0d) {
            return true;
        }
        InterfaceC0850a interfaceC0850a3 = this.f13658c;
        if (interfaceC0850a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            interfaceC0850a2 = interfaceC0850a3;
        }
        return ((double) Math.abs(((c) interfaceC0850a2).getCompassRotation())) <= 1.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X6.u
    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC0850a interfaceC0850a = view instanceof InterfaceC0850a ? (InterfaceC0850a) view : null;
        if (interfaceC0850a == null) {
            throw new IllegalArgumentException(StubApp.getString2(17379));
        }
        this.f13658c = interfaceC0850a;
        h(false);
    }

    @Override // X6.h
    public final void d(Point center, EdgeInsets padding, double d8, double d10, double d11) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(padding, "padding");
        e(d11);
    }

    public final void e(double d8) {
        this.f13660e = d8;
        InterfaceC0850a interfaceC0850a = this.f13658c;
        if (interfaceC0850a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("compassView");
            interfaceC0850a = null;
        }
        ((c) interfaceC0850a).setCompassRotation(-((float) d8));
        h(true);
    }

    @Override // X6.u
    public final View f(MapView mapView, AttributeSet attributeSet, float f10) {
        Intrinsics.checkNotNullParameter(mapView, StubApp.getString2(3464));
        Context context = mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "mapView.context");
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f13664a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            C0806a initializer = new C0806a(obtainStyledAttributes, f10, 1);
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            C0930a c0930a = new C0930a();
            c0930a.f14158a = true;
            c0930a.f14159b = 8388661;
            c0930a.f14160c = 4.0f;
            c0930a.f14161d = 4.0f;
            c0930a.f14162e = 4.0f;
            c0930a.f14163f = 4.0f;
            c0930a.f14164g = 1.0f;
            c0930a.f14166i = true;
            c0930a.j = true;
            c0930a.f14167k = true;
            initializer.invoke(c0930a);
            C0931b c0931b = new C0931b(c0930a.f14158a, c0930a.f14159b, c0930a.f14160c, c0930a.f14161d, c0930a.f14162e, c0930a.f14163f, c0930a.f14164g, c0930a.f14165h, c0930a.f14166i, c0930a.j, c0930a.f14167k, c0930a.f14168l);
            obtainStyledAttributes.recycle();
            Intrinsics.checkNotNullParameter(c0931b, "<set-?>");
            this.f13663h = c0931b;
            Context context2 = mapView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "mapView.context");
            Object invoke = this.f13656a.invoke(context2);
            c cVar = (c) invoke;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(this, "presenter");
            cVar.f13652d = this;
            return (View) invoke;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // X6.j
    public final void g() {
        this.j.clear();
        this.f13657b.cancel();
        InterfaceC0850a interfaceC0850a = this.f13658c;
        if (interfaceC0850a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("compassView");
            interfaceC0850a = null;
        }
        ((c) interfaceC0850a).setCompassEnabled(false);
    }

    public final void h(boolean z2) {
        InterfaceC0850a interfaceC0850a = this.f13658c;
        InterfaceC0850a interfaceC0850a2 = null;
        String string2 = StubApp.getString2(17378);
        if (interfaceC0850a == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            interfaceC0850a = null;
        }
        if (((c) interfaceC0850a).isEnabled()) {
            boolean b2 = b();
            ValueAnimator valueAnimator = this.f13657b;
            if (!b2) {
                this.f13662g = false;
                valueAnimator.cancel();
                InterfaceC0850a interfaceC0850a3 = this.f13658c;
                if (interfaceC0850a3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    interfaceC0850a3 = null;
                }
                ((c) interfaceC0850a3).setCompassVisible(true);
                InterfaceC0850a interfaceC0850a4 = this.f13658c;
                if (interfaceC0850a4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    interfaceC0850a2 = interfaceC0850a4;
                }
                ((c) interfaceC0850a2).setCompassAlpha(this.f13663h.f14175g);
                return;
            }
            if (this.f13662g) {
                return;
            }
            this.f13662g = true;
            if (z2) {
                valueAnimator.start();
                return;
            }
            InterfaceC0850a interfaceC0850a5 = this.f13658c;
            if (interfaceC0850a5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                interfaceC0850a5 = null;
            }
            ((c) interfaceC0850a5).setCompassVisible(false);
            InterfaceC0850a interfaceC0850a6 = this.f13658c;
            if (interfaceC0850a6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                interfaceC0850a2 = interfaceC0850a6;
            }
            ((c) interfaceC0850a2).setCompassAlpha(0.0f);
        }
    }

    @Override // X6.j
    public final void initialize() {
        int intValue;
        C0931b c0931b = this.f13663h;
        boolean z2 = c0931b.f14169a;
        C0931b c0931b2 = new C0931b(z2, c0931b.f14170b, c0931b.f14171c, c0931b.f14172d, c0931b.f14173e, c0931b.f14174f, c0931b.f14175g, c0931b.f14176h, c0931b.j, c0931b.f14177k, c0931b.f14178l, c0931b.f14179m);
        Intrinsics.checkNotNullParameter(c0931b2, "<set-?>");
        this.f13663h = c0931b2;
        InterfaceC0850a interfaceC0850a = this.f13658c;
        String string2 = StubApp.getString2(17378);
        InterfaceC0850a interfaceC0850a2 = null;
        if (interfaceC0850a == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            interfaceC0850a = null;
        }
        ((c) interfaceC0850a).setCompassEnabled(z2);
        e(this.f13660e);
        if (!z2 || b()) {
            InterfaceC0850a interfaceC0850a3 = this.f13658c;
            if (interfaceC0850a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                interfaceC0850a3 = null;
            }
            ((c) interfaceC0850a3).setCompassAlpha(0.0f);
            InterfaceC0850a interfaceC0850a4 = this.f13658c;
            if (interfaceC0850a4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                interfaceC0850a4 = null;
            }
            ((c) interfaceC0850a4).setCompassVisible(false);
        } else {
            InterfaceC0850a interfaceC0850a5 = this.f13658c;
            if (interfaceC0850a5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                interfaceC0850a5 = null;
            }
            ((c) interfaceC0850a5).setCompassAlpha(this.f13663h.f14175g);
            InterfaceC0850a interfaceC0850a6 = this.f13658c;
            if (interfaceC0850a6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                interfaceC0850a6 = null;
            }
            ((c) interfaceC0850a6).setCompassVisible(true);
        }
        InterfaceC0850a interfaceC0850a7 = this.f13658c;
        if (interfaceC0850a7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            interfaceC0850a2 = interfaceC0850a7;
        }
        c cVar = (c) interfaceC0850a2;
        cVar.setCompassGravity(this.f13663h.f14170b);
        ImageHolder imageHolder = this.f13663h.f14179m;
        if (imageHolder != null) {
            Context context = cVar.getContext();
            Bitmap bitmap = imageHolder.getBitmap();
            if (bitmap != null) {
                cVar.setCompassImage(new BitmapDrawable(context.getResources(), bitmap));
            }
            Integer drawableId = imageHolder.getDrawableId();
            if (drawableId != null && (intValue = drawableId.intValue()) != -1) {
                Drawable m4 = D1.m(context, intValue);
                Intrinsics.checkNotNull(m4);
                cVar.setCompassImage(m4);
            }
        }
        cVar.setCompassRotation(this.f13663h.f14176h);
        cVar.setCompassEnabled(this.f13663h.f14169a);
        cVar.setCompassAlpha(this.f13663h.f14175g);
        C0931b c0931b3 = this.f13663h;
        int i3 = (int) c0931b3.f14171c;
        int i10 = (int) c0931b3.f14172d;
        int i11 = (int) c0931b3.f14173e;
        int i12 = (int) c0931b3.f14174f;
        ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).setMargins(i3, i10, i11, i12);
        e(this.f13660e);
        cVar.requestLayout();
    }

    @Override // X6.c
    public final void onStart() {
        e(this.f13660e);
    }

    @Override // X6.c
    public final void onStop() {
        this.f13657b.cancel();
    }
}
