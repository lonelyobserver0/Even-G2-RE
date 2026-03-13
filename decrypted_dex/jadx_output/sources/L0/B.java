package L0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3881a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3882b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3883c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3884d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3885e;

    public B(Object obj) {
        this(obj, -1L);
    }

    public final B a(Object obj) {
        if (this.f3881a.equals(obj)) {
            return this;
        }
        return new B(obj, this.f3882b, this.f3883c, this.f3884d, this.f3885e);
    }

    public final boolean b() {
        return this.f3882b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b2 = (B) obj;
        return this.f3881a.equals(b2.f3881a) && this.f3882b == b2.f3882b && this.f3883c == b2.f3883c && this.f3884d == b2.f3884d && this.f3885e == b2.f3885e;
    }

    public final int hashCode() {
        return ((((((((this.f3881a.hashCode() + 527) * 31) + this.f3882b) * 31) + this.f3883c) * 31) + ((int) this.f3884d)) * 31) + this.f3885e;
    }

    public B(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public B(Object obj, long j, int i3) {
        this(obj, -1, -1, j, i3);
    }

    public B(Object obj, int i3, int i10, long j, int i11) {
        this.f3881a = obj;
        this.f3882b = i3;
        this.f3883c = i10;
        this.f3884d = j;
        this.f3885e = i11;
    }
}
