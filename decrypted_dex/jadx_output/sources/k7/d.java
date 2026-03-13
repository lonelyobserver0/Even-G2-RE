package k7;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.InterfaceC0444t;
import com.mapbox.maps.MapView;
import com.stub.StubApp;
import d0.T;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d implements InterfaceC0444t {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f15479a;

    /* renamed from: b, reason: collision with root package name */
    public final C0446v f15480b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15481c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0444t f15482d;

    /* renamed from: e, reason: collision with root package name */
    public final N1.a f15483e;

    /* renamed from: f, reason: collision with root package name */
    public final T f15484f;

    public d(MapView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f15479a = new WeakReference(view);
        this.f15480b = new C0446v(this);
        this.f15483e = new N1.a(this, 1);
        T t3 = new T(this, 1);
        this.f15484f = t3;
        view.addOnAttachStateChangeListener(t3);
        if (view.isAttachedToWindow()) {
            b(view);
        }
    }

    public final void b(View view) {
        InterfaceC0444t interfaceC0444t;
        C0446v i3;
        if (this.f15481c) {
            return;
        }
        InterfaceC0444t interfaceC0444t2 = this.f15482d;
        N1.a aVar = this.f15483e;
        if (interfaceC0444t2 != null && (i3 = interfaceC0444t2.i()) != null) {
            i3.b(aVar);
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (true) {
            interfaceC0444t = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(2131231163);
            InterfaceC0444t interfaceC0444t3 = tag instanceof InterfaceC0444t ? (InterfaceC0444t) tag : null;
            if (interfaceC0444t3 != null) {
                interfaceC0444t = interfaceC0444t3;
                break;
            }
            Intrinsics.checkNotNullParameter(view, "<this>");
            Object parent = view.getParent();
            if (parent == null) {
                Object tag2 = view.getTag(2131231162);
                parent = tag2 instanceof ViewParent ? (ViewParent) tag2 : null;
            }
            view = parent instanceof View ? (View) parent : null;
        }
        if (interfaceC0444t == null) {
            throw new IllegalStateException(StubApp.getString2(19125));
        }
        this.f15480b.g(interfaceC0444t.i().f9925c);
        interfaceC0444t.i().a(aVar);
        this.f15482d = interfaceC0444t;
        this.f15481c = true;
    }

    @Override // androidx.lifecycle.InterfaceC0444t
    public final C0446v i() {
        return this.f15480b;
    }
}
