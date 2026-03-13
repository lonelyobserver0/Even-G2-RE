package M4;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class L extends C {
    @Override // M4.C
    public final C c(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final M g() {
        int i3 = this.f4538b;
        if (i3 == 0) {
            int i10 = M.f4554c;
            return f0.f4614k;
        }
        if (i3 != 1) {
            M l9 = M.l(i3, this.f4537a);
            this.f4538b = l9.size();
            this.f4539c = true;
            return l9;
        }
        Object obj = this.f4537a[0];
        Objects.requireNonNull(obj);
        int i11 = M.f4554c;
        return new l0(obj);
    }
}
