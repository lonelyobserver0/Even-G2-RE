package androidx.lifecycle;

import Tb.b0;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import o.C1402a;
import p.C1475a;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0446v extends AbstractC0440o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9923a;

    /* renamed from: b, reason: collision with root package name */
    public C1475a f9924b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0439n f9925c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f9926d;

    /* renamed from: e, reason: collision with root package name */
    public int f9927e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9928f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9929g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f9930h;

    /* renamed from: i, reason: collision with root package name */
    public final b0 f9931i;

    public C0446v(InterfaceC0444t provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        new AtomicReference(null);
        this.f9923a = true;
        this.f9924b = new C1475a();
        EnumC0439n enumC0439n = EnumC0439n.f9914b;
        this.f9925c = enumC0439n;
        this.f9930h = new ArrayList();
        this.f9926d = new WeakReference(provider);
        this.f9931i = new b0(enumC0439n);
    }

    @Override // androidx.lifecycle.AbstractC0440o
    public final void a(InterfaceC0443s object) {
        r c0431f;
        Object obj;
        InterfaceC0444t interfaceC0444t;
        ArrayList arrayList = this.f9930h;
        Intrinsics.checkNotNullParameter(object, "observer");
        d("addObserver");
        EnumC0439n enumC0439n = this.f9925c;
        EnumC0439n initialState = EnumC0439n.f9913a;
        if (enumC0439n != initialState) {
            initialState = EnumC0439n.f9914b;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        C0445u c0445u = new C0445u();
        Intrinsics.checkNotNull(object);
        HashMap hashMap = x.f9933a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z2 = object instanceof r;
        boolean z10 = object instanceof DefaultLifecycleObserver;
        if (z2 && z10) {
            c0431f = new C0431f((DefaultLifecycleObserver) object, (r) object);
        } else if (z10) {
            c0431f = new C0431f((DefaultLifecycleObserver) object, (r) null);
        } else if (z2) {
            c0431f = (r) object;
        } else {
            Class<?> cls = object.getClass();
            if (x.c(cls) == 2) {
                Object obj2 = x.f9934b.get(cls);
                Intrinsics.checkNotNull(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    x.a((Constructor) list.get(0), object);
                    Intrinsics.checkNotNullParameter(null, "generatedAdapter");
                    c0431f = new Q();
                } else {
                    int size = list.size();
                    InterfaceC0433h[] interfaceC0433hArr = new InterfaceC0433h[size];
                    for (int i3 = 0; i3 < size; i3++) {
                        x.a((Constructor) list.get(i3), object);
                        interfaceC0433hArr[i3] = null;
                    }
                    c0431f = new M1.b(interfaceC0433hArr);
                }
            } else {
                c0431f = new C0431f(object);
            }
        }
        c0445u.f9922b = c0431f;
        c0445u.f9921a = initialState;
        C1475a c1475a = this.f9924b;
        p.c a3 = c1475a.a(object);
        if (a3 != null) {
            obj = a3.f19592b;
        } else {
            HashMap hashMap2 = c1475a.f19587e;
            p.c cVar = new p.c(object, c0445u);
            c1475a.f19601d++;
            p.c cVar2 = c1475a.f19599b;
            if (cVar2 == null) {
                c1475a.f19598a = cVar;
                c1475a.f19599b = cVar;
            } else {
                cVar2.f19593c = cVar;
                cVar.f19594d = cVar2;
                c1475a.f19599b = cVar;
            }
            hashMap2.put(object, cVar);
            obj = null;
        }
        if (((C0445u) obj) == null && (interfaceC0444t = (InterfaceC0444t) this.f9926d.get()) != null) {
            boolean z11 = this.f9927e != 0 || this.f9928f;
            EnumC0439n c10 = c(object);
            this.f9927e++;
            while (c0445u.f9921a.compareTo(c10) < 0 && this.f9924b.f19587e.containsKey(object)) {
                arrayList.add(c0445u.f9921a);
                C0436k c0436k = EnumC0438m.Companion;
                EnumC0439n state = c0445u.f9921a;
                c0436k.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                int ordinal = state.ordinal();
                EnumC0438m enumC0438m = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0438m.ON_RESUME : EnumC0438m.ON_START : EnumC0438m.ON_CREATE;
                if (enumC0438m == null) {
                    throw new IllegalStateException("no event up from " + c0445u.f9921a);
                }
                c0445u.a(interfaceC0444t, enumC0438m);
                arrayList.remove(arrayList.size() - 1);
                c10 = c(object);
            }
            if (!z11) {
                h();
            }
            this.f9927e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0440o
    public final void b(InterfaceC0443s observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        d("removeObserver");
        this.f9924b.b(observer);
    }

    public final EnumC0439n c(InterfaceC0443s interfaceC0443s) {
        HashMap hashMap = this.f9924b.f19587e;
        p.c cVar = hashMap.containsKey(interfaceC0443s) ? ((p.c) hashMap.get(interfaceC0443s)).f19594d : null;
        EnumC0439n state1 = cVar != null ? ((C0445u) cVar.f19592b).f9921a : null;
        ArrayList arrayList = this.f9930h;
        EnumC0439n enumC0439n = arrayList.isEmpty() ? null : (EnumC0439n) i2.u.j(1, arrayList);
        EnumC0439n state12 = this.f9925c;
        Intrinsics.checkNotNullParameter(state12, "state1");
        if (state1 == null || state1.compareTo(state12) >= 0) {
            state1 = state12;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (enumC0439n == null || enumC0439n.compareTo(state1) >= 0) ? state1 : enumC0439n;
    }

    public final void d(String str) {
        if (this.f9923a) {
            C1402a.Y().f18013c.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(E1.a.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0438m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC0439n next) {
        if (this.f9925c == next) {
            return;
        }
        InterfaceC0444t interfaceC0444t = (InterfaceC0444t) this.f9926d.get();
        EnumC0439n current = this.f9925c;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == EnumC0439n.f9914b && next == EnumC0439n.f9913a) {
            throw new IllegalStateException(("State must be at least '" + EnumC0439n.f9915c + "' to be moved to '" + next + "' in component " + interfaceC0444t).toString());
        }
        EnumC0439n enumC0439n = EnumC0439n.f9913a;
        if (current == enumC0439n && current != next) {
            throw new IllegalStateException(("State is '" + enumC0439n + "' and cannot be moved to `" + next + "` in component " + interfaceC0444t).toString());
        }
        this.f9925c = next;
        if (this.f9928f || this.f9927e != 0) {
            this.f9929g = true;
            return;
        }
        this.f9928f = true;
        h();
        this.f9928f = false;
        if (this.f9925c == enumC0439n) {
            this.f9924b = new C1475a();
        }
    }

    public final void g(EnumC0439n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        d("setCurrentState");
        f(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f9929g = false;
        r12.f9931i.g(r12.f9925c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0446v.h():void");
    }
}
