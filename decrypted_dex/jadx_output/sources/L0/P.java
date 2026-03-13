package L0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final int f3935a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3936b;

    public P(int i3, boolean z2) {
        this.f3935a = i3;
        this.f3936b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P.class != obj.getClass()) {
            return false;
        }
        P p8 = (P) obj;
        return this.f3935a == p8.f3935a && this.f3936b == p8.f3936b;
    }

    public final int hashCode() {
        return (this.f3935a * 31) + (this.f3936b ? 1 : 0);
    }
}
