package o0;

import java.util.Objects;
import r0.AbstractC1560u;

/* renamed from: o0.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1439n {

    /* renamed from: a, reason: collision with root package name */
    public final String f18229a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18230b;

    static {
        AbstractC1560u.E(0);
        AbstractC1560u.E(1);
    }

    public C1439n(String str, String str2) {
        this.f18229a = AbstractC1560u.K(str);
        this.f18230b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1439n.class == obj.getClass()) {
            C1439n c1439n = (C1439n) obj;
            if (Objects.equals(this.f18229a, c1439n.f18229a) && Objects.equals(this.f18230b, c1439n.f18230b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f18230b.hashCode() * 31;
        String str = this.f18229a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
