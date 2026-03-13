package f5;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class P extends K0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f13902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13903b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f13904c;

    /* renamed from: d, reason: collision with root package name */
    public final C0892c0 f13905d;

    /* renamed from: e, reason: collision with root package name */
    public final C0894d0 f13906e;

    /* renamed from: f, reason: collision with root package name */
    public final C0902h0 f13907f;

    public P(long j, String str, Q q10, C0892c0 c0892c0, C0894d0 c0894d0, C0902h0 c0902h0) {
        this.f13902a = j;
        this.f13903b = str;
        this.f13904c = q10;
        this.f13905d = c0892c0;
        this.f13906e = c0894d0;
        this.f13907f = c0902h0;
    }

    public final O a() {
        O o5 = new O();
        o5.f13894a = this.f13902a;
        o5.f13895b = this.f13903b;
        o5.f13896c = this.f13904c;
        o5.f13897d = this.f13905d;
        o5.f13898e = this.f13906e;
        o5.f13899f = this.f13907f;
        o5.f13900g = (byte) 1;
        return o5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        P p8 = (P) ((K0) obj);
        if (this.f13902a != p8.f13902a) {
            return false;
        }
        if (!this.f13903b.equals(p8.f13903b) || !this.f13904c.equals(p8.f13904c) || !this.f13905d.equals(p8.f13905d)) {
            return false;
        }
        C0894d0 c0894d0 = p8.f13906e;
        C0894d0 c0894d02 = this.f13906e;
        if (c0894d02 == null) {
            if (c0894d0 != null) {
                return false;
            }
        } else if (!c0894d02.equals(c0894d0)) {
            return false;
        }
        C0902h0 c0902h0 = p8.f13907f;
        C0902h0 c0902h02 = this.f13907f;
        return c0902h02 == null ? c0902h0 == null : c0902h02.equals(c0902h0);
    }

    public final int hashCode() {
        long j = this.f13902a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f13903b.hashCode()) * 1000003) ^ this.f13904c.hashCode()) * 1000003) ^ this.f13905d.hashCode()) * 1000003;
        C0894d0 c0894d0 = this.f13906e;
        int hashCode2 = (hashCode ^ (c0894d0 == null ? 0 : c0894d0.hashCode())) * 1000003;
        C0902h0 c0902h0 = this.f13907f;
        return hashCode2 ^ (c0902h0 != null ? c0902h0.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(17578) + this.f13902a + StubApp.getString2(2148) + this.f13903b + StubApp.getString2(17556) + this.f13904c + StubApp.getString2(256) + this.f13905d + StubApp.getString2(17579) + this.f13906e + StubApp.getString2(17580) + this.f13907f + StubApp.getString2(265);
    }
}
