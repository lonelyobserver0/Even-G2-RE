package Kc;

import com.stub.StubApp;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Kc.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class C0099f extends J {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f3804h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f3805i;
    public static final long j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f3806k;

    /* renamed from: l, reason: collision with root package name */
    public static C0099f f3807l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3808e;

    /* renamed from: f, reason: collision with root package name */
    public C0099f f3809f;

    /* renamed from: g, reason: collision with root package name */
    public long f3810g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f3804h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        f3805i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        f3806k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        long j3 = this.f3792c;
        boolean z2 = this.f3790a;
        if (j3 != 0 || z2) {
            ReentrantLock reentrantLock = f3804h;
            reentrantLock.lock();
            try {
                if (this.f3808e) {
                    throw new IllegalStateException(StubApp.getString2("25351"));
                }
                this.f3808e = true;
                if (f3807l == null) {
                    f3807l = new C0099f();
                    C0096c c0096c = new C0096c(StubApp.getString2("25350"));
                    c0096c.setDaemon(true);
                    c0096c.start();
                }
                long nanoTime = System.nanoTime();
                if (j3 != 0 && z2) {
                    this.f3810g = Math.min(j3, c() - nanoTime) + nanoTime;
                } else if (j3 != 0) {
                    this.f3810g = j3 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f3810g = c();
                }
                long j10 = this.f3810g - nanoTime;
                C0099f c0099f = f3807l;
                Intrinsics.checkNotNull(c0099f);
                while (true) {
                    C0099f c0099f2 = c0099f.f3809f;
                    if (c0099f2 == null) {
                        break;
                    }
                    Intrinsics.checkNotNull(c0099f2);
                    if (j10 < c0099f2.f3810g - nanoTime) {
                        break;
                    }
                    c0099f = c0099f.f3809f;
                    Intrinsics.checkNotNull(c0099f);
                }
                this.f3809f = c0099f.f3809f;
                c0099f.f3809f = this;
                if (c0099f == f3807l) {
                    f3805i.signal();
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = f3804h;
        reentrantLock.lock();
        try {
            if (!this.f3808e) {
                return false;
            }
            this.f3808e = false;
            C0099f c0099f = f3807l;
            while (c0099f != null) {
                C0099f c0099f2 = c0099f.f3809f;
                if (c0099f2 == this) {
                    c0099f.f3809f = this.f3809f;
                    this.f3809f = null;
                    return false;
                }
                c0099f = c0099f2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k() {
    }
}
