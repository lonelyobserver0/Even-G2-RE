package Kc;

import com.stub.StubApp;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class m implements H {

    /* renamed from: a, reason: collision with root package name */
    public final s f3827a;

    /* renamed from: b, reason: collision with root package name */
    public long f3828b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3829c;

    public m(s fileHandle, long j) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.f3827a = fileHandle;
        this.f3828b = j;
    }

    @Override // Kc.H
    public final J b() {
        return J.f3789d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3829c) {
            return;
        }
        this.f3829c = true;
        s sVar = this.f3827a;
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

    @Override // Kc.H
    public final long n(long j, C0101h sink) {
        long j3;
        long j10;
        int i3;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f3829c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        s sVar = this.f3827a;
        long j11 = this.f3828b;
        sVar.getClass();
        if (j < 0) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25206)).toString());
        }
        long j12 = j + j11;
        long j13 = j11;
        while (true) {
            if (j13 >= j12) {
                j3 = -1;
                break;
            }
            C M5 = sink.M(1);
            byte[] array = M5.f3776a;
            int i10 = M5.f3778c;
            j3 = -1;
            int min = (int) Math.min(j12 - j13, 8192 - i10);
            synchronized (sVar) {
                Intrinsics.checkNotNullParameter(array, "array");
                sVar.f3852e.seek(j13);
                i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        break;
                    }
                    int read = sVar.f3852e.read(array, i10, min - i3);
                    if (read != -1) {
                        i3 += read;
                    } else if (i3 == 0) {
                        i3 = -1;
                    }
                }
            }
            if (i3 == -1) {
                if (M5.f3777b == M5.f3778c) {
                    sink.f3818a = M5.a();
                    D.a(M5);
                }
                if (j11 == j13) {
                    j10 = -1;
                }
            } else {
                M5.f3778c += i3;
                long j14 = i3;
                j13 += j14;
                sink.f3819b += j14;
            }
        }
        j10 = j13 - j11;
        if (j10 != j3) {
            this.f3828b += j10;
        }
        return j10;
    }
}
