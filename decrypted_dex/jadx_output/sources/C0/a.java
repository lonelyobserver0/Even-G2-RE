package C0;

import E0.x;
import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f895a;

    public a(c cVar) {
        this.f895a = cVar;
    }

    @Override // C0.q
    public final void a() {
        this.f895a.f912e.remove(this);
    }

    @Override // C0.q
    public final boolean d(Uri uri, x xVar, boolean z2) {
        HashMap hashMap;
        b bVar;
        c cVar = this.f895a;
        if (cVar.f918m == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.f916k;
            int i3 = AbstractC1560u.f20190a;
            List list = lVar.f972e;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = list.size();
                hashMap = cVar.f911d;
                if (i10 >= size) {
                    break;
                }
                b bVar2 = (b) hashMap.get(((k) list.get(i10)).f964a);
                if (bVar2 != null && elapsedRealtime < bVar2.f903h) {
                    i11++;
                }
                i10++;
            }
            P0.i iVar = new P0.i(1, 0, cVar.f916k.f972e.size(), i11);
            cVar.f910c.getClass();
            A1.g s10 = I4.e.s(iVar, xVar);
            if (s10 != null && s10.f72a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, s10.f73b);
            }
        }
        return false;
    }
}
