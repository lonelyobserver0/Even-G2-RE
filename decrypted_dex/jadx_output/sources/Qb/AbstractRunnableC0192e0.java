package Qb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* renamed from: Qb.e0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractRunnableC0192e0 implements Runnable, Comparable, Y {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f5861a;

    /* renamed from: b, reason: collision with root package name */
    public int f5862b = -1;

    public AbstractRunnableC0192e0(long j) {
        this.f5861a = j;
    }

    public final int a(long j, C0194f0 c0194f0, AbstractC0196g0 abstractC0196g0) {
        synchronized (this) {
            if (this._heap == L.f5816b) {
                return 2;
            }
            synchronized (c0194f0) {
                try {
                    AbstractRunnableC0192e0[] abstractRunnableC0192e0Arr = c0194f0.f7928a;
                    AbstractRunnableC0192e0 abstractRunnableC0192e0 = abstractRunnableC0192e0Arr != null ? abstractRunnableC0192e0Arr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0196g0.f5867e;
                    abstractC0196g0.getClass();
                    if (AbstractC0196g0.f5869g.get(abstractC0196g0) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC0192e0 == null) {
                        c0194f0.f5865c = j;
                    } else {
                        long j3 = abstractRunnableC0192e0.f5861a;
                        if (j3 - j < 0) {
                            j = j3;
                        }
                        if (j - c0194f0.f5865c > 0) {
                            c0194f0.f5865c = j;
                        }
                    }
                    long j10 = this.f5861a;
                    long j11 = c0194f0.f5865c;
                    if (j10 - j11 < 0) {
                        this.f5861a = j11;
                    }
                    c0194f0.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(C0194f0 c0194f0) {
        if (this._heap == L.f5816b) {
            throw new IllegalArgumentException(StubApp.getString2(353));
        }
        this._heap = c0194f0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f5861a - ((AbstractRunnableC0192e0) obj).f5861a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // Qb.Y
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                F5.c cVar = L.f5816b;
                if (obj == cVar) {
                    return;
                }
                C0194f0 c0194f0 = obj instanceof C0194f0 ? (C0194f0) obj : null;
                if (c0194f0 != null) {
                    synchronized (c0194f0) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof Vb.C ? (Vb.C) obj2 : null) != null) {
                            c0194f0.b(this.f5862b);
                        }
                    }
                }
                this._heap = cVar;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return StubApp.getString2(25499) + this.f5861a + ']';
    }
}
