package f5;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public long f13894a;

    /* renamed from: b, reason: collision with root package name */
    public String f13895b;

    /* renamed from: c, reason: collision with root package name */
    public Q f13896c;

    /* renamed from: d, reason: collision with root package name */
    public C0892c0 f13897d;

    /* renamed from: e, reason: collision with root package name */
    public C0894d0 f13898e;

    /* renamed from: f, reason: collision with root package name */
    public C0902h0 f13899f;

    /* renamed from: g, reason: collision with root package name */
    public byte f13900g;

    public final P a() {
        String str;
        Q q10;
        C0892c0 c0892c0;
        if (this.f13900g == 1 && (str = this.f13895b) != null && (q10 = this.f13896c) != null && (c0892c0 = this.f13897d) != null) {
            return new P(this.f13894a, str, q10, c0892c0, this.f13898e, this.f13899f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f13900g) == 0) {
            sb2.append(StubApp.getString2(17531));
        }
        if (this.f13895b == null) {
            sb2.append(StubApp.getString2(2256));
        }
        if (this.f13896c == null) {
            sb2.append(StubApp.getString2(17550));
        }
        if (this.f13897d == null) {
            sb2.append(StubApp.getString2(17577));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }
}
