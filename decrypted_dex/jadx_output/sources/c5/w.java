package c5;

import com.stub.StubApp;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10962a;

    /* renamed from: b, reason: collision with root package name */
    public final Number f10963b;

    public w() {
        this.f10962a = 1;
        this.f10963b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f10962a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new v(runnable));
                newThread.setName(StubApp.getString2(9596) + ((AtomicLong) this.f10963b).getAndIncrement());
                return newThread;
            default:
                Thread thread = new Thread(runnable);
                thread.setName(StubApp.getString2(9595) + ((AtomicInteger) this.f10963b).getAndIncrement());
                return thread;
        }
    }

    public w(AtomicLong atomicLong) {
        this.f10962a = 0;
        this.f10963b = atomicLong;
    }
}
