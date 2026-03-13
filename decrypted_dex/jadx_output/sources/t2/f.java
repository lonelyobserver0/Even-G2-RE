package t2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f extends Y3.a {
    @Override // Y3.a
    public final boolean d(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f21160b != cVar) {
                    return false;
                }
                hVar.f21160b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Y3.a
    public final boolean e(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f21159a != obj) {
                    return false;
                }
                hVar.f21159a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Y3.a
    public final boolean f(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f21161c != gVar) {
                    return false;
                }
                hVar.f21161c = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Y3.a
    public final void s(g gVar, g gVar2) {
        gVar.f21154b = gVar2;
    }

    @Override // Y3.a
    public final void t(g gVar, Thread thread) {
        gVar.f21153a = thread;
    }
}
