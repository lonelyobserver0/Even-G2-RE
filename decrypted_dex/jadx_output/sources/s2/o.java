package s2;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final p f20738a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20739b;

    public o(p pVar, String str) {
        this.f20738a = pVar;
        this.f20739b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string2 = StubApp.getString2(23112);
        synchronized (this.f20738a.f20744d) {
            try {
                if (((o) this.f20738a.f20742b.remove(this.f20739b)) != null) {
                    n nVar = (n) this.f20738a.f20743c.remove(this.f20739b);
                    if (nVar != null) {
                        String str = this.f20739b;
                        i2.o.e().b(l2.e.f15856k, StubApp.getString2("23113") + str, new Throwable[0]);
                        ((l2.e) nVar).d();
                    }
                } else {
                    i2.o.e().b(StubApp.getString2("23114"), string2 + this.f20739b + StubApp.getString2("23115"), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
