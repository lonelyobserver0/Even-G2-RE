package C0;

import E0.x;
import L0.C0123t;
import M4.I;
import M4.r;
import android.net.Uri;
import android.os.SystemClock;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import o0.C1406C;
import r0.AbstractC1560u;
import t0.C1721u;
import t0.C1725y;
import t0.InterfaceC1707g;
import t0.InterfaceC1708h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements P0.j {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f896a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.o f897b = new P0.o(StubApp.getString2(817));

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1708h f898c;

    /* renamed from: d, reason: collision with root package name */
    public i f899d;

    /* renamed from: e, reason: collision with root package name */
    public long f900e;

    /* renamed from: f, reason: collision with root package name */
    public long f901f;

    /* renamed from: g, reason: collision with root package name */
    public long f902g;

    /* renamed from: h, reason: collision with root package name */
    public long f903h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public IOException f904k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f905l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f906m;

    public b(c cVar, Uri uri) {
        this.f906m = cVar;
        this.f896a = uri;
        this.f898c = ((InterfaceC1707g) cVar.f908a.f9143b).g();
    }

    public static boolean a(b bVar, long j) {
        bVar.f903h = SystemClock.elapsedRealtime() + j;
        c cVar = bVar.f906m;
        if (!bVar.f896a.equals(cVar.f917l)) {
            return false;
        }
        List list = cVar.f916k.f972e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar2 = (b) cVar.f911d.get(((k) list.get(i3)).f964a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f903h) {
                Uri uri = bVar2.f896a;
                cVar.f917l = uri;
                bVar2.e(cVar.b(uri));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        i iVar = this.f899d;
        Uri uri = this.f896a;
        if (iVar != null) {
            h hVar = iVar.f960v;
            if (hVar.f938a != -9223372036854775807L || hVar.f942e) {
                Uri.Builder buildUpon = uri.buildUpon();
                i iVar2 = this.f899d;
                if (iVar2.f960v.f942e) {
                    buildUpon.appendQueryParameter(StubApp.getString2(818), String.valueOf(iVar2.f949k + iVar2.f956r.size()));
                    i iVar3 = this.f899d;
                    if (iVar3.f952n != -9223372036854775807L) {
                        I i3 = iVar3.f957s;
                        int size = i3.size();
                        if (!i3.isEmpty() && ((d) r.j(i3)).f922n) {
                            size--;
                        }
                        buildUpon.appendQueryParameter(StubApp.getString2(819), String.valueOf(size));
                    }
                }
                h hVar2 = this.f899d.f960v;
                if (hVar2.f938a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter(StubApp.getString2(822), hVar2.f939b ? StubApp.getString2(820) : StubApp.getString2(821));
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z2) {
        e(z2 ? b() : this.f896a);
    }

    public final void d(Uri uri) {
        c cVar = this.f906m;
        P0.r rVar = new P0.r(this.f898c, uri, 4, cVar.f909b.k(cVar.f916k, this.f899d));
        I4.e eVar = cVar.f910c;
        int i3 = rVar.f5437c;
        this.f897b.f(rVar, this, eVar.t(i3));
        cVar.f913f.h(new C0123t(rVar.f5436b), i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.f903h = 0L;
        if (this.j) {
            return;
        }
        P0.o oVar = this.f897b;
        if (oVar.d() || oVar.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f902g;
        if (elapsedRealtime >= j) {
            d(uri);
        } else {
            this.j = true;
            this.f906m.f915h.postDelayed(new Ab.b(2, this, uri), j - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(C0.i r65, L0.C0123t r66) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.b.f(C0.i, L0.t):void");
    }

    @Override // P0.j
    public final void o(P0.l lVar, long j, long j3, boolean z2) {
        P0.r rVar = (P0.r) lVar;
        long j10 = rVar.f5435a;
        C1725y c1725y = rVar.f5438d;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        c cVar = this.f906m;
        cVar.f910c.getClass();
        cVar.f913f.c(c0123t, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // P0.j
    public final void r(P0.l lVar, long j, long j3) {
        P0.r rVar = (P0.r) lVar;
        m mVar = (m) rVar.f5440f;
        C1725y c1725y = rVar.f5438d;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        if (mVar instanceof i) {
            f((i) mVar, c0123t);
            this.f906m.f913f.d(c0123t, 4);
        } else {
            C1406C b2 = C1406C.b(StubApp.getString2(823), null);
            this.f904k = b2;
            this.f906m.f913f.g(c0123t, 4, b2, true);
        }
        this.f906m.f910c.getClass();
    }

    @Override // P0.j
    public final A1.g t(P0.l lVar, long j, long j3, IOException iOException, int i3) {
        P0.r rVar = (P0.r) lVar;
        long j10 = rVar.f5435a;
        C1725y c1725y = rVar.f5438d;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        boolean z2 = uri.getQueryParameter(StubApp.getString2(818)) != null;
        boolean z10 = iOException instanceof n;
        A1.g gVar = P0.o.f5430e;
        c cVar = this.f906m;
        int i10 = rVar.f5437c;
        if (z2 || z10) {
            int i11 = iOException instanceof C1721u ? ((C1721u) iOException).f21114d : IntCompanionObject.MAX_VALUE;
            if (z10 || i11 == 400 || i11 == 503) {
                this.f902g = SystemClock.elapsedRealtime();
                c(false);
                A0.f fVar = cVar.f913f;
                int i12 = AbstractC1560u.f20190a;
                fVar.g(c0123t, i10, iOException, true);
                return gVar;
            }
        }
        x xVar = new x(iOException, i3);
        Iterator it = cVar.f912e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((q) it.next()).d(this.f896a, xVar, false);
        }
        I4.e eVar = cVar.f910c;
        if (z11) {
            eVar.getClass();
            long u2 = I4.e.u(xVar);
            gVar = u2 != -9223372036854775807L ? new A1.g(false, u2, 0) : P0.o.f5431f;
        }
        boolean a3 = gVar.a();
        cVar.f913f.g(c0123t, i10, iOException, true ^ a3);
        if (!a3) {
            eVar.getClass();
        }
        return gVar;
    }
}
