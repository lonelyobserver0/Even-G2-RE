package f5;

import android.os.Build;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* renamed from: f5.n0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0914n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14090b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14091c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14092d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14093e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14094f;

    public C0914n0(int i3, int i10, long j, long j3, boolean z2, int i11) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f14089a = i3;
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(9523));
        }
        this.f14090b = i10;
        this.f14091c = j;
        this.f14092d = j3;
        this.f14093e = z2;
        this.f14094f = i11;
        if (str2 == null) {
            throw new NullPointerException(StubApp.getString2(9522));
        }
        if (str3 == null) {
            throw new NullPointerException(StubApp.getString2(9521));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0914n0)) {
            return false;
        }
        C0914n0 c0914n0 = (C0914n0) obj;
        if (this.f14089a != c0914n0.f14089a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f14090b != c0914n0.f14090b || this.f14091c != c0914n0.f14091c || this.f14092d != c0914n0.f14092d || this.f14093e != c0914n0.f14093e || this.f14094f != c0914n0.f14094f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int hashCode = (((((this.f14089a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f14090b) * 1000003;
        long j = this.f14091c;
        int i3 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.f14092d;
        return Build.PRODUCT.hashCode() ^ ((((((((i3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f14093e ? 1231 : 1237)) * 1000003) ^ this.f14094f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17681));
        sb2.append(this.f14089a);
        sb2.append(StubApp.getString2(254));
        sb2.append(Build.MODEL);
        sb2.append(StubApp.getString2(17682));
        sb2.append(this.f14090b);
        sb2.append(StubApp.getString2(17683));
        sb2.append(this.f14091c);
        sb2.append(StubApp.getString2(17574));
        sb2.append(this.f14092d);
        sb2.append(StubApp.getString2(17684));
        sb2.append(this.f14093e);
        sb2.append(StubApp.getString2(9384));
        sb2.append(this.f14094f);
        sb2.append(StubApp.getString2(259));
        sb2.append(Build.MANUFACTURER);
        sb2.append(StubApp.getString2(17576));
        return AbstractC1482f.k(sb2, Build.PRODUCT, StubApp.getString2(265));
    }
}
