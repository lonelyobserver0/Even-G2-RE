package Xb;

import Qb.AbstractC0204k0;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class g extends AbstractC0204k0 {

    /* renamed from: a, reason: collision with root package name */
    public b f8632a;

    @Override // Qb.C
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        b.e(this.f8632a, runnable, 6);
    }

    @Override // Qb.C
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        b.e(this.f8632a, runnable, 2);
    }
}
