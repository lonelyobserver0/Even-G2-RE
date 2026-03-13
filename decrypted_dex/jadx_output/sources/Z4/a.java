package Z4;

import C2.d;
import W4.o;
import android.util.Log;
import com.stub.StubApp;
import f5.C0910l0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final c f8974c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final o f8975a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f8976b = new AtomicReference(null);

    public a(o oVar) {
        this.f8975a = oVar;
        oVar.a(new d(this, 28));
    }

    public final c a(String str) {
        a aVar = (a) this.f8976b.get();
        return aVar == null ? f8974c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f8976b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.f8976b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, long j, C0910l0 c0910l0) {
        String j3 = E1.a.j(StubApp.getString2(7615), str);
        String string2 = StubApp.getString2(280);
        if (Log.isLoggable(string2, 2)) {
            Log.v(string2, j3, null);
        }
        this.f8975a.a(new C9.a(str, j, c0910l0));
    }
}
