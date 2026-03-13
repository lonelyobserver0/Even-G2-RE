package t2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j extends h {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = h.f21158g;
        }
        if (!h.f21157f.e(this, null, obj)) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!h.f21157f.e(this, null, new b(th))) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean l(Q4.c cVar) {
        b bVar;
        cVar.getClass();
        Object obj = this.f21159a;
        if (obj == null) {
            if (cVar.isDone()) {
                if (h.f21157f.e(this, null, h.f(cVar))) {
                    h.c(this);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, cVar);
            if (h.f21157f.e(this, null, eVar)) {
                try {
                    cVar.a(eVar, i.f21162a);
                    return true;
                } catch (Throwable th) {
                    try {
                        bVar = new b(th);
                    } catch (Throwable unused) {
                        bVar = b.f21140b;
                    }
                    h.f21157f.e(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f21159a;
        }
        if (obj instanceof C1728a) {
            cVar.cancel(((C1728a) obj).f21138a);
        }
        return false;
    }
}
