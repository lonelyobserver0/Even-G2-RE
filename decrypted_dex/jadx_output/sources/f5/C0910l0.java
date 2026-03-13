package f5;

import com.stub.StubApp;

/* renamed from: f5.l0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0910l0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0912m0 f14068a;

    /* renamed from: b, reason: collision with root package name */
    public final C0916o0 f14069b;

    /* renamed from: c, reason: collision with root package name */
    public final C0914n0 f14070c;

    public C0910l0(C0912m0 c0912m0, C0916o0 c0916o0, C0914n0 c0914n0) {
        this.f14068a = c0912m0;
        this.f14069b = c0916o0;
        this.f14070c = c0914n0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0910l0) {
            C0910l0 c0910l0 = (C0910l0) obj;
            if (this.f14068a.equals(c0910l0.f14068a) && this.f14069b.equals(c0910l0.f14069b) && this.f14070c.equals(c0910l0.f14070c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14068a.hashCode() ^ 1000003) * 1000003) ^ this.f14069b.hashCode()) * 1000003) ^ this.f14070c.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(17664) + this.f14068a + StubApp.getString2(17665) + this.f14069b + StubApp.getString2(17666) + this.f14070c + StubApp.getString2(265);
    }
}
