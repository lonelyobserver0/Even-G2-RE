package v0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f21700c = new b0(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f21701a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21702b;

    public b0(int i3, boolean z2) {
        this.f21701a = i3;
        this.f21702b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f21701a == b0Var.f21701a && this.f21702b == b0Var.f21702b;
    }

    public final int hashCode() {
        return (this.f21701a << 1) + (this.f21702b ? 1 : 0);
    }
}
