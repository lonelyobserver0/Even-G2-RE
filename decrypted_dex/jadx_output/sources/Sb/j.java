package Sb;

import Qb.A0;
import Qb.AbstractC0183a;
import Qb.C0220t;
import Qb.C0223u0;
import R8.z;
import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class j extends AbstractC0183a implements i {

    /* renamed from: d, reason: collision with root package name */
    public final e f6713d;

    public j(CoroutineContext coroutineContext, e eVar) {
        super(coroutineContext, true);
        this.f6713d = eVar;
    }

    public final void Z(z zVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e eVar = this.f6713d;
        eVar.getClass();
        do {
            atomicReferenceFieldUpdater = e.f6689k;
            if (atomicReferenceFieldUpdater.compareAndSet(eVar, null, zVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(eVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            F5.c cVar = g.f6707q;
            if (obj != cVar) {
                if (obj == g.f6708r) {
                    throw new IllegalStateException(StubApp.getString2(25650));
                }
                throw new IllegalStateException((StubApp.getString2(25651) + obj).toString());
            }
            F5.c cVar2 = g.f6708r;
            while (!atomicReferenceFieldUpdater.compareAndSet(eVar, cVar, cVar2)) {
                if (atomicReferenceFieldUpdater.get(eVar) != cVar) {
                    break;
                }
            }
            zVar.invoke(eVar.p());
            return;
        }
    }

    @Override // Sb.w
    public final Q2.g b() {
        return this.f6713d.b();
    }

    @Override // Qb.D0, Qb.InterfaceC0221t0
    public final void d(CancellationException cancellationException) {
        Object E10 = E();
        if (E10 instanceof C0220t) {
            return;
        }
        if ((E10 instanceof A0) && ((A0) E10).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0223u0(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // Sb.w
    public final Object f(Continuation continuation) {
        return this.f6713d.f(continuation);
    }

    @Override // Sb.x
    public final boolean g(Throwable th) {
        return this.f6713d.i(th, false);
    }

    @Override // Sb.x
    public final Object j(Object obj) {
        return this.f6713d.j(obj);
    }

    @Override // Sb.x
    public final Object k(Object obj, Continuation continuation) {
        return this.f6713d.k(obj, continuation);
    }

    @Override // Qb.D0
    public final void s(CancellationException cancellationException) {
        this.f6713d.i(cancellationException, true);
        r(cancellationException);
    }
}
