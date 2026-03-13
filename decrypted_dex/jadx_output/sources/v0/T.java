package v0;

import L0.C0123t;
import android.util.Pair;
import java.io.IOException;
import r0.C1557r;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class T implements L0.G, A0.g {

    /* renamed from: a, reason: collision with root package name */
    public final V f21647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P8.i f21648b;

    public T(P8.i iVar, V v2) {
        this.f21648b = iVar;
        this.f21647a = v2;
    }

    @Override // L0.G
    public final void B(int i3, L0.B b2, C0123t c0123t, I0.g gVar) {
        Pair a3 = a(i3, b2);
        if (a3 != null) {
            ((C1557r) this.f21648b.j).c(new Q(this, a3, c0123t, gVar, 2));
        }
    }

    @Override // L0.G
    public final void C(int i3, L0.B b2, C0123t c0123t, I0.g gVar) {
        Pair a3 = a(i3, b2);
        if (a3 != null) {
            ((C1557r) this.f21648b.j).c(new Q(this, a3, c0123t, gVar, 1));
        }
    }

    public final Pair a(int i3, L0.B b2) {
        L0.B b10;
        V v2 = this.f21647a;
        L0.B b11 = null;
        if (b2 != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= v2.f21654c.size()) {
                    b10 = null;
                    break;
                }
                if (((L0.B) v2.f21654c.get(i10)).f3884d == b2.f3884d) {
                    Object obj = v2.f21653b;
                    int i11 = a0.f21689k;
                    b10 = b2.a(Pair.create(obj, b2.f3881a));
                    break;
                }
                i10++;
            }
            if (b10 == null) {
                return null;
            }
            b11 = b10;
        }
        return Pair.create(Integer.valueOf(i3 + v2.f21655d), b11);
    }

    @Override // L0.G
    public final void k(int i3, L0.B b2, final C0123t c0123t, final I0.g gVar, final IOException iOException, final boolean z2) {
        final Pair a3 = a(i3, b2);
        if (a3 != null) {
            ((C1557r) this.f21648b.j).c(new Runnable() { // from class: v0.S
                @Override // java.lang.Runnable
                public final void run() {
                    w0.c cVar = (w0.c) T.this.f21648b.f5636i;
                    Pair pair = a3;
                    cVar.k(((Integer) pair.first).intValue(), (L0.B) pair.second, c0123t, gVar, iOException, z2);
                }
            });
        }
    }

    @Override // L0.G
    public final void m(int i3, L0.B b2, C0123t c0123t, I0.g gVar) {
        Pair a3 = a(i3, b2);
        if (a3 != null) {
            ((C1557r) this.f21648b.j).c(new Q(this, a3, c0123t, gVar, 0));
        }
    }

    @Override // L0.G
    public final void n(int i3, L0.B b2, I0.g gVar) {
        Pair a3 = a(i3, b2);
        if (a3 != null) {
            ((C1557r) this.f21648b.j).c(new P(this, a3, gVar, 1));
        }
    }

    @Override // L0.G
    public final void o(int i3, L0.B b2, I0.g gVar) {
        Pair a3 = a(i3, b2);
        if (a3 != null) {
            ((C1557r) this.f21648b.j).c(new P(this, a3, gVar, 0));
        }
    }
}
