package f5;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public long f13935a;

    /* renamed from: b, reason: collision with root package name */
    public String f13936b;

    /* renamed from: c, reason: collision with root package name */
    public String f13937c;

    /* renamed from: d, reason: collision with root package name */
    public long f13938d;

    /* renamed from: e, reason: collision with root package name */
    public int f13939e;

    /* renamed from: f, reason: collision with root package name */
    public byte f13940f;

    public final Y a() {
        String str;
        if (this.f13940f == 7 && (str = this.f13936b) != null) {
            return new Y(this.f13935a, str, this.f13937c, this.f13938d, this.f13939e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f13940f & 1) == 0) {
            sb2.append(StubApp.getString2(17597));
        }
        if (this.f13936b == null) {
            sb2.append(StubApp.getString2(17598));
        }
        if ((this.f13940f & 2) == 0) {
            sb2.append(StubApp.getString2(17599));
        }
        if ((this.f13940f & 4) == 0) {
            sb2.append(StubApp.getString2(17528));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }
}
