package Gb;

import Nb.g;
import com.stub.StubApp;
import org.slf4j.LoggerFactory;
import s2.d;
import wb.f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends g {

    /* renamed from: g, reason: collision with root package name */
    public static final org.slf4j.a f2460g = LoggerFactory.getLogger((Class<?>) c.class);

    /* renamed from: f, reason: collision with root package name */
    public int f2461f;

    public c(f fVar) {
        super(1, fVar);
        this.f2461f = 0;
        new d(this, 6);
    }

    public static void d(c cVar) {
        synchronized (cVar) {
            synchronized (cVar) {
                try {
                    int i3 = cVar.f2461f;
                    if (i3 == 0) {
                        f2460g.e(StubApp.getString2("2331"));
                    } else if (i3 == 2) {
                        f2460g.n(StubApp.getString2("2332"));
                        synchronized (cVar) {
                            cVar.f2461f = 0;
                            throw null;
                        }
                    }
                    cVar.f2461f = 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
