package r0;

import com.stub.StubApp;

/* renamed from: r0.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1554o {

    /* renamed from: c, reason: collision with root package name */
    public static final C1554o f20179c = new C1554o(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f20180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20181b;

    static {
        new C1554o(0, 0);
    }

    public C1554o(int i3, int i10) {
        AbstractC1550k.c((i3 == -1 || i3 >= 0) && (i10 == -1 || i10 >= 0));
        this.f20180a = i3;
        this.f20181b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1554o) {
            C1554o c1554o = (C1554o) obj;
            if (this.f20180a == c1554o.f20180a && this.f20181b == c1554o.f20181b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f20180a;
        return ((i3 >>> 16) | (i3 << 16)) ^ this.f20181b;
    }

    public final String toString() {
        return this.f20180a + StubApp.getString2(925) + this.f20181b;
    }
}
