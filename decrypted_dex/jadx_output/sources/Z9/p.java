package Z9;

import com.stub.StubApp;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f9139a;

    /* renamed from: b, reason: collision with root package name */
    public C0377l f9140b;

    public final Number a(int i3) {
        return (Number) this.f9139a.get(i3);
    }

    public final boolean b() {
        return !this.f9139a.isEmpty();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Xa.h.w(p.class, sb2, StubApp.getString2(8186));
        sb2.append(this.f9139a);
        sb2.append(StubApp.getString2(8187));
        sb2.append(this.f9140b);
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }
}
