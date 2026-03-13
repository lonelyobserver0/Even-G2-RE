package r0;

import java.math.RoundingMode;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: r0.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1558s {

    /* renamed from: a, reason: collision with root package name */
    public long f20186a;

    /* renamed from: b, reason: collision with root package name */
    public long f20187b;

    /* renamed from: c, reason: collision with root package name */
    public long f20188c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f20189d = new ThreadLocal();

    public C1558s(long j) {
        f(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long j3 = this.f20186a;
                if (j3 == 9223372036854775806L) {
                    Long l9 = (Long) this.f20189d.get();
                    l9.getClass();
                    j3 = l9.longValue();
                }
                this.f20187b = j3 - j;
                notifyAll();
            }
            this.f20188c = j;
            return j + this.f20187b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.f20188c;
            if (j3 != -9223372036854775807L) {
                int i3 = AbstractC1560u.f20190a;
                long R10 = AbstractC1560u.R(j3, 90000L, 1000000L, RoundingMode.DOWN);
                long j10 = (4294967296L + R10) / 8589934592L;
                long j11 = ((j10 - 1) * 8589934592L) + j;
                long j12 = (j10 * 8589934592L) + j;
                j = Math.abs(j11 - R10) < Math.abs(j12 - R10) ? j11 : j12;
            }
            long j13 = j;
            int i10 = AbstractC1560u.f20190a;
            return a(AbstractC1560u.R(j13, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.f20188c;
            if (j3 != -9223372036854775807L) {
                int i3 = AbstractC1560u.f20190a;
                long R10 = AbstractC1560u.R(j3, 90000L, 1000000L, RoundingMode.DOWN);
                long j10 = R10 / 8589934592L;
                long j11 = (j10 * 8589934592L) + j;
                j = j11 >= R10 ? j11 : ((j10 + 1) * 8589934592L) + j;
            }
            long j12 = j;
            int i10 = AbstractC1560u.f20190a;
            return a(AbstractC1560u.R(j12, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j;
        j = this.f20186a;
        if (j == LongCompanionObject.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized boolean e() {
        return this.f20187b != -9223372036854775807L;
    }

    public final synchronized void f(long j) {
        this.f20186a = j;
        this.f20187b = j == LongCompanionObject.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f20188c = -9223372036854775807L;
    }

    public final synchronized void g(long j, boolean z2) {
        try {
            AbstractC1550k.g(this.f20186a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z2) {
                this.f20189d.set(Long.valueOf(j));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
