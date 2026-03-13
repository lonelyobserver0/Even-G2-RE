package Vb;

import Qb.C0203k;
import Qb.N;
import Qb.P0;
import Qb.Q;
import Qb.Y;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class j extends Qb.C implements Q {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7949f = AtomicIntegerFieldUpdater.newUpdater(j.class, StubApp.getString2(25762));

    /* renamed from: a, reason: collision with root package name */
    public final Qb.C f7950a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f7952c;

    /* renamed from: d, reason: collision with root package name */
    public final n f7953d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7954e;

    @Volatile
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Qb.C c10, int i3) {
        this.f7950a = c10;
        this.f7951b = i3;
        Q q10 = c10 instanceof Q ? (Q) c10 : null;
        this.f7952c = q10 == null ? N.f5825a : q10;
        this.f7953d = new n();
        this.f7954e = new Object();
    }

    public final boolean A() {
        synchronized (this.f7954e) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7949f;
            if (atomicIntegerFieldUpdater.get(this) >= this.f7951b) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // Qb.C
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable v2;
        this.f7953d.a(runnable);
        if (f7949f.get(this) >= this.f7951b || !A() || (v2 = v()) == null) {
            return;
        }
        this.f7950a.dispatch(this, new Q4.b(this, v2, 16, false));
    }

    @Override // Qb.C
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable v2;
        this.f7953d.a(runnable);
        if (f7949f.get(this) >= this.f7951b || !A() || (v2 = v()) == null) {
            return;
        }
        this.f7950a.dispatchYield(this, new Q4.b(this, v2, 16, false));
    }

    @Override // Qb.Q
    public final Y h(long j, P0 p02, CoroutineContext coroutineContext) {
        return this.f7952c.h(j, p02, coroutineContext);
    }

    @Override // Qb.Q
    public final void k(long j, C0203k c0203k) {
        this.f7952c.k(j, c0203k);
    }

    @Override // Qb.C
    public final Qb.C limitedParallelism(int i3) {
        AbstractC0355a.a(i3);
        return i3 >= this.f7951b ? this : super.limitedParallelism(i3);
    }

    public final Runnable v() {
        while (true) {
            Runnable runnable = (Runnable) this.f7953d.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f7954e) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7949f;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f7953d.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
