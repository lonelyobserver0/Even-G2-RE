package Y3;

import android.content.Context;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f8740b;

    /* renamed from: a, reason: collision with root package name */
    public b f8741a;

    static {
        c cVar = new c();
        cVar.f8741a = null;
        f8740b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f8740b;
        synchronized (cVar) {
            try {
                if (cVar.f8741a == null) {
                    if (StubApp.getOrigApplicationContext(context.getApplicationContext()) != null) {
                        context = StubApp.getOrigApplicationContext(context.getApplicationContext());
                    }
                    cVar.f8741a = new b(context);
                }
                bVar = cVar.f8741a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
