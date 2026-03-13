package W4;

import com.stub.StubApp;
import i2.u;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final q f8137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8139c;

    public i(int i3, int i10, Class cls) {
        this(q.a(cls), i3, i10);
    }

    public static i a(q qVar) {
        return new i(qVar, 1, 0);
    }

    public static i b(Class cls) {
        return new i(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8137a.equals(iVar.f8137a) && this.f8138b == iVar.f8138b && this.f8139c == iVar.f8139c;
    }

    public final int hashCode() {
        return ((((this.f8137a.hashCode() ^ 1000003) * 1000003) ^ this.f8138b) * 1000003) ^ this.f8139c;
    }

    public final String toString() {
        String string2;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(6908));
        sb2.append(this.f8137a);
        sb2.append(StubApp.getString2(2148));
        int i3 = this.f8138b;
        sb2.append(i3 == 1 ? StubApp.getString2(6909) : i3 == 0 ? StubApp.getString2(6910) : StubApp.getString2(6911));
        sb2.append(StubApp.getString2(6912));
        int i10 = this.f8139c;
        if (i10 == 0) {
            string2 = StubApp.getString2(6916);
        } else if (i10 == 1) {
            string2 = StubApp.getString2(6915);
        } else {
            if (i10 != 2) {
                throw new AssertionError(u.p(i10, StubApp.getString2(6914)));
            }
            string2 = StubApp.getString2(6913);
        }
        return AbstractC1482f.k(sb2, string2, StubApp.getString2(265));
    }

    public i(q qVar, int i3, int i10) {
        Y3.a.g(qVar, StubApp.getString2(6907));
        this.f8137a = qVar;
        this.f8138b = i3;
        this.f8139c = i10;
    }
}
