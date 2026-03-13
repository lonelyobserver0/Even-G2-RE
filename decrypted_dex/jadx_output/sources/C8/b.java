package C8;

import D9.l;
import android.app.Activity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.EnumC0439n;
import androidx.lifecycle.InterfaceC0444t;
import com.stub.StubApp;
import d0.AbstractComponentCallbacksC0789t;
import d0.C0791v;
import i.AbstractActivityC1027h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f1136a;

    public b(c cVar) {
        this.f1136a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(InterfaceC0444t interfaceC0444t) {
        if (!(interfaceC0444t instanceof Activity) || !((Activity) interfaceC0444t).isChangingConfigurations()) {
            if (!(interfaceC0444t instanceof AbstractComponentCallbacksC0789t)) {
                return false;
            }
            C0791v c0791v = ((AbstractComponentCallbacksC0789t) interfaceC0444t).f13385w;
            AbstractActivityC1027h abstractActivityC1027h = c0791v == null ? null : c0791v.f13391a;
            if (abstractActivityC1027h == null || !abstractActivityC1027h.isChangingConfigurations()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void A(InterfaceC0444t owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        c cVar = this.f1136a;
        if (cVar.f1140d.add(owner)) {
            int i3 = cVar.f1142f;
            if (i3 > 0) {
                cVar.f1142f = i3 - 1;
                return;
            }
            l.f(StubApp.getString2(1205) + owner + StubApp.getString2(1206), StubApp.getString2(1196));
            if (cVar.f1138b.size() == 0 && cVar.f1140d.size() == 1) {
                c.b(cVar, EnumC0439n.f9917e);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void e(InterfaceC0444t owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        c cVar = this.f1136a;
        if (cVar.f1139c.add(owner)) {
            int i3 = cVar.f1141e;
            if (i3 > 0) {
                cVar.f1141e = i3 - 1;
                return;
            }
            l.f(StubApp.getString2(1205) + owner + StubApp.getString2(1207), StubApp.getString2(1196));
            if (cVar.f1137a.size() == 0 && cVar.f1139c.size() == 1) {
                c.b(cVar, EnumC0439n.f9916d);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void p(InterfaceC0444t owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        c cVar = this.f1136a;
        if (cVar.f1140d.remove(owner)) {
            if (a(owner)) {
                cVar.f1142f++;
                return;
            }
            l.f(StubApp.getString2(1205) + owner + StubApp.getString2(1208), StubApp.getString2(1196));
            if (cVar.f1138b.size() == 0 && cVar.f1140d.size() == 0 && cVar.f1142f == 0) {
                c.b(cVar, EnumC0439n.f9916d);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void v(InterfaceC0444t owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        c cVar = this.f1136a;
        if (cVar.f1139c.remove(owner)) {
            if (a(owner)) {
                cVar.f1141e++;
                return;
            }
            l.f(StubApp.getString2(1205) + owner + StubApp.getString2(1209), StubApp.getString2(1196));
            if (cVar.f1137a.size() == 0 && cVar.f1139c.size() == 0 && cVar.f1141e == 0) {
                c.b(cVar, EnumC0439n.f9915c);
            }
        }
    }
}
