package Qb;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class D0 implements InterfaceC0221t0, J0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5809a = AtomicReferenceFieldUpdater.newUpdater(D0.class, Object.class, StubApp.getString2(25450));

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5810b = AtomicReferenceFieldUpdater.newUpdater(D0.class, Object.class, StubApp.getString2(25451));

    @Volatile
    private volatile Object _parentHandle;

    @Volatile
    private volatile Object _state;

    public D0(boolean z2) {
        this._state = z2 ? L.j : L.f5823i;
    }

    public static C0211o O(Vb.m mVar) {
        while (mVar.h()) {
            Vb.m d8 = mVar.d();
            if (d8 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Vb.m.f7957b;
                Object obj = atomicReferenceFieldUpdater.get(mVar);
                while (true) {
                    mVar = (Vb.m) obj;
                    if (!mVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mVar);
                }
            } else {
                mVar = d8;
            }
        }
        while (true) {
            mVar = mVar.g();
            if (!mVar.h()) {
                if (mVar instanceof C0211o) {
                    return (C0211o) mVar;
                }
                if (mVar instanceof G0) {
                    return null;
                }
            }
        }
    }

    public static String U(Object obj) {
        if (obj instanceof A0) {
            A0 a02 = (A0) obj;
            if (a02.e()) {
                return StubApp.getString2(25452);
            }
            if (a02.f()) {
                return StubApp.getString2(25453);
            }
        } else {
            if (!(obj instanceof InterfaceC0212o0)) {
                return obj instanceof C0220t ? StubApp.getString2(13676) : StubApp.getString2(25456);
            }
            if (!((InterfaceC0212o0) obj).a()) {
                return StubApp.getString2(25455);
            }
        }
        return StubApp.getString2(25454);
    }

    public final Throwable A(A0 a02, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (a02.e()) {
                return new C0223u0(u(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof O0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof O0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof C0215q;
    }

    public final G0 D(InterfaceC0212o0 interfaceC0212o0) {
        G0 c10 = interfaceC0212o0.c();
        if (c10 != null) {
            return c10;
        }
        if (interfaceC0212o0 instanceof C0184a0) {
            return new G0();
        }
        if (interfaceC0212o0 instanceof AbstractC0229x0) {
            S((AbstractC0229x0) interfaceC0212o0);
            return null;
        }
        throw new IllegalStateException((StubApp.getString2(25457) + interfaceC0212o0).toString());
    }

    public final Object E() {
        while (true) {
            Object obj = f5809a.get(this);
            if (!(obj instanceof Vb.r)) {
                return obj;
            }
            ((Vb.r) obj).a(this);
        }
    }

    public boolean F(Throwable th) {
        return false;
    }

    public void G(H9.b bVar) {
        throw bVar;
    }

    public final void H(InterfaceC0221t0 interfaceC0221t0) {
        int T7;
        Y J10;
        H0 h0 = H0.f5814a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5810b;
        if (interfaceC0221t0 == null) {
            atomicReferenceFieldUpdater.set(this, h0);
            return;
        }
        D0 d02 = (D0) interfaceC0221t0;
        do {
            T7 = d02.T(d02.E());
            if (T7 == 0) {
                break;
            }
        } while (T7 != 1);
        J10 = d02.J((r5 & 1) == 0, (r5 & 2) != 0, new C0211o(this));
        Intrinsics.checkNotNull(J10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        InterfaceC0209n interfaceC0209n = (InterfaceC0209n) J10;
        atomicReferenceFieldUpdater.set(this, interfaceC0209n);
        if (E() instanceof InterfaceC0212o0) {
            return;
        }
        interfaceC0209n.dispose();
        atomicReferenceFieldUpdater.set(this, h0);
    }

    public final Y I(Function1 function1) {
        return J(false, true, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Qb.Y J(boolean r8, boolean r9, kotlin.jvm.functions.Function1 r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.D0.J(boolean, boolean, kotlin.jvm.functions.Function1):Qb.Y");
    }

    public boolean K() {
        return this instanceof C0193f;
    }

    public final boolean L(Object obj) {
        Object V10;
        do {
            V10 = V(E(), obj);
            if (V10 == L.f5818d) {
                return false;
            }
            if (V10 == L.f5819e) {
                return true;
            }
        } while (V10 == L.f5820f);
        n(V10);
        return true;
    }

    public final Object M(Object obj) {
        Object V10;
        do {
            V10 = V(E(), obj);
            if (V10 == L.f5818d) {
                String str = StubApp.getString2(25458) + this + StubApp.getString2(25459) + obj;
                C0220t c0220t = obj instanceof C0220t ? (C0220t) obj : null;
                throw new IllegalStateException(str, c0220t != null ? c0220t.f5894a : null);
            }
        } while (V10 == L.f5820f);
        return V10;
    }

    public String N() {
        return getClass().getSimpleName();
    }

    public final void P(G0 g02, Throwable th) {
        Object f10 = g02.f();
        Intrinsics.checkNotNull(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        H9.b bVar = null;
        for (Vb.m mVar = (Vb.m) f10; !Intrinsics.areEqual(mVar, g02); mVar = mVar.g()) {
            if (mVar instanceof AbstractC0225v0) {
                AbstractC0229x0 abstractC0229x0 = (AbstractC0229x0) mVar;
                try {
                    abstractC0229x0.j(th);
                } catch (Throwable th2) {
                    if (bVar != null) {
                        ExceptionsKt.addSuppressed(bVar, th2);
                    } else {
                        bVar = new H9.b(StubApp.getString2(25460) + abstractC0229x0 + StubApp.getString2(6035) + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (bVar != null) {
            G(bVar);
        }
        t(th);
    }

    public void Q(Object obj) {
    }

    public void R() {
    }

    public final void S(AbstractC0229x0 abstractC0229x0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        G0 g02 = new G0();
        abstractC0229x0.getClass();
        Vb.m.f7957b.lazySet(g02, abstractC0229x0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Vb.m.f7956a;
        atomicReferenceFieldUpdater2.lazySet(g02, abstractC0229x0);
        loop0: while (true) {
            if (abstractC0229x0.f() == abstractC0229x0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC0229x0, abstractC0229x0, g02)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC0229x0) != abstractC0229x0) {
                        break;
                    }
                }
                g02.e(abstractC0229x0);
                break loop0;
            }
            break;
        }
        Vb.m g10 = abstractC0229x0.g();
        do {
            atomicReferenceFieldUpdater = f5809a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0229x0, g10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0229x0);
    }

    public final int T(Object obj) {
        boolean z2 = obj instanceof C0184a0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5809a;
        if (z2) {
            if (((C0184a0) obj).f5845a) {
                return 0;
            }
            C0184a0 c0184a0 = L.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0184a0)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            R();
            return 1;
        }
        if (!(obj instanceof C0210n0)) {
            return 0;
        }
        G0 g02 = ((C0210n0) obj).f5882a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g02)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        R();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.Throwable] */
    public final Object V(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Y J10;
        if (!(obj instanceof InterfaceC0212o0)) {
            return L.f5818d;
        }
        if (((obj instanceof C0184a0) || (obj instanceof AbstractC0229x0)) && !(obj instanceof C0211o) && !(obj2 instanceof C0220t)) {
            InterfaceC0212o0 interfaceC0212o0 = (InterfaceC0212o0) obj;
            Object c0214p0 = obj2 instanceof InterfaceC0212o0 ? new C0214p0((InterfaceC0212o0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f5809a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0212o0, c0214p0)) {
                    Q(obj2);
                    w(interfaceC0212o0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0212o0);
            return L.f5820f;
        }
        InterfaceC0212o0 interfaceC0212o02 = (InterfaceC0212o0) obj;
        G0 D6 = D(interfaceC0212o02);
        if (D6 == null) {
            return L.f5820f;
        }
        C0211o c0211o = null;
        A0 a02 = interfaceC0212o02 instanceof A0 ? (A0) interfaceC0212o02 : null;
        if (a02 == null) {
            a02 = new A0(D6, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (a02) {
            if (a02.f()) {
                return L.f5818d;
            }
            A0.f5795b.set(a02, 1);
            if (a02 != interfaceC0212o02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5809a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0212o02, a02)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC0212o02) {
                        return L.f5820f;
                    }
                }
            }
            boolean e10 = a02.e();
            C0220t c0220t = obj2 instanceof C0220t ? (C0220t) obj2 : null;
            if (c0220t != null) {
                a02.b(c0220t.f5894a);
            }
            ?? d8 = !e10 ? a02.d() : 0;
            objectRef.element = d8;
            Unit unit = Unit.INSTANCE;
            if (d8 != 0) {
                P(D6, d8);
            }
            C0211o c0211o2 = interfaceC0212o02 instanceof C0211o ? (C0211o) interfaceC0212o02 : null;
            if (c0211o2 == null) {
                G0 c10 = interfaceC0212o02.c();
                if (c10 != null) {
                    c0211o = O(c10);
                }
            } else {
                c0211o = c0211o2;
            }
            if (c0211o != null) {
                do {
                    J10 = c0211o.f5883e.J((r5 & 1) == 0, (r5 & 2) != 0, new z0(this, a02, c0211o, obj2));
                    if (J10 != H0.f5814a) {
                        return L.f5819e;
                    }
                    c0211o = O(c0211o);
                } while (c0211o != null);
            }
            return y(a02, obj2);
        }
    }

    @Override // Qb.InterfaceC0221t0
    public boolean a() {
        Object E10 = E();
        return (E10 instanceof InterfaceC0212o0) && ((InterfaceC0212o0) E10).a();
    }

    @Override // Qb.InterfaceC0221t0
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0223u0(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext, kotlin.coroutines.ContinuationInterceptor
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return C0219s0.f5892a;
    }

    public final boolean m(InterfaceC0212o0 interfaceC0212o0, G0 g02, AbstractC0229x0 abstractC0229x0) {
        char c10;
        B0 b02 = new B0(abstractC0229x0, this, interfaceC0212o0);
        do {
            Vb.m d8 = g02.d();
            if (d8 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Vb.m.f7957b;
                Object obj = atomicReferenceFieldUpdater.get(g02);
                while (true) {
                    d8 = (Vb.m) obj;
                    if (!d8.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d8);
                }
            }
            Vb.m.f7957b.lazySet(abstractC0229x0, d8);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Vb.m.f7956a;
            atomicReferenceFieldUpdater2.lazySet(abstractC0229x0, g02);
            b02.f5800c = g02;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(d8, g02, b02)) {
                    c10 = b02.a(d8) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(d8) != g02) {
                    c10 = 0;
                    break;
                }
            }
            if (c10 == 1) {
                return true;
            }
        } while (c10 != 2);
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext, kotlin.coroutines.ContinuationInterceptor
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    public void n(Object obj) {
    }

    public void o(Object obj) {
        n(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    public final Object q(ContinuationImpl continuationImpl) {
        Object E10;
        do {
            E10 = E();
            if (!(E10 instanceof InterfaceC0212o0)) {
                if (E10 instanceof C0220t) {
                    throw ((C0220t) E10).f5894a;
                }
                return L.m(E10);
            }
        } while (T(E10) < 0);
        y0 y0Var = new y0(this, IntrinsicsKt.intercepted(continuationImpl));
        y0Var.s();
        y0Var.u(new C0197h(J(false, true, new Z(y0Var, 2)), 1));
        Object r8 = y0Var.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return r8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == Qb.L.f5819e) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.D0.r(java.lang.Object):boolean");
    }

    public void s(CancellationException cancellationException) {
        r(cancellationException);
    }

    public final boolean t(Throwable th) {
        if (K()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0209n interfaceC0209n = (InterfaceC0209n) f5810b.get(this);
        return (interfaceC0209n == null || interfaceC0209n == H0.f5814a) ? z2 : interfaceC0209n.b(th) || z2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(N() + '{' + U(E()) + '}');
        sb2.append('@');
        sb2.append(L.h(this));
        return sb2.toString();
    }

    public String u() {
        return StubApp.getString2(25462);
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return r(th) && B();
    }

    public final void w(InterfaceC0212o0 interfaceC0212o0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5810b;
        InterfaceC0209n interfaceC0209n = (InterfaceC0209n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0209n != null) {
            interfaceC0209n.dispose();
            atomicReferenceFieldUpdater.set(this, H0.f5814a);
        }
        H9.b bVar = null;
        C0220t c0220t = obj instanceof C0220t ? (C0220t) obj : null;
        Throwable th = c0220t != null ? c0220t.f5894a : null;
        boolean z2 = interfaceC0212o0 instanceof AbstractC0229x0;
        String string2 = StubApp.getString2(6035);
        String string22 = StubApp.getString2(25460);
        if (z2) {
            try {
                ((AbstractC0229x0) interfaceC0212o0).j(th);
                return;
            } catch (Throwable th2) {
                G(new H9.b(string22 + interfaceC0212o0 + string2 + this, th2));
                return;
            }
        }
        G0 c10 = interfaceC0212o0.c();
        if (c10 != null) {
            Object f10 = c10.f();
            Intrinsics.checkNotNull(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (Vb.m mVar = (Vb.m) f10; !Intrinsics.areEqual(mVar, c10); mVar = mVar.g()) {
                if (mVar instanceof AbstractC0229x0) {
                    AbstractC0229x0 abstractC0229x0 = (AbstractC0229x0) mVar;
                    try {
                        abstractC0229x0.j(th);
                    } catch (Throwable th3) {
                        if (bVar != null) {
                            ExceptionsKt.addSuppressed(bVar, th3);
                        } else {
                            bVar = new H9.b(string22 + abstractC0229x0 + string2 + this, th3);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
            }
            if (bVar != null) {
                G(bVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Throwable] */
    public final Throwable x(Object obj) {
        CancellationException cancellationException;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C0223u0(u(), null, this) : th;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        D0 d02 = (D0) ((J0) obj);
        Object E10 = d02.E();
        if (E10 instanceof A0) {
            cancellationException = ((A0) E10).d();
        } else if (E10 instanceof C0220t) {
            cancellationException = ((C0220t) E10).f5894a;
        } else {
            if (E10 instanceof InterfaceC0212o0) {
                throw new IllegalStateException((StubApp.getString2(25464) + E10).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            return new C0223u0(StubApp.getString2(25463).concat(U(E10)), cancellationException, d02);
        }
        return cancellationException2;
    }

    public final Object y(A0 a02, Object obj) {
        Throwable A4;
        C0220t c0220t = obj instanceof C0220t ? (C0220t) obj : null;
        Throwable th = c0220t != null ? c0220t.f5894a : null;
        synchronized (a02) {
            a02.e();
            ArrayList<Throwable> g10 = a02.g(th);
            A4 = A(a02, g10);
            if (A4 != null && g10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g10.size()));
                for (Throwable th2 : g10) {
                    if (th2 != A4 && th2 != A4 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        ExceptionsKt.addSuppressed(A4, th2);
                    }
                }
            }
        }
        if (A4 != null && A4 != th) {
            obj = new C0220t(A4, false);
        }
        if (A4 != null && (t(A4) || F(A4))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0220t c0220t2 = (C0220t) obj;
            c0220t2.getClass();
            C0220t.f5893b.compareAndSet(c0220t2, 0, 1);
        }
        Q(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5809a;
        Object c0214p0 = obj instanceof InterfaceC0212o0 ? new C0214p0((InterfaceC0212o0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, a02, c0214p0) && atomicReferenceFieldUpdater.get(this) == a02) {
        }
        w(a02, obj);
        return obj;
    }

    public final CancellationException z() {
        CancellationException cancellationException;
        Object E10 = E();
        boolean z2 = E10 instanceof A0;
        String string2 = StubApp.getString2(25465);
        if (!z2) {
            if (E10 instanceof InterfaceC0212o0) {
                throw new IllegalStateException((string2 + this).toString());
            }
            if (!(E10 instanceof C0220t)) {
                return new C0223u0(getClass().getSimpleName().concat(StubApp.getString2(25467)), null, this);
            }
            Throwable th = ((C0220t) E10).f5894a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C0223u0(u(), th, this) : cancellationException;
        }
        Throwable d8 = ((A0) E10).d();
        if (d8 == null) {
            throw new IllegalStateException((string2 + this).toString());
        }
        String concat = getClass().getSimpleName().concat(StubApp.getString2(25466));
        cancellationException = d8 instanceof CancellationException ? (CancellationException) d8 : null;
        if (cancellationException == null) {
            if (concat == null) {
                concat = u();
            }
            cancellationException = new C0223u0(concat, d8, this);
        }
        return cancellationException;
    }
}
