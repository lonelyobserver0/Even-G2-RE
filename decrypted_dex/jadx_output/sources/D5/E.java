package D5;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.stub.StubApp;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f1351a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f1352b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f1353c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f1354d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new X3.a(StubApp.getString2(1357)));

    public E(FirebaseMessaging firebaseMessaging, long j) {
        this.f1353c = firebaseMessaging;
        this.f1351a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f12059b.getSystemService(StubApp.getString2(1358))).newWakeLock(1, StubApp.getString2(1359));
        this.f1352b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1353c.f12059b.getSystemService(StubApp.getString2(1008));
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        String string2 = StubApp.getString2(493);
        try {
            if (this.f1353c.a() == null) {
                Log.e(string2, StubApp.getString2("1360"));
                return false;
            }
            if (!Log.isLoggable(string2, 3)) {
                return true;
            }
            Log.d(string2, StubApp.getString2("1361"));
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!StubApp.getString2(964).equals(message) && !StubApp.getString2(1363).equals(message) && !StubApp.getString2(1364).equals(message)) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w(string2, StubApp.getString2(1365));
                return false;
            }
            Log.w(string2, StubApp.getString2(1366) + e10.getMessage() + StubApp.getString2(1367));
            return false;
        } catch (SecurityException unused) {
            Log.w(string2, StubApp.getString2(1362));
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string2 = StubApp.getString2(1368);
        B D6 = B.D();
        FirebaseMessaging firebaseMessaging = this.f1353c;
        boolean G4 = D6.G(firebaseMessaging.f12059b);
        PowerManager.WakeLock wakeLock = this.f1352b;
        if (G4) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.j = true;
                }
                if (!firebaseMessaging.f12066i.d()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.j = false;
                    }
                    if (B.D().G(firebaseMessaging.f12059b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (B.D().F(firebaseMessaging.f12059b) && !a()) {
                    D d8 = new D();
                    d8.f1349b = this;
                    d8.a();
                    if (B.D().G(firebaseMessaging.f12059b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.j = false;
                    }
                } else {
                    firebaseMessaging.l(this.f1351a);
                }
                if (B.D().G(firebaseMessaging.f12059b)) {
                    wakeLock.release();
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", string2 + e10.getMessage() + StubApp.getString2("1369"));
                synchronized (firebaseMessaging) {
                    firebaseMessaging.j = false;
                    if (B.D().G(firebaseMessaging.f12059b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (B.D().G(firebaseMessaging.f12059b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
