package f5;

import com.stub.StubApp;

/* renamed from: f5.e0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0896e0 {

    /* renamed from: a, reason: collision with root package name */
    public C0900g0 f14000a;

    /* renamed from: b, reason: collision with root package name */
    public String f14001b;

    /* renamed from: c, reason: collision with root package name */
    public String f14002c;

    /* renamed from: d, reason: collision with root package name */
    public long f14003d;

    /* renamed from: e, reason: collision with root package name */
    public byte f14004e;

    public final C0898f0 a() {
        C0900g0 c0900g0;
        String str;
        String str2;
        if (this.f14004e == 1 && (c0900g0 = this.f14000a) != null && (str = this.f14001b) != null && (str2 = this.f14002c) != null) {
            return new C0898f0(c0900g0, str, str2, this.f14003d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f14000a == null) {
            sb2.append(StubApp.getString2(17632));
        }
        if (this.f14001b == null) {
            sb2.append(StubApp.getString2(17633));
        }
        if (this.f14002c == null) {
            sb2.append(StubApp.getString2(17634));
        }
        if ((1 & this.f14004e) == 0) {
            sb2.append(StubApp.getString2(17635));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }
}
