package o7;

import A3.s;
import X6.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.mapbox.maps.MapView;
import com.stub.StubApp;
import d7.C0806a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p7.C1495a;
import p7.C1496b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f18381a;

    /* renamed from: b, reason: collision with root package name */
    public a f18382b;

    /* renamed from: c, reason: collision with root package name */
    public C1496b f18383c;

    public d() {
        String string2 = StubApp.getString2(9628);
        c cVar = c.f18378b;
        Intrinsics.checkNotNullParameter(cVar, string2);
        this.f18381a = cVar;
        String string22 = StubApp.getString2(9629);
        c cVar2 = c.f18379c;
        Intrinsics.checkNotNullParameter(cVar2, string22);
        C1495a c1495a = new C1495a();
        c1495a.f19706a = true;
        c1495a.f19707b = 8388691;
        c1495a.f19708c = 4.0f;
        c1495a.f19709d = 4.0f;
        c1495a.f19710e = 4.0f;
        c1495a.f19711f = 4.0f;
        cVar2.invoke(c1495a);
        this.f18383c = new C1496b(c1495a.f19706a, c1495a.f19707b, c1495a.f19708c, c1495a.f19709d, c1495a.f19710e, c1495a.f19711f);
    }

    @Override // X6.j
    public final void a(s delegateProvider) {
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
    }

    public final void b() {
        a aVar = this.f18382b;
        a aVar2 = null;
        String string2 = StubApp.getString2(21620);
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            aVar = null;
        }
        C1496b c1496b = this.f18383c;
        int i3 = (int) c1496b.f19714c;
        int i10 = (int) c1496b.f19715d;
        int i11 = (int) c1496b.f19716e;
        int i12 = (int) c1496b.f19717f;
        ViewGroup.LayoutParams layoutParams = ((b) aVar).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(i3, i10, i11, i12);
        layoutParams2.setMarginStart(i3);
        layoutParams2.setMarginEnd(i11);
        a aVar3 = this.f18382b;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            aVar3 = null;
        }
        ((b) aVar3).setLogoGravity(this.f18383c.f19713b);
        a aVar4 = this.f18382b;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            aVar4 = null;
        }
        ((b) aVar4).setLogoEnabled(this.f18383c.f19712a);
        a aVar5 = this.f18382b;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            aVar2 = aVar5;
        }
        aVar2.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X6.u
    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a aVar = view instanceof a ? (a) view : null;
        if (aVar == null) {
            throw new IllegalArgumentException(StubApp.getString2(21621));
        }
        this.f18382b = aVar;
    }

    public final void e() {
        C1496b c1496b = this.f18383c;
        if (c1496b.f19712a) {
            C1496b c1496b2 = new C1496b(false, c1496b.f19713b, c1496b.f19714c, c1496b.f19715d, c1496b.f19716e, c1496b.f19717f);
            Intrinsics.checkNotNullParameter(c1496b2, "<set-?>");
            this.f18383c = c1496b2;
            b();
            a aVar = this.f18382b;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("logoView");
                aVar = null;
            }
            ((b) aVar).setLogoEnabled(false);
        }
    }

    @Override // X6.u
    public final View f(MapView mapView, AttributeSet attributeSet, float f10) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Context context = mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "mapView.context");
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f18384a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            C0806a initializer = new C0806a(obtainStyledAttributes, f10, 2);
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            C1495a c1495a = new C1495a();
            c1495a.f19706a = true;
            c1495a.f19707b = 8388691;
            c1495a.f19708c = 4.0f;
            c1495a.f19709d = 4.0f;
            c1495a.f19710e = 4.0f;
            c1495a.f19711f = 4.0f;
            initializer.invoke(c1495a);
            C1496b c1496b = new C1496b(c1495a.f19706a, c1495a.f19707b, c1495a.f19708c, c1495a.f19709d, c1495a.f19710e, c1495a.f19711f);
            obtainStyledAttributes.recycle();
            Intrinsics.checkNotNullParameter(c1496b, "<set-?>");
            this.f18383c = c1496b;
            Context context2 = mapView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "mapView.context");
            Object invoke = this.f18381a.invoke(context2);
            ((b) invoke).getClass();
            Intrinsics.checkNotNullParameter(this, "presenter");
            return (View) invoke;
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
}
