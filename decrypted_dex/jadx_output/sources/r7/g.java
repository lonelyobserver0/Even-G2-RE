package r7;

import A3.s;
import X6.l;
import X6.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import c5.B;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Projection;
import com.stub.StubApp;
import d7.C0806a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s7.C1604b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements u, l {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f20395a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1576b f20396b;

    /* renamed from: c, reason: collision with root package name */
    public MapboxMap f20397c;

    /* renamed from: d, reason: collision with root package name */
    public MapboxMap f20398d;

    /* renamed from: e, reason: collision with root package name */
    public C1604b f20399e;

    /* renamed from: f, reason: collision with root package name */
    public final B f20400f;

    /* renamed from: g, reason: collision with root package name */
    public Cancelable f20401g;

    public g() {
        String string2 = StubApp.getString2(9628);
        C1579e c1579e = C1579e.f20378c;
        Intrinsics.checkNotNullParameter(c1579e, string2);
        this.f20395a = c1579e;
        this.f20399e = Ec.l.b(C1579e.f20379d);
        this.f20400f = new B(this, 26);
    }

    public static /* synthetic */ void e(g gVar) {
        MapboxMap mapboxMap = gVar.f20398d;
        if (mapboxMap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapCameraManagerDelegate");
            mapboxMap = null;
        }
        gVar.b(mapboxMap.getCameraState());
    }

    @Override // X6.j
    public final void a(s delegateProvider) {
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        this.f20398d = (MapboxMap) delegateProvider.f190b;
        this.f20397c = (MapboxMap) delegateProvider.f195g;
    }

    public final void b(CameraState cameraState) {
        double metersPerPixelAtLatitude = Projection.getMetersPerPixelAtLatitude(cameraState.getCenter().latitude(), cameraState.getZoom());
        InterfaceC1576b interfaceC1576b = this.f20396b;
        InterfaceC1576b interfaceC1576b2 = null;
        String string2 = StubApp.getString2(22739);
        if (interfaceC1576b == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            interfaceC1576b = null;
        }
        InterfaceC1576b interfaceC1576b3 = this.f20396b;
        if (interfaceC1576b3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            interfaceC1576b2 = interfaceC1576b3;
        }
        ((C1580f) interfaceC1576b).setDistancePerPixel((float) (metersPerPixelAtLatitude / ((C1580f) interfaceC1576b2).getPixelRatio()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X6.u
    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC1576b interfaceC1576b = view instanceof InterfaceC1576b ? (InterfaceC1576b) view : null;
        if (interfaceC1576b == null) {
            throw new IllegalArgumentException(StubApp.getString2(22740));
        }
        this.f20396b = interfaceC1576b;
    }

    @Override // X6.u
    public final View f(MapView mapView, AttributeSet attributeSet, float f10) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Context context = mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "mapView.context");
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1575a.f20373a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            C1604b b2 = Ec.l.b(new C0806a(obtainStyledAttributes, f10, 3));
            obtainStyledAttributes.recycle();
            Intrinsics.checkNotNullParameter(b2, "<set-?>");
            this.f20399e = b2;
            Context context2 = mapView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "mapView.context");
            C1580f c1580f = (C1580f) this.f20395a.invoke(context2);
            Intrinsics.checkNotNull(c1580f, "null cannot be cast to non-null type com.mapbox.maps.plugin.scalebar.ScaleBar");
            c1580f.setPixelRatio(f10);
            return c1580f;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // X6.j
    public final void g() {
        Cancelable cancelable = this.f20401g;
        if (cancelable != null) {
            cancelable.cancel();
        }
    }

    public final void h() {
        if (this.f20399e.f20795a) {
            Cancelable cancelable = this.f20401g;
            if (cancelable != null) {
                cancelable.cancel();
            }
            C1604b c1604b = this.f20399e;
            c1604b.getClass();
            C1604b c1604b2 = new C1604b(false, c1604b.f20796b, c1604b.f20797c, c1604b.f20798d, c1604b.f20799e, c1604b.f20800f, c1604b.f20801g, c1604b.f20802h, c1604b.j, c1604b.f20803k, c1604b.f20804l, c1604b.f20805m, c1604b.f20806n, c1604b.f20807p, c1604b.f20808q, c1604b.f20809r, c1604b.f20810s, c1604b.f20811t, c1604b.f20812v);
            Intrinsics.checkNotNullParameter(c1604b2, "<set-?>");
            this.f20399e = c1604b2;
            InterfaceC1576b interfaceC1576b = this.f20396b;
            if (interfaceC1576b == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scaleBar");
                interfaceC1576b = null;
            }
            ((C1580f) interfaceC1576b).setEnable(false);
        }
    }

    @Override // X6.j
    public final void initialize() {
        InterfaceC1576b interfaceC1576b = this.f20396b;
        MapboxMap mapboxMap = null;
        if (interfaceC1576b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scaleBar");
            interfaceC1576b = null;
        }
        ((C1580f) interfaceC1576b).setSettings(this.f20399e);
        e(this);
        MapboxMap mapboxMap2 = this.f20397c;
        if (mapboxMap2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapListenerDelegate");
        } else {
            mapboxMap = mapboxMap2;
        }
        this.f20401g = mapboxMap.subscribeCameraChangedCoalesced(this.f20400f);
    }

    @Override // X6.l
    public final void onSizeChanged(int i3, int i10) {
        InterfaceC1576b interfaceC1576b = this.f20396b;
        if (interfaceC1576b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scaleBar");
            interfaceC1576b = null;
        }
        ((C1580f) interfaceC1576b).setMapViewWidth(i3);
        if (this.f20399e.f20795a) {
            e(this);
        }
    }
}
