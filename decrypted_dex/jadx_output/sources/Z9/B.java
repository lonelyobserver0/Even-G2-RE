package Z9;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final int f9071a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9072b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9073c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9074d;

    public B(int i3, int i10, int i11) {
        this.f9071a = i3;
        this.f9072b = i3 + i11;
        this.f9073c = i10;
        this.f9074d = i10 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Xa.h.w(B.class, sb2, StubApp.getString2(7673));
        sb2.append(this.f9071a);
        sb2.append(StubApp.getString2(7674));
        sb2.append(this.f9072b);
        sb2.append(StubApp.getString2(7675));
        sb2.append(this.f9073c);
        sb2.append(StubApp.getString2(7676));
        return AbstractC1482f.f(this.f9074d, StubApp.getString2(511), sb2);
    }
}
