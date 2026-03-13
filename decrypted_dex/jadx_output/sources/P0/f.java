package P0;

import android.os.SystemClock;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f5391a;

    public final void a(int i3) {
        h hVar = this.f5391a;
        synchronized (hVar) {
            int i10 = hVar.f5415m;
            if (i10 == 0 || hVar.f5407d) {
                if (i10 == i3) {
                    return;
                }
                hVar.f5415m = i3;
                if (i3 != 1 && i3 != 0 && i3 != 8) {
                    hVar.f5413k = hVar.a(i3);
                    hVar.f5406c.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    hVar.b(hVar.f5411h, hVar.f5409f > 0 ? (int) (elapsedRealtime - hVar.f5410g) : 0, hVar.f5413k);
                    hVar.f5410g = elapsedRealtime;
                    hVar.f5411h = 0L;
                    hVar.j = 0L;
                    hVar.f5412i = 0L;
                    t tVar = hVar.f5408e;
                    tVar.f5447b.clear();
                    tVar.f5449d = -1;
                    tVar.f5450e = 0;
                    tVar.f5451f = 0;
                }
            }
        }
    }
}
