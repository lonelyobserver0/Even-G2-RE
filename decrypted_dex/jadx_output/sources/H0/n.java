package H0;

import M4.e0;
import android.os.Handler;
import java.io.Closeable;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n implements Runnable, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f2591a = AbstractC1560u.m(null);

    /* renamed from: b, reason: collision with root package name */
    public final long f2592b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2593c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f2594d;

    public n(o oVar, long j) {
        this.f2594d = oVar;
        this.f2592b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2593c = false;
        this.f2591a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f2594d;
        Bc.i iVar = oVar.f2601g;
        iVar.t(iVar.k(4, oVar.f2604l, e0.f4606g, oVar.f2602h));
        this.f2591a.postDelayed(this, this.f2592b);
    }
}
