package D5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class O implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1391a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1392b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f1393c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f1394d;

    /* renamed from: e, reason: collision with root package name */
    public M f1395e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1396f;

    public O(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new X3.a(StubApp.getString2(1398)));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f1394d = new ArrayDeque();
        this.f1396f = false;
        Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f1391a = origApplicationContext;
        this.f1392b = new Intent(StubApp.getString2(1399)).setPackage(origApplicationContext.getPackageName());
        this.f1393c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable(StubApp.getString2("493"), 3)) {
                Log.d(StubApp.getString2("493"), StubApp.getString2("1400"));
            }
            while (!this.f1394d.isEmpty()) {
                if (Log.isLoggable(StubApp.getString2("493"), 3)) {
                    Log.d(StubApp.getString2("493"), StubApp.getString2("1401"));
                }
                M m4 = this.f1395e;
                if (m4 == null || !m4.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable(StubApp.getString2("493"), 3)) {
                    Log.d(StubApp.getString2("493"), StubApp.getString2("1402"));
                }
                this.f1395e.a((N) this.f1394d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized q4.s b(Intent intent) {
        N n10;
        try {
            if (Log.isLoggable(StubApp.getString2("493"), 3)) {
                Log.d(StubApp.getString2("493"), StubApp.getString2("1403"));
            }
            n10 = new N(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f1393c;
            n10.f1390b.f20051a.addOnCompleteListener(scheduledThreadPoolExecutor, new C2.d(scheduledThreadPoolExecutor.schedule(new B0.o(n10, 2), 20L, TimeUnit.SECONDS), 7));
            this.f1394d.add(n10);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return n10.f1390b.f20051a;
    }

    public final void c() {
        String string2 = StubApp.getString2(493);
        if (Log.isLoggable(string2, 3)) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(1404));
            sb2.append(!this.f1396f);
            Log.d(string2, sb2.toString());
        }
        if (this.f1396f) {
            return;
        }
        this.f1396f = true;
        try {
        } catch (SecurityException e10) {
            Log.e(string2, StubApp.getString2(1406), e10);
        }
        if (V3.a.b().a(this.f1391a, this.f1392b, this, 65)) {
            return;
        }
        Log.e(string2, StubApp.getString2("1405"));
        this.f1396f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f1394d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((N) arrayDeque.poll()).f1390b.d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String string2 = StubApp.getString2(1407);
        String string22 = StubApp.getString2(1408);
        synchronized (this) {
            try {
                if (Log.isLoggable(StubApp.getString2("493"), 3)) {
                    Log.d(StubApp.getString2("493"), string22 + componentName);
                }
                this.f1396f = false;
                if (iBinder instanceof M) {
                    this.f1395e = (M) iBinder;
                    a();
                    return;
                }
                Log.e(StubApp.getString2("493"), string2 + iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.f1394d;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((N) arrayDeque.poll()).f1390b.d(null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        String string2 = StubApp.getString2(493);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(1409) + componentName);
        }
        a();
    }
}
