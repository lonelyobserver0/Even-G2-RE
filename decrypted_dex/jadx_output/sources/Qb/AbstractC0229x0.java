package Qb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Qb.x0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0229x0 extends Vb.m implements Y, InterfaceC0212o0, Function1 {

    /* renamed from: d, reason: collision with root package name */
    public D0 f5898d;

    @Override // Qb.InterfaceC0212o0
    public final boolean a() {
        return true;
    }

    @Override // Qb.InterfaceC0212o0
    public final G0 c() {
        return null;
    }

    @Override // Qb.Y
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        D0 i3 = i();
        while (true) {
            Object E10 = i3.E();
            if (E10 instanceof AbstractC0229x0) {
                if (E10 != this) {
                    return;
                }
                C0184a0 c0184a0 = L.j;
                do {
                    atomicReferenceFieldUpdater2 = D0.f5809a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(i3, E10, c0184a0)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(i3) == E10);
            } else {
                if (!(E10 instanceof InterfaceC0212o0) || ((InterfaceC0212o0) E10).c() == null) {
                    return;
                }
                while (true) {
                    Object f10 = f();
                    if (f10 instanceof Vb.s) {
                        Vb.m mVar = ((Vb.s) f10).f7969a;
                        return;
                    }
                    if (f10 == this) {
                        return;
                    }
                    Intrinsics.checkNotNull(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    Vb.m mVar2 = (Vb.m) f10;
                    mVar2.getClass();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = Vb.m.f7958c;
                    Vb.s sVar = (Vb.s) atomicReferenceFieldUpdater3.get(mVar2);
                    if (sVar == null) {
                        sVar = new Vb.s(mVar2);
                        atomicReferenceFieldUpdater3.lazySet(mVar2, sVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = Vb.m.f7956a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, f10, sVar)) {
                            mVar2.d();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == f10);
                }
            }
        }
    }

    public InterfaceC0221t0 getParent() {
        return i();
    }

    public final D0 i() {
        D0 d02 = this.f5898d;
        if (d02 != null) {
            return d02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public abstract void j(Throwable th);

    @Override // Vb.m
    public final String toString() {
        return getClass().getSimpleName() + '@' + L.h(this) + StubApp.getString2(25535) + L.h(i()) + ']';
    }
}
