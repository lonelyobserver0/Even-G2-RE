package L4;

import java.io.Serializable;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f4181a;

    public h(List list) {
        this.f4181a = list;
    }

    @Override // L4.g
    public final boolean apply(Object obj) {
        int i3 = 0;
        while (true) {
            List list = this.f4181a;
            if (i3 >= list.size()) {
                return true;
            }
            if (!((g) list.get(i3)).apply(obj)) {
                return false;
            }
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f4181a.equals(((h) obj).f4181a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4181a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z2 = true;
        for (Object obj : this.f4181a) {
            if (!z2) {
                sb2.append(',');
            }
            sb2.append(obj);
            z2 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
