package Sb;

import Qb.C0203k;
import Qb.InterfaceC0201j;
import Qb.L;
import Qb.V0;
import Vb.AbstractC0355a;
import Vb.AbstractC0358d;
import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.time.DurationKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class e implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f6682b = AtomicLongFieldUpdater.newUpdater(e.class, StubApp.getString2(25602));

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f6683c = AtomicLongFieldUpdater.newUpdater(e.class, StubApp.getString2(25603));

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f6684d = AtomicLongFieldUpdater.newUpdater(e.class, StubApp.getString2(25604));

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f6685e = AtomicLongFieldUpdater.newUpdater(e.class, StubApp.getString2(25605));

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6686f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, StubApp.getString2(25606));

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6687g = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, StubApp.getString2(25607));

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6688h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, StubApp.getString2(25608));
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, StubApp.getString2(25609));

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6689k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, StubApp.getString2(25610));

    @Volatile
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f6690a;

    @Volatile
    private volatile long bufferEnd;

    @Volatile
    private volatile Object bufferEndSegment;

    @Volatile
    private volatile Object closeHandler;

    @Volatile
    private volatile long completedExpandBuffersAndPauseFlag;

    @Volatile
    private volatile Object receiveSegment;

    @Volatile
    private volatile long receivers;

    @Volatile
    private volatile Object sendSegment;

    @Volatile
    private volatile long sendersAndCloseStatus;

    public e(int i3) {
        this.f6690a = i3;
        if (i3 < 0) {
            throw new IllegalArgumentException(Xa.h.g(i3, StubApp.getString2(25611), StubApp.getString2(25612)).toString());
        }
        n nVar = g.f6692a;
        this.bufferEnd = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : LongCompanionObject.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f6684d.get(this);
        n nVar2 = new n(0L, null, this, 3);
        this.sendSegment = nVar2;
        this.receiveSegment = nVar2;
        if (y()) {
            nVar2 = g.f6692a;
            Intrinsics.checkNotNull(nVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = nVar2;
        this._closeCause = g.f6709s;
    }

    public static final n a(e eVar, long j3, n nVar) {
        Object a3;
        e eVar2;
        eVar.getClass();
        n nVar2 = g.f6692a;
        f fVar = f.f6691a;
        loop0: while (true) {
            a3 = AbstractC0358d.a(nVar, j3, fVar);
            if (!AbstractC0355a.d(a3)) {
                Vb.v b2 = AbstractC0355a.b(a3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6686f;
                    Vb.v vVar = (Vb.v) atomicReferenceFieldUpdater.get(eVar);
                    if (vVar.f7972c >= b2.f7972c) {
                        break loop0;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, vVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != vVar) {
                            if (b2.e()) {
                                b2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean d8 = AbstractC0355a.d(a3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6683c;
        if (d8) {
            eVar.w();
            if (nVar.f7972c * g.f6693b < atomicLongFieldUpdater.get(eVar)) {
                nVar.a();
                return null;
            }
        } else {
            n nVar3 = (n) AbstractC0355a.b(a3);
            long j10 = nVar3.f7972c;
            if (j10 <= j3) {
                return nVar3;
            }
            long j11 = g.f6693b * j10;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6682b;
                long j12 = atomicLongFieldUpdater2.get(eVar);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    eVar2 = eVar;
                    break;
                }
                eVar2 = eVar;
                if (atomicLongFieldUpdater2.compareAndSet(eVar2, j12, j13 + (((int) (j12 >> 60)) << 60))) {
                    break;
                }
                eVar = eVar2;
            }
            if (j10 * g.f6693b < atomicLongFieldUpdater.get(eVar2)) {
                nVar3.a();
            }
        }
        return null;
    }

    public static final void c(e eVar, Object obj, C0203k c0203k) {
        eVar.getClass();
        Throwable r8 = eVar.r();
        Result.Companion companion = Result.INSTANCE;
        c0203k.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(r8)));
    }

    public static final int e(e eVar, n nVar, int i3, Object obj, long j3, Object obj2, boolean z2) {
        eVar.getClass();
        nVar.m(i3, obj);
        if (z2) {
            return eVar.F(nVar, i3, obj, j3, obj2, z2);
        }
        Object k3 = nVar.k(i3);
        if (k3 == null) {
            if (eVar.h(j3)) {
                if (nVar.j(i3, null, g.f6695d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (nVar.j(i3, null, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof V0) {
            nVar.m(i3, null);
            if (eVar.C(k3, obj)) {
                nVar.n(i3, g.f6700i);
                return 0;
            }
            F5.c cVar = g.f6701k;
            if (nVar.f6718f.getAndSet((i3 * 2) + 1, cVar) == cVar) {
                return 5;
            }
            nVar.l(i3, true);
            return 5;
        }
        return eVar.F(nVar, i3, obj, j3, obj2, z2);
    }

    public static void t(e eVar) {
        eVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6685e;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object A(Object obj, Continuation continuation) {
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        Throwable r8 = r();
        Result.Companion companion = Result.INSTANCE;
        c0203k.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(r8)));
        Object r10 = c0203k.r();
        if (r10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? r10 : Unit.INSTANCE;
    }

    public final void B(V0 v02, boolean z2) {
        if (v02 instanceof InterfaceC0201j) {
            Continuation continuation = (Continuation) v02;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(z2 ? q() : r())));
            return;
        }
        if (!(v02 instanceof a)) {
            if (v02 instanceof Yb.d) {
                ((Yb.c) ((Yb.d) v02)).h(this, g.f6702l);
                return;
            } else {
                throw new IllegalStateException((StubApp.getString2(25613) + v02).toString());
            }
        }
        a aVar = (a) v02;
        C0203k c0203k = aVar.f6678b;
        Intrinsics.checkNotNull(c0203k);
        aVar.f6678b = null;
        aVar.f6677a = g.f6702l;
        Throwable p8 = aVar.f6679c.p();
        if (p8 == null) {
            Result.Companion companion2 = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(Boolean.FALSE));
        } else {
            Result.Companion companion3 = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(p8)));
        }
    }

    public final boolean C(Object obj, Object obj2) {
        if (obj instanceof Yb.d) {
            return ((Yb.c) ((Yb.d) obj)).h(this, obj2);
        }
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0201j)) {
                throw new IllegalStateException((StubApp.getString2(25614) + obj).toString());
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0201j interfaceC0201j = (InterfaceC0201j) obj;
            n nVar = g.f6692a;
            F5.c c10 = interfaceC0201j.c(obj2, null);
            if (c10 == null) {
                return false;
            }
            interfaceC0201j.l(c10);
            return true;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0203k c0203k = aVar.f6678b;
        Intrinsics.checkNotNull(c0203k);
        aVar.f6678b = null;
        aVar.f6677a = obj2;
        Boolean bool = Boolean.TRUE;
        aVar.f6679c.getClass();
        n nVar2 = g.f6692a;
        F5.c c11 = c0203k.c(bool, null);
        if (c11 == null) {
            return false;
        }
        c0203k.l(c11);
        return true;
    }

    public final boolean D(Object obj, n nVar, int i3) {
        char c10;
        if (obj instanceof InterfaceC0201j) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            InterfaceC0201j interfaceC0201j = (InterfaceC0201j) obj;
            Unit unit = Unit.INSTANCE;
            n nVar2 = g.f6692a;
            F5.c c11 = interfaceC0201j.c(unit, null);
            if (c11 == null) {
                return false;
            }
            interfaceC0201j.l(c11);
            return true;
        }
        if (!(obj instanceof Yb.d)) {
            throw new IllegalStateException((StubApp.getString2(25613) + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int i10 = ((Yb.c) obj).i(this, Unit.INSTANCE);
        if (i10 == 0) {
            c10 = 1;
        } else if (i10 != 1) {
            c10 = 3;
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException((StubApp.getString2(25615) + i10).toString());
                }
                c10 = 4;
            }
        } else {
            c10 = 2;
        }
        if (c10 == 2) {
            nVar.m(i3, null);
        }
        return c10 == 1;
    }

    public final Object E(n nVar, int i3, long j3, Object obj) {
        Object k3 = nVar.k(i3);
        AtomicReferenceArray atomicReferenceArray = nVar.f6718f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6682b;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f6704n;
                }
                if (nVar.j(i3, k3, obj)) {
                    n();
                    return g.f6703m;
                }
            }
        } else if (k3 == g.f6695d && nVar.j(i3, k3, g.f6700i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            nVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object k4 = nVar.k(i3);
            if (k4 == null || k4 == g.f6696e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (nVar.j(i3, k4, g.f6699h)) {
                        n();
                        return g.f6705o;
                    }
                } else {
                    if (obj == null) {
                        return g.f6704n;
                    }
                    if (nVar.j(i3, k4, obj)) {
                        n();
                        return g.f6703m;
                    }
                }
            } else {
                if (k4 != g.f6695d) {
                    F5.c cVar = g.j;
                    if (k4 != cVar && k4 != g.f6699h) {
                        if (k4 == g.f6702l) {
                            n();
                            return g.f6705o;
                        }
                        if (k4 != g.f6698g && nVar.j(i3, k4, g.f6697f)) {
                            boolean z2 = k4 instanceof y;
                            if (z2) {
                                k4 = ((y) k4).f6727a;
                            }
                            if (D(k4, nVar, i3)) {
                                nVar.n(i3, g.f6700i);
                                n();
                                Object obj3 = atomicReferenceArray.get(i3 * 2);
                                nVar.m(i3, null);
                                return obj3;
                            }
                            nVar.n(i3, cVar);
                            nVar.h();
                            if (z2) {
                                n();
                            }
                            return g.f6705o;
                        }
                    }
                    return g.f6705o;
                }
                if (nVar.j(i3, k4, g.f6700i)) {
                    n();
                    Object obj4 = atomicReferenceArray.get(i3 * 2);
                    nVar.m(i3, null);
                    return obj4;
                }
            }
        }
    }

    public final int F(n nVar, int i3, Object obj, long j3, Object obj2, boolean z2) {
        while (true) {
            Object k3 = nVar.k(i3);
            if (k3 == null) {
                if (!h(j3) || z2) {
                    if (z2) {
                        if (nVar.j(i3, null, g.j)) {
                            nVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (nVar.j(i3, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (nVar.j(i3, null, g.f6695d)) {
                    break;
                }
            } else {
                if (k3 != g.f6696e) {
                    F5.c cVar = g.f6701k;
                    if (k3 == cVar) {
                        nVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == g.f6699h) {
                        nVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == g.f6702l) {
                        nVar.m(i3, null);
                        w();
                        return 4;
                    }
                    nVar.m(i3, null);
                    if (k3 instanceof y) {
                        k3 = ((y) k3).f6727a;
                    }
                    if (C(k3, obj)) {
                        nVar.n(i3, g.f6700i);
                        return 0;
                    }
                    if (nVar.f6718f.getAndSet((i3 * 2) + 1, cVar) != cVar) {
                        nVar.l(i3, true);
                    }
                    return 5;
                }
                if (nVar.j(i3, k3, g.f6695d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void G(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        e eVar = this;
        if (eVar.y()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f6684d;
            if (atomicLongFieldUpdater.get(eVar) > j3) {
                break;
            } else {
                eVar = this;
            }
        }
        int i3 = g.f6694c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6685e;
            if (i10 < i3) {
                long j10 = atomicLongFieldUpdater.get(eVar);
                if (j10 == (DurationKt.MAX_MILLIS & atomicLongFieldUpdater2.get(eVar)) && j10 == atomicLongFieldUpdater.get(eVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j11, (j11 & DurationKt.MAX_MILLIS) + 4611686018427387904L)) {
                        break;
                    } else {
                        eVar = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(eVar);
                    long j13 = atomicLongFieldUpdater2.get(eVar);
                    long j14 = j13 & DurationKt.MAX_MILLIS;
                    boolean z2 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(eVar)) {
                        break;
                    }
                    if (!z2) {
                        atomicLongFieldUpdater2.compareAndSet(this, j13, 4611686018427387904L + j14);
                    }
                    eVar = this;
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j15, j15 & DurationKt.MAX_MILLIS)) {
                        return;
                    } else {
                        eVar = this;
                    }
                }
            }
        }
    }

    @Override // Sb.w
    public final Q2.g b() {
        b bVar = b.f6680a;
        Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bVar, 3);
        c cVar = c.f6681a;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new Q2.g(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(cVar, 3), (d) null);
    }

    @Override // Sb.w
    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException(StubApp.getString2(25616));
        }
        i(cancellationException, true);
    }

    @Override // Sb.w
    public final Object f(Continuation continuation) {
        n nVar;
        Throwable th;
        n nVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6687g;
        n nVar3 = (n) atomicReferenceFieldUpdater.get(this);
        while (!v()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6683c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = g.f6693b;
            long j10 = andIncrement / j3;
            int i3 = (int) (andIncrement % j3);
            if (nVar3.f7972c != j10) {
                n o5 = o(j10, nVar3);
                if (o5 == null) {
                    continue;
                } else {
                    nVar = o5;
                }
            } else {
                nVar = nVar3;
            }
            Object E10 = E(nVar, i3, andIncrement, null);
            F5.c cVar = g.f6703m;
            String string2 = StubApp.getString2(6086);
            if (E10 == cVar) {
                throw new IllegalStateException(string2);
            }
            F5.c cVar2 = g.f6705o;
            if (E10 == cVar2) {
                if (andIncrement < s()) {
                    nVar.a();
                }
                nVar3 = nVar;
            } else {
                if (E10 != g.f6704n) {
                    nVar.a();
                    return E10;
                }
                C0203k i10 = L.i(IntrinsicsKt.intercepted(continuation));
                e eVar = this;
                try {
                    Object E11 = eVar.E(nVar, i3, andIncrement, i10);
                    if (E11 == cVar) {
                        i10.a(nVar, i3);
                    } else if (E11 == cVar2) {
                        if (andIncrement < s()) {
                            nVar.a();
                        }
                        n nVar4 = (n) atomicReferenceFieldUpdater.get(this);
                        while (true) {
                            if (v()) {
                                Result.Companion companion = Result.INSTANCE;
                                i10.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(q())));
                                break;
                            }
                            C0203k c0203k = i10;
                            try {
                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                long j11 = g.f6693b;
                                long j12 = andIncrement2 / j11;
                                int i11 = (int) (andIncrement2 % j11);
                                if (nVar4.f7972c != j12) {
                                    try {
                                        n o10 = o(j12, nVar4);
                                        if (o10 == null) {
                                            i10 = c0203k;
                                        } else {
                                            nVar2 = o10;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i10 = c0203k;
                                        i10.A();
                                        throw th;
                                    }
                                } else {
                                    nVar2 = nVar4;
                                }
                                Object E12 = eVar.E(nVar2, i11, andIncrement2, c0203k);
                                n nVar5 = nVar2;
                                i10 = c0203k;
                                if (E12 == g.f6703m) {
                                    i10.a(nVar5, i11);
                                    break;
                                }
                                if (E12 == g.f6705o) {
                                    if (andIncrement2 < s()) {
                                        nVar5.a();
                                    }
                                    eVar = this;
                                    nVar4 = nVar5;
                                } else {
                                    if (E12 == g.f6704n) {
                                        throw new IllegalStateException(string2);
                                    }
                                    nVar5.a();
                                    i10.i(E12, null);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                i10 = c0203k;
                                th = th;
                                i10.A();
                                throw th;
                            }
                        }
                    } else {
                        nVar.a();
                        i10.i(E11, null);
                    }
                    Object r8 = i10.r();
                    if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    return r8;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable q10 = q();
        int i12 = Vb.w.f7973a;
        throw q10;
    }

    @Override // Sb.x
    public final boolean g(Throwable th) {
        return i(th, false);
    }

    public final boolean h(long j3) {
        return j3 < f6684d.get(this) || j3 < f6683c.get(this) + ((long) this.f6690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.lang.Throwable r13, boolean r14) {
        /*
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = Sb.e.f6682b
            r9 = 1
            if (r14 == 0) goto L24
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L24
            long r7 = r5 & r1
            Sb.n r4 = Sb.g.f6692a
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r5 = r3.compareAndSet(r4, r5, r7)
            if (r5 == 0) goto Lc
            goto L25
        L24:
            r4 = r12
        L25:
            F5.c r5 = Sb.g.f6709s
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = Sb.e.j
            boolean r7 = r6.compareAndSet(r12, r5, r13)
            if (r7 == 0) goto L31
            r10 = r9
            goto L39
        L31:
            java.lang.Object r6 = r6.get(r12)
            if (r6 == r5) goto L27
            r13 = 0
            r10 = r13
        L39:
            r11 = 3
            if (r14 == 0) goto L4c
        L3c:
            long r5 = r3.get(r12)
            long r13 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3c
            goto L69
        L4c:
            long r5 = r3.get(r12)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5e
            if (r13 == r9) goto L58
            goto L69
        L58:
            long r13 = r5 & r1
            long r7 = (long) r11
        L5b:
            long r7 = r7 << r0
            long r7 = r7 + r13
            goto L63
        L5e:
            long r13 = r5 & r1
            r7 = 2
            long r7 = (long) r7
            goto L5b
        L63:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4c
        L69:
            r12.w()
            if (r10 == 0) goto L9b
        L6e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = Sb.e.f6689k
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L79
            F5.c r0 = Sb.g.f6707q
            goto L7b
        L79:
            F5.c r0 = Sb.g.f6708r
        L7b:
            boolean r1 = r13.compareAndSet(r12, r14, r0)
            if (r1 == 0) goto L94
            if (r14 != 0) goto L84
            goto L9b
        L84:
            java.lang.Object r13 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r14, r9)
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            java.lang.Throwable r13 = r12.p()
            r14.invoke(r13)
            return r10
        L94:
            java.lang.Object r1 = r13.get(r12)
            if (r1 == r14) goto L7b
            goto L6e
        L9b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Sb.e.i(java.lang.Throwable, boolean):boolean");
    }

    @Override // Sb.x
    public Object j(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6682b;
        boolean z2 = false;
        long j3 = 1152921504606846975L;
        boolean z10 = u(atomicLongFieldUpdater.get(this), false) ? false : !h(r1 & 1152921504606846975L);
        l lVar = m.f6715b;
        if (z10) {
            return lVar;
        }
        Pb.a aVar = g.j;
        n nVar = (n) f6686f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = andIncrement & j3;
            boolean u2 = u(andIncrement, z2);
            int i3 = g.f6693b;
            long j11 = i3;
            long j12 = j10 / j11;
            int i10 = (int) (j10 % j11);
            if (nVar.f7972c != j12) {
                n a3 = a(this, j12, nVar);
                if (a3 != null) {
                    nVar = a3;
                } else {
                    if (u2) {
                        return new k(r());
                    }
                    z2 = false;
                    j3 = 1152921504606846975L;
                }
            }
            int e10 = e(this, nVar, i10, obj, j10, aVar, u2);
            if (e10 == 0) {
                nVar.a();
                return Unit.INSTANCE;
            }
            if (e10 == 1) {
                return Unit.INSTANCE;
            }
            if (e10 == 2) {
                if (u2) {
                    nVar.h();
                    return new k(r());
                }
                V0 v02 = aVar instanceof V0 ? (V0) aVar : null;
                if (v02 != null) {
                    v02.a(nVar, i10 + i3);
                }
                nVar.h();
                return lVar;
            }
            if (e10 == 3) {
                throw new IllegalStateException(StubApp.getString2(6086));
            }
            if (e10 == 4) {
                if (j10 < f6683c.get(this)) {
                    nVar.a();
                }
                return new k(r());
            }
            if (e10 == 5) {
                nVar.a();
            }
            z2 = false;
            j3 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00c9, code lost:
    
        c(r1, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c0, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2 A[RETURN] */
    @Override // Sb.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.Object r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Sb.e.k(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (Sb.n) ((Vb.e) Vb.e.f7940b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Sb.n l(long r13) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Sb.e.l(long):Sb.n");
    }

    public final void m(long j3) {
        n nVar = (n) f6687g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6683c;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f6690a + j10, f6684d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = g.f6693b;
                long j12 = j10 / j11;
                int i3 = (int) (j10 % j11);
                if (nVar.f7972c != j12) {
                    n o5 = o(j12, nVar);
                    if (o5 != null) {
                        nVar = o5;
                    }
                }
                n nVar2 = nVar;
                if (E(nVar2, i3, j10, null) != g.f6705o) {
                    nVar2.a();
                } else if (j10 < s()) {
                    nVar2.a();
                }
                nVar = nVar2;
            }
        }
    }

    public final void n() {
        Object a3;
        if (y()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6688h;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f6684d.getAndIncrement(this);
            long j3 = andIncrement / g.f6693b;
            if (s() <= andIncrement) {
                if (nVar.f7972c < j3 && nVar.b() != null) {
                    z(j3, nVar);
                }
                t(this);
                return;
            }
            if (nVar.f7972c != j3) {
                f fVar = f.f6691a;
                while (true) {
                    a3 = AbstractC0358d.a(nVar, j3, fVar);
                    if (!AbstractC0355a.d(a3)) {
                        Vb.v b2 = AbstractC0355a.b(a3);
                        while (true) {
                            Vb.v vVar = (Vb.v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f7972c >= b2.f7972c) {
                                break;
                            }
                            if (!b2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                    if (b2.e()) {
                                        b2.d();
                                    }
                                }
                            }
                            if (vVar.e()) {
                                vVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                n nVar2 = null;
                if (AbstractC0355a.d(a3)) {
                    w();
                    z(j3, nVar);
                    t(this);
                } else {
                    n nVar3 = (n) AbstractC0355a.b(a3);
                    long j10 = nVar3.f7972c;
                    if (j10 > j3) {
                        long j11 = g.f6693b;
                        if (f6684d.compareAndSet(this, 1 + andIncrement, j10 * j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f6685e;
                            if ((atomicLongFieldUpdater.addAndGet(this, (j10 * j11) - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            t(this);
                        }
                    } else {
                        nVar2 = nVar3;
                    }
                }
                if (nVar2 == null) {
                    continue;
                } else {
                    nVar = nVar2;
                }
            }
            int i3 = (int) (andIncrement % g.f6693b);
            Object k3 = nVar.k(i3);
            boolean z2 = k3 instanceof V0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6683c;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !nVar.j(i3, k3, g.f6698g)) {
                while (true) {
                    Object k4 = nVar.k(i3);
                    if (!(k4 instanceof V0)) {
                        if (k4 != g.j) {
                            if (k4 != null) {
                                if (k4 == g.f6695d || k4 == g.f6699h || k4 == g.f6700i || k4 == g.f6701k || k4 == g.f6702l) {
                                    break loop0;
                                }
                                if (k4 != g.f6697f) {
                                    throw new IllegalStateException((StubApp.getString2(25617) + k4).toString());
                                }
                            } else if (nVar.j(i3, k4, g.f6696e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (nVar.j(i3, k4, new y((V0) k4))) {
                            break loop0;
                        }
                    } else if (nVar.j(i3, k4, g.f6698g)) {
                        if (D(k4, nVar, i3)) {
                            nVar.n(i3, g.f6695d);
                            break;
                        } else {
                            nVar.n(i3, g.j);
                            nVar.h();
                        }
                    }
                }
            } else if (D(k3, nVar, i3)) {
                nVar.n(i3, g.f6695d);
                break;
            } else {
                nVar.n(i3, g.j);
                nVar.h();
                t(this);
            }
        }
        t(this);
    }

    public final n o(long j3, n nVar) {
        Object a3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        n nVar2 = g.f6692a;
        f fVar = f.f6691a;
        loop0: while (true) {
            a3 = AbstractC0358d.a(nVar, j3, fVar);
            if (!AbstractC0355a.d(a3)) {
                Vb.v b2 = AbstractC0355a.b(a3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6687g;
                    Vb.v vVar = (Vb.v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f7972c >= b2.f7972c) {
                        break loop0;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (b2.e()) {
                                b2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC0355a.d(a3)) {
            w();
            if (nVar.f7972c * g.f6693b < s()) {
                nVar.a();
                return null;
            }
        } else {
            n nVar3 = (n) AbstractC0355a.b(a3);
            boolean y10 = y();
            long j11 = nVar3.f7972c;
            if (!y10 && j3 <= f6684d.get(this) / g.f6693b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6688h;
                    Vb.v vVar2 = (Vb.v) atomicReferenceFieldUpdater2.get(this);
                    if (vVar2.f7972c >= j11 || !nVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, vVar2, nVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != vVar2) {
                            if (nVar3.e()) {
                                nVar3.d();
                            }
                        }
                    }
                    if (vVar2.e()) {
                        vVar2.d();
                    }
                }
            }
            if (j11 <= j3) {
                return nVar3;
            }
            long j12 = j11 * g.f6693b;
            do {
                atomicLongFieldUpdater = f6683c;
                j10 = atomicLongFieldUpdater.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j12));
            if (j11 * g.f6693b < s()) {
                nVar3.a();
            }
        }
        return null;
    }

    public final Throwable p() {
        return (Throwable) j.get(this);
    }

    public final Throwable q() {
        Throwable p8 = p();
        return p8 == null ? new p(StubApp.getString2(25618)) : p8;
    }

    public final Throwable r() {
        Throwable p8 = p();
        return p8 == null ? new q(StubApp.getString2(25618)) : p8;
    }

    public final long s() {
        return f6682b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x020a, code lost:
    
        r16 = r7;
        r3 = (Sb.n) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0213, code lost:
    
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Sb.e.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (Sb.n) ((Vb.e) Vb.e.f7940b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(long r15, boolean r17) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Sb.e.u(long, boolean):boolean");
    }

    public final boolean v() {
        return u(f6682b.get(this), true);
    }

    public final boolean w() {
        return u(f6682b.get(this), false);
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j3 = f6684d.get(this);
        return j3 == 0 || j3 == LongCompanionObject.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r5, Sb.n r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f7972c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            Vb.e r0 = r7.b()
            Sb.n r0 = (Sb.n) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            Vb.e r5 = r7.b()
            Sb.n r5 = (Sb.n) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = Sb.e.f6688h
            java.lang.Object r6 = r5.get(r4)
            Vb.v r6 = (Vb.v) r6
            long r0 = r6.f7972c
            long r2 = r7.f7972c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: Sb.e.z(long, Sb.n):void");
    }
}
