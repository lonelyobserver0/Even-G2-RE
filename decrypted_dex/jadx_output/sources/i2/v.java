package i2;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14753a = o.g(StubApp.getString2(18481));

    public static ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f14753a;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            o.e().d(str2, E1.a.j(StubApp.getString2(18482), str), th);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                o.e().d(str2, E1.a.j(StubApp.getString2(6900), str), th2);
            }
        }
        if (listenableWorker == null || !listenableWorker.f10358d) {
            return listenableWorker;
        }
        throw new IllegalStateException(AbstractC1482f.j(StubApp.getString2(18483), v.class.getName(), StubApp.getString2(18484), str, StubApp.getString2(18485)));
    }
}
