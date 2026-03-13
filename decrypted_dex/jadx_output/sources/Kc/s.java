package Kc;

import com.stub.StubApp;
import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class s implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3848a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3849b;

    /* renamed from: c, reason: collision with root package name */
    public int f3850c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f3851d;

    /* renamed from: e, reason: collision with root package name */
    public final RandomAccessFile f3852e;

    public s(boolean z2, RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f3848a = z2;
        this.f3851d = new ReentrantLock();
        this.f3852e = randomAccessFile;
    }

    public static l a(s sVar) {
        if (!sVar.f3848a) {
            throw new IllegalStateException(StubApp.getString2(25382));
        }
        ReentrantLock reentrantLock = sVar.f3851d;
        reentrantLock.lock();
        try {
            if (sVar.f3849b) {
                throw new IllegalStateException(StubApp.getString2("1551"));
            }
            sVar.f3850c++;
            reentrantLock.unlock();
            return new l(sVar);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f3851d;
        reentrantLock.lock();
        try {
            if (this.f3849b) {
                return;
            }
            this.f3849b = true;
            if (this.f3850c != 0) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            synchronized (this) {
                this.f3852e.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long d() {
        long length;
        ReentrantLock reentrantLock = this.f3851d;
        reentrantLock.lock();
        try {
            if (this.f3849b) {
                throw new IllegalStateException(StubApp.getString2("1551"));
            }
            Unit unit = Unit.INSTANCE;
            synchronized (this) {
                length = this.f3852e.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final m e(long j) {
        ReentrantLock reentrantLock = this.f3851d;
        reentrantLock.lock();
        try {
            if (this.f3849b) {
                throw new IllegalStateException(StubApp.getString2("1551"));
            }
            this.f3850c++;
            reentrantLock.unlock();
            return new m(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.f3848a) {
            throw new IllegalStateException(StubApp.getString2(25382));
        }
        ReentrantLock reentrantLock = this.f3851d;
        reentrantLock.lock();
        try {
            if (this.f3849b) {
                throw new IllegalStateException(StubApp.getString2("1551"));
            }
            Unit unit = Unit.INSTANCE;
            synchronized (this) {
                this.f3852e.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
