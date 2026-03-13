package M4;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: M4.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0146q extends Y implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final L4.e f4643a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f4644b;

    public C0146q(L4.e eVar, Y y10) {
        this.f4643a = eVar;
        this.f4644b = y10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        L4.e eVar = this.f4643a;
        return this.f4644b.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0146q) {
            C0146q c0146q = (C0146q) obj;
            if (this.f4643a.equals(c0146q.f4643a) && this.f4644b.equals(c0146q.f4644b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4643a, this.f4644b});
    }

    public final String toString() {
        return this.f4644b + ".onResultOf(" + this.f4643a + ")";
    }
}
