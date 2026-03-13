package X4;

import android.os.StrictMode;
import com.stub.StubApp;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f8375e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f8376a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f8377b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8378c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f8379d;

    public a(String str, int i3, StrictMode.ThreadPolicy threadPolicy) {
        this.f8377b = str;
        this.f8378c = i3;
        this.f8379d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f8375e.newThread(new Ab.b(23, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f8377b + StubApp.getString2(7242) + this.f8376a.getAndIncrement());
        return newThread;
    }
}
