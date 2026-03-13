package Qb;

import Vb.AbstractC0355a;
import Vb.AbstractC0356b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class B0 extends AbstractC0356b {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0229x0 f5799b;

    /* renamed from: c, reason: collision with root package name */
    public G0 f5800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D0 f5801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0212o0 f5802e;

    public B0(AbstractC0229x0 abstractC0229x0, D0 d02, InterfaceC0212o0 interfaceC0212o0) {
        this.f5801d = d02;
        this.f5802e = interfaceC0212o0;
        this.f5799b = abstractC0229x0;
    }

    @Override // Vb.AbstractC0356b
    public final void b(Object obj, Object obj2) {
        Vb.m mVar = (Vb.m) obj;
        boolean z2 = obj2 == null;
        Vb.m mVar2 = this.f5799b;
        Vb.m mVar3 = z2 ? mVar2 : this.f5800c;
        if (mVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Vb.m.f7956a;
            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, this, mVar3)) {
                if (atomicReferenceFieldUpdater.get(mVar) != this) {
                    return;
                }
            }
            if (z2) {
                Vb.m mVar4 = this.f5800c;
                Intrinsics.checkNotNull(mVar4);
                mVar2.e(mVar4);
            }
        }
    }

    @Override // Vb.AbstractC0356b
    public final F5.c c(Object obj) {
        if (this.f5801d.E() == this.f5802e) {
            return null;
        }
        return AbstractC0355a.f7935d;
    }
}
