package s2;

import A3.s;
import androidx.work.impl.WorkDatabase;
import com.stub.StubApp;
import j2.C1084b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f20719d = i2.o.g(StubApp.getString2(23101));

    /* renamed from: a, reason: collision with root package name */
    public final j2.k f20720a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20721b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20722c;

    public h(j2.k kVar, String str, boolean z2) {
        this.f20720a = kVar;
        this.f20721b = str;
        this.f20722c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean j;
        String string2 = StubApp.getString2(23102);
        j2.k kVar = this.f20720a;
        WorkDatabase workDatabase = kVar.f15298e;
        C1084b c1084b = kVar.f15301h;
        s u2 = workDatabase.u();
        workDatabase.c();
        try {
            String str = this.f20721b;
            synchronized (c1084b.f15271l) {
                containsKey = c1084b.f15267f.containsKey(str);
            }
            if (this.f20722c) {
                j = this.f20720a.f15301h.i(this.f20721b);
            } else {
                if (!containsKey && u2.i(this.f20721b) == 2) {
                    u2.q(1, this.f20721b);
                }
                j = this.f20720a.f15301h.j(this.f20721b);
            }
            i2.o.e().b(f20719d, string2 + this.f20721b + StubApp.getString2("23103") + j, new Throwable[0]);
            workDatabase.n();
            workDatabase.j();
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
