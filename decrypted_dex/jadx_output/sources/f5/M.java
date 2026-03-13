package f5;

import com.stub.StubApp;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public int f13876a;

    /* renamed from: b, reason: collision with root package name */
    public String f13877b;

    /* renamed from: c, reason: collision with root package name */
    public int f13878c;

    /* renamed from: d, reason: collision with root package name */
    public long f13879d;

    /* renamed from: e, reason: collision with root package name */
    public long f13880e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13881f;

    /* renamed from: g, reason: collision with root package name */
    public int f13882g;

    /* renamed from: h, reason: collision with root package name */
    public String f13883h;

    /* renamed from: i, reason: collision with root package name */
    public String f13884i;
    public byte j;

    public final N a() {
        String str;
        String str2;
        String str3;
        if (this.j == 63 && (str = this.f13877b) != null && (str2 = this.f13883h) != null && (str3 = this.f13884i) != null) {
            return new N(this.f13876a, str, this.f13878c, this.f13879d, this.f13880e, this.f13881f, this.f13882g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(StubApp.getString2(13783));
        }
        if (this.f13877b == null) {
            sb2.append(StubApp.getString2(17563));
        }
        if ((this.j & 2) == 0) {
            sb2.append(StubApp.getString2(17564));
        }
        if ((this.j & 4) == 0) {
            sb2.append(StubApp.getString2(17565));
        }
        if ((this.j & 8) == 0) {
            sb2.append(StubApp.getString2(17566));
        }
        if ((this.j & Tnaf.POW_2_WIDTH) == 0) {
            sb2.append(StubApp.getString2(17567));
        }
        if ((this.j & 32) == 0) {
            sb2.append(StubApp.getString2(17568));
        }
        if (this.f13883h == null) {
            sb2.append(StubApp.getString2(17569));
        }
        if (this.f13884i == null) {
            sb2.append(StubApp.getString2(17570));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }
}
