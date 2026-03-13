package e5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f13618c = new i(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f13619a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13620b;

    public i(int i3, int i10) {
        this.f13619a = i3;
        this.f13620b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.class.getSimpleName());
        sb2.append(StubApp.getString2(17304));
        sb2.append(this.f13619a);
        sb2.append(StubApp.getString2(17305));
        return AbstractC1482f.f(this.f13620b, StubApp.getString2(511), sb2);
    }
}
