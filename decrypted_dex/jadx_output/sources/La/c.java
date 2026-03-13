package La;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f4390a;

    /* renamed from: b, reason: collision with root package name */
    public int f4391b;

    /* renamed from: c, reason: collision with root package name */
    public int f4392c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f4390a == cVar.f4390a && this.f4391b == cVar.f4391b && this.f4392c == cVar.f4392c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f4390a * 31) + this.f4391b) * 31) + this.f4392c;
    }
}
