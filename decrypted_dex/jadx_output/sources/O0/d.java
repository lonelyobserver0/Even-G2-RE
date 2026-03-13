package O0;

import M4.F;
import M4.I;
import M4.Z;
import c5.C0568a;
import c5.D;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import o0.C1417N;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class d implements n, y3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5096c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5097d;

    public /* synthetic */ d(Object obj, Object obj2, boolean z2, Object obj3) {
        this.f5095b = obj;
        this.f5096c = obj2;
        this.f5094a = z2;
        this.f5097d = obj3;
    }

    @Override // y3.g
    public void c(Exception exc) {
        j5.b bVar = (j5.b) this.f5095b;
        bVar.getClass();
        q4.k kVar = (q4.k) this.f5096c;
        if (exc != null) {
            kVar.c(exc);
            return;
        }
        if (this.f5094a) {
            boolean z2 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new com.even.translate.a(13, bVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = D.f10858a;
            boolean z10 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long nanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        z10 = true;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = z10;
            }
        }
        kVar.d((C0568a) this.f5097d);
    }

    @Override // O0.n
    public Z d(int i3, C1417N c1417n, int[] iArr) {
        q qVar = (q) this.f5095b;
        qVar.getClass();
        e eVar = new e(qVar);
        int i10 = ((int[]) this.f5097d)[i3];
        F l9 = I.l();
        int i11 = 0;
        while (i11 < c1417n.f18067a) {
            int i12 = i3;
            C1417N c1417n2 = c1417n;
            l9.a(new f(i12, c1417n2, i11, (j) this.f5096c, iArr[i11], this.f5094a, eVar, i10));
            i11++;
            i3 = i12;
            c1417n = c1417n2;
        }
        return l9.g();
    }
}
