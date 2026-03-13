package mb;

import java.util.Objects;

/* renamed from: mb.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1291A {

    /* renamed from: a, reason: collision with root package name */
    public Long f17289a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1291A.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f17289a, ((C1291A) obj).f17289a);
    }

    public final int hashCode() {
        return Objects.hash(this.f17289a);
    }
}
