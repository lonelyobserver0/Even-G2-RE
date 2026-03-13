package W4;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final q f8135a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8136b;

    public h(q qVar, boolean z2) {
        this.f8135a = qVar;
        this.f8136b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f8135a.equals(this.f8135a) && hVar.f8136b == this.f8136b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8135a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f8136b).hashCode();
    }
}
