package f5;

import com.stub.StubApp;

/* renamed from: f5.m0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0912m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14077a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14078b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14079c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14080d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14081e;

    /* renamed from: f, reason: collision with root package name */
    public final Y.m f14082f;

    public C0912m0(String str, String str2, String str3, String str4, int i3, Y.m mVar) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(17671));
        }
        this.f14077a = str;
        if (str2 == null) {
            throw new NullPointerException(StubApp.getString2(17670));
        }
        this.f14078b = str2;
        if (str3 == null) {
            throw new NullPointerException(StubApp.getString2(17669));
        }
        this.f14079c = str3;
        if (str4 == null) {
            throw new NullPointerException(StubApp.getString2(17668));
        }
        this.f14080d = str4;
        this.f14081e = i3;
        this.f14082f = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0912m0)) {
            return false;
        }
        C0912m0 c0912m0 = (C0912m0) obj;
        return this.f14077a.equals(c0912m0.f14077a) && this.f14078b.equals(c0912m0.f14078b) && this.f14079c.equals(c0912m0.f14079c) && this.f14080d.equals(c0912m0.f14080d) && this.f14081e == c0912m0.f14081e && this.f14082f.equals(c0912m0.f14082f);
    }

    public final int hashCode() {
        return ((((((((((this.f14077a.hashCode() ^ 1000003) * 1000003) ^ this.f14078b.hashCode()) * 1000003) ^ this.f14079c.hashCode()) * 1000003) ^ this.f14080d.hashCode()) * 1000003) ^ this.f14081e) * 1000003) ^ this.f14082f.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(17672) + this.f14077a + StubApp.getString2(17673) + this.f14078b + StubApp.getString2(2599) + this.f14079c + StubApp.getString2(17674) + this.f14080d + StubApp.getString2(17675) + this.f14081e + StubApp.getString2(17676) + this.f14082f + StubApp.getString2(265);
    }
}
