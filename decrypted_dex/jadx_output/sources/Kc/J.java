package Kc;

import com.stub.StubApp;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class J {

    /* renamed from: d, reason: collision with root package name */
    public static final I f3789d = new I();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3790a;

    /* renamed from: b, reason: collision with root package name */
    public long f3791b;

    /* renamed from: c, reason: collision with root package name */
    public long f3792c;

    public J a() {
        this.f3790a = false;
        return this;
    }

    public J b() {
        this.f3792c = 0L;
        return this;
    }

    public long c() {
        if (this.f3790a) {
            return this.f3791b;
        }
        throw new IllegalStateException(StubApp.getString2(25337));
    }

    public J d(long j) {
        this.f3790a = true;
        this.f3791b = j;
        return this;
    }

    public boolean e() {
        return this.f3790a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException(StubApp.getString2(25339));
        }
        if (this.f3790a && this.f3791b - System.nanoTime() <= 0) {
            throw new InterruptedIOException(StubApp.getString2(25338));
        }
    }

    public J g(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25340)).toString());
        }
        this.f3792c = unit.toNanos(j);
        return this;
    }

    public long h() {
        return this.f3792c;
    }
}
