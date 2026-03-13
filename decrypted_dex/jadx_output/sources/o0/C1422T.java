package o0;

import M4.Z;
import r0.AbstractC1560u;

/* renamed from: o0.T, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1422T {

    /* renamed from: b, reason: collision with root package name */
    public static final C1422T f18110b;

    /* renamed from: a, reason: collision with root package name */
    public final M4.I f18111a;

    static {
        M4.G g10 = M4.I.f4549b;
        f18110b = new C1422T(Z.f4578e);
        AbstractC1560u.E(0);
    }

    public C1422T(M4.I i3) {
        this.f18111a = M4.I.m(i3);
    }

    public final boolean a(int i3) {
        int i10 = 0;
        while (true) {
            M4.I i11 = this.f18111a;
            if (i10 >= i11.size()) {
                return false;
            }
            C1421S c1421s = (C1421S) i11.get(i10);
            boolean[] zArr = c1421s.f18109e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (!zArr[i12]) {
                    i12++;
                } else if (c1421s.f18106b.f18069c == i3) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1422T.class != obj.getClass()) {
            return false;
        }
        return this.f18111a.equals(((C1422T) obj).f18111a);
    }

    public final int hashCode() {
        return this.f18111a.hashCode();
    }
}
