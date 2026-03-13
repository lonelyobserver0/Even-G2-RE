package H8;

import Ac.m;
import D9.l;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import m8.r;
import m8.s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f2943a = LazyKt.lazy(a.f2939e);

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f2944b = LazyKt.lazy(a.f2938d);

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f2945c = LazyKt.lazy(new m(this, 2));

    /* renamed from: d, reason: collision with root package name */
    public boolean f2946d;

    public final f a() {
        return (f) this.f2943a.getValue();
    }

    public final void b(g navigationOptionsProvider) {
        Intrinsics.checkNotNullParameter(navigationOptionsProvider, "navigationOptionsProvider");
        Lazy lazy = this.f2944b;
        C8.c cVar = (C8.c) lazy.getValue();
        if (cVar.f1141e > 0 || cVar.f1142f > 0) {
            return;
        }
        if (this.f2946d) {
            this.f2946d = false;
            ((C8.c) lazy.getValue()).f1143g.b(a().f2952e);
            f a3 = a();
            if (a3.f2951d) {
                a3.f2951d = false;
                CopyOnWriteArraySet copyOnWriteArraySet = a3.f2949b;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    r rVar = a3.f2950c;
                    Intrinsics.checkNotNull(rVar);
                    dVar.a(rVar);
                }
                s.a();
                a3.f2950c = null;
                l.f(StubApp.getString2(2693) + copyOnWriteArraySet.size() + StubApp.getString2(2694), StubApp.getString2(2695));
            }
        }
        f a9 = a();
        a9.getClass();
        Intrinsics.checkNotNullParameter(navigationOptionsProvider, "navigationOptionsProvider");
        a9.f2948a = navigationOptionsProvider;
        ((C8.c) lazy.getValue()).f1143g.a(a().f2952e);
        this.f2946d = true;
    }
}
