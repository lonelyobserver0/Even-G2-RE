package v;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1792e extends android.support.v4.media.session.b {
    @Override // android.support.v4.media.session.b
    public final boolean c(AbstractC1794g abstractC1794g, C1790c c1790c, C1790c c1790c2) {
        synchronized (abstractC1794g) {
            try {
                if (abstractC1794g.f21511b != c1790c) {
                    return false;
                }
                abstractC1794g.f21511b = c1790c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.support.v4.media.session.b
    public final boolean d(AbstractC1794g abstractC1794g, Object obj, Object obj2) {
        synchronized (abstractC1794g) {
            try {
                if (abstractC1794g.f21510a != obj) {
                    return false;
                }
                abstractC1794g.f21510a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.support.v4.media.session.b
    public final boolean e(AbstractC1794g abstractC1794g, C1793f c1793f, C1793f c1793f2) {
        synchronized (abstractC1794g) {
            try {
                if (abstractC1794g.f21512c != c1793f) {
                    return false;
                }
                abstractC1794g.f21512c = c1793f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.support.v4.media.session.b
    public final void v(C1793f c1793f, C1793f c1793f2) {
        c1793f.f21505b = c1793f2;
    }

    @Override // android.support.v4.media.session.b
    public final void w(C1793f c1793f, Thread thread) {
        c1793f.f21504a = thread;
    }
}
