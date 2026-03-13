package O3;

import android.content.Context;
import android.content.SharedPreferences;
import com.stub.StubApp;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f5200c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f5201d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f5202a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f5203b;

    public a(Context context) {
        this.f5203b = context.getSharedPreferences(StubApp.getString2(4398), 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f5202a;
        reentrantLock.lock();
        try {
            return this.f5203b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
