package l4;

import android.os.Process;
import com.stub.StubApp;
import java.util.AbstractQueue;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* renamed from: l4.j0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1188j0 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16475a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractQueue f16476b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1191k0 f16478d;

    /* JADX WARN: Multi-variable type inference failed */
    public C1188j0(C1191k0 c1191k0, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(c1191k0);
        this.f16478d = c1191k0;
        this.f16477c = false;
        S3.D.h(blockingQueue);
        this.f16475a = new Object();
        this.f16476b = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void a() {
        C1191k0 c1191k0 = this.f16478d;
        synchronized (c1191k0.j) {
            try {
                if (!this.f16477c) {
                    c1191k0.f16497k.release();
                    c1191k0.j.notifyAll();
                    if (this == c1191k0.f16491c) {
                        c1191k0.f16491c = null;
                    } else if (this == c1191k0.f16492d) {
                        c1191k0.f16492d = null;
                    } else {
                        T t3 = ((C1200n0) c1191k0.f4728a).f16541f;
                        C1200n0.l(t3);
                        t3.f16242f.b(StubApp.getString2("20482"));
                    }
                    this.f16477c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z2 = false;
        while (!z2) {
            try {
                this.f16478d.f16497k.acquire();
                z2 = true;
            } catch (InterruptedException e10) {
                T t3 = ((C1200n0) this.f16478d.f4728a).f16541f;
                C1200n0.l(t3);
                t3.j.c(e10, String.valueOf(getName()).concat(StubApp.getString2(20483)));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                AbstractQueue abstractQueue = this.f16476b;
                C1185i0 c1185i0 = (C1185i0) abstractQueue.poll();
                if (c1185i0 != null) {
                    Process.setThreadPriority(true != c1185i0.f16462b ? 10 : threadPriority);
                    c1185i0.run();
                } else {
                    Object obj = this.f16475a;
                    synchronized (obj) {
                        if (abstractQueue.peek() == null) {
                            this.f16478d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                T t10 = ((C1200n0) this.f16478d.f4728a).f16541f;
                                C1200n0.l(t10);
                                t10.j.c(e11, String.valueOf(getName()).concat(StubApp.getString2("20483")));
                            }
                        }
                    }
                    synchronized (this.f16478d.j) {
                        if (this.f16476b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
