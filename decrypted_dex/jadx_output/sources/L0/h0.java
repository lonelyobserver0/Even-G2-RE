package L0;

import com.stub.StubApp;
import o0.C1417N;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f4092d = new h0(new C1417N[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f4093a;

    /* renamed from: b, reason: collision with root package name */
    public final M4.Z f4094b;

    /* renamed from: c, reason: collision with root package name */
    public int f4095c;

    static {
        AbstractC1560u.E(0);
    }

    public h0(C1417N... c1417nArr) {
        this.f4094b = M4.I.n(c1417nArr);
        this.f4093a = c1417nArr.length;
        int i3 = 0;
        while (true) {
            M4.Z z2 = this.f4094b;
            if (i3 >= z2.f4580d) {
                return;
            }
            int i10 = i3 + 1;
            for (int i11 = i10; i11 < z2.f4580d; i11++) {
                if (((C1417N) z2.get(i3)).equals(z2.get(i11))) {
                    AbstractC1550k.l(StubApp.getString2(3315), "", new IllegalArgumentException(StubApp.getString2(3314)));
                }
            }
            i3 = i10;
        }
    }

    public final C1417N a(int i3) {
        return (C1417N) this.f4094b.get(i3);
    }

    public final int b(C1417N c1417n) {
        int indexOf = this.f4094b.indexOf(c1417n);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f4093a == h0Var.f4093a && this.f4094b.equals(h0Var.f4094b);
    }

    public final int hashCode() {
        if (this.f4095c == 0) {
            this.f4095c = this.f4094b.hashCode();
        }
        return this.f4095c;
    }
}
