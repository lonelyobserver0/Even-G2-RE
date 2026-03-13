package d;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.InterfaceC0444t;
import i.AbstractActivityC1027h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class g implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f13058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1027h f13059b;

    public /* synthetic */ g(z zVar, AbstractActivityC1027h abstractActivityC1027h) {
        this.f13058a = zVar;
        this.f13059b = abstractActivityC1027h;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC0444t interfaceC0444t, EnumC0438m event) {
        Intrinsics.checkNotNullParameter(interfaceC0444t, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC0438m.ON_CREATE) {
            OnBackInvokedDispatcher invoker = J.b.a(this.f13059b);
            z zVar = this.f13058a;
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            zVar.f13120e = invoker;
            zVar.c(zVar.f13122g);
        }
    }
}
