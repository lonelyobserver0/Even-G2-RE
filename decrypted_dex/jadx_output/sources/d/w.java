package d;

import androidx.lifecycle.AbstractC0440o;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.InterfaceC0444t;
import d0.C0766D;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class w implements androidx.lifecycle.r, InterfaceC0760b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0440o f13109a;

    /* renamed from: b, reason: collision with root package name */
    public final C0766D f13110b;

    /* renamed from: c, reason: collision with root package name */
    public x f13111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f13112d;

    public w(z zVar, AbstractC0440o lifecycle, C0766D onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f13112d = zVar;
        this.f13109a = lifecycle;
        this.f13110b = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // d.InterfaceC0760b
    public final void cancel() {
        this.f13109a.b(this);
        C0766D c0766d = this.f13110b;
        c0766d.getClass();
        Intrinsics.checkNotNullParameter(this, "cancellable");
        c0766d.f13129b.remove(this);
        x xVar = this.f13111c;
        if (xVar != null) {
            xVar.cancel();
        }
        this.f13111c = null;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC0444t source, EnumC0438m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != EnumC0438m.ON_START) {
            if (event != EnumC0438m.ON_STOP) {
                if (event == EnumC0438m.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                x xVar = this.f13111c;
                if (xVar != null) {
                    xVar.cancel();
                    return;
                }
                return;
            }
        }
        z zVar = this.f13112d;
        C0766D onBackPressedCallback = this.f13110b;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        zVar.f13117b.add(onBackPressedCallback);
        x cancellable = new x(zVar, onBackPressedCallback);
        onBackPressedCallback.getClass();
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        onBackPressedCallback.f13129b.add(cancellable);
        zVar.d();
        onBackPressedCallback.f13130c = new y(zVar);
        this.f13111c = cancellable;
    }
}
