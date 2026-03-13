package s2;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.stub.StubApp;
import java.util.UUID;
import l4.RunnableC1210s0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2.j f20726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f20727c;

    public /* synthetic */ j(k kVar, t2.j jVar, int i3) {
        this.f20725a = i3;
        this.f20727c = kVar;
        this.f20726b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20725a) {
            case 0:
                this.f20726b.l(this.f20727c.f20732d.a());
                return;
            default:
                k kVar = this.f20727c;
                t2.j jVar = kVar.f20729a;
                String string2 = StubApp.getString2(23106);
                String string22 = StubApp.getString2(23107);
                try {
                    i2.h hVar = (i2.h) this.f20726b.get();
                    r2.f fVar = kVar.f20731c;
                    if (hVar == null) {
                        throw new IllegalStateException(string22 + fVar.f20304c + StubApp.getString2("23108"));
                    }
                    i2.o.e().b(k.f20728g, string2 + fVar.f20304c, new Throwable[0]);
                    ListenableWorker listenableWorker = kVar.f20732d;
                    listenableWorker.f10359e = true;
                    l lVar = kVar.f20733e;
                    Context context = kVar.f20730b;
                    UUID uuid = listenableWorker.f10356b.f10362a;
                    lVar.getClass();
                    t2.j jVar2 = new t2.j();
                    lVar.f20735a.j(new RunnableC1210s0(lVar, jVar2, uuid, hVar, context));
                    jVar.l(jVar2);
                    return;
                } catch (Throwable th) {
                    jVar.k(th);
                    return;
                }
        }
    }
}
