package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0431f implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9909a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9910b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9911c;

    public C0431f(DefaultLifecycleObserver defaultLifecycleObserver, r rVar) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f9910b = defaultLifecycleObserver;
        this.f9911c = rVar;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC0444t source, EnumC0438m event) {
        switch (this.f9909a) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                int i3 = AbstractC0430e.f9908a[event.ordinal()];
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f9910b;
                switch (i3) {
                    case 1:
                        defaultLifecycleObserver.e(source);
                        break;
                    case 2:
                        defaultLifecycleObserver.A(source);
                        break;
                    case 3:
                        defaultLifecycleObserver.d(source);
                        break;
                    case 4:
                        defaultLifecycleObserver.k(source);
                        break;
                    case 5:
                        defaultLifecycleObserver.p(source);
                        break;
                    case 6:
                        defaultLifecycleObserver.v(source);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                r rVar = (r) this.f9911c;
                if (rVar != null) {
                    rVar.h(source, event);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC0438m.ON_START) {
                    ((AbstractC0440o) this.f9910b).b(this);
                    ((E0) this.f9911c).M();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0427b) this.f9911c).f9901a;
                List list = (List) hashMap.get(event);
                InterfaceC0443s interfaceC0443s = (InterfaceC0443s) this.f9910b;
                C0427b.a(list, source, event, interfaceC0443s);
                C0427b.a((List) hashMap.get(EnumC0438m.ON_ANY), source, event, interfaceC0443s);
                return;
        }
    }

    public C0431f(InterfaceC0443s interfaceC0443s) {
        this.f9910b = interfaceC0443s;
        C0429d c0429d = C0429d.f9905c;
        Class<?> cls = interfaceC0443s.getClass();
        C0427b c0427b = (C0427b) c0429d.f9906a.get(cls);
        this.f9911c = c0427b == null ? c0429d.a(cls, null) : c0427b;
    }

    public C0431f(AbstractC0440o abstractC0440o, E0 e02) {
        this.f9910b = abstractC0440o;
        this.f9911c = e02;
    }
}
