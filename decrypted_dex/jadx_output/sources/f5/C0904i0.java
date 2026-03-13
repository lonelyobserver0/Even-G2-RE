package f5;

import com.stub.StubApp;

/* renamed from: f5.i0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0904i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f14033a;

    /* renamed from: b, reason: collision with root package name */
    public String f14034b;

    /* renamed from: c, reason: collision with root package name */
    public String f14035c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14036d;

    /* renamed from: e, reason: collision with root package name */
    public byte f14037e;

    public final C0906j0 a() {
        String str;
        String str2;
        if (this.f14037e == 3 && (str = this.f14034b) != null && (str2 = this.f14035c) != null) {
            return new C0906j0(str, str2, this.f14033a, this.f14036d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f14037e & 1) == 0) {
            sb2.append(StubApp.getString2(17511));
        }
        if (this.f14034b == null) {
            sb2.append(StubApp.getString2(17645));
        }
        if (this.f14035c == null) {
            sb2.append(StubApp.getString2(17513));
        }
        if ((this.f14037e & 2) == 0) {
            sb2.append(StubApp.getString2(17646));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }
}
