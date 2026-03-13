package t7;

import A3.s;
import X6.j;
import Y6.k;
import android.os.Handler;
import android.os.Looper;
import com.mapbox.maps.MapController;
import com.stub.StubApp;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import l4.C1221y;
import v7.C1838a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f21211a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f21212b;

    /* renamed from: c, reason: collision with root package name */
    public Y6.a f21213c;

    /* renamed from: d, reason: collision with root package name */
    public final a f21214d;

    /* renamed from: e, reason: collision with root package name */
    public c f21215e;

    /* renamed from: f, reason: collision with root package name */
    public final u7.b f21216f;

    public b() {
        Handler handler = new Handler(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f21211a = handler;
        this.f21212b = new CopyOnWriteArraySet();
        this.f21214d = new a(this);
        this.f21215e = c.f21217a;
        this.f21216f = new u7.b();
    }

    @Override // X6.j
    public final void a(s delegateProvider) {
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        MapController mapController = (MapController) delegateProvider.f194f;
        Y6.a e10 = k.e(mapController);
        this.f21213c = e10;
        if (e10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraPlugin");
            e10 = null;
        }
        Y6.j jVar = (Y6.j) e10;
        jVar.getClass();
        a listener = this.f21214d;
        Intrinsics.checkNotNullParameter(listener, "listener");
        jVar.f8772k.add(listener);
        u7.a options = new u7.a();
        Intrinsics.checkNotNullParameter(delegateProvider, "mapDelegateProvider");
        C1838a transitionFactory = new C1838a();
        k.e(mapController);
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(transitionFactory, "transitionFactory");
        C1221y c1221y = new C1221y(28);
        k.e(mapController);
        Intrinsics.checkNotNullParameter(c1221y, "<set-?>");
    }

    @Override // X6.j
    public final void g() {
        Y6.a aVar = this.f21213c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraPlugin");
            aVar = null;
        }
        Y6.j jVar = (Y6.j) aVar;
        jVar.getClass();
        String string2 = StubApp.getString2(18605);
        a aVar2 = this.f21214d;
        Intrinsics.checkNotNullParameter(aVar2, string2);
        jVar.f8772k.remove(aVar2);
    }

    @Override // X6.j
    public final void initialize() {
    }
}
