package D5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;
import java.util.concurrent.TimeUnit;
import p4.C1489a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final long f1385a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1386b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C1489a f1387c;

    public static void a(Context context) {
        if (f1387c == null) {
            C1489a c1489a = new C1489a(context);
            f1387c = c1489a;
            synchronized (c1489a.f19679a) {
                c1489a.f19685g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f1386b) {
            try {
                if (f1387c != null && intent.getBooleanExtra(StubApp.getString2("1395"), false)) {
                    intent.putExtra(StubApp.getString2("1395"), false);
                    f1387c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f1386b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra(StubApp.getString2("1395"), false);
                intent.putExtra(StubApp.getString2("1395"), true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f1387c.a(f1385a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
