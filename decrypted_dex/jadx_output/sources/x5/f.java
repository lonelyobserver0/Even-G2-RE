package x5;

import com.stub.StubApp;
import q4.k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f22883a;

    /* renamed from: b, reason: collision with root package name */
    public final k f22884b;

    public f(j jVar, k kVar) {
        this.f22883a = jVar;
        this.f22884b = kVar;
    }

    @Override // x5.i
    public final boolean a(Exception exc) {
        this.f22884b.c(exc);
        return true;
    }

    @Override // x5.i
    public final boolean b(y5.a aVar) {
        if (aVar.f23514b != 4 || this.f22883a.a(aVar)) {
            return false;
        }
        String str = aVar.f23515c;
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(24176));
        }
        this.f22884b.b(new C1910a(aVar.f23517e, str, aVar.f23518f));
        return true;
    }
}
