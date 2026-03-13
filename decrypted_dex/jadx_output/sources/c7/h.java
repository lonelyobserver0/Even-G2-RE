package c7;

import A3.s;
import E0.x;
import X6.u;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.mapbox.maps.MapView;
import com.mapbox.maps.attribution.AttributionParser;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.stub.StubApp;
import d7.C0806a;
import d7.C0807b;
import d7.C0808c;
import i.C1021b;
import i.DialogInterfaceC1025f;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements View.OnClickListener, u, X6.c {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f11038a;

    /* renamed from: b, reason: collision with root package name */
    public i f11039b;

    /* renamed from: c, reason: collision with root package name */
    public X6.g f11040c;

    /* renamed from: d, reason: collision with root package name */
    public e f11041d;

    /* renamed from: e, reason: collision with root package name */
    public C0808c f11042e;

    public h() {
        String string2 = StubApp.getString2(9628);
        g gVar = g.f11035b;
        Intrinsics.checkNotNullParameter(gVar, string2);
        this.f11038a = gVar;
        String string22 = StubApp.getString2(9629);
        g gVar2 = g.f11036c;
        Intrinsics.checkNotNullParameter(gVar2, string22);
        C0807b c0807b = new C0807b();
        c0807b.f13442a = true;
        c0807b.f13443b = Color.parseColor(StubApp.getString2(9630));
        c0807b.f13444c = 8388691;
        c0807b.f13445d = 92.0f;
        c0807b.f13446e = 4.0f;
        c0807b.f13447f = 4.0f;
        c0807b.f13448g = 4.0f;
        c0807b.f13449h = true;
        gVar2.invoke(c0807b);
        this.f11042e = new C0808c(c0807b.f13442a, c0807b.f13443b, c0807b.f13444c, c0807b.f13445d, c0807b.f13446e, c0807b.f13447f, c0807b.f13448g, c0807b.f13449h);
    }

    @Override // X6.j
    public final void a(s delegateProvider) {
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        this.f11040c = (X6.g) ((Lazy) delegateProvider.f193e).getValue();
    }

    public final void b() {
        i iVar = this.f11039b;
        i iVar2 = null;
        String string2 = StubApp.getString2(9631);
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            iVar = null;
        }
        ((j) iVar).setGravity(this.f11042e.f13452c);
        i iVar3 = this.f11039b;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            iVar3 = null;
        }
        ((j) iVar3).setEnable(this.f11042e.f13450a);
        i iVar4 = this.f11039b;
        if (iVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            iVar4 = null;
        }
        ((j) iVar4).setIconColor(this.f11042e.f13451b);
        i iVar5 = this.f11039b;
        if (iVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            iVar5 = null;
        }
        C0808c c0808c = this.f11042e;
        int i3 = (int) c0808c.f13453d;
        int i10 = (int) c0808c.f13454e;
        int i11 = (int) c0808c.f13455f;
        int i12 = (int) c0808c.f13456g;
        ViewGroup.LayoutParams layoutParams = ((j) iVar5).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(i3, i10, i11, i12);
        layoutParams2.setMarginStart(i3);
        layoutParams2.setMarginEnd(i11);
        i iVar6 = this.f11039b;
        if (iVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            iVar2 = iVar6;
        }
        iVar2.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X6.u
    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        i iVar = view instanceof i ? (i) view : null;
        if (iVar == null) {
            throw new IllegalArgumentException(StubApp.getString2(9632));
        }
        this.f11039b = iVar;
        ((j) iVar).setViewOnClickListener(this);
    }

    public final void e() {
        C0808c c0808c = this.f11042e;
        if (c0808c.f13450a) {
            Color.parseColor(StubApp.getString2(9630));
            C0808c c0808c2 = new C0808c(false, c0808c.f13451b, c0808c.f13452c, c0808c.f13453d, c0808c.f13454e, c0808c.f13455f, c0808c.f13456g, c0808c.f13457h);
            Intrinsics.checkNotNullParameter(c0808c2, "<set-?>");
            this.f11042e = c0808c2;
            b();
        }
    }

    @Override // X6.u
    public final View f(MapView mapView, AttributeSet attributeSet, float f10) {
        Intrinsics.checkNotNullParameter(mapView, StubApp.getString2(3464));
        Context context = mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "mapView.context");
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f11043a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            C0806a initializer = new C0806a(obtainStyledAttributes, f10, 0);
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            C0807b c0807b = new C0807b();
            c0807b.f13442a = true;
            c0807b.f13443b = Color.parseColor(StubApp.getString2("9630"));
            c0807b.f13444c = 8388691;
            c0807b.f13445d = 92.0f;
            c0807b.f13446e = 4.0f;
            c0807b.f13447f = 4.0f;
            c0807b.f13448g = 4.0f;
            c0807b.f13449h = true;
            initializer.invoke(c0807b);
            C0808c c0808c = new C0808c(c0807b.f13442a, c0807b.f13443b, c0807b.f13444c, c0807b.f13445d, c0807b.f13446e, c0807b.f13447f, c0807b.f13448g, c0807b.f13449h);
            obtainStyledAttributes.recycle();
            Intrinsics.checkNotNullParameter(c0808c, "<set-?>");
            this.f11042e = c0808c;
            Context context2 = mapView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "mapView.context");
            this.f11041d = new e(context2);
            Context context3 = mapView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "mapView.context");
            return (View) this.f11038a.invoke(context3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // X6.j
    public final void g() {
    }

    @Override // X6.j
    public final void initialize() {
        b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f11042e.f13457h) {
            e eVar = this.f11041d;
            List list = null;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialogManager");
                eVar = null;
            }
            X6.g gVar = this.f11040c;
            String string2 = StubApp.getString2(9633);
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                gVar = null;
            }
            eVar.getClass();
            Intrinsics.checkNotNullParameter(gVar, string2);
            eVar.f11008f = gVar;
            eVar.f11009g = gVar.f8452b;
            MapGeofencingConsent mapGeofencingConsent = gVar.f8453c;
            eVar.f11010h = mapGeofencingConsent;
            boolean shouldShowConsent = mapGeofencingConsent != null ? mapGeofencingConsent.shouldShowConsent() : false;
            f config = new f(0);
            String string22 = StubApp.getString2(354);
            Context context = eVar.f11003a;
            Intrinsics.checkNotNullParameter(context, string22);
            Intrinsics.checkNotNullParameter(config, "config");
            Object[] array = gVar.f8451a.getAttributions().toArray(new String[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            eVar.f11004b = CollectionsKt.toList(new AttributionParser.Options(context).withCopyrightSign(true).withImproveMap(true).withTelemetryAttribution(true).withMapboxAttribution(true).withMapboxPrivacyPolicy(true).withMapboxGeofencingConsent(shouldShowConsent).withAttributionData((String[]) Arrays.copyOf(strArr, strArr.length)).withExtraAttributions(gVar.f8454d).build().getAttributions());
            if (context instanceof Activity ? ((Activity) context).isFinishing() : false) {
                return;
            }
            List list2 = eVar.f11004b;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("attributionList");
            } else {
                list = list2;
            }
            x a3 = eVar.a();
            C1021b c1021b = (C1021b) a3.f1862b;
            c1021b.f14555d = c1021b.f14552a.getText(2131755150);
            c1021b.f14564n = new d(context, list);
            c1021b.f14565o = eVar;
            DialogInterfaceC1025f e10 = a3.e();
            e10.show();
            eVar.f11005c = e10;
        }
    }

    @Override // X6.c
    public final void onStart() {
    }

    @Override // X6.c
    public final void onStop() {
        e eVar = this.f11041d;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogManager");
            eVar = null;
        }
        DialogInterfaceC1025f dialogInterfaceC1025f = eVar.f11005c;
        if (dialogInterfaceC1025f != null) {
            if (!dialogInterfaceC1025f.isShowing()) {
                dialogInterfaceC1025f = null;
            }
            if (dialogInterfaceC1025f != null) {
                dialogInterfaceC1025f.dismiss();
            }
        }
        DialogInterfaceC1025f dialogInterfaceC1025f2 = eVar.f11006d;
        if (dialogInterfaceC1025f2 != null) {
            if (!dialogInterfaceC1025f2.isShowing()) {
                dialogInterfaceC1025f2 = null;
            }
            if (dialogInterfaceC1025f2 != null) {
                dialogInterfaceC1025f2.dismiss();
            }
        }
        DialogInterfaceC1025f dialogInterfaceC1025f3 = eVar.f11007e;
        if (dialogInterfaceC1025f3 != null) {
            DialogInterfaceC1025f dialogInterfaceC1025f4 = dialogInterfaceC1025f3.isShowing() ? dialogInterfaceC1025f3 : null;
            if (dialogInterfaceC1025f4 != null) {
                dialogInterfaceC1025f4.dismiss();
            }
        }
    }
}
