package X4;

import B3.p;
import S3.D;
import com.stub.StubApp;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f8399f = Logger.getLogger(i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f8400a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f8401b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f8402c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f8403d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Q4.b f8404e = new Q4.b(this);

    public i(Executor executor) {
        D.h(executor);
        this.f8400a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D.h(runnable);
        synchronized (this.f8401b) {
            int i3 = this.f8402c;
            if (i3 != 4 && i3 != 3) {
                long j = this.f8403d;
                p pVar = new p(runnable, 2);
                this.f8401b.add(pVar);
                this.f8402c = 2;
                try {
                    this.f8400a.execute(this.f8404e);
                    if (this.f8402c != 2) {
                        return;
                    }
                    synchronized (this.f8401b) {
                        try {
                            if (this.f8403d == j && this.f8402c == 2) {
                                this.f8402c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f8401b) {
                        try {
                            int i10 = this.f8402c;
                            boolean z2 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f8401b.removeLastOccurrence(pVar)) {
                                z2 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z2) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f8401b.add(runnable);
        }
    }

    public final String toString() {
        return StubApp.getString2(7244) + System.identityHashCode(this) + StubApp.getString2(1352) + this.f8400a + StubApp.getString2(265);
    }
}
