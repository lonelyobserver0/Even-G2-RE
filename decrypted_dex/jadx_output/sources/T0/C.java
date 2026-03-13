package T0;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C {

    /* renamed from: c, reason: collision with root package name */
    public static final C f6927c = new C(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f6928a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6929b;

    public C(long j, long j3) {
        this.f6928a = j;
        this.f6929b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C.class == obj.getClass()) {
            C c10 = (C) obj;
            if (this.f6928a == c10.f6928a && this.f6929b == c10.f6929b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f6928a) * 31) + ((int) this.f6929b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(6091));
        sb2.append(this.f6928a);
        sb2.append(StubApp.getString2(6092));
        return Xa.h.q(sb2, this.f6929b, StubApp.getString2(511));
    }
}
