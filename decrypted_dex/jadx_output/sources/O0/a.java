package O0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f5072a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5073b;

    public a(long j, long j3) {
        this.f5072a = j;
        this.f5073b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5072a == aVar.f5072a && this.f5073b == aVar.f5073b;
    }

    public final int hashCode() {
        return (((int) this.f5072a) * 31) + ((int) this.f5073b);
    }
}
