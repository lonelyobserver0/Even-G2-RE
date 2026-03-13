package c5;

import android.os.Looper;
import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f10858a;

    static {
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new w(new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new v(unconfigurableExecutorService), StubApp.getString2(9439)));
        f10858a = unconfigurableExecutorService;
    }

    public static void a(q4.j jVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        jVar.continueWith(f10858a, new B(countDownLatch, 1));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (jVar.isSuccessful()) {
            jVar.getResult();
        } else {
            if (jVar.isCanceled()) {
                throw new CancellationException(StubApp.getString2(8395));
            }
            if (!jVar.isComplete()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(jVar.getException());
        }
    }
}
