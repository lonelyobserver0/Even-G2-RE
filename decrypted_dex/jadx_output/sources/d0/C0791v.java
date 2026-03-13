package d0;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0446v;
import d.InterfaceC0756A;
import i.AbstractActivityC1027h;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* renamed from: d0.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0791v extends AbstractC0793x implements D.d, androidx.lifecycle.W, InterfaceC0756A, M1.e, Q {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC1027h f13391a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC1027h f13392b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f13393c;

    /* renamed from: d, reason: collision with root package name */
    public final M f13394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1027h f13395e;

    public C0791v(AbstractActivityC1027h context) {
        this.f13395e = context;
        Intrinsics.checkNotNullParameter(context, "activity");
        Handler handler = new Handler();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f13391a = context;
        this.f13392b = context;
        this.f13393c = handler;
        this.f13394d = new M();
    }

    @Override // d.InterfaceC0756A
    public final d.z a() {
        return this.f13395e.a();
    }

    @Override // D.d
    public final void b(M.a aVar) {
        this.f13395e.b(aVar);
    }

    @Override // D.d
    public final void c(M.a aVar) {
        this.f13395e.c(aVar);
    }

    @Override // d0.Q
    public final void d() {
    }

    @Override // androidx.lifecycle.W
    public final androidx.lifecycle.V e() {
        return this.f13395e.e();
    }

    @Override // M1.e
    public final E0 f() {
        return (E0) this.f13395e.f13079d.f9078c;
    }

    @Override // d0.AbstractC0793x
    public final View g(int i3) {
        return this.f13395e.findViewById(i3);
    }

    @Override // d0.AbstractC0793x
    public final boolean h() {
        Window window = this.f13395e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.InterfaceC0444t
    public final C0446v i() {
        return this.f13395e.f14606x;
    }
}
