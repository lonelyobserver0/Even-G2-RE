package r2;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1564b {

    /* renamed from: a, reason: collision with root package name */
    public final String f20293a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f20294b;

    public C1564b(String str, long j) {
        this.f20293a = str;
        this.f20294b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1564b)) {
            return false;
        }
        C1564b c1564b = (C1564b) obj;
        if (!this.f20293a.equals(c1564b.f20293a)) {
            return false;
        }
        Long l9 = c1564b.f20294b;
        Long l10 = this.f20294b;
        return l10 != null ? l10.equals(l9) : l9 == null;
    }

    public final int hashCode() {
        int hashCode = this.f20293a.hashCode() * 31;
        Long l9 = this.f20294b;
        return hashCode + (l9 != null ? l9.hashCode() : 0);
    }
}
