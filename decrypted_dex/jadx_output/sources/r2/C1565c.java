package r2;

/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1565c {

    /* renamed from: a, reason: collision with root package name */
    public final String f20295a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20296b;

    public C1565c(String str, int i3) {
        this.f20295a = str;
        this.f20296b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1565c)) {
            return false;
        }
        C1565c c1565c = (C1565c) obj;
        if (this.f20296b != c1565c.f20296b) {
            return false;
        }
        return this.f20295a.equals(c1565c.f20295a);
    }

    public final int hashCode() {
        return (this.f20295a.hashCode() * 31) + this.f20296b;
    }
}
