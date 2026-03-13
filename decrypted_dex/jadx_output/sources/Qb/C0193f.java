package Qb;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Qb.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0193f extends AbstractC0183a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f5863d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0186b0 f5864e;

    public C0193f(CoroutineContext coroutineContext, Thread thread, AbstractC0186b0 abstractC0186b0) {
        super(coroutineContext, true);
        this.f5863d = thread;
        this.f5864e = abstractC0186b0;
    }

    @Override // Qb.D0
    public final void n(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f5863d;
        if (Intrinsics.areEqual(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
