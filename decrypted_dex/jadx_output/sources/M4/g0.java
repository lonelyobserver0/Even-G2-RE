package M4;

import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g0 extends Y implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Y f4621a;

    public g0(Y y10) {
        this.f4621a = y10;
    }

    @Override // M4.Y
    public final Y a() {
        return this.f4621a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f4621a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            return this.f4621a.equals(((g0) obj).f4621a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f4621a.hashCode();
    }

    public final String toString() {
        return this.f4621a + ".reverse()";
    }
}
