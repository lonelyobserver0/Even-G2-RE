package q4;

import S3.D;
import com.stub.StubApp;
import f4.C0877a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final s f20051a = new s();

    public k() {
    }

    public final void a(Exception exc) {
        this.f20051a.a(exc);
    }

    public final void b(Object obj) {
        this.f20051a.b(obj);
    }

    public final boolean c(Exception exc) {
        s sVar = this.f20051a;
        sVar.getClass();
        D.i(exc, StubApp.getString2(22223));
        synchronized (sVar.f20072a) {
            try {
                if (sVar.f20074c) {
                    return false;
                }
                sVar.f20074c = true;
                sVar.f20077f = exc;
                sVar.f20073b.e(sVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.f20051a.d(obj);
    }

    public k(AbstractC1520a abstractC1520a) {
        abstractC1520a.a(new C0877a(this));
    }
}
