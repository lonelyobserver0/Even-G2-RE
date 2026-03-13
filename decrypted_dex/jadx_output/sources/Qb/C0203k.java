package Qb;

import Vb.AbstractC0355a;
import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: Qb.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class C0203k extends U implements InterfaceC0201j, CoroutineStackFrame, V0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5873f = AtomicIntegerFieldUpdater.newUpdater(C0203k.class, StubApp.getString2(25508));

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5874g = AtomicReferenceFieldUpdater.newUpdater(C0203k.class, Object.class, StubApp.getString2(25450));

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5875h = AtomicReferenceFieldUpdater.newUpdater(C0203k.class, Object.class, StubApp.getString2(25451));

    @Volatile
    private volatile int _decisionAndIndex;

    @Volatile
    private volatile Object _parentHandle;

    @Volatile
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final Continuation f5876d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f5877e;

    public C0203k(int i3, Continuation continuation) {
        super(i3);
        this.f5876d = continuation;
        this.f5877e = continuation.get$context();
        this._decisionAndIndex = 536870911;
        this._state = C0185b.f5846a;
    }

    public static Object D(I0 i02, Object obj, int i3, Function1 function1) {
        if (obj instanceof C0220t) {
            return obj;
        }
        if (i3 != 1 && i3 != 2) {
            return obj;
        }
        if (function1 != null || (i02 instanceof AbstractC0199i)) {
            return new C0218s(obj, i02 instanceof AbstractC0199i ? (AbstractC0199i) i02 : null, function1, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(I0 i02, Object obj) {
        throw new IllegalStateException((StubApp.getString2(25509) + i02 + StubApp.getString2(25510) + obj).toString());
    }

    public final void A() {
        Continuation continuation = this.f5876d;
        Throwable th = null;
        Vb.i iVar = continuation instanceof Vb.i ? (Vb.i) continuation : null;
        if (iVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Vb.i.f7944h;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                F5.c cVar = AbstractC0355a.f7934c;
                if (obj == cVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(iVar, cVar, this)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != cVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException((StubApp.getString2(25480) + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                            throw new IllegalArgumentException(StubApp.getString2(353));
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            o();
            n(th);
        }
    }

    public final void B(Object obj, int i3, Function1 function1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5874g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof I0) {
                Object D6 = D((I0) obj2, obj, i3, function1);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D6)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i3);
                return;
            }
            if (obj2 instanceof C0205l) {
                C0205l c0205l = (C0205l) obj2;
                c0205l.getClass();
                if (C0205l.f5878c.compareAndSet(c0205l, 0, 1)) {
                    if (function1 != null) {
                        k(function1, c0205l.f5894a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException((StubApp.getString2(25511) + obj).toString());
        }
    }

    public final void C(C c10, Unit unit) {
        Continuation continuation = this.f5876d;
        Vb.i iVar = continuation instanceof Vb.i ? (Vb.i) continuation : null;
        B(unit, (iVar != null ? iVar.f7945d : null) == c10 ? 4 : this.f5836c, null);
    }

    public final F5.c E(Object obj, Function1 function1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5874g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof I0;
            F5.c cVar = L.f5815a;
            if (!z2) {
                boolean z10 = obj2 instanceof C0218s;
                return null;
            }
            Object D6 = D((I0) obj2, obj, this.f5836c, function1);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D6)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                o();
            }
            return cVar;
        }
    }

    @Override // Qb.V0
    public final void a(Vb.v vVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f5873f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException(StubApp.getString2(25512));
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i3));
        v(vVar);
    }

    @Override // Qb.U
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5874g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof I0) {
                throw new IllegalStateException(StubApp.getString2(25514));
            }
            if (obj2 instanceof C0220t) {
                return;
            }
            if (!(obj2 instanceof C0218s)) {
                cancellationException2 = cancellationException;
                C0218s c0218s = new C0218s(obj2, (AbstractC0199i) null, (Function1) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0218s)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0218s c0218s2 = (C0218s) obj2;
            if (c0218s2.f5891e != null) {
                throw new IllegalStateException(StubApp.getString2(25513));
            }
            C0218s a3 = C0218s.a(c0218s2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            AbstractC0199i abstractC0199i = c0218s2.f5888b;
            if (abstractC0199i != null) {
                j(abstractC0199i, cancellationException);
            }
            Function1 function1 = c0218s2.f5889c;
            if (function1 != null) {
                k(function1, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // Qb.InterfaceC0201j
    public final F5.c c(Object obj, Function1 function1) {
        return E(obj, function1);
    }

    @Override // Qb.U
    public final Continuation d() {
        return this.f5876d;
    }

    @Override // Qb.U
    public final Throwable e(Object obj) {
        Throwable e10 = super.e(obj);
        if (e10 != null) {
            return e10;
        }
        return null;
    }

    @Override // Qb.U
    public final Object f(Object obj) {
        return obj instanceof C0218s ? ((C0218s) obj).f5887a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f5876d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        return this.f5877e;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Qb.U
    public final Object h() {
        return f5874g.get(this);
    }

    @Override // Qb.InterfaceC0201j
    public final void i(Object obj, Function1 function1) {
        B(obj, this.f5836c, function1);
    }

    public final void j(AbstractC0199i abstractC0199i, Throwable th) {
        try {
            abstractC0199i.b(th);
        } catch (Throwable th2) {
            F.a(this.f5877e, new H9.b(StubApp.getString2(25515) + this, th2));
        }
    }

    public final void k(Function1 function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            F.a(this.f5877e, new H9.b(StubApp.getString2(25516) + this, th2));
        }
    }

    @Override // Qb.InterfaceC0201j
    public final void l(Object obj) {
        p(this.f5836c);
    }

    public final void m(Vb.v vVar, Throwable th) {
        CoroutineContext coroutineContext = this.f5877e;
        int i3 = f5873f.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException(StubApp.getString2(25517));
        }
        try {
            vVar.g(i3, coroutineContext);
        } catch (Throwable th2) {
            F.a(coroutineContext, new H9.b(StubApp.getString2(25515) + this, th2));
        }
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5874g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof I0)) {
                return false;
            }
            C0205l c0205l = new C0205l(this, th, (obj instanceof AbstractC0199i) || (obj instanceof Vb.v));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0205l)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            I0 i02 = (I0) obj;
            if (i02 instanceof AbstractC0199i) {
                j((AbstractC0199i) obj, th);
            } else if (i02 instanceof Vb.v) {
                m((Vb.v) obj, th);
            }
            if (!x()) {
                o();
            }
            p(this.f5836c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5875h;
        Y y10 = (Y) atomicReferenceFieldUpdater.get(this);
        if (y10 == null) {
            return;
        }
        y10.dispose();
        atomicReferenceFieldUpdater.set(this, H0.f5814a);
    }

    public final void p(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f5873f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException(StubApp.getString2(25492));
                }
                boolean z2 = i3 == 4;
                Continuation continuation = this.f5876d;
                if (!z2 && (continuation instanceof Vb.i)) {
                    boolean z10 = i3 == 1 || i3 == 2;
                    int i12 = this.f5836c;
                    if (z10 == (i12 == 1 || i12 == 2)) {
                        C c10 = ((Vb.i) continuation).f7945d;
                        CoroutineContext coroutineContext = ((Vb.i) continuation).f7946e.get$context();
                        if (c10.isDispatchNeeded(coroutineContext)) {
                            c10.dispatch(coroutineContext, this);
                            return;
                        }
                        AbstractC0186b0 a3 = N0.a();
                        if (a3.f5848a >= 4294967296L) {
                            ArrayDeque arrayDeque = a3.f5850c;
                            if (arrayDeque == null) {
                                arrayDeque = new ArrayDeque();
                                a3.f5850c = arrayDeque;
                            }
                            arrayDeque.addLast(this);
                            return;
                        }
                        a3.A(true);
                        try {
                            V.a(this, continuation, true);
                            do {
                            } while (a3.F());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                V.a(this, continuation, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(D0 d02) {
        return d02.z();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean x7 = x();
        do {
            atomicIntegerFieldUpdater = f5873f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i10 = i3 >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException(StubApp.getString2(25481));
                }
                if (x7) {
                    A();
                }
                Object obj = f5874g.get(this);
                if (obj instanceof C0220t) {
                    throw ((C0220t) obj).f5894a;
                }
                int i11 = this.f5836c;
                if (i11 == 1 || i11 == 2) {
                    InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) this.f5877e.get(C0219s0.f5892a);
                    if (interfaceC0221t0 != null && !interfaceC0221t0.a()) {
                        CancellationException z2 = ((D0) interfaceC0221t0).z();
                        b(obj, z2);
                        throw z2;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, PKIFailureInfo.duplicateCertReq + (536870911 & i3)));
        if (((Y) f5875h.get(this)) == null) {
            t();
        }
        if (x7) {
            A();
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(obj);
        if (m43exceptionOrNullimpl != null) {
            obj = new C0220t(m43exceptionOrNullimpl, false);
        }
        B(obj, this.f5836c, null);
    }

    public final void s() {
        Y t3 = t();
        if (t3 == null || (f5874g.get(this) instanceof I0)) {
            return;
        }
        t3.dispose();
        f5875h.set(this, H0.f5814a);
    }

    public final Y t() {
        Y J10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) this.f5877e.get(C0219s0.f5892a);
        if (interfaceC0221t0 == null) {
            return null;
        }
        J10 = ((D0) interfaceC0221t0).J((r5 & 1) == 0, (r5 & 2) != 0, new C0207m(this));
        do {
            atomicReferenceFieldUpdater = f5875h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, J10)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return J10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(L.l(this.f5876d));
        sb2.append(StubApp.getString2(25518));
        Object obj = f5874g.get(this);
        sb2.append(obj instanceof I0 ? StubApp.getString2(25454) : obj instanceof C0205l ? StubApp.getString2(13676) : StubApp.getString2(25456));
        sb2.append(StubApp.getString2(25519));
        sb2.append(L.h(this));
        return sb2.toString();
    }

    public final void u(Function1 function1) {
        v(function1 instanceof AbstractC0199i ? (AbstractC0199i) function1 : new C0197h(function1, 2));
    }

    public final void v(I0 i02) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5874g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0185b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i02)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof AbstractC0199i ? true : obj instanceof Vb.v) {
                y(i02, obj);
                throw null;
            }
            if (obj instanceof C0220t) {
                C0220t c0220t = (C0220t) obj;
                c0220t.getClass();
                if (!C0220t.f5893b.compareAndSet(c0220t, 0, 1)) {
                    y(i02, obj);
                    throw null;
                }
                if (obj instanceof C0205l) {
                    if (obj == null) {
                        c0220t = null;
                    }
                    Throwable th = c0220t != null ? c0220t.f5894a : null;
                    if (i02 instanceof AbstractC0199i) {
                        j((AbstractC0199i) i02, th);
                        return;
                    } else {
                        Intrinsics.checkNotNull(i02, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((Vb.v) i02, th);
                        return;
                    }
                }
                return;
            }
            boolean z2 = obj instanceof C0218s;
            String string2 = StubApp.getString2(25520);
            if (!z2) {
                if (i02 instanceof Vb.v) {
                    return;
                }
                Intrinsics.checkNotNull(i02, string2);
                C0218s c0218s = new C0218s(obj, (AbstractC0199i) i02, (Function1) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0218s)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0218s c0218s2 = (C0218s) obj;
            if (c0218s2.f5888b != null) {
                y(i02, obj);
                throw null;
            }
            if (i02 instanceof Vb.v) {
                return;
            }
            Intrinsics.checkNotNull(i02, string2);
            AbstractC0199i abstractC0199i = (AbstractC0199i) i02;
            Throwable th2 = c0218s2.f5891e;
            if (th2 != null) {
                j(abstractC0199i, th2);
                return;
            }
            C0218s a3 = C0218s.a(c0218s2, abstractC0199i, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        return f5874g.get(this) instanceof I0;
    }

    public final boolean x() {
        if (this.f5836c != 2) {
            return false;
        }
        String string2 = StubApp.getString2(25521);
        Continuation continuation = this.f5876d;
        Intrinsics.checkNotNull(continuation, string2);
        Vb.i iVar = (Vb.i) continuation;
        iVar.getClass();
        return Vb.i.f7944h.get(iVar) != null;
    }

    public String z() {
        return StubApp.getString2(25522);
    }
}
