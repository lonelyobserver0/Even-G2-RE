package S3;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6451a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f6452b;

    /* renamed from: c, reason: collision with root package name */
    public static int f6453c;

    public static void a(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z2, String str, Object... objArr) {
        if (!z2) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            throw new IllegalStateException(AbstractC1482f.j(StubApp.getString2(5927), handler.getLooper().getThread().getName(), StubApp.getString2(5928), myLooper != null ? myLooper.getThread().getName() : StubApp.getString2(5926), StubApp.getString2(1)));
        }
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(StubApp.getString2(5929));
        }
    }

    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void g(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new NullPointerException(StubApp.getString2(5930));
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(String str, boolean z2) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
