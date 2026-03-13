package Rb;

import Qb.C0203k;
import Qb.C0219s0;
import Qb.H0;
import Qb.InterfaceC0221t0;
import Qb.P0;
import Qb.W;
import Qb.Y;
import Vb.q;
import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.DurationKt;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class d extends e {
    private volatile d _immediate;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f6357a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6358b;

    /* renamed from: c, reason: collision with root package name */
    public final d f6359c;

    public d(Handler handler, boolean z2) {
        this.f6357a = handler;
        this.f6358b = z2;
        this._immediate = z2 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, true);
            this._immediate = dVar;
        }
        this.f6359c = dVar;
    }

    @Override // Qb.C
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f6357a.post(runnable)) {
            return;
        }
        v(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f6357a == this.f6357a;
    }

    @Override // Qb.Q
    public final Y h(long j, final P0 p02, CoroutineContext coroutineContext) {
        if (this.f6357a.postDelayed(p02, RangesKt.coerceAtMost(j, DurationKt.MAX_MILLIS))) {
            return new Y() { // from class: Rb.c
                @Override // Qb.Y
                public final void dispose() {
                    d.this.f6357a.removeCallbacks(p02);
                }
            };
        }
        v(coroutineContext, p02);
        return H0.f5814a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f6357a);
    }

    @Override // Qb.C
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return (this.f6358b && Intrinsics.areEqual(Looper.myLooper(), this.f6357a.getLooper())) ? false : true;
    }

    @Override // Qb.Q
    public final void k(long j, C0203k c0203k) {
        Q4.b bVar = new Q4.b(15, c0203k, this);
        if (this.f6357a.postDelayed(bVar, RangesKt.coerceAtMost(j, DurationKt.MAX_MILLIS))) {
            c0203k.u(new E1.b(3, this, bVar));
        } else {
            v(c0203k.f5877e, bVar);
        }
    }

    @Override // Qb.C
    public final String toString() {
        d dVar;
        String string2;
        Xb.d dVar2 = W.f5838a;
        d dVar3 = q.f7968a;
        if (this == dVar3) {
            string2 = StubApp.getString2(25539);
        } else {
            try {
                dVar = dVar3.f6359c;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            string2 = this == dVar ? StubApp.getString2(25540) : null;
        }
        if (string2 != null) {
            return string2;
        }
        String handler = this.f6357a.toString();
        return this.f6358b ? AbstractC1482f.g(handler, StubApp.getString2(25541)) : handler;
    }

    public final void v(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException(StubApp.getString2(25542) + this + StubApp.getString2(25543));
        InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) coroutineContext.get(C0219s0.f5892a);
        if (interfaceC0221t0 != null) {
            interfaceC0221t0.d(cancellationException);
        }
        W.f5839b.dispatch(coroutineContext, runnable);
    }
}
