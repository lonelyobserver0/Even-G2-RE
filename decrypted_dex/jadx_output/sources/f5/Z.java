package f5;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public String f13946a;

    /* renamed from: b, reason: collision with root package name */
    public int f13947b;

    /* renamed from: c, reason: collision with root package name */
    public int f13948c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13949d;

    /* renamed from: e, reason: collision with root package name */
    public byte f13950e;

    public final C0888a0 a() {
        String str;
        if (this.f13950e == 7 && (str = this.f13946a) != null) {
            return new C0888a0(str, this.f13947b, this.f13948c, this.f13949d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13946a == null) {
            sb2.append(StubApp.getString2(17526));
        }
        if ((this.f13950e & 1) == 0) {
            sb2.append(StubApp.getString2(17525));
        }
        if ((this.f13950e & 2) == 0) {
            sb2.append(StubApp.getString2(17528));
        }
        if ((this.f13950e & 4) == 0) {
            sb2.append(StubApp.getString2(17604));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }
}
