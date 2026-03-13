package Rc;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final int f6385a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.b f6386b;

    public M(int i3, Pc.b bVar) {
        if (i3 < -53 || i3 > 53) {
            throw new IllegalArgumentException(Xa.h.g(i3, StubApp.getString2(25568), StubApp.getString2(25569)));
        }
        this.f6385a = i3;
        this.f6386b = bVar;
    }

    public final String toString() {
        Pc.b bVar = this.f6386b;
        int i3 = this.f6385a;
        if (i3 == 0) {
            return bVar.name();
        }
        return Integer.valueOf(i3) + bVar.name();
    }
}
