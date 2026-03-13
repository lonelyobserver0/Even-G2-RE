package f5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Y extends A0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f13941a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13942b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13943c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13944d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13945e;

    public Y(long j, String str, String str2, long j3, int i3) {
        this.f13941a = j;
        this.f13942b = str;
        this.f13943c = str2;
        this.f13944d = j3;
        this.f13945e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A0) {
            A0 a02 = (A0) obj;
            if (this.f13941a == ((Y) a02).f13941a) {
                Y y10 = (Y) a02;
                if (this.f13942b.equals(y10.f13942b)) {
                    String str = y10.f13943c;
                    String str2 = this.f13943c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f13944d == y10.f13944d && this.f13945e == y10.f13945e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13941a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f13942b.hashCode()) * 1000003;
        String str = this.f13943c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f13944d;
        return ((hashCode2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f13945e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17600));
        sb2.append(this.f13941a);
        sb2.append(StubApp.getString2(17601));
        sb2.append(this.f13942b);
        sb2.append(StubApp.getString2(17602));
        sb2.append(this.f13943c);
        sb2.append(StubApp.getString2(17603));
        sb2.append(this.f13944d);
        sb2.append(StubApp.getString2(2564));
        return AbstractC1482f.f(this.f13945e, StubApp.getString2(265), sb2);
    }
}
