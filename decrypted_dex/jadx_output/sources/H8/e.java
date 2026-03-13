package H8;

import D9.l;
import L7.i;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0444t;
import com.stub.StubApp;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import m8.r;
import m8.s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f2947a;

    public e(f fVar) {
        this.f2947a = fVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void A(InterfaceC0444t owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        l.f(StubApp.getString2(2696), StubApp.getString2(2695));
        r rVar = s.f17247b;
        if (rVar != null && !rVar.f17218L) {
            throw new IllegalStateException(StubApp.getString2(2697));
        }
        g gVar = this.f2947a.f2948a;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationOptionsProvider");
            gVar = null;
        }
        i navigationOptions = gVar.g();
        Intrinsics.checkNotNullParameter(navigationOptions, "navigationOptions");
        l.d(StubApp.getString2(2699), StubApp.getString2(2698));
        r rVar2 = s.f17247b;
        if (rVar2 != null) {
            rVar2.i();
        }
        s.f17247b = new r(navigationOptions);
        Iterator it = s.f17248c.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            r rVar3 = s.f17247b;
            Intrinsics.checkNotNull(rVar3);
            dVar.b(rVar3);
        }
        r rVar4 = s.f17247b;
        Intrinsics.checkNotNull(rVar4);
        f fVar = this.f2947a;
        fVar.f2950c = rVar4;
        fVar.f2951d = true;
        Iterator it2 = fVar.f2949b.iterator();
        while (it2.hasNext()) {
            ((d) it2.next()).b(rVar4);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void p(InterfaceC0444t owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        l.f(StubApp.getString2(2700), StubApp.getString2(2695));
        f fVar = this.f2947a;
        fVar.f2951d = false;
        Iterator it = fVar.f2949b.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            r rVar = fVar.f2950c;
            Intrinsics.checkNotNull(rVar);
            dVar.a(rVar);
        }
        s.a();
        fVar.f2950c = null;
    }
}
