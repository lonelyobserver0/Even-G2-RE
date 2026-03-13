package s2;

import B3.q;
import android.content.Context;
import androidx.work.ListenableWorker;
import com.stub.StubApp;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f20728g = i2.o.g(StubApp.getString2(23109));

    /* renamed from: a, reason: collision with root package name */
    public final t2.j f20729a = new t2.j();

    /* renamed from: b, reason: collision with root package name */
    public final Context f20730b;

    /* renamed from: c, reason: collision with root package name */
    public final r2.f f20731c;

    /* renamed from: d, reason: collision with root package name */
    public final ListenableWorker f20732d;

    /* renamed from: e, reason: collision with root package name */
    public final l f20733e;

    /* renamed from: f, reason: collision with root package name */
    public final C1608a f20734f;

    public k(Context context, r2.f fVar, ListenableWorker listenableWorker, l lVar, C1608a c1608a) {
        this.f20730b = context;
        this.f20731c = fVar;
        this.f20732d = listenableWorker;
        this.f20733e = lVar;
        this.f20734f = c1608a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f20731c.f20317q || J.a.a()) {
            this.f20729a.j(null);
            return;
        }
        t2.j jVar = new t2.j();
        C1608a c1608a = this.f20734f;
        ((q) c1608a.f20822c).execute(new j(this, jVar, 0));
        jVar.a(new j(this, jVar, 1), (q) c1608a.f20822c);
    }
}
