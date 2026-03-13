package T0;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final C f6925a;

    /* renamed from: b, reason: collision with root package name */
    public final C f6926b;

    public A(C c10, C c11) {
        this.f6925a = c10;
        this.f6926b = c11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A.class == obj.getClass()) {
            A a3 = (A) obj;
            if (this.f6925a.equals(a3.f6925a) && this.f6926b.equals(a3.f6926b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6926b.hashCode() + (this.f6925a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1557));
        C c10 = this.f6925a;
        sb2.append(c10);
        C c11 = this.f6926b;
        if (c10.equals(c11)) {
            str = "";
        } else {
            str = StubApp.getString2(81) + c11;
        }
        return AbstractC1482f.k(sb2, str, StubApp.getString2(511));
    }
}
