package Qb;

import Vb.AbstractC0355a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Qb.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0207m extends AbstractC0225v0 {

    /* renamed from: e, reason: collision with root package name */
    public final C0203k f5880e;

    public C0207m(C0203k c0203k) {
        this.f5880e = c0203k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // Qb.AbstractC0229x0
    public final void j(Throwable th) {
        D0 i3 = i();
        C0203k c0203k = this.f5880e;
        Throwable q10 = c0203k.q(i3);
        if (c0203k.x()) {
            Continuation continuation = c0203k.f5876d;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            Vb.i iVar = (Vb.i) continuation;
            iVar.getClass();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Vb.i.f7944h;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                F5.c cVar = AbstractC0355a.f7934c;
                if (!Intrinsics.areEqual(obj, cVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar, cVar, q10)) {
                    if (atomicReferenceFieldUpdater.get(iVar) != cVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0203k.n(q10);
        if (c0203k.x()) {
            return;
        }
        c0203k.o();
    }
}
