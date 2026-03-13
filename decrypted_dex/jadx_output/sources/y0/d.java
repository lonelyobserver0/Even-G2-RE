package y0;

import L0.C0123t;
import P0.o;
import P0.r;
import android.net.Uri;
import java.io.IOException;
import t0.C1725y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d implements P0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f23362a;

    public /* synthetic */ d(g gVar) {
        this.f23362a = gVar;
    }

    public void a() {
        long j;
        g gVar = this.f23362a;
        synchronized (Q0.b.f5690b) {
            try {
                j = Q0.b.f5691c ? Q0.b.f5692d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        gVar.f23387T = j;
        gVar.A(true);
    }

    @Override // P0.j
    public void o(P0.l lVar, long j, long j3, boolean z2) {
        this.f23362a.y((r) lVar, j3);
    }

    @Override // P0.j
    public void r(P0.l lVar, long j, long j3) {
        r rVar = (r) lVar;
        g gVar = this.f23362a;
        gVar.getClass();
        long j10 = rVar.f5435a;
        C1725y c1725y = rVar.f5438d;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        gVar.f23395n.getClass();
        gVar.f23399s.d(c0123t, rVar.f5437c);
        gVar.f23387T = ((Long) rVar.f5440f).longValue() - j;
        gVar.A(true);
    }

    @Override // P0.j
    public A1.g t(P0.l lVar, long j, long j3, IOException iOException, int i3) {
        r rVar = (r) lVar;
        g gVar = this.f23362a;
        gVar.getClass();
        long j10 = rVar.f5435a;
        C1725y c1725y = rVar.f5438d;
        Uri uri = c1725y.f21125c;
        gVar.f23399s.g(new C0123t(c1725y.f21126d, j3), rVar.f5437c, iOException, true);
        gVar.f23395n.getClass();
        gVar.z(iOException);
        return o.f5430e;
    }
}
