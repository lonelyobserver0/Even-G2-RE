package ob;

import java.util.Objects;

/* renamed from: ob.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1474a {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f18643a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1474a.class != obj.getClass()) {
            return false;
        }
        return this.f18643a.equals(((C1474a) obj).f18643a);
    }

    public final int hashCode() {
        return Objects.hash(this.f18643a);
    }
}
