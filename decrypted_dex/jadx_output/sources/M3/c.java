package M3;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4531a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4532b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f4533c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f4534d = false;

    public c(a aVar, long j) {
        this.f4531a = new WeakReference(aVar);
        this.f4532b = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.f4531a;
        try {
            if (this.f4533c.await(this.f4532b, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.b();
            this.f4534d = true;
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f4534d = true;
            }
        }
    }
}
