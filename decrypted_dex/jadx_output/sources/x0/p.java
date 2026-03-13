package x0;

import android.os.SystemClock;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public Exception f22725a;

    /* renamed from: b, reason: collision with root package name */
    public long f22726b = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public long f22727c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f22725a == null) {
            this.f22725a = exc;
        }
        if (this.f22726b == -9223372036854775807L) {
            synchronized (s.f22730j0) {
                z2 = s.f22732l0 > 0;
            }
            if (!z2) {
                this.f22726b = 200 + elapsedRealtime;
            }
        }
        long j = this.f22726b;
        if (j == -9223372036854775807L || elapsedRealtime < j) {
            this.f22727c = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f22725a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f22725a;
        this.f22725a = null;
        this.f22726b = -9223372036854775807L;
        this.f22727c = -9223372036854775807L;
        throw exc3;
    }
}
