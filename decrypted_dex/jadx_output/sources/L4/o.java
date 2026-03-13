package L4;

import f5.u0;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o implements k, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4199a;

    public o(Object obj) {
        this.f4199a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return u0.j(this.f4199a, ((o) obj).f4199a);
        }
        return false;
    }

    @Override // L4.k
    public final Object get() {
        return this.f4199a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4199a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f4199a + ")";
    }
}
