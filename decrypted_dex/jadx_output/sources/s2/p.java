package s2;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final String f20740e = i2.o.g(StubApp.getString2(23116));

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f20741a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20742b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20743c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20744d;

    public p() {
        Wa.a aVar = new Wa.a(1);
        aVar.f8210b = 0;
        this.f20742b = new HashMap();
        this.f20743c = new HashMap();
        this.f20744d = new Object();
        this.f20741a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public final void a(String str, l2.e eVar) {
        String string2 = StubApp.getString2(23117);
        synchronized (this.f20744d) {
            i2.o.e().b(f20740e, string2 + str, new Throwable[0]);
            b(str);
            o oVar = new o(this, str);
            this.f20742b.put(str, oVar);
            this.f20743c.put(str, eVar);
            this.f20741a.schedule(oVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        String string2 = StubApp.getString2(23118);
        synchronized (this.f20744d) {
            try {
                if (((o) this.f20742b.remove(str)) != null) {
                    i2.o.e().b(f20740e, string2 + str, new Throwable[0]);
                    this.f20743c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
