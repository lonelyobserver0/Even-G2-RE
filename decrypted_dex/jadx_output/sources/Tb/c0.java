package Tb;

import Qb.C0203k;
import Ub.AbstractC0346b;
import Ub.AbstractC0347c;
import Ub.AbstractC0348d;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c0 extends AbstractC0348d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7349a = AtomicReferenceFieldUpdater.newUpdater(c0.class, Object.class, StubApp.getString2(25450));

    @Volatile
    private volatile Object _state;

    @Override // Ub.AbstractC0348d
    public final boolean a(AbstractC0346b abstractC0346b) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7349a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, Q.f7311b);
        return true;
    }

    @Override // Ub.AbstractC0348d
    public final Continuation[] b(AbstractC0346b abstractC0346b) {
        f7349a.set(this, null);
        return AbstractC0347c.f7576a;
    }

    public final Object c(a0 a0Var) {
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(a0Var));
        c0203k.s();
        F5.c cVar = Q.f7311b;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7349a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, cVar, c0203k)) {
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != cVar) {
                Result.Companion companion = Result.INSTANCE;
                c0203k.resumeWith(Result.m40constructorimpl(Unit.INSTANCE));
                break;
            }
        }
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(a0Var);
        }
        return r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? r8 : Unit.INSTANCE;
    }
}
