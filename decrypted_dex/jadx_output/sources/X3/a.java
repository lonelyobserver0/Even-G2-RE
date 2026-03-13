package X3;

import B3.p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f8373a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f8374b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f8373a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f8374b.newThread(new p(runnable, 1));
        newThread.setName(this.f8373a);
        return newThread;
    }
}
