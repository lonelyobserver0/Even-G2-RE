package w9;

import Qb.J;
import Qb.L;
import Qb.L0;
import Qb.W;
import Vb.q;
import Z9.C;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l4.C1145A;
import m8.r;
import m8.s;
import t8.C1739a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements H8.d {

    /* renamed from: a, reason: collision with root package name */
    public final Xb.d f22159a;

    /* renamed from: b, reason: collision with root package name */
    public final C f22160b;

    /* renamed from: c, reason: collision with root package name */
    public final C1145A f22161c;

    /* renamed from: d, reason: collision with root package name */
    public C1739a f22162d;

    /* renamed from: e, reason: collision with root package name */
    public final A9.k f22163e;

    public g() {
        Xb.d serialisationDispatcher = W.f5838a;
        L0 job = L.b();
        Vb.f scope = J.a(CoroutineContext.Element.DefaultImpls.plus(job, q.f7968a.f6359c));
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(scope, "scope");
        C mutexBasedMainScope = new C(scope);
        C1145A historyRecorderChooserFactory = new C1145A(28);
        Intrinsics.checkNotNullParameter(serialisationDispatcher, "serialisationDispatcher");
        Intrinsics.checkNotNullParameter(mutexBasedMainScope, "mutexBasedMainScope");
        Intrinsics.checkNotNullParameter(historyRecorderChooserFactory, "historyRecorderChooserFactory");
        this.f22159a = serialisationDispatcher;
        this.f22160b = mutexBasedMainScope;
        this.f22161c = historyRecorderChooserFactory;
        this.f22163e = new A9.k();
        Intrinsics.checkNotNullParameter(s.f17246a, "<this>");
        Intrinsics.checkNotNullParameter(this, "observer");
        Intrinsics.checkNotNullParameter(this, "observer");
        s.f17248c.add(this);
        r rVar = s.f17247b;
        if (rVar != null) {
            b(rVar);
        }
    }

    @Override // H8.d
    public final void a(r mapboxNavigation) {
        Intrinsics.checkNotNullParameter(mapboxNavigation, "mapboxNavigation");
        e(null);
    }

    @Override // H8.d
    public final void b(r mapboxNavigation) {
        Intrinsics.checkNotNullParameter(mapboxNavigation, "mapboxNavigation");
        A8.a historyRecorderChangedObserver = new A8.a(this, 16);
        this.f22161c.getClass();
        Intrinsics.checkNotNullParameter(mapboxNavigation, "mapboxNavigation");
        Intrinsics.checkNotNullParameter(historyRecorderChangedObserver, "listener");
        L7.e eVar = mapboxNavigation.f17221a.j;
        Intrinsics.checkNotNullParameter(mapboxNavigation, "mapboxNavigation");
        Intrinsics.checkNotNullParameter(historyRecorderChangedObserver, "historyRecorderChangedObserver");
        new LinkedHashSet();
    }

    public final void c(Function2 eventFormer) {
        Intrinsics.checkNotNullParameter(eventFormer, "eventFormer");
        C1739a c1739a = this.f22162d;
        if (c1739a != null) {
            this.f22160b.g(new f(this, c1739a, eventFormer, null));
        }
    }

    public final void d(Function2 eventFormer) {
        Intrinsics.checkNotNullParameter(eventFormer, "eventFormer");
        C1739a c1739a = this.f22162d;
        if (c1739a != null) {
            this.f22160b.g(new f(this, c1739a, eventFormer, null));
        } else {
            LinkedList linkedList = this.f22163e.f237a;
            linkedList.add(eventFormer);
            while (linkedList.size() > 8) {
                linkedList.remove();
            }
        }
    }

    public final void e(C1739a c1739a) {
        this.f22162d = c1739a;
        C c10 = this.f22160b;
        if (c1739a == null) {
            L.f(((Vb.f) c10.f9077b).f7941a);
            return;
        }
        A9.k kVar = this.f22163e;
        Iterator it = kVar.iterator();
        while (it.hasNext()) {
            c10.g(new f(this, c1739a, (Function2) it.next(), null));
        }
        kVar.f237a.clear();
    }
}
