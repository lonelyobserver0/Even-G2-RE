package P0;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final A1.g f5429d = new A1.g(false, -9223372036854775807L, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final A1.g f5430e = new A1.g(false, -9223372036854775807L, 2);

    /* renamed from: f, reason: collision with root package name */
    public static final A1.g f5431f = new A1.g(false, -9223372036854775807L, 3);

    /* renamed from: a, reason: collision with root package name */
    public final Q0.a f5432a;

    /* renamed from: b, reason: collision with root package name */
    public k f5433b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f5434c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 4774(0x12a6, float:6.69E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.String r3 = E1.a.j(r0, r3)
            int r0 = r0.AbstractC1560u.f20190a
            Y.a r0 = new Y.a
            r1 = 1
            r0.<init>(r3, r1)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            A1.a r0 = new A1.a
            r1 = 27
            r0.<init>(r1)
            Q0.a r1 = new Q0.a
            r1.<init>(r3, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.o.<init>(java.lang.String):void");
    }

    @Override // P0.p
    public final void a() {
        IOException iOException;
        IOException iOException2 = this.f5434c;
        if (iOException2 != null) {
            throw iOException2;
        }
        k kVar = this.f5433b;
        if (kVar != null && (iOException = kVar.f5424e) != null && kVar.f5425f > kVar.f5420a) {
            throw iOException;
        }
    }

    public final void b() {
        k kVar = this.f5433b;
        AbstractC1550k.h(kVar);
        kVar.a(false);
    }

    public final boolean c() {
        return this.f5434c != null;
    }

    public final boolean d() {
        return this.f5433b != null;
    }

    public final void e(m mVar) {
        k kVar = this.f5433b;
        if (kVar != null) {
            kVar.a(true);
        }
        Q0.a aVar = this.f5432a;
        if (mVar != null) {
            aVar.execute(new L9.n(mVar, 13));
        }
        A1.a aVar2 = aVar.f5688b;
        aVar.f5687a.shutdown();
    }

    public final long f(l lVar, j jVar, int i3) {
        Looper myLooper = Looper.myLooper();
        AbstractC1550k.h(myLooper);
        this.f5434c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        k kVar = new k(this, myLooper, lVar, jVar, i3, elapsedRealtime);
        AbstractC1550k.g(this.f5433b == null);
        this.f5433b = kVar;
        SystemClock.elapsedRealtime();
        kVar.f5423d.getClass();
        kVar.f5424e = null;
        k kVar2 = this.f5433b;
        kVar2.getClass();
        this.f5432a.execute(kVar2);
        return elapsedRealtime;
    }

    public o(Q0.a aVar) {
        this.f5432a = aVar;
    }
}
