package x0;

import M4.L;
import M4.M;
import M4.n0;
import com.stub.StubApp;
import java.util.Objects;
import java.util.Set;
import r0.AbstractC1560u;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1904a {

    /* renamed from: d, reason: collision with root package name */
    public static final C1904a f22637d;

    /* renamed from: a, reason: collision with root package name */
    public final int f22638a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22639b;

    /* renamed from: c, reason: collision with root package name */
    public final M f22640c;

    static {
        C1904a c1904a;
        if (AbstractC1560u.f20190a >= 33) {
            L l9 = new L(4);
            for (int i3 = 1; i3 <= 10; i3++) {
                l9.a(Integer.valueOf(AbstractC1560u.q(i3)));
            }
            c1904a = new C1904a(2, l9.g());
        } else {
            c1904a = new C1904a(2, 10);
        }
        f22637d = c1904a;
    }

    public C1904a(int i3, Set set) {
        this.f22638a = i3;
        M m4 = M.m(set);
        this.f22640c = m4;
        n0 it = m4.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = Math.max(i10, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f22639b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1904a)) {
            return false;
        }
        C1904a c1904a = (C1904a) obj;
        if (this.f22638a == c1904a.f22638a && this.f22639b == c1904a.f22639b) {
            int i3 = AbstractC1560u.f20190a;
            if (Objects.equals(this.f22640c, c1904a.f22640c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = ((this.f22638a * 31) + this.f22639b) * 31;
        M m4 = this.f22640c;
        return i3 + (m4 == null ? 0 : m4.hashCode());
    }

    public final String toString() {
        return StubApp.getString2(24101) + this.f22638a + StubApp.getString2(24102) + this.f22639b + StubApp.getString2(24103) + this.f22640c + StubApp.getString2(511);
    }

    public C1904a(int i3, int i10) {
        this.f22638a = i3;
        this.f22639b = i10;
        this.f22640c = null;
    }
}
