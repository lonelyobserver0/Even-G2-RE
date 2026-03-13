package D5;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: D5.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractServiceC0044h extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f1422a;

    /* renamed from: b, reason: collision with root package name */
    public M f1423b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1424c;

    /* renamed from: d, reason: collision with root package name */
    public int f1425d;

    /* renamed from: e, reason: collision with root package name */
    public int f1426e;

    public AbstractServiceC0044h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new X3.a(StubApp.getString2(1445)));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f1422a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f1424c = new Object();
        this.f1426e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            L.b(intent);
        }
        synchronized (this.f1424c) {
            try {
                int i3 = this.f1426e - 1;
                this.f1426e = i3;
                if (i3 == 0) {
                    stopSelfResult(this.f1425d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(StubApp.getString2("1446"), 3)) {
                Log.d(StubApp.getString2("1446"), StubApp.getString2("1447"));
            }
            if (this.f1423b == null) {
                this.f1423b = new M(new Z9.q(this, 4));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1423b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f1422a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        synchronized (this.f1424c) {
            this.f1425d = i10;
            this.f1426e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) B.D().f1343d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        q4.k kVar = new q4.k();
        this.f1422a.execute(new Ab.c(this, intent2, kVar, 2));
        q4.s sVar = kVar.f20051a;
        if (sVar.isComplete()) {
            a(intent);
            return 2;
        }
        sVar.addOnCompleteListener(new G1.c(0), new C0043g(0, this, intent));
        return 3;
    }
}
