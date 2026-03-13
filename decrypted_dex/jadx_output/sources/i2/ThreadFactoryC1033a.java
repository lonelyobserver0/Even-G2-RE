package i2;

import com.stub.StubApp;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import w.AbstractC1856e;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ThreadFactoryC1033a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f14715a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14716b;

    public ThreadFactoryC1033a(boolean z2) {
        this.f14716b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder b2 = AbstractC1856e.b(this.f14716b ? StubApp.getString2(18461) : StubApp.getString2(18462));
        b2.append(this.f14715a.incrementAndGet());
        return new Thread(runnable, b2.toString());
    }
}
