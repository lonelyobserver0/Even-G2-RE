package Kc;

import com.stub.StubApp;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class l implements F {

    /* renamed from: a, reason: collision with root package name */
    public final s f3824a;

    /* renamed from: b, reason: collision with root package name */
    public long f3825b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3826c;

    public l(s fileHandle) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.f3824a = fileHandle;
        this.f3825b = 0L;
    }

    @Override // Kc.F
    public final void E(long j, C0101h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f3826c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        s sVar = this.f3824a;
        long j3 = this.f3825b;
        sVar.getClass();
        AbstractC0095b.f(source.f3819b, 0L, j);
        long j10 = j3 + j;
        while (j3 < j10) {
            C c10 = source.f3818a;
            Intrinsics.checkNotNull(c10);
            int min = (int) Math.min(j10 - j3, c10.f3778c - c10.f3777b);
            byte[] array = c10.f3776a;
            int i3 = c10.f3777b;
            synchronized (sVar) {
                Intrinsics.checkNotNullParameter(array, "array");
                sVar.f3852e.seek(j3);
                sVar.f3852e.write(array, i3, min);
            }
            int i10 = c10.f3777b + min;
            c10.f3777b = i10;
            long j11 = min;
            j3 += j11;
            source.f3819b -= j11;
            if (i10 == c10.f3778c) {
                source.f3818a = c10.a();
                D.a(c10);
            }
        }
        this.f3825b += j;
    }

    @Override // Kc.F
    public final J b() {
        return J.f3789d;
    }

    @Override // Kc.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3826c) {
            return;
        }
        this.f3826c = true;
        s sVar = this.f3824a;
        ReentrantLock reentrantLock = sVar.f3851d;
        reentrantLock.lock();
        try {
            int i3 = sVar.f3850c - 1;
            sVar.f3850c = i3;
            if (i3 == 0 && sVar.f3849b) {
                Unit unit = Unit.INSTANCE;
                synchronized (sVar) {
                    sVar.f3852e.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Kc.F, java.io.Flushable
    public final void flush() {
        if (this.f3826c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        s sVar = this.f3824a;
        synchronized (sVar) {
            sVar.f3852e.getFD().sync();
        }
    }
}
