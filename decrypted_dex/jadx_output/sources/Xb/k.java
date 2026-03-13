package Xb;

import Qb.C;
import Vb.AbstractC0355a;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class k extends C {

    /* renamed from: a, reason: collision with root package name */
    public static final k f8644a = new k();

    @Override // Qb.C
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        d dVar = d.f8630b;
        dVar.f8632a.d(runnable, j.f8643h, false);
    }

    @Override // Qb.C
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        d dVar = d.f8630b;
        dVar.f8632a.d(runnable, j.f8643h, true);
    }

    @Override // Qb.C
    public final C limitedParallelism(int i3) {
        AbstractC0355a.a(i3);
        return i3 >= j.f8639d ? this : super.limitedParallelism(i3);
    }
}
