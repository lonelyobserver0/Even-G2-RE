package o0;

import a0.C0379a;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1428c {

    /* renamed from: c, reason: collision with root package name */
    public static final C1428c f18127c = new C1428c(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f18128a;

    /* renamed from: b, reason: collision with root package name */
    public C0379a f18129b;

    static {
        i2.u.A(0, 1, 2, 3, 4);
    }

    public C1428c(int i3) {
        this.f18128a = i3;
    }

    public final C0379a a() {
        if (this.f18129b == null) {
            this.f18129b = new C0379a(this);
        }
        return this.f18129b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1428c.class == obj.getClass() && this.f18128a == ((C1428c) obj).f18128a;
    }

    public final int hashCode() {
        return (((((527 + this.f18128a) * 961) + 1) * 31) + 1) * 31;
    }
}
