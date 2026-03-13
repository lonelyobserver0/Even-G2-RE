package Qb;

import Vb.AbstractC0355a;
import com.stub.StubApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class L {

    /* renamed from: b, reason: collision with root package name */
    public static final F5.c f5816b;

    /* renamed from: c, reason: collision with root package name */
    public static final F5.c f5817c;

    /* renamed from: d, reason: collision with root package name */
    public static final F5.c f5818d;

    /* renamed from: e, reason: collision with root package name */
    public static final F5.c f5819e;

    /* renamed from: f, reason: collision with root package name */
    public static final F5.c f5820f;

    /* renamed from: g, reason: collision with root package name */
    public static final F5.c f5821g;

    /* renamed from: h, reason: collision with root package name */
    public static final F5.c f5822h;

    /* renamed from: a, reason: collision with root package name */
    public static final F5.c f5815a = new F5.c(StubApp.getString2(25472), 24);

    /* renamed from: i, reason: collision with root package name */
    public static final C0184a0 f5823i = new C0184a0(false);
    public static final C0184a0 j = new C0184a0(true);

    static {
        int i3 = 24;
        f5816b = new F5.c(StubApp.getString2(25473), i3);
        f5817c = new F5.c(StubApp.getString2(25474), i3);
        int i10 = 24;
        f5818d = new F5.c(StubApp.getString2(25475), i10);
        f5819e = new F5.c(StubApp.getString2(25476), i10);
        f5820f = new F5.c(StubApp.getString2(25477), i10);
        f5821g = new F5.c(StubApp.getString2(25478), i10);
        f5822h = new F5.c(StubApp.getString2(25479), i10);
    }

    public static C0227w0 a() {
        return new C0227w0(null);
    }

    public static L0 b() {
        return new L0(null);
    }

    public static P c(I i3, C c10, Function2 function2, int i10) {
        CoroutineContext coroutineContext = c10;
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        P p8 = new P(AbstractC0231z.b(i3, coroutineContext), true);
        p8.Y(1, p8, function2);
        return p8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object d(Collection collection, ContinuationImpl continuationImpl) {
        int T7;
        if (collection.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        O[] oArr = (O[]) collection.toArray(new O[0]);
        C0191e c0191e = new C0191e(oArr);
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuationImpl));
        c0203k.s();
        int length = oArr.length;
        C0187c[] c0187cArr = new C0187c[length];
        for (int i3 = 0; i3 < length; i3++) {
            D0 d02 = (D0) oArr[i3];
            do {
                T7 = d02.T(d02.E());
                if (T7 != 0) {
                }
                C0187c c0187c = new C0187c(c0191e, c0203k);
                c0187c.f5853f = d02.J(false, true, c0187c);
                Unit unit = Unit.INSTANCE;
                c0187cArr[i3] = c0187c;
            } while (T7 != 1);
            C0187c c0187c2 = new C0187c(c0191e, c0203k);
            c0187c2.f5853f = d02.J(false, true, c0187c2);
            Unit unit2 = Unit.INSTANCE;
            c0187cArr[i3] = c0187c2;
        }
        C0189d c0189d = new C0189d(c0187cArr);
        for (int i10 = 0; i10 < length; i10++) {
            C0187c c0187c3 = c0187cArr[i10];
            c0187c3.getClass();
            C0187c.f5851h.set(c0187c3, c0189d);
        }
        if (C0203k.f5874g.get(c0203k) instanceof I0) {
            c0203k.u(c0189d);
        } else {
            c0189d.c();
        }
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return r8;
    }

    public static void e(InterfaceC0221t0 interfaceC0221t0) {
        Iterator it = SequencesKt.sequence(new C0((D0) interfaceC0221t0, null)).iterator();
        while (it.hasNext()) {
            ((InterfaceC0221t0) it.next()).d(null);
        }
    }

    public static void f(CoroutineContext coroutineContext) {
        Sequence sequence;
        InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) coroutineContext.get(C0219s0.f5892a);
        if (interfaceC0221t0 == null || (sequence = SequencesKt.sequence(new C0((D0) interfaceC0221t0, null))) == null) {
            return;
        }
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            ((InterfaceC0221t0) it.next()).d(null);
        }
    }

    public static final void g(CoroutineContext coroutineContext) {
        InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) coroutineContext.get(C0219s0.f5892a);
        if (interfaceC0221t0 != null && !interfaceC0221t0.a()) {
            throw ((D0) interfaceC0221t0).z();
        }
    }

    public static final String h(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0203k i(Continuation continuation) {
        C0203k c0203k;
        C0203k c0203k2;
        if (!(continuation instanceof Vb.i)) {
            return new C0203k(1, continuation);
        }
        Vb.i iVar = (Vb.i) continuation;
        iVar.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Vb.i.f7944h;
            Object obj = atomicReferenceFieldUpdater.get(iVar);
            F5.c cVar = AbstractC0355a.f7934c;
            c0203k = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(iVar, cVar);
                c0203k2 = null;
                break;
            }
            if (obj instanceof C0203k) {
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, cVar)) {
                    if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                        break;
                    }
                }
                c0203k2 = (C0203k) obj;
                break loop0;
            }
            if (obj != cVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException((StubApp.getString2(25480) + obj).toString());
            }
        }
        if (c0203k2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0203k.f5874g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0203k2);
            if (!(obj2 instanceof C0218s) || ((C0218s) obj2).f5890d == null) {
                C0203k.f5873f.set(c0203k2, 536870911);
                atomicReferenceFieldUpdater2.set(c0203k2, C0185b.f5846a);
                c0203k = c0203k2;
            } else {
                c0203k2.o();
            }
            if (c0203k != null) {
                return c0203k;
            }
        }
        return new C0203k(2, continuation);
    }

    public static K0 j(I i3, CoroutineContext coroutineContext, Function2 function2, int i10) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        int i11 = (i10 & 2) != 0 ? 1 : 4;
        CoroutineContext b2 = AbstractC0231z.b(i3, coroutineContext);
        K0 e02 = i11 == 2 ? new E0(b2, function2) : new K0(b2, true);
        e02.Y(i11, e02, function2);
        return e02;
    }

    public static Object k(Function2 function2) {
        AbstractC0186b0 abstractC0186b0;
        CoroutineContext a3;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) emptyCoroutineContext.get(companion);
        if (continuationInterceptor == null) {
            abstractC0186b0 = N0.a();
            a3 = AbstractC0231z.a(emptyCoroutineContext, emptyCoroutineContext.plus(abstractC0186b0), true);
            Xb.d dVar = W.f5838a;
            if (a3 != dVar && a3.get(companion) == null) {
                a3 = a3.plus(dVar);
            }
        } else {
            if (continuationInterceptor instanceof AbstractC0186b0) {
            }
            abstractC0186b0 = (AbstractC0186b0) N0.f5826a.get();
            a3 = AbstractC0231z.a(emptyCoroutineContext, emptyCoroutineContext, true);
            Xb.d dVar2 = W.f5838a;
            if (a3 != dVar2 && a3.get(companion) == null) {
                a3 = a3.plus(dVar2);
            }
        }
        C0193f c0193f = new C0193f(a3, currentThread, abstractC0186b0);
        c0193f.Y(1, c0193f, function2);
        AbstractC0186b0 abstractC0186b02 = c0193f.f5864e;
        if (abstractC0186b02 != null) {
            int i3 = AbstractC0186b0.f5847d;
            abstractC0186b02.A(false);
        }
        while (!Thread.interrupted()) {
            try {
                long C10 = abstractC0186b02 != null ? abstractC0186b02.C() : LongCompanionObject.MAX_VALUE;
                if (!(c0193f.E() instanceof InterfaceC0212o0)) {
                    if (abstractC0186b02 != null) {
                        int i10 = AbstractC0186b0.f5847d;
                        abstractC0186b02.v(false);
                    }
                    Object m4 = m(c0193f.E());
                    C0220t c0220t = m4 instanceof C0220t ? (C0220t) m4 : null;
                    if (c0220t == null) {
                        return m4;
                    }
                    throw c0220t.f5894a;
                }
                LockSupport.parkNanos(c0193f, C10);
            } catch (Throwable th) {
                if (abstractC0186b02 != null) {
                    int i11 = AbstractC0186b0.f5847d;
                    abstractC0186b02.v(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0193f.r(interruptedException);
        throw interruptedException;
    }

    public static final String l(Continuation continuation) {
        Object m40constructorimpl;
        if (continuation instanceof Vb.i) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(continuation + '@' + h(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m43exceptionOrNullimpl(m40constructorimpl) != null) {
            m40constructorimpl = continuation.getClass().getName() + '@' + h(continuation);
        }
        return (String) m40constructorimpl;
    }

    public static final Object m(Object obj) {
        InterfaceC0212o0 interfaceC0212o0;
        C0214p0 c0214p0 = obj instanceof C0214p0 ? (C0214p0) obj : null;
        return (c0214p0 == null || (interfaceC0212o0 = c0214p0.f5884a) == null) ? obj : interfaceC0212o0;
    }

    public static final Object n(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        Object m4;
        CoroutineContext coroutineContext2 = continuation.get$context();
        CoroutineContext plus = !((Boolean) coroutineContext.fold(Boolean.FALSE, C0230y.f5899a)).booleanValue() ? coroutineContext2.plus(coroutineContext) : AbstractC0231z.a(coroutineContext2, coroutineContext, false);
        g(plus);
        if (plus == coroutineContext2) {
            Vb.u uVar = new Vb.u(continuation, plus);
            m4 = android.support.v4.media.session.b.y(uVar, uVar, function2);
        } else {
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(plus.get(companion), coroutineContext2.get(companion))) {
                T0 t02 = new T0(continuation, plus);
                CoroutineContext coroutineContext3 = t02.f5844c;
                Object c10 = Vb.B.c(coroutineContext3, null);
                try {
                    Object y10 = android.support.v4.media.session.b.y(t02, t02, function2);
                    Vb.B.a(coroutineContext3, c10);
                    m4 = y10;
                } catch (Throwable th) {
                    Vb.B.a(coroutineContext3, c10);
                    throw th;
                }
            } else {
                T t3 = new T(continuation, plus);
                Wb.a.a(function2, t3, t3);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = T.f5834e;
                    int i3 = atomicIntegerFieldUpdater.get(t3);
                    if (i3 != 0) {
                        if (i3 != 2) {
                            throw new IllegalStateException(StubApp.getString2(25481));
                        }
                        m4 = m(t3.E());
                        if (m4 instanceof C0220t) {
                            throw ((C0220t) m4).f5894a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(t3, 0, 1)) {
                        m4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        break;
                    }
                }
            }
        }
        if (m4 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m4;
    }
}
