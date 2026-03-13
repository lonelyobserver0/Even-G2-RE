package Cb;

import android.os.Handler;
import android.os.SystemClock;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wb.f f1165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Mb.a f1166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ab.g f1167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f1168d;

    public g(h hVar, wb.f fVar, Mb.a aVar, Ab.g gVar) {
        this.f1168d = hVar;
        this.f1165a = fVar;
        this.f1166b = aVar;
        this.f1167c = gVar;
    }

    public final void a() {
        org.slf4j.a aVar = h.f1169c;
        aVar.n(StubApp.getString2(1227));
        wb.f fVar = this.f1165a;
        synchronized (fVar) {
            fVar.f22305s.remove(this);
        }
        h hVar = this.f1168d;
        if (hVar.f1171b) {
            this.f1166b.h(hVar);
            return;
        }
        long elapsedRealtime = this.f1167c.f275b - (SystemClock.elapsedRealtime() - this.f1168d.f1170a);
        Ab.b bVar = new Ab.b(3, this, this.f1166b);
        if (elapsedRealtime <= 0) {
            bVar.run();
            return;
        }
        aVar.c(Long.valueOf(elapsedRealtime), StubApp.getString2(1228));
        new Handler().postDelayed(bVar, elapsedRealtime);
    }
}
